package w;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import u.C0355c;
import x.AbstractC0373h;
import x.C0367b;
import x.C0368c;
import x.C0370e;
import x.n;
import x.o;
import z.C0384f;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: A0, reason: collision with root package name */
    public int f4586A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0364b[] f4587B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0364b[] f4588C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f4589D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4590E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f4591F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f4592G0;
    public WeakReference H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f4593I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f4594J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f4595K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0367b f4596L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f4597q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final M0.h f4598r0 = new M0.h(this);
    public final C0370e s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4599t0;

    /* renamed from: u0, reason: collision with root package name */
    public C0384f f4600u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4601v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0355c f4602w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f4603x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f4604y0;
    public int z0;

    public e() {
        C0370e c0370e = new C0370e();
        c0370e.f4679b = true;
        c0370e.f4680c = true;
        c0370e.e = new ArrayList();
        new ArrayList();
        c0370e.f4682f = null;
        c0370e.f4683g = new C0367b();
        c0370e.f4684h = new ArrayList();
        c0370e.f4678a = this;
        c0370e.f4681d = this;
        this.s0 = c0370e;
        this.f4600u0 = null;
        this.f4601v0 = false;
        this.f4602w0 = new C0355c();
        this.z0 = 0;
        this.f4586A0 = 0;
        this.f4587B0 = new C0364b[4];
        this.f4588C0 = new C0364b[4];
        this.f4589D0 = 257;
        this.f4590E0 = false;
        this.f4591F0 = false;
        this.f4592G0 = null;
        this.H0 = null;
        this.f4593I0 = null;
        this.f4594J0 = null;
        this.f4595K0 = new HashSet();
        this.f4596L0 = new C0367b();
    }

    public static void V(d dVar, C0384f c0384f, C0367b c0367b) {
        int i;
        int i2;
        if (c0384f == null) {
            return;
        }
        if (dVar.f4559g0 == 8 || (dVar instanceof h) || (dVar instanceof C0363a)) {
            c0367b.e = 0;
            c0367b.f4673f = 0;
            return;
        }
        int[] iArr = dVar.f4575p0;
        c0367b.f4669a = iArr[0];
        c0367b.f4670b = iArr[1];
        c0367b.f4671c = dVar.q();
        c0367b.f4672d = dVar.k();
        c0367b.i = false;
        c0367b.j = 0;
        boolean z2 = c0367b.f4669a == 3;
        boolean z3 = c0367b.f4670b == 3;
        boolean z4 = z2 && dVar.f4543W > RecyclerView.f2111C0;
        boolean z5 = z3 && dVar.f4543W > RecyclerView.f2111C0;
        if (z2 && dVar.t(0) && dVar.f4577r == 0 && !z4) {
            c0367b.f4669a = 2;
            if (z3 && dVar.f4578s == 0) {
                c0367b.f4669a = 1;
            }
            z2 = false;
        }
        if (z3 && dVar.t(1) && dVar.f4578s == 0 && !z5) {
            c0367b.f4670b = 2;
            if (z2 && dVar.f4577r == 0) {
                c0367b.f4670b = 1;
            }
            z3 = false;
        }
        if (dVar.A()) {
            c0367b.f4669a = 1;
            z2 = false;
        }
        if (dVar.B()) {
            c0367b.f4670b = 1;
            z3 = false;
        }
        int[] iArr2 = dVar.f4579t;
        if (z4) {
            if (iArr2[0] == 4) {
                c0367b.f4669a = 1;
            } else if (!z3) {
                if (c0367b.f4670b == 1) {
                    i2 = c0367b.f4672d;
                } else {
                    c0367b.f4669a = 2;
                    c0384f.b(dVar, c0367b);
                    i2 = c0367b.f4673f;
                }
                c0367b.f4669a = 1;
                c0367b.f4671c = (int) (dVar.f4543W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c0367b.f4670b = 1;
            } else if (!z2) {
                if (c0367b.f4669a == 1) {
                    i = c0367b.f4671c;
                } else {
                    c0367b.f4670b = 2;
                    c0384f.b(dVar, c0367b);
                    i = c0367b.e;
                }
                c0367b.f4670b = 1;
                if (dVar.f4544X == -1) {
                    c0367b.f4672d = (int) (i / dVar.f4543W);
                } else {
                    c0367b.f4672d = (int) (dVar.f4543W * i);
                }
            }
        }
        c0384f.b(dVar, c0367b);
        dVar.O(c0367b.e);
        dVar.L(c0367b.f4673f);
        dVar.f4526E = c0367b.f4675h;
        dVar.I(c0367b.f4674g);
        c0367b.j = 0;
    }

    @Override // w.d
    public final void C() {
        this.f4602w0.t();
        this.f4603x0 = 0;
        this.f4604y0 = 0;
        this.f4597q0.clear();
        super.C();
    }

    @Override // w.d
    public final void F(M0.h hVar) {
        super.F(hVar);
        int size = this.f4597q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f4597q0.get(i)).F(hVar);
        }
    }

    @Override // w.d
    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f4597q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f4597q0.get(i)).P(z2, z3);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            C0364b[] c0364bArr = this.f4588C0;
            if (i2 >= c0364bArr.length) {
                this.f4588C0 = (C0364b[]) Arrays.copyOf(c0364bArr, c0364bArr.length * 2);
            }
            C0364b[] c0364bArr2 = this.f4588C0;
            int i3 = this.z0;
            c0364bArr2[i3] = new C0364b(dVar, 0, this.f4601v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f4586A0 + 1;
            C0364b[] c0364bArr3 = this.f4587B0;
            if (i4 >= c0364bArr3.length) {
                this.f4587B0 = (C0364b[]) Arrays.copyOf(c0364bArr3, c0364bArr3.length * 2);
            }
            C0364b[] c0364bArr4 = this.f4587B0;
            int i5 = this.f4586A0;
            c0364bArr4[i5] = new C0364b(dVar, 1, this.f4601v0);
            this.f4586A0 = i5 + 1;
        }
    }

    public final void S(C0355c c0355c) {
        boolean W2 = W(64);
        b(c0355c, W2);
        int size = this.f4597q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f4597q0.get(i);
            boolean[] zArr = dVar.f4539S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0363a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar2 = (d) this.f4597q0.get(i2);
                if (dVar2 instanceof C0363a) {
                    C0363a c0363a = (C0363a) dVar2;
                    for (int i3 = 0; i3 < c0363a.f4659r0; i3++) {
                        d dVar3 = c0363a.f4658q0[i3];
                        if (c0363a.f4498t0 || dVar3.c()) {
                            int i4 = c0363a.s0;
                            if (i4 == 0 || i4 == 1) {
                                dVar3.f4539S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                dVar3.f4539S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f4595K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar4 = (d) this.f4597q0.get(i5);
            dVar4.getClass();
            boolean z3 = dVar4 instanceof g;
            if (z3 || (dVar4 instanceof h)) {
                if (z3) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(c0355c, W2);
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
                g gVar = (g) ((d) it.next());
                for (int i6 = 0; i6 < gVar.f4659r0; i6++) {
                    if (hashSet.contains(gVar.f4658q0[i6])) {
                        gVar.b(c0355c, W2);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(c0355c, W2);
                }
                hashSet.clear();
            }
        }
        if (C0355c.f4403q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar5 = (d) this.f4597q0.get(i7);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            a(this, c0355c, hashSet2, this.f4575p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, c0355c, dVar6);
                dVar6.b(c0355c, W2);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                d dVar7 = (d) this.f4597q0.get(i8);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f4575p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        dVar7.M(1);
                    }
                    if (i10 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(c0355c, W2);
                    if (i9 == 2) {
                        dVar7.M(i9);
                    }
                    if (i10 == 2) {
                        dVar7.N(i10);
                    }
                } else {
                    j.b(this, c0355c, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(c0355c, W2);
                    }
                }
            }
        }
        if (this.z0 > 0) {
            j.a(this, c0355c, null, 0);
        }
        if (this.f4586A0 > 0) {
            j.a(this, c0355c, null, 1);
        }
    }

    public final boolean T(int i, boolean z2) {
        boolean z3;
        C0370e c0370e = this.s0;
        e eVar = c0370e.f4678a;
        boolean z4 = false;
        int j = eVar.j(0);
        int j2 = eVar.j(1);
        int r2 = eVar.r();
        int s2 = eVar.s();
        ArrayList arrayList = c0370e.e;
        if (z2 && (j == 2 || j2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f4710f == i && !oVar.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && j == 2) {
                    eVar.M(1);
                    eVar.O(c0370e.d(eVar, 0));
                    eVar.f4553d.e.d(eVar.q());
                }
            } else if (z2 && j2 == 2) {
                eVar.N(1);
                eVar.L(c0370e.d(eVar, 1));
                eVar.e.e.d(eVar.k());
            }
        }
        int[] iArr = eVar.f4575p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int q2 = eVar.q() + r2;
                eVar.f4553d.i.d(q2);
                eVar.f4553d.e.d(q2 - r2);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int k2 = eVar.k() + s2;
                eVar.e.i.d(k2);
                eVar.e.e.d(k2 - s2);
                z3 = true;
            }
            z3 = false;
        }
        c0370e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            if (oVar2.f4710f == i && (oVar2.f4707b != eVar || oVar2.f4711g)) {
                oVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            o oVar3 = (o) it3.next();
            if (oVar3.f4710f == i && (z3 || oVar3.f4707b != eVar)) {
                if (!oVar3.f4712h.j) {
                    break;
                }
                if (!oVar3.i.j) {
                    break;
                }
                if (!(oVar3 instanceof C0368c) && !oVar3.e.j) {
                    break;
                }
            }
        }
        eVar.M(j);
        eVar.N(j2);
        return z4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:227|228|229|(1:231)|232|233|(2:234|235)|(3:353|354|(28:356|357|358|359|360|361|362|238|239|(1:243)|244|(6:248|249|250|251|252|253)|325|(1:350)(9:329|330|331|332|333|334|335|336|337)|338|339|260|(4:262|(3:264|(2:270|271)(1:268)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)(1:319)|295|(1:297)(1:318)|(1:317)(4:299|(1:304)|305|(3:310|(2:312|313)(1:315)|314))|316|(0)(0)|314))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|325|(1:327)|350|338|339|260|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)(0)|295|(0)(0)|(0)(0)|316|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0797, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0824 A[LOOP:14: B:280:0x0822->B:281:0x0824, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0633  */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        int i;
        Object[] objArr;
        c cVar;
        int i2;
        int i3;
        c cVar2;
        int i4;
        int i5;
        C0355c c0355c;
        int i6;
        boolean z2;
        char c2;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int max;
        ?? r6;
        boolean z7;
        int max2;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int max3;
        int max4;
        WeakReference weakReference;
        u.f k2;
        C0355c c0355c2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0355c c0355c3;
        c cVar3;
        int i11;
        int i12;
        int i13;
        char c3;
        n nVar;
        n nVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int b2;
        n nVar3;
        n nVar4;
        int[] iArr;
        this.f4545Y = 0;
        this.f4546Z = 0;
        this.f4590E0 = false;
        this.f4591F0 = false;
        int size = this.f4597q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr2 = this.f4575p0;
        int i18 = iArr2[1];
        int i19 = iArr2[0];
        int i20 = this.f4599t0;
        c cVar4 = this.J;
        c cVar5 = this.f4530I;
        if (i20 == 0 && j.c(this.f4589D0, 1)) {
            C0384f c0384f = this.f4600u0;
            int i21 = iArr2[0];
            int i22 = iArr2[1];
            E();
            ArrayList arrayList = this.f4597q0;
            int size2 = arrayList.size();
            for (int i23 = 0; i23 < size2; i23++) {
                ((d) arrayList.get(i23)).E();
            }
            boolean z10 = this.f4601v0;
            if (i21 == 1) {
                J(0, q());
            } else {
                cVar5.l(0);
                this.f4545Y = 0;
            }
            int i24 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i24 < size2) {
                c cVar6 = cVar5;
                d dVar = (d) arrayList.get(i24);
                int i25 = max6;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    iArr = iArr2;
                    if (hVar.f4656u0 == 1) {
                        int i26 = hVar.f4654r0;
                        if (i26 != -1) {
                            hVar.R(i26);
                        } else if (hVar.s0 != -1 && A()) {
                            hVar.R(q() - hVar.s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f4653q0 * q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((dVar instanceof C0363a) && ((C0363a) dVar).U() == 0) {
                        z12 = true;
                    }
                }
                i24++;
                max6 = i25;
                cVar5 = cVar6;
                iArr2 = iArr;
            }
            i = max6;
            objArr = iArr2;
            cVar = cVar5;
            if (z11) {
                for (int i27 = 0; i27 < size2; i27++) {
                    d dVar2 = (d) arrayList.get(i27);
                    if (dVar2 instanceof h) {
                        h hVar2 = (h) dVar2;
                        if (hVar2.f4656u0 == 1) {
                            AbstractC0373h.c(0, hVar2, c0384f, z10);
                        }
                    }
                }
            }
            AbstractC0373h.c(0, this, c0384f, z10);
            if (z12) {
                for (int i28 = 0; i28 < size2; i28++) {
                    d dVar3 = (d) arrayList.get(i28);
                    if (dVar3 instanceof C0363a) {
                        C0363a c0363a = (C0363a) dVar3;
                        if (c0363a.U() == 0 && c0363a.T()) {
                            AbstractC0373h.c(1, c0363a, c0384f, z10);
                        }
                    }
                }
            }
            if (i22 == 1) {
                K(0, k());
            } else {
                cVar4.l(0);
                this.f4546Z = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i29 = 0; i29 < size2; i29++) {
                d dVar4 = (d) arrayList.get(i29);
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f4656u0 == 0) {
                        int i30 = hVar3.f4654r0;
                        if (i30 != -1) {
                            hVar3.R(i30);
                        } else if (hVar3.s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f4653q0 * k()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((dVar4 instanceof C0363a) && ((C0363a) dVar4).U() == 1) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    d dVar5 = (d) arrayList.get(i31);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f4656u0 == 0) {
                            AbstractC0373h.i(1, hVar4, c0384f);
                        }
                    }
                }
            }
            AbstractC0373h.i(0, this, c0384f);
            if (z14) {
                for (int i32 = 0; i32 < size2; i32++) {
                    d dVar6 = (d) arrayList.get(i32);
                    if (dVar6 instanceof C0363a) {
                        C0363a c0363a2 = (C0363a) dVar6;
                        if (c0363a2.U() == 1 && c0363a2.T()) {
                            AbstractC0373h.i(1, c0363a2, c0384f);
                        }
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                d dVar7 = (d) arrayList.get(i33);
                if (dVar7.z() && AbstractC0373h.a(dVar7)) {
                    V(dVar7, c0384f, AbstractC0373h.f4695a);
                    if (!(dVar7 instanceof h)) {
                        AbstractC0373h.c(0, dVar7, c0384f, z10);
                        AbstractC0373h.i(0, dVar7, c0384f);
                    } else if (((h) dVar7).f4656u0 == 0) {
                        AbstractC0373h.i(0, dVar7, c0384f);
                    } else {
                        AbstractC0373h.c(0, dVar7, c0384f, z10);
                    }
                }
            }
            for (int i34 = 0; i34 < size; i34++) {
                d dVar8 = (d) this.f4597q0.get(i34);
                if (dVar8.z() && !(dVar8 instanceof h) && !(dVar8 instanceof C0363a) && !(dVar8 instanceof g) && !dVar8.f4527F) {
                    int j = dVar8.j(0);
                    int j2 = dVar8.j(1);
                    if (j != 3 || dVar8.f4577r == 1 || j2 != 3 || dVar8.f4578s == 1) {
                        V(dVar8, this.f4600u0, new C0367b());
                    }
                }
            }
        } else {
            i = max6;
            objArr = iArr2;
            cVar = cVar5;
        }
        C0355c c0355c4 = this.f4602w0;
        if (size <= 2 || !((i19 == 2 || i18 == 2) && j.c(this.f4589D0, 1024))) {
            i2 = size;
            i3 = i18;
            cVar2 = cVar4;
            i4 = i;
            i5 = max5;
            c0355c = c0355c4;
            i6 = i19;
        } else {
            C0384f c0384f2 = this.f4600u0;
            ArrayList arrayList2 = this.f4597q0;
            int size3 = arrayList2.size();
            int i35 = 0;
            while (i35 < size3) {
                d dVar9 = (d) arrayList2.get(i35);
                char c4 = objArr[0];
                char c5 = objArr[1];
                int[] iArr3 = dVar9.f4575p0;
                cVar2 = cVar4;
                if (!AbstractC0373h.h(c4, c5, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                    i11 = max5;
                    i2 = size;
                    i12 = i18;
                    i13 = i19;
                    c0355c = c0355c4;
                    break;
                }
                i35++;
                cVar4 = cVar2;
            }
            cVar2 = cVar4;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = size;
                d dVar10 = (d) arrayList2.get(i36);
                int i38 = i18;
                char c6 = objArr[0];
                int i39 = max5;
                char c7 = objArr[1];
                int i40 = i19;
                int[] iArr4 = dVar10.f4575p0;
                C0355c c0355c5 = c0355c4;
                if (!AbstractC0373h.h(c6, c7, iArr4[0], iArr4[1])) {
                    V(dVar10, c0384f2, this.f4596L0);
                }
                boolean z15 = dVar10 instanceof h;
                if (z15) {
                    h hVar5 = (h) dVar10;
                    if (hVar5.f4656u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(hVar5);
                    }
                    if (hVar5.f4656u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hVar5);
                    }
                }
                if (dVar10 instanceof i) {
                    if (dVar10 instanceof C0363a) {
                        C0363a c0363a3 = (C0363a) dVar10;
                        if (c0363a3.U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c0363a3);
                        }
                        if (c0363a3.U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c0363a3);
                        }
                    } else {
                        i iVar = (i) dVar10;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(iVar);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(iVar);
                    }
                }
                if (dVar10.f4530I.f4519f == null && dVar10.f4531K.f4519f == null && !z15 && !(dVar10 instanceof C0363a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(dVar10);
                }
                if (dVar10.J.f4519f == null && dVar10.f4532L.f4519f == null && dVar10.f4533M.f4519f == null && !z15 && !(dVar10 instanceof C0363a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(dVar10);
                }
                i36++;
                i18 = i38;
                size = i37;
                max5 = i39;
                i19 = i40;
                c0355c4 = c0355c5;
            }
            i11 = max5;
            C0355c c0355c6 = c0355c4;
            i2 = size;
            i12 = i18;
            i13 = i19;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    AbstractC0373h.b((h) it.next(), 0, arrayList9, null);
                }
            }
            int i41 = 0;
            n nVar5 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    n b3 = AbstractC0373h.b(iVar2, i41, arrayList9, nVar5);
                    iVar2.R(i41, arrayList9, b3);
                    b3.a(arrayList9);
                    i41 = 0;
                    nVar5 = null;
                }
            }
            HashSet hashSet = i(2).f4515a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    AbstractC0373h.b(((c) it3.next()).f4518d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f4515a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    AbstractC0373h.b(((c) it4.next()).f4518d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f4515a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    AbstractC0373h.b(((c) it5.next()).f4518d, 0, arrayList9, null);
                }
            }
            n nVar6 = null;
            if (arrayList7 != null) {
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    AbstractC0373h.b((d) it6.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    AbstractC0373h.b((h) it7.next(), 1, arrayList9, null);
                }
            }
            int i42 = 1;
            if (arrayList6 != null) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    i iVar3 = (i) it8.next();
                    n b4 = AbstractC0373h.b(iVar3, i42, arrayList9, nVar6);
                    iVar3.R(i42, arrayList9, b4);
                    b4.a(arrayList9);
                    i42 = 1;
                    nVar6 = null;
                }
            }
            HashSet hashSet4 = i(3).f4515a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    AbstractC0373h.b(((c) it9.next()).f4518d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f4515a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    AbstractC0373h.b(((c) it10.next()).f4518d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f4515a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    AbstractC0373h.b(((c) it11.next()).f4518d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f4515a;
            if (hashSet7 != null) {
                Iterator it12 = hashSet7.iterator();
                while (it12.hasNext()) {
                    AbstractC0373h.b(((c) it12.next()).f4518d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    AbstractC0373h.b((d) it13.next(), 1, arrayList9, null);
                }
            }
            for (int i43 = 0; i43 < size3; i43++) {
                d dVar11 = (d) arrayList2.get(i43);
                int[] iArr5 = dVar11.f4575p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i44 = dVar11.f4571n0;
                    int size4 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size4) {
                            nVar3 = null;
                            break;
                        }
                        nVar3 = (n) arrayList9.get(i45);
                        if (i44 == nVar3.f4703b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    int i46 = dVar11.f4573o0;
                    int size5 = arrayList9.size();
                    int i47 = 0;
                    while (true) {
                        if (i47 >= size5) {
                            nVar4 = null;
                            break;
                        }
                        nVar4 = (n) arrayList9.get(i47);
                        if (i46 == nVar4.f4703b) {
                            break;
                        } else {
                            i47++;
                        }
                    }
                    if (nVar3 != null && nVar4 != null) {
                        nVar3.c(0, nVar4);
                        nVar4.f4704c = 2;
                        arrayList9.remove(nVar3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i48 = 0;
                    nVar = null;
                    while (it14.hasNext()) {
                        n nVar7 = (n) it14.next();
                        if (nVar7.f4704c != 1) {
                            C0355c c0355c7 = c0355c6;
                            int b5 = nVar7.b(c0355c7, 0);
                            if (b5 > i48) {
                                nVar = nVar7;
                                i48 = b5;
                            }
                            c0355c6 = c0355c7;
                        }
                    }
                    c0355c = c0355c6;
                    c3 = 1;
                    if (nVar != null) {
                        M(1);
                        O(i48);
                        if (objArr[c3] == 2) {
                            Iterator it15 = arrayList9.iterator();
                            int i49 = 0;
                            nVar2 = null;
                            while (it15.hasNext()) {
                                n nVar8 = (n) it15.next();
                                if (nVar8.f4704c != 0 && (b2 = nVar8.b(c0355c, 1)) > i49) {
                                    nVar2 = nVar8;
                                    i49 = b2;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i49);
                                if (nVar == null || nVar2 != null) {
                                    i6 = i13;
                                    if (i6 == 2) {
                                        i14 = i11;
                                        if (i14 >= q() || i14 <= 0) {
                                            i15 = q();
                                            i3 = i12;
                                            if (i3 != 2) {
                                                i16 = i;
                                                if (i16 >= k() || i16 <= 0) {
                                                    i17 = k();
                                                    i4 = i17;
                                                    i5 = i15;
                                                    z2 = true;
                                                    boolean z16 = !W(64) || W(128);
                                                    c0355c.getClass();
                                                    c0355c.f4410h = false;
                                                    if (this.f4589D0 == 0 && z16) {
                                                        c2 = 1;
                                                        c0355c.f4410h = true;
                                                    } else {
                                                        c2 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f4597q0;
                                                    boolean z17 = objArr[0] != 2 || objArr[c2] == 2;
                                                    this.z0 = 0;
                                                    this.f4586A0 = 0;
                                                    i7 = i2;
                                                    for (i8 = 0; i8 < i7; i8++) {
                                                        d dVar12 = (d) this.f4597q0.get(i8);
                                                        if (dVar12 instanceof e) {
                                                            ((e) dVar12).U();
                                                        }
                                                    }
                                                    boolean W2 = W(64);
                                                    boolean z18 = z2;
                                                    int i50 = 0;
                                                    z3 = true;
                                                    while (z3) {
                                                        int i51 = i50 + 1;
                                                        try {
                                                            c0355c.t();
                                                            this.z0 = 0;
                                                            this.f4586A0 = 0;
                                                            g(c0355c);
                                                            for (int i52 = 0; i52 < i7; i52++) {
                                                                ((d) this.f4597q0.get(i52)).g(c0355c);
                                                            }
                                                            S(c0355c);
                                                            try {
                                                                weakReference = this.f4592G0;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z5 = z18;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z5 = z18;
                                                        }
                                                        if (weakReference != null) {
                                                            try {
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                z5 = z18;
                                                            }
                                                            if (weakReference.get() != null) {
                                                                c cVar7 = (c) this.f4592G0.get();
                                                                c cVar8 = cVar2;
                                                                try {
                                                                    k2 = c0355c.k(cVar8);
                                                                    c0355c2 = this.f4602w0;
                                                                    z5 = z18;
                                                                    cVar2 = cVar8;
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    z5 = z18;
                                                                    cVar2 = cVar8;
                                                                }
                                                                try {
                                                                    c0355c2.f(c0355c2.k(cVar7), k2, 0, 5);
                                                                    this.f4592G0 = null;
                                                                    weakReference2 = this.f4593I0;
                                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                                        c cVar9 = (c) this.f4593I0.get();
                                                                        u.f k3 = c0355c.k(this.f4532L);
                                                                        C0355c c0355c8 = this.f4602w0;
                                                                        c0355c8.f(k3, c0355c8.k(cVar9), 0, 5);
                                                                        this.f4593I0 = null;
                                                                    }
                                                                    weakReference3 = this.H0;
                                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                                        c cVar10 = (c) this.H0.get();
                                                                        cVar3 = cVar;
                                                                        try {
                                                                            u.f k4 = c0355c.k(cVar3);
                                                                            C0355c c0355c9 = this.f4602w0;
                                                                            cVar = cVar3;
                                                                            c0355c9.f(c0355c9.k(cVar10), k4, 0, 5);
                                                                            this.H0 = null;
                                                                        } catch (Exception e5) {
                                                                            e = e5;
                                                                            cVar = cVar3;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = j.f4660a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f4550b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f4552c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                    }
                                                                    weakReference4 = this.f4594J0;
                                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                                        c cVar11 = (c) this.f4594J0.get();
                                                                        u.f k5 = c0355c.k(this.f4531K);
                                                                        try {
                                                                            c0355c3 = this.f4602w0;
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = j.f4660a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f4550b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f4552c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                        try {
                                                                            c0355c3.f(k5, c0355c3.k(cVar11), 0, 5);
                                                                            try {
                                                                                this.f4594J0 = null;
                                                                            } catch (Exception e7) {
                                                                                e = e7;
                                                                                z3 = true;
                                                                                e.printStackTrace();
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f4660a;
                                                                                if (z3) {
                                                                                }
                                                                                if (z17) {
                                                                                }
                                                                                max = Math.max(this.f4550b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f4552c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z8) {
                                                                                }
                                                                                z18 = z8;
                                                                                z9 = z6;
                                                                                i9 = 8;
                                                                                if (i51 <= i9) {
                                                                                }
                                                                                z3 = z9;
                                                                                i50 = i51;
                                                                            }
                                                                        } catch (Exception e8) {
                                                                            e = e8;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr222 = j.f4660a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f4550b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f4552c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                    }
                                                                    c0355c.p();
                                                                    z3 = true;
                                                                } catch (Exception e9) {
                                                                    e = e9;
                                                                    z3 = true;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr2222 = j.f4660a;
                                                                    if (z3) {
                                                                    }
                                                                    if (z17) {
                                                                    }
                                                                    max = Math.max(this.f4550b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f4552c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z8) {
                                                                    }
                                                                    z18 = z8;
                                                                    z9 = z6;
                                                                    i9 = 8;
                                                                    if (i51 <= i9) {
                                                                    }
                                                                    z3 = z9;
                                                                    i50 = i51;
                                                                }
                                                                boolean[] zArr22222 = j.f4660a;
                                                                if (z3) {
                                                                    zArr22222[2] = false;
                                                                    boolean W3 = W(64);
                                                                    Q(c0355c, W3);
                                                                    int size6 = this.f4597q0.size();
                                                                    int i53 = 0;
                                                                    z6 = false;
                                                                    while (i53 < size6) {
                                                                        d dVar13 = (d) this.f4597q0.get(i53);
                                                                        dVar13.Q(c0355c, W3);
                                                                        boolean z19 = W3;
                                                                        int i54 = size6;
                                                                        if (dVar13.f4560h != -1 || dVar13.i != -1) {
                                                                            z6 = true;
                                                                        }
                                                                        i53++;
                                                                        W3 = z19;
                                                                        size6 = i54;
                                                                    }
                                                                } else {
                                                                    Q(c0355c, W2);
                                                                    for (int i55 = 0; i55 < i7; i55++) {
                                                                        ((d) this.f4597q0.get(i55)).Q(c0355c, W2);
                                                                    }
                                                                    z6 = false;
                                                                }
                                                                if (z17 && i51 < 8 && zArr22222[2]) {
                                                                    int i56 = 0;
                                                                    int i57 = 0;
                                                                    for (i10 = 0; i10 < i7; i10++) {
                                                                        d dVar14 = (d) this.f4597q0.get(i10);
                                                                        i56 = Math.max(i56, dVar14.q() + dVar14.f4545Y);
                                                                        i57 = Math.max(i57, dVar14.k() + dVar14.f4546Z);
                                                                    }
                                                                    max3 = Math.max(this.f4550b0, i56);
                                                                    max4 = Math.max(this.f4552c0, i57);
                                                                    if (i6 == 2 && q() < max3) {
                                                                        O(max3);
                                                                        objArr[0] = 2;
                                                                        z6 = true;
                                                                        z5 = true;
                                                                    }
                                                                    if (i3 == 2 && k() < max4) {
                                                                        L(max4);
                                                                        objArr[1] = 2;
                                                                        z6 = true;
                                                                        z5 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.f4550b0, q());
                                                                if (max > q()) {
                                                                    O(max);
                                                                    r6 = 1;
                                                                    objArr[0] = 1;
                                                                    z6 = true;
                                                                    z7 = true;
                                                                } else {
                                                                    r6 = 1;
                                                                    z7 = z5;
                                                                }
                                                                max2 = Math.max(this.f4552c0, k());
                                                                if (max2 > k()) {
                                                                    L(max2);
                                                                    objArr[r6] = r6;
                                                                    z8 = r6;
                                                                    z6 = z8;
                                                                } else {
                                                                    z8 = z7;
                                                                }
                                                                if (!z8) {
                                                                    if (objArr[0] == 2 && i5 > 0 && q() > i5) {
                                                                        this.f4590E0 = r6;
                                                                        objArr[0] = r6;
                                                                        O(i5);
                                                                        z8 = r6;
                                                                        z6 = z8;
                                                                    }
                                                                    if (objArr[r6] == 2 && i4 > 0 && k() > i4) {
                                                                        this.f4591F0 = r6;
                                                                        objArr[r6] = r6;
                                                                        L(i4);
                                                                        i9 = 8;
                                                                        z9 = true;
                                                                        z18 = true;
                                                                        if (i51 <= i9) {
                                                                            z9 = false;
                                                                        }
                                                                        z3 = z9;
                                                                        i50 = i51;
                                                                    }
                                                                }
                                                                z18 = z8;
                                                                z9 = z6;
                                                                i9 = 8;
                                                                if (i51 <= i9) {
                                                                }
                                                                z3 = z9;
                                                                i50 = i51;
                                                            }
                                                        }
                                                        z5 = z18;
                                                        weakReference2 = this.f4593I0;
                                                        if (weakReference2 != null) {
                                                            c cVar92 = (c) this.f4593I0.get();
                                                            u.f k32 = c0355c.k(this.f4532L);
                                                            C0355c c0355c82 = this.f4602w0;
                                                            c0355c82.f(k32, c0355c82.k(cVar92), 0, 5);
                                                            this.f4593I0 = null;
                                                        }
                                                        weakReference3 = this.H0;
                                                        if (weakReference3 != null) {
                                                            c cVar102 = (c) this.H0.get();
                                                            cVar3 = cVar;
                                                            u.f k42 = c0355c.k(cVar3);
                                                            C0355c c0355c92 = this.f4602w0;
                                                            cVar = cVar3;
                                                            c0355c92.f(c0355c92.k(cVar102), k42, 0, 5);
                                                            this.H0 = null;
                                                        }
                                                        weakReference4 = this.f4594J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        c0355c.p();
                                                        z3 = true;
                                                        boolean[] zArr222222 = j.f4660a;
                                                        if (z3) {
                                                        }
                                                        if (z17) {
                                                            int i562 = 0;
                                                            int i572 = 0;
                                                            while (i10 < i7) {
                                                            }
                                                            max3 = Math.max(this.f4550b0, i562);
                                                            max4 = Math.max(this.f4552c0, i572);
                                                            if (i6 == 2) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z6 = true;
                                                                z5 = true;
                                                            }
                                                            if (i3 == 2) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z6 = true;
                                                                z5 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.f4550b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f4552c0, k());
                                                        if (max2 > k()) {
                                                        }
                                                        if (!z8) {
                                                        }
                                                        z18 = z8;
                                                        z9 = z6;
                                                        i9 = 8;
                                                        if (i51 <= i9) {
                                                        }
                                                        z3 = z9;
                                                        i50 = i51;
                                                    }
                                                    z4 = z18;
                                                    this.f4597q0 = arrayList10;
                                                    if (z4) {
                                                        objArr[0] = i6;
                                                        objArr[1] = i3;
                                                    }
                                                    F(c0355c.f4413m);
                                                }
                                                L(i16);
                                                this.f4591F0 = true;
                                            } else {
                                                i16 = i;
                                            }
                                            i17 = i16;
                                            i4 = i17;
                                            i5 = i15;
                                            z2 = true;
                                            if (W(64)) {
                                            }
                                            c0355c.getClass();
                                            c0355c.f4410h = false;
                                            if (this.f4589D0 == 0) {
                                            }
                                            c2 = 1;
                                            ArrayList arrayList102 = this.f4597q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.z0 = 0;
                                            this.f4586A0 = 0;
                                            i7 = i2;
                                            while (i8 < i7) {
                                            }
                                            boolean W22 = W(64);
                                            boolean z182 = z2;
                                            int i502 = 0;
                                            z3 = true;
                                            while (z3) {
                                            }
                                            z4 = z182;
                                            this.f4597q0 = arrayList102;
                                            if (z4) {
                                            }
                                            F(c0355c.f4413m);
                                        }
                                        O(i14);
                                        this.f4590E0 = true;
                                    } else {
                                        i14 = i11;
                                    }
                                    i15 = i14;
                                    i3 = i12;
                                    if (i3 != 2) {
                                    }
                                    i17 = i16;
                                    i4 = i17;
                                    i5 = i15;
                                    z2 = true;
                                    if (W(64)) {
                                    }
                                    c0355c.getClass();
                                    c0355c.f4410h = false;
                                    if (this.f4589D0 == 0) {
                                    }
                                    c2 = 1;
                                    ArrayList arrayList1022 = this.f4597q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.z0 = 0;
                                    this.f4586A0 = 0;
                                    i7 = i2;
                                    while (i8 < i7) {
                                    }
                                    boolean W222 = W(64);
                                    boolean z1822 = z2;
                                    int i5022 = 0;
                                    z3 = true;
                                    while (z3) {
                                    }
                                    z4 = z1822;
                                    this.f4597q0 = arrayList1022;
                                    if (z4) {
                                    }
                                    F(c0355c.f4413m);
                                }
                            }
                        }
                        nVar2 = null;
                        if (nVar == null) {
                        }
                        i6 = i13;
                        if (i6 == 2) {
                        }
                        i15 = i14;
                        i3 = i12;
                        if (i3 != 2) {
                        }
                        i17 = i16;
                        i4 = i17;
                        i5 = i15;
                        z2 = true;
                        if (W(64)) {
                        }
                        c0355c.getClass();
                        c0355c.f4410h = false;
                        if (this.f4589D0 == 0) {
                        }
                        c2 = 1;
                        ArrayList arrayList10222 = this.f4597q0;
                        if (objArr[0] != 2) {
                        }
                        this.z0 = 0;
                        this.f4586A0 = 0;
                        i7 = i2;
                        while (i8 < i7) {
                        }
                        boolean W2222 = W(64);
                        boolean z18222 = z2;
                        int i50222 = 0;
                        z3 = true;
                        while (z3) {
                        }
                        z4 = z18222;
                        this.f4597q0 = arrayList10222;
                        if (z4) {
                        }
                        F(c0355c.f4413m);
                    }
                } else {
                    c0355c = c0355c6;
                    c3 = 1;
                }
                nVar = null;
                if (objArr[c3] == 2) {
                }
                nVar2 = null;
                if (nVar == null) {
                }
                i6 = i13;
                if (i6 == 2) {
                }
                i15 = i14;
                i3 = i12;
                if (i3 != 2) {
                }
                i17 = i16;
                i4 = i17;
                i5 = i15;
                z2 = true;
                if (W(64)) {
                }
                c0355c.getClass();
                c0355c.f4410h = false;
                if (this.f4589D0 == 0) {
                }
                c2 = 1;
                ArrayList arrayList102222 = this.f4597q0;
                if (objArr[0] != 2) {
                }
                this.z0 = 0;
                this.f4586A0 = 0;
                i7 = i2;
                while (i8 < i7) {
                }
                boolean W22222 = W(64);
                boolean z182222 = z2;
                int i502222 = 0;
                z3 = true;
                while (z3) {
                }
                z4 = z182222;
                this.f4597q0 = arrayList102222;
                if (z4) {
                }
                F(c0355c.f4413m);
            }
            c0355c = c0355c6;
            i4 = i;
            i3 = i12;
            i5 = i11;
            i6 = i13;
        }
        z2 = false;
        if (W(64)) {
        }
        c0355c.getClass();
        c0355c.f4410h = false;
        if (this.f4589D0 == 0) {
        }
        c2 = 1;
        ArrayList arrayList1022222 = this.f4597q0;
        if (objArr[0] != 2) {
        }
        this.z0 = 0;
        this.f4586A0 = 0;
        i7 = i2;
        while (i8 < i7) {
        }
        boolean W222222 = W(64);
        boolean z1822222 = z2;
        int i5022222 = 0;
        z3 = true;
        while (z3) {
        }
        z4 = z1822222;
        this.f4597q0 = arrayList1022222;
        if (z4) {
        }
        F(c0355c.f4413m);
    }

    public final boolean W(int i) {
        return (this.f4589D0 & i) == i;
    }

    @Override // w.d
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f4541U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f4542V);
        sb.append("\n");
        Iterator it = this.f4597q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
