package y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public static final g f8437g = new g(2);

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        l lVar = (l) obj2;
        if (str.length() == 0) {
            return lVar.toString();
        }
        return str + ", " + lVar;
    }
}
