package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lyal0;", "Llwj0;", "Companion", "wal0", "xal0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class yal0 extends lwj0 {
    public static final xal0 Companion = new xal0();
    public static final i3y[] v;
    public final CouponCheckResult a;
    public final List b;
    public final ief c;
    public final x1k d;
    public final Alternatives e;
    public final List f;
    public final String g;
    public final String h;
    public final int i;
    public final vrz0 j;
    public final List k;
    public final Set l;
    public final b m;
    public final b n;
    public final now o;
    public final Map p;
    public final h6k0 q;
    public final zn11 r;
    public String s;
    public boolean t;
    public final i3y u;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        v = new i3y[]{null, a.b(lazyThreadSafetyMode, new eqj0(22)), null, null, null, a.b(lazyThreadSafetyMode, new eqj0(23)), null, null, null, null, a.b(lazyThreadSafetyMode, new eqj0(24)), a.b(lazyThreadSafetyMode, new eqj0(25)), null, null, null, a.b(lazyThreadSafetyMode, new eqj0(26)), null, null};
    }

    public /* synthetic */ yal0(int i, CouponCheckResult couponCheckResult, List list, ief iefVar, x1k x1kVar, Alternatives alternatives, List list2, String str, String str2, int i2, vrz0 vrz0Var, List list3, Set set, b bVar, b bVar2, now nowVar, Map map, h6k0 h6k0Var, zn11 zn11Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = couponCheckResult;
        }
        int i3 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = ief.e;
        } else {
            this.c = iefVar;
        }
        if ((i & 8) == 0) {
            this.d = x1k.c;
        } else {
            this.d = x1kVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = alternatives;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i2;
        }
        if ((i & 512) == 0) {
            this.j = vrz0.i;
        } else {
            this.j = vrz0Var;
        }
        if ((i & 1024) == 0) {
            this.k = emptyList;
        } else {
            this.k = list3;
        }
        if ((i & 2048) == 0) {
            this.l = EmptySet.a;
        } else {
            this.l = set;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bVar;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bVar2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = nowVar;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = map;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = h6k0Var;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = zn11Var;
        }
        this.s = null;
        this.t = false;
        this.u = a.a(new csf0(15, this));
    }

    @Override // defpackage.lwj0
    /* renamed from: e, reason: from getter */
    public final zn11 getG() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final fef g() {
        return (fef) this.u.getValue();
    }

    public final ServiceLevel h(int i) {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ServiceLevel serviceLevel = (ServiceLevel) list.get(i2);
            if (serviceLevel.l == i) {
                return serviceLevel;
            }
        }
        return null;
    }

    public final String toString() {
        String str = this.s;
        boolean z = this.t;
        StringBuilder sb = new StringBuilder("RouteStats(coupon=");
        sb.append(this.a);
        sb.append(", serviceLevels=");
        sb.append(this.b);
        sb.append(", currencyRulesDto=");
        sb.append(this.c);
        sb.append(", distanceCache=");
        sb.append(this.d);
        sb.append(", alternatives=");
        sb.append(this.e);
        sb.append(", messages=");
        sb.append(this.f);
        sb.append(", distance=");
        g8e.D(sb, this.g, ", time=", this.h, ", timeInSeconds=");
        sb.append(this.i);
        sb.append(", tollRoads=");
        sb.append(this.j);
        sb.append(", verticals=");
        sb.append(this.k);
        sb.append(", verticalModes=");
        sb.append(this.l);
        sb.append(", promoContext=");
        sb.append(this.m);
        sb.append(", mobilityHubContext=");
        sb.append(this.n);
        sb.append(", intercityParams=");
        sb.append(this.o);
        sb.append(", backendFormats=");
        sb.append(this.p);
        sb.append(", ridaInfo=");
        sb.append(this.q);
        sb.append(", typedExperiments=");
        sb.append(this.r);
        sb.append(", traceId=");
        return nnm.i(str, ", isLightWeight=", Extension.C_BRAKE, sb, z);
    }

    public yal0() {
        this(0);
    }

    public yal0(CouponCheckResult couponCheckResult, List list, ief iefVar, x1k x1kVar, Alternatives alternatives, List list2, String str, String str2, int i, vrz0 vrz0Var, List list3, Set set, b bVar, b bVar2, now nowVar, Map map, h6k0 h6k0Var, zn11 zn11Var, String str3, boolean z) {
        this.a = couponCheckResult;
        this.b = list;
        this.c = iefVar;
        this.d = x1kVar;
        this.e = alternatives;
        this.f = list2;
        this.g = str;
        this.h = str2;
        this.i = i;
        this.j = vrz0Var;
        this.k = list3;
        this.l = set;
        this.m = bVar;
        this.n = bVar2;
        this.o = nowVar;
        this.p = map;
        this.q = h6k0Var;
        this.r = zn11Var;
        this.s = str3;
        this.t = z;
        this.u = a.a(new iik0(11, this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ yal0(int i) {
        this(null, r2, ief.e, x1k.c, null, r2, "", "", 0, r10, r2, r12, null, null, null, null, null, null, null, false);
        vrz0 vrz0Var = vrz0.i;
        EmptySet emptySet = EmptySet.a;
        EmptyList emptyList = EmptyList.a;
    }
}
