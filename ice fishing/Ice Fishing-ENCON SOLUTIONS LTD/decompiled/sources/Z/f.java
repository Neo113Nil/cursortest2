package Z;

import androidx.window.extensions.layout.WindowLayoutComponent;
import b0.C0127a;
import b0.C0129c;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: e, reason: collision with root package name */
    public static final f f1938e = new f(0);

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        WindowLayoutComponent a2;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new V.b(loader)) : null;
            if (eVar == null || (a2 = eVar.a()) == null) {
                return null;
            }
            kotlin.jvm.internal.i.d(loader, "loader");
            V.b bVar = new V.b(loader);
            int a3 = W.e.a();
            return a3 >= 2 ? new b0.d(a2) : a3 == 1 ? new C0129c(a2, bVar) : new C0127a();
        } catch (Throwable unused) {
            g gVar = g.f1939a;
            return null;
        }
    }
}
