package defpackage;

import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class cc6 {
    public final nh3 a;
    public final zt3 b;

    public cc6(nh3 nh3Var, zt3 zt3Var) {
        this.a = nh3Var;
        this.b = zt3Var;
    }

    public final String toString() {
        zt3 zt3Var = this.b;
        im6 im6Var = (im6) zt3Var.e.get(im6.d);
        String str = im6Var != null ? im6Var.c : null;
        StringBuilder sb = new StringBuilder("Request@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        sb.append(str != null ? hrg.q("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(zt3Var);
        sb.append(')');
        return sb.toString();
    }
}
