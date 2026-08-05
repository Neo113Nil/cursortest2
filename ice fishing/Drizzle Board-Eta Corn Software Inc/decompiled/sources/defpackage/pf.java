package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pf extends xe {
    public final WeakReference qoPGr6Ce;

    public pf(EditText editText) {
        this.qoPGr6Ce = new WeakReference(editText);
    }

    @Override // defpackage.xe
    public final void qoPGr6Ce() {
        qf.qoPGr6Ce((EditText) this.qoPGr6Ce.get(), 1);
    }
}
