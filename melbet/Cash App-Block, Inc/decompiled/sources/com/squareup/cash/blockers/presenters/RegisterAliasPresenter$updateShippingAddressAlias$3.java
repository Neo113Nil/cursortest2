package com.squareup.cash.blockers.presenters;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.common.location.Phone;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RegisterAliasPresenter$updateShippingAddressAlias$3 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $alias;
    public final /* synthetic */ AliasRegistrar$Args.DeliveryMechanism $deliveryMechanism;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BlockersScreens.RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias $type;
    public int label;
    public final /* synthetic */ RegisterAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RegisterAliasPresenter$updateShippingAddressAlias$3(RegisterAliasPresenter registerAliasPresenter, BlockersScreens.RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias setShippingAddressAlias, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = registerAliasPresenter;
        this.$type = setShippingAddressAlias;
        this.$deliveryMechanism = deliveryMechanism;
        this.$alias = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RegisterAliasPresenter$updateShippingAddressAlias$3(this.this$0, this.$type, this.$deliveryMechanism, this.$alias, continuation, 0);
            default:
                return new RegisterAliasPresenter$updateShippingAddressAlias$3(this.this$0, this.$type, this.$deliveryMechanism, this.$alias, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RegisterAliasPresenter$updateShippingAddressAlias$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int ordinal;
        Phone phone;
        switch (this.$r8$classId) {
            case 0:
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
                RegisterAliasPresenter registerAliasPresenter = this.this$0;
                Analytics analytics = registerAliasPresenter.analytics;
                BlockersData blockersData = registerAliasPresenter.args.blockersData;
                AndroidStringManager androidStringManager = registerAliasPresenter.stringManager;
                RegisterAliasPresenter$updateShippingAddressAlias$3 registerAliasPresenter$updateShippingAddressAlias$3 = new RegisterAliasPresenter$updateShippingAddressAlias$3(registerAliasPresenter, this.$type, this.$deliveryMechanism, this.$alias, null, 1);
                this.label = 1;
                Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, this, null, registerAliasPresenter$updateShippingAddressAlias$3);
                return trackBlockerSubmissionAnalytics$default == coroutineSingletons ? coroutineSingletons : trackBlockerSubmissionAnalytics$default;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShippingAddressService shippingAddressService = this.this$0.service;
                    BlockersScreens.RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias setShippingAddressAlias = this.$type;
                    String str2 = setShippingAddressAlias.profileId;
                    ShippingAddress shippingAddress = setShippingAddressAlias.shippingAddress;
                    String str3 = shippingAddress.id;
                    Action.Type.Companion companion = ShippingAddressSource.Companion;
                    FullName fullName = shippingAddress.full_name;
                    AliasRegistrar$Args.DeliveryMechanism deliveryMechanism = this.$deliveryMechanism;
                    int ordinal2 = deliveryMechanism.ordinal();
                    String str4 = this.$alias;
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            str = str4;
                            ordinal = deliveryMechanism.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    phone = shippingAddress.phone;
                                    UpdateShippingAddressRequest updateShippingAddressRequest = new UpdateShippingAddressRequest(str2, str3, new UpdateShippingAddressRequest.ShippingAddress(fullName, shippingAddress.global_address, phone, str));
                                    this.label = 1;
                                    Object updateShippingAddress = shippingAddressService.updateShippingAddress(updateShippingAddressRequest, this);
                                    return updateShippingAddress == coroutineSingletons2 ? coroutineSingletons2 : updateShippingAddress;
                                }
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                }
                            }
                            phone = new Phone(str4);
                            UpdateShippingAddressRequest updateShippingAddressRequest2 = new UpdateShippingAddressRequest(str2, str3, new UpdateShippingAddressRequest.ShippingAddress(fullName, shippingAddress.global_address, phone, str));
                            this.label = 1;
                            Object updateShippingAddress2 = shippingAddressService.updateShippingAddress(updateShippingAddressRequest2, this);
                            if (updateShippingAddress2 == coroutineSingletons2) {
                            }
                        } else if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                    }
                    str = shippingAddress.email;
                    ordinal = deliveryMechanism.ordinal();
                    if (ordinal != 0) {
                    }
                    phone = new Phone(str4);
                    UpdateShippingAddressRequest updateShippingAddressRequest22 = new UpdateShippingAddressRequest(str2, str3, new UpdateShippingAddressRequest.ShippingAddress(fullName, shippingAddress.global_address, phone, str));
                    this.label = 1;
                    Object updateShippingAddress22 = shippingAddressService.updateShippingAddress(updateShippingAddressRequest22, this);
                    if (updateShippingAddress22 == coroutineSingletons2) {
                    }
                } else {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
