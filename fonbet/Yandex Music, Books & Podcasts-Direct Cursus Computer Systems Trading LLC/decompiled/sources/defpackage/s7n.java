package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s7n {
    public final String a;
    public final String b;

    public s7n(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7n)) {
            return false;
        }
        s7n s7nVar = (s7n) obj;
        return this.a.equals(s7nVar.a) && Intrinsics.d(this.b, s7nVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("QueryToVibeWaveUiData(title=", this.a, ", description=", this.b, ")");
    }
}
