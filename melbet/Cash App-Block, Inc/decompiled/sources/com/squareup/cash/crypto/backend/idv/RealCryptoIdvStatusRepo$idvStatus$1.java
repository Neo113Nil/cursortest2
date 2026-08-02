package com.squareup.cash.crypto.backend.idv;

import com.squareup.cash.crypto.backend.eligibility.BitcoinEligibilityStatus;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.marketcapabilities.MarketCapabilityAvailability;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealCryptoIdvStatusRepo$idvStatus$1 extends AdaptedFunctionReference implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;

    public RealCryptoIdvStatusRepo$idvStatus$1(RealStablecoinCapabilityHelper realStablecoinCapabilityHelper) {
        super(3, 4, RealStablecoinCapabilityHelper.class, realStablecoinCapabilityHelper, "isStablecoinCapabilityAvailable", "isStablecoinCapabilityAvailable(Lcom/squareup/cash/featureflags/FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;Lcom/squareup/cash/marketcapabilities/MarketCapabilityAvailability;)Z");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r3.isAvailable() == true) goto L11;
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                BitcoinEligibilityStatus bitcoinEligibilityStatus = (BitcoinEligibilityStatus) obj;
                BitcoinEligibilityStatus bitcoinEligibilityStatus2 = (BitcoinEligibilityStatus) obj2;
                ((RealCryptoIdvStatusRepo) this.receiver).getClass();
                BitcoinEligibilityStatus bitcoinEligibilityStatus3 = BitcoinEligibilityStatus.ELIGIBLE;
                if (bitcoinEligibilityStatus == bitcoinEligibilityStatus3 && bitcoinEligibilityStatus2 == bitcoinEligibilityStatus3) {
                    return CryptoIdvStatus.VERIFIED;
                }
                BitcoinEligibilityStatus bitcoinEligibilityStatus4 = BitcoinEligibilityStatus.PENDING_APPROVAL;
                if (bitcoinEligibilityStatus == bitcoinEligibilityStatus4 || bitcoinEligibilityStatus2 == bitcoinEligibilityStatus4) {
                    return CryptoIdvStatus.PENDING;
                }
                BitcoinEligibilityStatus bitcoinEligibilityStatus5 = BitcoinEligibilityStatus.CAN_BE_ELIGIBLE;
                if (bitcoinEligibilityStatus == bitcoinEligibilityStatus5 || bitcoinEligibilityStatus2 == bitcoinEligibilityStatus5) {
                    return CryptoIdvStatus.NOT_VERIFIED;
                }
                BitcoinEligibilityStatus bitcoinEligibilityStatus6 = BitcoinEligibilityStatus.INELIGIBLE;
                return (bitcoinEligibilityStatus == bitcoinEligibilityStatus6 || bitcoinEligibilityStatus2 == bitcoinEligibilityStatus6) ? CryptoIdvStatus.DISALLOWED : CryptoIdvStatus.NOT_VERIFIED;
            default:
                MarketCapabilityAvailability marketCapabilityAvailability = (MarketCapabilityAvailability) obj2;
                ((RealStablecoinCapabilityHelper) this.receiver).getClass();
                if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) obj).enabled() && marketCapabilityAvailability != null) {
                    z = true;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ RealCryptoIdvStatusRepo$idvStatus$1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(i, i2, cls, obj, str, str2);
    }
}
