package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class cuo {
    public final Object a;
    public final buo b;

    public cuo(Object obj, buo buoVar) {
        this.a = obj;
        this.b = buoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuo)) {
            return false;
        }
        cuo cuoVar = (cuo) obj;
        return Intrinsics.d(this.a, cuoVar.a) && this.b == cuoVar.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "SchemeProcessingInfo(schemeData=" + this.a + ", deeplinkSchemeType=" + this.b + ")";
    }
}
