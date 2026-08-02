package defpackage;

/* loaded from: classes5.dex */
public final class h2a extends nwi {
    public static final boolean a;

    static {
        boolean z = false;
        try {
            Class.forName("android.app.Application", false, h2a.class.getClassLoader());
            z = true;
        } catch (Exception unused) {
        }
        a = z;
    }
}
