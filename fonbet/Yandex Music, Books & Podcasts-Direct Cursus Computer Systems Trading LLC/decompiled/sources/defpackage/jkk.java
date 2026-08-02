package defpackage;

/* loaded from: classes5.dex */
public abstract class jkk {
    public static final jee a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    static {
        Object obj;
        Class<?> cls;
        jee jeeVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                jeeVar = (jee) cls.asSubclass(jee.class).getConstructor(e3s.class).newInstance(jee.a);
            } catch (Throwable th2) {
                obj = th2;
            }
            if (jeeVar == null) {
                a = jeeVar;
            } else {
                a = new jee();
            }
            if (obj == null) {
                try {
                    if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                        Class<?> cls2 = Class.forName("java.util.logging.Logger");
                        Object invoke = cls2.getMethod("getLogger", String.class).invoke(null, jkk.class.getName());
                        Class<?> cls3 = Class.forName("java.util.logging.Level");
                        cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(invoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        jeeVar = null;
        if (jeeVar == null) {
        }
        if (obj == null) {
        }
    }

    public static void a() {
        a.getClass();
    }

    public static void b() {
        a.getClass();
    }

    public static void c() {
        a.getClass();
    }
}
