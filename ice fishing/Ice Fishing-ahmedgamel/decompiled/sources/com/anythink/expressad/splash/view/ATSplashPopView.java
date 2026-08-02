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
import com.IceFishing.LiveIceFishing.k;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.d.c;
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
    private static final String f21484c = "ATSplashPopView";

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f21485d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    View.OnClickListener f21486a;

    /* renamed from: b, reason: collision with root package name */
    View.OnClickListener f21487b;

    /* renamed from: e, reason: collision with root package name */
    private String f21488e;

    /* renamed from: f, reason: collision with root package name */
    private String f21489f;

    /* renamed from: g, reason: collision with root package name */
    private int f21490g;

    /* renamed from: h, reason: collision with root package name */
    private d f21491h;
    private com.anythink.expressad.splash.d.d i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f21492j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f21493k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f21494l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView f21495m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f21496n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f21497o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f21498p;

    /* renamed from: q, reason: collision with root package name */
    private int f21499q;

    /* renamed from: r, reason: collision with root package name */
    private Handler f21500r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21501s;

    /* renamed from: t, reason: collision with root package name */
    private com.anythink.expressad.b.a f21502t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f21503u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f21504v;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f21513a;

        /* renamed from: b, reason: collision with root package name */
        private String f21514b;

        /* renamed from: c, reason: collision with root package name */
        private int f21515c;

        /* renamed from: d, reason: collision with root package name */
        private d f21516d;

        public a(String str, String str2, int i, d dVar) {
            this.f21513a = str;
            this.f21514b = str2;
            this.f21515c = i;
            this.f21516d = dVar;
        }

        public final String a() {
            return this.f21513a;
        }

        public final String b() {
            return this.f21514b;
        }

        public final int c() {
            return this.f21515c;
        }

        public final d d() {
            return this.f21516d;
        }

        private void a(String str) {
            this.f21513a = str;
        }

        private void b(String str) {
            this.f21514b = str;
        }

        private void a(int i) {
            this.f21515c = i;
        }

        private void a(d dVar) {
            this.f21516d = dVar;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public ATSplashPopView(Context context, a aVar, com.anythink.expressad.splash.d.d dVar) {
        super(context);
        this.f21490g = 1;
        this.f21499q = -1;
        this.f21500r = new Handler();
        this.f21501s = false;
        this.f21503u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f21498p != null) {
                    if (ATSplashPopView.this.f21499q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f21498p.setText(String.valueOf(ATSplashPopView.this.f21499q));
                        ATSplashPopView.this.f21500r.postDelayed(ATSplashPopView.this.f21503u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f21500r.removeCallbacks(ATSplashPopView.this.f21503u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f21504v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f21490g;
                }
            }
        };
        this.f21486a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f21491h);
                }
            }
        };
        this.f21487b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f21499q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        if (aVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f21489f = aVar.b();
        this.f21488e = aVar.a();
        this.f21490g = aVar.c();
        this.f21491h = aVar.d();
        this.i = dVar;
        a();
    }

    private void a(String str) {
        k.m().a(str, new c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }
        });
    }

    private void b(String str) {
        k.m().a(str, new c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.3
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    ATSplashPopView.this.f21493k.setImageBitmap(q.a(bitmap, 16));
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
    }

    public static /* synthetic */ int e(ATSplashPopView aTSplashPopView) {
        aTSplashPopView.f21499q = -1;
        return -1;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i4;
        do {
            atomicInteger = f21485d;
            i = atomicInteger.get();
            i4 = i + 1;
            if (i4 > 16777215) {
                i4 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i4));
        return i;
    }

    public static /* synthetic */ int j(ATSplashPopView aTSplashPopView) {
        int i = aTSplashPopView.f21499q;
        aTSplashPopView.f21499q = i - 1;
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i != null) {
            postDelayed(this.f21504v, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f21501s = true;
        if (this.f21498p != null) {
            this.f21500r.removeCallbacks(this.f21503u);
        }
    }

    public void reStartCountDown() {
        if (this.f21501s) {
            this.f21501s = false;
            int i = this.f21499q;
            if (i == -1 || i == 0) {
                g();
                return;
            }
            TextView textView = this.f21498p;
            if (textView != null) {
                textView.setText(String.valueOf(i));
                this.f21500r.postDelayed(this.f21503u, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f21500r.removeCallbacks(this.f21504v);
            this.f21500r.removeCallbacks(this.f21503u);
            this.f21503u = null;
            detachAllViewsFromParent();
            this.f21491h = null;
            this.i = null;
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setPopViewType(a aVar, com.anythink.expressad.splash.d.d dVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f21489f = aVar.b();
        this.f21488e = aVar.a();
        this.f21490g = aVar.c();
        this.f21491h = aVar.d();
        this.i = dVar;
        a();
    }

    public void startCountDown() {
        this.f21500r.removeCallbacks(this.f21503u);
        d dVar = this.f21491h;
        if (dVar == null || this.f21490g != 1) {
            return;
        }
        int v9 = dVar.v();
        if (v9 <= 0) {
            g();
            return;
        }
        this.f21499q = v9;
        TextView textView = this.f21498p;
        if (textView != null) {
            textView.setText(String.valueOf(v9));
            this.f21500r.postDelayed(this.f21503u, 1000L);
        }
    }

    private void c() {
        int b9 = v.b(getContext(), 4.0f);
        this.f21492j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 28.0f), v.b(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f21492j.setId(generateViewId());
        this.f21492j.setLayoutParams(layoutParams);
        this.f21492j.setPadding(b9, b9, b9, b9);
        this.f21492j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f21491h.bl(), false);
        TextView textView = new TextView(getContext());
        this.f21496n = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f21492j.getId());
        layoutParams2.addRule(6, this.f21492j.getId());
        layoutParams2.addRule(8, this.f21492j.getId());
        layoutParams2.leftMargin = v.b(getContext(), 4.0f);
        layoutParams2.rightMargin = v.b(getContext(), 40.0f);
        this.f21496n.setLayoutParams(layoutParams2);
        this.f21496n.setGravity(16);
        this.f21496n.setTextSize(10.0f);
        this.f21496n.setSelected(true);
        this.f21496n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f21496n.setMarqueeRepeatLimit(-1);
        this.f21496n.setSingleLine(true);
        this.f21496n.setTextColor(-16777216);
        this.f21496n.setText(this.f21491h.bj());
        setBackgroundResource(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_shape_corners_bg", com.anythink.expressad.foundation.h.k.f20419c));
        addView(this.f21492j);
        addView(this.f21496n);
        f();
        setOnClickListener(this.f21486a);
    }

    private void d() {
        int b9 = v.b(getContext(), 4.0f);
        this.f21492j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 50.0f), v.b(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f21492j.setId(generateViewId());
        this.f21492j.setLayoutParams(layoutParams);
        this.f21492j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f21492j.setPadding(b9, b9, b9, b9);
        a(this.f21491h.bl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f21492j.getId());
        layoutParams2.addRule(6, this.f21492j.getId());
        layoutParams2.addRule(8, this.f21492j.getId());
        layoutParams2.leftMargin = v.b(getContext(), 8.0f);
        layoutParams2.rightMargin = v.b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f21496n = textView;
        textView.setId(generateViewId());
        this.f21496n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f21496n.setGravity(16);
        this.f21496n.setTextSize(12.0f);
        this.f21496n.setSelected(true);
        TextView textView2 = this.f21496n;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f21496n.setMarqueeRepeatLimit(-1);
        this.f21496n.setSingleLine(true);
        this.f21496n.setTextColor(-16777216);
        this.f21496n.setText(this.f21491h.bj());
        TextView textView3 = new TextView(getContext());
        this.f21497o = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f21496n.getId());
        layoutParams3.addRule(3, this.f21496n.getId());
        layoutParams3.topMargin = v.b(getContext(), 4.0f);
        layoutParams3.rightMargin = v.b(getContext(), 36.0f);
        this.f21497o.setGravity(16);
        this.f21497o.setLayoutParams(layoutParams3);
        this.f21497o.setTextSize(8.0f);
        this.f21497o.setTextColor(-10066330);
        this.f21497o.setEllipsize(truncateAt);
        this.f21497o.setMarqueeRepeatLimit(-1);
        this.f21497o.setSelected(true);
        this.f21497o.setSingleLine(true);
        this.f21497o.setText(this.f21491h.bk());
        relativeLayout.addView(this.f21496n);
        relativeLayout.addView(this.f21497o);
        setBackgroundResource(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_shape_corners_bg", com.anythink.expressad.foundation.h.k.f20419c));
        addView(this.f21492j);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f21486a);
    }

    private void e() {
        this.f21494l = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v.b(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f21494l.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f21494l.setId(generateViewId());
        this.f21494l.setLayoutParams(layoutParams);
        a(this.f21491h.bm());
        this.f21493k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v.b(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f21493k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f21493k.setId(generateViewId());
        this.f21493k.setLayoutParams(layoutParams2);
        b(this.f21491h.bm());
        this.f21492j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v.b(getContext(), 50.0f), v.b(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f21494l.getId());
        layoutParams3.topMargin = 20;
        this.f21492j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f21492j.setId(generateViewId());
        this.f21492j.setLayoutParams(layoutParams3);
        a(this.f21491h.bl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f21492j.getId());
        layoutParams4.addRule(6, this.f21492j.getId());
        layoutParams4.addRule(8, this.f21492j.getId());
        layoutParams4.leftMargin = v.b(getContext(), 8.0f);
        layoutParams4.rightMargin = v.b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f21496n = textView;
        textView.setId(generateViewId());
        this.f21496n.setGravity(16);
        this.f21496n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f21496n.setTextSize(12.0f);
        this.f21496n.setTextColor(-16777216);
        TextView textView2 = this.f21496n;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f21496n.setMarqueeRepeatLimit(-1);
        this.f21496n.setSelected(true);
        this.f21496n.setSingleLine(true);
        this.f21496n.setText(this.f21491h.bj());
        TextView textView3 = new TextView(getContext());
        this.f21497o = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f21496n.getId());
        layoutParams5.addRule(3, this.f21496n.getId());
        layoutParams5.topMargin = v.b(getContext(), 4.0f);
        layoutParams5.rightMargin = v.b(getContext(), 36.0f);
        this.f21497o.setGravity(16);
        this.f21497o.setLayoutParams(layoutParams5);
        this.f21497o.setTextSize(8.0f);
        this.f21497o.setTextColor(-10066330);
        this.f21497o.setEllipsize(truncateAt);
        this.f21497o.setMarqueeRepeatLimit(-1);
        this.f21497o.setSelected(true);
        this.f21497o.setSingleLine(true);
        this.f21497o.setText(this.f21491h.bk());
        relativeLayout.addView(this.f21496n);
        relativeLayout.addView(this.f21497o);
        addView(this.f21494l);
        addView(this.f21493k);
        addView(this.f21492j);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f21486a);
    }

    private void f() {
        String str;
        this.f21495m = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 32.0f), v.b(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f21492j.getId());
        this.f21495m.setLayoutParams(layoutParams);
        try {
            str = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            th.getMessage();
            str = "ZH";
        }
        this.f21495m.setBackgroundResource((str.toUpperCase().equals("CN") || str.toUpperCase().equals("ZH")) ? com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_splash_pop_ad", com.anythink.expressad.foundation.h.k.f20419c) : com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_splash_pop_ad_en", com.anythink.expressad.foundation.h.k.f20419c));
        addView(this.f21495m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f21498p;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v.b(getContext(), 16.0f);
            layoutParams.height = v.b(getContext(), 16.0f);
            this.f21498p.setLayoutParams(layoutParams);
            this.f21498p.setText("");
            this.f21498p.setSelected(true);
            this.f21498p.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_splash_popview_close", com.anythink.expressad.foundation.h.k.f20419c));
        }
    }

    private void a(String str, final boolean z6) {
        k.m().a(str, new c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.1
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    Bitmap a9 = z6 ? q.a(bitmap) : q.a(bitmap, 16);
                    ImageView imageView = ATSplashPopView.this.f21492j;
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
        imageView.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_splash_popview_default", com.anythink.expressad.foundation.h.k.f20419c));
        this.f21492j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v.b(getContext(), 60.0f), v.b(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v.b(getContext(), 7.0f);
        layoutParams2.leftMargin = v.b(getContext(), 10.0f);
        this.f21492j.setId(generateViewId());
        this.f21492j.setLayoutParams(layoutParams2);
        this.f21492j.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d dVar = this.f21491h;
        if (dVar != null && !TextUtils.isEmpty(dVar.bl())) {
            a(this.f21491h.bl(), true);
        }
        this.f21498p = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v.b(getContext(), 62.0f);
        layoutParams3.bottomMargin = v.b(getContext(), 70.0f);
        this.f21498p.setId(generateViewId());
        this.f21498p.setTextSize(10.0f);
        this.f21498p.setTextColor(-1);
        this.f21498p.setGravity(17);
        this.f21498p.setMinWidth(v.b(getContext(), 16.0f));
        this.f21498p.setMaxHeight(v.b(getContext(), 16.0f));
        this.f21498p.setLayoutParams(layoutParams3);
        this.f21498p.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_cm_circle_50black", com.anythink.expressad.foundation.h.k.f20419c));
        addView(imageView);
        addView(this.f21498p);
        addView(this.f21492j);
        d dVar2 = this.f21491h;
        if (dVar2 != null && dVar2.v() <= 0) {
            g();
        }
        setOnClickListener(this.f21486a);
        this.f21498p.setOnClickListener(this.f21487b);
    }

    private void a() {
        if (this.f21491h == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i = this.f21490g;
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
        this.f21490g = 1;
        this.f21499q = -1;
        this.f21500r = new Handler();
        this.f21501s = false;
        this.f21503u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f21498p != null) {
                    if (ATSplashPopView.this.f21499q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f21498p.setText(String.valueOf(ATSplashPopView.this.f21499q));
                        ATSplashPopView.this.f21500r.postDelayed(ATSplashPopView.this.f21503u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f21500r.removeCallbacks(ATSplashPopView.this.f21503u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f21504v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f21490g;
                }
            }
        };
        this.f21486a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f21491h);
                }
            }
        };
        this.f21487b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f21499q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        this.f21490g = 1;
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
        this.f21490g = 1;
        this.f21499q = -1;
        this.f21500r = new Handler();
        this.f21501s = false;
        this.f21503u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f21498p != null) {
                    if (ATSplashPopView.this.f21499q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f21498p.setText(String.valueOf(ATSplashPopView.this.f21499q));
                        ATSplashPopView.this.f21500r.postDelayed(ATSplashPopView.this.f21503u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f21500r.removeCallbacks(ATSplashPopView.this.f21503u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f21504v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f21490g;
                }
            }
        };
        this.f21486a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f21491h);
                }
            }
        };
        this.f21487b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f21499q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        this.f21490g = 1;
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21490g = 1;
        this.f21499q = -1;
        this.f21500r = new Handler();
        this.f21501s = false;
        this.f21503u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f21498p != null) {
                    if (ATSplashPopView.this.f21499q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f21498p.setText(String.valueOf(ATSplashPopView.this.f21499q));
                        ATSplashPopView.this.f21500r.postDelayed(ATSplashPopView.this.f21503u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f21500r.removeCallbacks(ATSplashPopView.this.f21503u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f21504v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f21490g;
                }
            }
        };
        this.f21486a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f21491h);
                }
            }
        };
        this.f21487b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f21499q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        this.f21490g = 1;
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
        this.f21490g = 1;
        this.f21499q = -1;
        this.f21500r = new Handler();
        this.f21501s = false;
        this.f21503u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f21498p != null) {
                    if (ATSplashPopView.this.f21499q != 0) {
                        ATSplashPopView.j(ATSplashPopView.this);
                        ATSplashPopView.this.f21498p.setText(String.valueOf(ATSplashPopView.this.f21499q));
                        ATSplashPopView.this.f21500r.postDelayed(ATSplashPopView.this.f21503u, 1000L);
                    } else {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f21500r.removeCallbacks(ATSplashPopView.this.f21503u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.a(5);
                        }
                    }
                }
            }
        };
        this.f21504v = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.i != null) {
                    com.anythink.expressad.splash.d.d unused = ATSplashPopView.this.i;
                    ATSplashPopView.this.getWidth();
                    ATSplashPopView.this.getHeight();
                    int unused2 = ATSplashPopView.this.f21490g;
                }
            }
        };
        this.f21486a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f21491h);
                }
            }
        };
        this.f21487b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f21499q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.a(4);
                }
            }
        };
        this.f21490g = 1;
    }
}
