package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.ui.BaseEndCardView;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class SplashEndCardView extends BaseEndCardView {

    /* renamed from: e, reason: collision with root package name */
    protected String f10363e;

    /* renamed from: f, reason: collision with root package name */
    RoundImageView f10364f;

    /* renamed from: g, reason: collision with root package name */
    TextView f10365g;

    /* renamed from: h, reason: collision with root package name */
    TextView f10366h;
    CTAButtonLayout i;

    /* renamed from: j, reason: collision with root package name */
    TextView f10367j;

    /* renamed from: k, reason: collision with root package name */
    BaseShakeView f10368k;

    /* renamed from: l, reason: collision with root package name */
    ImageView f10369l;

    /* renamed from: m, reason: collision with root package name */
    private View f10370m;

    /* renamed from: n, reason: collision with root package name */
    private long f10371n;

    /* renamed from: o, reason: collision with root package name */
    private final View.OnClickListener f10372o;

    public SplashEndCardView(Context context, w wVar, x xVar) {
        super(context, wVar, xVar);
        View findViewById;
        this.f10363e = "Skip";
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.anythink.basead.ui.SplashEndCardView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseEndCardView.a aVar;
                y yVar = SplashEndCardView.this.f9824d;
                if (yVar != null) {
                    if (yVar.J() == 0) {
                        BaseEndCardView.a aVar2 = SplashEndCardView.this.mListener;
                        if (aVar2 != null) {
                            aVar2.a(22);
                            return;
                        }
                        return;
                    }
                    SplashEndCardView splashEndCardView = SplashEndCardView.this;
                    CTAButtonLayout cTAButtonLayout = splashEndCardView.i;
                    if (cTAButtonLayout == null || view != cTAButtonLayout || (aVar = splashEndCardView.mListener) == null) {
                        return;
                    }
                    aVar.a(22);
                }
            }
        };
        this.f10372o = onClickListener;
        this.f10363e = getResources().getString(q.a(getContext(), "myoffer_splash_skip_text", k.f19636g));
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_endcard", "layout"), (ViewGroup) this, true);
        this.f10370m = inflate;
        this.f10364f = (RoundImageView) inflate.findViewById(q.a(getContext(), "myoffer_splash_endcard_icon", "id"));
        this.i = (CTAButtonLayout) this.f10370m.findViewById(q.a(getContext(), "myoffer_splash_endcard_cta", "id"));
        this.f10365g = (TextView) this.f10370m.findViewById(q.a(getContext(), "myoffer_splash_endcard_title", "id"));
        this.f10366h = (TextView) this.f10370m.findViewById(q.a(getContext(), "myoffer_splash_endcard_desc", "id"));
        this.f10367j = (TextView) this.f10370m.findViewById(q.a(getContext(), "myoffer_splash_endcard_count_down_text", "id"));
        this.f10368k = (BaseShakeView) this.f10370m.findViewById(q.a(getContext(), "myoffer_splash_endcard_shake_hint_text", "id"));
        this.f10369l = (ImageView) this.f10370m.findViewById(q.a(getContext(), "myoffer_splash_endcard_top_bg", "id"));
        if (!this.f9822b.c()) {
            setOnClickListener(onClickListener);
        }
        RoundImageView roundImageView = this.f10364f;
        if (roundImageView != null) {
            roundImageView.setNeedRadiu(true);
            this.f10364f.setRadiusInDip(12);
        }
        if (this.i != null && !this.f9822b.c()) {
            this.i.setOnClickListener(onClickListener);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(q.a(getContext(), 12.0f));
        setBackground(gradientDrawable);
        if (this.f10367j != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(Integer.MIN_VALUE);
            gradientDrawable2.setCornerRadius(q.a(getContext(), 12.0f));
            this.f10367j.setBackground(gradientDrawable2);
            this.f10367j.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SplashEndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseEndCardView.a aVar = SplashEndCardView.this.mListener;
                    if (aVar instanceof BaseEndCardView.b) {
                        ((BaseEndCardView.b) aVar).b();
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f9822b.x()) && TextUtils.isEmpty(this.f9822b.y()) && (findViewById = this.f10370m.findViewById(q.a(getContext(), "myoffer_splash_endcard_header_container", "id"))) != null) {
            findViewById.getLayoutParams().height = q.a(getContext(), 240.0f);
        }
        String a9 = g.a().a(b.d.f12120e);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        D.y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.3
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (bitmap != null) {
                    SplashEndCardView.this.f10369l.setImageBitmap(bitmap);
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final void a() {
    }

    public void init(BaseEndCardView.a aVar, long j6) {
        this.mListener = aVar;
        final String z3 = this.f9822b.z();
        if (TextUtils.isEmpty(z3)) {
            z3 = this.f9822b.B();
        }
        int a9 = q.a(getContext(), 60.0f);
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, z3), a9, a9, new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.4
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (TextUtils.equals(str, z3)) {
                    SplashEndCardView.this.f10364f.setImageBitmap(bitmap);
                }
            }
        });
        CTAButtonLayout cTAButtonLayout = this.i;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(this.f9822b, this.f9823c, true, new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.5
                @Override // com.anythink.basead.ui.f.b.a
                public final void a(int i, int i6) {
                    BaseEndCardView.a aVar2 = SplashEndCardView.this.mListener;
                    if (aVar2 != null) {
                        aVar2.a(i6);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f9822b.x())) {
            this.f10365g.setVisibility(8);
        } else {
            this.f10365g.setVisibility(0);
            this.f10365g.setText(this.f9822b.x());
        }
        if (TextUtils.isEmpty(this.f9822b.y())) {
            this.f10366h.setVisibility(8);
        } else {
            this.f10366h.setVisibility(0);
            this.f10366h.setText(this.f9822b.y());
        }
        if (com.anythink.basead.b.e.a(this.f9823c)) {
            this.f10368k.setVisibility(0);
            this.f10368k.setShakeSetting(this.f9823c.f14168o, this.f9822b.K());
            if (this.f9824d.J() != 1 && !this.f9822b.c()) {
                this.f10368k.setOnClickListener(this.f10372o);
            }
            this.f10368k.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.SplashEndCardView.6
                @Override // com.anythink.basead.ui.BaseShakeView.a
                public final boolean a() {
                    BaseEndCardView.a aVar2;
                    if (!com.anythink.basead.ui.f.b.a(SplashEndCardView.this.f10371n, SplashEndCardView.this.f9823c) || (aVar2 = SplashEndCardView.this.mListener) == null) {
                        return false;
                    }
                    aVar2.a(9);
                    return true;
                }
            }, this.f9824d);
        } else {
            this.f10368k.setVisibility(8);
        }
        this.f10371n = j6;
    }

    public void onCountDownTick(long j6) {
        TextView textView = this.f10367j;
        if (textView != null) {
            textView.setText((j6 / 1000) + "s | " + this.f10363e);
        }
    }
}
