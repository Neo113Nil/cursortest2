package i0;

import androidx.lifecycle.InterfaceC0513v;
import androidx.lifecycle.X;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4573c extends AbstractC4571a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0513v f38275a;

    public C4573c(InterfaceC0513v interfaceC0513v, X x3) {
        this.f38275a = interfaceC0513v;
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC0513v interfaceC0513v = this.f38275a;
        if (interfaceC0513v == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0513v.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0513v.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0513v)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
