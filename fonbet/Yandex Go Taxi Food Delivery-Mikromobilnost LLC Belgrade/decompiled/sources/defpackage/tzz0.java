package defpackage;

import android.webkit.TracingConfig;
import android.webkit.TracingController;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* loaded from: classes10.dex */
public class tzz0 extends szz0 {
    public TracingController a;
    public final TracingControllerBoundaryInterface b;

    public tzz0() {
        qp41.z.getClass();
        this.a = TracingController.getInstance();
        this.b = null;
    }

    @Override // defpackage.szz0
    public final boolean a() {
        qp41.z.getClass();
        if (this.a == null) {
            this.a = TracingController.getInstance();
        }
        return this.a.isTracing();
    }

    @Override // defpackage.szz0
    public final void b(qzz0 qzz0Var) {
        if (qzz0Var == null) {
            ny61.g("Tracing config must be non null");
            return;
        }
        qp41.z.getClass();
        if (this.a == null) {
            this.a = TracingController.getInstance();
        }
        this.a.start(new TracingConfig.Builder().addCategories(qzz0Var.a).addCategories(qzz0Var.b).setTracingMode(qzz0Var.c).build());
    }

    @Override // defpackage.szz0
    public final boolean c(FileOutputStream fileOutputStream, ExecutorService executorService) {
        qp41.z.getClass();
        if (this.a == null) {
            this.a = TracingController.getInstance();
        }
        return this.a.stop(fileOutputStream, executorService);
    }
}
