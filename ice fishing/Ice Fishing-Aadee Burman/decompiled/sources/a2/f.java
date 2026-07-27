package a2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final S0.c f4325a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4326b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4327c;

    public f(Context context, d dVar) {
        S0.c cVar = new S0.c(context, 6);
        this.f4327c = new HashMap();
        this.f4325a = cVar;
        this.f4326b = dVar;
    }

    public final synchronized g a(String str) {
        if (this.f4327c.containsKey(str)) {
            return (g) this.f4327c.get(str);
        }
        CctBackendFactory g4 = this.f4325a.g(str);
        if (g4 == null) {
            return null;
        }
        d dVar = this.f4326b;
        g create = g4.create(new C0430b(dVar.f4320a, dVar.f4321b, dVar.f4322c, str));
        this.f4327c.put(str, create);
        return create;
    }
}
