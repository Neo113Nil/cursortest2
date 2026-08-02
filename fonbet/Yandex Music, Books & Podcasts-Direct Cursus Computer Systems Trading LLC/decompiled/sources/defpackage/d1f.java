package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class d1f {
    public final jyr a = btf.b(new sxd(17));

    public final List a(String str, Class cls) {
        List X;
        Object[] objArr = (Object[]) ((Gson) this.a.getValue()).e(str, TypeToken.getArray(cls).getType());
        return (objArr == null || (X = xz0.X(objArr)) == null) ? c5b.a : X;
    }
}
