package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.yandex.pulse.metrics.o;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class qq6 implements rq6, myc, m7t, ycg, zcg {
    public final /* synthetic */ int a;

    public /* synthetic */ qq6(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void d(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.rq6
    public Object a(JsonReader jsonReader) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 0:
                jsonReader.beginObject();
                String str = null;
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    if (nextName.equals("filename")) {
                        str = jsonReader.nextString();
                        if (str == null) {
                            jj4.j("Null filename");
                            return null;
                        }
                    } else if (nextName.equals("contents")) {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            jj4.j("Null contents");
                            return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str != null && bArr != null) {
                    return new xb2(str, bArr);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" filename");
                }
                if (bArr == null) {
                    sb.append(" contents");
                }
                xq0.q(su4.n("Missing required properties:", sb));
                return null;
            case 1:
                tc2 tc2Var = new tc2();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    switch (nextName2.hashCode()) {
                        case -1536268810:
                            if (nextName2.equals("parameterKey")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1027290370:
                            if (nextName2.equals("templateVersion")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 1098747284:
                            if (nextName2.equals("rolloutVariant")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1124454216:
                            if (nextName2.equals("parameterValue")) {
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
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                jj4.j("Null parameterKey");
                                return null;
                            }
                            tc2Var.b = nextString;
                            break;
                        case true:
                            tc2Var.d = jsonReader.nextLong();
                            tc2Var.e = (byte) (tc2Var.e | 1);
                            break;
                        case true:
                            jsonReader.beginObject();
                            String str2 = null;
                            String str3 = null;
                            while (jsonReader.hasNext()) {
                                String nextName3 = jsonReader.nextName();
                                nextName3.getClass();
                                if (nextName3.equals("variantId")) {
                                    str3 = jsonReader.nextString();
                                    if (str3 == null) {
                                        jj4.j("Null variantId");
                                        return null;
                                    }
                                } else if (nextName3.equals("rolloutId")) {
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        jj4.j("Null rolloutId");
                                        return null;
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (str2 != null && str3 != null) {
                                tc2Var.a = new vc2(str2, str3);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                if (str2 == null) {
                                    sb2.append(" rolloutId");
                                }
                                if (str3 == null) {
                                    sb2.append(" variantId");
                                }
                                xq0.q(su4.n("Missing required properties:", sb2));
                                return null;
                            }
                            break;
                        case true:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                jj4.j("Null parameterValue");
                                return null;
                            }
                            tc2Var.c = nextString2;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return tc2Var.a();
            case 2:
                jsonReader.beginObject();
                byte b = 0;
                int i = 0;
                String str4 = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    nextName4.getClass();
                    switch (nextName4.hashCode()) {
                        case -1266514778:
                            if (nextName4.equals("frames")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3373707:
                            if (nextName4.equals("name")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 2125650548:
                            if (nextName4.equals("importance")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                            list = sq6.d(jsonReader, new qq6(4));
                            if (list == null) {
                                jj4.j("Null frames");
                                return null;
                            }
                            continue;
                        case true:
                            str4 = jsonReader.nextString();
                            if (str4 == null) {
                                jj4.j("Null name");
                                return null;
                            }
                            break;
                        case true:
                            i = jsonReader.nextInt();
                            b = (byte) (b | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b == 1 && str4 != null && list != null) {
                    return new lc2(str4, list, i);
                }
                StringBuilder sb3 = new StringBuilder();
                if (str4 == null) {
                    sb3.append(" name");
                }
                if ((b & 1) == 0) {
                    sb3.append(" importance");
                }
                if (list == null) {
                    sb3.append(" frames");
                }
                xq0.q(su4.n("Missing required properties:", sb3));
                return null;
            case 3:
                jsonReader.beginObject();
                byte b2 = 0;
                String str5 = null;
                String str6 = null;
                long j = 0;
                long j2 = 0;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    switch (nextName5.hashCode()) {
                        case 3373707:
                            if (nextName5.equals("name")) {
                                z3 = false;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 3530753:
                            if (nextName5.equals("size")) {
                                z3 = true;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 3601339:
                            if (nextName5.equals("uuid")) {
                                z3 = 2;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1153765347:
                            if (nextName5.equals("baseAddress")) {
                                z3 = 3;
                                break;
                            }
                            z3 = -1;
                            break;
                        default:
                            z3 = -1;
                            break;
                    }
                    switch (z3) {
                        case false:
                            str5 = jsonReader.nextString();
                            if (str5 == null) {
                                jj4.j("Null name");
                                return null;
                            }
                            break;
                        case true:
                            b2 = (byte) (b2 | 2);
                            j2 = jsonReader.nextLong();
                            break;
                        case true:
                            str6 = new String(Base64.decode(jsonReader.nextString(), 2), oq6.a);
                            break;
                        case true:
                            b2 = (byte) (b2 | 1);
                            j = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 3 && str5 != null) {
                    return new ic2(j, j2, str5, str6);
                }
                StringBuilder sb4 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb4.append(" baseAddress");
                }
                if ((b2 & 2) == 0) {
                    sb4.append(" size");
                }
                if (str5 == null) {
                    sb4.append(" name");
                }
                xq0.q(su4.n("Missing required properties:", sb4));
                return null;
            default:
                return sq6.a(jsonReader);
        }
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        switch (this.a) {
            case 10:
                long j = ((uv6) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 13:
                return yde.y(Integer.valueOf(((wk4) obj).a));
            default:
                hc7.b.getClass();
                return sq6.a.n((oq6) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // defpackage.zcg
    public void c(Object obj, xgc xgcVar) {
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        d80 d80Var = (d80) obj;
        switch (this.a) {
            case 17:
                d80Var.getClass();
                break;
            case 18:
                d80Var.getClass();
                break;
            case 19:
                d80Var.getClass();
                break;
            case 20:
                d80Var.getClass();
                break;
            case 21:
                d80Var.getClass();
                break;
            case 22:
                d80Var.getClass();
                break;
            case 23:
                d80Var.getClass();
                break;
            case 24:
                d80Var.getClass();
                break;
            case 25:
                d80Var.getClass();
                break;
            case 26:
                d80Var.getClass();
                break;
            case 27:
            default:
                d80Var.getClass();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                d80Var.getClass();
                break;
        }
    }
}
