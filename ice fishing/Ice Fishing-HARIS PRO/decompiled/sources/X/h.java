package X;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends V.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1389a;

    public h(EditText editText) {
        this.f1389a = new WeakReference(editText);
    }

    @Override // V.h
    public final void a() {
        i.a((EditText) this.f1389a.get(), 1);
    }
}
