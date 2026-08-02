package defpackage;

import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.util.DesugarTimeZone;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class f0c extends f97 {
    public final i7k g;
    public final jtc h;
    public final String i;
    public final String j;
    public final ybr k;
    public final vp3 m;
    public final so3 n;
    public y3e o;
    public long q;
    public long r;
    public final boolean t;
    public long u;
    public int l = 1;
    public long p = -9223372036854775807L;
    public long s = -1;
    public String v = "";
    public int w = 0;

    public f0c(j7k j7kVar, jtc jtcVar, String str, String str2, ybr ybrVar, so3 so3Var, vp3 vp3Var, boolean z) {
        this.h = jtcVar;
        this.g = j7kVar;
        this.i = str;
        this.j = str2;
        this.k = ybrVar;
        this.n = so3Var;
        this.m = vp3Var;
        this.t = z;
    }

    public static long E(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = dvt.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new cbp(j, j2));
            j += j2;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.f97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList A(XmlPullParser xmlPullParser, long j, long j2) {
        String str;
        long j3;
        long parseLong;
        ArrayList arrayList;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        vp3 vp3Var;
        ArrayList arrayList2 = new ArrayList();
        long j10 = -1;
        long j11 = 0;
        long j12 = -9223372036854775807L;
        int i = 0;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (g0g.R("S", xmlPullParser)) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong2 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (F() && j10 == -1) {
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                    long parseLong3 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                    this.q = parseLong3;
                    long j13 = parseLong3;
                    long j14 = this.r;
                    if (j13 <= 0 || this.o == null) {
                        arrayList = arrayList2;
                        j4 = j11;
                        Locale locale = Locale.US;
                        y3e y3eVar = this.o;
                        StringBuilder sb = new StringBuilder("calculateNewSegmentNumber: segmentLengthForLive = ");
                        parseLong = j13;
                        sb.append(parseLong);
                        sb.append(", utcTiming = ");
                        sb.append(y3eVar);
                        Log.w("ExtendedDashManifestParser", sb.toString());
                        j5 = j14;
                    } else {
                        so3 so3Var = this.n;
                        if (so3Var != null && (vp3Var = this.m) != null) {
                            try {
                                j7 = ((tk7) so3Var.a(vp3Var.f(new nb7(Uri.parse(this.v))))).d(-9223372036854775807L, "timestamp");
                            } catch (Throwable th) {
                                Log.e("ExtendedDashManifestParser", "Error parsing manifestUrl", th);
                            }
                            this.p = j7;
                            if (Build.VERSION.SDK_INT < 26) {
                                try {
                                    long epochMilli = Instant.parse(this.o.c).toEpochMilli();
                                    long epochMilli2 = Instant.now().toEpochMilli();
                                    arrayList = arrayList2;
                                    j4 = j11;
                                    try {
                                        long j15 = this.p;
                                        if (j15 != -9223372036854775807L) {
                                            epochMilli = j15;
                                        }
                                        j8 = ((epochMilli2 - epochMilli) / this.q) + j14;
                                    } catch (DateTimeParseException e) {
                                        e = e;
                                        Log.e("ExtendedDashManifestParser", "Error parsing utcTiming", e);
                                        j9 = j14;
                                        Locale locale2 = Locale.US;
                                        StringBuilder l = tlm.l(j14, "calculateNewSegmentNumber: oldStartNumber = ", ", newStartNumber = ");
                                        l.append(j9);
                                        Log.i("ExtendedDashManifestParser", l.toString());
                                        j5 = j9;
                                        parseLong = j13;
                                        this.s = j5;
                                        long j16 = (this.q * (j5 - this.r)) + parseLong2;
                                        if (z) {
                                        }
                                        if (j6 != -9223372036854775807L) {
                                        }
                                        j10 = j5;
                                        j12 = parseLong;
                                        String attributeValue3 = xmlPullParser.getAttributeValue(str, "r");
                                        if (attributeValue3 == null) {
                                        }
                                        z = true;
                                    }
                                } catch (DateTimeParseException e2) {
                                    e = e2;
                                    arrayList = arrayList2;
                                    j4 = j11;
                                }
                            } else {
                                arrayList = arrayList2;
                                j4 = j11;
                                try {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                                    Date parse = simpleDateFormat.parse(this.o.c);
                                    if (parse != null) {
                                        long time = parse.getTime();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        long j17 = this.p;
                                        if (j17 == -9223372036854775807L) {
                                            j17 = time;
                                        }
                                        j8 = ((currentTimeMillis - j17) / this.q) + j14;
                                    } else {
                                        j8 = j14;
                                    }
                                } catch (ParseException e3) {
                                    Log.e("ExtendedDashManifestParser", "Error parsing utcTiming", e3);
                                    j9 = j14;
                                    Locale locale22 = Locale.US;
                                    StringBuilder l2 = tlm.l(j14, "calculateNewSegmentNumber: oldStartNumber = ", ", newStartNumber = ");
                                    l2.append(j9);
                                    Log.i("ExtendedDashManifestParser", l2.toString());
                                    j5 = j9;
                                    parseLong = j13;
                                    this.s = j5;
                                    long j162 = (this.q * (j5 - this.r)) + parseLong2;
                                    if (z) {
                                    }
                                    if (j6 != -9223372036854775807L) {
                                    }
                                    j10 = j5;
                                    j12 = parseLong;
                                    String attributeValue32 = xmlPullParser.getAttributeValue(str, "r");
                                    if (attributeValue32 == null) {
                                    }
                                    z = true;
                                }
                            }
                            j9 = j8;
                            Locale locale222 = Locale.US;
                            StringBuilder l22 = tlm.l(j14, "calculateNewSegmentNumber: oldStartNumber = ", ", newStartNumber = ");
                            l22.append(j9);
                            Log.i("ExtendedDashManifestParser", l22.toString());
                            j5 = j9;
                            parseLong = j13;
                        }
                        j7 = -9223372036854775807L;
                        this.p = j7;
                        if (Build.VERSION.SDK_INT < 26) {
                        }
                        j9 = j8;
                        Locale locale2222 = Locale.US;
                        StringBuilder l222 = tlm.l(j14, "calculateNewSegmentNumber: oldStartNumber = ", ", newStartNumber = ");
                        l222.append(j9);
                        Log.i("ExtendedDashManifestParser", l222.toString());
                        j5 = j9;
                        parseLong = j13;
                    }
                    this.s = j5;
                    long j1622 = (this.q * (j5 - this.r)) + parseLong2;
                    if (z) {
                        j6 = j1622;
                        arrayList2 = arrayList;
                        str = null;
                        j11 = E(arrayList2, j4, j12, i, j6);
                    } else {
                        j6 = j1622;
                        arrayList2 = arrayList;
                        j11 = j4;
                        str = null;
                    }
                    if (j6 != -9223372036854775807L) {
                        j11 = j6;
                    }
                    j10 = j5;
                } else {
                    str = null;
                    if (z) {
                        j3 = parseLong2;
                        j11 = E(arrayList2, j11, j12, i, j3);
                    } else {
                        j3 = parseLong2;
                    }
                    long j18 = j3 != -9223372036854775807L ? j3 : j11;
                    String attributeValue4 = xmlPullParser.getAttributeValue(null, "d");
                    parseLong = attributeValue4 == null ? -9223372036854775807L : Long.parseLong(attributeValue4);
                    j11 = j18;
                }
                j12 = parseLong;
                String attributeValue322 = xmlPullParser.getAttributeValue(str, "r");
                i = attributeValue322 == null ? 0 : Integer.parseInt(attributeValue322);
                z = true;
            } else {
                f97.g(xmlPullParser);
            }
        } while (!g0g.Q("SegmentTimeline", xmlPullParser));
        if (!z) {
            return arrayList2;
        }
        int i2 = dvt.a;
        ArrayList arrayList3 = arrayList2;
        E(arrayList3, j11, j12, i, dvt.g0(j2, j, 1000L, RoundingMode.DOWN));
        return arrayList3;
    }

    @Override // defpackage.f97
    public final gqt D(XmlPullParser xmlPullParser, String str, gqt gqtVar) {
        String str2 = this.j;
        boolean z = str2 != null;
        String str3 = this.i;
        boolean z2 = str3 != null;
        if (z2 || z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                if (z2) {
                    ybr ybrVar = this.k;
                    str3.getClass();
                    try {
                        Uri parse = Uri.parse(attributeValue);
                        parse.getClass();
                        attributeValue = vpt.d(parse, str3, ybrVar);
                    } catch (Exception e) {
                        Timber.INSTANCE.e(e);
                    }
                }
                if (z) {
                    attributeValue = vpt.b(attributeValue, jpt.a(13).a, str2);
                }
                return gqt.b(attributeValue);
            }
        } else {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue2 != null) {
                return gqt.b(attributeValue2);
            }
        }
        return gqtVar;
    }

    public final boolean F() {
        return this.t && this.l == 2;
    }

    @Override // defpackage.f97
    public final dsc b(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, String str5, String str6, ArrayList arrayList3, ArrayList arrayList4) {
        dsc b = super.b(str, str2, i, i2, f, i3, i4, i5, str3, arrayList, arrayList2, str4, str5, str6, arrayList3, arrayList4);
        if (str3 == null) {
            return b;
        }
        u2i u2iVar = b.l;
        u2i a = u2iVar != null ? u2iVar.a(new u8h(str3)) : new u2i(new u8h(str3));
        bsc a2 = b.a();
        a2.k = a;
        return new dsc(a2);
    }

    @Override // defpackage.f97
    public final d97 c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, mum mumVar, y3e y3eVar, dnh dnhVar, Uri uri, ArrayList arrayList) {
        UUID uuid = un3.a;
        int i = dvt.a;
        return new z8w(j, j2, j3, z, j4, j5, j6, j7, mumVar, y3eVar, dnhVar, uri, arrayList, this.v);
    }

    @Override // defpackage.f97
    public final a0o d(e97 e97Var, String str, ArrayList arrayList, String str2, ArrayList arrayList2, ArrayList arrayList3) {
        jtc jtcVar = this.h;
        if (jtcVar != null) {
            dsc dscVar = e97Var.a;
            ebp ebpVar = e97Var.c;
            dscVar.getClass();
            ebpVar.getClass();
            synchronized (jtcVar.a) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) jtcVar.b;
                String str3 = dscVar.a;
                str3.getClass();
                linkedHashMap.put(str3, ebpVar);
            }
        }
        return super.d(e97Var, str, arrayList, str2, arrayList2, arrayList3);
    }

    @Override // defpackage.f97
    public final abp e(whn whnVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        long j8;
        whn whnVar2;
        long j9;
        long j10;
        long j11;
        List list3;
        long j12;
        List list4;
        long j13;
        long j14;
        if (F()) {
            j8 = this.s;
            j10 = j2;
            j11 = j4;
            list3 = list;
            j12 = j5;
            list4 = list2;
            j13 = j6;
            j14 = j7;
            whnVar2 = whnVar;
            j9 = j;
        } else {
            j8 = j3;
            whnVar2 = whnVar;
            j9 = j;
            j10 = j2;
            j11 = j4;
            list3 = list;
            j12 = j5;
            list4 = list2;
            j13 = j6;
            j14 = j7;
        }
        return super.e(whnVar2, j9, j10, j8, j11, list3, j12, list4, j13, j14);
    }

    @Override // defpackage.f97
    public final bbp f(whn whnVar, long j, long j2, long j3, long j4, long j5, List list, long j6, gqt gqtVar, gqt gqtVar2, long j7, long j8) {
        long j9;
        whn whnVar2;
        long j10;
        long j11;
        long j12;
        long j13;
        List list2;
        long j14;
        gqt gqtVar3;
        gqt gqtVar4;
        long j15;
        long j16;
        if (F()) {
            j9 = this.s;
            j11 = j2;
            j12 = j4;
            j13 = j5;
            list2 = list;
            j14 = j6;
            gqtVar3 = gqtVar;
            gqtVar4 = gqtVar2;
            j15 = j7;
            j16 = j8;
            whnVar2 = whnVar;
            j10 = j;
        } else {
            j9 = j3;
            whnVar2 = whnVar;
            j10 = j;
            j11 = j2;
            j12 = j4;
            j13 = j5;
            list2 = list;
            j14 = j6;
            gqtVar3 = gqtVar;
            gqtVar4 = gqtVar2;
            j15 = j7;
            j16 = j8;
        }
        return super.f(whnVar2, j10, j11, j9, j12, j13, list2, j14, gqtVar3, gqtVar4, j15, j16);
    }

    @Override // defpackage.f97
    public final ArrayList j(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = this.w;
            this.w = i + 1;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String C = f97.C("BaseURL", xmlPullParser);
        if (C != null && p1g.F(C)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = C;
            }
            return ldg.z(new mu2(i, parseInt, C, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mu2 mu2Var = (mu2) arrayList.get(i2);
            String M = p1g.M(mu2Var.a, C);
            String str = attributeValue3 == null ? M : attributeValue3;
            if (z) {
                i = mu2Var.c;
                parseInt = mu2Var.d;
                str = mu2Var.b;
            }
            arrayList2.add(new mu2(i, parseInt, M, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0c3e A[LOOP:4: B:178:0x0393->B:188:0x0c3e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0be9 A[EDGE_INSN: B:189:0x0be9->B:190:0x0be9 BREAK  A[LOOP:4: B:178:0x0393->B:188:0x0c3e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a29 A[LOOP:6: B:272:0x06d7->B:284:0x0a29, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0998 A[EDGE_INSN: B:285:0x0998->B:286:0x0998 BREAK  A[LOOP:6: B:272:0x06d7->B:284:0x0a29], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0ef9 A[LOOP:1: B:51:0x0120->B:66:0x0ef9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0e11 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0e35  */
    @Override // defpackage.f97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d97 s(XmlPullParser xmlPullParser, Uri uri) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        long j3;
        ArrayList arrayList;
        String str;
        boolean z3;
        ArrayList arrayList2;
        long j4;
        long j5;
        long j6;
        ArrayList arrayList3;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        boolean z4;
        long j7;
        long j8;
        ArrayList arrayList6;
        String str5;
        ArrayList arrayList7;
        String str6;
        long j9;
        ArrayList arrayList8;
        long j10;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i;
        ArrayList arrayList11;
        long j11;
        String str15;
        ArrayList arrayList12;
        ArrayList arrayList13;
        int i2;
        long j12;
        String str16;
        String str17;
        XmlPullParser xmlPullParser2;
        long j13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        String str18;
        char c;
        int i3;
        String str19;
        String str20;
        int parseInt;
        String str21;
        String str22;
        String str23;
        String str24;
        int parseInt2;
        String str25;
        String str26;
        int parseInt3;
        String str27;
        float f;
        ArrayList arrayList16;
        long j14;
        String str28;
        ArrayList arrayList17;
        String str29;
        ArrayList arrayList18;
        int i4;
        String str30;
        String str31;
        ArrayList arrayList19;
        String str32;
        XmlPullParser xmlPullParser3;
        String str33;
        long j15;
        String str34;
        String str35;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str36;
        ArrayList arrayList22;
        String str37;
        ArrayList arrayList23;
        String str38;
        ArrayList arrayList24;
        ArrayList arrayList25;
        long j16;
        boolean z5;
        int i5;
        String str39;
        String str40;
        String str41;
        long j17;
        long j18;
        Uri uri2;
        long j19;
        long j20;
        y3e y3eVar;
        so3 so3Var;
        vp3 vp3Var;
        f0c f0cVar = this;
        XmlPullParser xmlPullParser4 = xmlPullParser;
        f0cVar.u = Long.MAX_VALUE;
        String[] strArr = new String[0];
        String attributeValue = xmlPullParser4.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(StringUtils.COMMA);
        }
        int length = strArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z = false;
                break;
            }
            if (strArr[i6].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i6++;
        }
        String attributeValue2 = xmlPullParser4.getAttributeValue(null, "availabilityStartTime");
        long b0 = attributeValue2 == null ? -9223372036854775807L : dvt.b0(attributeValue2);
        long n = f97.n(xmlPullParser4, "mediaPresentationDuration", -9223372036854775807L);
        long n2 = f97.n(xmlPullParser4, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser4.getAttributeValue(null, "type"));
        if (equals) {
            j = n;
            j2 = n2;
            z2 = equals;
            j3 = f97.n(xmlPullParser4, "minimumUpdatePeriod", -9223372036854775807L);
        } else {
            j = n;
            j2 = n2;
            z2 = equals;
            j3 = -9223372036854775807L;
        }
        long n3 = z2 ? f97.n(xmlPullParser4, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long n4 = z2 ? f97.n(xmlPullParser4, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser4.getAttributeValue(null, "publishTime");
        long b02 = attributeValue3 == null ? -9223372036854775807L : dvt.b0(attributeValue3);
        long j21 = z2 ? 0L : -9223372036854775807L;
        ArrayList arrayList26 = new ArrayList();
        long j22 = z2 ? -9223372036854775807L : 0L;
        ArrayList arrayList27 = new ArrayList();
        String uri3 = uri.toString();
        f0cVar.v = uri3;
        long j23 = -9223372036854775807L;
        ArrayList z6 = ldg.z(new mu2(z ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString()));
        f0cVar.v = uri3;
        int i7 = 5;
        if (f0cVar.t) {
            if (f0cVar.l == 3) {
                f0cVar.l = 4;
            }
            if (f0cVar.l == 1 && z2 && (so3Var = f0cVar.n) != null && (vp3Var = f0cVar.m) != null) {
                if (so3Var.c().contains(vp3Var.f(new nb7(uri)))) {
                    i7 = 2;
                }
            }
            f0cVar.l = i7;
        } else {
            f0cVar.l = 5;
        }
        long j24 = j22;
        long j25 = j21;
        boolean z7 = false;
        boolean z8 = false;
        mum mumVar = null;
        Uri uri4 = null;
        dnh dnhVar = null;
        while (true) {
            xmlPullParser4.next();
            String str42 = "BaseURL";
            String str43 = "ExtendedDashManifestParser";
            if (g0g.R("BaseURL", xmlPullParser4)) {
                if (!z7) {
                    f0cVar.w = 0;
                    j25 = f97.i(xmlPullParser4, j25);
                    z7 = true;
                }
                ArrayList j26 = f0cVar.j(xmlPullParser4, z6, z);
                i7k i7kVar = f0cVar.g;
                if (i7kVar != null) {
                    Iterator it = j26.iterator();
                    while (it.hasNext()) {
                        String str44 = ((mu2) it.next()).a;
                        str44.getClass();
                        Timber.INSTANCE.i("onNewBaseUrlParsed url=".concat(str44), new Object[0]);
                        ((j7k) i7kVar).a.add(str44);
                        i7kVar = i7kVar;
                        z6 = z6;
                        j25 = j25;
                        str43 = str43;
                    }
                }
                arrayList = z6;
                str = str43;
                arrayList27.addAll(j26);
                z3 = z;
                arrayList2 = arrayList27;
                j6 = j23;
                arrayList3 = arrayList26;
                uri2 = uri4;
                j25 = j25;
            } else {
                arrayList = z6;
                str = "ExtendedDashManifestParser";
                if (g0g.R("ProgramInformation", xmlPullParser4)) {
                    mumVar = f97.t(xmlPullParser4);
                } else {
                    if (g0g.R("UTCTiming", xmlPullParser4)) {
                        f0cVar.o = new y3e(xmlPullParser4.getAttributeValue(null, "schemeIdUri"), xmlPullParser4.getAttributeValue(null, Constants.KEY_VALUE), 3);
                        z3 = z;
                        arrayList2 = arrayList27;
                        j4 = j25;
                        j5 = j24;
                        j6 = j23;
                        arrayList3 = arrayList26;
                        str2 = str;
                    } else if (g0g.R("Location", xmlPullParser4)) {
                        uri4 = Uri.parse(xmlPullParser4.nextText());
                    } else if (g0g.R("ServiceDescription", xmlPullParser4)) {
                        dnhVar = f97.B(xmlPullParser4);
                    } else {
                        String str45 = "Period";
                        if (!g0g.R("Period", xmlPullParser4) || z8) {
                            z3 = z;
                            arrayList2 = arrayList27;
                            j4 = j25;
                            j5 = j24;
                            j6 = j23;
                            arrayList3 = arrayList26;
                            str2 = str;
                            f97.g(xmlPullParser4);
                        } else {
                            ArrayList arrayList28 = !arrayList27.isEmpty() ? arrayList27 : arrayList;
                            String attributeValue4 = xmlPullParser4.getAttributeValue(null, ConnectableDevice.KEY_ID);
                            long n5 = f97.n(xmlPullParser4, "start", j24);
                            long j27 = b0 != j23 ? b0 + n5 : j23;
                            String str46 = ConnectableDevice.KEY_ID;
                            long j28 = j23;
                            long n6 = f97.n(xmlPullParser4, "duration", j28);
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = new ArrayList();
                            ArrayList arrayList31 = new ArrayList();
                            new ArrayList();
                            long j29 = j28;
                            long j30 = j24;
                            boolean z9 = false;
                            ebp ebpVar = null;
                            long j31 = j25;
                            while (true) {
                                xmlPullParser4.next();
                                if (g0g.R(str42, xmlPullParser4)) {
                                    if (!z9) {
                                        f0cVar.w = 0;
                                        j31 = f97.i(xmlPullParser4, j31);
                                        z9 = true;
                                    }
                                    arrayList31.addAll(f0cVar.j(xmlPullParser4, arrayList28, z));
                                    str3 = str46;
                                    z3 = z;
                                    arrayList2 = arrayList27;
                                    j4 = j25;
                                    str4 = str42;
                                    arrayList4 = arrayList28;
                                    arrayList5 = arrayList31;
                                    j8 = n6;
                                    j7 = j27;
                                    str2 = str;
                                    z4 = true;
                                    j6 = -9223372036854775807L;
                                } else {
                                    String str47 = str45;
                                    long j32 = j31;
                                    if (g0g.R("AdaptationSet", xmlPullParser4)) {
                                        ArrayList arrayList32 = !arrayList31.isEmpty() ? arrayList31 : arrayList28;
                                        arrayList2 = arrayList27;
                                        j4 = j25;
                                        String str48 = str46;
                                        String attributeValue5 = xmlPullParser4.getAttributeValue(null, str48);
                                        long parseLong = attributeValue5 == null ? -1L : Long.parseLong(attributeValue5);
                                        int l = f97.l(xmlPullParser4);
                                        String str49 = "SegmentTemplate";
                                        String attributeValue6 = xmlPullParser4.getAttributeValue(null, "mimeType");
                                        ArrayList arrayList33 = arrayList28;
                                        String attributeValue7 = xmlPullParser4.getAttributeValue(null, "codecs");
                                        String str50 = "AdaptationSet";
                                        String attributeValue8 = xmlPullParser4.getAttributeValue(null, "scte214:supplementalCodecs");
                                        ArrayList arrayList34 = arrayList31;
                                        String attributeValue9 = xmlPullParser4.getAttributeValue(null, "scte214:supplementalProfiles");
                                        long j33 = n3;
                                        String attributeValue10 = xmlPullParser4.getAttributeValue(null, CameraProperty.WIDTH);
                                        int parseInt4 = attributeValue10 == null ? -1 : Integer.parseInt(attributeValue10);
                                        String attributeValue11 = xmlPullParser4.getAttributeValue(null, CameraProperty.HEIGHT);
                                        int parseInt5 = attributeValue11 == null ? -1 : Integer.parseInt(attributeValue11);
                                        float q = f97.q(xmlPullParser4, -1.0f);
                                        String str51 = "SegmentList";
                                        String str52 = "SegmentBase";
                                        String attributeValue12 = xmlPullParser4.getAttributeValue(null, "audioSamplingRate");
                                        int parseInt6 = attributeValue12 == null ? -1 : Integer.parseInt(attributeValue12);
                                        String str53 = "audioSamplingRate";
                                        String str54 = "lang";
                                        String attributeValue13 = xmlPullParser4.getAttributeValue(null, "lang");
                                        float f2 = q;
                                        String attributeValue14 = xmlPullParser4.getAttributeValue(null, "label");
                                        ArrayList arrayList35 = new ArrayList();
                                        ArrayList arrayList36 = new ArrayList();
                                        ArrayList arrayList37 = arrayList35;
                                        ArrayList arrayList38 = new ArrayList();
                                        ArrayList arrayList39 = new ArrayList();
                                        String str55 = CameraProperty.HEIGHT;
                                        ArrayList arrayList40 = new ArrayList();
                                        String str56 = CameraProperty.WIDTH;
                                        ArrayList arrayList41 = new ArrayList();
                                        String str57 = "scte214:supplementalProfiles";
                                        ArrayList arrayList42 = new ArrayList();
                                        String str58 = "scte214:supplementalCodecs";
                                        ArrayList arrayList43 = new ArrayList();
                                        ArrayList arrayList44 = new ArrayList();
                                        String str59 = "mimeType";
                                        String str60 = "codecs";
                                        ArrayList arrayList45 = arrayList42;
                                        ArrayList arrayList46 = arrayList41;
                                        ebp ebpVar2 = ebpVar;
                                        long j34 = j29;
                                        long j35 = j32;
                                        int i8 = l;
                                        String str61 = attributeValue13;
                                        boolean z10 = false;
                                        String str62 = null;
                                        int i9 = -1;
                                        while (true) {
                                            xmlPullParser4.next();
                                            if (g0g.R(str42, xmlPullParser4)) {
                                                str4 = str42;
                                                if (!z10) {
                                                    f0cVar.w = 0;
                                                    j35 = f97.i(xmlPullParser4, j35);
                                                    z10 = true;
                                                }
                                                arrayList44.addAll(f0cVar.j(xmlPullParser4, arrayList32, z));
                                                str17 = str49;
                                                str5 = str61;
                                                z3 = z;
                                                str3 = str48;
                                                str6 = attributeValue7;
                                                arrayList6 = arrayList44;
                                            } else {
                                                str4 = str42;
                                                if (g0g.R("ContentProtection", xmlPullParser4)) {
                                                    Pair k = f97.k(xmlPullParser4);
                                                    arrayList6 = arrayList44;
                                                    Object obj = k.first;
                                                    if (obj != null) {
                                                        str62 = (String) obj;
                                                    }
                                                    Object obj2 = k.second;
                                                    if (obj2 != null) {
                                                        arrayList36.add((oqa) obj2);
                                                    }
                                                    str17 = str49;
                                                    str5 = str61;
                                                    z3 = z;
                                                    str3 = str48;
                                                } else {
                                                    arrayList6 = arrayList44;
                                                    if (g0g.R("ContentComponent", xmlPullParser4)) {
                                                        String attributeValue15 = xmlPullParser4.getAttributeValue(null, str54);
                                                        if (str61 == null) {
                                                            str61 = attributeValue15;
                                                        } else if (attributeValue15 != null) {
                                                            vq1.A(str61.equals(attributeValue15));
                                                        }
                                                        int l2 = f97.l(xmlPullParser4);
                                                        if (i8 == -1) {
                                                            i8 = l2;
                                                        } else if (l2 != -1) {
                                                            vq1.A(i8 == l2);
                                                        }
                                                        str17 = str49;
                                                        str5 = str61;
                                                        z3 = z;
                                                        str3 = str48;
                                                        str6 = attributeValue7;
                                                        arrayList8 = arrayList39;
                                                        j10 = n6;
                                                        str2 = str;
                                                        arrayList9 = arrayList29;
                                                        arrayList10 = arrayList30;
                                                        arrayList4 = arrayList33;
                                                        str20 = str50;
                                                        arrayList5 = arrayList34;
                                                        str8 = str51;
                                                        str19 = str62;
                                                        arrayList15 = arrayList37;
                                                        arrayList14 = arrayList38;
                                                        str9 = str56;
                                                        str10 = str57;
                                                        str11 = str58;
                                                        str12 = str60;
                                                        str13 = str59;
                                                        c = 2;
                                                        z4 = true;
                                                        xmlPullParser2 = xmlPullParser4;
                                                        i3 = i8;
                                                        arrayList11 = arrayList40;
                                                        str18 = str54;
                                                        j11 = j27;
                                                        str15 = attributeValue9;
                                                        j13 = j33;
                                                        str16 = str52;
                                                        arrayList12 = arrayList46;
                                                        i = 0;
                                                        arrayList7 = arrayList36;
                                                        arrayList13 = arrayList32;
                                                        if (!g0g.Q(str20, xmlPullParser2)) {
                                                            break;
                                                        }
                                                        str51 = str8;
                                                        str62 = str19;
                                                        j33 = j13;
                                                        str52 = str16;
                                                        arrayList40 = arrayList11;
                                                        arrayList34 = arrayList5;
                                                        arrayList32 = arrayList13;
                                                        i8 = i3;
                                                        str59 = str13;
                                                        arrayList36 = arrayList7;
                                                        arrayList44 = arrayList6;
                                                        str61 = str5;
                                                        str48 = str3;
                                                        arrayList39 = arrayList8;
                                                        n6 = j10;
                                                        arrayList29 = arrayList9;
                                                        arrayList30 = arrayList10;
                                                        str = str2;
                                                        str49 = str17;
                                                        str54 = str18;
                                                        str50 = str20;
                                                        xmlPullParser4 = xmlPullParser2;
                                                        z = z3;
                                                        arrayList46 = arrayList12;
                                                        str60 = str12;
                                                        attributeValue7 = str6;
                                                        attributeValue9 = str15;
                                                        j27 = j11;
                                                        str58 = str11;
                                                        arrayList37 = arrayList15;
                                                        arrayList38 = arrayList14;
                                                        str57 = str10;
                                                        str42 = str4;
                                                        f0cVar = this;
                                                        str56 = str9;
                                                        arrayList33 = arrayList4;
                                                    } else {
                                                        if (g0g.R("Role", xmlPullParser4)) {
                                                            arrayList40.add(f97.m("Role", xmlPullParser4));
                                                            str17 = str49;
                                                            str5 = str61;
                                                        } else {
                                                            String str63 = "AudioChannelConfiguration";
                                                            if (g0g.R("AudioChannelConfiguration", xmlPullParser4)) {
                                                                str17 = str49;
                                                                str5 = str61;
                                                                z3 = z;
                                                                str3 = str48;
                                                                i9 = f97.h(attributeValue7, xmlPullParser4);
                                                            } else {
                                                                str5 = str61;
                                                                if (g0g.R("Accessibility", xmlPullParser4)) {
                                                                    arrayList39.add(f97.m("Accessibility", xmlPullParser4));
                                                                    str17 = str49;
                                                                } else {
                                                                    if (g0g.R("EssentialProperty", xmlPullParser4)) {
                                                                        ArrayList arrayList47 = arrayList46;
                                                                        arrayList47.add(f97.m("EssentialProperty", xmlPullParser4));
                                                                        str17 = str49;
                                                                        z3 = z;
                                                                        arrayList7 = arrayList36;
                                                                        str3 = str48;
                                                                        str6 = attributeValue7;
                                                                        j9 = j35;
                                                                        arrayList8 = arrayList39;
                                                                        j10 = n6;
                                                                        str2 = str;
                                                                        arrayList9 = arrayList29;
                                                                        arrayList10 = arrayList30;
                                                                        arrayList4 = arrayList33;
                                                                        str7 = str50;
                                                                        arrayList5 = arrayList34;
                                                                        str8 = str51;
                                                                        arrayList15 = arrayList37;
                                                                        str9 = str56;
                                                                        str10 = str57;
                                                                        str11 = str58;
                                                                        str12 = str60;
                                                                        str13 = str59;
                                                                        j12 = j34;
                                                                        c = 2;
                                                                        z4 = true;
                                                                        xmlPullParser2 = xmlPullParser4;
                                                                        i2 = i8;
                                                                        arrayList11 = arrayList40;
                                                                        str18 = str54;
                                                                        j13 = j33;
                                                                        str16 = str52;
                                                                        i = 0;
                                                                        String str64 = attributeValue9;
                                                                        arrayList12 = arrayList47;
                                                                        arrayList14 = arrayList38;
                                                                        j11 = j27;
                                                                        str15 = str64;
                                                                        arrayList13 = arrayList32;
                                                                    } else {
                                                                        ArrayList arrayList48 = arrayList46;
                                                                        arrayList7 = arrayList36;
                                                                        String str65 = str54;
                                                                        if (g0g.R("SupplementalProperty", xmlPullParser4)) {
                                                                            arrayList45.add(f97.m("SupplementalProperty", xmlPullParser4));
                                                                            str17 = str49;
                                                                            z3 = z;
                                                                            str3 = str48;
                                                                            str6 = attributeValue7;
                                                                            j9 = j35;
                                                                            arrayList8 = arrayList39;
                                                                            j10 = n6;
                                                                            str2 = str;
                                                                            arrayList9 = arrayList29;
                                                                            arrayList10 = arrayList30;
                                                                            arrayList4 = arrayList33;
                                                                            str7 = str50;
                                                                            arrayList5 = arrayList34;
                                                                            str8 = str51;
                                                                            str16 = str52;
                                                                            arrayList15 = arrayList37;
                                                                            arrayList14 = arrayList38;
                                                                            str9 = str56;
                                                                            str10 = str57;
                                                                            str11 = str58;
                                                                            str12 = str60;
                                                                            str13 = str59;
                                                                            c = 2;
                                                                            z4 = true;
                                                                            xmlPullParser2 = xmlPullParser4;
                                                                            i2 = i8;
                                                                            arrayList11 = arrayList40;
                                                                            j11 = j27;
                                                                            str15 = attributeValue9;
                                                                            j13 = j33;
                                                                            str18 = str65;
                                                                            i = 0;
                                                                            arrayList12 = arrayList48;
                                                                            arrayList13 = arrayList32;
                                                                            j12 = j34;
                                                                        } else {
                                                                            ArrayList arrayList49 = arrayList45;
                                                                            int i10 = i8;
                                                                            String str66 = "SupplementalProperty";
                                                                            String str67 = "Representation";
                                                                            if (g0g.R("Representation", xmlPullParser4)) {
                                                                                String str68 = "InbandEventStream";
                                                                                ArrayList arrayList50 = !arrayList6.isEmpty() ? arrayList6 : arrayList32;
                                                                                String str69 = "EssentialProperty";
                                                                                String attributeValue16 = xmlPullParser4.getAttributeValue(null, str48);
                                                                                str3 = str48;
                                                                                String attributeValue17 = xmlPullParser4.getAttributeValue(null, "bandwidth");
                                                                                if (attributeValue17 == null) {
                                                                                    str21 = str59;
                                                                                    parseInt = -1;
                                                                                } else {
                                                                                    String str70 = str59;
                                                                                    parseInt = Integer.parseInt(attributeValue17);
                                                                                    str21 = str70;
                                                                                }
                                                                                String attributeValue18 = xmlPullParser4.getAttributeValue(null, str21);
                                                                                if (attributeValue18 == null) {
                                                                                    String str71 = str60;
                                                                                    str13 = str21;
                                                                                    str22 = str71;
                                                                                    attributeValue18 = attributeValue6;
                                                                                } else {
                                                                                    String str72 = str60;
                                                                                    str13 = str21;
                                                                                    str22 = str72;
                                                                                }
                                                                                String attributeValue19 = xmlPullParser4.getAttributeValue(null, str22);
                                                                                String str73 = str58;
                                                                                str12 = str22;
                                                                                arrayList8 = arrayList39;
                                                                                String str74 = attributeValue19 == null ? attributeValue7 : attributeValue19;
                                                                                String attributeValue20 = xmlPullParser4.getAttributeValue(null, str73);
                                                                                if (attributeValue20 == null) {
                                                                                    String str75 = str57;
                                                                                    str11 = str73;
                                                                                    str23 = str75;
                                                                                    attributeValue20 = attributeValue8;
                                                                                } else {
                                                                                    String str76 = str57;
                                                                                    str11 = str73;
                                                                                    str23 = str76;
                                                                                }
                                                                                String attributeValue21 = xmlPullParser4.getAttributeValue(null, str23);
                                                                                if (attributeValue21 == null) {
                                                                                    String str77 = str56;
                                                                                    str10 = str23;
                                                                                    str24 = str77;
                                                                                    attributeValue21 = attributeValue9;
                                                                                } else {
                                                                                    String str78 = str56;
                                                                                    str10 = str23;
                                                                                    str24 = str78;
                                                                                }
                                                                                String attributeValue22 = xmlPullParser4.getAttributeValue(null, str24);
                                                                                if (attributeValue22 == null) {
                                                                                    String str79 = str55;
                                                                                    str25 = str24;
                                                                                    str26 = str79;
                                                                                    parseInt2 = parseInt4;
                                                                                } else {
                                                                                    parseInt2 = Integer.parseInt(attributeValue22);
                                                                                    String str80 = str55;
                                                                                    str25 = str24;
                                                                                    str26 = str80;
                                                                                }
                                                                                String attributeValue23 = xmlPullParser4.getAttributeValue(null, str26);
                                                                                if (attributeValue23 == null) {
                                                                                    float f3 = f2;
                                                                                    str27 = str26;
                                                                                    f = f3;
                                                                                    parseInt3 = parseInt5;
                                                                                } else {
                                                                                    parseInt3 = Integer.parseInt(attributeValue23);
                                                                                    float f4 = f2;
                                                                                    str27 = str26;
                                                                                    f = f4;
                                                                                }
                                                                                float q2 = f97.q(xmlPullParser4, f);
                                                                                float f5 = f;
                                                                                String str81 = str53;
                                                                                String attributeValue24 = xmlPullParser4.getAttributeValue(null, str81);
                                                                                int parseInt7 = attributeValue24 == null ? parseInt6 : Integer.parseInt(attributeValue24);
                                                                                ArrayList arrayList51 = new ArrayList();
                                                                                ArrayList arrayList52 = new ArrayList();
                                                                                ArrayList arrayList53 = new ArrayList(arrayList48);
                                                                                ArrayList arrayList54 = new ArrayList(arrayList49);
                                                                                ArrayList arrayList55 = new ArrayList();
                                                                                ArrayList arrayList56 = arrayList48;
                                                                                String str82 = str81;
                                                                                ArrayList arrayList57 = arrayList49;
                                                                                String str83 = "ContentProtection";
                                                                                long j36 = j35;
                                                                                ebp ebpVar3 = ebpVar2;
                                                                                long j37 = j34;
                                                                                int i11 = i9;
                                                                                boolean z11 = false;
                                                                                String str84 = null;
                                                                                while (true) {
                                                                                    xmlPullParser4.next();
                                                                                    str6 = attributeValue7;
                                                                                    String str85 = str4;
                                                                                    if (g0g.R(str85, xmlPullParser4)) {
                                                                                        str4 = str85;
                                                                                        if (!z11) {
                                                                                            f0cVar.w = 0;
                                                                                            j36 = f97.i(xmlPullParser4, j36);
                                                                                            z11 = true;
                                                                                        }
                                                                                        arrayList55.addAll(f0cVar.j(xmlPullParser4, arrayList50, z));
                                                                                    } else {
                                                                                        str4 = str85;
                                                                                        if (g0g.R(str63, xmlPullParser4)) {
                                                                                            i11 = f97.h(str74, xmlPullParser4);
                                                                                        } else {
                                                                                            String str86 = str52;
                                                                                            if (g0g.R(str86, xmlPullParser4)) {
                                                                                                arrayList16 = arrayList55;
                                                                                                ebpVar3 = f97.x(xmlPullParser4, (dbp) ebpVar3);
                                                                                                str33 = str49;
                                                                                                xmlPullParser3 = xmlPullParser4;
                                                                                                z3 = z;
                                                                                                str34 = str86;
                                                                                                j14 = j35;
                                                                                                str28 = str74;
                                                                                                str36 = str68;
                                                                                                arrayList9 = arrayList29;
                                                                                                arrayList10 = arrayList30;
                                                                                                arrayList4 = arrayList33;
                                                                                                str35 = str50;
                                                                                                arrayList5 = arrayList34;
                                                                                                j15 = j33;
                                                                                                arrayList20 = arrayList37;
                                                                                                arrayList21 = arrayList38;
                                                                                                str9 = str25;
                                                                                                arrayList18 = arrayList43;
                                                                                                i4 = i10;
                                                                                                z5 = z11;
                                                                                                arrayList22 = arrayList51;
                                                                                                arrayList24 = arrayList53;
                                                                                                str32 = str83;
                                                                                                arrayList45 = arrayList57;
                                                                                                i5 = i11;
                                                                                                z4 = true;
                                                                                                i = 0;
                                                                                                str30 = str63;
                                                                                                j10 = n6;
                                                                                                j11 = j27;
                                                                                                str15 = attributeValue9;
                                                                                                str31 = str51;
                                                                                                str55 = str27;
                                                                                                f2 = f5;
                                                                                                arrayList12 = arrayList56;
                                                                                                arrayList13 = arrayList32;
                                                                                                arrayList19 = arrayList40;
                                                                                                arrayList17 = arrayList50;
                                                                                                str29 = str;
                                                                                                str38 = str66;
                                                                                                arrayList25 = arrayList54;
                                                                                                long j38 = j36;
                                                                                                str37 = str69;
                                                                                                j16 = j38;
                                                                                                arrayList23 = arrayList52;
                                                                                                j18 = j37;
                                                                                                str39 = str67;
                                                                                                str40 = str82;
                                                                                                str41 = str84;
                                                                                                j17 = j18;
                                                                                                if (g0g.Q(str39, xmlPullParser3)) {
                                                                                                    break;
                                                                                                }
                                                                                                String str87 = str32;
                                                                                                arrayList51 = arrayList22;
                                                                                                arrayList52 = arrayList23;
                                                                                                String str88 = str29;
                                                                                                str69 = str37;
                                                                                                j36 = j16;
                                                                                                str68 = str36;
                                                                                                str67 = str39;
                                                                                                i11 = i5;
                                                                                                str66 = str38;
                                                                                                arrayList53 = arrayList24;
                                                                                                arrayList54 = arrayList25;
                                                                                                arrayList40 = arrayList19;
                                                                                                z = z3;
                                                                                                arrayList34 = arrayList5;
                                                                                                arrayList32 = arrayList13;
                                                                                                str63 = str30;
                                                                                                j33 = j15;
                                                                                                arrayList56 = arrayList12;
                                                                                                arrayList50 = arrayList17;
                                                                                                arrayList55 = arrayList16;
                                                                                                f5 = f2;
                                                                                                str27 = str55;
                                                                                                attributeValue7 = str6;
                                                                                                j35 = j14;
                                                                                                str74 = str28;
                                                                                                arrayList29 = arrayList9;
                                                                                                arrayList43 = arrayList18;
                                                                                                str49 = str33;
                                                                                                str52 = str34;
                                                                                                xmlPullParser4 = xmlPullParser3;
                                                                                                str51 = str31;
                                                                                                attributeValue9 = str15;
                                                                                                str25 = str9;
                                                                                                j27 = j11;
                                                                                                n6 = j10;
                                                                                                arrayList37 = arrayList20;
                                                                                                arrayList38 = arrayList21;
                                                                                                f0cVar = this;
                                                                                                arrayList33 = arrayList4;
                                                                                                str83 = str87;
                                                                                                arrayList57 = arrayList45;
                                                                                                str = str88;
                                                                                                i10 = i4;
                                                                                                arrayList30 = arrayList10;
                                                                                                String str89 = str41;
                                                                                                str82 = str40;
                                                                                                j37 = j17;
                                                                                                str84 = str89;
                                                                                                z11 = z5;
                                                                                                str50 = str35;
                                                                                            } else {
                                                                                                arrayList16 = arrayList55;
                                                                                                String str90 = str51;
                                                                                                if (g0g.R(str90, xmlPullParser4)) {
                                                                                                    j14 = j35;
                                                                                                    ArrayList arrayList58 = arrayList32;
                                                                                                    long i12 = f97.i(xmlPullParser4, j37);
                                                                                                    z3 = z;
                                                                                                    str28 = str74;
                                                                                                    arrayList17 = arrayList50;
                                                                                                    long j39 = n6;
                                                                                                    str29 = str;
                                                                                                    arrayList9 = arrayList29;
                                                                                                    arrayList10 = arrayList30;
                                                                                                    arrayList4 = arrayList33;
                                                                                                    arrayList5 = arrayList34;
                                                                                                    str9 = str25;
                                                                                                    arrayList18 = arrayList43;
                                                                                                    i4 = i10;
                                                                                                    arrayList45 = arrayList57;
                                                                                                    str31 = str90;
                                                                                                    str30 = str63;
                                                                                                    arrayList19 = arrayList40;
                                                                                                    str55 = str27;
                                                                                                    f2 = f5;
                                                                                                    str32 = str83;
                                                                                                    long j40 = j36;
                                                                                                    long j41 = j27;
                                                                                                    str15 = attributeValue9;
                                                                                                    arrayList12 = arrayList56;
                                                                                                    arrayList13 = arrayList58;
                                                                                                    long j42 = j33;
                                                                                                    i = 0;
                                                                                                    ebpVar3 = f0cVar.y(xmlPullParser4, (abp) ebpVar3, j41, j39, j40, i12, j42);
                                                                                                    str33 = str49;
                                                                                                    xmlPullParser3 = xmlPullParser4;
                                                                                                    j15 = j42;
                                                                                                    str34 = str86;
                                                                                                    str36 = str68;
                                                                                                    str35 = str50;
                                                                                                    arrayList20 = arrayList37;
                                                                                                    arrayList21 = arrayList38;
                                                                                                    z5 = z11;
                                                                                                    arrayList22 = arrayList51;
                                                                                                    arrayList25 = arrayList54;
                                                                                                    i5 = i11;
                                                                                                    z4 = true;
                                                                                                    j11 = j41;
                                                                                                    str37 = str69;
                                                                                                    arrayList23 = arrayList52;
                                                                                                    j18 = i12;
                                                                                                    str38 = str66;
                                                                                                    arrayList24 = arrayList53;
                                                                                                    j16 = j40;
                                                                                                    j10 = j39;
                                                                                                    str39 = str67;
                                                                                                    str40 = str82;
                                                                                                    str41 = str84;
                                                                                                    j17 = j18;
                                                                                                    if (g0g.Q(str39, xmlPullParser3)) {
                                                                                                    }
                                                                                                } else {
                                                                                                    z3 = z;
                                                                                                    j14 = j35;
                                                                                                    str28 = str74;
                                                                                                    arrayList17 = arrayList50;
                                                                                                    str29 = str;
                                                                                                    arrayList9 = arrayList29;
                                                                                                    arrayList10 = arrayList30;
                                                                                                    arrayList4 = arrayList33;
                                                                                                    arrayList5 = arrayList34;
                                                                                                    str9 = str25;
                                                                                                    arrayList18 = arrayList43;
                                                                                                    i4 = i10;
                                                                                                    arrayList45 = arrayList57;
                                                                                                    String str91 = str49;
                                                                                                    str30 = str63;
                                                                                                    long j43 = n6;
                                                                                                    str55 = str27;
                                                                                                    f2 = f5;
                                                                                                    str31 = str90;
                                                                                                    arrayList19 = arrayList40;
                                                                                                    long j44 = j33;
                                                                                                    str32 = str83;
                                                                                                    i = 0;
                                                                                                    long j45 = j36;
                                                                                                    long j46 = j27;
                                                                                                    str15 = attributeValue9;
                                                                                                    arrayList12 = arrayList56;
                                                                                                    arrayList13 = arrayList32;
                                                                                                    if (g0g.R(str91, xmlPullParser4)) {
                                                                                                        long i13 = f97.i(xmlPullParser4, j37);
                                                                                                        if (i13 != -9223372036854775807L) {
                                                                                                            Log.i(str29, String.format("segmentBaseAvailabilityTimeOffsetUs = %d", Long.valueOf(i13)));
                                                                                                            f0cVar.u = Math.min(f0cVar.u, i13);
                                                                                                        }
                                                                                                        str33 = str91;
                                                                                                        str34 = str86;
                                                                                                        str35 = str50;
                                                                                                        arrayList20 = arrayList37;
                                                                                                        arrayList21 = arrayList38;
                                                                                                        z4 = true;
                                                                                                        ebpVar3 = f0cVar.z(xmlPullParser4, (bbp) ebpVar3, arrayList45, j46, j43, j45, i13, j44);
                                                                                                        xmlPullParser3 = xmlPullParser4;
                                                                                                        j11 = j46;
                                                                                                        j10 = j43;
                                                                                                        j15 = j44;
                                                                                                        str36 = str68;
                                                                                                        str38 = str66;
                                                                                                        str37 = str69;
                                                                                                        str39 = str67;
                                                                                                        z5 = z11;
                                                                                                        str40 = str82;
                                                                                                        arrayList22 = arrayList51;
                                                                                                        arrayList23 = arrayList52;
                                                                                                        arrayList25 = arrayList54;
                                                                                                        j16 = j45;
                                                                                                        str41 = str84;
                                                                                                        i5 = i11;
                                                                                                        j17 = i13;
                                                                                                        arrayList24 = arrayList53;
                                                                                                        if (g0g.Q(str39, xmlPullParser3)) {
                                                                                                        }
                                                                                                    } else {
                                                                                                        j10 = j43;
                                                                                                        xmlPullParser3 = xmlPullParser4;
                                                                                                        str33 = str91;
                                                                                                        j15 = j44;
                                                                                                        str34 = str86;
                                                                                                        str35 = str50;
                                                                                                        arrayList20 = arrayList37;
                                                                                                        arrayList21 = arrayList38;
                                                                                                        z4 = true;
                                                                                                        j11 = j46;
                                                                                                        if (g0g.R(str32, xmlPullParser3)) {
                                                                                                            Pair k2 = f97.k(xmlPullParser3);
                                                                                                            Object obj3 = k2.first;
                                                                                                            if (obj3 != null) {
                                                                                                                str84 = (String) obj3;
                                                                                                            }
                                                                                                            Object obj4 = k2.second;
                                                                                                            if (obj4 != null) {
                                                                                                                arrayList22 = arrayList51;
                                                                                                                arrayList22.add((oqa) obj4);
                                                                                                            } else {
                                                                                                                arrayList22 = arrayList51;
                                                                                                            }
                                                                                                            str36 = str68;
                                                                                                            str38 = str66;
                                                                                                            str37 = str69;
                                                                                                            z5 = z11;
                                                                                                            arrayList23 = arrayList52;
                                                                                                            arrayList24 = arrayList53;
                                                                                                            arrayList25 = arrayList54;
                                                                                                            j16 = j45;
                                                                                                        } else {
                                                                                                            str36 = str68;
                                                                                                            arrayList22 = arrayList51;
                                                                                                            if (g0g.R(str36, xmlPullParser3)) {
                                                                                                                arrayList23 = arrayList52;
                                                                                                                arrayList23.add(f97.m(str36, xmlPullParser3));
                                                                                                                str38 = str66;
                                                                                                                str37 = str69;
                                                                                                                arrayList24 = arrayList53;
                                                                                                            } else {
                                                                                                                str37 = str69;
                                                                                                                arrayList23 = arrayList52;
                                                                                                                if (g0g.R(str37, xmlPullParser3)) {
                                                                                                                    arrayList24 = arrayList53;
                                                                                                                    arrayList24.add(f97.m(str37, xmlPullParser3));
                                                                                                                    str38 = str66;
                                                                                                                } else {
                                                                                                                    str38 = str66;
                                                                                                                    arrayList24 = arrayList53;
                                                                                                                    if (g0g.R(str38, xmlPullParser3)) {
                                                                                                                        arrayList25 = arrayList54;
                                                                                                                        arrayList25.add(f97.m(str38, xmlPullParser3));
                                                                                                                    } else {
                                                                                                                        arrayList25 = arrayList54;
                                                                                                                        f97.g(xmlPullParser3);
                                                                                                                    }
                                                                                                                    j16 = j45;
                                                                                                                    z5 = z11;
                                                                                                                }
                                                                                                            }
                                                                                                            arrayList25 = arrayList54;
                                                                                                            j16 = j45;
                                                                                                            z5 = z11;
                                                                                                        }
                                                                                                        i5 = i11;
                                                                                                        j18 = j37;
                                                                                                        str39 = str67;
                                                                                                        str40 = str82;
                                                                                                        str41 = str84;
                                                                                                        j17 = j18;
                                                                                                        if (g0g.Q(str39, xmlPullParser3)) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str33 = str49;
                                                                                    xmlPullParser3 = xmlPullParser4;
                                                                                    z3 = z;
                                                                                    j14 = j35;
                                                                                    str28 = str74;
                                                                                    str36 = str68;
                                                                                    arrayList9 = arrayList29;
                                                                                    arrayList10 = arrayList30;
                                                                                    arrayList4 = arrayList33;
                                                                                    str35 = str50;
                                                                                    arrayList5 = arrayList34;
                                                                                    j15 = j33;
                                                                                    str34 = str52;
                                                                                    arrayList20 = arrayList37;
                                                                                    arrayList21 = arrayList38;
                                                                                    str9 = str25;
                                                                                    arrayList18 = arrayList43;
                                                                                    i4 = i10;
                                                                                    z5 = z11;
                                                                                    arrayList22 = arrayList51;
                                                                                    arrayList24 = arrayList53;
                                                                                    arrayList45 = arrayList57;
                                                                                    i5 = i11;
                                                                                    z4 = true;
                                                                                    i = 0;
                                                                                    arrayList16 = arrayList55;
                                                                                    str30 = str63;
                                                                                    j11 = j27;
                                                                                    str15 = attributeValue9;
                                                                                    str55 = str27;
                                                                                    f2 = f5;
                                                                                    arrayList12 = arrayList56;
                                                                                    str32 = str83;
                                                                                    arrayList13 = arrayList32;
                                                                                    j10 = n6;
                                                                                    str31 = str51;
                                                                                    str38 = str66;
                                                                                    arrayList19 = arrayList40;
                                                                                    arrayList17 = arrayList50;
                                                                                    str29 = str;
                                                                                    arrayList25 = arrayList54;
                                                                                    long j382 = j36;
                                                                                    str37 = str69;
                                                                                    j16 = j382;
                                                                                    arrayList23 = arrayList52;
                                                                                    j18 = j37;
                                                                                    str39 = str67;
                                                                                    str40 = str82;
                                                                                    str41 = str84;
                                                                                    j17 = j18;
                                                                                    if (g0g.Q(str39, xmlPullParser3)) {
                                                                                    }
                                                                                }
                                                                                ArrayList arrayList59 = arrayList22;
                                                                                ArrayList arrayList60 = arrayList23;
                                                                                ArrayList arrayList61 = arrayList25;
                                                                                str2 = str29;
                                                                                str8 = str31;
                                                                                ArrayList arrayList62 = arrayList19;
                                                                                str14 = str65;
                                                                                str53 = str40;
                                                                                ArrayList arrayList63 = arrayList24;
                                                                                dsc b = b(attributeValue16, attributeValue18, parseInt2, parseInt3, q2, i5, parseInt7, parseInt, str5, arrayList62, arrayList8, str28, attributeValue20, attributeValue21, arrayList63, arrayList61);
                                                                                arrayList11 = arrayList62;
                                                                                if (ebpVar3 == null) {
                                                                                    ebpVar3 = new dbp();
                                                                                }
                                                                                e97 e97Var = new e97(b, !arrayList16.isEmpty() ? arrayList16 : arrayList17, ebpVar3, str41, arrayList59, arrayList60, arrayList63, arrayList61);
                                                                                int i14 = l5i.i(b.n);
                                                                                int i15 = i4;
                                                                                if (i15 != -1) {
                                                                                    if (i14 != -1) {
                                                                                        vq1.A(i15 == i14 ? z4 : i);
                                                                                    }
                                                                                    i14 = i15;
                                                                                }
                                                                                ArrayList arrayList64 = arrayList18;
                                                                                arrayList64.add(e97Var);
                                                                                xmlPullParser2 = xmlPullParser3;
                                                                                arrayList43 = arrayList64;
                                                                                i3 = i14;
                                                                                j13 = j15;
                                                                                str19 = str62;
                                                                                j35 = j14;
                                                                                arrayList15 = arrayList20;
                                                                                arrayList14 = arrayList21;
                                                                                str20 = str35;
                                                                                str17 = str33;
                                                                                str16 = str34;
                                                                            } else {
                                                                                String str92 = str49;
                                                                                XmlPullParser xmlPullParser5 = xmlPullParser4;
                                                                                z3 = z;
                                                                                str3 = str48;
                                                                                str6 = attributeValue7;
                                                                                j9 = j35;
                                                                                arrayList8 = arrayList39;
                                                                                j10 = n6;
                                                                                str2 = str;
                                                                                arrayList9 = arrayList29;
                                                                                arrayList10 = arrayList30;
                                                                                arrayList4 = arrayList33;
                                                                                str7 = str50;
                                                                                arrayList5 = arrayList34;
                                                                                long j47 = j33;
                                                                                str8 = str51;
                                                                                String str93 = str52;
                                                                                ArrayList arrayList65 = arrayList37;
                                                                                ArrayList arrayList66 = arrayList38;
                                                                                str9 = str56;
                                                                                str10 = str57;
                                                                                str11 = str58;
                                                                                ArrayList arrayList67 = arrayList43;
                                                                                str12 = str60;
                                                                                str13 = str59;
                                                                                str14 = str65;
                                                                                z4 = true;
                                                                                i = 0;
                                                                                arrayList45 = arrayList49;
                                                                                arrayList11 = arrayList40;
                                                                                j11 = j27;
                                                                                str15 = attributeValue9;
                                                                                arrayList12 = arrayList48;
                                                                                arrayList13 = arrayList32;
                                                                                if (g0g.R(str93, xmlPullParser5)) {
                                                                                    ebpVar2 = f97.x(xmlPullParser5, (dbp) ebpVar2);
                                                                                    arrayList43 = arrayList67;
                                                                                    i3 = i10;
                                                                                    j13 = j47;
                                                                                    str19 = str62;
                                                                                    j35 = j9;
                                                                                    arrayList14 = arrayList66;
                                                                                    str20 = str7;
                                                                                    str17 = str92;
                                                                                    str18 = str14;
                                                                                    c = 2;
                                                                                    str16 = str93;
                                                                                    xmlPullParser2 = xmlPullParser5;
                                                                                    arrayList15 = arrayList65;
                                                                                } else if (g0g.R(str8, xmlPullParser5)) {
                                                                                    long i16 = f97.i(xmlPullParser5, j34);
                                                                                    arrayList43 = arrayList67;
                                                                                    str16 = str93;
                                                                                    ebpVar2 = y(xmlPullParser5, (abp) ebpVar2, j11, j10, j9, i16, j47);
                                                                                    j11 = j11;
                                                                                    j10 = j10;
                                                                                    j34 = i16;
                                                                                    i3 = i10;
                                                                                    str19 = str62;
                                                                                    arrayList15 = arrayList65;
                                                                                    arrayList14 = arrayList66;
                                                                                    str20 = str7;
                                                                                    str17 = str92;
                                                                                    c = 2;
                                                                                    xmlPullParser2 = xmlPullParser5;
                                                                                    j13 = j47;
                                                                                    j35 = j9;
                                                                                    str18 = str14;
                                                                                } else {
                                                                                    arrayList43 = arrayList67;
                                                                                    i2 = i10;
                                                                                    j12 = j34;
                                                                                    str16 = str93;
                                                                                    if (g0g.R(str92, xmlPullParser5)) {
                                                                                        long i17 = f97.i(xmlPullParser5, j12);
                                                                                        str17 = str92;
                                                                                        j13 = j47;
                                                                                        ebpVar2 = z(xmlPullParser5, (bbp) ebpVar2, arrayList45, j11, j10, j9, i17, j13);
                                                                                        j11 = j11;
                                                                                        j10 = j10;
                                                                                        xmlPullParser2 = xmlPullParser5;
                                                                                        j34 = i17;
                                                                                        i3 = i2;
                                                                                        str19 = str62;
                                                                                        j35 = j9;
                                                                                        arrayList15 = arrayList65;
                                                                                        arrayList14 = arrayList66;
                                                                                        str20 = str7;
                                                                                    } else {
                                                                                        str17 = str92;
                                                                                        j11 = j11;
                                                                                        j10 = j10;
                                                                                        xmlPullParser2 = xmlPullParser5;
                                                                                        j13 = j47;
                                                                                        if (g0g.R("InbandEventStream", xmlPullParser2)) {
                                                                                            arrayList14 = arrayList66;
                                                                                            arrayList14.add(f97.m("InbandEventStream", xmlPullParser2));
                                                                                            arrayList15 = arrayList65;
                                                                                            str18 = str14;
                                                                                        } else {
                                                                                            arrayList14 = arrayList66;
                                                                                            if (g0g.R("Label", xmlPullParser2)) {
                                                                                                str18 = str14;
                                                                                                arrayList15 = arrayList65;
                                                                                                arrayList15.add(new rif(xmlPullParser2.getAttributeValue(null, str18), f97.C("Label", xmlPullParser2)));
                                                                                            } else {
                                                                                                arrayList15 = arrayList65;
                                                                                                str18 = str14;
                                                                                                c = 2;
                                                                                                if (xmlPullParser2.getEventType() == 2) {
                                                                                                    f97.g(xmlPullParser2);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        c = 2;
                                                                                    }
                                                                                }
                                                                                if (!g0g.Q(str20, xmlPullParser2)) {
                                                                                }
                                                                            }
                                                                            str18 = str14;
                                                                            c = 2;
                                                                            if (!g0g.Q(str20, xmlPullParser2)) {
                                                                            }
                                                                        }
                                                                    }
                                                                    j34 = j12;
                                                                    i3 = i2;
                                                                    str19 = str62;
                                                                    j35 = j9;
                                                                    str20 = str7;
                                                                    if (!g0g.Q(str20, xmlPullParser2)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z3 = z;
                                                        str3 = str48;
                                                        str6 = attributeValue7;
                                                        j9 = j35;
                                                        arrayList8 = arrayList39;
                                                        j10 = n6;
                                                        str2 = str;
                                                        arrayList9 = arrayList29;
                                                        arrayList10 = arrayList30;
                                                        arrayList4 = arrayList33;
                                                        str7 = str50;
                                                        arrayList5 = arrayList34;
                                                        str8 = str51;
                                                        arrayList15 = arrayList37;
                                                        arrayList14 = arrayList38;
                                                        str9 = str56;
                                                        str10 = str57;
                                                        str11 = str58;
                                                        str12 = str60;
                                                        str13 = str59;
                                                        c = 2;
                                                        z4 = true;
                                                        xmlPullParser2 = xmlPullParser4;
                                                        i2 = i8;
                                                        arrayList11 = arrayList40;
                                                        str18 = str54;
                                                        j11 = j27;
                                                        str15 = attributeValue9;
                                                        j13 = j33;
                                                        str16 = str52;
                                                        arrayList12 = arrayList46;
                                                        i = 0;
                                                        arrayList7 = arrayList36;
                                                        arrayList13 = arrayList32;
                                                        j12 = j34;
                                                        j34 = j12;
                                                        i3 = i2;
                                                        str19 = str62;
                                                        j35 = j9;
                                                        str20 = str7;
                                                        if (!g0g.Q(str20, xmlPullParser2)) {
                                                        }
                                                    }
                                                }
                                                str6 = attributeValue7;
                                            }
                                            arrayList8 = arrayList39;
                                            j10 = n6;
                                            str2 = str;
                                            arrayList9 = arrayList29;
                                            arrayList10 = arrayList30;
                                            arrayList4 = arrayList33;
                                            str20 = str50;
                                            arrayList5 = arrayList34;
                                            str8 = str51;
                                            str19 = str62;
                                            arrayList15 = arrayList37;
                                            arrayList14 = arrayList38;
                                            str9 = str56;
                                            str10 = str57;
                                            str11 = str58;
                                            str12 = str60;
                                            str13 = str59;
                                            c = 2;
                                            z4 = true;
                                            xmlPullParser2 = xmlPullParser4;
                                            i3 = i8;
                                            arrayList11 = arrayList40;
                                            str18 = str54;
                                            j11 = j27;
                                            str15 = attributeValue9;
                                            j13 = j33;
                                            str16 = str52;
                                            arrayList12 = arrayList46;
                                            i = 0;
                                            arrayList7 = arrayList36;
                                            arrayList13 = arrayList32;
                                            if (!g0g.Q(str20, xmlPullParser2)) {
                                            }
                                        }
                                        ArrayList arrayList68 = new ArrayList(arrayList43.size());
                                        int i18 = i;
                                        while (i18 < arrayList43.size()) {
                                            ArrayList arrayList69 = arrayList15;
                                            String str94 = attributeValue14;
                                            arrayList68.add(d((e97) arrayList43.get(i18), str94, arrayList69, str19, arrayList7, arrayList14));
                                            i18++;
                                            attributeValue14 = str94;
                                            arrayList15 = arrayList69;
                                        }
                                        ArrayList arrayList70 = arrayList9;
                                        arrayList70.add(new nj(parseLong, i3, arrayList68, arrayList8, arrayList12, arrayList45));
                                        f0cVar = this;
                                        arrayList29 = arrayList70;
                                        xmlPullParser4 = xmlPullParser2;
                                        n3 = j13;
                                        j7 = j11;
                                        j8 = j10;
                                        arrayList30 = arrayList10;
                                        j6 = -9223372036854775807L;
                                    } else {
                                        str3 = str46;
                                        z3 = z;
                                        arrayList2 = arrayList27;
                                        j4 = j25;
                                        str4 = str42;
                                        arrayList4 = arrayList28;
                                        arrayList5 = arrayList31;
                                        long j48 = n6;
                                        long j49 = j27;
                                        str2 = str;
                                        ArrayList arrayList71 = arrayList29;
                                        ArrayList arrayList72 = arrayList30;
                                        z4 = true;
                                        XmlPullParser xmlPullParser6 = xmlPullParser4;
                                        long j50 = n3;
                                        if (g0g.R("EventStream", xmlPullParser6)) {
                                            arrayList72.add(f97.p(xmlPullParser6));
                                            arrayList30 = arrayList72;
                                            arrayList29 = arrayList71;
                                            xmlPullParser4 = xmlPullParser6;
                                            n3 = j50;
                                            j7 = j49;
                                            j8 = j48;
                                            j6 = -9223372036854775807L;
                                            f0cVar = this;
                                        } else if (g0g.R("SegmentBase", xmlPullParser6)) {
                                            ebpVar = f97.x(xmlPullParser6, null);
                                            arrayList30 = arrayList72;
                                            arrayList29 = arrayList71;
                                            xmlPullParser4 = xmlPullParser6;
                                            n3 = j50;
                                            str45 = str47;
                                            j31 = j32;
                                            j7 = j49;
                                            j8 = j48;
                                            j6 = -9223372036854775807L;
                                            f0cVar = this;
                                        } else if (g0g.R("SegmentList", xmlPullParser6)) {
                                            long i19 = f97.i(xmlPullParser6, -9223372036854775807L);
                                            j6 = -9223372036854775807L;
                                            arrayList30 = arrayList72;
                                            arrayList29 = arrayList71;
                                            xmlPullParser4 = xmlPullParser6;
                                            n3 = j50;
                                            j7 = j49;
                                            f0cVar = this;
                                            j8 = j48;
                                            ebpVar = f0cVar.y(xmlPullParser4, null, j7, j48, j32, i19, n3);
                                            j29 = i19;
                                        } else {
                                            arrayList30 = arrayList72;
                                            arrayList29 = arrayList71;
                                            xmlPullParser4 = xmlPullParser6;
                                            n3 = j50;
                                            j7 = j49;
                                            j8 = j48;
                                            if (g0g.R("SegmentTemplate", xmlPullParser4)) {
                                                long i20 = f97.i(xmlPullParser4, -9223372036854775807L);
                                                ude udeVar = yde.b;
                                                j6 = -9223372036854775807L;
                                                f0cVar = this;
                                                ebp z12 = f0cVar.z(xmlPullParser4, null, qsn.e, j7, j8, j32, i20, n3);
                                                j7 = j7;
                                                n3 = n3;
                                                ebpVar = z12;
                                                j29 = i20;
                                            } else {
                                                f0cVar = this;
                                                j6 = -9223372036854775807L;
                                                if (g0g.R("AssetIdentifier", xmlPullParser4)) {
                                                    f97.m("AssetIdentifier", xmlPullParser4);
                                                } else {
                                                    f97.g(xmlPullParser4);
                                                }
                                            }
                                        }
                                    }
                                    str45 = str47;
                                    j31 = j32;
                                }
                                if (g0g.Q(str45, xmlPullParser4)) {
                                    break;
                                }
                                j27 = j7;
                                n6 = j8;
                                z = z3;
                                arrayList28 = arrayList4;
                                arrayList31 = arrayList5;
                                arrayList27 = arrayList2;
                                j25 = j4;
                                str42 = str4;
                                str46 = str3;
                                str = str2;
                            }
                            Pair create = Pair.create(new pkk(attributeValue4, n5, arrayList29, arrayList30), Long.valueOf(j8));
                            pkk pkkVar = (pkk) create.first;
                            if (pkkVar.b != j6) {
                                long longValue = ((Long) create.second).longValue();
                                long j51 = longValue == j6 ? j6 : pkkVar.b + longValue;
                                arrayList3 = arrayList26;
                                arrayList3.add(pkkVar);
                                j24 = j51;
                            } else {
                                if (!z2) {
                                    throw r7k.c("Unable to determine start of period " + arrayList26.size());
                                }
                                z8 = z4;
                                arrayList3 = arrayList26;
                                j24 = j30;
                            }
                            uri2 = uri4;
                            j25 = j4;
                            if (g0g.Q("MPD", xmlPullParser4)) {
                                if (j == j6) {
                                    if (j24 != j6) {
                                        j19 = b0;
                                        j20 = j24;
                                        if (!arrayList3.isEmpty()) {
                                            throw r7k.c("No periods found.");
                                        }
                                        if (f0cVar.F()) {
                                            y3e y3eVar2 = f0cVar.o;
                                            if (y3eVar2 == null) {
                                                y3eVar = null;
                                            } else if (Build.VERSION.SDK_INT >= 26) {
                                                long epochMilli = Instant.parse(y3eVar2.c).toEpochMilli();
                                                long j52 = f0cVar.p;
                                                if (j52 != j6) {
                                                    epochMilli = (j52 - epochMilli) + j52;
                                                }
                                                y3eVar = new y3e(f0cVar.o.b, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneOffset.UTC).format(Instant.ofEpochMilli(((f0cVar.s - f0cVar.r) * f0cVar.q) + epochMilli)), 3);
                                            } else {
                                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                                                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                                                try {
                                                    Date parse = simpleDateFormat.parse(f0cVar.o.c);
                                                    if (parse != null) {
                                                        long time = parse.getTime();
                                                        long j53 = f0cVar.p;
                                                        if (j53 != j6) {
                                                            time = (j53 - time) + j53;
                                                        }
                                                        y3eVar = new y3e(f0cVar.o.b, simpleDateFormat.format(new Date(((f0cVar.s - f0cVar.r) * f0cVar.q) + time)), 3);
                                                    } else {
                                                        y3eVar = f0cVar.o;
                                                    }
                                                } catch (ParseException e) {
                                                    Log.e(str2, "Error parsing utcTiming", e);
                                                    y3eVar = f0cVar.o;
                                                }
                                            }
                                            f0cVar.o = y3eVar;
                                        }
                                        y3e y3eVar3 = f0cVar.o;
                                        UUID uuid = un3.a;
                                        int i21 = dvt.a;
                                        return new z8w(j19, j20, j2, z2, j3, n3, n4, b02, mumVar, y3eVar3, dnhVar, uri2, arrayList3, f0cVar.v);
                                    }
                                    if (!z2) {
                                        throw r7k.c("Unable to determine duration of static manifest.");
                                    }
                                }
                                j19 = b0;
                                j20 = j;
                                if (!arrayList3.isEmpty()) {
                                }
                            } else {
                                arrayList26 = arrayList3;
                                z = z3;
                                uri4 = uri2;
                                z6 = arrayList;
                                j23 = j6;
                                arrayList27 = arrayList2;
                            }
                        }
                    }
                    uri2 = uri4;
                    j24 = j5;
                    j25 = j4;
                    if (g0g.Q("MPD", xmlPullParser4)) {
                    }
                }
                z3 = z;
                arrayList2 = arrayList27;
                j6 = j23;
                arrayList3 = arrayList26;
                uri2 = uri4;
            }
            str2 = str;
            if (g0g.Q("MPD", xmlPullParser4)) {
            }
        }
    }

    @Override // defpackage.f97
    public final bbp z(XmlPullParser xmlPullParser, bbp bbpVar, List list, long j, long j2, long j3, long j4, long j5) {
        XmlPullParser xmlPullParser2;
        long j6;
        f0c f0cVar = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        if (bbpVar != null) {
            return super.z(xmlPullParser, bbpVar, list, j, j2, j3, j4, j5);
        }
        String attributeValue = xmlPullParser3.getAttributeValue(null, "timescale");
        long parseLong = attributeValue == null ? 1L : Long.parseLong(attributeValue);
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "presentationTimeOffset");
        long parseLong2 = attributeValue2 == null ? 0L : Long.parseLong(attributeValue2);
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "duration");
        long parseLong3 = attributeValue3 == null ? -9223372036854775807L : Long.parseLong(attributeValue3);
        String attributeValue4 = xmlPullParser3.getAttributeValue(null, "startNumber");
        long parseLong4 = attributeValue4 != null ? Long.parseLong(attributeValue4) : 1L;
        f0cVar.r = parseLong4;
        long r = f97.r(list);
        long j7 = j4 == -9223372036854775807L ? j3 : j4;
        long j8 = j7 != Long.MAX_VALUE ? j7 : -9223372036854775807L;
        gqt D = f0cVar.D(xmlPullParser3, "media", null);
        gqt D2 = f0cVar.D(xmlPullParser3, "initialization", null);
        whn whnVar = null;
        ArrayList arrayList = null;
        while (true) {
            xmlPullParser3.next();
            if (g0g.R("Initialization", xmlPullParser3)) {
                whnVar = f97.u(xmlPullParser3, "sourceURL", "range");
                xmlPullParser2 = xmlPullParser3;
                j6 = parseLong;
            } else if (g0g.R("SegmentTimeline", xmlPullParser3)) {
                j6 = parseLong;
                arrayList = f0cVar.A(xmlPullParser3, j6, j2);
                xmlPullParser2 = xmlPullParser3;
            } else {
                xmlPullParser2 = xmlPullParser3;
                j6 = parseLong;
                f97.g(xmlPullParser2);
            }
            if (g0g.Q("SegmentTemplate", xmlPullParser2)) {
                return f(whnVar, j6, parseLong2, parseLong4, r, parseLong3, arrayList, j8, D2, D, j5, j);
            }
            xmlPullParser3 = xmlPullParser2;
            f0cVar = this;
            parseLong3 = parseLong3;
            j8 = j8;
            parseLong4 = parseLong4;
            parseLong2 = parseLong2;
            parseLong = j6;
        }
    }
}
