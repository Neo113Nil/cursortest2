package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.etc.helper.HttpMessage;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLSocket;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public class h1b implements ng3, nn5, u6c, mln, ru7, pf1, hv3, pm5, jd6, al2, nsd, w2q, b8j {
    public static pkn h;
    public static final h1b a = new h1b();
    public static final h1b b = new h1b();
    public static final h1b c = new h1b();
    public static final h1b d = new h1b();
    public static final kwk e = new kwk();
    public static final h1b f = new h1b();
    public static final h1b g = new h1b();
    public static final sst i = new sst();
    public static final h1b j = new h1b();
    public static final h1b k = new h1b();
    public static final h1b l = new h1b();

    public h1b(n7q n7qVar) {
        n7qVar.getClass();
    }

    public static boolean A(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList C0 = CollectionsKt.C0(list, list2);
        if (C0.isEmpty()) {
            return true;
        }
        Iterator it = C0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            k79 k79Var = (k79) pair.a;
            jc8 jc8Var = k79Var.a;
            k79 k79Var2 = (k79) pair.b;
            if (!B(jc8Var, k79Var2.a, k79Var.b, k79Var2.b)) {
                return false;
            }
        }
        return true;
    }

    public static boolean B(jc8 jc8Var, jc8 jc8Var2, xzb xzbVar, xzb xzbVar2) {
        if (!Intrinsics.d(jc8Var != null ? jc8Var.getClass() : null, jc8Var2 != null ? jc8Var2.getClass() : null)) {
            return false;
        }
        if (jc8Var == null || jc8Var2 == null || jc8Var == jc8Var2) {
            return true;
        }
        return E(jc8Var.d(), jc8Var2.d(), xzbVar, xzbVar2) && A(J(jc8Var, xzbVar), J(jc8Var2, xzbVar2));
    }

    public static boolean E(dp8 dp8Var, dp8 dp8Var2, xzb xzbVar, xzb xzbVar2) {
        if (dp8Var.getId() != null && dp8Var2.getId() != null && !Intrinsics.d(dp8Var.getId(), dp8Var2.getId()) && (dp8Var.A() != null || dp8Var.D() != null || dp8Var.E() != null || dp8Var2.A() != null || dp8Var2.D() != null || dp8Var2.E() != null)) {
            return false;
        }
        if (!(dp8Var instanceof yu8) || !(dp8Var2 instanceof yu8) || Intrinsics.d(((yu8) dp8Var).j, ((yu8) dp8Var2).j)) {
            if ((dp8Var instanceof jt8) && (dp8Var2 instanceof jt8)) {
                jt8 jt8Var = (jt8) dp8Var;
                Object a2 = jt8Var.I.a(xzbVar);
                gt8 gt8Var = gt8.OVERLAP;
                jt8 jt8Var2 = (jt8) dp8Var2;
                if ((a2 == gt8Var) == (jt8Var2.I.a(xzbVar2) == gt8Var) && vq1.c0(jt8Var, xzbVar) == vq1.c0(jt8Var2, xzbVar2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static BaseInterpolator F(m2a m2aVar) {
        int ordinal = m2aVar.ordinal();
        if (ordinal == 0) {
            return new LinearInterpolator();
        }
        if (ordinal == 1) {
            return new AccelerateInterpolator();
        }
        if (ordinal == 2) {
            return new DecelerateInterpolator();
        }
        if (ordinal == 3) {
            return new AccelerateDecelerateInterpolator();
        }
        b6e.s();
        return null;
    }

    public static HttpURLConnection G(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            jj4.j("null cannot be cast to non-null type java.net.HttpURLConnection");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        if (ood.l == null) {
            ood.l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "12.2.0"}, 2));
        }
        httpURLConnection.setRequestProperty(HttpMessage.USER_AGENT, ood.l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    public static ArrayList H(qod qodVar) {
        Exception exc;
        HttpURLConnection httpURLConnection;
        ArrayList arrayList;
        qodVar.getClass();
        wxf.G(qodVar);
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = a0(qodVar);
            exc = null;
        } catch (Exception e2) {
            exc = e2;
            httpURLConnection = null;
        } catch (Throwable th) {
            th = th;
            gvt.j(httpURLConnection2);
            throw th;
        }
        try {
            if (httpURLConnection != null) {
                arrayList = I(qodVar, httpURLConnection);
            } else {
                ArrayList x = xp3.x(qodVar.c, null, new c3c(exc));
                W(qodVar, x);
                arrayList = x;
            }
            gvt.j(httpURLConnection);
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            gvt.j(httpURLConnection2);
            throw th;
        }
    }

    public static ArrayList I(qod qodVar, HttpURLConnection httpURLConnection) {
        ArrayList x;
        qodVar.getClass();
        InputStream inputStream = null;
        try {
            try {
            } catch (c3c e2) {
                HashMap hashMap = lsg.d;
                synchronized (j3c.a) {
                    x = xp3.x(qodVar, httpURLConnection, e2);
                }
            } catch (Exception e3) {
                HashMap hashMap2 = lsg.d;
                synchronized (j3c.a) {
                    x = xp3.x(qodVar, httpURLConnection, new c3c(e3));
                }
            }
            if (!j3c.h()) {
                Log.e("rod", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new c3c("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            }
            inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            x = xp3.A(inputStream, httpURLConnection, qodVar);
            gvt.d(inputStream);
            httpURLConnection.disconnect();
            int size = qodVar.c.size();
            if (size != x.size()) {
                throw new c3c(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(x.size()), Integer.valueOf(size)}, 2)));
            }
            W(qodVar, x);
            gs4 o = gs4.i.o();
            ja jaVar = (ja) o.a;
            if (jaVar != null) {
                long time = new Date().getTime();
                if (jaVar.f.a && time - ((Date) o.c).getTime() > 3600000 && time - jaVar.g.getTime() > 86400000) {
                    if (Intrinsics.d(Looper.getMainLooper(), Looper.myLooper())) {
                        o.Q();
                    } else {
                        new Handler(Looper.getMainLooper()).post(new q9(1, o));
                    }
                }
            }
            return x;
        } catch (Throwable th) {
            gvt.d(null);
            throw th;
        }
    }

    public static List J(jc8 jc8Var, xzb xzbVar) {
        if (jc8Var instanceof cb8) {
            jt8 jt8Var = ((cb8) jc8Var).c;
            return qwp.x(jt8Var.B, jt8Var.z, xzbVar);
        }
        if (jc8Var instanceof gb8) {
            List list = ((gb8) jc8Var).c.y;
            if (list == null) {
                list = c5b.a;
            }
            return qwp.r0(list, xzbVar);
        }
        if (jc8Var instanceof hb8) {
            return c5b.a;
        }
        if (jc8Var instanceof fb8) {
            return c5b.a;
        }
        if (jc8Var instanceof rb8) {
            return c5b.a;
        }
        if (jc8Var instanceof mb8) {
            return c5b.a;
        }
        if (jc8Var instanceof eb8) {
            return c5b.a;
        }
        if (jc8Var instanceof kb8) {
            return c5b.a;
        }
        if (jc8Var instanceof qb8) {
            return c5b.a;
        }
        if (jc8Var instanceof ob8) {
            return c5b.a;
        }
        if (jc8Var instanceof db8) {
            return c5b.a;
        }
        if (jc8Var instanceof jb8) {
            return c5b.a;
        }
        if (jc8Var instanceof lb8) {
            return c5b.a;
        }
        if (jc8Var instanceof ib8) {
            return c5b.a;
        }
        if (jc8Var instanceof nb8) {
            return c5b.a;
        }
        if (jc8Var instanceof sb8) {
            return c5b.a;
        }
        if (jc8Var instanceof pb8) {
            return c5b.a;
        }
        b6e.s();
        return null;
    }

    public static jzb K(List list, List list2) {
        jzb jzbVar;
        jzb jzbVar2;
        list.getClass();
        list2.getClass();
        n8e.i0.getClass();
        m8e.c.await();
        if (m8e.b.h()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                hs5 hs5Var = (hs5) it.next();
                jzb.b.getClass();
                switch (hs5Var.a.ordinal()) {
                    case 0:
                        jzbVar2 = jzb.e;
                        break;
                    case 1:
                        jzbVar2 = jzb.d;
                        break;
                    case 2:
                        jzbVar2 = jzb.c;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        jzbVar2 = null;
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                if (jzbVar2 != null) {
                    return jzbVar2;
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                h94 h94Var = (h94) it2.next();
                jzb.b.getClass();
                int ordinal = h94Var.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    jzbVar = null;
                } else if (ordinal == 3) {
                    jzbVar = jzb.c;
                } else {
                    if (ordinal != 4) {
                        b6e.s();
                        return null;
                    }
                    jzbVar = jzb.d;
                }
                if (jzbVar != null) {
                    return jzbVar;
                }
            }
        }
        return null;
    }

    public static cak M(String str) {
        str.getClass();
        pn3 pn3Var = h.a;
        hi3 hi3Var = new hi3();
        hi3Var.S0(str);
        return h.d(hi3Var, false);
    }

    public static cak N(File file) {
        String str = cak.b;
        file.getClass();
        String file2 = file.toString();
        file2.getClass();
        return M(file2);
    }

    public static boolean P(rv8 rv8Var, rv8 rv8Var2, long j2, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (rv8Var == null) {
            return false;
        }
        Iterator it = rv8Var.c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((qv8) obj2).b == j2) {
                break;
            }
        }
        qv8 qv8Var = (qv8) obj2;
        Iterator it2 = rv8Var2.c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((qv8) next).b == j2) {
                obj = next;
                break;
            }
        }
        qv8 qv8Var2 = (qv8) obj;
        if (qv8Var == null || qv8Var2 == null) {
            return false;
        }
        return B(qv8Var.a, qv8Var2.a, xzbVar, xzbVar2);
    }

    public static boolean Q(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof nod);
    }

    public static boolean R(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static ood S(ja jaVar, String str, JSONObject jSONObject, lod lodVar) {
        ood oodVar = new ood(jaVar, str, null, z6e.b, lodVar, 0);
        oodVar.c = jSONObject;
        return oodVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void T(JSONObject jSONObject, String str, mod modVar) {
        String str2;
        boolean z;
        Iterator<String> keys;
        Matcher matcher = ood.k.matcher(str);
        if (matcher.matches()) {
            str2 = matcher.group(1);
            str2.getClass();
        } else {
            str2 = str;
        }
        if (c.v(str2, "me/", false) || c.v(str2, "/me/", false)) {
            int T = StringsKt.T(str, StringUtils.PROCESS_POSTFIX_DELIMITER, 0, false, 6);
            int T2 = StringsKt.T(str, "?", 0, false, 6);
            if (T > 3 && (T2 == -1 || T < T2)) {
                z = true;
                keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    boolean z2 = z && c.o(next, "image", true);
                    next.getClass();
                    opt.getClass();
                    U(next, opt, modVar, z2);
                }
            }
        }
        z = false;
        keys = jSONObject.keys();
        while (keys.hasNext()) {
        }
    }

    public static void U(String str, Object obj, mod modVar, boolean z) {
        Class<?> cls = obj.getClass();
        if (!JSONObject.class.isAssignableFrom(cls)) {
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2));
                    Object opt = jSONArray.opt(i2);
                    opt.getClass();
                    U(format, opt, modVar, z);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                modVar.a(str, obj.toString());
                return;
            } else {
                if (Date.class.isAssignableFrom(cls)) {
                    String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    format2.getClass();
                    modVar.a(str, format2);
                    return;
                }
                return;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (z) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String format3 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                Object opt2 = jSONObject.opt(next);
                opt2.getClass();
                U(format3, opt2, modVar, z);
            }
            return;
        }
        if (jSONObject.has(ConnectableDevice.KEY_ID)) {
            String optString = jSONObject.optString(ConnectableDevice.KEY_ID);
            optString.getClass();
            U(str, optString, modVar, z);
        } else if (jSONObject.has("url")) {
            String optString2 = jSONObject.optString("url");
            optString2.getClass();
            U(str, optString2, modVar, z);
        } else if (jSONObject.has("fbsdk:create_object")) {
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            U(str, jSONObject2, modVar, z);
        }
    }

    public static void V(qod qodVar, lsg lsgVar, int i2, URL url, FilterOutputStream filterOutputStream, boolean z) {
        String c2;
        kj3 kj3Var = new kj3(filterOutputStream, lsgVar, z);
        if (i2 == 1) {
            ood oodVar = (ood) qodVar.c.get(0);
            HashMap hashMap = new HashMap();
            for (String str : oodVar.d.keySet()) {
                Object obj = oodVar.d.get(str);
                if (Q(obj)) {
                    str.getClass();
                    hashMap.put(str, new kod(oodVar, obj));
                }
            }
            lsgVar.a();
            Bundle bundle = oodVar.d;
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (R(obj2)) {
                    str2.getClass();
                    kj3Var.j(str2, obj2, oodVar);
                }
            }
            lsgVar.a();
            X(hashMap, kj3Var);
            JSONObject jSONObject = oodVar.c;
            if (jSONObject != null) {
                String path = url.getPath();
                path.getClass();
                T(jSONObject, path, kj3Var);
                return;
            }
            return;
        }
        qodVar.getClass();
        Iterator<E> it = qodVar.iterator();
        while (true) {
            if (it.hasNext()) {
                ja jaVar = ((ood) it.next()).a;
                if (jaVar != null) {
                    c2 = jaVar.h;
                    break;
                }
            } else {
                String str3 = ood.j;
                c2 = j3c.c();
                break;
            }
        }
        if (c2.length() == 0) {
            throw new c3c("App ID was not specified at the request or Settings.");
        }
        kj3Var.a("batch_app_id", c2);
        HashMap hashMap2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = qodVar.iterator();
        while (it2.hasNext()) {
            ood oodVar2 = (ood) it2.next();
            oodVar2.getClass();
            String str4 = ood.j;
            JSONObject jSONObject2 = new JSONObject();
            Collection collection = qjp.a;
            String h2 = oodVar2.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{j3c.f()}, 1)));
            oodVar2.a();
            Uri parse = Uri.parse(oodVar2.b(h2, true));
            parse.getClass();
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            jSONObject2.put("relative_url", format);
            jSONObject2.put("method", oodVar2.g);
            ja jaVar2 = oodVar2.a;
            if (jaVar2 != null) {
                lsg.e.V(jaVar2.e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = oodVar2.d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = oodVar2.d.get(it3.next());
                if (Q(obj3)) {
                    String format2 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(hashMap2.size())}, 2));
                    arrayList.add(format2);
                    hashMap2.put(format2, new kod(oodVar2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(StringUtils.COMMA, arrayList));
            }
            JSONObject jSONObject3 = oodVar2.c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                T(jSONObject3, format, new pz0(arrayList2));
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
        }
        String jSONArray2 = jSONArray.toString();
        jSONArray2.getClass();
        kj3Var.a("batch", jSONArray2);
        lsgVar.a();
        X(hashMap2, kj3Var);
    }

    public static void W(qod qodVar, ArrayList arrayList) {
        qodVar.getClass();
        ArrayList arrayList2 = qodVar.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            ood oodVar = (ood) arrayList2.get(i2);
            if (oodVar.f != null) {
                arrayList3.add(new android.util.Pair(oodVar.f, arrayList.get(i2)));
            }
        }
        if (arrayList3.size() > 0) {
            pv7 pv7Var = new pv7(arrayList3, qodVar, false, 11);
            Handler handler = qodVar.a;
            if (handler != null) {
                handler.post(pv7Var);
            } else {
                pv7Var.run();
            }
        }
    }

    public static void X(HashMap hashMap, kj3 kj3Var) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = ood.j;
            if (Q(((kod) entry.getValue()).b)) {
                kj3Var.j((String) entry.getKey(), ((kod) entry.getValue()).b, ((kod) entry.getValue()).a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static void Y(qod qodVar, HttpURLConnection httpURLConnection) {
        boolean z;
        ?? r3;
        Throwable th;
        qodVar.getClass();
        lsg lsgVar = new lsg();
        ArrayList arrayList = qodVar.c;
        int size = arrayList.size();
        Iterator it = qodVar.iterator();
        loop0: while (true) {
            z = true;
            if (!it.hasNext()) {
                r3 = 1;
                break;
            }
            ood oodVar = (ood) it.next();
            Iterator<String> it2 = oodVar.d.keySet().iterator();
            while (it2.hasNext()) {
                if (Q(oodVar.d.get(it2.next()))) {
                    r3 = 1;
                    z = false;
                    break loop0;
                }
            }
        }
        FilterOutputStream filterOutputStream = null;
        z6e z6eVar = size == r3 ? ((ood) arrayList.get(0)).g : null;
        z6e z6eVar2 = z6e.b;
        if (z6eVar == null) {
            z6eVar = z6eVar2;
        }
        httpURLConnection.setRequestMethod(z6eVar.name());
        if (z) {
            httpURLConnection.setRequestProperty(HttpMessage.CONTENT_TYPE_HEADER, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty(HttpMessage.CONTENT_TYPE_HEADER, String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{ood.j}, (int) r3)));
        }
        boolean z2 = r3;
        URL url = httpURLConnection.getURL();
        lsgVar.a();
        qodVar.b.getClass();
        lsgVar.a();
        url.getClass();
        lsgVar.a();
        httpURLConnection.getRequestMethod().getClass();
        lsgVar.a();
        httpURLConnection.getRequestProperty(HttpMessage.USER_AGENT).getClass();
        lsgVar.a();
        httpURLConnection.getRequestProperty(HttpMessage.CONTENT_TYPE_HEADER).getClass();
        lsgVar.a();
        httpURLConnection.setConnectTimeout(0);
        httpURLConnection.setReadTimeout(0);
        String str = lsgVar.b;
        tsg tsgVar = lsgVar.a;
        if (z6eVar != z6eVar2) {
            b3i.Q(tsgVar, str, lsgVar.c.toString());
            lsgVar.c = new StringBuilder();
            return;
        }
        httpURLConnection.setDoOutput(z2);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (z) {
                try {
                    filterOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    filterOutputStream = bufferedOutputStream;
                    if (filterOutputStream == null) {
                        throw th;
                    }
                    filterOutputStream.close();
                    throw th;
                }
            } else {
                filterOutputStream = bufferedOutputStream;
            }
            Iterator it3 = qodVar.d.iterator();
            while (it3.hasNext()) {
            }
            Iterator it4 = qodVar.iterator();
            while (it4.hasNext()) {
                lod lodVar = ((ood) it4.next()).f;
            }
            V(qodVar, lsgVar, size, url, filterOutputStream, z);
            filterOutputStream.close();
            b3i.Q(tsgVar, str, lsgVar.c.toString());
            lsgVar.c = new StringBuilder();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static co6 Z(e5d e5dVar) {
        String str = e5dVar.e;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        str.getClass();
        webPath$Storage.getClass();
        return new co6(etn.B(str, webPath$Storage), qo6.i, null);
    }

    public static HttpURLConnection a0(qod qodVar) {
        URL url;
        qodVar.getClass();
        Iterator<E> it = qodVar.iterator();
        while (true) {
            HttpURLConnection httpURLConnection = null;
            if (!it.hasNext()) {
                try {
                    if (qodVar.c.size() == 1) {
                        url = new URL(((ood) qodVar.c.get(0)).g());
                    } else {
                        Collection collection = qjp.a;
                        url = new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{j3c.f()}, 1)));
                    }
                    try {
                        httpURLConnection = G(url);
                        Y(qodVar, httpURLConnection);
                        return httpURLConnection;
                    } catch (IOException e2) {
                        gvt.j(httpURLConnection);
                        throw new c3c("could not construct request body", e2);
                    } catch (JSONException e3) {
                        gvt.j(httpURLConnection);
                        throw new c3c("could not construct request body", e3);
                    }
                } catch (MalformedURLException e4) {
                    throw new c3c("could not construct URL for request", e4);
                }
            }
            ood oodVar = (ood) it.next();
            if (z6e.a == oodVar.g) {
                String str = oodVar.e;
                if (str != null && str.length() != 0) {
                    if (c.v(str, "v", false)) {
                        str = str.substring(1);
                    }
                    Object[] array = new Regex("\\.").g(0, str).toArray(new String[0]);
                    if (array == null) {
                        jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                        return null;
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length >= 2) {
                        if (Integer.parseInt(strArr[0]) > 2) {
                        }
                    }
                    if (Integer.parseInt(strArr[0]) >= 2 && Integer.parseInt(strArr[1]) >= 4) {
                    }
                }
                if (!oodVar.d.containsKey("fields") || gvt.D(oodVar.d.getString("fields"))) {
                    HashMap hashMap = lsg.d;
                    synchronized (j3c.a) {
                    }
                }
            }
        }
    }

    public static final float v(float f2, float[] fArr, float[] fArr2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float abs = Math.abs(f2);
        float signum = Math.signum(f2);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i2 = -(binarySearch + 1);
        int i3 = i2 - 1;
        if (i3 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f2;
        }
        if (i3 == -1) {
            float f9 = fArr[0];
            f5 = fArr2[0];
            f6 = f9;
            f4 = 0.0f;
            f3 = 0.0f;
        } else {
            float f10 = fArr[i3];
            float f11 = fArr[i2];
            f3 = fArr2[i3];
            f4 = f10;
            f5 = fArr2[i2];
            f6 = f11;
        }
        return (((f5 - f3) * Math.max(0.0f, Math.min(1.0f, f4 == f6 ? 0.0f : (abs - f4) / (f6 - f4)))) + f3) * signum;
    }

    public static final String y(Object obj) {
        String str = ood.j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (!(obj instanceof Date)) {
            xq0.x("Unsupported parameter type.");
            return null;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        format.getClass();
        return format;
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Object k2 = rdkVar.k(new m5n(nj2.class, Executor.class));
        k2.getClass();
        return u2x.E((Executor) k2);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        File[] fileArr;
        if (z) {
            synchronized (ap6.d) {
                try {
                    HashSet hashSet = j3c.a;
                    if (gtt.c()) {
                        klx.c0();
                    }
                    int i2 = 0;
                    if (ap6.c != null) {
                        Log.w("ap6", "Already enabled!");
                    } else {
                        ap6 ap6Var = new ap6(i2, Thread.getDefaultUncaughtExceptionHandler());
                        ap6.c = ap6Var;
                        Thread.setDefaultUncaughtExceptionHandler(ap6Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (x6c.b(v6c.CrashShield)) {
                wct.h = true;
                if (gtt.c() && !gvt.B()) {
                    File m0 = zsd.m0();
                    if (m0 != null) {
                        fileArr = m0.listFiles(ngb.d);
                        if (fileArr == null) {
                            fileArr = new File[0];
                        }
                    } else {
                        fileArr = new File[0];
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file : fileArr) {
                        dpe I = ox6.I(file);
                        if (I.a()) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("crash_shield", I.toString());
                                String str = ood.j;
                                arrayList.add(S(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{j3c.c()}, 1)), jSONObject, new qa(3, I)));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        qod qodVar = new qod(arrayList);
                        String str2 = ood.j;
                        wxf.G(qodVar);
                        new pod(qodVar).executeOnExecutor(j3c.d(), new Void[0]);
                    }
                }
                bp6.b = true;
            }
            x6c.b(v6c.ThreadCheck);
        }
    }

    public void O(float f2, float f3, float f4, xup xupVar) {
        xupVar.d(f2, 0.0f);
    }

    @Override // defpackage.ru7
    public boolean b(SSLSocket sSLSocket) {
        return c.v(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    @Override // defpackage.al2
    public yk2 create(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        HashMap hashMap = new HashMap(8);
        hashMap.put(0, 1000000L);
        hashMap.put(2, -9223372036854775807L);
        hashMap.put(3, -9223372036854775807L);
        hashMap.put(4, -9223372036854775807L);
        hashMap.put(5, -9223372036854775807L);
        hashMap.put(10, -9223372036854775807L);
        hashMap.put(9, -9223372036854775807L);
        hashMap.put(7, -9223372036854775807L);
        return new jk7(applicationContext, hashMap);
    }

    @Override // defpackage.hv3
    public void d(Context context, hxo hxoVar) {
        context.getClass();
    }

    @Override // defpackage.nsd
    public boolean e(lmq lmqVar) {
        x97 x97Var = lmqVar.a;
        if ((x97Var instanceof q38 ? ((q38) x97Var).n : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        x97 x97Var2 = lmqVar.b;
        return (x97Var2 instanceof q38 ? ((q38) x97Var2).n : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.jd6
    public long f(long j2, long j3) {
        float B = irf.B(j2, j3);
        long floatToRawIntBits = (Float.floatToRawIntBits(B) << 32) | (4294967295L & Float.floatToRawIntBits(B));
        int i2 = sso.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        if (faqVar instanceof naq) {
            return ((naq) faqVar).e.x0;
        }
        if (faqVar instanceof saq) {
            return ((saq) faqVar).e.o;
        }
        if (faqVar instanceof daq) {
            return Z(((daq) faqVar).e);
        }
        if (!(faqVar instanceof qaq)) {
            b6e.s();
            return null;
        }
        String str = ((qaq) faqVar).c.f;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        webPath$Storage.getClass();
        return new co6(etn.B(str, webPath$Storage), qo6.a, null);
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return jzsVar.a.x0;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            return ((c2q) m1qVar).d.x0;
        }
        if (m1qVar instanceof j1q) {
            return Z(((j1q) m1qVar).d);
        }
        if (!(m1qVar instanceof e2q)) {
            b6e.s();
            return null;
        }
        String str = ((e2q) m1qVar).c.f;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        webPath$Storage.getClass();
        return new co6(etn.B(str, webPath$Storage), qo6.a, null);
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return i5uVar.a.o;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return Z(k4dVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [xci] */
    /* JADX WARN: Type inference failed for: r8v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [xci] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.b8j
    public boolean l(xci xciVar) {
        ?? r1 = 0;
        while (true) {
            int i2 = 0;
            if (xciVar == 0) {
                return false;
            }
            if (xciVar instanceof ofm) {
                ((ofm) xciVar).y();
            } else if ((xciVar.c & 16) != 0 && (xciVar instanceof cw7)) {
                xci xciVar2 = xciVar.p;
                r1 = r1;
                xciVar = xciVar;
                while (xciVar2 != null) {
                    if ((xciVar2.c & 16) != 0) {
                        i2++;
                        r1 = r1;
                        if (i2 == 1) {
                            xciVar = xciVar2;
                        } else {
                            if (r1 == 0) {
                                r1 = new eqi(new xci[16]);
                            }
                            if (xciVar != 0) {
                                r1.d(xciVar);
                                xciVar = 0;
                            }
                            r1.d(xciVar2);
                        }
                    }
                    xciVar2 = xciVar2.f;
                    r1 = r1;
                    xciVar = xciVar;
                }
                if (i2 == 1) {
                }
            }
            xciVar = bcx.p(r1);
        }
    }

    @Override // defpackage.pf1
    public int m(boolean z) {
        return z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action;
    }

    @Override // defpackage.nsd
    public boolean n() {
        boolean z;
        synchronized (q9c.a) {
            try {
                int i2 = q9c.c;
                q9c.c = i2 + 1;
                if (i2 >= 30 || SystemClock.uptimeMillis() > q9c.d + 30000) {
                    q9c.c = 0;
                    q9c.d = SystemClock.uptimeMillis();
                    String[] list = q9c.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    q9c.e = list.length < 800;
                }
                z = q9c.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ng3
    public Rect p(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            invoke.getClass();
            return new Rect((Rect) invoke);
        } catch (Exception e2) {
            if (e2 instanceof NoSuchFieldException ? true : e2 instanceof NoSuchMethodException ? true : e2 instanceof IllegalAccessException ? true : e2 instanceof InvocationTargetException) {
                return og3.b.p(activity);
            }
            throw e2;
        }
    }

    @Override // defpackage.b8j
    public int s() {
        return 16;
    }

    @Override // defpackage.ru7
    public y2r t(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                xq0.w(tlm.j("No OpenSSLSocketImpl superclass of socket of type ", cls));
                return null;
            }
        }
        return new wi0(cls2);
    }

    public void u(jz3 jz3Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(508037008);
        int i3 = (oq5Var.h(jz3Var) ? 4 : 2) | i2;
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            g0g.y(new eku(ges.b(nu0.j(), 0L, v7g.z(18), null, null, 0L, 0, 0L, null, null, 0, 0, 16777213), c3x.h(4280953386L), c3x.h(4294967295L), d85.f), jz3Var, oq5Var, (i3 << 3) & 112);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(this, jz3Var, i2, 16);
        }
    }

    @Override // defpackage.b8j
    public void w(mpf mpfVar, long j2, gzd gzdVar, int i2, boolean z) {
        mpfVar.z(j2, gzdVar, i2, z);
    }

    @Override // defpackage.b8j
    public boolean x(mpf mpfVar) {
        return true;
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
    }
}
