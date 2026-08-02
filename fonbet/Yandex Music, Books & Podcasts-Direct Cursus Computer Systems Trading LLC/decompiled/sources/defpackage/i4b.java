package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i4b extends p3b implements Runnable {
    public final WeakReference a;

    public i4b(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.p3b
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j4b.a((EditText) this.a.get(), 1);
    }
}
