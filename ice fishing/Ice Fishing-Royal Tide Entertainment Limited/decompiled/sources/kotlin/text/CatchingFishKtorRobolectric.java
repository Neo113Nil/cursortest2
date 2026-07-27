package kotlin.text;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class CatchingFishKtorRobolectric {
    public boolean CatchingFishCloudMessaging;
    public final int CatchingFishCoroutine;
    public CatchingFishLayoutCoroutine CatchingFishOkHttp;
    public CharSequence CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public final TextPaint CatchingFishSnackbar;
    public Layout.Alignment CatchingFishDaggerWebsocket = Layout.Alignment.ALIGN_NORMAL;
    public int CatchingFishWorkManager = Integer.MAX_VALUE;
    public float CatchingFishViewModelScope = 0.0f;
    public float CatchingFishViewModelFAB = 1.0f;
    public int CatchingFishLayout = 1;
    public boolean CatchingFishFragmentHandler = true;
    public TextUtils.TruncateAt CatchingFishEspressoTesting = null;

    public CatchingFishKtorRobolectric(CharSequence charSequence, TextPaint textPaint, int i) {
        this.CatchingFishParcelableFAB = charSequence;
        this.CatchingFishSnackbar = textPaint;
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = charSequence.length();
    }

    public final StaticLayout CatchingFishParcelableFAB() {
        if (this.CatchingFishParcelableFAB == null) {
            this.CatchingFishParcelableFAB = "";
        }
        int max = Math.max(0, this.CatchingFishCoroutine);
        CharSequence charSequence = this.CatchingFishParcelableFAB;
        int i = this.CatchingFishWorkManager;
        TextPaint textPaint = this.CatchingFishSnackbar;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.CatchingFishEspressoTesting);
        }
        int min = Math.min(charSequence.length(), this.CatchingFishReduxKtor);
        this.CatchingFishReduxKtor = min;
        if (this.CatchingFishCloudMessaging && this.CatchingFishWorkManager == 1) {
            this.CatchingFishDaggerWebsocket = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.CatchingFishDaggerWebsocket);
        obtain.setIncludePad(this.CatchingFishFragmentHandler);
        obtain.setTextDirection(this.CatchingFishCloudMessaging ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.CatchingFishEspressoTesting;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.CatchingFishWorkManager);
        float f = this.CatchingFishViewModelScope;
        if (f != 0.0f || this.CatchingFishViewModelFAB != 1.0f) {
            obtain.setLineSpacing(f, this.CatchingFishViewModelFAB);
        }
        if (this.CatchingFishWorkManager > 1) {
            obtain.setHyphenationFrequency(this.CatchingFishLayout);
        }
        CatchingFishLayoutCoroutine catchingFishLayoutCoroutine = this.CatchingFishOkHttp;
        if (catchingFishLayoutCoroutine != null) {
            obtain.setBreakStrategy(((TextInputLayout) catchingFishLayoutCoroutine.CatchingFishDaggerWebsocket).CatchingFishParcelableFlux.getBreakStrategy());
        }
        return obtain.build();
    }
}
