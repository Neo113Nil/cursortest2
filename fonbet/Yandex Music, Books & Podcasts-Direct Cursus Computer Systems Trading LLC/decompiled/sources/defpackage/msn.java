package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class msn {
    public static final Logger a = Logger.getLogger(msn.class.getName());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e;

    static {
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Class cls, boolean z) {
        synchronized (msn.class) {
            ConcurrentHashMap concurrentHashMap = b;
            if (concurrentHashMap.containsKey(str)) {
                ksn ksnVar = (ksn) concurrentHashMap.get(str);
                if (ksnVar.a.getClass().equals(cls)) {
                    if (z && !((Boolean) d.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                    return;
                }
                a.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + ksnVar.a.getClass().getName() + ", cannot be re-registered with " + cls.getName());
            }
        }
    }

    public static synchronized ksn b(String str) {
        ksn ksnVar;
        synchronized (msn.class) {
            ConcurrentHashMap concurrentHashMap = b;
            if (!concurrentHashMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            ksnVar = (ksn) concurrentHashMap.get(str);
        }
        return ksnVar;
    }

    public static Object c(String str, byte[] bArr) {
        jn3 jn3Var = mn3.b;
        return d(str, mn3.n(bArr, 0, bArr.length), un.class);
    }

    public static Object d(String str, mn3 mn3Var, Class cls) {
        ksn b2 = b(str);
        Set keySet = ((Map) b2.a.b).keySet();
        j5 j5Var = b2.a;
        if (!keySet.contains(cls)) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(j5Var.getClass());
            sb.append(", supported primitives: ");
            Set<Class> keySet2 = ((Map) j5Var.b).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : keySet2) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!((Map) j5Var.b).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + j5Var.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                d8 s = j5Var.s(mn3Var);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                j5Var.v(s);
                fo foVar = (fo) ((Map) j5Var.b).get(cls);
                if (foVar != null) {
                    return foVar.a(s);
                }
                b6e.v(cls.getCanonicalName(), " not supported.", "Requested primitive class ");
                return null;
            } catch (aye e2) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) j5Var.a).getName()), e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new GeneralSecurityException("Primitive type not supported", e3);
        }
    }

    public static synchronized oaf e(hbf hbfVar) {
        oaf q;
        synchronized (msn.class) {
            j5 j5Var = b(hbfVar.r()).a;
            mka mkaVar = new mka(j5Var, (Class) j5Var.c);
            if (!((Boolean) d.get(hbfVar.r())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + hbfVar.r());
            }
            q = mkaVar.q(hbfVar.s());
        }
        return q;
    }

    public static synchronized void f(j5 j5Var, boolean z) {
        synchronized (msn.class) {
            try {
                String n = j5Var.n();
                a(n, j5Var.getClass(), z);
                ConcurrentHashMap concurrentHashMap = b;
                if (!concurrentHashMap.containsKey(n)) {
                    concurrentHashMap.put(n, new ksn(j5Var));
                    c.put(n, new i5l());
                }
                d.put(n, Boolean.valueOf(z));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void g(jsm jsmVar) {
        synchronized (msn.class) {
            try {
                Class c2 = jsmVar.c();
                ConcurrentHashMap concurrentHashMap = e;
                if (concurrentHashMap.containsKey(c2)) {
                    jsm jsmVar2 = (jsm) concurrentHashMap.get(c2);
                    if (!jsmVar.getClass().equals(jsmVar2.getClass())) {
                        a.warning("Attempted overwrite of a registered SetWrapper for type " + c2);
                        throw new GeneralSecurityException("SetWrapper for primitive (" + c2.getName() + ") is already registered to be " + jsmVar2.getClass().getName() + ", cannot be re-registered with " + jsmVar.getClass().getName());
                    }
                }
                concurrentHashMap.put(c2, jsmVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
