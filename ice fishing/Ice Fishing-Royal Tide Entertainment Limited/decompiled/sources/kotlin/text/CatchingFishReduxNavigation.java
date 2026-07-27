package kotlin.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes.dex */
public final class CatchingFishReduxNavigation extends CatchingFishMVPExoPlayer {
    @Override // kotlin.text.CatchingFishMVPExoPlayer
    public final Signature[] CatchingFishAnimationMockk(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
