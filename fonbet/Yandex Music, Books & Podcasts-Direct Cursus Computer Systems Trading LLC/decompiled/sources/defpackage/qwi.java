package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class qwi implements nsg, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    public Object readResolve() throws ObjectStreamException {
        return rsg.c("NOP");
    }
}
