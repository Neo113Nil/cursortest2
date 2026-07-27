package kotlin.text;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class CatchingFishFluxIntent {
    public final int CatchingFishCoroutine;
    public final ColorFilter CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar;

    public CatchingFishFluxIntent(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            CatchingFishLifecycle.CatchingFishViewModelFAB();
            porterDuffColorFilter = CatchingFishLifecycle.CatchingFishReduxKtor(CatchingFishFirebaseDagger.CatchingFishStateFlow(j), CatchingFishAdMobFAB.CatchingFishMotionLayout(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(CatchingFishFirebaseDagger.CatchingFishStateFlow(j), CatchingFishAdMobFAB.CatchingFishLayoutInflater(i));
        }
        this.CatchingFishParcelableFAB = porterDuffColorFilter;
        this.CatchingFishSnackbar = j;
        this.CatchingFishCoroutine = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFluxIntent)) {
            return false;
        }
        CatchingFishFluxIntent catchingFishFluxIntent = (CatchingFishFluxIntent) obj;
        return CatchingFishToastFragment.CatchingFishCoroutine(this.CatchingFishSnackbar, catchingFishFluxIntent.CatchingFishSnackbar) && this.CatchingFishCoroutine == catchingFishFluxIntent.CatchingFishCoroutine;
    }

    public final int hashCode() {
        int i = CatchingFishToastFragment.CatchingFishViewModelScope;
        return Integer.hashCode(this.CatchingFishCoroutine) + (Long.hashCode(this.CatchingFishSnackbar) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        CatchingFishMVPLiveData.CatchingFishCoroutineFlow(this.CatchingFishSnackbar, sb, ", blendMode=");
        sb.append((Object) CatchingFishAdMobFAB.CatchingFishParcelable(this.CatchingFishCoroutine));
        sb.append(')');
        return sb.toString();
    }
}
