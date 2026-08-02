package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* loaded from: classes9.dex */
public final class ra2 extends Handler {
    public static final ra2 a = new ra2();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        CopyOnWriteArraySet copyOnWriteArraySet = pa2.a;
        String loggerName = logRecord.getLoggerName();
        pa2.a(sua1.b(logRecord), loggerName, logRecord.getThrown(), logRecord.getMessage());
    }
}
