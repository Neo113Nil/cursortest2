package e6;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f37283a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Object f37284b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4484b f37285c;

    /* renamed from: d, reason: collision with root package name */
    public static Throwable f37286d;

    public static C4484b a() {
        try {
            Class<?> cls = Class.forName("io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk");
            boolean parseBoolean = Boolean.parseBoolean(k6.d.b("otel.java.global-autoconfigure.enabled", "false"));
            Logger logger = f37283a;
            if (!parseBoolean) {
                logger.log(Level.INFO, "AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true");
                return null;
            }
            try {
                try {
                    return new C4484b((d) cls.getMethod("getOpenTelemetrySdk", new Class[0]).invoke(cls.getMethod("initialize", new Class[0]).invoke(null, new Object[0]), new Object[0]));
                } catch (IllegalAccessException e9) {
                    e = e9;
                    throw new IllegalStateException("AutoConfiguredOpenTelemetrySdk detected on classpath but could not invoke initialize method. This is a bug in OpenTelemetry.", e);
                }
            } catch (IllegalAccessException | NoSuchMethodException e10) {
                e = e10;
            } catch (InvocationTargetException e11) {
                logger.log(Level.SEVERE, "Error automatically configuring OpenTelemetry SDK. OpenTelemetry will not be enabled.", e11.getTargetException());
                return null;
            }
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void b(C4483a c4483a) {
        synchronized (f37284b) {
            try {
                if (f37285c != null) {
                    throw new IllegalStateException("GlobalOpenTelemetry.set has already been called. GlobalOpenTelemetry.set must be called only once before any calls to GlobalOpenTelemetry.get. If you are using the OpenTelemetrySdk, use OpenTelemetrySdkBuilder.buildAndRegisterGlobal instead. Previous invocation set to cause of this exception.", f37286d);
                }
                f37285c = new C4484b(c4483a);
                f37286d = new Throwable();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
