package kotlin.text;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishToastMVP {
    public float CatchingFishCoroutine;
    public final WeakReference CatchingFishDaggerWebsocket;
    public CatchingFishPicassoOkHttp CatchingFishWorkManager;
    public final TextPaint CatchingFishParcelableFAB = new TextPaint(1);
    public final CatchingFishPicassoHilt CatchingFishSnackbar = new CatchingFishPicassoHilt(1, this);
    public boolean CatchingFishReduxKtor = true;

    public CatchingFishToastMVP(CatchingFishLayoutEspresso catchingFishLayoutEspresso) {
        this.CatchingFishDaggerWebsocket = new WeakReference(null);
        this.CatchingFishDaggerWebsocket = new WeakReference(catchingFishLayoutEspresso);
    }

    public final float CatchingFishParcelableFAB(String str) {
        if (!this.CatchingFishReduxKtor) {
            return this.CatchingFishCoroutine;
        }
        TextPaint textPaint = this.CatchingFishParcelableFAB;
        this.CatchingFishCoroutine = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.CatchingFishReduxKtor = false;
        return this.CatchingFishCoroutine;
    }
}
