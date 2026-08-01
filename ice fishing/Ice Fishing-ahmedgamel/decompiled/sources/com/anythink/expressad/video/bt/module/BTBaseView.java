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
    protected static int f21043n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected static int f21044o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f21045p = -999;

    /* renamed from: a, reason: collision with root package name */
    protected Context f21046a;

    /* renamed from: b, reason: collision with root package name */
    protected d f21047b;

    /* renamed from: c, reason: collision with root package name */
    protected String f21048c;

    /* renamed from: d, reason: collision with root package name */
    protected String f21049d;

    /* renamed from: e, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.e.d f21050e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f21051f;

    /* renamed from: g, reason: collision with root package name */
    protected int f21052g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f21053h;
    protected float i;

    /* renamed from: j, reason: collision with root package name */
    protected float f21054j;

    /* renamed from: k, reason: collision with root package name */
    protected Rect f21055k;

    /* renamed from: l, reason: collision with root package name */
    protected int f21056l;

    /* renamed from: m, reason: collision with root package name */
    protected int f21057m;

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
        return k.a(this.f21046a.getApplicationContext(), str, k.f19633d);
    }

    public int findDrawable(String str) {
        return k.a(this.f21046a.getApplicationContext(), str, k.f19632c);
    }

    public int findID(String str) {
        return k.a(this.f21046a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return k.a(this.f21046a.getApplicationContext(), str, "layout");
    }

    public d getCampaign() {
        return this.f21047b;
    }

    public String getInstanceId() {
        return this.f21049d;
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
        return this.f21055k;
    }

    public String getUnitId() {
        return this.f21048c;
    }

    public int getViewHeight() {
        return this.f21057m;
    }

    public int getViewWidth() {
        return this.f21056l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f21046a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z3 = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z3 = true;
        }
        return z3;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f21052g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.i = motionEvent.getRawX();
        this.f21054j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f21052g = configuration.orientation;
    }

    public void setCampaign(d dVar) {
        this.f21047b = dVar;
    }

    public void setInstanceId(String str) {
        this.f21049d = str;
    }

    public void setLayout(int i, int i6) {
        this.f21056l = i;
        this.f21057m = i6;
    }

    public void setLayoutCenter(int i, int i6) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i6 != -999) {
                parentRelativeLayoutParams.height = i6;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i6 != -999) {
                parentLinearLayoutParams.height = i6;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i != -999) {
                parentFrameLayoutParams.width = i;
            }
            if (i6 != -999) {
                parentFrameLayoutParams.height = i6;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i6, int i9, int i10) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i6;
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
            parentLinearLayoutParams.topMargin = i6;
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
            parentFrameLayoutParams.topMargin = i6;
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
        this.f21055k = rect;
    }

    public void setRewardUnitSetting(com.anythink.expressad.videocommon.e.d dVar) {
        this.f21050e = dVar;
    }

    public void setUnitId(String str) {
        this.f21048c = str;
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
        this.f21049d = "";
        this.f21052g = 1;
        this.f21053h = false;
        this.f21046a = context;
        this.f21051f = LayoutInflater.from(context);
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
            jSONObject.put(a.ch, v.a(com.anythink.expressad.foundation.b.a.c().e(), this.f21054j));
            jSONObject.put(a.cj, i);
            try {
                this.f21052g = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            jSONObject.put(a.ck, this.f21052g);
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
            jSONObject.put("code", f21043n);
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
