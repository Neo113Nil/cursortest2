package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ns3 implements Serializable {
    public static final ns3 a = new ns3();

    private Object readResolve() throws ObjectStreamException {
        return a;
    }
}
