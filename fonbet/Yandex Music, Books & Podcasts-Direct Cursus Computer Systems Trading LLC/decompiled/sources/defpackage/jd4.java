package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class jd4 {
    public static final Logger c = Logger.getLogger(zc4.class.getName());
    public final Object a = new Object();
    public final sue b;

    public jd4(sue sueVar, long j, String str) {
        this.b = sueVar;
        b(new jte(str.concat(" created"), ite.a, j, null));
    }

    public static void a(sue sueVar, Level level, String str) {
        Logger logger = c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + sueVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(jte jteVar) {
        int ordinal = jteVar.b.ordinal();
        Level level = ordinal != 2 ? ordinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.a) {
        }
        a(this.b, level, jteVar.a);
    }
}
