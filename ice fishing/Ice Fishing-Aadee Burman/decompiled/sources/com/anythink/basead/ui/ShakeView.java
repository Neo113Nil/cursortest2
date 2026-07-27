package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class ShakeView extends BaseShakeView {
    public static final String TAG = "ShakeView";

    /* renamed from: l, reason: collision with root package name */
    TextView f10275l;

    /* renamed from: m, reason: collision with root package name */
    TextView f10276m;

    /* renamed from: n, reason: collision with root package name */
    String f10277n;

    /* renamed from: o, reason: collision with root package name */
    private View f10278o;

    /* renamed from: p, reason: collision with root package name */
    private View f10279p;

    /* renamed from: q, reason: collision with root package name */
    private Boolean f10280q;

    public ShakeView(Context context) {
        super(context);
        this.f10280q = Boolean.FALSE;
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void a() {
        setOrientation(1);
        setGravity(1);
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_shake_button", "layout"), (ViewGroup) null);
        this.f10278o = inflate;
        inflate.setLayoutParams(new LinearLayout.LayoutParams(q.a(getContext(), 300.0f), q.a(getContext(), 100.0f)));
        TextView textView = (TextView) this.f10278o.findViewById(q.a(t.b().g(), "tv_splash_shake_view_hint_text", "id"));
        this.f10275l = textView;
        if (textView != null) {
            textView.setText(q.a(t.b().g(), "myoffer_shake_full_title", k.f19636g));
        }
        this.f9905a = (ImageView) this.f10278o.findViewById(q.a(t.b().g(), "tv_splash_shake_view_icon", "id"));
        View inflate2 = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_shake_hint_text", "layout"), (ViewGroup) null);
        this.f10279p = inflate2;
        inflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = (TextView) this.f10279p.findViewById(q.a(t.b().g(), "tv_splash_shake_hint_text", "id"));
        this.f10276m = textView2;
        if (textView2 != null) {
            textView2.setText(q.a(t.b().g(), "myoffer_shake_full_title", k.f19636g));
        }
        this.f9906b = (ImageView) this.f10279p.findViewById(q.a(t.b().g(), "tv_splash_shake_hint_icon", "id"));
        this.f10279p.setVisibility(8);
        addView(this.f10278o);
        addView(this.f10279p);
    }

    public void replaceShakeCTAButton(View view) {
        View view2;
        if (view == null || (view2 = this.f10278o) == null) {
            return;
        }
        try {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.f10278o.setVisibility(8);
            this.f10278o = view;
            view.setVisibility(0);
            if (view.getLayoutParams() != null && view.getLayoutParams() != null) {
                layoutParams = view.getLayoutParams();
            }
            am.a(view);
            if (t.b().F()) {
                Log.d(TAG, "DIRECTLY Splash View replace shake cta success");
            }
            addView(view, layoutParams);
        } catch (Throwable th) {
            if (t.b().F()) {
                Log.d(TAG, "DIRECTLY Splash View replace shake cta fail:" + th.getMessage());
            }
            am.a(this.f10278o);
            addView(this.f10278o);
            this.f10278o.setVisibility(0);
        }
    }

    public void setNeedHideShakeIcon(boolean z3) {
        this.f10280q = Boolean.valueOf(z3);
        if (z3) {
            View view = this.f10279p;
            if (view != null) {
                view.setVisibility(0);
                ImageView imageView = this.f9906b;
                if (imageView != null) {
                    this.f9905a = imageView;
                }
            }
            View view2 = this.f10278o;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            this.f10278o.setOnClickListener(onClickListener);
            this.f10279p.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    public void setShakeHintText(String str) {
        this.f10277n = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextView textView = this.f10275l;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f10276m;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void setShakeSetting(y yVar, int i) {
        super.setShakeSetting(yVar, i);
        if (TextUtils.isEmpty(this.f10277n)) {
            if (TextUtils.isEmpty(this.f9910f)) {
                TextView textView = this.f10275l;
                if (textView != null) {
                    textView.setText(e.a(getContext(), i));
                }
                TextView textView2 = this.f10276m;
                if (textView2 != null) {
                    textView2.setText(e.a(getContext(), i));
                    return;
                }
                return;
            }
            TextView textView3 = this.f10275l;
            if (textView3 != null) {
                textView3.setText(this.f9910f);
            }
            TextView textView4 = this.f10276m;
            if (textView4 != null) {
                textView4.setText(this.f9910f);
            }
        }
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        super.startAnimation(animation);
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10280q = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10280q = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i, int i6) {
        super(context, attributeSet, i, i6);
        this.f10280q = Boolean.FALSE;
    }
}
