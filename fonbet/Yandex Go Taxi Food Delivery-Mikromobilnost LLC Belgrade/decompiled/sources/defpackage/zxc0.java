package defpackage;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* loaded from: classes10.dex */
public interface zxc0 {
    void addListener(xxc0 xxc0Var);

    void addMediaItem(int i, fe10 fe10Var);

    void addMediaItem(fe10 fe10Var);

    void addMediaItems(int i, List list);

    void addMediaItems(List list);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(Surface surface);

    void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    void decreaseDeviceVolume();

    void decreaseDeviceVolume(int i);

    Looper getApplicationLooper();

    ue3 getAudioAttributes();

    vxc0 getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    rdf getCurrentCues();

    long getCurrentLiveOffset();

    Object getCurrentManifest();

    fe10 getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    a9z0 getCurrentTimeline();

    r801 getCurrentTracks();

    int getCurrentWindowIndex();

    xaj getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    fe10 getMediaItemAt(int i);

    int getMediaItemCount();

    re10 getMediaMetadata();

    int getNextMediaItemIndex();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    lxc0 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    PlaybackException getPlayerError();

    re10 getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    vis0 getSurfaceSize();

    long getTotalBufferedDuration();

    r001 getTrackSelectionParameters();

    do31 getVideoSize();

    float getVolume();

    boolean hasNext();

    boolean hasNextMediaItem();

    boolean hasNextWindow();

    boolean hasPreviousMediaItem();

    void increaseDeviceVolume();

    void increaseDeviceVolume(int i);

    boolean isCommandAvailable(int i);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowLive();

    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i, int i2);

    void moveMediaItems(int i, int i2, int i3);

    void next();

    void pause();

    void play();

    void prepare();

    void release();

    void removeListener(xxc0 xxc0Var);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void replaceMediaItems(int i, int i2, List list);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void seekToNext();

    void seekToNextMediaItem();

    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    void seekToPreviousWindow();

    void setAudioAttributes(ue3 ue3Var, boolean z);

    void setDeviceMuted(boolean z);

    void setDeviceMuted(boolean z, int i);

    void setDeviceVolume(int i);

    void setDeviceVolume(int i, int i2);

    void setMediaItem(fe10 fe10Var);

    void setMediaItem(fe10 fe10Var, long j);

    void setMediaItem(fe10 fe10Var, boolean z);

    void setMediaItems(List list);

    void setMediaItems(List list, int i, long j);

    void setMediaItems(List list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(lxc0 lxc0Var);

    void setPlaybackSpeed(float f);

    void setPlaylistMetadata(re10 re10Var);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setTrackSelectionParameters(r001 r001Var);

    void setVideoSurface(Surface surface);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f);

    void stop();
}
