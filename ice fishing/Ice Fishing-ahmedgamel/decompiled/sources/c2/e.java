package c2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final S0.c f5718a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5719b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5720c;

    public e(Context context, d dVar) {
        S0.c cVar = new S0.c(8, context);
        this.f5720c = new HashMap();
        this.f5718a = cVar;
        this.f5719b = dVar;
    }

    public final synchronized f a(String str) {
        if (this.f5720c.containsKey(str)) {
            return (f) this.f5720c.get(str);
        }
        CctBackendFactory f2 = this.f5718a.f(str);
        if (f2 == null) {
            return null;
        }
        d dVar = this.f5719b;
        f create = f2.create(new C0547b(dVar.f5715a, dVar.f5716b, dVar.f5717c, str));
        this.f5720c.put(str, create);
        return create;
    }
}
