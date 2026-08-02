package app.cash.passcode.backend;

import android.app.Activity;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.molecule.GatedFrameClock;
import bo.app.u4$$ExternalSyntheticLambda0;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AppLockDisableRecentScreenshots;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes.dex */
public final class AppLockRecentScreenshotsDisabler implements UiActivitySetupTeardown {
    public final Activity activity;
    public final Lazy setDisablePreviewScreenshots$delegate = LazyKt.lazy(new u4$$ExternalSyntheticLambda0(15));
    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 shouldDisableScreenshots;

    public AppLockRecentScreenshotsDisabler(Activity activity, RealAppLockState realAppLockState, FeatureFlagManager featureFlagManager) {
        this.activity = activity;
        this.shouldDisableScreenshots = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.distinctUntilChanged(new AppLockRecentScreenshotsDisabler$special$$inlined$map$1(((RealFeatureFlagManager) featureFlagManager).peekValues(LaunchDarklyFeatureFlags$AppLockDisableRecentScreenshots.INSTANCE), 0)), FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realAppLockState.stateFlow, 1)), AppLockRecentScreenshotsDisabler$shouldDisableScreenshots$1.INSTANCE, 0);
    }

    public final void setRecentsScreenshotEnabledCompat(Activity activity, boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            activity.setRecentsScreenshotEnabled(z);
            return;
        }
        Method method = (Method) this.setDisablePreviewScreenshots$delegate.getValue();
        if (method != null) {
            method.invoke(activity, Boolean.valueOf(!z));
        }
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new GatedFrameClock.AnonymousClass1((Continuation) null, this, 22), 1);
        return StateFlowKt.noOpTeardown;
    }
}
