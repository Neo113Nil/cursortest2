package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public abstract class rsg {
    public static volatile int a;
    public static final dwi b = new dwi(1);
    public static final dwi c = new dwi(0);
    public static final boolean d;
    public static volatile dwi e;
    public static final String[] f;

    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        d = str == null ? false : str.equalsIgnoreCase(PListParser.TAG_TRUE);
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        final ClassLoader classLoader = rsg.class.getClassLoader();
        ServiceLoader load = System.getSecurityManager() == null ? ServiceLoader.load(dwi.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: qsg
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(dwi.class, classLoader);
            }
        });
        ArrayList arrayList = new ArrayList();
        Iterator it = load.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((dwi) it.next());
            } catch (ServiceConfigurationError e2) {
                vut.Q("A SLF4J service provider failed to instantiate:\n" + e2.getMessage());
            }
        }
        return arrayList;
    }

    public static nsg b(Class cls) {
        int i;
        nsg c2 = c(cls.getName());
        if (d) {
            uut uutVar = vut.a;
            Class cls2 = null;
            if (uutVar == null) {
                if (vut.b) {
                    uutVar = null;
                } else {
                    try {
                        uutVar = new uut();
                    } catch (SecurityException unused) {
                        uutVar = null;
                    }
                    vut.a = uutVar;
                    vut.b = true;
                }
            }
            if (uutVar != null) {
                Class[] classContext = uutVar.getClassContext();
                String name = vut.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    xq0.q("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                vut.Q("Detected logger name mismatch. Given name: \"" + c2.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                vut.Q("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return c2;
    }

    public static nsg c(String str) {
        dwi dwiVar;
        s8e s8eVar;
        if (a == 0) {
            synchronized (rsg.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        d();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i == 1) {
            dwiVar = b;
        } else {
            if (i == 2) {
                xq0.q("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (i == 3) {
                dwiVar = e;
            } else {
                if (i != 4) {
                    xq0.q("Unreachable code");
                    return null;
                }
                dwiVar = c;
            }
        }
        switch (dwiVar.a) {
            case 0:
                s8eVar = (b2c) dwiVar.b;
                break;
            default:
                s8eVar = (qv7) dwiVar.b;
                break;
        }
        return s8eVar.c(str);
    }

    public static final void d() {
        try {
            ArrayList a2 = a();
            g(a2);
            if (a2.isEmpty()) {
                a = 4;
                vut.Q("No SLF4J providers were found.");
                vut.Q("Defaulting to no-operation (NOP) logger implementation");
                vut.Q("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = rsg.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e2) {
                    System.err.println("Error getting resources from path");
                    System.err.println("Reported exception:");
                    e2.printStackTrace();
                }
                f(linkedHashSet);
            } else {
                e = (dwi) a2.get(0);
                e.getClass();
                a = 3;
                if (!a2.isEmpty() && a2.size() > 1) {
                    vut.Q("Actual provider is of type [" + a2.get(0) + "]");
                }
            }
            e();
            if (a == 3) {
                try {
                    switch (e.a) {
                        case 0:
                            boolean z = false;
                            for (String str : f) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            vut.Q("The requested version 2.0.99 by your slf4j binding is not compatible with " + Arrays.asList(f).toString());
                            vut.Q("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    System.err.println("Unexpected problem occured during version sanity check");
                    System.err.println("Reported exception:");
                    th.printStackTrace();
                }
            }
        } catch (Exception e3) {
            a = 2;
            System.err.println("Failed to instantiate SLF4J LoggerFactory");
            System.err.println("Reported exception:");
            e3.printStackTrace();
            b6e.o("Unexpected initialization failure", e3);
        }
    }

    public static void e() {
        dwi dwiVar = b;
        synchronized (dwiVar) {
            try {
                ((qv7) dwiVar.b).a = true;
                qv7 qv7Var = (qv7) dwiVar.b;
                qv7Var.getClass();
                Iterator it = new ArrayList(((ConcurrentHashMap) qv7Var.b).values()).iterator();
                while (it.hasNext()) {
                    gpr gprVar = (gpr) it.next();
                    gprVar.b = c(gprVar.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) ((qv7) b.b).c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hpr hprVar = (hpr) it2.next();
                if (hprVar != null) {
                    gpr gprVar2 = hprVar.b;
                    String str = gprVar2.a;
                    if (gprVar2.b == null) {
                        xq0.q("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(gprVar2.b instanceof cwi)) {
                        if (!gprVar2.n()) {
                            vut.Q(str);
                        } else if (gprVar2.l(hprVar.a) && gprVar2.n()) {
                            try {
                                gprVar2.d.invoke(gprVar2.b, hprVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (hprVar.b.n()) {
                        vut.Q("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        vut.Q("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        vut.Q("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(hprVar.b.b instanceof cwi)) {
                        vut.Q("The following set of substitute loggers may have been accessed");
                        vut.Q("during the initialization phase. Logging calls during this");
                        vut.Q("phase were not honored. However, subsequent logging calls to these");
                        vut.Q("loggers will work as normally expected.");
                        vut.Q("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        qv7 qv7Var2 = (qv7) b.b;
        ((ConcurrentHashMap) qv7Var2.b).clear();
        ((LinkedBlockingQueue) qv7Var2.c).clear();
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        vut.Q("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            vut.Q("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        vut.Q("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            vut.Q("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vut.Q("Found provider [" + ((dwi) it.next()) + "]");
            }
            vut.Q("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
