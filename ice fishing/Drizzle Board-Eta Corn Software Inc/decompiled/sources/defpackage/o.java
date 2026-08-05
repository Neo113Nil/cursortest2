package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ Typeface MdtA4re8;
    public final /* synthetic */ TextView NCTxEWno;
    public final /* synthetic */ int wxUZMvaN;

    public o(TextView textView, Typeface typeface, int i) {
        this.NCTxEWno = textView;
        this.MdtA4re8 = typeface;
        this.wxUZMvaN = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.NCTxEWno.setTypeface(this.MdtA4re8, this.wxUZMvaN);
    }
}
