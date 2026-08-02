package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzk20;", "", "Companion", "xk20", "yk20", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class zk20 {
    public static final yk20 Companion = new yk20();
    public static final i3y[] r;
    public final Boolean a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final List h;
    public final List i;
    public final Integer j;
    public final Integer k;
    public final List l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Boolean p;
    public final Boolean q;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        r = new i3y[]{null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new g110(22)), a.b(lazyThreadSafetyMode, new g110(23)), null, null, a.b(lazyThreadSafetyMode, new g110(24)), null, null, null, null, null};
    }

    public /* synthetic */ zk20(int i, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List list, List list2, Integer num7, Integer num8, List list3, Integer num9, Integer num10, Integer num11, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num7;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num8;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num9;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num10;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num11;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = bool2;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk20)) {
            return false;
        }
        zk20 zk20Var = (zk20) obj;
        return jl40.l(this.a, zk20Var.a) && jl40.l(this.b, zk20Var.b) && jl40.l(this.c, zk20Var.c) && jl40.l(this.d, zk20Var.d) && jl40.l(this.e, zk20Var.e) && jl40.l(this.f, zk20Var.f) && jl40.l(this.g, zk20Var.g) && jl40.l(this.h, zk20Var.h) && jl40.l(this.i, zk20Var.i) && jl40.l(this.j, zk20Var.j) && jl40.l(this.k, zk20Var.k) && jl40.l(this.l, zk20Var.l) && jl40.l(this.m, zk20Var.m) && jl40.l(this.n, zk20Var.n) && jl40.l(this.o, zk20Var.o) && jl40.l(this.p, zk20Var.p) && jl40.l(this.q, zk20Var.q);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List list = this.h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num7 = this.j;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.k;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List list3 = this.l;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num9 = this.m;
        int hashCode13 = (hashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.n;
        int hashCode14 = (hashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.o;
        int hashCode15 = (hashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool2 = this.p;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.q;
        return hashCode16 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobAlgorithmSettings(forgetCurrentProxiesOnUpdate=");
        sb.append(this.a);
        sb.append(", notificationsCacheLimit=");
        sb.append(this.b);
        sb.append(", notificationsTtlSeconds=");
        sb.append(this.c);
        sb.append(", updateConfigPeriodSeconds=");
        sb.append(this.d);
        sb.append(", pauseBeforeNextConfigUpdateAttemptSeconds=");
        sb.append(this.e);
        sb.append(", availabilityCheckPeriodSeconds=");
        sb.append(this.f);
        sb.append(", availabilityFullCheckPeriodSeconds=");
        sb.append(this.g);
        sb.append(", availabilityCheckStrategy=");
        sb.append(this.h);
        sb.append(", contourAvailabilityCheckStrategy=");
        sb.append(this.i);
        sb.append(", currentContourTtlSeconds=");
        sb.append(this.j);
        sb.append(", availabilityReportPeriodSeconds=");
        sb.append(this.k);
        sb.append(", detailedReportAdditionalHosts=");
        sb.append(this.l);
        sb.append(", traceRouteTimeoutSeconds=");
        sb.append(this.m);
        sb.append(", detailedReportIntervalSeconds=");
        sb.append(this.n);
        sb.append(", pingTimeOutSeconds=");
        sb.append(this.o);
        sb.append(", vpnNotificationsReloadEnabled=");
        sb.append(this.p);
        sb.append(", networkTypeNotificationsReloadEnabled=");
        return nzs.d(sb, this.q, Extension.C_BRAKE);
    }

    public zk20() {
        this(null, 131071);
    }

    public zk20(List list, int i) {
        Boolean bool = (i & 1) != 0 ? null : Boolean.FALSE;
        Integer num = (i & 2) != 0 ? null : 50;
        Integer num2 = (i & 4) != 0 ? null : 2592000;
        Integer num3 = (i & 8) != 0 ? null : r3;
        Integer num4 = (i & 16) != 0 ? null : 10;
        Integer num5 = (i & 32) != 0 ? null : 86400;
        Integer num6 = (i & 64) != 0 ? null : r3;
        list = (i & 128) != 0 ? null : list;
        r3 = (i & 1024) != 0 ? null : 864000;
        EmptyList emptyList = (i & 2048) != 0 ? null : EmptyList.a;
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = num5;
        this.g = num6;
        this.h = list;
        this.i = null;
        this.j = null;
        this.k = r3;
        this.l = emptyList;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }
}
