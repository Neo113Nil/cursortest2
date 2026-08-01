package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2951b extends AbstractC3487l implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final C3327i f29157A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f29158B;

    /* renamed from: C, reason: collision with root package name */
    public final int f29159C;

    /* renamed from: D, reason: collision with root package name */
    public final int f29160D;

    /* renamed from: E, reason: collision with root package name */
    public final int f29161E;

    /* renamed from: F, reason: collision with root package name */
    public final int f29162F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f29163G;

    /* renamed from: H, reason: collision with root package name */
    public final int f29164H;

    /* renamed from: I, reason: collision with root package name */
    public final int f29165I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final int f29166K;

    /* renamed from: L, reason: collision with root package name */
    public final int f29167L;

    /* renamed from: M, reason: collision with root package name */
    public final int f29168M;

    /* renamed from: N, reason: collision with root package name */
    public final int f29169N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f29170O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f29171P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f29172Q;

    /* renamed from: x, reason: collision with root package name */
    public final int f29173x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f29174y;

    /* renamed from: z, reason: collision with root package name */
    public final String f29175z;

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa A[LOOP:1: B:32:0x00f7->B:34:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136 A[EDGE_INSN: B:84:0x0136->B:52:0x0136 BREAK  A[LOOP:3: B:44:0x011c->B:82:0x0134], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2951b(int i, A8 a82, int i6, C3327i c3327i, int i9, boolean z3, C3058d c3058d) {
        super(i, a82, i6);
        int i10;
        int i11;
        char c9;
        boolean z6;
        String[] split;
        int i12;
        int i13;
        int i14;
        int i15;
        C3500lC c3500lC;
        C3327i c3327i2;
        boolean z9;
        this.f29157A = c3327i;
        int i16 = 1;
        int i17 = true != c3327i.f30986z ? 16 : 24;
        this.f29175z = C3649o.e(this.f31675w.f24421d);
        this.f29158B = RP.K(i9, false);
        int i18 = 0;
        while (true) {
            C3500lC c3500lC2 = c3327i.f25695l;
            i10 = Integer.MAX_VALUE;
            if (i18 >= c3500lC2.f31747w) {
                i11 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                i11 = C3649o.f(this.f31675w, (String) c3500lC2.get(i18), false);
                if (i11 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.f29160D = i18;
        this.f29159C = i11;
        int i19 = this.f31675w.f24423f;
        this.f29161E = (i19 == 0 || i19 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f29162F = C3649o.g(this.f31675w, c3327i.f25696m);
        DP dp = this.f31675w;
        int i20 = dp.f24423f;
        this.f29163G = i20 == 0 || (i20 & 1) != 0;
        this.J = 1 == (dp.f24422e & 1);
        String str = dp.f24431o;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8421B)) {
                    c9 = 0;
                    if (c9 != 0) {
                    }
                }
                c9 = 65535;
                if (c9 != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                    c9 = 2;
                    z6 = (c9 != 0 || c9 == 1 || c9 == 2) ? true : z6;
                }
                c9 = 65535;
                if (c9 != 0) {
                }
            } else {
                if (str.equals("audio/ac4")) {
                    c9 = 1;
                    if (c9 != 0) {
                    }
                }
                c9 = 65535;
                if (c9 != 0) {
                }
            }
            this.f29172Q = z6;
            int i21 = dp.f24409H;
            this.f29166K = i21;
            this.f29167L = dp.J;
            int i22 = dp.f24426j;
            this.f29168M = i22;
            this.f29174y = (i22 != -1 || i22 <= c3327i.f25698o) && (i21 == -1 || i21 <= c3327i.f25697n) && c3058d.a(dp);
            String str2 = AbstractC3159eu.f29993a;
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            for (i12 = 0; i12 < split.length; i12++) {
                split[i12] = AbstractC3159eu.q(split[i12]);
            }
            i13 = 0;
            while (true) {
                if (i13 < split.length) {
                    i14 = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    i14 = C3649o.f(this.f31675w, split[i13], false);
                    if (i14 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f29164H = i13;
            this.f29165I = i14;
            i15 = 0;
            while (true) {
                c3500lC = c3327i.f25699p;
                if (i15 >= c3500lC.f31747w) {
                    break;
                }
                String str3 = this.f31675w.f24431o;
                if (str3 != null && str3.equals(c3500lC.get(i15))) {
                    i10 = i15;
                    break;
                }
                i15++;
            }
            this.f29169N = i10;
            this.f29170O = (i9 & 384) != 128;
            this.f29171P = (i9 & 64) != 64;
            c3327i2 = this.f29157A;
            if (RP.K(i9, c3327i2.f30979B) && ((z9 = this.f29174y) || c3327i2.f30985y)) {
                c3327i2.f25700q.getClass();
                if (RP.K(i9, false) && z9 && this.f31675w.f24426j != -1 && ((c3327i2.f30980C || !z3) && (i17 & i9) != 0)) {
                    i16 = 2;
                }
            } else {
                i16 = 0;
            }
            this.f29173x = i16;
        }
        z6 = false;
        this.f29172Q = z6;
        int i212 = dp.f24409H;
        this.f29166K = i212;
        this.f29167L = dp.J;
        int i222 = dp.f24426j;
        this.f29168M = i222;
        this.f29174y = (i222 != -1 || i222 <= c3327i.f25698o) && (i212 == -1 || i212 <= c3327i.f25697n) && c3058d.a(dp);
        String str22 = AbstractC3159eu.f29993a;
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        while (i12 < split.length) {
        }
        i13 = 0;
        while (true) {
            if (i13 < split.length) {
            }
            i13++;
        }
        this.f29164H = i13;
        this.f29165I = i14;
        i15 = 0;
        while (true) {
            c3500lC = c3327i.f25699p;
            if (i15 >= c3500lC.f31747w) {
            }
            i15++;
        }
        this.f29169N = i10;
        this.f29170O = (i9 & 384) != 128;
        this.f29171P = (i9 & 64) != 64;
        c3327i2 = this.f29157A;
        if (RP.K(i9, c3327i2.f30979B)) {
            c3327i2.f25700q.getClass();
            if (RP.K(i9, false)) {
                i16 = 2;
            }
            this.f29173x = i16;
        }
        i16 = 0;
        this.f29173x = i16;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3487l
    public final int a() {
        return this.f29173x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3487l
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3487l abstractC3487l) {
        String str;
        int i;
        C2951b c2951b = (C2951b) abstractC3487l;
        this.f29157A.getClass();
        DP dp = this.f31675w;
        int i6 = dp.f24409H;
        if (i6 == -1) {
            return false;
        }
        DP dp2 = c2951b.f31675w;
        return i6 == dp2.f24409H && (str = dp.f24431o) != null && TextUtils.equals(str, dp2.f24431o) && (i = dp.J) != -1 && i == dp2.J && this.f29170O == c2951b.f29170O && this.f29171P == c2951b.f29171P;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2951b c2951b) {
        boolean z3 = this.f29158B;
        boolean z6 = this.f29174y;
        Comparator c3877sC = (z6 && z3) ? C3649o.f32822k : new C3877sC();
        KB d2 = KB.f25874a.d(z3, c2951b.f29158B);
        Integer valueOf = Integer.valueOf(this.f29160D);
        Integer valueOf2 = Integer.valueOf(c2951b.f29160D);
        C3392jC c3392jC = C3392jC.f31214v;
        KB a9 = d2.a(valueOf, valueOf2, c3392jC).b(this.f29159C, c2951b.f29159C).b(this.f29161E, c2951b.f29161E).a(Integer.valueOf(this.f29162F), Integer.valueOf(c2951b.f29162F), c3392jC).d(this.J, c2951b.J).d(this.f29163G, c2951b.f29163G).a(Integer.valueOf(this.f29164H), Integer.valueOf(c2951b.f29164H), c3392jC).b(this.f29165I, c2951b.f29165I).d(z6, c2951b.f29174y).a(Integer.valueOf(this.f29169N), Integer.valueOf(c2951b.f29169N), c3392jC);
        this.f29157A.getClass();
        KB a10 = a9.d(this.f29170O, c2951b.f29170O).d(this.f29171P, c2951b.f29171P).d(this.f29172Q, c2951b.f29172Q).a(Integer.valueOf(this.f29166K), Integer.valueOf(c2951b.f29166K), c3877sC).a(Integer.valueOf(this.f29167L), Integer.valueOf(c2951b.f29167L), c3877sC);
        if (Objects.equals(this.f29175z, c2951b.f29175z)) {
            a10 = a10.a(Integer.valueOf(this.f29168M), Integer.valueOf(c2951b.f29168M), c3877sC);
        }
        return a10.e();
    }
}
