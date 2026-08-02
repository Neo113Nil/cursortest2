package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class gee implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] a;

    public gee(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.a;
        int length = objArr.length;
        return length != 0 ? length != 1 ? hee.u(objArr.length, (Object[]) objArr.clone()) : new gmq(objArr[0]) : wsn.j;
    }
}
