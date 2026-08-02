package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrc61;", "", "Companion", "pc61", "qc61", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class rc61 {
    public static final qc61 Companion = new qc61();
    public static final i3y[] d;
    public final List a;
    public final List b;
    public final String c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new dp51(22)), a.b(lazyThreadSafetyMode, new dp51(23))};
    }

    public /* synthetic */ rc61(List list, List list2, int i) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        this.c = null;
    }

    public static rc61 a(rc61 rc61Var, String str) {
        return new rc61(str, rc61Var.a, rc61Var.b);
    }

    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final List getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc61)) {
            return false;
        }
        rc61 rc61Var = (rc61) obj;
        return jl40.l(this.a, rc61Var.a) && jl40.l(this.b, rc61Var.b) && jl40.l(this.c, rc61Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(qv10.v("ZeroSuggestResponse(results=", this.a, ", additionalItems=", this.b, ", traceId="), this.c, Extension.C_BRAKE);
    }

    public rc61(String str, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public rc61() {
        this((String) null, (List) null, (List) null);
    }
}
