package com.yandex.passport.common.mvi;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.plus.plaquesdk.plaque.api.models.d0;
import com.yandex.plus.plaquesdk.plaque.api.models.e0;
import com.yandex.plus.plaquesdk.plaque.api.models.f0;
import com.yandex.plus.plaquesdk.plaque.api.models.g0;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import com.yandex.plus.plaquesdk.plaque.api.models.o;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.b6e;
import defpackage.bw1;
import defpackage.ezc;
import defpackage.hrg;
import defpackage.jj4;
import defpackage.jyr;
import defpackage.m8t;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.oj;
import defpackage.rjc;
import defpackage.syc;
import defpackage.t75;
import defpackage.xpi;
import defpackage.zyc;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements rjc, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((f) obj2).a(obj);
                Unit unit = Unit.a;
                nm6 nm6Var = nm6.a;
                return unit;
            case 1:
                Object emit = ((xpi) obj2).emit(obj, continuation);
                return emit == nm6.a ? emit : Unit.a;
            default:
                com.yandex.plus.home.plaque.feature.internal.presentation.a aVar = (com.yandex.plus.home.plaque.feature.internal.presentation.a) obj;
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar = (com.yandex.plus.home.plaque.feature.internal.presentation.b) obj2;
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) bVar.b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "PlaqueViewControllerImpl", "changeState(" + aVar + ')');
                }
                com.yandex.plus.plaquesdk.plaque.c cVar = (com.yandex.plus.plaquesdk.plaque.c) bVar.f;
                j0 j0Var = aVar.a;
                long f = nsa.f(aVar.b);
                int i4 = com.yandex.plus.plaquesdk.plaque.c.j;
                jyr jyrVar = cVar.c;
                x xVar = j0Var.b;
                if (f != 0) {
                    j0 j0Var2 = cVar.e;
                    com.yandex.plus.plaquesdk.plaque.api.dependencies.c cVar2 = j0Var2 != null ? new com.yandex.plus.plaquesdk.plaque.api.dependencies.c(null, j0Var2.a) : null;
                    com.yandex.plus.plaquesdk.plaque.api.dependencies.c cVar3 = new com.yandex.plus.plaquesdk.plaque.api.dependencies.c(null, j0Var.a);
                    if (cVar2 != null) {
                        cVar.b.a(cVar, f, j0Var.d, new m8t(cVar, cVar2, cVar3));
                    } else {
                        Iterator it = cVar.i.iterator();
                        if (it.hasNext()) {
                            throw hrg.j(it);
                        }
                        cVar.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.a(cVar, cVar3));
                    }
                }
                bw1 bw1Var = cVar.d;
                g0 g0Var = j0Var.c;
                bw1Var.v(t75.c(xVar));
                if (g0Var != null) {
                    com.yandex.plus.plaquesdk.plaque.a aVar3 = (com.yandex.plus.plaquesdk.plaque.a) jyrVar.getValue();
                    if (aVar3.getParent() == null) {
                        cVar.addView(aVar3);
                    }
                    AppCompatImageView appCompatImageView = aVar3.c;
                    AppCompatTextView appCompatTextView = aVar3.d;
                    int i5 = xVar instanceof o ? aVar3.b : aVar3.a;
                    boolean z = g0Var instanceof d0;
                    int i6 = 0;
                    if (z) {
                        appCompatImageView.setVisibility(8);
                        appCompatTextView.setVisibility(0);
                        aVar3.setTransitionName("plaque_notification_count_transition_name");
                        int i7 = ((d0) g0Var).a;
                        appCompatTextView.setText(i7 <= 99 ? String.valueOf(i7) : "99+");
                        appCompatTextView.setMinWidth(i5);
                    } else {
                        if (!(g0Var instanceof e0)) {
                            b6e.s();
                            return null;
                        }
                        appCompatTextView.setVisibility(8);
                        appCompatImageView.setVisibility(0);
                        aVar3.setTransitionName("plaque_notification_icon_transition_name");
                        appCompatImageView.setImageDrawable(((e0) g0Var).a.a);
                    }
                    if (z) {
                        layoutParams = new FrameLayout.LayoutParams(-2, i5);
                    } else {
                        if (!(g0Var instanceof e0)) {
                            b6e.s();
                            return null;
                        }
                        layoutParams = new FrameLayout.LayoutParams(i5, i5);
                    }
                    int ordinal = g0Var.getPosition().ordinal();
                    if (ordinal == 0) {
                        i = 8388611;
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        i = 8388613;
                    }
                    layoutParams.gravity = i;
                    aVar3.setLayoutParams(layoutParams);
                    f0 position = g0Var.getPosition();
                    ViewGroup.LayoutParams layoutParams2 = aVar3.getLayoutParams();
                    if (layoutParams2 == null) {
                        jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int i8 = -i5;
                    int i9 = i8 / 2;
                    int ordinal2 = position.ordinal();
                    if (ordinal2 == 0) {
                        i2 = i9;
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        i2 = 0;
                    }
                    int ordinal3 = position.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            b6e.s();
                            return null;
                        }
                        i6 = i8 / 4;
                    }
                    int i10 = marginLayoutParams.bottomMargin;
                    marginLayoutParams.setMarginStart(i2);
                    marginLayoutParams.topMargin = i9;
                    marginLayoutParams.setMarginEnd(i6);
                    marginLayoutParams.bottomMargin = i10;
                    aVar3.setLayoutParams(marginLayoutParams);
                } else if (jyrVar.isInitialized()) {
                    cVar.removeView((View) jyrVar.getValue());
                }
                cVar.e = j0Var;
                Unit unit2 = Unit.a;
                nm6 nm6Var2 = nm6.a;
                return unit2;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new oj(2, 4, f.class, (f) this.b, "render", "render(Ljava/lang/Object;)V");
            case 1:
                return new ezc(2, 0, xpi.class, (xpi) this.b, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new oj(2, 4, com.yandex.plus.home.plaque.feature.internal.presentation.b.class, (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.b, "changeState", "changeState(Lcom/yandex/plus/home/plaque/feature/internal/presentation/PlaqueUiState;)V");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
