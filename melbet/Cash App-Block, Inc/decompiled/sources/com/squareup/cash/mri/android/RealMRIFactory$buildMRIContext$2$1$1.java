package com.squareup.cash.mri.android;

import android.os.Build;
import android.provider.Settings;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MriContextAdbEnabledAndroid;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MriContextPhoneCallActiveAndroid;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.security.mri.api.v1.AndroidSignals;
import com.squareup.protos.cash.security.mri.api.v1.Identifiers;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.Signals;
import com.squareup.protos.cash.security.mri.api.v1.Signals$PlatformSignals$AndroidSignals;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class RealMRIFactory$buildMRIContext$2$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Boolean $screenIsBeingRecorded;
    public final /* synthetic */ ThreeDsSignals $threeDsSignals;
    public Identifiers L$0;
    public Signals.Builder L$1;
    public Signals.Builder L$3;
    public int label;
    public final /* synthetic */ RealMRIFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMRIFactory$buildMRIContext$2$1$1(RealMRIFactory realMRIFactory, Boolean bool, ThreeDsSignals threeDsSignals, Continuation continuation) {
        super(1, continuation);
        this.this$0 = realMRIFactory;
        this.$screenIsBeingRecorded = bool;
        this.$threeDsSignals = threeDsSignals;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RealMRIFactory$buildMRIContext$2$1$1(this.this$0, this.$screenIsBeingRecorded, this.$threeDsSignals, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RealMRIFactory$buildMRIContext$2$1$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0121, code lost:
    
        if (r2 == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FeatureFlagManager featureFlagManager;
        Object access$setDefaultSignals;
        Identifiers identifiers;
        Signals.Builder builder;
        Signals.Builder builder2;
        Object collect;
        Object collect2;
        ThreeDsSignals threeDsSignals;
        RealMRIFactory realMRIFactory = this.this$0;
        RealSignalsCollector realSignalsCollector = realMRIFactory.signalsCollector;
        FeatureFlagManager featureFlagManager2 = realMRIFactory.featureFlagManager;
        OkHttpCall.AnonymousClass1 anonymousClass1 = realMRIFactory.identifiersCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String appTokenOrNull = PlatformKt.appTokenOrNull((SessionManager) anonymousClass1.val$callback);
            String str = Build.VERSION.RELEASE;
            int i2 = Build.VERSION.SDK_INT;
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            String str4 = Build.DEVICE;
            String str5 = Build.VERSION.SECURITY_PATCH;
            String str6 = Build.ID;
            featureFlagManager = featureFlagManager2;
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Android ", i2, str, " (SDK ", ") | Device: ");
            Boxes$$ExternalSyntheticOutline1.m(m, str2, " ", str3, " (");
            Boxes$$ExternalSyntheticOutline1.m(m, str4, ") | Security Patch: ", str5, " | Build ID: ");
            m.append(str6);
            String sb = m.toString();
            String str7 = (String) ((ForcedLazyKt$forcedLazy$1) anonymousClass1.this$0).$$delegate_0.getValue();
            ByteString byteString = ByteString.EMPTY;
            Identifiers identifiers2 = new Identifiers(null, sb, null, appTokenOrNull, str7, null, byteString);
            Signals.Builder newBuilder = new Signals(null, null, null, null, null, null, null, null, null, null, byteString).newBuilder();
            this.L$0 = identifiers2;
            this.label = 1;
            access$setDefaultSignals = RealMRIFactory.access$setDefaultSignals(realMRIFactory, newBuilder, this.$screenIsBeingRecorded, this);
            if (access$setDefaultSignals != coroutineSingletons) {
                identifiers = identifiers2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                builder = this.L$1;
                Identifiers identifiers3 = this.L$0;
                SafeTrace.throwOnFailure(obj);
                identifiers = identifiers3;
                collect2 = obj;
                builder.platform_signals = new Signals$PlatformSignals$AndroidSignals(new AndroidSignals((Boolean) collect2));
                threeDsSignals = this.$threeDsSignals;
                if (threeDsSignals != null) {
                    builder.three_ds_signals = threeDsSignals;
                }
                return new MRIContext(identifiers, builder.build(), ByteString.EMPTY);
            }
            builder = this.L$3;
            builder2 = this.L$1;
            identifiers = this.L$0;
            try {
                SafeTrace.throwOnFailure(obj);
                featureFlagManager = featureFlagManager2;
                collect = obj;
                try {
                    builder.is_adb_enabled = (Boolean) collect;
                } catch (Settings.SettingNotFoundException unused) {
                }
            } catch (Settings.SettingNotFoundException unused2) {
                featureFlagManager = featureFlagManager2;
            }
            builder = builder2;
            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MriContextPhoneCallActiveAndroid.INSTANCE)).enabled()) {
                this.L$0 = identifiers;
                this.L$1 = builder;
                this.L$3 = null;
                this.label = 3;
                collect2 = realSignalsCollector.phoneCallSignal.collect();
            }
            threeDsSignals = this.$threeDsSignals;
            if (threeDsSignals != null) {
            }
            return new MRIContext(identifiers, builder.build(), ByteString.EMPTY);
        }
        Identifiers identifiers4 = this.L$0;
        SafeTrace.throwOnFailure(obj);
        identifiers = identifiers4;
        featureFlagManager = featureFlagManager2;
        access$setDefaultSignals = obj;
        builder = (Signals.Builder) access$setDefaultSignals;
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MriContextAdbEnabledAndroid.INSTANCE)).enabled()) {
            try {
                this.L$0 = identifiers;
                this.L$1 = builder;
                this.L$3 = builder;
                this.label = 2;
                collect = realSignalsCollector.adbSignal.collect();
            } catch (Settings.SettingNotFoundException unused3) {
                builder2 = builder;
            }
            if (collect != coroutineSingletons) {
                builder2 = builder;
                builder.is_adb_enabled = (Boolean) collect;
                builder = builder2;
            }
            return coroutineSingletons;
        }
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MriContextPhoneCallActiveAndroid.INSTANCE)).enabled()) {
        }
        threeDsSignals = this.$threeDsSignals;
        if (threeDsSignals != null) {
        }
        return new MRIContext(identifiers, builder.build(), ByteString.EMPTY);
    }
}
