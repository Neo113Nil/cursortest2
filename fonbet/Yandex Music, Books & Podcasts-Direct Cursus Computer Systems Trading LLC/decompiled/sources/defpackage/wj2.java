package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wj2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wj2(sj sjVar, Object obj, int i) {
        this.a = i;
        this.b = sjVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sj sjVar = this.b;
                int i = sjVar.a - 1;
                sjVar.a = i;
                if (i == 0) {
                    sjVar.r(this.c);
                    break;
                }
                break;
            default:
                sj sjVar2 = this.b;
                if (sjVar2.a == 0) {
                    sjVar2.r(this.c);
                    break;
                }
                break;
        }
    }
}
