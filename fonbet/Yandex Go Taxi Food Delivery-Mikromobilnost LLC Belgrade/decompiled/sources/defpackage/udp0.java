package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class udp0 extends m {
    public final Set b;

    public udp0(Set set) {
        this.b = set;
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(ClassLoader classLoader, String str) {
        Fragment fragment;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                fragment = null;
                break;
            }
            fragment = ((kcs) it.next()).a(str);
            if (fragment != null) {
                break;
            }
        }
        return fragment == null ? super.a(classLoader, str) : fragment;
    }
}
