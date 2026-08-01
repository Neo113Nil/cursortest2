package a7;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final TimeUnit f4380g = TimeUnit.MINUTES;

    /* renamed from: a, reason: collision with root package name */
    public final Logger f4381a;

    /* renamed from: c, reason: collision with root package name */
    public final g f4383c;

    /* renamed from: d, reason: collision with root package name */
    public final g f4384d;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4382b = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final double f4385e = 1.0d;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f4386f = f4380g;

    public l(Logger logger) {
        this.f4381a = logger;
        this.f4383c = new g(5.0d / r10.toSeconds(1L), 5.0d);
        this.f4384d = new g(1.0d / r10.toSeconds(1L), 1.0d);
    }

    public final void a(Level level, String str, Throwable th) {
        Logger logger = this.f4381a;
        if (logger.isLoggable(level)) {
            AtomicBoolean atomicBoolean = this.f4382b;
            boolean z3 = atomicBoolean.get();
            g gVar = this.f4384d;
            if (z3) {
                if (gVar.a(1.0d)) {
                    if (th != null) {
                        logger.log(level, str, th);
                        return;
                    } else {
                        logger.log(level, str);
                        return;
                    }
                }
                return;
            }
            if (this.f4383c.a(1.0d)) {
                if (th != null) {
                    logger.log(level, str, th);
                    return;
                } else {
                    logger.log(level, str);
                    return;
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                double d2 = this.f4385e;
                gVar.a(d2);
                String obj = this.f4386f.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = obj.toLowerCase(locale);
                logger.log(level, String.format(locale, "Too many log messages detected. Will only log %.0f time(s) per %s from now on.", Double.valueOf(d2), lowerCase.substring(0, lowerCase.length() - 1)));
                if (th != null) {
                    logger.log(level, str, th);
                } else {
                    logger.log(level, str);
                }
            }
        }
    }
}
