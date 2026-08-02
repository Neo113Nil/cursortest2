package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.utils.ResponseError;

/* loaded from: classes10.dex */
public final class tb3 {
    public final jb7 a;
    public final nfh b;

    public tb3(jb7 jb7Var, nfh nfhVar) {
        this.a = jb7Var;
        this.b = nfhVar;
    }

    public final jju0 a() {
        jb7 jb7Var = this.a;
        String str = (String) jb7Var.b;
        nfh nfhVar = this.b;
        Object obj = nfhVar.c;
        try {
            String v = jb7Var.v();
            Object c = evu0.J(v) ? null : ((xnt) ((wnt) nfhVar.a)).c(v, (KSerializer) nfhVar.b);
            return c != null ? new iju0(c) : new hju0(obj, ResponseError.DataNotFound);
        } catch (SerializationException e) {
            xby.d.k(e, "Failed to parse data from AtomicFile [" + str + "]");
            return new hju0(obj, ResponseError.DeserializeError);
        } catch (Exception e2) {
            xby.d.k(e2, "Failed to restore data from AtomicFile [" + str + "]");
            return new hju0(obj, ResponseError.UnknownError);
        }
    }

    public final void b(Object obj) {
        jb7 jb7Var = this.a;
        try {
            nfh nfhVar = this.b;
            jb7Var.z(((xnt) ((wnt) nfhVar.a)).e(obj, (KSerializer) nfhVar.b));
        } catch (Exception e) {
            xby.d.k(e, "Failed to save data to AtomicFile [" + ((String) jb7Var.b) + "]");
        }
    }
}
