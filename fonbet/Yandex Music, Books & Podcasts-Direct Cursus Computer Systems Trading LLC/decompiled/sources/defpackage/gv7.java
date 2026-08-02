package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class gv7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8h b;

    public /* synthetic */ gv7(f8h f8hVar, int i) {
        this.a = i;
        this.b = f8hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.d();
                break;
            case 1:
                this.b.f.b();
                break;
            default:
                f8h f8hVar = this.b;
                g8h g8hVar = f8hVar.n;
                g8h g8hVar2 = f8hVar.n;
                LinkedHashSet linkedHashSet = g8hVar.d.A;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(f8hVar);
                    if (g8hVar2.d.A.isEmpty()) {
                        j8h j8hVar = g8hVar2.d;
                        j8hVar.Y.F(j8hVar.B, false);
                        j8h j8hVar2 = g8hVar2.d;
                        j8hVar2.A = null;
                        if (j8hVar2.F.get()) {
                            g8hVar2.d.E.T(j8h.f0);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
