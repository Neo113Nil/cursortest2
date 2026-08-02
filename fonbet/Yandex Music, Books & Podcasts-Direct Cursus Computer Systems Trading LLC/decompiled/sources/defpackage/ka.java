package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class ka implements Serializable {
    private static final long serialVersionUID = -2488473066578201069L;
    public final String a;
    public final String b;

    public ka(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new la(this.a, this.b);
    }
}
