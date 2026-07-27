package com.anythink.expressad.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ATSplashView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f20730a = "webviewshow";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f20731b = "updateCountdown";

    /* renamed from: c, reason: collision with root package name */
    private static String f20732c = "ATSplashView";

    /* renamed from: d, reason: collision with root package name */
    private int f20733d;

    /* renamed from: e, reason: collision with root package name */
    private ATSplashWebview f20734e;

    /* renamed from: f, reason: collision with root package name */
    private b f20735f;

    /* renamed from: g, reason: collision with root package name */
    private ViewGroup f20736g;

    /* renamed from: h, reason: collision with root package name */
    private View f20737h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private int f20738j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20739k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20740l;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f20741m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20742n;

    /* renamed from: o, reason: collision with root package name */
    private View f20743o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20744p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20745q;

    /* renamed from: r, reason: collision with root package name */
    private RelativeLayout.LayoutParams f20746r;

    /* renamed from: s, reason: collision with root package name */
    private SplashJSBridgeImpl f20747s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20748t;

    public ATSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.f20733d = getResources().getConfiguration().orientation;
        this.f20748t = false;
    }

    private void c() {
        View view;
        View view2;
        View view3;
        if (this.i != null) {
            if (this.f20736g == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f20736g = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f20733d == 2) {
                this.f20738j = v.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f20736g.getId());
                if (!this.f20744p || (view2 = this.f20743o) == null) {
                    ATSplashWebview aTSplashWebview = this.f20734e;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f20734e, layoutParams);
                    }
                    d();
                } else {
                    if (view2.getParent() != null) {
                        am.a(this.f20743o);
                    }
                    addView(this.f20743o, layoutParams);
                }
                ViewGroup viewGroup = this.f20736g;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i = this.f20746r.width;
                    am.a(this.i);
                    int i6 = this.f20738j;
                    if (i > i6 / 4) {
                        i = i6 / 4;
                    }
                    this.f20736g.addView(this.i, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f20736g, layoutParams2);
                }
            } else {
                this.f20738j = v.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f20736g.getId());
                if (!this.f20744p || (view = this.f20743o) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f20734e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f20734e, layoutParams3);
                    }
                    d();
                } else {
                    if (view.getParent() != null) {
                        am.a(this.f20743o);
                    }
                    addView(this.f20743o, layoutParams3);
                }
                ViewGroup viewGroup2 = this.f20736g;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i9 = this.f20746r.height;
                    int i10 = this.f20738j;
                    if (i9 > i10 / 4) {
                        i9 = i10 / 4;
                    }
                    am.a(this.i);
                    this.f20736g.addView(this.i, -1, i9);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i9);
                    layoutParams4.addRule(12);
                    addView(this.f20736g, layoutParams4);
                }
            }
        } else if (!this.f20744p || (view3 = this.f20743o) == null) {
            ATSplashWebview aTSplashWebview3 = this.f20734e;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f20734e, new ViewGroup.LayoutParams(-1, -1));
            }
            d();
        } else {
            if (view3.getParent() != null) {
                am.a(this.f20743o);
            }
            addView(this.f20743o, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.f20737h;
        if (view4 != null) {
            if (view4.getParent() != null) {
                bringChildToFront(this.f20737h);
                return;
            }
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v.b(getContext(), 100.0f), v.b(getContext(), 30.0f));
            layoutParams5.addRule(10);
            layoutParams5.addRule(11);
            layoutParams5.rightMargin = v.b(getContext(), 10.0f);
            layoutParams5.topMargin = v.b(getContext(), 10.0f);
            addView(this.f20737h, layoutParams5);
        }
    }

    private void d() {
        ATSplashWebview aTSplashWebview = this.f20734e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(this.f20747s);
            this.f20734e.post(new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String unused = ATSplashView.f20732c;
                        String str = "";
                        try {
                            ATSplashView.this.f20734e.getLocationOnScreen(new int[2]);
                            String unused2 = ATSplashView.f20732c;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", v.a(t.b().g(), r4[0]));
                            jSONObject.put("startY", v.a(t.b().g(), r4[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            String unused3 = ATSplashView.f20732c;
                            th.getMessage();
                        }
                        int[] iArr = new int[2];
                        ATSplashView.this.f20734e.getLocationInWindow(iArr);
                        ATSplashView.transInfoForMraid(ATSplashView.this.f20734e, iArr[0], iArr[1], ATSplashView.this.f20734e.getWidth(), ATSplashView.this.f20734e.getHeight());
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        h.a();
                        com.anythink.core.express.d.a.a((WebView) ATSplashView.this.f20734e, ATSplashView.f20730a, encodeToString);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i6, int i9, int i10) {
        try {
            int i11 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i11 == 2 ? "landscape" : i11 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float f3 = n.f(t.b().g());
            float g4 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17525a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f17526b, com.anythink.core.express.b.a.f17530f);
            hashMap.put(com.anythink.core.express.b.a.f17527c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17528d, jSONObject);
            com.anythink.core.express.b.a.a();
            float f9 = i;
            float f10 = i6;
            float f11 = i9;
            float f12 = i10;
            com.anythink.core.express.b.a.a(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f3, g4);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(webView, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView);
        } catch (Throwable unused) {
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.f20737h;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void checkSkipViewLocation() {
        if (this.f20748t) {
            return;
        }
        try {
            View view = this.f20737h;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    int i = ((RelativeLayout.LayoutParams) layoutParams).topMargin;
                    int b9 = q.b(getContext()) + i;
                    if (i > 0) {
                        this.f20748t = true;
                    }
                    int[] iArr = new int[2];
                    this.f20737h.getLocationOnScreen(iArr);
                    int i6 = iArr[1];
                    if (i6 < b9) {
                        ((RelativeLayout.LayoutParams) layoutParams).topMargin = i + (b9 - i6);
                        this.f20737h.setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearResState() {
        this.f20742n = false;
        this.f20740l = false;
        this.f20739k = false;
    }

    public void destroy() {
        ATSplashWebview aTSplashWebview = this.f20734e;
        if (aTSplashWebview == null || aTSplashWebview.isDestroyed()) {
            return;
        }
        this.f20734e.finishAdSession();
        SplashJsUtils.sendEventToH5(this.f20734e, "onSystemDestory", "");
        this.f20734e.release();
        this.f20734e = null;
    }

    public View getCloseView() {
        return this.f20737h;
    }

    public ViewGroup getDevContainer() {
        return this.f20741m;
    }

    public View getIconVg() {
        return this.i;
    }

    public SplashJSBridgeImpl getSplashJSBridgeImpl() {
        return this.f20747s;
    }

    public ATSplashWebview getSplashWebview() {
        return this.f20734e;
    }

    public boolean isAttach() {
        return this.f20745q;
    }

    public boolean isDynamicView() {
        return this.f20744p;
    }

    public boolean isH5Ready() {
        return this.f20739k;
    }

    public boolean isImageReady() {
        return this.f20742n;
    }

    public boolean isVideoReady() {
        return this.f20740l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20745q = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        checkSkipViewLocation();
    }

    public void onPause() {
        View view = this.f20743o;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f20743o;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f20740l = false;
        this.f20739k = false;
    }

    public void setAllowClickSplash(final boolean z3) {
        ATSplashWebview aTSplashWebview = this.f20734e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.view.ATSplashView.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return !z3;
                }
            });
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.view.ATSplashView.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !z3;
            }
        });
    }

    public void setCloseView(View view) {
        this.f20737h = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f20741m = viewGroup;
    }

    public void setDynamicView(boolean z3) {
        this.f20744p = z3;
    }

    public void setH5Ready(boolean z3) {
        this.f20739k = z3;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.i = view;
        this.f20746r = layoutParams;
    }

    public void setImageReady(boolean z3) {
        this.f20742n = z3;
    }

    public void setNotchPadding(int i, int i6, int i9, int i10) {
        View view = this.f20743o;
        if (view != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).setNotchPadding(i, i6, i9, i10);
        }
        if (this.f20734e != null) {
            String a9 = i.a(-999, i, i6, i9, i10);
            h.a();
            com.anythink.core.express.d.a.a((WebView) this.f20734e, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
        }
    }

    public void setSplashJSBridgeImpl(SplashJSBridgeImpl splashJSBridgeImpl) {
        this.f20747s = splashJSBridgeImpl;
        ATSplashWebview aTSplashWebview = this.f20734e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f20743o = view;
        }
    }

    public void setSplashWebview() {
        if (this.f20734e == null) {
            try {
                ATSplashWebview aTSplashWebview = new ATSplashWebview(getContext());
                this.f20734e = aTSplashWebview;
                SplashJSBridgeImpl splashJSBridgeImpl = this.f20747s;
                if (splashJSBridgeImpl != null) {
                    aTSplashWebview.setObject(splashJSBridgeImpl);
                }
                b bVar = this.f20735f;
                if (bVar != null) {
                    this.f20734e.setWebViewClient(bVar);
                    return;
                }
                b bVar2 = new b();
                this.f20735f = bVar2;
                this.f20734e.setWebViewClient(bVar2);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void setVideoReady(boolean z3) {
        this.f20740l = z3;
    }

    public void show() {
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup;
        com.anythink.expressad.splash.d.a splashBridgeListener;
        if (this.f20747s != null && (viewGroup = this.f20741m) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f20747s.updateContext(this.f20741m.getContext());
            b bVar = this.f20735f;
            if (bVar != null && (splashBridgeListener = this.f20747s.getSplashBridgeListener()) != null) {
                bVar.f20831a = splashBridgeListener;
            }
        }
        if (this.i != null) {
            if (this.f20736g == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f20736g = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f20733d == 2) {
                this.f20738j = v.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f20736g.getId());
                if (!this.f20744p || (view2 = this.f20743o) == null) {
                    ATSplashWebview aTSplashWebview = this.f20734e;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f20734e, layoutParams);
                    }
                    d();
                } else {
                    if (view2.getParent() != null) {
                        am.a(this.f20743o);
                    }
                    addView(this.f20743o, layoutParams);
                }
                ViewGroup viewGroup2 = this.f20736g;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i = this.f20746r.width;
                    am.a(this.i);
                    int i6 = this.f20738j;
                    if (i > i6 / 4) {
                        i = i6 / 4;
                    }
                    this.f20736g.addView(this.i, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f20736g, layoutParams2);
                }
            } else {
                this.f20738j = v.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f20736g.getId());
                if (!this.f20744p || (view = this.f20743o) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f20734e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f20734e, layoutParams3);
                    }
                    d();
                } else {
                    if (view.getParent() != null) {
                        am.a(this.f20743o);
                    }
                    addView(this.f20743o, layoutParams3);
                }
                ViewGroup viewGroup3 = this.f20736g;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i9 = this.f20746r.height;
                    int i10 = this.f20738j;
                    if (i9 > i10 / 4) {
                        i9 = i10 / 4;
                    }
                    am.a(this.i);
                    this.f20736g.addView(this.i, -1, i9);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i9);
                    layoutParams4.addRule(12);
                    addView(this.f20736g, layoutParams4);
                }
            }
        } else if (!this.f20744p || (view3 = this.f20743o) == null) {
            ATSplashWebview aTSplashWebview3 = this.f20734e;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f20734e, new ViewGroup.LayoutParams(-1, -1));
            }
            d();
        } else {
            if (view3.getParent() != null) {
                am.a(this.f20743o);
            }
            addView(this.f20743o, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.f20737h;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v.b(getContext(), 100.0f), v.b(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = v.b(getContext(), 10.0f);
                layoutParams5.topMargin = v.b(getContext(), 10.0f);
                addView(this.f20737h, layoutParams5);
            } else {
                bringChildToFront(this.f20737h);
            }
        }
        clearResState();
    }

    public void updateCountdown(int i) {
        View view;
        if (this.f20734e != null && !this.f20744p) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.f.a.b.dl, i);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                h.a();
                com.anythink.core.express.d.a.a((WebView) this.f20734e, f20731b, encodeToString);
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
        if (this.f20744p && (view = this.f20743o) != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).updateCountDown(i);
        }
    }

    public ATSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20748t = false;
        b();
    }
}
