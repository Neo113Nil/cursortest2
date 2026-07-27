package kotlin.text;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class CatchingFishFluxWorkManager implements CatchingFishSpannableGson {
    public final String CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFluxWorkManager(String str, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = str;
    }

    @Override // kotlin.text.CatchingFishSpannableGson
    public boolean CatchingFishSnackbar(CharSequence charSequence, int i, int i2, CatchingFishFirebaseFABGson catchingFishFirebaseFABGson) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.CatchingFishDaggerWebsocket)) {
            return true;
        }
        catchingFishFirebaseFABGson.CatchingFishCoroutine = (catchingFishFirebaseFABGson.CatchingFishCoroutine & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                return "<" + this.CatchingFishDaggerWebsocket + '>';
            default:
                return super.toString();
        }
    }

    @Override // kotlin.text.CatchingFishSpannableGson
    public Object CatchingFishParcelableFAB() {
        return this;
    }
}
