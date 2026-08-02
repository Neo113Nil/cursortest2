package defpackage;

/* loaded from: classes5.dex */
public final class bao implements eao {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ bao(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.eao
    public final void a(lao laoVar) {
        switch (this.a) {
            case 0:
                laoVar.a.M(this.b);
                break;
            default:
                laoVar.a.l(this.b);
                break;
        }
    }
}
