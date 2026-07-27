package kotlin.text;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class CatchingFishViewRealm implements InputFilter {
    public final TextView CatchingFishParcelableFAB;
    public CatchingFishMVPCustomView CatchingFishSnackbar;

    public CatchingFishViewRealm(TextView textView) {
        this.CatchingFishParcelableFAB = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.CatchingFishParcelableFAB;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int CatchingFishSnackbar = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB().CatchingFishSnackbar();
        if (CatchingFishSnackbar != 0) {
            if (CatchingFishSnackbar == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB().CatchingFishDaggerWebsocket(charSequence, 0, charSequence.length());
            }
            if (CatchingFishSnackbar != 3) {
                return charSequence;
            }
        }
        CatchingFishMVPOkHttpMVP CatchingFishParcelableFAB = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB();
        if (this.CatchingFishSnackbar == null) {
            this.CatchingFishSnackbar = new CatchingFishMVPCustomView(textView, this);
        }
        CatchingFishParcelableFAB.CatchingFishWorkManager(this.CatchingFishSnackbar);
        return charSequence;
    }
}
