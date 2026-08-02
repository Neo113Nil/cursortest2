package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.investing.backend.api.PolledData;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final /* synthetic */ class PasscodePresenter$models$verifyPasscodeModel$2$1$2$1 implements FlowCollector, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProducerScope $tmp0;

    public /* synthetic */ PasscodePresenter$models$verifyPasscodeModel$2$1$2$1(ProducerScope producerScope, int i) {
        this.$r8$classId = i;
        this.$tmp0 = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ProducerScope producerScope = this.$tmp0;
        switch (i) {
            case 0:
                Object send = ((ProducerCoroutine) producerScope)._channel.send((PasscodeViewModel.VerifyPasscodeModel) obj, continuation);
                if (send != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object send2 = ((ProducerCoroutine) producerScope)._channel.send((PolledData) obj, continuation);
                if (send2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.$r8$classId) {
        }
        return new FunctionReferenceImpl(2, 0, ProducerScope.class, this.$tmp0, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }
}
