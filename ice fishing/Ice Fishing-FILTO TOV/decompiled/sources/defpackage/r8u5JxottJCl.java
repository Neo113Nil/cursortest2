package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class r8u5JxottJCl {
    public static final Class GWasM1elztuh;
    public static final boolean Yi7zF1RB1;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        GWasM1elztuh = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        Yi7zF1RB1 = cls2 != null;
    }

    public static boolean GWasM1elztuh() {
        return (GWasM1elztuh == null || Yi7zF1RB1) ? false : true;
    }
}
