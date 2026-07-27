package com.anythink.basead.ui.f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.e;
import com.anythink.basead.ui.RoundCornerRelativeLayout;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    View f10916a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f10917b;

    /* renamed from: c, reason: collision with root package name */
    TextView f10918c;

    /* renamed from: d, reason: collision with root package name */
    TextView f10919d;

    /* renamed from: e, reason: collision with root package name */
    TextView f10920e;

    /* renamed from: f, reason: collision with root package name */
    TextView f10921f;

    /* renamed from: g, reason: collision with root package name */
    TextView f10922g;

    /* renamed from: h, reason: collision with root package name */
    TextView f10923h;
    RoundCornerRelativeLayout i;

    /* renamed from: j, reason: collision with root package name */
    ImageView f10924j;

    /* renamed from: k, reason: collision with root package name */
    private final w<?> f10925k;

    /* renamed from: l, reason: collision with root package name */
    private final x f10926l;

    /* renamed from: m, reason: collision with root package name */
    private y f10927m;

    /* renamed from: n, reason: collision with root package name */
    private FrameLayout f10928n;

    /* renamed from: o, reason: collision with root package name */
    private View f10929o;

    /* renamed from: com.anythink.basead.ui.f.a$10, reason: invalid class name */
    public class AnonymousClass10 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f10931a;

        public AnonymousClass10(Context context) {
            this.f10931a = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new com.anythink.basead.e().a(this.f10931a, a.this.f10925k, a.this.f10926l, new e.a() { // from class: com.anythink.basead.ui.f.a.10.1
                @Override // com.anythink.basead.e.a
                public final void a() {
                }

                @Override // com.anythink.basead.e.a
                public final void b() {
                }
            });
        }
    }

    /* renamed from: com.anythink.basead.ui.f.a$2, reason: invalid class name */
    public class AnonymousClass2 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10934a;

        public AnonymousClass2(View view) {
            this.f10934a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f10934a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            int height = this.f10934a.getHeight();
            int width = this.f10934a.getWidth();
            int a9 = q.a(this.f10934a.getContext(), 8.0f);
            ViewGroup.LayoutParams layoutParams = this.f10934a.getLayoutParams();
            layoutParams.height = a9;
            if (width <= 0 || height <= 0) {
                layoutParams.width = a9;
            } else {
                layoutParams.width = (a9 * width) / height;
            }
            this.f10934a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.anythink.basead.ui.f.a$8, reason: invalid class name */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.f.a$9, reason: invalid class name */
    public class AnonymousClass9 implements b.a {
        public AnonymousClass9() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, a.this.f10925k.C())) {
                a.this.f10917b.setScaleType(ImageView.ScaleType.FIT_XY);
                a.this.f10917b.setImageBitmap(bitmap);
                a.this.f10917b.setVisibility(0);
                a.this.f10917b.post(new Runnable() { // from class: com.anythink.basead.ui.f.a.9.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a.this.f10926l != null && a.this.f10925k.c() && a.this.f10926l.f14317f == 28) {
                            a.this.f10917b.setBackgroundColor(Color.parseColor("#66999999"));
                        }
                    }
                });
            }
        }
    }

    public a(w<?> wVar, x xVar) {
        this.f10925k = wVar;
        this.f10926l = xVar;
        if (wVar != null) {
            this.f10927m = xVar.f14325o;
        }
    }

    private void c(View view) {
        Context context = view.getContext();
        this.f10928n = (FrameLayout) view.findViewById(q.a(context, "myoffer_ad_logo_container", "id"));
        this.f10917b = (ImageView) view.findViewById(q.a(context, "myoffer_ad_logo", "id"));
        this.i = (RoundCornerRelativeLayout) view.findViewById(q.a(context, "myoffer_banner_ad_logo_container", "id"));
        this.f10924j = (ImageView) view.findViewById(q.a(context, "myoffer_banner_self_ad_logo_label", "id"));
        if (this.f10917b == null) {
            this.f10917b = (ImageView) view.findViewById(q.a(context, "myoffer_banner_self_ad_logo", "id"));
        }
        View view2 = this.f10929o;
        if (this.f10928n != null && view2 != null && view2.getVisibility() == 0) {
            if (view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            this.f10928n.removeAllViews();
            this.f10928n.addView(view2);
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2(view2));
            return;
        }
        ImageView imageView = this.f10917b;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f10917b.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f10917b.setOnClickListener(new AnonymousClass8());
            this.f10917b.setImageResource(q.a(context, "myoffer_ad_logo_default", k.f19790c));
            if (!TextUtils.isEmpty(this.f10925k.C())) {
                int a9 = q.a(context, 100.0f);
                com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, this.f10925k.C()), a9, a9, new AnonymousClass9());
            } else if (this.f10925k.S() != null) {
                Bitmap S8 = this.f10925k.S();
                ViewGroup.LayoutParams layoutParams = this.f10917b.getLayoutParams();
                int i = layoutParams.height;
                layoutParams.width = (int) (i * ((S8.getWidth() * 1.0f) / S8.getHeight()));
                layoutParams.height = i;
                this.f10917b.setLayoutParams(layoutParams);
                this.f10917b.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f10917b.setImageBitmap(S8);
                this.f10917b.setImageBitmap(this.f10925k.S());
                this.f10917b.setVisibility(0);
            } else if (this.f10925k.c()) {
                this.f10917b.setVisibility(4);
            }
        }
        if (this.i != null) {
            w<?> wVar = this.f10925k;
            if (wVar == null || TextUtils.isEmpty(wVar.ak()) || this.f10924j == null) {
                this.i.setRadius(0);
                return;
            }
            this.i.setRadius(2);
            this.f10924j.setVisibility(0);
            this.f10917b.setClickable(false);
            this.i.setOnClickListener(new AnonymousClass10(context));
        }
    }

    private boolean d(View view) {
        if (this.f10928n == null || view == null || view.getVisibility() != 0) {
            return false;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.f10928n.removeAllViews();
        this.f10928n.addView(view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2(view));
        return true;
    }

    public final void a(View view) {
        this.f10929o = view;
    }

    public final void b(View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        Context context2 = view.getContext();
        this.f10928n = (FrameLayout) view.findViewById(q.a(context2, "myoffer_ad_logo_container", "id"));
        this.f10917b = (ImageView) view.findViewById(q.a(context2, "myoffer_ad_logo", "id"));
        this.i = (RoundCornerRelativeLayout) view.findViewById(q.a(context2, "myoffer_banner_ad_logo_container", "id"));
        this.f10924j = (ImageView) view.findViewById(q.a(context2, "myoffer_banner_self_ad_logo_label", "id"));
        if (this.f10917b == null) {
            this.f10917b = (ImageView) view.findViewById(q.a(context2, "myoffer_banner_self_ad_logo", "id"));
        }
        View view2 = this.f10929o;
        if (this.f10928n == null || view2 == null || view2.getVisibility() != 0) {
            ImageView imageView = this.f10917b;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.f10917b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f10917b.setOnClickListener(new AnonymousClass8());
                this.f10917b.setImageResource(q.a(context2, "myoffer_ad_logo_default", k.f19790c));
                if (!TextUtils.isEmpty(this.f10925k.C())) {
                    int a9 = q.a(context2, 100.0f);
                    com.anythink.core.common.res.b.a(context2).a(new com.anythink.core.common.res.e(3, this.f10925k.C()), a9, a9, new AnonymousClass9());
                } else if (this.f10925k.S() != null) {
                    Bitmap S8 = this.f10925k.S();
                    ViewGroup.LayoutParams layoutParams = this.f10917b.getLayoutParams();
                    int i = layoutParams.height;
                    layoutParams.width = (int) (i * ((S8.getWidth() * 1.0f) / S8.getHeight()));
                    layoutParams.height = i;
                    this.f10917b.setLayoutParams(layoutParams);
                    this.f10917b.setScaleType(ImageView.ScaleType.FIT_XY);
                    this.f10917b.setImageBitmap(S8);
                    this.f10917b.setImageBitmap(this.f10925k.S());
                    this.f10917b.setVisibility(0);
                } else if (this.f10925k.c()) {
                    this.f10917b.setVisibility(4);
                }
            }
            if (this.i != null) {
                w<?> wVar = this.f10925k;
                if (wVar == null || TextUtils.isEmpty(wVar.ak()) || this.f10924j == null) {
                    this.i.setRadius(0);
                } else {
                    this.i.setRadius(2);
                    this.f10924j.setVisibility(0);
                    this.f10917b.setClickable(false);
                    this.i.setOnClickListener(new AnonymousClass10(context2));
                }
            }
        } else {
            if (view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            this.f10928n.removeAllViews();
            this.f10928n.addView(view2);
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2(view2));
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(q.a(context, "myoffer_four_element_container", "id"));
        this.f10916a = viewGroup;
        if (viewGroup == null) {
            return;
        }
        this.f10918c = (TextView) viewGroup.findViewById(q.a(context, "myoffer_publisher_name", "id"));
        this.f10920e = (TextView) this.f10916a.findViewById(q.a(context, "myoffer_privacy_agreement", "id"));
        this.f10921f = (TextView) this.f10916a.findViewById(q.a(context, "myoffer_permission_manage", "id"));
        this.f10919d = (TextView) this.f10916a.findViewById(q.a(context, "myoffer_version_name", "id"));
        this.f10922g = (TextView) this.f10916a.findViewById(q.a(context, "myoffer_function_manage", "id"));
        this.f10923h = (TextView) this.f10916a.findViewById(q.a(context, "myoffer_disclaimer", "id"));
        View findViewById = view.findViewById(q.a(context, "myoffer_four_element_container_bg", "id"));
        View findViewById2 = this.f10916a.findViewById(q.a(context, "myoffer_center_line1", "id"));
        if (findViewById2 == null) {
            findViewById2 = this.f10916a.findViewById(q.a(context, "myoffer_banner_center_line", "id"));
        }
        View findViewById3 = this.f10916a.findViewById(q.a(context, "myoffer_center_line2", "id"));
        if (findViewById3 == null) {
            findViewById3 = this.f10916a.findViewById(q.a(context, "myoffer_banner_center_line2", "id"));
        }
        View findViewById4 = this.f10916a.findViewById(q.a(context, "myoffer_center_line3", "id"));
        if (this.f10925k.T()) {
            this.f10916a.setVisibility(0);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            TextView textView = this.f10918c;
            if (textView != null) {
                textView.setVisibility(0);
                this.f10918c.setText(this.f10925k.M());
                this.f10918c.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                });
            }
            TextView textView2 = this.f10919d;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f10919d.setText(context.getResources().getString(q.a(context, "myoffer_panel_version", k.f19794g), this.f10925k.N()));
                this.f10919d.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                });
            }
            if (this.f10920e != null) {
                if (TextUtils.isEmpty(this.f10925k.O())) {
                    this.f10920e.setVisibility(8);
                } else {
                    this.f10920e.setVisibility(0);
                    this.f10920e.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            com.anythink.core.common.v.y.a(t.b().g(), a.this.f10925k.O());
                        }
                    });
                }
            }
            if (this.f10921f != null) {
                if (TextUtils.isEmpty(this.f10925k.P())) {
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                    this.f10921f.setVisibility(8);
                } else {
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    this.f10921f.setVisibility(0);
                    this.f10921f.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            com.anythink.core.common.v.y.a(t.b().g(), a.this.f10925k.P());
                        }
                    });
                }
            }
            if (this.f10922g != null) {
                if (TextUtils.isEmpty(this.f10925k.h())) {
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(8);
                    }
                    this.f10922g.setVisibility(8);
                } else {
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(0);
                    }
                    this.f10922g.setVisibility(0);
                    this.f10922g.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            com.anythink.core.common.v.y.a(t.b().g(), a.this.f10925k.h());
                        }
                    });
                }
            }
        } else {
            if (this.f10916a != null && !TextUtils.equals(String.valueOf(this.f10927m.F()), "2")) {
                this.f10916a.setVisibility(8);
            }
            TextView textView3 = this.f10919d;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.f10918c;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextView textView5 = this.f10920e;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.f10921f;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.f10922g;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            if (findViewById != null) {
                try {
                    findViewById.setBackground(null);
                } catch (Throwable unused) {
                }
            }
        }
        if (this.f10923h != null) {
            View view3 = this.f10916a;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            this.f10923h.setVisibility(0);
            if (findViewById4 != null && this.f10925k.T()) {
                findViewById4.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.f10926l.f14325o.aU())) {
                return;
            }
            this.f10923h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    com.anythink.core.common.v.y.a(t.b().g(), a.this.f10926l.f14325o.aU());
                }
            });
        }
    }

    public final void a() {
        ImageView imageView = this.f10917b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.f10916a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void a(BaseAd baseAd, com.anythink.core.basead.b.b bVar) {
        a(baseAd, bVar, false);
    }

    public final void a(BaseAd baseAd, com.anythink.core.basead.b.b bVar, boolean z8) {
        x xVar = this.f10926l;
        if (xVar == null || baseAd == null || bVar == null || this.f10916a == null || xVar.f14317f != 34) {
            return;
        }
        String domain = baseAd.getDomain();
        String warning = baseAd.getWarning();
        String adFrom = baseAd.getAdFrom();
        if (TextUtils.isEmpty(domain) && TextUtils.isEmpty(warning) && TextUtils.isEmpty(adFrom)) {
            return;
        }
        this.f10916a.setVisibility(0);
        if (z8 && this.f10919d != null && !TextUtils.isEmpty(adFrom)) {
            a(this.f10919d, adFrom);
            bVar.f(this.f10919d);
        }
        if (this.f10921f != null && !TextUtils.isEmpty(domain)) {
            a(this.f10921f, domain);
            bVar.g(this.f10921f);
        }
        if (this.f10922g == null || TextUtils.isEmpty(warning)) {
            return;
        }
        a(this.f10922g, warning);
        bVar.h(this.f10922g);
    }

    private static void a(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }
}
