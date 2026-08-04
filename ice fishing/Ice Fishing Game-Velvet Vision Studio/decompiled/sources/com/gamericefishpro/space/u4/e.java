package com.gamericefishpro.space.u4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements InputFilter {
    public final TextView a;
    public d b;

    public e(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = com.gamericefishpro.space.s4.k.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return com.gamericefishpro.space.s4.k.a().f(0, charSequence.length(), 0, charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        com.gamericefishpro.space.s4.k kVarA = com.gamericefishpro.space.s4.k.a();
        if (this.b == null) {
            this.b = new d(textView, this);
        }
        kVarA.g(this.b);
        return charSequence;
    }
}
