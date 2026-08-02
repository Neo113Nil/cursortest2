package app.cash.local.backend;

import app.cash.badging.api.Badger2;
import app.cash.badging.backend.RealBadger2;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.primitives.MarketingMessageBadging;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ClearMarketingBadgesIfNeeded {
    public final Badger2 badger2;
    public final RealMarketingMessageRepository marketingMessageRepository;

    public ClearMarketingBadgesIfNeeded(RealMarketingMessageRepository realMarketingMessageRepository, Badger2 badger2) {
        this.marketingMessageRepository = realMarketingMessageRepository;
        this.badger2 = badger2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(ContinuationImpl continuationImpl) {
        ClearMarketingBadgesIfNeeded$invoke$1 clearMarketingBadgesIfNeeded$invoke$1;
        int i;
        int sumOfInt;
        boolean z;
        int i2;
        Object obj;
        if (continuationImpl instanceof ClearMarketingBadgesIfNeeded$invoke$1) {
            clearMarketingBadgesIfNeeded$invoke$1 = (ClearMarketingBadgesIfNeeded$invoke$1) continuationImpl;
            int i3 = clearMarketingBadgesIfNeeded$invoke$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                clearMarketingBadgesIfNeeded$invoke$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = clearMarketingBadgesIfNeeded$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clearMarketingBadgesIfNeeded$invoke$1.label;
                Badger2 badger2 = this.badger2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ArrayList arrayList = MarketingMessageBadging.GROUP_NAMES;
                    clearMarketingBadgesIfNeeded$invoke$1.label = 1;
                    obj2 = ((RealBadger2) badger2).countFor(arrayList, clearMarketingBadgesIfNeeded$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = clearMarketingBadgesIfNeeded$invoke$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            obj2 = obj;
                            z = ((Boolean) obj2).booleanValue();
                            return Boolean.valueOf(z);
                        }
                        i2 = clearMarketingBadgesIfNeeded$invoke$1.I$0;
                        SafeTrace.throwOnFailure(obj2);
                        if (((Boolean) obj2).booleanValue()) {
                            ArrayList arrayList2 = MarketingMessageBadging.GROUP_NAMES;
                            clearMarketingBadgesIfNeeded$invoke$1.L$0 = obj2;
                            clearMarketingBadgesIfNeeded$invoke$1.I$0 = i2;
                            clearMarketingBadgesIfNeeded$invoke$1.label = 3;
                            if (((RealBadger2) badger2).refreshCounts(arrayList2, clearMarketingBadgesIfNeeded$invoke$1) != coroutineSingletons) {
                                obj = obj2;
                                obj2 = obj;
                            }
                            return coroutineSingletons;
                        }
                        z = ((Boolean) obj2).booleanValue();
                        return Boolean.valueOf(z);
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                sumOfInt = CollectionsKt.sumOfInt(((Map) obj2).values());
                if (sumOfInt > 0) {
                    z = false;
                    return Boolean.valueOf(z);
                }
                clearMarketingBadgesIfNeeded$invoke$1.I$0 = sumOfInt;
                clearMarketingBadgesIfNeeded$invoke$1.label = 2;
                Object clearAllBadges = this.marketingMessageRepository.clearAllBadges(clearMarketingBadgesIfNeeded$invoke$1);
                if (clearAllBadges != coroutineSingletons) {
                    obj2 = clearAllBadges;
                    i2 = sumOfInt;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                    z = ((Boolean) obj2).booleanValue();
                    return Boolean.valueOf(z);
                }
                return coroutineSingletons;
            }
        }
        clearMarketingBadgesIfNeeded$invoke$1 = new ClearMarketingBadgesIfNeeded$invoke$1(this, continuationImpl);
        Object obj22 = clearMarketingBadgesIfNeeded$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clearMarketingBadgesIfNeeded$invoke$1.label;
        Badger2 badger22 = this.badger2;
        if (i != 0) {
        }
        sumOfInt = CollectionsKt.sumOfInt(((Map) obj22).values());
        if (sumOfInt > 0) {
        }
    }
}
