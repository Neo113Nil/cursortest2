package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RegisterAliasPresenter$createShippingAddressWithAlias$3$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $alias;
    public final /* synthetic */ AliasRegistrar$Args.DeliveryMechanism $deliveryMechanism;
    public final /* synthetic */ BlockersScreens.RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias $type;
    public int label;
    public final /* synthetic */ RegisterAliasPresenter this$0;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AliasRegistrar$Args.DeliveryMechanism.values().length];
            try {
                AliasRegistrar$Args.DeliveryMechanism deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.SMS;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterAliasPresenter$createShippingAddressWithAlias$3$1(RegisterAliasPresenter registerAliasPresenter, BlockersScreens.RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias createShippingAddressWithAlias, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = registerAliasPresenter;
        this.$type = createShippingAddressWithAlias;
        this.$deliveryMechanism = deliveryMechanism;
        this.$alias = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RegisterAliasPresenter$createShippingAddressWithAlias$3$1(this.this$0, this.$type, this.$deliveryMechanism, this.$alias, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RegisterAliasPresenter$createShippingAddressWithAlias$3$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        ShippingAddressService shippingAddressService = this.this$0.service;
        String uuid = UUID.randomUUID().toString();
        String str = this.$type.profileId;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        AliasRegistrar$Args.DeliveryMechanism deliveryMechanism = this.$deliveryMechanism;
        int i2 = iArr[deliveryMechanism.ordinal()];
        String str2 = this.$alias;
        String str3 = i2 == 1 ? str2 : null;
        Phone phone = iArr[deliveryMechanism.ordinal()] != 1 ? new Phone(str2) : null;
        Action.Type.Companion companion = ShippingAddressSource.Companion;
        CreateShippingAddressRequest createShippingAddressRequest = new CreateShippingAddressRequest(uuid, new CreateShippingAddressRequest.ShippingAddress(str, new FullName("", ""), new GlobalAddress(null, null, null, null, null, null, null, null, 4194303), phone, str3, 388));
        this.label = 1;
        Object createShippingAddress = shippingAddressService.createShippingAddress(createShippingAddressRequest, this);
        return createShippingAddress == coroutineSingletons ? coroutineSingletons : createShippingAddress;
    }
}
