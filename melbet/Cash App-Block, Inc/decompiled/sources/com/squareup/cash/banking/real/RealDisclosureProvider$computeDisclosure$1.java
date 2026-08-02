package com.squareup.cash.banking.real;

import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.unicorn.FdicInsuranceCustomerStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealDisclosureProvider$computeDisclosure$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ String $defaultText;
    public final /* synthetic */ DisclosureForScreen $screen;
    public /* synthetic */ FdicInsuranceCustomerStatus L$0;
    public /* synthetic */ Region L$1;
    public final /* synthetic */ RealDisclosureProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDisclosureProvider$computeDisclosure$1(RealDisclosureProvider realDisclosureProvider, DisclosureForScreen disclosureForScreen, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = realDisclosureProvider;
        this.$screen = disclosureForScreen;
        this.$defaultText = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DisclosureForScreen disclosureForScreen = this.$screen;
        String str = this.$defaultText;
        RealDisclosureProvider$computeDisclosure$1 realDisclosureProvider$computeDisclosure$1 = new RealDisclosureProvider$computeDisclosure$1(this.this$0, disclosureForScreen, str, (Continuation) obj3);
        realDisclosureProvider$computeDisclosure$1.L$0 = (FdicInsuranceCustomerStatus) obj;
        realDisclosureProvider$computeDisclosure$1.L$1 = (Region) obj2;
        return realDisclosureProvider$computeDisclosure$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Disclosure access$toDisclosure;
        FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus = this.L$0;
        Region region = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        RealDisclosureProvider realDisclosureProvider = this.this$0;
        RealDisclosureProvider.access$errorIfUsCustomerReceivedNullFdicSyncValue(realDisclosureProvider, region, fdicInsuranceCustomerStatus);
        if (fdicInsuranceCustomerStatus != null && (access$toDisclosure = RealDisclosureProvider.access$toDisclosure(realDisclosureProvider, fdicInsuranceCustomerStatus, this.$screen)) != null) {
            return access$toDisclosure;
        }
        String str = this.$defaultText;
        if (str != null) {
            return new Disclosure(str, false);
        }
        return null;
    }
}
