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
    public static final int f11585a = -100;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11586b = -101;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11587c = -102;

    /* renamed from: d, reason: collision with root package name */
    private final w<?> f11588d;

    /* renamed from: e, reason: collision with root package name */
    private final y f11589e;

    /* renamed from: f, reason: collision with root package name */
    private int f11590f;

    /* renamed from: g, reason: collision with root package name */
    private View f11591g;

    /* renamed from: h, reason: collision with root package name */
    private View f11592h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private View f11593j;

    /* renamed from: k, reason: collision with root package name */
    private View f11594k;

    /* renamed from: l, reason: collision with root package name */
    private View f11595l;

    /* renamed from: m, reason: collision with root package name */
    private View f11596m;

    /* renamed from: n, reason: collision with root package name */
    private View f11597n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.basead.ui.d.a f11598o;

    public d(w<?> wVar, y yVar) {
        this.f11588d = wVar;
        this.f11589e = yVar;
    }

    private void b(Context context) {
        View findViewById = this.f11591g.findViewById(q.a(context, "myoffer_include_invalid_button_full_screen", "id"));
        this.f11595l = findViewById;
        if (findViewById == null) {
            this.f11595l = this.f11591g.findViewById(q.a(context, "myoffer_fl_invalid_btn", "id"));
        }
        this.f11592h = this.f11591g.findViewById(q.a(context, "myoffer_splash_ad_bottom_container", "id"));
        this.f11594k = this.f11591g.findViewById(q.a(context, "myoffer_ll_top_content", "id"));
        this.i = this.f11591g.findViewById(q.a(context, "myoffer_panel_cta_layout", "id"));
        this.f11593j = this.f11591g.findViewById(q.a(context, "myoffer_shake_hint_text", "id"));
        this.f11597n = this.f11591g.findViewById(q.a(context, "myoffer_ll_title_desc_container", "id"));
        View view = this.f11595l;
        if (view != null) {
            this.f11596m = view.findViewById(q.a(context, "myoffer_invalid_btn", "id"));
        }
    }

    public final d a(int i) {
        this.f11590f = i;
        return this;
    }

    public final d a(com.anythink.basead.ui.d.a aVar) {
        this.f11598o = aVar;
        return this;
    }

    public final void a(Context context, View view) {
        y yVar;
        boolean z6;
        this.f11591g = view;
        if (view == null || this.f11588d == null || (yVar = this.f11589e) == null || !yVar.ar()) {
            return;
        }
        if ((TextUtils.equals(String.valueOf(this.f11589e.F()), "4") || TextUtils.equals(String.valueOf(this.f11589e.F()), "3") || TextUtils.equals(String.valueOf(this.f11589e.F()), "1")) && this.f11589e.aP() != 1) {
            return;
        }
        View findViewById = this.f11591g.findViewById(q.a(context, "myoffer_include_invalid_button_full_screen", "id"));
        this.f11595l = findViewById;
        if (findViewById == null) {
            this.f11595l = this.f11591g.findViewById(q.a(context, "myoffer_fl_invalid_btn", "id"));
        }
        this.f11592h = this.f11591g.findViewById(q.a(context, "myoffer_splash_ad_bottom_container", "id"));
        this.f11594k = this.f11591g.findViewById(q.a(context, "myoffer_ll_top_content", "id"));
        this.i = this.f11591g.findViewById(q.a(context, "myoffer_panel_cta_layout", "id"));
        this.f11593j = this.f11591g.findViewById(q.a(context, "myoffer_shake_hint_text", "id"));
        this.f11597n = this.f11591g.findViewById(q.a(context, "myoffer_ll_title_desc_container", "id"));
        View view2 = this.f11595l;
        if (view2 != null) {
            this.f11596m = view2.findViewById(q.a(context, "myoffer_invalid_btn", "id"));
        }
        if (this.f11595l == null) {
            return;
        }
        if (TextUtils.equals(String.valueOf(this.f11589e.F()), "4")) {
            if (this.i == null) {
                this.i = this.f11591g.findViewById(q.a(context, "myoffer_splash_ad_cta_layout", "id"));
            }
            if (this.f11593j == null) {
                this.f11593j = this.f11591g.findViewById(q.a(context, "myoffer_shake_view", "id"));
            }
            if (BaseSdkSplashATView.isSinglePicture(this.f11588d, this.f11589e)) {
                this.f11595l.setPadding(0, q.a(context, 26.0f), 0, 0);
                a(context, this.i, 100.0f);
                a(context, this.f11593j, 100.0f);
            } else if (this.f11589e.C() == 2) {
                this.f11595l.setPadding(0, 0, 0, 0);
                View view3 = this.f11596m;
                if (view3 != null && view3.getLayoutParams() != null) {
                    ViewGroup.LayoutParams layoutParams = this.f11596m.getLayoutParams();
                    layoutParams.height = q.a(context, 46.0f);
                    this.f11596m.setLayoutParams(layoutParams);
                    this.f11596m.setPadding(q.a(context, 31.0f), q.a(context, 13.0f), q.a(context, 33.0f), q.a(context, 13.0f));
                    this.f11596m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f20419c));
                }
                View view4 = this.f11597n;
                if (view4 != null && view4.getLayoutParams() != null) {
                    ViewGroup.LayoutParams layoutParams2 = this.f11597n.getLayoutParams();
                    if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                        layoutParams3.addRule(0, q.a(context, "myoffer_fl_invalid_btn", "id"));
                        layoutParams3.rightMargin = q.a(context, 10.0f);
                        this.f11597n.setLayoutParams(layoutParams3);
                    }
                    this.f11597n.setPadding(0, 0, 0, 0);
                }
            } else {
                this.f11595l.setPadding(0, q.a(context, 26.0f), 0, 0);
                View view5 = this.f11592h;
                if (view5 != null) {
                    view5.setPadding(0, q.a(context, 25.0f), 0, 0);
                }
            }
            this.f11595l.setVisibility(0);
            a(false);
            return;
        }
        int i = this.f11590f;
        if (i != -101) {
            switch (i) {
                case 1:
                case 5:
                    this.f11595l.setPadding(0, q.a(context, 26.0f), 0, 0);
                    if (!TextUtils.isEmpty(this.f11588d.z())) {
                        a(context, this.i, 84.0f);
                        a(context, this.f11593j, 138.0f);
                    }
                    z6 = false;
                    break;
                case 2:
                case 6:
                    this.f11595l.setPadding(0, q.a(context, 10.0f), 0, 0);
                    if (!TextUtils.isEmpty(this.f11588d.z())) {
                        a(context, this.f11594k, 144.0f);
                        a(context, this.i, 54.0f);
                        a(context, this.f11593j, 108.0f);
                    }
                    z6 = false;
                    break;
                case 3:
                case 4:
                case 7:
                    if (m.g(context)) {
                        View view6 = this.f11596m;
                        if (view6 != null && view6.getLayoutParams() != null) {
                            ViewGroup.LayoutParams layoutParams4 = this.f11596m.getLayoutParams();
                            layoutParams4.width = q.a(context, 80.0f);
                            layoutParams4.height = q.a(context, 48.0f);
                            this.f11596m.setLayoutParams(layoutParams4);
                            this.f11596m.setPadding(q.a(context, 34.0f), q.a(context, 14.0f), q.a(context, 34.0f), q.a(context, 14.0f));
                            this.f11596m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f20419c));
                        }
                        z6 = true;
                        break;
                    } else {
                        this.f11595l.setPadding(0, q.a(context, 10.0f), 0, 0);
                        z6 = false;
                        break;
                    }
                    break;
                case 8:
                    break;
                default:
                    if (!m.g(context)) {
                        this.f11595l.setPadding(0, q.a(context, 26.0f), 0, 0);
                        View view7 = this.f11592h;
                        if (view7 != null) {
                            view7.setPadding(0, 0, 0, 0);
                        }
                        b(context, this.f11594k, 14.0f);
                        b(context, this.i, 92.0f);
                        if (this.f11590f == -100) {
                            a(context, this.f11595l, 44.0f);
                        }
                    } else {
                        this.f11595l.setPadding(0, 0, 0, 0);
                        View view8 = this.f11596m;
                        if (view8 != null) {
                            ViewGroup.LayoutParams layoutParams5 = view8.getLayoutParams();
                            layoutParams5.height = q.a(context, 48.0f);
                            this.f11596m.setLayoutParams(layoutParams5);
                            this.f11596m.setPadding(q.a(context, 34.0f), q.a(context, 14.0f), q.a(context, 34.0f), q.a(context, 14.0f));
                            this.f11596m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f20419c));
                        }
                        View view9 = this.f11597n;
                        if (view9 != null && view9.getLayoutParams() != null) {
                            ViewGroup.LayoutParams layoutParams6 = this.f11597n.getLayoutParams();
                            if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
                                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
                                layoutParams7.addRule(0, q.a(context, "myoffer_fl_invalid_btn", "id"));
                                this.f11597n.setLayoutParams(layoutParams7);
                            }
                        }
                        if (this.f11590f == -100) {
                            ViewGroup.LayoutParams layoutParams8 = this.f11595l.getLayoutParams();
                            layoutParams8.width = -2;
                            if (layoutParams8 instanceof RelativeLayout.LayoutParams) {
                                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
                                layoutParams9.addRule(11);
                                layoutParams9.rightMargin = q.a(context, 20.0f);
                                layoutParams9.bottomMargin = q.a(context, 30.0f);
                            }
                            this.f11595l.setLayoutParams(layoutParams8);
                        }
                    }
                    z6 = false;
                    break;
            }
            this.f11595l.setVisibility(0);
            a(z6);
        }
        if (!m.g(context)) {
            this.f11595l.setPadding(0, q.a(context, 26.0f), 0, 0);
            a(context, this.i, 100.0f);
            a(context, this.f11593j, 152.0f);
            if (this.f11590f == -101) {
                a(context, this.f11595l, 35.0f);
            }
        } else {
            this.f11595l.setPadding(0, 0, 0, 0);
            View view10 = this.f11596m;
            if (view10 != null) {
                ViewGroup.LayoutParams layoutParams10 = view10.getLayoutParams();
                layoutParams10.height = q.a(context, 48.0f);
                this.f11596m.setLayoutParams(layoutParams10);
                this.f11596m.setPadding(q.a(context, 34.0f), q.a(context, 14.0f), q.a(context, 34.0f), q.a(context, 14.0f));
                this.f11596m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f20419c));
            }
            if (this.f11590f == -101) {
                ViewGroup.LayoutParams layoutParams11 = this.f11595l.getLayoutParams();
                layoutParams11.width = -2;
                if (layoutParams11 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) layoutParams11;
                    layoutParams12.addRule(11);
                    layoutParams12.rightMargin = q.a(context, 20.0f);
                    layoutParams12.bottomMargin = q.a(context, 30.0f);
                }
                this.f11595l.setLayoutParams(layoutParams11);
            }
        }
        z6 = false;
        this.f11595l.setVisibility(0);
        a(z6);
    }

    private static void b(Context context, View view, float f2) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = q.a(context, f2);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = q.a(context, f2);
        }
    }

    public final void b() {
        t.b().b(new Runnable() { // from class: com.anythink.basead.ui.f.d.4
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.f11595l != null) {
                    d.this.f11595l.setVisibility(0);
                }
            }
        });
    }

    private void a(Context context) {
        if (this.i == null) {
            this.i = this.f11591g.findViewById(q.a(context, "myoffer_splash_ad_cta_layout", "id"));
        }
        if (this.f11593j == null) {
            this.f11593j = this.f11591g.findViewById(q.a(context, "myoffer_shake_view", "id"));
        }
        if (BaseSdkSplashATView.isSinglePicture(this.f11588d, this.f11589e)) {
            this.f11595l.setPadding(0, q.a(context, 26.0f), 0, 0);
            a(context, this.i, 100.0f);
            a(context, this.f11593j, 100.0f);
        } else if (this.f11589e.C() == 2) {
            this.f11595l.setPadding(0, 0, 0, 0);
            View view = this.f11596m;
            if (view != null && view.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams = this.f11596m.getLayoutParams();
                layoutParams.height = q.a(context, 46.0f);
                this.f11596m.setLayoutParams(layoutParams);
                this.f11596m.setPadding(q.a(context, 31.0f), q.a(context, 13.0f), q.a(context, 33.0f), q.a(context, 13.0f));
                this.f11596m.setBackgroundResource(q.a(context, "myoffer_invalid_button_shape_radius_24", k.f20419c));
            }
            View view2 = this.f11597n;
            if (view2 != null && view2.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams2 = this.f11597n.getLayoutParams();
                if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    layoutParams3.addRule(0, q.a(context, "myoffer_fl_invalid_btn", "id"));
                    layoutParams3.rightMargin = q.a(context, 10.0f);
                    this.f11597n.setLayoutParams(layoutParams3);
                }
                this.f11597n.setPadding(0, 0, 0, 0);
            }
        } else {
            this.f11595l.setPadding(0, q.a(context, 26.0f), 0, 0);
            View view3 = this.f11592h;
            if (view3 != null) {
                view3.setPadding(0, q.a(context, 25.0f), 0, 0);
            }
        }
        this.f11595l.setVisibility(0);
        a(false);
    }

    private void a(boolean z6) {
        View view;
        if (z6 && (view = this.f11596m) != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.d.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (d.this.f11598o != null) {
                        d.this.f11598o.a(10, 14);
                    }
                }
            });
            return;
        }
        View view2 = this.f11595l;
        if (view2 == null) {
            return;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.d.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                if (d.this.f11598o != null) {
                    d.this.f11598o.a(10, 14);
                }
            }
        });
    }

    private static void a(Context context, View view, float f2) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = q.a(context, f2);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = q.a(context, f2);
        }
    }

    private static int a(Context context, float f2) {
        return q.a(context, f2);
    }

    public final void a() {
        t.b().b(new Runnable() { // from class: com.anythink.basead.ui.f.d.3
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.f11595l != null) {
                    d.this.f11595l.setVisibility(8);
                }
            }
        });
    }
}
