package kotlin.text;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class CatchingFishMVVMGraphQL {
    public static final boolean CatchingFishCoroutine;
    public static boolean CatchingFishParcelableFAB;
    public static Method CatchingFishSnackbar;

    static {
        CatchingFishCoroutine = Build.VERSION.SDK_INT >= 27;
    }
}
