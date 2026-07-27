package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AnythinkBaseView extends RelativeLayout {
    public static final String TAG = "AnythinkBaseView";

    /* renamed from: n, reason: collision with root package name */
    private static final int f21440n = -999;

    /* renamed from: a, reason: collision with root package name */
    protected Context f21441a;

    /* renamed from: b, reason: collision with root package name */
    protected d f21442b;

    /* renamed from: c, reason: collision with root package name */
    protected LayoutInflater f21443c;

    /* renamed from: d, reason: collision with root package name */
    protected int f21444d;

    /* renamed from: e, reason: collision with root package name */
    protected a f21445e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f21446f;

    /* renamed from: g, reason: collision with root package name */
    protected float f21447g;

    /* renamed from: h, reason: collision with root package name */
    protected float f21448h;
    protected boolean i;

    /* renamed from: j, reason: collision with root package name */
    protected int f21449j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f21450k;

    /* renamed from: l, reason: collision with root package name */
    protected int f21451l;

    /* renamed from: m, reason: collision with root package name */
    protected int f21452m;

    public AnythinkBaseView(Context context) {
        this(context, null);
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
            jSONObject.put(com.anythink.expressad.foundation.g.a.cg, v.a(t.b().g(), this.f21447g));
            jSONObject.put(com.anythink.expressad.foundation.g.a.ch, v.a(t.b().g(), this.f21448h));
            jSONObject.put(com.anythink.expressad.foundation.g.a.cj, i);
            try {
                this.f21444d = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            jSONObject.put(com.anythink.expressad.foundation.g.a.ck, this.f21444d);
            jSONObject.put(com.anythink.expressad.foundation.g.a.cl, v.c(getContext()));
            return jSONObject;
        } catch (JSONException e11) {
            e = e11;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    public void c() {
    }

    public final String d() {
        return a(0).toString();
    }

    public void defaultShow() {
    }

    public int filterFindViewId(boolean z3, String str) {
        return z3 ? findDyID(str) : findID(str);
    }

    public int findColor(String str) {
        return k.a(this.f21441a.getApplicationContext(), str, k.f19633d);
    }

    public int findDrawable(String str) {
        return k.a(this.f21441a.getApplicationContext(), str, k.f19632c);
    }

    public int findDyID(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public int findID(String str) {
        return k.a(this.f21441a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return k.a(this.f21441a.getApplicationContext(), str, "layout");
    }

    public d getCampaign() {
        return this.f21442b;
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

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f21441a.getResources().getConfiguration().orientation == 2;
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
        this.f21444d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f21447g = motionEvent.getRawX();
        this.f21448h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f21444d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(d dVar) {
        this.f21442b = dVar;
    }

    public void setLayoutCenter(int i, int i6) {
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
        }
    }

    public void setLayoutParam(int i, int i6, int i9, int i10) {
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

    public void setNotifyListener(a aVar) {
        this.f21445e = aVar;
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

    public AnythinkBaseView(Context context, AttributeSet attributeSet, boolean z3, int i, boolean z6, int i6, int i9) {
        super(context, attributeSet);
        this.f21444d = 1;
        this.f21445e = new f();
        this.f21446f = false;
        this.f21451l = 1;
        this.f21452m = 0;
        this.f21441a = context;
        this.f21443c = LayoutInflater.from(context);
        this.i = z3;
        this.f21449j = i;
        this.f21450k = z6;
        this.f21451l = i6;
        this.f21452m = i9;
        init(context);
    }

    public AnythinkBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21444d = 1;
        this.f21445e = new f();
        this.f21446f = false;
        this.f21451l = 1;
        this.f21452m = 0;
        this.f21441a = context;
        this.f21443c = LayoutInflater.from(context);
        init(context);
    }
}
