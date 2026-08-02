package defpackage;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cok {
    public final Set a;
    public final Set b;
    public final Set c;

    public cok() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        this.a = hashSet;
        this.b = hashSet2;
        this.c = hashSet3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cok)) {
            return false;
        }
        cok cokVar = (cok) obj;
        return Intrinsics.d(this.a, cokVar.a) && Intrinsics.d(this.b, cokVar.b) && Intrinsics.d(this.c, cokVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + su4.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChecksumValidationResultImpl(prevErrorBlocks=" + this.a + ", errorBlocks=" + this.b + ", newErrorBlocks=" + this.c + ")";
    }
}
