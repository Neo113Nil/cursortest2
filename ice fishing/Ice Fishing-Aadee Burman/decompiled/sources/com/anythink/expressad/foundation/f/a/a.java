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
import com.anythink.basead.exoplayer.f.f;
import com.anythink.core.common.d.t;
import com.anythink.expressad.f.a;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.k;
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
    private static int f19022n = -1;

    /* renamed from: s, reason: collision with root package name */
    private static String f19023s;

    /* renamed from: a, reason: collision with root package name */
    private String f19024a;

    /* renamed from: b, reason: collision with root package name */
    private d f19025b;

    /* renamed from: c, reason: collision with root package name */
    private FeedBackButton f19026c;

    /* renamed from: d, reason: collision with root package name */
    private int f19027d;

    /* renamed from: e, reason: collision with root package name */
    private int f19028e;

    /* renamed from: j, reason: collision with root package name */
    private String f19032j;

    /* renamed from: k, reason: collision with root package name */
    private String f19033k;

    /* renamed from: p, reason: collision with root package name */
    private c f19037p;

    /* renamed from: q, reason: collision with root package name */
    private List<C0120a> f19038q;

    /* renamed from: f, reason: collision with root package name */
    private int f19029f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f19030g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f19031h = -1;
    private int i = -1;

    /* renamed from: l, reason: collision with root package name */
    private float f19034l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    private int f19035m = f.e(20.0f);

    /* renamed from: o, reason: collision with root package name */
    private int f19036o = f19022n;

    /* renamed from: r, reason: collision with root package name */
    private b f19039r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.1
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
        this.f19038q = new ArrayList();
        this.f19024a = str;
        if (this.f19038q == null) {
            this.f19038q = new ArrayList();
        }
        g();
        n();
        h();
    }

    private void g() {
        if (this.f19039r == null) {
            this.f19039r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.2
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
                a.b L6 = b9.L();
                if (L6 == null) {
                    return;
                }
                g();
                com.anythink.expressad.foundation.f.b.a();
                this.f19037p = new c(com.anythink.expressad.foundation.f.b.a(t.b().g()), this.f19039r);
                FeedbackRadioGroup a9 = a(L6);
                this.f19037p.c(L6.c());
                this.f19037p.b(L6.b());
                this.f19037p.a(L6.a());
                this.f19037p.a(a9);
                this.f19037p.a(!TextUtils.isEmpty(f19023s));
                a(a9, L6);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void i() {
        List<C0120a> list = this.f19038q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.b();
                }
            }
        }
        f19023s = "";
    }

    private void j() {
        List<C0120a> list = this.f19038q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a();
                }
            }
        }
        f19023s = "";
    }

    private void k() {
        List<C0120a> list = this.f19038q;
        if (list != null) {
            Iterator<C0120a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private String l() {
        return this.f19024a;
    }

    private void m() {
        FeedBackButton feedBackButton = this.f19026c;
        if (feedBackButton != null) {
            int i = this.f19029f;
            if (i >= 0) {
                feedBackButton.setX(i);
            }
            int i6 = this.f19030g;
            if (i6 >= 0) {
                this.f19026c.setY(i6);
            }
            float f3 = this.f19034l;
            if (f3 >= 0.0f) {
                this.f19026c.setAlpha(f3);
                this.f19026c.setEnabled(this.f19034l != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f19026c.getLayoutParams();
            int i9 = this.f19031h;
            if (i9 > 0) {
                this.f19026c.setWidth(i9);
                if (layoutParams != null) {
                    layoutParams.width = this.f19031h;
                }
            }
            int i10 = this.i;
            if (i10 > 0) {
                this.f19026c.setHeight(i10);
                if (layoutParams != null) {
                    layoutParams.height = this.i;
                }
            }
            if (layoutParams != null) {
                this.f19026c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f19032j)) {
                    this.f19026c.setTextColor(Color.parseColor(this.f19032j));
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i11 = this.f19035m;
            if (i11 > 0) {
                gradientDrawable.setCornerRadius(i11);
            }
            if (TextUtils.isEmpty(this.f19033k)) {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            } else {
                gradientDrawable.setColor(Color.parseColor(this.f19033k));
            }
            try {
                this.f19026c.setBackgroundDrawable(gradientDrawable);
            } catch (Throwable unused) {
            }
        }
    }

    private void n() {
        Context g4 = t.b().g();
        if (g4 != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(g4);
                this.f19026c = feedBackButton;
                int i = 8;
                if (this.f19036o != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.f19026c.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.4
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
        return this.f19027d;
    }

    private int p() {
        return this.f19028e;
    }

    public final void b() {
        c cVar = this.f19037p;
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        this.f19037p.cancel();
    }

    public final FeedBackButton c() {
        if (this.f19026c == null) {
            n();
        }
        return this.f19026c;
    }

    public final d e() {
        return this.f19025b;
    }

    public final void a() {
        com.anythink.expressad.foundation.f.b.a();
        Activity a9 = com.anythink.expressad.foundation.f.b.a(t.b().g());
        c cVar = this.f19037p;
        if (cVar == null || cVar.getContext() != a9) {
            h();
        }
        Context g4 = t.b().g();
        FeedBackButton feedBackButton = this.f19026c;
        if (feedBackButton != null) {
            g4 = feedBackButton.getContext();
        }
        com.anythink.expressad.foundation.f.b.a();
        boolean a10 = com.anythink.expressad.foundation.f.b.a(g4, this.f19037p);
        List<C0120a> list = this.f19038q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a(a10);
                }
            }
        }
    }

    public final void d() {
        FeedBackButton feedBackButton = this.f19026c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f19026c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f19026c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f19026c);
            }
        }
        c cVar = this.f19037p;
        if (cVar != null) {
            cVar.a((b) null);
        }
        this.f19037p = null;
        this.f19038q = null;
        this.f19026c = null;
        this.f19039r = null;
    }

    /* renamed from: com.anythink.expressad.foundation.f.a.a$a, reason: collision with other inner class name */
    public static class C0120a implements b {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.foundation.f.a f19045a;

        /* renamed from: b, reason: collision with root package name */
        private String f19046b;

        public C0120a(String str, com.anythink.expressad.foundation.f.a aVar) {
            this.f19045a = aVar;
            this.f19046b = str;
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            com.anythink.expressad.foundation.f.b.f19049c = false;
            com.anythink.expressad.foundation.f.a aVar = this.f19045a;
            if (aVar != null) {
                String unused = a.f19023s;
                aVar.c();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            com.anythink.expressad.foundation.f.b.f19049c = false;
            com.anythink.expressad.foundation.f.a aVar = this.f19045a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
        }

        public final void a(boolean z3) {
            com.anythink.expressad.foundation.f.b.f19049c = true;
            com.anythink.expressad.foundation.f.a aVar = this.f19045a;
            if (aVar == null || !z3) {
                return;
            }
            aVar.a();
        }
    }

    private void b(C0120a c0120a) {
        List<C0120a> list = this.f19038q;
        if (list != null) {
            list.remove(c0120a);
        }
    }

    public final void c(int i) {
        this.f19028e = i;
    }

    public static /* synthetic */ void c(a aVar) {
        List<C0120a> list = aVar.f19038q;
        if (list != null) {
            Iterator<C0120a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void b(int i) {
        this.f19027d = i;
    }

    public static /* synthetic */ void b(a aVar) {
        List<C0120a> list = aVar.f19038q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.b();
                }
            }
        }
        f19023s = "";
    }

    public final void a(int i) {
        this.f19036o = i;
        FeedBackButton feedBackButton = this.f19026c;
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
        JSONArray d2 = bVar.d();
        Context g4 = t.b().g();
        if (d2 == null || d2.length() <= 0 || g4 == null) {
            return;
        }
        int a9 = k.a(g4, "anythink_cm_feedback_choice_btn_bg", k.f19632c);
        Resources a10 = k.a(g4);
        int a11 = k.a(g4, "anythink_cm_feedback_rb_text_color_color_list", k.f19633d);
        if (a10 != null) {
            try {
                colorStateList = a10.getColorStateList(a11);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            int b9 = v.b(g4, 14.0f);
            int b10 = v.b(g4, 7.0f);
            int b11 = v.b(g4, 6.0f);
            for (i = 0; i < d2.length(); i++) {
                String optString = d2.optString(i);
                RadioButton radioButton = new RadioButton(g4);
                radioButton.setButtonDrawable((Drawable) null);
                radioButton.setBackgroundResource(a9);
                radioButton.setText(optString);
                if (colorStateList != null) {
                    radioButton.setTextColor(colorStateList);
                }
                radioButton.setPadding(b9, b10, b9, b10);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
                int i6 = b11 / 4;
                layoutParams.setMargins(b11, i6, b11, i6);
                a(radioButton);
                feedbackRadioGroup.addView(radioButton, layoutParams);
            }
        }
        colorStateList = null;
        int b92 = v.b(g4, 14.0f);
        int b102 = v.b(g4, 7.0f);
        int b112 = v.b(g4, 6.0f);
        while (i < d2.length()) {
        }
    }

    private static FeedbackRadioGroup a(a.b bVar) {
        JSONArray d2 = bVar.d();
        Context g4 = t.b().g();
        if (d2 == null || d2.length() <= 0 || g4 == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(g4);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    private void a(RadioButton radioButton) {
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.anythink.expressad.foundation.f.a.a.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                if (z3) {
                    String unused = a.f19023s = (String) compoundButton.getText();
                }
                if (a.this.f19037p != null) {
                    a.this.f19037p.a(!TextUtils.isEmpty(a.f19023s));
                }
            }
        });
    }

    public final void a(C0120a c0120a) {
        if (this.f19038q == null) {
            this.f19038q = new ArrayList();
        }
        this.f19038q.add(c0120a);
    }

    private void a(boolean z3) {
        List<C0120a> list = this.f19038q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a(z3);
                }
            }
        }
    }

    public final void a(int i, int i6, int i9, int i10, int i11, float f3, String str, String str2) {
        this.f19029f = i;
        this.f19030g = i6;
        this.f19031h = i9;
        this.i = i10;
        this.f19032j = str;
        this.f19033k = str2;
        this.f19034l = f3;
        this.f19035m = i11;
        m();
    }

    public final void a(d dVar) {
        this.f19025b = dVar;
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f19026c;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f19034l);
            feedBackButton.setEnabled(this.f19034l != 0.0f);
            feedBackButton.setVisibility(this.f19036o != 8 ? 0 : 8);
            this.f19026c = feedBackButton;
            d dVar = this.f19025b;
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
        List<C0120a> list = aVar.f19038q;
        if (list != null) {
            for (C0120a c0120a : list) {
                if (c0120a != null) {
                    c0120a.a();
                }
            }
        }
        f19023s = "";
    }
}
