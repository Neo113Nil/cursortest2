package U7;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3259a = new i();

    public static c a(int i, a aVar, int i6) {
        if ((i6 & 2) != 0) {
            aVar = a.f3219n;
        }
        if (i == -2) {
            if (aVar != a.f3219n) {
                return new n(1, aVar);
            }
            g.f3257h0.getClass();
            return new c(f.f3256b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == a.f3219n ? new c(i) : new n(i, aVar) : new c(Integer.MAX_VALUE) : aVar == a.f3219n ? new c(0) : new n(1, aVar);
        }
        if (aVar == a.f3219n) {
            return new n(1, a.f3220u);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final Throwable b(Object obj) {
        h hVar = obj instanceof h ? (h) obj : null;
        if (hVar != null) {
            return hVar.f3258a;
        }
        return null;
    }
}
