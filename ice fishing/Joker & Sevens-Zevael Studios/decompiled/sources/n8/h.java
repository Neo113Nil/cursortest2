package n8;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends e {
    private Object obj;

    public h(Object obj) {
        this.obj = obj;
    }

    @Override // n8.e
    public Object resolve(b bVar) {
        j.e(bVar, "provider");
        return this.obj;
    }
}
