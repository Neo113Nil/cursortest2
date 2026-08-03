package l7;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements w7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4221b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f4220a = i10;
        this.f4221b = obj;
    }

    @Override // w7.a
    public final Object get() {
        switch (this.f4220a) {
            case 0:
                String str = (String) this.f4221b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new m(a4.d.j("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new m(a4.d.j("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new m("Could not instantiate " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new m("Could not instantiate " + str, e13);
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return (ComponentRegistrar) this.f4221b;
            default:
                return new y7.c((i7.g) this.f4221b);
        }
    }
}
