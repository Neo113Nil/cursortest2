package R3;

import D.y;
import android.util.Log;
import c4.InterfaceC0542a;
import com.google.firebase.components.ComponentRegistrar;
import e4.C4464b;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0542a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2722b;

    public /* synthetic */ d(int i, Object obj) {
        this.f2721a = i;
        this.f2722b = obj;
    }

    @Override // c4.InterfaceC0542a
    public final Object get() {
        switch (this.f2721a) {
            case 0:
                String str = (String) this.f2722b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e9) {
                    throw new m(y.o("Could not instantiate ", str, com.anythink.core.common.d.j.f12378z), e9);
                } catch (InstantiationException e10) {
                    throw new m(y.o("Could not instantiate ", str, com.anythink.core.common.d.j.f12378z), e10);
                } catch (NoSuchMethodException e11) {
                    throw new m(u1.h.f("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new m(u1.h.f("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f2722b;
            default:
                return new C4464b((O3.g) this.f2722b);
        }
    }
}
