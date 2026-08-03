package o;

import java.util.HashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f5112k = new HashMap();

    @Override // o.f
    public final c a(Object obj) {
        return (c) this.f5112k.get(obj);
    }

    @Override // o.f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f5112k.remove(obj);
        return b2;
    }
}
