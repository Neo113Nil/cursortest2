package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qdr {
    public final String a;
    public final boolean b;

    public qdr(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdr)) {
            return false;
        }
        qdr qdrVar = (qdr) obj;
        return Intrinsics.d(this.a, qdrVar.a) && this.b == qdrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("State(tag=", this.a, ", visible=", ")", this.b);
    }
}
