package N3;

import D.y;
import a4.C0429b;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2162b;

    public /* synthetic */ d(int i, Object obj) {
        this.f2161a = i;
        this.f2162b = obj;
    }

    @Override // Y3.a
    public final Object get() {
        switch (this.f2161a) {
            case 0:
                String str = (String) this.f2162b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e6) {
                    throw new m(y.k("Could not instantiate ", str, com.anythink.core.common.d.j.f12535z), e6);
                } catch (InstantiationException e9) {
                    throw new m(y.k("Could not instantiate ", str, com.anythink.core.common.d.j.f12535z), e9);
                } catch (NoSuchMethodException e10) {
                    throw new m(AbstractC5051n.f("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new m(AbstractC5051n.f("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f2162b;
            default:
                return new C0429b((K3.g) this.f2162b);
        }
    }
}
