package defpackage;

import com.google.android.gms.internal.measurement.y0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class sxa1 {
    public static awa1 b() {
        String o;
        ClassLoader classLoader = sxa1.class.getClassLoader();
        if (awa1.class.equals(awa1.class)) {
            o = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!awa1.class.getPackage().equals(sxa1.class.getPackage())) {
                ny61.g(awa1.class.getName());
                return null;
            }
            o = unr0.o(awa1.class.getPackage().getName(), ".BlazeGenerated", awa1.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (awa1) awa1.class.cast(((sxa1) Class.forName(o, true, classLoader).getConstructor(null).newInstance(null)).a());
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
            Iterator it = ServiceLoader.load(sxa1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((awa1) awa1.class.cast(((sxa1) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(y0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(awa1.class.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (awa1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (awa1) awa1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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

    public abstract awa1 a();
}
