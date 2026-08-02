package T3;

import D.x;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import e4.InterfaceC4481a;
import g4.C4533b;
import java.lang.reflect.InvocationTargetException;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC4481a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3177b;

    public /* synthetic */ d(int i, Object obj) {
        this.f3176a = i;
        this.f3177b = obj;
    }

    @Override // e4.InterfaceC4481a
    public final Object get() {
        switch (this.f3176a) {
            case 0:
                String str = (String) this.f3177b;
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
                    throw new m(x.l("Could not instantiate ", str, com.anythink.core.common.d.j.f13164z), e9);
                } catch (InstantiationException e10) {
                    throw new m(x.l("Could not instantiate ", str, com.anythink.core.common.d.j.f13164z), e10);
                } catch (NoSuchMethodException e11) {
                    throw new m(AbstractC5128c.f("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new m(AbstractC5128c.f("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f3177b;
            default:
                return new C4533b((Q3.g) this.f3177b);
        }
    }
}
