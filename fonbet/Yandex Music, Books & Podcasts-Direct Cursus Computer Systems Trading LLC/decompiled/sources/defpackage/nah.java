package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nah {
    public final Object a;
    public final mah b;

    public nah(Object obj, mah mahVar) {
        this.a = obj;
        this.b = mahVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nah.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        nah nahVar = (nah) obj;
        return Intrinsics.d(this.a, nahVar.a) && this.b.equals(nahVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "MapiRequestResult(data=" + this.a + ", details=" + this.b + ")";
    }
}
