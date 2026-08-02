package ru.yandex.taxi;

import defpackage.eub0;
import defpackage.i3y;
import defpackage.r0c0;
import defpackage.t9b0;
import defpackage.tpr;
import defpackage.vtb0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes5.dex */
public final class f implements vtb0 {
    public final eub0 a;
    public final i3y b;

    public f(eub0 eub0Var, r0c0 r0c0Var) {
        this.a = eub0Var;
        this.b = kotlin.a.a(new t9b0(7, r0c0Var));
    }

    public final kotlinx.coroutines.flow.internal.g a(tpr tprVar, SourceOnMapControl.a aVar) {
        return kotlinx.coroutines.flow.e.X(new m0(tprVar, this.a.a, new PinAlertAnimationInteractorImpl$pinStateOverrideFlow$1(this, aVar, null)), new PinAlertAnimationInteractorImpl$pinStateOverrideFlow$$inlined$flatMapLatest$1(3, null));
    }
}
