package com.squareup.cash.growtools.presenters.manager.state;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.preferences.KeyValue;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealGrowToolsManagerViewAppearanceTracker {
    public static final Companion Companion = new Companion();
    public final KeyValue tracker;

    public final class Companion {
    }

    public RealGrowToolsManagerViewAppearanceTracker(KeyValue keyValue) {
        this.tracker = keyValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasTracked(GrowToolsManagerScreen.Origin origin, GrowToolsManagerScreen.InvestmentType investmentType, ContinuationImpl continuationImpl) {
        RealGrowToolsManagerViewAppearanceTracker$hasTracked$1 realGrowToolsManagerViewAppearanceTracker$hasTracked$1;
        int i;
        if (continuationImpl instanceof RealGrowToolsManagerViewAppearanceTracker$hasTracked$1) {
            realGrowToolsManagerViewAppearanceTracker$hasTracked$1 = (RealGrowToolsManagerViewAppearanceTracker$hasTracked$1) continuationImpl;
            int i2 = realGrowToolsManagerViewAppearanceTracker$hasTracked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGrowToolsManagerViewAppearanceTracker$hasTracked$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGrowToolsManagerViewAppearanceTracker$hasTracked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGrowToolsManagerViewAppearanceTracker$hasTracked$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realGrowToolsManagerViewAppearanceTracker$hasTracked$1.L$0 = origin;
                    realGrowToolsManagerViewAppearanceTracker$hasTracked$1.L$1 = investmentType;
                    realGrowToolsManagerViewAppearanceTracker$hasTracked$1.label = 1;
                    obj = this.tracker.get(realGrowToolsManagerViewAppearanceTracker$hasTracked$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    investmentType = realGrowToolsManagerViewAppearanceTracker$hasTracked$1.L$1;
                    origin = realGrowToolsManagerViewAppearanceTracker$hasTracked$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(Intrinsics.areEqual(((Map) obj).get(origin + "." + investmentType), Boolean.TRUE));
            }
        }
        realGrowToolsManagerViewAppearanceTracker$hasTracked$1 = new RealGrowToolsManagerViewAppearanceTracker$hasTracked$1(this, continuationImpl);
        Object obj2 = realGrowToolsManagerViewAppearanceTracker$hasTracked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGrowToolsManagerViewAppearanceTracker$hasTracked$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(Intrinsics.areEqual(((Map) obj2).get(origin + "." + investmentType), Boolean.TRUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r6.set(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object track(GrowToolsManagerScreen.Origin origin, GrowToolsManagerScreen.InvestmentType investmentType, ContinuationImpl continuationImpl) {
        RealGrowToolsManagerViewAppearanceTracker$track$1 realGrowToolsManagerViewAppearanceTracker$track$1;
        int i;
        Object obj;
        Boolean bool;
        if (continuationImpl instanceof RealGrowToolsManagerViewAppearanceTracker$track$1) {
            realGrowToolsManagerViewAppearanceTracker$track$1 = (RealGrowToolsManagerViewAppearanceTracker$track$1) continuationImpl;
            int i2 = realGrowToolsManagerViewAppearanceTracker$track$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGrowToolsManagerViewAppearanceTracker$track$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realGrowToolsManagerViewAppearanceTracker$track$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGrowToolsManagerViewAppearanceTracker$track$1.label;
                KeyValue keyValue = this.tracker;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    realGrowToolsManagerViewAppearanceTracker$track$1.L$0 = origin;
                    realGrowToolsManagerViewAppearanceTracker$track$1.L$1 = investmentType;
                    realGrowToolsManagerViewAppearanceTracker$track$1.label = 1;
                    obj2 = keyValue.get(realGrowToolsManagerViewAppearanceTracker$track$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    investmentType = realGrowToolsManagerViewAppearanceTracker$track$1.L$1;
                    origin = realGrowToolsManagerViewAppearanceTracker$track$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                Map map = (Map) obj2;
                String str = origin + "." + investmentType;
                obj = map.get(str);
                bool = Boolean.TRUE;
                if (!Intrinsics.areEqual(obj, bool)) {
                    return Unit.INSTANCE;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(str, bool);
                realGrowToolsManagerViewAppearanceTracker$track$1.L$0 = null;
                realGrowToolsManagerViewAppearanceTracker$track$1.L$1 = null;
                realGrowToolsManagerViewAppearanceTracker$track$1.label = 2;
            }
        }
        realGrowToolsManagerViewAppearanceTracker$track$1 = new RealGrowToolsManagerViewAppearanceTracker$track$1(this, continuationImpl);
        Object obj22 = realGrowToolsManagerViewAppearanceTracker$track$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGrowToolsManagerViewAppearanceTracker$track$1.label;
        KeyValue keyValue2 = this.tracker;
        if (i != 0) {
        }
        Map map2 = (Map) obj22;
        String str2 = origin + "." + investmentType;
        obj = map2.get(str2);
        bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(obj, bool)) {
        }
    }
}
