package W6;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final TimeUnit f3491g = TimeUnit.MINUTES;

    /* renamed from: a, reason: collision with root package name */
    public final Logger f3492a;

    /* renamed from: c, reason: collision with root package name */
    public final g f3494c;

    /* renamed from: d, reason: collision with root package name */
    public final g f3495d;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f3493b = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final double f3496e = 1.0d;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f3497f = f3491g;

    public l(Logger logger) {
        this.f3492a = logger;
        this.f3494c = new g(5.0d / r10.toSeconds(1L), 5.0d);
        this.f3495d = new g(1.0d / r10.toSeconds(1L), 1.0d);
    }

    public final void a(Level level, String str, Throwable th) {
        Logger logger = this.f3492a;
        if (logger.isLoggable(level)) {
            AtomicBoolean atomicBoolean = this.f3493b;
            boolean z8 = atomicBoolean.get();
            g gVar = this.f3495d;
            if (z8) {
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
            if (this.f3494c.a(1.0d)) {
                if (th != null) {
                    logger.log(level, str, th);
                    return;
                } else {
                    logger.log(level, str);
                    return;
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                double d2 = this.f3496e;
                gVar.a(d2);
                String obj = this.f3497f.toString();
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
