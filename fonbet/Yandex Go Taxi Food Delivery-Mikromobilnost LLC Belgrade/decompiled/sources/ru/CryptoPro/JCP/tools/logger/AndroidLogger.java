package ru.CryptoPro.JCP.tools.logger;

import android.util.Log;
import defpackage.g8e;
import defpackage.oyr;
import defpackage.sa2;
import defpackage.unr0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;
import ru.CryptoPro.JCP.Util.HexDumpEncoder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface;

/* loaded from: classes4.dex */
public final class AndroidLogger extends DefaultLogger {
    public static final ArrayList d;
    public static final AtomicInteger e;
    public final String c;

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        e = new AtomicInteger(4);
        arrayList.add(new AndroidDefaultLogger());
    }

    public AndroidLogger(String str) {
        this.c = str;
    }

    public static synchronized void addExternalLogger(AndroidLoggingInterface androidLoggingInterface) {
        synchronized (AndroidLogger.class) {
            d.add(androidLoggingInterface);
        }
    }

    public static DefaultLoggerInterface.CallerDescription b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[3];
        return new DefaultLoggerInterface.CallerDescription(stackTraceElement.getClassName(), stackTraceElement.getMethodName());
    }

    public static synchronized void removeExternalLogger(String str) {
        synchronized (AndroidLogger.class) {
            d.removeIf(new sa2(str, 0));
        }
    }

    public static void setLoggingLevel(int i) {
        e.set(i);
    }

    public final synchronized void c(int i, String str, Throwable th, String str2) {
        try {
            String a = a(str2);
            Iterator it = d.iterator();
            while (it.hasNext()) {
                AndroidLoggingInterface androidLoggingInterface = (AndroidLoggingInterface) it.next();
                if (i == 2) {
                    androidLoggingInterface.onVerbose(str, a);
                } else if (i == 4) {
                    androidLoggingInterface.onInfo(str, a, th);
                } else if (i == 5) {
                    androidLoggingInterface.onWarning(str, a, th);
                } else if (i == 6) {
                    androidLoggingInterface.onError(str, a, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void dump(String str, Object obj, ByteBuffer byteBuffer) {
        if (isAllEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(10);
            try {
                hexDumpEncoder.encodeBuffer(byteBuffer, byteArrayOutputStream);
                c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " :: " + str + " :: " + obj + byteArrayOutputStream);
            } catch (IOException unused) {
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void enter(Object obj, Object obj2, Object obj3) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " ::  enter :: " + obj + " :: " + obj2 + " :: " + obj3);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void exit(Object obj) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " ::  exit :: " + obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(String str, Object... objArr) {
        if (isSevereEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            String str2 = str;
            for (int i = 0; i < objArr.length; i++) {
                String j = oyr.j(i, "{", "}");
                if (str.contains(j)) {
                    str2 = str2.replace(j, "" + objArr[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(6, this.c, null, unr0.r(sb, b.method, " :: ", str2));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fine(String str, Object... objArr) {
        if (isFineEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            String str2 = str;
            for (int i = 0; i < objArr.length; i++) {
                String j = oyr.j(i, "{", "}");
                if (str.contains(j)) {
                    str2 = str2.replace(j, "" + objArr[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, unr0.r(sb, b.method, " :: ", str2));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fineArray(String str, byte[] bArr) {
        if (isFineEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            sb.append(HexString.toHex(bArr));
            c(2, this.c, null, sb.toString());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fineFormat(String str, Object... objArr) {
        if (isFineEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            String str2 = str;
            for (int i = 0; i < objArr.length; i++) {
                String j = oyr.j(i, "{", "}");
                if (str.contains(j)) {
                    str2 = str2.replace(j, "" + objArr[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, unr0.r(sb, b.method, " :: ", str2));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void finer(String str, Object obj) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            sb.append(obj);
            c(2, this.c, null, sb.toString());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void finerFormat(String str, Object... objArr) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            String str2 = str;
            for (int i = 0; i < objArr.length; i++) {
                String j = oyr.j(i, "{", "}");
                if (str.contains(j)) {
                    str2 = str2.replace(j, "" + objArr[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, unr0.r(sb, b.method, " :: ", str2));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void ignoredException(Throwable th) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, th, b.name + Extension.DOT_CHAR + b.method + " :: " + th.getMessage());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void info(String str, Object obj) {
        if (isInfoEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            sb.append(obj);
            c(4, this.c, null, sb.toString());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void infoFormat(String str, Object... objArr) {
        if (isInfoEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            String str2 = str;
            for (int i = 0; i < objArr.length; i++) {
                String j = oyr.j(i, "{", "}");
                if (str.contains(j)) {
                    str2 = str2.replace(j, "" + objArr[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(4, this.c, null, unr0.r(sb, b.method, " :: ", str2));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isAllEnabled() {
        return Log.isLoggable(this.c, 2) || e.get() == 2;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isConfigEnabled() {
        return Log.isLoggable(this.c, 4) || e.get() == 4;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isFineEnabled() {
        return Log.isLoggable(this.c, 2) || e.get() == 2;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isFinerEnabled() {
        return Log.isLoggable(this.c, 2) || e.get() == 2;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isFinestEnabled() {
        return Log.isLoggable(this.c, 2) || e.get() == 2;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isInfoEnabled() {
        return Log.isLoggable(this.c, 4) || e.get() == 4;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isSevereEnabled() {
        return Log.isLoggable(this.c, 6) || e.get() == 6;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public boolean isWarningEnabled() {
        return Log.isLoggable(this.c, 5) || e.get() == 5;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void pref(Preferences preferences, String str, Object obj) {
        if (isConfigEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(4, this.c, null, b.name + Extension.DOT_CHAR + b.method + " :: " + preferences + " :: " + str + " = " + obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subEnter(Object obj, Object obj2) {
        if (isFinestEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " ::  sub enter :: " + obj + " :: " + obj2);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subExit(Object obj) {
        if (isFinestEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " ::  sub exit :: " + obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subThrown(Throwable th) {
        if (isFinestEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, th, b.name + Extension.DOT_CHAR + b.method + " :: " + th.getMessage());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void thrown(Throwable th) {
        if (isWarningEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(5, this.c, th, b.name + Extension.DOT_CHAR + b.method + " :: " + th.getMessage());
        }
    }

    public String toString() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(String str, Object... objArr) {
        if (isWarningEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            String str2 = str;
            for (int i = 0; i < objArr.length; i++) {
                String j = oyr.j(i, "{", "}");
                if (str.contains(j)) {
                    str2 = str2.replace(j, "" + objArr[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(5, this.c, null, unr0.r(sb, b.method, " :: ", str2));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void finer(String str) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, unr0.r(sb, b.method, " :: ", str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void info(String str) {
        if (isInfoEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(4, this.c, null, unr0.r(sb, b.method, " :: ", str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void info(String str, Throwable th) {
        if (isInfoEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            c(4, this.c, th, g8e.s(th, sb));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void exit() {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, oyr.t(sb, b.method, " ::  exit"));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subExit() {
        if (isFinestEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, oyr.t(sb, b.method, " ::  sub exit"));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fineArray(String str, int[] iArr) {
        if (isFineEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            sb.append(HexString.toHex(iArr));
            c(2, this.c, null, sb.toString());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void ignoredException(String str, Throwable th) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            c(2, this.c, th, g8e.s(th, sb));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subThrown(String str, Throwable th) {
        if (isFinestEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            c(2, this.c, th, g8e.s(th, sb));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void thrown(String str, Throwable th) {
        if (isWarningEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            c(5, this.c, th, g8e.s(th, sb));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subEnter(Object obj) {
        if (isFinestEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " ::  sub enter :: " + obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void subEnter() {
        if (isFinestEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, oyr.t(sb, b.method, " ::  sub enter"));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void enter(Object obj) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " ::  enter :: " + obj);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void enter(Object obj, Object obj2) {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " ::  enter :: " + obj + " :: " + obj2);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void enter() {
        if (isFinerEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, oyr.t(sb, b.method, " ::  enter"));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void dump(String str, ByteBuffer byteBuffer) {
        if (isAllEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(10);
            try {
                hexDumpEncoder.encodeBuffer(byteBuffer, byteArrayOutputStream);
                c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " :: " + str + byteArrayOutputStream);
            } catch (IOException unused) {
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void dump(String str, byte[] bArr) {
        if (isAllEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(10);
            try {
                hexDumpEncoder.encodeBuffer(bArr, byteArrayOutputStream);
                c(2, this.c, null, b.name + Extension.DOT_CHAR + b.method + " :: " + str + byteArrayOutputStream);
            } catch (IOException unused) {
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(String str, Object obj) {
        if (isSevereEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            sb.append(obj);
            c(6, this.c, null, sb.toString());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fine(String str, Object obj) {
        if (isFineEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            sb.append(obj);
            c(2, this.c, null, sb.toString());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(String str, Object obj) {
        if (isWarningEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            sb.append(obj);
            c(5, this.c, null, sb.toString());
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(String str, Throwable th) {
        if (isSevereEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(6, this.c, th, unr0.r(sb, b.method, " :: ", str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fine(String str, Throwable th) {
        if (isFineEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            c(2, this.c, th, g8e.s(th, sb));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(String str, Throwable th) {
        if (isWarningEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            g8e.D(sb, b.method, " :: ", str, " :: ");
            c(5, this.c, th, g8e.s(th, sb));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(String str) {
        if (isSevereEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(6, this.c, null, unr0.r(sb, b.method, " :: ", str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fine(String str) {
        if (isFineEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(2, this.c, null, unr0.r(sb, b.method, " :: ", str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(String str) {
        if (isWarningEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            StringBuilder sb = new StringBuilder();
            sb.append(b.name);
            sb.append(Extension.DOT_CHAR);
            c(5, this.c, null, unr0.r(sb, b.method, " :: ", str));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void fatal(Throwable th) {
        if (isSevereEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(6, this.c, th, b.name + Extension.DOT_CHAR + b.method + " :: " + th);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.logger.DefaultLogger, ru.CryptoPro.JCP.tools.logger.DefaultLoggerInterface
    public void warning(Throwable th) {
        if (isWarningEnabled()) {
            DefaultLoggerInterface.CallerDescription b = b();
            c(5, this.c, th, b.name + Extension.DOT_CHAR + b.method + " :: " + th.getMessage());
        }
    }
}
