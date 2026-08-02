package com.squareup.cash.onboarding.backend;

import android.content.SharedPreferences;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.RealFeatureFlagManager$setup$1$1$5;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealOnboardingFlowTokenManager {
    public final ReadonlyStateFlow flowToken;
    public final SharedPreferencesKeyValue onboardingContextFlowToken;
    public final SharedPreferencesKeyValue onboardingToken;

    public RealOnboardingFlowTokenManager(SharedPreferences sharedPreferences, CoroutineScope coroutineScope, boolean z) {
        SharedPreferencesKeyValue StringKeyValue = Room.StringKeyValue(sharedPreferences, "onboarding-context-flow-token", null, z);
        this.onboardingContextFlowToken = StringKeyValue;
        SharedPreferencesKeyValue StringKeyValue2 = Room.StringKeyValue(sharedPreferences, "onboarding-token", null, z);
        this.onboardingToken = StringKeyValue2;
        this.flowToken = FlowKt.stateIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(StringKeyValue.observe(), StringKeyValue2.observe(), new RealFeatureFlagManager$setup$1$1$5(3, null, 1), 0), coroutineScope, SharingStarted.Companion.Eagerly, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5.onboardingToken.delete(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.onboardingContextFlowToken.delete(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delete(ContinuationImpl continuationImpl) {
        RealOnboardingFlowTokenManager$delete$1 realOnboardingFlowTokenManager$delete$1;
        int i;
        if (continuationImpl instanceof RealOnboardingFlowTokenManager$delete$1) {
            realOnboardingFlowTokenManager$delete$1 = (RealOnboardingFlowTokenManager$delete$1) continuationImpl;
            int i2 = realOnboardingFlowTokenManager$delete$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOnboardingFlowTokenManager$delete$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOnboardingFlowTokenManager$delete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOnboardingFlowTokenManager$delete$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realOnboardingFlowTokenManager$delete$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                realOnboardingFlowTokenManager$delete$1.label = 2;
            }
        }
        realOnboardingFlowTokenManager$delete$1 = new RealOnboardingFlowTokenManager$delete$1(this, continuationImpl);
        Object obj2 = realOnboardingFlowTokenManager$delete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOnboardingFlowTokenManager$delete$1.label;
        if (i != 0) {
        }
        realOnboardingFlowTokenManager$delete$1.label = 2;
    }
}
