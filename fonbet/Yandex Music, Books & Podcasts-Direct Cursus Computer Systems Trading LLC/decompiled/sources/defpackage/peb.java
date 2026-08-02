package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class peb extends qeb implements Serializable {
    public static final peb a = new peb();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.qeb
    public final boolean a(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.qeb
    public final int b(Object obj) {
        return System.identityHashCode(obj);
    }
}
