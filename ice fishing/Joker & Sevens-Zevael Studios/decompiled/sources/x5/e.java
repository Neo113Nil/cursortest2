package x5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import x4.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l f8366a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.c f8367b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8368c;

    public e(Context context, a5.c cVar) {
        l lVar = new l(context);
        this.f8368c = new HashMap();
        this.f8366a = lVar;
        this.f8367b = cVar;
    }

    public final synchronized f a(String str) {
        if (this.f8368c.containsKey(str)) {
            return (f) this.f8368c.get(str);
        }
        CctBackendFactory e10 = this.f8366a.e(str);
        if (e10 == null) {
            return null;
        }
        a5.c cVar = this.f8367b;
        f create = e10.create(new b((Context) cVar.f262h, (f6.a) cVar.f261g, (f6.a) cVar.f263i, str));
        this.f8368c.put(str, create);
        return create;
    }
}
