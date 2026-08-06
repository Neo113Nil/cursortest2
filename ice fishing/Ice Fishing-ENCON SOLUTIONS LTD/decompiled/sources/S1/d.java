package S1;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1778a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int min;
        kotlin.jvm.internal.i.e(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f1776a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.i.d(loggerName, "record.loggerName");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i2 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        kotlin.jvm.internal.i.d(message, "record.message");
        Throwable thrown = record.getThrown();
        String str = (String) c.f1777b.get(loggerName);
        if (str == null) {
            str = z1.g.j0(23, loggerName);
        }
        if (Log.isLoggable(str, i2)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i3 = 0;
            while (i3 < length) {
                int X2 = z1.g.X(message, '\n', i3, false, 4);
                if (X2 == -1) {
                    X2 = length;
                }
                while (true) {
                    min = Math.min(X2, i3 + 4000);
                    String substring = message.substring(i3, min);
                    kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i2, str, substring);
                    if (min >= X2) {
                        break;
                    } else {
                        i3 = min;
                    }
                }
                i3 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
