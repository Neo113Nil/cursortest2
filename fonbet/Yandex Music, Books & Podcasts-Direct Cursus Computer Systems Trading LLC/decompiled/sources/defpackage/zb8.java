package defpackage;

/* loaded from: classes3.dex */
public final class zb8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h23 b;
    public final /* synthetic */ gc8 c;
    public final /* synthetic */ rlk d;

    public /* synthetic */ zb8(h23 h23Var, gc8 gc8Var, rlk rlkVar, int i) {
        this.a = i;
        this.b = h23Var;
        this.c = gc8Var;
        this.d = rlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f23 a;
        switch (this.a) {
            case 0:
                a = this.b.b.a();
                try {
                    this.c.s.a(this.d);
                    return;
                } finally {
                }
            default:
                a = this.b.b.a();
                try {
                    this.c.s.g(this.d);
                    return;
                } finally {
                }
        }
    }
}
