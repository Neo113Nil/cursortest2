package yads;

import android.view.View;
import android.webkit.WebView;
import defpackage.j681;
import defpackage.kb71;
import defpackage.o971;
import defpackage.vj61;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class ut3 extends ku3 {
    public static final ut3 d = new ut3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ku3
    public final void a(boolean z) {
        Iterator it = Collections.unmodifiableCollection(kb71.c.a).iterator();
        while (it.hasNext()) {
            o971 o971Var = ((j681) it.next()).e;
            if (o971Var.b.get() != 0) {
                vj61.a.b((WebView) o971Var.b.get(), "setState", z ? "foregrounded" : "backgrounded", o971Var.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ku3
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(kb71.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((j681) it.next()).d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
