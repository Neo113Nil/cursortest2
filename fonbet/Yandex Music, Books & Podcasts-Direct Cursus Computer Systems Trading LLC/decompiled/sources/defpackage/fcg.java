package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.passport.sloth.ui.dependencies.m;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.TargetFormat;
import ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestApiConfig;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.a;

/* loaded from: classes6.dex */
public final class fcg {
    public static volatile ecg a;
    public static volatile dn9 b;
    public static volatile anm c;
    public static final qqi d = rqi.a();
    public static final tf6 e;

    static {
        dq7 dq7Var = ca8.a;
        mn7.d.getClass();
        e = gld.e(wkt.d.I0(1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v43, types: [c5b] */
    public static final ecg a(Context context, ule uleVar) {
        Object t7oVar;
        d1 d1Var;
        List arrayList;
        List split$default;
        d1 d1Var2;
        n2t n2tVar;
        tf6 tf6Var;
        a aVar;
        qdc qdcVar;
        anm anmVar;
        s7b s7bVar;
        j08 j08Var;
        kzn kznVar = new kzn();
        qdc qdcVar2 = new qdc(kznVar);
        String c2 = new jml(new ujl()).c("AND");
        rle rleVar = sle.Companion;
        uleVar.getClass();
        rleVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            w3f w3fVar = x3f.d;
            w3fVar.getClass();
            t7oVar = (sle) w3fVar.b(rleVar.serializer(), "");
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            ngl.r(qdcVar2, "InitFlags", "fromJsonOrDefault", su4.p(a2, new StringBuilder("Failed to parse flags: ")), null, new Object[0], 8);
        }
        sle sleVar = new sle();
        if (t7oVar instanceof t7o) {
            t7oVar = sleVar;
        }
        sle sleVar2 = (sle) t7oVar;
        qdcVar2.H("LYPMProvider", "initializeInternal", "failfast: false, thread:" + Thread.currentThread().getName() + ", version: 3.8.1(3081), vsid=" + c2 + ", params = " + uleVar, new Object[0]);
        xqn xqnVar = new xqn();
        xqnVar.a = new OkHttpClient();
        rdk.h.b(context, new ne0(xqnVar, 5));
        rdk rdkVar = rdk.i;
        if (rdkVar == null || (d1Var = rdkVar.A(c2)) == null) {
            d1Var = d1.g;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(uleVar.b);
        List list = d1Var.a;
        ArrayList arrayList3 = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(String.valueOf(((Number) it.next()).intValue()));
        }
        arrayList2.addAll(arrayList3);
        if (d1Var.b.l) {
            joj c3 = ((OkHttpClient) xqnVar.a).c();
            c3.f = false;
            xqnVar.a = new OkHttpClient(c3);
        }
        String str = uleVar.a;
        cke ckeVar = new cke(context);
        LinkedHashSet a3 = nzk.a(context);
        wt0 b2 = ckeVar.b();
        Map n = dfi.n(ConnectableDevice.KEY_ID, str);
        ArrayList arrayList4 = !arrayList2.isEmpty() ? arrayList2 : null;
        String X = arrayList4 != null ? CollectionsKt.X(arrayList4, ";", null, null, null, 62) : null;
        if (arrayList2.isEmpty()) {
            arrayList = c5b.a;
        } else {
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                split$default = StringsKt__StringsKt.split$default((String) it2.next(), new String[]{StringUtils.COMMA}, false, 2, 2, null);
                String str2 = (String) CollectionsKt.firstOrNull(split$default);
                Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
        }
        n2t n2tVar2 = new n2t("AndroidPlayer", c2, b2, n, null, X, arrayList, null, "ru.yandex.music", null, -1, a3, ckeVar.b.f());
        n4f n4fVar = new n4f();
        OkHttpClient okHttpClient = (OkHttpClient) xqnVar.a;
        okHttpClient.getClass();
        ylr ylrVar = new ylr(okHttpClient, Executors.newSingleThreadExecutor(new lp7(1, Executors.defaultThreadFactory())), n4fVar, new cke(context), qdcVar2, null);
        l48 l48Var = nsh.j;
        t1 t1Var = d1Var.b;
        boolean z = t1Var.n;
        boolean z2 = t1Var.o;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        nsh nshVar = nsh.k;
        if (nshVar != null) {
            d1Var2 = d1Var;
            v3w.n(z, (xdr) nshVar.b, null);
            if (z2) {
                nshVar.I(applicationContext);
            }
        } else {
            d1Var2 = d1Var;
            synchronized (l48Var) {
                nshVar = nsh.k;
                if (nshVar == null) {
                    nshVar = new nsh(applicationContext, z, z2);
                    nsh.k = nshVar;
                }
            }
        }
        vx6 vx6Var = new vx6(nshVar);
        keg kegVar = new keg();
        wqr n2 = a4g.n();
        dq7 dq7Var = ca8.a;
        tf6 e2 = gld.e(e.c(n2, mn7.d).plus(new b43(rre.f, 7)));
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.getClass();
        uob uobVar = new uob(newSingleThreadExecutor);
        apo apoVar = new apo(uobVar, new nsh(e2), e2);
        r2f r2fVar = (r2f) e2.a.get(o6c.l);
        int i = 3;
        if (r2fVar != null) {
            n2tVar = n2tVar2;
            r2fVar.R(new ybg(i, uobVar));
        } else {
            n2tVar = n2tVar2;
        }
        gag gagVar = new gag(qdcVar2, nshVar, vx6Var, e2);
        nsh nshVar2 = nshVar;
        d1 d1Var3 = d1Var2;
        a aVar2 = new a(ylrVar, n2tVar, kznVar, n4fVar, vx6Var);
        qdc qdcVar3 = new qdc(qdcVar2);
        dn9 dn9Var = new dn9(aVar2, qdcVar3);
        b = dn9Var;
        ssm ssmVar = new ssm();
        Context applicationContext2 = context.getApplicationContext();
        anm anmVar2 = c;
        if (anmVar2 == null) {
            applicationContext2.getClass();
            tf6Var = e2;
            ybg ybgVar = new ybg(2, applicationContext2);
            zmm zmmVar = new zmm();
            zmmVar.a = applicationContext2;
            ybgVar.invoke(zmmVar);
            aVar = aVar2;
            Function0 function0 = zmmVar.b;
            if (function0 == null) {
                qdcVar = qdcVar3;
                function0 = new kgk(5, zmmVar);
            } else {
                qdcVar = qdcVar3;
            }
            anmVar = new cnm(applicationContext2, function0);
        } else {
            tf6Var = e2;
            aVar = aVar2;
            qdcVar = qdcVar3;
            anmVar = anmVar2;
        }
        c = anmVar;
        c5p c5pVar = new c5p(3);
        c5p c5pVar2 = new c5p(3);
        Point B = dvt.B(context);
        Size o = v3g.o(B.x, B.y);
        rp7 rp7Var = new rp7();
        try {
            JSONArray jSONArray = new JSONArray("[{w: 480, h: 854}, {w: 720, h:1280}, {w: 1080, h: 1920}]");
            if (jSONArray.length() == 0) {
                xq0.x("Empty JSON list in availableFormatsJsonString");
                throw null;
            }
            TreeMap treeMap = new TreeMap();
            int length = jSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = length;
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                JSONArray jSONArray2 = jSONArray;
                int i4 = i2;
                int optInt = jSONObject.optInt("w", -1);
                dn9 dn9Var2 = dn9Var;
                int optInt2 = jSONObject.optInt("h", -1);
                if (optInt <= 0 || optInt2 <= 0 || optInt >= optInt2) {
                    xq0.x("Invalid format description in availableFormatsJsonString");
                    throw null;
                }
                TreeSet treeSet = (TreeSet) treeMap.get(Integer.valueOf(optInt));
                if (treeSet == null) {
                    treeSet = new TreeSet();
                    treeMap.put(Integer.valueOf(optInt), treeSet);
                }
                if (!treeSet.add(Integer.valueOf(optInt2))) {
                    xq0.x("Duplicated format description in availableFormatsJsonString");
                    throw null;
                }
                i2 = i4 + 1;
                length = i3;
                jSONArray = jSONArray2;
                dn9Var = dn9Var2;
            }
            dn9 dn9Var3 = dn9Var;
            Size o2 = o.getWidth() > o.getHeight() ? v3g.o(o.getHeight(), o.getWidth()) : v3g.o(o.getWidth(), o.getHeight());
            Iterator it3 = treeMap.descendingKeySet().iterator();
            Size size = null;
            Size size2 = null;
            int i5 = 1;
            while (it3.hasNext()) {
                Size size3 = o2;
                Integer num = (Integer) it3.next();
                Object obj = treeMap.get(num);
                obj.getClass();
                for (Integer num2 : ((TreeSet) obj).descendingSet()) {
                    num.getClass();
                    Integer num3 = num;
                    int intValue = num3.intValue();
                    num2.getClass();
                    Iterator it4 = it3;
                    Size o3 = v3g.o(intValue, num2.intValue());
                    if (num3.intValue() <= size3.getWidth() && num2.intValue() <= size3.getHeight()) {
                        if (i5 >= 0) {
                            size = v3g.o(num3.intValue(), num2.intValue());
                        }
                        i5--;
                    }
                    num = num3;
                    it3 = it4;
                    size2 = o3;
                }
                o2 = size3;
            }
            if (size == null) {
                size2.getClass();
                size = size2;
            }
            rp7Var.a = new TargetFormat(size, size);
            cke ckeVar2 = new cke(context);
            oxa oxaVar = new oxa(12, uleVar);
            OkHttpClient okHttpClient2 = (OkHttpClient) xqnVar.a;
            okHttpClient2.getClass();
            twe tweVar = new twe(new swe(okHttpClient2, n4fVar, oxaVar, new InternalVideoManifestApiConfig(null, null, ckeVar2.c(), "ru.yandex.music", null, 3, null)), ckeVar2.b.f());
            t1 t1Var2 = d1Var3.b;
            anm anmVar3 = anmVar;
            dbw dbwVar = new dbw(t1Var2.p, t1Var2.q, t1Var2.r, new xzt(new o46(context, c2, uleVar.a, uleVar.b), anmVar3, ssmVar, rp7Var, c5pVar, c5pVar2, tweVar, (OkHttpClient) xqnVar.a, kegVar, d1Var3.b, qdcVar2), qdcVar2);
            xiu xiuVar = new xiu(new p1d(1));
            xiu xiuVar2 = new xiu(new p1d(1));
            ime imeVar = new ime(4);
            m mVar = new m(c2, qdcVar2, xiuVar, xiuVar2, imeVar, d1Var3.b, nshVar2, tf6Var, gagVar, context);
            jzi jziVar = new jzi(rp7Var);
            String str3 = uleVar.a;
            OkHttpClient okHttpClient3 = (OkHttpClient) xqnVar.a;
            t1 t1Var3 = d1Var3.b;
            okHttpClient3.getClass();
            t1Var3.getClass();
            HandlerThread handlerThread = new HandlerThread("PreloaderHandler");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(9, new sp7(0));
            if (k08.a == null && (j08Var = k08.c) != null) {
                AppMetricaYandex.requestStartupParams(context, j08Var, "appmetrica_device_id");
            }
            up7 up7Var = new up7(t1Var3, context, arrayList2, c2, newFixedThreadPool, anmVar3, new yk7(okHttpClient3), okHttpClient3, str3, ssmVar, jziVar);
            gm5 j = hld.j();
            handler.post(new jt6(19, j, up7Var));
            Handler handler2 = new Handler(Looper.getMainLooper());
            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new jt7(0));
            newSingleThreadExecutor2.getClass();
            jau jauVar = new jau(tweVar, xiuVar, newSingleThreadExecutor2, handler2);
            kkp kkpVar = new kkp(22, qdcVar2, xiuVar, xiuVar2, sleVar2.a ? apoVar : null, false);
            int i6 = d1Var3.b.t;
            int i7 = d1Var3.b.s;
            int i8 = d1Var3.b.q;
            int i9 = i6 + i7;
            if (i9 <= i8) {
                s7bVar = new s7b(i6, i7);
            } else {
                int floor = (int) Math.floor(((i8 * 1.0d) * i6) / i9);
                s7bVar = new s7b(floor, i8 - floor);
            }
            if (d1Var3.b.s != s7bVar.b || d1Var3.b.t != s7bVar.a) {
                qdcVar2.H("LYPMProvider", "initializeInternal", "incorrect configuration; forwardEngineInListSDK = " + d1Var3.b.s + " backwardEngineInListSDK = " + d1Var3.b.t + ", but maxPoolSizeInListSDK == " + d1Var3.b.q + ". Corrected to " + s7bVar, new Object[0]);
            }
            return new ecg(qdcVar2, new ru.yandex.video.m3.list_player_manager.impl.a(mVar, dbwVar, qdcVar2, d1Var3.b.k, s7bVar), new xbu(j, jauVar, qdcVar2, c2, c5pVar, c5pVar2, new rp7(xiuVar), imeVar, d1Var3.b, tf6Var), dn9Var3, qdcVar, c2, aVar, vx6Var, kkpVar, imeVar, anmVar3, gagVar, tf6Var, nshVar2);
        } catch (JSONException unused) {
            xq0.x("Invalid JSON list in availableFormatsJsonString");
            throw null;
        }
    }
}
