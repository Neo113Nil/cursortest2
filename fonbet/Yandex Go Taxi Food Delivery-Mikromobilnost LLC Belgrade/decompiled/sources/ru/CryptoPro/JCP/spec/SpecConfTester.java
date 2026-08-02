package ru.CryptoPro.JCP.spec;

import defpackage.g8e;
import defpackage.ny61;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;
import ru.CryptoPro.JCP.Digest.CheckMemory;
import ru.CryptoPro.JCP.Key.PrivateKeySpec;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class SpecConfTester {
    public static final long b;
    public static final Vector a = new Vector(0);
    public static final String c = "SpecConfTester_class_default";

    /* renamed from: ru.CryptoPro.JCP.spec.SpecConfTester$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            return new Long(new JCPPref(SpecConfTester.class).getLong(SpecConfTester.c, 0L));
        }
    }

    public static class VectorRuner extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (SpecConfTester.a) {
                    int i = 0;
                    while (true) {
                        try {
                            Vector vector = SpecConfTester.a;
                            if (i >= vector.size()) {
                                break;
                            }
                            CheckElem checkElem = (CheckElem) vector.elementAt(i);
                            int[] iArr = checkElem.a;
                            if (!CheckMemory.verifyMem32(iArr, 0, iArr.length, checkElem.b)) {
                                throw new SecurityException("Parameter corrupted in " + vector.elementAt(i).toString());
                            }
                            i++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                try {
                    Thread.sleep(SpecConfTester.b);
                } catch (InterruptedException e) {
                    JCPLogger.warning("TesterWasInterrupted", (Throwable) e);
                }
            }
        }
    }

    static {
        Long l = (Long) AccessController.doPrivileged(new AnonymousClass1());
        b = l.longValue() == 0 ? 120L : l.longValue();
        new VectorRuner().start();
    }

    public static void addTest(int[] iArr, int i, String str) throws SecurityException {
        CheckElem checkElem = new CheckElem(iArr, i, str);
        Vector vector = a;
        synchronized (vector) {
            vector.add(checkElem);
        }
    }

    public static long getDuration() {
        return b;
    }

    public static void setDuration(long j) {
        JCPPref jCPPref = new JCPPref(PrivateKeySpec.class);
        if (j >= 0) {
            jCPPref.putLong(c, j);
        }
    }

    public Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public static void addTest(int[] iArr, String str) {
        CheckElem checkElem = new CheckElem(str, iArr);
        Vector vector = a;
        synchronized (vector) {
            vector.add(checkElem);
        }
    }

    public static class CheckElem {
        public final int[] a;
        public final int b;
        public final String c;

        public CheckElem(int[] iArr, int i, String str) {
            this.a = iArr;
            int checkMem32 = CheckMemory.checkMem32(iArr, 0, iArr.length);
            this.b = checkMem32;
            this.c = str;
            if (checkMem32 == i) {
                return;
            }
            ny61.z(g8e.o("Initialization Error in ", str));
            throw null;
        }

        public String toString() {
            return this.c;
        }

        public CheckElem(String str, int[] iArr) {
            this.a = iArr;
            this.b = CheckMemory.checkMem32(iArr, 0, iArr.length);
            this.c = str;
        }
    }
}
