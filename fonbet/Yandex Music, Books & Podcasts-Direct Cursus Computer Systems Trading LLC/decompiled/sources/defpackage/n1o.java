package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class n1o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1o b;

    public /* synthetic */ n1o(o1o o1oVar, int i) {
        this.a = i;
        this.b = o1oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1o o1oVar = this.b;
                if (!o1oVar.f) {
                    o1oVar.g = null;
                    break;
                } else {
                    long a = o1oVar.e - o1oVar.d.a();
                    if (a <= 0) {
                        o1oVar.f = false;
                        o1oVar.g = null;
                        o1oVar.c.run();
                        break;
                    } else {
                        o1oVar.g = o1oVar.a.schedule(new n1o(o1oVar, 1), a, TimeUnit.NANOSECONDS);
                        break;
                    }
                }
            default:
                o1o o1oVar2 = this.b;
                o1oVar2.b.execute(new n1o(o1oVar2, 0));
                break;
        }
    }
}
