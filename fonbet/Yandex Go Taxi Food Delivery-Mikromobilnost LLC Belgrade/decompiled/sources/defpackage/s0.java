package defpackage;

import com.yandex.go.chargers.discounts.activate.c;
import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class s0 implements wls {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ s0(lt9 lt9Var, tls tlsVar, boolean z, boolean z2, int i) {
        this.w = lt9Var;
        this.x = tlsVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        Object obj3 = this.w;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                sls slsVar = (sls) obj3;
                c47 c47Var = (c47) obj4;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    ohb1.b(ljs0.c(c530.a, 1.0f), this.b, ButtonSize.L, slsVar, wwg.S(1004528737, true, new my8(this.c, c47Var, i2), btsVar), btsVar, 24966, 0);
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                c.b((lt9) obj3, (tls) obj4, this.b, this.c, (fid) obj, vng.O(7));
                break;
            case 2:
                iib iibVar = (iib) obj4;
                sls slsVar2 = (sls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    boolean k = btsVar2.k(slsVar2);
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        Q = new ic0(12, slsVar2);
                        btsVar2.o0(Q);
                    }
                    clb1.a(null, this.b, this.c, null, iibVar, 0L, 0L, 0L, (tls) Q, null, 0, btsVar2, 0, 1769);
                    break;
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                y5r.a((String) obj4, this.b, this.c, (sls) obj3, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                q8a1.b((Integer) obj4, this.b, (sls) obj3, this.c, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ s0(Integer num, boolean z, sls slsVar, boolean z2, int i) {
        this.x = num;
        this.b = z;
        this.w = slsVar;
        this.c = z2;
    }

    public /* synthetic */ s0(String str, boolean z, boolean z2, sls slsVar, int i) {
        this.x = str;
        this.b = z;
        this.c = z2;
        this.w = slsVar;
    }

    public /* synthetic */ s0(boolean z, sls slsVar, boolean z2, c47 c47Var) {
        this.b = z;
        this.w = slsVar;
        this.c = z2;
        this.x = c47Var;
    }

    public /* synthetic */ s0(boolean z, boolean z2, iib iibVar, sls slsVar) {
        this.b = z;
        this.c = z2;
        this.x = iibVar;
        this.w = slsVar;
    }
}
