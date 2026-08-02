package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class es4 {
    public final WeakReference a;
    public final String b;

    public es4(View view, String str) {
        view.getClass();
        this.a = new WeakReference(view);
        this.b = str;
    }

    public final View a() {
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
