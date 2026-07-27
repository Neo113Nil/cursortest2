package kotlin.text;

import android.os.StrictMode;

/* loaded from: classes.dex */
public abstract class CatchingFishDaggerHiltRealm {
    public static StrictMode.VmPolicy.Builder CatchingFishParcelableFAB(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }
}
