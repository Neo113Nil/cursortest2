package v4;

import I7.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c implements InterfaceC5114a {
    private final List<e> registrations = new ArrayList();

    @Override // v4.InterfaceC5114a
    public d build() {
        return new d(this.registrations);
    }

    public final /* synthetic */ <T> e register() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    @Override // v4.InterfaceC5114a
    public <T> e register(Class<T> c9) {
        kotlin.jvm.internal.h.e(c9, "c");
        g gVar = new g(c9);
        this.registrations.add(gVar);
        return gVar;
    }

    @Override // v4.InterfaceC5114a
    public <T> e register(l create) {
        kotlin.jvm.internal.h.e(create, "create");
        f fVar = new f(create);
        this.registrations.add(fVar);
        return fVar;
    }

    @Override // v4.InterfaceC5114a
    public <T> e register(T t6) {
        h hVar = new h(t6);
        this.registrations.add(hVar);
        return hVar;
    }
}
