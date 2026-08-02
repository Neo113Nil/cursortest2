package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class lni {
    public final g8c a;
    public final b6n b;
    public j6e c;
    public yk3 d;
    public rar e;
    public volatile boolean f;
    public final ReentrantLock g = new ReentrantLock();
    public final x0q h;
    public final dkn i;

    public lni(kni kniVar, g8c g8cVar, b6n b6nVar, p1n p1nVar) {
        this.a = g8cVar;
        this.b = b6nVar;
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.h = b;
        this.i = new dkn(b);
    }

    public final void a(uni uniVar, Function1 function1) {
        ssg.a(3, "MusicMatchRecognitionService", "complete with " + uniVar, null);
        if (b()) {
            function1.invoke(uniVar);
        }
    }

    public final boolean b() {
        boolean z;
        ssg.a(3, "MusicMatchRecognitionService", "complete", null);
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.f) {
                z = false;
            } else {
                z = true;
                this.f = true;
                this.h.g();
                rar rarVar = this.e;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                this.e = null;
                yk3 yk3Var = this.d;
                if (yk3Var != null) {
                    yk3Var.w();
                }
                this.d = null;
                j6e j6eVar = this.c;
                if (j6eVar != null) {
                    gln glnVar = (gln) j6eVar.b;
                    if (glnVar != null) {
                        glnVar.b(1000, null);
                    }
                    j6eVar.b = null;
                }
                this.c = null;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }
}
