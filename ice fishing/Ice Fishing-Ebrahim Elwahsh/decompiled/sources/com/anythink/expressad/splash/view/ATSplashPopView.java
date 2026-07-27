package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.c.i;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.q;
import com.anythink.expressad.foundation.h.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ATSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final String f20855c = "ATSplashPopView";

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f20856d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    View.OnClickListener f20857a;

    /* renamed from: b, reason: collision with root package name */
    View.OnClickListener f20858b;

    /* renamed from: e, reason: collision with root package name */
    private String f20859e;

    /* renamed from: f, reason: collision with root package name */
    private String f20860f;

    /* renamed from: g, reason: collision with root package name */
    private int f20861g;

    /* renamed from: h, reason: collision with root package name */
    private d f20862h;
    private com.anythink.expressad.splash.d.d i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f20863j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f20864k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f20865l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView f20866m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f20867n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f20868o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f20869p;

    /* renamed from: q, reason: collision with root package name */
    private int f20870q;

    /* renamed from: r, reason: collision with root package name */
    private Handler f20871r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20872s;

    /* renamed from: t, reason: collision with root package name */
    private com.anythink.expressad.b.a f20873t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f20874u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f20875v;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f20884a;

        /* renamed from: b, reason: collision with root package name */
        private String f20885b;

        /* renamed from: c, reason: collision with root package name */
        private int f20886c;

        /* renamed from: d, reason: collision with root package name */
        private d f20887d;

        public a(String str, String str2, int i, d dVar) {
            this.f20884a = str;
            this.f20885b = str2;
            this.f20886c = i;
            this.f20887d = dVar;
        }

        public final String a() {
            return this.f20884a;
        }

        public final String b() {
            return this.f20885b;
        }

        public final int c() {
            return this.f20886c;
        }

        public final d d() {
            return this.f20887d;
        }

        private void a(String str) {
            this.f20884a = str;
        }

        private void b(String str) {
            this.f20885b = str;
        }

        private void a(int i) {
            this.f20886c = i;
        }

        private void a(d dVar) {
            this.f20887d = dVar;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public ATSplashPopView(Context context, a aVar, com.anythink.expressad.splash.d.d dVar) {
        super(context);
        this.f20861g = 1;
        this.f20870q = -1;
        this.f20871r = new Handler();
        this.f20872s = false;
        this.f20874u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f20869p != null) {
                    if (ATSplashPopView.this.f20870q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f20869p.setText(String.valueOf(ATSplashPopView.this.f20870q));
                        ATSplashPopView.this.f20871r.postDelayed(ATSplashPopView.this.f20874u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f20871r.removeCallbacks(ATSplashPopView.this.f20874u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f20875v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f20861g;
                }
            }
        };
        this.f20857a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f20862h);
                }
            }
        };
        this.f20858b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f20870q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        if (aVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f20860f = aVar.b();
        this.f20859e = aVar.a();
        this.f20861g = aVar.c();
        this.f20862h = aVar.d();
        this.i = dVar;
        a();
    }

    private void a(String str) {
        i.m().a(str, new c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }
        });
    }

    private void b(String str) {
        i.m().a(str, new c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.3
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    ATSplashPopView.this.f20864k.setImageBitmap(q.a(bitmap, 16));
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
    }

    public static /* synthetic */ int e(ATSplashPopView aTSplashPopView) {
        aTSplashPopView.f20870q = -1;
        return -1;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i4;
        do {
            atomicInteger = f20856d;
            i = atomicInteger.get();
            i4 = i + 1;
            if (i4 > 16777215) {
                i4 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i4));
        return i;
    }

    public static /* synthetic */ int j(ATSplashPopView aTSplashPopView) {
        int i = aTSplashPopView.f20870q;
        aTSplashPopView.f20870q = i - 1;
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i != null) {
            postDelayed(this.f20875v, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f20872s = true;
        if (this.f20869p != null) {
            this.f20871r.removeCallbacks(this.f20874u);
        }
    }

    public void reStartCountDown() {
        if (this.f20872s) {
            this.f20872s = false;
            int i = this.f20870q;
            if (i == -1 || i == 0) {
                g();
                return;
            }
            TextView textView = this.f20869p;
            if (textView != null) {
                textView.setText(String.valueOf(i));
                this.f20871r.postDelayed(this.f20874u, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f20871r.removeCallbacks(this.f20875v);
            this.f20871r.removeCallbacks(this.f20874u);
            this.f20874u = null;
            detachAllViewsFromParent();
            this.f20862h = null;
            this.i = null;
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public void setPopViewType(a aVar, com.anythink.expressad.splash.d.d dVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f20860f = aVar.b();
        this.f20859e = aVar.a();
        this.f20861g = aVar.c();
        this.f20862h = aVar.d();
        this.i = dVar;
        a();
    }

    public void startCountDown() {
        this.f20871r.removeCallbacks(this.f20874u);
        d dVar = this.f20862h;
        if (dVar == null || this.f20861g != 1) {
            return;
        }
        int v6 = dVar.v();
        if (v6 <= 0) {
            g();
            return;
        }
        this.f20870q = v6;
        TextView textView = this.f20869p;
        if (textView != null) {
            textView.setText(String.valueOf(v6));
            this.f20871r.postDelayed(this.f20874u, 1000L);
        }
    }

    private void c() {
        int b9 = v.b(getContext(), 4.0f);
        this.f20863j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 28.0f), v.b(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f20863j.setId(generateViewId());
        this.f20863j.setLayoutParams(layoutParams);
        this.f20863j.setPadding(b9, b9, b9, b9);
        this.f20863j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f20862h.bl(), false);
        TextView textView = new TextView(getContext());
        this.f20867n = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f20863j.getId());
        layoutParams2.addRule(6, this.f20863j.getId());
        layoutParams2.addRule(8, this.f20863j.getId());
        layoutParams2.leftMargin = v.b(getContext(), 4.0f);
        layoutParams2.rightMargin = v.b(getContext(), 40.0f);
        this.f20867n.setLayoutParams(layoutParams2);
        this.f20867n.setGravity(16);
        this.f20867n.setTextSize(10.0f);
        this.f20867n.setSelected(true);
        this.f20867n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f20867n.setMarqueeRepeatLimit(-1);
        this.f20867n.setSingleLine(true);
        this.f20867n.setTextColor(-16777216);
        this.f20867n.setText(this.f20862h.bj());
        setBackgroundResource(k.a(getContext(), "anythink_shape_corners_bg", k.f19790c));
        addView(this.f20863j);
        addView(this.f20867n);
        f();
        setOnClickListener(this.f20857a);
    }

    private void d() {
        int b9 = v.b(getContext(), 4.0f);
        this.f20863j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 50.0f), v.b(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f20863j.setId(generateViewId());
        this.f20863j.setLayoutParams(layoutParams);
        this.f20863j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f20863j.setPadding(b9, b9, b9, b9);
        a(this.f20862h.bl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f20863j.getId());
        layoutParams2.addRule(6, this.f20863j.getId());
        layoutParams2.addRule(8, this.f20863j.getId());
        layoutParams2.leftMargin = v.b(getContext(), 8.0f);
        layoutParams2.rightMargin = v.b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f20867n = textView;
        textView.setId(generateViewId());
        this.f20867n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f20867n.setGravity(16);
        this.f20867n.setTextSize(12.0f);
        this.f20867n.setSelected(true);
        TextView textView2 = this.f20867n;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f20867n.setMarqueeRepeatLimit(-1);
        this.f20867n.setSingleLine(true);
        this.f20867n.setTextColor(-16777216);
        this.f20867n.setText(this.f20862h.bj());
        TextView textView3 = new TextView(getContext());
        this.f20868o = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f20867n.getId());
        layoutParams3.addRule(3, this.f20867n.getId());
        layoutParams3.topMargin = v.b(getContext(), 4.0f);
        layoutParams3.rightMargin = v.b(getContext(), 36.0f);
        this.f20868o.setGravity(16);
        this.f20868o.setLayoutParams(layoutParams3);
        this.f20868o.setTextSize(8.0f);
        this.f20868o.setTextColor(-10066330);
        this.f20868o.setEllipsize(truncateAt);
        this.f20868o.setMarqueeRepeatLimit(-1);
        this.f20868o.setSelected(true);
        this.f20868o.setSingleLine(true);
        this.f20868o.setText(this.f20862h.bk());
        relativeLayout.addView(this.f20867n);
        relativeLayout.addView(this.f20868o);
        setBackgroundResource(k.a(getContext(), "anythink_shape_corners_bg", k.f19790c));
        addView(this.f20863j);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f20857a);
    }

    private void e() {
        this.f20865l = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v.b(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f20865l.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f20865l.setId(generateViewId());
        this.f20865l.setLayoutParams(layoutParams);
        a(this.f20862h.bm());
        this.f20864k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v.b(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f20864k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f20864k.setId(generateViewId());
        this.f20864k.setLayoutParams(layoutParams2);
        b(this.f20862h.bm());
        this.f20863j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v.b(getContext(), 50.0f), v.b(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f20865l.getId());
        layoutParams3.topMargin = 20;
        this.f20863j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f20863j.setId(generateViewId());
        this.f20863j.setLayoutParams(layoutParams3);
        a(this.f20862h.bl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f20863j.getId());
        layoutParams4.addRule(6, this.f20863j.getId());
        layoutParams4.addRule(8, this.f20863j.getId());
        layoutParams4.leftMargin = v.b(getContext(), 8.0f);
        layoutParams4.rightMargin = v.b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f20867n = textView;
        textView.setId(generateViewId());
        this.f20867n.setGravity(16);
        this.f20867n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f20867n.setTextSize(12.0f);
        this.f20867n.setTextColor(-16777216);
        TextView textView2 = this.f20867n;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f20867n.setMarqueeRepeatLimit(-1);
        this.f20867n.setSelected(true);
        this.f20867n.setSingleLine(true);
        this.f20867n.setText(this.f20862h.bj());
        TextView textView3 = new TextView(getContext());
        this.f20868o = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f20867n.getId());
        layoutParams5.addRule(3, this.f20867n.getId());
        layoutParams5.topMargin = v.b(getContext(), 4.0f);
        layoutParams5.rightMargin = v.b(getContext(), 36.0f);
        this.f20868o.setGravity(16);
        this.f20868o.setLayoutParams(layoutParams5);
        this.f20868o.setTextSize(8.0f);
        this.f20868o.setTextColor(-10066330);
        this.f20868o.setEllipsize(truncateAt);
        this.f20868o.setMarqueeRepeatLimit(-1);
        this.f20868o.setSelected(true);
        this.f20868o.setSingleLine(true);
        this.f20868o.setText(this.f20862h.bk());
        relativeLayout.addView(this.f20867n);
        relativeLayout.addView(this.f20868o);
        addView(this.f20865l);
        addView(this.f20864k);
        addView(this.f20863j);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f20857a);
    }

    private void f() {
        String str;
        this.f20866m = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 32.0f), v.b(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f20863j.getId());
        this.f20866m.setLayoutParams(layoutParams);
        try {
            str = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            th.getMessage();
            str = "ZH";
        }
        this.f20866m.setBackgroundResource((str.toUpperCase().equals("CN") || str.toUpperCase().equals("ZH")) ? k.a(getContext(), "anythink_splash_pop_ad", k.f19790c) : k.a(getContext(), "anythink_splash_pop_ad_en", k.f19790c));
        addView(this.f20866m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f20869p;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v.b(getContext(), 16.0f);
            layoutParams.height = v.b(getContext(), 16.0f);
            this.f20869p.setLayoutParams(layoutParams);
            this.f20869p.setText("");
            this.f20869p.setSelected(true);
            this.f20869p.setBackgroundResource(k.a(getContext(), "anythink_splash_popview_close", k.f19790c));
        }
    }

    private void a(String str, final boolean z8) {
        i.m().a(str, new c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.1
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    Bitmap a9 = z8 ? q.a(bitmap) : q.a(bitmap, 16);
                    ImageView imageView = ATSplashPopView.this.f20863j;
                    if (a9 != null) {
                        bitmap = a9;
                    }
                    imageView.setImageBitmap(bitmap);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
    }

    private void b() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 80.0f), v.b(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v.b(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(k.a(getContext(), "anythink_splash_popview_default", k.f19790c));
        this.f20863j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v.b(getContext(), 60.0f), v.b(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v.b(getContext(), 7.0f);
        layoutParams2.leftMargin = v.b(getContext(), 10.0f);
        this.f20863j.setId(generateViewId());
        this.f20863j.setLayoutParams(layoutParams2);
        this.f20863j.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d dVar = this.f20862h;
        if (dVar != null && !TextUtils.isEmpty(dVar.bl())) {
            a(this.f20862h.bl(), true);
        }
        this.f20869p = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v.b(getContext(), 62.0f);
        layoutParams3.bottomMargin = v.b(getContext(), 70.0f);
        this.f20869p.setId(generateViewId());
        this.f20869p.setTextSize(10.0f);
        this.f20869p.setTextColor(-1);
        this.f20869p.setGravity(17);
        this.f20869p.setMinWidth(v.b(getContext(), 16.0f));
        this.f20869p.setMaxHeight(v.b(getContext(), 16.0f));
        this.f20869p.setLayoutParams(layoutParams3);
        this.f20869p.setBackgroundResource(k.a(getContext(), "anythink_cm_circle_50black", k.f19790c));
        addView(imageView);
        addView(this.f20869p);
        addView(this.f20863j);
        d dVar2 = this.f20862h;
        if (dVar2 != null && dVar2.v() <= 0) {
            g();
        }
        setOnClickListener(this.f20857a);
        this.f20869p.setOnClickListener(this.f20858b);
    }

    private void a() {
        if (this.f20862h == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i = this.f20861g;
        if (i == 1) {
            b();
            return;
        }
        if (i == 2) {
            c();
        } else if (i == 3) {
            d();
        } else {
            if (i != 4) {
                return;
            }
            e();
        }
    }

    public ATSplashPopView(Context context) {
        super(context);
        this.f20861g = 1;
        this.f20870q = -1;
        this.f20871r = new Handler();
        this.f20872s = false;
        this.f20874u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f20869p != null) {
                    if (ATSplashPopView.this.f20870q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f20869p.setText(String.valueOf(ATSplashPopView.this.f20870q));
                        ATSplashPopView.this.f20871r.postDelayed(ATSplashPopView.this.f20874u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f20871r.removeCallbacks(ATSplashPopView.this.f20874u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f20875v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f20861g;
                }
            }
        };
        this.f20857a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f20862h);
                }
            }
        };
        this.f20858b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f20870q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        this.f20861g = 1;
    }

    private void a(d dVar) {
        com.anythink.expressad.splash.d.d dVar2 = this.i;
        if (dVar2 != null) {
            dVar2.a(dVar);
            this.i.a(6);
        }
    }

    public static /* synthetic */ void a(ATSplashPopView aTSplashPopView, d dVar) {
        com.anythink.expressad.splash.d.d dVar2 = aTSplashPopView.i;
        if (dVar2 != null) {
            dVar2.a(dVar);
            aTSplashPopView.i.a(6);
        }
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20861g = 1;
        this.f20870q = -1;
        this.f20871r = new Handler();
        this.f20872s = false;
        this.f20874u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f20869p != null) {
                    if (ATSplashPopView.this.f20870q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f20869p.setText(String.valueOf(ATSplashPopView.this.f20870q));
                        ATSplashPopView.this.f20871r.postDelayed(ATSplashPopView.this.f20874u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f20871r.removeCallbacks(ATSplashPopView.this.f20874u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f20875v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f20861g;
                }
            }
        };
        this.f20857a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f20862h);
                }
            }
        };
        this.f20858b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f20870q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        this.f20861g = 1;
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20861g = 1;
        this.f20870q = -1;
        this.f20871r = new Handler();
        this.f20872s = false;
        this.f20874u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f20869p != null) {
                    if (ATSplashPopView.this.f20870q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f20869p.setText(String.valueOf(ATSplashPopView.this.f20870q));
                        ATSplashPopView.this.f20871r.postDelayed(ATSplashPopView.this.f20874u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f20871r.removeCallbacks(ATSplashPopView.this.f20874u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f20875v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f20861g;
                }
            }
        };
        this.f20857a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f20862h);
                }
            }
        };
        this.f20858b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f20870q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        this.f20861g = 1;
    }

    private void b(d dVar) {
        com.anythink.expressad.splash.d.d dVar2 = this.i;
        if (dVar2 != null) {
            dVar2.a(dVar);
            this.i.a(6);
        }
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f20861g = 1;
        this.f20870q = -1;
        this.f20871r = new Handler();
        this.f20872s = false;
        this.f20874u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f20869p != null) {
                    if (ATSplashPopView.this.f20870q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f20869p.setText(String.valueOf(ATSplashPopView.this.f20870q));
                        ATSplashPopView.this.f20871r.postDelayed(ATSplashPopView.this.f20874u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f20871r.removeCallbacks(ATSplashPopView.this.f20874u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f20875v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f20861g;
                }
            }
        };
        this.f20857a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f20862h);
                }
            }
        };
        this.f20858b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f20870q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        this.f20861g = 1;
    }
}
