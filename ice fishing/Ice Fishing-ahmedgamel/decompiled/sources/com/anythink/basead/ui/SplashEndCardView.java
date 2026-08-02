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
    protected String f11149e;

    /* renamed from: f, reason: collision with root package name */
    RoundImageView f11150f;

    /* renamed from: g, reason: collision with root package name */
    TextView f11151g;

    /* renamed from: h, reason: collision with root package name */
    TextView f11152h;
    CTAButtonLayout i;

    /* renamed from: j, reason: collision with root package name */
    TextView f11153j;

    /* renamed from: k, reason: collision with root package name */
    BaseShakeView f11154k;

    /* renamed from: l, reason: collision with root package name */
    ImageView f11155l;

    /* renamed from: m, reason: collision with root package name */
    private View f11156m;

    /* renamed from: n, reason: collision with root package name */
    private long f11157n;

    /* renamed from: o, reason: collision with root package name */
    private final View.OnClickListener f11158o;

    public SplashEndCardView(Context context, w wVar, x xVar) {
        super(context, wVar, xVar);
        View findViewById;
        this.f11149e = "Skip";
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.anythink.basead.ui.SplashEndCardView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseEndCardView.a aVar;
                y yVar = SplashEndCardView.this.f10610d;
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
        this.f11158o = onClickListener;
        this.f11149e = getResources().getString(q.a(getContext(), "myoffer_splash_skip_text", k.f20423g));
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_endcard", "layout"), (ViewGroup) this, true);
        this.f11156m = inflate;
        this.f11150f = (RoundImageView) inflate.findViewById(q.a(getContext(), "myoffer_splash_endcard_icon", "id"));
        this.i = (CTAButtonLayout) this.f11156m.findViewById(q.a(getContext(), "myoffer_splash_endcard_cta", "id"));
        this.f11151g = (TextView) this.f11156m.findViewById(q.a(getContext(), "myoffer_splash_endcard_title", "id"));
        this.f11152h = (TextView) this.f11156m.findViewById(q.a(getContext(), "myoffer_splash_endcard_desc", "id"));
        this.f11153j = (TextView) this.f11156m.findViewById(q.a(getContext(), "myoffer_splash_endcard_count_down_text", "id"));
        this.f11154k = (BaseShakeView) this.f11156m.findViewById(q.a(getContext(), "myoffer_splash_endcard_shake_hint_text", "id"));
        this.f11155l = (ImageView) this.f11156m.findViewById(q.a(getContext(), "myoffer_splash_endcard_top_bg", "id"));
        if (!this.f10608b.c()) {
            setOnClickListener(onClickListener);
        }
        RoundImageView roundImageView = this.f11150f;
        if (roundImageView != null) {
            roundImageView.setNeedRadiu(true);
            this.f11150f.setRadiusInDip(12);
        }
        if (this.i != null && !this.f10608b.c()) {
            this.i.setOnClickListener(onClickListener);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(q.a(getContext(), 12.0f));
        setBackground(gradientDrawable);
        if (this.f11153j != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(Integer.MIN_VALUE);
            gradientDrawable2.setCornerRadius(q.a(getContext(), 12.0f));
            this.f11153j.setBackground(gradientDrawable2);
            this.f11153j.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SplashEndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseEndCardView.a aVar = SplashEndCardView.this.mListener;
                    if (aVar instanceof BaseEndCardView.b) {
                        ((BaseEndCardView.b) aVar).b();
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f10608b.x()) && TextUtils.isEmpty(this.f10608b.y()) && (findViewById = this.f11156m.findViewById(q.a(getContext(), "myoffer_splash_endcard_header_container", "id"))) != null) {
            findViewById.getLayoutParams().height = q.a(getContext(), 240.0f);
        }
        String a9 = g.a().a(b.d.f12906e);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        com.IceFishing.LiveIceFishing.k.j().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.3
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (bitmap != null) {
                    SplashEndCardView.this.f11155l.setImageBitmap(bitmap);
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final void a() {
    }

    public void init(BaseEndCardView.a aVar, long j6) {
        this.mListener = aVar;
        final String z6 = this.f10608b.z();
        if (TextUtils.isEmpty(z6)) {
            z6 = this.f10608b.B();
        }
        int a9 = q.a(getContext(), 60.0f);
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, z6), a9, a9, new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.4
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (TextUtils.equals(str, z6)) {
                    SplashEndCardView.this.f11150f.setImageBitmap(bitmap);
                }
            }
        });
        CTAButtonLayout cTAButtonLayout = this.i;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(this.f10608b, this.f10609c, true, new b.a() { // from class: com.anythink.basead.ui.SplashEndCardView.5
                @Override // com.anythink.basead.ui.f.b.a
                public final void a(int i, int i4) {
                    BaseEndCardView.a aVar2 = SplashEndCardView.this.mListener;
                    if (aVar2 != null) {
                        aVar2.a(i4);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f10608b.x())) {
            this.f11151g.setVisibility(8);
        } else {
            this.f11151g.setVisibility(0);
            this.f11151g.setText(this.f10608b.x());
        }
        if (TextUtils.isEmpty(this.f10608b.y())) {
            this.f11152h.setVisibility(8);
        } else {
            this.f11152h.setVisibility(0);
            this.f11152h.setText(this.f10608b.y());
        }
        if (com.anythink.basead.b.e.a(this.f10609c)) {
            this.f11154k.setVisibility(0);
            this.f11154k.setShakeSetting(this.f10609c.f14954o, this.f10608b.K());
            if (this.f10610d.J() != 1 && !this.f10608b.c()) {
                this.f11154k.setOnClickListener(this.f11158o);
            }
            this.f11154k.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.SplashEndCardView.6
                @Override // com.anythink.basead.ui.BaseShakeView.a
                public final boolean a() {
                    BaseEndCardView.a aVar2;
                    if (!com.anythink.basead.ui.f.b.a(SplashEndCardView.this.f11157n, SplashEndCardView.this.f10609c) || (aVar2 = SplashEndCardView.this.mListener) == null) {
                        return false;
                    }
                    aVar2.a(9);
                    return true;
                }
            }, this.f10610d);
        } else {
            this.f11154k.setVisibility(8);
        }
        this.f11157n = j6;
    }

    public void onCountDownTick(long j6) {
        TextView textView = this.f11153j;
        if (textView != null) {
            textView.setText((j6 / 1000) + "s | " + this.f11149e);
        }
    }
}
