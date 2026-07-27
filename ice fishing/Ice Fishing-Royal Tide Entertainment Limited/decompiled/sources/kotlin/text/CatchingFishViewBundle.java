package kotlin.text;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class CatchingFishViewBundle {
    public static final boolean CatchingFishParcelableFAB;

    static {
        CatchingFishParcelableFAB = Build.VERSION.SDK_INT >= 28;
    }
}
