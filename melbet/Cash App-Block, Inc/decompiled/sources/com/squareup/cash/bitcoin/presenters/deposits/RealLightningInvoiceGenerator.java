package com.squareup.cash.bitcoin.presenters.deposits;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.protos.cash.cashliteflow.api.v1.CashLiteFlowClientService;
import com.squareup.protos.cash.cashliteflow.api.v1.GenerateLightningInvoiceRequest;
import com.squareup.protos.cash.cashliteflow.api.v1.GenerateLightningInvoiceResponse;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Request;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Response;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealLightningInvoiceGenerator {
    public final /* synthetic */ int $r8$classId;
    public final Object cryptoService;

    public /* synthetic */ RealLightningInvoiceGenerator(Object obj, int i) {
        this.$r8$classId = i;
        this.cryptoService = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateLightningInvoice(GenerateLightningInvoice$Request generateLightningInvoice$Request, ContinuationImpl continuationImpl) {
        CashLiteLightningInvoiceGenerator$generateLightningInvoice$1 cashLiteLightningInvoiceGenerator$generateLightningInvoice$1;
        int i;
        ApiResult apiResult;
        int i2 = this.$r8$classId;
        Object obj = this.cryptoService;
        switch (i2) {
            case 0:
                return ((CryptoService) obj).generateLightningInvoice(generateLightningInvoice$Request, continuationImpl);
            default:
                if (continuationImpl instanceof CashLiteLightningInvoiceGenerator$generateLightningInvoice$1) {
                    cashLiteLightningInvoiceGenerator$generateLightningInvoice$1 = (CashLiteLightningInvoiceGenerator$generateLightningInvoice$1) continuationImpl;
                    int i3 = cashLiteLightningInvoiceGenerator$generateLightningInvoice$1.label;
                    if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                        cashLiteLightningInvoiceGenerator$generateLightningInvoice$1.label = i3 - PKIFailureInfo.systemUnavail;
                        Object obj2 = cashLiteLightningInvoiceGenerator$generateLightningInvoice$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = cashLiteLightningInvoiceGenerator$generateLightningInvoice$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            GenerateLightningInvoiceRequest generateLightningInvoiceRequest = new GenerateLightningInvoiceRequest(generateLightningInvoice$Request.amount, generateLightningInvoice$Request.description, ByteString.EMPTY);
                            cashLiteLightningInvoiceGenerator$generateLightningInvoice$1.label = 1;
                            obj2 = ((CashLiteFlowClientService) obj).generateLightningInvoice(generateLightningInvoiceRequest, cashLiteLightningInvoiceGenerator$generateLightningInvoice$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        apiResult = (ApiResult) obj2;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            GenerateLightningInvoiceResponse generateLightningInvoiceResponse = (GenerateLightningInvoiceResponse) ((ApiResult.Success) apiResult).response;
                            return new ApiResult.Success(new GenerateLightningInvoice$Response(generateLightningInvoiceResponse.payment_request, generateLightningInvoiceResponse.unified_address, generateLightningInvoiceResponse.deposit_address, generateLightningInvoiceResponse.fiat_amount, generateLightningInvoiceResponse.qr_code_url, generateLightningInvoiceResponse.share_url, ByteString.EMPTY));
                        }
                        if (apiResult instanceof ApiResult.Failure) {
                            return apiResult;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                cashLiteLightningInvoiceGenerator$generateLightningInvoice$1 = new CashLiteLightningInvoiceGenerator$generateLightningInvoice$1(this, continuationImpl);
                Object obj22 = cashLiteLightningInvoiceGenerator$generateLightningInvoice$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashLiteLightningInvoiceGenerator$generateLightningInvoice$1.label;
                if (i != 0) {
                }
                apiResult = (ApiResult) obj22;
                if (!(apiResult instanceof ApiResult.Success)) {
                }
        }
    }
}
