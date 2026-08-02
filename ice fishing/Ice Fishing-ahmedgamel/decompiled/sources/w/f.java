package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import u.C5048c;
import u.C5051f;
import x.AbstractC5169h;
import x.AbstractC5177p;
import x.C5163b;
import x.C5164c;
import x.C5166e;
import x.C5176o;

/* loaded from: classes.dex */
public final class f extends C5130e {

    /* renamed from: A0, reason: collision with root package name */
    public int f41322A0;

    /* renamed from: B0, reason: collision with root package name */
    public C5127b[] f41323B0;
    public C5127b[] C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f41324D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f41325E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f41326F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f41327G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f41328H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f41329I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f41330J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f41331K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C5163b f41332L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f41333q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final l4.g f41334r0 = new l4.g(this);

    /* renamed from: s0, reason: collision with root package name */
    public final C5166e f41335s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f41336t0;

    /* renamed from: u0, reason: collision with root package name */
    public z.f f41337u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41338v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C5048c f41339w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f41340x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f41341y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f41342z0;

    public f() {
        C5166e c5166e = new C5166e();
        c5166e.f41765b = true;
        c5166e.f41766c = true;
        c5166e.f41768e = new ArrayList();
        new ArrayList();
        c5166e.f41769f = null;
        c5166e.f41770g = new C5163b();
        c5166e.f41771h = new ArrayList();
        c5166e.f41764a = this;
        c5166e.f41767d = this;
        this.f41335s0 = c5166e;
        this.f41337u0 = null;
        this.f41338v0 = false;
        this.f41339w0 = new C5048c();
        this.f41342z0 = 0;
        this.f41322A0 = 0;
        this.f41323B0 = new C5127b[4];
        this.C0 = new C5127b[4];
        this.f41324D0 = 257;
        this.f41325E0 = false;
        this.f41326F0 = false;
        this.f41327G0 = null;
        this.f41328H0 = null;
        this.f41329I0 = null;
        this.f41330J0 = null;
        this.f41331K0 = new HashSet();
        this.f41332L0 = new C5163b();
    }

    public static void V(C5130e c5130e, z.f fVar, C5163b c5163b) {
        int i;
        int i4;
        if (fVar == null) {
            return;
        }
        if (c5130e.f41295g0 == 8 || (c5130e instanceof i) || (c5130e instanceof C5126a)) {
            c5163b.f41757e = 0;
            c5163b.f41758f = 0;
            return;
        }
        int[] iArr = c5130e.f41311p0;
        c5163b.f41753a = iArr[0];
        c5163b.f41754b = iArr[1];
        c5163b.f41755c = c5130e.q();
        c5163b.f41756d = c5130e.k();
        c5163b.i = false;
        c5163b.f41761j = 0;
        boolean z6 = c5163b.f41753a == 3;
        boolean z9 = c5163b.f41754b == 3;
        boolean z10 = z6 && c5130e.f41279W > 0.0f;
        boolean z11 = z9 && c5130e.f41279W > 0.0f;
        if (z6 && c5130e.t(0) && c5130e.f41313r == 0 && !z10) {
            c5163b.f41753a = 2;
            if (z9 && c5130e.f41314s == 0) {
                c5163b.f41753a = 1;
            }
            z6 = false;
        }
        if (z9 && c5130e.t(1) && c5130e.f41314s == 0 && !z11) {
            c5163b.f41754b = 2;
            if (z6 && c5130e.f41313r == 0) {
                c5163b.f41754b = 1;
            }
            z9 = false;
        }
        if (c5130e.A()) {
            c5163b.f41753a = 1;
            z6 = false;
        }
        if (c5130e.B()) {
            c5163b.f41754b = 1;
            z9 = false;
        }
        int[] iArr2 = c5130e.f41315t;
        if (z10) {
            if (iArr2[0] == 4) {
                c5163b.f41753a = 1;
            } else if (!z9) {
                if (c5163b.f41754b == 1) {
                    i4 = c5163b.f41756d;
                } else {
                    c5163b.f41753a = 2;
                    fVar.b(c5130e, c5163b);
                    i4 = c5163b.f41758f;
                }
                c5163b.f41753a = 1;
                c5163b.f41755c = (int) (c5130e.f41279W * i4);
            }
        }
        if (z11) {
            if (iArr2[1] == 4) {
                c5163b.f41754b = 1;
            } else if (!z6) {
                if (c5163b.f41753a == 1) {
                    i = c5163b.f41755c;
                } else {
                    c5163b.f41754b = 2;
                    fVar.b(c5130e, c5163b);
                    i = c5163b.f41757e;
                }
                c5163b.f41754b = 1;
                if (c5130e.f41280X == -1) {
                    c5163b.f41756d = (int) (i / c5130e.f41279W);
                } else {
                    c5163b.f41756d = (int) (c5130e.f41279W * i);
                }
            }
        }
        fVar.b(c5130e, c5163b);
        c5130e.O(c5163b.f41757e);
        c5130e.L(c5163b.f41758f);
        c5130e.f41262E = c5163b.f41760h;
        c5130e.I(c5163b.f41759g);
        c5163b.f41761j = 0;
    }

    @Override // w.C5130e
    public final void C() {
        this.f41339w0.t();
        this.f41340x0 = 0;
        this.f41341y0 = 0;
        this.f41333q0.clear();
        super.C();
    }

    @Override // w.C5130e
    public final void F(l4.g gVar) {
        super.F(gVar);
        int size = this.f41333q0.size();
        for (int i = 0; i < size; i++) {
            ((C5130e) this.f41333q0.get(i)).F(gVar);
        }
    }

    @Override // w.C5130e
    public final void P(boolean z6, boolean z9) {
        super.P(z6, z9);
        int size = this.f41333q0.size();
        for (int i = 0; i < size; i++) {
            ((C5130e) this.f41333q0.get(i)).P(z6, z9);
        }
    }

    public final void R(C5130e c5130e, int i) {
        if (i == 0) {
            int i4 = this.f41342z0 + 1;
            C5127b[] c5127bArr = this.C0;
            if (i4 >= c5127bArr.length) {
                this.C0 = (C5127b[]) Arrays.copyOf(c5127bArr, c5127bArr.length * 2);
            }
            C5127b[] c5127bArr2 = this.C0;
            int i6 = this.f41342z0;
            c5127bArr2[i6] = new C5127b(c5130e, 0, this.f41338v0);
            this.f41342z0 = i6 + 1;
            return;
        }
        if (i == 1) {
            int i9 = this.f41322A0 + 1;
            C5127b[] c5127bArr3 = this.f41323B0;
            if (i9 >= c5127bArr3.length) {
                this.f41323B0 = (C5127b[]) Arrays.copyOf(c5127bArr3, c5127bArr3.length * 2);
            }
            C5127b[] c5127bArr4 = this.f41323B0;
            int i10 = this.f41322A0;
            c5127bArr4[i10] = new C5127b(c5130e, 1, this.f41338v0);
            this.f41322A0 = i10 + 1;
        }
    }

    public final void S(C5048c c5048c) {
        f fVar;
        C5048c c5048c2;
        boolean W3 = W(64);
        b(c5048c, W3);
        int size = this.f41333q0.size();
        boolean z6 = false;
        for (int i = 0; i < size; i++) {
            C5130e c5130e = (C5130e) this.f41333q0.get(i);
            boolean[] zArr = c5130e.f41275S;
            zArr[0] = false;
            zArr[1] = false;
            if (c5130e instanceof C5126a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i4 = 0; i4 < size; i4++) {
                C5130e c5130e2 = (C5130e) this.f41333q0.get(i4);
                if (c5130e2 instanceof C5126a) {
                    C5126a c5126a = (C5126a) c5130e2;
                    for (int i6 = 0; i6 < c5126a.f41402r0; i6++) {
                        C5130e c5130e3 = c5126a.f41401q0[i6];
                        if (c5126a.f41231t0 || c5130e3.c()) {
                            int i9 = c5126a.f41230s0;
                            if (i9 == 0 || i9 == 1) {
                                c5130e3.f41275S[0] = true;
                            } else if (i9 == 2 || i9 == 3) {
                                c5130e3.f41275S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f41331K0;
        hashSet.clear();
        for (int i10 = 0; i10 < size; i10++) {
            C5130e c5130e4 = (C5130e) this.f41333q0.get(i10);
            c5130e4.getClass();
            boolean z9 = c5130e4 instanceof h;
            if (z9 || (c5130e4 instanceof i)) {
                if (z9) {
                    hashSet.add(c5130e4);
                } else {
                    c5130e4.b(c5048c, W3);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) ((C5130e) it.next());
                for (int i11 = 0; i11 < hVar.f41402r0; i11++) {
                    if (hashSet.contains(hVar.f41401q0[i11])) {
                        hVar.b(c5048c, W3);
                        hashSet.remove(hVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C5130e) it2.next()).b(c5048c, W3);
                }
                hashSet.clear();
            }
        }
        if (C5048c.f40917q) {
            HashSet hashSet2 = new HashSet();
            for (int i12 = 0; i12 < size; i12++) {
                C5130e c5130e5 = (C5130e) this.f41333q0.get(i12);
                c5130e5.getClass();
                if (!(c5130e5 instanceof h) && !(c5130e5 instanceof i)) {
                    hashSet2.add(c5130e5);
                }
            }
            fVar = this;
            c5048c2 = c5048c;
            fVar.a(this, c5048c2, hashSet2, this.f41311p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C5130e c5130e6 = (C5130e) it3.next();
                k.b(this, c5048c2, c5130e6);
                c5130e6.b(c5048c2, W3);
            }
        } else {
            fVar = this;
            c5048c2 = c5048c;
            for (int i13 = 0; i13 < size; i13++) {
                C5130e c5130e7 = (C5130e) fVar.f41333q0.get(i13);
                if (c5130e7 instanceof f) {
                    int[] iArr = c5130e7.f41311p0;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    if (i14 == 2) {
                        c5130e7.M(1);
                    }
                    if (i15 == 2) {
                        c5130e7.N(1);
                    }
                    c5130e7.b(c5048c2, W3);
                    if (i14 == 2) {
                        c5130e7.M(i14);
                    }
                    if (i15 == 2) {
                        c5130e7.N(i15);
                    }
                } else {
                    k.b(this, c5048c2, c5130e7);
                    if (!(c5130e7 instanceof h) && !(c5130e7 instanceof i)) {
                        c5130e7.b(c5048c2, W3);
                    }
                }
            }
        }
        if (fVar.f41342z0 > 0) {
            k.a(this, c5048c2, null, 0);
        }
        if (fVar.f41322A0 > 0) {
            k.a(this, c5048c2, null, 1);
        }
    }

    public final boolean T(int i, boolean z6) {
        boolean z9;
        C5166e c5166e = this.f41335s0;
        f fVar = c5166e.f41764a;
        boolean z10 = false;
        int j6 = fVar.j(0);
        int j9 = fVar.j(1);
        int r9 = fVar.r();
        int s9 = fVar.s();
        ArrayList arrayList = c5166e.f41768e;
        if (z6 && (j6 == 2 || j9 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC5177p abstractC5177p = (AbstractC5177p) it.next();
                if (abstractC5177p.f41801f == i && !abstractC5177p.k()) {
                    z6 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z6 && j6 == 2) {
                    fVar.M(1);
                    fVar.O(c5166e.d(fVar, 0));
                    fVar.f41288d.f41800e.d(fVar.q());
                }
            } else if (z6 && j9 == 2) {
                fVar.N(1);
                fVar.L(c5166e.d(fVar, 1));
                fVar.f41290e.f41800e.d(fVar.k());
            }
        }
        int[] iArr = fVar.f41311p0;
        if (i == 0) {
            int i4 = iArr[0];
            if (i4 == 1 || i4 == 4) {
                int q8 = fVar.q() + r9;
                fVar.f41288d.i.d(q8);
                fVar.f41288d.f41800e.d(q8 - r9);
                z9 = true;
            }
            z9 = false;
        } else {
            int i6 = iArr[1];
            if (i6 == 1 || i6 == 4) {
                int k9 = fVar.k() + s9;
                fVar.f41290e.i.d(k9);
                fVar.f41290e.f41800e.d(k9 - s9);
                z9 = true;
            }
            z9 = false;
        }
        c5166e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC5177p abstractC5177p2 = (AbstractC5177p) it2.next();
            if (abstractC5177p2.f41801f == i && (abstractC5177p2.f41797b != fVar || abstractC5177p2.f41802g)) {
                abstractC5177p2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z10 = true;
                break;
            }
            AbstractC5177p abstractC5177p3 = (AbstractC5177p) it3.next();
            if (abstractC5177p3.f41801f == i && (z9 || abstractC5177p3.f41797b != fVar)) {
                if (!abstractC5177p3.f41803h.f41780j) {
                    break;
                }
                if (!abstractC5177p3.i.f41780j) {
                    break;
                }
                if (!(abstractC5177p3 instanceof C5164c) && !abstractC5177p3.f41800e.f41780j) {
                    break;
                }
            }
        }
        fVar.M(j6);
        fVar.N(j9);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x084f A[LOOP:14: B:281:0x084d->B:282:0x084f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0668  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        Object[] objArr;
        C5129d c5129d;
        int i;
        int i4;
        boolean z6;
        char c9;
        int i6;
        boolean z9;
        boolean z10;
        C5129d c5129d2;
        boolean z11;
        boolean[] zArr;
        boolean z12;
        int max;
        ?? r14;
        boolean z13;
        int max2;
        boolean z14;
        boolean z15;
        int i9;
        int i10;
        int max3;
        int max4;
        C5048c c5048c;
        char c10;
        C5176o c5176o;
        C5176o c5176o2;
        int b9;
        int b10;
        int i11;
        C5176o c5176o3;
        C5176o c5176o4;
        boolean z16;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i12;
        boolean z17;
        this.Y = 0;
        this.f41281Z = 0;
        this.f41325E0 = false;
        this.f41326F0 = false;
        int size = this.f41333q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.f41311p0;
        int i13 = iArr[1];
        int i14 = iArr[0];
        int i15 = this.f41336t0;
        C5129d c5129d3 = this.J;
        C5129d c5129d4 = this.f41266I;
        if (i15 == 0 && k.c(this.f41324D0, 1)) {
            z.f fVar = this.f41337u0;
            int i16 = iArr[0];
            int i17 = iArr[1];
            E();
            ArrayList arrayList6 = this.f41333q0;
            int size2 = arrayList6.size();
            for (int i18 = 0; i18 < size2; i18++) {
                ((C5130e) arrayList6.get(i18)).E();
            }
            boolean z18 = this.f41338v0;
            if (i16 == 1) {
                J(0, q());
            } else {
                c5129d4.l(0);
                this.Y = 0;
            }
            int i19 = 0;
            boolean z19 = false;
            boolean z20 = false;
            while (i19 < size2) {
                int[] iArr2 = iArr;
                C5130e c5130e = (C5130e) arrayList6.get(i19);
                int i20 = i19;
                if (c5130e instanceof i) {
                    i iVar = (i) c5130e;
                    z17 = z19;
                    if (iVar.f41399u0 == 1) {
                        int i21 = iVar.f41396r0;
                        if (i21 != -1) {
                            iVar.R(i21);
                        } else if (iVar.f41397s0 != -1 && A()) {
                            iVar.R(q() - iVar.f41397s0);
                        } else if (A()) {
                            iVar.R((int) ((iVar.f41395q0 * q()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else {
                    z17 = z19;
                    if ((c5130e instanceof C5126a) && ((C5126a) c5130e).U() == 0) {
                        z19 = z17;
                        z20 = true;
                        i19 = i20 + 1;
                        iArr = iArr2;
                    }
                }
                z19 = z17;
                i19 = i20 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z19) {
                for (int i22 = 0; i22 < size2; i22 = i12 + 1) {
                    C5130e c5130e2 = (C5130e) arrayList6.get(i22);
                    if (c5130e2 instanceof i) {
                        i iVar2 = (i) c5130e2;
                        i12 = i22;
                        if (iVar2.f41399u0 == 1) {
                            AbstractC5169h.c(0, iVar2, fVar, z18);
                        }
                    } else {
                        i12 = i22;
                    }
                }
            }
            AbstractC5169h.c(0, this, fVar, z18);
            if (z20) {
                for (int i23 = 0; i23 < size2; i23++) {
                    C5130e c5130e3 = (C5130e) arrayList6.get(i23);
                    if (c5130e3 instanceof C5126a) {
                        C5126a c5126a = (C5126a) c5130e3;
                        if (c5126a.U() == 0 && c5126a.T()) {
                            AbstractC5169h.c(1, c5126a, fVar, z18);
                        }
                    }
                }
            }
            if (i17 == 1) {
                K(0, k());
            } else {
                c5129d3.l(0);
                this.f41281Z = 0;
            }
            int i24 = 0;
            boolean z21 = false;
            boolean z22 = false;
            while (i24 < size2) {
                C5130e c5130e4 = (C5130e) arrayList6.get(i24);
                int i25 = i24;
                if (c5130e4 instanceof i) {
                    i iVar3 = (i) c5130e4;
                    if (iVar3.f41399u0 == 0) {
                        int i26 = iVar3.f41396r0;
                        if (i26 != -1) {
                            iVar3.R(i26);
                        } else if (iVar3.f41397s0 != -1 && B()) {
                            iVar3.R(k() - iVar3.f41397s0);
                        } else if (B()) {
                            iVar3.R((int) ((iVar3.f41395q0 * k()) + 0.5f));
                        }
                        z21 = true;
                    }
                } else if ((c5130e4 instanceof C5126a) && ((C5126a) c5130e4).U() == 1) {
                    z22 = true;
                }
                i24 = i25 + 1;
            }
            if (z21) {
                for (int i27 = 0; i27 < size2; i27++) {
                    C5130e c5130e5 = (C5130e) arrayList6.get(i27);
                    if (c5130e5 instanceof i) {
                        i iVar4 = (i) c5130e5;
                        if (iVar4.f41399u0 == 0) {
                            AbstractC5169h.i(1, iVar4, fVar);
                        }
                    }
                }
            }
            AbstractC5169h.i(0, this, fVar);
            if (z22) {
                for (int i28 = 0; i28 < size2; i28++) {
                    C5130e c5130e6 = (C5130e) arrayList6.get(i28);
                    if (c5130e6 instanceof C5126a) {
                        C5126a c5126a2 = (C5126a) c5130e6;
                        if (c5126a2.U() == 1 && c5126a2.T()) {
                            AbstractC5169h.i(1, c5126a2, fVar);
                        }
                    }
                }
            }
            for (int i29 = 0; i29 < size2; i29++) {
                C5130e c5130e7 = (C5130e) arrayList6.get(i29);
                if (c5130e7.z() && AbstractC5169h.a(c5130e7)) {
                    V(c5130e7, fVar, AbstractC5169h.f41784a);
                    if (!(c5130e7 instanceof i)) {
                        AbstractC5169h.c(0, c5130e7, fVar, z18);
                        AbstractC5169h.i(0, c5130e7, fVar);
                    } else if (((i) c5130e7).f41399u0 == 0) {
                        AbstractC5169h.i(0, c5130e7, fVar);
                    } else {
                        AbstractC5169h.c(0, c5130e7, fVar, z18);
                    }
                }
            }
            for (int i30 = 0; i30 < size; i30++) {
                C5130e c5130e8 = (C5130e) this.f41333q0.get(i30);
                if (c5130e8.z() && !(c5130e8 instanceof i) && !(c5130e8 instanceof C5126a) && !(c5130e8 instanceof h) && !c5130e8.f41263F) {
                    int j6 = c5130e8.j(0);
                    int j9 = c5130e8.j(1);
                    if (j6 != 3 || c5130e8.f41313r == 1 || j9 != 3 || c5130e8.f41314s == 1) {
                        V(c5130e8, this.f41337u0, new C5163b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        C5048c c5048c2 = this.f41339w0;
        if (size > 2 && ((i14 == 2 || i13 == 2) && k.c(this.f41324D0, 1024))) {
            z.f fVar2 = this.f41337u0;
            ArrayList arrayList7 = this.f41333q0;
            int size3 = arrayList7.size();
            int i31 = 0;
            while (true) {
                if (i31 < size3) {
                    C5130e c5130e9 = (C5130e) arrayList7.get(i31);
                    char c11 = objArr[0];
                    char c12 = objArr[1];
                    int i32 = i31;
                    int[] iArr3 = c5130e9.f41311p0;
                    c5129d = c5129d4;
                    if (!AbstractC5169h.h(c11, c12, iArr3[0], iArr3[1]) || (c5130e9 instanceof h)) {
                        break;
                    }
                    i31 = i32 + 1;
                    c5129d4 = c5129d;
                } else {
                    c5129d = c5129d4;
                    int i33 = 0;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    ArrayList arrayList13 = null;
                    while (i33 < size3) {
                        int i34 = i33;
                        C5130e c5130e10 = (C5130e) arrayList7.get(i33);
                        ArrayList arrayList14 = arrayList8;
                        char c13 = objArr[0];
                        ArrayList arrayList15 = arrayList9;
                        char c14 = objArr[1];
                        ArrayList arrayList16 = arrayList10;
                        int[] iArr4 = c5130e10.f41311p0;
                        ArrayList arrayList17 = arrayList11;
                        if (!AbstractC5169h.h(c13, c14, iArr4[0], iArr4[1])) {
                            V(c5130e10, fVar2, this.f41332L0);
                        }
                        boolean z23 = c5130e10 instanceof i;
                        if (z23) {
                            i iVar5 = (i) c5130e10;
                            if (iVar5.f41399u0 == 0) {
                                arrayList2 = arrayList16 == null ? new ArrayList() : arrayList16;
                                arrayList2.add(iVar5);
                            } else {
                                arrayList2 = arrayList16;
                            }
                            z16 = z23;
                            if (iVar5.f41399u0 == 1) {
                                arrayList = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList.add(iVar5);
                            } else {
                                arrayList = arrayList14;
                            }
                        } else {
                            z16 = z23;
                            arrayList = arrayList14;
                            arrayList2 = arrayList16;
                        }
                        if (!(c5130e10 instanceof j)) {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList9 = arrayList15;
                        } else if (c5130e10 instanceof C5126a) {
                            C5126a c5126a3 = (C5126a) c5130e10;
                            if (c5126a3.U() == 0) {
                                arrayList5 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList5.add(c5126a3);
                            } else {
                                arrayList5 = arrayList15;
                            }
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            if (c5126a3.U() == 1) {
                                ArrayList arrayList18 = arrayList17 == null ? new ArrayList() : arrayList17;
                                arrayList18.add(c5126a3);
                                arrayList17 = arrayList18;
                            }
                            arrayList9 = arrayList5;
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            j jVar = (j) c5130e10;
                            arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                            arrayList9.add(jVar);
                            arrayList11 = arrayList17 == null ? new ArrayList() : arrayList17;
                            arrayList11.add(jVar);
                            if (c5130e10.f41266I.f41255f == null && c5130e10.f41267K.f41255f == null && !z16 && !(c5130e10 instanceof C5126a)) {
                                if (arrayList12 == null) {
                                    arrayList12 = new ArrayList();
                                }
                                ArrayList arrayList19 = arrayList12;
                                arrayList19.add(c5130e10);
                                arrayList12 = arrayList19;
                            }
                            if (c5130e10.J.f41255f == null && c5130e10.f41268L.f41255f == null && c5130e10.f41269M.f41255f == null && !z16 && !(c5130e10 instanceof C5126a)) {
                                if (arrayList13 == null) {
                                    arrayList13 = new ArrayList();
                                }
                                ArrayList arrayList20 = arrayList13;
                                arrayList20.add(c5130e10);
                                arrayList13 = arrayList20;
                            }
                            i33 = i34 + 1;
                            arrayList8 = arrayList3;
                            arrayList10 = arrayList4;
                        }
                        arrayList11 = arrayList17;
                        if (c5130e10.f41266I.f41255f == null) {
                            if (arrayList12 == null) {
                            }
                            ArrayList arrayList192 = arrayList12;
                            arrayList192.add(c5130e10);
                            arrayList12 = arrayList192;
                        }
                        if (c5130e10.J.f41255f == null) {
                            if (arrayList13 == null) {
                            }
                            ArrayList arrayList202 = arrayList13;
                            arrayList202.add(c5130e10);
                            arrayList13 = arrayList202;
                        }
                        i33 = i34 + 1;
                        arrayList8 = arrayList3;
                        arrayList10 = arrayList4;
                    }
                    ArrayList arrayList21 = arrayList8;
                    ArrayList arrayList22 = arrayList9;
                    ArrayList arrayList23 = arrayList10;
                    ArrayList arrayList24 = arrayList11;
                    ArrayList arrayList25 = new ArrayList();
                    if (arrayList21 != null) {
                        Iterator it = arrayList21.iterator();
                        while (it.hasNext()) {
                            AbstractC5169h.b((i) it.next(), 0, arrayList25, null);
                        }
                    }
                    int i35 = 0;
                    C5176o c5176o5 = null;
                    if (arrayList22 != null) {
                        Iterator it2 = arrayList22.iterator();
                        while (it2.hasNext()) {
                            j jVar2 = (j) it2.next();
                            C5176o b11 = AbstractC5169h.b(jVar2, i35, arrayList25, c5176o5);
                            jVar2.R(i35, arrayList25, b11);
                            b11.a(arrayList25);
                            i35 = 0;
                            c5176o5 = null;
                        }
                    }
                    HashSet hashSet = i(2).f41250a;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            AbstractC5169h.b(((C5129d) it3.next()).f41253d, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet2 = i(4).f41250a;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            AbstractC5169h.b(((C5129d) it4.next()).f41253d, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet3 = i(7).f41250a;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            AbstractC5169h.b(((C5129d) it5.next()).f41253d, 0, arrayList25, null);
                        }
                    }
                    C5176o c5176o6 = null;
                    if (arrayList12 != null) {
                        Iterator it6 = arrayList12.iterator();
                        while (it6.hasNext()) {
                            AbstractC5169h.b((C5130e) it6.next(), 0, arrayList25, null);
                        }
                    }
                    if (arrayList23 != null) {
                        Iterator it7 = arrayList23.iterator();
                        while (it7.hasNext()) {
                            AbstractC5169h.b((i) it7.next(), 1, arrayList25, null);
                        }
                    }
                    int i36 = 1;
                    if (arrayList24 != null) {
                        Iterator it8 = arrayList24.iterator();
                        while (it8.hasNext()) {
                            j jVar3 = (j) it8.next();
                            C5176o b12 = AbstractC5169h.b(jVar3, i36, arrayList25, c5176o6);
                            jVar3.R(i36, arrayList25, b12);
                            b12.a(arrayList25);
                            i36 = 1;
                            c5176o6 = null;
                        }
                    }
                    HashSet hashSet4 = i(3).f41250a;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            AbstractC5169h.b(((C5129d) it9.next()).f41253d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet5 = i(6).f41250a;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            AbstractC5169h.b(((C5129d) it10.next()).f41253d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet6 = i(5).f41250a;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            AbstractC5169h.b(((C5129d) it11.next()).f41253d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet7 = i(7).f41250a;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            AbstractC5169h.b(((C5129d) it12.next()).f41253d, 1, arrayList25, null);
                        }
                    }
                    if (arrayList13 != null) {
                        Iterator it13 = arrayList13.iterator();
                        while (it13.hasNext()) {
                            AbstractC5169h.b((C5130e) it13.next(), 1, arrayList25, null);
                        }
                    }
                    int i37 = 0;
                    while (i37 < size3) {
                        C5130e c5130e11 = (C5130e) arrayList7.get(i37);
                        int[] iArr5 = c5130e11.f41311p0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i38 = c5130e11.f41307n0;
                            int size4 = arrayList25.size();
                            int i39 = 0;
                            while (true) {
                                if (i39 >= size4) {
                                    i11 = i37;
                                    c5176o3 = null;
                                    break;
                                }
                                i11 = i37;
                                c5176o3 = (C5176o) arrayList25.get(i39);
                                int i40 = size4;
                                if (i38 == c5176o3.f41792b) {
                                    break;
                                }
                                i39++;
                                size4 = i40;
                                i37 = i11;
                            }
                            int i41 = c5130e11.f41309o0;
                            int size5 = arrayList25.size();
                            int i42 = 0;
                            while (true) {
                                if (i42 >= size5) {
                                    c5176o4 = null;
                                    break;
                                }
                                c5176o4 = (C5176o) arrayList25.get(i42);
                                int i43 = size5;
                                if (i41 == c5176o4.f41792b) {
                                    break;
                                }
                                i42++;
                                size5 = i43;
                            }
                            if (c5176o3 != null && c5176o4 != null) {
                                c5176o3.c(0, c5176o4);
                                c5176o4.f41793c = 2;
                                arrayList25.remove(c5176o3);
                            }
                        } else {
                            i11 = i37;
                        }
                        i37 = i11 + 1;
                    }
                    if (arrayList25.size() > 1) {
                        if (objArr[0] == 2) {
                            Iterator it14 = arrayList25.iterator();
                            int i44 = 0;
                            c5176o = null;
                            while (it14.hasNext()) {
                                C5176o c5176o7 = (C5176o) it14.next();
                                if (c5176o7.f41793c != 1 && (b10 = c5176o7.b(c5048c2, 0)) > i44) {
                                    c5176o = c5176o7;
                                    i44 = b10;
                                }
                            }
                            c10 = 1;
                            if (c5176o != null) {
                                M(1);
                                O(i44);
                                if (objArr[c10] == 2) {
                                    Iterator it15 = arrayList25.iterator();
                                    int i45 = 0;
                                    c5176o2 = null;
                                    while (it15.hasNext()) {
                                        C5176o c5176o8 = (C5176o) it15.next();
                                        if (c5176o8.f41793c != 0 && (b9 = c5176o8.b(c5048c2, 1)) > i45) {
                                            c5176o2 = c5176o8;
                                            i45 = b9;
                                        }
                                    }
                                    if (c5176o2 != null) {
                                        N(1);
                                        L(i45);
                                        if (c5176o == null || c5176o2 != null) {
                                            if (i14 == 2) {
                                                if (max5 >= q() || max5 <= 0) {
                                                    max5 = q();
                                                } else {
                                                    O(max5);
                                                    this.f41325E0 = true;
                                                }
                                            }
                                            if (i13 == 2) {
                                                if (max6 >= k() || max6 <= 0) {
                                                    max6 = k();
                                                } else {
                                                    L(max6);
                                                    this.f41326F0 = true;
                                                }
                                            }
                                            i = max6;
                                            i4 = max5;
                                            z6 = true;
                                        }
                                    }
                                }
                                c5176o2 = null;
                                if (c5176o == null) {
                                }
                                if (i14 == 2) {
                                }
                                if (i13 == 2) {
                                }
                                i = max6;
                                i4 = max5;
                                z6 = true;
                            }
                        } else {
                            c10 = 1;
                        }
                        c5176o = null;
                        if (objArr[c10] == 2) {
                        }
                        c5176o2 = null;
                        if (c5176o == null) {
                        }
                        if (i14 == 2) {
                        }
                        if (i13 == 2) {
                        }
                        i = max6;
                        i4 = max5;
                        z6 = true;
                    }
                }
            }
            boolean z24 = !W(64) || W(128);
            c5048c2.getClass();
            c5048c2.f40925h = false;
            if (this.f41324D0 == 0 && z24) {
                c9 = 1;
                c5048c2.f40925h = true;
            } else {
                c9 = 1;
            }
            ArrayList arrayList26 = this.f41333q0;
            boolean z25 = objArr[0] != 2 || objArr[c9] == 2;
            this.f41342z0 = 0;
            this.f41322A0 = 0;
            for (i6 = 0; i6 < size; i6++) {
                C5130e c5130e12 = (C5130e) this.f41333q0.get(i6);
                if (c5130e12 instanceof f) {
                    ((f) c5130e12).U();
                }
            }
            boolean W3 = W(64);
            z9 = z6;
            int i46 = 0;
            z10 = true;
            while (z10) {
                int i47 = i46 + 1;
                try {
                    c5048c2.t();
                    this.f41342z0 = 0;
                    this.f41322A0 = 0;
                    g(c5048c2);
                    for (int i48 = 0; i48 < size; i48++) {
                        ((C5130e) this.f41333q0.get(i48)).g(c5048c2);
                    }
                    S(c5048c2);
                    try {
                        WeakReference weakReference = this.f41327G0;
                        if (weakReference == null || weakReference.get() == null) {
                            c5129d2 = c5129d3;
                            z11 = z25;
                        } else {
                            C5129d c5129d5 = (C5129d) this.f41327G0.get();
                            C5051f k9 = c5048c2.k(c5129d3);
                            C5048c c5048c3 = this.f41339w0;
                            c5129d2 = c5129d3;
                            z11 = z25;
                            try {
                                c5048c3.f(c5048c3.k(c5129d5), k9, 0, 5);
                                this.f41327G0 = null;
                            } catch (Exception e9) {
                                e = e9;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2 = k.f41403a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f41285b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41287c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i9 = 8;
                                if (i47 > i9) {
                                }
                                i46 = i47;
                                c5129d3 = c5129d2;
                                z25 = z11;
                            }
                        }
                        WeakReference weakReference2 = this.f41329I0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            C5129d c5129d6 = (C5129d) this.f41329I0.get();
                            C5051f k10 = c5048c2.k(this.f41268L);
                            C5048c c5048c4 = this.f41339w0;
                            c5048c4.f(k10, c5048c4.k(c5129d6), 0, 5);
                            this.f41329I0 = null;
                        }
                        WeakReference weakReference3 = this.f41328H0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            C5129d c5129d7 = (C5129d) this.f41328H0.get();
                            C5129d c5129d8 = c5129d;
                            try {
                                C5051f k11 = c5048c2.k(c5129d8);
                                C5048c c5048c5 = this.f41339w0;
                                c5129d = c5129d8;
                                c5048c5.f(c5048c5.k(c5129d7), k11, 0, 5);
                                this.f41328H0 = null;
                            } catch (Exception e10) {
                                e = e10;
                                c5129d = c5129d8;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22 = k.f41403a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f41285b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41287c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i9 = 8;
                                if (i47 > i9) {
                                }
                                i46 = i47;
                                c5129d3 = c5129d2;
                                z25 = z11;
                            }
                        }
                        WeakReference weakReference4 = this.f41330J0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            C5129d c5129d9 = (C5129d) this.f41330J0.get();
                            C5051f k12 = c5048c2.k(this.f41267K);
                            try {
                                c5048c = this.f41339w0;
                            } catch (Exception e11) {
                                e = e11;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr222 = k.f41403a;
                                if (z10) {
                                }
                                if (z11) {
                                    int i49 = 0;
                                    int i50 = 0;
                                    while (i10 < size) {
                                    }
                                    max3 = Math.max(this.f41285b0, i49);
                                    max4 = Math.max(this.f41287c0, i50);
                                    if (i14 == 2) {
                                        O(max3);
                                        objArr[0] = 2;
                                        z9 = true;
                                        z12 = true;
                                    }
                                    if (i13 == 2) {
                                        L(max4);
                                        objArr[1] = 2;
                                        z9 = true;
                                        z12 = true;
                                    }
                                }
                                max = Math.max(this.f41285b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41287c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i9 = 8;
                                if (i47 > i9) {
                                }
                                i46 = i47;
                                c5129d3 = c5129d2;
                                z25 = z11;
                            }
                            try {
                                c5048c.f(k12, c5048c.k(c5129d9), 0, 5);
                            } catch (Exception e12) {
                                e = e12;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2222 = k.f41403a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f41285b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41287c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i9 = 8;
                                if (i47 > i9) {
                                }
                                i46 = i47;
                                c5129d3 = c5129d2;
                                z25 = z11;
                            }
                            try {
                                this.f41330J0 = null;
                            } catch (Exception e13) {
                                e = e13;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22222 = k.f41403a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f41285b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41287c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i9 = 8;
                                if (i47 > i9) {
                                }
                                i46 = i47;
                                c5129d3 = c5129d2;
                                z25 = z11;
                            }
                        }
                        c5048c2.p();
                        z10 = true;
                    } catch (Exception e14) {
                        e = e14;
                        c5129d2 = c5129d3;
                        z11 = z25;
                    }
                } catch (Exception e15) {
                    e = e15;
                    c5129d2 = c5129d3;
                    z11 = z25;
                }
                boolean[] zArr222222 = k.f41403a;
                if (z10) {
                    zArr = zArr222222;
                    Q(c5048c2, W3);
                    for (int i51 = 0; i51 < size; i51++) {
                        ((C5130e) this.f41333q0.get(i51)).Q(c5048c2, W3);
                    }
                    z12 = false;
                } else {
                    zArr222222[2] = false;
                    boolean W8 = W(64);
                    Q(c5048c2, W8);
                    int size6 = this.f41333q0.size();
                    int i52 = 0;
                    z12 = false;
                    while (i52 < size6) {
                        C5130e c5130e13 = (C5130e) this.f41333q0.get(i52);
                        c5130e13.Q(c5048c2, W8);
                        boolean[] zArr3 = zArr222222;
                        boolean z26 = W8;
                        if (c5130e13.f41296h != -1 || c5130e13.i != -1) {
                            z12 = true;
                        }
                        i52++;
                        zArr222222 = zArr3;
                        W8 = z26;
                    }
                    zArr = zArr222222;
                }
                if (z11 && i47 < 8 && zArr[2]) {
                    int i492 = 0;
                    int i502 = 0;
                    for (i10 = 0; i10 < size; i10++) {
                        C5130e c5130e14 = (C5130e) this.f41333q0.get(i10);
                        i492 = Math.max(i492, c5130e14.q() + c5130e14.Y);
                        i502 = Math.max(i502, c5130e14.k() + c5130e14.f41281Z);
                    }
                    max3 = Math.max(this.f41285b0, i492);
                    max4 = Math.max(this.f41287c0, i502);
                    if (i14 == 2 && q() < max3) {
                        O(max3);
                        objArr[0] = 2;
                        z9 = true;
                        z12 = true;
                    }
                    if (i13 == 2 && k() < max4) {
                        L(max4);
                        objArr[1] = 2;
                        z9 = true;
                        z12 = true;
                    }
                }
                max = Math.max(this.f41285b0, q());
                if (max <= q()) {
                    O(max);
                    r14 = 1;
                    objArr[0] = 1;
                    z12 = true;
                    z13 = true;
                } else {
                    r14 = 1;
                    z13 = z9;
                }
                max2 = Math.max(this.f41287c0, k());
                if (max2 <= k()) {
                    L(max2);
                    objArr[r14] = r14;
                    z14 = r14;
                    z12 = z14;
                } else {
                    z14 = z13;
                }
                if (!z14) {
                    if (objArr[0] == 2 && i4 > 0 && q() > i4) {
                        this.f41325E0 = r14;
                        objArr[0] = r14;
                        O(i4);
                        z14 = r14;
                        z12 = z14;
                    }
                    if (objArr[r14] == 2 && i > 0 && k() > i) {
                        this.f41326F0 = r14;
                        objArr[r14] = r14;
                        L(i);
                        i9 = 8;
                        z15 = true;
                        z9 = true;
                        z10 = i47 > i9 ? false : z15;
                        i46 = i47;
                        c5129d3 = c5129d2;
                        z25 = z11;
                    }
                }
                z9 = z14;
                z15 = z12;
                i9 = 8;
                if (i47 > i9) {
                }
                i46 = i47;
                c5129d3 = c5129d2;
                z25 = z11;
            }
            this.f41333q0 = arrayList26;
            if (z9) {
                objArr[0] = i14;
                objArr[1] = i13;
            }
            F(c5048c2.f40929m);
        }
        c5129d = c5129d4;
        i = max6;
        i4 = max5;
        z6 = false;
        if (W(64)) {
        }
        c5048c2.getClass();
        c5048c2.f40925h = false;
        if (this.f41324D0 == 0) {
        }
        c9 = 1;
        ArrayList arrayList262 = this.f41333q0;
        if (objArr[0] != 2) {
        }
        this.f41342z0 = 0;
        this.f41322A0 = 0;
        while (i6 < size) {
        }
        boolean W32 = W(64);
        z9 = z6;
        int i462 = 0;
        z10 = true;
        while (z10) {
        }
        this.f41333q0 = arrayList262;
        if (z9) {
        }
        F(c5048c2.f40929m);
    }

    public final boolean W(int i) {
        return (this.f41324D0 & i) == i;
    }

    @Override // w.C5130e
    public final void n(StringBuilder sb) {
        sb.append(this.f41299j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f41277U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f41278V);
        sb.append("\n");
        Iterator it = this.f41333q0.iterator();
        while (it.hasNext()) {
            ((C5130e) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
