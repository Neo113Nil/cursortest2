package defpackage;

import com.google.gson.Gson;
import java.lang.reflect.Type;

/* loaded from: classes6.dex */
public final class m4f implements l4f {
    @Override // defpackage.l4f
    public final Object a(String str, Type type) {
        str.getClass();
        type.getClass();
        return ((Gson) n4f.b.getValue()).e(str, type);
    }

    @Override // defpackage.l4f
    public final String to(Object obj) {
        String j = ((Gson) n4f.b.getValue()).j(obj);
        j.getClass();
        return j;
    }
}
