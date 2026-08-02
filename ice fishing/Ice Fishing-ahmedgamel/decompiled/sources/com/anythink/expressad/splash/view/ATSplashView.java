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
    protected static final String f21517a = "webviewshow";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f21518b = "updateCountdown";

    /* renamed from: c, reason: collision with root package name */
    private static String f21519c = "ATSplashView";

    /* renamed from: d, reason: collision with root package name */
    private int f21520d;

    /* renamed from: e, reason: collision with root package name */
    private ATSplashWebview f21521e;

    /* renamed from: f, reason: collision with root package name */
    private b f21522f;

    /* renamed from: g, reason: collision with root package name */
    private ViewGroup f21523g;

    /* renamed from: h, reason: collision with root package name */
    private View f21524h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private int f21525j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21526k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21527l;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f21528m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21529n;

    /* renamed from: o, reason: collision with root package name */
    private View f21530o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21531p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21532q;

    /* renamed from: r, reason: collision with root package name */
    private RelativeLayout.LayoutParams f21533r;

    /* renamed from: s, reason: collision with root package name */
    private SplashJSBridgeImpl f21534s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21535t;

    public ATSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.f21520d = getResources().getConfiguration().orientation;
        this.f21535t = false;
    }

    private void c() {
        View view;
        View view2;
        View view3;
        if (this.i != null) {
            if (this.f21523g == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f21523g = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f21520d == 2) {
                this.f21525j = v.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f21523g.getId());
                if (!this.f21531p || (view2 = this.f21530o) == null) {
                    ATSplashWebview aTSplashWebview = this.f21521e;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f21521e, layoutParams);
                    }
                    d();
                } else {
                    if (view2.getParent() != null) {
                        am.a(this.f21530o);
                    }
                    addView(this.f21530o, layoutParams);
                }
                ViewGroup viewGroup = this.f21523g;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i = this.f21533r.width;
                    am.a(this.i);
                    int i4 = this.f21525j;
                    if (i > i4 / 4) {
                        i = i4 / 4;
                    }
                    this.f21523g.addView(this.i, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f21523g, layoutParams2);
                }
            } else {
                this.f21525j = v.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f21523g.getId());
                if (!this.f21531p || (view = this.f21530o) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f21521e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f21521e, layoutParams3);
                    }
                    d();
                } else {
                    if (view.getParent() != null) {
                        am.a(this.f21530o);
                    }
                    addView(this.f21530o, layoutParams3);
                }
                ViewGroup viewGroup2 = this.f21523g;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i6 = this.f21533r.height;
                    int i9 = this.f21525j;
                    if (i6 > i9 / 4) {
                        i6 = i9 / 4;
                    }
                    am.a(this.i);
                    this.f21523g.addView(this.i, -1, i6);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i6);
                    layoutParams4.addRule(12);
                    addView(this.f21523g, layoutParams4);
                }
            }
        } else if (!this.f21531p || (view3 = this.f21530o) == null) {
            ATSplashWebview aTSplashWebview3 = this.f21521e;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f21521e, new ViewGroup.LayoutParams(-1, -1));
            }
            d();
        } else {
            if (view3.getParent() != null) {
                am.a(this.f21530o);
            }
            addView(this.f21530o, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.f21524h;
        if (view4 != null) {
            if (view4.getParent() != null) {
                bringChildToFront(this.f21524h);
                return;
            }
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v.b(getContext(), 100.0f), v.b(getContext(), 30.0f));
            layoutParams5.addRule(10);
            layoutParams5.addRule(11);
            layoutParams5.rightMargin = v.b(getContext(), 10.0f);
            layoutParams5.topMargin = v.b(getContext(), 10.0f);
            addView(this.f21524h, layoutParams5);
        }
    }

    private void d() {
        ATSplashWebview aTSplashWebview = this.f21521e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(this.f21534s);
            this.f21521e.post(new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String unused = ATSplashView.f21519c;
                        String str = "";
                        try {
                            ATSplashView.this.f21521e.getLocationOnScreen(new int[2]);
                            String unused2 = ATSplashView.f21519c;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", v.a(t.b().g(), r4[0]));
                            jSONObject.put("startY", v.a(t.b().g(), r4[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            String unused3 = ATSplashView.f21519c;
                            th.getMessage();
                        }
                        int[] iArr = new int[2];
                        ATSplashView.this.f21521e.getLocationInWindow(iArr);
                        ATSplashView.transInfoForMraid(ATSplashView.this.f21521e, iArr[0], iArr[1], ATSplashView.this.f21521e.getWidth(), ATSplashView.this.f21521e.getHeight());
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        h.a();
                        com.anythink.core.express.d.a.a((WebView) ATSplashView.this.f21521e, ATSplashView.f21517a, encodeToString);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i4, int i6, int i9) {
        try {
            int i10 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i10 == 2 ? "landscape" : i10 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float f2 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h3 = n.h(t.b().g());
            int intValue = ((Integer) h3.get("width")).intValue();
            int intValue2 = ((Integer) h3.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f18312a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18317f);
            hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
            hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject);
            com.anythink.core.express.b.a.a();
            float f9 = i;
            float f10 = i4;
            float f11 = i6;
            float f12 = i9;
            com.anythink.core.express.b.a.a(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f2, g9);
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
        View view = this.f21524h;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void checkSkipViewLocation() {
        if (this.f21535t) {
            return;
        }
        try {
            View view = this.f21524h;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    int i = ((RelativeLayout.LayoutParams) layoutParams).topMargin;
                    int b9 = q.b(getContext()) + i;
                    if (i > 0) {
                        this.f21535t = true;
                    }
                    int[] iArr = new int[2];
                    this.f21524h.getLocationOnScreen(iArr);
                    int i4 = iArr[1];
                    if (i4 < b9) {
                        ((RelativeLayout.LayoutParams) layoutParams).topMargin = i + (b9 - i4);
                        this.f21524h.setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearResState() {
        this.f21529n = false;
        this.f21527l = false;
        this.f21526k = false;
    }

    public void destroy() {
        ATSplashWebview aTSplashWebview = this.f21521e;
        if (aTSplashWebview == null || aTSplashWebview.isDestroyed()) {
            return;
        }
        this.f21521e.finishAdSession();
        SplashJsUtils.sendEventToH5(this.f21521e, "onSystemDestory", "");
        this.f21521e.release();
        this.f21521e = null;
    }

    public View getCloseView() {
        return this.f21524h;
    }

    public ViewGroup getDevContainer() {
        return this.f21528m;
    }

    public View getIconVg() {
        return this.i;
    }

    public SplashJSBridgeImpl getSplashJSBridgeImpl() {
        return this.f21534s;
    }

    public ATSplashWebview getSplashWebview() {
        return this.f21521e;
    }

    public boolean isAttach() {
        return this.f21532q;
    }

    public boolean isDynamicView() {
        return this.f21531p;
    }

    public boolean isH5Ready() {
        return this.f21526k;
    }

    public boolean isImageReady() {
        return this.f21529n;
    }

    public boolean isVideoReady() {
        return this.f21527l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21532q = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        checkSkipViewLocation();
    }

    public void onPause() {
        View view = this.f21530o;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f21530o;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f21527l = false;
        this.f21526k = false;
    }

    public void setAllowClickSplash(final boolean z6) {
        ATSplashWebview aTSplashWebview = this.f21521e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.view.ATSplashView.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return !z6;
                }
            });
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.view.ATSplashView.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !z6;
            }
        });
    }

    public void setCloseView(View view) {
        this.f21524h = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f21528m = viewGroup;
    }

    public void setDynamicView(boolean z6) {
        this.f21531p = z6;
    }

    public void setH5Ready(boolean z6) {
        this.f21526k = z6;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.i = view;
        this.f21533r = layoutParams;
    }

    public void setImageReady(boolean z6) {
        this.f21529n = z6;
    }

    public void setNotchPadding(int i, int i4, int i6, int i9) {
        View view = this.f21530o;
        if (view != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).setNotchPadding(i, i4, i6, i9);
        }
        if (this.f21521e != null) {
            String a9 = i.a(-999, i, i4, i6, i9);
            h.a();
            com.anythink.core.express.d.a.a((WebView) this.f21521e, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
        }
    }

    public void setSplashJSBridgeImpl(SplashJSBridgeImpl splashJSBridgeImpl) {
        this.f21534s = splashJSBridgeImpl;
        ATSplashWebview aTSplashWebview = this.f21521e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f21530o = view;
        }
    }

    public void setSplashWebview() {
        if (this.f21521e == null) {
            try {
                ATSplashWebview aTSplashWebview = new ATSplashWebview(getContext());
                this.f21521e = aTSplashWebview;
                SplashJSBridgeImpl splashJSBridgeImpl = this.f21534s;
                if (splashJSBridgeImpl != null) {
                    aTSplashWebview.setObject(splashJSBridgeImpl);
                }
                b bVar = this.f21522f;
                if (bVar != null) {
                    this.f21521e.setWebViewClient(bVar);
                    return;
                }
                b bVar2 = new b();
                this.f21522f = bVar2;
                this.f21521e.setWebViewClient(bVar2);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void setVideoReady(boolean z6) {
        this.f21527l = z6;
    }

    public void show() {
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup;
        com.anythink.expressad.splash.d.a splashBridgeListener;
        if (this.f21534s != null && (viewGroup = this.f21528m) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f21534s.updateContext(this.f21528m.getContext());
            b bVar = this.f21522f;
            if (bVar != null && (splashBridgeListener = this.f21534s.getSplashBridgeListener()) != null) {
                bVar.f21618a = splashBridgeListener;
            }
        }
        if (this.i != null) {
            if (this.f21523g == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f21523g = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f21520d == 2) {
                this.f21525j = v.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f21523g.getId());
                if (!this.f21531p || (view2 = this.f21530o) == null) {
                    ATSplashWebview aTSplashWebview = this.f21521e;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f21521e, layoutParams);
                    }
                    d();
                } else {
                    if (view2.getParent() != null) {
                        am.a(this.f21530o);
                    }
                    addView(this.f21530o, layoutParams);
                }
                ViewGroup viewGroup2 = this.f21523g;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i = this.f21533r.width;
                    am.a(this.i);
                    int i4 = this.f21525j;
                    if (i > i4 / 4) {
                        i = i4 / 4;
                    }
                    this.f21523g.addView(this.i, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f21523g, layoutParams2);
                }
            } else {
                this.f21525j = v.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f21523g.getId());
                if (!this.f21531p || (view = this.f21530o) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f21521e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f21521e, layoutParams3);
                    }
                    d();
                } else {
                    if (view.getParent() != null) {
                        am.a(this.f21530o);
                    }
                    addView(this.f21530o, layoutParams3);
                }
                ViewGroup viewGroup3 = this.f21523g;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i6 = this.f21533r.height;
                    int i9 = this.f21525j;
                    if (i6 > i9 / 4) {
                        i6 = i9 / 4;
                    }
                    am.a(this.i);
                    this.f21523g.addView(this.i, -1, i6);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i6);
                    layoutParams4.addRule(12);
                    addView(this.f21523g, layoutParams4);
                }
            }
        } else if (!this.f21531p || (view3 = this.f21530o) == null) {
            ATSplashWebview aTSplashWebview3 = this.f21521e;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f21521e, new ViewGroup.LayoutParams(-1, -1));
            }
            d();
        } else {
            if (view3.getParent() != null) {
                am.a(this.f21530o);
            }
            addView(this.f21530o, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.f21524h;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v.b(getContext(), 100.0f), v.b(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = v.b(getContext(), 10.0f);
                layoutParams5.topMargin = v.b(getContext(), 10.0f);
                addView(this.f21524h, layoutParams5);
            } else {
                bringChildToFront(this.f21524h);
            }
        }
        clearResState();
    }

    public void updateCountdown(int i) {
        View view;
        if (this.f21521e != null && !this.f21531p) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.f.a.b.dl, i);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21521e, f21518b, encodeToString);
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
        if (this.f21531p && (view = this.f21530o) != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).updateCountDown(i);
        }
    }

    public ATSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21535t = false;
        b();
    }
}
