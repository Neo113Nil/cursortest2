package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener$RotationDegrees;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class suy0 extends qno {
    public final boolean w;

    public suy0(ExoPlayer exoPlayer, eg01 eg01Var, boolean z) {
        super(exoPlayer, eg01Var);
        this.w = z;
    }

    @Override // defpackage.qno
    public final void a() {
        ExoPlayer exoPlayer = this.b;
        do31 videoSize = exoPlayer.getVideoSize();
        ExoPlayerEventListener$RotationDegrees exoPlayerEventListener$RotationDegrees = ExoPlayerEventListener$RotationDegrees.ROTATE_0;
        int i = videoSize.a;
        int i2 = videoSize.b;
        if (i != 0 && i2 != 0 && !this.w) {
            a videoFormat = exoPlayer.getVideoFormat();
            Objects.requireNonNull(videoFormat);
            try {
                exoPlayerEventListener$RotationDegrees = ExoPlayerEventListener$RotationDegrees.a(videoFormat.x);
            } catch (IllegalArgumentException unused) {
                exoPlayerEventListener$RotationDegrees = ExoPlayerEventListener$RotationDegrees.ROTATE_0;
            }
        }
        long duration = exoPlayer.getDuration();
        int b = exoPlayerEventListener$RotationDegrees.b();
        yxf0 yxf0Var = (yxf0) this.c.a;
        ((ArrayList) yxf0Var.b).add(new vwv(duration, i, i2, b));
        yxf0Var.w();
    }
}
