package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class ths implements zcv {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7z0 b;

    public /* synthetic */ ths(b7z0 b7z0Var, int i) {
        this.a = i;
        this.b = b7z0Var;
    }

    @Override // defpackage.zcv
    public final long uptimeMillis() {
        long uptimeMillis;
        long uptimeMillis2;
        int i = this.a;
        b7z0 b7z0Var = this.b;
        switch (i) {
            case 0:
                uptimeMillis = b7z0Var.uptimeMillis();
                return uptimeMillis;
            default:
                uptimeMillis2 = b7z0Var.uptimeMillis();
                return uptimeMillis2;
        }
    }
}
