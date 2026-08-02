package defpackage;

import com.google.android.gms.internal.play_billing.n;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes11.dex */
public abstract class t4a1 {
    public static k2a1 b() {
        String o;
        ClassLoader classLoader = t4a1.class.getClassLoader();
        if (k2a1.class.equals(k2a1.class)) {
            o = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!k2a1.class.getPackage().equals(t4a1.class.getPackage())) {
                ny61.g(k2a1.class.getName());
                return null;
            }
            o = unr0.o(k2a1.class.getPackage().getName(), ".BlazeGenerated", k2a1.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (k2a1) k2a1.class.cast(((t4a1) Class.forName(o, true, classLoader).getConstructor(null).newInstance(null)).a());
                    } catch (InvocationTargetException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InstantiationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(t4a1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((k2a1) k2a1.class.cast(((t4a1) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(n.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(k2a1.class.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (k2a1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (k2a1) k2a1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                ny61.o(e6);
                return null;
            } catch (NoSuchMethodException e7) {
                ny61.o(e7);
                return null;
            } catch (InvocationTargetException e8) {
                ny61.o(e8);
                return null;
            }
        }
    }

    public abstract k2a1 a();
}
