package defpackage;

import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class bqe {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        return sb.toString();
    }
}
