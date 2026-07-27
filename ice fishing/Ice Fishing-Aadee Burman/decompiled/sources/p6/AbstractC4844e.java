package p6;

import D.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: p6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4844e {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f39775a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC4841b f39776b;

    static {
        ArrayList arrayList;
        InterfaceC4841b interfaceC4841b = EnumC4852m.f39793n;
        f39775a = Logger.getLogger(AbstractC4844e.class.getName());
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if (!com.anythink.core.express.b.a.f17530f.equals(property)) {
            ClassLoader classLoader = AbstractC4844e.class.getClassLoader();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(InterfaceC4842c.class, classLoader).iterator();
            if (it.hasNext()) {
                throw y.j(it);
            }
            if (!arrayList2.isEmpty()) {
                if (!property.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        throw y.j(it2);
                    }
                    atomicReference.set(new IllegalStateException("io.opentelemetry.context.contextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList2));
                } else {
                    if (arrayList2.size() == 1) {
                        arrayList2.get(0).getClass();
                        throw new ClassCastException();
                    }
                    atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.contextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                }
            }
        }
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            interfaceC4841b = new C4849j();
        }
        synchronized (AbstractC4843d.f39774b) {
            arrayList = AbstractC4843d.f39773a;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            interfaceC4841b = (InterfaceC4841b) ((Function) it3.next()).apply(interfaceC4841b);
        }
        f39776b = interfaceC4841b;
        synchronized (AbstractC4843d.f39774b) {
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            f39775a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
