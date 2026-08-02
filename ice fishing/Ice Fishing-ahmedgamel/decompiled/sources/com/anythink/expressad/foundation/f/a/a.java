package com.anythink.expressad.foundation.f.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.d.t;
import com.anythink.expressad.f.a;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.FeedbackRadioGroup;
import com.anythink.expressad.widget.a.b;
import com.anythink.expressad.widget.a.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    private static int f19809n = -1;

    /* renamed from: s, reason: collision with root package name */
    private static String f19810s;

    /* renamed from: a, reason: collision with root package name */
    private String f19811a;

    /* renamed from: b, reason: collision with root package name */
    private d f19812b;

    /* renamed from: c, reason: collision with root package name */
    private FeedBackButton f19813c;

    /* renamed from: d, reason: collision with root package name */
    private int f19814d;

    /* renamed from: e, reason: collision with root package name */
    private int f19815e;

    /* renamed from: j, reason: collision with root package name */
    private String f19819j;

    /* renamed from: k, reason: collision with root package name */
    private String f19820k;

    /* renamed from: p, reason: collision with root package name */
    private c f19824p;

    /* renamed from: q, reason: collision with root package name */
    private List<C0120a> f19825q;

    /* renamed from: f, reason: collision with root package name */
    private int f19816f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f19817g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f19818h = -1;
    private int i = -1;

    /* renamed from: l, reason: collision with root package name */
    private float f19821l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    private int f19822m = k.e(20.0f);

    /* renamed from: o, reason: collision with root package name */
    private int f19823o = f19809n;

    /* renamed from: r, reason: collision with root package name */
    private b f19826r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.1
        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            a.a(a.this);
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            a.b(a.this);
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
            a.c(a.this);
        }
    };

    public a(String str) {
        this.f19825q = new ArrayList();
        this.f19811a = str;
        if (this.f19825q == null) {
            this.f19825q = new ArrayList();
        }
        g();
        n();
        h();
    }

    private void g() {
        if (this.f19826r == null) {
            this.f19826r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.2
                @Override // com.anythink.expressad.widget.a.b
                public final void a() {
                    a.a(a.this);
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void b() {
                    a.b(a.this);
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void c() {
                    a.c(a.this);
                }
            };
        }
    }

    private void h() {
        try {
            com.anythink.expressad.foundation.f.b.a();
            if (com.anythink.expressad.foundation.f.b.a(t.b().g()) != null) {
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.foundation.b.a.c().f();
                com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
                if (b9 == null) {
                    com.anythink.expressad.f.b.a();
                    b9 = com.anythink.expressad.f.b.c();
                }
                a.b L2 = b9.L();
                if (L2 == null) {
                    return;
                }
                g();
                com.anythink.expressad.foundation.f.b.a();
                this.f19824p = new c(com.anythink.expressad.foundation.f.b.a(t.b().g()), this.f19826r);
                FeedbackRadioGroup a9 = a(L2);
                this.f19824p.c(L2.c());
                this.f19824p.b(L2.b());
                this.f19824p.a(L2.a());
                this.f19824p.a(a9);
                this.f19824p.a(!TextUtils.isEmpty(f19810s));
                a(a9, L2);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void i() {
        List<C0120a> list = this.f19825q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.b();
                }
            }
        }
        f19810s = "";
    }

    private void j() {
        List<C0120a> list = this.f19825q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a();
                }
            }
        }
        f19810s = "";
    }

    private void k() {
        List<C0120a> list = this.f19825q;
        if (list != null) {
            Iterator<C0120a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private String l() {
        return this.f19811a;
    }

    private void m() {
        FeedBackButton feedBackButton = this.f19813c;
        if (feedBackButton != null) {
            int i = this.f19816f;
            if (i >= 0) {
                feedBackButton.setX(i);
            }
            int i4 = this.f19817g;
            if (i4 >= 0) {
                this.f19813c.setY(i4);
            }
            float f2 = this.f19821l;
            if (f2 >= 0.0f) {
                this.f19813c.setAlpha(f2);
                this.f19813c.setEnabled(this.f19821l != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f19813c.getLayoutParams();
            int i6 = this.f19818h;
            if (i6 > 0) {
                this.f19813c.setWidth(i6);
                if (layoutParams != null) {
                    layoutParams.width = this.f19818h;
                }
            }
            int i9 = this.i;
            if (i9 > 0) {
                this.f19813c.setHeight(i9);
                if (layoutParams != null) {
                    layoutParams.height = this.i;
                }
            }
            if (layoutParams != null) {
                this.f19813c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f19819j)) {
                    this.f19813c.setTextColor(Color.parseColor(this.f19819j));
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i10 = this.f19822m;
            if (i10 > 0) {
                gradientDrawable.setCornerRadius(i10);
            }
            if (TextUtils.isEmpty(this.f19820k)) {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            } else {
                gradientDrawable.setColor(Color.parseColor(this.f19820k));
            }
            try {
                this.f19813c.setBackgroundDrawable(gradientDrawable);
            } catch (Throwable unused) {
            }
        }
    }

    private void n() {
        Context g9 = t.b().g();
        if (g9 != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(g9);
                this.f19813c = feedBackButton;
                int i = 8;
                if (this.f19823o != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.f19813c.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.a();
                    }
                });
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private int o() {
        return this.f19814d;
    }

    private int p() {
        return this.f19815e;
    }

    public final void b() {
        c cVar = this.f19824p;
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        this.f19824p.cancel();
    }

    public final FeedBackButton c() {
        if (this.f19813c == null) {
            n();
        }
        return this.f19813c;
    }

    public final d e() {
        return this.f19812b;
    }

    public final void a() {
        com.anythink.expressad.foundation.f.b.a();
        Activity a9 = com.anythink.expressad.foundation.f.b.a(t.b().g());
        c cVar = this.f19824p;
        if (cVar == null || cVar.getContext() != a9) {
            h();
        }
        Context g9 = t.b().g();
        FeedBackButton feedBackButton = this.f19813c;
        if (feedBackButton != null) {
            g9 = feedBackButton.getContext();
        }
        com.anythink.expressad.foundation.f.b.a();
        boolean a10 = com.anythink.expressad.foundation.f.b.a(g9, this.f19824p);
        List<C0120a> list = this.f19825q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a(a10);
                }
            }
        }
    }

    public final void d() {
        FeedBackButton feedBackButton = this.f19813c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f19813c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f19813c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f19813c);
            }
        }
        c cVar = this.f19824p;
        if (cVar != null) {
            cVar.a((b) null);
        }
        this.f19824p = null;
        this.f19825q = null;
        this.f19813c = null;
        this.f19826r = null;
    }

    /* renamed from: com.anythink.expressad.foundation.f.a.a$a, reason: collision with other inner class name */
    public static class C0120a implements b {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.foundation.f.a f19832a;

        /* renamed from: b, reason: collision with root package name */
        private String f19833b;

        public C0120a(String str, com.anythink.expressad.foundation.f.a aVar) {
            this.f19832a = aVar;
            this.f19833b = str;
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            com.anythink.expressad.foundation.f.b.f19836c = false;
            com.anythink.expressad.foundation.f.a aVar = this.f19832a;
            if (aVar != null) {
                String unused = a.f19810s;
                aVar.c();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            com.anythink.expressad.foundation.f.b.f19836c = false;
            com.anythink.expressad.foundation.f.a aVar = this.f19832a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
        }

        public final void a(boolean z6) {
            com.anythink.expressad.foundation.f.b.f19836c = true;
            com.anythink.expressad.foundation.f.a aVar = this.f19832a;
            if (aVar == null || !z6) {
                return;
            }
            aVar.a();
        }
    }

    private void b(C0120a c0120a) {
        List<C0120a> list = this.f19825q;
        if (list != null) {
            list.remove(c0120a);
        }
    }

    public final void c(int i) {
        this.f19815e = i;
    }

    public static /* synthetic */ void c(a aVar) {
        List<C0120a> list = aVar.f19825q;
        if (list != null) {
            Iterator<C0120a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void b(int i) {
        this.f19814d = i;
    }

    public static /* synthetic */ void b(a aVar) {
        List<C0120a> list = aVar.f19825q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.b();
                }
            }
        }
        f19810s = "";
    }

    public final void a(int i) {
        this.f19823o = i;
        FeedBackButton feedBackButton = this.f19813c;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(FeedbackRadioGroup feedbackRadioGroup, a.b bVar) {
        ColorStateList colorStateList;
        int i;
        JSONArray d9 = bVar.d();
        Context g9 = t.b().g();
        if (d9 == null || d9.length() <= 0 || g9 == null) {
            return;
        }
        int a9 = com.anythink.expressad.foundation.h.k.a(g9, "anythink_cm_feedback_choice_btn_bg", com.anythink.expressad.foundation.h.k.f20419c);
        Resources a10 = com.anythink.expressad.foundation.h.k.a(g9);
        int a11 = com.anythink.expressad.foundation.h.k.a(g9, "anythink_cm_feedback_rb_text_color_color_list", com.anythink.expressad.foundation.h.k.f20420d);
        if (a10 != null) {
            try {
                colorStateList = a10.getColorStateList(a11);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            int b9 = v.b(g9, 14.0f);
            int b10 = v.b(g9, 7.0f);
            int b11 = v.b(g9, 6.0f);
            for (i = 0; i < d9.length(); i++) {
                String optString = d9.optString(i);
                RadioButton radioButton = new RadioButton(g9);
                radioButton.setButtonDrawable((Drawable) null);
                radioButton.setBackgroundResource(a9);
                radioButton.setText(optString);
                if (colorStateList != null) {
                    radioButton.setTextColor(colorStateList);
                }
                radioButton.setPadding(b9, b10, b9, b10);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
                int i4 = b11 / 4;
                layoutParams.setMargins(b11, i4, b11, i4);
                a(radioButton);
                feedbackRadioGroup.addView(radioButton, layoutParams);
            }
        }
        colorStateList = null;
        int b92 = v.b(g9, 14.0f);
        int b102 = v.b(g9, 7.0f);
        int b112 = v.b(g9, 6.0f);
        while (i < d9.length()) {
        }
    }

    private static FeedbackRadioGroup a(a.b bVar) {
        JSONArray d9 = bVar.d();
        Context g9 = t.b().g();
        if (d9 == null || d9.length() <= 0 || g9 == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(g9);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    private void a(RadioButton radioButton) {
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.anythink.expressad.foundation.f.a.a.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                if (z6) {
                    String unused = a.f19810s = (String) compoundButton.getText();
                }
                if (a.this.f19824p != null) {
                    a.this.f19824p.a(!TextUtils.isEmpty(a.f19810s));
                }
            }
        });
    }

    public final void a(C0120a c0120a) {
        if (this.f19825q == null) {
            this.f19825q = new ArrayList();
        }
        this.f19825q.add(c0120a);
    }

    private void a(boolean z6) {
        List<C0120a> list = this.f19825q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a(z6);
                }
            }
        }
    }

    public final void a(int i, int i4, int i6, int i9, int i10, float f2, String str, String str2) {
        this.f19816f = i;
        this.f19817g = i4;
        this.f19818h = i6;
        this.i = i9;
        this.f19819j = str;
        this.f19820k = str2;
        this.f19821l = f2;
        this.f19822m = i10;
        m();
    }

    public final void a(d dVar) {
        this.f19812b = dVar;
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f19813c;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f19821l);
            feedBackButton.setEnabled(this.f19821l != 0.0f);
            feedBackButton.setVisibility(this.f19823o != 8 ? 0 : 8);
            this.f19813c = feedBackButton;
            d dVar = this.f19812b;
            if (dVar != null && !dVar.j()) {
                m();
            }
            feedBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.a();
                }
            });
        }
    }

    public static /* synthetic */ void a(a aVar) {
        List<C0120a> list = aVar.f19825q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a();
                }
            }
        }
        f19810s = "";
    }
}
