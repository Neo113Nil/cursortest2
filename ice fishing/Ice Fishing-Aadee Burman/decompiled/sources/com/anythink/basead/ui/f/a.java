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
    View f10759a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f10760b;

    /* renamed from: c, reason: collision with root package name */
    TextView f10761c;

    /* renamed from: d, reason: collision with root package name */
    TextView f10762d;

    /* renamed from: e, reason: collision with root package name */
    TextView f10763e;

    /* renamed from: f, reason: collision with root package name */
    TextView f10764f;

    /* renamed from: g, reason: collision with root package name */
    TextView f10765g;

    /* renamed from: h, reason: collision with root package name */
    TextView f10766h;
    RoundCornerRelativeLayout i;

    /* renamed from: j, reason: collision with root package name */
    ImageView f10767j;

    /* renamed from: k, reason: collision with root package name */
    private final w<?> f10768k;

    /* renamed from: l, reason: collision with root package name */
    private final x f10769l;

    /* renamed from: m, reason: collision with root package name */
    private y f10770m;

    /* renamed from: n, reason: collision with root package name */
    private FrameLayout f10771n;

    /* renamed from: o, reason: collision with root package name */
    private View f10772o;

    /* renamed from: com.anythink.basead.ui.f.a$10, reason: invalid class name */
    public class AnonymousClass10 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f10774a;

        public AnonymousClass10(Context context) {
            this.f10774a = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new com.anythink.basead.e().a(this.f10774a, a.this.f10768k, a.this.f10769l, new e.a() { // from class: com.anythink.basead.ui.f.a.10.1
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
        final /* synthetic */ View f10777a;

        public AnonymousClass2(View view) {
            this.f10777a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f10777a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            int height = this.f10777a.getHeight();
            int width = this.f10777a.getWidth();
            int a9 = q.a(this.f10777a.getContext(), 8.0f);
            ViewGroup.LayoutParams layoutParams = this.f10777a.getLayoutParams();
            layoutParams.height = a9;
            if (width <= 0 || height <= 0) {
                layoutParams.width = a9;
            } else {
                layoutParams.width = (a9 * width) / height;
            }
            this.f10777a.setLayoutParams(layoutParams);
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
            if (TextUtils.equals(str, a.this.f10768k.C())) {
                a.this.f10760b.setScaleType(ImageView.ScaleType.FIT_XY);
                a.this.f10760b.setImageBitmap(bitmap);
                a.this.f10760b.setVisibility(0);
                a.this.f10760b.post(new Runnable() { // from class: com.anythink.basead.ui.f.a.9.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a.this.f10769l != null && a.this.f10768k.c() && a.this.f10769l.f14160f == 28) {
                            a.this.f10760b.setBackgroundColor(Color.parseColor("#66999999"));
                        }
                    }
                });
            }
        }
    }

    public a(w<?> wVar, x xVar) {
        this.f10768k = wVar;
        this.f10769l = xVar;
        if (wVar != null) {
            this.f10770m = xVar.f14168o;
        }
    }

    private void c(View view) {
        Context context = view.getContext();
        this.f10771n = (FrameLayout) view.findViewById(q.a(context, "myoffer_ad_logo_container", "id"));
        this.f10760b = (ImageView) view.findViewById(q.a(context, "myoffer_ad_logo", "id"));
        this.i = (RoundCornerRelativeLayout) view.findViewById(q.a(context, "myoffer_banner_ad_logo_container", "id"));
        this.f10767j = (ImageView) view.findViewById(q.a(context, "myoffer_banner_self_ad_logo_label", "id"));
        if (this.f10760b == null) {
            this.f10760b = (ImageView) view.findViewById(q.a(context, "myoffer_banner_self_ad_logo", "id"));
        }
        View view2 = this.f10772o;
        if (this.f10771n != null && view2 != null && view2.getVisibility() == 0) {
            if (view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            this.f10771n.removeAllViews();
            this.f10771n.addView(view2);
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2(view2));
            return;
        }
        ImageView imageView = this.f10760b;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f10760b.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f10760b.setOnClickListener(new AnonymousClass8());
            this.f10760b.setImageResource(q.a(context, "myoffer_ad_logo_default", k.f19632c));
            if (!TextUtils.isEmpty(this.f10768k.C())) {
                int a9 = q.a(context, 100.0f);
                com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, this.f10768k.C()), a9, a9, new AnonymousClass9());
            } else if (this.f10768k.S() != null) {
                Bitmap S8 = this.f10768k.S();
                ViewGroup.LayoutParams layoutParams = this.f10760b.getLayoutParams();
                int i = layoutParams.height;
                layoutParams.width = (int) (i * ((S8.getWidth() * 1.0f) / S8.getHeight()));
                layoutParams.height = i;
                this.f10760b.setLayoutParams(layoutParams);
                this.f10760b.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f10760b.setImageBitmap(S8);
                this.f10760b.setImageBitmap(this.f10768k.S());
                this.f10760b.setVisibility(0);
            } else if (this.f10768k.c()) {
                this.f10760b.setVisibility(4);
            }
        }
        if (this.i != null) {
            w<?> wVar = this.f10768k;
            if (wVar == null || TextUtils.isEmpty(wVar.ak()) || this.f10767j == null) {
                this.i.setRadius(0);
                return;
            }
            this.i.setRadius(2);
            this.f10767j.setVisibility(0);
            this.f10760b.setClickable(false);
            this.i.setOnClickListener(new AnonymousClass10(context));
        }
    }

    private boolean d(View view) {
        if (this.f10771n == null || view == null || view.getVisibility() != 0) {
            return false;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.f10771n.removeAllViews();
        this.f10771n.addView(view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2(view));
        return true;
    }

    public final void a(View view) {
        this.f10772o = view;
    }

    public final void b(View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        Context context2 = view.getContext();
        this.f10771n = (FrameLayout) view.findViewById(q.a(context2, "myoffer_ad_logo_container", "id"));
        this.f10760b = (ImageView) view.findViewById(q.a(context2, "myoffer_ad_logo", "id"));
        this.i = (RoundCornerRelativeLayout) view.findViewById(q.a(context2, "myoffer_banner_ad_logo_container", "id"));
        this.f10767j = (ImageView) view.findViewById(q.a(context2, "myoffer_banner_self_ad_logo_label", "id"));
        if (this.f10760b == null) {
            this.f10760b = (ImageView) view.findViewById(q.a(context2, "myoffer_banner_self_ad_logo", "id"));
        }
        View view2 = this.f10772o;
        if (this.f10771n == null || view2 == null || view2.getVisibility() != 0) {
            ImageView imageView = this.f10760b;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.f10760b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f10760b.setOnClickListener(new AnonymousClass8());
                this.f10760b.setImageResource(q.a(context2, "myoffer_ad_logo_default", k.f19632c));
                if (!TextUtils.isEmpty(this.f10768k.C())) {
                    int a9 = q.a(context2, 100.0f);
                    com.anythink.core.common.res.b.a(context2).a(new com.anythink.core.common.res.e(3, this.f10768k.C()), a9, a9, new AnonymousClass9());
                } else if (this.f10768k.S() != null) {
                    Bitmap S8 = this.f10768k.S();
                    ViewGroup.LayoutParams layoutParams = this.f10760b.getLayoutParams();
                    int i = layoutParams.height;
                    layoutParams.width = (int) (i * ((S8.getWidth() * 1.0f) / S8.getHeight()));
                    layoutParams.height = i;
                    this.f10760b.setLayoutParams(layoutParams);
                    this.f10760b.setScaleType(ImageView.ScaleType.FIT_XY);
                    this.f10760b.setImageBitmap(S8);
                    this.f10760b.setImageBitmap(this.f10768k.S());
                    this.f10760b.setVisibility(0);
                } else if (this.f10768k.c()) {
                    this.f10760b.setVisibility(4);
                }
            }
            if (this.i != null) {
                w<?> wVar = this.f10768k;
                if (wVar == null || TextUtils.isEmpty(wVar.ak()) || this.f10767j == null) {
                    this.i.setRadius(0);
                } else {
                    this.i.setRadius(2);
                    this.f10767j.setVisibility(0);
                    this.f10760b.setClickable(false);
                    this.i.setOnClickListener(new AnonymousClass10(context2));
                }
            }
        } else {
            if (view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            this.f10771n.removeAllViews();
            this.f10771n.addView(view2);
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2(view2));
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(q.a(context, "myoffer_four_element_container", "id"));
        this.f10759a = viewGroup;
        if (viewGroup == null) {
            return;
        }
        this.f10761c = (TextView) viewGroup.findViewById(q.a(context, "myoffer_publisher_name", "id"));
        this.f10763e = (TextView) this.f10759a.findViewById(q.a(context, "myoffer_privacy_agreement", "id"));
        this.f10764f = (TextView) this.f10759a.findViewById(q.a(context, "myoffer_permission_manage", "id"));
        this.f10762d = (TextView) this.f10759a.findViewById(q.a(context, "myoffer_version_name", "id"));
        this.f10765g = (TextView) this.f10759a.findViewById(q.a(context, "myoffer_function_manage", "id"));
        this.f10766h = (TextView) this.f10759a.findViewById(q.a(context, "myoffer_disclaimer", "id"));
        View findViewById = view.findViewById(q.a(context, "myoffer_four_element_container_bg", "id"));
        View findViewById2 = this.f10759a.findViewById(q.a(context, "myoffer_center_line1", "id"));
        if (findViewById2 == null) {
            findViewById2 = this.f10759a.findViewById(q.a(context, "myoffer_banner_center_line", "id"));
        }
        View findViewById3 = this.f10759a.findViewById(q.a(context, "myoffer_center_line2", "id"));
        if (findViewById3 == null) {
            findViewById3 = this.f10759a.findViewById(q.a(context, "myoffer_banner_center_line2", "id"));
        }
        View findViewById4 = this.f10759a.findViewById(q.a(context, "myoffer_center_line3", "id"));
        if (this.f10768k.T()) {
            this.f10759a.setVisibility(0);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            TextView textView = this.f10761c;
            if (textView != null) {
                textView.setVisibility(0);
                this.f10761c.setText(this.f10768k.M());
                this.f10761c.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                });
            }
            TextView textView2 = this.f10762d;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f10762d.setText(context.getResources().getString(q.a(context, "myoffer_panel_version", k.f19636g), this.f10768k.N()));
                this.f10762d.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                    }
                });
            }
            if (this.f10763e != null) {
                if (TextUtils.isEmpty(this.f10768k.O())) {
                    this.f10763e.setVisibility(8);
                } else {
                    this.f10763e.setVisibility(0);
                    this.f10763e.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            com.anythink.core.common.v.y.a(t.b().g(), a.this.f10768k.O());
                        }
                    });
                }
            }
            if (this.f10764f != null) {
                if (TextUtils.isEmpty(this.f10768k.P())) {
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                    this.f10764f.setVisibility(8);
                } else {
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    this.f10764f.setVisibility(0);
                    this.f10764f.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            com.anythink.core.common.v.y.a(t.b().g(), a.this.f10768k.P());
                        }
                    });
                }
            }
            if (this.f10765g != null) {
                if (TextUtils.isEmpty(this.f10768k.h())) {
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(8);
                    }
                    this.f10765g.setVisibility(8);
                } else {
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(0);
                    }
                    this.f10765g.setVisibility(0);
                    this.f10765g.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            com.anythink.core.common.v.y.a(t.b().g(), a.this.f10768k.h());
                        }
                    });
                }
            }
        } else {
            if (this.f10759a != null && !TextUtils.equals(String.valueOf(this.f10770m.F()), "2")) {
                this.f10759a.setVisibility(8);
            }
            TextView textView3 = this.f10762d;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.f10761c;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextView textView5 = this.f10763e;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.f10764f;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.f10765g;
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
        if (this.f10766h != null) {
            View view3 = this.f10759a;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            this.f10766h.setVisibility(0);
            if (findViewById4 != null && this.f10768k.T()) {
                findViewById4.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.f10769l.f14168o.aU())) {
                return;
            }
            this.f10766h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.f.a.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    com.anythink.core.common.v.y.a(t.b().g(), a.this.f10769l.f14168o.aU());
                }
            });
        }
    }

    public final void a() {
        ImageView imageView = this.f10760b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.f10759a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void a(BaseAd baseAd, com.anythink.core.basead.b.b bVar) {
        a(baseAd, bVar, false);
    }

    public final void a(BaseAd baseAd, com.anythink.core.basead.b.b bVar, boolean z3) {
        x xVar = this.f10769l;
        if (xVar == null || baseAd == null || bVar == null || this.f10759a == null || xVar.f14160f != 34) {
            return;
        }
        String domain = baseAd.getDomain();
        String warning = baseAd.getWarning();
        String adFrom = baseAd.getAdFrom();
        if (TextUtils.isEmpty(domain) && TextUtils.isEmpty(warning) && TextUtils.isEmpty(adFrom)) {
            return;
        }
        this.f10759a.setVisibility(0);
        if (z3 && this.f10762d != null && !TextUtils.isEmpty(adFrom)) {
            a(this.f10762d, adFrom);
            bVar.f(this.f10762d);
        }
        if (this.f10764f != null && !TextUtils.isEmpty(domain)) {
            a(this.f10764f, domain);
            bVar.g(this.f10764f);
        }
        if (this.f10765g == null || TextUtils.isEmpty(warning)) {
            return;
        }
        a(this.f10765g, warning);
        bVar.h(this.f10765g);
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
