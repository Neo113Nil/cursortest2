package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFABWidget {
    public static final /* synthetic */ int CatchingFishDaggerWebsocket = 0;
    public final int CatchingFishCoroutine;
    public final boolean CatchingFishParcelableFAB;
    public final CatchingFishLayoutMVPMVVM CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    static {
        new CatchingFishFABWidget();
    }

    public CatchingFishFABWidget() {
        CatchingFishLayoutMVPMVVM catchingFishLayoutMVPMVVM = CatchingFishLayoutMVPMVVM.CatchingFishWorkManager;
        this.CatchingFishParcelableFAB = true;
        this.CatchingFishSnackbar = 1;
        this.CatchingFishCoroutine = 1;
        this.CatchingFishReduxKtor = catchingFishLayoutMVPMVVM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFABWidget)) {
            return false;
        }
        CatchingFishFABWidget catchingFishFABWidget = (CatchingFishFABWidget) obj;
        catchingFishFABWidget.getClass();
        return this.CatchingFishParcelableFAB == catchingFishFABWidget.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishFABWidget.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishFABWidget.CatchingFishCoroutine && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishFABWidget.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor.hashCode() + CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishCoroutine, CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishSnackbar, (Boolean.hashCode(this.CatchingFishParcelableFAB) + CatchingFishMVPLiveData.CatchingFishViewModelScope(0, Boolean.hashCode(false) * 31, 31)) * 31, 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", keyboardType=");
        int i = this.CatchingFishSnackbar;
        sb.append((Object) (i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i2 = this.CatchingFishCoroutine;
        if (i2 == -1) {
            str = "Unspecified";
        } else if (i2 != 0) {
            str = i2 == 1 ? "Default" : i2 == 2 ? "Go" : i2 == 3 ? "Search" : i2 == 4 ? "Send" : i2 == 5 ? "Previous" : i2 == 6 ? "Next" : i2 == 7 ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(')');
        return sb.toString();
    }
}
