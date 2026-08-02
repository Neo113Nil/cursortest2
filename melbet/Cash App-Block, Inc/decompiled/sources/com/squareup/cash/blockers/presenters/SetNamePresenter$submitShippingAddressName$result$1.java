package com.squareup.cash.blockers.presenters;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class SetNamePresenter$submitShippingAddressName$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $name;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ BlockersScreens.SetNameScreen.SetNameType.SetShippingAddressName $setShippingAddressName;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNamePresenter$submitShippingAddressName$result$1(CardLockPresenter cardLockPresenter, String str, BlockersScreens.SetNameScreen.SetNameType.SetShippingAddressName setShippingAddressName, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cardLockPresenter;
        this.$name = str;
        this.$setShippingAddressName = setShippingAddressName;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        BlockersScreens.SetNameScreen.SetNameType.SetShippingAddressName setShippingAddressName = this.$setShippingAddressName;
        CardLockPresenter cardLockPresenter = this.this$0;
        String str = this.$name;
        switch (i) {
            case 0:
                return new SetNamePresenter$submitShippingAddressName$result$1(cardLockPresenter, str, setShippingAddressName, continuation);
            default:
                return new SetNamePresenter$submitShippingAddressName$result$1(str, cardLockPresenter, setShippingAddressName, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((SetNamePresenter$submitShippingAddressName$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List split$default;
        int i = this.$r8$classId;
        CardLockPresenter cardLockPresenter = this.this$0;
        String str = this.$name;
        BlockersScreens.SetNameScreen.SetNameType.SetShippingAddressName setShippingAddressName = this.$setShippingAddressName;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = (Analytics) cardLockPresenter.analytics;
                BlockersData blockersData = ((BlockersScreens.SetNameScreen) cardLockPresenter.args).blockersData;
                AndroidStringManager androidStringManager = (AndroidStringManager) cardLockPresenter.stringManager;
                SetNamePresenter$submitShippingAddressName$result$1 setNamePresenter$submitShippingAddressName$result$1 = new SetNamePresenter$submitShippingAddressName$result$1(str, cardLockPresenter, setShippingAddressName, (Continuation) null);
                this.label = 1;
                Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, this, null, setNamePresenter$submitShippingAddressName$result$1);
                return trackBlockerSubmissionAnalytics$default == coroutineSingletons ? coroutineSingletons : trackBlockerSubmissionAnalytics$default;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                split$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
                String str2 = (String) CollectionsKt.getOrNull(0, split$default);
                String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(split$default, 1), " ", null, null, 0, null, null, 62);
                ShippingAddressService shippingAddressService = (ShippingAddressService) cardLockPresenter.cashAppTagManager;
                String str3 = setShippingAddressName.profileId;
                ShippingAddress shippingAddress = setShippingAddressName.shippingAddress;
                String str4 = shippingAddress.id;
                Action.Type.Companion companion = ShippingAddressSource.Companion;
                UpdateShippingAddressRequest updateShippingAddressRequest = new UpdateShippingAddressRequest(str3, str4, new UpdateShippingAddressRequest.ShippingAddress(new FullName(str2, joinToString$default), shippingAddress.global_address, shippingAddress.phone, shippingAddress.email));
                this.label = 1;
                Object updateShippingAddress = shippingAddressService.updateShippingAddress(updateShippingAddressRequest, this);
                return updateShippingAddress == coroutineSingletons2 ? coroutineSingletons2 : updateShippingAddress;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNamePresenter$submitShippingAddressName$result$1(String str, CardLockPresenter cardLockPresenter, BlockersScreens.SetNameScreen.SetNameType.SetShippingAddressName setShippingAddressName, Continuation continuation) {
        super(1, continuation);
        this.$name = str;
        this.this$0 = cardLockPresenter;
        this.$setShippingAddressName = setShippingAddressName;
    }
}
