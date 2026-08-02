package defpackage;

import android.view.Window;
import androidx.fragment.app.t;

/* loaded from: classes3.dex */
public final class f1e {
    public final /* synthetic */ h1e a;

    public f1e(h1e h1eVar) {
        this.a = h1eVar;
    }

    public final void a() {
        Window window;
        t l = this.a.l();
        if (l == null || (window = l.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }
}
