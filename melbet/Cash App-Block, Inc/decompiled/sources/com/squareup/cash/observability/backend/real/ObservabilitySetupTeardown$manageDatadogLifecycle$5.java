package com.squareup.cash.observability.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.JsonFeatureFlags$MobileObservabilityConfig;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.types.MetadataSection$ReservedRumKey;
import com.squareup.cash.observability.types.MetadataSection$SessionInfoSection;
import com.squareup.util.Quintuple;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ObservabilitySetupTeardown$manageDatadogLifecycle$5 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ObservabilitySetupTeardown this$0;

    public /* synthetic */ ObservabilitySetupTeardown$manageDatadogLifecycle$5(ObservabilitySetupTeardown observabilitySetupTeardown, int i) {
        this.$r8$classId = i;
        this.this$0 = observabilitySetupTeardown;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Quintuple quintuple, Continuation continuation) {
        ObservabilitySetupTeardown$manageDatadogLifecycle$5$emit$1 observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1;
        int i;
        String str;
        int i2;
        String str2;
        ObservabilitySetupTeardown observabilitySetupTeardown = this.this$0;
        RealObservabilityManager realObservabilityManager = observabilitySetupTeardown.observabilityManager;
        if (continuation instanceof ObservabilitySetupTeardown$manageDatadogLifecycle$5$emit$1) {
            observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1 = (ObservabilitySetupTeardown$manageDatadogLifecycle$5$emit$1) continuation;
            int i3 = observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) quintuple.first).booleanValue();
                    FeatureFlag$JsonFeatureFlag.Options options = (FeatureFlag$JsonFeatureFlag.Options) quintuple.second;
                    boolean booleanValue2 = ((Boolean) quintuple.third).booleanValue();
                    String str3 = (String) quintuple.fourth;
                    str = (String) quintuple.fifth;
                    JsonFeatureFlags$MobileObservabilityConfig.Config config = (JsonFeatureFlags$MobileObservabilityConfig.Config) options.value;
                    int i4 = config.datadogRumSampleRateAndroid;
                    if (1 > i4 || i4 >= 101 || 1 > (i2 = config.datadogTelemetrySampleRateAndroid) || i2 >= 101 || !booleanValue) {
                        realObservabilityManager.stopMonitoring();
                        ((RealFeatureFlagManager) observabilitySetupTeardown.featureFlagManager).interceptors.remove(realObservabilityManager);
                        return Unit.INSTANCE;
                    }
                    observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.L$1 = str3;
                    observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.L$2 = str;
                    observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.label = 1;
                    if (ObservabilitySetupTeardown.access$startDatadog(observabilitySetupTeardown, booleanValue, options, booleanValue2, observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str3;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.L$2;
                    str2 = observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                if (str2 != null) {
                    RealDatadogClient realDatadogClient = realObservabilityManager.datadogClient;
                    realDatadogClient.customerToken = str2;
                    realDatadogClient.updateUserInfo();
                }
                if (str != null) {
                    RealDatadogClient realDatadogClient2 = realObservabilityManager.datadogClient;
                    realDatadogClient2.appToken = str;
                    realDatadogClient2.addCustomAttributeToRumMonitoring(CollectionsKt__CollectionsJVMKt.listOf(new Pair(MetadataSection$ReservedRumKey.AppTokenKey.INSTANCE, str)));
                    realDatadogClient2.updateUserInfo();
                }
                return Unit.INSTANCE;
            }
        }
        observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1 = new ObservabilitySetupTeardown$manageDatadogLifecycle$5$emit$1(this, continuation);
        Object obj2 = observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observabilitySetupTeardown$manageDatadogLifecycle$5$emit$1.label;
        if (i != 0) {
        }
        if (str2 != null) {
        }
        if (str != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return emit((Quintuple) obj, continuation);
            default:
                String str = (String) obj;
                ObservabilitySetupTeardown observabilitySetupTeardown = this.this$0;
                BugsnagClient bugsnagClient = observabilitySetupTeardown.bugsnagClient;
                MetadataSection$SessionInfoSection metadataSection$SessionInfoSection = MetadataSection$SessionInfoSection.INSTANCE;
                MetadataSection$SessionInfoSection.InteractivitySessionId interactivitySessionId = MetadataSection$SessionInfoSection.InteractivitySessionId.INSTANCE;
                bugsnagClient.addMetadata(metadataSection$SessionInfoSection, interactivitySessionId, str);
                observabilitySetupTeardown.observabilityManager.addCustomAttributeToRumMonitoring(CollectionsKt__CollectionsJVMKt.listOf(new Pair(interactivitySessionId, str)));
                return Unit.INSTANCE;
        }
    }
}
