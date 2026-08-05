package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qoZa66xm {
    public final tg0 NCTxEWno;
    public final TextView qoPGr6Ce;

    public qoZa66xm(TextView textView) {
        this.qoPGr6Ce = textView;
        this.NCTxEWno = new tg0(textView);
    }

    public final void MdtA4re8(boolean z) {
        ((w30) this.NCTxEWno.MdtA4re8).N8VPGzVC(z);
    }

    public final void NCTxEWno(boolean z) {
        ((w30) this.NCTxEWno.MdtA4re8).nSmgoSB5(z);
    }

    public final void qoPGr6Ce(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.qoPGr6Ce.getContext().obtainStyledAttributes(attributeSet, z00.jb9XjC4I, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            MdtA4re8(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
