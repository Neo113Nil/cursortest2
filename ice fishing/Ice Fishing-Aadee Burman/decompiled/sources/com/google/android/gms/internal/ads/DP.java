package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class DP {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f24401R = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f24402A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f24403B;

    /* renamed from: C, reason: collision with root package name */
    public final float f24404C;

    /* renamed from: D, reason: collision with root package name */
    public final byte[] f24405D;

    /* renamed from: E, reason: collision with root package name */
    public final int f24406E;

    /* renamed from: F, reason: collision with root package name */
    public final KJ f24407F;

    /* renamed from: G, reason: collision with root package name */
    public final int f24408G;

    /* renamed from: H, reason: collision with root package name */
    public final int f24409H;

    /* renamed from: I, reason: collision with root package name */
    public final int f24410I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f24411K;

    /* renamed from: L, reason: collision with root package name */
    public final int f24412L;

    /* renamed from: M, reason: collision with root package name */
    public final int f24413M;

    /* renamed from: N, reason: collision with root package name */
    public final int f24414N;

    /* renamed from: O, reason: collision with root package name */
    public final int f24415O;

    /* renamed from: P, reason: collision with root package name */
    public final int f24416P;

    /* renamed from: Q, reason: collision with root package name */
    public int f24417Q;

    /* renamed from: a, reason: collision with root package name */
    public final String f24418a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24419b;

    /* renamed from: c, reason: collision with root package name */
    public final RB f24420c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24421d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24422e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24423f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24424g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24425h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24426j;

    /* renamed from: k, reason: collision with root package name */
    public final String f24427k;

    /* renamed from: l, reason: collision with root package name */
    public final O3 f24428l;

    /* renamed from: m, reason: collision with root package name */
    public final String f24429m;

    /* renamed from: n, reason: collision with root package name */
    public final String f24430n;

    /* renamed from: o, reason: collision with root package name */
    public final String f24431o;

    /* renamed from: p, reason: collision with root package name */
    public final int f24432p;

    /* renamed from: q, reason: collision with root package name */
    public final int f24433q;

    /* renamed from: r, reason: collision with root package name */
    public final List f24434r;

    /* renamed from: s, reason: collision with root package name */
    public final EO f24435s;

    /* renamed from: t, reason: collision with root package name */
    public final long f24436t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f24437u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24438v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24439w;

    /* renamed from: x, reason: collision with root package name */
    public final int f24440x;

    /* renamed from: y, reason: collision with root package name */
    public final int f24441y;

    /* renamed from: z, reason: collision with root package name */
    public final float f24442z;

    static {
        new DP(new C3299hP());
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
        Integer.toString(39, 36);
        Integer.toString(40, 36);
    }

    public DP(C3299hP c3299hP) {
        boolean z3;
        String str;
        this.f24418a = c3299hP.f30780a;
        String q8 = AbstractC3159eu.q(c3299hP.f30783d);
        this.f24421d = q8;
        if (c3299hP.f30782c.isEmpty() && c3299hP.f30781b != null) {
            this.f24420c = RB.j(new C3138eQ(q8, c3299hP.f30781b));
            this.f24419b = c3299hP.f30781b;
        } else if (c3299hP.f30782c.isEmpty() || c3299hP.f30781b != null) {
            if (!c3299hP.f30782c.isEmpty() || c3299hP.f30781b != null) {
                for (int i = 0; i < c3299hP.f30782c.size(); i++) {
                    if (!((C3138eQ) c3299hP.f30782c.get(i)).f29933b.equals(c3299hP.f30781b)) {
                    }
                }
                z3 = false;
                AbstractC2772Sd.H(z3);
                this.f24420c = c3299hP.f30782c;
                this.f24419b = c3299hP.f30781b;
            }
            z3 = true;
            AbstractC2772Sd.H(z3);
            this.f24420c = c3299hP.f30782c;
            this.f24419b = c3299hP.f30781b;
        } else {
            RB rb = c3299hP.f30782c;
            this.f24420c = rb;
            Iterator it = rb.iterator();
            while (true) {
                AbstractC3499lB abstractC3499lB = (AbstractC3499lB) it;
                if (!abstractC3499lB.hasNext()) {
                    str = ((C3138eQ) rb.get(0)).f29933b;
                    break;
                }
                C3138eQ c3138eQ = (C3138eQ) abstractC3499lB.next();
                if (TextUtils.equals(c3138eQ.f29932a, q8)) {
                    str = c3138eQ.f29933b;
                    break;
                }
            }
            this.f24419b = str;
        }
        this.f24422e = c3299hP.f30784e;
        AbstractC2772Sd.I("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c3299hP.f30786g == 0 || (c3299hP.f30785f & 32768) != 0);
        this.f24423f = c3299hP.f30785f;
        this.f24424g = c3299hP.f30786g;
        int i6 = c3299hP.f30787h;
        this.f24425h = i6;
        int i9 = c3299hP.i;
        this.i = i9;
        this.f24426j = i9 != -1 ? i9 : i6;
        this.f24427k = c3299hP.f30788j;
        this.f24428l = c3299hP.f30789k;
        this.f24429m = c3299hP.f30790l;
        this.f24430n = c3299hP.f30791m;
        this.f24431o = c3299hP.f30792n;
        this.f24432p = c3299hP.f30793o;
        this.f24433q = c3299hP.f30794p;
        List list = c3299hP.f30795q;
        this.f24434r = list == null ? Collections.EMPTY_LIST : list;
        EO eo = c3299hP.f30796r;
        this.f24435s = eo;
        this.f24436t = c3299hP.f30797s;
        this.f24437u = c3299hP.f30798t;
        this.f24438v = c3299hP.f30799u;
        this.f24439w = c3299hP.f30800v;
        this.f24440x = c3299hP.f30801w;
        this.f24441y = c3299hP.f30802x;
        this.f24442z = c3299hP.f30803y;
        int i10 = c3299hP.f30804z;
        this.f24402A = i10 == -1 ? 0 : i10;
        this.f24403B = c3299hP.f30766A;
        float f3 = c3299hP.f30767B;
        this.f24404C = f3 == -1.0f ? 1.0f : f3;
        this.f24405D = c3299hP.f30768C;
        this.f24406E = c3299hP.f30769D;
        this.f24407F = c3299hP.f30770E;
        this.f24408G = c3299hP.f30771F;
        int i11 = c3299hP.f30772G;
        this.f24409H = i11;
        int i12 = c3299hP.f30773H;
        this.f24410I = i12;
        if (i11 != -1 && i12 != -1 && Integer.bitCount(i12) != i11) {
            throw new IllegalStateException(AbstractC2639Kg.x("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        this.J = c3299hP.f30774I;
        this.f24411K = c3299hP.J;
        int i13 = c3299hP.f30775K;
        this.f24412L = i13 == -1 ? 0 : i13;
        int i14 = c3299hP.f30776L;
        this.f24413M = i14 != -1 ? i14 : 0;
        this.f24414N = c3299hP.f30777M;
        this.f24415O = c3299hP.f30778N;
        int i15 = c3299hP.f30779O;
        if (i15 != 0 || eo == null) {
            this.f24416P = i15;
        } else {
            this.f24416P = 1;
        }
    }

    public static String c(DP dp) {
        String str;
        String str2;
        String str3;
        int i;
        int i6;
        StringBuilder b9 = AbstractC5049e.b("id=");
        b9.append(dp.f24418a);
        b9.append(", mimeType=");
        b9.append(dp.f24431o);
        String str4 = dp.f24430n;
        if (str4 != null) {
            b9.append(", container=");
            b9.append(str4);
        }
        String str5 = dp.f24429m;
        if (str5 != null) {
            b9.append(", primaryGroupId=");
            b9.append(str5);
        }
        int i9 = dp.f24426j;
        if (i9 != -1) {
            b9.append(", bitrate=");
            b9.append(i9);
        }
        String str6 = dp.f24427k;
        if (str6 != null) {
            b9.append(", codecs=");
            b9.append(str6);
        }
        EO eo = dp.f24435s;
        if (eo != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < eo.f24612w; i10++) {
                UUID uuid = eo.f24609n[i10].f23671u;
                if (uuid.equals(Yw.f28761b)) {
                    linkedHashSet.add(com.anythink.basead.exoplayer.b.bd);
                } else if (uuid.equals(Yw.f28762c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(Yw.f28764e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(Yw.f28763d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(Yw.f28760a)) {
                    linkedHashSet.add("universal");
                } else {
                    String obj = uuid.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 10);
                    sb.append("unknown (");
                    sb.append(obj);
                    sb.append(")");
                    linkedHashSet.add(sb.toString());
                }
            }
            b9.append(", drm=[");
            AbstractC2968bG.z(b9, linkedHashSet.iterator(), ",");
            b9.append(']');
        }
        int i11 = dp.f24438v;
        if (i11 != -1 && (i6 = dp.f24439w) != -1) {
            u1.h.h(b9, ", res=", i11, "x", i6);
        }
        int i12 = dp.f24440x;
        if (i12 != -1 && (i = dp.f24441y) != -1) {
            u1.h.h(b9, ", decRes=", i12, "x", i);
        }
        int i13 = MC.f26268a;
        float f3 = dp.f24404C;
        double d2 = f3;
        if (Math.copySign((-1.0d) + d2, 1.0d) > 0.001d && d2 != 1.0d && (!Double.isNaN(d2) || !Double.isNaN(1.0d))) {
            b9.append(", par=");
            Object[] objArr = {Float.valueOf(f3)};
            String str7 = AbstractC3159eu.f29993a;
            b9.append(String.format(Locale.US, "%.3f", objArr));
        }
        KJ kj = dp.f24407F;
        if (kj != null) {
            int i14 = kj.f25901e;
            int i15 = kj.f25902f;
            if ((i14 != -1 && i15 != -1) || kj.d()) {
                b9.append(", color=");
                if (kj.d()) {
                    String e9 = KJ.e(kj.f25897a);
                    String g4 = KJ.g(kj.f25898b);
                    String f9 = KJ.f(kj.f25899c);
                    String str8 = AbstractC3159eu.f29993a;
                    Locale locale = Locale.US;
                    str2 = e9 + "/" + g4 + "/" + f9;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i14 == -1 || i15 == -1) {
                    str3 = "NA/NA";
                } else {
                    StringBuilder sb2 = new StringBuilder(AbstractC4404f.b(i14, 1) + String.valueOf(i15).length());
                    sb2.append(i14);
                    sb2.append("/");
                    sb2.append(i15);
                    str3 = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(str3.length() + str2.length() + 1);
                sb3.append(str2);
                sb3.append("/");
                sb3.append(str3);
                b9.append(sb3.toString());
            }
        }
        float f10 = dp.f24442z;
        if (f10 != -1.0f) {
            b9.append(", fps=");
            b9.append(f10);
        }
        int i16 = dp.f24402A;
        if (i16 != 0) {
            b9.append(", rotation=");
            b9.append(i16);
        }
        if (dp.f24403B) {
            b9.append(", mirrorHorizontal");
        }
        int i17 = dp.f24408G;
        if (i17 != -1) {
            b9.append(", maxSubLayers=");
            b9.append(i17);
        }
        int i18 = dp.f24409H;
        if (i18 != -1) {
            b9.append(", channels=");
            b9.append(i18);
        }
        int i19 = dp.f24410I;
        if (i19 != -1) {
            b9.append(", channel_mask=");
            b9.append(i19);
        }
        int i20 = dp.J;
        if (i20 != -1) {
            b9.append(", sample_rate=");
            b9.append(i20);
        }
        String str9 = dp.f24421d;
        if (str9 != null) {
            b9.append(", language=");
            b9.append(str9);
        }
        RB rb = dp.f24420c;
        if (!rb.isEmpty()) {
            b9.append(", labels=[");
            AbstractC2968bG.z(b9, AbstractC2968bG.w(rb, Oz.f26699d).iterator(), ",");
            b9.append("]");
        }
        int i21 = dp.f24422e;
        if (i21 != 0) {
            b9.append(", selectionFlags=[");
            String str10 = AbstractC3159eu.f29993a;
            ArrayList arrayList = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList.add(com.anythink.core.express.b.a.f17530f);
            }
            if ((i21 & 2) != 0) {
                arrayList.add("forced");
            }
            AbstractC2968bG.z(b9, arrayList.iterator(), ",");
            b9.append("]");
        }
        int i22 = dp.f24423f;
        if (i22 != 0) {
            b9.append(", roleFlags=[");
            int i23 = i22 & 32768;
            String str11 = AbstractC3159eu.f29993a;
            ArrayList arrayList2 = new ArrayList();
            if ((i22 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i22 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i22 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i22 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i22 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i22 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i22 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i22 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i22 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i22 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i22 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i22 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i22 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i22 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i22 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i23 != 0) {
                arrayList2.add("auxiliary");
            }
            AbstractC2968bG.z(b9, arrayList2.iterator(), ",");
            b9.append("]");
        }
        if ((32768 & i22) != 0) {
            b9.append(", auxiliaryTrackType=");
            String str12 = AbstractC3159eu.f29993a;
            int i24 = dp.f24424g;
            if (i24 == 0) {
                str = "undefined";
            } else if (i24 == 1) {
                str = "original";
            } else if (i24 == 2) {
                str = "depth-linear";
            } else if (i24 == 3) {
                str = "depth-inverse";
            } else {
                if (i24 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            b9.append(str);
        }
        return b9.toString();
    }

    public final C3299hP a() {
        return new C3299hP(this);
    }

    public final boolean b(DP dp) {
        List list = this.f24434r;
        int size = list.size();
        List list2 = dp.f24434r;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || DP.class != obj.getClass()) {
            return false;
        }
        DP dp = (DP) obj;
        int i6 = this.f24417Q;
        return (i6 == 0 || (i = dp.f24417Q) == 0 || i6 == i) && this.f24422e == dp.f24422e && this.f24423f == dp.f24423f && this.f24424g == dp.f24424g && this.f24425h == dp.f24425h && this.i == dp.i && this.f24432p == dp.f24432p && this.f24436t == dp.f24436t && this.f24438v == dp.f24438v && this.f24439w == dp.f24439w && this.f24440x == dp.f24440x && this.f24441y == dp.f24441y && this.f24402A == dp.f24402A && this.f24403B == dp.f24403B && this.f24406E == dp.f24406E && this.f24408G == dp.f24408G && this.f24409H == dp.f24409H && this.f24410I == dp.f24410I && this.J == dp.J && this.f24411K == dp.f24411K && this.f24412L == dp.f24412L && this.f24413M == dp.f24413M && this.f24414N == dp.f24414N && this.f24416P == dp.f24416P && Float.compare(this.f24442z, dp.f24442z) == 0 && Float.compare(this.f24404C, dp.f24404C) == 0 && Objects.equals(this.f24418a, dp.f24418a) && Objects.equals(this.f24419b, dp.f24419b) && this.f24420c.equals(dp.f24420c) && Objects.equals(this.f24427k, dp.f24427k) && Objects.equals(this.f24429m, dp.f24429m) && Objects.equals(this.f24430n, dp.f24430n) && Objects.equals(this.f24431o, dp.f24431o) && Objects.equals(this.f24421d, dp.f24421d) && Arrays.equals(this.f24405D, dp.f24405D) && Objects.equals(this.f24428l, dp.f24428l) && Objects.equals(this.f24407F, dp.f24407F) && Objects.equals(this.f24435s, dp.f24435s) && b(dp);
    }

    public final int hashCode() {
        int i = this.f24417Q;
        if (i != 0) {
            return i;
        }
        String str = this.f24418a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f24419b;
        int hashCode2 = this.f24420c.hashCode() + ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f24421d;
        int hashCode3 = ((((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f24422e) * 31) + this.f24423f) * 31) + this.f24424g) * 31) + this.f24425h) * 31) + this.i) * 31;
        String str4 = this.f24427k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        O3 o32 = this.f24428l;
        int hashCode5 = hashCode4 + (o32 == null ? 0 : o32.hashCode());
        String str5 = this.f24429m;
        int hashCode6 = ((hashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f24430n;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int floatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.f24404C) + ((((((Float.floatToIntBits(this.f24442z) + ((((((((((((((((hashCode7 + (this.f24431o != null ? r1.hashCode() : 0)) * 31) + this.f24432p) * 31) + ((int) this.f24436t)) * 31) + this.f24438v) * 31) + this.f24439w) * 31) - 1) * 31) + this.f24440x) * 31) + this.f24441y) * 31)) * 31) + this.f24402A) * 31) + (this.f24403B ? 1 : 0)) * 31)) * 31) + this.f24406E) * 31) + this.f24408G) * 31) + this.f24409H) * 31) + this.f24410I) * 31) + this.J) * 31) + this.f24411K) * 31) + this.f24412L) * 31) + this.f24413M) * 31) + this.f24414N) * 31) - 1) * 31) - 1) * 31) + this.f24416P;
        this.f24417Q = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24407F);
        String str = this.f24418a;
        int length = String.valueOf(str).length();
        String str2 = this.f24419b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f24430n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f24431o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f24427k;
        int length5 = String.valueOf(str5).length();
        int i = this.f24426j;
        int length6 = String.valueOf(i).length();
        String str6 = this.f24421d;
        int length7 = String.valueOf(str6).length();
        int i6 = this.f24438v;
        int length8 = String.valueOf(i6).length();
        int i9 = this.f24439w;
        int length9 = String.valueOf(i9).length();
        float f3 = this.f24442z;
        int length10 = String.valueOf(f3).length();
        int length11 = valueOf.length();
        int i10 = this.f24409H;
        int length12 = String.valueOf(i10).length();
        int i11 = this.f24410I;
        int length13 = String.valueOf(i11).length();
        int i12 = this.J;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i12).length() + 2);
        u1.h.i(sb, "Format(", str, ", ", str2);
        u1.h.i(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i6);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(f3);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(i10);
        u1.h.h(sb, ", ", i11, ", ", i12);
        sb.append("])");
        return sb.toString();
    }
}
