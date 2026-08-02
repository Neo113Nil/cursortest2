package ru.CryptoPro.JCP.tools.logger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import ru.CryptoPro.JCP.Util.HexDumpEncoder;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface;

/* loaded from: classes4.dex */
public final class BasicLogger extends DefaultLogger {
    public final Logger c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public BasicLogger(String str) {
        Level level;
        Logger logger = Logger.getLogger(str);
        this.c = logger;
        if (logger == null) {
            level = null;
        } else {
            Level level2 = logger.getLevel();
            if (level2 == null) {
                Logger logger2 = logger;
                level = level2;
                while (level == null) {
                    logger2 = logger2.getParent();
                    if (logger2 == null) {
                        break;
                    } else {
                        level = logger2.getLevel();
                    }
                }
            } else {
                level = level2;
            }
        }
        this.d = b(level, Level.SEVERE);
        this.e = b(level, Level.WARNING);
        this.f = b(level, Level.INFO);
        this.g = b(level, Level.CONFIG);
        this.h = b(level, Level.FINE);
        this.i = b(level, Level.FINER);
        this.j = b(level, Level.FINEST);
        this.k = b(level, Level.ALL);
    }

    public static DefaultLoggerInterface.CallerDescription c() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[3];
        return new DefaultLoggerInterface.CallerDescription(stackTraceElement.getClassName(), stackTraceElement.getMethodName());
    }

    public static boolean checkLogActualLevel(Level level, Level level2) {
        return level != null && level2.intValue() >= level.intValue();
    }

    public final boolean b(Level level, Level level2) {
        return (this.c == null || level == null || level2.intValue() < level.intValue()) ? false : true;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void dump(String str, Object obj, ByteBuffer byteBuffer) {
        if (this.k) {
            DefaultLoggerInterface.CallerDescription c = c();
            HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(10);
            try {
                hexDumpEncoder.encodeBuffer(byteBuffer, byteArrayOutputStream);
                this.c.logp(Level.ALL, c.name, c.method, a("{0} {1} {2}"), new Object[]{str, obj, byteArrayOutputStream.toString()});
            } catch (IOException unused) {
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void enter(Object obj, Object obj2) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.FINER;
            String str = c.name;
            String str2 = c.method;
            String a = a("ENTRY {0} {1}");
            this.c.logp(level, str, str2, a, new Object[]{obj, obj2});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void exit(Object obj) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINER, c.name, c.method, a("RETURN {0}"), obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(String str, Object obj) {
        if (this.d) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.SEVERE;
            String str2 = c.name;
            String str3 = c.method;
            String a = a("{0} {1}");
            this.c.logp(level, str2, str3, a, new Object[]{str, obj});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fine(String str, Object obj) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.FINE;
            String str2 = c.name;
            String str3 = c.method;
            String a = a("{0} {1}");
            this.c.logp(level, str2, str3, a, new Object[]{str, obj});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fineArray(String str, byte[] bArr) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            Object[] objArr = {str, Integer.valueOf(bArr.length), HexString.toHex(bArr)};
            this.c.logp(Level.FINE, c.name, c.method, a("{0}{1}:{2}"), objArr);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fineFormat(String str, Object... objArr) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINE, c.name, c.method, a(str), objArr);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void finer(String str, Object obj) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.FINER;
            String str2 = c.name;
            String str3 = c.method;
            String a = a("{0} {1}");
            this.c.logp(level, str2, str3, a, new Object[]{str, obj});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void finerFormat(String str, Object... objArr) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINER, c.name, c.method, a(str), objArr);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void ignoredException(Throwable th) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINE, c.name, c.method, a("IGNORE THROWN"), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void info(String str, Object obj) {
        if (this.f) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.INFO;
            String str2 = c.name;
            String str3 = c.method;
            String a = a("{0} {1}");
            this.c.logp(level, str2, str3, a, new Object[]{str, obj});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void infoFormat(String str, Object... objArr) {
        if (this.f) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.INFO, c.name, c.method, a(str), objArr);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isAllEnabled() {
        return this.k;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isConfigEnabled() {
        return this.g;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isFineEnabled() {
        return this.h;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isFinerEnabled() {
        return this.i;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isFinestEnabled() {
        return this.j;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isInfoEnabled() {
        return this.f;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isSevereEnabled() {
        return this.d;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isWarningEnabled() {
        return this.e;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void pref(Preferences preferences, String str, Object obj) {
        if (this.g) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.CONFIG;
            String str2 = c.name;
            String str3 = c.method;
            String a = a("{0}.{1}={2}");
            this.c.logp(level, str2, str3, a, new Object[]{preferences, str, obj});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subEnter(Object obj, Object obj2) {
        if (this.j) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.FINEST;
            String str = c.name;
            String str2 = c.method;
            String a = a("ENTRY {0} {1}");
            this.c.logp(level, str, str2, a, new Object[]{obj, obj2});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subExit(Object obj) {
        if (this.j) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINEST, c.name, c.method, a("RETURN {0}"), obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subThrown(Throwable th) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINER, c.name, c.method, a("THROW"), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void thrown(Throwable th) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINE, c.name, c.method, a("THROW"), th);
        }
    }

    public String toString() {
        return this.c.getName();
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(String str, Throwable th) {
        Throwable th2;
        Level level;
        String str2;
        String str3;
        String a;
        if (this.e) {
            DefaultLoggerInterface.CallerDescription c = c();
            Logger logger = this.c;
            if (str == null) {
                level = Level.WARNING;
                str2 = c.name;
                str3 = c.method;
                a = a("ERROR");
                th2 = th;
            } else {
                th2 = th;
                level = Level.WARNING;
                str2 = c.name;
                str3 = c.method;
                a = a(str);
            }
            logger.logp(level, str2, str3, a, th2);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void exit() {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINER, c.name, c.method, a("RETURN"));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void ignoredException(String str, Throwable th) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINE, c.name, c.method, a(str), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subExit() {
        if (this.j) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINEST, c.name, c.method, a("RETURN"));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subThrown(String str, Throwable th) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINER, c.name, c.method, a(str), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void thrown(String str, Throwable th) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINE, c.name, c.method, a(str), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void enter(Object obj) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINER, c.name, c.method, a("ENTRY {0}"), obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subEnter(Object obj) {
        if (this.j) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINEST, c.name, c.method, a("ENTRY {0}"), obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void enter() {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINER, c.name, c.method, a("ENTRY"));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(String str) {
        if (this.d) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.SEVERE, c.name, c.method, a(str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fine(String str) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINE, c.name, c.method, a(str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void finer(String str) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINER, c.name, c.method, a(str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void info(String str) {
        if (this.f) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.INFO, c.name, c.method, a(str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subEnter() {
        if (this.j) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINEST, c.name, c.method, a("ENTRY"));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void enter(Object obj, Object obj2, Object obj3) {
        if (this.i) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.FINER;
            String str = c.name;
            String str2 = c.method;
            String a = a("ENTRY {0} {1} {2}");
            this.c.logp(level, str, str2, a, new Object[]{obj, obj2, obj3});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(String str, Throwable th) {
        if (this.d) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.SEVERE, c.name, c.method, a(str), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fine(String str, Throwable th) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINE, c.name, c.method, a(str), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void info(String str, Throwable th) {
        if (this.f) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.INFO, c.name, c.method, a(str), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(String str, Object... objArr) {
        if (this.d) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.SEVERE, c.name, c.method, a(str), objArr);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fine(String str, Object... objArr) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.FINE, c.name, c.method, a(str), objArr);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(Throwable th) {
        if (this.d) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.SEVERE, c.name, c.method, a("ERROR"), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fineArray(String str, int[] iArr) {
        if (this.h) {
            DefaultLoggerInterface.CallerDescription c = c();
            Object[] objArr = {str, Integer.valueOf(iArr.length), HexString.toHex(iArr)};
            this.c.logp(Level.FINE, c.name, c.method, a("{0}{1}:{2}"), objArr);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(String str, Object obj) {
        if (this.e) {
            DefaultLoggerInterface.CallerDescription c = c();
            Level level = Level.WARNING;
            String str2 = c.name;
            String str3 = c.method;
            String a = a("{0} {1}");
            this.c.logp(level, str2, str3, a, new Object[]{str, obj});
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(String str) {
        if (this.e) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.WARNING, c.name, c.method, a(str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(String str, Object... objArr) {
        if (this.e) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.WARNING, c.name, c.method, a(str), objArr);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(Throwable th) {
        if (this.e) {
            DefaultLoggerInterface.CallerDescription c = c();
            this.c.logp(Level.WARNING, c.name, c.method, a("ERROR"), th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void dump(String str, ByteBuffer byteBuffer) {
        if (this.k) {
            DefaultLoggerInterface.CallerDescription c = c();
            HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(10);
            try {
                hexDumpEncoder.encodeBuffer(byteBuffer, byteArrayOutputStream);
                this.c.logp(Level.ALL, c.name, c.method, a("{0} {1}"), new Object[]{str, byteArrayOutputStream.toString()});
            } catch (IOException unused) {
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void dump(String str, byte[] bArr) {
        if (this.k) {
            DefaultLoggerInterface.CallerDescription c = c();
            HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(10);
            try {
                hexDumpEncoder.encodeBuffer(bArr, byteArrayOutputStream);
                this.c.logp(Level.ALL, c.name, c.method, a("{0} {1}"), new Object[]{str, byteArrayOutputStream.toString()});
            } catch (IOException unused) {
            }
        }
    }
}
