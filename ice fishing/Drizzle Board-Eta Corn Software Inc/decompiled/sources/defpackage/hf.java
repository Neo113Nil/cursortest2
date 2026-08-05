package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hf implements InputFilter {
    public gf NCTxEWno;
    public final TextView qoPGr6Ce;

    public hf(TextView textView) {
        this.qoPGr6Ce = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.qoPGr6Ce;
        if (!textView.isInEditMode()) {
            int NCTxEWno = ze.qoPGr6Ce().NCTxEWno();
            if (NCTxEWno != 0) {
                if (NCTxEWno == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return ze.qoPGr6Ce().VgvYg0wo(charSequence, 0, charSequence.length());
                    }
                }
            }
            ze qoPGr6Ce = ze.qoPGr6Ce();
            gf gfVar = this.NCTxEWno;
            if (gfVar == null) {
                gfVar = new gf(textView, this);
                this.NCTxEWno = gfVar;
            }
            qoPGr6Ce.P7K7Inc8(gfVar);
            return charSequence;
        }
        return charSequence;
    }
}
