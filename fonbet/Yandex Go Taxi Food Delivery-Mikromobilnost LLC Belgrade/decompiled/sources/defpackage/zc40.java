package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class zc40 implements wls {
    public final /* synthetic */ String A;
    public final /* synthetic */ tls B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ Integer w;
    public final /* synthetic */ Integer x;
    public final /* synthetic */ Integer y;
    public final /* synthetic */ String z;

    public /* synthetic */ zc40(CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, Integer num3, String str, String str2, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = charSequence;
        this.c = charSequence2;
        this.w = num;
        this.x = num2;
        this.y = num3;
        this.z = str;
        this.A = str2;
        this.B = tlsVar;
        this.C = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.C;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int O = vng.O(i2 | 1);
                ed40.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).intValue();
                int O2 = vng.O(i2 | 1);
                ed40.f(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
