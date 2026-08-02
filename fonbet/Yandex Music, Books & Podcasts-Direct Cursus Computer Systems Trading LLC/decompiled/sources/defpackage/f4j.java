package defpackage;

/* loaded from: classes.dex */
public abstract class f4j {
    public static final c4j a;
    public static final c4j b;

    static {
        zym zymVar = zym.c;
        c4j c4jVar = null;
        try {
            c4jVar = (c4j) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c4jVar;
        b = new c4j();
    }
}
