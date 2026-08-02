package defpackage;

/* loaded from: classes.dex */
public final class rby extends d7 implements mse {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rby(String str, int i) {
        super(r0);
        this.a = i;
        lse lseVar = lse.a;
        this.b = str;
        switch (i) {
            case 1:
                super(lseVar);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                xby.t(xby.d, "UncaughtException", th, str, 2);
                break;
            default:
                xby.d.k(th, str);
                break;
        }
    }
}
