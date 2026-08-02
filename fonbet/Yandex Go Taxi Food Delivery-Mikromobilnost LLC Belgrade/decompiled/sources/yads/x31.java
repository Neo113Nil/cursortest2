package yads;

import java.io.Serializable;

/* loaded from: classes7.dex */
public final class x31 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    public x31(Object[] objArr) {
        this.b = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.b;
        int length = objArr.length;
        return length != 0 ? length != 1 ? y31.l(objArr.length, (Object[]) objArr.clone()) : new ay2(objArr[0]) : cl2.C;
    }
}
