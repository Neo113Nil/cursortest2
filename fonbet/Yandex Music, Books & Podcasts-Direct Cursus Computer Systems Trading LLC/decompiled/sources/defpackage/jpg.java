package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jpg extends ue5 {
    public final String a;
    public final n5p b;
    public final c0p c;
    public final String d;
    public final boolean e;
    public final t1p f;

    public jpg(String str, n5p n5pVar, c0p c0pVar, String str2, boolean z, t1p t1pVar) {
        str.getClass();
        c0pVar.getClass();
        str2.getClass();
        this.a = str;
        this.b = n5pVar;
        this.c = c0pVar;
        this.d = str2;
        this.e = z;
        this.f = t1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpg)) {
            return false;
        }
        jpg jpgVar = (jpg) obj;
        return Intrinsics.d(this.a, jpgVar.a) && this.b.equals(jpgVar.b) && this.c == jpgVar.c && Intrinsics.d(this.d, jpgVar.d) && this.e == jpgVar.e && this.f == jpgVar.f;
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        t1p t1pVar = this.f;
        return e + (t1pVar == null ? 0 : t1pVar.hashCode());
    }

    public final String toString() {
        return "LocalSearchParams(query=" + this.a + ", entity=" + this.b + ", context=" + this.c + ", id=" + this.d + ", fromUserLibrary=" + this.e + ", filter=" + this.f + ")";
    }
}
