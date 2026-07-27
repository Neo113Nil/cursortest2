package com.giderosmobile.android.player;

import android.media.MediaPlayer;

/* compiled from: GGMediaPlayerManager.java */
/* loaded from: classes.dex */
class Channel {
    public long data;
    public long gid;
    public MediaPlayer player;
    public Sound sound;
    public boolean paused = true;
    public float volume = 1.0f;
    public boolean looping = false;
    public boolean suspended = false;
    public int lastPosition = 0;

    public Channel(long j, MediaPlayer mediaPlayer, Sound sound, long j2) {
        this.gid = j;
        this.player = mediaPlayer;
        this.sound = sound;
        this.data = j2;
    }
}
