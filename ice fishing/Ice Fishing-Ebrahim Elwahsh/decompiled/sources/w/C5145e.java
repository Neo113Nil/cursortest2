package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m.Q0;
import u.C5086c;
import u.C5089f;
import x.AbstractC5191h;
import x.AbstractC5199p;
import x.C5185b;
import x.C5186c;
import x.C5188e;
import x.C5198o;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5145e extends C5144d {

    /* renamed from: A0, reason: collision with root package name */
    public int f41478A0;

    /* renamed from: B0, reason: collision with root package name */
    public C5142b[] f41479B0;
    public C5142b[] C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f41480D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f41481E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f41482F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f41483G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f41484H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f41485I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f41486J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f41487K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C5185b f41488L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f41489q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final Q0 f41490r0 = new Q0(this);

    /* renamed from: s0, reason: collision with root package name */
    public final C5188e f41491s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f41492t0;

    /* renamed from: u0, reason: collision with root package name */
    public z.f f41493u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41494v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C5086c f41495w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f41496x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f41497y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f41498z0;

    public C5145e() {
        C5188e c5188e = new C5188e();
        c5188e.f41726b = true;
        c5188e.f41727c = true;
        c5188e.f41729e = new ArrayList();
        new ArrayList();
        c5188e.f41730f = null;
        c5188e.f41731g = new C5185b();
        c5188e.f41732h = new ArrayList();
        c5188e.f41725a = this;
        c5188e.f41728d = this;
        this.f41491s0 = c5188e;
        this.f41493u0 = null;
        this.f41494v0 = false;
        this.f41495w0 = new C5086c();
        this.f41498z0 = 0;
        this.f41478A0 = 0;
        this.f41479B0 = new C5142b[4];
        this.C0 = new C5142b[4];
        this.f41480D0 = 257;
        this.f41481E0 = false;
        this.f41482F0 = false;
        this.f41483G0 = null;
        this.f41484H0 = null;
        this.f41485I0 = null;
        this.f41486J0 = null;
        this.f41487K0 = new HashSet();
        this.f41488L0 = new C5185b();
    }

    public static void V(C5144d c5144d, z.f fVar, C5185b c5185b) {
        int i;
        int i4;
        if (fVar == null) {
            return;
        }
        if (c5144d.f41451g0 == 8 || (c5144d instanceof h) || (c5144d instanceof C5141a)) {
            c5185b.f41718e = 0;
            c5185b.f41719f = 0;
            return;
        }
        int[] iArr = c5144d.f41467p0;
        c5185b.f41714a = iArr[0];
        c5185b.f41715b = iArr[1];
        c5185b.f41716c = c5144d.q();
        c5185b.f41717d = c5144d.k();
        c5185b.i = false;
        c5185b.f41722j = 0;
        boolean z8 = c5185b.f41714a == 3;
        boolean z9 = c5185b.f41715b == 3;
        boolean z10 = z8 && c5144d.f41435W > 0.0f;
        boolean z11 = z9 && c5144d.f41435W > 0.0f;
        if (z8 && c5144d.t(0) && c5144d.f41469r == 0 && !z10) {
            c5185b.f41714a = 2;
            if (z9 && c5144d.f41470s == 0) {
                c5185b.f41714a = 1;
            }
            z8 = false;
        }
        if (z9 && c5144d.t(1) && c5144d.f41470s == 0 && !z11) {
            c5185b.f41715b = 2;
            if (z8 && c5144d.f41469r == 0) {
                c5185b.f41715b = 1;
            }
            z9 = false;
        }
        if (c5144d.A()) {
            c5185b.f41714a = 1;
            z8 = false;
        }
        if (c5144d.B()) {
            c5185b.f41715b = 1;
            z9 = false;
        }
        int[] iArr2 = c5144d.f41471t;
        if (z10) {
            if (iArr2[0] == 4) {
                c5185b.f41714a = 1;
            } else if (!z9) {
                if (c5185b.f41715b == 1) {
                    i4 = c5185b.f41717d;
                } else {
                    c5185b.f41714a = 2;
                    fVar.b(c5144d, c5185b);
                    i4 = c5185b.f41719f;
                }
                c5185b.f41714a = 1;
                c5185b.f41716c = (int) (c5144d.f41435W * i4);
            }
        }
        if (z11) {
            if (iArr2[1] == 4) {
                c5185b.f41715b = 1;
            } else if (!z8) {
                if (c5185b.f41714a == 1) {
                    i = c5185b.f41716c;
                } else {
                    c5185b.f41715b = 2;
                    fVar.b(c5144d, c5185b);
                    i = c5185b.f41718e;
                }
                c5185b.f41715b = 1;
                if (c5144d.f41436X == -1) {
                    c5185b.f41717d = (int) (i / c5144d.f41435W);
                } else {
                    c5185b.f41717d = (int) (c5144d.f41435W * i);
                }
            }
        }
        fVar.b(c5144d, c5185b);
        c5144d.O(c5185b.f41718e);
        c5144d.L(c5185b.f41719f);
        c5144d.f41418E = c5185b.f41721h;
        c5144d.I(c5185b.f41720g);
        c5185b.f41722j = 0;
    }

    @Override // w.C5144d
    public final void C() {
        this.f41495w0.t();
        this.f41496x0 = 0;
        this.f41497y0 = 0;
        this.f41489q0.clear();
        super.C();
    }

    @Override // w.C5144d
    public final void F(Q0 q02) {
        super.F(q02);
        int size = this.f41489q0.size();
        for (int i = 0; i < size; i++) {
            ((C5144d) this.f41489q0.get(i)).F(q02);
        }
    }

    @Override // w.C5144d
    public final void P(boolean z8, boolean z9) {
        super.P(z8, z9);
        int size = this.f41489q0.size();
        for (int i = 0; i < size; i++) {
            ((C5144d) this.f41489q0.get(i)).P(z8, z9);
        }
    }

    public final void R(C5144d c5144d, int i) {
        if (i == 0) {
            int i4 = this.f41498z0 + 1;
            C5142b[] c5142bArr = this.C0;
            if (i4 >= c5142bArr.length) {
                this.C0 = (C5142b[]) Arrays.copyOf(c5142bArr, c5142bArr.length * 2);
            }
            C5142b[] c5142bArr2 = this.C0;
            int i9 = this.f41498z0;
            c5142bArr2[i9] = new C5142b(c5144d, 0, this.f41494v0);
            this.f41498z0 = i9 + 1;
            return;
        }
        if (i == 1) {
            int i10 = this.f41478A0 + 1;
            C5142b[] c5142bArr3 = this.f41479B0;
            if (i10 >= c5142bArr3.length) {
                this.f41479B0 = (C5142b[]) Arrays.copyOf(c5142bArr3, c5142bArr3.length * 2);
            }
            C5142b[] c5142bArr4 = this.f41479B0;
            int i11 = this.f41478A0;
            c5142bArr4[i11] = new C5142b(c5144d, 1, this.f41494v0);
            this.f41478A0 = i11 + 1;
        }
    }

    public final void S(C5086c c5086c) {
        C5145e c5145e;
        C5086c c5086c2;
        boolean W8 = W(64);
        b(c5086c, W8);
        int size = this.f41489q0.size();
        boolean z8 = false;
        for (int i = 0; i < size; i++) {
            C5144d c5144d = (C5144d) this.f41489q0.get(i);
            boolean[] zArr = c5144d.f41431S;
            zArr[0] = false;
            zArr[1] = false;
            if (c5144d instanceof C5141a) {
                z8 = true;
            }
        }
        if (z8) {
            for (int i4 = 0; i4 < size; i4++) {
                C5144d c5144d2 = (C5144d) this.f41489q0.get(i4);
                if (c5144d2 instanceof C5141a) {
                    C5141a c5141a = (C5141a) c5144d2;
                    for (int i9 = 0; i9 < c5141a.f41558r0; i9++) {
                        C5144d c5144d3 = c5141a.f41557q0[i9];
                        if (c5141a.f41387t0 || c5144d3.c()) {
                            int i10 = c5141a.f41386s0;
                            if (i10 == 0 || i10 == 1) {
                                c5144d3.f41431S[0] = true;
                            } else if (i10 == 2 || i10 == 3) {
                                c5144d3.f41431S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f41487K0;
        hashSet.clear();
        for (int i11 = 0; i11 < size; i11++) {
            C5144d c5144d4 = (C5144d) this.f41489q0.get(i11);
            c5144d4.getClass();
            boolean z9 = c5144d4 instanceof g;
            if (z9 || (c5144d4 instanceof h)) {
                if (z9) {
                    hashSet.add(c5144d4);
                } else {
                    c5144d4.b(c5086c, W8);
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
                g gVar = (g) ((C5144d) it.next());
                for (int i12 = 0; i12 < gVar.f41558r0; i12++) {
                    if (hashSet.contains(gVar.f41557q0[i12])) {
                        gVar.b(c5086c, W8);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C5144d) it2.next()).b(c5086c, W8);
                }
                hashSet.clear();
            }
        }
        if (C5086c.f40969q) {
            HashSet hashSet2 = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                C5144d c5144d5 = (C5144d) this.f41489q0.get(i13);
                c5144d5.getClass();
                if (!(c5144d5 instanceof g) && !(c5144d5 instanceof h)) {
                    hashSet2.add(c5144d5);
                }
            }
            c5145e = this;
            c5086c2 = c5086c;
            c5145e.a(this, c5086c2, hashSet2, this.f41467p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C5144d c5144d6 = (C5144d) it3.next();
                j.b(this, c5086c2, c5144d6);
                c5144d6.b(c5086c2, W8);
            }
        } else {
            c5145e = this;
            c5086c2 = c5086c;
            for (int i14 = 0; i14 < size; i14++) {
                C5144d c5144d7 = (C5144d) c5145e.f41489q0.get(i14);
                if (c5144d7 instanceof C5145e) {
                    int[] iArr = c5144d7.f41467p0;
                    int i15 = iArr[0];
                    int i16 = iArr[1];
                    if (i15 == 2) {
                        c5144d7.M(1);
                    }
                    if (i16 == 2) {
                        c5144d7.N(1);
                    }
                    c5144d7.b(c5086c2, W8);
                    if (i15 == 2) {
                        c5144d7.M(i15);
                    }
                    if (i16 == 2) {
                        c5144d7.N(i16);
                    }
                } else {
                    j.b(this, c5086c2, c5144d7);
                    if (!(c5144d7 instanceof g) && !(c5144d7 instanceof h)) {
                        c5144d7.b(c5086c2, W8);
                    }
                }
            }
        }
        if (c5145e.f41498z0 > 0) {
            j.a(this, c5086c2, null, 0);
        }
        if (c5145e.f41478A0 > 0) {
            j.a(this, c5086c2, null, 1);
        }
    }

    public final boolean T(int i, boolean z8) {
        boolean z9;
        C5188e c5188e = this.f41491s0;
        C5145e c5145e = c5188e.f41725a;
        boolean z10 = false;
        int j9 = c5145e.j(0);
        int j10 = c5145e.j(1);
        int r9 = c5145e.r();
        int s3 = c5145e.s();
        ArrayList arrayList = c5188e.f41729e;
        if (z8 && (j9 == 2 || j10 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC5199p abstractC5199p = (AbstractC5199p) it.next();
                if (abstractC5199p.f41762f == i && !abstractC5199p.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z8 && j9 == 2) {
                    c5145e.M(1);
                    c5145e.O(c5188e.d(c5145e, 0));
                    c5145e.f41444d.f41761e.d(c5145e.q());
                }
            } else if (z8 && j10 == 2) {
                c5145e.N(1);
                c5145e.L(c5188e.d(c5145e, 1));
                c5145e.f41446e.f41761e.d(c5145e.k());
            }
        }
        int[] iArr = c5145e.f41467p0;
        if (i == 0) {
            int i4 = iArr[0];
            if (i4 == 1 || i4 == 4) {
                int q6 = c5145e.q() + r9;
                c5145e.f41444d.i.d(q6);
                c5145e.f41444d.f41761e.d(q6 - r9);
                z9 = true;
            }
            z9 = false;
        } else {
            int i9 = iArr[1];
            if (i9 == 1 || i9 == 4) {
                int k6 = c5145e.k() + s3;
                c5145e.f41446e.i.d(k6);
                c5145e.f41446e.f41761e.d(k6 - s3);
                z9 = true;
            }
            z9 = false;
        }
        c5188e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC5199p abstractC5199p2 = (AbstractC5199p) it2.next();
            if (abstractC5199p2.f41762f == i && (abstractC5199p2.f41758b != c5145e || abstractC5199p2.f41763g)) {
                abstractC5199p2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z10 = true;
                break;
            }
            AbstractC5199p abstractC5199p3 = (AbstractC5199p) it3.next();
            if (abstractC5199p3.f41762f == i && (z9 || abstractC5199p3.f41758b != c5145e)) {
                if (!abstractC5199p3.f41764h.f41741j) {
                    break;
                }
                if (!abstractC5199p3.i.f41741j) {
                    break;
                }
                if (!(abstractC5199p3 instanceof C5186c) && !abstractC5199p3.f41761e.f41741j) {
                    break;
                }
            }
        }
        c5145e.M(j9);
        c5145e.N(j10);
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
        C5143c c5143c;
        int i;
        int i4;
        boolean z8;
        char c4;
        int i9;
        boolean z9;
        boolean z10;
        C5143c c5143c2;
        boolean z11;
        boolean[] zArr;
        boolean z12;
        int max;
        ?? r14;
        boolean z13;
        int max2;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        int max3;
        int max4;
        C5086c c5086c;
        char c9;
        C5198o c5198o;
        C5198o c5198o2;
        int b9;
        int b10;
        int i12;
        C5198o c5198o3;
        C5198o c5198o4;
        boolean z16;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i13;
        boolean z17;
        this.Y = 0;
        this.f41437Z = 0;
        this.f41481E0 = false;
        this.f41482F0 = false;
        int size = this.f41489q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.f41467p0;
        int i14 = iArr[1];
        int i15 = iArr[0];
        int i16 = this.f41492t0;
        C5143c c5143c3 = this.J;
        C5143c c5143c4 = this.f41422I;
        if (i16 == 0 && j.c(this.f41480D0, 1)) {
            z.f fVar = this.f41493u0;
            int i17 = iArr[0];
            int i18 = iArr[1];
            E();
            ArrayList arrayList6 = this.f41489q0;
            int size2 = arrayList6.size();
            for (int i19 = 0; i19 < size2; i19++) {
                ((C5144d) arrayList6.get(i19)).E();
            }
            boolean z18 = this.f41494v0;
            if (i17 == 1) {
                J(0, q());
            } else {
                c5143c4.l(0);
                this.Y = 0;
            }
            int i20 = 0;
            boolean z19 = false;
            boolean z20 = false;
            while (i20 < size2) {
                int[] iArr2 = iArr;
                C5144d c5144d = (C5144d) arrayList6.get(i20);
                int i21 = i20;
                if (c5144d instanceof h) {
                    h hVar = (h) c5144d;
                    z17 = z19;
                    if (hVar.f41555u0 == 1) {
                        int i22 = hVar.f41552r0;
                        if (i22 != -1) {
                            hVar.R(i22);
                        } else if (hVar.f41553s0 != -1 && A()) {
                            hVar.R(q() - hVar.f41553s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f41551q0 * q()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else {
                    z17 = z19;
                    if ((c5144d instanceof C5141a) && ((C5141a) c5144d).U() == 0) {
                        z19 = z17;
                        z20 = true;
                        i20 = i21 + 1;
                        iArr = iArr2;
                    }
                }
                z19 = z17;
                i20 = i21 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z19) {
                for (int i23 = 0; i23 < size2; i23 = i13 + 1) {
                    C5144d c5144d2 = (C5144d) arrayList6.get(i23);
                    if (c5144d2 instanceof h) {
                        h hVar2 = (h) c5144d2;
                        i13 = i23;
                        if (hVar2.f41555u0 == 1) {
                            AbstractC5191h.c(0, hVar2, fVar, z18);
                        }
                    } else {
                        i13 = i23;
                    }
                }
            }
            AbstractC5191h.c(0, this, fVar, z18);
            if (z20) {
                for (int i24 = 0; i24 < size2; i24++) {
                    C5144d c5144d3 = (C5144d) arrayList6.get(i24);
                    if (c5144d3 instanceof C5141a) {
                        C5141a c5141a = (C5141a) c5144d3;
                        if (c5141a.U() == 0 && c5141a.T()) {
                            AbstractC5191h.c(1, c5141a, fVar, z18);
                        }
                    }
                }
            }
            if (i18 == 1) {
                K(0, k());
            } else {
                c5143c3.l(0);
                this.f41437Z = 0;
            }
            int i25 = 0;
            boolean z21 = false;
            boolean z22 = false;
            while (i25 < size2) {
                C5144d c5144d4 = (C5144d) arrayList6.get(i25);
                int i26 = i25;
                if (c5144d4 instanceof h) {
                    h hVar3 = (h) c5144d4;
                    if (hVar3.f41555u0 == 0) {
                        int i27 = hVar3.f41552r0;
                        if (i27 != -1) {
                            hVar3.R(i27);
                        } else if (hVar3.f41553s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f41553s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f41551q0 * k()) + 0.5f));
                        }
                        z21 = true;
                    }
                } else if ((c5144d4 instanceof C5141a) && ((C5141a) c5144d4).U() == 1) {
                    z22 = true;
                }
                i25 = i26 + 1;
            }
            if (z21) {
                for (int i28 = 0; i28 < size2; i28++) {
                    C5144d c5144d5 = (C5144d) arrayList6.get(i28);
                    if (c5144d5 instanceof h) {
                        h hVar4 = (h) c5144d5;
                        if (hVar4.f41555u0 == 0) {
                            AbstractC5191h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            AbstractC5191h.i(0, this, fVar);
            if (z22) {
                for (int i29 = 0; i29 < size2; i29++) {
                    C5144d c5144d6 = (C5144d) arrayList6.get(i29);
                    if (c5144d6 instanceof C5141a) {
                        C5141a c5141a2 = (C5141a) c5144d6;
                        if (c5141a2.U() == 1 && c5141a2.T()) {
                            AbstractC5191h.i(1, c5141a2, fVar);
                        }
                    }
                }
            }
            for (int i30 = 0; i30 < size2; i30++) {
                C5144d c5144d7 = (C5144d) arrayList6.get(i30);
                if (c5144d7.z() && AbstractC5191h.a(c5144d7)) {
                    V(c5144d7, fVar, AbstractC5191h.f41745a);
                    if (!(c5144d7 instanceof h)) {
                        AbstractC5191h.c(0, c5144d7, fVar, z18);
                        AbstractC5191h.i(0, c5144d7, fVar);
                    } else if (((h) c5144d7).f41555u0 == 0) {
                        AbstractC5191h.i(0, c5144d7, fVar);
                    } else {
                        AbstractC5191h.c(0, c5144d7, fVar, z18);
                    }
                }
            }
            for (int i31 = 0; i31 < size; i31++) {
                C5144d c5144d8 = (C5144d) this.f41489q0.get(i31);
                if (c5144d8.z() && !(c5144d8 instanceof h) && !(c5144d8 instanceof C5141a) && !(c5144d8 instanceof g) && !c5144d8.f41419F) {
                    int j9 = c5144d8.j(0);
                    int j10 = c5144d8.j(1);
                    if (j9 != 3 || c5144d8.f41469r == 1 || j10 != 3 || c5144d8.f41470s == 1) {
                        V(c5144d8, this.f41493u0, new C5185b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        C5086c c5086c2 = this.f41495w0;
        if (size > 2 && ((i15 == 2 || i14 == 2) && j.c(this.f41480D0, 1024))) {
            z.f fVar2 = this.f41493u0;
            ArrayList arrayList7 = this.f41489q0;
            int size3 = arrayList7.size();
            int i32 = 0;
            while (true) {
                if (i32 < size3) {
                    C5144d c5144d9 = (C5144d) arrayList7.get(i32);
                    char c10 = objArr[0];
                    char c11 = objArr[1];
                    int i33 = i32;
                    int[] iArr3 = c5144d9.f41467p0;
                    c5143c = c5143c4;
                    if (!AbstractC5191h.h(c10, c11, iArr3[0], iArr3[1]) || (c5144d9 instanceof g)) {
                        break;
                    }
                    i32 = i33 + 1;
                    c5143c4 = c5143c;
                } else {
                    c5143c = c5143c4;
                    int i34 = 0;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    ArrayList arrayList13 = null;
                    while (i34 < size3) {
                        int i35 = i34;
                        C5144d c5144d10 = (C5144d) arrayList7.get(i34);
                        ArrayList arrayList14 = arrayList8;
                        char c12 = objArr[0];
                        ArrayList arrayList15 = arrayList9;
                        char c13 = objArr[1];
                        ArrayList arrayList16 = arrayList10;
                        int[] iArr4 = c5144d10.f41467p0;
                        ArrayList arrayList17 = arrayList11;
                        if (!AbstractC5191h.h(c12, c13, iArr4[0], iArr4[1])) {
                            V(c5144d10, fVar2, this.f41488L0);
                        }
                        boolean z23 = c5144d10 instanceof h;
                        if (z23) {
                            h hVar5 = (h) c5144d10;
                            if (hVar5.f41555u0 == 0) {
                                arrayList2 = arrayList16 == null ? new ArrayList() : arrayList16;
                                arrayList2.add(hVar5);
                            } else {
                                arrayList2 = arrayList16;
                            }
                            z16 = z23;
                            if (hVar5.f41555u0 == 1) {
                                arrayList = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList.add(hVar5);
                            } else {
                                arrayList = arrayList14;
                            }
                        } else {
                            z16 = z23;
                            arrayList = arrayList14;
                            arrayList2 = arrayList16;
                        }
                        if (!(c5144d10 instanceof i)) {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList9 = arrayList15;
                        } else if (c5144d10 instanceof C5141a) {
                            C5141a c5141a3 = (C5141a) c5144d10;
                            if (c5141a3.U() == 0) {
                                arrayList5 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList5.add(c5141a3);
                            } else {
                                arrayList5 = arrayList15;
                            }
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            if (c5141a3.U() == 1) {
                                ArrayList arrayList18 = arrayList17 == null ? new ArrayList() : arrayList17;
                                arrayList18.add(c5141a3);
                                arrayList17 = arrayList18;
                            }
                            arrayList9 = arrayList5;
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            i iVar = (i) c5144d10;
                            arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                            arrayList9.add(iVar);
                            arrayList11 = arrayList17 == null ? new ArrayList() : arrayList17;
                            arrayList11.add(iVar);
                            if (c5144d10.f41422I.f41411f == null && c5144d10.f41423K.f41411f == null && !z16 && !(c5144d10 instanceof C5141a)) {
                                if (arrayList12 == null) {
                                    arrayList12 = new ArrayList();
                                }
                                ArrayList arrayList19 = arrayList12;
                                arrayList19.add(c5144d10);
                                arrayList12 = arrayList19;
                            }
                            if (c5144d10.J.f41411f == null && c5144d10.f41424L.f41411f == null && c5144d10.f41425M.f41411f == null && !z16 && !(c5144d10 instanceof C5141a)) {
                                if (arrayList13 == null) {
                                    arrayList13 = new ArrayList();
                                }
                                ArrayList arrayList20 = arrayList13;
                                arrayList20.add(c5144d10);
                                arrayList13 = arrayList20;
                            }
                            i34 = i35 + 1;
                            arrayList8 = arrayList3;
                            arrayList10 = arrayList4;
                        }
                        arrayList11 = arrayList17;
                        if (c5144d10.f41422I.f41411f == null) {
                            if (arrayList12 == null) {
                            }
                            ArrayList arrayList192 = arrayList12;
                            arrayList192.add(c5144d10);
                            arrayList12 = arrayList192;
                        }
                        if (c5144d10.J.f41411f == null) {
                            if (arrayList13 == null) {
                            }
                            ArrayList arrayList202 = arrayList13;
                            arrayList202.add(c5144d10);
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
                            AbstractC5191h.b((h) it.next(), 0, arrayList25, null);
                        }
                    }
                    int i36 = 0;
                    C5198o c5198o5 = null;
                    if (arrayList22 != null) {
                        Iterator it2 = arrayList22.iterator();
                        while (it2.hasNext()) {
                            i iVar2 = (i) it2.next();
                            C5198o b11 = AbstractC5191h.b(iVar2, i36, arrayList25, c5198o5);
                            iVar2.R(i36, arrayList25, b11);
                            b11.a(arrayList25);
                            i36 = 0;
                            c5198o5 = null;
                        }
                    }
                    HashSet hashSet = i(2).f41406a;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            AbstractC5191h.b(((C5143c) it3.next()).f41409d, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet2 = i(4).f41406a;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            AbstractC5191h.b(((C5143c) it4.next()).f41409d, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet3 = i(7).f41406a;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            AbstractC5191h.b(((C5143c) it5.next()).f41409d, 0, arrayList25, null);
                        }
                    }
                    C5198o c5198o6 = null;
                    if (arrayList12 != null) {
                        Iterator it6 = arrayList12.iterator();
                        while (it6.hasNext()) {
                            AbstractC5191h.b((C5144d) it6.next(), 0, arrayList25, null);
                        }
                    }
                    if (arrayList23 != null) {
                        Iterator it7 = arrayList23.iterator();
                        while (it7.hasNext()) {
                            AbstractC5191h.b((h) it7.next(), 1, arrayList25, null);
                        }
                    }
                    int i37 = 1;
                    if (arrayList24 != null) {
                        Iterator it8 = arrayList24.iterator();
                        while (it8.hasNext()) {
                            i iVar3 = (i) it8.next();
                            C5198o b12 = AbstractC5191h.b(iVar3, i37, arrayList25, c5198o6);
                            iVar3.R(i37, arrayList25, b12);
                            b12.a(arrayList25);
                            i37 = 1;
                            c5198o6 = null;
                        }
                    }
                    HashSet hashSet4 = i(3).f41406a;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            AbstractC5191h.b(((C5143c) it9.next()).f41409d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet5 = i(6).f41406a;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            AbstractC5191h.b(((C5143c) it10.next()).f41409d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet6 = i(5).f41406a;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            AbstractC5191h.b(((C5143c) it11.next()).f41409d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet7 = i(7).f41406a;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            AbstractC5191h.b(((C5143c) it12.next()).f41409d, 1, arrayList25, null);
                        }
                    }
                    if (arrayList13 != null) {
                        Iterator it13 = arrayList13.iterator();
                        while (it13.hasNext()) {
                            AbstractC5191h.b((C5144d) it13.next(), 1, arrayList25, null);
                        }
                    }
                    int i38 = 0;
                    while (i38 < size3) {
                        C5144d c5144d11 = (C5144d) arrayList7.get(i38);
                        int[] iArr5 = c5144d11.f41467p0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i39 = c5144d11.f41463n0;
                            int size4 = arrayList25.size();
                            int i40 = 0;
                            while (true) {
                                if (i40 >= size4) {
                                    i12 = i38;
                                    c5198o3 = null;
                                    break;
                                }
                                i12 = i38;
                                c5198o3 = (C5198o) arrayList25.get(i40);
                                int i41 = size4;
                                if (i39 == c5198o3.f41753b) {
                                    break;
                                }
                                i40++;
                                size4 = i41;
                                i38 = i12;
                            }
                            int i42 = c5144d11.f41465o0;
                            int size5 = arrayList25.size();
                            int i43 = 0;
                            while (true) {
                                if (i43 >= size5) {
                                    c5198o4 = null;
                                    break;
                                }
                                c5198o4 = (C5198o) arrayList25.get(i43);
                                int i44 = size5;
                                if (i42 == c5198o4.f41753b) {
                                    break;
                                }
                                i43++;
                                size5 = i44;
                            }
                            if (c5198o3 != null && c5198o4 != null) {
                                c5198o3.c(0, c5198o4);
                                c5198o4.f41754c = 2;
                                arrayList25.remove(c5198o3);
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
                            c5198o = null;
                            while (it14.hasNext()) {
                                C5198o c5198o7 = (C5198o) it14.next();
                                if (c5198o7.f41754c != 1 && (b10 = c5198o7.b(c5086c2, 0)) > i45) {
                                    c5198o = c5198o7;
                                    i45 = b10;
                                }
                            }
                            c9 = 1;
                            if (c5198o != null) {
                                M(1);
                                O(i45);
                                if (objArr[c9] == 2) {
                                    Iterator it15 = arrayList25.iterator();
                                    int i46 = 0;
                                    c5198o2 = null;
                                    while (it15.hasNext()) {
                                        C5198o c5198o8 = (C5198o) it15.next();
                                        if (c5198o8.f41754c != 0 && (b9 = c5198o8.b(c5086c2, 1)) > i46) {
                                            c5198o2 = c5198o8;
                                            i46 = b9;
                                        }
                                    }
                                    if (c5198o2 != null) {
                                        N(1);
                                        L(i46);
                                        if (c5198o == null || c5198o2 != null) {
                                            if (i15 == 2) {
                                                if (max5 >= q() || max5 <= 0) {
                                                    max5 = q();
                                                } else {
                                                    O(max5);
                                                    this.f41481E0 = true;
                                                }
                                            }
                                            if (i14 == 2) {
                                                if (max6 >= k() || max6 <= 0) {
                                                    max6 = k();
                                                } else {
                                                    L(max6);
                                                    this.f41482F0 = true;
                                                }
                                            }
                                            i = max6;
                                            i4 = max5;
                                            z8 = true;
                                        }
                                    }
                                }
                                c5198o2 = null;
                                if (c5198o == null) {
                                }
                                if (i15 == 2) {
                                }
                                if (i14 == 2) {
                                }
                                i = max6;
                                i4 = max5;
                                z8 = true;
                            }
                        } else {
                            c9 = 1;
                        }
                        c5198o = null;
                        if (objArr[c9] == 2) {
                        }
                        c5198o2 = null;
                        if (c5198o == null) {
                        }
                        if (i15 == 2) {
                        }
                        if (i14 == 2) {
                        }
                        i = max6;
                        i4 = max5;
                        z8 = true;
                    }
                }
            }
            boolean z24 = !W(64) || W(128);
            c5086c2.getClass();
            c5086c2.f40977h = false;
            if (this.f41480D0 == 0 && z24) {
                c4 = 1;
                c5086c2.f40977h = true;
            } else {
                c4 = 1;
            }
            ArrayList arrayList26 = this.f41489q0;
            boolean z25 = objArr[0] != 2 || objArr[c4] == 2;
            this.f41498z0 = 0;
            this.f41478A0 = 0;
            for (i9 = 0; i9 < size; i9++) {
                C5144d c5144d12 = (C5144d) this.f41489q0.get(i9);
                if (c5144d12 instanceof C5145e) {
                    ((C5145e) c5144d12).U();
                }
            }
            boolean W8 = W(64);
            z9 = z8;
            int i47 = 0;
            z10 = true;
            while (z10) {
                int i48 = i47 + 1;
                try {
                    c5086c2.t();
                    this.f41498z0 = 0;
                    this.f41478A0 = 0;
                    g(c5086c2);
                    for (int i49 = 0; i49 < size; i49++) {
                        ((C5144d) this.f41489q0.get(i49)).g(c5086c2);
                    }
                    S(c5086c2);
                    try {
                        WeakReference weakReference = this.f41483G0;
                        if (weakReference == null || weakReference.get() == null) {
                            c5143c2 = c5143c3;
                            z11 = z25;
                        } else {
                            C5143c c5143c5 = (C5143c) this.f41483G0.get();
                            C5089f k6 = c5086c2.k(c5143c3);
                            C5086c c5086c3 = this.f41495w0;
                            c5143c2 = c5143c3;
                            z11 = z25;
                            try {
                                c5086c3.f(c5086c3.k(c5143c5), k6, 0, 5);
                                this.f41483G0 = null;
                            } catch (Exception e6) {
                                e = e6;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2 = j.f41559a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f41441b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41443c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5143c3 = c5143c2;
                                z25 = z11;
                            }
                        }
                        WeakReference weakReference2 = this.f41485I0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            C5143c c5143c6 = (C5143c) this.f41485I0.get();
                            C5089f k9 = c5086c2.k(this.f41424L);
                            C5086c c5086c4 = this.f41495w0;
                            c5086c4.f(k9, c5086c4.k(c5143c6), 0, 5);
                            this.f41485I0 = null;
                        }
                        WeakReference weakReference3 = this.f41484H0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            C5143c c5143c7 = (C5143c) this.f41484H0.get();
                            C5143c c5143c8 = c5143c;
                            try {
                                C5089f k10 = c5086c2.k(c5143c8);
                                C5086c c5086c5 = this.f41495w0;
                                c5143c = c5143c8;
                                c5086c5.f(c5086c5.k(c5143c7), k10, 0, 5);
                                this.f41484H0 = null;
                            } catch (Exception e9) {
                                e = e9;
                                c5143c = c5143c8;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22 = j.f41559a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f41441b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41443c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5143c3 = c5143c2;
                                z25 = z11;
                            }
                        }
                        WeakReference weakReference4 = this.f41486J0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            C5143c c5143c9 = (C5143c) this.f41486J0.get();
                            C5089f k11 = c5086c2.k(this.f41423K);
                            try {
                                c5086c = this.f41495w0;
                            } catch (Exception e10) {
                                e = e10;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr222 = j.f41559a;
                                if (z10) {
                                }
                                if (z11) {
                                    int i50 = 0;
                                    int i51 = 0;
                                    while (i11 < size) {
                                    }
                                    max3 = Math.max(this.f41441b0, i50);
                                    max4 = Math.max(this.f41443c0, i51);
                                    if (i15 == 2) {
                                        O(max3);
                                        objArr[0] = 2;
                                        z9 = true;
                                        z12 = true;
                                    }
                                    if (i14 == 2) {
                                        L(max4);
                                        objArr[1] = 2;
                                        z9 = true;
                                        z12 = true;
                                    }
                                }
                                max = Math.max(this.f41441b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41443c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5143c3 = c5143c2;
                                z25 = z11;
                            }
                            try {
                                c5086c.f(k11, c5086c.k(c5143c9), 0, 5);
                            } catch (Exception e11) {
                                e = e11;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2222 = j.f41559a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f41441b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41443c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5143c3 = c5143c2;
                                z25 = z11;
                            }
                            try {
                                this.f41486J0 = null;
                            } catch (Exception e12) {
                                e = e12;
                                z10 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr22222 = j.f41559a;
                                if (z10) {
                                }
                                if (z11) {
                                }
                                max = Math.max(this.f41441b0, q());
                                if (max <= q()) {
                                }
                                max2 = Math.max(this.f41443c0, k());
                                if (max2 <= k()) {
                                }
                                if (!z14) {
                                }
                                z9 = z14;
                                z15 = z12;
                                i10 = 8;
                                if (i48 > i10) {
                                }
                                i47 = i48;
                                c5143c3 = c5143c2;
                                z25 = z11;
                            }
                        }
                        c5086c2.p();
                        z10 = true;
                    } catch (Exception e13) {
                        e = e13;
                        c5143c2 = c5143c3;
                        z11 = z25;
                    }
                } catch (Exception e14) {
                    e = e14;
                    c5143c2 = c5143c3;
                    z11 = z25;
                }
                boolean[] zArr222222 = j.f41559a;
                if (z10) {
                    zArr = zArr222222;
                    Q(c5086c2, W8);
                    for (int i52 = 0; i52 < size; i52++) {
                        ((C5144d) this.f41489q0.get(i52)).Q(c5086c2, W8);
                    }
                    z12 = false;
                } else {
                    zArr222222[2] = false;
                    boolean W9 = W(64);
                    Q(c5086c2, W9);
                    int size6 = this.f41489q0.size();
                    int i53 = 0;
                    z12 = false;
                    while (i53 < size6) {
                        C5144d c5144d13 = (C5144d) this.f41489q0.get(i53);
                        c5144d13.Q(c5086c2, W9);
                        boolean[] zArr3 = zArr222222;
                        boolean z26 = W9;
                        if (c5144d13.f41452h != -1 || c5144d13.i != -1) {
                            z12 = true;
                        }
                        i53++;
                        zArr222222 = zArr3;
                        W9 = z26;
                    }
                    zArr = zArr222222;
                }
                if (z11 && i48 < 8 && zArr[2]) {
                    int i502 = 0;
                    int i512 = 0;
                    for (i11 = 0; i11 < size; i11++) {
                        C5144d c5144d14 = (C5144d) this.f41489q0.get(i11);
                        i502 = Math.max(i502, c5144d14.q() + c5144d14.Y);
                        i512 = Math.max(i512, c5144d14.k() + c5144d14.f41437Z);
                    }
                    max3 = Math.max(this.f41441b0, i502);
                    max4 = Math.max(this.f41443c0, i512);
                    if (i15 == 2 && q() < max3) {
                        O(max3);
                        objArr[0] = 2;
                        z9 = true;
                        z12 = true;
                    }
                    if (i14 == 2 && k() < max4) {
                        L(max4);
                        objArr[1] = 2;
                        z9 = true;
                        z12 = true;
                    }
                }
                max = Math.max(this.f41441b0, q());
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
                max2 = Math.max(this.f41443c0, k());
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
                        this.f41481E0 = r14;
                        objArr[0] = r14;
                        O(i4);
                        z14 = r14;
                        z12 = z14;
                    }
                    if (objArr[r14] == 2 && i > 0 && k() > i) {
                        this.f41482F0 = r14;
                        objArr[r14] = r14;
                        L(i);
                        i10 = 8;
                        z15 = true;
                        z9 = true;
                        z10 = i48 > i10 ? false : z15;
                        i47 = i48;
                        c5143c3 = c5143c2;
                        z25 = z11;
                    }
                }
                z9 = z14;
                z15 = z12;
                i10 = 8;
                if (i48 > i10) {
                }
                i47 = i48;
                c5143c3 = c5143c2;
                z25 = z11;
            }
            this.f41489q0 = arrayList26;
            if (z9) {
                objArr[0] = i15;
                objArr[1] = i14;
            }
            F(c5086c2.f40981m);
        }
        c5143c = c5143c4;
        i = max6;
        i4 = max5;
        z8 = false;
        if (W(64)) {
        }
        c5086c2.getClass();
        c5086c2.f40977h = false;
        if (this.f41480D0 == 0) {
        }
        c4 = 1;
        ArrayList arrayList262 = this.f41489q0;
        if (objArr[0] != 2) {
        }
        this.f41498z0 = 0;
        this.f41478A0 = 0;
        while (i9 < size) {
        }
        boolean W82 = W(64);
        z9 = z8;
        int i472 = 0;
        z10 = true;
        while (z10) {
        }
        this.f41489q0 = arrayList262;
        if (z9) {
        }
        F(c5086c2.f40981m);
    }

    public final boolean W(int i) {
        return (this.f41480D0 & i) == i;
    }

    @Override // w.C5144d
    public final void n(StringBuilder sb) {
        sb.append(this.f41455j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f41433U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f41434V);
        sb.append("\n");
        Iterator it = this.f41489q0.iterator();
        while (it.hasNext()) {
            ((C5144d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
