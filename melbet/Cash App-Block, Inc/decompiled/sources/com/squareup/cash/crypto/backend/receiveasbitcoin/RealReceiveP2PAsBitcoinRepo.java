package com.squareup.cash.crypto.backend.receiveasbitcoin;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Request;
import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Response;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealReceiveP2PAsBitcoinRepo {
    public final CryptoService cryptoService;
    public final RealGooglePayer$createWallet$$inlined$filter$1 state;

    public RealReceiveP2PAsBitcoinRepo(SyncValueReader syncValueReader, CryptoService cryptoService) {
        this.cryptoService = cryptoService;
        this.state = new RealGooglePayer$createWallet$$inlined$filter$1(syncValueReader.getSingleValue(AndroidSyncValueSpecs.BtcP2pConversionBps), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pauseConversions(ContinuationImpl continuationImpl) {
        RealReceiveP2PAsBitcoinRepo$pauseConversions$1 realReceiveP2PAsBitcoinRepo$pauseConversions$1;
        int i;
        if (continuationImpl instanceof RealReceiveP2PAsBitcoinRepo$pauseConversions$1) {
            realReceiveP2PAsBitcoinRepo$pauseConversions$1 = (RealReceiveP2PAsBitcoinRepo$pauseConversions$1) continuationImpl;
            int i2 = realReceiveP2PAsBitcoinRepo$pauseConversions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realReceiveP2PAsBitcoinRepo$pauseConversions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realReceiveP2PAsBitcoinRepo$pauseConversions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realReceiveP2PAsBitcoinRepo$pauseConversions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SetBtcP2pConversionBpsV2Request setBtcP2pConversionBpsV2Request = new SetBtcP2pConversionBpsV2Request(new Long(0L), ByteString.EMPTY);
                    realReceiveP2PAsBitcoinRepo$pauseConversions$1.label = 1;
                    obj = this.cryptoService.setBtcP2pConversionBps(setBtcP2pConversionBpsV2Request, realReceiveP2PAsBitcoinRepo$pauseConversions$1);
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
                ApiResult apiResult = (ApiResult) obj;
                return Boolean.valueOf(!(apiResult instanceof ApiResult.Success) && ((SetBtcP2pConversionBpsV2Response) ((ApiResult.Success) apiResult).response).status == SetBtcP2pConversionBpsV2Response.Status.SUCCESS);
            }
        }
        realReceiveP2PAsBitcoinRepo$pauseConversions$1 = new RealReceiveP2PAsBitcoinRepo$pauseConversions$1(this, continuationImpl);
        Object obj2 = realReceiveP2PAsBitcoinRepo$pauseConversions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realReceiveP2PAsBitcoinRepo$pauseConversions$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        return Boolean.valueOf(!(apiResult2 instanceof ApiResult.Success) && ((SetBtcP2pConversionBpsV2Response) ((ApiResult.Success) apiResult2).response).status == SetBtcP2pConversionBpsV2Response.Status.SUCCESS);
    }
}
