package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.PlatformPlaybackState;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class qno implements xxc0 {
    public boolean a = false;
    public final ExoPlayer b;
    public final eg01 c;

    public qno(ExoPlayer exoPlayer, eg01 eg01Var) {
        this.b = exoPlayer;
        this.c = eg01Var;
    }

    public abstract void a();

    @Override // defpackage.xxc0
    public final void onIsPlayingChanged(boolean z) {
        yxf0 yxf0Var = (yxf0) this.c.a;
        ((ArrayList) yxf0Var.b).add(new yyw(z));
        yxf0Var.w();
    }

    @Override // defpackage.xxc0
    public final void onPlaybackStateChanged(int i) {
        PlatformPlaybackState platformPlaybackState = PlatformPlaybackState.UNKNOWN;
        if (i == 1) {
            platformPlaybackState = PlatformPlaybackState.IDLE;
        } else if (i == 2) {
            platformPlaybackState = PlatformPlaybackState.BUFFERING;
        } else if (i == 3) {
            platformPlaybackState = PlatformPlaybackState.READY;
            if (!this.a) {
                this.a = true;
                a();
            }
        } else if (i == 4) {
            platformPlaybackState = PlatformPlaybackState.ENDED;
        }
        yxf0 yxf0Var = (yxf0) this.c.a;
        ((ArrayList) yxf0Var.b).add(new mxc0(platformPlaybackState));
        yxf0Var.w();
    }

    @Override // defpackage.xxc0
    public final void onPlayerError(PlaybackException playbackException) {
        if (playbackException.errorCode == 1002) {
            ExoPlayer exoPlayer = this.b;
            exoPlayer.seekToDefaultPosition();
            exoPlayer.prepare();
            return;
        }
        yxf0 yxf0Var = (yxf0) this.c.a;
        clg0 clg0Var = new clg0();
        clg0Var.a = "Video player had error " + playbackException;
        ((ArrayList) yxf0Var.b).add(clg0Var);
        yxf0Var.w();
    }
}
