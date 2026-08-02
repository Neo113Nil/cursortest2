package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qdp implements sdp {
    public final rfk a;

    public qdp(rfk rfkVar) {
        rfkVar.getClass();
        this.a = rfkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdp) && Intrinsics.d(this.a, ((qdp) obj).a);
    }

    @Override // defpackage.sdp
    public final rfk getMethod() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FromMethod(method=" + this.a + ")";
    }
}
