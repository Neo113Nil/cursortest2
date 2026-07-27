package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishSpannableWidget {
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishSnackbar;

    public CatchingFishSpannableWidget(String str, String str2) {
        this.CatchingFishParcelableFAB = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.CatchingFishSnackbar = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishSpannableWidget) {
            CatchingFishSpannableWidget catchingFishSpannableWidget = (CatchingFishSpannableWidget) obj;
            if (this.CatchingFishParcelableFAB.equals(catchingFishSpannableWidget.CatchingFishParcelableFAB) && this.CatchingFishSnackbar.equals(catchingFishSpannableWidget.CatchingFishSnackbar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003) ^ this.CatchingFishSnackbar.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", version=");
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, this.CatchingFishSnackbar, "}");
    }
}
