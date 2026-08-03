package y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface l extends n {
    @Override // y0.n
    default boolean a(oc.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }

    @Override // y0.n
    default Object c(Object obj, oc.e eVar) {
        return eVar.invoke(obj, this);
    }
}
