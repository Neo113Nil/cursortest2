package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class h7 implements nsg, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;

    @Override // defpackage.nsg
    public final void a(String str, uxe uxeVar) {
        n(5, null);
    }

    @Override // defpackage.nsg
    public final void d(String str) {
        n(1, null);
    }

    @Override // defpackage.nsg
    public final void g(String str, Integer num, Object obj) {
        if (obj instanceof Throwable) {
            n(5, new Object[]{num});
        } else {
            n(5, new Object[]{num, obj});
        }
    }

    @Override // defpackage.nsg
    public final void h(String str, Exception exc) {
        n(1, null);
    }

    @Override // defpackage.nsg
    public final void i(Object obj, String str) {
        n(5, new Object[]{obj});
    }

    @Override // defpackage.nsg
    public final void k(String str) {
        n(5, null);
    }

    public abstract void n(int i, Object[] objArr);

    public Object readResolve() throws ObjectStreamException {
        return rsg.c(((vib) this).a);
    }
}
