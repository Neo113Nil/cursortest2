package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class qa7 implements Iterator, xfx {
    public final byj a;
    public String b;
    public boolean c;

    public qa7(sa7 sa7Var) {
        byj byjVar;
        dyj dyjVar = sa7Var.a;
        synchronized (dyjVar) {
            dyjVar.k();
            byjVar = new byj(dyjVar);
        }
        this.a = byjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        this.c = false;
        while (true) {
            byj byjVar = this.a;
            if (!byjVar.hasNext()) {
                return false;
            }
            try {
                Closeable closeable = (Closeable) byjVar.next();
                try {
                    continue;
                    this.b = new jci0((y9t0) ((vxj) closeable).c.get(0)).j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                    closeable.close();
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        String str = this.b;
        this.b = null;
        this.c = true;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            this.a.remove();
        } else {
            ny61.r("remove() before next()");
        }
    }
}
