package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.b;

/* loaded from: classes10.dex */
public final class tm7 implements bn7 {
    public final b a;
    public final zy2 b;
    public final int c;
    public boolean d = false;

    public tm7(b bVar, int i, zy2 zy2Var) {
        this.a = bVar;
        this.c = i;
        this.b = zy2Var;
    }

    @Override // defpackage.bn7
    public final euy a(TotalCaptureResult totalCaptureResult) {
        if (!jn7.c(totalCaptureResult, this.c)) {
            return ni91.f(Boolean.FALSE);
        }
        sgb1.g(3, "Camera2CapturePipeline");
        this.d = true;
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.a.h.f(bVar);
            this.b.b = true;
            bVar.a = "AePreCapture";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        jqs a = jqs.a(gl7Var);
        quz quzVar = new quz(29);
        return ni91.n(a, new gym(quzVar), geb1.b());
    }

    @Override // defpackage.bn7
    public final boolean b() {
        return this.c == 0;
    }

    @Override // defpackage.bn7
    public final void c() {
        if (this.d) {
            sgb1.g(3, "Camera2CapturePipeline");
            this.a.h.a(false, true);
            this.b.b = false;
        }
    }
}
