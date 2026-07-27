package kotlin.text;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerJUnit {
    public final String CatchingFishParcelableFAB;
    public final Map CatchingFishSnackbar;

    public CatchingFishViewPagerJUnit(String str, Map map) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = map;
    }

    public static CatchingFishViewPagerJUnit CatchingFishParcelableFAB(String str) {
        return new CatchingFishViewPagerJUnit(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishViewPagerJUnit)) {
            return false;
        }
        CatchingFishViewPagerJUnit catchingFishViewPagerJUnit = (CatchingFishViewPagerJUnit) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishViewPagerJUnit.CatchingFishParcelableFAB) && this.CatchingFishSnackbar.equals(catchingFishViewPagerJUnit.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return this.CatchingFishSnackbar.hashCode() + (this.CatchingFishParcelableFAB.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.CatchingFishParcelableFAB + ", properties=" + this.CatchingFishSnackbar.values() + "}";
    }
}
