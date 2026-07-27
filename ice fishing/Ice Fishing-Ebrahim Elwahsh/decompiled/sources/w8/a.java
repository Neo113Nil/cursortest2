package w8;

import D5.c;
import E7.l;
import E7.p;
import I6.g;
import L2.i;
import N6.b;
import O6.e;
import O7.AbstractC0376a;
import W6.k;
import a7.f;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.exoplayer.k.o;
import com.google.android.gms.internal.ads.AbstractC3298hB;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.InterfaceC3352iB;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3260ga;
import com.google.android.gms.internal.ads.TA;
import com.google.android.gms.internal.ads.Ut;
import e8.v;
import e8.w;
import e8.y;
import g6.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import p2.j;
import q2.C4907p;
import q2.r;
import t2.C;
import t2.G;
import v7.C5139j;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.C5180b;
import w7.C5181c;
import w7.C5182d;
import w7.C5183e;
import x7.AbstractC5217a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static f c(Map extraHttpHeaders, String appId, String apiBaseUrl, boolean z8) {
        Duration ofSeconds;
        long nanos;
        O6.f fVar;
        SSLContext sSLContext;
        h.e(extraHttpHeaders, "extraHttpHeaders");
        h.e(appId, "appId");
        h.e(apiBaseUrl, "apiBaseUrl");
        String endpoint = apiBaseUrl + "sdk/log?app_id=" + appId;
        h.e(endpoint, "endpoint");
        g gVar = new g();
        HashMap hashMap = gVar.f1280e;
        hashMap.put("User-Agent", "OTel-OTLP-Exporter-Java/1.55.0");
        for (Map.Entry entry : extraHttpHeaders.entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            URI uri = new URI(endpoint);
            if (uri.getScheme() == null || !(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                throw new IllegalArgumentException("Invalid endpoint, must start with http:// or https://: " + uri);
            }
            gVar.f1277b = uri.toString();
            ofSeconds = Duration.ofSeconds(10L);
            Objects.requireNonNull(ofSeconds, "timeout");
            nanos = ofSeconds.toNanos();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            Objects.requireNonNull(timeUnit, "unit");
            d.a("timeout must be non-negative", nanos >= 0);
            gVar.f1278c = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
            I6.d dVar = new I6.d(gVar);
            boolean startsWith = gVar.f1277b.startsWith("http://");
            HashMap hashMap2 = new HashMap();
            Iterator it = ServiceLoader.load(O6.f.class, (ClassLoader) gVar.f1285k.f37856u).iterator();
            while (it.hasNext()) {
                O6.f fVar2 = (O6.f) it.next();
                hashMap2.put(fVar2.getClass().getName(), fVar2);
            }
            if (hashMap2.isEmpty()) {
                throw new IllegalStateException("No HttpSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-jdk");
            }
            int size = hashMap2.size();
            Logger logger = g.f1275l;
            if (size == 1) {
                fVar = (O6.f) hashMap2.values().stream().findFirst().get();
            } else {
                String b9 = d.b("io.opentelemetry.exporter.internal.http.HttpSenderProvider", "");
                if (b9.isEmpty()) {
                    logger.log(Level.WARNING, "Multiple HttpSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.http.HttpSenderProvider to the FQCN of the preferred provider.");
                    fVar = (O6.f) hashMap2.values().stream().findFirst().get();
                } else {
                    if (!hashMap2.containsKey(b9)) {
                        throw new IllegalStateException("No HttpSenderProvider matched configured io.opentelemetry.exporter.internal.http.HttpSenderProvider: ".concat(b9));
                    }
                    fVar = (O6.f) hashMap2.get(b9);
                }
            }
            String str = gVar.f1277b;
            long j9 = gVar.f1278c;
            i iVar = gVar.f1282g;
            if (startsWith) {
                sSLContext = null;
            } else {
                iVar.getClass();
                try {
                    SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                    sSLContext2.init(null, null, null);
                    sSLContext = sSLContext2;
                } catch (KeyManagementException | NoSuchAlgorithmException e6) {
                    throw new IllegalArgumentException(e6);
                }
            }
            if (!startsWith) {
                iVar.getClass();
            }
            if (str == null) {
                throw new NullPointerException("Null endpoint");
            }
            fVar.getClass();
            e eVar = new e(str, j9, gVar.f1279d, dVar, gVar.f1283h, sSLContext);
            logger.log(Level.FINE, "Using HttpSender: ".concat(e.class.getName()));
            b bVar = new b(gVar, new I6.b(new k(gVar.f1276a), eVar, gVar.i, gVar.f1284j, gVar.f1277b));
            return z8 ? new c(bVar) : bVar;
        } catch (URISyntaxException e9) {
            throw new IllegalArgumentException("Invalid endpoint, must be a URL: ".concat(endpoint), e9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC5133d d(p pVar, AbstractC0376a abstractC0376a, AbstractC0376a abstractC0376a2) {
        h.e(pVar, "<this>");
        if (pVar instanceof AbstractC5217a) {
            return ((AbstractC5217a) pVar).create(abstractC0376a, abstractC0376a2);
        }
        C5139j c5139j = C5139j.f41372n;
        InterfaceC5138i interfaceC5138i = abstractC0376a2.f2578v;
        return interfaceC5138i == c5139j ? new C5180b(pVar, abstractC0376a2, abstractC0376a) : new C5181c(abstractC0376a2, interfaceC5138i, pVar, abstractC0376a);
    }

    public static InterfaceC5133d f(InterfaceC5133d interfaceC5133d) {
        InterfaceC5133d intercepted;
        h.e(interfaceC5133d, "<this>");
        AbstractC5219c abstractC5219c = interfaceC5133d instanceof AbstractC5219c ? (AbstractC5219c) interfaceC5133d : null;
        return (abstractC5219c == null || (intercepted = abstractC5219c.intercepted()) == null) ? interfaceC5133d : intercepted;
    }

    public static void g(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void h(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e6) {
                l(cls, e6);
                throw null;
            } catch (InstantiationException e9) {
                l(cls, e9);
                throw null;
            } catch (NoSuchMethodException e10) {
                l(cls, e10);
                throw null;
            } catch (InvocationTargetException e11) {
                l(cls, e11);
                throw null;
            }
        } catch (ClassNotFoundException e12) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e12);
        }
    }

    public static final w k(w wVar) {
        h.e(wVar, "<this>");
        v b9 = wVar.b();
        y yVar = wVar.f37536z;
        b9.f37514g = new f8.a(yVar.j(), yVar.b());
        return b9.a();
    }

    public static void l(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static Object m(p pVar, Object obj, InterfaceC5133d interfaceC5133d) {
        h.e(pVar, "<this>");
        InterfaceC5138i context = interfaceC5133d.getContext();
        Object c5182d = context == C5139j.f41372n ? new C5182d(interfaceC5133d) : new C5183e(interfaceC5133d, context);
        u.b(2, pVar);
        return pVar.invoke(obj, c5182d);
    }

    public static boolean n(int i) {
        C3151ea c3151ea = AbstractC3368ia.f31756p4;
        r rVar = r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            return ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31765q4)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|4|5|(5:8|9|10|11|6)|66|67|68|69|(1:71)(1:74)|72|14|(7:58|59|17|18|19|20|(10:22|(8:26|27|(2:29|(1:31)(1:49))(1:50)|32|33|(3:42|43|(1:45))|35|(2:37|38))|51|27|(0)(0)|32|33|(0)|35|(0))(10:52|(8:54|27|(0)(0)|32|33|(0)|35|(0))|51|27|(0)(0)|32|33|(0)|35|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        r3 = t2.C.f40822b;
        u2.i.d("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153 A[Catch: JSONException -> 0x014c, TRY_LEAVE, TryCatch #6 {JSONException -> 0x014c, blocks: (B:19:0x011b, B:31:0x0148, B:49:0x014e, B:50:0x0153), top: B:18:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject o(Context context, View view) {
        int i;
        ViewParent parent;
        String str;
        int hashCode;
        int i4;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            int i9 = 1;
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i9;
                    try {
                        iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                        iArr2[i] = Math.min(viewGroup.getMeasuredHeight(), iArr2[i]);
                        parent2 = parent2.getParent();
                        i9 = i;
                    } catch (Exception unused) {
                        int i10 = C.f40822b;
                        u2.i.f("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                        }
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    }
                }
                i = i9;
                JSONObject jSONObject3 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                C4907p c4907p = C4907p.f40108g;
                u2.d dVar = c4907p.f40109a;
                u2.d dVar2 = c4907p.f40109a;
                jSONObject3.put("width", dVar.h(context, measuredWidth));
                jSONObject3.put("height", dVar2.h(context, view.getMeasuredHeight()));
                jSONObject3.put("x", dVar2.h(context, iArr[0]));
                jSONObject3.put("y", dVar2.h(context, iArr[i]));
                jSONObject3.put("maximum_visible_width", dVar2.h(context, iArr2[0]));
                jSONObject3.put("maximum_visible_height", dVar2.h(context, iArr2[i]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = w(context, rect);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", dVar2.h(context, iArr[0]));
                    jSONObject4.put("y", dVar2.h(context, iArr[i]));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception unused2) {
                i = i9;
            }
            parent = view.getParent();
            if (parent != null) {
                try {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent, new Object[0]);
                } catch (IllegalAccessException e6) {
                    e = e6;
                    int i11 = C.f40822b;
                    u2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (NoSuchMethodException unused3) {
                } catch (SecurityException e9) {
                    e = e9;
                    int i112 = C.f40822b;
                    u2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (InvocationTargetException e10) {
                    e = e10;
                    int i1122 = C.f40822b;
                    u2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        i4 = i;
                        if (i4 != 0) {
                            jSONObject2.put("native_template_type", i);
                        } else if (i4 != i) {
                            jSONObject2.put("native_template_type", 0);
                        } else {
                            jSONObject2.put("native_template_type", 2);
                        }
                        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.c9)).booleanValue()) {
                            try {
                                if (view.getLayoutParams() != null) {
                                    jSONObject2.put("view_width_layout_type", x(r0.width) - 1);
                                    jSONObject2.put("view_height_layout_type", x(r0.height) - 1);
                                }
                            } catch (Exception unused4) {
                                C.k("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.g9)).booleanValue()) {
                            try {
                                jSONObject2.put("alpha", view.getAlpha());
                            } catch (JSONException e11) {
                                int i12 = C.f40822b;
                                u2.i.d("Could not log container view alpha signal to JSON", e11);
                            }
                        }
                    }
                    i4 = -1;
                    if (i4 != 0) {
                    }
                    if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.c9)).booleanValue()) {
                    }
                    if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.g9)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        i4 = 0;
                        if (i4 != 0) {
                        }
                        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.c9)).booleanValue()) {
                        }
                        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.g9)).booleanValue()) {
                        }
                    }
                    i4 = -1;
                    if (i4 != 0) {
                    }
                    if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.c9)).booleanValue()) {
                    }
                    if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.g9)).booleanValue()) {
                    }
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode == -2066603854) {
            }
        }
        return jSONObject2;
    }

    public static JSONObject p(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C3151ea c3151ea = AbstractC3368ia.Y8;
                r rVar = r.f40116e;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar.f40119c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue()) {
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.Z8)).booleanValue()) {
                        G g9 = j.f39798C.f39803c;
                        jSONObject.put("contained_in_scroll_view", G.a(view) != 0);
                    }
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.a9)).booleanValue()) {
                        G g10 = j.f39798C.f39803c;
                        jSONObject.put("scroll_view_type", G.a(view));
                        return jSONObject;
                    }
                } else {
                    G g11 = j.f39798C.f39803c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject q(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                G g9 = j.f39798C.f39803c;
                jSONObject.put("can_show_on_lock_screen", G.K(view));
                boolean z8 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z8 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z8);
                return jSONObject;
            } catch (JSONException unused) {
                int i = C.f40822b;
                u2.i.f("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject r(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        int[] iArr;
        JSONObject jSONObject;
        ViewGroup.LayoutParams layoutParams;
        String str2 = "ad_view";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            C4907p c4907p = C4907p.f40108g;
                            u2.d dVar = c4907p.f40109a;
                            u2.d dVar2 = c4907p.f40109a;
                            jSONObject4.put("width", dVar.h(context, measuredWidth));
                            jSONObject4.put("height", dVar2.h(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", dVar2.h(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", dVar2.h(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", str2);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = w(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", dVar2.h(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", dVar2.h(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", str2);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                C3151ea c3151ea = AbstractC3368ia.b9;
                                r rVar = r.f40116e;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar.f40119c;
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.c9)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject3.put("view_width_layout_type", x(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", x(layoutParams.height) - 1);
                                }
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.f9)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str2;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put(o.f8603c, textView.getText());
                                } catch (JSONException unused) {
                                    int i4 = C.f40822b;
                                    u2.i.f("Unable to get asset views information");
                                    it = it2;
                                    str2 = str;
                                    iArr2 = iArr;
                                    i = 2;
                                }
                            } else {
                                str = str2;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.g9)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str2;
                        }
                    } catch (JSONException unused3) {
                        str = str2;
                        iArr = iArr2;
                    }
                    it = it2;
                    str2 = str;
                    iArr2 = iArr;
                    i = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject s(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e6) {
            e = e6;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i = point2.x;
                C4907p c4907p = C4907p.f40108g;
                jSONObject3.put("x", c4907p.f40109a.h(context, i));
                jSONObject3.put("y", c4907p.f40109a.h(context, point2.y));
                jSONObject3.put("start_x", c4907p.f40109a.h(context, point.x));
                jSONObject3.put("start_y", c4907p.f40109a.h(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e9) {
                int i4 = C.f40822b;
                u2.i.d("Error occurred while putting signals into JSON object.", e9);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            jSONObject2 = jSONObject;
            int i9 = C.f40822b;
            u2.i.d("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static boolean t(Context context, Ut ut) {
        AbstractC3298hB abstractC3298hB;
        if (!ut.f28127N) {
            return false;
        }
        C3151ea c3151ea = AbstractC3368ia.h9;
        r rVar = r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (booleanValue) {
            return ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.k9)).booleanValue();
        }
        String str = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.i9);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        com.bumptech.glide.manager.o d2 = com.bumptech.glide.manager.o.d(new TA(';'));
        Iterator g9 = ((InterfaceC3352iB) d2.f23625w).g(d2, str);
        do {
            abstractC3298hB = (AbstractC3298hB) g9;
            if (!abstractC3298hB.hasNext()) {
                return false;
            }
        } while (!((String) abstractC3298hB.next()).equals(packageName));
        return true;
    }

    public static JSONObject u(Context context) {
        JSONObject jSONObject = new JSONObject();
        G g9 = j.f39798C.f39803c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i = displayMetrics.widthPixels;
            C4907p c4907p = C4907p.f40108g;
            jSONObject.put("width", c4907p.f40109a.h(context, i));
            jSONObject.put("height", c4907p.f40109a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams v() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) r.f40116e.f40119c.a(AbstractC3368ia.j9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject w(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        C4907p c4907p = C4907p.f40108g;
        jSONObject.put("width", c4907p.f40109a.h(context, i));
        int i4 = rect.bottom - rect.top;
        u2.d dVar = c4907p.f40109a;
        jSONObject.put("height", dVar.h(context, i4));
        jSONObject.put("x", dVar.h(context, rect.left));
        jSONObject.put("y", dVar.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int x(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public abstract InputFilter[] e(InputFilter[] inputFilterArr);

    public abstract void i(boolean z8);

    public abstract void j(boolean z8);
}
