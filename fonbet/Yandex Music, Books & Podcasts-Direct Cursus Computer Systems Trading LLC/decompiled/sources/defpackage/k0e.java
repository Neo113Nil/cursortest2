package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k0e implements c8k {
    public final h0e a;
    public final xzd b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern k = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");
    public static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern v = a("CAN-SKIP-DATERANGES");
    public static final Pattern w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern z = a("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern X = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern Y = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern Z = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern v0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern w0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern x0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern y0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern z0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern A0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern B0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern C0 = a("AUTOSELECT");
    public static final Pattern D0 = a("DEFAULT");
    public static final Pattern E0 = a("FORCED");
    public static final Pattern F0 = a("INDEPENDENT");
    public static final Pattern G0 = a("GAP");
    public static final Pattern H0 = a("PRECISE");
    public static final Pattern I0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern J0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern K0 = Pattern.compile("[:,]ID=\"(.+?)\"");
    public static final Pattern L0 = Pattern.compile("CLASS=\"(.+?)\"");
    public static final Pattern M0 = Pattern.compile("START-DATE=\"(.+?)\"");
    public static final Pattern N0 = Pattern.compile("CUE=\"(.+?)\"");
    public static final Pattern O0 = Pattern.compile("END-DATE=\"(.+?)\"");
    public static final Pattern P0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern Q0 = a("END-ON-NEXT");
    public static final Pattern R0 = Pattern.compile("X-ASSET-URI=\"(.+?)\"");
    public static final Pattern S0 = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");
    public static final Pattern T0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern U0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern V0 = Pattern.compile("X-SNAP=\"(.+?)\"");
    public static final Pattern W0 = Pattern.compile("X-RESTRICT=\"(.+?)\"");
    public static final Pattern X0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern Y0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public k0e(h0e h0eVar, xzd xzdVar) {
        this.a = h0eVar;
        this.b = xzdVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static pqa b(String str, oqa[] oqaVarArr) {
        oqa[] oqaVarArr2 = new oqa[oqaVarArr.length];
        for (int i2 = 0; i2 < oqaVarArr.length; i2++) {
            oqa oqaVar = oqaVarArr[i2];
            oqaVarArr2[i2] = new oqa(oqaVar.b, oqaVar.c, oqaVar.d, null);
        }
        return new pqa(str, true, oqaVarArr2);
    }

    public static oqa c(String str, HashMap hashMap, String str2) {
        String i2 = i(str, X, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = Y;
        if (equals) {
            String j2 = j(str, pattern, hashMap);
            return new oqa(un3.d, null, "video/mp4", Base64.decode(j2.substring(j2.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = un3.d;
            int i3 = dvt.a;
            return new oqa(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i2)) {
            return null;
        }
        String j3 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j3.substring(j3.indexOf(44)), 0);
        UUID uuid2 = un3.e;
        return new oqa(uuid2, null, "video/mp4", wyf.u(uuid2, null, decode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0a3d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xzd d(h0e h0eVar, xzd xzdVar, vx6 vx6Var, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeMap treeMap;
        szd szdVar;
        ArrayList arrayList3;
        String str2;
        int i2;
        long j2;
        String str3;
        long j3;
        int i3;
        ArrayList arrayList4;
        uzd uzdVar;
        ArrayList arrayList5;
        uzd uzdVar2;
        long j4;
        int i4;
        pqa pqaVar;
        uzd uzdVar3;
        int i5;
        String str4;
        long j5;
        long j6;
        boolean z2;
        long j7;
        String str5;
        String str6;
        char c2;
        pqa pqaVar2;
        TreeMap treeMap2;
        szd szdVar2;
        qzd qzdVar;
        int i6;
        char c3;
        long j8;
        int i7;
        pqa pqaVar3;
        int i8;
        h0e h0eVar2 = h0eVar;
        xzd xzdVar2 = xzdVar;
        boolean z3 = h0eVar2.c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        wzd wzdVar = new wzd(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap3 = new TreeMap();
        boolean z4 = z3;
        String str7 = "";
        long j9 = -9223372036854775807L;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = -1;
        boolean z5 = false;
        szd szdVar3 = null;
        int i9 = 0;
        pqa pqaVar4 = null;
        uzd uzdVar4 = null;
        pqa pqaVar5 = null;
        int i10 = 0;
        String str8 = null;
        String str9 = null;
        int i11 = 0;
        boolean z6 = false;
        int i12 = 0;
        String str10 = null;
        boolean z7 = false;
        int i13 = 0;
        long j19 = -9223372036854775807L;
        long j20 = -9223372036854775807L;
        boolean z8 = false;
        int i14 = 1;
        while (vx6Var.E()) {
            String G2 = vx6Var.G();
            if (G2.startsWith("#EXT")) {
                arrayList9.add(G2);
            }
            if (G2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j21 = j(G2, t, hashMap);
                if ("VOD".equals(j21)) {
                    i9 = 1;
                } else if ("EVENT".equals(j21)) {
                    i9 = 2;
                }
            } else if (G2.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (G2.startsWith("#EXT-X-START")) {
                    double parseDouble = Double.parseDouble(j(G2, F, Collections.EMPTY_MAP));
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    z5 = f(G2, H0);
                    j9 = (long) (parseDouble * 1000000.0d);
                } else {
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    if (G2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g2 = g(G2, u, -9.223372036854776E18d);
                        long j22 = g2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g2 * 1000000.0d);
                        boolean f2 = f(G2, v);
                        double g3 = g(G2, x, -9.223372036854776E18d);
                        long j23 = g3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g3 * 1000000.0d);
                        double g4 = g(G2, y, -9.223372036854776E18d);
                        arrayList9 = arrayList;
                        arrayList10 = arrayList2;
                        wzdVar = new wzd(j22, f2, j23, g4 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g4 * 1000000.0d), f(G2, z));
                    } else if (G2.startsWith("#EXT-X-PART-INF")) {
                        j20 = (long) (Double.parseDouble(j(G2, r, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean startsWith = G2.startsWith("#EXT-X-MAP");
                        Pattern pattern = H;
                        boolean z9 = z5;
                        Pattern pattern2 = Y;
                        if (startsWith) {
                            String j24 = j(G2, pattern2, hashMap);
                            String i15 = i(G2, pattern, null, hashMap);
                            if (i15 != null) {
                                int i16 = dvt.a;
                                String[] split = i15.split("@", -1);
                                j18 = Long.parseLong(split[i11]);
                                if (split.length > 1) {
                                    j14 = Long.parseLong(split[1]);
                                }
                            }
                            long j25 = j18 == -1 ? 0L : j14;
                            if (str8 != null && str9 == null) {
                                throw r7k.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            String str11 = str8;
                            uzd uzdVar5 = new uzd(j25, j18, j24, str11, str9);
                            str8 = str11;
                            String str12 = str9;
                            if (j18 != -1) {
                                j25 += j18;
                            }
                            j14 = j25;
                            arrayList9 = arrayList;
                            uzdVar4 = uzdVar5;
                            j18 = -1;
                            arrayList10 = arrayList2;
                            z5 = z9;
                            str9 = str12;
                        } else {
                            wzd wzdVar2 = wzdVar;
                            String str13 = str9;
                            if (G2.startsWith("#EXT-X-TARGETDURATION")) {
                                j19 = Integer.parseInt(j(G2, o, Collections.EMPTY_MAP)) * 1000000;
                            } else {
                                if (G2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                    j13 = Long.parseLong(j(G2, A, Collections.EMPTY_MAP));
                                    arrayList9 = arrayList;
                                    j11 = j13;
                                } else if (G2.startsWith("#EXT-X-VERSION")) {
                                    i14 = Integer.parseInt(j(G2, s, Collections.EMPTY_MAP));
                                } else {
                                    if (G2.startsWith("#EXT-X-DEFINE")) {
                                        String i17 = i(G2, J0, null, hashMap);
                                        if (i17 != null) {
                                            String str14 = (String) h0eVar2.j.get(i17);
                                            if (str14 != null) {
                                                hashMap.put(i17, str14);
                                            }
                                        } else {
                                            hashMap.put(j(G2, y0, hashMap), j(G2, I0, hashMap));
                                        }
                                        treeMap = treeMap3;
                                        szdVar = szdVar3;
                                        arrayList3 = arrayList;
                                        str2 = str8;
                                        i2 = i11;
                                        j2 = j18;
                                        str3 = str10;
                                        j3 = j15;
                                        i3 = i13;
                                        arrayList4 = arrayList2;
                                        uzdVar = uzdVar4;
                                    } else if (G2.startsWith("#EXTINF")) {
                                        j16 = new BigDecimal(j(G2, B, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                        str7 = i(G2, C, "", hashMap);
                                    } else if (G2.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(j(G2, w, Collections.EMPTY_MAP));
                                        vq1.A((xzdVar2 == null || !arrayList6.isEmpty()) ? i11 : 1);
                                        int i18 = dvt.a;
                                        long j26 = xzdVar2.k;
                                        yde ydeVar = xzdVar2.r;
                                        int i19 = (int) (j11 - j26);
                                        int i20 = parseInt + i19;
                                        if (i19 < 0 || i20 > ydeVar.size()) {
                                            throw new j0e();
                                        }
                                        ArrayList arrayList11 = arrayList;
                                        long j27 = j15;
                                        while (i19 < i20) {
                                            uzd uzdVar6 = (uzd) ydeVar.get(i19);
                                            int i21 = i19;
                                            ArrayList arrayList12 = arrayList11;
                                            if (j11 != xzdVar2.k) {
                                                uzdVar6 = uzdVar6.a((xzdVar2.j - i12) + uzdVar6.d, j27);
                                            }
                                            arrayList6.add(uzdVar6);
                                            long j28 = uzdVar6.c;
                                            String str15 = uzdVar6.h;
                                            j27 += j28;
                                            long j29 = uzdVar6.j;
                                            if (j29 != -1) {
                                                j14 = uzdVar6.i + j29;
                                            }
                                            int i22 = uzdVar6.d;
                                            uzd uzdVar7 = uzdVar6.b;
                                            int i23 = i20;
                                            pqa pqaVar6 = uzdVar6.f;
                                            String str16 = uzdVar6.g;
                                            if (str15 == null || !str15.equals(Long.toHexString(j13))) {
                                                str13 = str15;
                                            }
                                            j13++;
                                            xzdVar2 = xzdVar;
                                            i10 = i22;
                                            uzdVar4 = uzdVar7;
                                            j10 = j27;
                                            str8 = str16;
                                            arrayList11 = arrayList12;
                                            i19 = i21 + 1;
                                            pqaVar4 = pqaVar6;
                                            i20 = i23;
                                        }
                                        h0eVar2 = h0eVar;
                                        xzdVar2 = xzdVar;
                                        arrayList9 = arrayList11;
                                        j15 = j27;
                                    } else {
                                        arrayList3 = arrayList;
                                        if (G2.startsWith("#EXT-X-KEY")) {
                                            String j30 = j(G2, K, hashMap);
                                            String i24 = i(G2, L, "identity", hashMap);
                                            if ("NONE".equals(j30)) {
                                                treeMap3.clear();
                                                pqaVar4 = null;
                                                str8 = null;
                                                str9 = null;
                                            } else {
                                                String i25 = i(G2, Z, null, hashMap);
                                                if (!"identity".equals(i24)) {
                                                    String str17 = str10;
                                                    str10 = str17 == null ? ("SAMPLE-AES-CENC".equals(j30) || "SAMPLE-AES-CTR".equals(j30)) ? "cenc" : "cbcs" : str17;
                                                    oqa c4 = c(G2, hashMap, i24);
                                                    if (c4 != null) {
                                                        treeMap3.put(i24, c4);
                                                        str9 = i25;
                                                        pqaVar4 = null;
                                                        str8 = null;
                                                    }
                                                } else if ("AES-128".equals(j30)) {
                                                    str8 = j(G2, pattern2, hashMap);
                                                    str9 = i25;
                                                }
                                                str9 = i25;
                                                str8 = null;
                                            }
                                            h0eVar2 = h0eVar;
                                            xzdVar2 = xzdVar;
                                            arrayList10 = arrayList2;
                                            z5 = z9;
                                        } else {
                                            str3 = str10;
                                            if (G2.startsWith("#EXT-X-BYTERANGE")) {
                                                String j31 = j(G2, G, hashMap);
                                                int i26 = dvt.a;
                                                String[] split2 = j31.split("@", -1);
                                                j18 = Long.parseLong(split2[i11]);
                                                if (split2.length > 1) {
                                                    j14 = Long.parseLong(split2[1]);
                                                }
                                            } else if (G2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                i12 = Integer.parseInt(G2.substring(G2.indexOf(58) + 1));
                                                h0eVar2 = h0eVar;
                                                xzdVar2 = xzdVar;
                                                str10 = str3;
                                                arrayList10 = arrayList2;
                                                z5 = z9;
                                                str9 = str13;
                                                wzdVar = wzdVar2;
                                                arrayList9 = arrayList3;
                                                z6 = true;
                                            } else if (G2.equals("#EXT-X-DISCONTINUITY")) {
                                                i10++;
                                            } else {
                                                if (G2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                    if (j12 == 0) {
                                                        j12 = dvt.Y(dvt.b0(G2.substring(G2.indexOf(58) + 1))) - j15;
                                                    }
                                                } else if (G2.equals("#EXT-X-GAP")) {
                                                    h0eVar2 = h0eVar;
                                                    xzdVar2 = xzdVar;
                                                    str10 = str3;
                                                    arrayList10 = arrayList2;
                                                    z5 = z9;
                                                    str9 = str13;
                                                    wzdVar = wzdVar2;
                                                    arrayList9 = arrayList3;
                                                    i13 = 1;
                                                } else if (G2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                    h0eVar2 = h0eVar;
                                                    xzdVar2 = xzdVar;
                                                    str10 = str3;
                                                    arrayList10 = arrayList2;
                                                    z5 = z9;
                                                    str9 = str13;
                                                    wzdVar = wzdVar2;
                                                    arrayList9 = arrayList3;
                                                    z4 = true;
                                                } else if (G2.equals("#EXT-X-ENDLIST")) {
                                                    h0eVar2 = h0eVar;
                                                    xzdVar2 = xzdVar;
                                                    str10 = str3;
                                                    arrayList10 = arrayList2;
                                                    z5 = z9;
                                                    str9 = str13;
                                                    wzdVar = wzdVar2;
                                                    arrayList9 = arrayList3;
                                                    z8 = true;
                                                } else if (G2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    long h2 = h(G2, D);
                                                    Matcher matcher = E.matcher(G2);
                                                    if (matcher.find()) {
                                                        String group = matcher.group(1);
                                                        group.getClass();
                                                        i8 = Integer.parseInt(group);
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    arrayList8.add(new tzd(i8, h2, Uri.parse(p1g.M(str, j(G2, pattern2, hashMap)))));
                                                } else {
                                                    if (!G2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        pqa pqaVar7 = pqaVar5;
                                                        uzd uzdVar8 = uzdVar4;
                                                        if (G2.startsWith("#EXT-X-PART")) {
                                                            String hexString = str8 == null ? null : str13 != null ? str13 : Long.toHexString(j13);
                                                            String j32 = j(G2, pattern2, hashMap);
                                                            pqa pqaVar8 = pqaVar7;
                                                            long parseDouble2 = (long) (Double.parseDouble(j(G2, p, Collections.EMPTY_MAP)) * 1000000.0d);
                                                            boolean f3 = f(G2, F0) | (z4 && arrayList7.isEmpty());
                                                            boolean f4 = f(G2, G0);
                                                            String i27 = i(G2, pattern, null, hashMap);
                                                            if (i27 != null) {
                                                                int i28 = dvt.a;
                                                                String[] split3 = i27.split("@", -1);
                                                                j8 = Long.parseLong(split3[0]);
                                                                if (split3.length > 1) {
                                                                    j17 = Long.parseLong(split3[1]);
                                                                }
                                                            } else {
                                                                j8 = -1;
                                                            }
                                                            int i29 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
                                                            long j33 = i29 == 0 ? 0L : j17;
                                                            if (pqaVar4 != null || treeMap3.isEmpty()) {
                                                                i7 = i29;
                                                            } else {
                                                                i7 = i29;
                                                                oqa[] oqaVarArr = (oqa[]) treeMap3.values().toArray(new oqa[0]);
                                                                pqa pqaVar9 = new pqa(str3, true, oqaVarArr);
                                                                if (pqaVar8 == null) {
                                                                    pqaVar8 = b(str3, oqaVarArr);
                                                                }
                                                                pqaVar4 = pqaVar9;
                                                            }
                                                            long j34 = j10;
                                                            pqa pqaVar10 = pqaVar4;
                                                            String str18 = hexString;
                                                            long j35 = j8;
                                                            arrayList7.add(new szd(j32, uzdVar8, parseDouble2, i10, j34, pqaVar10, str8, str18, j33, j35, f4, f3, false));
                                                            j10 = j34 + parseDouble2;
                                                            if (i7 != 0) {
                                                                j33 += j35;
                                                            }
                                                            j17 = j33;
                                                            xzdVar2 = xzdVar;
                                                            uzdVar4 = uzdVar8;
                                                            pqaVar5 = pqaVar8;
                                                            str10 = str3;
                                                            pqaVar4 = pqaVar10;
                                                            arrayList10 = arrayList2;
                                                            z5 = z9;
                                                            str9 = str13;
                                                            wzdVar = wzdVar2;
                                                            arrayList9 = arrayList3;
                                                            i11 = 0;
                                                        } else {
                                                            pqa pqaVar11 = pqaVar7;
                                                            if (G2.startsWith("#EXT-X-DATERANGE") && i(G2, L0, "", hashMap).equals("com.apple.hls.interstitial")) {
                                                                String j36 = j(G2, K0, hashMap);
                                                                String i30 = i(G2, R0, null, hashMap);
                                                                Uri parse = i30 != null ? Uri.parse(i30) : null;
                                                                String i31 = i(G2, S0, null, hashMap);
                                                                Uri parse2 = i31 != null ? Uri.parse(i31) : null;
                                                                long Y2 = dvt.Y(dvt.b0(j(G2, M0, hashMap)));
                                                                String i32 = i(G2, O0, null, hashMap);
                                                                long Y3 = i32 != null ? dvt.Y(dvt.b0(i32)) : -9223372036854775807L;
                                                                ArrayList arrayList13 = new ArrayList();
                                                                String i33 = i(G2, N0, null, hashMap);
                                                                uzdVar = uzdVar8;
                                                                if (i33 != null) {
                                                                    String[] split4 = i33.split(StringUtils.COMMA, -1);
                                                                    int length = split4.length;
                                                                    int i34 = 0;
                                                                    while (i34 < length) {
                                                                        int i35 = length;
                                                                        String trim = split4[i34].trim();
                                                                        trim.getClass();
                                                                        switch (trim.hashCode()) {
                                                                            case 79491:
                                                                                i6 = i34;
                                                                                if (trim.equals("PRE")) {
                                                                                    c3 = 0;
                                                                                    break;
                                                                                }
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 2430593:
                                                                                i6 = i34;
                                                                                if (trim.equals("ONCE")) {
                                                                                    c3 = 1;
                                                                                    break;
                                                                                }
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 2461856:
                                                                                i6 = i34;
                                                                                if (trim.equals(ServiceCommand.TYPE_POST)) {
                                                                                    c3 = 2;
                                                                                    break;
                                                                                }
                                                                                c3 = 65535;
                                                                                break;
                                                                            default:
                                                                                i6 = i34;
                                                                                c3 = 65535;
                                                                                break;
                                                                        }
                                                                        switch (c3) {
                                                                            case 0:
                                                                            case 1:
                                                                            case 2:
                                                                                arrayList13.add(trim);
                                                                                break;
                                                                        }
                                                                        i34 = i6 + 1;
                                                                        length = i35;
                                                                    }
                                                                }
                                                                double g5 = g(G2, q, -1.0d);
                                                                long j37 = g5 >= 0.0d ? (long) (g5 * 1000000.0d) : -9223372036854775807L;
                                                                double g6 = g(G2, P0, -1.0d);
                                                                long j38 = g6 >= 0.0d ? (long) (g6 * 1000000.0d) : -9223372036854775807L;
                                                                boolean f5 = f(G2, Q0);
                                                                double g7 = g(G2, T0, Double.MIN_VALUE);
                                                                long j39 = g7 != Double.MIN_VALUE ? (long) (g7 * 1000000.0d) : -9223372036854775807L;
                                                                double g8 = g(G2, U0, -1.0d);
                                                                long j40 = g8 >= 0.0d ? (long) (g8 * 1000000.0d) : -9223372036854775807L;
                                                                ArrayList arrayList14 = new ArrayList();
                                                                String i36 = i(G2, V0, null, hashMap);
                                                                if (i36 != null) {
                                                                    String[] split5 = i36.split(StringUtils.COMMA, -1);
                                                                    int length2 = split5.length;
                                                                    int i37 = 0;
                                                                    while (i37 < length2) {
                                                                        int i38 = i37;
                                                                        String trim2 = split5[i37].trim();
                                                                        trim2.getClass();
                                                                        int i39 = length2;
                                                                        if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                            arrayList14.add(trim2);
                                                                        }
                                                                        i37 = i38 + 1;
                                                                        length2 = i39;
                                                                    }
                                                                }
                                                                ArrayList arrayList15 = new ArrayList();
                                                                String i40 = i(G2, W0, null, hashMap);
                                                                if (i40 != null) {
                                                                    String[] split6 = i40.split(StringUtils.COMMA, -1);
                                                                    int length3 = split6.length;
                                                                    int i41 = 0;
                                                                    while (i41 < length3) {
                                                                        int i42 = length3;
                                                                        String trim3 = split6[i41].trim();
                                                                        trim3.getClass();
                                                                        String[] strArr = split6;
                                                                        if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                            arrayList15.add(trim3);
                                                                        }
                                                                        i41++;
                                                                        split6 = strArr;
                                                                        length3 = i42;
                                                                    }
                                                                }
                                                                hld.w(4, "initialCapacity");
                                                                Object[] objArr = new Object[4];
                                                                String substring = G2.substring(17);
                                                                Matcher matcher2 = Y0.matcher(substring);
                                                                int i43 = 0;
                                                                while (matcher2.find()) {
                                                                    ArrayList arrayList16 = arrayList15;
                                                                    String group2 = matcher2.group();
                                                                    group2.getClass();
                                                                    ArrayList arrayList17 = arrayList7;
                                                                    switch (group2.hashCode()) {
                                                                        case -2136701954:
                                                                            if (group2.equals("X-SNAP=")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -148960310:
                                                                            if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 397239341:
                                                                            if (group2.equals("X-ASSET-LIST=")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 1472528844:
                                                                            if (group2.equals("X-RESTRICT=")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 1748487807:
                                                                            if (group2.equals("X-RESUME-OFFSET=")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 1814205923:
                                                                            if (group2.equals("X-ASSET-URI=")) {
                                                                                c2 = 5;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                        case 5:
                                                                            pqaVar2 = pqaVar11;
                                                                            treeMap2 = treeMap3;
                                                                            szdVar2 = szdVar3;
                                                                            break;
                                                                        default:
                                                                            pqaVar2 = pqaVar11;
                                                                            String d2 = f1d.d(1, 0, group2);
                                                                            String concat = d2.concat("=");
                                                                            int length4 = concat.length() + substring.indexOf(concat);
                                                                            String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                            if (substring2.startsWith("\"")) {
                                                                                qzdVar = new qzd(d2, j(substring, Pattern.compile(d2.concat("=\"(.+?)\"")), hashMap), 0);
                                                                                treeMap2 = treeMap3;
                                                                                szdVar2 = szdVar3;
                                                                            } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                                treeMap2 = treeMap3;
                                                                                szdVar2 = szdVar3;
                                                                                qzdVar = new qzd(d2, j(substring, Pattern.compile(d2.concat("=(0[xX][A-F0-9]+)")), hashMap), 1);
                                                                            } else {
                                                                                treeMap2 = treeMap3;
                                                                                szdVar2 = szdVar3;
                                                                                qzdVar = new qzd(d2, Double.parseDouble(j(substring, Pattern.compile(d2.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP)));
                                                                            }
                                                                            int i44 = i43 + 1;
                                                                            int e2 = pde.e(objArr.length, i44);
                                                                            if (e2 > objArr.length) {
                                                                                objArr = Arrays.copyOf(objArr, e2);
                                                                            }
                                                                            objArr[i43] = qzdVar;
                                                                            i43 = i44;
                                                                            break;
                                                                    }
                                                                    treeMap3 = treeMap2;
                                                                    pqaVar11 = pqaVar2;
                                                                    arrayList7 = arrayList17;
                                                                    arrayList15 = arrayList16;
                                                                    szdVar3 = szdVar2;
                                                                }
                                                                ArrayList arrayList18 = arrayList15;
                                                                arrayList5 = arrayList7;
                                                                pqaVar5 = pqaVar11;
                                                                treeMap = treeMap3;
                                                                szdVar = szdVar3;
                                                                if ((parse2 != null || parse == null) && (parse2 == null || parse != null)) {
                                                                    arrayList4 = arrayList2;
                                                                } else {
                                                                    rzd rzdVar = new rzd(j36, parse, parse2, Y2, Y3, j37, j38, arrayList13, f5, j39, j40, arrayList14, arrayList18, yde.t(i43, objArr));
                                                                    arrayList4 = arrayList2;
                                                                    arrayList4.add(rzdVar);
                                                                }
                                                            } else {
                                                                uzdVar = uzdVar8;
                                                                arrayList5 = arrayList7;
                                                                pqaVar5 = pqaVar11;
                                                                treeMap = treeMap3;
                                                                szdVar = szdVar3;
                                                                arrayList4 = arrayList2;
                                                                if (!G2.startsWith("#")) {
                                                                    String hexString2 = str8 == null ? null : str13 != null ? str13 : Long.toHexString(j13);
                                                                    long j41 = j13 + 1;
                                                                    String k2 = k(G2, hashMap);
                                                                    uzd uzdVar9 = (uzd) hashMap2.get(k2);
                                                                    if (j18 == -1) {
                                                                        uzdVar2 = uzdVar9;
                                                                        j4 = 0;
                                                                    } else {
                                                                        if (z7 && uzdVar == null && uzdVar9 == null) {
                                                                            uzdVar9 = new uzd(0L, j14, k2, null, null);
                                                                            hashMap2.put(k2, uzdVar9);
                                                                        }
                                                                        uzdVar2 = uzdVar9;
                                                                        j4 = j14;
                                                                    }
                                                                    if (pqaVar4 != null || treeMap.isEmpty()) {
                                                                        i4 = 0;
                                                                    } else {
                                                                        i4 = 0;
                                                                        oqa[] oqaVarArr2 = (oqa[]) treeMap.values().toArray(new oqa[0]);
                                                                        pqa pqaVar12 = new pqa(str3, true, oqaVarArr2);
                                                                        if (pqaVar5 == null) {
                                                                            pqaVar = b(str3, oqaVarArr2);
                                                                            pqaVar4 = pqaVar12;
                                                                            if (uzdVar == null) {
                                                                                uzdVar3 = uzdVar;
                                                                                str6 = k2;
                                                                                i5 = i10;
                                                                                str4 = str8;
                                                                                j5 = j18;
                                                                                j6 = j15;
                                                                                z2 = i13;
                                                                                j7 = j16;
                                                                                str5 = str7;
                                                                            } else {
                                                                                uzdVar3 = uzdVar2;
                                                                                i5 = i10;
                                                                                str4 = str8;
                                                                                j5 = j18;
                                                                                j6 = j15;
                                                                                z2 = i13;
                                                                                j7 = j16;
                                                                                str5 = str7;
                                                                                str6 = k2;
                                                                            }
                                                                            pqa pqaVar13 = pqaVar4;
                                                                            i10 = i5;
                                                                            arrayList6.add(new uzd(str6, uzdVar3, str5, j7, i5, j6, pqaVar13, str4, hexString2, j4, j5, z2, arrayList5));
                                                                            j10 = j6 + j7;
                                                                            arrayList7 = new ArrayList();
                                                                            if (j18 != -1) {
                                                                                j4 += j5;
                                                                            }
                                                                            j14 = j4;
                                                                            j13 = j41;
                                                                            pqaVar5 = pqaVar;
                                                                            treeMap3 = treeMap;
                                                                            i11 = i4;
                                                                            i13 = i11;
                                                                            str7 = "";
                                                                            j15 = j10;
                                                                            pqaVar4 = pqaVar13;
                                                                            str8 = str4;
                                                                            uzdVar4 = uzdVar;
                                                                            j16 = 0;
                                                                            j18 = -1;
                                                                            z5 = z9;
                                                                            str9 = str13;
                                                                            wzdVar = wzdVar2;
                                                                            arrayList9 = arrayList3;
                                                                            szdVar3 = szdVar;
                                                                            xzdVar2 = xzdVar;
                                                                            arrayList10 = arrayList4;
                                                                            str10 = str3;
                                                                        } else {
                                                                            pqaVar4 = pqaVar12;
                                                                        }
                                                                    }
                                                                    pqaVar = pqaVar5;
                                                                    if (uzdVar == null) {
                                                                    }
                                                                    pqa pqaVar132 = pqaVar4;
                                                                    i10 = i5;
                                                                    arrayList6.add(new uzd(str6, uzdVar3, str5, j7, i5, j6, pqaVar132, str4, hexString2, j4, j5, z2, arrayList5));
                                                                    j10 = j6 + j7;
                                                                    arrayList7 = new ArrayList();
                                                                    if (j18 != -1) {
                                                                    }
                                                                    j14 = j4;
                                                                    j13 = j41;
                                                                    pqaVar5 = pqaVar;
                                                                    treeMap3 = treeMap;
                                                                    i11 = i4;
                                                                    i13 = i11;
                                                                    str7 = "";
                                                                    j15 = j10;
                                                                    pqaVar4 = pqaVar132;
                                                                    str8 = str4;
                                                                    uzdVar4 = uzdVar;
                                                                    j16 = 0;
                                                                    j18 = -1;
                                                                    z5 = z9;
                                                                    str9 = str13;
                                                                    wzdVar = wzdVar2;
                                                                    arrayList9 = arrayList3;
                                                                    szdVar3 = szdVar;
                                                                    xzdVar2 = xzdVar;
                                                                    arrayList10 = arrayList4;
                                                                    str10 = str3;
                                                                }
                                                            }
                                                            str2 = str8;
                                                            arrayList7 = arrayList5;
                                                            j2 = j18;
                                                            j3 = j15;
                                                            i3 = i13;
                                                            i2 = 0;
                                                        }
                                                    } else if (szdVar3 == null && "PART".equals(j(G2, w0, hashMap))) {
                                                        pqa pqaVar14 = pqaVar5;
                                                        uzd uzdVar10 = uzdVar4;
                                                        String j42 = j(G2, pattern2, hashMap);
                                                        long h3 = h(G2, I);
                                                        long h4 = h(G2, J);
                                                        String hexString3 = str8 == null ? null : str13 != null ? str13 : Long.toHexString(j13);
                                                        if (pqaVar4 != null || treeMap3.isEmpty()) {
                                                            pqaVar3 = pqaVar4;
                                                        } else {
                                                            oqa[] oqaVarArr3 = (oqa[]) treeMap3.values().toArray(new oqa[i11]);
                                                            pqa pqaVar15 = new pqa(str3, true, oqaVarArr3);
                                                            if (pqaVar14 == null) {
                                                                pqaVar14 = b(str3, oqaVarArr3);
                                                            }
                                                            pqaVar3 = pqaVar15;
                                                        }
                                                        if (h3 == -1 || h4 != -1) {
                                                            long j43 = j10;
                                                            j10 = j43;
                                                            szdVar3 = new szd(j42, uzdVar10, 0L, i10, j43, pqaVar3, str8, hexString3, h3 != -1 ? h3 : 0L, h4, false, false, true);
                                                        }
                                                        xzdVar2 = xzdVar;
                                                        str10 = str3;
                                                        uzdVar4 = uzdVar10;
                                                        pqaVar4 = pqaVar3;
                                                        arrayList10 = arrayList2;
                                                        z5 = z9;
                                                        str9 = str13;
                                                        wzdVar = wzdVar2;
                                                        arrayList9 = arrayList3;
                                                        i11 = 0;
                                                        pqaVar5 = pqaVar14;
                                                    }
                                                    h0eVar2 = h0eVar;
                                                }
                                                treeMap = treeMap3;
                                                szdVar = szdVar3;
                                                uzdVar = uzdVar4;
                                                str2 = str8;
                                                i2 = i11;
                                                j2 = j18;
                                                j3 = j15;
                                                i3 = i13;
                                                arrayList4 = arrayList2;
                                            }
                                            h0eVar2 = h0eVar;
                                            xzdVar2 = xzdVar;
                                            str10 = str3;
                                            arrayList10 = arrayList2;
                                            z5 = z9;
                                            str9 = str13;
                                        }
                                        wzdVar = wzdVar2;
                                        arrayList9 = arrayList3;
                                    }
                                    xzdVar2 = xzdVar;
                                    treeMap3 = treeMap;
                                    i11 = i2;
                                    j15 = j3;
                                    str8 = str2;
                                    j18 = j2;
                                    i13 = i3;
                                    uzdVar4 = uzdVar;
                                    z5 = z9;
                                    str9 = str13;
                                    wzdVar = wzdVar2;
                                    arrayList9 = arrayList3;
                                    szdVar3 = szdVar;
                                    arrayList10 = arrayList4;
                                    str10 = str3;
                                    h0eVar2 = h0eVar;
                                }
                                arrayList10 = arrayList2;
                                z5 = z9;
                                str9 = str13;
                                wzdVar = wzdVar2;
                            }
                            arrayList9 = arrayList;
                            arrayList10 = arrayList2;
                            z5 = z9;
                            str9 = str13;
                            wzdVar = wzdVar2;
                        }
                    }
                }
                arrayList9 = arrayList;
                arrayList10 = arrayList2;
            }
        }
        boolean z10 = z5;
        ArrayList arrayList19 = arrayList9;
        ArrayList arrayList20 = arrayList10;
        wzd wzdVar3 = wzdVar;
        szd szdVar4 = szdVar3;
        int i45 = i11;
        HashMap hashMap3 = new HashMap();
        for (int i46 = i45; i46 < arrayList8.size(); i46++) {
            tzd tzdVar = (tzd) arrayList8.get(i46);
            long j44 = tzdVar.b;
            if (j44 == -1) {
                j44 = (j11 + arrayList6.size()) - (arrayList7.isEmpty() ? 1L : 0L);
            }
            int i47 = tzdVar.c;
            if (i47 == -1 && j20 != -9223372036854775807L) {
                i47 = (arrayList7.isEmpty() ? ((uzd) ild.x(arrayList6)).m : arrayList7).size() - 1;
            }
            Uri uri = tzdVar.a;
            hashMap3.put(uri, new tzd(i47, j44, uri));
        }
        if (szdVar4 != null) {
            arrayList7.add(szdVar4);
        }
        return new xzd(i9, str, arrayList19, j9, z10, j12, z6, i12, j11, i14, j19, j20, z4, z8, j12 != 0 ? 1 : i45, pqaVar5, arrayList6, arrayList7, wzdVar3, hashMap3, arrayList20);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
    
        if (r7.equals("db1p") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:
    
        if (r7.equals("db2g") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b8, code lost:
    
        if (r7.startsWith("db4") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ed, code lost:
    
        if (r4 > 0) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /* JADX WARN: Type inference failed for: r43v12 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h0e e(vx6 vx6Var, String str) {
        int i2;
        ArrayList arrayList;
        char c2;
        ArrayList arrayList2;
        g0e g0eVar;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        g0e g0eVar2;
        String str4;
        g0e g0eVar3;
        HashMap hashMap;
        HashSet hashSet;
        ArrayList arrayList4;
        boolean z2;
        int i3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i4;
        String str5;
        String str6;
        String y2;
        String i5;
        int i6;
        int i7;
        Uri N;
        ArrayList arrayList8;
        String str7;
        String str8 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            boolean E2 = vx6Var.E();
            Pattern pattern = Y;
            ArrayList arrayList17 = arrayList13;
            boolean z5 = z3;
            Pattern pattern2 = y0;
            boolean z6 = z4;
            if (!E2) {
                ArrayList arrayList18 = arrayList10;
                ArrayList arrayList19 = arrayList11;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = arrayList16;
                ArrayList arrayList22 = arrayList15;
                ArrayList arrayList23 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i8 = 0;
                HashMap hashMap4 = hashMap2;
                while (i8 < arrayList9.size()) {
                    g0e g0eVar4 = (g0e) arrayList9.get(i8);
                    Uri uri = g0eVar4.a;
                    dsc dscVar = g0eVar4.b;
                    if (hashSet2.add(uri)) {
                        vq1.A(dscVar.l == null);
                        ArrayList arrayList24 = (ArrayList) hashMap4.get(g0eVar4.a);
                        arrayList24.getClass();
                        hashMap = hashMap4;
                        hashSet = hashSet2;
                        u2i u2iVar = new u2i(new v0e(null, null, arrayList24));
                        bsc a = dscVar.a();
                        a.k = u2iVar;
                        arrayList23.add(new g0e(g0eVar4.a, new dsc(a), g0eVar4.c, g0eVar4.d, g0eVar4.e, g0eVar4.f));
                    } else {
                        hashMap = hashMap4;
                        hashSet = hashSet2;
                    }
                    i8++;
                    hashSet2 = hashSet;
                    hashMap4 = hashMap;
                }
                int i9 = 0;
                List list = null;
                dsc dscVar2 = null;
                while (i9 < arrayList14.size()) {
                    String str9 = (String) arrayList14.get(i9);
                    String j2 = j(str9, z0, hashMap3);
                    String j3 = j(str9, pattern2, hashMap3);
                    bsc bscVar = new bsc();
                    int i10 = i9;
                    bscVar.a = ouj.o(j2, StringUtils.PROCESS_POSTFIX_DELIMITER, j3);
                    bscVar.b = j3;
                    bscVar.l = l5i.p("application/x-mpegURL");
                    boolean f2 = f(str9, D0);
                    ?? r43 = f2;
                    if (f(str9, E0)) {
                        r43 = (f2 ? 1 : 0) | 2;
                    }
                    bscVar.e = f(str9, C0) ? r43 | 4 : r43;
                    ArrayList arrayList25 = arrayList14;
                    String i11 = i(str9, A0, null, hashMap3);
                    if (TextUtils.isEmpty(i11)) {
                        arrayList = arrayList23;
                        i2 = 0;
                    } else {
                        int i12 = dvt.a;
                        String[] split = i11.split(StringUtils.COMMA, -1);
                        i2 = dvt.l(split, "public.accessibility.describes-video") ? RemoteCameraConfig.Mic.BUFFER_SIZE : 0;
                        arrayList = arrayList23;
                        if (dvt.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i2 |= 4096;
                        }
                        if (dvt.l(split, "public.accessibility.describes-music-and-sound")) {
                            i2 |= 1024;
                        }
                        if (dvt.l(split, "public.easy-to-read")) {
                            i2 |= RemoteCameraConfig.Notification.ID;
                        }
                    }
                    bscVar.f = i2;
                    bscVar.d = i(str9, x0, null, hashMap3);
                    String i13 = i(str9, pattern, null, hashMap3);
                    Uri N2 = i13 == null ? null : p1g.N(str8, i13);
                    u2i u2iVar2 = new u2i(new v0e(j2, j3, Collections.EMPTY_LIST));
                    String j4 = j(str9, v0, hashMap3);
                    switch (j4.hashCode()) {
                        case -959297733:
                            if (j4.equals("SUBTITLES")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -333210994:
                            if (j4.equals("CLOSED-CAPTIONS")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62628790:
                            if (j4.equals("AUDIO")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (j4.equals("VIDEO")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList9.size()) {
                                    g0eVar = (g0e) arrayList9.get(i14);
                                    if (!j2.equals(g0eVar.e)) {
                                        i14++;
                                    }
                                } else {
                                    g0eVar = null;
                                }
                            }
                            if (g0eVar != null) {
                                String y3 = dvt.y(3, g0eVar.b.k);
                                bscVar.j = y3;
                                str2 = l5i.e(y3);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            bscVar.m = l5i.p(str2);
                            bscVar.k = u2iVar2;
                            if (N2 == null) {
                                arrayList2 = arrayList20;
                                vq1.n0("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                f0e f0eVar = new f0e(N2, new dsc(bscVar), j3);
                                arrayList2 = arrayList20;
                                arrayList2.add(f0eVar);
                                break;
                            }
                        case 1:
                            arrayList3 = arrayList19;
                            String j5 = j(str9, B0, hashMap3);
                            if (j5.startsWith("CC")) {
                                parseInt = Integer.parseInt(j5.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(j5.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            bscVar.m = l5i.p(str3);
                            bscVar.H = parseInt;
                            list.add(new dsc(bscVar));
                            arrayList19 = arrayList3;
                            arrayList2 = arrayList20;
                            break;
                        case 2:
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList9.size()) {
                                    g0eVar2 = (g0e) arrayList9.get(i15);
                                    int i16 = i15;
                                    if (!j2.equals(g0eVar2.d)) {
                                        i15 = i16 + 1;
                                    }
                                } else {
                                    g0eVar2 = null;
                                }
                            }
                            if (g0eVar2 != null) {
                                String y4 = dvt.y(1, g0eVar2.b.k);
                                bscVar.j = y4;
                                str4 = l5i.e(y4);
                            } else {
                                str4 = null;
                            }
                            g0e g0eVar5 = g0eVar2;
                            String i17 = i(str9, i, null, hashMap3);
                            if (i17 != null) {
                                int i18 = dvt.a;
                                bscVar.C = Integer.parseInt(i17.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && i17.endsWith("/JOC")) {
                                    bscVar.j = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            bscVar.m = l5i.p(str4);
                            if (N2 != null) {
                                bscVar.k = u2iVar2;
                                arrayList19.add(new f0e(N2, new dsc(bscVar), j3));
                            } else {
                                arrayList3 = arrayList19;
                                if (g0eVar5 != null) {
                                    arrayList19 = arrayList3;
                                    dscVar2 = new dsc(bscVar);
                                }
                                arrayList19 = arrayList3;
                            }
                            arrayList2 = arrayList20;
                            break;
                        case 3:
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList9.size()) {
                                    g0eVar3 = (g0e) arrayList9.get(i19);
                                    if (!j2.equals(g0eVar3.c)) {
                                        i19++;
                                    }
                                } else {
                                    g0eVar3 = null;
                                }
                            }
                            if (g0eVar3 != null) {
                                dsc dscVar3 = g0eVar3.b;
                                String y5 = dvt.y(2, dscVar3.k);
                                bscVar.j = y5;
                                bscVar.m = l5i.p(l5i.e(y5));
                                bscVar.t = dscVar3.u;
                                bscVar.u = dscVar3.v;
                                bscVar.v = dscVar3.w;
                            }
                            if (N2 != null) {
                                bscVar.k = u2iVar2;
                                arrayList18.add(new f0e(N2, new dsc(bscVar), j3));
                            }
                            arrayList2 = arrayList20;
                            break;
                        default:
                            arrayList2 = arrayList20;
                            break;
                    }
                    arrayList23 = arrayList;
                    arrayList20 = arrayList2;
                    i9 = i10 + 1;
                    arrayList14 = arrayList25;
                    str8 = str;
                }
                ArrayList arrayList26 = arrayList23;
                ArrayList arrayList27 = arrayList20;
                if (z5) {
                    list = Collections.EMPTY_LIST;
                }
                return new h0e(str, arrayList21, arrayList26, arrayList18, arrayList19, arrayList27, arrayList17, dscVar2, list, z6, hashMap3, arrayList22);
            }
            String G2 = vx6Var.G();
            if (G2.startsWith("#EXT")) {
                arrayList16.add(G2);
            }
            boolean startsWith = G2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList28 = arrayList16;
            if (G2.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(j(G2, pattern2, hashMap3), j(G2, I0, hashMap3));
            } else if (G2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList7 = arrayList10;
                arrayList6 = arrayList11;
                arrayList5 = arrayList12;
                arrayList4 = arrayList15;
                z3 = z5;
                z4 = true;
                arrayList13 = arrayList17;
                arrayList16 = arrayList28;
                arrayList15 = arrayList4;
                arrayList12 = arrayList5;
                arrayList11 = arrayList6;
                arrayList10 = arrayList7;
            } else if (G2.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(G2);
            } else if (G2.startsWith("#EXT-X-SESSION-KEY")) {
                oqa c3 = c(G2, hashMap3, i(G2, L, "identity", hashMap3));
                if (c3 != null) {
                    String j6 = j(G2, K, hashMap3);
                    arrayList15.add(new pqa(("SAMPLE-AES-CENC".equals(j6) || "SAMPLE-AES-CTR".equals(j6)) ? "cenc" : "cbcs", true, c3));
                }
            } else if (G2.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z5 | G2.contains("CLOSED-CAPTIONS=NONE");
                int i20 = startsWith ? 16384 : 0;
                z5 = contains;
                arrayList4 = arrayList15;
                int parseInt2 = Integer.parseInt(j(G2, h, Collections.EMPTY_MAP));
                Matcher matcher = c.matcher(G2);
                if (matcher.find()) {
                    z2 = startsWith;
                    String group = matcher.group(1);
                    group.getClass();
                    i3 = Integer.parseInt(group);
                } else {
                    z2 = startsWith;
                    i3 = -1;
                }
                arrayList5 = arrayList12;
                String i21 = i(G2, j, null, hashMap3);
                arrayList6 = arrayList11;
                String i22 = i(G2, k, null, hashMap3);
                arrayList7 = arrayList10;
                String i23 = i(G2, l, null, hashMap3);
                if (i23 != null) {
                    int i24 = dvt.a;
                    String[] split2 = i23.split(StringUtils.COMMA, 2)[0].split("/", -1);
                    str5 = split2[0];
                    if (split2.length > 1) {
                        str6 = split2[1];
                        i4 = 2;
                        y2 = dvt.y(i4, i22);
                        if (l5i.l(y2, str5)) {
                            if (str5 == null) {
                                str7 = y2;
                            } else if (i21 != null && str6 != null) {
                                str7 = y2;
                                if (i21.equals("PQ")) {
                                }
                                if (i21.equals("SDR")) {
                                }
                                if (i21.equals("HLG")) {
                                }
                            }
                            if (str5 == null) {
                                str5 = str7;
                            }
                            String z7 = dvt.z(i22);
                            i22 = z7 != null ? ouj.o(str5, StringUtils.COMMA, z7) : str5;
                        }
                        i5 = i(G2, m, null, hashMap3);
                        if (i5 != null) {
                            String[] split3 = i5.split("x", -1);
                            i7 = Integer.parseInt(split3[0]);
                            i6 = Integer.parseInt(split3[1]);
                            if (i7 > 0) {
                            }
                        }
                        i6 = -1;
                        i7 = -1;
                        String i25 = i(G2, n, null, hashMap3);
                        float parseFloat = i25 == null ? Float.parseFloat(i25) : -1.0f;
                        String i26 = i(G2, d, null, hashMap3);
                        String i27 = i(G2, e, null, hashMap3);
                        String i28 = i(G2, f, null, hashMap3);
                        String i29 = i(G2, g, null, hashMap3);
                        if (!z2) {
                            N = p1g.N(str8, j(G2, pattern, hashMap3));
                        } else {
                            if (!vx6Var.E()) {
                                throw r7k.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            N = p1g.N(str8, k(vx6Var.G(), hashMap3));
                        }
                        Uri uri2 = N;
                        bsc bscVar2 = new bsc();
                        bscVar2.a = Integer.toString(arrayList9.size());
                        bscVar2.l = l5i.p("application/x-mpegURL");
                        bscVar2.j = i22;
                        bscVar2.h = i3;
                        bscVar2.i = parseInt2;
                        bscVar2.t = i7;
                        bscVar2.u = i6;
                        bscVar2.v = parseFloat;
                        bscVar2.f = i20;
                        arrayList9.add(new g0e(uri2, new dsc(bscVar2), i26, i27, i28, i29));
                        arrayList8 = (ArrayList) hashMap2.get(uri2);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap2.put(uri2, arrayList8);
                        }
                        arrayList8.add(new u0e(i3, parseInt2, i26, i27, i28, i29));
                        z3 = z5;
                        z4 = z6;
                        arrayList13 = arrayList17;
                        arrayList16 = arrayList28;
                        arrayList15 = arrayList4;
                        arrayList12 = arrayList5;
                        arrayList11 = arrayList6;
                        arrayList10 = arrayList7;
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 2;
                    str5 = null;
                }
                str6 = null;
                y2 = dvt.y(i4, i22);
                if (l5i.l(y2, str5)) {
                }
                i5 = i(G2, m, null, hashMap3);
                if (i5 != null) {
                }
                i6 = -1;
                i7 = -1;
                String i252 = i(G2, n, null, hashMap3);
                if (i252 == null) {
                }
                String i262 = i(G2, d, null, hashMap3);
                String i272 = i(G2, e, null, hashMap3);
                String i282 = i(G2, f, null, hashMap3);
                String i292 = i(G2, g, null, hashMap3);
                if (!z2) {
                }
                Uri uri22 = N;
                bsc bscVar22 = new bsc();
                bscVar22.a = Integer.toString(arrayList9.size());
                bscVar22.l = l5i.p("application/x-mpegURL");
                bscVar22.j = i22;
                bscVar22.h = i3;
                bscVar22.i = parseInt2;
                bscVar22.t = i7;
                bscVar22.u = i6;
                bscVar22.v = parseFloat;
                bscVar22.f = i20;
                arrayList9.add(new g0e(uri22, new dsc(bscVar22), i262, i272, i282, i292));
                arrayList8 = (ArrayList) hashMap2.get(uri22);
                if (arrayList8 == null) {
                }
                arrayList8.add(new u0e(i3, parseInt2, i262, i272, i282, i292));
                z3 = z5;
                z4 = z6;
                arrayList13 = arrayList17;
                arrayList16 = arrayList28;
                arrayList15 = arrayList4;
                arrayList12 = arrayList5;
                arrayList11 = arrayList6;
                arrayList10 = arrayList7;
            }
            arrayList7 = arrayList10;
            arrayList6 = arrayList11;
            arrayList5 = arrayList12;
            arrayList4 = arrayList15;
            z3 = z5;
            z4 = z6;
            arrayList13 = arrayList17;
            arrayList16 = arrayList28;
            arrayList15 = arrayList4;
            arrayList12 = arrayList5;
            arrayList11 = arrayList6;
            arrayList10 = arrayList7;
        }
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i2 = i(str, pattern, null, map);
        if (i2 != null) {
            return i2;
        }
        throw r7k.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = X0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0096, LOOP:0: B:13:0x0069->B:38:0x0069, LOOP_START, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:62:0x00ff, B:63:0x0105, B:67:0x0030, B:69:0x0036, B:74:0x003f, B:76:0x0048, B:81:0x0051, B:83:0x0057, B:85:0x005d, B:87:0x0062), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:62:0x00ff, B:63:0x0105, B:67:0x0030, B:69:0x0036, B:74:0x003f, B:76:0x0048, B:81:0x0051, B:83:0x0057, B:85:0x005d, B:87:0x0062), top: B:2:0x000f }] */
    @Override // defpackage.c8k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Uri uri, kb7 kb7Var) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(kb7Var));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z2 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z2) {
                    throw r7k.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        dvt.g(bufferedReader);
                        throw r7k.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            arrayDeque.add(trim);
                        } else {
                            arrayDeque.add(trim);
                            return e(new vx6(arrayDeque, bufferedReader), uri.toString());
                        }
                    }
                }
                arrayDeque.add(trim);
                return d(this.a, this.b, new vx6(arrayDeque, bufferedReader), uri.toString());
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !dvt.V(read)) {
                        read = bufferedReader.read();
                    }
                    z2 = dvt.V(read);
                } else {
                    if (read != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i2++;
                }
            }
            if (z2) {
            }
        } finally {
            dvt.g(bufferedReader);
        }
    }

    public k0e() {
        this(h0e.l, null);
    }
}
