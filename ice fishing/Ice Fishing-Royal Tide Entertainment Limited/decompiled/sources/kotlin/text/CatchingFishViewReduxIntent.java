package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewReduxIntent implements CatchingFishRealmMVP {
    public final CatchingFishJUnitCustomView CatchingFishCoroutine;
    public final CatchingFishJUnitCustomView CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;

    public CatchingFishViewReduxIntent(String str) {
        this.CatchingFishSnackbar = str;
        this.CatchingFishCoroutine = new CatchingFishJUnitCustomView(str);
        this.CatchingFishReduxKtor = new CatchingFishJUnitCustomView(str.concat(" maximum"));
    }

    public final String toString() {
        return this.CatchingFishSnackbar;
    }
}
