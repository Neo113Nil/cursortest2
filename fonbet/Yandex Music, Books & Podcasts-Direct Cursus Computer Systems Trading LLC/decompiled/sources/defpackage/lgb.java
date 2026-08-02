package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class lgb {
    public final kgb a;
    public final String b;

    public lgb(kgb kgbVar, String str) {
        this.a = kgbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgb)) {
            return false;
        }
        lgb lgbVar = (lgb) obj;
        return this.a == lgbVar.a && Intrinsics.d(this.b, lgbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ErrorReason(type=" + this.a + ", message=" + this.b + ")";
    }
}
