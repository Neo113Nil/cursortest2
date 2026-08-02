package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nzg {
    public final ayg a;
    public final Throwable b;

    public nzg(ayg aygVar) {
        this.a = aygVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzg)) {
            return false;
        }
        nzg nzgVar = (nzg) obj;
        ayg aygVar = this.a;
        if (aygVar != null && aygVar.equals(nzgVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || nzgVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public nzg(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
