package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class w640 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ cms B;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ CharSequence y;
    public final /* synthetic */ Object z;

    public /* synthetic */ w640(f530 f530Var, CharSequence charSequence, CharSequence charSequence2, List list, boolean z, float f, wls wlsVar, int i) {
        this.x = f530Var;
        this.y = charSequence;
        this.z = charSequence2;
        this.A = list;
        this.b = z;
        this.c = f;
        this.B = wlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        cms cmsVar = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                epb1.a((String) obj5, (t740) obj4, (String) this.y, (Long) obj3, this.b, this.c, (tls) cmsVar, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).intValue();
                int O2 = vng.O(i2 | 1);
                ysb1.b((f530) obj5, this.y, (CharSequence) obj4, (List) obj3, this.b, this.c, (wls) cmsVar, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ w640(String str, t740 t740Var, String str2, Long l, boolean z, float f, tls tlsVar, int i) {
        this.x = str;
        this.z = t740Var;
        this.y = str2;
        this.A = l;
        this.b = z;
        this.c = f;
        this.B = tlsVar;
        this.w = i;
    }
}
