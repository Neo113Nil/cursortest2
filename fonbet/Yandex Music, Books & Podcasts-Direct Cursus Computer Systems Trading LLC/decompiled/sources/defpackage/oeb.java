package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class oeb extends qeb implements Serializable {
    public static final oeb a = new oeb();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.qeb
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // defpackage.qeb
    public final int b(Object obj) {
        return obj.hashCode();
    }
}
