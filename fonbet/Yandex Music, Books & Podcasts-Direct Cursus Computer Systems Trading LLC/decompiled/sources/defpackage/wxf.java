package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.smart.downloading.data.network.DownloadIntervalDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import j$.util.DesugarTimeZone;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.catalog.universalentity.UniversalEntityActivity;
import ru.yandex.music.url.ui.StubActivity;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes3.dex */
public abstract class wxf {
    public static final /* synthetic */ int a = 0;

    public static Intent A(Context context, String str) {
        context.getClass();
        tjt b = ((gkt) new lim(ekt.YANDEXMUSIC).a(str, true)).b();
        gjt Q = b != null ? hyf.Q(b) : null;
        if (Q != null) {
            Intent putExtra = new Intent(context, (Class<?>) UniversalEntityActivity.class).putExtra("extra.entityContentType", Q).putExtra("extra.entityUrlType", (Parcelable) b.c);
            putExtra.getClass();
            return putExtra;
        }
        ssg.a(6, null, hrg.q("Failed to create intent for universal screen with url=", str, " from viewAll button"), null);
        Intent z = StubActivity.z(context, rpt.NOT_FOUND);
        z.getClass();
        return z;
    }

    public static boolean B(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static float C(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    public static List D(Class cls, Iterable iterable, ClassLoader classLoader, jkp jkpVar) {
        ?? load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object obj = null;
                try {
                    obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    load.add(obj);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader load2 = ServiceLoader.load(cls, classLoader);
            load = !load2.iterator().hasNext() ? ServiceLoader.load(cls) : load2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : load) {
            if (jkpVar.E(obj2)) {
                arrayList.add(obj2);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new eh(16, jkpVar)));
        return Collections.unmodifiableList(arrayList);
    }

    public static final v3k E(v3k v3kVar, Function2 function2) {
        v3kVar.getClass();
        return new v3k(new clc(v3kVar.a, function2, 6), v3kVar.b, v3kVar.c, xuj.v);
    }

    public static final void F(String str, String str2) {
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        xq0.o(hrg.q("Argument '", str2, "' cannot be empty"));
    }

    public static final void G(qod qodVar) {
        qodVar.getClass();
        Iterator it = qodVar.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                jj4.j("Container 'requests' cannot contain null values");
                return;
            }
        }
        if (qodVar.isEmpty()) {
            xq0.o("Container 'requests' cannot be empty");
        }
    }

    public static final void H(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(hrg.q("Argument '", str, "' cannot be null"));
    }

    public static final void I(String str, String str2) {
        if (gvt.D(str)) {
            xq0.o(hrg.q("Argument '", str2, "' cannot be null or empty"));
        }
    }

    public static final void J() {
        if (!j3c.n.get()) {
            throw new k3c("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final void K(View view, boolean z) {
        view.getClass();
        view.setVisibility(z ? 0 : 8);
    }

    public static final void L(w4f w4fVar, String str) {
        w4fVar.getClass();
        StringBuilder u = ouj.u("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        u.append(ern.a(w4fVar.getClass()).h());
        u.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new c5f(u.toString());
    }

    public static final vx3 M() {
        hx3 hx3Var = hx3.UNKNOWN;
        ArrayList arrayList = vx3.f;
        return gos.n(hx3Var, false);
    }

    public static final qfk N(zh3 zh3Var) {
        zh3Var.getClass();
        String str = zh3Var.a;
        String i = k5r.i(str.hashCode(), "browser-");
        String n = ouj.n(c.q(str.length() - 4, "*"), str.substring(str.length() - 4));
        hx3 D = kg5.D(str);
        if (D != hx3.UNKNOWN) {
            return new qfk(i, u75.j(i), n, D.a, true, cm2.UnknownBank, null, null, null, ufk.Card, null, null, null, null, null, null);
        }
        return null;
    }

    public static final String O(ix3 ix3Var) {
        ix3Var.getClass();
        switch (ix3Var.ordinal()) {
            case 10:
                hx3 hx3Var = hx3.AmericanExpress;
                return "VISA";
            case 11:
                hx3 hx3Var2 = hx3.AmericanExpress;
                return "VISA_ELECTRON";
            case 12:
                hx3 hx3Var3 = hx3.AmericanExpress;
                return "unknown";
            default:
                return ix3Var.name();
        }
    }

    public static final ArrayList P(List list) {
        String endTime;
        TimeZone timeZone;
        Object t7oVar;
        Object t7oVar2;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DownloadIntervalDto downloadIntervalDto = (DownloadIntervalDto) it.next();
            e5w e5wVar = null;
            if (downloadIntervalDto != null) {
                e5w e5wVar2 = e5w.f;
                String startTime = downloadIntervalDto.getStartTime();
                if (startTime != null && (endTime = downloadIntervalDto.getEndTime()) != null) {
                    String timeZone2 = downloadIntervalDto.getTimeZone();
                    if (timeZone2 == null || (timeZone = DesugarTimeZone.getTimeZone(timeZone2)) == null) {
                        timeZone = TimeZone.getDefault();
                    }
                    TimeZone timeZone3 = timeZone;
                    timeZone3.getClass();
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = rzf.L(startTime, timeZone3);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    if (t7oVar instanceof t7o) {
                        t7oVar = null;
                    }
                    Date date = (Date) t7oVar;
                    if (date != null) {
                        try {
                            t7oVar2 = rzf.L(endTime, timeZone3);
                        } catch (Throwable th2) {
                            r7o r7oVar3 = z7o.b;
                            t7oVar2 = new t7o(th2);
                        }
                        if (t7oVar2 instanceof t7o) {
                            t7oVar2 = null;
                        }
                        Date date2 = (Date) t7oVar2;
                        if (date2 != null) {
                            e5wVar = new e5w(startTime, endTime, date, date2, timeZone3);
                        }
                    }
                }
            }
            if (e5wVar != null) {
                arrayList.add(e5wVar);
            }
        }
        return arrayList;
    }

    public static final op Q(jdk jdkVar) {
        jdkVar.getClass();
        return new op(jdkVar.a, jdkVar.b, false);
    }

    public static final wfk R(xfk xfkVar) {
        t7w t7wVar;
        xfkVar.getClass();
        boolean z = xfkVar.a;
        boolean z2 = xfkVar.b;
        boolean z3 = xfkVar.c;
        boolean z4 = xfkVar.e;
        boolean z5 = xfkVar.f;
        boolean z6 = xfkVar.d;
        Set set = xfkVar.g;
        ArrayList arrayList = new ArrayList(v75.o(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int ordinal = ((u7w) it.next()).ordinal();
            if (ordinal == 0) {
                t7wVar = t7w.YANDEX_BANK_PRO_CARD;
            } else if (ordinal == 1) {
                t7wVar = t7w.YANDEX_BANK_PLUS_CARD;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                t7wVar = t7w.YANDEX_BANK_CREDIT_LIMIT_CARD;
            }
            arrayList.add(t7wVar);
        }
        return new wfk(z, z2, z3, z4, z5, z6, new ArrayList(arrayList));
    }

    public static final hx3 S(ix3 ix3Var) {
        ix3Var.getClass();
        switch (ix3Var.ordinal()) {
            case 0:
                return hx3.AmericanExpress;
            case 1:
                return hx3.DinersClub;
            case 2:
                return hx3.DiscoverCard;
            case 3:
                return hx3.JCB;
            case 4:
                return hx3.HUMO;
            case 5:
                return hx3.Maestro;
            case 6:
                return hx3.MasterCard;
            case 7:
                return hx3.MIR;
            case 8:
                return hx3.UnionPay;
            case 9:
                return hx3.Uzcard;
            case 10:
                return hx3.VISA;
            case 11:
                return hx3.VISA_ELECTRON;
            case 12:
                return hx3.UNKNOWN;
            default:
                b6e.s();
                return null;
        }
    }

    public static byte[] T(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            i2 += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }

    public static final void a(String str, s3j s3jVar, tmb tmbVar, hq5 hq5Var, int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        str.getClass();
        s3jVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(432024921);
        int i3 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(s3jVar) ? 32 : 16) | (oq5Var.h(tmbVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            x3j x3jVar = (x3j) szf.Q(s3jVar.c, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(x3jVar instanceof u3j, x3jVar instanceof v3j, null, oq5Var, 4096, 4);
            boolean d = Intrinsics.d(x3jVar, u3j.a);
            kjn kjnVar = gq5.a;
            if (d) {
                oq5Var.Z(-1562042094);
                vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                z = (i3 & 112) == 32;
                Object K = oq5Var.K();
                if (z || K == kjnVar) {
                    i2 = i3;
                    z3 = false;
                    sui suiVar = new sui(0, s3jVar, s3j.class, "onBackClick", "onBackClick()V", 0, 7);
                    oq5Var.k0(suiVar);
                    K = suiVar;
                } else {
                    i2 = i3;
                    z3 = false;
                }
                xp3.d(str, a2, null, C, (Function0) ((h9f) K), null, false, false, null, null, null, ild.C(-1288200057, new gab(13, s3jVar, tmbVar), oq5Var), oq5Var, i2 & 14, 48, 2020);
                oq5Var = oq5Var;
                oq5Var.p(z3);
            } else if (Intrinsics.d(x3jVar, v3j.a) || (x3jVar instanceof w3j)) {
                oq5Var.Z(-1561193128);
                float f = 0;
                dag.c(new q0k(f, f, f, f), null, oq5Var, 6);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(x3jVar, t3j.a)) {
                    throw vz1.i(oq5Var, -1435862917, false);
                }
                oq5Var.Z(-1561057069);
                vm C2 = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                z = (i3 & 112) == 32;
                Object K2 = oq5Var.K();
                if (z || K2 == kjnVar) {
                    z2 = false;
                    sui suiVar2 = new sui(0, s3jVar, s3j.class, "onBackClick", "onBackClick()V", 0, 8);
                    oq5Var.k0(suiVar2);
                    K2 = suiVar2;
                } else {
                    z2 = false;
                }
                xp3.d(str, a2, null, C2, (Function0) ((h9f) K2), null, false, false, null, null, null, jf0.d, oq5Var, i3 & 14, 48, 2020);
                oq5Var = oq5Var;
                oq5Var.p(z2);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(str, s3jVar, tmbVar, i, 9);
        }
    }

    public static final void b(n9b n9bVar, Function0 function0) {
        n9bVar.getClass();
        function0.getClass();
        n9bVar.a.a(new wn5(new zk(26, function0), 1928486402, true));
    }

    public static final void c(wn5 wn5Var, hq5 hq5Var, int i) {
        euv euvVar;
        Pair pair;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1521606198);
        if ((i & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            qs5 qs5Var = fuv.a;
            qs5 qs5Var2 = AndroidCompositionLocals_androidKt.a;
            int i2 = ((Configuration) oq5Var.j(qs5Var2)).screenWidthDp;
            int i3 = ((Configuration) oq5Var.j(qs5Var2)).screenHeightDp;
            boolean h = irv.h(oq5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.valueOf(i2 > i3));
                oq5Var.k0(K);
            }
            if (((Boolean) ((aqi) K).getValue()).booleanValue()) {
                oq5Var.Z(165915260);
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    float f = i2 / 5.0f;
                    float f2 = f * 1.625f;
                    if (f2 > i3 * 0.8d) {
                        float f3 = i3 * 0.8f;
                        pair = new Pair(Float.valueOf(f3 / 1.625f), Float.valueOf(f3));
                    } else {
                        pair = new Pair(Float.valueOf(f), Float.valueOf(f2));
                    }
                    K2 = szf.g0(new Pair(Float.valueOf(((Number) pair.a).floatValue()), Float.valueOf(((Number) pair.b).floatValue())));
                    oq5Var.k0(K2);
                }
                aqi aqiVar = (aqi) K2;
                euvVar = new euv(((Number) ((Pair) aqiVar.getValue()).b).floatValue(), ((Number) ((Pair) aqiVar.getValue()).a).floatValue());
                oq5Var.p(false);
            } else if (h) {
                oq5Var.Z(166587154);
                Object K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    K3 = tlm.h(i2 / 5.0f, oq5Var);
                }
                poi poiVar = (poi) K3;
                Object K4 = oq5Var.K();
                if (K4 == kjnVar) {
                    K4 = tlm.h(((t6k) poiVar).e() * 1.625f, oq5Var);
                }
                euvVar = new euv(((t6k) ((poi) K4)).e(), ((t6k) poiVar).e());
                oq5Var.p(false);
            } else {
                oq5Var.Z(166926418);
                Object K5 = oq5Var.K();
                if (K5 == kjnVar) {
                    K5 = tlm.h(i2 / 3.0f, oq5Var);
                }
                poi poiVar2 = (poi) K5;
                Object K6 = oq5Var.K();
                if (K6 == kjnVar) {
                    K6 = tlm.h(((t6k) poiVar2).e() * 1.625f, oq5Var);
                }
                euvVar = new euv(((t6k) ((poi) K6)).e(), ((t6k) poiVar2).e());
                oq5Var.p(false);
            }
            etn.l(qs5Var.a(euvVar), ild.C(699892470, new y61(wn5Var, 28), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y61(i, 29, wn5Var);
        }
    }

    public static final void d(raj rajVar, wdj wdjVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        kjn kjnVar;
        boolean z2;
        Object r9nVar;
        wdj wdjVar2;
        ges j;
        wdjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1261054265);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(rajVar) : oq5Var.h(rajVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wdjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            aqi M = gld.M(wdjVar.l(), oq5Var);
            aqi M2 = gld.M(wdjVar.c(), oq5Var);
            aqi M3 = gld.M(wdjVar.h(), oq5Var);
            aqi M4 = gld.M(wdjVar.g(), oq5Var);
            aqi P = szf.P(wdjVar.b(), j1g.b, null, oq5Var, 48, 2);
            rba rbaVar = (rba) M.getValue();
            lzs lzsVar = (lzs) M2.getValue();
            frs frsVar = (frs) M3.getValue();
            cdj cdjVar = (cdj) M4.getValue();
            boolean j2 = wdjVar.j();
            boolean h = oq5Var.h(wdjVar);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h || K == kjnVar2) {
                i3 = i2;
                kjnVar = kjnVar2;
                z2 = false;
                r9n r9nVar2 = new r9n(0, wdjVar, wdj.class, "onClick", "onClick()V", 0, 14);
                oq5Var.k0(r9nVar2);
                K = r9nVar2;
            } else {
                i3 = i2;
                z2 = false;
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var.h(wdjVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                r9n r9nVar3 = new r9n(0, wdjVar, wdj.class, "onLongClick", "onLongClick()V", 0, 15);
                oq5Var.k0(r9nVar3);
                K2 = r9nVar3;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h3 = oq5Var.h(wdjVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                r9nVar = new r9n(0, wdjVar, wdj.class, "onOverflowClick", "onOverflowClick()V", 0, 16);
                wdjVar2 = wdjVar;
                oq5Var.k0(r9nVar);
            } else {
                r9nVar = K3;
                wdjVar2 = wdjVar;
            }
            h9f h9fVar3 = (h9f) r9nVar;
            e9g e9gVar = e9g.a;
            agr agrVar = eq0.a;
            long j3 = ((dq0) oq5Var.j(agrVar)).a.a;
            long j4 = ((dq0) oq5Var.j(agrVar)).a.a;
            if (z) {
                oq5Var.Z(-692330633);
                j = nu0.g();
            } else {
                oq5Var.Z(-692329325);
                j = nu0.j();
            }
            oq5Var.p(z2);
            c0g R = a4g.R((j1g) P.getValue());
            Function0 function0 = (Function0) h9fVar;
            Function0 function02 = (Function0) h9fVar2;
            Function0 function03 = (Function0) h9fVar3;
            boolean h4 = oq5Var.h(wdjVar2) | oq5Var.f(P);
            Object K4 = oq5Var.K();
            if (h4 || K4 == kjnVar) {
                K4 = new izo(wdjVar2, P, 1);
                oq5Var.k0(K4);
            }
            o5g.e(rajVar, rbaVar, lzsVar, frsVar, cdjVar, j2, function0, function02, function03, yciVar, e9gVar, j, j3, j4, R, (Function0) K4, oq5Var, (i3 & 14) | ((i3 << 18) & 1879048192), 6, 0);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jzo(rajVar, wdjVar, z, yciVar, i, 1);
        }
    }

    public static final void e(final String str, final long j, final long j2, final Function0 function0, yci yciVar, hq5 hq5Var, final int i, final int i2) {
        yci yciVar2;
        int i3;
        final yci yciVar3;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-40781693);
        int i4 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.e(j) ? 32 : 16) | (oq5Var.e(j2) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i3 = i4 | (oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar2;
        } else {
            yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
            yci g = d.g(d.t(yciVar4, 160, 0.0f, 2), 48, 0.0f, 2);
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            int i6 = (i3 & 14) | ((i3 >> 6) & 112);
            int i7 = i3 << 3;
            hdg.p(str, function0, j, j2, nu0.j(), g, 0.0f, oq5Var, i6 | (i7 & 896) | (i7 & 7168), 64);
            yciVar3 = yciVar4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(str, j, j2, function0, yciVar3, i, i2) { // from class: jiq
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ yci e;
                public final /* synthetic */ int f;

                {
                    this.f = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    wxf.e(this.a, this.b, this.c, this.d, this.e, (hq5) obj, R, this.f);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final int i, float f, final yci yciVar, hq5 hq5Var, final int i2) {
        oq5 oq5Var;
        Object obj;
        final float f2 = f;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1569688344);
        int i3 = i2 | (oq5Var2.d(i) ? 4 : 2) | (oq5Var2.c(f2) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128);
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            agr agrVar = eq0.a;
            final long j = ((dq0) oq5Var2.j(agrVar)).c.c;
            final long D = c3x.D(((dq0) oq5Var2.j(agrVar)).a.a, ((dq0) oq5Var2.j(agrVar)).c.a);
            final ges b = ges.b(nu0.j(), ((dq0) oq5Var2.j(agrVar)).b.b, 0L, null, null, 0L, 0, 0L, null, null, 0, 0, 16777214);
            final float f3 = 5;
            final float f4 = 40;
            final float f5 = 4.0f * f3;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(new d85(D));
                oq5Var2.k0(K);
            }
            final sdr b2 = pk0.b(i, weo.S(200, 0, null, 6), "lapsCountAnimated", null, oq5Var2, 3120, 20);
            final sdr b3 = bmq.b(((d85) ((aqi) K).getValue()).a, weo.S(100, 0, new ov6(1.0f, 0.0f, 1.0f, 0.0f), 2), "lastLapCircleColorAnimated", oq5Var2, 432, 8);
            oq5Var = oq5Var2;
            final ids O = o5g.O(6, 0, oq5Var);
            boolean f6 = ((i3 & 112) == 32) | oq5Var.f(O) | oq5Var.f(b) | oq5Var.e(j) | oq5Var.e(D) | ((i3 & 14) == 4) | oq5Var.f(b2) | oq5Var.f(b3);
            Object K2 = oq5Var.K();
            if (f6 || K2 == kjnVar) {
                f2 = f;
                obj = new Function1() { // from class: shs
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        float f7;
                        float f8;
                        float f9;
                        int i4;
                        float f10;
                        int i5;
                        float f11;
                        int i6;
                        long j2;
                        int i7;
                        sdr sdrVar;
                        jpa jpaVar = (jpa) obj2;
                        jpaVar.getClass();
                        long y = a4g.y(jpaVar.e());
                        float intBitsToFloat = Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L));
                        float f12 = f3;
                        char c = 2;
                        float f13 = 2;
                        float n0 = ((intBitsToFloat - jpaVar.n0(f12)) / f13) - jpaVar.n0(f4);
                        int i8 = (int) (y >> 32);
                        float intBitsToFloat2 = Float.intBitsToFloat(i8) - n0;
                        int i9 = (int) (y & 4294967295L);
                        float intBitsToFloat3 = Float.intBitsToFloat(i9) - n0;
                        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                        ids idsVar = O;
                        ids idsVar2 = idsVar;
                        ges gesVar = b;
                        float intBitsToFloat4 = ((Float.intBitsToFloat((int) (jpaVar.e() & 4294967295L)) - jpaVar.n0(f12)) - ((int) (ids.a(idsVar, "00", r9, 0, false, 0, 0L, 1020).c & 4294967295L))) / f13;
                        float f14 = 3;
                        float n02 = jpaVar.n0(f12) * f14;
                        float f15 = f2;
                        float radians = (float) Math.toRadians(f15 - 90.0f);
                        int s = hag.s(0, 330, 30);
                        if (s >= 0) {
                            int i10 = 0;
                            while (true) {
                                char c2 = c;
                                float radians2 = (float) Math.toRadians(i10 - 90.0f);
                                String valueOf = String.valueOf(i10 / 6);
                                double d = radians2;
                                jpa jpaVar2 = jpaVar;
                                float f16 = f12;
                                float intBitsToFloat5 = (Float.intBitsToFloat(i8) + (((float) Math.cos(d)) * intBitsToFloat4)) - (((int) (ids.a(idsVar2, valueOf, gesVar, 0, false, 0, 0L, 1020).c >> 32)) / 2);
                                float intBitsToFloat6 = (Float.intBitsToFloat(i9) + (((float) Math.sin(d)) * intBitsToFloat4)) - (((int) (ids.a(idsVar2, valueOf, gesVar, 0, false, 0, 0L, 1020).c & 4294967295L)) / 2);
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32);
                                mn0 mn0Var = new mn0(valueOf);
                                int i11 = (int) (floatToRawIntBits2 >> 32);
                                int round = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (jpaVar2.e() >> 32)) - Float.intBitsToFloat(i11)));
                                int i12 = (int) (floatToRawIntBits2 & 4294967295L);
                                long a2 = ia6.a(0, round, 0, Math.round((float) Math.ceil(Float.intBitsToFloat((int) (jpaVar2.e() & 4294967295L)) - Float.intBitsToFloat(i12))));
                                int i13 = s;
                                xof layoutDirection = jpaVar2.getLayoutDirection();
                                i6 = 0;
                                f11 = radians;
                                i4 = i8;
                                f10 = f14;
                                i5 = i9;
                                ids idsVar3 = idsVar2;
                                f9 = f15;
                                ges gesVar2 = gesVar;
                                f7 = n0;
                                f8 = f16;
                                int i14 = i10;
                                j2 = y;
                                cds b4 = ids.b(idsVar3, mn0Var, gesVar2, 1, false, Integer.MAX_VALUE, a2, layoutDirection, jpaVar2, null, 1568);
                                jpaVar = jpaVar2;
                                nsh q0 = jpaVar.q0();
                                long B = q0.B();
                                q0.s().r();
                                try {
                                    xzi xziVar = (xzi) q0.b;
                                    xziVar.m0(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
                                    v5g.v(xziVar, b4);
                                    ogi.l(b4.b, jpaVar.q0().s(), 0L, null, null, null, 30);
                                    if (i14 == i13) {
                                        break;
                                    }
                                    i10 = i14 + 30;
                                    idsVar2 = idsVar3;
                                    c = c2;
                                    gesVar = gesVar2;
                                    f15 = f9;
                                    f12 = f8;
                                    s = i13;
                                    i9 = i5;
                                    y = j2;
                                    radians = f11;
                                    i8 = i4;
                                    f14 = f10;
                                    n0 = f7;
                                } finally {
                                    vz1.A(q0, B);
                                }
                            }
                        } else {
                            f7 = n0;
                            f8 = f12;
                            f9 = f15;
                            i4 = i8;
                            f10 = f14;
                            i5 = i9;
                            f11 = radians;
                            i6 = 0;
                            j2 = y;
                        }
                        float f17 = f7;
                        jpa.D0(jpaVar, j, f17, j2, 0.0f, new amr(jpaVar.n0(f8), 0.0f, 0, 0, 30), 0, 104);
                        double d2 = f11;
                        float cos = (((float) Math.cos(d2)) * f17) + Float.intBitsToFloat(i4);
                        float sin = (((float) Math.sin(d2)) * f17) + Float.intBitsToFloat(i5);
                        float n03 = jpaVar.n0(f5) / 2.0f;
                        long j3 = D;
                        jpa.D0(jpaVar, j3, n03, (Float.floatToRawIntBits(cos) << 32) | (Float.floatToRawIntBits(sin) & 4294967295L), 0.0f, null, 0, 120);
                        jpaVar.V(j3, -90.0f, f9, false, floatToRawIntBits, nmq.f(2.0f, (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L)), (r26 & 64) != 0 ? 1.0f : 0.0f, (r26 & 128) != 0 ? dbc.a : new amr(jpaVar.n0(f8), 0.0f, 0, 0, 30));
                        int i15 = i6;
                        while (true) {
                            i7 = i;
                            sdrVar = b2;
                            if (i15 >= i7) {
                                break;
                            }
                            float floatValue = f17 - ((((Number) sdrVar.getValue()).floatValue() - i15) * n02);
                            jpa.D0(jpaVar, j3, floatValue, 0L, 0.0f, new amr(jpaVar.n0(f8) * (floatValue / f17), 0.0f, 0, 0, 30), 0, 108);
                            i15++;
                        }
                        if (i7 == 0 && ((Number) sdrVar.getValue()).floatValue() != 0.0f) {
                            jpa.D0(jpaVar, ((d85) b3.getValue()).a, f17 - (((Number) sdrVar.getValue()).floatValue() * (jpaVar.n0(f8) * f10)), 0L, 0.0f, new amr(jpaVar.n0(f8), 0.0f, 0, 0, 30), 0, 108);
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(obj);
            } else {
                obj = K2;
                f2 = f;
            }
            ksw.j((i3 >> 6) & 14, oq5Var, yciVar, (Function1) obj);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(f2, i, i2, yciVar) { // from class: ths
                public final /* synthetic */ int a;
                public final /* synthetic */ float b;
                public final /* synthetic */ yci c;

                {
                    this.c = yciVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int R = rvf.R(1);
                    wxf.f(this.a, this.b, this.c, (hq5) obj2, R);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(String str, long j, udv udvVar, yfv yfvVar, yci yciVar, boolean z, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        boolean z2;
        boolean z3;
        xmn r;
        dgv dgvVar;
        str.getClass();
        yfvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-850190684);
        int i3 = (oq5Var.f(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= oq5Var.e(j) ? 32 : 16;
        }
        int i4 = i3 | (oq5Var.f(udvVar) ? 256 : 128) | (oq5Var.h(yfvVar) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            yciVar2 = yciVar;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i4 |= oq5Var.g(z2) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
            if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
                oq5Var.S();
                z3 = z2;
            } else {
                boolean z4 = i5 != 0 ? false : z2;
                Object[] objArr = new Object[0];
                boolean z5 = (458752 & i4) == 131072;
                Object K = oq5Var.K();
                Object obj = gq5.a;
                if (z5 || K == obj) {
                    K = new esu(1, z4);
                    oq5Var.k0(K);
                }
                boolean z6 = z4;
                boolean booleanValue = ((Boolean) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6)).booleanValue();
                Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                Object K2 = oq5Var.K();
                if (K2 == obj) {
                    K2 = new WebView(context);
                    oq5Var.k0(K2);
                }
                WebView webView = (WebView) K2;
                Object K3 = oq5Var.K();
                if (K3 == obj) {
                    K3 = new eev(webView, 0);
                    oq5Var.k0(K3);
                }
                Function1 function1 = (Function1) K3;
                if (booleanValue) {
                    oq5Var.Z(-608065249);
                    Object[] objArr2 = {Unit.a};
                    Object K4 = oq5Var.K();
                    if (K4 == obj) {
                        K4 = new hev(webView);
                        oq5Var.k0(K4);
                    }
                    hev hevVar = (hev) K4;
                    Object K5 = oq5Var.K();
                    if (K5 == obj) {
                        K5 = new h8v(13);
                        oq5Var.k0(K5);
                    }
                    o2g.g0(objArr2, hevVar, (Function0) K5, oq5Var, 3120, 4);
                } else {
                    oq5Var.Z(-610422210);
                }
                oq5Var.p(false);
                if (booleanValue) {
                    oq5Var.Z(-607552354);
                    Object[] objArr3 = {Unit.a};
                    Object K6 = oq5Var.K();
                    if (K6 == obj) {
                        K6 = new mev();
                        oq5Var.k0(K6);
                    }
                    mev mevVar = (mev) K6;
                    boolean z7 = (i4 & 14) == 4;
                    Object K7 = oq5Var.K();
                    if (z7 || K7 == obj) {
                        K7 = new w8a(str, 3);
                        oq5Var.k0(K7);
                    }
                    gbv gbvVar = (gbv) o2g.g0(objArr3, mevVar, (Function0) K7, oq5Var, 48, 4);
                    boolean f = oq5Var.f(gbvVar);
                    Object K8 = oq5Var.K();
                    if (f || K8 == obj) {
                        K8 = new dgv(gbvVar);
                        oq5Var.k0(K8);
                    }
                    dgvVar = (dgv) K8;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-606991595);
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    Object K9 = oq5Var.K();
                    if (K9 == obj) {
                        K9 = new dgv(new fbv(str, e5bVar));
                        oq5Var.k0(K9);
                    }
                    dgvVar = (dgv) K9;
                    fbv fbvVar = new fbv(str, e5bVar);
                    dgvVar.getClass();
                    dgvVar.b.setValue(fbvVar);
                    oq5Var.p(false);
                }
                dgv dgvVar2 = dgvVar;
                boolean z8 = false;
                iev ievVar = new iev(yfvVar, udvVar);
                sh4 sh4Var = new sh4();
                if ((i4 & 112) == 32) {
                    z8 = true;
                }
                boolean h = z8 | oq5Var.h(yfvVar);
                Object K10 = oq5Var.K();
                if (h || K10 == obj) {
                    K10 = new j8a(j, yfvVar, 4);
                    oq5Var.k0(K10);
                }
                bcx.n(dgvVar2, yciVar2, false, null, (Function1) K10, null, ievVar, sh4Var, function1, oq5Var, ((i4 >> 9) & 112) | 100663296);
                oq5Var = oq5Var;
                z3 = z6;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new td6(str, j, udvVar, yfvVar, yciVar, z3, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final ydo h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ydo) {
                return (ydo) childAt;
            }
        }
        ydo ydoVar = new ydo(viewGroup.getContext());
        viewGroup.addView(ydoVar);
        return ydoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup i(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                xq0.o(dfi.g("Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", view));
                return null;
            }
            view = parent;
        }
        return (ViewGroup) view;
    }

    public static final void j(t9f t9fVar, t9f t9fVar2, String str) {
        if (t9fVar instanceof tyo) {
            mhp descriptor = t9fVar2.getDescriptor();
            descriptor.getClass();
            if (gld.J(descriptor).contains(str)) {
                l1j.o(f1d.m("Sealed class '", t9fVar2.getDescriptor().i(), "' cannot be serialized as base class '", ((tyo) t9fVar).getDescriptor().i(), "' because it has property name that conflicts with JSON class discriminator '"), str, "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public static void k(qpj qpjVar, dzf dzfVar, Function1 function1) {
        qpjVar.getClass();
        g1e g1eVar = new g1e(1, function1);
        if (dzfVar != null) {
            qpjVar.a(dzfVar, g1eVar);
        } else {
            qpjVar.b(g1eVar);
        }
    }

    public static final boolean l(vuu vuuVar, s9p s9pVar) {
        if (vuuVar == null || s9pVar == null) {
            return false;
        }
        if (hdg.N(s9pVar)) {
            return true;
        }
        List list = s9pVar.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (vuuVar.h.contains(((g9p) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m(vuu vuuVar, s9p s9pVar) {
        if (vuuVar == null) {
            return false;
        }
        return vuuVar.i || l(vuuVar, s9pVar);
    }

    public static final int n(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final void o(ivf ivfVar) {
        ivfVar.getClass();
        if (ivfVar instanceof thp) {
            xq0.q("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (ivfVar instanceof csm) {
            xq0.q("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (ivfVar instanceof igm) {
            xq0.q("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String p(x3f x3fVar, mhp mhpVar) {
        mhpVar.getClass();
        x3fVar.getClass();
        for (Annotation annotation : mhpVar.getAnnotations()) {
            if (annotation instanceof i4f) {
                return ((i4f) annotation).discriminator();
            }
        }
        return x3fVar.a.h;
    }

    public static vm5 q(String str, String str2) {
        ld2 ld2Var = new ld2(str, str2);
        eg0 b = vm5.b(ld2.class);
        b.b = 1;
        b.f = new n(15, ld2Var);
        return b.b();
    }

    public static weg r(zsb zsbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = zsbVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (zsbVar.a(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new weg(1, 0, length, i);
    }

    public static float s(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float t(float f, float f2, float f3, float f4) {
        float s = s(f, f2, 0.0f, 0.0f);
        float s2 = s(f, f2, f3, 0.0f);
        float s3 = s(f, f2, f3, f4);
        float s4 = s(f, f2, 0.0f, f4);
        return (s <= s2 || s <= s3 || s <= s4) ? (s2 <= s3 || s2 <= s4) ? s3 > s4 ? s3 : s4 : s2 : s;
    }

    public static int u() {
        String str;
        for (int i : ouj.E(3)) {
            if (i == 1) {
                str = "none";
            } else if (i == 2) {
                str = "release";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "debug";
            }
            if (str.equals("release")) {
                return i;
            }
        }
        Assertions.fail("Unknown logging mode value.");
        return 1;
    }

    public static final ArrayList v(String str, Pattern pattern) {
        int i;
        pattern.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        matcher.getClass();
        while (matcher.find()) {
            ArrayList arrayList2 = new ArrayList();
            int groupCount = matcher.groupCount();
            if (groupCount >= 0) {
                while (true) {
                    String group = matcher.group(i);
                    group.getClass();
                    arrayList2.add(group);
                    i = i != groupCount ? i + 1 : 0;
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public static vm5 w(String str, kac kacVar) {
        eg0 b = vm5.b(ld2.class);
        b.b = 1;
        b.a(ox7.b(Context.class));
        b.f = new v13(15, str, kacVar);
        return b.b();
    }

    public static nvl x(String str) {
        str.getClass();
        if (!nvl.c.e(str)) {
            return null;
        }
        List e0 = StringsKt.e0(str, new char[]{':'}, 2);
        return new nvl((String) e0.get(0), (String) e0.get(1));
    }

    public static final String y(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.j(AndroidCompositionLocals_androidKt.a);
        return ((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }

    public static final boolean z(Context context, String str) {
        List<ResolveInfo> list;
        context.getClass();
        H(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.d(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.d(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
