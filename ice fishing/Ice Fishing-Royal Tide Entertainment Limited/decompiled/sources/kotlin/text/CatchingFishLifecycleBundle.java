package kotlin.text;

import android.content.Context;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleBundle extends CatchingFishGraphQLContext {
    public final CatchingFishMVIWorkManager CatchingFishCoroutine;
    public final Context CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final CatchingFishMVIWorkManager CatchingFishSnackbar;

    public CatchingFishLifecycleBundle(Context context, CatchingFishMVIWorkManager catchingFishMVIWorkManager, CatchingFishMVIWorkManager catchingFishMVIWorkManager2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.CatchingFishParcelableFAB = context;
        if (catchingFishMVIWorkManager == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.CatchingFishSnackbar = catchingFishMVIWorkManager;
        if (catchingFishMVIWorkManager2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.CatchingFishCoroutine = catchingFishMVIWorkManager2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.CatchingFishReduxKtor = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishGraphQLContext) {
            CatchingFishGraphQLContext catchingFishGraphQLContext = (CatchingFishGraphQLContext) obj;
            if (this.CatchingFishParcelableFAB.equals(((CatchingFishLifecycleBundle) catchingFishGraphQLContext).CatchingFishParcelableFAB)) {
                CatchingFishLifecycleBundle catchingFishLifecycleBundle = (CatchingFishLifecycleBundle) catchingFishGraphQLContext;
                if (this.CatchingFishSnackbar.equals(catchingFishLifecycleBundle.CatchingFishSnackbar) && this.CatchingFishCoroutine.equals(catchingFishLifecycleBundle.CatchingFishCoroutine) && this.CatchingFishReduxKtor.equals(catchingFishLifecycleBundle.CatchingFishReduxKtor)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003) ^ this.CatchingFishSnackbar.hashCode()) * 1000003) ^ this.CatchingFishCoroutine.hashCode()) * 1000003) ^ this.CatchingFishReduxKtor.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", wallClock=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", monotonicClock=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", backendName=");
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, this.CatchingFishReduxKtor, "}");
    }
}
