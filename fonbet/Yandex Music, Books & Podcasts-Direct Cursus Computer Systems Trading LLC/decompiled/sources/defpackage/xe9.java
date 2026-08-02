package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xe9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final JSONObject d;

    public xe9(boolean z, boolean z2, boolean z3, JSONObject jSONObject) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe9)) {
            return false;
        }
        xe9 xe9Var = (xe9) obj;
        return this.a == xe9Var.a && this.b == xe9Var.b && this.c == xe9Var.c && Intrinsics.d(this.d, xe9Var.d);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        JSONObject jSONObject = this.d;
        return e + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "DivPlayerPlaybackConfig(autoplay=" + this.a + ", isMuted=" + this.b + ", repeatable=" + this.c + ", payload=" + this.d + ')';
    }
}
