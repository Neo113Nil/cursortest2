package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishXMLLayoutView {
    public final boolean CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishSnackbar;

    public CatchingFishXMLLayoutView(String str, boolean z) {
        CatchingFishToastHiltBundle.CatchingFishEspressoTesting(str);
        this.CatchingFishParcelableFAB = str;
        CatchingFishToastHiltBundle.CatchingFishEspressoTesting("com.google.android.gms");
        this.CatchingFishSnackbar = "com.google.android.gms";
        this.CatchingFishCoroutine = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishXMLLayoutView)) {
            return false;
        }
        CatchingFishXMLLayoutView catchingFishXMLLayoutView = (CatchingFishXMLLayoutView) obj;
        return CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishXMLLayoutView.CatchingFishParcelableFAB) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishXMLLayoutView.CatchingFishSnackbar) && CatchingFishLayoutRoom.CatchingFishOkHttp(null, null) && this.CatchingFishCoroutine == catchingFishXMLLayoutView.CatchingFishCoroutine;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, null, 4225, Boolean.valueOf(this.CatchingFishCoroutine)});
    }

    public final String toString() {
        String str = this.CatchingFishParcelableFAB;
        if (str != null) {
            return str;
        }
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(null);
        throw null;
    }
}
