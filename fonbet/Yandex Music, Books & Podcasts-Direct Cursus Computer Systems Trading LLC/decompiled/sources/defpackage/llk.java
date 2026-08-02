package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class llk implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    public final HashMap a;

    public llk(HashMap hashMap) {
        hashMap.getClass();
        this.a = hashMap;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new mlk(this.a);
    }
}
