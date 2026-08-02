package com.squareup.cash.profile.repo.real;

import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.CustomerProfileQueries$localContactProfile$2;
import com.squareup.cash.profile.screens.ProfileScreens;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealProfileRepo$customerData$profile$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProfileScreens.ProfileScreen.Customer $customer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealProfileRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealProfileRepo$customerData$profile$1(RealProfileRepo realProfileRepo, ProfileScreens.ProfileScreen.Customer customer, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realProfileRepo;
        this.$customer = customer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ProfileScreens.ProfileScreen.Customer customer = this.$customer;
        RealProfileRepo realProfileRepo = this.this$0;
        switch (i) {
            case 0:
                return new RealProfileRepo$customerData$profile$1(realProfileRepo, customer, continuation, 0);
            default:
                return new RealProfileRepo$customerData$profile$1(realProfileRepo, customer, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealProfileRepo$customerData$profile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ProfileScreens.ProfileScreen.Customer customer = this.$customer;
        RealProfileRepo realProfileRepo = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ContactQueries contactQueries = realProfileRepo.customerProfileQueries;
                ProfileScreens.ProfileScreen.Customer.NonCashCustomer nonCashCustomer = (ProfileScreens.ProfileScreen.Customer.NonCashCustomer) customer;
                String str = (String) nonCashCustomer.getAlias().getValue();
                String lookupKey = nonCashCustomer.getLookupKey();
                contactQueries.getClass();
                CustomerProfileQueries$localContactProfile$2 customerProfileQueries$localContactProfile$2 = CustomerProfileQueries$localContactProfile$2.INSTANCE;
                return new BadgeQueries$VersionQuery(contactQueries, str, lookupKey, new OfflineQueries$$ExternalSyntheticLambda1(), 7).executeAsOneOrNull();
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ContactQueries contactQueries2 = realProfileRepo.customerProfileQueries;
                ProfileScreens.ProfileScreen.Customer.NonCashCustomer nonCashCustomer2 = (ProfileScreens.ProfileScreen.Customer.NonCashCustomer) customer;
                String str2 = (String) nonCashCustomer2.getAlias().getValue();
                String lookupKey2 = nonCashCustomer2.getLookupKey();
                contactQueries2.getClass();
                CustomerProfileQueries$localContactProfile$2 customerProfileQueries$localContactProfile$22 = CustomerProfileQueries$localContactProfile$2.INSTANCE;
                return new BadgeQueries$VersionQuery(contactQueries2, str2, lookupKey2, new OfflineQueries$$ExternalSyntheticLambda1(), 7).executeAsOneOrNull();
        }
    }
}
