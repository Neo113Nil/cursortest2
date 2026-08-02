package retrofit2;

import defpackage.cvj0;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.ny61;
import defpackage.rvj0;
import defpackage.t4j0;
import java.util.Objects;
import okhttp3.Protocol;

/* loaded from: classes9.dex */
public final class Response<T> {
    public final kvj0 a;
    public final Object b;
    public final rvj0 c;

    public Response(kvj0 kvj0Var, Object obj, rvj0 rvj0Var) {
        this.a = kvj0Var;
        this.b = obj;
        this.c = rvj0Var;
    }

    public static Response a(rvj0 rvj0Var, kvj0 kvj0Var) {
        Objects.requireNonNull(rvj0Var, "body == null");
        if (!kvj0Var.J) {
            return new Response(kvj0Var, null, rvj0Var);
        }
        ny61.g("rawResponse should not be successful response");
        return null;
    }

    public static Response b(Object obj) {
        cvj0 cvj0Var = new cvj0();
        cvj0Var.c = 200;
        cvj0Var.d = "OK";
        cvj0Var.b = Protocol.HTTP_1_1;
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h("http://localhost/");
        cvj0Var.a = new d5j0(t4j0Var);
        return c(obj, cvj0Var.a());
    }

    public static Response c(Object obj, kvj0 kvj0Var) {
        if (kvj0Var.J) {
            return new Response(kvj0Var, obj, null);
        }
        ny61.g("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
