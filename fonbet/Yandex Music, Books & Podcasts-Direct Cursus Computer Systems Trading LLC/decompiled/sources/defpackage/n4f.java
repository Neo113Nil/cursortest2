package defpackage;

import com.google.gson.Gson;
import java.lang.reflect.Type;

/* loaded from: classes6.dex */
public final class n4f implements l4f {
    public static final m4f a = new m4f();
    public static final jyr b = btf.b(grb.K);

    @Override // defpackage.l4f
    public final Object a(String str, Type type) {
        str.getClass();
        type.getClass();
        return ((Gson) b.getValue()).e(str, type);
    }

    @Override // defpackage.l4f
    public final String to(Object obj) {
        String j = ((Gson) b.getValue()).j(obj);
        j.getClass();
        return j;
    }
}
