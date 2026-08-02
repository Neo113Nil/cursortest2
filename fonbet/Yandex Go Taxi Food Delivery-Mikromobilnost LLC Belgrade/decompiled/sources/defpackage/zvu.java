package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class zvu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ awu b;
    public final /* synthetic */ yf7 c;

    public /* synthetic */ zvu(awu awuVar, yf7 yf7Var, int i) {
        this.a = i;
        this.b = awuVar;
        this.c = yf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yf7 yf7Var = this.c;
        awu awuVar = this.b;
        switch (i) {
            case 0:
                awuVar.b(yf7Var, null);
                break;
            default:
                awuVar.b(yf7Var, null);
                break;
        }
    }
}
