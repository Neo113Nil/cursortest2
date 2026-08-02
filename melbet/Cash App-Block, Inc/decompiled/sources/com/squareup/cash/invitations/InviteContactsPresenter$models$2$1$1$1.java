package com.squareup.cash.invitations;

import androidx.lifecycle.Lifecycle;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$models$2$1$1$1 implements FlowCollector {
    public final /* synthetic */ InviteContactsPresenter this$0;

    public InviteContactsPresenter$models$2$1$1$1(InviteContactsPresenter inviteContactsPresenter) {
        this.this$0 = inviteContactsPresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Lifecycle.State state, Continuation continuation) {
        InviteContactsPresenter$models$2$1$1$1$emit$1 inviteContactsPresenter$models$2$1$1$1$emit$1;
        int i;
        StateFlowImpl stateFlowImpl = this.this$0.invitationSuccessToastViewModelState;
        if (continuation instanceof InviteContactsPresenter$models$2$1$1$1$emit$1) {
            inviteContactsPresenter$models$2$1$1$1$emit$1 = (InviteContactsPresenter$models$2$1$1$1$emit$1) continuation;
            int i2 = inviteContactsPresenter$models$2$1$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inviteContactsPresenter$models$2$1$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inviteContactsPresenter$models$2$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteContactsPresenter$models$2$1$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z = ((Versioned) stateFlowImpl.getValue()).value != null;
                    InvitationSuccessToastViewModel invitationSuccessToastViewModel = (InvitationSuccessToastViewModel) ((Versioned) stateFlowImpl.getValue()).value;
                    boolean z2 = invitationSuccessToastViewModel != null ? invitationSuccessToastViewModel.delayPresentation : false;
                    if (z && z2 && state == Lifecycle.State.RESUMED) {
                        Versioned versioned = (Versioned) stateFlowImpl.getValue();
                        Object obj2 = versioned.value;
                        obj2.getClass();
                        Versioned update = VersionedKt.update(versioned, InvitationSuccessToastViewModel.copy$default((InvitationSuccessToastViewModel) obj2, 7));
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, update);
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                        inviteContactsPresenter$models$2$1$1$1$emit$1.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration, inviteContactsPresenter$models$2$1$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Versioned versioned2 = (Versioned) stateFlowImpl.getValue();
                Object obj3 = versioned2.value;
                obj3.getClass();
                Versioned update2 = VersionedKt.update(versioned2, InvitationSuccessToastViewModel.copy$default((InvitationSuccessToastViewModel) obj3, 11));
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, update2);
                return Unit.INSTANCE;
            }
        }
        inviteContactsPresenter$models$2$1$1$1$emit$1 = new InviteContactsPresenter$models$2$1$1$1$emit$1(this, continuation);
        Object obj4 = inviteContactsPresenter$models$2$1$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteContactsPresenter$models$2$1$1$1$emit$1.label;
        if (i != 0) {
        }
        Versioned versioned22 = (Versioned) stateFlowImpl.getValue();
        Object obj32 = versioned22.value;
        obj32.getClass();
        Versioned update22 = VersionedKt.update(versioned22, InvitationSuccessToastViewModel.copy$default((InvitationSuccessToastViewModel) obj32, 11));
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, update22);
        return Unit.INSTANCE;
    }
}
