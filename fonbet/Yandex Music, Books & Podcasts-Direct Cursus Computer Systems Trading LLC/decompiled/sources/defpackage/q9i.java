package defpackage;

import java.util.UUID;

/* loaded from: classes5.dex */
public final class q9i implements b0j {
    public final /* synthetic */ int a;

    public q9i(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                lo4 lo4Var = lo4.android;
                break;
        }
    }

    @Override // defpackage.b0j
    public final mif c(e1j e1jVar) {
        int i = this.a;
        e1jVar.getClass();
        switch (i) {
            case 0:
                q0j method = e1jVar.method();
                String b = e1jVar.b();
                z9h d = e1jVar.d();
                z9h a = e1jVar.a();
                z9h c = e1jVar.c();
                c.j("X-SDK-PLATFORM", String.valueOf(lo4.android));
                c.j("X-SDK-VERSION", "6.26.1");
                return nif.d(new uyo(method, b, d, a, c, e1jVar.encoding()));
            default:
                z9h c2 = e1jVar.c();
                c2.getClass();
                if (c2.b.get("X-Request-ID") != null) {
                    return nif.d(e1jVar);
                }
                q0j method2 = e1jVar.method();
                String b2 = e1jVar.b();
                z9h d2 = e1jVar.d();
                z9h a2 = e1jVar.a();
                z9h c3 = e1jVar.c();
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                c3.j("X-Request-ID", uuid);
                return nif.d(new uyo(method2, b2, d2, a2, c3, e1jVar.encoding()));
        }
    }
}
