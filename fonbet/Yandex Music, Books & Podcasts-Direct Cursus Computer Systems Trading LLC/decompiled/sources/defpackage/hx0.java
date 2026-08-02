package defpackage;

/* loaded from: classes.dex */
public final class hx0 extends rvf {
    public static volatile hx0 b;
    public static final gx0 c = new gx0(0);
    public final gs7 a = new gs7();

    public static hx0 Z() {
        if (b != null) {
            return b;
        }
        synchronized (hx0.class) {
            try {
                if (b == null) {
                    b = new hx0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
