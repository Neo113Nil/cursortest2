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
public final class C3836r2 {

    /* renamed from: A, reason: collision with root package name */
    public int f34223A;

    /* renamed from: B, reason: collision with root package name */
    public int f34224B;

    /* renamed from: C, reason: collision with root package name */
    public int f34225C;

    /* renamed from: D, reason: collision with root package name */
    public int f34226D;

    /* renamed from: E, reason: collision with root package name */
    public int f34227E;

    /* renamed from: F, reason: collision with root package name */
    public float f34228F;

    /* renamed from: G, reason: collision with root package name */
    public float f34229G;

    /* renamed from: H, reason: collision with root package name */
    public float f34230H;

    /* renamed from: I, reason: collision with root package name */
    public float f34231I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public float f34232K;

    /* renamed from: L, reason: collision with root package name */
    public float f34233L;

    /* renamed from: M, reason: collision with root package name */
    public float f34234M;

    /* renamed from: N, reason: collision with root package name */
    public float f34235N;

    /* renamed from: O, reason: collision with root package name */
    public float f34236O;

    /* renamed from: P, reason: collision with root package name */
    public byte[] f34237P;

    /* renamed from: Q, reason: collision with root package name */
    public int f34238Q;

    /* renamed from: R, reason: collision with root package name */
    public int f34239R;

    /* renamed from: S, reason: collision with root package name */
    public int f34240S;

    /* renamed from: T, reason: collision with root package name */
    public int f34241T;

    /* renamed from: U, reason: collision with root package name */
    public long f34242U;

    /* renamed from: V, reason: collision with root package name */
    public long f34243V;

    /* renamed from: W, reason: collision with root package name */
    public C3620n1 f34244W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f34245X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f34246Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f34247a;

    /* renamed from: a0, reason: collision with root package name */
    public String f34248a0;

    /* renamed from: b, reason: collision with root package name */
    public String f34249b;

    /* renamed from: b0, reason: collision with root package name */
    public InterfaceC3566m1 f34250b0;

    /* renamed from: c, reason: collision with root package name */
    public String f34251c;

    /* renamed from: c0, reason: collision with root package name */
    public DP f34252c0;

    /* renamed from: d, reason: collision with root package name */
    public int f34253d;

    /* renamed from: d0, reason: collision with root package name */
    public int f34254d0;

    /* renamed from: e, reason: collision with root package name */
    public long f34255e;

    /* renamed from: f, reason: collision with root package name */
    public int f34256f;

    /* renamed from: g, reason: collision with root package name */
    public int f34257g;

    /* renamed from: h, reason: collision with root package name */
    public int f34258h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34259j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f34260k;

    /* renamed from: l, reason: collision with root package name */
    public C3512l1 f34261l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f34262m;

    /* renamed from: n, reason: collision with root package name */
    public EO f34263n;

    /* renamed from: o, reason: collision with root package name */
    public int f34264o;

    /* renamed from: p, reason: collision with root package name */
    public int f34265p;

    /* renamed from: q, reason: collision with root package name */
    public int f34266q;

    /* renamed from: r, reason: collision with root package name */
    public int f34267r;

    /* renamed from: s, reason: collision with root package name */
    public int f34268s;

    /* renamed from: t, reason: collision with root package name */
    public int f34269t;

    /* renamed from: u, reason: collision with root package name */
    public int f34270u;

    /* renamed from: v, reason: collision with root package name */
    public float f34271v;

    /* renamed from: w, reason: collision with root package name */
    public float f34272w;

    /* renamed from: x, reason: collision with root package name */
    public float f34273x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f34274y;

    /* renamed from: z, reason: collision with root package name */
    public int f34275z;

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
        int i4;
        int i6;
        int i9;
        String str2;
        int i10;
        int i11;
        int i12;
        int i13;
        List list;
        List list2;
        String str3;
        int i14;
        int i15;
        int i16;
        int i17;
        String str4;
        ?? r9;
        Pair pair;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C3322hP c3322hP;
        int i18;
        int i19;
        int i20;
        int i21;
        byte[] bArr;
        String str10;
        int i22;
        int i23;
        String str11;
        List list3;
        List list4;
        C3523lC c3523lC;
        String str12 = this.f34251c;
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
        ?? r1 = com.anythink.basead.exoplayer.k.o.f9220P;
        String str13 = com.anythink.basead.exoplayer.k.o.f9218N;
        int i24 = 2;
        List list5 = null;
        switch (c9) {
            case 0:
                str = com.anythink.basead.exoplayer.k.o.f9238j;
                str13 = str;
                i13 = -1;
                str2 = null;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                list5 = null;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                    str8 = str2;
                    C3902sE a9 = C3902sE.a(new Cr(this.f34237P));
                    if (a9 != null) {
                        str2 = a9.f34696b;
                        str13 = "video/dolby-vision";
                    }
                    str9 = str13;
                    boolean z6 = this.f34246Z;
                    List list6 = list5;
                    if (true != this.Y) {
                        i24 = 0;
                    }
                    int i25 = (z6 ? 1 : 0) | i24;
                    c3322hP = new C3322hP();
                    if (!H4.a(str9)) {
                        c3322hP.f31538G = this.f34238Q;
                        c3322hP.f31539H = this.f34240S;
                        c3322hP.f31540I = this.f34241T;
                        c3322hP.J = i13;
                    } else if (H4.b(str9)) {
                        if (this.f34269t == 0) {
                            int i26 = this.f34267r;
                            i18 = -1;
                            if (i26 == -1) {
                                i26 = this.f34264o;
                            }
                            this.f34267r = i26;
                            int i27 = this.f34268s;
                            if (i27 == -1) {
                                i27 = this.f34265p;
                            }
                            this.f34268s = i27;
                        } else {
                            i18 = -1;
                        }
                        float f2 = (this.f34267r == i18 || (i23 = this.f34268s) == i18) ? -1.0f : (this.f34265p * r1) / (this.f34264o * i23);
                        if (i9 == i18) {
                            if (i6 != i18) {
                                i19 = i18;
                                int i28 = i6;
                                int i29 = i12;
                                int i30 = (i10 == i18 || (i10 = this.f34266q) != i18) ? i10 : 8;
                                if (i4 != i18) {
                                    int i31 = this.f34266q;
                                    i20 = i31 == i18 ? 8 : i31;
                                } else {
                                    i20 = i4;
                                }
                                if (this.f34228F != -1.0f || this.f34229G == -1.0f || this.f34230H == -1.0f || this.f34231I == -1.0f || this.J == -1.0f || this.f34232K == -1.0f || this.f34233L == -1.0f || this.f34234M == -1.0f || this.f34235N == -1.0f || this.f34236O == -1.0f) {
                                    i21 = 0;
                                    bArr = null;
                                } else {
                                    byte[] bArr2 = new byte[25];
                                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    i21 = 0;
                                    order.put((byte) 0);
                                    order.putShort((short) ((this.f34228F * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f34229G * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f34230H * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f34231I * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f34232K * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f34233L * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f34234M * 50000.0f) + 0.5f));
                                    order.putShort((short) (this.f34235N + 0.5f));
                                    order.putShort((short) (this.f34236O + 0.5f));
                                    order.putShort((short) this.f34226D);
                                    order.putShort((short) this.f34227E);
                                    bArr = bArr2;
                                }
                                KJ kj = new KJ(i19, i29, i28, bArr, i30, i20);
                                str10 = this.f34249b;
                                if (str10 != null) {
                                    Map map = C3890s2.f34582r0;
                                    if (map.containsKey(str10)) {
                                        i18 = ((Integer) map.get(this.f34249b)).intValue();
                                    }
                                }
                                if (this.f34270u == 0 && Float.compare(this.f34271v, 0.0f) == 0 && Float.compare(this.f34272w, 0.0f) == 0) {
                                    if (Float.compare(this.f34273x, 0.0f) != 0) {
                                        i22 = i21;
                                    } else if (Float.compare(this.f34273x, 90.0f) == 0) {
                                        i22 = 90;
                                    } else {
                                        i22 = 180;
                                        if (Float.compare(this.f34273x, -180.0f) != 0 && Float.compare(this.f34273x, 180.0f) != 0) {
                                            if (Float.compare(this.f34273x, -90.0f) == 0) {
                                                i22 = 270;
                                            }
                                        }
                                    }
                                    c3322hP.f31565u = this.f34264o;
                                    c3322hP.f31566v = this.f34265p;
                                    c3322hP.f31533B = f2;
                                    c3322hP.f31570z = i22;
                                    c3322hP.f31534C = this.f34274y;
                                    c3322hP.f31535D = this.f34275z;
                                    c3322hP.f31536E = kj;
                                }
                                i22 = i18;
                                c3322hP.f31565u = this.f34264o;
                                c3322hP.f31566v = this.f34265p;
                                c3322hP.f31533B = f2;
                                c3322hP.f31570z = i22;
                                c3322hP.f31534C = this.f34274y;
                                c3322hP.f31535D = this.f34275z;
                                c3322hP.f31536E = kj;
                            } else if (i12 == i18 || this.f34225C != i18) {
                                i9 = this.f34223A;
                                i6 = this.f34224B;
                                i12 = this.f34225C;
                            } else {
                                i9 = this.f34223A;
                                i6 = this.f34224B;
                            }
                        }
                        i19 = i9;
                        int i282 = i6;
                        int i292 = i12;
                        if (i10 == i18) {
                        }
                        if (i4 != i18) {
                        }
                        if (this.f34228F != -1.0f) {
                        }
                        i21 = 0;
                        bArr = null;
                        KJ kj2 = new KJ(i19, i292, i282, bArr, i30, i20);
                        str10 = this.f34249b;
                        if (str10 != null) {
                        }
                        if (this.f34270u == 0) {
                            if (Float.compare(this.f34273x, 0.0f) != 0) {
                            }
                            c3322hP.f31565u = this.f34264o;
                            c3322hP.f31566v = this.f34265p;
                            c3322hP.f31533B = f2;
                            c3322hP.f31570z = i22;
                            c3322hP.f31534C = this.f34274y;
                            c3322hP.f31535D = this.f34275z;
                            c3322hP.f31536E = kj2;
                        }
                        i22 = i18;
                        c3322hP.f31565u = this.f34264o;
                        c3322hP.f31566v = this.f34265p;
                        c3322hP.f31533B = f2;
                        c3322hP.f31570z = i22;
                        c3322hP.f31534C = this.f34274y;
                        c3322hP.f31535D = this.f34275z;
                        c3322hP.f31536E = kj2;
                    } else if (!com.anythink.basead.exoplayer.k.o.Y.equals(str9) && !com.anythink.basead.exoplayer.k.o.f9220P.equals(str9) && !com.anythink.basead.exoplayer.k.o.f9219O.equals(str9) && !com.anythink.basead.exoplayer.k.o.ae.equals(str9) && !com.anythink.basead.exoplayer.k.o.af.equals(str9) && !com.anythink.basead.exoplayer.k.o.aj.equals(str9)) {
                        throw U4.a(null, "Unexpected MIME type.");
                    }
                    str11 = this.f34249b;
                    if (str11 != null && !C3890s2.f34582r0.containsKey(str11)) {
                        c3322hP.f31547b = this.f34249b;
                    }
                    c3322hP.c(i);
                    c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                    c3322hP.e(str9);
                    c3322hP.f31559o = i11;
                    c3322hP.f31549d = this.f34248a0;
                    c3322hP.f31550e = i25;
                    c3322hP.f31561q = list6;
                    c3322hP.f31554j = str8;
                    c3322hP.f31562r = this.f34263n;
                    this.f34252c0 = new DP(c3322hP);
                    return;
                }
                str8 = str2;
                str9 = str13;
                boolean z62 = this.f34246Z;
                List list62 = list5;
                if (true != this.Y) {
                }
                int i252 = (z62 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                    c3322hP.f31547b = this.f34249b;
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i252;
                c3322hP.f31561q = list62;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 1:
                byte[] bArr3 = this.f34262m;
                C3523lC j6 = bArr3 == null ? null : RB.j(bArr3);
                str = com.anythink.basead.exoplayer.k.o.f9239k;
                list = j6;
                list5 = list;
                str13 = str;
                i13 = -1;
                str2 = null;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622 = this.f34246Z;
                List list622 = list5;
                if (true != this.Y) {
                }
                int i2522 = (z622 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522;
                c3322hP.f31561q = list622;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 2:
                byte[] bArr4 = this.f34262m;
                str = "video/av01";
                if (bArr4 != null) {
                    C3523lC j9 = RB.j(bArr4);
                    C0 d9 = C0.d(this.f34262m);
                    list = j9;
                    if (d9 != null) {
                        String str14 = (String) d9.f24770y;
                        i4 = d9.f24766u;
                        int i32 = d9.f24768w;
                        i6 = d9.f24769x;
                        i9 = d9.f24767v;
                        str2 = str14;
                        i10 = i4;
                        str13 = "video/av01";
                        i11 = -1;
                        i12 = i32;
                        list3 = j9;
                        list5 = list3;
                        i13 = -1;
                        if (this.f34237P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z6222 = this.f34246Z;
                        List list6222 = list5;
                        if (true != this.Y) {
                        }
                        int i25222 = (z6222 ? 1 : 0) | i24;
                        c3322hP = new C3322hP();
                        if (!H4.a(str9)) {
                        }
                        str11 = this.f34249b;
                        if (str11 != null) {
                        }
                        c3322hP.c(i);
                        c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                        c3322hP.e(str9);
                        c3322hP.f31559o = i11;
                        c3322hP.f31549d = this.f34248a0;
                        c3322hP.f31550e = i25222;
                        c3322hP.f31561q = list6222;
                        c3322hP.f31554j = str8;
                        c3322hP.f31562r = this.f34263n;
                        this.f34252c0 = new DP(c3322hP);
                        return;
                    }
                    list5 = list;
                    str13 = str;
                    i13 = -1;
                    str2 = null;
                    i9 = -1;
                    i4 = -1;
                    i6 = -1;
                    i12 = -1;
                    i10 = -1;
                    i11 = -1;
                    if (this.f34237P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z62222 = this.f34246Z;
                    List list62222 = list5;
                    if (true != this.Y) {
                    }
                    int i252222 = (z62222 ? 1 : 0) | i24;
                    c3322hP = new C3322hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f34249b;
                    if (str11 != null) {
                    }
                    c3322hP.c(i);
                    c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                    c3322hP.e(str9);
                    c3322hP.f31559o = i11;
                    c3322hP.f31549d = this.f34248a0;
                    c3322hP.f31550e = i252222;
                    c3322hP.f31561q = list62222;
                    c3322hP.f31554j = str8;
                    c3322hP.f31562r = this.f34263n;
                    this.f34252c0 = new DP(c3322hP);
                    return;
                }
                str13 = str;
                i13 = -1;
                str2 = null;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                list5 = null;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222 = this.f34246Z;
                List list622222 = list5;
                if (true != this.Y) {
                }
                int i2522222 = (z622222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222;
                c3322hP.f31561q = list622222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 3:
                str = com.anythink.basead.exoplayer.k.o.f9242n;
                str13 = str;
                i13 = -1;
                str2 = null;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                list5 = null;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222 = this.f34246Z;
                List list6222222 = list5;
                if (true != this.Y) {
                }
                int i25222222 = (z6222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222;
                c3322hP.f31561q = list6222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.f34262m;
                List singletonList = bArr5 == null ? null : Collections.singletonList(bArr5);
                str = com.anythink.basead.exoplayer.k.o.f9240l;
                list = singletonList;
                list5 = list;
                str13 = str;
                i13 = -1;
                str2 = null;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z62222222 = this.f34246Z;
                List list62222222 = list5;
                if (true != this.Y) {
                }
                int i252222222 = (z62222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i252222222;
                c3322hP.f31561q = list62222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 7:
                D0 a10 = D0.a(new Cr(b(this.f34251c)));
                this.f34254d0 = a10.f25036b;
                list2 = a10.f25035a;
                str3 = a10.f25045l;
                i14 = a10.f25041g;
                i6 = a10.i;
                i15 = a10.f25042h;
                i16 = a10.f25039e;
                i17 = a10.f25040f;
                str4 = com.anythink.basead.exoplayer.k.o.f9237h;
                i10 = i16;
                str13 = str4;
                i11 = -1;
                i12 = i15;
                list5 = list2;
                str2 = str3;
                i9 = i14;
                i4 = i17;
                i13 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222222 = this.f34246Z;
                List list622222222 = list5;
                if (true != this.Y) {
                }
                int i2522222222 = (z622222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222222;
                c3322hP.f31561q = list622222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case '\b':
                C2922a1 a11 = C2922a1.a(new Cr(b(this.f34251c)), false, null);
                this.f34254d0 = a11.f29766b;
                list2 = a11.f29765a;
                str3 = a11.f29777n;
                i14 = a11.f29772h;
                i6 = a11.f29773j;
                i15 = a11.i;
                i16 = a11.f29770f;
                i17 = a11.f29771g;
                str4 = com.anythink.basead.exoplayer.k.o.i;
                i10 = i16;
                str13 = str4;
                i11 = -1;
                i12 = i15;
                list5 = list2;
                str2 = str3;
                i9 = i14;
                i4 = i17;
                i13 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222 = this.f34246Z;
                List list6222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222 = (z6222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222;
                c3322hP.f31561q = list6222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case '\t':
                Cr cr = new Cr(b(this.f34251c));
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
                                int i33 = cr.f24998b + 20;
                                byte[] bArr6 = cr.f24997a;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i33 >= length - 4) {
                                        throw U4.a(null, "Failed to find FourCC VC1 initialization data");
                                    }
                                    int i34 = i33 + 1;
                                    if (bArr6[i33] == 0 && bArr6[i34] == 0) {
                                        i24 = 2;
                                        if (bArr6[i33 + 2] == 1) {
                                            if (bArr6[i33 + 3] == 15) {
                                                pair = new Pair(com.anythink.basead.exoplayer.k.o.f9243o, Collections.singletonList(Arrays.copyOfRange(bArr6, i33, length)));
                                                str5 = null;
                                            } else {
                                                i33 = i34;
                                            }
                                        }
                                    }
                                    i33 = i34;
                                }
                            } else {
                                i24 = 2;
                                AbstractC2991bG.y("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                str5 = null;
                                pair = new Pair(com.anythink.basead.exoplayer.k.o.f9244p, null);
                            }
                            str6 = (String) pair.first;
                            list5 = (List) pair.second;
                            str2 = str5;
                            str13 = str6;
                            i13 = -1;
                            i9 = -1;
                            i4 = -1;
                            i6 = -1;
                            i12 = -1;
                            i10 = -1;
                            i11 = -1;
                            if (this.f34237P != null) {
                            }
                            str8 = str2;
                            str9 = str13;
                            boolean z62222222222 = this.f34246Z;
                            List list62222222222 = list5;
                            if (true != this.Y) {
                            }
                            int i252222222222 = (z62222222222 ? 1 : 0) | i24;
                            c3322hP = new C3322hP();
                            if (!H4.a(str9)) {
                            }
                            str11 = this.f34249b;
                            if (str11 != null) {
                            }
                            c3322hP.c(i);
                            c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                            c3322hP.e(str9);
                            c3322hP.f31559o = i11;
                            c3322hP.f31549d = this.f34248a0;
                            c3322hP.f31550e = i252222222222;
                            c3322hP.f31561q = list62222222222;
                            c3322hP.f31554j = str8;
                            c3322hP.f31562r = this.f34263n;
                            this.f34252c0 = new DP(c3322hP);
                            return;
                        }
                        pair = new Pair(com.anythink.basead.exoplayer.k.o.f9236g, null);
                    }
                    str5 = null;
                    i24 = 2;
                    str6 = (String) pair.first;
                    list5 = (List) pair.second;
                    str2 = str5;
                    str13 = str6;
                    i13 = -1;
                    i9 = -1;
                    i4 = -1;
                    i6 = -1;
                    i12 = -1;
                    i10 = -1;
                    i11 = -1;
                    if (this.f34237P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z622222222222 = this.f34246Z;
                    List list622222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i2522222222222 = (z622222222222 ? 1 : 0) | i24;
                    c3322hP = new C3322hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f34249b;
                    if (str11 != null) {
                    }
                    c3322hP.c(i);
                    c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                    c3322hP.e(str9);
                    c3322hP.f31559o = i11;
                    c3322hP.f31549d = this.f34248a0;
                    c3322hP.f31550e = i2522222222222;
                    c3322hP.f31561q = list622222222222;
                    c3322hP.f31554j = str8;
                    c3322hP.f31562r = this.f34263n;
                    this.f34252c0 = new DP(c3322hP);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw U4.a(r9, "Error parsing FourCC private data");
                }
            case '\n':
                str13 = com.anythink.basead.exoplayer.k.o.f9244p;
                i13 = -1;
                str2 = null;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                list5 = null;
                i12 = -1;
                i10 = -1;
                i24 = 2;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222222 = this.f34246Z;
                List list6222222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222222 = (z6222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222222;
                c3322hP.f31561q = list6222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 11:
                byte[] b9 = b(str12);
                try {
                    try {
                        if (b9[0] != 2) {
                            throw U4.a(null, "Error parsing vorbis codec private");
                        }
                        int i35 = 0;
                        int i36 = 1;
                        while (true) {
                            int i37 = b9[i36];
                            i36++;
                            int i38 = i37 & com.anythink.basead.exoplayer.k.p.f9259b;
                            if (i38 == 255) {
                                i35 += com.anythink.basead.exoplayer.k.p.f9259b;
                            } else {
                                int i39 = i35 + i38;
                                int i40 = 0;
                                while (true) {
                                    try {
                                        int i41 = b9[i36];
                                        i36++;
                                        int i42 = i41 & com.anythink.basead.exoplayer.k.p.f9259b;
                                        if (i42 != 255) {
                                            int i43 = i40 + i42;
                                            if (b9[i36] != 1) {
                                                throw U4.a(null, "Error parsing vorbis codec private");
                                            }
                                            byte[] bArr7 = new byte[i39];
                                            System.arraycopy(b9, i36, bArr7, 0, i39);
                                            int i44 = i36 + i39;
                                            if (b9[i44] != 3) {
                                                throw U4.a(null, "Error parsing vorbis codec private");
                                            }
                                            int i45 = i44 + i43;
                                            if (b9[i45] != 5) {
                                                throw U4.a(null, "Error parsing vorbis codec private");
                                            }
                                            int length2 = b9.length - i45;
                                            byte[] bArr8 = new byte[length2];
                                            System.arraycopy(b9, i45, bArr8, 0, length2);
                                            ArrayList arrayList = new ArrayList(2);
                                            arrayList.add(bArr7);
                                            arrayList.add(bArr8);
                                            list5 = arrayList;
                                            str13 = com.anythink.basead.exoplayer.k.o.f9212G;
                                            i11 = 8192;
                                            i13 = -1;
                                            str2 = null;
                                            i9 = -1;
                                            i4 = -1;
                                            i6 = -1;
                                            i12 = -1;
                                            i10 = -1;
                                            i24 = 2;
                                            if (this.f34237P != null) {
                                            }
                                            str8 = str2;
                                            str9 = str13;
                                            boolean z62222222222222 = this.f34246Z;
                                            List list62222222222222 = list5;
                                            if (true != this.Y) {
                                            }
                                            int i252222222222222 = (z62222222222222 ? 1 : 0) | i24;
                                            c3322hP = new C3322hP();
                                            if (!H4.a(str9)) {
                                            }
                                            str11 = this.f34249b;
                                            if (str11 != null) {
                                            }
                                            c3322hP.c(i);
                                            c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                                            c3322hP.e(str9);
                                            c3322hP.f31559o = i11;
                                            c3322hP.f31549d = this.f34248a0;
                                            c3322hP.f31550e = i252222222222222;
                                            c3322hP.f31561q = list62222222222222;
                                            c3322hP.f31554j = str8;
                                            c3322hP.f31562r = this.f34263n;
                                            this.f34252c0 = new DP(c3322hP);
                                            return;
                                        }
                                        i40 += com.anythink.basead.exoplayer.k.p.f9259b;
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                        r1 = 0;
                                        throw U4.a(r1, "Error parsing vorbis codec private");
                                    }
                                }
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused4) {
                    }
                } catch (ArrayIndexOutOfBoundsException unused5) {
                    r1 = 0;
                }
                break;
            case '\f':
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(b(this.f34251c));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList2.add(allocate.order(byteOrder).putLong(this.f34242U).array());
                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f34243V).array());
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f9213H;
                i11 = 5760;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                list3 = arrayList2;
                list5 = list3;
                i13 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222222222222 = this.f34246Z;
                List list622222222222222 = list5;
                if (true != this.Y) {
                }
                int i2522222222222222 = (z622222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222222222222;
                c3322hP.f31561q = list622222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case '\r':
                List singletonList2 = Collections.singletonList(b(str12));
                byte[] bArr9 = this.f34262m;
                C3944t2 p9 = AbstractC2659Kg.p(new C4256yr(bArr9, bArr9.length), false);
                this.f34241T = p9.f34977n;
                this.f34238Q = p9.f34978u;
                str2 = (String) p9.f34979v;
                str6 = com.anythink.basead.exoplayer.k.o.f9246r;
                list5 = singletonList2;
                str13 = str6;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222222222 = this.f34246Z;
                List list6222222222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222222222 = (z6222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222222222;
                c3322hP.f31561q = list6222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 14:
                str7 = com.anythink.basead.exoplayer.k.o.f9250v;
                str2 = null;
                str13 = str7;
                i11 = 4096;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z62222222222222222 = this.f34246Z;
                List list62222222222222222 = list5;
                if (true != this.Y) {
                }
                int i252222222222222222 = (z62222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i252222222222222222;
                c3322hP.f31561q = list62222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 15:
                str7 = com.anythink.basead.exoplayer.k.o.f9248t;
                str2 = null;
                str13 = str7;
                i11 = 4096;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222222222222222 = this.f34246Z;
                List list622222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2522222222222222222 = (z622222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222222222222222;
                c3322hP.f31561q = list622222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 16:
                str6 = com.anythink.basead.exoplayer.k.o.f9254z;
                str2 = null;
                str13 = str6;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222222222222 = this.f34246Z;
                List list6222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222222222222 = (z6222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222222222222;
                c3322hP.f31561q = list6222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 17:
                str6 = com.anythink.basead.exoplayer.k.o.f9206A;
                str2 = null;
                str13 = str6;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z62222222222222222222 = this.f34246Z;
                List list62222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i252222222222222222222 = (z62222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i252222222222222222222;
                c3322hP.f31561q = list62222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 18:
                this.f34244W = new C3620n1();
                str6 = com.anythink.basead.exoplayer.k.o.f9208C;
                str2 = null;
                str13 = str6;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222222222222222222 = this.f34246Z;
                List list622222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2522222222222222222222 = (z622222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222222222222222222;
                c3322hP.f31561q = list622222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 19:
                this.f34245X = true;
                str6 = com.anythink.basead.exoplayer.k.o.f9209D;
                str2 = null;
                str13 = str6;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222222222222222 = this.f34246Z;
                List list6222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222222222222222 = (z6222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222222222222222;
                c3322hP.f31561q = list6222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 20:
                str6 = com.anythink.basead.exoplayer.k.o.f9211F;
                str2 = null;
                str13 = str6;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z62222222222222222222222 = this.f34246Z;
                List list62222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i252222222222222222222222 = (z62222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i252222222222222222222222;
                c3322hP.f31561q = list62222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 21:
                str6 = com.anythink.basead.exoplayer.k.o.f9210E;
                str2 = null;
                str13 = str6;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222222222222222222222 = this.f34246Z;
                List list622222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2522222222222222222222222 = (z622222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222222222222222222222;
                c3322hP.f31561q = list622222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 22:
                List singletonList3 = Collections.singletonList(b(str12));
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f9215K;
                list4 = singletonList3;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                list3 = list4;
                list5 = list3;
                i13 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222222222222222222 = this.f34246Z;
                List list6222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222222222222222222 = (z6222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222222222222222222;
                c3322hP.f31561q = list6222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 23:
                Cr cr2 = new Cr(b(this.f34251c));
                try {
                    int M8 = cr2.M();
                    if (M8 != 1) {
                        if (M8 == 65534) {
                            cr2.E(20);
                            int i46 = cr2.i();
                            if ((i46 >> 18) == 0 && (i46 == 0 || Integer.bitCount(i46) == this.f34238Q)) {
                                this.f34240S = i46 == 0 ? -1 : i46 << 2;
                            }
                            long d10 = cr2.d();
                            UUID uuid = C3890s2.f34581q0;
                            if (d10 == uuid.getMostSignificantBits()) {
                                break;
                            }
                        }
                        AbstractC2991bG.y("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        str2 = null;
                        i13 = -1;
                        i9 = -1;
                        i4 = -1;
                        i6 = -1;
                        i12 = -1;
                        i10 = -1;
                        i11 = -1;
                        if (this.f34237P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z62222222222222222222222222 = this.f34246Z;
                        List list62222222222222222222222222 = list5;
                        if (true != this.Y) {
                        }
                        int i252222222222222222222222222 = (z62222222222222222222222222 ? 1 : 0) | i24;
                        c3322hP = new C3322hP();
                        if (!H4.a(str9)) {
                        }
                        str11 = this.f34249b;
                        if (str11 != null) {
                        }
                        c3322hP.c(i);
                        c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                        c3322hP.e(str9);
                        c3322hP.f31559o = i11;
                        c3322hP.f31549d = this.f34248a0;
                        c3322hP.f31550e = i252222222222222222222222222;
                        c3322hP.f31561q = list62222222222222222222222222;
                        c3322hP.f31554j = str8;
                        c3322hP.f31562r = this.f34263n;
                        this.f34252c0 = new DP(c3322hP);
                        return;
                    }
                    i13 = AbstractC3182eu.b(this.f34239R, ByteOrder.LITTLE_ENDIAN);
                    if (i13 == 0) {
                        int i47 = this.f34239R;
                        StringBuilder sb = new StringBuilder(String.valueOf(i47).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i47);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        AbstractC2991bG.y("MatroskaExtractor", sb.toString());
                        str2 = null;
                        i13 = -1;
                        i9 = -1;
                        i4 = -1;
                        i6 = -1;
                        i12 = -1;
                        i10 = -1;
                        i11 = -1;
                        if (this.f34237P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z622222222222222222222222222 = this.f34246Z;
                        List list622222222222222222222222222 = list5;
                        if (true != this.Y) {
                        }
                        int i2522222222222222222222222222 = (z622222222222222222222222222 ? 1 : 0) | i24;
                        c3322hP = new C3322hP();
                        if (!H4.a(str9)) {
                        }
                        str11 = this.f34249b;
                        if (str11 != null) {
                        }
                        c3322hP.c(i);
                        c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                        c3322hP.e(str9);
                        c3322hP.f31559o = i11;
                        c3322hP.f31549d = this.f34248a0;
                        c3322hP.f31550e = i2522222222222222222222222222;
                        c3322hP.f31561q = list622222222222222222222222222;
                        c3322hP.f31554j = str8;
                        c3322hP.f31562r = this.f34263n;
                        this.f34252c0 = new DP(c3322hP);
                        return;
                    }
                    str2 = null;
                    str13 = com.anythink.basead.exoplayer.k.o.f9251w;
                    i9 = -1;
                    i4 = -1;
                    i6 = -1;
                    i12 = -1;
                    i10 = -1;
                    i11 = -1;
                    if (this.f34237P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z6222222222222222222222222222 = this.f34246Z;
                    List list6222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i25222222222222222222222222222 = (z6222222222222222222222222222 ? 1 : 0) | i24;
                    c3322hP = new C3322hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f34249b;
                    if (str11 != null) {
                    }
                    c3322hP.c(i);
                    c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                    c3322hP.e(str9);
                    c3322hP.f31559o = i11;
                    c3322hP.f31549d = this.f34248a0;
                    c3322hP.f31550e = i25222222222222222222222222222;
                    c3322hP.f31561q = list6222222222222222222222222222;
                    c3322hP.f31554j = str8;
                    c3322hP.f31562r = this.f34263n;
                    this.f34252c0 = new DP(c3322hP);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused6) {
                    throw U4.a(null, "Error parsing MS/ACM codec private");
                }
            case 24:
                i13 = AbstractC3182eu.b(this.f34239R, ByteOrder.LITTLE_ENDIAN);
                if (i13 == 0) {
                    int i48 = this.f34239R;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i48).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i48);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    AbstractC2991bG.y("MatroskaExtractor", sb2.toString());
                    str2 = null;
                    i13 = -1;
                    i9 = -1;
                    i4 = -1;
                    i6 = -1;
                    i12 = -1;
                    i10 = -1;
                    i11 = -1;
                    if (this.f34237P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z62222222222222222222222222222 = this.f34246Z;
                    List list62222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i252222222222222222222222222222 = (z62222222222222222222222222222 ? 1 : 0) | i24;
                    c3322hP = new C3322hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f34249b;
                    if (str11 != null) {
                    }
                    c3322hP.c(i);
                    c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                    c3322hP.e(str9);
                    c3322hP.f31559o = i11;
                    c3322hP.f31549d = this.f34248a0;
                    c3322hP.f31550e = i252222222222222222222222222222;
                    c3322hP.f31561q = list62222222222222222222222222222;
                    c3322hP.f31554j = str8;
                    c3322hP.f31562r = this.f34263n;
                    this.f34252c0 = new DP(c3322hP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f9251w;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222222222222222222222222222 = this.f34246Z;
                List list622222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2522222222222222222222222222222 = (z622222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222222222222222222222222222;
                c3322hP.f31561q = list622222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 25:
                i13 = AbstractC3182eu.b(this.f34239R, ByteOrder.BIG_ENDIAN);
                if (i13 == 0) {
                    int i49 = this.f34239R;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i49).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i49);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    AbstractC2991bG.y("MatroskaExtractor", sb3.toString());
                    str2 = null;
                    i13 = -1;
                    i9 = -1;
                    i4 = -1;
                    i6 = -1;
                    i12 = -1;
                    i10 = -1;
                    i11 = -1;
                    if (this.f34237P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z6222222222222222222222222222222 = this.f34246Z;
                    List list6222222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i25222222222222222222222222222222 = (z6222222222222222222222222222222 ? 1 : 0) | i24;
                    c3322hP = new C3322hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f34249b;
                    if (str11 != null) {
                    }
                    c3322hP.c(i);
                    c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                    c3322hP.e(str9);
                    c3322hP.f31559o = i11;
                    c3322hP.f31549d = this.f34248a0;
                    c3322hP.f31550e = i25222222222222222222222222222222;
                    c3322hP.f31561q = list6222222222222222222222222222222;
                    c3322hP.f31554j = str8;
                    c3322hP.f31562r = this.f34263n;
                    this.f34252c0 = new DP(c3322hP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f9251w;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z62222222222222222222222222222222 = this.f34246Z;
                List list62222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i252222222222222222222222222222222 = (z62222222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i252222222222222222222222222222222;
                c3322hP.f31561q = list62222222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 26:
                i13 = AbstractC3182eu.c(this.f34239R, ByteOrder.LITTLE_ENDIAN);
                if (i13 == 0) {
                    int i50 = this.f34239R;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i50).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i50);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    AbstractC2991bG.y("MatroskaExtractor", sb4.toString());
                    str2 = null;
                    i13 = -1;
                    i9 = -1;
                    i4 = -1;
                    i6 = -1;
                    i12 = -1;
                    i10 = -1;
                    i11 = -1;
                    if (this.f34237P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z622222222222222222222222222222222 = this.f34246Z;
                    List list622222222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i2522222222222222222222222222222222 = (z622222222222222222222222222222222 ? 1 : 0) | i24;
                    c3322hP = new C3322hP();
                    if (!H4.a(str9)) {
                    }
                    str11 = this.f34249b;
                    if (str11 != null) {
                    }
                    c3322hP.c(i);
                    c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                    c3322hP.e(str9);
                    c3322hP.f31559o = i11;
                    c3322hP.f31549d = this.f34248a0;
                    c3322hP.f31550e = i2522222222222222222222222222222222;
                    c3322hP.f31561q = list622222222222222222222222222222222;
                    c3322hP.f31554j = str8;
                    c3322hP.f31562r = this.f34263n;
                    this.f34252c0 = new DP(c3322hP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f9251w;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222222222222222222222222222 = this.f34246Z;
                List list6222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222222222222222222222222222 = (z6222222222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222222222222222222222222222;
                c3322hP.f31561q = list6222222222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 27:
                str13 = com.anythink.basead.exoplayer.k.o.Y;
                str2 = null;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z62222222222222222222222222222222222 = this.f34246Z;
                List list62222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i252222222222222222222222222222222222 = (z62222222222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i252222222222222222222222222222222222;
                c3322hP.f31561q = list62222222222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 28:
            case 29:
                byte[] bArr10 = C3890s2.m0;
                C3523lC k9 = RB.k(C3890s2.f34578n0, b(this.f34251c));
                str13 = com.anythink.basead.exoplayer.k.o.f9220P;
                c3523lC = k9;
                str2 = null;
                list4 = c3523lC;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                list3 = list4;
                list5 = list3;
                i13 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222222222222222222222222222222222 = this.f34246Z;
                List list622222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2522222222222222222222222222222222222 = (z622222222222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222222222222222222222222222222222;
                c3322hP.f31561q = list622222222222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 30:
                str13 = com.anythink.basead.exoplayer.k.o.f9219O;
                str2 = null;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222222222222222222222222222222 = this.f34246Z;
                List list6222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222222222222222222222222222222 = (z6222222222222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222222222222222222222222222222;
                c3322hP.f31561q = list6222222222222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case 31:
                C3523lC j10 = RB.j(b(str12));
                str13 = com.anythink.basead.exoplayer.k.o.ae;
                c3523lC = j10;
                str2 = null;
                list4 = c3523lC;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                list3 = list4;
                list5 = list3;
                i13 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z62222222222222222222222222222222222222 = this.f34246Z;
                List list62222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i252222222222222222222222222222222222222 = (z62222222222222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i252222222222222222222222222222222222222;
                c3322hP.f31561q = list62222222222222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case ' ':
                str13 = com.anythink.basead.exoplayer.k.o.af;
                str2 = null;
                i13 = -1;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z622222222222222222222222222222222222222 = this.f34246Z;
                List list622222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2522222222222222222222222222222222222222 = (z622222222222222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i2522222222222222222222222222222222222222;
                c3322hP.f31561q = list622222222222222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            case '!':
                byte[] bArr11 = new byte[4];
                System.arraycopy(b(str12), 0, bArr11, 0, 4);
                C3523lC j11 = RB.j(bArr11);
                str13 = com.anythink.basead.exoplayer.k.o.aj;
                c3523lC = j11;
                str2 = null;
                list4 = c3523lC;
                i9 = -1;
                i4 = -1;
                i6 = -1;
                i12 = -1;
                i10 = -1;
                i11 = -1;
                list3 = list4;
                list5 = list3;
                i13 = -1;
                if (this.f34237P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z6222222222222222222222222222222222222222 = this.f34246Z;
                List list6222222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i25222222222222222222222222222222222222222 = (z6222222222222222222222222222222222222222 ? 1 : 0) | i24;
                c3322hP = new C3322hP();
                if (!H4.a(str9)) {
                }
                str11 = this.f34249b;
                if (str11 != null) {
                }
                c3322hP.c(i);
                c3322hP.d(true == this.f34247a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f9235f);
                c3322hP.e(str9);
                c3322hP.f31559o = i11;
                c3322hP.f31549d = this.f34248a0;
                c3322hP.f31550e = i25222222222222222222222222222222222222222;
                c3322hP.f31561q = list6222222222222222222222222222222222222222;
                c3322hP.f31554j = str8;
                c3322hP.f31562r = this.f34263n;
                this.f34252c0 = new DP(c3322hP);
                return;
            default:
                throw U4.a(null, "Unrecognized codec identifier.");
        }
    }

    public final byte[] b(String str) {
        byte[] bArr = this.f34262m;
        if (bArr != null) {
            return bArr;
        }
        throw U4.a(null, "Missing CodecPrivate for codec ".concat(String.valueOf(str)));
    }
}
