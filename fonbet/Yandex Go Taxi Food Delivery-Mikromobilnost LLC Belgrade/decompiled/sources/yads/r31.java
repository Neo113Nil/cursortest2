package yads;

import java.io.Serializable;

/* loaded from: classes7.dex */
public final class r31 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    public r31(Object[] objArr) {
        this.b = objArr;
    }

    public Object readResolve() {
        return t31.q(this.b);
    }
}
