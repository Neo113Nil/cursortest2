package kotlin.text;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishDaggerJUnit {
    public final View CatchingFishSnackbar;
    public final HashMap CatchingFishParcelableFAB = new HashMap();
    public final ArrayList CatchingFishCoroutine = new ArrayList();

    public CatchingFishDaggerJUnit(View view) {
        this.CatchingFishSnackbar = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishDaggerJUnit)) {
            return false;
        }
        CatchingFishDaggerJUnit catchingFishDaggerJUnit = (CatchingFishDaggerJUnit) obj;
        return this.CatchingFishSnackbar == catchingFishDaggerJUnit.CatchingFishSnackbar && this.CatchingFishParcelableFAB.equals(catchingFishDaggerJUnit.CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() + (this.CatchingFishSnackbar.hashCode() * 31);
    }

    public final String toString() {
        String CatchingFishEspressoTesting = CatchingFishMVPLiveData.CatchingFishEspressoTesting(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.CatchingFishSnackbar + "\n", "    values:");
        HashMap hashMap = this.CatchingFishParcelableFAB;
        for (String str : hashMap.keySet()) {
            CatchingFishEspressoTesting = CatchingFishEspressoTesting + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return CatchingFishEspressoTesting;
    }
}
