package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.expressad.advanced.d.c;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ATNativeAdvancedView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f17911a = "webviewshow";

    /* renamed from: b, reason: collision with root package name */
    private static String f17912b = "ATNativeAdvancedView";

    /* renamed from: c, reason: collision with root package name */
    private ATNativeAdvancedWebview f17913c;

    /* renamed from: d, reason: collision with root package name */
    private View f17914d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17915e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17916f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17917g;

    /* renamed from: h, reason: collision with root package name */
    private c f17918h;
    private NativeAdvancedJSBridgeImpl i;

    /* renamed from: j, reason: collision with root package name */
    private Context f17919j;

    /* renamed from: com.anythink.expressad.advanced.view.ATNativeAdvancedView$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String unused = ATNativeAdvancedView.f17912b;
                String str = "";
                try {
                    ATNativeAdvancedView.this.f17913c.getLocationOnScreen(new int[2]);
                    String unused2 = ATNativeAdvancedView.f17912b;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v.a(t.b().g(), r2[0]));
                    jSONObject.put("startY", v.a(t.b().g(), r2[1]));
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    String unused3 = ATNativeAdvancedView.f17912b;
                    th.getMessage();
                }
                String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                h.a();
                com.anythink.core.express.d.a.a((WebView) ATNativeAdvancedView.this.f17913c, ATNativeAdvancedView.f17911a, encodeToString);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public ATNativeAdvancedView(Context context) {
        this(context, null);
    }

    private void b() {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17913c;
        if (aTNativeAdvancedWebview != null && aTNativeAdvancedWebview.getParent() == null) {
            addView(this.f17913c, new ViewGroup.LayoutParams(-1, -1));
        }
        int[] iArr = new int[2];
        this.f17913c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f17913c;
        transInfoForMraid(aTNativeAdvancedWebview2, iArr[0], iArr[1], aTNativeAdvancedWebview2.getWidth(), this.f17913c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview3 = this.f17913c;
        if (aTNativeAdvancedWebview3 != null) {
            aTNativeAdvancedWebview3.setObject(this.i);
            this.f17913c.post(new AnonymousClass1());
        }
        View view = this.f17914d;
        if (view != null) {
            if (view.getParent() != null) {
                bringChildToFront(this.f17914d);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 28.0f), v.b(getContext(), 16.0f));
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 2.0f);
            layoutParams.topMargin = v.b(getContext(), 2.0f);
            addView(this.f17914d, layoutParams);
        }
    }

    private void c() {
        int[] iArr = new int[2];
        this.f17913c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17913c;
        transInfoForMraid(aTNativeAdvancedWebview, iArr[0], iArr[1], aTNativeAdvancedWebview.getWidth(), this.f17913c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f17913c;
        if (aTNativeAdvancedWebview2 != null) {
            aTNativeAdvancedWebview2.setObject(this.i);
            this.f17913c.post(new AnonymousClass1());
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
            hashMap.put(com.anythink.core.express.b.a.f17525a, com.anythink.core.express.b.a.f17534k);
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
        View view = this.f17914d;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f17917g = false;
        this.f17916f = false;
        this.f17915e = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.f17914d;
        if (view == null || view.getParent() == null) {
            return;
        }
        removeView(this.f17914d);
    }

    public void destroy() {
        removeAllViews();
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17913c;
        if (aTNativeAdvancedWebview != null && !aTNativeAdvancedWebview.isDestroyed()) {
            this.f17913c.release();
            NativeAdvancedJsUtils.sendEventToH5(this.f17913c, "onSystemDestory", "");
        }
        if (this.f17919j != null) {
            this.f17919j = null;
        }
    }

    public NativeAdvancedJSBridgeImpl getAdvancedNativeJSBridgeImpl() {
        return this.i;
    }

    public ATNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.f17913c;
    }

    public View getCloseView() {
        return this.f17914d;
    }

    public boolean isEndCardReady() {
        return this.f17917g;
    }

    public boolean isH5Ready() {
        return this.f17915e;
    }

    public boolean isVideoReady() {
        return this.f17916f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.f17917g = false;
        this.f17916f = false;
        this.f17915e = false;
    }

    public void setAdvancedNativeJSBridgeImpl(NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl) {
        this.i = nativeAdvancedJSBridgeImpl;
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17913c;
        if (aTNativeAdvancedWebview != null) {
            aTNativeAdvancedWebview.setObject(nativeAdvancedJSBridgeImpl);
        }
    }

    public void setAdvancedNativeWebview(ATNativeAdvancedWebview aTNativeAdvancedWebview) {
        this.f17913c = aTNativeAdvancedWebview;
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = this.i;
        if (nativeAdvancedJSBridgeImpl != null) {
            aTNativeAdvancedWebview.setObject(nativeAdvancedJSBridgeImpl);
        }
    }

    public void setCloseView(View view) {
        this.f17914d = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z3) {
        this.f17917g = z3;
    }

    public void setH5Ready(boolean z3) {
        this.f17915e = z3;
    }

    public void setVideoReady(boolean z3) {
        this.f17916f = z3;
    }

    public void show() {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f17913c;
        if (aTNativeAdvancedWebview != null && aTNativeAdvancedWebview.getParent() == null) {
            addView(this.f17913c, new ViewGroup.LayoutParams(-1, -1));
        }
        int[] iArr = new int[2];
        this.f17913c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f17913c;
        transInfoForMraid(aTNativeAdvancedWebview2, iArr[0], iArr[1], aTNativeAdvancedWebview2.getWidth(), this.f17913c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview3 = this.f17913c;
        if (aTNativeAdvancedWebview3 != null) {
            aTNativeAdvancedWebview3.setObject(this.i);
            this.f17913c.post(new AnonymousClass1());
        }
        View view = this.f17914d;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 28.0f), v.b(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = v.b(getContext(), 2.0f);
                layoutParams.topMargin = v.b(getContext(), 2.0f);
                addView(this.f17914d, layoutParams);
            } else {
                bringChildToFront(this.f17914d);
            }
        }
        clearResState();
    }

    public ATNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATNativeAdvancedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17919j = context;
    }
}
