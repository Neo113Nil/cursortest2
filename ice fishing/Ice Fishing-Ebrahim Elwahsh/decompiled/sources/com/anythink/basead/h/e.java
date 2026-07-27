package com.anythink.basead.h;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.basead.b.c;
import com.anythink.basead.d.j;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.i;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.g.a f9171a;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.v.a.c f9172k;

    /* renamed from: l, reason: collision with root package name */
    com.anythink.basead.b.c f9173l;

    /* renamed from: m, reason: collision with root package name */
    View f9174m;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f9175n;

    /* renamed from: o, reason: collision with root package name */
    View f9176o;

    /* renamed from: p, reason: collision with root package name */
    View.OnClickListener f9177p;

    /* renamed from: q, reason: collision with root package name */
    View.OnClickListener f9178q;

    /* renamed from: r, reason: collision with root package name */
    com.anythink.basead.ui.improveclick.a f9179r;

    /* renamed from: s, reason: collision with root package name */
    private final String f9180s;

    /* renamed from: com.anythink.basead.h.e$4, reason: invalid class name */
    public class AnonymousClass4 extends com.anythink.core.common.v.a.a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
        public final void recordImpression(View view) {
            e.this.s();
        }
    }

    /* renamed from: com.anythink.basead.h.e$5, reason: invalid class name */
    public class AnonymousClass5 implements c.a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.ui.improveclick.c.a
        public final void a(int i, int i4) {
            e.this.a(i, i4, false);
        }
    }

    /* renamed from: com.anythink.basead.h.e$6, reason: invalid class name */
    public class AnonymousClass6 extends com.anythink.basead.ui.improveclick.a {
        public AnonymousClass6(ViewGroup viewGroup, w wVar, x xVar, c.a aVar) {
            super(viewGroup, wVar, xVar, 5, aVar);
        }

        @Override // com.anythink.basead.ui.improveclick.a
        public final ViewGroup.LayoutParams a() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (e.this.f9174m != null) {
                layoutParams.gravity = 81;
                layoutParams.setMargins(0, 0, 0, 0);
            }
            return layoutParams;
        }
    }

    public e(Context context, x xVar, String str, boolean z8) {
        super(context, xVar, str, z8);
        this.f9180s = getClass().getSimpleName();
        this.f9177p = new View.OnClickListener() { // from class: com.anythink.basead.h.e.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.this.a(view, false);
            }
        };
        this.f9178q = new View.OnClickListener() { // from class: com.anythink.basead.h.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.this.a(view, true);
            }
        };
    }

    public static View l() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.f9175n) {
            return;
        }
        a(114);
        this.f9175n = true;
        com.anythink.basead.h.a.b.a(this.f9160c).a(this.f9164g);
        com.anythink.basead.b.b.a(8, this.f9164g, new j(this.f9161d, ""));
        com.anythink.basead.g.a aVar = this.f9171a;
        if (aVar != null) {
            aVar.onAdShow(new com.anythink.basead.g.j());
        }
    }

    private void t() {
        ay ayVar;
        x xVar;
        View view = this.f9174m;
        if (view == null || !(view instanceof ViewGroup) || (ayVar = this.f9164g) == null || (xVar = this.f9161d) == null) {
            return;
        }
        this.f9179r = new AnonymousClass6((ViewGroup) view, ayVar, xVar, new AnonymousClass5());
    }

    private int u() {
        ay ayVar = this.f9164g;
        if (ayVar != null) {
            return ayVar.ab();
        }
        return 0;
    }

    private int v() {
        ay ayVar = this.f9164g;
        if (ayVar != null) {
            return ayVar.ac();
        }
        return 0;
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final String b() {
        ay ayVar = this.f9164g;
        return ayVar != null ? ayVar.x() : "";
    }

    public final String g() {
        ay ayVar = this.f9164g;
        return ayVar != null ? ayVar.y() : "";
    }

    public final String h() {
        ay ayVar = this.f9164g;
        return ayVar != null ? ayVar.D() : "";
    }

    public final String i() {
        ay ayVar = this.f9164g;
        return ayVar != null ? ayVar.z() : "";
    }

    public final String j() {
        ay ayVar = this.f9164g;
        return ayVar != null ? ayVar.B() : "";
    }

    public final String k() {
        ay ayVar = this.f9164g;
        return ayVar != null ? ayVar.C() : "";
    }

    public final int m() {
        ay ayVar = this.f9164g;
        if (ayVar != null) {
            return ayVar.ab();
        }
        return 0;
    }

    public final int n() {
        ay ayVar = this.f9164g;
        if (ayVar != null) {
            return ayVar.ac();
        }
        return 0;
    }

    public final void o() {
        com.anythink.core.common.v.a.c cVar = this.f9172k;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void p() {
        o();
        a(112);
        this.f9171a = null;
        com.anythink.basead.b.c cVar = this.f9173l;
        if (cVar != null) {
            cVar.d();
            this.f9173l = null;
        }
        com.anythink.core.common.v.a.c cVar2 = this.f9172k;
        if (cVar2 != null) {
            cVar2.b();
            this.f9172k = null;
        }
    }

    public final int q() {
        ay ayVar = this.f9164g;
        if (ayVar != null) {
            return ayVar.K();
        }
        return 0;
    }

    public final int r() {
        ay ayVar = this.f9164g;
        if (ayVar != null) {
            return ayVar.aa();
        }
        return 0;
    }

    public final void a(View view, boolean z8) {
        View view2 = this.f9176o;
        if (view2 != null && view == view2) {
            a(1, 1, z8);
            return;
        }
        View view3 = this.f9174m;
        if (view3 != null && view == view3) {
            a(1, 3, z8);
        } else {
            a(1, 2, z8);
        }
    }

    private void a(int i, int i4) {
        a(i, i4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final int i4, boolean z8) {
        s();
        if (this.f9173l == null) {
            this.f9173l = new com.anythink.basead.b.c(this.f9160c, this.f9161d, this.f9164g, this.f9174m);
        }
        if (this.f9173l.a()) {
            return;
        }
        this.f9173l.a(new c.a() { // from class: com.anythink.basead.h.e.3
            @Override // com.anythink.basead.b.c.a
            public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
                return false;
            }

            @Override // com.anythink.basead.b.c.a
            public final void b() {
            }

            @Override // com.anythink.basead.b.c.a
            public final void c() {
                i.a().b();
            }

            @Override // com.anythink.basead.b.c.a
            public final void a() {
                com.anythink.basead.g.a aVar = e.this.f9171a;
                if (aVar != null) {
                    aVar.onAdClick(new com.anythink.basead.g.j().a(i, i4));
                }
            }

            @Override // com.anythink.basead.b.c.a
            public final void a(boolean z9) {
                com.anythink.basead.g.a aVar = e.this.f9171a;
                if (aVar != null) {
                    aVar.onDeeplinkCallback(z9);
                }
            }
        });
        j jVar = new j(this.f9161d, "");
        if (z8) {
            jVar.f6374m = true;
        }
        this.f9173l.a(jVar);
        a(113);
    }

    private void a(View view, View[] viewArr) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), viewArr);
            }
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            if (TextUtils.isEmpty(charSequence) || !TextUtils.equals(charSequence, h())) {
                return;
            }
            viewArr[0] = view;
        }
    }

    public final void a(com.anythink.basead.g.a aVar) {
        this.f9171a = aVar;
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), onClickListener);
            }
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    private void a(View view) {
        e eVar;
        ay ayVar;
        x xVar;
        this.f9174m = view;
        if (view == null || !(view instanceof ViewGroup) || (ayVar = this.f9164g) == null || (xVar = this.f9161d) == null) {
            eVar = this;
        } else {
            eVar = this;
            eVar.f9179r = eVar.new AnonymousClass6((ViewGroup) view, ayVar, xVar, new AnonymousClass5());
        }
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        if (eVar.f9172k == null) {
            view.getContext();
            eVar.f9172k = new com.anythink.core.common.v.a.c(1);
        }
        eVar.f9172k.a(view, anonymousClass4);
    }

    private void a(int i) {
        com.anythink.basead.ui.improveclick.a aVar = this.f9179r;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public final void a(View view, List<View> list, List<View> list2) {
        e eVar;
        ay ayVar;
        x xVar;
        this.f9174m = view;
        if (view == null || !(view instanceof ViewGroup) || (ayVar = this.f9164g) == null || (xVar = this.f9161d) == null) {
            eVar = this;
        } else {
            eVar = this;
            eVar.f9179r = eVar.new AnonymousClass6((ViewGroup) view, ayVar, xVar, new AnonymousClass5());
        }
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        if (eVar.f9172k == null) {
            view.getContext();
            eVar.f9172k = new com.anythink.core.common.v.a.c(1);
        }
        eVar.f9172k.a(view, anonymousClass4);
        if (list != null && list.size() > 0) {
            View[] viewArr = new View[1];
            a(view, viewArr);
            View view2 = viewArr[0];
            if (view2 != null) {
                eVar.f9176o = view2;
            }
            for (View view3 : list) {
                if (view3 != null) {
                    view3.setOnClickListener(eVar.f9177p);
                }
            }
        } else {
            a(view, eVar.f9177p);
        }
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        for (View view4 : list2) {
            if (view4 != null) {
                view4.setOnClickListener(eVar.f9178q);
            }
        }
    }
}
