package defpackage;

import android.media.MediaFormat;
import androidx.media3.common.a;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

/* loaded from: classes10.dex */
public final class zno implements xl31, qr7, xyc0 {
    public xl31 a;
    public qr7 b;
    public xl31 c;
    public qr7 w;

    @Override // defpackage.qr7
    public final void a(long j, float[] fArr) {
        qr7 qr7Var = this.w;
        if (qr7Var != null) {
            qr7Var.a(j, fArr);
        }
        qr7 qr7Var2 = this.b;
        if (qr7Var2 != null) {
            qr7Var2.a(j, fArr);
        }
    }

    @Override // defpackage.qr7
    public final void b() {
        qr7 qr7Var = this.w;
        if (qr7Var != null) {
            qr7Var.b();
        }
        qr7 qr7Var2 = this.b;
        if (qr7Var2 != null) {
            qr7Var2.b();
        }
    }

    @Override // defpackage.xl31
    public final void c(long j, long j2, a aVar, MediaFormat mediaFormat) {
        xl31 xl31Var = this.c;
        if (xl31Var != null) {
            xl31Var.c(j, j2, aVar, mediaFormat);
        }
        xl31 xl31Var2 = this.a;
        if (xl31Var2 != null) {
            xl31Var2.c(j, j2, aVar, mediaFormat);
        }
    }

    @Override // defpackage.xyc0
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.a = (xl31) obj;
            return;
        }
        if (i == 8) {
            this.b = (qr7) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
        if (sphericalGLSurfaceView == null) {
            this.c = null;
            this.w = null;
        } else {
            this.c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
            this.w = sphericalGLSurfaceView.getCameraMotionListener();
        }
    }
}
