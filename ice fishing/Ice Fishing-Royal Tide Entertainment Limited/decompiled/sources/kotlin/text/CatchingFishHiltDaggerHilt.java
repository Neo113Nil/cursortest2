package kotlin.text;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CatchingFishHiltDaggerHilt {
    public final int CatchingFishParcelableFAB;
    public final Method CatchingFishSnackbar;

    public CatchingFishHiltDaggerHilt(int i, Method method) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishHiltDaggerHilt)) {
            return false;
        }
        CatchingFishHiltDaggerHilt catchingFishHiltDaggerHilt = (CatchingFishHiltDaggerHilt) obj;
        return this.CatchingFishParcelableFAB == catchingFishHiltDaggerHilt.CatchingFishParcelableFAB && this.CatchingFishSnackbar.getName().equals(catchingFishHiltDaggerHilt.CatchingFishSnackbar.getName());
    }

    public final int hashCode() {
        return this.CatchingFishSnackbar.getName().hashCode() + (this.CatchingFishParcelableFAB * 31);
    }
}
