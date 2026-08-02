package a7;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final TimeUnit f4348g = TimeUnit.MINUTES;

    /* renamed from: a, reason: collision with root package name */
    public final Logger f4349a;

    /* renamed from: c, reason: collision with root package name */
    public final g f4351c;

    /* renamed from: d, reason: collision with root package name */
    public final g f4352d;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4350b = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final double f4353e = 1.0d;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f4354f = f4348g;

    public l(Logger logger) {
        this.f4349a = logger;
        this.f4351c = new g(5.0d / r10.toSeconds(1L), 5.0d);
        this.f4352d = new g(1.0d / r10.toSeconds(1L), 1.0d);
    }

    public final void a(Level level, String str, Throwable th) {
        Logger logger = this.f4349a;
        if (logger.isLoggable(level)) {
            AtomicBoolean atomicBoolean = this.f4350b;
            boolean z6 = atomicBoolean.get();
            g gVar = this.f4352d;
            if (z6) {
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
            if (this.f4351c.a(1.0d)) {
                if (th != null) {
                    logger.log(level, str, th);
                    return;
                } else {
                    logger.log(level, str);
                    return;
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                double d9 = this.f4353e;
                gVar.a(d9);
                String obj = this.f4354f.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = obj.toLowerCase(locale);
                logger.log(level, String.format(locale, "Too many log messages detected. Will only log %.0f time(s) per %s from now on.", Double.valueOf(d9), lowerCase.substring(0, lowerCase.length() - 1)));
                if (th != null) {
                    logger.log(level, str, th);
                } else {
                    logger.log(level, str);
                }
            }
        }
    }
}
