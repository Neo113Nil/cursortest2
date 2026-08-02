package defpackage;

import android.os.Build;
import com.airbnb.lottie.LottieFeatureFlag;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class utz {
    public final HashSet a = new HashSet();

    public final boolean a(LottieFeatureFlag lottieFeatureFlag, boolean z) {
        HashSet hashSet = this.a;
        if (!z) {
            return hashSet.remove(lottieFeatureFlag);
        }
        if (Build.VERSION.SDK_INT >= lottieFeatureFlag.minRequiredSdkVersion) {
            return hashSet.add(lottieFeatureFlag);
        }
        lgz.b(String.format("%s is not supported pre SDK %d", lottieFeatureFlag.name(), Integer.valueOf(lottieFeatureFlag.minRequiredSdkVersion)));
        return false;
    }
}
