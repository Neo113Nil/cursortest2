package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class la implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;

    public la(String str, String str2) {
        this.b = str2;
        this.a = gvt.D(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new ka(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof la) {
            la laVar = (la) obj;
            String str = laVar.a;
            String str2 = this.a;
            if ((str == null ? str2 == null : str.equals(str2)) && laVar.b.equals(this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) ^ this.b.hashCode();
    }
}
