package defpackage;

import com.yandex.passport.internal.properties.u;

/* loaded from: classes15.dex */
public final /* synthetic */ class yxs0 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ cms B;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ CharSequence x;
    public final /* synthetic */ CharSequence y;
    public final /* synthetic */ Object z;

    public /* synthetic */ yxs0(CharSequence charSequence, CharSequence charSequence2, boolean z, v4v v4vVar, boolean z2, nhe nheVar, sls slsVar, tls tlsVar, int i) {
        this.x = charSequence;
        this.y = charSequence2;
        this.b = z;
        this.z = v4vVar;
        this.c = z2;
        this.A = nheVar;
        this.w = slsVar;
        this.B = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cms cmsVar = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                mz91.a(this.x, this.y, this.b, (v4v) obj4, this.c, (nhe) obj3, this.w, (tls) cmsVar, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                u.b((String) this.x, (String) this.y, (String) obj4, this.b, this.c, this.w, (sls) obj3, (sls) cmsVar, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ yxs0(String str, String str2, String str3, boolean z, boolean z2, sls slsVar, sls slsVar2, sls slsVar3, int i) {
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.b = z;
        this.c = z2;
        this.w = slsVar;
        this.A = slsVar2;
        this.B = slsVar3;
    }
}
