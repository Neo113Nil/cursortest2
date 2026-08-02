package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class ckd {
    public final String a;
    public final boolean b;
    public final bkd c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;

    public ckd(String str, boolean z, bkd bkdVar, String str2, String str3, String str4, long j) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = z;
        this.c = bkdVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j;
        boolean z2 = false;
        boolean M = StringsKt.M(str, "fake_id", false);
        if (!M) {
            boolean z3 = bkdVar.a;
        }
        if (!M && bkdVar.b) {
            z2 = true;
        }
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckd)) {
            return false;
        }
        ckd ckdVar = (ckd) obj;
        return Intrinsics.d(this.a, ckdVar.a) && this.b == ckdVar.b && this.c == ckdVar.c && Intrinsics.d(this.d, ckdVar.d) && Intrinsics.d(this.e, ckdVar.e) && Intrinsics.d(this.f, ckdVar.f) && this.g == ckdVar.g;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return Long.hashCode(this.g) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = v3w.h("GlagolTrackPreview(id=", this.a, ", live=", ", type=", this.b);
        h.append(this.c);
        h.append(", title=");
        h.append(this.d);
        h.append(", subtitle=");
        su4.v(h, this.e, ", coverUrl=", this.f, ", durationMs=");
        return hrg.m(this.g, ")", h);
    }
}
