package defpackage;

/* loaded from: classes.dex */
public abstract class g1c {
    public static final d1c a = new d1c();
    public static final d1c b;

    static {
        zym zymVar = zym.c;
        d1c d1cVar = null;
        try {
            d1cVar = (d1c) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = d1cVar;
    }
}
