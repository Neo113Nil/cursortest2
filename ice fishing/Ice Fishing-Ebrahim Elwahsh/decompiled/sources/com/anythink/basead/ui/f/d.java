package com.anythink.basead.ui.f;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.BaseSdkSplashATView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10956a = -100;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10957b = -101;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10958c = -102;

    /* renamed from: d, reason: collision with root package name */
    private final w<?> f10959d;

    /* renamed from: e, reason: collision with root package name */
    private final y f10960e;

    /* renamed from: f, reason: collision with root package name */
    private int f10961f;

    /* renamed from: g, reason: collision with root package name */
    private View f10962g;

    /* renamed from: h, reason: collision with root package name */
    private View f10963h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private View f10964j;

    /* renamed from: k, reason: collision with root package name */
    private View f10965k;

    /* renamed from: l, reason: collision with root package name */
    private View f10966l;

    /* renamed from: m, reason: collision with root package name */
    private View f10967m;

    /* renamed from: n, reason: collision with root package name */
    private View f10968n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.basead.ui.d.a f10969o;

    public d(w<?> wVar, y yVar) {
        this.f10959d = wVar;
        this.f10960e = yVar;
    }

    private void b(Context context) {
        View findViewById = this.f10962g.findViewById(q.a(context, "myoffer_include_invalid_button_full_screen", "id"));
        this.f10966l = findViewById;
        if (findViewById == null) {
            this.f10966l = this.f10962g.findViewById(q.a(context, "myoffer_fl_invalid_btn", "id"));
        }
        this.f10963h = this.f10962g.findViewById(q.a(context, "myoffer_splash_ad_bottom_container", "id"));
        this.f10965k = this.f10962g.findViewById(q.a(context, "myoffer_ll_top_content", "id"));
        this.i = this.f10962g.findViewById(q.a(context, "myoffer_panel_cta_layout", "id"));
        this.f10964j = this.f10962g.findViewById(q.a(context, "myoffer_shake_hint_text", "id"));
        this.f10968n = this.f10962g.findViewById(q.a(context, "myoffer_ll_title_desc_container", "id"));
        View view = this.f10966l;
        if (view != null) {
            this.f10967m = view.findViewById(q.a(context, "myoffer_invalid_btn", "id"));
        }
    }

    public final d a(int i) {
        this.f10961f = i;
        return this;
    }

    public final d a(com.anythink.basead.ui.d.a aVar) {
        this.f10969o = aVar;
        return this;
    }

    public final void a(Context context, View view) {
        y yVar;
        boolean z8;
        this.f10962g = view;
        if (view == null || this.f10959d == null || (yVar = this.f10960e) == null || !yVar.ar()) {
            return;
        }
        if ((TextUtils.equals(String.valueOf(this.f10960e.F()), "4") || TextUtils.equals(String.valueOf(this.f10960e.F()), "3") || TextUtils.equals(String.valueOf(this.f10960e.F()), "1")) && this.f10960e.aP() != 1) {
            return;
        }
        View findViewById = this.f10962g.findViewById(q.a(context, "myoffer_include_invalid_button_full_screen", "id"));
        this.f10966l = findViewById;
        if (findViewById == null) {
            this.f10966l = this.f10962g.findViewById(q.a(context, "myoffer_fl_invalid_btn", "id"));
        }
        this.f10963h = this.f10962g.findViewById(q.a(context, "myoffer_splash_ad_bottom_container", "id"));
        this.f10965k = this.f10962g.findViewById(q.a(context, "myoffer_ll_top_content", "id"));
        this.i = this.f10962g.findViewById(q.a(context, "myoffer_panel_cta_layout", "id"));
        this.f10964j = this.f10962g.findViewById(q.a(context, "myoffer_shake_hint_text", "id"));
        this.f10968n = this.f10962g.findViewById(q.a(context, "myoffer_ll_title_desc_container", "id"));
        View view2 = this.f10966l;
        if (view2 != null) {
            this.f10967m = view2.findViewById(q.a(context, "myoffer_invalid_btn", "id"));
        }
        if (this.f10966l == null) {
            return;
        }
        if (TextUtils.equals(String.valueOf(this.f10960e.F()), "4")) {
            if (this.i == null) {
                this.i = this.f10962g.findViewById(q.a(context, "myoffer_splash_ad_cta_layout", "id"));
            }
            if (this.f10964j == null) {
                this.f10964j = this.f10962g.findViewById(q.a(context, "myoffer_shake_view", "id"));
            }
            if (BaseSdkSplashATView.isSinglePicture(this.f10959d, this.f10960e)) {
                this.f10966l.setPadding(0, q.a(context, 26.0f), 0, 0);
                a(context, this.i, 100.0f);
                a(context, this.f10964j, 100.0f);
            } else if (this.f10960e.C() == 2) {
                this.f10966l.setPadding(0, 0, 0, 0);
                View view3 = this.f10967m;
                if (view3 != null && view3.getLayoutParams() != null) {
                    ViewGroup.LayoutParams layoutParams = this.f10967m.getLayoutParams();
                    layoutParams.height = q.a(context, 46.0f);
                    this.f10967m.setLayoutParams(layoutParams);
                    this.f10967m.setPadding(q.a(context, 31.0f), q.a(context, 13.0f), q.a(context, 33.0f), q.a(context, 13.0f));
                    this.f10967m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f19790c));
                }
                View view4 = this.f10968n;
                if (view4 != null && view4.getLayoutParams() != null) {
                    ViewGroup.LayoutParams layoutParams2 = this.f10968n.getLayoutParams();
                    if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                        layoutParams3.addRule(0, q.a(context, "myoffer_fl_invalid_btn", "id"));
                        layoutParams3.rightMargin = q.a(context, 10.0f);
                        this.f10968n.setLayoutParams(layoutParams3);
                    }
                    this.f10968n.setPadding(0, 0, 0, 0);
                }
            } else {
                this.f10966l.setPadding(0, q.a(context, 26.0f), 0, 0);
                View view5 = this.f10963h;
                if (view5 != null) {
                    view5.setPadding(0, q.a(context, 25.0f), 0, 0);
                }
            }
            this.f10966l.setVisibility(0);
            a(false);
            return;
        }
        int i = this.f10961f;
        if (i != -101) {
            switch (i) {
                case 1:
                case 5:
                    this.f10966l.setPadding(0, q.a(context, 26.0f), 0, 0);
                    if (!TextUtils.isEmpty(this.f10959d.z())) {
                        a(context, this.i, 84.0f);
                        a(context, this.f10964j, 138.0f);
                    }
                    z8 = false;
                    break;
                case 2:
                case 6:
                    this.f10966l.setPadding(0, q.a(context, 10.0f), 0, 0);
                    if (!TextUtils.isEmpty(this.f10959d.z())) {
                        a(context, this.f10965k, 144.0f);
                        a(context, this.i, 54.0f);
                        a(context, this.f10964j, 108.0f);
                    }
                    z8 = false;
                    break;
                case 3:
                case 4:
                case 7:
                    if (m.g(context)) {
                        View view6 = this.f10967m;
                        if (view6 != null && view6.getLayoutParams() != null) {
                            ViewGroup.LayoutParams layoutParams4 = this.f10967m.getLayoutParams();
                            layoutParams4.width = q.a(context, 80.0f);
                            layoutParams4.height = q.a(context, 48.0f);
                            this.f10967m.setLayoutParams(layoutParams4);
                            this.f10967m.setPadding(q.a(context, 34.0f), q.a(context, 14.0f), q.a(context, 34.0f), q.a(context, 14.0f));
                            this.f10967m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f19790c));
                        }
                        z8 = true;
                        break;
                    } else {
                        this.f10966l.setPadding(0, q.a(context, 10.0f), 0, 0);
                        z8 = false;
                        break;
                    }
                    break;
                case 8:
                    break;
                default:
                    if (!m.g(context)) {
                        this.f10966l.setPadding(0, q.a(context, 26.0f), 0, 0);
                        View view7 = this.f10963h;
                        if (view7 != null) {
                            view7.setPadding(0, 0, 0, 0);
                        }
                        b(context, this.f10965k, 14.0f);
                        b(context, this.i, 92.0f);
                        if (this.f10961f == -100) {
                            a(context, this.f10966l, 44.0f);
                        }
                    } else {
                        this.f10966l.setPadding(0, 0, 0, 0);
                        View view8 = this.f10967m;
                        if (view8 != null) {
                            ViewGroup.LayoutParams layoutParams5 = view8.getLayoutParams();
                            layoutParams5.height = q.a(context, 48.0f);
                            this.f10967m.setLayoutParams(layoutParams5);
                            this.f10967m.setPadding(q.a(context, 34.0f), q.a(context, 14.0f), q.a(context, 34.0f), q.a(context, 14.0f));
                            this.f10967m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f19790c));
                        }
                        View view9 = this.f10968n;
                        if (view9 != null && view9.getLayoutParams() != null) {
                            ViewGroup.LayoutParams layoutParams6 = this.f10968n.getLayoutParams();
                            if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
                                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
                                layoutParams7.addRule(0, q.a(context, "myoffer_fl_invalid_btn", "id"));
                                this.f10968n.setLayoutParams(layoutParams7);
                            }
                        }
                        if (this.f10961f == -100) {
                            ViewGroup.LayoutParams layoutParams8 = this.f10966l.getLayoutParams();
                            layoutParams8.width = -2;
                            if (layoutParams8 instanceof RelativeLayout.LayoutParams) {
                                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
                                layoutParams9.addRule(11);
                                layoutParams9.rightMargin = q.a(context, 20.0f);
                                layoutParams9.bottomMargin = q.a(context, 30.0f);
                            }
                            this.f10966l.setLayoutParams(layoutParams8);
                        }
                    }
                    z8 = false;
                    break;
            }
            this.f10966l.setVisibility(0);
            a(z8);
        }
        if (!m.g(context)) {
            this.f10966l.setPadding(0, q.a(context, 26.0f), 0, 0);
            a(context, this.i, 100.0f);
            a(context, this.f10964j, 152.0f);
            if (this.f10961f == -101) {
                a(context, this.f10966l, 35.0f);
            }
        } else {
            this.f10966l.setPadding(0, 0, 0, 0);
            View view10 = this.f10967m;
            if (view10 != null) {
                ViewGroup.LayoutParams layoutParams10 = view10.getLayoutParams();
                layoutParams10.height = q.a(context, 48.0f);
                this.f10967m.setLayoutParams(layoutParams10);
                this.f10967m.setPadding(q.a(context, 34.0f), q.a(context, 14.0f), q.a(context, 34.0f), q.a(context, 14.0f));
                this.f10967m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f19790c));
            }
            if (this.f10961f == -101) {
                ViewGroup.LayoutParams layoutParams11 = this.f10966l.getLayoutParams();
                layoutParams11.width = -2;
                if (layoutParams11 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) layoutParams11;
                    layoutParams12.addRule(11);
                    layoutParams12.rightMargin = q.a(context, 20.0f);
                    layoutParams12.bottomMargin = q.a(context, 30.0f);
                }
                this.f10966l.setLayoutParams(layoutParams11);
            }
        }
        z8 = false;
        this.f10966l.setVisibility(0);
        a(z8);
    }

    private static void b(Context context, View view, float f6) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = q.a(context, f6);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = q.a(context, f6);
        }
    }

    public final void b() {
        t.b().b(new Runnable() { // from class: com.anythink.basead.ui.f.d.4
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.f10966l != null) {
                    d.this.f10966l.setVisibility(0);
                }
            }
        });
    }

    private void a(Context context) {
        if (this.i == null) {
            this.i = this.f10962g.findViewById(q.a(context, "myoffer_splash_ad_cta_layout", "id"));
        }
        if (this.f10964j == null) {
            this.f10964j = this.f10962g.findViewById(q.a(context, "myoffer_shake_view", "id"));
        }
        if (BaseSdkSplashATView.isSinglePicture(this.f10959d, this.f10960e)) {
            this.f10966l.setPadding(0, q.a(context, 26.0f), 0, 0);
            a(context, this.i, 100.0f);
            a(context, this.f10964j, 100.0f);
        } else if (this.f10960e.C() == 2) {
            this.f10966l.setPadding(0, 0, 0, 0);
            View view = this.f10967m;
            if (view != null && view.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams = this.f10967m.getLayoutParams();
                layoutParams.height = q.a(context, 46.0f);
                this.f10967m.setLayoutParams(layoutParams);
                this.f10967m.setPadding(q.a(context, 31.0f), q.a(context, 13.0f), q.a(context, 33.0f), q.a(context, 13.0f));
                this.f10967m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f19790c));
            }
            View view2 = this.f10968n;
            if (view2 != null && view2.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams2 = this.f10968n.getLayoutParams();
                if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    layoutParams3.addRule(0, q.a(context, "myoffer_fl_invalid_btn", "id"));
                    layoutParams3.rightMargin = q.a(context, 10.0f);
                    this.f10968n.setLayoutParams(layoutParams3);
                }
                this.f10968n.setPadding(0, 0, 0, 0);
            }
        } else {
            this.f10966l.setPadding(0, q.a(context, 26.0f), 0, 0);
            View view3 = this.f10963h;
            if (view3 != null) {
                view3.setPadding(0, q.a(context, 25.0f), 0, 0);
            }
        }
        this.f10966l.setVisibility(0);
        a(false);
    }

    private void a(boolean z8) {
        View view;
        if (z8 && (view = this.f10967m) != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.d.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (d.this.f10969o != null) {
                        d.this.f10969o.a(10, 14);
                    }
                }
            });
            return;
        }
        View view2 = this.f10966l;
        if (view2 == null) {
            return;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.d.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                if (d.this.f10969o != null) {
                    d.this.f10969o.a(10, 14);
                }
            }
        });
    }

    private static void a(Context context, View view, float f6) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = q.a(context, f6);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = q.a(context, f6);
        }
    }

    private static int a(Context context, float f6) {
        return q.a(context, f6);
    }

    public final void a() {
        t.b().b(new Runnable() { // from class: com.anythink.basead.ui.f.d.3
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.f10966l != null) {
                    d.this.f10966l.setVisibility(8);
                }
            }
        });
    }
}
