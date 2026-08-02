package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.SupportInfoProvider;
import com.yandex.messenger.websdk.api.WebChromeClientConfig;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fi4 {
    public static final /* synthetic */ s9f[] Q;
    public boolean A;
    public jtc B;
    public yh4 C;
    public yh4 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final jyr H;
    public final jyr I;
    public u2x J;
    public String K;
    public boolean L;
    public final y32 M;
    public final v3f N;
    public final n3m O;
    public final qgv P;
    public final vbv a;
    public final Context b;
    public final ote c;
    public final h02 d;
    public final hfj e;
    public final SupportInfoProvider f;
    public final Looper g;
    public final qdc h;
    public final MessengerParams i;
    public final cr j;
    public final o0j k;
    public final imf l;
    public final hu1 m;
    public final kue n;
    public final WebMessengerNavigationInterceptor o;
    public final y32 p;
    public final t1f q;
    public final qne r;
    public rvf s;
    public boolean t;
    public mmo u;
    public final dzd v;
    public ndv w;
    public final y32 x;
    public final y32 y;
    public final nur z;

    static {
        opi opiVar = new opi(fi4.class, "webViewOwner", "getWebViewOwner()Lcom/yandex/messenger/websdk/internal/webview/WebViewWrapper;", 0);
        ern.a.getClass();
        Q = new s9f[]{opiVar, new opi(fi4.class, "tokenChangeSubscription", "getTokenChangeSubscription()Lcom/yandex/messenger/websdk/api/Cancelable;", 0), new opi(fi4.class, "counterProvider", "getCounterProvider()Ljava/io/Closeable;", 0), new opi(fi4.class, "visibilitySubscription", "getVisibilitySubscription()Ljava/io/Closeable;", 0), new opi(fi4.class, "lastMessageProviderConnection", "getLastMessageProviderConnection()Lcom/yandex/messenger/websdk/api/Cancelable;", 0)};
    }

    public fi4(vbv vbvVar, Context context, ote oteVar, h02 h02Var, hfj hfjVar, SupportInfoProvider supportInfoProvider, Looper looper, qdc qdcVar, MessengerParams messengerParams, WebChromeClientConfig webChromeClientConfig, cr crVar, o0j o0jVar, imf imfVar, pgv pgvVar, hu1 hu1Var, kue kueVar, WebMessengerNavigationInterceptor webMessengerNavigationInterceptor) {
        sev sevVar;
        View n0;
        oteVar.getClass();
        h02Var.getClass();
        hfjVar.getClass();
        looper.getClass();
        qdcVar.getClass();
        crVar.getClass();
        o0jVar.getClass();
        imfVar.getClass();
        pgvVar.getClass();
        hu1Var.getClass();
        kueVar.getClass();
        this.a = vbvVar;
        this.b = context;
        this.c = oteVar;
        this.d = h02Var;
        this.e = hfjVar;
        this.f = supportInfoProvider;
        this.g = looper;
        this.h = qdcVar;
        this.i = messengerParams;
        this.j = crVar;
        this.k = o0jVar;
        this.l = imfVar;
        this.m = hu1Var;
        this.n = kueVar;
        this.o = webMessengerNavigationInterceptor;
        y32 y32Var = new y32();
        this.p = y32Var;
        this.q = new t1f(qdcVar);
        this.r = new qne((Function2) new t83(6));
        this.x = new y32();
        this.y = new y32();
        this.z = new nur(oteVar, new vh4(this, 5));
        btf.b(new uf3(28, this));
        this.H = btf.b(new vh4(this, 1));
        this.I = btf.b(new vh4(this, 2));
        this.J = bi4.u;
        this.K = "files.messenger.yandex.ru";
        this.M = new y32(new j3(24));
        this.N = new v3f(oteVar.a, qdcVar, h02Var, new qxp(this));
        vh4 vh4Var = new vh4(this, 3);
        vbv vbvVar2 = pgvVar.a;
        this.P = new qgv((o0j) vbvVar2.C.getValue(), vbvVar2.r, vh4Var);
        try {
            sevVar = new sev();
            j0i j0iVar = new j0i(context);
            j0iVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
            j0iVar.setFocusable(true);
            sevVar.a = j0iVar;
            n0 = sevVar.n0();
        } catch (Throwable th) {
            j(new di4(th));
        }
        if (n0 == null) {
            throw new IllegalStateException("WebView not created");
        }
        g(sevVar);
        this.v = new dzd(n0);
        y32Var.setValue(this, Q[0], sevVar);
        ngv f = f();
        this.O = f != null ? new n3m(f, this.N, this.o) : null;
    }

    public final void a(String str) {
        String str2;
        ndv ndvVar = this.w;
        if (ndvVar == null || (str2 = ndvVar.a) == null || !(str2.equals("*") || str2.equals(str))) {
            ndv ndvVar2 = new ndv(str);
            l(this.j.s(ndvVar2));
            this.w = ndvVar2;
        }
    }

    public final void b(o oVar, gu1 gu1Var, yh4 yh4Var) {
        oVar.getClass();
        gu1Var.getClass();
        ngv f = f();
        if (f != null) {
            f.A("Web view was not detached", new uf3(26));
        }
        hu1 hu1Var = this.m;
        hu1Var.getClass();
        vbv vbvVar = hu1Var.a;
        this.u = new mmo(oVar, gu1Var, vbvVar.l, vbvVar.r, (OkHttpClient) vbvVar.j.getValue());
        gu1Var.n(this, this.J);
        t1f t1fVar = this.q;
        t1fVar.getClass();
        b2k b2kVar = (b2k) t1fVar.d;
        if (b2kVar != null) {
            b2kVar.g = Long.valueOf(SystemClock.elapsedRealtime());
        }
        ngv f2 = f();
        if (f2 == null || !f2.U()) {
            return;
        }
        f2.F(oVar);
        dzd dzdVar = this.v;
        if (dzdVar != null) {
            dzdVar.d = true;
            dzdVar.h();
        }
        if (dzdVar != null) {
            dzdVar.b = oVar.isResumed();
            dzdVar.h();
        }
        if (this.L) {
            return;
        }
        this.L = true;
        i("attach", yh4Var);
    }

    public final void c() {
        if (f() == null) {
            return;
        }
        ngv f = f();
        if (f != null) {
            f.A("WebView should be detached before being destroyed", new uf3(25));
        }
        s9f[] s9fVarArr = Q;
        this.p.setValue(this, s9fVarArr[0], null);
        v3f v3fVar = this.N;
        v3fVar.f.clear();
        v3fVar.h.clear();
        v3fVar.g.clear();
        hfj hfjVar = this.e;
        hfjVar.i.post(new dyg(14, hfjVar));
        h02 h02Var = this.d;
        h02Var.getClass();
        h02Var.h.post(new he0(7, h02Var));
        l(null);
        this.M.setValue(this, s9fVarArr[4], null);
        this.y.setValue(this, s9fVarArr[3], null);
        this.P.b();
        this.r.setValue(this, s9fVarArr[1], null);
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
    }

    public final void d() {
        ngv f = f();
        if (f != null) {
            f.s0();
        }
        dzd dzdVar = this.v;
        if (dzdVar != null) {
            dzdVar.d = false;
            dzdVar.h();
        }
        mmo mmoVar = this.u;
        if (mmoVar != null) {
        }
        this.u = null;
    }

    public final t3f e() {
        return (t3f) this.H.getValue();
    }

    public final ngv f() {
        return (ngv) this.p.getValue(this, Q[0]);
    }

    public final void g(ngv ngvVar) {
        String str;
        boolean z = ngvVar instanceof w7w;
        v3f v3fVar = this.N;
        if (z) {
            v3fVar.getClass();
            throw new IllegalStateException("WebViewPageApi is not set");
        }
        if (!(ngvVar instanceof sev)) {
            e7o.f("Unsupported WebView type: ".concat(ngvVar.getClass().getName()));
            return;
        }
        j0i j0iVar = ((sev) ngvVar).a;
        if (j0iVar == null) {
            return;
        }
        j0iVar.removeJavascriptInterface("androidListener");
        j0iVar.addJavascriptInterface(v3fVar, "androidListener");
        j0iVar.getClass();
        this.d.getClass();
        jtc jtcVar = new jtc();
        jtcVar.a = j0iVar;
        jtcVar.b = new Handler(Looper.getMainLooper());
        this.B = jtcVar;
        j0iVar.getSettings().setDatabaseEnabled(true);
        j0iVar.getSettings().setDomStorageEnabled(true);
        j0iVar.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        j0iVar.getSettings().setJavaScriptEnabled(true);
        WebSettings settings = j0iVar.getSettings();
        Context context = j0iVar.getContext();
        context.getClass();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            str = "unknown";
        }
        settings.setUserAgentString(WebSettings.getDefaultUserAgent(context) + StringUtil.SPACE + ouj.o(context.getPackageName(), "/", str) + " AndroidMssngrWebSdk/255.0");
        j0iVar.setWebViewClient(new uh4(this, this.i.d ? agv.a(j0iVar.getContext().getApplicationContext(), new h88(j0iVar.getContext().getApplicationContext()), new y9w(28)) : null));
        j0iVar.setWebChromeClient(new sh4(this));
    }

    public final void h() {
        rvf rvfVar;
        n3m n3mVar;
        String str;
        String str2;
        if (!this.t || (rvfVar = this.s) == null || (n3mVar = this.O) == null) {
            return;
        }
        boolean z = rvfVar instanceof wdq;
        qdc qdcVar = this.h;
        if (z) {
            wdq wdqVar = (wdq) rvfVar;
            ChatRequest chatRequest = wdqVar.a;
            t3f e = e();
            String str3 = wdqVar.b;
            String str4 = wdqVar.c;
            e.getClass();
            nnd nndVar = e.a;
            nndVar.getClass();
            JSONObject a = chatRequest.a();
            if (str4 != null) {
                a.put("pasteText", str4);
                a.put("pasteForce", true);
            }
            if (str3 != null) {
                a.put("context", new JSONObject(str3));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", a);
            jSONObject.put("type", "iframeOpen");
            String b = t3f.b(nnd.J(nndVar, b0i.Request, jSONObject, null));
            jtc jtcVar = this.B;
            if (jtcVar == null) {
                Intrinsics.j("jsExecutor");
                throw null;
            }
            jtc.v(jtcVar, b);
            qdcVar.getClass();
            dwt.b(new zya(18, qdcVar, "wm_web_chat_open"));
            t1f t1fVar = this.q;
            t1fVar.getClass();
            t1fVar.c = new a2k();
            wdqVar.c = null;
            oh4 oh4Var = chatRequest instanceof oh4 ? (oh4) chatRequest : null;
            if (oh4Var != null && (str2 = oh4Var.a) != null) {
                a(str2);
            }
        } else {
            if (!(rvfVar instanceof xdq)) {
                b6e.s();
                return;
            }
            nnd nndVar2 = e().a;
            nndVar2.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chatList", true);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("data", jSONObject2);
            jSONObject3.put("type", "iframeOpen");
            String b2 = t3f.b(nnd.J(nndVar2, b0i.Request, jSONObject3, null));
            jtc jtcVar2 = this.B;
            if (jtcVar2 == null) {
                Intrinsics.j("jsExecutor");
                throw null;
            }
            jtc.v(jtcVar2, b2);
            qdcVar.getClass();
            dwt.b(new zya(18, qdcVar, "wm_web_chatlist_open"));
        }
        vh4 vh4Var = new vh4(this, 4);
        v3f v3fVar = (v3f) n3mVar.c;
        mh4 mh4Var = (mh4) n3mVar.f;
        v3fVar.getClass();
        mh4Var.getClass();
        v3fVar.h.add(mh4Var);
        n3mVar.d = null;
        String str5 = (String) n3mVar.e;
        if (str5 == null) {
            return;
        }
        if (rvfVar instanceof xdq) {
            str = "/";
        } else {
            if (!z) {
                b6e.s();
                return;
            }
            ChatRequest chatRequest2 = ((wdq) rvfVar).a;
            if (chatRequest2 instanceof rh4) {
                str = "/user/".concat(((rh4) chatRequest2).a);
            } else if (chatRequest2 instanceof oh4) {
                str = f1d.g("/chats/", ((oh4) chatRequest2).a);
            } else {
                if (!(chatRequest2 instanceof ph4)) {
                    b6e.s();
                    return;
                }
                str = null;
            }
        }
        if (str == null) {
            return;
        }
        ((ngv) n3mVar.b).d();
        if (str5.equals(str)) {
            return;
        }
        n3mVar.d = vh4Var;
        j(bi4.t);
    }

    public final void i(String str, yh4 yh4Var) {
        ngv f = f();
        if (f != null) {
            nur nurVar = this.z;
            cr crVar = new cr(nurVar, (MessengerParams) ((vh4) nurVar.c).invoke());
            LinkedHashMap linkedHashMap = (LinkedHashMap) crVar.g;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) crVar.e;
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) crVar.d;
            LinkedHashMap linkedHashMap4 = (LinkedHashMap) crVar.h;
            Set keySet = linkedHashMap4.keySet();
            LinkedHashMap linkedHashMap5 = (LinkedHashMap) crVar.f;
            keySet.removeAll(linkedHashMap5.keySet());
            LinkedHashSet<String> U = CollectionsKt.U(linkedHashMap.keySet(), linkedHashMap5.keySet());
            for (String str2 : U) {
                Object obj = linkedHashMap.get(str2);
                Object obj2 = linkedHashMap5.get(str2);
                Objects.toString(obj);
                Objects.toString(obj2);
            }
            linkedHashMap5.keySet().removeAll(U);
            LinkedHashMap i = uah.i(uah.i(linkedHashMap4, linkedHashMap5), linkedHashMap);
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            for (Map.Entry entry : i.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    linkedHashMap6.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap(tah.a(linkedHashMap6.size()));
            for (Map.Entry entry2 : linkedHashMap6.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                value.getClass();
                linkedHashMap7.put(key, (String) value);
            }
            ArrayList arrayList = new ArrayList(linkedHashMap7.size());
            for (Map.Entry entry3 : linkedHashMap7.entrySet()) {
                arrayList.add(((String) entry3.getKey()) + "=" + ((String) entry3.getValue()));
            }
            Set keySet2 = linkedHashMap2.keySet();
            LinkedHashMap linkedHashMap8 = (LinkedHashMap) crVar.c;
            keySet2.removeAll(linkedHashMap8.keySet());
            LinkedHashSet<String> U2 = CollectionsKt.U(linkedHashMap3.keySet(), linkedHashMap8.keySet());
            for (String str3 : U2) {
                Object obj3 = linkedHashMap3.get(str3);
                Object obj4 = linkedHashMap8.get(str3);
                Objects.toString(obj3);
                Objects.toString(obj4);
            }
            linkedHashMap8.keySet().removeAll(U2);
            Uri.Builder scheme = new Uri.Builder().scheme("https");
            nur nurVar2 = (nur) crVar.i;
            MessengerParams messengerParams = (MessengerParams) crVar.b;
            nurVar2.getClass();
            messengerParams.getClass();
            Uri.Builder appendPath = scheme.authority("yandex.ru").appendPath("chat");
            LinkedHashMap i2 = uah.i(uah.i(linkedHashMap2, linkedHashMap8), linkedHashMap3);
            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
            for (Map.Entry entry4 : i2.entrySet()) {
                if (entry4.getValue() != null) {
                    linkedHashMap9.put(entry4.getKey(), entry4.getValue());
                }
            }
            for (Map.Entry entry5 : linkedHashMap9.entrySet()) {
                appendPath.appendQueryParameter((String) entry5.getKey(), (String) entry5.getValue());
            }
            String uri = appendPath.build().toString();
            uri.getClass();
            if (f.n(uri, tah.b(new Pair("origin", f1d.g("mssngrandroid://", this.b.getPackageName()))))) {
                if (yh4Var != null && yh4Var != yh4.c) {
                    this.C = yh4Var;
                }
                yh4 yh4Var2 = this.C;
                if (yh4Var2 == null) {
                    yh4Var2 = yh4.c;
                }
                this.h.sendEvent("wm_load_messenger_page", uah.e(new Pair("intent_page", yh4Var2.name()), new Pair("case_of_loading", str)));
                this.A = false;
                v3f v3fVar = this.N;
                if (v3fVar != null) {
                    v3fVar.f.clear();
                    v3fVar.h.clear();
                    v3fVar.g.clear();
                }
                l(null);
                this.M.setValue(this, Q[4], null);
                t1f t1fVar = this.q;
                t1fVar.getClass();
                t1fVar.d = new b2k();
                j(bi4.t);
                if (v3fVar != null) {
                    v3fVar.h.add(new mh4(new wh4(this, 0)));
                }
                if (v3fVar != null) {
                    v3fVar.h.add(new mh4(new wh4(this, 1), (byte) 0));
                }
                if (v3fVar != null) {
                    v3fVar.h.add(new mh4(new uf3(27, this)));
                }
            }
        }
    }

    public final void j(u2x u2xVar) {
        gu1 gu1Var;
        if (Intrinsics.d(this.J, u2xVar)) {
            return;
        }
        this.J = u2xVar;
        mmo mmoVar = this.u;
        if (mmoVar == null || (gu1Var = (gu1) mmoVar.c) == null) {
            return;
        }
        gu1Var.n(this, u2xVar);
    }

    public final void k() {
        if (this.G) {
            yh4 yh4Var = this.D;
            yh4 yh4Var2 = yh4.a;
            qdc qdcVar = this.h;
            if (yh4Var == yh4Var2 && this.F) {
                k5r.t(qdcVar, qdcVar, "wm_chat_list_loaded_and_interactive");
                if (this.E) {
                    this.E = false;
                    return;
                }
                return;
            }
            if (yh4Var == yh4.b && this.E) {
                k5r.t(qdcVar, qdcVar, "wm_chat_loaded_and_interactive");
            }
        }
    }

    public final void l(jdv jdvVar) {
        this.x.setValue(this, Q[2], jdvVar);
    }
}
