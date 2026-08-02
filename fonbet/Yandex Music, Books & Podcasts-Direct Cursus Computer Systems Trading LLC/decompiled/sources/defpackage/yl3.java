package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yl3 extends zwj implements Serializable {
    private static final long serialVersionUID = 0;
    public final myc a;
    public final zwj b;

    public yl3(myc mycVar, zwj zwjVar) {
        this.a = mycVar;
        this.b = zwjVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        myc mycVar = this.a;
        return this.b.compare(mycVar.apply(obj), mycVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yl3)) {
            return false;
        }
        yl3 yl3Var = (yl3) obj;
        return this.a.equals(yl3Var.a) && this.b.equals(yl3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
