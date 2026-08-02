package defpackage;

import androidx.media3.common.a;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class rr7 extends a95 {
    public final nyg a;
    public final ef90 b;
    public qr7 c;
    public long w;

    public rr7() {
        super(6);
        this.a = new nyg(1);
        this.b = new ef90();
    }

    @Override // defpackage.fyi0, defpackage.iyi0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.a95, defpackage.xyc0
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.c = (qr7) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // defpackage.fyi0
    public final boolean isReady() {
        return true;
    }

    @Override // defpackage.a95
    public final void onDisabled() {
        qr7 qr7Var = this.c;
        if (qr7Var != null) {
            qr7Var.b();
        }
    }

    @Override // defpackage.a95
    public final void onPositionReset(long j, boolean z) {
        this.w = Long.MIN_VALUE;
        qr7 qr7Var = this.c;
        if (qr7Var != null) {
            qr7Var.b();
        }
    }

    @Override // defpackage.fyi0
    public final void render(long j, long j2) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.w < 100000 + j) {
            nyg nygVar = this.a;
            nygVar.d();
            if (readSource(getFormatHolder(), nygVar, 0) != -4 || nygVar.b(4)) {
                return;
            }
            long j3 = nygVar.y;
            this.w = j3;
            boolean z = j3 < getLastResetPositionUs();
            if (this.c != null && !z) {
                nygVar.j();
                ByteBuffer byteBuffer = nygVar.w;
                int i = tw21.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    ef90 ef90Var = this.b;
                    ef90Var.I(limit, array);
                    ef90Var.K(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(ef90Var.m());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.c.a(this.w - getStreamOffsetUs(), fArr);
                }
            }
        }
    }

    @Override // defpackage.iyi0
    public final int supportsFormat(a aVar) {
        return "application/x-camera-motion".equals(aVar.n) ? iyi0.a(4, 0, 0, 0) : iyi0.a(0, 0, 0, 0);
    }
}
