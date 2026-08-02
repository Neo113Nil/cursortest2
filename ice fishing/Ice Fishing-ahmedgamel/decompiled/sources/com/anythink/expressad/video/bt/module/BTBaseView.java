package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.bt.a.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n, reason: collision with root package name */
    protected static int f21830n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected static int f21831o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f21832p = -999;

    /* renamed from: a, reason: collision with root package name */
    protected Context f21833a;

    /* renamed from: b, reason: collision with root package name */
    protected d f21834b;

    /* renamed from: c, reason: collision with root package name */
    protected String f21835c;

    /* renamed from: d, reason: collision with root package name */
    protected String f21836d;

    /* renamed from: e, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.e.d f21837e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f21838f;

    /* renamed from: g, reason: collision with root package name */
    protected int f21839g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f21840h;
    protected float i;

    /* renamed from: j, reason: collision with root package name */
    protected float f21841j;

    /* renamed from: k, reason: collision with root package name */
    protected Rect f21842k;

    /* renamed from: l, reason: collision with root package name */
    protected int f21843l;

    /* renamed from: m, reason: collision with root package name */
    protected int f21844m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    private String b() {
        return a(0).toString();
    }

    public void a() {
    }

    public void defaultShow() {
    }

    public int findColor(String str) {
        return k.a(this.f21833a.getApplicationContext(), str, k.f20420d);
    }

    public int findDrawable(String str) {
        return k.a(this.f21833a.getApplicationContext(), str, k.f20419c);
    }

    public int findID(String str) {
        return k.a(this.f21833a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return k.a(this.f21833a.getApplicationContext(), str, "layout");
    }

    public d getCampaign() {
        return this.f21834b;
    }

    public String getInstanceId() {
        return this.f21836d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f21842k;
    }

    public String getUnitId() {
        return this.f21835c;
    }

    public int getViewHeight() {
        return this.f21844m;
    }

    public int getViewWidth() {
        return this.f21843l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f21833a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z6 = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z6 = true;
        }
        return z6;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f21839g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.i = motionEvent.getRawX();
        this.f21841j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f21839g = configuration.orientation;
    }

    public void setCampaign(d dVar) {
        this.f21834b = dVar;
    }

    public void setInstanceId(String str) {
        this.f21836d = str;
    }

    public void setLayout(int i, int i4) {
        this.f21843l = i;
        this.f21844m = i4;
    }

    public void setLayoutCenter(int i, int i4) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i != -999) {
                parentFrameLayoutParams.width = i;
            }
            if (i4 != -999) {
                parentFrameLayoutParams.height = i4;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i4, int i6, int i9) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i4;
            parentRelativeLayoutParams.leftMargin = i;
            if (i6 != -999) {
                parentRelativeLayoutParams.width = i6;
            }
            if (i9 != -999) {
                parentRelativeLayoutParams.height = i9;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i4;
            parentLinearLayoutParams.leftMargin = i;
            if (i6 != -999) {
                parentLinearLayoutParams.width = i6;
            }
            if (i9 != -999) {
                parentLinearLayoutParams.height = i9;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i4;
            parentFrameLayoutParams.leftMargin = i;
            if (i6 != -999) {
                parentFrameLayoutParams.width = i6;
            }
            if (i9 != -999) {
                parentFrameLayoutParams.height = i9;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setRect(Rect rect) {
        this.f21842k = rect;
    }

    public void setRewardUnitSetting(com.anythink.expressad.videocommon.e.d dVar) {
        this.f21837e = dVar;
    }

    public void setUnitId(String str) {
        this.f21835c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21836d = "";
        this.f21839g = 1;
        this.f21840h = false;
        this.f21833a = context;
        this.f21838f = LayoutInflater.from(context);
        init(context);
    }

    public final JSONObject a(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e9) {
            e = e9;
        }
        try {
            jSONObject.put(a.cg, v.a(com.anythink.expressad.foundation.b.a.c().e(), this.i));
            jSONObject.put(a.ch, v.a(com.anythink.expressad.foundation.b.a.c().e(), this.f21841j));
            jSONObject.put(a.cj, i);
            try {
                this.f21839g = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            jSONObject.put(a.ck, this.f21839g);
            jSONObject.put(a.cl, v.c(getContext()));
            return jSONObject;
        } catch (JSONException e11) {
            e = e11;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21830n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            h.a();
            com.anythink.core.express.d.a.a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            c.a();
            c.a(webView, e9.getMessage());
            e9.getMessage();
        }
    }
}
