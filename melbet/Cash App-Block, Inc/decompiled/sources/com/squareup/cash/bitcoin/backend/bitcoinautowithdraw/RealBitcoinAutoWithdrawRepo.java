package com.squareup.cash.bitcoin.backend.bitcoinautowithdraw;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.protos.cash.btcmoongate.api.AutoWithdrawSettings;
import com.squareup.protos.cash.btcmoongate.api.UpdateAutoWithdrawSettingsRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBitcoinAutoWithdrawRepo {
    public final CryptoService cryptoService;

    public RealBitcoinAutoWithdrawRepo(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object disableAutoWithdraw(ContinuationImpl continuationImpl) {
        RealBitcoinAutoWithdrawRepo$disableAutoWithdraw$1 realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1;
        int i;
        if (continuationImpl instanceof RealBitcoinAutoWithdrawRepo$disableAutoWithdraw$1) {
            realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1 = (RealBitcoinAutoWithdrawRepo$disableAutoWithdraw$1) continuationImpl;
            int i2 = realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = Boolean.FALSE;
                    ByteString byteString = ByteString.EMPTY;
                    UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest = new UpdateAutoWithdrawSettingsRequest(new AutoWithdrawSettings(null, null, null, bool, null, byteString), byteString);
                    realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1.label = 1;
                    obj = this.cryptoService.updateAutoWithdrawSettings(updateAutoWithdrawSettingsRequest, realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(((ApiResult) obj) instanceof ApiResult.Success);
            }
        }
        realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1 = new RealBitcoinAutoWithdrawRepo$disableAutoWithdraw$1(this, continuationImpl);
        Object obj2 = realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinAutoWithdrawRepo$disableAutoWithdraw$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((ApiResult) obj2) instanceof ApiResult.Success);
    }
}
