package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.fR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3205fR extends AbstractC3446k implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final C3286h f30705A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f30706B;

    /* renamed from: C, reason: collision with root package name */
    public final int f30707C;

    /* renamed from: D, reason: collision with root package name */
    public final int f30708D;

    /* renamed from: E, reason: collision with root package name */
    public final int f30709E;

    /* renamed from: F, reason: collision with root package name */
    public final int f30710F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f30711G;

    /* renamed from: H, reason: collision with root package name */
    public final int f30712H;

    /* renamed from: I, reason: collision with root package name */
    public final int f30713I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final int f30714K;

    /* renamed from: L, reason: collision with root package name */
    public final int f30715L;

    /* renamed from: M, reason: collision with root package name */
    public final int f30716M;

    /* renamed from: N, reason: collision with root package name */
    public final int f30717N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f30718O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f30719P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f30720Q;

    /* renamed from: x, reason: collision with root package name */
    public final int f30721x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f30722y;

    /* renamed from: z, reason: collision with root package name */
    public final String f30723z;

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
    public C3205fR(int i, B8 b82, int i4, C3286h c3286h, int i9, boolean z8, C3013c c3013c) {
        super(i, b82, i4);
        int i10;
        int i11;
        char c4;
        boolean z9;
        String[] split;
        int i12;
        int i13;
        int i14;
        int i15;
        C3675oC c3675oC;
        C3286h c3286h2;
        boolean z10;
        this.f30705A = c3286h;
        int i16 = 1;
        int i17 = true != c3286h.f31129z ? 16 : 24;
        this.f30723z = C3554m.e(this.f32229w.f27766d);
        this.f30706B = AbstractC3149eQ.J(i9, false);
        int i18 = 0;
        while (true) {
            C3675oC c3675oC2 = c3286h.f26557l;
            i10 = Integer.MAX_VALUE;
            if (i18 >= c3675oC2.f33117w) {
                i11 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                i11 = C3554m.f(this.f32229w, (String) c3675oC2.get(i18), false);
                if (i11 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.f30708D = i18;
        this.f30707C = i11;
        int i19 = this.f32229w.f27768f;
        this.f30709E = (i19 == 0 || i19 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f30710F = C3554m.g(this.f32229w, c3286h.f26558m);
        TP tp = this.f32229w;
        int i20 = tp.f27768f;
        this.f30711G = i20 == 0 || (i20 & 1) != 0;
        this.J = 1 == (tp.f27767e & 1);
        String str = tp.f27776o;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals(com.anythink.basead.exoplayer.k.o.f8578B)) {
                    c4 = 0;
                    if (c4 != 0) {
                    }
                }
                c4 = 65535;
                if (c4 != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                    c4 = 2;
                    z9 = (c4 != 0 || c4 == 1 || c4 == 2) ? true : z9;
                }
                c4 = 65535;
                if (c4 != 0) {
                }
            } else {
                if (str.equals("audio/ac4")) {
                    c4 = 1;
                    if (c4 != 0) {
                    }
                }
                c4 = 65535;
                if (c4 != 0) {
                }
            }
            this.f30720Q = z9;
            int i21 = tp.f27754G;
            this.f30714K = i21;
            this.f30715L = tp.f27756I;
            int i22 = tp.f27771j;
            this.f30716M = i22;
            this.f30722y = (i22 != -1 || i22 <= c3286h.f26560o) && (i21 == -1 || i21 <= c3286h.f26559n) && c3013c.b(tp);
            String str2 = AbstractC3548lu.f32613a;
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            for (i12 = 0; i12 < split.length; i12++) {
                split[i12] = AbstractC3548lu.q(split[i12]);
            }
            i13 = 0;
            while (true) {
                if (i13 < split.length) {
                    i14 = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    i14 = C3554m.f(this.f32229w, split[i13], false);
                    if (i14 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f30712H = i13;
            this.f30713I = i14;
            i15 = 0;
            while (true) {
                c3675oC = c3286h.f26561p;
                if (i15 >= c3675oC.f33117w) {
                    break;
                }
                String str3 = this.f32229w.f27776o;
                if (str3 != null && str3.equals(c3675oC.get(i15))) {
                    i10 = i15;
                    break;
                }
                i15++;
            }
            this.f30717N = i10;
            this.f30718O = (i9 & 384) != 128;
            this.f30719P = (i9 & 64) != 64;
            c3286h2 = this.f30705A;
            if (AbstractC3149eQ.J(i9, c3286h2.f31122B) && ((z10 = this.f30722y) || c3286h2.f31128y)) {
                c3286h2.f26562q.getClass();
                if (AbstractC3149eQ.J(i9, false) && z10 && this.f32229w.f27771j != -1 && ((c3286h2.f31123C || !z8) && (i17 & i9) != 0)) {
                    i16 = 2;
                }
            } else {
                i16 = 0;
            }
            this.f30721x = i16;
        }
        z9 = false;
        this.f30720Q = z9;
        int i212 = tp.f27754G;
        this.f30714K = i212;
        this.f30715L = tp.f27756I;
        int i222 = tp.f27771j;
        this.f30716M = i222;
        this.f30722y = (i222 != -1 || i222 <= c3286h.f26560o) && (i212 == -1 || i212 <= c3286h.f26559n) && c3013c.b(tp);
        String str22 = AbstractC3548lu.f32613a;
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        while (i12 < split.length) {
        }
        i13 = 0;
        while (true) {
            if (i13 < split.length) {
            }
            i13++;
        }
        this.f30712H = i13;
        this.f30713I = i14;
        i15 = 0;
        while (true) {
            c3675oC = c3286h.f26561p;
            if (i15 >= c3675oC.f33117w) {
            }
            i15++;
        }
        this.f30717N = i10;
        this.f30718O = (i9 & 384) != 128;
        this.f30719P = (i9 & 64) != 64;
        c3286h2 = this.f30705A;
        if (AbstractC3149eQ.J(i9, c3286h2.f31122B)) {
            c3286h2.f26562q.getClass();
            if (AbstractC3149eQ.J(i9, false)) {
                i16 = 2;
            }
            this.f30721x = i16;
        }
        i16 = 0;
        this.f30721x = i16;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3446k
    public final int a() {
        return this.f30721x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3446k
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3446k abstractC3446k) {
        String str;
        int i;
        C3205fR c3205fR = (C3205fR) abstractC3446k;
        this.f30705A.getClass();
        TP tp = this.f32229w;
        int i4 = tp.f27754G;
        if (i4 == -1) {
            return false;
        }
        TP tp2 = c3205fR.f32229w;
        return i4 == tp2.f27754G && (str = tp.f27776o) != null && TextUtils.equals(str, tp2.f27776o) && (i = tp.f27756I) != -1 && i == tp2.f27756I && this.f30718O == c3205fR.f30718O && this.f30719P == c3205fR.f30719P;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3205fR c3205fR) {
        boolean z8 = this.f30706B;
        boolean z9 = this.f30722y;
        Comparator c4052vC = (z9 && z8) ? C3554m.f32629k : new C4052vC();
        NB d2 = NB.f26491a.d(z8, c3205fR.f30706B);
        Integer valueOf = Integer.valueOf(this.f30708D);
        Integer valueOf2 = Integer.valueOf(c3205fR.f30708D);
        C3567mC c3567mC = C3567mC.f32673v;
        NB a9 = d2.a(valueOf, valueOf2, c3567mC).b(this.f30707C, c3205fR.f30707C).b(this.f30709E, c3205fR.f30709E).a(Integer.valueOf(this.f30710F), Integer.valueOf(c3205fR.f30710F), c3567mC).d(this.J, c3205fR.J).d(this.f30711G, c3205fR.f30711G).a(Integer.valueOf(this.f30712H), Integer.valueOf(c3205fR.f30712H), c3567mC).b(this.f30713I, c3205fR.f30713I).d(z9, c3205fR.f30722y).a(Integer.valueOf(this.f30717N), Integer.valueOf(c3205fR.f30717N), c3567mC);
        this.f30705A.getClass();
        NB a10 = a9.d(this.f30718O, c3205fR.f30718O).d(this.f30719P, c3205fR.f30719P).d(this.f30720Q, c3205fR.f30720Q).a(Integer.valueOf(this.f30714K), Integer.valueOf(c3205fR.f30714K), c4052vC).a(Integer.valueOf(this.f30715L), Integer.valueOf(c3205fR.f30715L), c4052vC);
        if (Objects.equals(this.f30723z, c3205fR.f30723z)) {
            a10 = a10.a(Integer.valueOf(this.f30716M), Integer.valueOf(c3205fR.f30716M), c4052vC);
        }
        return a10.e();
    }
}
