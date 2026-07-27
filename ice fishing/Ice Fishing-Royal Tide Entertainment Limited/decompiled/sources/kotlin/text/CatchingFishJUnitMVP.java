package kotlin.text;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class CatchingFishJUnitMVP implements CatchingFishFABFluxHilt {
    public final InputContentInfo CatchingFishReduxKtor;

    public CatchingFishJUnitMVP(Object obj) {
        this.CatchingFishReduxKtor = (InputContentInfo) obj;
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public final Object CatchingFishCloudMessaging() {
        return this.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public final Uri CatchingFishEspressoTesting() {
        return this.CatchingFishReduxKtor.getContentUri();
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public final void CatchingFishOkHttp() {
        this.CatchingFishReduxKtor.requestPermission();
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public final Uri CatchingFishUnitTesting() {
        return this.CatchingFishReduxKtor.getLinkUri();
    }

    @Override // kotlin.text.CatchingFishFABFluxHilt
    public final ClipDescription CatchingFishWorkManager() {
        return this.CatchingFishReduxKtor.getDescription();
    }

    public CatchingFishJUnitMVP(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.CatchingFishReduxKtor = new InputContentInfo(uri, clipDescription, uri2);
    }
}
