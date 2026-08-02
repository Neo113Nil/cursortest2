package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final /* synthetic */ class mn5 implements uzm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mn5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uzm
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new dye("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new dye(hrg.q("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new dye(hrg.q("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new dye(f1d.g("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new dye(f1d.g("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new bbe((aec) this.b);
        }
    }
}
