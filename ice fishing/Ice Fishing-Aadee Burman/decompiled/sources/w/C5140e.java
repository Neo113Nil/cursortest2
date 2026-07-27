package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import u.C5047c;
import u.C5050f;
import x.AbstractC5170h;
import x.AbstractC5178p;
import x.C5164b;
import x.C5165c;
import x.C5167e;
import x.C5177o;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5140e extends C5139d {

    /* renamed from: A0, reason: collision with root package name */
    public int f41540A0;

    /* renamed from: B0, reason: collision with root package name */
    public C5137b[] f41541B0;
    public C5137b[] C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f41542D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f41543E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f41544F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f41545G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f41546H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f41547I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f41548J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f41549K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C5164b f41550L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f41551q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final j4.g f41552r0 = new j4.g(this);

    /* renamed from: s0, reason: collision with root package name */
    public final C5167e f41553s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f41554t0;

    /* renamed from: u0, reason: collision with root package name */
    public z.f f41555u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41556v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C5047c f41557w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f41558x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f41559y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f41560z0;

    public C5140e() {
        C5167e c5167e = new C5167e();
        c5167e.f41707b = true;
        c5167e.f41708c = true;
        c5167e.f41710e = new ArrayList();
        new ArrayList();
        c5167e.f41711f = null;
        c5167e.f41712g = new C5164b();
        c5167e.f41713h = new ArrayList();
        c5167e.f41706a = this;
        c5167e.f41709d = this;
        this.f41553s0 = c5167e;
        this.f41555u0 = null;
        this.f41556v0 = false;
        this.f41557w0 = new C5047c();
        this.f41560z0 = 0;
        this.f41540A0 = 0;
        this.f41541B0 = new C5137b[4];
        this.C0 = new C5137b[4];
        this.f41542D0 = 257;
        this.f41543E0 = false;
        this.f41544F0 = false;
        this.f41545G0 = null;
        this.f41546H0 = null;
        this.f41547I0 = null;
        this.f41548J0 = null;
        this.f41549K0 = new HashSet();
        this.f41550L0 = new C5164b();
    }

    public static void V(C5139d c5139d, z.f fVar, C5164b c5164b) {
        int i;
        int i6;
        if (fVar == null) {
            return;
        }
        if (c5139d.f41513g0 == 8 || (c5139d instanceof h) || (c5139d instanceof C5136a)) {
            c5164b.f41699e = 0;
            c5164b.f41700f = 0;
            return;
        }
        int[] iArr = c5139d.f41529p0;
        c5164b.f41695a = iArr[0];
        c5164b.f41696b = iArr[1];
        c5164b.f41697c = c5139d.q();
        c5164b.f41698d = c5139d.k();
        c5164b.i = false;
        c5164b.f41703j = 0;
        boolean z3 = c5164b.f41695a == 3;
        boolean z6 = c5164b.f41696b == 3;
        boolean z9 = z3 && c5139d.f41497W > 0.0f;
        boolean z10 = z6 && c5139d.f41497W > 0.0f;
        if (z3 && c5139d.t(0) && c5139d.f41531r == 0 && !z9) {
            c5164b.f41695a = 2;
            if (z6 && c5139d.f41532s == 0) {
                c5164b.f41695a = 1;
            }
            z3 = false;
        }
        if (z6 && c5139d.t(1) && c5139d.f41532s == 0 && !z10) {
            c5164b.f41696b = 2;
            if (z3 && c5139d.f41531r == 0) {
                c5164b.f41696b = 1;
            }
            z6 = false;
        }
        if (c5139d.A()) {
            c5164b.f41695a = 1;
            z3 = false;
        }
        if (c5139d.B()) {
            c5164b.f41696b = 1;
            z6 = false;
        }
        int[] iArr2 = c5139d.f41533t;
        if (z9) {
            if (iArr2[0] == 4) {
                c5164b.f41695a = 1;
            } else if (!z6) {
                if (c5164b.f41696b == 1) {
                    i6 = c5164b.f41698d;
                } else {
                    c5164b.f41695a = 2;
                    fVar.b(c5139d, c5164b);
                    i6 = c5164b.f41700f;
                }
                c5164b.f41695a = 1;
                c5164b.f41697c = (int) (c5139d.f41497W * i6);
            }
        }
        if (z10) {
            if (iArr2[1] == 4) {
                c5164b.f41696b = 1;
            } else if (!z3) {
                if (c5164b.f41695a == 1) {
                    i = c5164b.f41697c;
                } else {
                    c5164b.f41696b = 2;
                    fVar.b(c5139d, c5164b);
                    i = c5164b.f41699e;
                }
                c5164b.f41696b = 1;
                if (c5139d.f41498X == -1) {
                    c5164b.f41698d = (int) (i / c5139d.f41497W);
                } else {
                    c5164b.f41698d = (int) (c5139d.f41497W * i);
                }
            }
        }
        fVar.b(c5139d, c5164b);
        c5139d.O(c5164b.f41699e);
        c5139d.L(c5164b.f41700f);
        c5139d.f41480E = c5164b.f41702h;
        c5139d.I(c5164b.f41701g);
        c5164b.f41703j = 0;
    }

    @Override // w.C5139d
    public final void C() {
        this.f41557w0.t();
        this.f41558x0 = 0;
        this.f41559y0 = 0;
        this.f41551q0.clear();
        super.C();
    }

    @Override // w.C5139d
    public final void F(j4.g gVar) {
        super.F(gVar);
        int size = this.f41551q0.size();
        for (int i = 0; i < size; i++) {
            ((C5139d) this.f41551q0.get(i)).F(gVar);
        }
    }

    @Override // w.C5139d
    public final void P(boolean z3, boolean z6) {
        super.P(z3, z6);
        int size = this.f41551q0.size();
        for (int i = 0; i < size; i++) {
            ((C5139d) this.f41551q0.get(i)).P(z3, z6);
        }
    }

    public final void R(C5139d c5139d, int i) {
        if (i == 0) {
            int i6 = this.f41560z0 + 1;
            C5137b[] c5137bArr = this.C0;
            if (i6 >= c5137bArr.length) {
                this.C0 = (C5137b[]) Arrays.copyOf(c5137bArr, c5137bArr.length * 2);
            }
            C5137b[] c5137bArr2 = this.C0;
            int i9 = this.f41560z0;
            c5137bArr2[i9] = new C5137b(c5139d, 0, this.f41556v0);
            this.f41560z0 = i9 + 1;
            return;
        }
        if (i == 1) {
            int i10 = this.f41540A0 + 1;
            C5137b[] c5137bArr3 = this.f41541B0;
            if (i10 >= c5137bArr3.length) {
                this.f41541B0 = (C5137b[]) Arrays.copyOf(c5137bArr3, c5137bArr3.length * 2);
            }
            C5137b[] c5137bArr4 = this.f41541B0;
            int i11 = this.f41540A0;
            c5137bArr4[i11] = new C5137b(c5139d, 1, this.f41556v0);
            this.f41540A0 = i11 + 1;
        }
    }

    public final void S(C5047c c5047c) {
        C5140e c5140e;
        C5047c c5047c2;
        boolean W8 = W(64);
        b(c5047c, W8);
        int size = this.f41551q0.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            C5139d c5139d = (C5139d) this.f41551q0.get(i);
            boolean[] zArr = c5139d.f41493S;
            zArr[0] = false;
            zArr[1] = false;
            if (c5139d instanceof C5136a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C5139d c5139d2 = (C5139d) this.f41551q0.get(i6);
                if (c5139d2 instanceof C5136a) {
                    C5136a c5136a = (C5136a) c5139d2;
                    for (int i9 = 0; i9 < c5136a.f41620r0; i9++) {
                        C5139d c5139d3 = c5136a.f41619q0[i9];
                        if (c5136a.f41449t0 || c5139d3.c()) {
                            int i10 = c5136a.f41448s0;
                            if (i10 == 0 || i10 == 1) {
                                c5139d3.f41493S[0] = true;
                            } else if (i10 == 2 || i10 == 3) {
                                c5139d3.f41493S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f41549K0;
        hashSet.clear();
        for (int i11 = 0; i11 < size; i11++) {
            C5139d c5139d4 = (C5139d) this.f41551q0.get(i11);
            c5139d4.getClass();
            boolean z6 = c5139d4 instanceof g;
            if (z6 || (c5139d4 instanceof h)) {
                if (z6) {
                    hashSet.add(c5139d4);
                } else {
                    c5139d4.b(c5047c, W8);
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
                g gVar = (g) ((C5139d) it.next());
                for (int i12 = 0; i12 < gVar.f41620r0; i12++) {
                    if (hashSet.contains(gVar.f41619q0[i12])) {
                        gVar.b(c5047c, W8);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C5139d) it2.next()).b(c5047c, W8);
                }
                hashSet.clear();
            }
        }
        if (C5047c.f40952q) {
            HashSet hashSet2 = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                C5139d c5139d5 = (C5139d) this.f41551q0.get(i13);
                c5139d5.getClass();
                if (!(c5139d5 instanceof g) && !(c5139d5 instanceof h)) {
                    hashSet2.add(c5139d5);
                }
            }
            c5140e = this;
            c5047c2 = c5047c;
            c5140e.a(this, c5047c2, hashSet2, this.f41529p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C5139d c5139d6 = (C5139d) it3.next();
                j.b(this, c5047c2, c5139d6);
                c5139d6.b(c5047c2, W8);
            }
        } else {
            c5140e = this;
            c5047c2 = c5047c;
            for (int i14 = 0; i14 < size; i14++) {
                C5139d c5139d7 = (C5139d) c5140e.f41551q0.get(i14);
                if (c5139d7 instanceof C5140e) {
                    int[] iArr = c5139d7.f41529p0;
                    int i15 = iArr[0];
                    int i16 = iArr[1];
                    if (i15 == 2) {
                        c5139d7.M(1);
                    }
                    if (i16 == 2) {
                        c5139d7.N(1);
                    }
                    c5139d7.b(c5047c2, W8);
                    if (i15 == 2) {
                        c5139d7.M(i15);
                    }
                    if (i16 == 2) {
                        c5139d7.N(i16);
                    }
                } else {
                    j.b(this, c5047c2, c5139d7);
                    if (!(c5139d7 instanceof g) && !(c5139d7 instanceof h)) {
                        c5139d7.b(c5047c2, W8);
                    }
                }
            }
        }
        if (c5140e.f41560z0 > 0) {
            j.a(this, c5047c2, null, 0);
        }
        if (c5140e.f41540A0 > 0) {
            j.a(this, c5047c2, null, 1);
        }
    }

    public final boolean T(int i, boolean z3) {
        boolean z6;
        C5167e c5167e = this.f41553s0;
        C5140e c5140e = c5167e.f41706a;
        boolean z9 = false;
        int j6 = c5140e.j(0);
        int j9 = c5140e.j(1);
        int r9 = c5140e.r();
        int s9 = c5140e.s();
        ArrayList arrayList = c5167e.f41710e;
        if (z3 && (j6 == 2 || j9 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC5178p abstractC5178p = (AbstractC5178p) it.next();
                if (abstractC5178p.f41743f == i && !abstractC5178p.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && j6 == 2) {
                    c5140e.M(1);
                    c5140e.O(c5167e.d(c5140e, 0));
                    c5140e.f41506d.f41742e.d(c5140e.q());
                }
            } else if (z3 && j9 == 2) {
                c5140e.N(1);
                c5140e.L(c5167e.d(c5140e, 1));
                c5140e.f41508e.f41742e.d(c5140e.k());
            }
        }
        int[] iArr = c5140e.f41529p0;
        if (i == 0) {
            int i6 = iArr[0];
            if (i6 == 1 || i6 == 4) {
                int q8 = c5140e.q() + r9;
                c5140e.f41506d.i.d(q8);
                c5140e.f41506d.f41742e.d(q8 - r9);
                z6 = true;
            }
            z6 = false;
        } else {
            int i9 = iArr[1];
            if (i9 == 1 || i9 == 4) {
                int k9 = c5140e.k() + s9;
                c5140e.f41508e.i.d(k9);
                c5140e.f41508e.f41742e.d(k9 - s9);
                z6 = true;
            }
            z6 = false;
        }
        c5167e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC5178p abstractC5178p2 = (AbstractC5178p) it2.next();
            if (abstractC5178p2.f41743f == i && (abstractC5178p2.f41739b != c5140e || abstractC5178p2.f41744g)) {
                abstractC5178p2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z9 = true;
                break;
            }
            AbstractC5178p abstractC5178p3 = (AbstractC5178p) it3.next();
            if (abstractC5178p3.f41743f == i && (z6 || abstractC5178p3.f41739b != c5140e)) {
                if (!abstractC5178p3.f41745h.f41722j) {
                    break;
                }
                if (!abstractC5178p3.i.f41722j) {
                    break;
                }
                if (!(abstractC5178p3 instanceof C5165c) && !abstractC5178p3.f41742e.f41722j) {
                    break;
                }
            }
        }
        c5140e.M(j6);
        c5140e.N(j9);
        return z9;
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
        C5138c c5138c;
        int i;
        int i6;
        boolean z3;
        char c9;
        int i9;
        boolean z6;
        boolean z9;
        C5138c c5138c2;
        boolean z10;
        boolean[] zArr;
        boolean z11;
        int max;
        ?? r14;
        boolean z12;
        int max2;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int max3;
        int max4;
        C5047c c5047c;
        char c10;
        C5177o c5177o;
        C5177o c5177o2;
        int b9;
        int b10;
        int i12;
        C5177o c5177o3;
        C5177o c5177o4;
        boolean z15;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i13;
        boolean z16;
        this.Y = 0;
        this.f41499Z = 0;
        this.f41543E0 = false;
        this.f41544F0 = false;
        int size = this.f41551q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.f41529p0;
        int i14 = iArr[1];
        int i15 = iArr[0];
        int i16 = this.f41554t0;
        C5138c c5138c3 = this.J;
        C5138c c5138c4 = this.f41484I;
        if (i16 == 0 && j.c(this.f41542D0, 1)) {
            z.f fVar = this.f41555u0;
            int i17 = iArr[0];
            int i18 = iArr[1];
            E();
            ArrayList arrayList6 = this.f41551q0;
            int size2 = arrayList6.size();
            for (int i19 = 0; i19 < size2; i19++) {
                ((C5139d) arrayList6.get(i19)).E();
            }
            boolean z17 = this.f41556v0;
            if (i17 == 1) {
                J(0, q());
            } else {
                c5138c4.l(0);
                this.Y = 0;
            }
            int i20 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i20 < size2) {
                int[] iArr2 = iArr;
                C5139d c5139d = (C5139d) arrayList6.get(i20);
                int i21 = i20;
                if (c5139d instanceof h) {
                    h hVar = (h) c5139d;
                    z16 = z18;
                    if (hVar.f41617u0 == 1) {
                        int i22 = hVar.f41614r0;
                        if (i22 != -1) {
                            hVar.R(i22);
                        } else if (hVar.f41615s0 != -1 && A()) {
                            hVar.R(q() - hVar.f41615s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f41613q0 * q()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    z16 = z18;
                    if ((c5139d instanceof C5136a) && ((C5136a) c5139d).U() == 0) {
                        z18 = z16;
                        z19 = true;
                        i20 = i21 + 1;
                        iArr = iArr2;
                    }
                }
                z18 = z16;
                i20 = i21 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z18) {
                for (int i23 = 0; i23 < size2; i23 = i13 + 1) {
                    C5139d c5139d2 = (C5139d) arrayList6.get(i23);
                    if (c5139d2 instanceof h) {
                        h hVar2 = (h) c5139d2;
                        i13 = i23;
                        if (hVar2.f41617u0 == 1) {
                            AbstractC5170h.c(0, hVar2, fVar, z17);
                        }
                    } else {
                        i13 = i23;
                    }
                }
            }
            AbstractC5170h.c(0, this, fVar, z17);
            if (z19) {
                for (int i24 = 0; i24 < size2; i24++) {
                    C5139d c5139d3 = (C5139d) arrayList6.get(i24);
                    if (c5139d3 instanceof C5136a) {
                        C5136a c5136a = (C5136a) c5139d3;
                        if (c5136a.U() == 0 && c5136a.T()) {
                            AbstractC5170h.c(1, c5136a, fVar, z17);
                        }
                    }
                }
            }
            if (i18 == 1) {
                K(0, k());
            } else {
                c5138c3.l(0);
                this.f41499Z = 0;
            }
            int i25 = 0;
            boolean z20 = false;
            boolean z21 = false;
            while (i25 < size2) {
                C5139d c5139d4 = (C5139d) arrayList6.get(i25);
                int i26 = i25;
                if (c5139d4 instanceof h) {
                    h hVar3 = (h) c5139d4;
                    if (hVar3.f41617u0 == 0) {
                        int i27 = hVar3.f41614r0;
                        if (i27 != -1) {
                            hVar3.R(i27);
                        } else if (hVar3.f41615s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f41615s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f41613q0 * k()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else if ((c5139d4 instanceof C5136a) && ((C5136a) c5139d4).U() == 1) {
                    z21 = true;
                }
                i25 = i26 + 1;
            }
            if (z20) {
                for (int i28 = 0; i28 < size2; i28++) {
                    C5139d c5139d5 = (C5139d) arrayList6.get(i28);
                    if (c5139d5 instanceof h) {
                        h hVar4 = (h) c5139d5;
                        if (hVar4.f41617u0 == 0) {
                            AbstractC5170h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            AbstractC5170h.i(0, this, fVar);
            if (z21) {
                for (int i29 = 0; i29 < size2; i29++) {
                    C5139d c5139d6 = (C5139d) arrayList6.get(i29);
                    if (c5139d6 instanceof C5136a) {
                        C5136a c5136a2 = (C5136a) c5139d6;
                        if (c5136a2.U() == 1 && c5136a2.T()) {
                            AbstractC5170h.i(1, c5136a2, fVar);
                        }
                    }
                }
            }
            for (int i30 = 0; i30 < size2; i30++) {
                C5139d c5139d7 = (C5139d) arrayList6.get(i30);
                if (c5139d7.z() && AbstractC5170h.a(c5139d7)) {
                    V(c5139d7, fVar, AbstractC5170h.f41726a);
                    if (!(c5139d7 instanceof h)) {
                        AbstractC5170h.c(0, c5139d7, fVar, z17);
                        AbstractC5170h.i(0, c5139d7, fVar);
                    } else if (((h) c5139d7).f41617u0 == 0) {
                        AbstractC5170h.i(0, c5139d7, fVar);
                    } else {
                        AbstractC5170h.c(0, c5139d7, fVar, z17);
                    }
                }
            }
            for (int i31 = 0; i31 < size; i31++) {
                C5139d c5139d8 = (C5139d) this.f41551q0.get(i31);
                if (c5139d8.z() && !(c5139d8 instanceof h) && !(c5139d8 instanceof C5136a) && !(c5139d8 instanceof g) && !c5139d8.f41481F) {
                    int j6 = c5139d8.j(0);
                    int j9 = c5139d8.j(1);
                    if (j6 != 3 || c5139d8.f41531r == 1 || j9 != 3 || c5139d8.f41532s == 1) {
                        V(c5139d8, this.f41555u0, new C5164b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        C5047c c5047c2 = this.f41557w0;
        if (size > 2 && ((i15 == 2 || i14 == 2) && j.c(this.f41542D0, 1024))) {
            z.f fVar2 = this.f41555u0;
            ArrayList arrayList7 = this.f41551q0;
            int size3 = arrayList7.size();
            int i32 = 0;
            while (true) {
                if (i32 < size3) {
                    C5139d c5139d9 = (C5139d) arrayList7.get(i32);
                    char c11 = objArr[0];
                    char c12 = objArr[1];
                    int i33 = i32;
                    int[] iArr3 = c5139d9.f41529p0;
                    c5138c = c5138c4;
                    if (!AbstractC5170h.h(c11, c12, iArr3[0], iArr3[1]) || (c5139d9 instanceof g)) {
                        break;
                    }
                    i32 = i33 + 1;
                    c5138c4 = c5138c;
                } else {
                    c5138c = c5138c4;
                    int i34 = 0;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    ArrayList arrayList13 = null;
                    while (i34 < size3) {
                        int i35 = i34;
                        C5139d c5139d10 = (C5139d) arrayList7.get(i34);
                        ArrayList arrayList14 = arrayList8;
                        char c13 = objArr[0];
                        ArrayList arrayList15 = arrayList9;
                        char c14 = objArr[1];
                        ArrayList arrayList16 = arrayList10;
                        int[] iArr4 = c5139d10.f41529p0;
                        ArrayList arrayList17 = arrayList11;
                        if (!AbstractC5170h.h(c13, c14, iArr4[0], iArr4[1])) {
                            V(c5139d10, fVar2, this.f41550L0);
                        }
                        boolean z22 = c5139d10 instanceof h;
                        if (z22) {
                            h hVar5 = (h) c5139d10;
                            if (hVar5.f41617u0 == 0) {
                                arrayList2 = arrayList16 == null ? new ArrayList() : arrayList16;
                                arrayList2.add(hVar5);
                            } else {
                                arrayList2 = arrayList16;
                            }
                            z15 = z22;
                            if (hVar5.f41617u0 == 1) {
                                arrayList = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList.add(hVar5);
                            } else {
                                arrayList = arrayList14;
                            }
                        } else {
                            z15 = z22;
                            arrayList = arrayList14;
                            arrayList2 = arrayList16;
                        }
                        if (!(c5139d10 instanceof i)) {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList9 = arrayList15;
                        } else if (c5139d10 instanceof C5136a) {
                            C5136a c5136a3 = (C5136a) c5139d10;
                            if (c5136a3.U() == 0) {
                                arrayList5 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList5.add(c5136a3);
                            } else {
                                arrayList5 = arrayList15;
                            }
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            if (c5136a3.U() == 1) {
                                ArrayList arrayList18 = arrayList17 == null ? new ArrayList() : arrayList17;
                                arrayList18.add(c5136a3);
                                arrayList17 = arrayList18;
                            }
                            arrayList9 = arrayList5;
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            i iVar = (i) c5139d10;
                            arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                            arrayList9.add(iVar);
                            arrayList11 = arrayList17 == null ? new ArrayList() : arrayList17;
                            arrayList11.add(iVar);
                            if (c5139d10.f41484I.f41473f == null && c5139d10.f41485K.f41473f == null && !z15 && !(c5139d10 instanceof C5136a)) {
                                if (arrayList12 == null) {
                                    arrayList12 = new ArrayList();
                                }
                                ArrayList arrayList19 = arrayList12;
                                arrayList19.add(c5139d10);
                                arrayList12 = arrayList19;
                            }
                            if (c5139d10.J.f41473f == null && c5139d10.f41486L.f41473f == null && c5139d10.f41487M.f41473f == null && !z15 && !(c5139d10 instanceof C5136a)) {
                                if (arrayList13 == null) {
                                    arrayList13 = new ArrayList();
                                }
                                ArrayList arrayList20 = arrayList13;
                                arrayList20.add(c5139d10);
                                arrayList13 = arrayList20;
                            }
                            i34 = i35 + 1;
                            arrayList8 = arrayList3;
                            arrayList10 = arrayList4;
                        }
                        arrayList11 = arrayList17;
                        if (c5139d10.f41484I.f41473f == null) {
                            if (arrayList12 == null) {
                            }
                            ArrayList arrayList192 = arrayList12;
                            arrayList192.add(c5139d10);
                            arrayList12 = arrayList192;
                        }
                        if (c5139d10.J.f41473f == null) {
                            if (arrayList13 == null) {
                            }
                            ArrayList arrayList202 = arrayList13;
                            arrayList202.add(c5139d10);
                            arrayList13 = arrayList202;
                        }
                        i34 = i35 + 1;
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
                            AbstractC5170h.b((h) it.next(), 0, arrayList25, null);
                        }
                    }
                    int i36 = 0;
                    C5177o c5177o5 = null;
                    if (arrayList22 != null) {
                        Iterator it2 = arrayList22.iterator();
                        while (it2.hasNext()) {
                            i iVar2 = (i) it2.next();
                            C5177o b11 = AbstractC5170h.b(iVar2, i36, arrayList25, c5177o5);
                            iVar2.R(i36, arrayList25, b11);
                            b11.a(arrayList25);
                            i36 = 0;
                            c5177o5 = null;
                        }
                    }
                    HashSet hashSet = i(2).f41468a;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            AbstractC5170h.b(((C5138c) it3.next()).f41471d, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet2 = i(4).f41468a;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            AbstractC5170h.b(((C5138c) it4.next()).f41471d, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet3 = i(7).f41468a;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            AbstractC5170h.b(((C5138c) it5.next()).f41471d, 0, arrayList25, null);
                        }
                    }
                    C5177o c5177o6 = null;
                    if (arrayList12 != null) {
                        Iterator it6 = arrayList12.iterator();
                        while (it6.hasNext()) {
                            AbstractC5170h.b((C5139d) it6.next(), 0, arrayList25, null);
                        }
                    }
                    if (arrayList23 != null) {
                        Iterator it7 = arrayList23.iterator();
                        while (it7.hasNext()) {
                            AbstractC5170h.b((h) it7.next(), 1, arrayList25, null);
                        }
                    }
                    int i37 = 1;
                    if (arrayList24 != null) {
                        Iterator it8 = arrayList24.iterator();
                        while (it8.hasNext()) {
                            i iVar3 = (i) it8.next();
                            C5177o b12 = AbstractC5170h.b(iVar3, i37, arrayList25, c5177o6);
                            iVar3.R(i37, arrayList25, b12);
                            b12.a(arrayList25);
                            i37 = 1;
                            c5177o6 = null;
                        }
                    }
                    HashSet hashSet4 = i(3).f41468a;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            AbstractC5170h.b(((C5138c) it9.next()).f41471d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet5 = i(6).f41468a;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            AbstractC5170h.b(((C5138c) it10.next()).f41471d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet6 = i(5).f41468a;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            AbstractC5170h.b(((C5138c) it11.next()).f41471d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet7 = i(7).f41468a;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            AbstractC5170h.b(((C5138c) it12.next()).f41471d, 1, arrayList25, null);
                        }
                    }
                    if (arrayList13 != null) {
                        Iterator it13 = arrayList13.iterator();
                        while (it13.hasNext()) {
                            AbstractC5170h.b((C5139d) it13.next(), 1, arrayList25, null);
                        }
                    }
                    int i38 = 0;
                    while (i38 < size3) {
                        C5139d c5139d11 = (C5139d) arrayList7.get(i38);
                        int[] iArr5 = c5139d11.f41529p0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i39 = c5139d11.f41525n0;
                            int size4 = arrayList25.size();
                            int i40 = 0;
                            while (true) {
                                if (i40 >= size4) {
                                    i12 = i38;
                                    c5177o3 = null;
                                    break;
                                }
                                i12 = i38;
                                c5177o3 = (C5177o) arrayList25.get(i40);
                                int i41 = size4;
                                if (i39 == c5177o3.f41734b) {
                                    break;
                                }
                                i40++;
                                size4 = i41;
                                i38 = i12;
                            }
                            int i42 = c5139d11.f41527o0;
                            int size5 = arrayList25.size();
                            int i43 = 0;
                            while (true) {
                                if (i43 >= size5) {
                                    c5177o4 = null;
                                    break;
                                }
                                c5177o4 = (C5177o) arrayList25.get(i43);
                                int i44 = size5;
                                if (i42 == c5177o4.f41734b) {
                                    break;
                                }
                                i43++;
                                size5 = i44;
                            }
                            if (c5177o3 != null && c5177o4 != null) {
                                c5177o3.c(0, c5177o4);
                                c5177o4.f41735c = 2;
                                arrayList25.remove(c5177o3);
                            }
                        } else {
                            i12 = i38;
                        }
                        i38 = i12 + 1;
                    }
                    if (arrayList25.size() > 1) {
                        if (objArr[0] == 2) {
                            Iterator it14 = arrayList25.iterator();
                            int i45 = 0;
                            c5177o = null;
                            while (it14.hasNext()) {
                                C5177o c5177o7 = (C5177o) it14.next();
                                if (c5177o7.f41735c != 1 && (b10 = c5177o7.b(c5047c2, 0)) > i45) {
                                    c5177o = c5177o7;
                                    i45 = b10;
                                }
                            }
                            c10 = 1;
                            if (c5177o != null) {
                                M(1);
                                O(i45);
                                if (objArr[c10] == 2) {
                                    Iterator it15 = arrayList25.iterator();
                                    int i46 = 0;
                                    c5177o2 = null;
                                    while (it15.hasNext()) {
                                        C5177o c5177o8 = (C5177o) it15.next();
                                        if (c5177o8.f41735c != 0 && (b9 = c5177o8.b(c5047c2, 1)) > i46) {
                                            c5177o2 = c5177o8;
                                            i46 = b9;
                                        }
                                    }
                                    if (c5177o2 != null) {
                                        N(1);
                                        L(i46);
                                        if (c5177o == null || c5177o2 != null) {
                                            if (i15 == 2) {
                                                if (max5 >= q() || max5 <= 0) {
                                                    max5 = q();
                                                } else {
                                                    O(max5);
                                                    this.f41543E0 = true;
                                                }
                                            }
                                            if (i14 == 2) {
                                                if (max6 >= k() || max6 <= 0) {
                                                    max6 = k();
                                                } else {
                                                    L(max6);
                                                    this.f41544F0 = true;
                                                }
                                            }
                                            i = max6;
                                            i6 = max5;
                                            z3 = true;
                                        }
                                    }
                                }
                                c5177o2 = null;
                                if (c5177o == null) {
                                }
                                if (i15 == 2) {
                                }
                                if (i14 == 2) {
                                }
                                i = max6;
                                i6 = max5;
                                z3 = true;
                            }
                        } else {
                            c10 = 1;
                        }
                        c5177o = null;
                        if (objArr[c10] == 2) {
                        }
                        c5177o2 = null;
                        if (c5177o == null) {
                        }
                        if (i15 == 2) {
                        }
                        if (i14 == 2) {
                        }
                        i = max6;
                        i6 = max5;
                        z3 = true;
                    }
                }
            }
            boolean z23 = !W(64) || W(128);
            c5047c2.getClass();
            c5047c2.f40960h = false;
            if (this.f41542D0 == 0 && z23) {
                c9 = 1;
                c5047c2.f40960h = true;
            } else {
                c9 = 1;
            }
            ArrayList arrayList26 = this.f41551q0;
            boolean z24 = objArr[0] != 2 || objArr[c9] == 2;
            this.f41560z0 = 0;
            this.f41540A0 = 0;
            for (i9 = 0; i9 < size; i9++) {
                C5139d c5139d12 = (C5139d) this.f41551q0.get(i9);
                if (c5139d12 instanceof C5140e) {
                    ((C5140e) c5139d12).U();
                }
            }
            boolean W8 = W(64);
            z6 = z3;
            int i47 = 0;
            z9 = true;
            while (z9) {
                int i48 = i47 + 1;
                try {
                    c5047c2.t();
                    this.f41560z0 = 0;
                    this.f41540A0 = 0;
                    g(c5047c2);
                    for (int i49 = 0; i49 < size; i49++) {
                        ((C5139d) this.f41551q0.get(i49)).g(c5047c2);
                    }
                    S(c5047c2);
                    try {
                        WeakReference weakReference = this.f41545G0;
                        if (weakReference == null || weakReference.get() == null) {
                            c5138c2 = c5138c3;
                            z10 = z24;
                        } else {
                            C5138c c5138c5 = (C5138c) this.f41545G0.get();
                            C5050f k9 = c5047c2.k(c5138c3);
                            C5047c c5047c3 = this.f41557w0;
                            c5138c2 = c5138c3;
                            z10 = z24;
                            try {
                                c5047c3.f(c5047c3.k(c5138c5), k9, 0, 5);
                                this.f41545G0 = null;
                            } catch (Exception e9) {
                                e = e9;
                                z9 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2 = j.f41621a;
                                if (z9) {
                                }
                                if (z10) {
                                }
                                max = Math.max(this.f41503b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41505c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z13) {
                                }
                                z6 = z13;
                                z14 = z11;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5138c3 = c5138c2;
                                z24 = z10;
                            }
                        }
                        WeakReference weakReference2 = this.f41547I0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            C5138c c5138c6 = (C5138c) this.f41547I0.get();
                            C5050f k10 = c5047c2.k(this.f41486L);
                            C5047c c5047c4 = this.f41557w0;
                            c5047c4.f(k10, c5047c4.k(c5138c6), 0, 5);
                            this.f41547I0 = null;
                        }
                        WeakReference weakReference3 = this.f41546H0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            C5138c c5138c7 = (C5138c) this.f41546H0.get();
                            C5138c c5138c8 = c5138c;
                            try {
                                C5050f k11 = c5047c2.k(c5138c8);
                                C5047c c5047c5 = this.f41557w0;
                                c5138c = c5138c8;
                                c5047c5.f(c5047c5.k(c5138c7), k11, 0, 5);
                                this.f41546H0 = null;
                            } catch (Exception e10) {
                                e = e10;
                                c5138c = c5138c8;
                                z9 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22 = j.f41621a;
                                if (z9) {
                                }
                                if (z10) {
                                }
                                max = Math.max(this.f41503b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41505c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z13) {
                                }
                                z6 = z13;
                                z14 = z11;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5138c3 = c5138c2;
                                z24 = z10;
                            }
                        }
                        WeakReference weakReference4 = this.f41548J0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            C5138c c5138c9 = (C5138c) this.f41548J0.get();
                            C5050f k12 = c5047c2.k(this.f41485K);
                            try {
                                c5047c = this.f41557w0;
                            } catch (Exception e11) {
                                e = e11;
                                z9 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr222 = j.f41621a;
                                if (z9) {
                                }
                                if (z10) {
                                    int i50 = 0;
                                    int i51 = 0;
                                    while (i11 < size) {
                                    }
                                    max3 = Math.max(this.f41503b0, i50);
                                    max4 = Math.max(this.f41505c0, i51);
                                    if (i15 == 2) {
                                        O(max3);
                                        objArr[0] = 2;
                                        z6 = true;
                                        z11 = true;
                                    }
                                    if (i14 == 2) {
                                        L(max4);
                                        objArr[1] = 2;
                                        z6 = true;
                                        z11 = true;
                                    }
                                }
                                max = Math.max(this.f41503b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41505c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z13) {
                                }
                                z6 = z13;
                                z14 = z11;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5138c3 = c5138c2;
                                z24 = z10;
                            }
                            try {
                                c5047c.f(k12, c5047c.k(c5138c9), 0, 5);
                            } catch (Exception e12) {
                                e = e12;
                                z9 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2222 = j.f41621a;
                                if (z9) {
                                }
                                if (z10) {
                                }
                                max = Math.max(this.f41503b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41505c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z13) {
                                }
                                z6 = z13;
                                z14 = z11;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5138c3 = c5138c2;
                                z24 = z10;
                            }
                            try {
                                this.f41548J0 = null;
                            } catch (Exception e13) {
                                e = e13;
                                z9 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22222 = j.f41621a;
                                if (z9) {
                                }
                                if (z10) {
                                }
                                max = Math.max(this.f41503b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41505c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z13) {
                                }
                                z6 = z13;
                                z14 = z11;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5138c3 = c5138c2;
                                z24 = z10;
                            }
                        }
                        c5047c2.p();
                        z9 = true;
                    } catch (Exception e14) {
                        e = e14;
                        c5138c2 = c5138c3;
                        z10 = z24;
                    }
                } catch (Exception e15) {
                    e = e15;
                    c5138c2 = c5138c3;
                    z10 = z24;
                }
                boolean[] zArr222222 = j.f41621a;
                if (z9) {
                    zArr = zArr222222;
                    Q(c5047c2, W8);
                    for (int i52 = 0; i52 < size; i52++) {
                        ((C5139d) this.f41551q0.get(i52)).Q(c5047c2, W8);
                    }
                    z11 = false;
                } else {
                    zArr222222[2] = false;
                    boolean W9 = W(64);
                    Q(c5047c2, W9);
                    int size6 = this.f41551q0.size();
                    int i53 = 0;
                    z11 = false;
                    while (i53 < size6) {
                        C5139d c5139d13 = (C5139d) this.f41551q0.get(i53);
                        c5139d13.Q(c5047c2, W9);
                        boolean[] zArr3 = zArr222222;
                        boolean z25 = W9;
                        if (c5139d13.f41514h != -1 || c5139d13.i != -1) {
                            z11 = true;
                        }
                        i53++;
                        zArr222222 = zArr3;
                        W9 = z25;
                    }
                    zArr = zArr222222;
                }
                if (z10 && i48 < 8 && zArr[2]) {
                    int i502 = 0;
                    int i512 = 0;
                    for (i11 = 0; i11 < size; i11++) {
                        C5139d c5139d14 = (C5139d) this.f41551q0.get(i11);
                        i502 = Math.max(i502, c5139d14.q() + c5139d14.Y);
                        i512 = Math.max(i512, c5139d14.k() + c5139d14.f41499Z);
                    }
                    max3 = Math.max(this.f41503b0, i502);
                    max4 = Math.max(this.f41505c0, i512);
                    if (i15 == 2 && q() < max3) {
                        O(max3);
                        objArr[0] = 2;
                        z6 = true;
                        z11 = true;
                    }
                    if (i14 == 2 && k() < max4) {
                        L(max4);
                        objArr[1] = 2;
                        z6 = true;
                        z11 = true;
                    }
                }
                max = Math.max(this.f41503b0, q());
                if (max <= q()) {
                    O(max);
                    r14 = 1;
                    objArr[0] = 1;
                    z11 = true;
                    z12 = true;
                } else {
                    r14 = 1;
                    z12 = z6;
                }
                max2 = Math.max(this.f41505c0, k());
                if (max2 <= k()) {
                    L(max2);
                    objArr[r14] = r14;
                    z13 = r14;
                    z11 = z13;
                } else {
                    z13 = z12;
                }
                if (!z13) {
                    if (objArr[0] == 2 && i6 > 0 && q() > i6) {
                        this.f41543E0 = r14;
                        objArr[0] = r14;
                        O(i6);
                        z13 = r14;
                        z11 = z13;
                    }
                    if (objArr[r14] == 2 && i > 0 && k() > i) {
                        this.f41544F0 = r14;
                        objArr[r14] = r14;
                        L(i);
                        i10 = 8;
                        z14 = true;
                        z6 = true;
                        z9 = i48 > i10 ? false : z14;
                        i47 = i48;
                        c5138c3 = c5138c2;
                        z24 = z10;
                    }
                }
                z6 = z13;
                z14 = z11;
                i10 = 8;
                if (i48 > i10) {
                }
                i47 = i48;
                c5138c3 = c5138c2;
                z24 = z10;
            }
            this.f41551q0 = arrayList26;
            if (z6) {
                objArr[0] = i15;
                objArr[1] = i14;
            }
            F(c5047c2.f40964m);
        }
        c5138c = c5138c4;
        i = max6;
        i6 = max5;
        z3 = false;
        if (W(64)) {
        }
        c5047c2.getClass();
        c5047c2.f40960h = false;
        if (this.f41542D0 == 0) {
        }
        c9 = 1;
        ArrayList arrayList262 = this.f41551q0;
        if (objArr[0] != 2) {
        }
        this.f41560z0 = 0;
        this.f41540A0 = 0;
        while (i9 < size) {
        }
        boolean W82 = W(64);
        z6 = z3;
        int i472 = 0;
        z9 = true;
        while (z9) {
        }
        this.f41551q0 = arrayList262;
        if (z6) {
        }
        F(c5047c2.f40964m);
    }

    public final boolean W(int i) {
        return (this.f41542D0 & i) == i;
    }

    @Override // w.C5139d
    public final void n(StringBuilder sb) {
        sb.append(this.f41517j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f41495U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f41496V);
        sb.append("\n");
        Iterator it = this.f41551q0.iterator();
        while (it.hasNext()) {
            ((C5139d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
