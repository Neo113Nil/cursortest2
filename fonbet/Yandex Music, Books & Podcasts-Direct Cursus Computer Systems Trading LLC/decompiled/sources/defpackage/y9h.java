package defpackage;

/* loaded from: classes.dex */
public abstract class y9h {
    public static final v9h a;
    public static final v9h b;

    static {
        zym zymVar = zym.c;
        v9h v9hVar = null;
        try {
            v9hVar = (v9h) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = v9hVar;
        b = new v9h();
    }
}
