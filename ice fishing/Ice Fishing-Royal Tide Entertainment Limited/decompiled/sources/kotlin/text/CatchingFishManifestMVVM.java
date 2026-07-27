package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishManifestMVVM implements CatchingFishHiltAsyncTask {
    public final boolean CatchingFishReduxKtor;

    public CatchingFishManifestMVVM(boolean z) {
        this.CatchingFishReduxKtor = z;
    }

    @Override // kotlin.text.CatchingFishHiltAsyncTask
    public final CatchingFishSnackbarRealm CatchingFishReduxKtor() {
        return null;
    }

    @Override // kotlin.text.CatchingFishHiltAsyncTask
    public final boolean CatchingFishSnackbar() {
        return this.CatchingFishReduxKtor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.CatchingFishReduxKtor ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
