package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class wmb1 {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ wmb1(smb1 smb1Var) {
        this.a = smb1Var.a;
        this.b = smb1Var.b;
        this.c = smb1Var.c;
        this.d = smb1Var.d;
        this.e = smb1Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wmb1)) {
            return false;
        }
        wmb1 wmb1Var = (wmb1) obj;
        return ooc.m(this.a, wmb1Var.a) && ooc.m(this.b, wmb1Var.b) && ooc.m(this.c, wmb1Var.c) && ooc.m(this.d, wmb1Var.d) && ooc.m(this.e, wmb1Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
