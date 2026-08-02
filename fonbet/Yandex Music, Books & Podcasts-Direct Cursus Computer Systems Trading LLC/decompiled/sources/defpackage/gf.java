package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gf implements jf {
    public final t5a a;
    public final String b;
    public final String c;
    public final Throwable d;

    public gf(t5a t5aVar, String str, String str2, Throwable th) {
        this.a = t5aVar;
        this.b = str;
        this.c = str2;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gf.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gf gfVar = (gf) obj;
        return Intrinsics.d(this.a, gfVar.a) && Intrinsics.d(this.b, gfVar.b) && Intrinsics.d(this.c, gfVar.c) && this.d.equals(gfVar.d);
    }

    public final int hashCode() {
        t5a t5aVar = this.a;
        int hashCode = (t5aVar != null ? t5aVar.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Corrupted(query=" + this.a + ", requestId=" + this.b + ", actionType=" + this.c + ", throwable=" + this.d + ")";
    }
}
