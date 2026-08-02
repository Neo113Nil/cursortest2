package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.ern;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.fe0;
import defpackage.jdu;
import defpackage.m8f;
import defpackage.pce;
import defpackage.s9f;
import defpackage.wdu;
import defpackage.yxm;
import defpackage.zne;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public static final /* synthetic */ s9f[] w = {new yxm(c.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, c.class, "contentLayout", "getContentLayout()Landroid/view/ViewGroup;", 0), new yxm(c.class, "upsaleCardLayout", "getUpsaleCardLayout()Landroid/view/ViewGroup;", 0), new yxm(c.class, "headingImageCard", "getHeadingImageCard()Lcom/google/android/material/card/MaterialCardView;", 0), new yxm(c.class, "headingImageView", "getHeadingImageView()Landroid/widget/ImageView;", 0), new yxm(c.class, "title", "getTitle()Landroid/widget/TextView;", 0), new yxm(c.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), new yxm(c.class, "offerText", "getOfferText()Landroid/widget/TextView;", 0), new yxm(c.class, "additionalOfferText", "getAdditionalOfferText()Landroid/widget/TextView;", 0), new yxm(c.class, "legalsText", "getLegalsText()Landroid/widget/TextView;", 0), new yxm(c.class, "rejectButton", "getRejectButton()Landroid/widget/TextView;", 0), new yxm(c.class, "acceptButton", "getAcceptButton()Landroid/widget/TextView;", 0), new yxm(c.class, "benefitsRecycler", "getBenefitsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final UpsaleContentView a;
    public final com.yandex.plus.core.imageloader.b b;
    public final ezc c;
    public final ezc d;
    public final ezc e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public final f j;
    public final f k;
    public final f l;
    public final f m;
    public final f n;
    public final f o;
    public final m8f p;
    public final ViewTreeObserver q;
    public final fe0 r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;

    /* JADX WARN: Multi-variable type inference failed */
    public c(UpsaleContentView upsaleContentView, com.yandex.plus.core.imageloader.b bVar, Function0 function0, Function0 function02, Function0 function03) {
        char c;
        upsaleContentView.getClass();
        bVar.getClass();
        this.a = upsaleContentView;
        this.b = bVar;
        this.c = (ezc) function0;
        this.d = (ezc) function02;
        this.e = (ezc) function03;
        this.f = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 5));
        f fVar = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 6));
        this.g = fVar;
        this.h = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 7));
        this.i = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 8));
        f fVar2 = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 9));
        this.j = fVar2;
        this.k = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 10));
        this.l = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 11));
        f fVar3 = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 2));
        this.m = fVar3;
        int i = 3;
        f fVar4 = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, i));
        this.n = fVar4;
        f fVar5 = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(upsaleContentView, 4));
        this.o = fVar5;
        m8f m8fVar = new m8f(5);
        this.p = m8fVar;
        ViewTreeObserver viewTreeObserver = upsaleContentView.getViewTreeObserver();
        this.q = viewTreeObserver;
        fe0 fe0Var = new fe0(i, this);
        this.r = fe0Var;
        this.s = b().getPaddingLeft();
        this.t = b().getPaddingTop();
        this.u = b().getPaddingRight();
        this.v = b().getPaddingBottom();
        s9f[] s9fVarArr = w;
        s9f s9fVar = s9fVarArr[2];
        s9fVar.getClass();
        try {
            ViewGroup viewGroup = (ViewGroup) upsaleContentView.findViewById(R.id.upsale_card_layout);
            final int i2 = 1;
            if (viewGroup == null) {
                s9f s9fVar2 = s9fVarArr[1];
                s9fVar2.getClass();
                c = 3;
                try {
                    View findViewById = upsaleContentView.findViewById(R.id.upsale_content);
                    if (findViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    viewGroup = (ViewGroup) findViewById;
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e);
                    throw null;
                }
            } else {
                c = 3;
            }
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(2, 600L);
            layoutTransition.setDuration(0, 200L);
            viewGroup.setLayoutTransition(layoutTransition);
            ((MaterialCardView) fVar.g(s9fVarArr[c])).setVisibility(8);
            ((TextView) fVar3.g(s9fVarArr[9])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
            final int i3 = 0;
            r1.E((TextView) fVar5.g(s9fVarArr[11]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.b
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r1v3, types: [ezc, kotlin.jvm.functions.Function0] */
                /* JADX WARN: Type inference failed for: r1v5, types: [ezc, kotlin.jvm.functions.Function0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.b.c.invoke();
                            break;
                        default:
                            this.b.d.invoke();
                            break;
                    }
                }
            });
            r1.E((TextView) fVar4.g(s9fVarArr[10]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.b
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r1v3, types: [ezc, kotlin.jvm.functions.Function0] */
                /* JADX WARN: Type inference failed for: r1v5, types: [ezc, kotlin.jvm.functions.Function0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.b.c.invoke();
                            break;
                        default:
                            this.b.d.invoke();
                            break;
                    }
                }
            });
            s9f s9fVar3 = s9fVarArr[12];
            s9fVar3.getClass();
            try {
                View findViewById2 = upsaleContentView.findViewById(R.id.upsale_benefits_recycler);
                if (findViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
                ((RecyclerView) findViewById2).setAdapter(m8fVar);
                TextView textView = (TextView) fVar2.g(s9fVarArr[6]);
                WeakHashMap weakHashMap = wdu.a;
                new jdu(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(textView, Boolean.TRUE);
                viewTreeObserver.addOnScrollChangedListener(fe0Var);
            } catch (ClassCastException e2) {
                com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e2);
                throw null;
            }
        } catch (ClassCastException e3) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e3);
            throw null;
        }
    }

    public final void a(zne zneVar) {
        zneVar.getClass();
        b().setPadding(this.s + zneVar.a, this.t + zneVar.b, this.u + zneVar.c, this.v + zneVar.d);
    }

    public final ViewGroup b() {
        return (ViewGroup) this.f.g(w[0]);
    }

    public final void c(a aVar) {
        aVar.getClass();
        s9f[] s9fVarArr = w;
        ((TextView) this.i.g(s9fVarArr[5])).setText(aVar.a);
        ((TextView) this.j.g(s9fVarArr[6])).setText(aVar.b);
        ((TextView) this.k.g(s9fVarArr[7])).setText(aVar.c);
        TextView textView = (TextView) this.l.g(s9fVarArr[8]);
        String str = aVar.d;
        boolean U = StringsKt.U(str);
        textView.getClass();
        if (U) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        ((TextView) this.o.g(s9fVarArr[11])).setText(aVar.f);
        ((TextView) this.n.g(s9fVarArr[10])).setText(aVar.e);
        CharSequence charSequence = aVar.i;
        boolean z = (charSequence == null || StringsKt.U(charSequence)) ? false : true;
        TextView textView2 = (TextView) this.m.g(s9fVarArr[9]);
        textView2.getClass();
        if (z) {
            textView2.setVisibility(0);
            textView2.setText(charSequence);
        } else {
            textView2.setVisibility(8);
        }
        String str2 = aVar.h;
        if (str2 != null) {
            f b = ((com.yandex.plus.coil.b) this.b).b(str2);
            pce pceVar = (pce) b.c;
            pceVar.w = null;
            pceVar.v = 0;
            b.j(new com.yandex.passport.sloth.ui.c(15, this));
        } else {
            ((MaterialCardView) this.g.g(s9fVarArr[3])).setVisibility(8);
        }
        this.p.v(aVar.g);
    }
}
