package defpackage;

import java.io.InputStream;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;

/* loaded from: classes8.dex */
public final class xnt implements wnt {
    public final umx a;

    public xnt(umx umxVar) {
        this.a = umxVar;
    }

    public final b a(Object obj, KSerializer kSerializer) {
        sbx a = this.a.a();
        a.getClass();
        return gwk0.J(a, obj, kSerializer);
    }

    public final Object b(InputStream inputStream, KSerializer kSerializer) {
        return ffx.A(this.a.a(), kSerializer, inputStream);
    }

    public final Object c(String str, KSerializer kSerializer) {
        return this.a.a().b(kSerializer, str);
    }

    public final Object d(b bVar, KSerializer kSerializer) {
        return this.a.a().a(kSerializer, bVar);
    }

    public final String e(Object obj, KSerializer kSerializer) {
        return this.a.a().c(obj, kSerializer);
    }

    public final Map f(Object obj, KSerializer kSerializer) {
        smx smxVar = new smx(this.a.a());
        kSerializer.serialize(smxVar, obj);
        return (Map) smxVar.b;
    }
}
