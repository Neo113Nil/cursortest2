package com.squareup.cash.banking.real;

import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.protos.unicorn.FdicInsuranceCustomerStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealDisclosureProvider$computeMoneyTabDisclosure$1 extends SuspendLambda implements Function4 {
    public final /* synthetic */ String $defaultText;
    public /* synthetic */ FdicInsuranceCustomerStatus L$0;
    public /* synthetic */ BankingTab L$1;
    public /* synthetic */ Region L$2;
    public final /* synthetic */ RealDisclosureProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDisclosureProvider$computeMoneyTabDisclosure$1(RealDisclosureProvider realDisclosureProvider, String str, Continuation continuation) {
        super(4, continuation);
        this.this$0 = realDisclosureProvider;
        this.$defaultText = str;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RealDisclosureProvider$computeMoneyTabDisclosure$1 realDisclosureProvider$computeMoneyTabDisclosure$1 = new RealDisclosureProvider$computeMoneyTabDisclosure$1(this.this$0, this.$defaultText, (Continuation) obj4);
        realDisclosureProvider$computeMoneyTabDisclosure$1.L$0 = (FdicInsuranceCustomerStatus) obj;
        realDisclosureProvider$computeMoneyTabDisclosure$1.L$1 = (BankingTab) obj2;
        realDisclosureProvider$computeMoneyTabDisclosure$1.L$2 = (Region) obj3;
        return realDisclosureProvider$computeMoneyTabDisclosure$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BankingTab.Disclosure disclosure;
        Disclosure access$toDisclosure;
        FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus = this.L$0;
        BankingTab bankingTab = this.L$1;
        Region region = this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        RealDisclosureProvider realDisclosureProvider = this.this$0;
        RealDisclosureProvider.access$errorIfUsCustomerReceivedNullFdicSyncValue(realDisclosureProvider, region, fdicInsuranceCustomerStatus);
        return (fdicInsuranceCustomerStatus == null || (access$toDisclosure = RealDisclosureProvider.access$toDisclosure(realDisclosureProvider, fdicInsuranceCustomerStatus, DisclosureForScreen.MONEY_TAB)) == null) ? (bankingTab == null || (disclosure = bankingTab.disclosure) == null) ? new Disclosure(this.$defaultText, false) : new Disclosure(disclosure.text, false) : access$toDisclosure;
    }
}
