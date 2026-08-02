package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cvd {
    public final q6k a;
    public final bvd b;
    public final xud c;
    public final wud d;

    public cvd(q6k q6kVar, bvd bvdVar, xud xudVar, wud wudVar) {
        this.a = q6kVar;
        this.b = bvdVar;
        this.c = xudVar;
        this.d = wudVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvd)) {
            return false;
        }
        cvd cvdVar = (cvd) obj;
        return Intrinsics.d(this.a, cvdVar.a) && Intrinsics.d(this.b, cvdVar.b) && Intrinsics.d(this.c, cvdVar.c) && Intrinsics.d(this.d, cvdVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bvd bvdVar = this.b;
        int hashCode2 = (hashCode + (bvdVar == null ? 0 : bvdVar.hashCode())) * 31;
        xud xudVar = this.c;
        int hashCode3 = (hashCode2 + (xudVar == null ? 0 : xudVar.hashCode())) * 31;
        wud wudVar = this.d;
        return hashCode3 + (wudVar != null ? Boolean.hashCode(wudVar.a) : 0);
    }

    public final String toString() {
        return "HeaderContentState(logo=" + this.a + ", title=" + this.b + ", button=" + this.c + ", animationParams=" + this.d + ")";
    }
}
