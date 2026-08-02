package ru.yandex.taxi.widget.map;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import defpackage.a0c0;
import defpackage.bry0;
import defpackage.dv31;
import defpackage.dwh0;
import defpackage.ei;
import defpackage.evu0;
import defpackage.f0c0;
import defpackage.hg;
import defpackage.ifq0;
import defpackage.jl40;
import defpackage.kdt0;
import defpackage.ldt0;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes10.dex */
public final class c extends dv31 {
    public final /* synthetic */ SourceOnMapControl k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SourceOnMapControl sourceOnMapControl, SourceOnMapControl.a aVar, SourceOnMapControl sourceOnMapControl2) {
        super(sourceOnMapControl, aVar);
        this.k = sourceOnMapControl2;
    }

    @Override // defpackage.dv31
    public final void a(Object obj, Object obj2) {
    }

    @Override // defpackage.dv31
    public final void d(Object obj, Object obj2) {
        kdt0 kdt0Var;
        bry0 bry0Var;
        bry0 bry0Var2;
        bry0 bry0Var3;
        kdt0 kdt0Var2;
        kdt0 kdt0Var3;
        Transition transition;
        ldt0 trailButtonsBinding;
        ldt0 trailButtonsBinding2;
        ldt0 trailButtonsBinding3;
        Transition transition2;
        ldt0 trailButtonsBinding4;
        ldt0 trailButtonsBinding5;
        ldt0 trailButtonsBinding6;
        ldt0 trailButtonsBinding7;
        ldt0 trailButtonsBinding8;
        Transition transition3;
        final SourceOnMapControl.a aVar = (SourceOnMapControl.a) obj2;
        SourceOnMapControl.a aVar2 = (SourceOnMapControl.a) obj;
        boolean z = aVar.f;
        String str = aVar.e;
        f0c0 f0c0Var = aVar.a;
        CharSequence charSequence = aVar.b;
        String str2 = aVar.c;
        b bVar = aVar.i;
        SourceOnMapControl sourceOnMapControl = this.k;
        sourceOnMapControl.shouldSwapTexts = z;
        String str3 = aVar2.c;
        b bVar2 = aVar2.i;
        if ((str3.length() > 0 || aVar2.b.length() > 0) != (str2.length() > 0 || charSequence.length() > 0)) {
            transition3 = sourceOnMapControl.stateChangeTransition;
            TransitionManager.beginDelayedTransition(sourceOnMapControl, transition3);
        }
        kdt0Var = sourceOnMapControl.binding;
        kdt0Var.b.render(f0c0Var);
        bry0Var = sourceOnMapControl.hintHelper;
        bry0Var.g(charSequence);
        bry0Var2 = sourceOnMapControl.textHelper;
        bry0Var2.g(str2);
        bry0Var3 = sourceOnMapControl.textHelper;
        boolean z2 = aVar.d;
        if (bry0Var3.b != z2) {
            bry0Var3.b = z2;
            bry0Var3.g = 0;
            bry0Var3.a.requestLayout();
        }
        kdt0Var2 = sourceOnMapControl.binding;
        sourceOnMapControl.updateAnimation(kdt0Var2.c, false);
        kdt0Var3 = sourceOnMapControl.binding;
        sourceOnMapControl.updateAnimation(kdt0Var3.d, false);
        sourceOnMapControl.setContentDescription(str);
        sourceOnMapControl.setClickable(aVar.g);
        sourceOnMapControl.isClickBelowViewDisabled = aVar.h;
        sourceOnMapControl.buttonsTrailVisible = bVar != null;
        if (bVar != null && !jl40.l(bVar2, bVar)) {
            transition2 = sourceOnMapControl.stateChangeTransition;
            TransitionManager.beginDelayedTransition(sourceOnMapControl, transition2);
            trailButtonsBinding4 = sourceOnMapControl.getTrailButtonsBinding();
            trailButtonsBinding4.b.setText(bVar.a().a());
            trailButtonsBinding5 = sourceOnMapControl.getTrailButtonsBinding();
            trailButtonsBinding5.b.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.widget.map.SourceOnMapControl$stateHolder$1$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SourceOnMapControl.a.this.i.a.b.invoke();
                }
            });
            trailButtonsBinding6 = sourceOnMapControl.getTrailButtonsBinding();
            trailButtonsBinding6.c.setText(bVar.b().a());
            trailButtonsBinding7 = sourceOnMapControl.getTrailButtonsBinding();
            trailButtonsBinding7.c.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.widget.map.SourceOnMapControl$stateHolder$1$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SourceOnMapControl.a.this.i.b.b.invoke();
                }
            });
            sourceOnMapControl.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.widget.map.SourceOnMapControl$stateHolder$1$3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SourceOnMapControl.a.this.i.b.b.invoke();
                }
            });
            trailButtonsBinding8 = sourceOnMapControl.getTrailButtonsBinding();
            trailButtonsBinding8.o().setVisibility(0);
            androidx.core.view.b.p(sourceOnMapControl, new ifq0(2, sourceOnMapControl));
            return;
        }
        if (bVar2 != null && bVar == null) {
            transition = sourceOnMapControl.stateChangeTransition;
            TransitionManager.beginDelayedTransition(sourceOnMapControl, transition);
            trailButtonsBinding = sourceOnMapControl.getTrailButtonsBinding();
            trailButtonsBinding.b.setOnClickListener((View.OnClickListener) null);
            trailButtonsBinding2 = sourceOnMapControl.getTrailButtonsBinding();
            trailButtonsBinding2.c.setOnClickListener((View.OnClickListener) null);
            sourceOnMapControl.setOnClickListener(null);
            trailButtonsBinding3 = sourceOnMapControl.getTrailButtonsBinding();
            trailButtonsBinding3.o().setVisibility(8);
            hg.a(sourceOnMapControl);
            return;
        }
        if (bVar == null) {
            if (f0c0Var instanceof a0c0) {
                sourceOnMapControl.setImportantForAccessibility(1);
                Integer b = ((a0c0) f0c0Var).b();
                int intValue = b != null ? b.intValue() : 0;
                sourceOnMapControl.setContentDescription(ru.yandex.taxi.design.utils.c.u(sourceOnMapControl, dwh0.taxi_estimated_time_to_arrival, intValue, Integer.valueOf(intValue)));
            } else if (evu0.J(str2) && evu0.J(charSequence) && evu0.J(str)) {
                sourceOnMapControl.setImportantForAccessibility(4);
            } else {
                sourceOnMapControl.setImportantForAccessibility(1);
            }
            androidx.core.view.b.p(sourceOnMapControl, new ei(21));
        }
    }

    @Override // defpackage.dv31
    public final void f(float f) {
    }
}
