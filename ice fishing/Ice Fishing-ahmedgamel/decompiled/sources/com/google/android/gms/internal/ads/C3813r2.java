package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3813r2 {

    /* renamed from: A, reason: collision with root package name */
    public int f33456A;

    /* renamed from: B, reason: collision with root package name */
    public int f33457B;

    /* renamed from: C, reason: collision with root package name */
    public int f33458C;

    /* renamed from: D, reason: collision with root package name */
    public int f33459D;

    /* renamed from: E, reason: collision with root package name */
    public int f33460E;

    /* renamed from: F, reason: collision with root package name */
    public float f33461F;

    /* renamed from: G, reason: collision with root package name */
    public float f33462G;

    /* renamed from: H, reason: collision with root package name */
    public float f33463H;

    /* renamed from: I, reason: collision with root package name */
    public float f33464I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public float f33465K;

    /* renamed from: L, reason: collision with root package name */
    public float f33466L;

    /* renamed from: M, reason: collision with root package name */
    public float f33467M;

    /* renamed from: N, reason: collision with root package name */
    public float f33468N;

    /* renamed from: O, reason: collision with root package name */
    public float f33469O;

    /* renamed from: P, reason: collision with root package name */
    public byte[] f33470P;

    /* renamed from: Q, reason: collision with root package name */
    public int f33471Q;

    /* renamed from: R, reason: collision with root package name */
    public int f33472R;

    /* renamed from: S, reason: collision with root package name */
    public int f33473S;

    /* renamed from: T, reason: collision with root package name */
    public int f33474T;

    /* renamed from: U, reason: collision with root package name */
    public long f33475U;

    /* renamed from: V, reason: collision with root package name */
    public long f33476V;

    /* renamed from: W, reason: collision with root package name */
    public C3597n1 f33477W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f33478X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f33479Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f33480a;

    /* renamed from: a0, reason: collision with root package name */
    public String f33481a0;

    /* renamed from: b, reason: collision with root package name */
    public String f33482b;

    /* renamed from: b0, reason: collision with root package name */
    public InterfaceC3543m1 f33483b0;

    /* renamed from: c, reason: collision with root package name */
    public String f33484c;

    /* renamed from: c0, reason: collision with root package name */
    public DP f33485c0;

    /* renamed from: d, reason: collision with root package name */
    public int f33486d;

    /* renamed from: d0, reason: collision with root package name */
    public int f33487d0;

    /* renamed from: e, reason: collision with root package name */
    public long f33488e;

    /* renamed from: f, reason: collision with root package name */
    public int f33489f;

    /* renamed from: g, reason: collision with root package name */
    public int f33490g;

    /* renamed from: h, reason: collision with root package name */
    public int f33491h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33492j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f33493k;

    /* renamed from: l, reason: collision with root package name */
    public C3489l1 f33494l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f33495m;

    /* renamed from: n, reason: collision with root package name */
    public EO f33496n;

    /* renamed from: o, reason: collision with root package name */
    public int f33497o;

    /* renamed from: p, reason: collision with root package name */
    public int f33498p;

    /* renamed from: q, reason: collision with root package name */
    public int f33499q;

    /* renamed from: r, reason: collision with root package name */
    public int f33500r;

    /* renamed from: s, reason: collision with root package name */
    public int f33501s;

    /* renamed from: t, reason: collision with root package name */
    public int f33502t;

    /* renamed from: u, reason: collision with root package name */
    public int f33503u;

    /* renamed from: v, reason: collision with root package name */
    public float f33504v;

    /* renamed from: w, reason: collision with root package name */
    public float f33505w;

    /* renamed from: x, reason: collision with root package name */
    public float f33506x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f33507y;

    /* renamed from: z, reason: collision with root package name */
    public int f33508z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02ee, code lost:
    
        if (r3.d() == r4.getLeastSignificantBits()) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0742  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r9v12, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        char c9;
        String str;
        int i6;
        int i9;
        int i10;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        List list;
        List list2;
        String str3;
        int i15;
        int i16;
        int i17;
        int i18;
        String str4;
        ?? r9;
        Pair pair;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C3299hP c3299hP;
        int i19;
        int i20;
        int i21;
        int i22;
        byte[] bArr;
        String str10;
        int i23;
        int i24;
        String str11;
        List list3;
        List list4;
        C3500lC c3500lC;
        String str12 = this.f33484c;
        switch (str12.hashCode()) {
            case -2095576542:
                if (str12.equals("V_MPEG4/ISO/AP")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case -2095575984:
                if (str12.equals("V_MPEG4/ISO/SP")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -1985379776:
                if (str12.equals("A_MS/ACM")) {
                    c9 = 23;
                    break;
                }
                c9 = 65535;
                break;
            case -1784763192:
                if (str12.equals("A_TRUEHD")) {
                    c9 = 18;
                    break;
                }
                c9 = 65535;
                break;
            case -1730367663:
                if (str12.equals("A_VORBIS")) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            case -1482641358:
                if (str12.equals("A_MPEG/L2")) {
                    c9 = 14;
                    break;
                }
                c9 = 65535;
                break;
            case -1482641357:
                if (str12.equals("A_MPEG/L3")) {
                    c9 = 15;
                    break;
                }
                c9 = 65535;
                break;
            case -1373388978:
                if (str12.equals("V_MS/VFW/FOURCC")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case -933872740:
                if (str12.equals("S_DVBSUB")) {
                    c9 = '!';
                    break;
                }
                c9 = 65535;
                break;
            case -538363189:
                if (str12.equals("V_MPEG4/ISO/ASP")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case -538363109:
                if (str12.equals("V_MPEG4/ISO/AVC")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case -425012669:
                if (str12.equals("S_VOBSUB")) {
                    c9 = 31;
                    break;
                }
                c9 = 65535;
                break;
            case -356037306:
                if (str12.equals("A_DTS/LOSSLESS")) {
                    c9 = 21;
                    break;
                }
                c9 = 65535;
                break;
            case 62923557:
                if (str12.equals("A_AAC")) {
                    c9 = '\r';
                    break;
                }
                c9 = 65535;
                break;
            case 62923603:
                if (str12.equals("A_AC3")) {
                    c9 = 16;
                    break;
                }
                c9 = 65535;
                break;
            case 62927045:
                if (str12.equals("A_DTS")) {
                    c9 = 19;
                    break;
                }
                c9 = 65535;
                break;
            case 82318131:
                if (str12.equals("V_AV1")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 82338133:
                if (str12.equals("V_VP8")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 82338134:
                if (str12.equals("V_VP9")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 99146302:
                if (str12.equals("S_HDMV/PGS")) {
                    c9 = ' ';
                    break;
                }
                c9 = 65535;
                break;
            case 444813526:
                if (str12.equals("V_THEORA")) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 542569478:
                if (str12.equals("A_DTS/EXPRESS")) {
                    c9 = 20;
                    break;
                }
                c9 = 65535;
                break;
            case 635596514:
                if (str12.equals("A_PCM/FLOAT/IEEE")) {
                    c9 = 26;
                    break;
                }
                c9 = 65535;
                break;
            case 725948237:
                if (str12.equals("A_PCM/INT/BIG")) {
                    c9 = 25;
                    break;
                }
                c9 = 65535;
                break;
            case 725957860:
                if (str12.equals("A_PCM/INT/LIT")) {
                    c9 = 24;
                    break;
                }
                c9 = 65535;
                break;
            case 738597099:
                if (str12.equals("S_TEXT/ASS")) {
                    c9 = 28;
                    break;
                }
                c9 = 65535;
                break;
            case 738614379:
                if (str12.equals("S_TEXT/SSA")) {
                    c9 = 29;
                    break;
                }
                c9 = 65535;
                break;
            case 855502857:
                if (str12.equals("V_MPEGH/ISO/HEVC")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case 1045209816:
                if (str12.equals("S_TEXT/WEBVTT")) {
                    c9 = 30;
                    break;
                }
                c9 = 65535;
                break;
            case 1422270023:
                if (str12.equals("S_TEXT/UTF8")) {
                    c9 = 27;
                    break;
                }
                c9 = 65535;
                break;
            case 1809237540:
                if (str12.equals("V_MPEG2")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1950749482:
                if (str12.equals("A_EAC3")) {
                    c9 = 17;
                    break;
                }
                c9 = 65535;
                break;
            case 1950789798:
                if (str12.equals("A_FLAC")) {
                    c9 = 22;
                    break;
                }
                c9 = 65535;
                break;
            case 1951062397:
                if (str12.equals("A_OPUS")) {
                    c9 = '\f';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        ?? r12 = com.anythink.basead.exoplayer.k.o.f8434P;
        String str13 = com.anythink.basead.exoplayer.k.o.f8432N;
        int i25 = 2;
        List list5 = null;
        switch (c9) {
            case 0:
                str = com.anythink.basead.exoplayer.k.o.f8452j;
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                list5 = null;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                    str8 = str2;
                    C3879sE a9 = C3879sE.a(new Cr(this.f33470P));
                    if (a9 != null) {
                        str2 = a9.f33928b;
                        str13 = "video/dolby-vision";
                    }
                    str9 = str13;
                    boolean z3 = this.f33479Z;
                    List list6 = list5;
                    if (true != this.Y) {
                        i25 = 0;
                    }
                    int i26 = (z3 ? 1 : 0) | i25;
                    c3299hP = new C3299hP();
                    if (!H4.a(str9)) {
                        c3299hP.f30772G = this.f33471Q;
                        c3299hP.f30773H = this.f33473S;
                        c3299hP.f30774I = this.f33474T;
                        c3299hP.J = i14;
                    } else if (H4.b(str9)) {
                        if (this.f33502t == 0) {
                            int i27 = this.f33500r;
                            i19 = -1;
                            if (i27 == -1) {
                                i27 = this.f33497o;
                            }
                            this.f33500r = i27;
                            int i28 = this.f33501s;
                            if (i28 == -1) {
                                i28 = this.f33498p;
                            }
                            this.f33501s = i28;
                        } else {
                            i19 = -1;
                        }
                        float f3 = (this.f33500r == i19 || (i24 = this.f33501s) == i19) ? -1.0f : (this.f33498p * r1) / (this.f33497o * i24);
                        if (i10 == i19) {
                            if (i9 != i19) {
                                i20 = i19;
                                int i29 = i9;
                                int i30 = i13;
                                int i31 = (i11 == i19 || (i11 = this.f33499q) != i19) ? i11 : 8;
                                if (i6 != i19) {
                                    int i32 = this.f33499q;
                                    i21 = i32 == i19 ? 8 : i32;
                                } else {
                                    i21 = i6;
                                }
                                if (this.f33461F != -1.0f || this.f33462G == -1.0f || this.f33463H == -1.0f || this.f33464I == -1.0f || this.J == -1.0f || this.f33465K == -1.0f || this.f33466L == -1.0f || this.f33467M == -1.0f || this.f33468N == -1.0f || this.f33469O == -1.0f) {
                                    i22 = 0;
                                    bArr = null;
                                } else {
                                    byte[] bArr2 = new byte[25];
                                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    i22 = 0;
                                    order.put((byte) 0);
                                    order.putShort((short) ((this.f33461F * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33462G * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33463H * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33464I * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33465K * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33466L * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33467M * 50000.0f) + 0.5f));
                                    order.putShort((short) (this.f33468N + 0.5f));
                                    order.putShort((short) (this.f33469O + 0.5f));
                                    order.putShort((short) this.f33459D);
                                    order.putShort((short) this.f33460E);
                                    bArr = bArr2;
                                }
                                KJ kj = new KJ(i20, i30, i29, bArr, i31, i21);
                                str10 = this.f33482b;
                                if (str10 != null) {
                                    Map map = C3867s2.f33814r0;
                                    if (map.containsKey(str10)) {
                                        i19 = ((Integer) map.get(this.f33482b)).intValue();
                                    }
                                }
                                if (this.f33503u == 0 && Float.compare(this.f33504v, 0.0f) == 0 && Float.compare(this.f33505w, 0.0f) == 0) {
                                    if (Float.compare(this.f33506x, 0.0f) != 0) {
                                        i23 = i22;
                                    } else if (Float.compare(this.f33506x, 90.0f) == 0) {
                                        i23 = 90;
                                    } else {
                                        i23 = 180;
                                        if (Float.compare(this.f33506x, -180.0f) != 0 && Float.compare(this.f33506x, 180.0f) != 0) {
                                            if (Float.compare(this.f33506x, -90.0f) == 0) {
                                                i23 = 270;
                                            }
                                        }
                                    }
                                    c3299hP.f30799u = this.f33497o;
                                    c3299hP.f30800v = this.f33498p;
                                    c3299hP.f30767B = f3;
                                    c3299hP.f30804z = i23;
                                    c3299hP.f30768C = this.f33507y;
                                    c3299hP.f30769D = this.f33508z;
                                    c3299hP.f30770E = kj;
                                }
                                i23 = i19;
                                c3299hP.f30799u = this.f33497o;
                                c3299hP.f30800v = this.f33498p;
                                c3299hP.f30767B = f3;
                                c3299hP.f30804z = i23;
                                c3299hP.f30768C = this.f33507y;
                                c3299hP.f30769D = this.f33508z;
                                c3299hP.f30770E = kj;
                            } else if (i13 == i19 || this.f33458C != i19) {
                                i10 = this.f33456A;
                                i9 = this.f33457B;
                                i13 = this.f33458C;
                            } else {
                                i10 = this.f33456A;
                                i9 = this.f33457B;
                            }
                        }
                        i20 = i10;
                        int i292 = i9;
                        int i302 = i13;
                        if (i11 == i19) {
                        }
                        if (i6 != i19) {
                        }
                        if (this.f33461F != -1.0f) {
                        }
                        i22 = 0;
                        bArr = null;
                        KJ kj2 = new KJ(i20, i302, i292, bArr, i31, i21);
                        str10 = this.f33482b;
                        if (str10 != null) {
                        }
                        if (this.f33503u == 0) {
                            if (Float.compare(this.f33506x, 0.0f) != 0) {
                            }
                            c3299hP.f30799u = this.f33497o;
                            c3299hP.f30800v = this.f33498p;
                            c3299hP.f30767B = f3;
                            c3299hP.f30804z = i23;
                            c3299hP.f30768C = this.f33507y;
                            c3299hP.f30769D = this.f33508z;
                            c3299hP.f30770E = kj2;
                        }
                        i23 = i19;
                        c3299hP.f30799u = this.f33497o;
                        c3299hP.f30800v = this.f33498p;
                        c3299hP.f30767B = f3;
                        c3299hP.f30804z = i23;
                        c3299hP.f30768C = this.f33507y;
                        c3299hP.f30769D = this.f33508z;
                        c3299hP.f30770E = kj2;
                    } else if (!com.anythink.basead.exoplayer.k.o.Y.equals(str9) && !com.anythink.basead.exoplayer.k.o.f8434P.equals(str9) && !com.anythink.basead.exoplayer.k.o.f8433O.equals(str9) && !com.anythink.basead.exoplayer.k.o.ae.equals(str9) && !com.anythink.basead.exoplayer.k.o.af.equals(str9) && !com.anythink.basead.exoplayer.k.o.aj.equals(str9)) {
                        throw U4.a(null, "Unexpected MIME type.");
                    }
                    str11 = this.f33482b;
                    if (str11 != null && !C3867s2.f33814r0.containsKey(str11)) {
                        c3299hP.f30781b = this.f33482b;
                    }
                    c3299hP.c(i);
                    c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                    c3299hP.e(str9);
                    c3299hP.f30793o = i12;
                    c3299hP.f30783d = this.f33481a0;
                    c3299hP.f30784e = i26;
                    c3299hP.f30795q = list6;
                    c3299hP.f30788j = str8;
                    c3299hP.f30796r = this.f33496n;
                    this.f33485c0 = new DP(c3299hP);
                    return;
                }
                str8 = str2;
                str9 = str13;
                boolean z32 = this.f33479Z;
                List list62 = list5;
                if (true != this.Y) {
                }
                int i262 = (z32 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                    c3299hP.f30781b = this.f33482b;
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i262;
                c3299hP.f30795q = list62;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 1:
                byte[] bArr3 = this.f33495m;
                C3500lC j6 = bArr3 == null ? null : RB.j(bArr3);
                str = com.anythink.basead.exoplayer.k.o.f8453k;
                list = j6;
                list5 = list;
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322 = this.f33479Z;
                List list622 = list5;
                if (true != this.Y) {
                }
                int i2622 = (z322 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622;
                c3299hP.f30795q = list622;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 2:
                byte[] bArr4 = this.f33495m;
                str = "video/av01";
                if (bArr4 != null) {
                    C3500lC j9 = RB.j(bArr4);
                    C0 d2 = C0.d(this.f33495m);
                    list = j9;
                    if (d2 != null) {
                        String str14 = (String) d2.f24007y;
                        i6 = d2.f24003u;
                        int i33 = d2.f24005w;
                        i9 = d2.f24006x;
                        i10 = d2.f24004v;
                        str2 = str14;
                        i11 = i6;
                        str13 = "video/av01";
                        i12 = -1;
                        i13 = i33;
                        list3 = j9;
                        list5 = list3;
                        i14 = -1;
                        if (this.f33470P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z3222 = this.f33479Z;
                        List list6222 = list5;
                        if (true != this.Y) {
                        }
                        int i26222 = (z3222 ? 1 : 0) | i25;
                        c3299hP = new C3299hP();
                        if (!H4.a(str9)) {
                        }
                        str11 = this.f33482b;
                        if (str11 != null) {
                        }
                        c3299hP.c(i);
                        c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                        c3299hP.e(str9);
                        c3299hP.f30793o = i12;
                        c3299hP.f30783d = this.f33481a0;
                        c3299hP.f30784e = i26222;
                        c3299hP.f30795q = list6222;
                        c3299hP.f30788j = str8;
                        c3299hP.f30796r = this.f33496n;
                        this.f33485c0 = new DP(c3299hP);
                        return;
                    }
                    list5 = list;
                    str13 = str;
                    i14 = -1;
                    str2 = null;
                    i10 = -1;
                    i6 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33470P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z32222 = this.f33479Z;
                    List list62222 = list5;
                    if (true != this.Y) {
                    }
                    int i262222 = (z32222 ? 1 : 0) | i25;
                    c3299hP = new C3299hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f33482b;
                    if (str11 != null) {
                    }
                    c3299hP.c(i);
                    c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                    c3299hP.e(str9);
                    c3299hP.f30793o = i12;
                    c3299hP.f30783d = this.f33481a0;
                    c3299hP.f30784e = i262222;
                    c3299hP.f30795q = list62222;
                    c3299hP.f30788j = str8;
                    c3299hP.f30796r = this.f33496n;
                    this.f33485c0 = new DP(c3299hP);
                    return;
                }
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                list5 = null;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222 = this.f33479Z;
                List list622222 = list5;
                if (true != this.Y) {
                }
                int i2622222 = (z322222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222;
                c3299hP.f30795q = list622222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 3:
                str = com.anythink.basead.exoplayer.k.o.f8456n;
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                list5 = null;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222 = this.f33479Z;
                List list6222222 = list5;
                if (true != this.Y) {
                }
                int i26222222 = (z3222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222;
                c3299hP.f30795q = list6222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.f33495m;
                List singletonList = bArr5 == null ? null : Collections.singletonList(bArr5);
                str = com.anythink.basead.exoplayer.k.o.f8454l;
                list = singletonList;
                list5 = list;
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z32222222 = this.f33479Z;
                List list62222222 = list5;
                if (true != this.Y) {
                }
                int i262222222 = (z32222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i262222222;
                c3299hP.f30795q = list62222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 7:
                D0 a10 = D0.a(new Cr(b(this.f33484c)));
                this.f33487d0 = a10.f24291b;
                list2 = a10.f24290a;
                str3 = a10.f24300l;
                i15 = a10.f24296g;
                i9 = a10.i;
                i16 = a10.f24297h;
                i17 = a10.f24294e;
                i18 = a10.f24295f;
                str4 = com.anythink.basead.exoplayer.k.o.f8451h;
                i11 = i17;
                str13 = str4;
                i12 = -1;
                i13 = i16;
                list5 = list2;
                str2 = str3;
                i10 = i15;
                i6 = i18;
                i14 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222222 = this.f33479Z;
                List list622222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222 = (z322222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222222;
                c3299hP.f30795q = list622222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case '\b':
                C2899a1 a11 = C2899a1.a(new Cr(b(this.f33484c)), false, null);
                this.f33487d0 = a11.f28996b;
                list2 = a11.f28995a;
                str3 = a11.f29007n;
                i15 = a11.f29002h;
                i9 = a11.f29003j;
                i16 = a11.i;
                i17 = a11.f29000f;
                i18 = a11.f29001g;
                str4 = com.anythink.basead.exoplayer.k.o.i;
                i11 = i17;
                str13 = str4;
                i12 = -1;
                i13 = i16;
                list5 = list2;
                str2 = str3;
                i10 = i15;
                i6 = i18;
                i14 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222 = this.f33479Z;
                List list6222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222 = (z3222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222;
                c3299hP.f30795q = list6222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case '\t':
                Cr cr = new Cr(b(this.f33484c));
                try {
                    cr.G(16);
                    r9 = cr.a();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    r9 = 0;
                }
                try {
                    if (r9 == 1482049860) {
                        pair = new Pair("video/divx", null);
                    } else {
                        if (r9 != 859189832) {
                            if (r9 == 826496599) {
                                int i34 = cr.f24253b + 20;
                                byte[] bArr6 = cr.f24252a;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i34 >= length - 4) {
                                        throw U4.a(null, "Failed to find FourCC VC1 initialization data");
                                    }
                                    int i35 = i34 + 1;
                                    if (bArr6[i34] == 0 && bArr6[i35] == 0) {
                                        i25 = 2;
                                        if (bArr6[i34 + 2] == 1) {
                                            if (bArr6[i34 + 3] == 15) {
                                                pair = new Pair(com.anythink.basead.exoplayer.k.o.f8457o, Collections.singletonList(Arrays.copyOfRange(bArr6, i34, length)));
                                                str5 = null;
                                            } else {
                                                i34 = i35;
                                            }
                                        }
                                    }
                                    i34 = i35;
                                }
                            } else {
                                i25 = 2;
                                AbstractC2968bG.y("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                str5 = null;
                                pair = new Pair(com.anythink.basead.exoplayer.k.o.f8458p, null);
                            }
                            str6 = (String) pair.first;
                            list5 = (List) pair.second;
                            str2 = str5;
                            str13 = str6;
                            i14 = -1;
                            i10 = -1;
                            i6 = -1;
                            i9 = -1;
                            i13 = -1;
                            i11 = -1;
                            i12 = -1;
                            if (this.f33470P != null) {
                            }
                            str8 = str2;
                            str9 = str13;
                            boolean z32222222222 = this.f33479Z;
                            List list62222222222 = list5;
                            if (true != this.Y) {
                            }
                            int i262222222222 = (z32222222222 ? 1 : 0) | i25;
                            c3299hP = new C3299hP();
                            if (!H4.a(str9)) {
                            }
                            str11 = this.f33482b;
                            if (str11 != null) {
                            }
                            c3299hP.c(i);
                            c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                            c3299hP.e(str9);
                            c3299hP.f30793o = i12;
                            c3299hP.f30783d = this.f33481a0;
                            c3299hP.f30784e = i262222222222;
                            c3299hP.f30795q = list62222222222;
                            c3299hP.f30788j = str8;
                            c3299hP.f30796r = this.f33496n;
                            this.f33485c0 = new DP(c3299hP);
                            return;
                        }
                        pair = new Pair(com.anythink.basead.exoplayer.k.o.f8450g, null);
                    }
                    str5 = null;
                    i25 = 2;
                    str6 = (String) pair.first;
                    list5 = (List) pair.second;
                    str2 = str5;
                    str13 = str6;
                    i14 = -1;
                    i10 = -1;
                    i6 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33470P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z322222222222 = this.f33479Z;
                    List list622222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i2622222222222 = (z322222222222 ? 1 : 0) | i25;
                    c3299hP = new C3299hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f33482b;
                    if (str11 != null) {
                    }
                    c3299hP.c(i);
                    c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                    c3299hP.e(str9);
                    c3299hP.f30793o = i12;
                    c3299hP.f30783d = this.f33481a0;
                    c3299hP.f30784e = i2622222222222;
                    c3299hP.f30795q = list622222222222;
                    c3299hP.f30788j = str8;
                    c3299hP.f30796r = this.f33496n;
                    this.f33485c0 = new DP(c3299hP);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw U4.a(r9, "Error parsing FourCC private data");
                }
            case '\n':
                str13 = com.anythink.basead.exoplayer.k.o.f8458p;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                list5 = null;
                i13 = -1;
                i11 = -1;
                i25 = 2;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222222 = this.f33479Z;
                List list6222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222 = (z3222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222222;
                c3299hP.f30795q = list6222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 11:
                byte[] b9 = b(str12);
                try {
                    try {
                        if (b9[0] != 2) {
                            throw U4.a(null, "Error parsing vorbis codec private");
                        }
                        int i36 = 0;
                        int i37 = 1;
                        while (true) {
                            int i38 = b9[i37];
                            i37++;
                            int i39 = i38 & com.anythink.basead.exoplayer.k.p.f8473b;
                            if (i39 == 255) {
                                i36 += com.anythink.basead.exoplayer.k.p.f8473b;
                            } else {
                                int i40 = i36 + i39;
                                int i41 = 0;
                                while (true) {
                                    try {
                                        int i42 = b9[i37];
                                        i37++;
                                        int i43 = i42 & com.anythink.basead.exoplayer.k.p.f8473b;
                                        if (i43 != 255) {
                                            int i44 = i41 + i43;
                                            if (b9[i37] != 1) {
                                                throw U4.a(null, "Error parsing vorbis codec private");
                                            }
                                            byte[] bArr7 = new byte[i40];
                                            System.arraycopy(b9, i37, bArr7, 0, i40);
                                            int i45 = i37 + i40;
                                            if (b9[i45] != 3) {
                                                throw U4.a(null, "Error parsing vorbis codec private");
                                            }
                                            int i46 = i45 + i44;
                                            if (b9[i46] != 5) {
                                                throw U4.a(null, "Error parsing vorbis codec private");
                                            }
                                            int length2 = b9.length - i46;
                                            byte[] bArr8 = new byte[length2];
                                            System.arraycopy(b9, i46, bArr8, 0, length2);
                                            ArrayList arrayList = new ArrayList(2);
                                            arrayList.add(bArr7);
                                            arrayList.add(bArr8);
                                            list5 = arrayList;
                                            str13 = com.anythink.basead.exoplayer.k.o.f8426G;
                                            i12 = 8192;
                                            i14 = -1;
                                            str2 = null;
                                            i10 = -1;
                                            i6 = -1;
                                            i9 = -1;
                                            i13 = -1;
                                            i11 = -1;
                                            i25 = 2;
                                            if (this.f33470P != null) {
                                            }
                                            str8 = str2;
                                            str9 = str13;
                                            boolean z32222222222222 = this.f33479Z;
                                            List list62222222222222 = list5;
                                            if (true != this.Y) {
                                            }
                                            int i262222222222222 = (z32222222222222 ? 1 : 0) | i25;
                                            c3299hP = new C3299hP();
                                            if (!H4.a(str9)) {
                                            }
                                            str11 = this.f33482b;
                                            if (str11 != null) {
                                            }
                                            c3299hP.c(i);
                                            c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                                            c3299hP.e(str9);
                                            c3299hP.f30793o = i12;
                                            c3299hP.f30783d = this.f33481a0;
                                            c3299hP.f30784e = i262222222222222;
                                            c3299hP.f30795q = list62222222222222;
                                            c3299hP.f30788j = str8;
                                            c3299hP.f30796r = this.f33496n;
                                            this.f33485c0 = new DP(c3299hP);
                                            return;
                                        }
                                        i41 += com.anythink.basead.exoplayer.k.p.f8473b;
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                        r12 = 0;
                                        throw U4.a(r12, "Error parsing vorbis codec private");
                                    }
                                }
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused4) {
                    }
                } catch (ArrayIndexOutOfBoundsException unused5) {
                    r12 = 0;
                }
                break;
            case '\f':
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(b(this.f33484c));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList2.add(allocate.order(byteOrder).putLong(this.f33475U).array());
                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f33476V).array());
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8427H;
                i12 = 5760;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                list3 = arrayList2;
                list5 = list3;
                i14 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222222222222 = this.f33479Z;
                List list622222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222 = (z322222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222222222222;
                c3299hP.f30795q = list622222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case '\r':
                List singletonList2 = Collections.singletonList(b(str12));
                byte[] bArr9 = this.f33495m;
                C3921t2 p9 = AbstractC2639Kg.p(new C4233yr(bArr9, bArr9.length), false);
                this.f33474T = p9.f34191n;
                this.f33471Q = p9.f34192u;
                str2 = (String) p9.f34193v;
                str6 = com.anythink.basead.exoplayer.k.o.f8460r;
                list5 = singletonList2;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222222222 = this.f33479Z;
                List list6222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222 = (z3222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222222222;
                c3299hP.f30795q = list6222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 14:
                str7 = com.anythink.basead.exoplayer.k.o.f8464v;
                str2 = null;
                str13 = str7;
                i12 = 4096;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z32222222222222222 = this.f33479Z;
                List list62222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222 = (z32222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i262222222222222222;
                c3299hP.f30795q = list62222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 15:
                str7 = com.anythink.basead.exoplayer.k.o.f8462t;
                str2 = null;
                str13 = str7;
                i12 = 4096;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222222222222222 = this.f33479Z;
                List list622222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222 = (z322222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222222222222222;
                c3299hP.f30795q = list622222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 16:
                str6 = com.anythink.basead.exoplayer.k.o.f8468z;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222222222222 = this.f33479Z;
                List list6222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222 = (z3222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222222222222;
                c3299hP.f30795q = list6222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 17:
                str6 = com.anythink.basead.exoplayer.k.o.f8420A;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z32222222222222222222 = this.f33479Z;
                List list62222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222 = (z32222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i262222222222222222222;
                c3299hP.f30795q = list62222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 18:
                this.f33477W = new C3597n1();
                str6 = com.anythink.basead.exoplayer.k.o.f8422C;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222222222222222222 = this.f33479Z;
                List list622222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222 = (z322222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222222222222222222;
                c3299hP.f30795q = list622222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 19:
                this.f33478X = true;
                str6 = com.anythink.basead.exoplayer.k.o.f8423D;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222222222222222 = this.f33479Z;
                List list6222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222 = (z3222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222222222222222;
                c3299hP.f30795q = list6222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 20:
                str6 = com.anythink.basead.exoplayer.k.o.f8425F;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z32222222222222222222222 = this.f33479Z;
                List list62222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222222 = (z32222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i262222222222222222222222;
                c3299hP.f30795q = list62222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 21:
                str6 = com.anythink.basead.exoplayer.k.o.f8424E;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222222222222222222222 = this.f33479Z;
                List list622222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222222 = (z322222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222222222222222222222;
                c3299hP.f30795q = list622222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 22:
                List singletonList3 = Collections.singletonList(b(str12));
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8429K;
                list4 = singletonList3;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                list3 = list4;
                list5 = list3;
                i14 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222222222222222222 = this.f33479Z;
                List list6222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222222 = (z3222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222222222222222222;
                c3299hP.f30795q = list6222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 23:
                Cr cr2 = new Cr(b(this.f33484c));
                try {
                    int M8 = cr2.M();
                    if (M8 != 1) {
                        if (M8 == 65534) {
                            cr2.E(20);
                            int i47 = cr2.i();
                            if ((i47 >> 18) == 0 && (i47 == 0 || Integer.bitCount(i47) == this.f33471Q)) {
                                this.f33473S = i47 == 0 ? -1 : i47 << 2;
                            }
                            long d9 = cr2.d();
                            UUID uuid = C3867s2.f33813q0;
                            if (d9 == uuid.getMostSignificantBits()) {
                                break;
                            }
                        }
                        AbstractC2968bG.y("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        str2 = null;
                        i14 = -1;
                        i10 = -1;
                        i6 = -1;
                        i9 = -1;
                        i13 = -1;
                        i11 = -1;
                        i12 = -1;
                        if (this.f33470P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z32222222222222222222222222 = this.f33479Z;
                        List list62222222222222222222222222 = list5;
                        if (true != this.Y) {
                        }
                        int i262222222222222222222222222 = (z32222222222222222222222222 ? 1 : 0) | i25;
                        c3299hP = new C3299hP();
                        if (!H4.a(str9)) {
                        }
                        str11 = this.f33482b;
                        if (str11 != null) {
                        }
                        c3299hP.c(i);
                        c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                        c3299hP.e(str9);
                        c3299hP.f30793o = i12;
                        c3299hP.f30783d = this.f33481a0;
                        c3299hP.f30784e = i262222222222222222222222222;
                        c3299hP.f30795q = list62222222222222222222222222;
                        c3299hP.f30788j = str8;
                        c3299hP.f30796r = this.f33496n;
                        this.f33485c0 = new DP(c3299hP);
                        return;
                    }
                    i14 = AbstractC3159eu.b(this.f33472R, ByteOrder.LITTLE_ENDIAN);
                    if (i14 == 0) {
                        int i48 = this.f33472R;
                        StringBuilder sb = new StringBuilder(String.valueOf(i48).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i48);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        AbstractC2968bG.y("MatroskaExtractor", sb.toString());
                        str2 = null;
                        i14 = -1;
                        i10 = -1;
                        i6 = -1;
                        i9 = -1;
                        i13 = -1;
                        i11 = -1;
                        i12 = -1;
                        if (this.f33470P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z322222222222222222222222222 = this.f33479Z;
                        List list622222222222222222222222222 = list5;
                        if (true != this.Y) {
                        }
                        int i2622222222222222222222222222 = (z322222222222222222222222222 ? 1 : 0) | i25;
                        c3299hP = new C3299hP();
                        if (!H4.a(str9)) {
                        }
                        str11 = this.f33482b;
                        if (str11 != null) {
                        }
                        c3299hP.c(i);
                        c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                        c3299hP.e(str9);
                        c3299hP.f30793o = i12;
                        c3299hP.f30783d = this.f33481a0;
                        c3299hP.f30784e = i2622222222222222222222222222;
                        c3299hP.f30795q = list622222222222222222222222222;
                        c3299hP.f30788j = str8;
                        c3299hP.f30796r = this.f33496n;
                        this.f33485c0 = new DP(c3299hP);
                        return;
                    }
                    str2 = null;
                    str13 = com.anythink.basead.exoplayer.k.o.f8465w;
                    i10 = -1;
                    i6 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33470P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z3222222222222222222222222222 = this.f33479Z;
                    List list6222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i26222222222222222222222222222 = (z3222222222222222222222222222 ? 1 : 0) | i25;
                    c3299hP = new C3299hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f33482b;
                    if (str11 != null) {
                    }
                    c3299hP.c(i);
                    c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                    c3299hP.e(str9);
                    c3299hP.f30793o = i12;
                    c3299hP.f30783d = this.f33481a0;
                    c3299hP.f30784e = i26222222222222222222222222222;
                    c3299hP.f30795q = list6222222222222222222222222222;
                    c3299hP.f30788j = str8;
                    c3299hP.f30796r = this.f33496n;
                    this.f33485c0 = new DP(c3299hP);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused6) {
                    throw U4.a(null, "Error parsing MS/ACM codec private");
                }
            case 24:
                i14 = AbstractC3159eu.b(this.f33472R, ByteOrder.LITTLE_ENDIAN);
                if (i14 == 0) {
                    int i49 = this.f33472R;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i49).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i49);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    AbstractC2968bG.y("MatroskaExtractor", sb2.toString());
                    str2 = null;
                    i14 = -1;
                    i10 = -1;
                    i6 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33470P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z32222222222222222222222222222 = this.f33479Z;
                    List list62222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i262222222222222222222222222222 = (z32222222222222222222222222222 ? 1 : 0) | i25;
                    c3299hP = new C3299hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f33482b;
                    if (str11 != null) {
                    }
                    c3299hP.c(i);
                    c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                    c3299hP.e(str9);
                    c3299hP.f30793o = i12;
                    c3299hP.f30783d = this.f33481a0;
                    c3299hP.f30784e = i262222222222222222222222222222;
                    c3299hP.f30795q = list62222222222222222222222222222;
                    c3299hP.f30788j = str8;
                    c3299hP.f30796r = this.f33496n;
                    this.f33485c0 = new DP(c3299hP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8465w;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222222222222222222222222222 = this.f33479Z;
                List list622222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222222222222 = (z322222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222222222222222222222222222;
                c3299hP.f30795q = list622222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 25:
                i14 = AbstractC3159eu.b(this.f33472R, ByteOrder.BIG_ENDIAN);
                if (i14 == 0) {
                    int i50 = this.f33472R;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i50).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i50);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    AbstractC2968bG.y("MatroskaExtractor", sb3.toString());
                    str2 = null;
                    i14 = -1;
                    i10 = -1;
                    i6 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33470P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z3222222222222222222222222222222 = this.f33479Z;
                    List list6222222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i26222222222222222222222222222222 = (z3222222222222222222222222222222 ? 1 : 0) | i25;
                    c3299hP = new C3299hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f33482b;
                    if (str11 != null) {
                    }
                    c3299hP.c(i);
                    c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                    c3299hP.e(str9);
                    c3299hP.f30793o = i12;
                    c3299hP.f30783d = this.f33481a0;
                    c3299hP.f30784e = i26222222222222222222222222222222;
                    c3299hP.f30795q = list6222222222222222222222222222222;
                    c3299hP.f30788j = str8;
                    c3299hP.f30796r = this.f33496n;
                    this.f33485c0 = new DP(c3299hP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8465w;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z32222222222222222222222222222222 = this.f33479Z;
                List list62222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222222222222222 = (z32222222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i262222222222222222222222222222222;
                c3299hP.f30795q = list62222222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 26:
                i14 = AbstractC3159eu.c(this.f33472R, ByteOrder.LITTLE_ENDIAN);
                if (i14 == 0) {
                    int i51 = this.f33472R;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i51).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i51);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    AbstractC2968bG.y("MatroskaExtractor", sb4.toString());
                    str2 = null;
                    i14 = -1;
                    i10 = -1;
                    i6 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33470P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z322222222222222222222222222222222 = this.f33479Z;
                    List list622222222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i2622222222222222222222222222222222 = (z322222222222222222222222222222222 ? 1 : 0) | i25;
                    c3299hP = new C3299hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f33482b;
                    if (str11 != null) {
                    }
                    c3299hP.c(i);
                    c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                    c3299hP.e(str9);
                    c3299hP.f30793o = i12;
                    c3299hP.f30783d = this.f33481a0;
                    c3299hP.f30784e = i2622222222222222222222222222222222;
                    c3299hP.f30795q = list622222222222222222222222222222222;
                    c3299hP.f30788j = str8;
                    c3299hP.f30796r = this.f33496n;
                    this.f33485c0 = new DP(c3299hP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8465w;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222222222222222222222222222 = this.f33479Z;
                List list6222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222222222222222 = (z3222222222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222222222222222222222222222;
                c3299hP.f30795q = list6222222222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 27:
                str13 = com.anythink.basead.exoplayer.k.o.Y;
                str2 = null;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z32222222222222222222222222222222222 = this.f33479Z;
                List list62222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222222222222222222 = (z32222222222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i262222222222222222222222222222222222;
                c3299hP.f30795q = list62222222222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 28:
            case 29:
                byte[] bArr10 = C3867s2.m0;
                C3500lC k9 = RB.k(C3867s2.f33810n0, b(this.f33484c));
                str13 = com.anythink.basead.exoplayer.k.o.f8434P;
                c3500lC = k9;
                str2 = null;
                list4 = c3500lC;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                list3 = list4;
                list5 = list3;
                i14 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222222222222222222222222222222222 = this.f33479Z;
                List list622222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222222222222222222 = (z322222222222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222222222222222222222222222222222;
                c3299hP.f30795q = list622222222222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 30:
                str13 = com.anythink.basead.exoplayer.k.o.f8433O;
                str2 = null;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222222222222222222222222222222 = this.f33479Z;
                List list6222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222222222222222222 = (z3222222222222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222222222222222222222222222222;
                c3299hP.f30795q = list6222222222222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case 31:
                C3500lC j10 = RB.j(b(str12));
                str13 = com.anythink.basead.exoplayer.k.o.ae;
                c3500lC = j10;
                str2 = null;
                list4 = c3500lC;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                list3 = list4;
                list5 = list3;
                i14 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z32222222222222222222222222222222222222 = this.f33479Z;
                List list62222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222222222222222222222 = (z32222222222222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i262222222222222222222222222222222222222;
                c3299hP.f30795q = list62222222222222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case ' ':
                str13 = com.anythink.basead.exoplayer.k.o.af;
                str2 = null;
                i14 = -1;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z322222222222222222222222222222222222222 = this.f33479Z;
                List list622222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222222222222222222222 = (z322222222222222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i2622222222222222222222222222222222222222;
                c3299hP.f30795q = list622222222222222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            case '!':
                byte[] bArr11 = new byte[4];
                System.arraycopy(b(str12), 0, bArr11, 0, 4);
                C3500lC j11 = RB.j(bArr11);
                str13 = com.anythink.basead.exoplayer.k.o.aj;
                c3500lC = j11;
                str2 = null;
                list4 = c3500lC;
                i10 = -1;
                i6 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                list3 = list4;
                list5 = list3;
                i14 = -1;
                if (this.f33470P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z3222222222222222222222222222222222222222 = this.f33479Z;
                List list6222222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222222222222222222222 = (z3222222222222222222222222222222222222222 ? 1 : 0) | i25;
                c3299hP = new C3299hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f33482b;
                if (str11 != null) {
                }
                c3299hP.c(i);
                c3299hP.d(true == this.f33480a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8449f);
                c3299hP.e(str9);
                c3299hP.f30793o = i12;
                c3299hP.f30783d = this.f33481a0;
                c3299hP.f30784e = i26222222222222222222222222222222222222222;
                c3299hP.f30795q = list6222222222222222222222222222222222222222;
                c3299hP.f30788j = str8;
                c3299hP.f30796r = this.f33496n;
                this.f33485c0 = new DP(c3299hP);
                return;
            default:
                throw U4.a(null, "Unrecognized codec identifier.");
        }
    }

    public final byte[] b(String str) {
        byte[] bArr = this.f33495m;
        if (bArr != null) {
            return bArr;
        }
        throw U4.a(null, "Missing CodecPrivate for codec ".concat(String.valueOf(str)));
    }
}
