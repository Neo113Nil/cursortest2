package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ssw {
    public final p6g a;

    public ssw(emw emwVar) {
        this.a = emwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssw) && Intrinsics.d(this.a, ((ssw) obj).a);
    }

    public final int hashCode() {
        p6g p6gVar = this.a;
        return Boolean.hashCode(true) + ((p6gVar == null ? 0 : p6gVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SwitchConfig(mode=" + this.a + ", closeOnError=true)";
    }
}
