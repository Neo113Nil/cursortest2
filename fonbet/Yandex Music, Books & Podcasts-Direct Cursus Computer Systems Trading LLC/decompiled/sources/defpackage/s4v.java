package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s4v {
    public final String a;
    public final String b;

    public s4v(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4v)) {
            return false;
        }
        s4v s4vVar = (s4v) obj;
        return Intrinsics.d(this.a, s4vVar.a) && Intrinsics.d(this.b, s4vVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("WaveSessionDescription(name=", this.a, ", description=", this.b, ")");
    }
}
