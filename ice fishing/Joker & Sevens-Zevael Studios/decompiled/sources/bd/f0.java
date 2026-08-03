package bd;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends cd.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1095a = new AtomicReference(null);

    @Override // cd.d
    public final boolean a(cd.b bVar) {
        AtomicReference atomicReference = this.f1095a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(u.f1155b);
        return true;
    }

    @Override // cd.d
    public final fc.d[] b(cd.b bVar) {
        this.f1095a.set(null);
        return cd.c.f1341a;
    }
}
