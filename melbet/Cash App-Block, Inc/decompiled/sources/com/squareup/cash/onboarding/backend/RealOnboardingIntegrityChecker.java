package com.squareup.cash.onboarding.backend;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.room.RoomDatabase$performClear$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafb;
import com.squareup.cash.cdf.integrity.IntegrityCheckFail;
import com.squareup.cash.cdf.integrity.IntegrityCheckStart;
import com.squareup.cash.cdf.integrity.IntegrityCheckSucceed;
import com.squareup.cash.cdf.integrity.Trigger;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.backend.OnboardingIntegrityChecker$OnboardingIntegrityCheckResult;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import com.squareup.cash.onboarding.check.RealIntegrityChecker;
import com.squareup.cash.onboarding.check.checkers.RealIntegrityCheckFactory;
import com.squareup.preferences.KeyValue;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealOnboardingIntegrityChecker {
    public static final EnumSet ONBOARDING_INTEGRITY_CHECKS = EnumSet.of(IntegrityCheckFactory$Type.PROFILE, IntegrityCheckFactory$Type.MARKET_CAPABILITIES, IntegrityCheckFactory$Type.TABS);
    public final Analytics analytics;
    public final RealIntegrityCheckFactory integrityCheckFactory;
    public final KeyValue onboardingIntegrityChecksInProgress;

    public RealOnboardingIntegrityChecker(KeyValue keyValue, RealIntegrityChecker realIntegrityChecker, RealIntegrityCheckFactory realIntegrityCheckFactory, Analytics analytics) {
        this.onboardingIntegrityChecksInProgress = keyValue;
        this.integrityCheckFactory = realIntegrityCheckFactory;
        this.analytics = analytics;
    }

    public static String toAnalyticsChecksString(Iterable iterable) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String lowerCase = ((IntegrityCheckFactory$Type) it.next()).name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList.add(lowerCase);
        }
        return CollectionsKt.joinToString$default(CollectionsKt.sorted(arrayList), ",", null, null, 0, null, null, 62);
    }

    public static Trigger toCdf(OnboardingIntegrityChecker$TriggeredBy onboardingIntegrityChecker$TriggeredBy) {
        int ordinal = onboardingIntegrityChecker$TriggeredBy.ordinal();
        if (ordinal == 0) {
            return Trigger.END_OF_ONBOARDING;
        }
        if (ordinal == 1) {
            return Trigger.SWITCH_PROFILE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (r5.set(r14, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r14 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        if (r5.set(r14, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkIntegrity(OnboardingIntegrityChecker$TriggeredBy onboardingIntegrityChecker$TriggeredBy, ContinuationImpl continuationImpl) {
        RealOnboardingIntegrityChecker$checkIntegrity$1 realOnboardingIntegrityChecker$checkIntegrity$1;
        int i;
        List list;
        if (continuationImpl instanceof RealOnboardingIntegrityChecker$checkIntegrity$1) {
            realOnboardingIntegrityChecker$checkIntegrity$1 = (RealOnboardingIntegrityChecker$checkIntegrity$1) continuationImpl;
            int i2 = realOnboardingIntegrityChecker$checkIntegrity$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOnboardingIntegrityChecker$checkIntegrity$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOnboardingIntegrityChecker$checkIntegrity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOnboardingIntegrityChecker$checkIntegrity$1.label;
                Analytics analytics = this.analytics;
                KeyValue keyValue = this.onboardingIntegrityChecksInProgress;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = Boolean.TRUE;
                    realOnboardingIntegrityChecker$checkIntegrity$1.L$0 = onboardingIntegrityChecker$TriggeredBy;
                    realOnboardingIntegrityChecker$checkIntegrity$1.label = 1;
                } else if (i == 1) {
                    onboardingIntegrityChecker$TriggeredBy = realOnboardingIntegrityChecker$checkIntegrity$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = realOnboardingIntegrityChecker$checkIntegrity$1.L$1;
                        onboardingIntegrityChecker$TriggeredBy = realOnboardingIntegrityChecker$checkIntegrity$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (zzafb.allSuccess(list)) {
                            analytics.track(new IntegrityCheckSucceed(toCdf(onboardingIntegrityChecker$TriggeredBy), ""), null);
                            return OnboardingIntegrityChecker$OnboardingIntegrityCheckResult.Success.INSTANCE;
                        }
                        Trigger cdf = toCdf(onboardingIntegrityChecker$TriggeredBy);
                        ArrayList failures = zzafb.failures(list);
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(failures, 10));
                        Iterator it = failures.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((IntegrityChecker$Result.Failure) it.next()).getIntegrityCheck().getType());
                        }
                        analytics.track(new IntegrityCheckFail(cdf, toAnalyticsChecksString(arrayList), ""), null);
                        return new OnboardingIntegrityChecker$OnboardingIntegrityCheckResult.Failure(zzafb.firstFailure(list).getIntegrityCheck().getType());
                    }
                    OnboardingIntegrityChecker$TriggeredBy onboardingIntegrityChecker$TriggeredBy2 = realOnboardingIntegrityChecker$checkIntegrity$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    onboardingIntegrityChecker$TriggeredBy = onboardingIntegrityChecker$TriggeredBy2;
                    list = (List) obj;
                    Boolean bool2 = Boolean.FALSE;
                    realOnboardingIntegrityChecker$checkIntegrity$1.L$0 = onboardingIntegrityChecker$TriggeredBy;
                    realOnboardingIntegrityChecker$checkIntegrity$1.L$1 = list;
                    realOnboardingIntegrityChecker$checkIntegrity$1.label = 3;
                }
                Trigger cdf2 = toCdf(onboardingIntegrityChecker$TriggeredBy);
                EnumSet enumSet = ONBOARDING_INTEGRITY_CHECKS;
                enumSet.getClass();
                analytics.track(new IntegrityCheckStart(cdf2, toAnalyticsChecksString(enumSet), Boolean.TRUE), null);
                realOnboardingIntegrityChecker$checkIntegrity$1.L$0 = onboardingIntegrityChecker$TriggeredBy;
                realOnboardingIntegrityChecker$checkIntegrity$1.label = 2;
                IntegrityCheckFactory$Type[] integrityCheckFactory$TypeArr = (IntegrityCheckFactory$Type[]) enumSet.toArray(new IntegrityCheckFactory$Type[0]);
                obj = JobKt.coroutineScope(new RoomDatabase$performClear$1.AnonymousClass1((List) PointerInputModifierNodeKt.createAll(this.integrityCheckFactory, (IntegrityCheckFactory$Type[]) Arrays.copyOf(integrityCheckFactory$TypeArr, integrityCheckFactory$TypeArr.length)), true, (Continuation) null), realOnboardingIntegrityChecker$checkIntegrity$1);
            }
        }
        realOnboardingIntegrityChecker$checkIntegrity$1 = new RealOnboardingIntegrityChecker$checkIntegrity$1(this, continuationImpl);
        Object obj2 = realOnboardingIntegrityChecker$checkIntegrity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOnboardingIntegrityChecker$checkIntegrity$1.label;
        Analytics analytics2 = this.analytics;
        KeyValue keyValue2 = this.onboardingIntegrityChecksInProgress;
        if (i != 0) {
        }
        Trigger cdf22 = toCdf(onboardingIntegrityChecker$TriggeredBy);
        EnumSet enumSet2 = ONBOARDING_INTEGRITY_CHECKS;
        enumSet2.getClass();
        analytics2.track(new IntegrityCheckStart(cdf22, toAnalyticsChecksString(enumSet2), Boolean.TRUE), null);
        realOnboardingIntegrityChecker$checkIntegrity$1.L$0 = onboardingIntegrityChecker$TriggeredBy;
        realOnboardingIntegrityChecker$checkIntegrity$1.label = 2;
        IntegrityCheckFactory$Type[] integrityCheckFactory$TypeArr2 = (IntegrityCheckFactory$Type[]) enumSet2.toArray(new IntegrityCheckFactory$Type[0]);
        obj2 = JobKt.coroutineScope(new RoomDatabase$performClear$1.AnonymousClass1((List) PointerInputModifierNodeKt.createAll(this.integrityCheckFactory, (IntegrityCheckFactory$Type[]) Arrays.copyOf(integrityCheckFactory$TypeArr2, integrityCheckFactory$TypeArr2.length)), true, (Continuation) null), realOnboardingIntegrityChecker$checkIntegrity$1);
    }
}
