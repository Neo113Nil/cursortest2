package com.squareup.cash.google.pay;

import android.app.Activity;
import androidx.datastore.core.DataStoreImpl$data$1;
import com.google.android.filament.Box;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.internal.tapandpay.zzag;
import com.google.android.gms.tapandpay.issuer.PushTokenizeCallbacks;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.squareup.cash.R;
import com.squareup.cash.google.pay.GooglePayProvisioningPayload;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.protos.franklin.common.StatusResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class GooglePayPresenter$models$1$1$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GooglePayPresenter this$0;

    public /* synthetic */ GooglePayPresenter$models$1$1$1$1(GooglePayPresenter googlePayPresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = googlePayPresenter;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        GooglePayPresenter googlePayPresenter = this.this$0;
        switch (i) {
            case 0:
                GooglePayProvisioningPayload googlePayProvisioningPayload = (GooglePayProvisioningPayload) obj;
                if (!(googlePayProvisioningPayload instanceof GooglePayProvisioningPayload.Success)) {
                    if (!(googlePayProvisioningPayload instanceof GooglePayProvisioningPayload.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Failed to provision digital wallet token.", new Object[0]);
                    googlePayPresenter.navigator.goTo(googlePayPresenter.statusResultScreen(R.string.google_pay_default_error_message, StatusResult.Icon.FAILURE));
                    return Unit.INSTANCE;
                }
                Timber.Forest.d("Received Google Pay opaque payment card from server.", new Object[0]);
                RealGooglePayer realGooglePayer = googlePayPresenter.googlePayer;
                GooglePayProvisioningPayload.Success success = (GooglePayProvisioningPayload.Success) googlePayProvisioningPayload;
                byte[] bytes = success.opaquePaymentCard.getBytes(Charsets.UTF_8);
                bytes.getClass();
                String str = success.lastFour;
                str.getClass();
                int i2 = PushTokenizeCallbacks.$r8$clinit;
                PushTokenizeRequest pushTokenizeRequest = new PushTokenizeRequest(4, 4, bytes, str, "Cash App Card", null, false, new int[0], null);
                zzag apiClient = realGooglePayer.getApiClient();
                Activity activity = realGooglePayer.activity;
                apiClient.getClass();
                zacn builder = zacn.builder();
                builder.zaa = new Box(19, pushTokenizeRequest, activity);
                builder.zac = 2106;
                apiClient.zae(0, builder.build());
                Object collect = realGooglePayer.activityResults.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(new GooglePayPresenter$models$1$1$1$1(googlePayPresenter, 1), realGooglePayer), new DataStoreImpl$data$1.AnonymousClass2(2, null, 24), 1), 25), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (collect != coroutineSingletons) {
                    collect = Unit.INSTANCE;
                }
                if (collect != coroutineSingletons) {
                    collect = Unit.INSTANCE;
                }
                if (collect != coroutineSingletons) {
                    collect = Unit.INSTANCE;
                }
                Object obj2 = collect;
                return obj2 == coroutineSingletons ? obj2 : Unit.INSTANCE;
            default:
                Object completeProvisioning = googlePayPresenter.completeProvisioning(((GooglePayer$GooglePayEvent$ProvisionResult) obj).result, continuation);
                return completeProvisioning == CoroutineSingletons.COROUTINE_SUSPENDED ? completeProvisioning : Unit.INSTANCE;
        }
    }
}
