package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class D4 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f24328a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f24329b = new Cr(new byte[9400], 0);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f24330c;

    /* renamed from: d, reason: collision with root package name */
    public final Qx f24331d;

    /* renamed from: e, reason: collision with root package name */
    public final V2 f24332e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f24333f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f24334g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f24335h;
    public final C4193y4 i;

    /* renamed from: j, reason: collision with root package name */
    public C1 f24336j;

    /* renamed from: k, reason: collision with root package name */
    public S0 f24337k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24338l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24339m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24340n;

    /* renamed from: o, reason: collision with root package name */
    public int f24341o;

    static {
        int i = SK.f27468w0;
    }

    public D4(V2 v22, Dt dt, Qx qx) {
        this.f24331d = qx;
        this.f24332e = v22;
        this.f24328a = Collections.singletonList(dt);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f24334g = sparseBooleanArray;
        this.f24335h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f24333f = sparseArray;
        this.f24330c = new SparseIntArray();
        this.i = new C4193y4(1);
        this.f24337k = S0.f27391l0;
        this.f24341o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f24333f.put(sparseArray2.keyAt(i), (G4) sparseArray2.valueAt(i));
        }
        this.f24333f.put(0, new C4(new S0.s(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        ?? r15;
        long j6;
        long j9;
        long j10 = ((K0) r02).f25818v;
        if (this.f24338l) {
            long j11 = com.anythink.basead.exoplayer.b.f6382b;
            C4193y4 c4193y4 = this.i;
            if (j10 != -1 && !c4193y4.f35088c) {
                int i = this.f24341o;
                if (i <= 0) {
                    c4193y4.b((K0) r02);
                    return 0;
                }
                boolean z3 = c4193y4.f35090e;
                Cr cr = c4193y4.f35087b;
                if (z3) {
                    if (c4193y4.f35092g == com.anythink.basead.exoplayer.b.f6382b) {
                        c4193y4.b((K0) r02);
                        return 0;
                    }
                    if (c4193y4.f35089d) {
                        long j12 = c4193y4.f35091f;
                        if (j12 == com.anythink.basead.exoplayer.b.f6382b) {
                            c4193y4.b((K0) r02);
                            return 0;
                        }
                        Dt dt = c4193y4.f35086a;
                        c4193y4.f35093h = dt.d(c4193y4.f35092g) - dt.c(j12);
                        c4193y4.b((K0) r02);
                        return 0;
                    }
                    K0 k02 = (K0) r02;
                    int min = (int) Math.min(112800L, k02.f25818v);
                    if (k02.f25819w != 0) {
                        u02.f27844n = 0L;
                        return 1;
                    }
                    cr.y(min);
                    k02.f25821y = 0;
                    k02.A(cr.f24252a, 0, min, false);
                    int i6 = cr.f24253b;
                    int i9 = cr.f24254c;
                    while (true) {
                        if (i6 >= i9) {
                            j9 = -9223372036854775807L;
                            break;
                        }
                        if (cr.f24252a[i6] == 71) {
                            j9 = AbstractC2772Sd.l(cr, i6, i);
                            if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
                                break;
                            }
                        }
                        i6++;
                    }
                    c4193y4.f35091f = j9;
                    c4193y4.f35089d = true;
                    return 0;
                }
                K0 k03 = (K0) r02;
                long j13 = k03.f25818v;
                int min2 = (int) Math.min(112800L, j13);
                long j14 = j13 - min2;
                if (k03.f25819w != j14) {
                    u02.f27844n = j14;
                    return 1;
                }
                cr.y(min2);
                k03.f25821y = 0;
                k03.A(cr.f24252a, 0, min2, false);
                int i10 = cr.f24253b;
                int i11 = cr.f24254c;
                int i12 = i11 - 188;
                while (true) {
                    if (i12 < i10) {
                        break;
                    }
                    byte[] bArr = cr.f24252a;
                    int i13 = -4;
                    int i14 = 0;
                    while (true) {
                        if (i13 > 4) {
                            break;
                        }
                        int i15 = (i13 * 188) + i12;
                        if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                            i14 = 0;
                        } else {
                            i14++;
                            if (i14 == 5) {
                                long l9 = AbstractC2772Sd.l(cr, i12, i);
                                if (l9 != com.anythink.basead.exoplayer.b.f6382b) {
                                    j11 = l9;
                                    break;
                                }
                            }
                        }
                        i13++;
                    }
                    i12--;
                }
                c4193y4.f35092g = j11;
                c4193y4.f35090e = true;
                return 0;
            }
            if (this.f24339m) {
                j6 = 0;
            } else {
                this.f24339m = true;
                long j15 = c4193y4.f35093h;
                if (j15 != com.anythink.basead.exoplayer.b.f6382b) {
                    int i16 = this.f24341o;
                    V2 v22 = new V2(11);
                    Dt dt2 = c4193y4.f35086a;
                    C3493l5 c3493l5 = new C3493l5();
                    c3493l5.f31707n = i16;
                    c3493l5.f31708u = dt2;
                    c3493l5.f31709v = new Cr();
                    j6 = 0;
                    C1 c12 = new C1(v22, c3493l5, j15, j15 + 1, 0L, j10, 188L, 940);
                    this.f24336j = c12;
                    this.f24337k.D(c12.f24008a);
                } else {
                    j6 = 0;
                    this.f24337k.D(new V0(j15, 0L));
                }
            }
            if (this.f24340n) {
                this.f24340n = false;
                c(j6, j6);
                if (((K0) r02).f25819w != j6) {
                    u02.f27844n = j6;
                    return 1;
                }
            }
            r15 = 1;
            r15 = 1;
            C1 c13 = this.f24336j;
            if (c13 != null && c13.f24010c != null) {
                return c13.b((K0) r02, u02);
            }
        } else {
            r15 = 1;
        }
        Cr cr2 = this.f24329b;
        byte[] bArr2 = cr2.f24252a;
        if (9400 - cr2.f24253b < 188) {
            int B9 = cr2.B();
            if (B9 > 0) {
                System.arraycopy(bArr2, cr2.f24253b, bArr2, 0, B9);
            }
            cr2.z(B9, bArr2);
        }
        while (true) {
            int B10 = cr2.B();
            SparseArray sparseArray = this.f24333f;
            if (B10 >= 188) {
                int i17 = cr2.f24253b;
                int i18 = cr2.f24254c;
                byte[] bArr3 = cr2.f24252a;
                while (i17 < i18 && bArr3[i17] != 71) {
                    i17++;
                }
                cr2.E(i17);
                int i19 = i17 + 188;
                int i20 = cr2.f24254c;
                if (i19 > i20) {
                    return 0;
                }
                int b9 = cr2.b();
                if ((8388608 & b9) != 0) {
                    cr2.E(i19);
                    return 0;
                }
                int i21 = (4194304 & b9) != 0 ? r15 : 0;
                int i22 = b9 & 32;
                int i23 = (b9 >> 8) & 8191;
                G4 g4 = (b9 & 16) != 0 ? (G4) sparseArray.get(i23) : null;
                if (g4 == null) {
                    cr2.E(i19);
                    return 0;
                }
                int i24 = b9 & 15;
                SparseIntArray sparseIntArray = this.f24330c;
                int i25 = sparseIntArray.get(i23, i24 - 1);
                sparseIntArray.put(i23, i24);
                if (i25 == i24) {
                    cr2.E(i19);
                    return 0;
                }
                if (i24 != ((i25 + r15) & 15)) {
                    g4.f();
                }
                if (i22 != 0) {
                    int K7 = cr2.K();
                    i21 |= (cr2.K() & 64) != 0 ? 2 : 0;
                    cr2.G(K7 - 1);
                }
                boolean z6 = this.f24338l;
                if (z6 || !this.f24335h.get(i23, false)) {
                    cr2.C(i19);
                    g4.a(i21, cr2);
                    cr2.C(i20);
                }
                if (!z6 && this.f24338l && j10 != -1) {
                    this.f24340n = r15;
                }
                cr2.E(i19);
                return 0;
            }
            int i26 = cr2.f24254c;
            int m4 = ((K0) r02).m(bArr2, i26, 9400 - i26);
            if (m4 == -1) {
                for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                    G4 g42 = (G4) sparseArray.valueAt(i27);
                    if (g42 instanceof C4139x4) {
                        C4139x4 c4139x4 = (C4139x4) g42;
                        int i28 = c4139x4.f34942c;
                        if (i28 == 3) {
                            if (c4139x4.f34948j != -1) {
                            }
                            c4139x4.a(r15, new Cr());
                        } else {
                            if (i28 != r15) {
                            }
                            c4139x4.a(r15, new Cr());
                        }
                    }
                }
                return -1;
            }
            cr2.C(i26 + m4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f24337k = new com.bumptech.glide.manager.o(s02, (InterfaceC3814r3) this.f24332e);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        C1 c12;
        long j10;
        List list = this.f24328a;
        int size = list.size();
        int i = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Dt dt = (Dt) list.get(i6);
            synchronized (dt) {
                j10 = dt.f24486b;
            }
            if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                long a9 = dt.a();
                if (a9 != com.anythink.basead.exoplayer.b.f6382b) {
                    if (a9 != 0) {
                        if (a9 == j9) {
                        }
                    }
                }
            }
            dt.b(j9);
        }
        if (j9 != 0 && (c12 = this.f24336j) != null) {
            c12.a(j9);
        }
        this.f24329b.y(0);
        this.f24330c.clear();
        while (true) {
            SparseArray sparseArray = this.f24333f;
            if (i >= sparseArray.size()) {
                return;
            }
            ((G4) sparseArray.valueAt(i)).f();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(R0 r02) {
        byte[] bArr = this.f24329b.f24252a;
        K0 k02 = (K0) r02;
        k02.A(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i6 = 0; i6 < 5; i6++) {
                if (bArr[(i6 * 188) + i] != 71) {
                    break;
                }
            }
            k02.a(i, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
