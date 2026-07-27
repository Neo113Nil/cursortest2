package com.anythink.expressad.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.dynview.f.h;
import com.anythink.expressad.video.dynview.j.c;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.e;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkClickCTAView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f21453n = "anythink_reward_clickable_cta";

    /* renamed from: o, reason: collision with root package name */
    private ViewGroup f21454o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f21455p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f21456q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f21457r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f21458s;

    /* renamed from: t, reason: collision with root package name */
    private String f21459t;

    /* renamed from: u, reason: collision with root package name */
    private float f21460u;

    /* renamed from: v, reason: collision with root package name */
    private float f21461v;

    /* renamed from: w, reason: collision with root package name */
    private int f21462w;

    /* renamed from: x, reason: collision with root package name */
    private ObjectAnimator f21463x;

    public AnythinkClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ImageView imageView = this.f21455p;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private void e() {
        setWrapContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        this.f21454o = (ViewGroup) findViewById(findID("anythink_viewgroup_ctaroot"));
        this.f21455p = (ImageView) findViewById(findID("anythink_iv_appicon"));
        this.f21456q = (TextView) findViewById(findID("anythink_tv_title"));
        TextView textView = (TextView) findViewById(findID("anythink_tv_install"));
        this.f21458s = textView;
        return isNotNULL(this.f21454o, this.f21455p, this.f21456q, textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void g() {
        JSONObject jSONObject;
        JSONException e9;
        a aVar;
        d dVar = this.f21442b;
        if (dVar != null) {
            dVar.j();
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, a(0));
            } catch (JSONException e10) {
                e9 = e10;
                e9.printStackTrace();
                aVar = this.f21445e;
                if (aVar == null) {
                }
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e9 = e11;
        }
        aVar = this.f21445e;
        if (aVar == null) {
            aVar.a(105, jSONObject);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f21463x;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f21463x;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f21460u = motionEvent.getRawX();
        this.f21461v = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f21462w = configuration.orientation;
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        d dVar = this.f21442b;
        if (dVar != null) {
            if (dVar.j()) {
                d dVar2 = this.f21442b;
                new c();
                com.anythink.expressad.video.dynview.c b9 = c.b(this, dVar2);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(b9, new AnonymousClass1(this));
            } else {
                int findLayout = findLayout(f21453n);
                if (findLayout >= 0) {
                    this.f21443c.inflate(findLayout, this);
                    this.f21446f = f();
                    c();
                    setWrapContent();
                }
            }
            if (this.f21446f) {
                if (this.f21442b.e() == 2) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 95.0f), v.b(getContext(), 38.0f));
                    layoutParams.addRule(11);
                    this.f21458s.setLayoutParams(layoutParams);
                }
                this.f21458s.setText(this.f21442b.dj);
                if (TextUtils.isEmpty(this.f21442b.bl())) {
                    b();
                } else {
                    com.anythink.expressad.foundation.g.d.b.a(this.f21441a.getApplicationContext()).a(this.f21442b.bl(), new e(this.f21455p, this.f21442b, this.f21459t) { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.5
                        @Override // com.anythink.expressad.video.module.a.a.e, com.anythink.expressad.foundation.g.d.c
                        public final void a(String str, String str2) {
                            super.a(str, str2);
                            AnythinkClickCTAView.this.b();
                        }
                    });
                }
                if (this.f21456q != null && !TextUtils.isEmpty(this.f21442b.bj())) {
                    this.f21456q.setText(this.f21442b.bj());
                }
                if (this.f21457r == null || TextUtils.isEmpty(this.f21442b.bk())) {
                    return;
                }
                this.f21457r.setText(this.f21442b.bk());
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f21463x = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f21459t = str;
    }

    public AnythinkClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f21446f) {
            d dVar = this.f21442b;
            if (dVar != null && dVar.j()) {
                setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.2
                    @Override // com.anythink.expressad.widget.a
                    public final void a(View view) {
                        AnythinkClickCTAView.b(AnythinkClickCTAView.this);
                    }
                });
            }
            this.f21458s.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.3
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkClickCTAView.b(AnythinkClickCTAView.this);
                }
            });
            ImageView imageView = this.f21455p;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    private void a(ViewGroup viewGroup, d dVar) {
        new c();
        com.anythink.expressad.video.dynview.c b9 = c.b(viewGroup, dVar);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(b9, new AnonymousClass1(viewGroup));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(AnythinkClickCTAView anythinkClickCTAView) {
        JSONObject jSONObject;
        JSONException e9;
        a aVar;
        d dVar = anythinkClickCTAView.f21442b;
        if (dVar != null) {
            dVar.j();
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, anythinkClickCTAView.a(0));
            } catch (JSONException e10) {
                e9 = e10;
                e9.printStackTrace();
                aVar = anythinkClickCTAView.f21445e;
                if (aVar == null) {
                }
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e9 = e11;
        }
        aVar = anythinkClickCTAView.f21445e;
        if (aVar == null) {
            aVar.a(105, jSONObject);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$1, reason: invalid class name */
    public class AnonymousClass1 implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f21464a;

        public AnonymousClass1(ViewGroup viewGroup) {
            this.f21464a = viewGroup;
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            this.f21464a.addView(aVar.a());
            AnythinkClickCTAView anythinkClickCTAView = AnythinkClickCTAView.this;
            anythinkClickCTAView.f21446f = anythinkClickCTAView.f();
            AnythinkClickCTAView anythinkClickCTAView2 = AnythinkClickCTAView.this;
            anythinkClickCTAView2.f21457r = (TextView) anythinkClickCTAView2.findViewById(anythinkClickCTAView2.findID("anythink_tv_desc"));
            AnythinkClickCTAView.this.c();
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            bVar.b();
        }
    }

    private void a() {
        int findLayout = findLayout(f21453n);
        if (findLayout >= 0) {
            this.f21443c.inflate(findLayout, this);
            this.f21446f = f();
            c();
            setWrapContent();
        }
    }
}
