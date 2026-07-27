package l6;

import D.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: l6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4698e {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f39058a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC4695b f39059b;

    static {
        ArrayList arrayList;
        InterfaceC4695b interfaceC4695b = EnumC4706m.f39076n;
        f39058a = Logger.getLogger(AbstractC4698e.class.getName());
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if (!com.anythink.core.express.b.a.f17688f.equals(property)) {
            ClassLoader classLoader = AbstractC4698e.class.getClassLoader();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(InterfaceC4696c.class, classLoader).iterator();
            if (it.hasNext()) {
                throw y.h(it);
            }
            if (!arrayList2.isEmpty()) {
                if (!property.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        throw y.h(it2);
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
            interfaceC4695b = new C4703j();
        }
        synchronized (AbstractC4697d.f39057b) {
            arrayList = AbstractC4697d.f39056a;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            interfaceC4695b = (InterfaceC4695b) ((Function) it3.next()).apply(interfaceC4695b);
        }
        f39059b = interfaceC4695b;
        synchronized (AbstractC4697d.f39057b) {
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            f39058a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
