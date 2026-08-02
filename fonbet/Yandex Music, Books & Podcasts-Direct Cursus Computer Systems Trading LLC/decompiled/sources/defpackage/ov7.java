package defpackage;

/* loaded from: classes5.dex */
public final class ov7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ lv7 c;

    public /* synthetic */ ov7(lv7 lv7Var, int i, int i2) {
        this.a = i2;
        this.c = lv7Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.c.M(this.b);
                break;
            default:
                this.c.c.l(this.b);
                break;
        }
    }
}
