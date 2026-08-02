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
    private static final String f22240n = "anythink_reward_clickable_cta";

    /* renamed from: o, reason: collision with root package name */
    private ViewGroup f22241o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f22242p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f22243q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f22244r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f22245s;

    /* renamed from: t, reason: collision with root package name */
    private String f22246t;

    /* renamed from: u, reason: collision with root package name */
    private float f22247u;

    /* renamed from: v, reason: collision with root package name */
    private float f22248v;

    /* renamed from: w, reason: collision with root package name */
    private int f22249w;

    /* renamed from: x, reason: collision with root package name */
    private ObjectAnimator f22250x;

    public AnythinkClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ImageView imageView = this.f22242p;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private void e() {
        setWrapContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        this.f22241o = (ViewGroup) findViewById(findID("anythink_viewgroup_ctaroot"));
        this.f22242p = (ImageView) findViewById(findID("anythink_iv_appicon"));
        this.f22243q = (TextView) findViewById(findID("anythink_tv_title"));
        TextView textView = (TextView) findViewById(findID("anythink_tv_install"));
        this.f22245s = textView;
        return isNotNULL(this.f22241o, this.f22242p, this.f22243q, textView);
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
        d dVar = this.f22229b;
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
                aVar = this.f22232e;
                if (aVar == null) {
                }
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e9 = e11;
        }
        aVar = this.f22232e;
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
        ObjectAnimator objectAnimator = this.f22250x;
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
        ObjectAnimator objectAnimator = this.f22250x;
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
        this.f22247u = motionEvent.getRawX();
        this.f22248v = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22249w = configuration.orientation;
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        d dVar = this.f22229b;
        if (dVar != null) {
            if (dVar.j()) {
                d dVar2 = this.f22229b;
                new c();
                com.anythink.expressad.video.dynview.c b9 = c.b(this, dVar2);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(b9, new AnonymousClass1(this));
            } else {
                int findLayout = findLayout(f22240n);
                if (findLayout >= 0) {
                    this.f22230c.inflate(findLayout, this);
                    this.f22233f = f();
                    c();
                    setWrapContent();
                }
            }
            if (this.f22233f) {
                if (this.f22229b.e() == 2) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 95.0f), v.b(getContext(), 38.0f));
                    layoutParams.addRule(11);
                    this.f22245s.setLayoutParams(layoutParams);
                }
                this.f22245s.setText(this.f22229b.dj);
                if (TextUtils.isEmpty(this.f22229b.bl())) {
                    b();
                } else {
                    com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(this.f22229b.bl(), new e(this.f22242p, this.f22229b, this.f22246t) { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.5
                        @Override // com.anythink.expressad.video.module.a.a.e, com.anythink.expressad.foundation.g.d.c
                        public final void a(String str, String str2) {
                            super.a(str, str2);
                            AnythinkClickCTAView.this.b();
                        }
                    });
                }
                if (this.f22243q != null && !TextUtils.isEmpty(this.f22229b.bj())) {
                    this.f22243q.setText(this.f22229b.bj());
                }
                if (this.f22244r == null || TextUtils.isEmpty(this.f22229b.bk())) {
                    return;
                }
                this.f22244r.setText(this.f22229b.bk());
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f22250x = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f22246t = str;
    }

    public AnythinkClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f22233f) {
            d dVar = this.f22229b;
            if (dVar != null && dVar.j()) {
                setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.2
                    @Override // com.anythink.expressad.widget.a
                    public final void a(View view) {
                        AnythinkClickCTAView.b(AnythinkClickCTAView.this);
                    }
                });
            }
            this.f22245s.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.3
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkClickCTAView.b(AnythinkClickCTAView.this);
                }
            });
            ImageView imageView = this.f22242p;
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
        d dVar = anythinkClickCTAView.f22229b;
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
                aVar = anythinkClickCTAView.f22232e;
                if (aVar == null) {
                }
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e9 = e11;
        }
        aVar = anythinkClickCTAView.f22232e;
        if (aVar == null) {
            aVar.a(105, jSONObject);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$1, reason: invalid class name */
    public class AnonymousClass1 implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f22251a;

        public AnonymousClass1(ViewGroup viewGroup) {
            this.f22251a = viewGroup;
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            this.f22251a.addView(aVar.a());
            AnythinkClickCTAView anythinkClickCTAView = AnythinkClickCTAView.this;
            anythinkClickCTAView.f22233f = anythinkClickCTAView.f();
            AnythinkClickCTAView anythinkClickCTAView2 = AnythinkClickCTAView.this;
            anythinkClickCTAView2.f22244r = (TextView) anythinkClickCTAView2.findViewById(anythinkClickCTAView2.findID("anythink_tv_desc"));
            AnythinkClickCTAView.this.c();
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            bVar.b();
        }
    }

    private void a() {
        int findLayout = findLayout(f22240n);
        if (findLayout >= 0) {
            this.f22230c.inflate(findLayout, this);
            this.f22233f = f();
            c();
            setWrapContent();
        }
    }
}
