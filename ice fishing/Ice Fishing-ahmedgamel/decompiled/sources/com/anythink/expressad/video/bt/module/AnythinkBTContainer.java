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
import com.anythink.basead.exoplayer.f.f;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
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
import u.AbstractC5049e;

/* loaded from: classes.dex */
public class AnythinkBTContainer extends AbstractJSContainer implements b {

    /* renamed from: e, reason: collision with root package name */
    private static final String f20920e = "AnythinkBTContainer";

    /* renamed from: A, reason: collision with root package name */
    private LayoutInflater f20921A;

    /* renamed from: B, reason: collision with root package name */
    private Context f20922B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f20923C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f20924D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f20925E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f20926F;

    /* renamed from: G, reason: collision with root package name */
    private String f20927G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f20928H;

    /* renamed from: I, reason: collision with root package name */
    private List<d> f20929I;
    private List<c> J;

    /* renamed from: K, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.a f20930K;

    /* renamed from: L, reason: collision with root package name */
    private h f20931L;

    /* renamed from: M, reason: collision with root package name */
    private h f20932M;

    /* renamed from: N, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.b f20933N;

    /* renamed from: O, reason: collision with root package name */
    private String f20934O;

    /* renamed from: P, reason: collision with root package name */
    private String f20935P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f20936Q;

    /* renamed from: R, reason: collision with root package name */
    private int f20937R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f20938S;

    /* renamed from: T, reason: collision with root package name */
    private int f20939T;

    /* renamed from: U, reason: collision with root package name */
    private String f20940U;

    /* renamed from: V, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.f.d f20941V;

    /* renamed from: W, reason: collision with root package name */
    private com.anythink.expressad.video.a.a f20942W;

    /* renamed from: a, reason: collision with root package name */
    d f20943a;

    /* renamed from: f, reason: collision with root package name */
    private int f20944f;

    /* renamed from: g, reason: collision with root package name */
    private int f20945g;

    /* renamed from: h, reason: collision with root package name */
    private FrameLayout f20946h;
    private AnythinkBTLayout i;

    /* renamed from: j, reason: collision with root package name */
    private WindVaneWebView f20947j;

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
            FrameLayout unused = AnythinkBTContainer.this.f20946h;
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
                String optString = new JSONObject(AnythinkBTContainer.this.getJSVideoModule().getCurrentProgress()).optString(g.a.f12949C, "");
                if (dVar.R() == 3 && dVar.D() == 2 && optString.equals(j.e.f12436a) && ((AbstractJSContainer) AnythinkBTContainer.this).f22146l != null) {
                    if (!AnythinkBTContainer.this.f20926F) {
                        ((AbstractJSContainer) AnythinkBTContainer.this).f22146l.finish();
                    } else {
                        AnythinkBTContainer.this.onAdClose();
                    }
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(d dVar, boolean z3) {
            super.a(dVar, z3);
            AnythinkBTContainer.this.f20932M.a(dVar);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(int i, String str) {
            super.a(i, str);
        }
    }

    public AnythinkBTContainer(Context context) {
        super(context);
        this.f20944f = 0;
        this.f20945g = 1;
        this.f20925E = false;
        this.f20926F = true;
        this.f20928H = false;
        this.f20937R = 1;
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
            imageView.setImageResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_close", com.anythink.expressad.foundation.h.k.f19632c));
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
                Context g4 = t.b().g();
                int optInt = jSONObject.optInt("left", -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt("right", -999);
                int optInt4 = jSONObject.optInt("bottom", -999);
                if (optInt != -999 && g4 != null) {
                    layoutParams.leftMargin = v.b(g4, optInt);
                }
                if (optInt2 != -999 && g4 != null) {
                    layoutParams.topMargin = v.b(g4, optInt2);
                }
                if (optInt3 != -999 && g4 != null) {
                    layoutParams.rightMargin = v.b(g4, optInt3);
                }
                if (optInt4 != -999 && g4 != null) {
                    layoutParams.bottomMargin = v.b(g4, optInt4);
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
            aTTempContainer.setActivity(this.f22146l);
            aTTempContainer.setMute(this.f22153s);
            aTTempContainer.setBidCampaign(this.f20925E);
            aTTempContainer.setIV(this.f22154t);
            aTTempContainer.setBigOffer(this.f20926F);
            aTTempContainer.setIVRewardEnable(this.f22156v, this.f22157w, this.f22158x);
            aTTempContainer.setShowRewardListener(this.f20932M);
            aTTempContainer.setCampaignDownLoadTask(d(aTTempContainer.getCampaign()));
            aTTempContainer.setAnythinkTempCallback(d());
            aTTempContainer.setH5Cbp(getJSCommon().e());
            aTTempContainer.setWebViewFront(getJSCommon().f());
            aTTempContainer.init(this.f20922B);
            aTTempContainer.onCreate();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f20947j != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f20944f);
                jSONObject2.put("id", this.f20927G);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f20947j, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a((WebView) this.f20947j, "broadcast", this.f20927G);
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
        this.f20922B = context;
        this.f20921A = LayoutInflater.from(context);
    }

    public boolean isNativeKilledCallback(d dVar) {
        if (getJSCommon().e() != 1 && dVar != null) {
            if (dVar.n() == 1) {
                com.anythink.expressad.videocommon.e.d dVar2 = this.f22149o;
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
                int a9 = this.f22149o.a();
                dVar.o(a9);
                if (a9 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onAdClose() {
        Activity activity = this.f22146l;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P);
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
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P);
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
            FrameLayout frameLayout = (FrameLayout) this.f20921A.inflate(findLayout, this);
            this.f20946h = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.f20935P = "";
            List<d> list = this.f20929I;
            byte b9 = 0;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                d dVar2 = this.f20929I.get(0);
                str = dVar2.at();
                this.f20935P = dVar2.aa();
            }
            a.C0142a a9 = com.anythink.expressad.videocommon.a.a(this.f22147m + "_" + this.f20935P + "_" + str);
            RelativeLayout.LayoutParams layoutParams = null;
            if (a9 != null) {
                this.f20927G = a9.b();
                a9.a("");
                windVaneWebView = a9.a();
            } else {
                windVaneWebView = null;
            }
            this.f20947j = windVaneWebView;
            com.anythink.expressad.videocommon.a.b(this.f22147m + "_" + this.f20935P + "_" + str);
            WindVaneWebView windVaneWebView2 = this.f20947j;
            if (windVaneWebView2 == null) {
                List<d> list2 = this.f20929I;
                if (list2 == null || list2.size() <= 0 || (dVar = this.f20929I.get(0)) == null || !dVar.j()) {
                    a("big template webview is null");
                    return;
                }
                Context context = this.f20922B;
                if (this.f20941V == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.anythink.expressad.video.dynview.a.a.f21084F, this.f20941V);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(context, this.f20929I, new AnonymousClass2(), hashMap);
                return;
            }
            com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this.f22146l, this, windVaneWebView2);
            registerJsFactory(bVar);
            this.f20947j.setApiManagerJSFactory(bVar);
            if (this.f20947j.getParent() != null) {
                a("preload template webview is null or load error");
                return;
            }
            if (this.f20947j.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                bVar.a((com.anythink.expressad.video.signal.a.j) this.f20947j.getObject());
                if (this.f20947j != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.anythink.expressad.foundation.g.a.cl, v.c(getContext()));
                    try {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.f22151q.a());
                            jSONObject2.put("amount", this.f22151q.b());
                            jSONObject2.put("id", this.f22152r);
                            jSONObject.put("userId", this.f22150p);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.f22153s);
                            jSONObject.put("extra", this.f20940U);
                        } catch (JSONException e9) {
                            e9.getMessage();
                        }
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                    this.f20932M = new com.anythink.expressad.video.bt.module.b.d(d(), "");
                    getJSNotifyProxy().a(jSONObject.toString());
                    getJSCommon().h();
                    getJSCommon().a(new a(this, b9));
                }
                ((com.anythink.expressad.video.signal.a.c) getJSCommon()).f21793s.a();
            }
            this.f20947j.setBackgroundColor(0);
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P);
            if (b10 == null || !b10.containsKey(this.f20927G)) {
                a("big template webviewLayout is null");
                return;
            }
            View view = b10.get(this.f20927G);
            if (view instanceof AnythinkBTLayout) {
                AnythinkBTLayout anythinkBTLayout = (AnythinkBTLayout) view;
                this.i = anythinkBTLayout;
                anythinkBTLayout.addView(this.f20947j, 0, new FrameLayout.LayoutParams(-1, -1));
                com.anythink.expressad.foundation.f.b.a().a(this.f22147m + "_1", new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.1
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
                            String unused = AnythinkBTContainer.f20920e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, BaseAbsFeedBackForH5.f18040b, f.n(2, str2));
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
                            String unused = AnythinkBTContainer.f20920e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, BaseAbsFeedBackForH5.f18040b, f.n(2, str2));
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
                            String unused = AnythinkBTContainer.f20920e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, BaseAbsFeedBackForH5.f18040b, f.n(2, str2));
                    }
                });
                com.anythink.expressad.foundation.f.b.a().c(this.f22147m + "_2");
                View b11 = com.anythink.expressad.foundation.f.b.a().b(this.f22147m + "_1");
                if (com.anythink.expressad.foundation.f.b.a().b() && b11 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b11.getLayoutParams();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19047a, com.anythink.expressad.foundation.f.b.f19048b);
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
                this.i.setTag(this.f20927G);
                b10.put(this.f20927G, this.i);
                Iterator<View> it = b10.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View next = it.next();
                    if (next instanceof AnythinkBTRootLayout) {
                        AnythinkBTRootLayout anythinkBTRootLayout = (AnythinkBTRootLayout) next;
                        this.f20934O = anythinkBTRootLayout.getInstanceId();
                        this.f20946h.addView(anythinkBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                        break;
                    }
                }
                b10.remove(this.f20934O);
                b10.put(this.f20934O, this);
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f22147m, this.f22153s);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f20927G, this.f20935P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f20934O, this.f20935P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f22147m + "_" + this.f20935P, this.f22146l);
            List<d> list3 = this.f20929I;
            if (list3 == null || list3.size() <= 0) {
                return;
            }
            a(this.f22149o, this.f20929I.get(0));
        } catch (Throwable th) {
            a("onCreate exception ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.f20928H) {
            return;
        }
        this.f20928H = true;
        super.onDestroy();
        com.anythink.expressad.video.bt.a.c.a();
        com.anythink.expressad.video.bt.a.c.d(this.f22147m + "_" + this.f20935P);
        try {
            WindVaneWebView windVaneWebView = this.f20947j;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f20947j.clearWebView();
                this.f20947j.release();
            }
            if (this.f20933N != null) {
                this.f20933N = null;
            }
            if (this.f20930K != null) {
                this.f20930K = null;
            }
            if (this.f20922B != null) {
                this.f20922B = null;
            }
            List<d> list = this.f20929I;
            if (list != null && list.size() > 0) {
                for (d dVar : this.f20929I) {
                    if (dVar != null && dVar.N() != null) {
                        com.anythink.expressad.videocommon.a.b(this.f22147m + "_" + dVar.aa() + "_" + dVar.N().e());
                    }
                }
                com.anythink.expressad.video.dynview.b.a.a().b();
            }
            com.anythink.expressad.video.bt.a.c.a().c(this.f22147m, this.f20935P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.f20927G);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.g(this.f22147m);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P).remove(this.f20927G);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P).remove(this.f20934O);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P).clear();
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
        List<d> list = this.f20929I;
        if (list != null && list.size() > 0 && (dVar = this.f20929I.get(0)) != null && dVar.j() && (aVar = com.anythink.expressad.video.dynview.b.a.a().f21136a) != null) {
            aVar.b();
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P);
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
        List<d> list = this.f20929I;
        if (list != null && list.size() > 0 && (dVar = this.f20929I.get(0)) != null && dVar.j() && (aVar = com.anythink.expressad.video.dynview.b.a.a().f21136a) != null) {
            aVar.a();
        }
        if (com.anythink.expressad.foundation.f.b.f19049c) {
            return;
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onResume(this.f20942W);
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
        List<d> list = this.f20929I;
        if (list != null && list.size() > 0 && (dVar = this.f20929I.get(0)) != null && dVar.j()) {
            com.anythink.expressad.video.dynview.b.a.a().b();
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P);
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
        if (this.f20930K == null || TextUtils.isEmpty(str)) {
            AbstractJSContainer.a(obj, "listener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("hit");
            String optString = jSONObject.optString("unitId", getUnitId());
            jSONObject.optString(com.anythink.expressad.a.f17642z, getPlacementId());
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            d dVar = this.f20929I.get(0);
            boolean z3 = true;
            if (optInt == 1) {
                boolean optBoolean = optJSONObject.optBoolean("expired");
                if (dVar != null) {
                    if (optBoolean) {
                        dVar.g(1);
                    } else {
                        dVar.g(0);
                    }
                }
                this.f20936Q = isNativeKilledCallback(dVar);
            }
            switch (optInt) {
                case 1:
                    this.f20930K.a();
                    break;
                case 2:
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("error");
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString(com.anythink.expressad.foundation.g.a.f19093q) : "";
                    if (TextUtils.isEmpty(optString2)) {
                        optString2 = optJSONObject.optString("error");
                    }
                    if (!this.f20936Q && optInt2 != this.f20937R) {
                        this.f20930K.a(optString2);
                        break;
                    }
                    break;
                case 3:
                    this.f20930K.b();
                    break;
                case 4:
                    this.f20930K.c();
                    break;
                case 5:
                    com.anythink.expressad.video.bt.module.a.a aVar = this.f20930K;
                    d dVar2 = this.f20943a;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    aVar.a(dVar);
                    break;
                case 6:
                    if (optJSONObject.optInt("convert") != 1) {
                        z3 = false;
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("reward");
                    d b9 = d.b(optJSONObject.optJSONObject("campaign"));
                    com.anythink.expressad.videocommon.c.c a9 = com.anythink.expressad.videocommon.c.c.a(optJSONObject3);
                    if (a9 == null) {
                        a9 = this.f22151q;
                    }
                    String optString3 = optJSONObject.optString("extra");
                    if (!TextUtils.isEmpty(optString3)) {
                        this.f20940U = optString3;
                    }
                    if (!this.f20936Q && optInt2 != this.f20937R) {
                        if (this.f22154t && ((i = this.f22156v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                            this.f20930K.a(this.f20938S, this.f20939T);
                        }
                        if (!z3) {
                            a9.a(0);
                        }
                        this.f20930K.a(z3, a9);
                        if (!this.f22154t && z3) {
                            if (b9 == null) {
                                com.anythink.expressad.video.module.b.a.a(dVar, a9, optString, this.f22150p, this.f20940U);
                                break;
                            } else {
                                com.anythink.expressad.video.module.b.a.a(b9, a9, optString, this.f22150p, this.f20940U);
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
                boolean z3 = true;
                if (optInt2 == 0) {
                    Context g4 = t.b().g();
                    List<d> list = this.f20929I;
                    d dVar = list != null ? list.get(0) : null;
                    if (optInt == 0) {
                        z3 = false;
                    }
                    com.anythink.expressad.b.a.a(g4, dVar, "", a9, z3);
                } else {
                    Context g9 = t.b().g();
                    List<d> list2 = this.f20929I;
                    com.anythink.expressad.b.a.a(g9, list2 != null ? list2.get(0) : null, "", a9, false, optInt != 0, optInt2);
                }
            }
            com.anythink.expressad.atsignalcommon.windvane.h.a().a(obj, Base64.encodeToString("".getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    public void setBTContainerCallback(com.anythink.expressad.video.bt.module.a.a aVar) {
        this.f20930K = aVar;
    }

    public void setCampaignDownLoadTasks(List<com.anythink.expressad.videocommon.b.c> list) {
        this.J = list;
    }

    public void setCampaigns(List<d> list) {
        this.f20929I = list;
    }

    public void setChoiceOneCallback(com.anythink.expressad.video.dynview.f.d dVar) {
        this.f20941V = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.f20940U = str;
    }

    public void setJSFactory(com.anythink.expressad.video.signal.factory.b bVar) {
        this.f22160z = bVar;
    }

    public void setNotchPadding(int i, int i6, int i9, int i10, int i11) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        int i12 = i11;
        try {
            String a9 = i.a(i, i6, i9, i10, i11);
            WindVaneWebView windVaneWebView = this.f20947j;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) && !TextUtils.isEmpty(a9)) {
                ((com.anythink.expressad.video.signal.a.j) this.f20947j.getObject()).b(a9);
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f20947j, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
            }
            List<d> list = this.f20929I;
            if (list != null && list.size() > 0) {
                try {
                    if (this.f20929I.get(0).j() && (textView = this.f20923C) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        if (i6 > 0) {
                            layoutParams.leftMargin = i6;
                        }
                        if (i9 > 0) {
                            layoutParams.rightMargin = i9;
                        }
                        if (i10 > 0) {
                            layoutParams.topMargin = i10;
                        }
                        if (i12 > 0) {
                            layoutParams.bottomMargin = i12;
                        }
                        this.f20923C.setLayoutParams(layoutParams);
                        if (this.f20924D != null) {
                            try {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f20924D.getLayoutParams());
                                layoutParams2.leftMargin = layoutParams.rightMargin;
                                layoutParams2.topMargin = layoutParams.topMargin;
                                this.f20924D.setLayoutParams(layoutParams2);
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
            com.anythink.expressad.video.bt.a.c.a(i, i6, i9, i10, i11);
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22147m, this.f20935P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).setNotchPadding(i6, i9, i10, i12);
                }
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).setNotchPadding(i, i6, i9, i10, i12);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a9)) {
                    com.anythink.expressad.atsignalcommon.windvane.h.a().a(view, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
                }
                i12 = i11;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.f20931L = hVar;
    }

    public void setSoundListener(com.anythink.expressad.video.a.a aVar) {
        this.f20942W = aVar;
    }

    private WindVaneWebView b(String str) {
        a.C0142a a9 = com.anythink.expressad.videocommon.a.a(str);
        if (a9 == null) {
            return null;
        }
        this.f20927G = a9.b();
        a9.a("");
        return a9.a();
    }

    private com.anythink.expressad.video.bt.module.a.b d() {
        if (this.f20933N == null) {
            this.f20933N = new com.anythink.expressad.video.bt.module.a.b() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.3
                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a() {
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void b(String str) {
                    if (AnythinkBTContainer.this.f20947j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(com.anythink.expressad.a.f17642z, ((AbstractJSContainer) AnythinkBTContainer.this).f22148n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22147m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f20920e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f20920e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void c(String str) {
                    if (AnythinkBTContainer.this.f20947j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f17642z, ((AbstractJSContainer) AnythinkBTContainer.this).f22148n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22147m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f20920e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f20920e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str) {
                    if (AnythinkBTContainer.this.f20947j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f17642z, ((AbstractJSContainer) AnythinkBTContainer.this).f22148n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22147m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f20920e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f20920e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, boolean z3, com.anythink.expressad.videocommon.c.c cVar) {
                    if (AnythinkBTContainer.this.f20947j != null) {
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
                            jSONObject2.put("isComplete", z3);
                            jSONObject2.put("convert", z3 ? 1 : 2);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f20920e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f20920e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(boolean z3, int i) {
                    AnythinkBTContainer.this.f20938S = z3;
                    AnythinkBTContainer.this.f20939T = i;
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, String str2) {
                    if (AnythinkBTContainer.this.f20947j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f17642z, ((AbstractJSContainer) AnythinkBTContainer.this).f22148n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22147m);
                            jSONObject2.put("error", str2);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f20920e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f20920e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, d dVar) {
                    AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
                    anythinkBTContainer.f20943a = dVar;
                    if (anythinkBTContainer.f20947j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f17642z, ((AbstractJSContainer) AnythinkBTContainer.this).f22148n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22147m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f20920e;
                            jSONObject.toString();
                        } catch (JSONException e9) {
                            String unused2 = AnythinkBTContainer.f20920e;
                            e9.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f20947j, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            };
        }
        return this.f20933N;
    }

    private boolean h() {
        try {
            com.anythink.expressad.videocommon.e.d dVar = this.f22149o;
            if (dVar == null) {
                return false;
            }
            double L6 = dVar.L();
            if (L6 == 1.0d) {
                return false;
            }
            return new Random().nextDouble() > L6;
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
        if (this.f20941V == null) {
            a("ChoiceOneCallback is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.expressad.video.dynview.a.a.f21084F, this.f20941V);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(context, this.f20929I, new AnonymousClass2(), hashMap);
    }

    public AnythinkBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20944f = 0;
        this.f20945g = 1;
        this.f20925E = false;
        this.f20926F = true;
        this.f20928H = false;
        this.f20937R = 1;
        init(context);
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.f20931L;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public final void a(d dVar) {
        if (dVar != null) {
            try {
                List<String> d2 = dVar.d();
                if (d2 == null || d2.size() <= 0) {
                    return;
                }
                Iterator<String> it = d2.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.b.a.a(t.b().g(), dVar, this.f22147m, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private boolean a(boolean z3) {
        com.anythink.expressad.videocommon.e.d dVar;
        try {
            dVar = this.f22149o;
        } catch (Throwable unused) {
        }
        if (dVar == null) {
            return false;
        }
        int K7 = dVar.K();
        if (K7 == 1) {
            return z3;
        }
        if (K7 == 2) {
            return z3 && h();
        }
        if (K7 != 3) {
            return false;
        }
        return h();
    }

    private void a(int i, int i6, int i9, int i10) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        List<d> list = this.f20929I;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            if (this.f20929I.get(0).j() && (textView = this.f20923C) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                if (i > 0) {
                    layoutParams.leftMargin = i;
                }
                if (i9 > 0) {
                    layoutParams.rightMargin = i9;
                }
                if (i6 > 0) {
                    layoutParams.topMargin = i6;
                }
                if (i10 > 0) {
                    layoutParams.bottomMargin = i10;
                }
                this.f20923C.setLayoutParams(layoutParams);
                if (this.f20924D != null) {
                    try {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f20924D.getLayoutParams());
                        layoutParams2.leftMargin = layoutParams.rightMargin;
                        layoutParams2.topMargin = layoutParams.topMargin;
                        this.f20924D.setLayoutParams(layoutParams2);
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
            if (AnythinkBTContainer.this.f20946h == null || aVar.a() == null) {
                AnythinkBTContainer.this.a("nativeview is null");
                return;
            }
            AnythinkBTContainer.this.f20946h.removeAllViews();
            AnythinkBTContainer.this.f20946h.addView(aVar.a());
            AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
            anythinkBTContainer.f20923C = (TextView) anythinkBTContainer.findViewById(anythinkBTContainer.findID("anythink_choice_one_countdown_tv"));
            AnythinkBTContainer anythinkBTContainer2 = AnythinkBTContainer.this;
            anythinkBTContainer2.f20924D = (ImageView) anythinkBTContainer2.findViewById(anythinkBTContainer2.findID("anythink_iv_link"));
            if (AnythinkBTContainer.this.f20930K != null) {
                AnythinkBTContainer.this.f20930K.a();
            }
            if (AnythinkBTContainer.this.f20929I == null || AnythinkBTContainer.this.f20929I.size() <= 0 || (dVar = (d) AnythinkBTContainer.this.f20929I.get(0)) == null) {
                return;
            }
            String ak = dVar.ak();
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), ((AbstractJSContainer) AnythinkBTContainer.this).f22147m);
            int M8 = a9 != null ? a9.M() : 1;
            if (dVar.n() == 1) {
                StringBuilder c9 = AbstractC5049e.c(ak, "&to=1&cbt=");
                c9.append(dVar.aB());
                c9.append("&tmorl=");
                c9.append(M8);
                sb = c9.toString();
            } else {
                StringBuilder c10 = AbstractC5049e.c(ak, "&to=0&cbt=");
                c10.append(dVar.aB());
                c10.append("&tmorl=");
                c10.append(M8);
                sb = c10.toString();
            }
            com.anythink.expressad.b.a.a(t.b().g(), dVar, ((AbstractJSContainer) AnythinkBTContainer.this).f22147m, sb, false, true, com.anythink.expressad.b.b.a.f18157j);
            com.anythink.expressad.foundation.g.a.f.f19126h.put(dVar.ak(), Long.valueOf(System.currentTimeMillis()));
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
