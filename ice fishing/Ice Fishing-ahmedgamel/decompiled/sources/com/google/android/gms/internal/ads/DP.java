package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import u.AbstractC5050e;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class DP {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f25146R = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f25147A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f25148B;

    /* renamed from: C, reason: collision with root package name */
    public final float f25149C;

    /* renamed from: D, reason: collision with root package name */
    public final byte[] f25150D;

    /* renamed from: E, reason: collision with root package name */
    public final int f25151E;

    /* renamed from: F, reason: collision with root package name */
    public final KJ f25152F;

    /* renamed from: G, reason: collision with root package name */
    public final int f25153G;

    /* renamed from: H, reason: collision with root package name */
    public final int f25154H;

    /* renamed from: I, reason: collision with root package name */
    public final int f25155I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f25156K;

    /* renamed from: L, reason: collision with root package name */
    public final int f25157L;

    /* renamed from: M, reason: collision with root package name */
    public final int f25158M;

    /* renamed from: N, reason: collision with root package name */
    public final int f25159N;

    /* renamed from: O, reason: collision with root package name */
    public final int f25160O;

    /* renamed from: P, reason: collision with root package name */
    public final int f25161P;

    /* renamed from: Q, reason: collision with root package name */
    public int f25162Q;

    /* renamed from: a, reason: collision with root package name */
    public final String f25163a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25164b;

    /* renamed from: c, reason: collision with root package name */
    public final RB f25165c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25166d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25167e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25168f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25169g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25170h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25171j;

    /* renamed from: k, reason: collision with root package name */
    public final String f25172k;

    /* renamed from: l, reason: collision with root package name */
    public final O3 f25173l;

    /* renamed from: m, reason: collision with root package name */
    public final String f25174m;

    /* renamed from: n, reason: collision with root package name */
    public final String f25175n;

    /* renamed from: o, reason: collision with root package name */
    public final String f25176o;

    /* renamed from: p, reason: collision with root package name */
    public final int f25177p;

    /* renamed from: q, reason: collision with root package name */
    public final int f25178q;

    /* renamed from: r, reason: collision with root package name */
    public final List f25179r;

    /* renamed from: s, reason: collision with root package name */
    public final EO f25180s;

    /* renamed from: t, reason: collision with root package name */
    public final long f25181t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f25182u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25183v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25184w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25185x;

    /* renamed from: y, reason: collision with root package name */
    public final int f25186y;

    /* renamed from: z, reason: collision with root package name */
    public final float f25187z;

    static {
        new DP(new C3322hP());
        String str = AbstractC3182eu.f30782a;
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

    public DP(C3322hP c3322hP) {
        boolean z6;
        String str;
        this.f25163a = c3322hP.f31546a;
        String q8 = AbstractC3182eu.q(c3322hP.f31549d);
        this.f25166d = q8;
        if (c3322hP.f31548c.isEmpty() && c3322hP.f31547b != null) {
            this.f25165c = RB.j(new C3323hQ(q8, c3322hP.f31547b));
            this.f25164b = c3322hP.f31547b;
        } else if (c3322hP.f31548c.isEmpty() || c3322hP.f31547b != null) {
            if (!c3322hP.f31548c.isEmpty() || c3322hP.f31547b != null) {
                for (int i = 0; i < c3322hP.f31548c.size(); i++) {
                    if (!((C3323hQ) c3322hP.f31548c.get(i)).f31572b.equals(c3322hP.f31547b)) {
                    }
                }
                z6 = false;
                AbstractC2792Sd.H(z6);
                this.f25165c = c3322hP.f31548c;
                this.f25164b = c3322hP.f31547b;
            }
            z6 = true;
            AbstractC2792Sd.H(z6);
            this.f25165c = c3322hP.f31548c;
            this.f25164b = c3322hP.f31547b;
        } else {
            RB rb = c3322hP.f31548c;
            this.f25165c = rb;
            Iterator it = rb.iterator();
            while (true) {
                AbstractC3522lB abstractC3522lB = (AbstractC3522lB) it;
                if (!abstractC3522lB.hasNext()) {
                    str = ((C3323hQ) rb.get(0)).f31572b;
                    break;
                }
                C3323hQ c3323hQ = (C3323hQ) abstractC3522lB.next();
                if (TextUtils.equals(c3323hQ.f31571a, q8)) {
                    str = c3323hQ.f31572b;
                    break;
                }
            }
            this.f25164b = str;
        }
        this.f25167e = c3322hP.f31550e;
        AbstractC2792Sd.I("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c3322hP.f31552g == 0 || (c3322hP.f31551f & 32768) != 0);
        this.f25168f = c3322hP.f31551f;
        this.f25169g = c3322hP.f31552g;
        int i4 = c3322hP.f31553h;
        this.f25170h = i4;
        int i6 = c3322hP.i;
        this.i = i6;
        this.f25171j = i6 != -1 ? i6 : i4;
        this.f25172k = c3322hP.f31554j;
        this.f25173l = c3322hP.f31555k;
        this.f25174m = c3322hP.f31556l;
        this.f25175n = c3322hP.f31557m;
        this.f25176o = c3322hP.f31558n;
        this.f25177p = c3322hP.f31559o;
        this.f25178q = c3322hP.f31560p;
        List list = c3322hP.f31561q;
        this.f25179r = list == null ? Collections.EMPTY_LIST : list;
        EO eo = c3322hP.f31562r;
        this.f25180s = eo;
        this.f25181t = c3322hP.f31563s;
        this.f25182u = c3322hP.f31564t;
        this.f25183v = c3322hP.f31565u;
        this.f25184w = c3322hP.f31566v;
        this.f25185x = c3322hP.f31567w;
        this.f25186y = c3322hP.f31568x;
        this.f25187z = c3322hP.f31569y;
        int i9 = c3322hP.f31570z;
        this.f25147A = i9 == -1 ? 0 : i9;
        this.f25148B = c3322hP.f31532A;
        float f2 = c3322hP.f31533B;
        this.f25149C = f2 == -1.0f ? 1.0f : f2;
        this.f25150D = c3322hP.f31534C;
        this.f25151E = c3322hP.f31535D;
        this.f25152F = c3322hP.f31536E;
        this.f25153G = c3322hP.f31537F;
        int i10 = c3322hP.f31538G;
        this.f25154H = i10;
        int i11 = c3322hP.f31539H;
        this.f25155I = i11;
        if (i10 != -1 && i11 != -1 && Integer.bitCount(i11) != i10) {
            throw new IllegalStateException(AbstractC2659Kg.x("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        this.J = c3322hP.f31540I;
        this.f25156K = c3322hP.J;
        int i12 = c3322hP.f31541K;
        this.f25157L = i12 == -1 ? 0 : i12;
        int i13 = c3322hP.f31542L;
        this.f25158M = i13 != -1 ? i13 : 0;
        this.f25159N = c3322hP.f31543M;
        this.f25160O = c3322hP.f31544N;
        int i14 = c3322hP.f31545O;
        if (i14 != 0 || eo == null) {
            this.f25161P = i14;
        } else {
            this.f25161P = 1;
        }
    }

    public static String c(DP dp) {
        String str;
        String str2;
        String str3;
        int i;
        int i4;
        StringBuilder b9 = AbstractC5050e.b("id=");
        b9.append(dp.f25163a);
        b9.append(", mimeType=");
        b9.append(dp.f25176o);
        String str4 = dp.f25175n;
        if (str4 != null) {
            b9.append(", container=");
            b9.append(str4);
        }
        String str5 = dp.f25174m;
        if (str5 != null) {
            b9.append(", primaryGroupId=");
            b9.append(str5);
        }
        int i6 = dp.f25171j;
        if (i6 != -1) {
            b9.append(", bitrate=");
            b9.append(i6);
        }
        String str6 = dp.f25172k;
        if (str6 != null) {
            b9.append(", codecs=");
            b9.append(str6);
        }
        EO eo = dp.f25180s;
        if (eo != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i9 = 0; i9 < eo.f25373w; i9++) {
                UUID uuid = eo.f25370n[i9].f24451u;
                if (uuid.equals(Yw.f29541b)) {
                    linkedHashSet.add(com.anythink.basead.exoplayer.b.bd);
                } else if (uuid.equals(Yw.f29542c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(Yw.f29544e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(Yw.f29543d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(Yw.f29540a)) {
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
            AbstractC2991bG.z(b9, linkedHashSet.iterator(), ",");
            b9.append(']');
        }
        int i10 = dp.f25183v;
        if (i10 != -1 && (i4 = dp.f25184w) != -1) {
            AbstractC5128c.g(b9, ", res=", i10, "x", i4);
        }
        int i11 = dp.f25185x;
        if (i11 != -1 && (i = dp.f25186y) != -1) {
            AbstractC5128c.g(b9, ", decRes=", i11, "x", i);
        }
        int i12 = MC.f27059a;
        float f2 = dp.f25149C;
        double d9 = f2;
        if (Math.copySign((-1.0d) + d9, 1.0d) > 0.001d && d9 != 1.0d && (!Double.isNaN(d9) || !Double.isNaN(1.0d))) {
            b9.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = AbstractC3182eu.f30782a;
            b9.append(String.format(Locale.US, "%.3f", objArr));
        }
        KJ kj = dp.f25152F;
        if (kj != null) {
            int i13 = kj.f26653e;
            int i14 = kj.f26654f;
            if ((i13 != -1 && i14 != -1) || kj.d()) {
                b9.append(", color=");
                if (kj.d()) {
                    String e9 = KJ.e(kj.f26649a);
                    String g9 = KJ.g(kj.f26650b);
                    String f9 = KJ.f(kj.f26651c);
                    String str8 = AbstractC3182eu.f30782a;
                    Locale locale = Locale.US;
                    str2 = e9 + "/" + g9 + "/" + f9;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i13 == -1 || i14 == -1) {
                    str3 = "NA/NA";
                } else {
                    StringBuilder sb2 = new StringBuilder(Wv.b(i13, 1) + String.valueOf(i14).length());
                    sb2.append(i13);
                    sb2.append("/");
                    sb2.append(i14);
                    str3 = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(str3.length() + str2.length() + 1);
                sb3.append(str2);
                sb3.append("/");
                sb3.append(str3);
                b9.append(sb3.toString());
            }
        }
        float f10 = dp.f25187z;
        if (f10 != -1.0f) {
            b9.append(", fps=");
            b9.append(f10);
        }
        int i15 = dp.f25147A;
        if (i15 != 0) {
            b9.append(", rotation=");
            b9.append(i15);
        }
        if (dp.f25148B) {
            b9.append(", mirrorHorizontal");
        }
        int i16 = dp.f25153G;
        if (i16 != -1) {
            b9.append(", maxSubLayers=");
            b9.append(i16);
        }
        int i17 = dp.f25154H;
        if (i17 != -1) {
            b9.append(", channels=");
            b9.append(i17);
        }
        int i18 = dp.f25155I;
        if (i18 != -1) {
            b9.append(", channel_mask=");
            b9.append(i18);
        }
        int i19 = dp.J;
        if (i19 != -1) {
            b9.append(", sample_rate=");
            b9.append(i19);
        }
        String str9 = dp.f25166d;
        if (str9 != null) {
            b9.append(", language=");
            b9.append(str9);
        }
        RB rb = dp.f25165c;
        if (!rb.isEmpty()) {
            b9.append(", labels=[");
            AbstractC2991bG.z(b9, AbstractC2991bG.w(rb, Oz.f27482d).iterator(), ",");
            b9.append("]");
        }
        int i20 = dp.f25167e;
        if (i20 != 0) {
            b9.append(", selectionFlags=[");
            String str10 = AbstractC3182eu.f30782a;
            ArrayList arrayList = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList.add(com.anythink.core.express.b.a.f18317f);
            }
            if ((i20 & 2) != 0) {
                arrayList.add("forced");
            }
            AbstractC2991bG.z(b9, arrayList.iterator(), ",");
            b9.append("]");
        }
        int i21 = dp.f25168f;
        if (i21 != 0) {
            b9.append(", roleFlags=[");
            int i22 = i21 & 32768;
            String str11 = AbstractC3182eu.f30782a;
            ArrayList arrayList2 = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i21 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i21 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i21 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i21 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i21 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i21 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i21 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i21 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i21 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i21 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i21 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i21 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i21 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i21 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i22 != 0) {
                arrayList2.add("auxiliary");
            }
            AbstractC2991bG.z(b9, arrayList2.iterator(), ",");
            b9.append("]");
        }
        if ((32768 & i21) != 0) {
            b9.append(", auxiliaryTrackType=");
            String str12 = AbstractC3182eu.f30782a;
            int i23 = dp.f25169g;
            if (i23 == 0) {
                str = "undefined";
            } else if (i23 == 1) {
                str = "original";
            } else if (i23 == 2) {
                str = "depth-linear";
            } else if (i23 == 3) {
                str = "depth-inverse";
            } else {
                if (i23 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            b9.append(str);
        }
        return b9.toString();
    }

    public final C3322hP a() {
        return new C3322hP(this);
    }

    public final boolean b(DP dp) {
        List list = this.f25179r;
        int size = list.size();
        List list2 = dp.f25179r;
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
        int i4 = this.f25162Q;
        return (i4 == 0 || (i = dp.f25162Q) == 0 || i4 == i) && this.f25167e == dp.f25167e && this.f25168f == dp.f25168f && this.f25169g == dp.f25169g && this.f25170h == dp.f25170h && this.i == dp.i && this.f25177p == dp.f25177p && this.f25181t == dp.f25181t && this.f25183v == dp.f25183v && this.f25184w == dp.f25184w && this.f25185x == dp.f25185x && this.f25186y == dp.f25186y && this.f25147A == dp.f25147A && this.f25148B == dp.f25148B && this.f25151E == dp.f25151E && this.f25153G == dp.f25153G && this.f25154H == dp.f25154H && this.f25155I == dp.f25155I && this.J == dp.J && this.f25156K == dp.f25156K && this.f25157L == dp.f25157L && this.f25158M == dp.f25158M && this.f25159N == dp.f25159N && this.f25161P == dp.f25161P && Float.compare(this.f25187z, dp.f25187z) == 0 && Float.compare(this.f25149C, dp.f25149C) == 0 && Objects.equals(this.f25163a, dp.f25163a) && Objects.equals(this.f25164b, dp.f25164b) && this.f25165c.equals(dp.f25165c) && Objects.equals(this.f25172k, dp.f25172k) && Objects.equals(this.f25174m, dp.f25174m) && Objects.equals(this.f25175n, dp.f25175n) && Objects.equals(this.f25176o, dp.f25176o) && Objects.equals(this.f25166d, dp.f25166d) && Arrays.equals(this.f25150D, dp.f25150D) && Objects.equals(this.f25173l, dp.f25173l) && Objects.equals(this.f25152F, dp.f25152F) && Objects.equals(this.f25180s, dp.f25180s) && b(dp);
    }

    public final int hashCode() {
        int i = this.f25162Q;
        if (i != 0) {
            return i;
        }
        String str = this.f25163a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f25164b;
        int hashCode2 = this.f25165c.hashCode() + ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f25166d;
        int hashCode3 = ((((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f25167e) * 31) + this.f25168f) * 31) + this.f25169g) * 31) + this.f25170h) * 31) + this.i) * 31;
        String str4 = this.f25172k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        O3 o32 = this.f25173l;
        int hashCode5 = hashCode4 + (o32 == null ? 0 : o32.hashCode());
        String str5 = this.f25174m;
        int hashCode6 = ((hashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f25175n;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int floatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.f25149C) + ((((((Float.floatToIntBits(this.f25187z) + ((((((((((((((((hashCode7 + (this.f25176o != null ? r1.hashCode() : 0)) * 31) + this.f25177p) * 31) + ((int) this.f25181t)) * 31) + this.f25183v) * 31) + this.f25184w) * 31) - 1) * 31) + this.f25185x) * 31) + this.f25186y) * 31)) * 31) + this.f25147A) * 31) + (this.f25148B ? 1 : 0)) * 31)) * 31) + this.f25151E) * 31) + this.f25153G) * 31) + this.f25154H) * 31) + this.f25155I) * 31) + this.J) * 31) + this.f25156K) * 31) + this.f25157L) * 31) + this.f25158M) * 31) + this.f25159N) * 31) - 1) * 31) - 1) * 31) + this.f25161P;
        this.f25162Q = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25152F);
        String str = this.f25163a;
        int length = String.valueOf(str).length();
        String str2 = this.f25164b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f25175n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f25176o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f25172k;
        int length5 = String.valueOf(str5).length();
        int i = this.f25171j;
        int length6 = String.valueOf(i).length();
        String str6 = this.f25166d;
        int length7 = String.valueOf(str6).length();
        int i4 = this.f25183v;
        int length8 = String.valueOf(i4).length();
        int i6 = this.f25184w;
        int length9 = String.valueOf(i6).length();
        float f2 = this.f25187z;
        int length10 = String.valueOf(f2).length();
        int length11 = valueOf.length();
        int i9 = this.f25154H;
        int length12 = String.valueOf(i9).length();
        int i10 = this.f25155I;
        int length13 = String.valueOf(i10).length();
        int i11 = this.J;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i11).length() + 2);
        AbstractC5128c.h(sb, "Format(", str, ", ", str2);
        AbstractC5128c.h(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(i9);
        AbstractC5128c.g(sb, ", ", i10, ", ", i11);
        sb.append("])");
        return sb.toString();
    }
}
