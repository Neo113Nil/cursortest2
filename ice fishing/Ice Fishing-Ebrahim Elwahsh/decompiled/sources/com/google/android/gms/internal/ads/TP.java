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
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class TP {

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f27747Q = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f27748A;

    /* renamed from: B, reason: collision with root package name */
    public final float f27749B;

    /* renamed from: C, reason: collision with root package name */
    public final byte[] f27750C;

    /* renamed from: D, reason: collision with root package name */
    public final int f27751D;

    /* renamed from: E, reason: collision with root package name */
    public final C2980bK f27752E;

    /* renamed from: F, reason: collision with root package name */
    public final int f27753F;

    /* renamed from: G, reason: collision with root package name */
    public final int f27754G;

    /* renamed from: H, reason: collision with root package name */
    public final int f27755H;

    /* renamed from: I, reason: collision with root package name */
    public final int f27756I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f27757K;

    /* renamed from: L, reason: collision with root package name */
    public final int f27758L;

    /* renamed from: M, reason: collision with root package name */
    public final int f27759M;

    /* renamed from: N, reason: collision with root package name */
    public final int f27760N;

    /* renamed from: O, reason: collision with root package name */
    public final int f27761O;

    /* renamed from: P, reason: collision with root package name */
    public int f27762P;

    /* renamed from: a, reason: collision with root package name */
    public final String f27763a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27764b;

    /* renamed from: c, reason: collision with root package name */
    public final UB f27765c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27766d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27767e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27768f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27769g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27770h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f27771j;

    /* renamed from: k, reason: collision with root package name */
    public final String f27772k;

    /* renamed from: l, reason: collision with root package name */
    public final R3 f27773l;

    /* renamed from: m, reason: collision with root package name */
    public final String f27774m;

    /* renamed from: n, reason: collision with root package name */
    public final String f27775n;

    /* renamed from: o, reason: collision with root package name */
    public final String f27776o;

    /* renamed from: p, reason: collision with root package name */
    public final int f27777p;

    /* renamed from: q, reason: collision with root package name */
    public final int f27778q;

    /* renamed from: r, reason: collision with root package name */
    public final List f27779r;

    /* renamed from: s, reason: collision with root package name */
    public final RO f27780s;

    /* renamed from: t, reason: collision with root package name */
    public final long f27781t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f27782u;

    /* renamed from: v, reason: collision with root package name */
    public final int f27783v;

    /* renamed from: w, reason: collision with root package name */
    public final int f27784w;

    /* renamed from: x, reason: collision with root package name */
    public final int f27785x;

    /* renamed from: y, reason: collision with root package name */
    public final int f27786y;

    /* renamed from: z, reason: collision with root package name */
    public final float f27787z;

    static {
        new TP(new C4065vP());
        String str = AbstractC3548lu.f32613a;
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
    }

    public TP(C4065vP c4065vP) {
        boolean z8;
        String str;
        this.f27763a = c4065vP.f34773a;
        String q6 = AbstractC3548lu.q(c4065vP.f34776d);
        this.f27766d = q6;
        if (c4065vP.f34775c.isEmpty() && c4065vP.f34774b != null) {
            this.f27765c = UB.j(new C3904sQ(q6, c4065vP.f34774b));
            this.f27764b = c4065vP.f34774b;
        } else if (c4065vP.f34775c.isEmpty() || c4065vP.f34774b != null) {
            if (!c4065vP.f34775c.isEmpty() || c4065vP.f34774b != null) {
                for (int i = 0; i < c4065vP.f34775c.size(); i++) {
                    if (!((C3904sQ) c4065vP.f34775c.get(i)).f34245b.equals(c4065vP.f34774b)) {
                    }
                }
                z8 = false;
                PA.T(z8);
                this.f27765c = c4065vP.f34775c;
                this.f27764b = c4065vP.f34774b;
            }
            z8 = true;
            PA.T(z8);
            this.f27765c = c4065vP.f34775c;
            this.f27764b = c4065vP.f34774b;
        } else {
            UB ub = c4065vP.f34775c;
            this.f27765c = ub;
            Iterator it = ub.iterator();
            while (true) {
                AbstractC3674oB abstractC3674oB = (AbstractC3674oB) it;
                if (!abstractC3674oB.hasNext()) {
                    str = ((C3904sQ) ub.get(0)).f34245b;
                    break;
                }
                C3904sQ c3904sQ = (C3904sQ) abstractC3674oB.next();
                if (TextUtils.equals(c3904sQ.f34244a, q6)) {
                    str = c3904sQ.f34245b;
                    break;
                }
            }
            this.f27764b = str;
        }
        this.f27767e = c4065vP.f34777e;
        PA.U("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c4065vP.f34779g == 0 || (c4065vP.f34778f & 32768) != 0);
        this.f27768f = c4065vP.f34778f;
        this.f27769g = c4065vP.f34779g;
        int i4 = c4065vP.f34780h;
        this.f27770h = i4;
        int i9 = c4065vP.i;
        this.i = i9;
        this.f27771j = i9 != -1 ? i9 : i4;
        this.f27772k = c4065vP.f34781j;
        this.f27773l = c4065vP.f34782k;
        this.f27774m = c4065vP.f34783l;
        this.f27775n = c4065vP.f34784m;
        this.f27776o = c4065vP.f34785n;
        this.f27777p = c4065vP.f34786o;
        this.f27778q = c4065vP.f34787p;
        List list = c4065vP.f34788q;
        this.f27779r = list == null ? Collections.EMPTY_LIST : list;
        RO ro = c4065vP.f34789r;
        this.f27780s = ro;
        this.f27781t = c4065vP.f34790s;
        this.f27782u = c4065vP.f34791t;
        this.f27783v = c4065vP.f34792u;
        this.f27784w = c4065vP.f34793v;
        this.f27785x = c4065vP.f34794w;
        this.f27786y = c4065vP.f34795x;
        this.f27787z = c4065vP.f34796y;
        int i10 = c4065vP.f34797z;
        this.f27748A = i10 == -1 ? 0 : i10;
        float f6 = c4065vP.f34760A;
        this.f27749B = f6 == -1.0f ? 1.0f : f6;
        this.f27750C = c4065vP.f34761B;
        this.f27751D = c4065vP.f34762C;
        this.f27752E = c4065vP.f34763D;
        this.f27753F = c4065vP.f34764E;
        int i11 = c4065vP.f34765F;
        this.f27754G = i11;
        int i12 = c4065vP.f34766G;
        this.f27755H = i12;
        if (i11 != -1 && i12 != -1 && Integer.bitCount(i12) != i11) {
            throw new IllegalStateException(AbstractC3194fG.u("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        this.f27756I = c4065vP.f34767H;
        this.J = c4065vP.f34768I;
        int i13 = c4065vP.J;
        this.f27757K = i13 == -1 ? 0 : i13;
        int i14 = c4065vP.f34769K;
        this.f27758L = i14 != -1 ? i14 : 0;
        this.f27759M = c4065vP.f34770L;
        this.f27760N = c4065vP.f34771M;
        int i15 = c4065vP.f34772N;
        if (i15 != 0 || ro == null) {
            this.f27761O = i15;
        } else {
            this.f27761O = 1;
        }
    }

    public static String c(TP tp) {
        String str;
        String str2;
        String str3;
        int i;
        int i4;
        StringBuilder b9 = AbstractC5088e.b("id=");
        b9.append(tp.f27763a);
        b9.append(", mimeType=");
        b9.append(tp.f27776o);
        String str4 = tp.f27775n;
        if (str4 != null) {
            b9.append(", container=");
            b9.append(str4);
        }
        String str5 = tp.f27774m;
        if (str5 != null) {
            b9.append(", primaryGroupId=");
            b9.append(str5);
        }
        int i9 = tp.f27771j;
        if (i9 != -1) {
            b9.append(", bitrate=");
            b9.append(i9);
        }
        String str6 = tp.f27772k;
        if (str6 != null) {
            b9.append(", codecs=");
            b9.append(str6);
        }
        RO ro = tp.f27780s;
        if (ro != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < ro.f27360w; i10++) {
                UUID uuid = ro.f27357n[i10].f26539u;
                if (uuid.equals(AbstractC3389ix.f32029b)) {
                    linkedHashSet.add(com.anythink.basead.exoplayer.b.bd);
                } else if (uuid.equals(AbstractC3389ix.f32030c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC3389ix.f32032e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC3389ix.f32031d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC3389ix.f32028a)) {
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
            AbstractC2655Lg.t(b9, linkedHashSet.iterator(), ",");
            b9.append(']');
        }
        int i11 = tp.f27783v;
        if (i11 != -1 && (i4 = tp.f27784w) != -1) {
            AbstractC5051n.i(b9, ", res=", i11, "x", i4);
        }
        int i12 = tp.f27785x;
        if (i12 != -1 && (i = tp.f27786y) != -1) {
            AbstractC5051n.i(b9, ", decRes=", i12, "x", i);
        }
        int i13 = QC.f27127a;
        float f6 = tp.f27749B;
        double d2 = f6;
        if (Math.copySign((-1.0d) + d2, 1.0d) > 0.001d && d2 != 1.0d && (!Double.isNaN(d2) || !Double.isNaN(1.0d))) {
            b9.append(", par=");
            Object[] objArr = {Float.valueOf(f6)};
            String str7 = AbstractC3548lu.f32613a;
            b9.append(String.format(Locale.US, "%.3f", objArr));
        }
        C2980bK c2980bK = tp.f27752E;
        if (c2980bK != null) {
            int i14 = c2980bK.f29474e;
            int i15 = c2980bK.f29475f;
            if ((i14 != -1 && i15 != -1) || c2980bK.d()) {
                b9.append(", color=");
                if (c2980bK.d()) {
                    String e6 = C2980bK.e(c2980bK.f29470a);
                    String g9 = C2980bK.g(c2980bK.f29471b);
                    String f9 = C2980bK.f(c2980bK.f29472c);
                    String str8 = AbstractC3548lu.f32613a;
                    Locale locale = Locale.US;
                    str2 = e6 + "/" + g9 + "/" + f9;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i14 == -1 || i15 == -1) {
                    str3 = "NA/NA";
                } else {
                    StringBuilder sb2 = new StringBuilder(CL.b(i14, 1) + String.valueOf(i15).length());
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
        float f10 = tp.f27787z;
        if (f10 != -1.0f) {
            b9.append(", fps=");
            b9.append(f10);
        }
        int i16 = tp.f27753F;
        if (i16 != -1) {
            b9.append(", maxSubLayers=");
            b9.append(i16);
        }
        int i17 = tp.f27754G;
        if (i17 != -1) {
            b9.append(", channels=");
            b9.append(i17);
        }
        int i18 = tp.f27755H;
        if (i18 != -1) {
            b9.append(", channel_mask=");
            b9.append(i18);
        }
        int i19 = tp.f27756I;
        if (i19 != -1) {
            b9.append(", sample_rate=");
            b9.append(i19);
        }
        String str9 = tp.f27766d;
        if (str9 != null) {
            b9.append(", language=");
            b9.append(str9);
        }
        UB ub = tp.f27765c;
        if (!ub.isEmpty()) {
            b9.append(", labels=[");
            AbstractC2655Lg.t(b9, AbstractC2655Lg.s(ub, Rz.f27457d).iterator(), ",");
            b9.append("]");
        }
        int i20 = tp.f27767e;
        if (i20 != 0) {
            b9.append(", selectionFlags=[");
            String str10 = AbstractC3548lu.f32613a;
            ArrayList arrayList = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList.add(com.anythink.core.express.b.a.f17688f);
            }
            if ((i20 & 2) != 0) {
                arrayList.add("forced");
            }
            AbstractC2655Lg.t(b9, arrayList.iterator(), ",");
            b9.append("]");
        }
        int i21 = tp.f27768f;
        if (i21 != 0) {
            b9.append(", roleFlags=[");
            int i22 = i21 & 32768;
            String str11 = AbstractC3548lu.f32613a;
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
            AbstractC2655Lg.t(b9, arrayList2.iterator(), ",");
            b9.append("]");
        }
        if ((32768 & i21) != 0) {
            b9.append(", auxiliaryTrackType=");
            String str12 = AbstractC3548lu.f32613a;
            int i23 = tp.f27769g;
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

    public final C4065vP a() {
        return new C4065vP(this);
    }

    public final boolean b(TP tp) {
        List list = this.f27779r;
        int size = list.size();
        List list2 = tp.f27779r;
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
        if (obj == null || TP.class != obj.getClass()) {
            return false;
        }
        TP tp = (TP) obj;
        int i4 = this.f27762P;
        return (i4 == 0 || (i = tp.f27762P) == 0 || i4 == i) && this.f27767e == tp.f27767e && this.f27768f == tp.f27768f && this.f27769g == tp.f27769g && this.f27770h == tp.f27770h && this.i == tp.i && this.f27777p == tp.f27777p && this.f27781t == tp.f27781t && this.f27783v == tp.f27783v && this.f27784w == tp.f27784w && this.f27785x == tp.f27785x && this.f27786y == tp.f27786y && this.f27748A == tp.f27748A && this.f27751D == tp.f27751D && this.f27753F == tp.f27753F && this.f27754G == tp.f27754G && this.f27755H == tp.f27755H && this.f27756I == tp.f27756I && this.J == tp.J && this.f27757K == tp.f27757K && this.f27758L == tp.f27758L && this.f27759M == tp.f27759M && this.f27761O == tp.f27761O && Float.compare(this.f27787z, tp.f27787z) == 0 && Float.compare(this.f27749B, tp.f27749B) == 0 && Objects.equals(this.f27763a, tp.f27763a) && Objects.equals(this.f27764b, tp.f27764b) && this.f27765c.equals(tp.f27765c) && Objects.equals(this.f27772k, tp.f27772k) && Objects.equals(this.f27774m, tp.f27774m) && Objects.equals(this.f27775n, tp.f27775n) && Objects.equals(this.f27776o, tp.f27776o) && Objects.equals(this.f27766d, tp.f27766d) && Arrays.equals(this.f27750C, tp.f27750C) && Objects.equals(this.f27773l, tp.f27773l) && Objects.equals(this.f27752E, tp.f27752E) && Objects.equals(this.f27780s, tp.f27780s) && b(tp);
    }

    public final int hashCode() {
        int i = this.f27762P;
        if (i != 0) {
            return i;
        }
        String str = this.f27763a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f27764b;
        int hashCode2 = this.f27765c.hashCode() + ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f27766d;
        int hashCode3 = ((((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f27767e) * 31) + this.f27768f) * 31) + this.f27769g) * 31) + this.f27770h) * 31) + this.i) * 31;
        String str4 = this.f27772k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        R3 r32 = this.f27773l;
        int hashCode5 = hashCode4 + (r32 == null ? 0 : r32.hashCode());
        String str5 = this.f27774m;
        int hashCode6 = ((hashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f27775n;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int floatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.f27749B) + ((((Float.floatToIntBits(this.f27787z) + ((((((((((((((hashCode7 + (this.f27776o != null ? r1.hashCode() : 0)) * 31) + this.f27777p) * 31) + ((int) this.f27781t)) * 31) + this.f27783v) * 31) + this.f27784w) * 31) + this.f27785x) * 31) + this.f27786y) * 31)) * 31) + this.f27748A) * 31)) * 31) + this.f27751D) * 31) + this.f27753F) * 31) + this.f27754G) * 31) + this.f27755H) * 31) + this.f27756I) * 31) + this.J) * 31) + this.f27757K) * 31) + this.f27758L) * 31) + this.f27759M) * 31) - 1) * 31) - 1) * 31) + this.f27761O;
        this.f27762P = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27752E);
        String str = this.f27763a;
        int length = String.valueOf(str).length();
        String str2 = this.f27764b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f27775n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f27776o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f27772k;
        int length5 = String.valueOf(str5).length();
        int i = this.f27771j;
        int length6 = String.valueOf(i).length();
        String str6 = this.f27766d;
        int length7 = String.valueOf(str6).length();
        int i4 = this.f27783v;
        int length8 = String.valueOf(i4).length();
        int i9 = this.f27784w;
        int length9 = String.valueOf(i9).length();
        float f6 = this.f27787z;
        int length10 = String.valueOf(f6).length();
        int length11 = valueOf.length();
        int i10 = this.f27754G;
        int length12 = String.valueOf(i10).length();
        int i11 = this.f27755H;
        int length13 = String.valueOf(i11).length();
        int i12 = this.f27756I;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i12).length() + 2);
        AbstractC5051n.j(sb, "Format(", str, ", ", str2);
        AbstractC5051n.j(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(f6);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(i10);
        AbstractC5051n.i(sb, ", ", i11, ", ", i12);
        sb.append("])");
        return sb.toString();
    }
}
