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
    TextView f11061l;

    /* renamed from: m, reason: collision with root package name */
    TextView f11062m;

    /* renamed from: n, reason: collision with root package name */
    String f11063n;

    /* renamed from: o, reason: collision with root package name */
    private View f11064o;

    /* renamed from: p, reason: collision with root package name */
    private View f11065p;

    /* renamed from: q, reason: collision with root package name */
    private Boolean f11066q;

    public ShakeView(Context context) {
        super(context);
        this.f11066q = Boolean.FALSE;
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void a() {
        setOrientation(1);
        setGravity(1);
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_shake_button", "layout"), (ViewGroup) null);
        this.f11064o = inflate;
        inflate.setLayoutParams(new LinearLayout.LayoutParams(q.a(getContext(), 300.0f), q.a(getContext(), 100.0f)));
        TextView textView = (TextView) this.f11064o.findViewById(q.a(t.b().g(), "tv_splash_shake_view_hint_text", "id"));
        this.f11061l = textView;
        if (textView != null) {
            textView.setText(q.a(t.b().g(), "myoffer_shake_full_title", k.f20423g));
        }
        this.f10691a = (ImageView) this.f11064o.findViewById(q.a(t.b().g(), "tv_splash_shake_view_icon", "id"));
        View inflate2 = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_shake_hint_text", "layout"), (ViewGroup) null);
        this.f11065p = inflate2;
        inflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = (TextView) this.f11065p.findViewById(q.a(t.b().g(), "tv_splash_shake_hint_text", "id"));
        this.f11062m = textView2;
        if (textView2 != null) {
            textView2.setText(q.a(t.b().g(), "myoffer_shake_full_title", k.f20423g));
        }
        this.f10692b = (ImageView) this.f11065p.findViewById(q.a(t.b().g(), "tv_splash_shake_hint_icon", "id"));
        this.f11065p.setVisibility(8);
        addView(this.f11064o);
        addView(this.f11065p);
    }

    public void replaceShakeCTAButton(View view) {
        View view2;
        if (view == null || (view2 = this.f11064o) == null) {
            return;
        }
        try {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.f11064o.setVisibility(8);
            this.f11064o = view;
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
            am.a(this.f11064o);
            addView(this.f11064o);
            this.f11064o.setVisibility(0);
        }
    }

    public void setNeedHideShakeIcon(boolean z6) {
        this.f11066q = Boolean.valueOf(z6);
        if (z6) {
            View view = this.f11065p;
            if (view != null) {
                view.setVisibility(0);
                ImageView imageView = this.f10692b;
                if (imageView != null) {
                    this.f10691a = imageView;
                }
            }
            View view2 = this.f11064o;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            this.f11064o.setOnClickListener(onClickListener);
            this.f11065p.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    public void setShakeHintText(String str) {
        this.f11063n = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextView textView = this.f11061l;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f11062m;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void setShakeSetting(y yVar, int i) {
        super.setShakeSetting(yVar, i);
        if (TextUtils.isEmpty(this.f11063n)) {
            if (TextUtils.isEmpty(this.f10696f)) {
                TextView textView = this.f11061l;
                if (textView != null) {
                    textView.setText(e.a(getContext(), i));
                }
                TextView textView2 = this.f11062m;
                if (textView2 != null) {
                    textView2.setText(e.a(getContext(), i));
                    return;
                }
                return;
            }
            TextView textView3 = this.f11061l;
            if (textView3 != null) {
                textView3.setText(this.f10696f);
            }
            TextView textView4 = this.f11062m;
            if (textView4 != null) {
                textView4.setText(this.f10696f);
            }
        }
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        super.startAnimation(animation);
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11066q = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11066q = Boolean.FALSE;
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f11066q = Boolean.FALSE;
    }
}
