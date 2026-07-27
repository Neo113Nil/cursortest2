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
    protected static int f21201n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected static int f21202o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f21203p = -999;

    /* renamed from: a, reason: collision with root package name */
    protected Context f21204a;

    /* renamed from: b, reason: collision with root package name */
    protected d f21205b;

    /* renamed from: c, reason: collision with root package name */
    protected String f21206c;

    /* renamed from: d, reason: collision with root package name */
    protected String f21207d;

    /* renamed from: e, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.e.d f21208e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f21209f;

    /* renamed from: g, reason: collision with root package name */
    protected int f21210g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f21211h;
    protected float i;

    /* renamed from: j, reason: collision with root package name */
    protected float f21212j;

    /* renamed from: k, reason: collision with root package name */
    protected Rect f21213k;

    /* renamed from: l, reason: collision with root package name */
    protected int f21214l;

    /* renamed from: m, reason: collision with root package name */
    protected int f21215m;

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
        return k.a(this.f21204a.getApplicationContext(), str, k.f19791d);
    }

    public int findDrawable(String str) {
        return k.a(this.f21204a.getApplicationContext(), str, k.f19790c);
    }

    public int findID(String str) {
        return k.a(this.f21204a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return k.a(this.f21204a.getApplicationContext(), str, "layout");
    }

    public d getCampaign() {
        return this.f21205b;
    }

    public String getInstanceId() {
        return this.f21207d;
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
        return this.f21213k;
    }

    public String getUnitId() {
        return this.f21206c;
    }

    public int getViewHeight() {
        return this.f21215m;
    }

    public int getViewWidth() {
        return this.f21214l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f21204a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z8 = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z8 = true;
        }
        return z8;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f21210g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.i = motionEvent.getRawX();
        this.f21212j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f21210g = configuration.orientation;
    }

    public void setCampaign(d dVar) {
        this.f21205b = dVar;
    }

    public void setInstanceId(String str) {
        this.f21207d = str;
    }

    public void setLayout(int i, int i4) {
        this.f21214l = i;
        this.f21215m = i4;
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

    public void setLayoutParam(int i, int i4, int i9, int i10) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i4;
            parentRelativeLayoutParams.leftMargin = i;
            if (i9 != -999) {
                parentRelativeLayoutParams.width = i9;
            }
            if (i10 != -999) {
                parentRelativeLayoutParams.height = i10;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i4;
            parentLinearLayoutParams.leftMargin = i;
            if (i9 != -999) {
                parentLinearLayoutParams.width = i9;
            }
            if (i10 != -999) {
                parentLinearLayoutParams.height = i10;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i4;
            parentFrameLayoutParams.leftMargin = i;
            if (i9 != -999) {
                parentFrameLayoutParams.width = i9;
            }
            if (i10 != -999) {
                parentFrameLayoutParams.height = i10;
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
        this.f21213k = rect;
    }

    public void setRewardUnitSetting(com.anythink.expressad.videocommon.e.d dVar) {
        this.f21208e = dVar;
    }

    public void setUnitId(String str) {
        this.f21206c = str;
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
        this.f21207d = "";
        this.f21210g = 1;
        this.f21211h = false;
        this.f21204a = context;
        this.f21209f = LayoutInflater.from(context);
        init(context);
    }

    public final JSONObject a(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e6) {
            e = e6;
        }
        try {
            jSONObject.put(a.cg, v.a(com.anythink.expressad.foundation.b.a.c().e(), this.i));
            jSONObject.put(a.ch, v.a(com.anythink.expressad.foundation.b.a.c().e(), this.f21212j));
            jSONObject.put(a.cj, i);
            try {
                this.f21210g = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            jSONObject.put(a.ck, this.f21210g);
            jSONObject.put(a.cl, v.c(getContext()));
            return jSONObject;
        } catch (JSONException e10) {
            e = e10;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21201n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            h.a();
            com.anythink.core.express.d.a.a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e6) {
            c.a();
            c.a(webView, e6.getMessage());
            e6.getMessage();
        }
    }
}
