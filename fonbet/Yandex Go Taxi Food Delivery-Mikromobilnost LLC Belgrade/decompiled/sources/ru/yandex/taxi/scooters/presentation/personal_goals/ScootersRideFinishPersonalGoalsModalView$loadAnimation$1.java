package ru.yandex.taxi.scooters.presentation.personal_goals;

import defpackage.noh;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class ScootersRideFinishPersonalGoalsModalView$loadAnimation$1 extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, defpackage.hgx
    public final Object get() {
        noh nohVar;
        nohVar = ((ScootersRideFinishPersonalGoalsModalView) this.receiver).animationDeferred;
        return nohVar;
    }

    public final void i(Object obj) {
        ((ScootersRideFinishPersonalGoalsModalView) this.receiver).animationDeferred = null;
    }
}
