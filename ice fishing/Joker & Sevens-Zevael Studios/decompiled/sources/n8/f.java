package n8;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends e {
    private final oc.c create;
    private Object obj;

    public f(oc.c cVar) {
        j.e(cVar, "create");
        this.create = cVar;
    }

    @Override // n8.e
    public Object resolve(b bVar) {
        j.e(bVar, "provider");
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Object invoke = this.create.invoke(bVar);
        this.obj = invoke;
        return invoke;
    }
}
