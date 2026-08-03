package androidx.compose.foundation.text.modifiers;

import f0.g;
import h2.h0;
import k2.d;
import pc.j;
import x1.f;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f562a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f563b;

    /* renamed from: c, reason: collision with root package name */
    public final d f564c;

    /* renamed from: d, reason: collision with root package name */
    public final int f565d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f566e;

    /* renamed from: f, reason: collision with root package name */
    public final int f567f;

    /* renamed from: g, reason: collision with root package name */
    public final int f568g;

    public TextStringSimpleElement(String str, h0 h0Var, d dVar, int i10, boolean z10, int i11, int i12) {
        this.f562a = str;
        this.f563b = h0Var;
        this.f564c = dVar;
        this.f565d = i10;
        this.f566e = z10;
        this.f567f = i11;
        this.f568g = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return j.a(this.f562a, textStringSimpleElement.f562a) && j.a(this.f563b, textStringSimpleElement.f563b) && j.a(this.f564c, textStringSimpleElement.f564c) && this.f565d == textStringSimpleElement.f565d && this.f566e == textStringSimpleElement.f566e && this.f567f == textStringSimpleElement.f567f && this.f568g == textStringSimpleElement.f568g;
    }

    @Override // x1.y0
    public final m f() {
        g gVar = new g();
        gVar.f2206u = this.f562a;
        gVar.f2207v = this.f563b;
        gVar.f2208w = this.f564c;
        gVar.f2209x = this.f565d;
        gVar.f2210y = this.f566e;
        gVar.f2211z = this.f567f;
        gVar.A = this.f568g;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r5.f2674a.a(r3.f2674a) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // x1.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(m mVar) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        h0 h0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        d dVar;
        d dVar2;
        int i14;
        int i15;
        g gVar = (g) mVar;
        gVar.getClass();
        h0 h0Var2 = gVar.f2207v;
        boolean z14 = false;
        boolean z15 = true;
        h0 h0Var3 = this.f563b;
        if (h0Var3 == h0Var2) {
            h0Var3.getClass();
        } else if (!h0Var3.f2674a.b(h0Var2.f2674a)) {
            z10 = true;
            str = gVar.f2206u;
            str2 = this.f562a;
            if (j.a(str, str2)) {
                gVar.f2206u = str2;
                gVar.E = null;
                z11 = true;
            } else {
                z11 = false;
            }
            h0Var = gVar.f2207v;
            if (h0Var == h0Var3) {
                if (j.a(h0Var.f2675b, h0Var3.f2675b)) {
                }
                boolean z16 = !z14;
                gVar.f2207v = h0Var3;
                i10 = gVar.A;
                i11 = this.f568g;
                if (i10 != i11) {
                    gVar.A = i11;
                    z16 = true;
                }
                i12 = gVar.f2211z;
                i13 = this.f567f;
                if (i12 != i13) {
                    gVar.f2211z = i13;
                    z16 = true;
                }
                z12 = gVar.f2210y;
                z13 = this.f566e;
                if (z12 != z13) {
                    gVar.f2210y = z13;
                    z16 = true;
                }
                dVar = gVar.f2208w;
                dVar2 = this.f564c;
                if (!j.a(dVar, dVar2)) {
                    gVar.f2208w = dVar2;
                    z16 = true;
                }
                i14 = gVar.f2209x;
                i15 = this.f565d;
                if (i14 == i15) {
                    z15 = z16;
                } else {
                    gVar.f2209x = i15;
                }
                if (!z11 || z15) {
                    f0.d r02 = gVar.r0();
                    String str3 = gVar.f2206u;
                    h0 h0Var4 = gVar.f2207v;
                    d dVar3 = gVar.f2208w;
                    int i16 = gVar.f2209x;
                    boolean z17 = gVar.f2210y;
                    int i17 = gVar.f2211z;
                    int i18 = gVar.A;
                    r02.f2184a = str3;
                    r02.f2185b = h0Var4;
                    r02.f2186c = dVar3;
                    r02.f2187d = i16;
                    r02.f2188e = z17;
                    r02.f2189f = i17;
                    r02.f2190g = i18;
                    r02.a();
                }
                if (gVar.f8456t) {
                    if (z11 || (z10 && gVar.D != null)) {
                        f.o(gVar);
                    }
                    if (z11 || z15) {
                        f.n(gVar);
                        f.m(gVar);
                    }
                    if (z10) {
                        f.m(gVar);
                        return;
                    }
                    return;
                }
                return;
            }
            h0Var.getClass();
            z14 = true;
            boolean z162 = !z14;
            gVar.f2207v = h0Var3;
            i10 = gVar.A;
            i11 = this.f568g;
            if (i10 != i11) {
            }
            i12 = gVar.f2211z;
            i13 = this.f567f;
            if (i12 != i13) {
            }
            z12 = gVar.f2210y;
            z13 = this.f566e;
            if (z12 != z13) {
            }
            dVar = gVar.f2208w;
            dVar2 = this.f564c;
            if (!j.a(dVar, dVar2)) {
            }
            i14 = gVar.f2209x;
            i15 = this.f565d;
            if (i14 == i15) {
            }
            if (!z11) {
            }
            f0.d r022 = gVar.r0();
            String str32 = gVar.f2206u;
            h0 h0Var42 = gVar.f2207v;
            d dVar32 = gVar.f2208w;
            int i162 = gVar.f2209x;
            boolean z172 = gVar.f2210y;
            int i172 = gVar.f2211z;
            int i182 = gVar.A;
            r022.f2184a = str32;
            r022.f2185b = h0Var42;
            r022.f2186c = dVar32;
            r022.f2187d = i162;
            r022.f2188e = z172;
            r022.f2189f = i172;
            r022.f2190g = i182;
            r022.a();
            if (gVar.f8456t) {
            }
        }
        z10 = false;
        str = gVar.f2206u;
        str2 = this.f562a;
        if (j.a(str, str2)) {
        }
        h0Var = gVar.f2207v;
        if (h0Var == h0Var3) {
        }
        z14 = true;
        boolean z1622 = !z14;
        gVar.f2207v = h0Var3;
        i10 = gVar.A;
        i11 = this.f568g;
        if (i10 != i11) {
        }
        i12 = gVar.f2211z;
        i13 = this.f567f;
        if (i12 != i13) {
        }
        z12 = gVar.f2210y;
        z13 = this.f566e;
        if (z12 != z13) {
        }
        dVar = gVar.f2208w;
        dVar2 = this.f564c;
        if (!j.a(dVar, dVar2)) {
        }
        i14 = gVar.f2209x;
        i15 = this.f565d;
        if (i14 == i15) {
        }
        if (!z11) {
        }
        f0.d r0222 = gVar.r0();
        String str322 = gVar.f2206u;
        h0 h0Var422 = gVar.f2207v;
        d dVar322 = gVar.f2208w;
        int i1622 = gVar.f2209x;
        boolean z1722 = gVar.f2210y;
        int i1722 = gVar.f2211z;
        int i1822 = gVar.A;
        r0222.f2184a = str322;
        r0222.f2185b = h0Var422;
        r0222.f2186c = dVar322;
        r0222.f2187d = i1622;
        r0222.f2188e = z1722;
        r0222.f2189f = i1722;
        r0222.f2190g = i1822;
        r0222.a();
        if (gVar.f8456t) {
        }
    }

    public final int hashCode() {
        return (((a4.d.d(v.f.b(this.f565d, (this.f564c.hashCode() + ((this.f563b.hashCode() + (this.f562a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f566e) + this.f567f) * 31) + this.f568g) * 31;
    }
}
