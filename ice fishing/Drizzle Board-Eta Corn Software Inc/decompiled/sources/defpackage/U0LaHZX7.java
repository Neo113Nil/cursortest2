package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class U0LaHZX7 extends ClickableSpan {
    public final nSmgoSB5 MdtA4re8;
    public final int NCTxEWno;
    public final int wxUZMvaN;

    public U0LaHZX7(int i, nSmgoSB5 nsmgosb5, int i2) {
        this.NCTxEWno = i;
        this.MdtA4re8 = nsmgosb5;
        this.wxUZMvaN = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.NCTxEWno);
        this.MdtA4re8.qoPGr6Ce.performAction(this.wxUZMvaN, bundle);
    }
}
