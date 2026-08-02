package ru.yandex.taxi.scooters.presentation.personal_goals;

import defpackage.l8x;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class ScootersRideFinishPersonalGoalsModalView$startAnimation$1 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, defpackage.hgx
    public final Object get() {
        l8x l8xVar;
        l8xVar = ((ScootersRideFinishPersonalGoalsModalView) this.receiver).animationJob;
        return l8xVar;
    }

    public final void i(Object obj) {
        ((ScootersRideFinishPersonalGoalsModalView) this.receiver).animationJob = null;
    }
}
