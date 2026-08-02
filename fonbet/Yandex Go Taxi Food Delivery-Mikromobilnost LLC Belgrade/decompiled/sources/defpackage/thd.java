package defpackage;

import androidx.compose.ui.tooling.ComposeViewAdapter;

/* loaded from: classes10.dex */
public final /* synthetic */ class thd implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ thd(sls slsVar, ComposeViewAdapter composeViewAdapter, long j, Class cls, String str, String str2, Class cls2, int i) {
        this.y = slsVar;
        this.z = composeViewAdapter;
        this.w = j;
        this.A = cls;
        this.b = str;
        this.c = str2;
        this.B = cls2;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 init$lambda$2;
        int i = this.a;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                init$lambda$2 = ComposeViewAdapter.init$lambda$2((sls) obj6, (ComposeViewAdapter) obj5, this.w, (Class) obj4, this.b, this.c, (Class) obj3, this.x, (fid) obj, intValue);
                return init$lambda$2;
            default:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                ul91.d(this.b, this.c, (wp2) obj6, this.w, (f530) obj5, this.x, (ety0) obj4, (tls) obj3, (fid) obj, O);
                return zy11.a;
        }
    }

    public /* synthetic */ thd(String str, String str2, wp2 wp2Var, long j, f530 f530Var, int i, ety0 ety0Var, tls tlsVar, int i2) {
        this.b = str;
        this.c = str2;
        this.y = wp2Var;
        this.w = j;
        this.z = f530Var;
        this.x = i;
        this.A = ety0Var;
        this.B = tlsVar;
    }
}
