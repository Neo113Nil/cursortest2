package flex.utils.android;

import defpackage.jl40;
import defpackage.n751;
import defpackage.t751;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class WindowInsetsProvider {
    public final ArrayList a = new ArrayList();
    public final WindowInsetsProvider$containerAttachListener$1 b = new WindowInsetsProvider$containerAttachListener$1(this);
    public n751 c;

    public static final void a(WindowInsetsProvider windowInsetsProvider, n751 n751Var) {
        if (jl40.l(windowInsetsProvider.c, n751Var)) {
            return;
        }
        windowInsetsProvider.c = n751Var;
        if (n751Var != null) {
            Iterator it = windowInsetsProvider.a.iterator();
            while (it.hasNext()) {
                ((t751) it.next()).a(n751Var);
            }
        }
    }
}
