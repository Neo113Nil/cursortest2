package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class vde implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] a;

    public vde(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        return yde.w(this.a);
    }
}
