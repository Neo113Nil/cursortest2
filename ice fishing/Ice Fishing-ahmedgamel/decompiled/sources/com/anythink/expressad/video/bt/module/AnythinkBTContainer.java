package com.anythink.expressad.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.out.k;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.b;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.b.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public class AnythinkBTContainer extends AbstractJSContainer implements b {

    /* renamed from: e, reason: collision with root package name */
    private static final String f21707e = "AnythinkBTContainer";

    /* renamed from: A, reason: collision with root package name */
    private LayoutInflater f21708A;

    /* renamed from: B, reason: collision with root package name */
    private Context f21709B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f21710C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f21711D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21712E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21713F;

    /* renamed from: G, reason: collision with root package name */
    private String f21714G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f21715H;

    /* renamed from: I, reason: collision with root package name */
    private List<d> f21716I;
    private List<c> J;

    /* renamed from: K, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.a f21717K;

    /* renamed from: L, reason: collision with root package name */
    private h f21718L;

    /* renamed from: M, reason: collision with root package name */
    private h f21719M;

    /* renamed from: N, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.b f21720N;

    /* renamed from: O, reason: collision with root package name */
    private String f21721O;

    /* renamed from: P, reason: collision with root package name */
    private String f21722P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f21723Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21724R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f21725S;

    /* renamed from: T, reason: collision with root package name */
    private int f21726T;

    /* renamed from: U, reason: collision with root package name */
    private String f21727U;

    /* renamed from: V, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.f.d f21728V;

    /* renamed from: W, reason: collision with root package name */
    private com.anythink.expressad.video.a.a f21729W;

    /* renamed from: a, reason: collision with root package name */
    d f21730a;

    /* renamed from: f, reason: collision with root package name */
    private int f21731f;

    /* renamed from: g, reason: collision with root package name */
    private int f21732g;

    /* renamed from: h, reason: collision with root package name */
    private FrameLayout f21733h;
    private AnythinkBTLayout i;

    /* renamed from: j, reason: collision with root package name */
    private WindVaneWebView f21734j;

    public class a extends c.a {
        private a() {
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a() {
            super.a();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void b(k kVar, String str) {
            super.b(kVar, str);
            u.b();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void d() {
            super.d();
        }

        public /* synthetic */ a(AnythinkBTContainer anythinkBTContainer, byte b9) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void a(d dVar, String str) {
            super.a(dVar, str);
            FrameLayout unused = AnythinkBTContainer.this.f21733h;
            u.a();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void a(k kVar, String str) {
            super.a(kVar, str);
            u.b();
            if (kVar == null || !(kVar instanceof d)) {
                return;
            }
            try {
                d dVar = (d) kVar;
                String optString = new JSONObject(AnythinkBTContainer.this.getJSVideoModule().getCurrentProgress()).optString(g.a.f13735C, "");
                if (dVar.R() == 3 && dVar.D() == 2 && optString.equals(j.e.f13222a) && ((AbstractJSContainer) AnythinkBTContainer.this).f22933l != null) {
                    if (!AnythinkBTContainer.this.f21713F) {
                        ((AbstractJSContainer) AnythinkBTContainer.this).f22933l.finish();
                    } else {
                        AnythinkBTContainer.this.onAdClose();
                    }
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(d dVar, boolean z6) {
            super.a(dVar, z6);
            AnythinkBTContainer.this.f21719M.a(dVar);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(int i, String str) {
            super.a(i, str);
        }
    }

    public AnythinkBTContainer(Context context) {
        super(context);
        this.f21731f = 0;
        this.f21732g = 1;
        this.f21712E = false;
        this.f21713F = true;
        this.f21715H = false;
        this.f21724R = 1;
        init(context);
    }

    private static void e() {
    }

    private static boolean f() {
        return true;
    }

    private static int g() {
        return 1;
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(t.b().g());
            int b9 = v.b(t.b().g(), 48.0f);
            int b10 = v.b(t.b().g(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b9, b9);
            layoutParams.setMargins(b10, b10, b10, b10);
            layoutParams.gravity = 5;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_close", com.anythink.expressad.foundation.h.k.f20419c));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTContainer.this.onAdClose();
                }
            });
            addView(imageView);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void appendSubView(AnythinkBTContainer anythinkBTContainer, ATTempContainer aTTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context g9 = t.b().g();
                int optInt = jSONObject.optInt("left", -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt("right", -999);
                int optInt4 = jSONObject.optInt("bottom", -999);
                if (optInt != -999 && g9 != null) {
                    layoutParams.leftMargin = v.b(g9, optInt);
                }
                if (optInt2 != -999 && g9 != null) {
                    layoutParams.topMargin = v.b(g9, optInt2);
                }
                if (optInt3 != -999 && g9 != null) {
                    layoutParams.rightMargin = v.b(g9, optInt3);
                }
                if (optInt4 != -999 && g9 != null) {
                    layoutParams.bottomMargin = v.b(g9, optInt4);
                }
                int optInt5 = jSONObject.optInt("width");
                int optInt6 = jSONObject.optInt("height");
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            anythinkBTContainer.addView(aTTempContainer, layoutParams);
            aTTempContainer.setActivity(this.f22933l);
            aTTempContainer.setMute(this.f22940s);
            aTTempContainer.setBidCampaign(this.f21712E);
            aTTempContainer.setIV(this.f22941t);
            aTTempContainer.setBigOffer(this.f21713F);
            aTTempContainer.setIVRewardEnable(this.f22943v, this.f22944w, this.f22945x);
            aTTempContainer.setShowRewardListener(this.f21719M);
            aTTempContainer.setCampaignDownLoadTask(d(aTTempContainer.getCampaign()));
            aTTempContainer.setAnythinkTempCallback(d());
            aTTempContainer.setH5Cbp(getJSCommon().e());
            aTTempContainer.setWebViewFront(getJSCommon().f());
            aTTempContainer.init(this.f21709B);
            aTTempContainer.onCreate();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f21734j != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f21731f);
                jSONObject2.put("id", this.f21714G);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21734j, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a((WebView) this.f21734j, "broadcast", this.f21714G);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.d
    public void click(int i, String str) {
    }

    public int findID(String str) {
        return com.anythink.expressad.foundation.h.k.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return com.anythink.expressad.foundation.h.k.a(getContext(), str, "layout");
    }

    @Override // com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i, String str) {
    }

    public void init(Context context) {
        this.f21709B = context;
        this.f21708A = LayoutInflater.from(context);
    }

    public boolean isNativeKilledCallback(d dVar) {
        if (getJSCommon().e() != 1 && dVar != null) {
            if (dVar.n() == 1) {
                com.anythink.expressad.videocommon.e.d dVar2 = this.f22936o;
                if (dVar2 != null) {
                    if (dVar2.M() == 1) {
                        dVar.o(1);
                        return true;
                    }
                    dVar.o(0);
                    return false;
                }
            } else {
                if (dVar.B()) {
                    dVar.o(0);
                    return false;
                }
                int a9 = this.f22936o.a();
                dVar.o(a9);
                if (a9 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onAdClose() {
        Activity activity = this.f22933l;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onBackPressed();
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onBackPressed();
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onBackPressed();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onConfigurationChanged(configuration);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onCreate() {
        String str;
        WindVaneWebView windVaneWebView;
        d dVar;
        try {
            int findLayout = findLayout("anythink_bt_container");
            if (findLayout < 0) {
                a("anythink_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f21708A.inflate(findLayout, this);
            this.f21733h = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.f21722P = "";
            List<d> list = this.f21716I;
            byte b9 = 0;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                d dVar2 = this.f21716I.get(0);
                str = dVar2.at();
                this.f21722P = dVar2.aa();
            }
            a.C0142a a9 = com.anythink.expressad.videocommon.a.a(this.f22934m + "_" + this.f21722P + "_" + str);
            RelativeLayout.LayoutParams layoutParams = null;
            if (a9 != null) {
                this.f21714G = a9.b();
                a9.a("");
                windVaneWebView = a9.a();
            } else {
                windVaneWebView = null;
            }
            this.f21734j = windVaneWebView;
            com.anythink.expressad.videocommon.a.b(this.f22934m + "_" + this.f21722P + "_" + str);
            WindVaneWebView windVaneWebView2 = this.f21734j;
            if (windVaneWebView2 == null) {
                List<d> list2 = this.f21716I;
                if (list2 == null || list2.size() <= 0 || (dVar = this.f21716I.get(0)) == null || !dVar.j()) {
                    a("big template webview is null");
                    return;
                }
                Context context = this.f21709B;
                if (this.f21728V == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.anythink.expressad.video.dynview.a.a.f21871F, this.f21728V);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(context, this.f21716I, new AnonymousClass2(), hashMap);
                return;
            }
            com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this.f22933l, this, windVaneWebView2);
            registerJsFactory(bVar);
            this.f21734j.setApiManagerJSFactory(bVar);
            if (this.f21734j.getParent() != null) {
                a("preload template webview is null or load error");
                return;
            }
            if (this.f21734j.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                bVar.a((com.anythink.expressad.video.signal.a.j) this.f21734j.getObject());
                if (this.f21734j != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.anythink.expressad.foundation.g.a.cl, v.c(getContext()));
                    try {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.f22938q.a());
                            jSONObject2.put("amount", this.f22938q.b());
                            jSONObject2.put("id", this.f22939r);
                            jSONObject.put("userId", this.f22937p);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.f22940s);
                            jSONObject.put("extra", this.f21727U);
                        } catch (JSONException e9) {
                            e9.getMessage();
                        }
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                    this.f21719M = new com.anythink.expressad.video.bt.module.b.d(d(), "");
                    getJSNotifyProxy().a(jSONObject.toString());
                    getJSCommon().h();
                    getJSCommon().a(new a(this, b9));
                }
                ((com.anythink.expressad.video.signal.a.c) getJSCommon()).f22580s.a();
            }
            this.f21734j.setBackgroundColor(0);
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P);
            if (b10 == null || !b10.containsKey(this.f21714G)) {
                a("big template webviewLayout is null");
                return;
            }
            View view = b10.get(this.f21714G);
            if (view instanceof AnythinkBTLayout) {
                AnythinkBTLayout anythinkBTLayout = (AnythinkBTLayout) view;
                this.i = anythinkBTLayout;
                anythinkBTLayout.addView(this.f21734j, 0, new FrameLayout.LayoutParams(-1, -1));
                com.anythink.expressad.foundation.f.b.a().a(this.f22934m + "_1", new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.1
                    @Override // com.anythink.expressad.foundation.f.a
                    public final void a() {
                        String str2;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject3.put("status", 1);
                            }
                            str2 = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f21707e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, BaseAbsFeedBackForH5.f18827b, com.IceFishing.LiveIceFishing.k.o(2, str2));
                    }

                    @Override // com.anythink.expressad.foundation.f.a
                    public final void b() {
                        String str2;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject3.put("status", 2);
                            }
                            str2 = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f21707e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, BaseAbsFeedBackForH5.f18827b, com.IceFishing.LiveIceFishing.k.o(2, str2));
                    }

                    @Override // com.anythink.expressad.foundation.f.a
                    public final void c() {
                        String str2;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject3.put("status", 2);
                            }
                            str2 = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f21707e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, BaseAbsFeedBackForH5.f18827b, com.IceFishing.LiveIceFishing.k.o(2, str2));
                    }
                });
                com.anythink.expressad.foundation.f.b.a().c(this.f22934m + "_2");
                View b11 = com.anythink.expressad.foundation.f.b.a().b(this.f22934m + "_1");
                if (com.anythink.expressad.foundation.f.b.a().b() && b11 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b11.getLayoutParams();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19834a, com.anythink.expressad.foundation.f.b.f19835b);
                    }
                    layoutParams.topMargin = v.b(t.b().g(), 10.0f);
                    layoutParams.leftMargin = v.b(t.b().g(), 10.0f);
                    b11.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) b11.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(b11);
                    }
                    this.i.addView(b11);
                }
                this.i.setTag(this.f21714G);
                b10.put(this.f21714G, this.i);
                Iterator<View> it = b10.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View next = it.next();
                    if (next instanceof AnythinkBTRootLayout) {
                        AnythinkBTRootLayout anythinkBTRootLayout = (AnythinkBTRootLayout) next;
                        this.f21721O = anythinkBTRootLayout.getInstanceId();
                        this.f21733h.addView(anythinkBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                        break;
                    }
                }
                b10.remove(this.f21721O);
                b10.put(this.f21721O, this);
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f22934m, this.f22940s);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f21714G, this.f21722P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f21721O, this.f21722P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f22934m + "_" + this.f21722P, this.f22933l);
            List<d> list3 = this.f21716I;
            if (list3 == null || list3.size() <= 0) {
                return;
            }
            a(this.f22936o, this.f21716I.get(0));
        } catch (Throwable th) {
            a("onCreate exception ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.f21715H) {
            return;
        }
        this.f21715H = true;
        super.onDestroy();
        com.anythink.expressad.video.bt.a.c.a();
        com.anythink.expressad.video.bt.a.c.d(this.f22934m + "_" + this.f21722P);
        try {
            WindVaneWebView windVaneWebView = this.f21734j;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f21734j.clearWebView();
                this.f21734j.release();
            }
            if (this.f21720N != null) {
                this.f21720N = null;
            }
            if (this.f21717K != null) {
                this.f21717K = null;
            }
            if (this.f21709B != null) {
                this.f21709B = null;
            }
            List<d> list = this.f21716I;
            if (list != null && list.size() > 0) {
                for (d dVar : this.f21716I) {
                    if (dVar != null && dVar.N() != null) {
                        com.anythink.expressad.videocommon.a.b(this.f22934m + "_" + dVar.aa() + "_" + dVar.N().e());
                    }
                }
                com.anythink.expressad.video.dynview.b.a.a().b();
            }
            com.anythink.expressad.video.bt.a.c.a().c(this.f22934m, this.f21722P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.f21714G);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.g(this.f22934m);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P).remove(this.f21714G);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P).remove(this.f21721O);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P).clear();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        d dVar;
        com.anythink.expressad.video.dynview.e.a aVar;
        super.onPause();
        List<d> list = this.f21716I;
        if (list != null && list.size() > 0 && (dVar = this.f21716I.get(0)) != null && dVar.j() && (aVar = com.anythink.expressad.video.dynview.b.a.a().f21923a) != null) {
            aVar.b();
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onPause();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        d dVar;
        com.anythink.expressad.video.dynview.e.a aVar;
        super.onResume();
        List<d> list = this.f21716I;
        if (list != null && list.size() > 0 && (dVar = this.f21716I.get(0)) != null && dVar.j() && (aVar = com.anythink.expressad.video.dynview.b.a.a().f21923a) != null) {
            aVar.a();
        }
        if (com.anythink.expressad.foundation.f.b.f19836c) {
            return;
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onResume(this.f21729W);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        d dVar;
        super.onStop();
        List<d> list = this.f21716I;
        if (list != null && list.size() > 0 && (dVar = this.f21716I.get(0)) != null && dVar.j()) {
            com.anythink.expressad.video.dynview.b.a.a().b();
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onStop();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.b
    public void reactDeveloper(Object obj, String str) {
        int i;
        if (this.f21717K == null || TextUtils.isEmpty(str)) {
            AbstractJSContainer.a(obj, "listener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("hit");
            String optString = jSONObject.optString("unitId", getUnitId());
            jSONObject.optString(com.anythink.expressad.a.f18429z, getPlacementId());
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            d dVar = this.f21716I.get(0);
            boolean z6 = true;
            if (optInt == 1) {
                boolean optBoolean = optJSONObject.optBoolean("expired");
                if (dVar != null) {
                    if (optBoolean) {
                        dVar.g(1);
                    } else {
                        dVar.g(0);
                    }
                }
                this.f21723Q = isNativeKilledCallback(dVar);
            }
            switch (optInt) {
                case 1:
                    this.f21717K.a();
                    break;
                case 2:
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("error");
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString(com.anythink.expressad.foundation.g.a.f19880q) : "";
                    if (TextUtils.isEmpty(optString2)) {
                        optString2 = optJSONObject.optString("error");
                    }
                    if (!this.f21723Q && optInt2 != this.f21724R) {
                        this.f21717K.a(optString2);
                        break;
                    }
                    break;
                case 3:
                    this.f21717K.b();
                    break;
                case 4:
                    this.f21717K.c();
                    break;
                case 5:
                    com.anythink.expressad.video.bt.module.a.a aVar = this.f21717K;
                    d dVar2 = this.f21730a;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    aVar.a(dVar);
                    break;
                case 6:
                    if (optJSONObject.optInt("convert") != 1) {
                        z6 = false;
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("reward");
                    d b9 = d.b(optJSONObject.optJSONObject("campaign"));
                    com.anythink.expressad.videocommon.c.c a9 = com.anythink.expressad.videocommon.c.c.a(optJSONObject3);
                    if (a9 == null) {
                        a9 = this.f22938q;
                    }
                    String optString3 = optJSONObject.optString("extra");
                    if (!TextUtils.isEmpty(optString3)) {
                        this.f21727U = optString3;
                    }
                    if (!this.f21723Q && optInt2 != this.f21724R) {
                        if (this.f22941t && ((i = this.f22943v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                            this.f21717K.a(this.f21725S, this.f21726T);
                        }
                        if (!z6) {
                            a9.a(0);
                        }
                        this.f21717K.a(z6, a9);
                        if (!this.f22941t && z6) {
                            if (b9 == null) {
                                com.anythink.expressad.video.module.b.a.a(dVar, a9, optString, this.f22937p, this.f21727U);
                                break;
                            } else {
                                com.anythink.expressad.video.module.b.a.a(b9, a9, optString, this.f22937p, this.f21727U);
                                break;
                            }
                        }
                    }
                    break;
            }
            a(obj);
        } catch (JSONException e9) {
            AbstractJSContainer.a(obj, e9.getMessage());
            e9.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.b
    public void reportUrls(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString("url");
                StringBuilder sb = new StringBuilder();
                sb.append(n.k());
                String a9 = v.a(optString, "&tun=", sb.toString());
                int optInt2 = jSONObject.optInt("report");
                boolean z6 = true;
                if (optInt2 == 0) {
                    Context g9 = t.b().g();
                    List<d> list = this.f21716I;
                    d dVar = list != null ? list.get(0) : null;
                    if (optInt == 0) {
                        z6 = false;
                    }
                    com.anythink.expressad.b.a.a(g9, dVar, "", a9, z6);
                } else {
                    Context g10 = t.b().g();
                    List<d> list2 = this.f21716I;
                    com.anythink.expressad.b.a.a(g10, list2 != null ? list2.get(0) : null, "", a9, false, optInt != 0, optInt2);
                }
            }
            com.anythink.expressad.atsignalcommon.windvane.h.a().a(obj, Base64.encodeToString("".getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    public void setBTContainerCallback(com.anythink.expressad.video.bt.module.a.a aVar) {
        this.f21717K = aVar;
    }

    public void setCampaignDownLoadTasks(List<com.anythink.expressad.videocommon.b.c> list) {
        this.J = list;
    }

    public void setCampaigns(List<d> list) {
        this.f21716I = list;
    }

    public void setChoiceOneCallback(com.anythink.expressad.video.dynview.f.d dVar) {
        this.f21728V = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.f21727U = str;
    }

    public void setJSFactory(com.anythink.expressad.video.signal.factory.b bVar) {
        this.f22947z = bVar;
    }

    public void setNotchPadding(int i, int i4, int i6, int i9, int i10) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        int i11 = i10;
        try {
            String a9 = i.a(i, i4, i6, i9, i10);
            WindVaneWebView windVaneWebView = this.f21734j;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) && !TextUtils.isEmpty(a9)) {
                ((com.anythink.expressad.video.signal.a.j) this.f21734j.getObject()).b(a9);
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21734j, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
            }
            List<d> list = this.f21716I;
            if (list != null && list.size() > 0) {
                try {
                    if (this.f21716I.get(0).j() && (textView = this.f21710C) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        if (i4 > 0) {
                            layoutParams.leftMargin = i4;
                        }
                        if (i6 > 0) {
                            layoutParams.rightMargin = i6;
                        }
                        if (i9 > 0) {
                            layoutParams.topMargin = i9;
                        }
                        if (i11 > 0) {
                            layoutParams.bottomMargin = i11;
                        }
                        this.f21710C.setLayoutParams(layoutParams);
                        if (this.f21711D != null) {
                            try {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f21711D.getLayoutParams());
                                layoutParams2.leftMargin = layoutParams.rightMargin;
                                layoutParams2.topMargin = layoutParams.topMargin;
                                this.f21711D.setLayoutParams(layoutParams2);
                            } catch (Exception e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(i, i4, i6, i9, i10);
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22934m, this.f21722P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).setNotchPadding(i4, i6, i9, i11);
                }
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).setNotchPadding(i, i4, i6, i9, i11);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a9)) {
                    com.anythink.expressad.atsignalcommon.windvane.h.a().a(view, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
                }
                i11 = i10;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.f21718L = hVar;
    }

    public void setSoundListener(com.anythink.expressad.video.a.a aVar) {
        this.f21729W = aVar;
    }

    private WindVaneWebView b(String str) {
        a.C0142a a9 = com.anythink.expressad.videocommon.a.a(str);
        if (a9 == null) {
            return null;
        }
        this.f21714G = a9.b();
        a9.a("");
        return a9.a();
    }

    private com.anythink.expressad.video.bt.module.a.b d() {
        if (this.f21720N == null) {
            this.f21720N = new com.anythink.expressad.video.bt.module.a.b() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.3
                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a() {
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void b(String str) {
                    if (AnythinkBTContainer.this.f21734j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(com.anythink.expressad.a.f18429z, ((AbstractJSContainer) AnythinkBTContainer.this).f22935n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22934m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21707e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f21707e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void c(String str) {
                    if (AnythinkBTContainer.this.f21734j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f18429z, ((AbstractJSContainer) AnythinkBTContainer.this).f22935n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22934m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21707e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f21707e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str) {
                    if (AnythinkBTContainer.this.f21734j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f18429z, ((AbstractJSContainer) AnythinkBTContainer.this).f22935n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22934m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21707e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f21707e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, boolean z6, com.anythink.expressad.videocommon.c.c cVar) {
                    if (AnythinkBTContainer.this.f21734j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (cVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", cVar.a());
                                jSONObject3.put("amount", cVar.b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z6);
                            jSONObject2.put("convert", z6 ? 1 : 2);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21707e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f21707e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(boolean z6, int i) {
                    AnythinkBTContainer.this.f21725S = z6;
                    AnythinkBTContainer.this.f21726T = i;
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, String str2) {
                    if (AnythinkBTContainer.this.f21734j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f18429z, ((AbstractJSContainer) AnythinkBTContainer.this).f22935n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22934m);
                            jSONObject2.put("error", str2);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21707e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f21707e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, d dVar) {
                    AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
                    anythinkBTContainer.f21730a = dVar;
                    if (anythinkBTContainer.f21734j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f18429z, ((AbstractJSContainer) AnythinkBTContainer.this).f22935n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22934m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21707e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f21707e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21734j, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            };
        }
        return this.f21720N;
    }

    private boolean h() {
        try {
            com.anythink.expressad.videocommon.e.d dVar = this.f22936o;
            if (dVar == null) {
                return false;
            }
            double L2 = dVar.L();
            if (L2 == 1.0d) {
                return false;
            }
            return new Random().nextDouble() > L2;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void i() {
        u.b();
    }

    private com.anythink.expressad.videocommon.b.c d(d dVar) {
        List<com.anythink.expressad.videocommon.b.c> list = this.J;
        if (list == null || dVar == null) {
            return null;
        }
        for (com.anythink.expressad.videocommon.b.c cVar : list) {
            if (cVar.n().bh().equals(dVar.bh())) {
                return cVar;
            }
        }
        return null;
    }

    private void a(Context context) {
        if (this.f21728V == null) {
            a("ChoiceOneCallback is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.expressad.video.dynview.a.a.f21871F, this.f21728V);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(context, this.f21716I, new AnonymousClass2(), hashMap);
    }

    public AnythinkBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21731f = 0;
        this.f21732g = 1;
        this.f21712E = false;
        this.f21713F = true;
        this.f21715H = false;
        this.f21724R = 1;
        init(context);
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.f21718L;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public final void a(d dVar) {
        if (dVar != null) {
            try {
                List<String> d9 = dVar.d();
                if (d9 == null || d9.size() <= 0) {
                    return;
                }
                Iterator<String> it = d9.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.b.a.a(t.b().g(), dVar, this.f22934m, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private boolean a(boolean z6) {
        com.anythink.expressad.videocommon.e.d dVar;
        try {
            dVar = this.f22936o;
        } catch (Throwable unused) {
        }
        if (dVar == null) {
            return false;
        }
        int K7 = dVar.K();
        if (K7 == 1) {
            return z6;
        }
        if (K7 == 2) {
            return z6 && h();
        }
        if (K7 != 3) {
            return false;
        }
        return h();
    }

    private void a(int i, int i4, int i6, int i9) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        List<d> list = this.f21716I;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            if (this.f21716I.get(0).j() && (textView = this.f21710C) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                if (i > 0) {
                    layoutParams.leftMargin = i;
                }
                if (i6 > 0) {
                    layoutParams.rightMargin = i6;
                }
                if (i4 > 0) {
                    layoutParams.topMargin = i4;
                }
                if (i9 > 0) {
                    layoutParams.bottomMargin = i9;
                }
                this.f21710C.setLayoutParams(layoutParams);
                if (this.f21711D != null) {
                    try {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f21711D.getLayoutParams());
                        layoutParams2.leftMargin = layoutParams.rightMargin;
                        layoutParams2.topMargin = layoutParams.topMargin;
                        this.f21711D.setLayoutParams(layoutParams2);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.AnythinkBTContainer$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.expressad.video.dynview.f.h {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            d dVar;
            String sb;
            if (AnythinkBTContainer.this.f21733h == null || aVar.a() == null) {
                AnythinkBTContainer.this.a("nativeview is null");
                return;
            }
            AnythinkBTContainer.this.f21733h.removeAllViews();
            AnythinkBTContainer.this.f21733h.addView(aVar.a());
            AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
            anythinkBTContainer.f21710C = (TextView) anythinkBTContainer.findViewById(anythinkBTContainer.findID("anythink_choice_one_countdown_tv"));
            AnythinkBTContainer anythinkBTContainer2 = AnythinkBTContainer.this;
            anythinkBTContainer2.f21711D = (ImageView) anythinkBTContainer2.findViewById(anythinkBTContainer2.findID("anythink_iv_link"));
            if (AnythinkBTContainer.this.f21717K != null) {
                AnythinkBTContainer.this.f21717K.a();
            }
            if (AnythinkBTContainer.this.f21716I == null || AnythinkBTContainer.this.f21716I.size() <= 0 || (dVar = (d) AnythinkBTContainer.this.f21716I.get(0)) == null) {
                return;
            }
            String ak = dVar.ak();
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), ((AbstractJSContainer) AnythinkBTContainer.this).f22934m);
            int M8 = a9 != null ? a9.M() : 1;
            if (dVar.n() == 1) {
                StringBuilder c9 = AbstractC5050e.c(ak, "&to=1&cbt=");
                c9.append(dVar.aB());
                c9.append("&tmorl=");
                c9.append(M8);
                sb = c9.toString();
            } else {
                StringBuilder c10 = AbstractC5050e.c(ak, "&to=0&cbt=");
                c10.append(dVar.aB());
                c10.append("&tmorl=");
                c10.append(M8);
                sb = c10.toString();
            }
            com.anythink.expressad.b.a.a(t.b().g(), dVar, ((AbstractJSContainer) AnythinkBTContainer.this).f22934m, sb, false, true, com.anythink.expressad.b.b.a.f18944j);
            f.f19913h.put(dVar.ak(), Long.valueOf(System.currentTimeMillis()));
            AnythinkBTContainer.this.a(dVar);
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            String str;
            if (bVar != null) {
                str = "errorCode:" + bVar.a() + "Msg:" + bVar.b();
            } else {
                str = "";
            }
            AnythinkBTContainer.this.a("nativeview is null".concat(String.valueOf(str)));
        }
    }
}
