package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.video.dynview.f.b;
import com.anythink.expressad.video.dynview.f.c;
import com.anythink.expressad.video.dynview.f.h;
import com.anythink.expressad.video.module.AnythinkBaseView;
import com.anythink.expressad.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class AnyThinkOrderCampView extends AnythinkBaseView {

    /* renamed from: n, reason: collision with root package name */
    private AnyThinkOrderCampView f21537n;

    /* renamed from: o, reason: collision with root package name */
    private List<d> f21538o;

    /* renamed from: p, reason: collision with root package name */
    private int f21539p;

    /* renamed from: q, reason: collision with root package name */
    private int f21540q;

    /* renamed from: r, reason: collision with root package name */
    private int f21541r;

    /* renamed from: s, reason: collision with root package name */
    private int f21542s;

    /* renamed from: t, reason: collision with root package name */
    private String f21543t;

    /* renamed from: u, reason: collision with root package name */
    private FeedBackButton f21544u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21545v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21546w;

    /* renamed from: x, reason: collision with root package name */
    private c f21547x;

    /* renamed from: y, reason: collision with root package name */
    private b f21548y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f21549z;

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView$3, reason: invalid class name */
    public class AnonymousClass3 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView$4, reason: invalid class name */
    public class AnonymousClass4 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21554a;

        public AnonymousClass4(String str) {
            this.f21554a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            y.a(this.f21554a);
        }
    }

    public AnyThinkOrderCampView(Context context) {
        super(context);
        this.f21546w = false;
        this.f21547x = new c() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.1
            @Override // com.anythink.expressad.video.dynview.f.c
            public final void a(d dVar, int i) {
                if (dVar != null) {
                    try {
                        AnyThinkOrderCampView.this.setCampaign(dVar);
                        AnyThinkOrderCampView.a(AnyThinkOrderCampView.this, dVar, i);
                    } catch (Exception e6) {
                        e6.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.c
            public final void a() {
                AnyThinkOrderCampView.a(AnyThinkOrderCampView.this);
            }
        };
        this.f21549z = false;
    }

    private void e() {
        FeedBackButton feedBackButton = this.f21544u;
        if (feedBackButton == null) {
            return;
        }
        List<d> list = this.f21538o;
        if (list == null) {
            feedBackButton.setVisibility(8);
            return;
        }
        if (list.get(0) == null) {
            this.f21544u.setVisibility(8);
            return;
        }
        if (!com.anythink.expressad.foundation.f.b.a().b()) {
            this.f21544u.setVisibility(8);
            return;
        }
        this.f21543t = this.f21538o.get(0).L();
        this.f21600b = this.f21538o.get(0);
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.f21543t, "_2"), new AnonymousClass3());
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.f21543t, "_2"), this.f21600b);
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.f21543t, "_2"), this.f21544u);
    }

    private void f() {
        if (this.f21545v == null) {
            return;
        }
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        if (b9 == null) {
            this.f21545v.setVisibility(8);
            return;
        }
        String J = b9.J();
        if (TextUtils.isEmpty(J)) {
            this.f21545v.setVisibility(8);
        }
        this.f21545v.setOnClickListener(new AnonymousClass4(J));
    }

    public void createView(final ViewGroup viewGroup) {
        if (this.f21538o == null) {
            b bVar = this.f21548y;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.expressad.video.dynview.a.a.f21243G, this.f21547x);
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c b9 = com.anythink.expressad.video.dynview.j.c.b(t.b().g(), this.f21538o);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(b9, new h() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.2
            @Override // com.anythink.expressad.video.dynview.f.h
            public final void a(com.anythink.expressad.video.dynview.a aVar) {
                try {
                    AnyThinkOrderCampView.this.f21537n.addView(aVar.a());
                    AnyThinkOrderCampView.this.f21546w = aVar.c();
                    viewGroup.removeAllViews();
                    viewGroup.addView(AnyThinkOrderCampView.this.f21537n);
                    AnyThinkOrderCampView.this.setViewStatus();
                    if (AnyThinkOrderCampView.this.f21548y != null) {
                        AnyThinkOrderCampView.this.f21548y.a();
                    }
                } catch (Exception e6) {
                    e6.getMessage();
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.h
            public final void a(com.anythink.expressad.video.dynview.c.b bVar2) {
                try {
                    if (AnyThinkOrderCampView.this.f21548y != null) {
                        AnyThinkOrderCampView.this.f21548y.b();
                    }
                } catch (Exception e6) {
                    e6.getMessage();
                }
            }
        }, hashMap);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        this.f21537n = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        JSONObject jSONObject;
        JSONException e6;
        com.anythink.expressad.video.module.a.a aVar;
        super.onAttachedToWindow();
        if (this.f21538o == null) {
            return;
        }
        for (int i = 0; i < this.f21538o.size(); i++) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("camp_position", i);
                } catch (JSONException e9) {
                    e6 = e9;
                    e6.printStackTrace();
                    aVar = this.f21603e;
                    if (aVar == null) {
                    }
                }
            } catch (JSONException e10) {
                jSONObject = null;
                e6 = e10;
            }
            aVar = this.f21603e;
            if (aVar == null) {
                aVar.a(110, jSONObject);
            }
        }
    }

    public void setCampOrderViewBuildCallback(b bVar) {
        this.f21548y = bVar;
    }

    public void setCampaignExes(List<d> list) {
        this.f21538o = list;
    }

    public void setNotchPadding(int i, int i4, int i9, int i10) {
        this.f21539p = i;
        this.f21540q = i4;
        this.f21541r = i9;
        this.f21542s = i10;
        setViewStatus();
    }

    public void setRewarded(boolean z8) {
        this.f21549z = z8;
    }

    public void setViewStatus() {
        AnyThinkOrderCampView anyThinkOrderCampView = this.f21537n;
        if (anyThinkOrderCampView == null || !this.f21549z) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) anyThinkOrderCampView.findViewById(filterFindViewId(this.f21546w, "anythink_native_order_camp_controller"));
        this.f21544u = (FeedBackButton) this.f21537n.findViewById(filterFindViewId(this.f21546w, "anythink_native_order_camp_feed_btn"));
        this.f21545v = (ImageView) this.f21537n.findViewById(filterFindViewId(this.f21546w, "anythink_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f21539p, this.f21541r, this.f21540q, this.f21542s);
        }
        FeedBackButton feedBackButton = this.f21544u;
        if (feedBackButton != null && feedBackButton != null) {
            try {
                List<d> list = this.f21538o;
                if (list == null) {
                    feedBackButton.setVisibility(8);
                } else if (list.get(0) == null) {
                    this.f21544u.setVisibility(8);
                } else if (com.anythink.expressad.foundation.f.b.a().b()) {
                    this.f21543t = this.f21538o.get(0).L();
                    this.f21600b = this.f21538o.get(0);
                    com.anythink.expressad.foundation.f.b.a().a(this.f21543t + "_2", new AnonymousClass3());
                    com.anythink.expressad.foundation.f.b.a().a(this.f21543t + "_2", this.f21600b);
                    com.anythink.expressad.foundation.f.b.a().a(this.f21543t + "_2", this.f21544u);
                } else {
                    this.f21544u.setVisibility(8);
                }
            } catch (Exception e6) {
                e6.getMessage();
            }
        }
        ImageView imageView = this.f21545v;
        if (imageView == null || imageView == null) {
            return;
        }
        try {
            com.anythink.expressad.foundation.b.a.c().f();
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
            if (b9 == null) {
                this.f21545v.setVisibility(8);
                return;
            }
            String J = b9.J();
            if (TextUtils.isEmpty(J)) {
                this.f21545v.setVisibility(8);
            }
            this.f21545v.setOnClickListener(new AnonymousClass4(J));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f21537n.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f21537n.startAnimation(translateAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(d dVar, int i, int i4) {
        JSONObject jSONObject;
        JSONException e6;
        com.anythink.expressad.video.module.a.a aVar;
        if (dVar != null && dVar.j()) {
            try {
                d.c N8 = dVar.N();
                if (N8 != null) {
                    N8.b();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, a(i));
                jSONObject.put("camp_position", i4);
            } catch (JSONException e10) {
                e6 = e10;
                e6.printStackTrace();
                aVar = this.f21603e;
                if (aVar == null) {
                }
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e6 = e11;
        }
        aVar = this.f21603e;
        if (aVar == null) {
            aVar.a(105, jSONObject);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 2, 0.5f, 2, 0.5f);
        scaleAnimation.setDuration(500L);
        this.f21537n.startAnimation(scaleAnimation);
    }

    public AnyThinkOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21546w = false;
        this.f21547x = new c() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.1
            @Override // com.anythink.expressad.video.dynview.f.c
            public final void a(d dVar, int i) {
                if (dVar != null) {
                    try {
                        AnyThinkOrderCampView.this.setCampaign(dVar);
                        AnyThinkOrderCampView.a(AnyThinkOrderCampView.this, dVar, i);
                    } catch (Exception e6) {
                        e6.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.c
            public final void a() {
                AnyThinkOrderCampView.a(AnyThinkOrderCampView.this);
            }
        };
        this.f21549z = false;
    }

    private void a() {
        com.anythink.expressad.video.module.a.a aVar = this.f21603e;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(AnyThinkOrderCampView anyThinkOrderCampView, d dVar, int i) {
        JSONObject jSONObject;
        JSONException e6;
        com.anythink.expressad.video.module.a.a aVar;
        if (dVar != null && dVar.j()) {
            try {
                d.c N8 = dVar.N();
                if (N8 != null) {
                    N8.b();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, anyThinkOrderCampView.a(0));
                jSONObject.put("camp_position", i);
            } catch (JSONException e10) {
                e6 = e10;
                e6.printStackTrace();
                aVar = anyThinkOrderCampView.f21603e;
                if (aVar == null) {
                }
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e6 = e11;
        }
        aVar = anyThinkOrderCampView.f21603e;
        if (aVar == null) {
            aVar.a(105, jSONObject);
        }
    }

    public static /* synthetic */ void a(AnyThinkOrderCampView anyThinkOrderCampView) {
        com.anythink.expressad.video.module.a.a aVar = anyThinkOrderCampView.f21603e;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }
}
