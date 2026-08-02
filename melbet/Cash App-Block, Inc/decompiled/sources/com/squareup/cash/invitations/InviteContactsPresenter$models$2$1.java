package com.squareup.cash.invitations;

import android.content.ComponentName;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
import com.squareup.cash.cdf.contact.ContactInviteCompleteInvitationShare;
import com.squareup.cash.cdf.contact.ContactInviteFilterRecommendations;
import com.squareup.cash.cdf.contact.ContactInviteStart;
import com.squareup.cash.cdf.contact.ContactInviteViewPromotionUpsell;
import com.squareup.cash.cdf.contact.ContactInviteViewRecommendations;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.util.android.ShareResultsReceiver$ShareResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ InviteContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteContactsPresenter$models$2$1(InviteContactsPresenter inviteContactsPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = inviteContactsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        InviteContactsPresenter inviteContactsPresenter = this.this$0;
        switch (i) {
            case 0:
                InviteContactsPresenter$models$2$1 inviteContactsPresenter$models$2$1 = new InviteContactsPresenter$models$2$1(inviteContactsPresenter, continuation, 0);
                inviteContactsPresenter$models$2$1.L$0 = obj;
                return inviteContactsPresenter$models$2$1;
            case 1:
                InviteContactsPresenter$models$2$1 inviteContactsPresenter$models$2$12 = new InviteContactsPresenter$models$2$1(inviteContactsPresenter, continuation, 1);
                inviteContactsPresenter$models$2$12.L$0 = obj;
                return inviteContactsPresenter$models$2$12;
            default:
                InviteContactsPresenter$models$2$1 inviteContactsPresenter$models$2$13 = new InviteContactsPresenter$models$2$1(inviteContactsPresenter, continuation, 2);
                inviteContactsPresenter$models$2$13.L$0 = obj;
                return inviteContactsPresenter$models$2$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((InviteContactsPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((InviteContactsPresenter$models$2$1) create((ShareResultsReceiver$ShareResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((InviteContactsPresenter$models$2$1) create((InviteContactsViewModel.RecommendedContacts) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 1;
        int i3 = 2;
        InviteContactsPresenter inviteContactsPresenter = this.this$0;
        Continuation continuation = null;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = inviteContactsPresenter.analytics;
                ContactInviteEntryPoint contactInviteEntryPoint = inviteContactsPresenter.entryPoint;
                BlockersScreens.InviteContactsScreen inviteContactsScreen = inviteContactsPresenter.args;
                int size = inviteContactsScreen.recommendedContactsHashedAliasIds.size();
                ModifiablePermissions modifiablePermissions = inviteContactsPresenter.readContactsPermissions;
                analytics.track(new ContactInviteStart(contactInviteEntryPoint, Boolean.valueOf(modifiablePermissions.check()), new Integer(size)), null);
                if (inviteContactsScreen.inviteFriendsScreen.promotion_upsell != null) {
                    analytics.track(new ContactInviteViewPromotionUpsell(contactInviteEntryPoint, Boolean.valueOf(modifiablePermissions.check())), null);
                }
                JobKt.launch$default(coroutineScope, null, null, new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, i2), 3);
                JobKt.launch$default(coroutineScope, null, null, new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, i3), 3);
                JobKt.launch$default(coroutineScope, null, null, new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, 3), 3);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics2 = inviteContactsPresenter.analytics;
                ComponentName componentName = ((ShareResultsReceiver$ShareResult) obj2).componentName;
                String packageName = componentName != null ? componentName.getPackageName() : null;
                ContactInviteEntryPoint contactInviteEntryPoint2 = inviteContactsPresenter.entryPoint;
                analytics2.track(new ContactInviteCompleteInvitationShare(packageName, contactInviteEntryPoint2 != null ? contactInviteEntryPoint2.name() : null), null);
                break;
            default:
                InviteContactsViewModel.RecommendedContacts recommendedContacts = (InviteContactsViewModel.RecommendedContacts) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list = recommendedContacts.recommendations;
                int i4 = recommendedContacts.unmappedRecommendedIdsCount;
                int i5 = recommendedContacts.filteredRecommendedContactsCount;
                int i6 = recommendedContacts.recommendedEmailIdsCount;
                int i7 = recommendedContacts.recommendedCashCustomersIdsCount;
                int i8 = recommendedContacts.allContactsCount;
                boolean isEmpty = list.isEmpty();
                BlockersScreens.InviteContactsScreen inviteContactsScreen2 = inviteContactsPresenter.args;
                Analytics analytics3 = inviteContactsPresenter.analytics;
                if (!isEmpty) {
                    ContactInviteEntryPoint contactInviteEntryPoint3 = inviteContactsPresenter.entryPoint;
                    Integer num = new Integer(i8);
                    InviteContactsViewModel.RecommendedContact recommendedContact = (InviteContactsViewModel.RecommendedContact) CollectionsKt.getOrNull(0, list);
                    String str = recommendedContact != null ? recommendedContact.hashedAliasId : null;
                    InviteContactsViewModel.RecommendedContact recommendedContact2 = (InviteContactsViewModel.RecommendedContact) CollectionsKt.getOrNull(1, list);
                    String str2 = recommendedContact2 != null ? recommendedContact2.hashedAliasId : null;
                    InviteContactsViewModel.RecommendedContact recommendedContact3 = (InviteContactsViewModel.RecommendedContact) CollectionsKt.getOrNull(2, list);
                    analytics3.track(new ContactInviteViewRecommendations(contactInviteEntryPoint3, num, str, str2, recommendedContact3 != null ? recommendedContact3.hashedAliasId : null), null);
                    analytics3.track(new ContactInviteFilterRecommendations(inviteContactsPresenter.entryPoint, new Integer(inviteContactsScreen2.recommendedContactsHashedAliasIds.size()), new Integer(i7), new Integer(i6), new Integer(i5), new Integer(i4)), null);
                } else if (!inviteContactsScreen2.recommendedContactsHashedAliasIds.isEmpty() && i8 > 0) {
                    analytics3.track(new ContactInviteFilterRecommendations(inviteContactsPresenter.entryPoint, new Integer(inviteContactsScreen2.recommendedContactsHashedAliasIds.size()), new Integer(i7), new Integer(i6), new Integer(i5), new Integer(i4)), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
