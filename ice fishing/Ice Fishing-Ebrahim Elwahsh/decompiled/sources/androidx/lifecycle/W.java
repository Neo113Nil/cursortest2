package androidx.lifecycle;

/* loaded from: classes.dex */
public class W implements V {

    /* renamed from: a, reason: collision with root package name */
    public static W f5264a;

    @Override // androidx.lifecycle.V
    public S a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            kotlin.jvm.internal.h.d(newInstance, "{\n                modelC…wInstance()\n            }");
            return (S) newInstance;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }
}
