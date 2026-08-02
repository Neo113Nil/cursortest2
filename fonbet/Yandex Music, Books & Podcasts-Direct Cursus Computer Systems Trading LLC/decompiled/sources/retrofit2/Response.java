package retrofit2;

import defpackage.b0o;
import defpackage.izm;
import defpackage.l3o;
import defpackage.o3o;
import defpackage.xq0;
import defpackage.zvd;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class Response<T> {
    public final l3o a;
    public final Object b;
    public final o3o c;

    public Response(l3o l3oVar, Object obj, o3o o3oVar) {
        this.a = l3oVar;
        this.b = obj;
        this.c = o3oVar;
    }

    public static Response a(o3o o3oVar, l3o l3oVar) {
        if (!l3oVar.b()) {
            return new Response(l3oVar, null, o3oVar);
        }
        xq0.x("rawResponse should not be successful response");
        return null;
    }

    public static Response b(Object obj) {
        ArrayList arrayList = new ArrayList(20);
        b0o b0oVar = new b0o();
        b0oVar.g("http://localhost/");
        return c(obj, new l3o(b0oVar.b(), izm.HTTP_1_1, "OK", 200, null, new zvd((String[]) arrayList.toArray(new String[0])), null, null, null, null, 0L, 0L, null));
    }

    public static Response c(Object obj, l3o l3oVar) {
        if (l3oVar.b()) {
            return new Response(l3oVar, obj, null);
        }
        xq0.x("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
