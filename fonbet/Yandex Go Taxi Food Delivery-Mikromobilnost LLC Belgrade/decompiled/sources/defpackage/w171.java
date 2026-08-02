package defpackage;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class w171 {
    public static final w171 d = new w171();
    public WeakReference a;
    public boolean b = false;
    public boolean c = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(kb71.c.a).iterator();
        while (it.hasNext()) {
            o971 o971Var = ((j681) it.next()).e;
            boolean z3 = z2 || z;
            if (o971Var.b.get() != 0) {
                vj61.a.b((WebView) o971Var.b.get(), "setDeviceLockState", z3 ? "locked" : "unlocked");
            }
        }
    }
}
