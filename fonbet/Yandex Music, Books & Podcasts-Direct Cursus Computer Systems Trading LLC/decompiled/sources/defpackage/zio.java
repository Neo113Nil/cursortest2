package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes.dex */
public final class zio {
    public final mio a;
    public final Uri b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0596, code lost:
    
        if (r2.equals("audio/amr-wb") != false) goto L270;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zio(sio sioVar, lmh lmhVar, Uri uri) {
        char c;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        cee ceeVar;
        Object obj;
        Object obj2;
        cee r;
        int i2;
        String str5;
        boolean z;
        boolean z2;
        Uri parse;
        cee ceeVar2 = lmhVar.i;
        vq1.u("missing attribute control", ceeVar2.containsKey("control"));
        bsc bscVar = new bsc();
        int i3 = lmhVar.e;
        kmh kmhVar = lmhVar.j;
        if (i3 > 0) {
            bscVar.h = i3;
        }
        int i4 = kmhVar.a;
        String str6 = kmhVar.b;
        String N = ltg.N(str6);
        N.getClass();
        switch (N.hashCode()) {
            case -1922091719:
                if (N.equals("MPEG4-GENERIC")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2412:
                if (N.equals("L8")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 64593:
                if (N.equals("AC3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 64934:
                if (N.equals("AMR")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 74609:
                if (N.equals("L16")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 85182:
                if (N.equals("VP8")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 85183:
                if (N.equals("VP9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2194728:
                if (N.equals(ScreenMirroringConfig.Video.CODEC)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2194729:
                if (N.equals("H265")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2433087:
                if (N.equals("OPUS")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2450119:
                if (N.equals("PCMA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2450139:
                if (N.equals("PCMU")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1061166827:
                if (N.equals("MP4A-LATM")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1934494802:
                if (N.equals("AMR-WB")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1959269366:
                if (N.equals("MP4V-ES")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2137188397:
                if (N.equals("H263-1998")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2137209252:
                if (N.equals("H263-2000")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        int i5 = 1;
        switch (c) {
            case 0:
            case '\f':
                str = str6;
                str2 = "audio/mp4a-latm";
                bscVar.m = l5i.p(str2);
                int i6 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                    str3 = str2;
                    i = -1;
                } else {
                    int i7 = kmhVar.d;
                    if (i7 != -1) {
                        i = i7;
                        str3 = str2;
                    } else {
                        str3 = str2;
                        i = str3.equals("audio/ac3") ? 6 : 1;
                    }
                    bscVar.D = i6;
                    bscVar.C = i;
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                    r = vsn.g;
                    ceeVar = ceeVar2;
                    obj2 = "audio/raw";
                    obj = "audio/ac3";
                } else {
                    int i8 = dvt.a;
                    ceeVar = ceeVar2;
                    obj = "audio/ac3";
                    String[] split = str4.split(StringUtil.SPACE, 2);
                    obj2 = "audio/raw";
                    vq1.u(str4, split.length == 2);
                    int i9 = 0;
                    String[] split2 = split[1].split(";\\s?", 0);
                    x0 x0Var = new x0(4);
                    int length = split2.length;
                    char c2 = 0;
                    while (i9 < length) {
                        String[] strArr = split2;
                        String[] split3 = strArr[i9].split("=", 2);
                        x0Var.V(split3[c2], split3[1]);
                        i9++;
                        split2 = strArr;
                        length = length;
                        c2 = 0;
                    }
                    r = x0Var.r();
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        i2 = 1;
                        str5 = str;
                        z = false;
                        if (str3.equals("video/3gpp")) {
                            bscVar.t = 352;
                            bscVar.u = 288;
                        }
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str7 = (String) ceeVar.get("control");
                        parse = Uri.parse(str7);
                        if (!parse.isAbsolute()) {
                            parse = !TextUtils.isEmpty(sioVar.b("Content-Base")) ? Uri.parse(sioVar.b("Content-Base")) : !TextUtils.isEmpty(sioVar.b("Content-Location")) ? Uri.parse(sioVar.b("Content-Location")) : uri;
                            if (!str7.equals("*")) {
                                parse = parse.buildUpon().appendEncodedPath(str7).build();
                            }
                        }
                        this.b = parse;
                        return;
                    case -1662541442:
                        i2 = 1;
                        str5 = str;
                        z = false;
                        if (str3.equals("video/hevc")) {
                            vq1.u("missing attribute fmtp", !r.isEmpty());
                            if (r.containsKey("sprop-max-don-diff")) {
                                String str8 = (String) r.get("sprop-max-don-diff");
                                str8.getClass();
                                int parseInt = Integer.parseInt(str8);
                                vq1.u("non-zero sprop-max-don-diff " + parseInt + " is not supported", parseInt == 0);
                            }
                            vq1.u("missing sprop-vps parameter", r.containsKey("sprop-vps"));
                            String str9 = (String) r.get("sprop-vps");
                            str9.getClass();
                            vq1.u("missing sprop-sps parameter", r.containsKey("sprop-sps"));
                            String str10 = (String) r.get("sprop-sps");
                            str10.getClass();
                            vq1.u("missing sprop-pps parameter", r.containsKey("sprop-pps"));
                            String str11 = (String) r.get("sprop-pps");
                            str11.getClass();
                            Object[] objArr = {a(str9), a(str10), a(str11)};
                            gdg.r(3, objArr);
                            qsn t = yde.t(3, objArr);
                            bscVar.p = t;
                            i2 = 1;
                            byte[] bArr = (byte[]) t.get(1);
                            hwi S = zc4.S(bArr, 4, bArr.length, null);
                            bscVar.x = S.g;
                            bscVar.u = S.f;
                            bscVar.t = S.e;
                            bscVar.A = new q85(S.i, S.j, S.k, S.c + 8, S.d + 8, null);
                            fwi fwiVar = S.b;
                            if (fwiVar != null) {
                                bscVar.j = ir4.b(fwiVar.a, fwiVar.b, fwiVar.c, fwiVar.d, fwiVar.e, fwiVar.f);
                            }
                        }
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str72 = (String) ceeVar.get("control");
                        parse = Uri.parse(str72);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case -1606874997:
                        str5 = str;
                        z = false;
                        i2 = 1;
                        break;
                    case -53558318:
                        str5 = str;
                        if (str3.equals("audio/mp4a-latm")) {
                            vq1.v(i != -1);
                            vq1.u("missing attribute fmtp", !r.isEmpty());
                            if (str5.equals("MP4A-LATM")) {
                                vq1.u("Only supports cpresent=0 in AAC audio.", r.containsKey("cpresent") && ((String) r.get("cpresent")).equals(CommonUrlParts.Values.FALSE_INTEGER));
                                String str12 = (String) r.get(DeviceService.KEY_CONFIG);
                                vq1.y(str12, "AAC audio stream must include config fmtp parameter");
                                vq1.u("Malformat MPEG4 config: ".concat(str12), str12.length() % 2 == 0);
                                byte[] w = dvt.w(str12);
                                v94 v94Var = new v94(w, w.length);
                                vq1.u("Only supports audio mux version 0.", v94Var.i(1) == 0);
                                vq1.u("Only supports allStreamsSameTimeFraming.", v94Var.i(1) == 1);
                                v94Var.t(6);
                                vq1.u("Only supports one program.", v94Var.i(4) == 0);
                                vq1.u("Only supports one numLayer.", v94Var.i(3) == 0);
                                z = false;
                                try {
                                    c1 x0 = zsd.x0(v94Var, false);
                                    bscVar.D = x0.b;
                                    bscVar.C = x0.c;
                                    bscVar.j = x0.a;
                                } catch (r7k e) {
                                    xq0.t(e);
                                    throw null;
                                }
                            } else {
                                z = false;
                            }
                            String str13 = (String) r.get("profile-level-id");
                            if (str13 == null && str5.equals("MP4A-LATM")) {
                                str13 = "30";
                            }
                            vq1.u("missing profile-level-id param", (str13 == null || str13.isEmpty()) ? z : true);
                            bscVar.j = "mp4a.40." + str13;
                            bscVar.p = yde.y(zsd.E(i6, i));
                            i2 = 1;
                            vq1.v(i6 > 0 ? i2 : z);
                            this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                            String str722 = (String) ceeVar.get("control");
                            parse = Uri.parse(str722);
                            if (!parse.isAbsolute()) {
                            }
                            this.b = parse;
                            return;
                        }
                        z = false;
                        i2 = 1;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str7222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str7222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 187078296:
                        str5 = str;
                        str3.equals(obj);
                        z = false;
                        i2 = 1;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str72222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str72222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 187094639:
                        if (str3.equals(obj2)) {
                            str5 = str;
                            vq1.v(str5.equals("L8") || str5.equals("L16"));
                            bscVar.E = str5.equals("L8") ? 3 : 268435456;
                            z = false;
                            i2 = 1;
                            vq1.v(i6 > 0 ? i2 : z);
                            this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                            String str722222 = (String) ceeVar.get("control");
                            parse = Uri.parse(str722222);
                            if (!parse.isAbsolute()) {
                            }
                            this.b = parse;
                            return;
                        }
                        str5 = str;
                        z = false;
                        i2 = 1;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str7222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str7222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 1187890754:
                        if (str3.equals("video/mp4v-es")) {
                            vq1.v(!r.isEmpty());
                            String str14 = (String) r.get(DeviceService.KEY_CONFIG);
                            if (str14 != null) {
                                byte[] w2 = dvt.w(str14);
                                bscVar.p = yde.y(w2);
                                byte[] bArr2 = ir4.a;
                                d7k d7kVar = new d7k(w2);
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 3;
                                    if (i11 >= w2.length) {
                                        z2 = false;
                                    } else if (d7kVar.y() == i5 && (w2[i11] & 240) == 32) {
                                        z2 = true;
                                    } else {
                                        d7kVar.H(d7kVar.b - 2);
                                        i10++;
                                        i5 = 1;
                                    }
                                }
                                vq1.u("Invalid input: VOL not found.", z2);
                                v94 v94Var2 = new v94(w2, w2.length);
                                v94Var2.t((i10 + 4) * 8);
                                v94Var2.t(1);
                                v94Var2.t(8);
                                if (v94Var2.h()) {
                                    v94Var2.t(4);
                                    v94Var2.t(3);
                                }
                                if (v94Var2.i(4) == 15) {
                                    v94Var2.t(8);
                                    v94Var2.t(8);
                                }
                                if (v94Var2.h()) {
                                    v94Var2.t(2);
                                    v94Var2.t(1);
                                    if (v94Var2.h()) {
                                        v94Var2.t(79);
                                    }
                                }
                                vq1.u("Only supports rectangular video object layer shape.", v94Var2.i(2) == 0);
                                vq1.v(v94Var2.h());
                                int i12 = v94Var2.i(16);
                                vq1.v(v94Var2.h());
                                if (v94Var2.h()) {
                                    vq1.v(i12 > 0);
                                    int i13 = 0;
                                    for (int i14 = i12 - 1; i14 > 0; i14 >>= 1) {
                                        i13++;
                                    }
                                    v94Var2.t(i13);
                                }
                                vq1.v(v94Var2.h());
                                int i15 = v94Var2.i(13);
                                vq1.v(v94Var2.h());
                                int i16 = v94Var2.i(13);
                                vq1.v(v94Var2.h());
                                v94Var2.t(1);
                                Pair create = Pair.create(Integer.valueOf(i15), Integer.valueOf(i16));
                                bscVar.t = ((Integer) create.first).intValue();
                                bscVar.u = ((Integer) create.second).intValue();
                            } else {
                                bscVar.t = 352;
                                bscVar.u = 288;
                            }
                            String str15 = (String) r.get("profile-level-id");
                            bscVar.j = "mp4v.".concat(str15 == null ? "1" : str15);
                        }
                        str5 = str;
                        z = false;
                        i2 = 1;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str72222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str72222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 1331836730:
                        if (str3.equals("video/avc")) {
                            vq1.u("missing attribute fmtp", !r.isEmpty());
                            vq1.u("missing sprop parameter", r.containsKey("sprop-parameter-sets"));
                            String str16 = (String) r.get("sprop-parameter-sets");
                            str16.getClass();
                            int i17 = dvt.a;
                            String[] split4 = str16.split(StringUtils.COMMA, -1);
                            vq1.u("empty sprop value", split4.length == 2);
                            qsn z3 = yde.z(a(split4[0]), a(split4[1]));
                            bscVar.p = z3;
                            byte[] bArr3 = (byte[]) z3.get(0);
                            kwi U = zc4.U(bArr3, 4, bArr3.length);
                            bscVar.x = U.g;
                            bscVar.u = U.f;
                            bscVar.t = U.e;
                            bscVar.A = new q85(U.p, U.q, U.r, U.h + 8, U.i + 8, null);
                            String str17 = (String) r.get("profile-level-id");
                            if (str17 != null) {
                                bscVar.j = "avc1.".concat(str17);
                            } else {
                                bscVar.j = ir4.a(U.a, U.b, U.c);
                            }
                        }
                        i2 = 1;
                        str5 = str;
                        z = false;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str722222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str722222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 1503095341:
                        if (str3.equals("audio/3gpp")) {
                            i2 = 1;
                            str5 = str;
                            z = false;
                            vq1.u("Multi channel AMR is not currently supported.", i == i2 ? i2 : z);
                            vq1.u("fmtp parameters must include octet-align.", (r.isEmpty() ? 1 : 0) ^ i2);
                            vq1.u("Only octet aligned mode is currently supported.", r.containsKey("octet-align"));
                            vq1.u("Interleaving mode is not currently supported.", (r.containsKey("interleaving") ? 1 : 0) ^ i2);
                            vq1.v(i6 > 0 ? i2 : z);
                            this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                            String str7222222222 = (String) ceeVar.get("control");
                            parse = Uri.parse(str7222222222);
                            if (!parse.isAbsolute()) {
                            }
                            this.b = parse;
                            return;
                        }
                        i2 = 1;
                        str5 = str;
                        z = false;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str72222222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str72222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 1504891608:
                        if (str3.equals("audio/opus")) {
                            vq1.v(i != -1);
                            vq1.u("Invalid OPUS clock rate.", i6 == 48000);
                        }
                        i2 = 1;
                        str5 = str;
                        z = false;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str722222222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str722222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 1599127256:
                        if (str3.equals("video/x-vnd.on2.vp8")) {
                            bscVar.t = 320;
                            bscVar.u = 240;
                        }
                        i2 = 1;
                        str5 = str;
                        z = false;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str7222222222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str7222222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 1599127257:
                        if (str3.equals("video/x-vnd.on2.vp9")) {
                            bscVar.t = 320;
                            bscVar.u = 240;
                        }
                        i2 = 1;
                        str5 = str;
                        z = false;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str72222222222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str72222222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 1903231877:
                        str3.equals("audio/g711-alaw");
                        i2 = 1;
                        str5 = str;
                        z = false;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str722222222222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str722222222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    case 1903589369:
                        str3.equals("audio/g711-mlaw");
                        i2 = 1;
                        str5 = str;
                        z = false;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str7222222222222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str7222222222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                    default:
                        i2 = 1;
                        str5 = str;
                        z = false;
                        vq1.v(i6 > 0 ? i2 : z);
                        this.a = new mio(new dsc(bscVar), i4, i6, (vsn) r, str5);
                        String str72222222222222222 = (String) ceeVar.get("control");
                        parse = Uri.parse(str72222222222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.b = parse;
                        return;
                }
            case 1:
            case 4:
                str2 = "audio/raw";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i62 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case 2:
                str = str6;
                str2 = "audio/ac3";
                bscVar.m = l5i.p(str2);
                int i622 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case 3:
                str2 = "audio/3gpp";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i6222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case 5:
                str2 = "video/x-vnd.on2.vp8";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i62222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case 6:
                str2 = "video/x-vnd.on2.vp9";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i622222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case 7:
                str2 = "video/avc";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i6222222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case '\b':
                str = str6;
                str2 = "video/hevc";
                bscVar.m = l5i.p(str2);
                int i62222222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case '\t':
                str2 = "audio/opus";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i622222222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case '\n':
                str2 = "audio/g711-alaw";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i6222222222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case 11:
                str2 = "audio/g711-mlaw";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i62222222222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case '\r':
                str = str6;
                str2 = "audio/amr-wb";
                bscVar.m = l5i.p(str2);
                int i622222222222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case 14:
                str2 = "video/mp4v-es";
                str = str6;
                bscVar.m = l5i.p(str2);
                int i6222222222222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            case 15:
            case 16:
                str = str6;
                str2 = "video/3gpp";
                bscVar.m = l5i.p(str2);
                int i62222222222222 = kmhVar.c;
                if (CameraProperty.AUDIO.equals(lmhVar.a)) {
                }
                str4 = (String) ceeVar2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
            default:
                xq0.x(str6);
                throw null;
        }
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(zc4.h, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zio.class == obj.getClass()) {
            zio zioVar = (zio) obj;
            if (this.a.equals(zioVar.a) && this.b.equals(zioVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 217) * 31);
    }
}
