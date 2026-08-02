package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public final /* synthetic */ class x4l0 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ tls x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ int z;

    public /* synthetic */ x4l0(h711 h711Var, f530 f530Var, sls slsVar, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, tls tlsVar5, boolean z, boolean z2, int i) {
        this.A = h711Var;
        this.B = f530Var;
        this.C = slsVar;
        this.w = tlsVar;
        this.x = tlsVar2;
        this.y = tlsVar3;
        this.D = tlsVar4;
        this.E = tlsVar5;
        this.b = z;
        this.c = z2;
        this.z = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.z;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        Object obj7 = this.A;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                a5l0.a((h711) obj7, (f530) obj6, (sls) obj5, this.w, this.x, this.y, (tls) obj4, (tls) obj3, this.b, this.c, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                kub1.c((String) obj7, this.b, (CharSequence) obj6, (ArrayList) obj5, this.c, this.w, this.x, this.y, (wg6) obj4, (j690) obj3, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ x4l0(String str, boolean z, CharSequence charSequence, ArrayList arrayList, boolean z2, tls tlsVar, tls tlsVar2, tls tlsVar3, wg6 wg6Var, j690 j690Var, int i) {
        this.A = str;
        this.b = z;
        this.B = charSequence;
        this.C = arrayList;
        this.c = z2;
        this.w = tlsVar;
        this.x = tlsVar2;
        this.y = tlsVar3;
        this.D = wg6Var;
        this.E = j690Var;
        this.z = i;
    }
}
