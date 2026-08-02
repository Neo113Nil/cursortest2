package defpackage;

import androidx.camera.core.impl.utils.executor.b;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class wm7 implements yo7 {
    public final Executor a;
    public final an7 b;
    public final int c;

    public wm7(an7 an7Var, b bVar, int i) {
        this.b = an7Var;
        this.a = bVar;
        this.c = i;
    }

    @Override // defpackage.yo7
    public final euy a() {
        sgb1.g(3, "Camera2CapturePipeline");
        return ni91.n(jqs.a(this.b.a(this.c)), new gym(new vm7(0)), this.a);
    }

    @Override // defpackage.yo7
    public final euy b() {
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.b.i.c();
            bVar.b(null);
            bVar.a = "invokePostCaptureFuture";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        return gl7Var;
    }
}
