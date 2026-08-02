package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class xrf0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ long c;

    public /* synthetic */ xrf0(CharSequence charSequence, long j, int i, int i2) {
        this.a = i2;
        this.b = charSequence;
        this.c = j;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.c;
        CharSequence charSequence = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                o9a1.b(charSequence, j, fidVar, vng.O(7));
                break;
            default:
                rmb1.b(charSequence, j, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
