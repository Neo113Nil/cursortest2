package com.giderosmobile.android.player;

import android.media.MediaPlayer;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public class GGMediaPlayerManager {
    public static final int GAUDIO_CANNOT_OPEN_FILE = 1;
    public static final int GAUDIO_ERROR_WHILE_READING = 3;
    public static final int GAUDIO_INTERNAL_ERROR = 5;
    public static final int GAUDIO_NO_ERROR = 0;
    public static final int GAUDIO_UNRECOGNIZED_FORMAT = 2;
    public static final int GAUDIO_UNSUPPORTED_FORMAT = 4;
    private ZipResourceFile mainFile_;
    private ZipResourceFile patchFile_;
    private boolean suspended_ = false;
    private LongSparseArray<Sound> sounds_ = new LongSparseArray<>();
    private LongSparseArray<Channel> channels_ = new LongSparseArray<>();

    private static native long nextgid();

    private static native void onChannelComplete(long j, long j2);

    public GGMediaPlayerManager(ZipResourceFile zipResourceFile, ZipResourceFile zipResourceFile2) {
        this.mainFile_ = zipResourceFile;
        this.patchFile_ = zipResourceFile2;
    }

    public synchronized void onPause() {
        if (this.suspended_) {
            return;
        }
        for (int i = 0; i < this.channels_.size(); i++) {
            Channel valueAt = this.channels_.valueAt(i);
            if (valueAt.player != null && valueAt.player.isPlaying()) {
                valueAt.player.pause();
                valueAt.suspended = true;
            }
        }
        this.suspended_ = true;
    }

    public synchronized void onResume() {
        if (this.suspended_) {
            for (int i = 0; i < this.channels_.size(); i++) {
                Channel valueAt = this.channels_.valueAt(i);
                if (valueAt.player != null && valueAt.suspended) {
                    valueAt.player.start();
                    valueAt.suspended = false;
                }
            }
            this.suspended_ = false;
        }
    }

    public synchronized long BackgroundMusicCreateFromFile(String str, int[] iArr) {
        ZipResourceFile zipResourceFile;
        if (str.equals("")) {
            iArr[0] = 1;
            return 0L;
        }
        if (str.startsWith("/")) {
            if (!new File(str).isFile()) {
                iArr[0] = 1;
                return 0L;
            }
        } else {
            ZipResourceFile zipResourceFile2 = this.patchFile_;
            r6 = zipResourceFile2 != null ? zipResourceFile2.getAssetFileDescriptor(str) : null;
            if (r6 == null && (zipResourceFile = this.mainFile_) != null) {
                r6 = zipResourceFile.getAssetFileDescriptor(str);
            }
            if (r6 == null) {
                try {
                    r6 = WeakActivityHolder.get().getAssets().openFd("assets/" + str);
                } catch (IOException unused) {
                }
            }
            if (r6 == null) {
                iArr[0] = 1;
                return 0L;
            }
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            if (r6 != null) {
                mediaPlayer.setDataSource(r6.getFileDescriptor(), r6.getStartOffset(), r6.getLength());
                r6.close();
            } else {
                mediaPlayer.setDataSource(str);
            }
            mediaPlayer.prepare();
            int duration = mediaPlayer.getDuration();
            mediaPlayer.release();
            long nextgid = nextgid();
            this.sounds_.put(nextgid, new Sound(str, duration));
            return nextgid;
        } catch (Exception unused2) {
            iArr[0] = 2;
            return 0L;
        }
    }

    public synchronized void BackgroundMusicDelete(long j) {
        Sound sound = this.sounds_.get(j);
        if (sound == null) {
            return;
        }
        Iterator<Channel> it = sound.channels.iterator();
        while (it.hasNext()) {
            Channel next = it.next();
            if (next.player != null) {
                next.player.release();
                next.player = null;
            }
            this.channels_.remove(next.gid);
        }
        this.sounds_.remove(j);
    }

    public synchronized int BackgroundMusicGetLength(long j) {
        Sound sound = this.sounds_.get(j);
        if (sound == null) {
            return 0;
        }
        return sound.length;
    }

    public synchronized long BackgroundMusicPlay(long j, boolean z, long j2) {
        ZipResourceFile zipResourceFile;
        Sound sound = this.sounds_.get(j);
        if (sound == null) {
            return 0L;
        }
        String str = sound.fileName;
        if (str.startsWith("/")) {
            if (!new File(str).isFile()) {
                return 0L;
            }
        } else {
            ZipResourceFile zipResourceFile2 = this.patchFile_;
            r6 = zipResourceFile2 != null ? zipResourceFile2.getAssetFileDescriptor(str) : null;
            if (r6 == null && (zipResourceFile = this.mainFile_) != null) {
                r6 = zipResourceFile.getAssetFileDescriptor(str);
            }
            if (r6 == null) {
                try {
                    r6 = WeakActivityHolder.get().getAssets().openFd("assets/" + str);
                } catch (IOException unused) {
                }
            }
            if (r6 == null) {
                return 0L;
            }
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            if (r6 != null) {
                mediaPlayer.setDataSource(r6.getFileDescriptor(), r6.getStartOffset(), r6.getLength());
                r6.close();
            } else {
                mediaPlayer.setDataSource(str);
            }
            mediaPlayer.prepare();
            long nextgid = nextgid();
            mediaPlayer.setOnCompletionListener(new OnCompletionListener(this, nextgid));
            Channel channel = new Channel(nextgid, mediaPlayer, sound, j2);
            sound.channels.add(channel);
            this.channels_.put(nextgid, channel);
            channel.paused = z;
            if (!z) {
                channel.player.start();
            }
            return nextgid;
        } catch (Exception unused2) {
            return 0L;
        }
    }

    public synchronized void BackgroundChannelStop(long j) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return;
        }
        if (channel.player != null) {
            channel.player.release();
            channel.player = null;
        }
        channel.sound.channels.remove(channel);
        this.channels_.remove(j);
    }

    public synchronized void BackgroundChannelSetPosition(long j, int i) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return;
        }
        if (channel.player == null) {
            return;
        }
        channel.player.seekTo(i);
    }

    public synchronized int BackgroundChannelGetPosition(long j) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return 0;
        }
        if (channel.player == null) {
            return channel.lastPosition;
        }
        return channel.player.getCurrentPosition();
    }

    public synchronized void BackgroundChannelSetPaused(long j, boolean z) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return;
        }
        if (z == channel.paused) {
            return;
        }
        channel.paused = z;
        if (channel.player != null) {
            if (z) {
                channel.player.pause();
            } else {
                channel.player.start();
            }
        }
    }

    public synchronized boolean BackgroundChannelIsPaused(long j) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return false;
        }
        return channel.paused;
    }

    public synchronized boolean BackgroundChannelIsPlaying(long j) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return false;
        }
        if (channel.player == null) {
            return false;
        }
        return channel.player.isPlaying();
    }

    public synchronized void BackgroundChannelSetVolume(long j, float f) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return;
        }
        channel.volume = f;
        if (channel.player != null) {
            channel.player.setVolume(f, f);
        }
    }

    public synchronized float BackgroundChannelGetVolume(long j) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return 0.0f;
        }
        return channel.volume;
    }

    public synchronized void BackgroundChannelSetLooping(long j, boolean z) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return;
        }
        channel.looping = z;
        if (channel.player != null) {
            channel.player.setLooping(z);
        }
    }

    public synchronized boolean BackgroundChannelIsLooping(long j) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return false;
        }
        return channel.looping;
    }

    synchronized void onCompletion(long j) {
        Channel channel = this.channels_.get(j);
        if (channel == null) {
            return;
        }
        channel.lastPosition = channel.sound.length;
        if (channel.player != null) {
            channel.player.release();
            channel.player = null;
        }
        onChannelComplete(j, channel.data);
    }
}
