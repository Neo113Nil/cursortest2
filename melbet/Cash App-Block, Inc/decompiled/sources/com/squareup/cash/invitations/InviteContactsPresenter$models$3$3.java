package com.squareup.cash.invitations;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$models$3$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InviteContactsViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ InviteContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteContactsPresenter$models$3$3(InviteContactsPresenter inviteContactsPresenter, InviteContactsViewEvent inviteContactsViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = inviteContactsPresenter;
        this.$event = inviteContactsViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        InviteContactsViewEvent inviteContactsViewEvent = this.$event;
        InviteContactsPresenter inviteContactsPresenter = this.this$0;
        switch (i) {
            case 0:
                return new InviteContactsPresenter$models$3$3(inviteContactsPresenter, inviteContactsViewEvent, continuation, 0);
            default:
                return new InviteContactsPresenter$models$3$3(inviteContactsPresenter, inviteContactsViewEvent, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InviteContactsPresenter$models$3$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        InviteContactsViewEvent inviteContactsViewEvent = this.$event;
        InviteContactsPresenter inviteContactsPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InviteContactsViewEvent.ConsentAccepted consentAccepted = (InviteContactsViewEvent.ConsentAccepted) inviteContactsViewEvent;
                    List list = consentAccepted.alias.value;
                    InviteContactsViewEvent.SendInvite.ContactSection contactSection = consentAccepted.section;
                    this.label = 1;
                    if (InviteContactsPresenter.access$sendInvite(inviteContactsPresenter, list, contactSection, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InviteContactsViewEvent.SendInvite sendInvite = (InviteContactsViewEvent.SendInvite) inviteContactsViewEvent;
                    List list2 = sendInvite.alias;
                    InviteContactsViewEvent.SendInvite.ContactSection contactSection2 = sendInvite.section;
                    this.label = 1;
                    if (InviteContactsPresenter.access$sendInvite(inviteContactsPresenter, list2, contactSection2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
