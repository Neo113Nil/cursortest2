package com.squareup.cash.crypto.address;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.crypto.CryptoMeasureParserPerformanceRecord;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinMultiplatformAddressParser;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinMultiplatformParserPerformance;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealCryptoInvoiceParser {
    public final Analytics analytics;
    public final Instrument$Adapter bitcoinPaymentParser;
    public final FeatureFlagManager featureFlagManager;

    public RealCryptoInvoiceParser(Instrument$Adapter instrument$Adapter, FeatureFlagManager featureFlagManager, Analytics analytics) {
        this.bitcoinPaymentParser = instrument$Adapter;
        this.featureFlagManager = featureFlagManager;
        this.analytics = analytics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parse(String str, boolean z, ContinuationImpl continuationImpl) {
        RealCryptoInvoiceParser$parse$1 realCryptoInvoiceParser$parse$1;
        int i;
        boolean z2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        long j;
        BitcoinPayments bitcoinPayments;
        if (continuationImpl instanceof RealCryptoInvoiceParser$parse$1) {
            realCryptoInvoiceParser$parse$1 = (RealCryptoInvoiceParser$parse$1) continuationImpl;
            int i2 = realCryptoInvoiceParser$parse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoInvoiceParser$parse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCryptoInvoiceParser$parse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoInvoiceParser$parse$1.label;
                FeatureFlagManager featureFlagManager = this.featureFlagManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinMultiplatformParserPerformance.INSTANCE)).enabled();
                    Instrument$Adapter instrument$Adapter = this.bitcoinPaymentParser;
                    if (enabled) {
                        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                        long currentTimeMillis = System.currentTimeMillis();
                        realCryptoInvoiceParser$parse$1.L$1 = ref$ObjectRef3;
                        realCryptoInvoiceParser$parse$1.L$2 = ref$ObjectRef3;
                        realCryptoInvoiceParser$parse$1.Z$0 = z;
                        realCryptoInvoiceParser$parse$1.J$0 = currentTimeMillis;
                        realCryptoInvoiceParser$parse$1.label = 1;
                        Object parse = instrument$Adapter.parse(str, realCryptoInvoiceParser$parse$1);
                        if (parse != coroutineSingletons) {
                            z2 = z;
                            ref$ObjectRef = ref$ObjectRef3;
                            ref$ObjectRef2 = ref$ObjectRef;
                            obj = parse;
                            j = currentTimeMillis;
                            ref$ObjectRef2.element = obj;
                            long currentTimeMillis2 = System.currentTimeMillis() - j;
                            bitcoinPayments = (BitcoinPayments) ref$ObjectRef.element;
                            if (bitcoinPayments != null) {
                            }
                        }
                    } else {
                        realCryptoInvoiceParser$parse$1.Z$0 = z;
                        realCryptoInvoiceParser$parse$1.label = 2;
                        obj = instrument$Adapter.parse(str, realCryptoInvoiceParser$parse$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    j = realCryptoInvoiceParser$parse$1.J$0;
                    z2 = realCryptoInvoiceParser$parse$1.Z$0;
                    ref$ObjectRef2 = realCryptoInvoiceParser$parse$1.L$2;
                    ref$ObjectRef = realCryptoInvoiceParser$parse$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    ref$ObjectRef2.element = obj;
                    long currentTimeMillis22 = System.currentTimeMillis() - j;
                    bitcoinPayments = (BitcoinPayments) ref$ObjectRef.element;
                    if (bitcoinPayments != null) {
                        this.analytics.track(new CryptoMeasureParserPerformanceRecord(new Long(currentTimeMillis22)), null);
                    }
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = realCryptoInvoiceParser$parse$1.Z$0;
                    SafeTrace.throwOnFailure(obj);
                    bitcoinPayments = (BitcoinPayments) obj;
                    z2 = z;
                }
                if (bitcoinPayments != null) {
                    if (bitcoinPayments instanceof BitcoinPayments.Lightning) {
                        if (((BitcoinPayments.Lightning) bitcoinPayments).getInvoice() instanceof LightningInvoice.LUD16Address) {
                            if (z2) {
                                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinMultiplatformAddressParser.INSTANCE)).enabled()) {
                                }
                            }
                        }
                        return bitcoinPayments;
                    }
                    if ((bitcoinPayments instanceof BitcoinPayments.Bitcoin) || (bitcoinPayments instanceof BitcoinPayments.Ethereum) || (bitcoinPayments instanceof BitcoinPayments.Stablecoin)) {
                        return bitcoinPayments;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return null;
            }
        }
        realCryptoInvoiceParser$parse$1 = new RealCryptoInvoiceParser$parse$1(this, continuationImpl);
        Object obj2 = realCryptoInvoiceParser$parse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoInvoiceParser$parse$1.label;
        FeatureFlagManager featureFlagManager2 = this.featureFlagManager;
        if (i != 0) {
        }
        if (bitcoinPayments != null) {
        }
        return null;
    }
}
