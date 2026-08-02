package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.common.location.GlobalAddress;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class SetNamePresenter$createShippingAddressWithName$result$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ BlockersScreens.SetNameScreen.SetNameType.CreateShippingAddressWithName $createShippingAddressWithName;
    public final /* synthetic */ String $name;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNamePresenter$createShippingAddressWithName$result$1$1(String str, CardLockPresenter cardLockPresenter, BlockersScreens.SetNameScreen.SetNameType.CreateShippingAddressWithName createShippingAddressWithName, Continuation continuation) {
        super(1, continuation);
        this.$name = str;
        this.this$0 = cardLockPresenter;
        this.$createShippingAddressWithName = createShippingAddressWithName;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SetNamePresenter$createShippingAddressWithName$result$1$1(this.$name, this.this$0, this.$createShippingAddressWithName, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SetNamePresenter$createShippingAddressWithName$result$1$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List split$default;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        split$default = StringsKt__StringsKt.split$default(this.$name, new String[]{" "}, false, 0, 6, null);
        String str = (String) CollectionsKt.getOrNull(0, split$default);
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(split$default, 1), " ", null, null, 0, null, null, 62);
        ShippingAddressService shippingAddressService = (ShippingAddressService) this.this$0.cashAppTagManager;
        String uuid = UUID.randomUUID().toString();
        String str2 = this.$createShippingAddressWithName.profileId;
        Action.Type.Companion companion = ShippingAddressSource.Companion;
        CreateShippingAddressRequest createShippingAddressRequest = new CreateShippingAddressRequest(uuid, new CreateShippingAddressRequest.ShippingAddress(str2, new FullName(str, joinToString$default), new GlobalAddress(null, null, null, null, null, null, null, null, 4194303), null, null, 484));
        this.label = 1;
        Object createShippingAddress = shippingAddressService.createShippingAddress(createShippingAddressRequest, this);
        return createShippingAddress == coroutineSingletons ? coroutineSingletons : createShippingAddress;
    }
}
