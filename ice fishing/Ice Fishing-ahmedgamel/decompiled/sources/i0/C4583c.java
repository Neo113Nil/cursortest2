package i0;

import androidx.lifecycle.InterfaceC0507v;
import androidx.lifecycle.X;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4583c extends AbstractC4581a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0507v f38145a;

    public C4583c(InterfaceC0507v interfaceC0507v, X x9) {
        this.f38145a = interfaceC0507v;
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC0507v interfaceC0507v = this.f38145a;
        if (interfaceC0507v == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0507v.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0507v.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0507v)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
