package defpackage;

import android.content.Context;
import com.yandex.go.chargers.discounts.discount_stations.data.a;
import com.yandex.go.flex.common.facade.b;
import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class ss9 extends pgd {
    public final /* synthetic */ int F = 3;
    public final Context G;
    public final w030 H;
    public final Object I;
    public final Object J;
    public final Object K;
    public Object L;
    public final wfd M;

    public ss9(Context context, w030 w030Var, i130 i130Var, hbe0 hbe0Var, lbe0 lbe0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = i130Var;
        this.J = hbe0Var;
        this.K = lbe0Var;
        this.L = new v5c0(7, this);
        this.M = new mu5(new obe0(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public void G(Object obj) {
        switch (this.F) {
            case 3:
                boolean z = ((u0n0) obj).a;
                super.G(new u0n0(z));
                ewn0 ewn0Var = (ewn0) this.K;
                if (ewn0Var != null) {
                    ewn0Var.c();
                }
                if (z) {
                    fjr fjrVar = new fjr(1, this);
                    ((b) this.I).a(fjrVar);
                    this.L = fjrVar;
                    break;
                }
                break;
            default:
                super.G(obj);
                break;
        }
    }

    @Override // defpackage.pgd, defpackage.h55
    public void H(Object obj) {
        switch (this.F) {
            case 3:
                super.H(new u0n0(((u0n0) obj).a));
                ewn0 ewn0Var = (ewn0) this.K;
                if (ewn0Var != null) {
                    ewn0Var.b();
                }
                fjr fjrVar = (fjr) this.L;
                if (fjrVar != null) {
                    ((b) this.I).e(fjrVar);
                }
                this.L = null;
                break;
            default:
                super.H(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        Object value;
        Object value2;
        boolean z;
        int i = this.F;
        Object obj2 = this.K;
        Object obj3 = this.I;
        switch (i) {
            case 1:
                vlj vljVar = (vlj) obj;
                this.L = vljVar.b;
                qlj qljVar = vljVar.a;
                r0 r0Var = ((xlj) obj3).a;
                do {
                    value = r0Var.getValue();
                    ((wlj) value).getClass();
                } while (!r0Var.k(value, new wlj(qljVar)));
                clq0 clq0Var = vljVar.b;
                n310 n310Var = ((w310) obj2).a;
                String str = clq0Var.a;
                boolean z2 = clq0Var.b;
                String str2 = clq0Var.d;
                String str3 = clq0Var.c;
                n310Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("property", str);
                if (str2 != null) {
                    hashMap.put("request_id", str2);
                }
                if (str3 != null) {
                    hashMap.put("trip_id", str3);
                }
                n310Var.a.a("MasstransitPayment.DirectionSelector.Shown", hashMap, 1, x4e.r(z2, hashMap, "by_user"));
                break;
            case 4:
                mhu0 mhu0Var = (mhu0) obj;
                this.L = mhu0Var.b;
                khu0 khu0Var = mhu0Var.a;
                r0 r0Var2 = ((qhu0) obj3).a;
                do {
                    value2 = r0Var2.getValue();
                    phu0 phu0Var = (phu0) value2;
                    z = phu0Var.b;
                    phu0Var.getClass();
                } while (!r0Var2.k(value2, new phu0(khu0Var, z)));
                clq0 clq0Var2 = mhu0Var.b;
                n310 n310Var2 = ((w310) obj2).a;
                String str4 = clq0Var2.a;
                boolean z3 = clq0Var2.b;
                String str5 = clq0Var2.d;
                String str6 = clq0Var2.c;
                n310Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("property", str4);
                if (str5 != null) {
                    hashMap2.put("request_id", str5);
                }
                if (str6 != null) {
                    hashMap2.put("trip_id", str6);
                }
                n310Var2.a.a("MasstransitPayment.StopSelector.Shown", hashMap2, 1, x4e.r(z3, hashMap2, "by_user"));
                break;
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        switch (this.F) {
            case 0:
                return (mu5) this.M;
            case 1:
                return (p1b) this.M;
            case 2:
                return (mu5) this.M;
            case 3:
                return (mu5) this.M;
            default:
                return (p1b) this.M;
        }
    }

    @Override // defpackage.pgd
    public final Context Q() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        int i = this.F;
        w030 w030Var = this.H;
        switch (i) {
            case 0:
            case 1:
                return w030Var;
            case 2:
                mbe0 mbe0Var = (mbe0) this.x;
                return (mbe0Var == null || !mbe0Var.b) ? ((i130) this.I).a() : w030Var;
            case 3:
            default:
                return w030Var;
        }
    }

    public ss9(Context context, w030 w030Var, qhu0 qhu0Var, jhu0 jhu0Var, w310 w310Var, f6 f6Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = qhu0Var;
        this.J = jhu0Var;
        this.K = w310Var;
        this.M = new p1b(f6Var, new p9t0(12, this));
    }

    public ss9(Context context, w030 w030Var, xlj xljVar, plj pljVar, w310 w310Var, ie ieVar) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = xljVar;
        this.J = pljVar;
        this.K = w310Var;
        this.M = new p1b(ieVar, new zvi(6, this));
    }

    public ss9(Context context, w030 w030Var, txf txfVar, a aVar, jt9 jt9Var, ct9 ct9Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = txfVar;
        this.J = aVar;
        this.K = jt9Var;
        this.L = ct9Var;
        this.M = new mu5(new od9(4, this));
    }

    public ss9(Context context, w030 w030Var, ScootersBduiScreenType scootersBduiScreenType, b bVar, ljr ljrVar, ewn0 ewn0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = bVar;
        this.J = ljrVar;
        this.K = ewn0Var;
        this.M = new mu5(new vam0(13, this, scootersBduiScreenType));
    }
}
