package defpackage;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;

/* loaded from: classes2.dex */
public final class rqd {
    public final String a;
    public final zdd0 b;
    public final PlusPayAnalyticsParams c;

    public rqd(String str, zdd0 zdd0Var, PlusPayAnalyticsParams plusPayAnalyticsParams) {
        this.a = str;
        this.b = zdd0Var;
        this.c = plusPayAnalyticsParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqd)) {
            return false;
        }
        rqd rqdVar = (rqd) obj;
        return jl40.l(this.a, rqdVar.a) && jl40.l(this.b, rqdVar.b) && jl40.l(this.c, rqdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }

    public final String toString() {
        return "Arguments(target=" + this.a + ", filters=" + this.b + ", forceUpdate=false, analyticsParams=" + this.c + ')';
    }
}
