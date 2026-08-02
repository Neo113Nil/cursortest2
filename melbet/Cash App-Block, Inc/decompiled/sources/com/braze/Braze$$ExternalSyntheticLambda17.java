package com.braze;

import com.braze.events.IEventSubscriber;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda17 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ IEventSubscriber f$0;
    public final /* synthetic */ Braze f$1;
    public final /* synthetic */ Class f$2;

    public /* synthetic */ Braze$$ExternalSyntheticLambda17(Braze braze, Class cls, IEventSubscriber iEventSubscriber) {
        this.f$1 = braze;
        this.f$2 = cls;
        this.f$0 = iEventSubscriber;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit removeSingleSubscription$lambda$1;
        Unit addSingleSynchronousSubscription$lambda$1;
        int i = this.$r8$classId;
        IEventSubscriber iEventSubscriber = this.f$0;
        Class cls = this.f$2;
        Braze braze = this.f$1;
        switch (i) {
            case 0:
                removeSingleSubscription$lambda$1 = Braze.removeSingleSubscription$lambda$1(iEventSubscriber, braze, cls);
                return removeSingleSubscription$lambda$1;
            default:
                addSingleSynchronousSubscription$lambda$1 = Braze.addSingleSynchronousSubscription$lambda$1(braze, cls, iEventSubscriber);
                return addSingleSynchronousSubscription$lambda$1;
        }
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda17(IEventSubscriber iEventSubscriber, Braze braze, Class cls) {
        this.f$0 = iEventSubscriber;
        this.f$1 = braze;
        this.f$2 = cls;
    }
}
