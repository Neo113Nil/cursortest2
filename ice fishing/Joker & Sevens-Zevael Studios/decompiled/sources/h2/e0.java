package h2;

import b0.s0;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f2651a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f2652b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2653c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2654d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2655e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2656f;

    public e0(d0 d0Var, s0 s0Var, long j3) {
        this.f2651a = d0Var;
        this.f2652b = s0Var;
        this.f2653c = j3;
        ArrayList arrayList = (ArrayList) s0Var.f892e;
        float f10 = 0.0f;
        this.f2654d = arrayList.isEmpty() ? 0.0f : ((n) arrayList.get(0)).f2686a.f2609d.c(0);
        if (!arrayList.isEmpty()) {
            n nVar = (n) bc.m.X(arrayList);
            f10 = nVar.f2686a.f2609d.c(r4.f3138f - 1) + nVar.f2691f;
        }
        this.f2655e = f10;
        this.f2656f = (ArrayList) s0Var.f891d;
    }

    public final int a(int i10) {
        s0 s0Var = this.f2652b;
        ArrayList arrayList = (ArrayList) s0Var.f892e;
        n nVar = (n) arrayList.get(i10 >= ((e) ((d8.t) s0Var.f890c).f1816a).f2648h.length() ? bc.n.K(arrayList) : i10 < 0 ? 0 : z.c(i10, arrayList));
        return nVar.f2686a.f2609d.f3137e.getLineForOffset(nVar.a(i10)) + nVar.f2689d;
    }

    public final int b(float f10) {
        ArrayList arrayList = (ArrayList) this.f2652b.f892e;
        int i10 = 0;
        if (f10 > 0.0f) {
            if (f10 < ((n) bc.m.X(arrayList)).f2692g) {
                int size = arrayList.size() - 1;
                int i11 = 0;
                while (true) {
                    if (i11 > size) {
                        i10 = -(i11 + 1);
                        break;
                    }
                    int i12 = (i11 + size) >>> 1;
                    n nVar = (n) arrayList.get(i12);
                    char c3 = nVar.f2691f > f10 ? (char) 1 : nVar.f2692g <= f10 ? (char) 65535 : (char) 0;
                    if (c3 >= 0) {
                        if (c3 <= 0) {
                            i10 = i12;
                            break;
                        }
                        size = i12 - 1;
                    } else {
                        i11 = i12 + 1;
                    }
                }
            } else {
                i10 = bc.n.K(arrayList);
            }
        }
        n nVar2 = (n) arrayList.get(i10);
        int i13 = nVar2.f2688c;
        int i14 = nVar2.f2689d;
        if (i13 - nVar2.f2687b == 0) {
            return i14;
        }
        a aVar = nVar2.f2686a;
        float f11 = f10 - nVar2.f2691f;
        i2.k kVar = aVar.f2609d;
        return kVar.f3137e.getLineForVertical(((int) f11) - kVar.f3139g) + i14;
    }

    public final int c(int i10) {
        s0 s0Var = this.f2652b;
        s0Var.g(i10);
        ArrayList arrayList = (ArrayList) s0Var.f892e;
        n nVar = (n) arrayList.get(z.d(i10, arrayList));
        a aVar = nVar.f2686a;
        return aVar.f2609d.f3137e.getLineStart(i10 - nVar.f2689d) + nVar.f2687b;
    }

    public final float d(int i10) {
        s0 s0Var = this.f2652b;
        s0Var.g(i10);
        ArrayList arrayList = (ArrayList) s0Var.f892e;
        n nVar = (n) arrayList.get(z.d(i10, arrayList));
        a aVar = nVar.f2686a;
        return aVar.f2609d.f(i10 - nVar.f2689d) + nVar.f2691f;
    }

    public final r2.j e(int i10) {
        s0 s0Var = this.f2652b;
        ArrayList arrayList = (ArrayList) s0Var.f892e;
        d8.t tVar = (d8.t) s0Var.f890c;
        boolean z10 = false;
        if (i10 >= 0 && i10 <= ((e) tVar.f1816a).f2648h.length()) {
            z10 = true;
        }
        if (!z10) {
            m2.a.a("offset(" + i10 + ") is out of bounds [0, " + ((e) tVar.f1816a).f2648h.length() + ']');
        }
        n nVar = (n) arrayList.get(i10 == ((e) ((d8.t) s0Var.f890c).f1816a).f2648h.length() ? bc.n.K(arrayList) : z.c(i10, arrayList));
        a aVar = nVar.f2686a;
        int a6 = nVar.a(i10);
        i2.k kVar = aVar.f2609d;
        return kVar.f3137e.getParagraphDirection(kVar.f3137e.getLineForOffset(a6)) == 1 ? r2.j.f6028g : r2.j.f6029h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return pc.j.a(this.f2651a, e0Var.f2651a) && this.f2652b.equals(e0Var.f2652b) && s2.k.a(this.f2653c, e0Var.f2653c) && this.f2654d == e0Var.f2654d && this.f2655e == e0Var.f2655e && pc.j.a(this.f2656f, e0Var.f2656f);
    }

    public final int hashCode() {
        return this.f2656f.hashCode() + a4.d.b(this.f2655e, a4.d.b(this.f2654d, a4.d.c((this.f2652b.hashCode() + (this.f2651a.hashCode() * 31)) * 31, 31, this.f2653c), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f2651a + ", multiParagraph=" + this.f2652b + ", size=" + ((Object) s2.k.b(this.f2653c)) + ", firstBaseline=" + this.f2654d + ", lastBaseline=" + this.f2655e + ", placeholderRects=" + this.f2656f + ')';
    }
}
