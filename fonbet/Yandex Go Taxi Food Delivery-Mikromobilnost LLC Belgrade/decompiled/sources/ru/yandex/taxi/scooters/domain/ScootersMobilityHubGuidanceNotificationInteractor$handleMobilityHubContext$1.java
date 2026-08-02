package ru.yandex.taxi.scooters.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersMobilityHubGuidanceNotificationInteractor", f = "ScootersMobilityHubGuidanceNotificationInteractor.kt", l = {42}, m = "handleMobilityHubContext", v = 2)
/* loaded from: classes6.dex */
final class ScootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMobilityHubGuidanceNotificationInteractor$handleMobilityHubContext$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return k.a(this.this$0, null, this);
    }
}
