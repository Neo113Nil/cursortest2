package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2974b extends AbstractC3510l implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final C3350i f29945A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f29946B;

    /* renamed from: C, reason: collision with root package name */
    public final int f29947C;

    /* renamed from: D, reason: collision with root package name */
    public final int f29948D;

    /* renamed from: E, reason: collision with root package name */
    public final int f29949E;

    /* renamed from: F, reason: collision with root package name */
    public final int f29950F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f29951G;

    /* renamed from: H, reason: collision with root package name */
    public final int f29952H;

    /* renamed from: I, reason: collision with root package name */
    public final int f29953I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final int f29954K;

    /* renamed from: L, reason: collision with root package name */
    public final int f29955L;

    /* renamed from: M, reason: collision with root package name */
    public final int f29956M;

    /* renamed from: N, reason: collision with root package name */
    public final int f29957N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f29958O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f29959P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f29960Q;

    /* renamed from: x, reason: collision with root package name */
    public final int f29961x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f29962y;

    /* renamed from: z, reason: collision with root package name */
    public final String f29963z;

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
    public C2974b(int i, A8 a82, int i4, C3350i c3350i, int i6, boolean z6, C3081d c3081d) {
        super(i, a82, i4);
        int i9;
        int i10;
        char c9;
        boolean z9;
        String[] split;
        int i11;
        int i12;
        int i13;
        int i14;
        C3523lC c3523lC;
        C3350i c3350i2;
        boolean z10;
        this.f29945A = c3350i;
        int i15 = 1;
        int i16 = true != c3350i.f31759z ? 16 : 24;
        this.f29963z = C3672o.e(this.f32455w.f25166d);
        this.f29946B = SP.K(i6, false);
        int i17 = 0;
        while (true) {
            C3523lC c3523lC2 = c3350i.f26449l;
            i9 = Integer.MAX_VALUE;
            if (i17 >= c3523lC2.f32527w) {
                i10 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                i10 = C3672o.f(this.f32455w, (String) c3523lC2.get(i17), false);
                if (i10 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f29948D = i17;
        this.f29947C = i10;
        int i18 = this.f32455w.f25168f;
        this.f29949E = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f29950F = C3672o.g(this.f32455w, c3350i.f26450m);
        DP dp = this.f32455w;
        int i19 = dp.f25168f;
        this.f29951G = i19 == 0 || (i19 & 1) != 0;
        this.J = 1 == (dp.f25167e & 1);
        String str = dp.f25176o;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals(com.anythink.basead.exoplayer.k.o.f9207B)) {
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
                    z9 = (c9 != 0 || c9 == 1 || c9 == 2) ? true : z9;
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
            this.f29960Q = z9;
            int i20 = dp.f25154H;
            this.f29954K = i20;
            this.f29955L = dp.J;
            int i21 = dp.f25171j;
            this.f29956M = i21;
            this.f29962y = (i21 != -1 || i21 <= c3350i.f26452o) && (i20 == -1 || i20 <= c3350i.f26451n) && c3081d.a(dp);
            String str2 = AbstractC3182eu.f30782a;
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            for (i11 = 0; i11 < split.length; i11++) {
                split[i11] = AbstractC3182eu.q(split[i11]);
            }
            i12 = 0;
            while (true) {
                if (i12 < split.length) {
                    i13 = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                } else {
                    i13 = C3672o.f(this.f32455w, split[i12], false);
                    if (i13 > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f29952H = i12;
            this.f29953I = i13;
            i14 = 0;
            while (true) {
                c3523lC = c3350i.f26453p;
                if (i14 >= c3523lC.f32527w) {
                    break;
                }
                String str3 = this.f32455w.f25176o;
                if (str3 != null && str3.equals(c3523lC.get(i14))) {
                    i9 = i14;
                    break;
                }
                i14++;
            }
            this.f29957N = i9;
            this.f29958O = (i6 & 384) != 128;
            this.f29959P = (i6 & 64) != 64;
            c3350i2 = this.f29945A;
            if (SP.K(i6, c3350i2.f31752B) && ((z10 = this.f29962y) || c3350i2.f31758y)) {
                c3350i2.f26454q.getClass();
                if (SP.K(i6, false) && z10 && this.f32455w.f25171j != -1 && ((c3350i2.f31753C || !z6) && (i16 & i6) != 0)) {
                    i15 = 2;
                }
            } else {
                i15 = 0;
            }
            this.f29961x = i15;
        }
        z9 = false;
        this.f29960Q = z9;
        int i202 = dp.f25154H;
        this.f29954K = i202;
        this.f29955L = dp.J;
        int i212 = dp.f25171j;
        this.f29956M = i212;
        this.f29962y = (i212 != -1 || i212 <= c3350i.f26452o) && (i202 == -1 || i202 <= c3350i.f26451n) && c3081d.a(dp);
        String str22 = AbstractC3182eu.f30782a;
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        while (i11 < split.length) {
        }
        i12 = 0;
        while (true) {
            if (i12 < split.length) {
            }
            i12++;
        }
        this.f29952H = i12;
        this.f29953I = i13;
        i14 = 0;
        while (true) {
            c3523lC = c3350i.f26453p;
            if (i14 >= c3523lC.f32527w) {
            }
            i14++;
        }
        this.f29957N = i9;
        this.f29958O = (i6 & 384) != 128;
        this.f29959P = (i6 & 64) != 64;
        c3350i2 = this.f29945A;
        if (SP.K(i6, c3350i2.f31752B)) {
            c3350i2.f26454q.getClass();
            if (SP.K(i6, false)) {
                i15 = 2;
            }
            this.f29961x = i15;
        }
        i15 = 0;
        this.f29961x = i15;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3510l
    public final int a() {
        return this.f29961x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3510l
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3510l abstractC3510l) {
        String str;
        int i;
        C2974b c2974b = (C2974b) abstractC3510l;
        this.f29945A.getClass();
        DP dp = this.f32455w;
        int i4 = dp.f25154H;
        if (i4 == -1) {
            return false;
        }
        DP dp2 = c2974b.f32455w;
        return i4 == dp2.f25154H && (str = dp.f25176o) != null && TextUtils.equals(str, dp2.f25176o) && (i = dp.J) != -1 && i == dp2.J && this.f29958O == c2974b.f29958O && this.f29959P == c2974b.f29959P;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2974b c2974b) {
        boolean z6 = this.f29946B;
        boolean z9 = this.f29962y;
        Comparator c3900sC = (z9 && z6) ? C3672o.f33609k : new C3900sC();
        KB d9 = KB.f26626a.d(z6, c2974b.f29946B);
        Integer valueOf = Integer.valueOf(this.f29948D);
        Integer valueOf2 = Integer.valueOf(c2974b.f29948D);
        C3415jC c3415jC = C3415jC.f32001v;
        KB a9 = d9.a(valueOf, valueOf2, c3415jC).b(this.f29947C, c2974b.f29947C).b(this.f29949E, c2974b.f29949E).a(Integer.valueOf(this.f29950F), Integer.valueOf(c2974b.f29950F), c3415jC).d(this.J, c2974b.J).d(this.f29951G, c2974b.f29951G).a(Integer.valueOf(this.f29952H), Integer.valueOf(c2974b.f29952H), c3415jC).b(this.f29953I, c2974b.f29953I).d(z9, c2974b.f29962y).a(Integer.valueOf(this.f29957N), Integer.valueOf(c2974b.f29957N), c3415jC);
        this.f29945A.getClass();
        KB a10 = a9.d(this.f29958O, c2974b.f29958O).d(this.f29959P, c2974b.f29959P).d(this.f29960Q, c2974b.f29960Q).a(Integer.valueOf(this.f29954K), Integer.valueOf(c2974b.f29954K), c3900sC).a(Integer.valueOf(this.f29955L), Integer.valueOf(c2974b.f29955L), c3900sC);
        if (Objects.equals(this.f29963z, c2974b.f29963z)) {
            a10 = a10.a(Integer.valueOf(this.f29956M), Integer.valueOf(c2974b.f29956M), c3900sC);
        }
        return a10.e();
    }
}
