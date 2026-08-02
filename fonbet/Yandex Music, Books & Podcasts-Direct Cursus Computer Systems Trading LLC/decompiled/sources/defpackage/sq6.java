package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class sq6 {
    public static final cib a;

    static {
        r4f r4fVar = new r4f();
        f52 f52Var = f52.a;
        r4fVar.a(oq6.class, f52Var);
        r4fVar.a(qb2.class, f52Var);
        l52 l52Var = l52.a;
        r4fVar.a(nq6.class, l52Var);
        r4fVar.a(zb2.class, l52Var);
        i52 i52Var = i52.a;
        r4fVar.a(vp6.class, i52Var);
        r4fVar.a(ac2.class, i52Var);
        j52 j52Var = j52.a;
        r4fVar.a(up6.class, j52Var);
        r4fVar.a(bc2.class, j52Var);
        b62 b62Var = b62.a;
        r4fVar.a(mq6.class, b62Var);
        r4fVar.a(zc2.class, b62Var);
        a62 a62Var = a62.a;
        r4fVar.a(lq6.class, a62Var);
        r4fVar.a(yc2.class, a62Var);
        k52 k52Var = k52.a;
        r4fVar.a(wp6.class, k52Var);
        r4fVar.a(dc2.class, k52Var);
        v52 v52Var = v52.a;
        r4fVar.a(kq6.class, v52Var);
        r4fVar.a(fc2.class, v52Var);
        m52 m52Var = m52.a;
        r4fVar.a(eq6.class, m52Var);
        r4fVar.a(gc2.class, m52Var);
        o52 o52Var = o52.a;
        r4fVar.a(cq6.class, o52Var);
        r4fVar.a(hc2.class, o52Var);
        r52 r52Var = r52.a;
        r4fVar.a(bq6.class, r52Var);
        r4fVar.a(lc2.class, r52Var);
        s52 s52Var = s52.a;
        r4fVar.a(aq6.class, s52Var);
        r4fVar.a(nc2.class, s52Var);
        p52 p52Var = p52.a;
        r4fVar.a(yp6.class, p52Var);
        r4fVar.a(jc2.class, p52Var);
        d52 d52Var = d52.a;
        r4fVar.a(qp6.class, d52Var);
        r4fVar.a(tb2.class, d52Var);
        c52 c52Var = c52.a;
        r4fVar.a(pp6.class, c52Var);
        r4fVar.a(ub2.class, c52Var);
        q52 q52Var = q52.a;
        r4fVar.a(zp6.class, q52Var);
        r4fVar.a(kc2.class, q52Var);
        n52 n52Var = n52.a;
        r4fVar.a(xp6.class, n52Var);
        r4fVar.a(ic2.class, n52Var);
        e52 e52Var = e52.a;
        r4fVar.a(rp6.class, e52Var);
        r4fVar.a(vb2.class, e52Var);
        t52 t52Var = t52.a;
        r4fVar.a(dq6.class, t52Var);
        r4fVar.a(pc2.class, t52Var);
        u52 u52Var = u52.a;
        r4fVar.a(fq6.class, u52Var);
        r4fVar.a(rc2.class, u52Var);
        w52 w52Var = w52.a;
        r4fVar.a(gq6.class, w52Var);
        r4fVar.a(sc2.class, w52Var);
        z52 z52Var = z52.a;
        r4fVar.a(jq6.class, z52Var);
        r4fVar.a(wc2.class, z52Var);
        x52 x52Var = x52.a;
        r4fVar.a(iq6.class, x52Var);
        r4fVar.a(uc2.class, x52Var);
        y52 y52Var = y52.a;
        r4fVar.a(hq6.class, y52Var);
        r4fVar.a(vc2.class, y52Var);
        g52 g52Var = g52.a;
        r4fVar.a(tp6.class, g52Var);
        r4fVar.a(wb2.class, g52Var);
        h52 h52Var = h52.a;
        r4fVar.a(sp6.class, h52Var);
        r4fVar.a(xb2.class, h52Var);
        r4fVar.d = true;
        a = new cib(8, r4fVar);
    }

    public static nc2 a(JsonReader jsonReader) {
        mc2 mc2Var = new mc2();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    mc2Var.d = jsonReader.nextLong();
                    mc2Var.f = (byte) (mc2Var.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        jj4.j("Null symbol");
                        return null;
                    }
                    mc2Var.b = nextString;
                    break;
                case "pc":
                    mc2Var.a = jsonReader.nextLong();
                    mc2Var.f = (byte) (mc2Var.f | 1);
                    break;
                case "file":
                    mc2Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    mc2Var.e = jsonReader.nextInt();
                    mc2Var.f = (byte) (mc2Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return mc2Var.a();
    }

    public static vb2 b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(PListParser.TAG_KEY)) {
                str = jsonReader.nextString();
                if (str == null) {
                    jj4.j("Null key");
                    return null;
                }
            } else if (nextName.equals(Constants.KEY_VALUE)) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    jj4.j("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new vb2(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }

    public static tb2 c(JsonReader jsonReader) {
        sb2 sb2Var = new sb2();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    sb2Var.i = d(jsonReader, new jj4(29));
                    break;
                case "pid":
                    sb2Var.a = jsonReader.nextInt();
                    sb2Var.j = (byte) (sb2Var.j | 1);
                    break;
                case "pss":
                    sb2Var.e = jsonReader.nextLong();
                    sb2Var.j = (byte) (sb2Var.j | 8);
                    break;
                case "rss":
                    sb2Var.f = jsonReader.nextLong();
                    sb2Var.j = (byte) (sb2Var.j | 16);
                    break;
                case "timestamp":
                    sb2Var.g = jsonReader.nextLong();
                    sb2Var.j = (byte) (sb2Var.j | 32);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        jj4.j("Null processName");
                        return null;
                    }
                    sb2Var.b = nextString;
                    break;
                case "reasonCode":
                    sb2Var.c = jsonReader.nextInt();
                    sb2Var.j = (byte) (sb2Var.j | 2);
                    break;
                case "traceFile":
                    sb2Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    sb2Var.d = jsonReader.nextInt();
                    sb2Var.j = (byte) (sb2Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sb2Var.a();
    }

    public static List d(JsonReader jsonReader, rq6 rq6Var) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(rq6Var.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0283, code lost:
    
        if (r5 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0285, code lost:
    
        r0.append(" name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028a, code lost:
    
        if (r6 != null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x028c, code lost:
    
        r0.append(" code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0293, code lost:
    
        if ((r4 & 1) != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0295, code lost:
    
        r0.append(" address");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x029a, code lost:
    
        defpackage.xq0.q(defpackage.su4.n("Missing required properties:", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02c9, code lost:
    
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02ce, code lost:
    
        if (r25 != 0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02d0, code lost:
    
        r0.append(" signal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02d5, code lost:
    
        if (r26 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02d7, code lost:
    
        r0.append(" binaries");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02dc, code lost:
    
        defpackage.xq0.q(defpackage.su4.n("Missing required properties:", r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [fc2] */
    /* JADX WARN: Type inference failed for: r23v1, types: [jc2] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [qp6] */
    /* JADX WARN: Type inference failed for: r24v2, types: [tb2] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v1, types: [kc2] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fc2 e(JsonReader jsonReader) {
        char c;
        char c2;
        int i;
        int i2;
        char c3;
        ec2 ec2Var = new ec2();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i3 = 3;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Object obj = null;
            switch (c) {
                case 0:
                    qc2 qc2Var = new qc2();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
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
                                qc2Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                qc2Var.b = jsonReader.nextInt();
                                qc2Var.g = (byte) (qc2Var.g | 1);
                                break;
                            case 2:
                                qc2Var.d = jsonReader.nextInt();
                                qc2Var.g = (byte) (qc2Var.g | 4);
                                break;
                            case 3:
                                qc2Var.f = jsonReader.nextLong();
                                qc2Var.g = (byte) (qc2Var.g | 16);
                                break;
                            case 4:
                                qc2Var.e = jsonReader.nextLong();
                                qc2Var.g = (byte) (qc2Var.g | 8);
                                break;
                            case 5:
                                qc2Var.c = jsonReader.nextBoolean();
                                qc2Var.g = (byte) (qc2Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    ec2Var.d = qc2Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            list = d(jsonReader, new qq6(1));
                            if (list == null) {
                                jj4.j("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        xq0.q("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    ec2Var.f = new wc2(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    hc2 hc2Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    pc2 pc2Var = null;
                    List list4 = null;
                    byte b = 0;
                    int i4 = 0;
                    while (true) {
                        ?? r19 = obj;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (b == 1 && hc2Var != null) {
                                ec2Var.c = new gc2(hc2Var, list2, list3, bool, pc2Var, list4, i4);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (hc2Var == null) {
                                    sb.append(" execution");
                                }
                                if (b == 0) {
                                    sb.append(" uiOrientation");
                                }
                                xq0.q(su4.n("Missing required properties:", sb));
                                return r19;
                            }
                        } else {
                            String nextName4 = jsonReader.nextName();
                            nextName4.getClass();
                            switch (nextName4.hashCode()) {
                                case -1405314732:
                                    if (nextName4.equals("appProcessDetails")) {
                                        i = 0;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case -1332194002:
                                    if (nextName4.equals(C0479n3.g)) {
                                        i = 1;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case -1090974952:
                                    if (nextName4.equals("execution")) {
                                        i = 2;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case -80231855:
                                    if (nextName4.equals("internalKeys")) {
                                        i = i3;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 555169704:
                                    if (nextName4.equals("customAttributes")) {
                                        i = 4;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 928737948:
                                    if (nextName4.equals("uiOrientation")) {
                                        i = 5;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 1847730860:
                                    if (nextName4.equals("currentProcessDetails")) {
                                        i = 6;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                            switch (i) {
                                case 0:
                                    ArrayList arrayList = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add(g(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list4 = Collections.unmodifiableList(arrayList);
                                    obj = r19;
                                    i3 = 3;
                                case 1:
                                    bool = Boolean.valueOf(jsonReader.nextBoolean());
                                    obj = r19;
                                    i3 = 3;
                                case 2:
                                    jsonReader.beginObject();
                                    List list5 = r19;
                                    List list6 = list5;
                                    ?? r24 = list6;
                                    List list7 = r24;
                                    List list8 = list7;
                                    ?? r23 = list6;
                                    ?? r25 = list7;
                                    while (jsonReader.hasNext()) {
                                        String nextName5 = jsonReader.nextName();
                                        nextName5.getClass();
                                        switch (nextName5.hashCode()) {
                                            case -1375141843:
                                                if (nextName5.equals("appExitInfo")) {
                                                    i2 = 0;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case -1337936983:
                                                if (nextName5.equals("threads")) {
                                                    i2 = 1;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case -902467928:
                                                if (nextName5.equals("signal")) {
                                                    i2 = 2;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case 937615455:
                                                if (nextName5.equals("binaries")) {
                                                    i2 = i3;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case 1481625679:
                                                if (nextName5.equals(Constants.KEY_EXCEPTION)) {
                                                    i2 = 4;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            default:
                                                i2 = -1;
                                                break;
                                        }
                                        switch (i2) {
                                            case 0:
                                                r24 = c(jsonReader);
                                                i3 = 3;
                                                r23 = r23;
                                                r25 = r25;
                                            case 1:
                                                list5 = d(jsonReader, new qq6(2));
                                                i3 = 3;
                                                r23 = r23;
                                                r25 = r25;
                                            case 2:
                                                jsonReader.beginObject();
                                                long j = 0;
                                                String str = r19;
                                                String str2 = str;
                                                byte b2 = 0;
                                                while (jsonReader.hasNext()) {
                                                    String nextName6 = jsonReader.nextName();
                                                    nextName6.getClass();
                                                    switch (nextName6.hashCode()) {
                                                        case -1147692044:
                                                            if (nextName6.equals("address")) {
                                                                c3 = 0;
                                                                break;
                                                            }
                                                            c3 = 65535;
                                                            break;
                                                        case 3059181:
                                                            if (nextName6.equals("code")) {
                                                                c3 = 1;
                                                                break;
                                                            }
                                                            c3 = 65535;
                                                            break;
                                                        case 3373707:
                                                            if (nextName6.equals("name")) {
                                                                c3 = 2;
                                                                break;
                                                            }
                                                            c3 = 65535;
                                                            break;
                                                        default:
                                                            c3 = 65535;
                                                            break;
                                                    }
                                                    switch (c3) {
                                                        case 0:
                                                            j = jsonReader.nextLong();
                                                            b2 = (byte) (b2 | 1);
                                                            break;
                                                        case 1:
                                                            str2 = jsonReader.nextString();
                                                            if (str2 == null) {
                                                                jj4.j("Null code");
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        case 2:
                                                            str = jsonReader.nextString();
                                                            if (str == null) {
                                                                jj4.j("Null name");
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                }
                                                jsonReader.endObject();
                                                if (b2 == 1 && str != null && str2 != null) {
                                                    r25 = new kc2(j, str, str2);
                                                    i3 = 3;
                                                    r23 = r23;
                                                    r25 = r25;
                                                }
                                                break;
                                            case 3:
                                                list8 = d(jsonReader, new qq6(i3));
                                                r23 = r23;
                                                if (list8 == null) {
                                                    jj4.j("Null binaries");
                                                    break;
                                                }
                                                i3 = 3;
                                                r23 = r23;
                                                r25 = r25;
                                            case 4:
                                                r23 = f(jsonReader);
                                                i3 = 3;
                                                r23 = r23;
                                                r25 = r25;
                                            default:
                                                jsonReader.skipValue();
                                                r23 = r23;
                                                i3 = 3;
                                                r23 = r23;
                                                r25 = r25;
                                        }
                                    }
                                    jsonReader.endObject();
                                    if (r25 != 0 && list8 != null) {
                                        hc2Var = new hc2(list5, r23, r24, r25, list8);
                                        obj = r19;
                                        i3 = 3;
                                    }
                                    break;
                                case 3:
                                    ArrayList arrayList2 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList2.add(b(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list3 = Collections.unmodifiableList(arrayList2);
                                    obj = r19;
                                    i3 = 3;
                                case 4:
                                    ArrayList arrayList3 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList3.add(b(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list2 = Collections.unmodifiableList(arrayList3);
                                    obj = r19;
                                    i3 = 3;
                                case 5:
                                    i4 = jsonReader.nextInt();
                                    b = (byte) 1;
                                    obj = r19;
                                    i3 = 3;
                                case 6:
                                    pc2Var = g(jsonReader);
                                    obj = r19;
                                    i3 = 3;
                                default:
                                    jsonReader.skipValue();
                                    obj = r19;
                                    i3 = 3;
                            }
                            return null;
                        }
                    }
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                jj4.j("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        xq0.q("Missing required properties: content");
                        return null;
                    }
                    ec2Var.e = new sc2(str3);
                    break;
                case 4:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        jj4.j("Null type");
                        return null;
                    }
                    ec2Var.b = nextString;
                    break;
                case 5:
                    ec2Var.a = jsonReader.nextLong();
                    ec2Var.g = (byte) (ec2Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return ec2Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004b, code lost:
    
        if (r3.equals("reason") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jc2 f(JsonReader jsonReader) {
        jsonReader.beginObject();
        byte b = 0;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        jc2 jc2Var = null;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new jc2(str, str2, list, jc2Var, i);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" type");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                xq0.q(su4.n("Missing required properties:", sb));
                return null;
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -934964668:
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    list = d(jsonReader, new qq6(4));
                    if (list == null) {
                        jj4.j("Null frames");
                        return null;
                    }
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    if (str == null) {
                        jj4.j("Null type");
                        return null;
                    }
                    break;
                case 3:
                    jc2Var = f(jsonReader);
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static pc2 g(JsonReader jsonReader) {
        oc2 oc2Var = new oc2();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    oc2Var.b = jsonReader.nextInt();
                    oc2Var.e = (byte) (oc2Var.e | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        jj4.j("Null processName");
                        return null;
                    }
                    oc2Var.a = nextString;
                    break;
                case "defaultProcess":
                    oc2Var.d = jsonReader.nextBoolean();
                    oc2Var.e = (byte) (oc2Var.e | 4);
                    break;
                case "importance":
                    oc2Var.c = jsonReader.nextInt();
                    oc2Var.e = (byte) (oc2Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oc2Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static qb2 h(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        char c4;
        Charset charset = oq6.a;
        pb2 pb2Var = new pb2();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new qq6(0));
                            if (list == null) {
                                jj4.j("Null files");
                                return null;
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        xq0.q("Missing required properties: files");
                        return null;
                    }
                    pb2Var.k = new wb2(list, str);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        jj4.j("Null sdkVersion");
                        return null;
                    }
                    pb2Var.a = nextString;
                    break;
                case 2:
                    pb2Var.g = jsonReader.nextString();
                    break;
                case 3:
                    pb2Var.l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        jj4.j("Null buildVersion");
                        return null;
                    }
                    pb2Var.h = nextString2;
                    break;
                case 5:
                    pb2Var.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        jj4.j("Null gmpAppId");
                        return null;
                    }
                    pb2Var.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        jj4.j("Null installationUuid");
                        return null;
                    }
                    pb2Var.d = nextString4;
                    break;
                case '\b':
                    pb2Var.e = jsonReader.nextString();
                    break;
                case '\t':
                    pb2Var.c = jsonReader.nextInt();
                    pb2Var.m = (byte) (pb2Var.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        jj4.j("Null displayVersion");
                        return null;
                    }
                    pb2Var.i = nextString5;
                    break;
                case 11:
                    yb2 yb2Var = new yb2();
                    yb2Var.f = false;
                    yb2Var.m = (byte) (yb2Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
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
                                yb2Var.d = jsonReader.nextLong();
                                yb2Var.m = (byte) (yb2Var.m | 1);
                            case 1:
                                yb2Var.c = jsonReader.nextString();
                            case 2:
                                yb2Var.b = new String(Base64.decode(jsonReader.nextString(), 2), oq6.a);
                            case 3:
                                yb2Var.e = Long.valueOf(jsonReader.nextLong());
                            case 4:
                                cc2 cc2Var = new cc2();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals(CommonUrlParts.MODEL)) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            cc2Var.f = jsonReader.nextBoolean();
                                            cc2Var.j = (byte) (cc2Var.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                jj4.j("Null manufacturer");
                                                break;
                                            } else {
                                                cc2Var.h = nextString6;
                                                break;
                                            }
                                        case 2:
                                            cc2Var.d = jsonReader.nextLong();
                                            cc2Var.j = (byte) (cc2Var.j | 4);
                                            break;
                                        case 3:
                                            cc2Var.a = jsonReader.nextInt();
                                            cc2Var.j = (byte) (cc2Var.j | 1);
                                            break;
                                        case 4:
                                            cc2Var.e = jsonReader.nextLong();
                                            cc2Var.j = (byte) (cc2Var.j | 8);
                                            break;
                                        case 5:
                                            cc2Var.c = jsonReader.nextInt();
                                            cc2Var.j = (byte) (cc2Var.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                jj4.j("Null model");
                                                break;
                                            } else {
                                                cc2Var.b = nextString7;
                                                break;
                                            }
                                        case 7:
                                            cc2Var.g = jsonReader.nextInt();
                                            cc2Var.j = (byte) (cc2Var.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                jj4.j("Null modelClass");
                                                break;
                                            } else {
                                                cc2Var.i = nextString8;
                                                break;
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                yb2Var.j = cc2Var.a();
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                yb2Var.k = Collections.unmodifiableList(arrayList);
                            case 6:
                                xc2 xc2Var = new xc2();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = 2;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z = 3;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        default:
                                            z = -1;
                                            break;
                                    }
                                    switch (z) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                jj4.j("Null buildVersion");
                                                break;
                                            } else {
                                                xc2Var.c = nextString9;
                                                break;
                                            }
                                        case true:
                                            xc2Var.d = jsonReader.nextBoolean();
                                            xc2Var.e = (byte) (xc2Var.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                jj4.j("Null version");
                                                break;
                                            } else {
                                                xc2Var.b = nextString10;
                                                break;
                                            }
                                        case true:
                                            xc2Var.a = jsonReader.nextInt();
                                            xc2Var.e = (byte) (xc2Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                yb2Var.i = xc2Var.a();
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c4 = 5;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                        case 0:
                                            str7 = jsonReader.nextString();
                                            if (str7 == null) {
                                                jj4.j("Null identifier");
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                jj4.j("Null version");
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 4:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str7 == null || str2 == null) {
                                    StringBuilder sb = new StringBuilder();
                                    if (str7 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    xq0.q(su4.n("Missing required properties:", sb));
                                    break;
                                } else {
                                    yb2Var.g = new ac2(str7, str2, str3, str4, str5, str6);
                                }
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            jj4.j("Null identifier");
                                            break;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    xq0.q("Missing required properties: identifier");
                                    break;
                                } else {
                                    yb2Var.h = new zc2(str8);
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    jj4.j("Null generator");
                                    break;
                                } else {
                                    yb2Var.a = nextString11;
                                }
                            case '\n':
                                yb2Var.f = jsonReader.nextBoolean();
                                yb2Var.m = (byte) (yb2Var.m | 2);
                            case 11:
                                yb2Var.l = jsonReader.nextInt();
                                yb2Var.m = (byte) (yb2Var.m | 4);
                            default:
                                jsonReader.skipValue();
                        }
                        return null;
                        break;
                    }
                    jsonReader.endObject();
                    pb2Var.j = yb2Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return pb2Var.a();
    }

    public static qb2 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                qb2 h = h(jsonReader);
                jsonReader.close();
                return h;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
