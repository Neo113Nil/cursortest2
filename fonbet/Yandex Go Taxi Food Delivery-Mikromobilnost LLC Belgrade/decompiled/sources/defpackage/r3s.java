package defpackage;

import ru.yandex.logistics.cargo_form.async.impl.interactor.b;
import ru.yandex.logistics.sdk.cargo_form.core.impl.repository.c;

/* loaded from: classes5.dex */
public final class r3s {
    public final l6s a;
    public final b b;
    public final c c;

    public r3s(l6s l6sVar, b bVar, c cVar) {
        this.a = l6sVar;
        this.b = bVar;
        this.c = cVar;
    }

    public final void a(String str, Object obj, Object obj2) {
        j6s b = this.c.b();
        this.b.b(new wa3(str, b != null ? this.a.f(b) : kotlin.collections.b.f(), obj, obj2));
    }
}
