package defpackage;

/* loaded from: classes.dex */
public abstract class y8g {
    public static final w8g a;
    public static final w8g b;

    static {
        zym zymVar = zym.c;
        w8g w8gVar = null;
        try {
            w8gVar = (w8g) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = w8gVar;
        b = new w8g();
    }
}
