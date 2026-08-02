package com.squareup.cash.bitcoin.presenters.payinusd;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.presenters.payinusd.BitcoinPayInUsdPreference;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.cryptonauts.api.SetUsdOverLNPaymentPreferenceRequest;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBitcoinPayInUsdPreferenceManager {
    public final RealBitcoinProfileRepo bitcoinProfileRepo;
    public final StateFlowImpl cachedOverride = FlowKt.MutableStateFlow(null);
    public final CryptoService cryptoService;

    public RealBitcoinPayInUsdPreferenceManager(CryptoService cryptoService, RealBitcoinProfileRepo realBitcoinProfileRepo) {
        this.cryptoService = cryptoService;
        this.bitcoinProfileRepo = realBitcoinProfileRepo;
    }

    public final Flow preference() {
        int i = 3;
        Continuation continuation = null;
        return FlowKt.distinctUntilChanged(new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new CardModelView$cardHeat$$inlined$map$1(this.bitcoinProfileRepo.getProfile(), 16), this.cachedOverride, new CardModelView.AnonymousClass1.AnonymousClass4(i, continuation, 5), 0), new SsnPresenter$models$2$2(this, continuation, 2), 3), i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
    
        if (kotlin.Unit.INSTANCE == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r2 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (kotlin.Unit.INSTANCE == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setPreference(BitcoinPayInUsdPreference bitcoinPayInUsdPreference, ContinuationImpl continuationImpl) {
        RealBitcoinPayInUsdPreferenceManager$setPreference$1 realBitcoinPayInUsdPreferenceManager$setPreference$1;
        int i;
        BitcoinPayInUsdPreference bitcoinPayInUsdPreference2 = bitcoinPayInUsdPreference;
        if (continuationImpl instanceof RealBitcoinPayInUsdPreferenceManager$setPreference$1) {
            realBitcoinPayInUsdPreferenceManager$setPreference$1 = (RealBitcoinPayInUsdPreferenceManager$setPreference$1) continuationImpl;
            int i2 = realBitcoinPayInUsdPreferenceManager$setPreference$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinPayInUsdPreferenceManager$setPreference$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinPayInUsdPreferenceManager$setPreference$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinPayInUsdPreferenceManager$setPreference$1.label;
                StateFlowImpl stateFlowImpl = this.cachedOverride;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realBitcoinPayInUsdPreferenceManager$setPreference$1.L$0 = bitcoinPayInUsdPreference2;
                    realBitcoinPayInUsdPreferenceManager$setPreference$1.label = 1;
                    stateFlowImpl.setValue(bitcoinPayInUsdPreference2);
                } else if (i == 1) {
                    bitcoinPayInUsdPreference2 = realBitcoinPayInUsdPreferenceManager$setPreference$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    if (!(((ApiResult) obj) instanceof ApiResult.Failure)) {
                        return Unit.INSTANCE;
                    }
                    realBitcoinPayInUsdPreferenceManager$setPreference$1.L$0 = null;
                    realBitcoinPayInUsdPreferenceManager$setPreference$1.label = 3;
                    stateFlowImpl.setValue(null);
                }
                RequestContext requestContext = new RequestContext(null, null, null, null, null, null, null, null, 8191);
                if (!Intrinsics.areEqual(bitcoinPayInUsdPreference2, BitcoinPayInUsdPreference.Enabled.INSTANCE)) {
                    if (!Intrinsics.areEqual(bitcoinPayInUsdPreference2, BitcoinPayInUsdPreference.Disabled.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = false;
                }
                SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest = new SetUsdOverLNPaymentPreferenceRequest(requestContext, Boolean.valueOf(z), ByteString.EMPTY);
                realBitcoinPayInUsdPreferenceManager$setPreference$1.L$0 = null;
                realBitcoinPayInUsdPreferenceManager$setPreference$1.label = 2;
                obj = this.cryptoService.setUsdOverLNPaymentPreference(setUsdOverLNPaymentPreferenceRequest, realBitcoinPayInUsdPreferenceManager$setPreference$1);
            }
        }
        realBitcoinPayInUsdPreferenceManager$setPreference$1 = new RealBitcoinPayInUsdPreferenceManager$setPreference$1(this, continuationImpl);
        Object obj2 = realBitcoinPayInUsdPreferenceManager$setPreference$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinPayInUsdPreferenceManager$setPreference$1.label;
        StateFlowImpl stateFlowImpl2 = this.cachedOverride;
        boolean z2 = true;
        if (i != 0) {
        }
        RequestContext requestContext2 = new RequestContext(null, null, null, null, null, null, null, null, 8191);
        if (!Intrinsics.areEqual(bitcoinPayInUsdPreference2, BitcoinPayInUsdPreference.Enabled.INSTANCE)) {
        }
        SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest2 = new SetUsdOverLNPaymentPreferenceRequest(requestContext2, Boolean.valueOf(z2), ByteString.EMPTY);
        realBitcoinPayInUsdPreferenceManager$setPreference$1.L$0 = null;
        realBitcoinPayInUsdPreferenceManager$setPreference$1.label = 2;
        obj2 = this.cryptoService.setUsdOverLNPaymentPreference(setUsdOverLNPaymentPreferenceRequest2, realBitcoinPayInUsdPreferenceManager$setPreference$1);
    }
}
