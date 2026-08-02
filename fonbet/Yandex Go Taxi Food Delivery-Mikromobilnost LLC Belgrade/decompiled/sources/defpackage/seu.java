package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.d;
import com.yandex.div.evaluable.function.e;
import com.yandex.div.evaluable.function.f;
import com.yandex.div.evaluable.function.g;
import com.yandex.div.evaluable.function.h;
import com.yandex.div.evaluable.function.i;
import com.yandex.div.evaluable.function.j;
import com.yandex.div.evaluable.function.l;
import com.yandex.div.evaluable.function.o;
import com.yandex.div.evaluable.function.p;
import com.yandex.div.evaluable.function.q;
import com.yandex.div.evaluable.function.r;
import jason.statham.interpreter.error.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocket;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

/* loaded from: classes.dex */
public final class seu implements zme, nms, ese, m131, e1d, yoh, s16, t77, nhe, ls2, ams {
    public static u02 c;
    public final /* synthetic */ int a;
    public static final seu b = new seu(1);
    public static final seu w = new seu(2);
    public static final seu x = new seu(3);
    public static final seu y = new seu(4);
    public static final seu z = new seu(5);
    public static final seu A = new seu(6);
    public static final seu B = new seu(7);
    public static final /* synthetic */ seu C = new seu(8);
    public static final seu D = new seu(9);
    public static final seu E = new seu(10);
    public static final seu F = new seu(11);
    public static final seu G = new seu(12);
    public static final seu H = new seu(13);
    public static final c851 I = new c851();
    public static final /* synthetic */ seu J = new seu(15);

    public /* synthetic */ seu(int i) {
        this.a = i;
    }

    public static qwg e(pyp0 pyp0Var, Exception exc) {
        String str;
        int i = 0;
        if (pyp0Var instanceof pwg) {
            return new qwg((pwg) pyp0Var, i);
        }
        String p = oyr.p("Здесь должна быть секция класса \"", pyp0Var.getClass().getSimpleName(), "\", но в контроллере произошла ошибка");
        if (exc != null) {
            String c2 = qoi0.a(exc.getClass()).c();
            String message = exc.getMessage();
            if (message == null) {
                message = "no message";
            }
            str = g8e.p(c2, Extension.COLON_SPACE, message);
        } else {
            str = null;
        }
        return new qwg(new pwg(p, str), i);
    }

    public static final u02 f() {
        u02 u02Var;
        u02 u02Var2 = c;
        if (u02Var2 != null) {
            return u02Var2;
        }
        synchronized (b) {
            u02Var = c;
            if (u02Var == null) {
                u02Var = new u02();
                c = u02Var;
            }
        }
        return u02Var;
    }

    @Override // defpackage.yoh
    public boolean a(SSLSocket sSLSocket) {
        return cvu0.x(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.t77
    public byte[] b(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.yoh
    public l5t0 c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                ny61.f(qv10.l(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new kc2(cls2);
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        int size;
        switch (this.a) {
            case 25:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"count\" requires 1 argument but "));
                }
                Object obj = injVar.a[0];
                if (obj instanceof String) {
                    size = ((String) obj).length();
                } else if (obj instanceof List) {
                    size = ((List) obj).size();
                } else {
                    if (!(obj instanceof Map)) {
                        throw oyr.y(obj, "Function \"count\" is not defined for ");
                    }
                    size = ((Map) obj).size();
                }
                return Long.valueOf(size);
            case 26:
                if (injVar.c == 1) {
                    return ihb1.o(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"trimend\" requires 1 argument but "));
            case 27:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"reverse\" requires 1 argument but "));
                }
                Object obj2 = injVar.a[0];
                if (!ym11.g(obj2)) {
                    throw a.a("Function \"reverse\" is not defined for ".concat(rhb1.e(obj2)));
                }
                Collections.reverse((List) obj2);
                return obj2;
            case 28:
                if (injVar.c == 1) {
                    return nrb1.g(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"json\" requires 1 argument but "));
            default:
                if (injVar.c == 2) {
                    Object[] objArr = injVar.a;
                    return bjb1.g(objArr[0], objArr[1]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"max\" requires 2 argument but "));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.nms
    public c h(String str, ArrayList arrayList) {
        qls qlsVar = qls.f;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    l63 l63Var = l63.b;
                    if (!l63Var.h(arrayList).equals(qlsVar)) {
                        ha6 ha6Var = ha6.b;
                        if (!ha6Var.h(arrayList).equals(qlsVar)) {
                            hhc hhcVar = hhc.b;
                            if (!hhcVar.h(arrayList).equals(qlsVar)) {
                                ygj ygjVar = ygj.b;
                                if (!ygjVar.h(arrayList).equals(qlsVar)) {
                                    f7w f7wVar = f7w.b;
                                    if (!f7wVar.h(arrayList).equals(qlsVar)) {
                                        kn60 kn60Var = kn60.b;
                                        if (!kn60Var.h(arrayList).equals(qlsVar)) {
                                            luu0 luu0Var = luu0.b;
                                            if (!luu0Var.h(arrayList).equals(qlsVar)) {
                                                yh21 yh21Var = yh21.b;
                                                if (!yh21Var.h(arrayList).equals(qlsVar)) {
                                                    if (!l63Var.i(arrayList).equals(qlsVar)) {
                                                        if (!ha6Var.i(arrayList).equals(qlsVar)) {
                                                            if (!hhcVar.i(arrayList).equals(qlsVar)) {
                                                                if (!ygjVar.i(arrayList).equals(qlsVar)) {
                                                                    if (!f7wVar.i(arrayList).equals(qlsVar)) {
                                                                        if (!kn60Var.i(arrayList).equals(qlsVar)) {
                                                                            if (!luu0Var.i(arrayList).equals(qlsVar)) {
                                                                                if (!yh21Var.i(arrayList).equals(qlsVar)) {
                                                                                    throw sb2.u(arrayList);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return yh21Var;
                                            }
                                            return luu0Var;
                                        }
                                        return kn60Var;
                                    }
                                    return f7wVar;
                                }
                                return ygjVar;
                            }
                            return hhcVar;
                        }
                        return ha6Var;
                    }
                    return l63Var;
                }
                break;
            case -1300054776:
                if (str.equals("getInteger")) {
                    h53 h53Var = h53.e;
                    if (!h53Var.h(arrayList).equals(qlsVar)) {
                        x7t x7tVar = x7t.d;
                        if (!x7tVar.h(arrayList).equals(qlsVar)) {
                            if (!h53Var.i(arrayList).equals(qlsVar)) {
                                if (!x7tVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return x7tVar;
                    }
                    return h53Var;
                }
                break;
            case -1249348039:
                if (str.equals("getUrl")) {
                    k53 k53Var = k53.e;
                    if (!k53Var.h(arrayList).equals(qlsVar)) {
                        xet xetVar = xet.d;
                        if (!xetVar.h(arrayList).equals(qlsVar)) {
                            if (!k53Var.i(arrayList).equals(qlsVar)) {
                                if (!xetVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return xetVar;
                    }
                    return k53Var;
                }
                break;
            case -75598804:
                if (str.equals("getDict")) {
                    g53 g53Var = g53.e;
                    if (!g53Var.h(arrayList).equals(qlsVar)) {
                        c6t c6tVar = c6t.d;
                        if (!c6tVar.h(arrayList).equals(qlsVar)) {
                            if (!g53Var.i(arrayList).equals(qlsVar)) {
                                if (!c6tVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return c6tVar;
                    }
                    return g53Var;
                }
                break;
            case -75393430:
                if (str.equals("getKeys")) {
                    j8t j8tVar = j8t.d;
                    sb2.O(j8tVar, arrayList);
                    return j8tVar;
                }
                break;
            case 208013248:
                if (str.equals("containsKey")) {
                    jgj jgjVar = jgj.b;
                    sb2.O(jgjVar, arrayList);
                    return jgjVar;
                }
                break;
            case 661651007:
                if (str.equals("getNumber")) {
                    i53 i53Var = i53.e;
                    if (!i53Var.h(arrayList).equals(qlsVar)) {
                        l9t l9tVar = l9t.d;
                        if (!l9tVar.h(arrayList).equals(qlsVar)) {
                            if (!i53Var.i(arrayList).equals(qlsVar)) {
                                if (!l9tVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return l9tVar;
                    }
                    return i53Var;
                }
                break;
            case 804029191:
                if (str.equals("getString")) {
                    j53 j53Var = j53.e;
                    if (!j53Var.h(arrayList).equals(qlsVar)) {
                        jet jetVar = jet.d;
                        if (!jetVar.h(arrayList).equals(qlsVar)) {
                            if (!j53Var.i(arrayList).equals(qlsVar)) {
                                if (!jetVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return jetVar;
                    }
                    return j53Var;
                }
                break;
            case 872202264:
                if (str.equals("getValues")) {
                    vft vftVar = vft.d;
                    sb2.O(vftVar, arrayList);
                    return vftVar;
                }
                break;
            case 1101572082:
                if (str.equals("getBoolean")) {
                    e53 e53Var = e53.e;
                    if (!e53Var.h(arrayList).equals(qlsVar)) {
                        b4t b4tVar = b4t.d;
                        if (!b4tVar.h(arrayList).equals(qlsVar)) {
                            if (!e53Var.i(arrayList).equals(qlsVar)) {
                                if (!b4tVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return b4tVar;
                    }
                    return e53Var;
                }
                break;
            case 1194358440:
                if (str.equals("decimalFormat")) {
                    o oVar = o.e;
                    if (!oVar.h(arrayList).equals(qlsVar)) {
                        p pVar = p.e;
                        if (!pVar.h(arrayList).equals(qlsVar)) {
                            q qVar = q.e;
                            if (!qVar.h(arrayList).equals(qlsVar)) {
                                r rVar = r.e;
                                if (!rVar.h(arrayList).equals(qlsVar)) {
                                    if (!oVar.i(arrayList).equals(qlsVar)) {
                                        if (!pVar.i(arrayList).equals(qlsVar)) {
                                            if (!qVar.i(arrayList).equals(qlsVar)) {
                                                if (!rVar.i(arrayList).equals(qlsVar)) {
                                                    throw sb2.u(arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                                return rVar;
                            }
                            return qVar;
                        }
                        return pVar;
                    }
                    return oVar;
                }
                break;
            case 1948915875:
                if (str.equals("getArray")) {
                    d53 d53Var = d53.e;
                    if (!d53Var.h(arrayList).equals(qlsVar)) {
                        h3t h3tVar = h3t.d;
                        if (!h3tVar.h(arrayList).equals(qlsVar)) {
                            if (!d53Var.i(arrayList).equals(qlsVar)) {
                                if (!h3tVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return h3tVar;
                    }
                    return d53Var;
                }
                break;
            case 1950668205:
                if (str.equals("getColor")) {
                    f53 f53Var = f53.e;
                    if (!f53Var.h(arrayList).equals(qlsVar)) {
                        e5t e5tVar = e5t.d;
                        if (!e5tVar.h(arrayList).equals(qlsVar)) {
                            if (!f53Var.i(arrayList).equals(qlsVar)) {
                                if (!e5tVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return e5tVar;
                    }
                    return f53Var;
                }
                break;
            case 2058039875:
                if (str.equals("isEmpty")) {
                    m53 m53Var = m53.b;
                    if (!m53Var.h(arrayList).equals(qlsVar)) {
                        ngj ngjVar = ngj.b;
                        if (!ngjVar.h(arrayList).equals(qlsVar)) {
                            if (!m53Var.i(arrayList).equals(qlsVar)) {
                                if (!ngjVar.i(arrayList).equals(qlsVar)) {
                                    throw sb2.u(arrayList);
                                }
                            }
                        }
                        return ngjVar;
                    }
                    return m53Var;
                }
                break;
        }
        kbs.n(unr0.l('.', "Unknown method name: ", str), null);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.nms
    public c i(String str, ArrayList arrayList) {
        qls qlsVar = qls.f;
        switch (str.hashCode()) {
            case -2129095909:
                if (str.equals("getArrayInteger")) {
                    m3t m3tVar = m3t.e;
                    sb2.O(m3tVar, arrayList);
                    return m3tVar;
                }
                break;
            case -2096254100:
                if (str.equals("getArrayFromArray")) {
                    k3t k3tVar = k3t.e;
                    sb2.O(k3tVar, arrayList);
                    return k3tVar;
                }
                break;
            case -2015731347:
                if (str.equals("formatDateAsUTCWithLocale")) {
                    j7s j7sVar = j7s.b;
                    sb2.O(j7sVar, arrayList);
                    return j7sVar;
                }
                break;
            case -1930505522:
                if (str.equals("getOptIntegerFromArray")) {
                    aat aatVar = aat.e;
                    sb2.O(aatVar, arrayList);
                    return aatVar;
                }
                break;
            case -1919300188:
                if (str.equals("toNumber")) {
                    e7w e7wVar = e7w.b;
                    if (!jl40.l(e7wVar.h(arrayList), qlsVar)) {
                        kuu0 kuu0Var = kuu0.b;
                        if (!jl40.l(kuu0Var.h(arrayList), qlsVar)) {
                            if (!jl40.l(e7wVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(kuu0Var.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return kuu0Var;
                    }
                    return e7wVar;
                }
                break;
            case -1857218874:
                if (str.equals("getIntervalTotalHours")) {
                    f8t f8tVar = f8t.b;
                    sb2.O(f8tVar, arrayList);
                    return f8tVar;
                }
                break;
            case -1843679562:
                if (str.equals("getIntervalTotalWeeks")) {
                    i8t i8tVar = i8t.b;
                    sb2.O(i8tVar, arrayList);
                    return i8tVar;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    l63 l63Var = l63.b;
                    if (!jl40.l(l63Var.h(arrayList), qlsVar)) {
                        ha6 ha6Var = ha6.b;
                        if (!jl40.l(ha6Var.h(arrayList), qlsVar)) {
                            hhc hhcVar = hhc.b;
                            if (!jl40.l(hhcVar.h(arrayList), qlsVar)) {
                                ygj ygjVar = ygj.b;
                                if (!jl40.l(ygjVar.h(arrayList), qlsVar)) {
                                    f7w f7wVar = f7w.b;
                                    if (!jl40.l(f7wVar.h(arrayList), qlsVar)) {
                                        kn60 kn60Var = kn60.b;
                                        if (!jl40.l(kn60Var.h(arrayList), qlsVar)) {
                                            luu0 luu0Var = luu0.b;
                                            if (!jl40.l(luu0Var.h(arrayList), qlsVar)) {
                                                yh21 yh21Var = yh21.b;
                                                if (!jl40.l(yh21Var.h(arrayList), qlsVar)) {
                                                    if (!jl40.l(l63Var.i(arrayList), qlsVar)) {
                                                        if (!jl40.l(ha6Var.i(arrayList), qlsVar)) {
                                                            if (!jl40.l(hhcVar.i(arrayList), qlsVar)) {
                                                                if (!jl40.l(ygjVar.i(arrayList), qlsVar)) {
                                                                    if (!jl40.l(f7wVar.i(arrayList), qlsVar)) {
                                                                        if (!jl40.l(kn60Var.i(arrayList), qlsVar)) {
                                                                            if (!jl40.l(luu0Var.i(arrayList), qlsVar)) {
                                                                                if (!jl40.l(yh21Var.i(arrayList), qlsVar)) {
                                                                                    throw sb2.s(str, arrayList);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return yh21Var;
                                            }
                                            return luu0Var;
                                        }
                                        return kn60Var;
                                    }
                                    return f7wVar;
                                }
                                return ygjVar;
                            }
                            return hhcVar;
                        }
                        return ha6Var;
                    }
                    return l63Var;
                }
                break;
            case -1730341801:
                if (str.equals("getDictOptInteger")) {
                    o6t o6tVar = o6t.d;
                    sb2.O(o6tVar, arrayList);
                    return o6tVar;
                }
                break;
            case -1603949422:
                if (str.equals("getBooleanFromDict")) {
                    d4t d4tVar = d4t.d;
                    sb2.O(d4tVar, arrayList);
                    return d4tVar;
                }
                break;
            case -1601021533:
                if (str.equals("getDictUrl")) {
                    u6t u6tVar = u6t.d;
                    sb2.O(u6tVar, arrayList);
                    return u6tVar;
                }
                break;
            case -1598503635:
                if (str.equals("toBoolean")) {
                    d7w d7wVar = d7w.b;
                    if (!jl40.l(d7wVar.h(arrayList), qlsVar)) {
                        huu0 huu0Var = huu0.b;
                        if (!jl40.l(huu0Var.h(arrayList), qlsVar)) {
                            if (!jl40.l(d7wVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(huu0Var.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return huu0Var;
                    }
                    return d7wVar;
                }
                break;
            case -1586214751:
                if (str.equals("getOptIntegerFromDict")) {
                    bat batVar = bat.d;
                    sb2.O(batVar, arrayList);
                    return batVar;
                }
                break;
            case -1544450268:
                if (str.equals("getOptBooleanFromArray")) {
                    s9t s9tVar = s9t.e;
                    sb2.O(s9tVar, arrayList);
                    return s9tVar;
                }
                break;
            case -1536224128:
                if (str.equals("getArrayColor")) {
                    j3t j3tVar = j3t.e;
                    sb2.O(j3tVar, arrayList);
                    return j3tVar;
                }
                break;
            case -1506310026:
                if (str.equals("getIntervalTotalSeconds")) {
                    h8t h8tVar = h8t.b;
                    sb2.O(h8tVar, arrayList);
                    return h8tVar;
                }
                break;
            case -1436100668:
                if (str.equals("getIntervalSeconds")) {
                    d8t d8tVar = d8t.b;
                    sb2.O(d8tVar, arrayList);
                    return d8tVar;
                }
                break;
            case -1288010167:
                if (str.equals("getSeconds")) {
                    ndt ndtVar = ndt.b;
                    sb2.O(ndtVar, arrayList);
                    return ndtVar;
                }
                break;
            case -1249364890:
                if (str.equals("getDay")) {
                    y5t y5tVar = y5t.b;
                    sb2.O(y5tVar, arrayList);
                    return y5tVar;
                }
                break;
            case -1233067443:
                if (str.equals("replaceAll")) {
                    ztu0 ztu0Var = ztu0.b;
                    sb2.O(ztu0Var, arrayList);
                    return ztu0Var;
                }
                break;
            case -1223509624:
                if (str.equals("getStringFromArray")) {
                    ket ketVar = ket.e;
                    sb2.O(ketVar, arrayList);
                    return ketVar;
                }
                break;
            case -1192573227:
                if (str.equals("testRegex")) {
                    yhy0 yhy0Var = yhy0.b;
                    sb2.O(yhy0Var, arrayList);
                    return yhy0Var;
                }
                break;
            case -1180629592:
                if (str.equals("toColor")) {
                    iuu0 iuu0Var = iuu0.b;
                    sb2.O(iuu0Var, arrayList);
                    return iuu0Var;
                }
                break;
            case -1168421440:
                if (str.equals("getIntervalTotalDays")) {
                    e8t e8tVar = e8t.b;
                    sb2.O(e8tVar, arrayList);
                    return e8tVar;
                }
                break;
            case -1162978502:
                if (str.equals("maxInteger")) {
                    v6w v6wVar = v6w.b;
                    sb2.O(v6wVar, arrayList);
                    return v6wVar;
                }
                break;
            case -1148047119:
                if (str.equals("parseUnixTimeAsLocal")) {
                    hf90 hf90Var = hf90.b;
                    sb2.O(hf90Var, arrayList);
                    return hf90Var;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    rjz0 rjz0Var = rjz0.b;
                    sb2.O(rjz0Var, arrayList);
                    return rjz0Var;
                }
                break;
            case -1133026611:
                if (str.equals("formatDateAsUTC")) {
                    i7s i7sVar = i7s.b;
                    sb2.O(i7sVar, arrayList);
                    return i7sVar;
                }
                break;
            case -1131397482:
                if (str.equals("getUrlFromArray")) {
                    yet yetVar = yet.e;
                    sb2.O(yetVar, arrayList);
                    return yetVar;
                }
                break;
            case -1077888264:
                if (str.equals("getArrayOptBoolean")) {
                    p3t p3tVar = p3t.e;
                    sb2.O(p3tVar, arrayList);
                    return p3tVar;
                }
                break;
            case -1072121784:
                if (str.equals("parseUnixTime")) {
                    gf90 gf90Var = gf90.b;
                    sb2.O(gf90Var, arrayList);
                    return gf90Var;
                }
                break;
            case -1071222151:
                if (str.equals("getArrayOptNumber")) {
                    t3t t3tVar = t3t.e;
                    sb2.O(t3tVar, arrayList);
                    return t3tVar;
                }
                break;
            case -1013579358:
                if (str.equals("getColorFromArray")) {
                    f5t f5tVar = f5t.e;
                    sb2.O(f5tVar, arrayList);
                    return f5tVar;
                }
                break;
            case -1000110441:
                if (str.equals("getDictColor")) {
                    e6t e6tVar = e6t.d;
                    sb2.O(e6tVar, arrayList);
                    return e6tVar;
                }
                break;
            case -995871928:
                if (str.equals("padEnd")) {
                    l590 l590Var = l590.b;
                    if (!jl40.l(l590Var.h(arrayList), qlsVar)) {
                        m590 m590Var = m590.b;
                        if (!jl40.l(m590Var.h(arrayList), qlsVar)) {
                            if (!jl40.l(l590Var.i(arrayList), qlsVar)) {
                                if (!jl40.l(m590Var.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return m590Var;
                    }
                    return l590Var;
                }
                break;
            case -962804868:
                if (str.equals("getOptArrayFromDict")) {
                    r9t r9tVar = r9t.b;
                    sb2.O(r9tVar, arrayList);
                    return r9tVar;
                }
                break;
            case -928843967:
                if (str.equals("getArrayOptString")) {
                    u3t u3tVar = u3t.e;
                    sb2.O(u3tVar, arrayList);
                    return u3tVar;
                }
                break;
            case -905815078:
                if (str.equals("setDay")) {
                    s2r0 s2r0Var = s2r0.b;
                    sb2.O(s2r0Var, arrayList);
                    return s2r0Var;
                }
                break;
            case -902467307:
                if (str.equals("signum")) {
                    f6m f6mVar = f6m.b;
                    if (!jl40.l(f6mVar.h(arrayList), qlsVar)) {
                        a7w a7wVar = a7w.b;
                        if (!jl40.l(a7wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(f6mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(a7wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return a7wVar;
                    }
                    return f6mVar;
                }
                break;
            case -863899827:
                if (str.equals("getColorFromDict")) {
                    g5t g5tVar = g5t.d;
                    sb2.O(g5tVar, arrayList);
                    return g5tVar;
                }
                break;
            case -823914681:
                if (str.equals("getStoredColorValue")) {
                    fdt fdtVar = fdt.d;
                    if (!jl40.l(fdtVar.h(arrayList), qlsVar)) {
                        gdt gdtVar = gdt.d;
                        if (!jl40.l(gdtVar.h(arrayList), qlsVar)) {
                            vdt vdtVar = vdt.d;
                            if (!jl40.l(vdtVar.h(arrayList), qlsVar)) {
                                xdt xdtVar = xdt.d;
                                if (!jl40.l(xdtVar.h(arrayList), qlsVar)) {
                                    if (!jl40.l(fdtVar.i(arrayList), qlsVar)) {
                                        if (!jl40.l(gdtVar.i(arrayList), qlsVar)) {
                                            if (!jl40.l(vdtVar.i(arrayList), qlsVar)) {
                                                if (!jl40.l(xdtVar.i(arrayList), qlsVar)) {
                                                    throw sb2.s(str, arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                                return xdtVar;
                            }
                            return vdtVar;
                        }
                        return gdtVar;
                    }
                    return fdtVar;
                }
                break;
            case -792903165:
                if (str.equals("getDictFromArray")) {
                    f6t f6tVar = f6t.e;
                    sb2.O(f6tVar, arrayList);
                    return f6tVar;
                }
                break;
            case -775185381:
                if (str.equals("setColorBlue")) {
                    f fVar = f.g;
                    if (!jl40.l(fVar.h(arrayList), qlsVar)) {
                        bhc bhcVar = bhc.g;
                        if (!jl40.l(bhcVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(fVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(bhcVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return bhcVar;
                    }
                    return fVar;
                }
                break;
            case -757068958:
                if (str.equals("getStoredBooleanValue")) {
                    edt edtVar = edt.d;
                    if (!jl40.l(edtVar.h(arrayList), qlsVar)) {
                        tdt tdtVar = tdt.d;
                        if (!jl40.l(tdtVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(edtVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(tdtVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return tdtVar;
                    }
                    return edtVar;
                }
                break;
            case -740156815:
                if (str.equals("getDayOfWeek")) {
                    z5t z5tVar = z5t.b;
                    sb2.O(z5tVar, arrayList);
                    return z5tVar;
                }
                break;
            case -719400499:
                if (str.equals("maxNumber")) {
                    w5m w5mVar = w5m.b;
                    sb2.O(w5mVar, arrayList);
                    return w5mVar;
                }
                break;
            case -718233908:
                if (str.equals("getDictFromDict")) {
                    g6t g6tVar = g6t.d;
                    sb2.O(g6tVar, arrayList);
                    return g6tVar;
                }
                break;
            case -711609332:
                if (str.equals("getStoredIntegerValue")) {
                    idt idtVar = idt.d;
                    if (!jl40.l(idtVar.h(arrayList), qlsVar)) {
                        bet betVar = bet.d;
                        if (!jl40.l(betVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(idtVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(betVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return betVar;
                    }
                    return idtVar;
                }
                break;
            case -694406281:
                if (str.equals("toRadians")) {
                    eph ephVar = eph.b;
                    sb2.O(ephVar, arrayList);
                    return ephVar;
                }
                break;
            case -637295986:
                if (str.equals("getOptStringFromDict")) {
                    fat fatVar = fat.d;
                    sb2.O(fatVar, arrayList);
                    return fatVar;
                }
                break;
            case -625627966:
                if (str.equals("getStoredDictValue")) {
                    hdt hdtVar = hdt.d;
                    if (!jl40.l(hdtVar.h(arrayList), qlsVar)) {
                        zdt zdtVar = zdt.d;
                        if (!jl40.l(zdtVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(hdtVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(zdtVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return zdtVar;
                    }
                    return hdtVar;
                }
                break;
            case -618173803:
                if (str.equals("getDictNumber")) {
                    k6t k6tVar = k6t.d;
                    sb2.O(k6tVar, arrayList);
                    return k6tVar;
                }
                break;
            case -593965816:
                if (str.equals("getDictOptUrl")) {
                    r6t r6tVar = r6t.d;
                    if (!jl40.l(r6tVar.h(arrayList), qlsVar)) {
                        s6t s6tVar = s6t.d;
                        if (!jl40.l(s6tVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(r6tVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(s6tVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return s6tVar;
                    }
                    return r6tVar;
                }
                break;
            case -567445985:
                if (str.equals("contains")) {
                    atu0 atu0Var = atu0.b;
                    sb2.O(atu0Var, arrayList);
                    return atu0Var;
                }
                break;
            case -505987374:
                if (str.equals("copySign")) {
                    o5m o5mVar = o5m.b;
                    if (!jl40.l(o5mVar.h(arrayList), qlsVar)) {
                        r6w r6wVar = r6w.b;
                        if (!jl40.l(r6wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(o5mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(r6wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return r6wVar;
                    }
                    return o5mVar;
                }
                break;
            case -496262374:
                if (str.equals("trimRight")) {
                    gf11 gf11Var = gf11.b;
                    sb2.O(gf11Var, arrayList);
                    return gf11Var;
                }
                break;
            case -475795619:
                if (str.equals("getDictString")) {
                    t6t t6tVar = t6t.d;
                    sb2.O(t6tVar, arrayList);
                    return t6tVar;
                }
                break;
            case -407622546:
                if (str.equals("getDictValues")) {
                    v6t v6tVar = v6t.d;
                    sb2.O(v6tVar, arrayList);
                    return v6tVar;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    wjz0 wjz0Var = wjz0.b;
                    sb2.O(wjz0Var, arrayList);
                    return wjz0Var;
                }
                break;
            case -342730167:
                if (str.equals("getOptNumberFromArray")) {
                    cat catVar = cat.e;
                    sb2.O(catVar, arrayList);
                    return catVar;
                }
                break;
            case -288070202:
                if (str.equals("getOptNumberFromDict")) {
                    dat datVar = dat.d;
                    sb2.O(datVar, arrayList);
                    return datVar;
                }
                break;
            case -256399843:
                if (str.equals("setMinutes")) {
                    m3r0 m3r0Var = m3r0.b;
                    sb2.O(m3r0Var, arrayList);
                    return m3r0Var;
                }
                break;
            case -230929496:
                if (str.equals("getIntegerFromDict")) {
                    z7t z7tVar = z7t.d;
                    sb2.O(z7tVar, arrayList);
                    return z7tVar;
                }
                break;
            case -181255609:
                if (str.equals("addMillis")) {
                    ag0 ag0Var = ag0.b;
                    sb2.O(ag0Var, arrayList);
                    return ag0Var;
                }
                break;
            case -174963751:
                if (str.equals("getUrlFromDict")) {
                    zet zetVar = zet.d;
                    sb2.O(zetVar, arrayList);
                    return zetVar;
                }
                break;
            case -116997076:
                if (str.equals("toDegrees")) {
                    z5i0 z5i0Var = z5i0.b;
                    sb2.O(z5i0Var, arrayList);
                    return z5i0Var;
                }
                break;
            case -92937393:
                if (str.equals("getStoredNumberValue")) {
                    jdt jdtVar = jdt.d;
                    if (!jl40.l(jdtVar.h(arrayList), qlsVar)) {
                        det detVar = det.d;
                        if (!jl40.l(detVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(jdtVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(detVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return detVar;
                    }
                    return jdtVar;
                }
                break;
            case -74977101:
                if (str.equals("getYear")) {
                    jgt jgtVar = jgt.b;
                    sb2.O(jgtVar, arrayList);
                    return jgtVar;
                }
                break;
            case -57828916:
                if (str.equals("getArrayNumber")) {
                    o3t o3tVar = o3t.e;
                    sb2.O(o3tVar, arrayList);
                    return o3tVar;
                }
                break;
            case -33620929:
                if (str.equals("getArrayOptUrl")) {
                    v3t v3tVar = v3t.f;
                    if (!jl40.l(v3tVar.h(arrayList), qlsVar)) {
                        w3t w3tVar = w3t.e;
                        if (!jl40.l(w3tVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(v3tVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(w3tVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return w3tVar;
                    }
                    return v3tVar;
                }
                break;
            case 3577:
                if (str.equals("pi")) {
                    plb0 plb0Var = plb0.b;
                    sb2.O(plb0Var, arrayList);
                    return plb0Var;
                }
                break;
            case 96370:
                if (str.equals("abs")) {
                    a5m a5mVar = a5m.b;
                    if (!jl40.l(a5mVar.h(arrayList), qlsVar)) {
                        p6w p6wVar = p6w.b;
                        if (!jl40.l(p6wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(a5mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(p6wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return p6wVar;
                    }
                    return a5mVar;
                }
                break;
            case 98695:
                if (str.equals("cos")) {
                    awe aweVar = awe.b;
                    sb2.O(aweVar, arrayList);
                    return aweVar;
                }
                break;
            case 98696:
                if (str.equals("cot")) {
                    rye ryeVar = rye.b;
                    sb2.O(ryeVar, arrayList);
                    return ryeVar;
                }
                break;
            case 99473:
                if (str.equals("div")) {
                    p5m p5mVar = p5m.b;
                    if (!jl40.l(p5mVar.h(arrayList), qlsVar)) {
                        s6w s6wVar = s6w.b;
                        if (!jl40.l(s6wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(p5mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(s6wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return s6wVar;
                    }
                    return p5mVar;
                }
                break;
            case 107029:
                if (str.equals("len")) {
                    n3t n3tVar = n3t.b;
                    if (!jl40.l(n3tVar.h(arrayList), qlsVar)) {
                        j6t j6tVar = j6t.b;
                        if (!jl40.l(j6tVar.h(arrayList), qlsVar)) {
                            ntu0 ntu0Var = ntu0.b;
                            if (!jl40.l(ntu0Var.h(arrayList), qlsVar)) {
                                if (!jl40.l(n3tVar.i(arrayList), qlsVar)) {
                                    if (!jl40.l(j6tVar.i(arrayList), qlsVar)) {
                                        if (!jl40.l(ntu0Var.i(arrayList), qlsVar)) {
                                            throw sb2.s(str, arrayList);
                                        }
                                    }
                                }
                            }
                            return ntu0Var;
                        }
                        return j6tVar;
                    }
                    return n3tVar;
                }
                break;
            case 107876:
                if (str.equals(CspBioProgressConstants.MAX)) {
                    v5m v5mVar = v5m.b;
                    if (!jl40.l(v5mVar.h(arrayList), qlsVar)) {
                        u6w u6wVar = u6w.b;
                        if (!jl40.l(u6wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(v5mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(u6wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return u6wVar;
                    }
                    return v5mVar;
                }
                break;
            case 108114:
                if (str.equals("min")) {
                    x5m x5mVar = x5m.b;
                    if (!jl40.l(x5mVar.h(arrayList), qlsVar)) {
                        w6w w6wVar = w6w.b;
                        if (!jl40.l(w6wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(x5mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(w6wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return w6wVar;
                    }
                    return x5mVar;
                }
                break;
            case 108290:
                if (str.equals("mod")) {
                    z5m z5mVar = z5m.b;
                    if (!jl40.l(z5mVar.h(arrayList), qlsVar)) {
                        y6w y6wVar = y6w.b;
                        if (!jl40.l(y6wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(z5mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(y6wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return y6wVar;
                    }
                    return z5mVar;
                }
                break;
            case 108484:
                if (str.equals("mul")) {
                    a6m a6mVar = a6m.b;
                    if (!jl40.l(a6mVar.h(arrayList), qlsVar)) {
                        z6w z6wVar = z6w.b;
                        if (!jl40.l(z6wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(a6mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(z6wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return z6wVar;
                    }
                    return a6mVar;
                }
                break;
            case 112845:
                if (str.equals("rgb")) {
                    zfc zfcVar = zfc.b;
                    sb2.O(zfcVar, arrayList);
                    return zfcVar;
                }
                break;
            case 113880:
                if (str.equals("sin")) {
                    fgs0 fgs0Var = fgs0.b;
                    sb2.O(fgs0Var, arrayList);
                    return fgs0Var;
                }
                break;
            case 114240:
                if (str.equals("sub")) {
                    h6m h6mVar = h6m.b;
                    if (!jl40.l(h6mVar.h(arrayList), qlsVar)) {
                        b7w b7wVar = b7w.b;
                        if (!jl40.l(b7wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(h6mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(b7wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return b7wVar;
                    }
                    return h6mVar;
                }
                break;
            case 114251:
                if (str.equals("sum")) {
                    i6m i6mVar = i6m.b;
                    if (!jl40.l(i6mVar.h(arrayList), qlsVar)) {
                        c7w c7wVar = c7w.b;
                        if (!jl40.l(c7wVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(i6mVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(c7wVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return c7wVar;
                    }
                    return i6mVar;
                }
                break;
            case 114593:
                if (str.equals("tan")) {
                    d8x0 d8x0Var = d8x0.b;
                    sb2.O(d8x0Var, arrayList);
                    return d8x0Var;
                }
                break;
            case 2988422:
                if (str.equals("acos")) {
                    ym ymVar = ym.b;
                    sb2.O(ymVar, arrayList);
                    return ymVar;
                }
                break;
            case 3002572:
                if (str.equals("argb")) {
                    mdc mdcVar = mdc.b;
                    sb2.O(mdcVar, arrayList);
                    return mdcVar;
                }
                break;
            case 3003607:
                if (str.equals("asin")) {
                    z73 z73Var = z73.b;
                    sb2.O(z73Var, arrayList);
                    return z73Var;
                }
                break;
            case 3004320:
                if (str.equals("atan")) {
                    pb3 pb3Var = pb3.b;
                    sb2.O(pb3Var, arrayList);
                    return pb3Var;
                }
                break;
            case 3049733:
                if (str.equals("ceil")) {
                    g5m g5mVar = g5m.b;
                    sb2.O(g5mVar, arrayList);
                    return g5mVar;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    df11 df11Var = df11.b;
                    sb2.O(df11Var, arrayList);
                    return df11Var;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    tet tetVar = tet.b;
                    sb2.O(tetVar, arrayList);
                    return tetVar;
                }
                break;
            case 53078075:
                if (str.equals("minNumber")) {
                    y5m y5mVar = y5m.b;
                    sb2.O(y5mVar, arrayList);
                    return y5mVar;
                }
                break;
            case 81708636:
                if (str.equals("getDictBoolean")) {
                    d6t d6tVar = d6t.d;
                    sb2.O(d6tVar, arrayList);
                    return d6tVar;
                }
                break;
            case 84549268:
                if (str.equals("getArrayString")) {
                    x3t x3tVar = x3t.e;
                    sb2.O(x3tVar, arrayList);
                    return x3tVar;
                }
                break;
            case 88715890:
                if (str.equals("getNumberValue")) {
                    o9t o9tVar = o9t.b;
                    sb2.O(o9tVar, arrayList);
                    return o9tVar;
                }
                break;
            case 93133970:
                if (str.equals("atan2")) {
                    ob3 ob3Var = ob3.b;
                    sb2.O(ob3Var, arrayList);
                    return ob3Var;
                }
                break;
            case 97526796:
                if (str.equals("floor")) {
                    q5m q5mVar = q5m.b;
                    sb2.O(q5mVar, arrayList);
                    return q5mVar;
                }
                break;
            case 100346066:
                if (str.equals("index")) {
                    jtu0 jtu0Var = jtu0.b;
                    sb2.O(jtu0Var, arrayList);
                    return jtu0Var;
                }
                break;
            case 108704142:
                if (str.equals("round")) {
                    b6m b6mVar = b6m.b;
                    sb2.O(b6mVar, arrayList);
                    return b6mVar;
                }
                break;
            case 110520564:
                if (str.equals("toUrl")) {
                    muu0 muu0Var = muu0.b;
                    sb2.O(muu0Var, arrayList);
                    return muu0Var;
                }
                break;
            case 181165108:
                if (str.equals("formatDateAsLocalWithLocale")) {
                    h7s h7sVar = h7s.b;
                    sb2.O(h7sVar, arrayList);
                    return h7sVar;
                }
                break;
            case 215331667:
                if (str.equals("getOptArrayFromArray")) {
                    q9t q9tVar = q9t.e;
                    sb2.O(q9tVar, arrayList);
                    return q9tVar;
                }
                break;
            case 232128784:
                if (str.equals("getDictOptNumber")) {
                    p6t p6tVar = p6t.d;
                    sb2.O(p6tVar, arrayList);
                    return p6tVar;
                }
                break;
            case 272530949:
                if (str.equals("getArrayBoolean")) {
                    i3t i3tVar = i3t.e;
                    sb2.O(i3tVar, arrayList);
                    return i3tVar;
                }
                break;
            case 294836803:
                if (str.equals("toInteger")) {
                    ga6 ga6Var = ga6.b;
                    if (!jl40.l(ga6Var.h(arrayList), qlsVar)) {
                        jn60 jn60Var = jn60.b;
                        if (!jl40.l(jn60Var.h(arrayList), qlsVar)) {
                            juu0 juu0Var = juu0.b;
                            if (!jl40.l(juu0Var.h(arrayList), qlsVar)) {
                                if (!jl40.l(ga6Var.i(arrayList), qlsVar)) {
                                    if (!jl40.l(jn60Var.i(arrayList), qlsVar)) {
                                        if (!jl40.l(juu0Var.i(arrayList), qlsVar)) {
                                            throw sb2.s(str, arrayList);
                                        }
                                    }
                                }
                            }
                            return juu0Var;
                        }
                        return jn60Var;
                    }
                    return ga6Var;
                }
                break;
            case 374506968:
                if (str.equals("getDictOptString")) {
                    q6t q6tVar = q6t.d;
                    sb2.O(q6tVar, arrayList);
                    return q6tVar;
                }
                break;
            case 407302472:
                if (str.equals("setMillis")) {
                    l3r0 l3r0Var = l3r0.b;
                    sb2.O(l3r0Var, arrayList);
                    return l3r0Var;
                }
                break;
            case 412791996:
                if (str.equals("getDictOptColor")) {
                    m6t m6tVar = m6t.d;
                    if (!jl40.l(m6tVar.h(arrayList), qlsVar)) {
                        n6t n6tVar = n6t.d;
                        if (!jl40.l(n6tVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(m6tVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(n6tVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return n6tVar;
                    }
                    return m6tVar;
                }
                break;
            case 515198110:
                if (str.equals("decodeUri")) {
                    btu0 btu0Var = btu0.b;
                    sb2.O(btu0Var, arrayList);
                    return btu0Var;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    guu0 guu0Var = guu0.b;
                    sb2.O(guu0Var, arrayList);
                    return guu0Var;
                }
                break;
            case 579215519:
                if (str.equals("getBooleanValue")) {
                    e4t e4tVar = e4t.b;
                    sb2.O(e4tVar, arrayList);
                    return e4tVar;
                }
                break;
            case 609553469:
                if (str.equals("getOptUrlFromArray")) {
                    gat gatVar = gat.f;
                    if (!jl40.l(gatVar.h(arrayList), qlsVar)) {
                        hat hatVar = hat.e;
                        if (!jl40.l(hatVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(gatVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(hatVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return hatVar;
                    }
                    return gatVar;
                }
                break;
            case 621919548:
                if (str.equals("getMillis")) {
                    i9t i9tVar = i9t.b;
                    sb2.O(i9tVar, arrayList);
                    return i9tVar;
                }
                break;
            case 624675145:
                if (str.equals("getIntegerValue")) {
                    a8t a8tVar = a8t.b;
                    sb2.O(a8tVar, arrayList);
                    return a8tVar;
                }
                break;
            case 648795069:
                if (str.equals("setSeconds")) {
                    x3r0 x3r0Var = x3r0.b;
                    sb2.O(x3r0Var, arrayList);
                    return x3r0Var;
                }
                break;
            case 671285057:
                if (str.equals("getDictOptBoolean")) {
                    l6t l6tVar = l6t.d;
                    sb2.O(l6tVar, arrayList);
                    return l6tVar;
                }
                break;
            case 757893007:
                if (str.equals("padStart")) {
                    n590 n590Var = n590.b;
                    if (!jl40.l(n590Var.h(arrayList), qlsVar)) {
                        o590 o590Var = o590.b;
                        if (!jl40.l(o590Var.h(arrayList), qlsVar)) {
                            if (!jl40.l(n590Var.i(arrayList), qlsVar)) {
                                if (!jl40.l(o590Var.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return o590Var;
                    }
                    return n590Var;
                }
                break;
            case 785010124:
                if (str.equals("getArrayUrl")) {
                    y3t y3tVar = y3t.e;
                    sb2.O(y3tVar, arrayList);
                    return y3tVar;
                }
                break;
            case 815452174:
                if (str.equals("getArrayOptInteger")) {
                    s3t s3tVar = s3t.e;
                    sb2.O(s3tVar, arrayList);
                    return s3tVar;
                }
                break;
            case 833284859:
                if (str.equals("getStoredUrlValue")) {
                    ldt ldtVar = ldt.d;
                    if (!jl40.l(ldtVar.h(arrayList), qlsVar)) {
                        mdt mdtVar = mdt.d;
                        if (!jl40.l(mdtVar.h(arrayList), qlsVar)) {
                            het hetVar = het.d;
                            if (!jl40.l(hetVar.h(arrayList), qlsVar)) {
                                iet ietVar = iet.d;
                                if (!jl40.l(ietVar.h(arrayList), qlsVar)) {
                                    if (!jl40.l(ldtVar.i(arrayList), qlsVar)) {
                                        if (!jl40.l(mdtVar.i(arrayList), qlsVar)) {
                                            if (!jl40.l(hetVar.i(arrayList), qlsVar)) {
                                                if (!jl40.l(ietVar.i(arrayList), qlsVar)) {
                                                    throw sb2.s(str, arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                                return ietVar;
                            }
                            return hetVar;
                        }
                        return mdtVar;
                    }
                    return ldtVar;
                }
                break;
            case 851027282:
                if (str.equals("getOptUrlFromDict")) {
                    iat iatVar = iat.d;
                    if (!jl40.l(iatVar.h(arrayList), qlsVar)) {
                        jat jatVar = jat.d;
                        if (!jl40.l(jatVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(iatVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(jatVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return jatVar;
                    }
                    return iatVar;
                }
                break;
            case 902290499:
                if (str.equals("getArrayFromDict")) {
                    l3t l3tVar = l3t.d;
                    sb2.O(l3tVar, arrayList);
                    return l3tVar;
                }
                break;
            case 963997617:
                if (str.equals("getColorAlpha")) {
                    com.yandex.div.evaluable.function.c cVar = com.yandex.div.evaluable.function.c.g;
                    if (!jl40.l(cVar.h(arrayList), qlsVar)) {
                        ygc ygcVar = ygc.g;
                        if (!jl40.l(ygcVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(cVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(ygcVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return ygcVar;
                    }
                    return cVar;
                }
                break;
            case 968898065:
                if (str.equals("getStoredArrayValue")) {
                    ddt ddtVar = ddt.d;
                    if (!jl40.l(ddtVar.h(arrayList), qlsVar)) {
                        rdt rdtVar = rdt.d;
                        if (!jl40.l(rdtVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(ddtVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(rdtVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return rdtVar;
                    }
                    return ddtVar;
                }
                break;
            case 969706838:
                if (str.equals("getColorGreen")) {
                    g gVar = g.g;
                    if (!jl40.l(gVar.h(arrayList), qlsVar)) {
                        chc chcVar = chc.g;
                        if (!jl40.l(chcVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(gVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(chcVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return chcVar;
                    }
                    return gVar;
                }
                break;
            case 983060420:
                if (str.equals("getColorValue")) {
                    h5t h5tVar = h5t.b;
                    if (!jl40.l(h5tVar.h(arrayList), qlsVar)) {
                        i5t i5tVar = i5t.b;
                        if (!jl40.l(i5tVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(h5tVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(i5tVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return i5tVar;
                    }
                    return h5tVar;
                }
                break;
            case 1012555088:
                if (str.equals("getNumberFromArray")) {
                    m9t m9tVar = m9t.e;
                    sb2.O(m9tVar, arrayList);
                    return m9tVar;
                }
                break;
            case 1022717043:
                if (str.equals("getOptDictFromDict")) {
                    z9t z9tVar = z9t.b;
                    sb2.O(z9tVar, arrayList);
                    return z9tVar;
                }
                break;
            case 1098852024:
                if (str.equals("getUrlValue")) {
                    aft aftVar = aft.b;
                    if (!jl40.l(aftVar.h(arrayList), qlsVar)) {
                        bft bftVar = bft.b;
                        if (!jl40.l(bftVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(aftVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(bftVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return bftVar;
                    }
                    return aftVar;
                }
                break;
            case 1194358440:
                if (str.equals("decimalFormat")) {
                    o oVar = o.e;
                    if (!jl40.l(oVar.h(arrayList), qlsVar)) {
                        p pVar = p.e;
                        if (!jl40.l(pVar.h(arrayList), qlsVar)) {
                            q qVar = q.e;
                            if (!jl40.l(qVar.h(arrayList), qlsVar)) {
                                r rVar = r.e;
                                if (!jl40.l(rVar.h(arrayList), qlsVar)) {
                                    if (!jl40.l(oVar.i(arrayList), qlsVar)) {
                                        if (!jl40.l(pVar.i(arrayList), qlsVar)) {
                                            if (!jl40.l(qVar.i(arrayList), qlsVar)) {
                                                if (!jl40.l(rVar.i(arrayList), qlsVar)) {
                                                    throw sb2.s(str, arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                                return rVar;
                            }
                            return qVar;
                        }
                        return pVar;
                    }
                    return oVar;
                }
                break;
            case 1298006409:
                if (str.equals("getOptColorFromArray")) {
                    u9t u9tVar = u9t.e;
                    if (!jl40.l(u9tVar.h(arrayList), qlsVar)) {
                        v9t v9tVar = v9t.f;
                        if (!jl40.l(v9tVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(u9tVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(v9tVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return v9tVar;
                    }
                    return u9tVar;
                }
                break;
            case 1309020812:
                if (str.equals("minInteger")) {
                    x6w x6wVar = x6w.b;
                    sb2.O(x6wVar, arrayList);
                    return x6wVar;
                }
                break;
            case 1335732619:
                if (str.equals("getOptBooleanFromDict")) {
                    t9t t9tVar = t9t.d;
                    sb2.O(t9tVar, arrayList);
                    return t9tVar;
                }
                break;
            case 1346085543:
                if (str.equals("getStringFromDict")) {
                    let letVar = let.d;
                    sb2.O(letVar, arrayList);
                    return letVar;
                }
                break;
            case 1360482480:
                if (str.equals("setColorRed")) {
                    j jVar = j.g;
                    if (!jl40.l(jVar.h(arrayList), qlsVar)) {
                        fhc fhcVar = fhc.g;
                        if (!jl40.l(fhcVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(jVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(fhcVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return fhcVar;
                    }
                    return jVar;
                }
                break;
            case 1394182093:
                if (str.equals("setHours")) {
                    j3r0 j3r0Var = j3r0.b;
                    sb2.O(j3r0Var, arrayList);
                    return j3r0Var;
                }
                break;
            case 1398793022:
                if (str.equals("setMonth")) {
                    o3r0 o3r0Var = o3r0.b;
                    sb2.O(o3r0Var, arrayList);
                    return o3r0Var;
                }
                break;
            case 1428631719:
                if (str.equals("getIntegerFromArray")) {
                    y7t y7tVar = y7t.e;
                    sb2.O(y7tVar, arrayList);
                    return y7tVar;
                }
                break;
            case 1449062308:
                if (str.equals("getColorRed")) {
                    i iVar = i.g;
                    if (!jl40.l(iVar.h(arrayList), qlsVar)) {
                        ehc ehcVar = ehc.g;
                        if (!jl40.l(ehcVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(iVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(ehcVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return ehcVar;
                    }
                    return iVar;
                }
                break;
            case 1507829577:
                if (str.equals("trimLeft")) {
                    ef11 ef11Var = ef11.b;
                    sb2.O(ef11Var, arrayList);
                    return ef11Var;
                }
                break;
            case 1508134774:
                if (str.equals("encodeUri")) {
                    dtu0 dtu0Var = dtu0.b;
                    sb2.O(dtu0Var, arrayList);
                    return dtu0Var;
                }
                break;
            case 1565972102:
                if (str.equals("getOptColorFromDict")) {
                    w9t w9tVar = w9t.d;
                    if (!jl40.l(w9tVar.h(arrayList), qlsVar)) {
                        x9t x9tVar = x9t.d;
                        if (!jl40.l(x9tVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(w9tVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(x9tVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return x9tVar;
                    }
                    return w9tVar;
                }
                break;
            case 1636968764:
                if (str.equals("getOptDictFromArray")) {
                    y9t y9tVar = y9t.e;
                    sb2.O(y9tVar, arrayList);
                    return y9tVar;
                }
                break;
            case 1644730933:
                if (str.equals("nowLocal")) {
                    il60 il60Var = il60.b;
                    sb2.O(il60Var, arrayList);
                    return il60Var;
                }
                break;
            case 1695311327:
                if (str.equals("getNumberFromDict")) {
                    n9t n9tVar = n9t.d;
                    sb2.O(n9tVar, arrayList);
                    return n9tVar;
                }
                break;
            case 1716172417:
                if (str.equals("getOptStringFromArray")) {
                    eat eatVar = eat.e;
                    sb2.O(eatVar, arrayList);
                    return eatVar;
                }
                break;
            case 1738128829:
                if (str.equals("setColorAlpha")) {
                    d dVar = d.g;
                    if (!jl40.l(dVar.h(arrayList), qlsVar)) {
                        zgc zgcVar = zgc.g;
                        if (!jl40.l(zgcVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(dVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(zgcVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return zgcVar;
                    }
                    return dVar;
                }
                break;
            case 1743838050:
                if (str.equals("setColorGreen")) {
                    h hVar = h.g;
                    if (!jl40.l(hVar.h(arrayList), qlsVar)) {
                        dhc dhcVar = dhc.g;
                        if (!jl40.l(dhcVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(hVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(dhcVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return dhcVar;
                    }
                    return hVar;
                }
                break;
            case 1745084820:
                if (str.equals("getIntervalHours")) {
                    b8t b8tVar = b8t.b;
                    sb2.O(b8tVar, arrayList);
                    return b8tVar;
                }
                break;
            case 1814686973:
                if (str.equals("getBooleanFromArray")) {
                    c4t c4tVar = c4t.e;
                    sb2.O(c4tVar, arrayList);
                    return c4tVar;
                }
                break;
            case 1883462358:
                if (str.equals("getIntervalTotalMinutes")) {
                    g8t g8tVar = g8t.b;
                    sb2.O(g8tVar, arrayList);
                    return g8tVar;
                }
                break;
            case 1907630144:
                if (str.equals("getDictKeys")) {
                    i6t i6tVar = i6t.d;
                    sb2.O(i6tVar, arrayList);
                    return i6tVar;
                }
                break;
            case 1910382545:
                if (str.equals("encodeRegex")) {
                    l lVar = l.b;
                    sb2.O(lVar, arrayList);
                    return lVar;
                }
                break;
            case 1953671716:
                if (str.equals("getIntervalMinutes")) {
                    c8t c8tVar = c8t.b;
                    sb2.O(c8tVar, arrayList);
                    return c8tVar;
                }
                break;
            case 1953831815:
                if (str.equals("getStoredStringValue")) {
                    kdt kdtVar = kdt.d;
                    if (!jl40.l(kdtVar.h(arrayList), qlsVar)) {
                        eet eetVar = eet.d;
                        if (!jl40.l(eetVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(kdtVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(eetVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return eetVar;
                    }
                    return kdtVar;
                }
                break;
            case 1955294553:
                if (str.equals("getHours")) {
                    u7t u7tVar = u7t.b;
                    sb2.O(u7tVar, arrayList);
                    return u7tVar;
                }
                break;
            case 1959905482:
                if (str.equals("getMonth")) {
                    k9t k9tVar = k9t.b;
                    sb2.O(k9tVar, arrayList);
                    return k9tVar;
                }
                break;
            case 1970789287:
                if (str.equals("getColorBlue")) {
                    e eVar = e.g;
                    if (!jl40.l(eVar.h(arrayList), qlsVar)) {
                        ahc ahcVar = ahc.g;
                        if (!jl40.l(ahcVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(eVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(ahcVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return ahcVar;
                    }
                    return eVar;
                }
                break;
            case 1975049074:
                if (str.equals("getDictInteger")) {
                    h6t h6tVar = h6t.d;
                    sb2.O(h6tVar, arrayList);
                    return h6tVar;
                }
                break;
            case 1985132479:
                if (str.equals("setYear")) {
                    o4r0 o4r0Var = o4r0.b;
                    sb2.O(o4r0Var, arrayList);
                    return o4r0Var;
                }
                break;
            case 1992807388:
                if (str.equals("lastIndex")) {
                    mtu0 mtu0Var = mtu0.b;
                    sb2.O(mtu0Var, arrayList);
                    return mtu0Var;
                }
                break;
            case 2033316403:
                if (str.equals("getArrayOptColor")) {
                    q3t q3tVar = q3t.e;
                    if (!jl40.l(q3tVar.h(arrayList), qlsVar)) {
                        r3t r3tVar = r3t.f;
                        if (!jl40.l(r3tVar.h(arrayList), qlsVar)) {
                            if (!jl40.l(q3tVar.i(arrayList), qlsVar)) {
                                if (!jl40.l(r3tVar.i(arrayList), qlsVar)) {
                                    throw sb2.s(str, arrayList);
                                }
                            }
                        }
                        return r3tVar;
                    }
                    return q3tVar;
                }
                break;
            case 2075646548:
                if (str.equals("formatDateAsLocal")) {
                    g7s g7sVar = g7s.b;
                    sb2.O(g7sVar, arrayList);
                    return g7sVar;
                }
                break;
            case 2101762217:
                if (str.equals("getMinutes")) {
                    j9t j9tVar = j9t.b;
                    sb2.O(j9tVar, arrayList);
                    return j9tVar;
                }
                break;
            case 2135485098:
                if (str.equals("getStringValue")) {
                    met metVar = met.b;
                    sb2.O(metVar, arrayList);
                    return metVar;
                }
                break;
        }
        throw new EvaluableException(unr0.l('.', "Unknown function name: ", str));
    }

    @Override // defpackage.s16
    public boolean isEnabled() {
        return false;
    }

    @Override // defpackage.nhe
    public long j(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i = blm0.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        return new qc91((zl91) yuf0Var.a(zl91.class), (alo) yuf0Var.a(alo.class));
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        return (m5j0) obj;
    }

    @Override // defpackage.m131
    public Object x(com.airbnb.lottie.parser.moshi.a aVar, float f) {
        JsonReader$Token k = aVar.k();
        if (k != JsonReader$Token.BEGIN_ARRAY && k != JsonReader$Token.BEGIN_OBJECT) {
            if (k != JsonReader$Token.NUMBER) {
                kbs.f(k, "Cannot convert json to point. Next token is ");
                return null;
            }
            PointF pointF = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
            while (aVar.hasNext()) {
                aVar.skipValue();
            }
            return pointF;
        }
        return yex.b(aVar, f);
    }
}
