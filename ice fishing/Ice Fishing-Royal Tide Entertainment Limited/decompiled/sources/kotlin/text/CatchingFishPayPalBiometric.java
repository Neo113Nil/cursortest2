package kotlin.text;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishPayPalBiometric {
    public static volatile CatchingFishPayPalBiometric CatchingFishParcelableFAB;
    public static final CatchingFishPayPalBiometric CatchingFishSnackbar;

    static {
        CatchingFishPayPalBiometric catchingFishPayPalBiometric = new CatchingFishPayPalBiometric();
        Map map = Collections.EMPTY_MAP;
        CatchingFishSnackbar = catchingFishPayPalBiometric;
    }

    public static CatchingFishPayPalBiometric CatchingFishParcelableFAB() {
        CatchingFishPayPalBiometric catchingFishPayPalBiometric;
        CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
        CatchingFishPayPalBiometric catchingFishPayPalBiometric2 = CatchingFishParcelableFAB;
        if (catchingFishPayPalBiometric2 != null) {
            return catchingFishPayPalBiometric2;
        }
        synchronized (CatchingFishPayPalBiometric.class) {
            try {
                catchingFishPayPalBiometric = CatchingFishParcelableFAB;
                if (catchingFishPayPalBiometric == null) {
                    Class cls = CatchingFishCustomViewRoom.CatchingFishParcelableFAB;
                    CatchingFishPayPalBiometric catchingFishPayPalBiometric3 = null;
                    if (cls != null) {
                        try {
                            catchingFishPayPalBiometric3 = (CatchingFishPayPalBiometric) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    catchingFishPayPalBiometric = catchingFishPayPalBiometric3 != null ? catchingFishPayPalBiometric3 : CatchingFishSnackbar;
                    CatchingFishParcelableFAB = catchingFishPayPalBiometric;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishPayPalBiometric;
    }
}
