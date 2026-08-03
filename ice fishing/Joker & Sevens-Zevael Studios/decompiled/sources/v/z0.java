package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface z0 {
    Object a();

    default boolean b(u.v vVar, u.v vVar2) {
        return vVar.equals(a()) && vVar2.equals(c());
    }

    Object c();
}
