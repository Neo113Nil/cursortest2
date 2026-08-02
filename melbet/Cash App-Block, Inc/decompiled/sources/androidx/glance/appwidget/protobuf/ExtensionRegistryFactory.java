package androidx.glance.appwidget.protobuf;

/* loaded from: classes3.dex */
public abstract class ExtensionRegistryFactory {
    public static final Class EXTENSION_REGISTRY_CLASS;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        EXTENSION_REGISTRY_CLASS = cls;
    }
}
