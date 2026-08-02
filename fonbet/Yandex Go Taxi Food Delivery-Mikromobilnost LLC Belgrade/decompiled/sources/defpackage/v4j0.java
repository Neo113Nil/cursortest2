package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public abstract class v4j0 {
    public final a a;

    public static final class a {
        public boolean a = true;
    }

    public v4j0(tls tlsVar) {
        a aVar = new a();
        this.a = aVar;
        if (tlsVar != null) {
            tlsVar.invoke(aVar);
        }
    }

    public c a() {
        int i = u4j0.a[c().ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3 || i == 4 || i == 5) {
            return new c(b.f());
        }
        w511.b();
        return null;
    }

    public String b() {
        return null;
    }

    public abstract RestMethod c();

    public abstract String d();

    public abstract String e();

    public Map f() {
        return b.f();
    }

    public Map g() {
        return b.f();
    }

    public v4j0() {
        this(null);
    }
}
