package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.i;
import defpackage.ern;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.h3k;
import defpackage.ib9;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class f {
    public static final /* synthetic */ s9f[] n = {new yxm(f.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), f1d.c(ern.a, f.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "offersRecyclerView", "getOffersRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(f.class, "alternativeActionTextTextView", "getAlternativeActionTextTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "supportTextTextView", "getSupportTextTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "errorCodeTextView", "getErrorCodeTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "nextOfferButton", "getNextOfferButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0), new yxm(f.class, "previousOfferButton", "getPreviousOfferButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0)};
    public final CounterOffersContentView a;
    public final ezc b;
    public final com.yandex.plus.bdui.plus.content.controller.f c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;
    public final com.yandex.plus.bdui.plus.content.controller.f e;
    public final com.yandex.plus.bdui.plus.content.controller.f f;
    public final com.yandex.plus.bdui.plus.content.controller.f g;
    public final com.yandex.plus.bdui.plus.content.controller.f h;
    public final com.yandex.plus.bdui.plus.content.controller.f i;
    public final com.yandex.plus.bdui.plus.content.controller.f j;
    public final LinearLayoutManager k;
    public final com.yandex.plus.core.debug.panel.internal.presentation.adapter.b l;
    public final i m;

    /* JADX WARN: Multi-variable type inference failed */
    public f(CounterOffersContentView counterOffersContentView, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, Function0 function0, Function1 function1, Function1 function12) {
        counterOffersContentView.getClass();
        bVar.getClass();
        aVar.getClass();
        this.a = counterOffersContentView;
        this.b = (ezc) function1;
        com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(counterOffersContentView, 19));
        this.c = fVar;
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(counterOffersContentView, 20));
        this.d = fVar2;
        this.e = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(counterOffersContentView, 21));
        com.yandex.plus.bdui.plus.content.controller.f fVar3 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(counterOffersContentView, 22));
        this.f = fVar3;
        com.yandex.plus.bdui.plus.content.controller.f fVar4 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(counterOffersContentView, 23));
        this.g = fVar4;
        this.h = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(counterOffersContentView, 24));
        com.yandex.plus.bdui.plus.content.controller.f fVar5 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(counterOffersContentView, 25));
        this.i = fVar5;
        com.yandex.plus.bdui.plus.content.controller.f fVar6 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(counterOffersContentView, 26));
        this.j = fVar6;
        h3k h3kVar = new h3k();
        final int i = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(counterOffersContentView.getContext(), 0, false);
        this.k = linearLayoutManager;
        com.yandex.plus.core.debug.panel.internal.presentation.adapter.b bVar2 = new com.yandex.plus.core.debug.panel.internal.presentation.adapter.b((com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a.a.getValue(), bVar, function12);
        this.l = bVar2;
        s9f[] s9fVarArr = n;
        s9f s9fVar = s9fVarArr[0];
        s9fVar.getClass();
        try {
            View findViewById = counterOffersContentView.findViewById(R.id.counter_offers_toolbar);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView");
            }
            this.m = new i((PlusPayToolbarView) findViewById, aVar, bVar, function0);
            d().setAdapter(bVar2);
            d().setLayoutManager(linearLayoutManager);
            r1.E((FloatingActionButton) fVar6.g(s9fVarArr[8]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            f fVar7 = this.b;
                            int o1 = fVar7.k.o1();
                            if (o1 != 0) {
                                fVar7.d().C0(o1 - 1);
                                break;
                            }
                            break;
                        default:
                            f fVar8 = this.b;
                            int s1 = fVar8.k.s1();
                            if (s1 != r0.a0() - 1) {
                                fVar8.d().C0(s1 + 1);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            r1.E((FloatingActionButton) fVar5.g(s9fVarArr[7]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            f fVar7 = this.b;
                            int o1 = fVar7.k.o1();
                            if (o1 != 0) {
                                fVar7.d().C0(o1 - 1);
                                break;
                            }
                            break;
                        default:
                            f fVar8 = this.b;
                            int s1 = fVar8.k.s1();
                            if (s1 != r0.a0() - 1) {
                                fVar8.d().C0(s1 + 1);
                                break;
                            }
                            break;
                    }
                }
            });
            d().addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.a(5, this));
            d().t(new ib9(4, this));
            h3kVar.a(d());
            ((TextView) fVar.g(s9fVarArr[1])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
            ((TextView) fVar2.g(s9fVarArr[2])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
            ((TextView) fVar3.g(s9fVarArr[4])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
            ((TextView) fVar4.g(s9fVarArr[5])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
        } catch (ClassCastException e) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ezc, kotlin.jvm.functions.Function1] */
    public static final void a(f fVar) {
        LinearLayoutManager linearLayoutManager = fVar.k;
        int r1 = linearLayoutManager.r1();
        int t1 = linearLayoutManager.t1();
        if (r1 > t1) {
            return;
        }
        while (true) {
            View L = linearLayoutManager.L(r1);
            if (L != null && e(L, 0.8f)) {
                fVar.b.invoke(Integer.valueOf(r1));
            }
            if (r1 == t1) {
                return;
            } else {
                r1++;
            }
        }
    }

    public static final void b(f fVar) {
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = fVar.i;
        LinearLayoutManager linearLayoutManager = fVar.k;
        int t1 = linearLayoutManager.t1();
        opn T = fVar.d().T(t1, false);
        if (T == null) {
            return;
        }
        View view = T.a;
        view.getClass();
        int a0 = linearLayoutManager.a0() - 1;
        s9f[] s9fVarArr = n;
        if (t1 == a0 && e(view, 1.0f)) {
            ((FloatingActionButton) fVar2.g(s9fVarArr[7])).h(null, true);
        } else {
            ((FloatingActionButton) fVar2.g(s9fVarArr[7])).l(null, true);
        }
    }

    public static final void c(f fVar) {
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = fVar.j;
        int r1 = fVar.k.r1();
        opn T = fVar.d().T(r1, false);
        if (T == null) {
            return;
        }
        View view = T.a;
        view.getClass();
        s9f[] s9fVarArr = n;
        if (r1 == 0 && e(view, 1.0f)) {
            ((FloatingActionButton) fVar2.g(s9fVarArr[8])).h(null, true);
        } else {
            ((FloatingActionButton) fVar2.g(s9fVarArr[8])).l(null, true);
        }
    }

    public static boolean e(View view, float f) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) >= ((float) view.getWidth()) * f;
    }

    public final RecyclerView d() {
        return (RecyclerView) this.e.g(n[3]);
    }

    public final void f(d dVar) {
        dVar.getClass();
        s9f[] s9fVarArr = n;
        r1.F((TextView) this.c.g(s9fVarArr[1]), dVar.a);
        r1.F((TextView) this.d.g(s9fVarArr[2]), dVar.b);
        this.l.v(dVar.c);
        r1.F((TextView) this.f.g(s9fVarArr[4]), dVar.d);
        r1.F((TextView) this.g.g(s9fVarArr[5]), dVar.e);
        s9f s9fVar = s9fVarArr[6];
        com.yandex.plus.bdui.plus.content.controller.f fVar = this.h;
        r1.F((TextView) fVar.g(s9fVar), dVar.f);
        ((TextView) fVar.g(s9fVarArr[6])).setContentDescription(dVar.g);
    }
}
