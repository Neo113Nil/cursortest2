package com.squareup.cash.onboarding.check.checkers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TabIntegrityCheck implements IntegrityCheck {
    public final /* synthetic */ int $r8$classId;
    public final Object tabPublisher;

    /* renamed from: type, reason: collision with root package name */
    public final IntegrityCheckFactory$Type f1179type;

    public TabIntegrityCheck(RealMarketCapabilitiesManager realMarketCapabilitiesManager) {
        this.$r8$classId = 1;
        this.tabPublisher = realMarketCapabilitiesManager;
        this.f1179type = IntegrityCheckFactory$Type.MARKET_CAPABILITIES;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    @Override // com.squareup.cash.onboarding.check.IntegrityCheck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object check(ContinuationImpl continuationImpl) {
        TabIntegrityCheck$check$1 tabIntegrityCheck$check$1;
        int i;
        MarketCapabilitiesIntegrityCheck$check$1 marketCapabilitiesIntegrityCheck$check$1;
        int i2;
        int i3 = this.$r8$classId;
        Object obj = this.tabPublisher;
        switch (i3) {
            case 0:
                if (continuationImpl instanceof TabIntegrityCheck$check$1) {
                    tabIntegrityCheck$check$1 = (TabIntegrityCheck$check$1) continuationImpl;
                    int i4 = tabIntegrityCheck$check$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        tabIntegrityCheck$check$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = tabIntegrityCheck$check$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = tabIntegrityCheck$check$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(((RealTabPublisher) obj)._state, 18);
                            tabIntegrityCheck$check$1.L$0 = this;
                            tabIntegrityCheck$check$1.label = 1;
                            obj2 = FlowKt.firstOrNull(moneyTabPresenter$models$lambda$31$$inlined$map$1, tabIntegrityCheck$check$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = tabIntegrityCheck$check$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return obj2 == null ? new IntegrityChecker$Result.Success(this) : new IntegrityChecker$Result.Failure(this);
                    }
                }
                tabIntegrityCheck$check$1 = new TabIntegrityCheck$check$1(this, continuationImpl);
                Object obj22 = tabIntegrityCheck$check$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tabIntegrityCheck$check$1.label;
                if (i != 0) {
                }
                if (obj22 == null) {
                }
            default:
                if (continuationImpl instanceof MarketCapabilitiesIntegrityCheck$check$1) {
                    marketCapabilitiesIntegrityCheck$check$1 = (MarketCapabilitiesIntegrityCheck$check$1) continuationImpl;
                    int i5 = marketCapabilitiesIntegrityCheck$check$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        marketCapabilitiesIntegrityCheck$check$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = marketCapabilitiesIntegrityCheck$check$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = marketCapabilitiesIntegrityCheck$check$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            marketCapabilitiesIntegrityCheck$check$1.L$0 = this;
                            marketCapabilitiesIntegrityCheck$check$1.label = 1;
                            obj3 = ((RealMarketCapabilitiesManager) obj).ready(marketCapabilitiesIntegrityCheck$check$1);
                            if (obj3 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = marketCapabilitiesIntegrityCheck$check$1.L$0;
                            SafeTrace.throwOnFailure(obj3);
                        }
                        return !((Boolean) obj3).booleanValue() ? new IntegrityChecker$Result.Success(this) : new IntegrityChecker$Result.Failure(this);
                    }
                }
                marketCapabilitiesIntegrityCheck$check$1 = new MarketCapabilitiesIntegrityCheck$check$1(this, continuationImpl);
                Object obj32 = marketCapabilitiesIntegrityCheck$check$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = marketCapabilitiesIntegrityCheck$check$1.label;
                if (i2 != 0) {
                }
                if (!((Boolean) obj32).booleanValue()) {
                }
        }
    }

    @Override // com.squareup.cash.onboarding.check.IntegrityCheck
    public final IntegrityCheckFactory$Type getType() {
        switch (this.$r8$classId) {
        }
        return this.f1179type;
    }

    public TabIntegrityCheck(RealTabPublisher realTabPublisher) {
        this.$r8$classId = 0;
        this.tabPublisher = realTabPublisher;
        this.f1179type = IntegrityCheckFactory$Type.TABS;
    }
}
