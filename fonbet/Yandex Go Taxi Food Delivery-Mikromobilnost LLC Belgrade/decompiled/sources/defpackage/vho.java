package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class vho {
    public final to2 a;
    public final String b;
    public final EvgenDiagnostic$NetworkErrorType c;
    public final String d;
    public final HashMap e;

    public vho(to2 to2Var, String str, EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType, String str2, HashMap hashMap) {
        this.a = to2Var;
        this.b = str;
        this.c = evgenDiagnostic$NetworkErrorType;
        this.d = str2;
        this.e = hashMap;
    }

    public final Map a() {
        return this.e;
    }

    public final EvgenDiagnostic$NetworkErrorType b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final to2 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vho)) {
            return false;
        }
        vho vhoVar = (vho) obj;
        return jl40.l(this.a, vhoVar.a) && jl40.l(this.b, vhoVar.b) && this.c == vhoVar.c && this.d.equals(vhoVar.d) && this.e.equals(vhoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "Event(request=" + this.a + ", operationName=" + this.b + ", errorType=" + this.c + ", message=" + this.d + ", additionalParams=" + this.e + ')';
    }
}
