package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState;
import com.squareup.cash.reactions.api.ReactionsData;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.reactions.real.RealReactionManager$react$2;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Reaction;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonalizePaymentRecipientPresenter$models$7$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PersonalizePaymentRecipientViewEvent $event;
    public final /* synthetic */ MutableState $personalizationLoadingState$delegate;
    public final /* synthetic */ MutableState $reactionsState$delegate;
    public int label;
    public final /* synthetic */ PersonalizePaymentRecipientPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizePaymentRecipientPresenter$models$7$2(PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter, PersonalizePaymentRecipientViewEvent personalizePaymentRecipientViewEvent, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = personalizePaymentRecipientPresenter;
        this.$event = personalizePaymentRecipientViewEvent;
        this.$reactionsState$delegate = mutableState;
        this.$personalizationLoadingState$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalizePaymentRecipientPresenter$models$7$2(this.this$0, this.$event, this.$reactionsState$delegate, this.$personalizationLoadingState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalizePaymentRecipientPresenter$models$7$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        PersonalizePaymentRecipientViewEvent personalizePaymentRecipientViewEvent = this.$event;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter = this.this$0;
            RealReactionManager realReactionManager = personalizePaymentRecipientPresenter.reactionManager;
            String str = personalizePaymentRecipientPresenter.args.entity.entity_token;
            str.getClass();
            String str2 = ((PersonalizePaymentRecipientViewEvent.ReactionTapped) personalizePaymentRecipientViewEvent).reaction;
            this.label = 1;
            obj = JobKt.withContext(realReactionManager.ioDispatcher, new RealReactionManager$react$2(realReactionManager, str, str2, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        MutableState mutableState = this.$reactionsState$delegate;
        if (booleanValue) {
            mutableState.setValue(PersonalizedPaymentsReactionsState.ReactionsDisabled.INSTANCE);
            MutableState mutableState2 = this.$personalizationLoadingState$delegate;
            if (((PersonalizedPaymentLoadingState) mutableState2.getValue()) instanceof PersonalizedPaymentLoadingState.Loaded) {
                PersonalizedPaymentLoadingState personalizedPaymentLoadingState = (PersonalizedPaymentLoadingState) mutableState2.getValue();
                personalizedPaymentLoadingState.getClass();
                PersonalizedPaymentLoadingState.Loaded loaded = (PersonalizedPaymentLoadingState.Loaded) personalizedPaymentLoadingState;
                ReactionsData reactionsData = loaded.reactions;
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Reaction(null, ((PersonalizePaymentRecipientViewEvent.ReactionTapped) personalizePaymentRecipientViewEvent).reaction, 29));
                List list = reactionsData.quickReactions;
                List list2 = reactionsData.extendedReactions;
                list.getClass();
                listOf.getClass();
                ReactionsData reactionsData2 = new ReactionsData(list, listOf, list2);
                Money money = loaded.amount;
                Recipient recipient = loaded.sender;
                Background background = loaded.background;
                List list3 = loaded.elements;
                String str3 = loaded.note;
                boolean z = loaded.isCurrentCustomerSender;
                Music music = loaded.music;
                list3.getClass();
                mutableState2.setValue(new PersonalizedPaymentLoadingState.Loaded(money, recipient, background, list3, str3, z, reactionsData2, music));
            }
        } else {
            mutableState.setValue(PersonalizedPaymentsReactionsState.ReactionsAvailable.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
