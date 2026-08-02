package defpackage;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class hl7 {
    public final boolean a;
    public final ngl b;
    public final boolean c;
    public final OkHttpClient d;
    public final eq3 e;
    public final boolean f;

    public hl7(boolean z, ngl nglVar, boolean z2, OkHttpClient okHttpClient, eq3 eq3Var, boolean z3) {
        this.a = z;
        this.b = nglVar;
        this.c = z2;
        this.d = okHttpClient;
        this.e = eq3Var;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hl7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        hl7 hl7Var = (hl7) obj;
        return this.a == hl7Var.a && this.c == hl7Var.c && this.f == hl7Var.f && this.b.equals(hl7Var.b) && Intrinsics.d(this.d, hl7Var.d) && this.e.equals(hl7Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.c), 31, this.f)) * 961;
        OkHttpClient okHttpClient = this.d;
        return this.e.hashCode() + ((hashCode + (okHttpClient != null ? okHttpClient.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultDataSourceFactoryCreatorConfig(cacheProvider=");
        sb.append(this.e);
        sb.append(", enableDebugCacheMiss=");
        sb.append(this.a);
        sb.append(", playerLogger=");
        sb.append(this.b);
        sb.append(", enableFallbackToUpstream=");
        sb.append(this.c);
        sb.append(", experimentalPreloadLiveDashConfig=null, okHttpClient=");
        sb.append(this.d);
        sb.append(", failFast=");
        return dfi.j(sb, this.f, ')');
    }
}
