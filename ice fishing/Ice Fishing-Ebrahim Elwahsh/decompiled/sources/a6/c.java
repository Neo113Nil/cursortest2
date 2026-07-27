package a6;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f4388a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4389b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0432b f4390c;

    /* renamed from: d, reason: collision with root package name */
    public static Throwable f4391d;

    public static C0432b a() {
        try {
            Class<?> cls = Class.forName("io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk");
            boolean parseBoolean = Boolean.parseBoolean(g6.d.b("otel.java.global-autoconfigure.enabled", "false"));
            Logger logger = f4388a;
            if (!parseBoolean) {
                logger.log(Level.INFO, "AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true");
                return null;
            }
            try {
                try {
                    return new C0432b((d) cls.getMethod("getOpenTelemetrySdk", new Class[0]).invoke(cls.getMethod("initialize", new Class[0]).invoke(null, new Object[0]), new Object[0]));
                } catch (IllegalAccessException e6) {
                    e = e6;
                    throw new IllegalStateException("AutoConfiguredOpenTelemetrySdk detected on classpath but could not invoke initialize method. This is a bug in OpenTelemetry.", e);
                }
            } catch (IllegalAccessException | NoSuchMethodException e9) {
                e = e9;
            } catch (InvocationTargetException e10) {
                logger.log(Level.SEVERE, "Error automatically configuring OpenTelemetry SDK. OpenTelemetry will not be enabled.", e10.getTargetException());
                return null;
            }
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void b(C0431a c0431a) {
        synchronized (f4389b) {
            try {
                if (f4390c != null) {
                    throw new IllegalStateException("GlobalOpenTelemetry.set has already been called. GlobalOpenTelemetry.set must be called only once before any calls to GlobalOpenTelemetry.get. If you are using the OpenTelemetrySdk, use OpenTelemetrySdkBuilder.buildAndRegisterGlobal instead. Previous invocation set to cause of this exception.", f4391d);
                }
                f4390c = new C0432b(c0431a);
                f4391d = new Throwable();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
