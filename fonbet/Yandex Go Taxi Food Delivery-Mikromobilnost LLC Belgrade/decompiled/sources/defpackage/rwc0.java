package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener$RotationDegrees;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class rwc0 extends qno {
    @Override // defpackage.qno
    public final void a() {
        ExoPlayer exoPlayer = this.b;
        a videoFormat = exoPlayer.getVideoFormat();
        Objects.requireNonNull(videoFormat);
        ExoPlayerEventListener$RotationDegrees a = ExoPlayerEventListener$RotationDegrees.a(videoFormat.x);
        int i = videoFormat.u;
        int i2 = videoFormat.v;
        if (a == ExoPlayerEventListener$RotationDegrees.ROTATE_90 || a == ExoPlayerEventListener$RotationDegrees.ROTATE_270) {
            a = ExoPlayerEventListener$RotationDegrees.a(0);
            i = i2;
            i2 = i;
        }
        long duration = exoPlayer.getDuration();
        int b = a.b();
        yxf0 yxf0Var = (yxf0) this.c.a;
        ((ArrayList) yxf0Var.b).add(new vwv(duration, i, i2, b));
        yxf0Var.w();
    }
}
