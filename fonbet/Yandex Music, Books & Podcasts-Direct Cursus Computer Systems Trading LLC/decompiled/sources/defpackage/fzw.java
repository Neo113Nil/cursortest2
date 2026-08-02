package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fzw implements eo0 {
    public static final fzw c;
    public final boolean a;
    public final String b;

    static {
        dxr dxrVar = new dxr();
        dxrVar.a = Boolean.FALSE;
        c = new fzw(dxrVar);
    }

    public fzw(dxr dxrVar) {
        this.a = ((Boolean) dxrVar.a).booleanValue();
        this.b = (String) dxrVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fzw)) {
            return false;
        }
        fzw fzwVar = (fzw) obj;
        return ldg.s(null, null) && this.a == fzwVar.a && ldg.s(this.b, fzwVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
