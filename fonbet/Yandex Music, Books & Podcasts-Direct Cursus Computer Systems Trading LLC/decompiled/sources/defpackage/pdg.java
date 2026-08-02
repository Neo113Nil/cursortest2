package defpackage;

/* loaded from: classes.dex */
public abstract class pdg {
    public final xjj a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ qdg d;

    public pdg(qdg qdgVar, xjj xjjVar) {
        this.d = qdgVar;
        this.a = xjjVar;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        qdg qdgVar = this.d;
        int i2 = qdgVar.c;
        qdgVar.c = i + i2;
        if (!qdgVar.d) {
            qdgVar.d = true;
            while (true) {
                try {
                    int i3 = qdgVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        qdgVar.h();
                    } else if (z3) {
                        qdgVar.i();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    qdgVar.d = false;
                    throw th;
                }
            }
            qdgVar.d = false;
        }
        if (this.b) {
            qdgVar.c(this);
        }
    }

    public boolean c(dzf dzfVar) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
