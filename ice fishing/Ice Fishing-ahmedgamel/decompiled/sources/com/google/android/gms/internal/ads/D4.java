package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class D4 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f25073a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f25074b = new Cr(new byte[9400], 0);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f25075c;

    /* renamed from: d, reason: collision with root package name */
    public final Qx f25076d;

    /* renamed from: e, reason: collision with root package name */
    public final V2 f25077e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f25078f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f25079g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f25080h;
    public final C4216y4 i;

    /* renamed from: j, reason: collision with root package name */
    public C1 f25081j;

    /* renamed from: k, reason: collision with root package name */
    public S0 f25082k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25083l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25084m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25085n;

    /* renamed from: o, reason: collision with root package name */
    public int f25086o;

    static {
        int i = SK.f28178r0;
    }

    public D4(V2 v22, Dt dt, Qx qx) {
        this.f25076d = qx;
        this.f25077e = v22;
        this.f25073a = Collections.singletonList(dt);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f25079g = sparseBooleanArray;
        this.f25080h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f25078f = sparseArray;
        this.f25075c = new SparseIntArray();
        this.i = new C4216y4(1);
        this.f25082k = S0.f28105g0;
        this.f25086o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f25078f.put(sparseArray2.keyAt(i), (G4) sparseArray2.valueAt(i));
        }
        this.f25078f.put(0, new C4(new S0.s(this)));
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
        long j10 = ((K0) r02).f26570v;
        if (this.f25083l) {
            long j11 = com.anythink.basead.exoplayer.b.f7168b;
            C4216y4 c4216y4 = this.i;
            if (j10 != -1 && !c4216y4.f35874c) {
                int i = this.f25086o;
                if (i <= 0) {
                    c4216y4.b((K0) r02);
                    return 0;
                }
                boolean z6 = c4216y4.f35876e;
                Cr cr = c4216y4.f35873b;
                if (z6) {
                    if (c4216y4.f35878g == com.anythink.basead.exoplayer.b.f7168b) {
                        c4216y4.b((K0) r02);
                        return 0;
                    }
                    if (c4216y4.f35875d) {
                        long j12 = c4216y4.f35877f;
                        if (j12 == com.anythink.basead.exoplayer.b.f7168b) {
                            c4216y4.b((K0) r02);
                            return 0;
                        }
                        Dt dt = c4216y4.f35872a;
                        c4216y4.f35879h = dt.d(c4216y4.f35878g) - dt.c(j12);
                        c4216y4.b((K0) r02);
                        return 0;
                    }
                    K0 k02 = (K0) r02;
                    int min = (int) Math.min(112800L, k02.f26570v);
                    if (k02.f26571w != 0) {
                        u02.f28641n = 0L;
                        return 1;
                    }
                    cr.y(min);
                    k02.f26573y = 0;
                    k02.E(cr.f24997a, 0, min, false);
                    int i4 = cr.f24998b;
                    int i6 = cr.f24999c;
                    while (true) {
                        if (i4 >= i6) {
                            j9 = -9223372036854775807L;
                            break;
                        }
                        if (cr.f24997a[i4] == 71) {
                            j9 = AbstractC2792Sd.l(cr, i4, i);
                            if (j9 != com.anythink.basead.exoplayer.b.f7168b) {
                                break;
                            }
                        }
                        i4++;
                    }
                    c4216y4.f35877f = j9;
                    c4216y4.f35875d = true;
                    return 0;
                }
                K0 k03 = (K0) r02;
                long j13 = k03.f26570v;
                int min2 = (int) Math.min(112800L, j13);
                long j14 = j13 - min2;
                if (k03.f26571w != j14) {
                    u02.f28641n = j14;
                    return 1;
                }
                cr.y(min2);
                k03.f26573y = 0;
                k03.E(cr.f24997a, 0, min2, false);
                int i9 = cr.f24998b;
                int i10 = cr.f24999c;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = cr.f24997a;
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long l9 = AbstractC2792Sd.l(cr, i11, i);
                                if (l9 != com.anythink.basead.exoplayer.b.f7168b) {
                                    j11 = l9;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                c4216y4.f35878g = j11;
                c4216y4.f35876e = true;
                return 0;
            }
            if (this.f25084m) {
                j6 = 0;
            } else {
                this.f25084m = true;
                long j15 = c4216y4.f35879h;
                if (j15 != com.anythink.basead.exoplayer.b.f7168b) {
                    int i15 = this.f25086o;
                    V2 v22 = new V2(11);
                    Dt dt2 = c4216y4.f35872a;
                    C3516l5 c3516l5 = new C3516l5();
                    c3516l5.f32487n = i15;
                    c3516l5.f32488u = dt2;
                    c3516l5.f32489v = new Cr();
                    j6 = 0;
                    C1 c12 = new C1(v22, c3516l5, j15, j15 + 1, 0L, j10, 188L, 940);
                    this.f25081j = c12;
                    this.f25082k.D(c12.f24771a);
                } else {
                    j6 = 0;
                    this.f25082k.D(new V0(j15, 0L));
                }
            }
            if (this.f25085n) {
                this.f25085n = false;
                c(j6, j6);
                if (((K0) r02).f26571w != j6) {
                    u02.f28641n = j6;
                    return 1;
                }
            }
            r15 = 1;
            r15 = 1;
            C1 c13 = this.f25081j;
            if (c13 != null && c13.f24773c != null) {
                return c13.b((K0) r02, u02);
            }
        } else {
            r15 = 1;
        }
        Cr cr2 = this.f25074b;
        byte[] bArr2 = cr2.f24997a;
        if (9400 - cr2.f24998b < 188) {
            int B3 = cr2.B();
            if (B3 > 0) {
                System.arraycopy(bArr2, cr2.f24998b, bArr2, 0, B3);
            }
            cr2.z(B3, bArr2);
        }
        while (true) {
            int B9 = cr2.B();
            SparseArray sparseArray = this.f25078f;
            if (B9 >= 188) {
                int i16 = cr2.f24998b;
                int i17 = cr2.f24999c;
                byte[] bArr3 = cr2.f24997a;
                while (i16 < i17 && bArr3[i16] != 71) {
                    i16++;
                }
                cr2.E(i16);
                int i18 = i16 + 188;
                int i19 = cr2.f24999c;
                if (i18 > i19) {
                    return 0;
                }
                int b9 = cr2.b();
                if ((8388608 & b9) != 0) {
                    cr2.E(i18);
                    return 0;
                }
                int i20 = (4194304 & b9) != 0 ? r15 : 0;
                int i21 = b9 & 32;
                int i22 = (b9 >> 8) & 8191;
                G4 g42 = (b9 & 16) != 0 ? (G4) sparseArray.get(i22) : null;
                if (g42 == null) {
                    cr2.E(i18);
                    return 0;
                }
                int i23 = b9 & 15;
                SparseIntArray sparseIntArray = this.f25075c;
                int i24 = sparseIntArray.get(i22, i23 - 1);
                sparseIntArray.put(i22, i23);
                if (i24 == i23) {
                    cr2.E(i18);
                    return 0;
                }
                if (i23 != ((i24 + r15) & 15)) {
                    g42.f();
                }
                if (i21 != 0) {
                    int K7 = cr2.K();
                    i20 |= (cr2.K() & 64) != 0 ? 2 : 0;
                    cr2.G(K7 - 1);
                }
                boolean z9 = this.f25083l;
                if (z9 || !this.f25080h.get(i22, false)) {
                    cr2.C(i18);
                    g42.a(i20, cr2);
                    cr2.C(i19);
                }
                if (!z9 && this.f25083l && j10 != -1) {
                    this.f25085n = r15;
                }
                cr2.E(i18);
                return 0;
            }
            int i25 = cr2.f24999c;
            int r9 = ((K0) r02).r(bArr2, i25, 9400 - i25);
            if (r9 == -1) {
                for (int i26 = 0; i26 < sparseArray.size(); i26++) {
                    G4 g43 = (G4) sparseArray.valueAt(i26);
                    if (g43 instanceof C4162x4) {
                        C4162x4 c4162x4 = (C4162x4) g43;
                        int i27 = c4162x4.f35723c;
                        if (i27 == 3) {
                            if (c4162x4.f35729j != -1) {
                            }
                            c4162x4.a(r15, new Cr());
                        } else {
                            if (i27 != r15) {
                            }
                            c4162x4.a(r15, new Cr());
                        }
                    }
                }
                return -1;
            }
            cr2.C(i25 + r9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f25082k = new com.bumptech.glide.manager.n(s02, (InterfaceC3837r3) this.f25077e);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        C1 c12;
        long j10;
        List list = this.f25073a;
        int size = list.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Dt dt = (Dt) list.get(i4);
            synchronized (dt) {
                j10 = dt.f25247b;
            }
            if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                long a9 = dt.a();
                if (a9 != com.anythink.basead.exoplayer.b.f7168b) {
                    if (a9 != 0) {
                        if (a9 == j9) {
                        }
                    }
                }
            }
            dt.b(j9);
        }
        if (j9 != 0 && (c12 = this.f25081j) != null) {
            c12.a(j9);
        }
        this.f25074b.y(0);
        this.f25075c.clear();
        while (true) {
            SparseArray sparseArray = this.f25078f;
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
        byte[] bArr = this.f25074b.f24997a;
        K0 k02 = (K0) r02;
        k02.E(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i4 = 0; i4 < 5; i4++) {
                if (bArr[(i4 * 188) + i] != 71) {
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
