package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class of extends w30 {
    public final nf sjUBp5pO;

    public of(TextView textView) {
        this.sjUBp5pO = new nf(textView);
    }

    @Override // defpackage.w30
    public final void N8VPGzVC(boolean z) {
        boolean z2 = ze.k3x7lurq != null;
        nf nfVar = this.sjUBp5pO;
        if (z2) {
            nfVar.N8VPGzVC(z);
        } else {
            nfVar.amk52bBQ = z;
        }
    }

    @Override // defpackage.w30
    public final InputFilter[] lwWCatUu(InputFilter[] inputFilterArr) {
        return !(ze.k3x7lurq != null) ? inputFilterArr : this.sjUBp5pO.lwWCatUu(inputFilterArr);
    }

    @Override // defpackage.w30
    public final void nSmgoSB5(boolean z) {
        if (ze.k3x7lurq != null) {
            this.sjUBp5pO.nSmgoSB5(z);
        }
    }
}
