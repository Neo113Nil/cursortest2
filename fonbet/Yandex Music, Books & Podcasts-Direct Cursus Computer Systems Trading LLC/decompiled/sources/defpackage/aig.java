package defpackage;

import com.google.common.cache.a;
import com.google.common.cache.b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class aig extends big implements myc {
    private static final long serialVersionUID = 1;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    public final Object a(Object obj) {
        crn j;
        b bVar = this.a;
        qzc qzcVar = bVar.r;
        obj.getClass();
        int d = bVar.d(obj);
        a f = bVar.f(d);
        f.getClass();
        qzcVar.getClass();
        try {
            try {
                if (f.b != 0 && (j = f.j(d, obj)) != null) {
                    long a = f.a.o.a();
                    Object k = f.k(j, a);
                    if (k != null) {
                        f.q(j, a);
                        f.n.getClass();
                        f.a.getClass();
                        return k;
                    }
                    nig g = j.g();
                    if (g.f()) {
                        return f.A(j, obj, g);
                    }
                }
                return f.l(obj, d, qzcVar);
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new qob((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw new git(cause);
                }
                throw e;
            }
        } finally {
            f.n();
        }
    }

    @Override // defpackage.myc
    public final Object apply(Object obj) {
        try {
            return a(obj);
        } catch (ExecutionException e) {
            throw new git(e.getCause());
        }
    }

    @Override // defpackage.big
    public Object writeReplace() {
        return new yhg(this.a);
    }
}
