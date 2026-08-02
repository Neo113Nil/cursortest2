package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ara implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cra b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ara(cra craVar, dra draVar, int i) {
        this.a = i;
        this.b = craVar;
        this.c = draVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [dra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [dra, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cra craVar = this.b;
                this.c.T(craVar.a, craVar.b);
                break;
            case 1:
                cra craVar2 = this.b;
                this.c.w(craVar2.a, craVar2.b);
                break;
            case 2:
                cra craVar3 = this.b;
                this.c.r(craVar3.a, craVar3.b);
                break;
            default:
                cra craVar4 = this.b;
                this.c.x(craVar4.a, craVar4.b);
                break;
        }
    }
}
