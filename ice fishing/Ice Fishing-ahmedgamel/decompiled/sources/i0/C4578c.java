package i0;

import androidx.lifecycle.InterfaceC0503v;
import androidx.lifecycle.X;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4578c extends AbstractC4576a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0503v f38028a;

    public C4578c(InterfaceC0503v interfaceC0503v, X x9) {
        this.f38028a = interfaceC0503v;
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC0503v interfaceC0503v = this.f38028a;
        if (interfaceC0503v == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0503v.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0503v.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0503v)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
