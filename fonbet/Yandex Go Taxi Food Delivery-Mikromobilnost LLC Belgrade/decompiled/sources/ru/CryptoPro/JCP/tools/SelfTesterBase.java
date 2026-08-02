package ru.CryptoPro.JCP.tools;

import defpackage.b64;
import defpackage.d7g0;
import defpackage.oyr;
import defpackage.qv10;
import java.lang.Thread;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProviderException;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface;

/* loaded from: classes4.dex */
public abstract class SelfTesterBase extends SelfTesterJar implements Runnable {
    protected static final String APPLET_DESTROYER_CLASS = "sun.awt.AppContext";
    protected static final String APPLET_DESTROYER_METHOD = "dispose";
    protected static final long DEFAULT_SLEEP_TIME = 10;
    public static final String THREAD_NAME_PREFIX = "SelfTester";
    protected boolean alive;
    protected boolean doesProviderExist;
    protected int nextTest;
    protected final long standardTimeout;
    protected Thread testerThread;
    protected int verifyJarTestsStartIndex;

    public SelfTesterBase(InternalLoggerInterface internalLoggerInterface, String str, String str2, String str3, String str4) {
        super(internalLoggerInterface);
        this.doesProviderExist = false;
        try {
            this.alive = true;
            this.nextTest = 0;
            this.testerThread = null;
            initJarList(str, str3);
            b(str2, str4);
            int size = this.tests.size();
            this.testsAmount = size;
            this.verifyJarTestsStartIndex = size - this.jars.size();
            int i = this.testsAmount;
            this.times = new long[i];
            this.periods = new long[i];
            this.standardTimeout = init();
            this.baseLogger.fine(TAG(SelfTesterStrings.SELF_TESTER_CTOR_OK));
        } catch (Exception e) {
            SelfTesterException selfTesterException = new SelfTesterException(TAG("SelfTester Error: tester initialization is incorrect"));
            selfTesterException.initCause(e);
            this.baseLogger.warning(selfTesterException);
            c(e);
            throw selfTesterException;
        }
    }

    public static SelfTested a(SelfTesterBase selfTesterBase, String str) {
        InternalLoggerInterface internalLoggerInterface;
        String str2;
        selfTesterBase.getClass();
        try {
            return (SelfTested) Class.forName(str).newInstance();
        } catch (ClassCastException | ClassNotFoundException e) {
            selfTesterBase.baseLogger.warning(selfTesterBase.TAG(SelfTesterStrings.ILLEGAL_CLASS_NAME_TO_TEST), e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            internalLoggerInterface = selfTesterBase.baseLogger;
            str2 = SelfTesterStrings.ILLEGAL_ACCESS_TO_THE_CLASS_TO_BE_TESTED;
            internalLoggerInterface.warning(selfTesterBase.TAG(str2), e);
            return null;
        } catch (InstantiationException e3) {
            e = e3;
            internalLoggerInterface = selfTesterBase.baseLogger;
            str2 = SelfTesterStrings.THE_SPECIFIED_CLASS_CANNOT_PRODUCE_ANY_OBJECTS;
            internalLoggerInterface.warning(selfTesterBase.TAG(str2), e);
            return null;
        }
    }

    public static void addTest(Class cls, String str, String str2) {
        JCPLogger.fineFormat("Adding the test {0} to {1}", str, str2);
        String readString = SelfTesterJar.readString(cls, str2);
        if (readString == null || readString.length() == 0) {
            store(cls, str, str2);
            return;
        }
        if (readString.indexOf(str) == -1) {
            store(cls, readString + ";" + str, str2);
        }
    }

    public static void removeTest(Class cls, String str, String str2) {
        JCPLogger.fineFormat("Removing the test: {0} from {1}", str, str2);
        String readString = SelfTesterJar.readString(cls, str2);
        if (readString == null) {
            return;
        }
        String[] split = readString.split(";");
        int length = split.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (split[i2].equals(str)) {
                i = i2;
            }
        }
        if (i == -1) {
            JCPLogger.warning(SelfTesterStrings.ILLEGAL_TEST_NAME_TO_REMOVE_FROM_SELF_TESTER);
            return;
        }
        String str3 = "";
        for (int i3 = 0; i3 < length; i3++) {
            if (i != 0 || i3 != 0) {
                if (i3 != i) {
                    StringBuilder t = qv10.t(str3);
                    t.append(split[i3]);
                    str3 = t.toString();
                }
                int i4 = length - 1;
                if (i == i4 && i3 == length - 2) {
                    break;
                } else if (i3 != i - 1 && i3 != i4) {
                    str3 = b64.j(str3, ";");
                }
            }
        }
        store(cls, str3, str2);
    }

    public static void store(Class cls, String str, String str2) {
        new JCPPref(cls).put(str2, str);
    }

    public final void b(final String str, final String str2) {
        this.baseLogger.fine(TAG("building of test list..."));
        this.tests.add(new TestJavaVersion());
        AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.tools.SelfTesterBase.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                String str3 = str;
                boolean isEmpty = str3.isEmpty();
                SelfTesterBase selfTesterBase = SelfTesterBase.this;
                if (!isEmpty) {
                    String[] split = str3.split(";");
                    for (int i = 0; i < split.length; i++) {
                        SelfTested a = SelfTesterBase.a(selfTesterBase, split[i]);
                        if (a == null) {
                            ProviderException providerException = new ProviderException(selfTesterBase.TAG("initiating error: cannot get an object for internal test: " + split[i]));
                            selfTesterBase.c(providerException);
                            throw providerException;
                        }
                        selfTesterBase.tests.add(a);
                    }
                }
                String str4 = str2;
                if (!str4.isEmpty()) {
                    String readString = SelfTesterJar.readString(selfTesterBase.getPrefHolder(), str4);
                    String[] split2 = readString == null ? new String[0] : readString.split(";");
                    for (int i2 = 0; i2 < split2.length; i2++) {
                        SelfTested a2 = SelfTesterBase.a(selfTesterBase, split2[i2]);
                        if (a2 == null) {
                            ProviderException providerException2 = new ProviderException(selfTesterBase.TAG("initiating error: cannot get an object for external test: " + split2[i2]));
                            selfTesterBase.c(providerException2);
                            throw providerException2;
                        }
                        selfTesterBase.tests.add(a2);
                    }
                }
                for (int i3 = 0; i3 < selfTesterBase.jars.size(); i3++) {
                    selfTesterBase.tests.add(new TestVerifyClassJar((URL) selfTesterBase.jars.elementAt(i3)));
                }
                return null;
            }
        });
        this.baseLogger.fine(TAG("building of test list completed."));
    }

    public final void c(Throwable th) {
        if (th != null) {
            this.baseLogger.fatal(th);
        }
        synchronized (getSync()) {
            this.alive = false;
        }
    }

    public void checkInternal() throws SelfTesterException {
        boolean z;
        boolean checkProvider;
        if (Platform.isAndroid) {
            return;
        }
        if (!this.doesProviderExist) {
            synchronized (getSync()) {
                checkProvider = checkProvider();
                this.doesProviderExist = checkProvider;
            }
            if (!checkProvider) {
                throw new ProviderException(TAG("provider " + getProviderName() + " has not been found!"));
            }
        }
        synchronized (getSync()) {
            z = this.alive;
        }
        if (!z) {
            d7g0.n(TAG("SelfTester Error: some test crashed twice in a row, usage of " + getPrefHolder() + " is no longer available!"));
            return;
        }
        if (this.testerThread == null) {
            synchronized (getSync()) {
                try {
                    if (this.alive && this.testerThread == null) {
                        this.baseLogger.fine(TAG("starting tester thread..."));
                        Thread thread = new Thread(this);
                        this.testerThread = thread;
                        thread.setDaemon(true);
                        this.testerThread.setPriority(5);
                        this.testerThread.setName(getThreadName());
                        this.testerThread.start();
                        this.testerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ru.CryptoPro.JCP.tools.SelfTesterBase.2
                            @Override // java.lang.Thread.UncaughtExceptionHandler
                            public void uncaughtException(Thread thread2, Throwable th) {
                                SelfTesterBase selfTesterBase;
                                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                                    if (stackTraceElement.getClassName().equals(SelfTesterBase.APPLET_DESTROYER_CLASS) && stackTraceElement.getMethodName().equals(SelfTesterBase.APPLET_DESTROYER_METHOD)) {
                                        synchronized (SelfTesterBase.this.getSync()) {
                                            selfTesterBase = SelfTesterBase.this;
                                            selfTesterBase.testerThread = null;
                                        }
                                        selfTesterBase.baseLogger.fine(selfTesterBase.TAG("void the tester thread (null)!"));
                                        return;
                                    }
                                }
                                SelfTesterBase selfTesterBase2 = SelfTesterBase.this;
                                selfTesterBase2.baseLogger.fine(selfTesterBase2.TAG("mark tester thread as dead!"));
                                synchronized (SelfTesterBase.this.getSync()) {
                                    SelfTesterBase.this.alive = false;
                                }
                            }
                        });
                    }
                } finally {
                }
            }
        }
        if (this.testerThread != null) {
            return;
        }
        SelfTesterException selfTesterException = new SelfTesterException(TAG("self-tester is DEAD, thread is null!"));
        c(selfTesterException);
        throw selfTesterException;
    }

    public abstract boolean checkProvider();

    @Override // ru.CryptoPro.JCP.tools.SelfTesterJar
    public int getJarTestId(int i) {
        return i + this.verifyJarTestsStartIndex;
    }

    public abstract Class getProviderClass();

    public abstract String getProviderName();

    public long getSleepTimeout() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (getSync()) {
            try {
                this.nextTest = -1;
                j = 0;
                for (int i = 0; i < this.testsAmount; i++) {
                    long j2 = (this.times[i] + this.periods[i]) - currentTimeMillis;
                    if (i == 0) {
                        this.nextTest = i;
                        j = j2;
                    }
                    if (j2 < j) {
                        this.nextTest = i;
                        j = j2;
                    }
                }
                long j3 = this.standardTimeout;
                if (j >= j3) {
                    j = j3;
                }
            } finally {
            }
        }
        return j;
    }

    public abstract String getThreadName();

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        int i;
        this.baseLogger.fine(TAG(SelfTesterStrings.SELF_TESTER_RUN));
        synchronized (getSync()) {
            z = this.alive;
        }
        while (z) {
            long sleepTimeout = getSleepTimeout();
            synchronized (getSync()) {
                i = this.nextTest;
            }
            if (sleepTimeout > 10) {
                try {
                    try {
                        Thread.sleep(sleepTimeout);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } catch (SelfTesterException e) {
                    this.baseLogger.warning(TAG("test №" + i + " failed!"));
                    this.baseLogger.warning(e);
                }
            } else {
                Thread.sleep(10L);
            }
            if (i >= 0) {
                checkOne(i);
            }
            synchronized (getSync()) {
                try {
                    if (Thread.interrupted()) {
                        this.baseLogger.fatal(TAG(SelfTesterStrings.THREAD_INTERRUPTED));
                        synchronized (getSync()) {
                            this.alive = false;
                        }
                    }
                    z = this.alive;
                } finally {
                }
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTesterJar
    public void runTest(int i) {
        try {
            super.runTest(i);
        } catch (SelfTesterException e) {
            this.baseLogger.fatal(TAG(oyr.j(i, "test ", " crashed twice!")));
            synchronized (getSync()) {
                this.alive = false;
                throw e;
            }
        }
    }

    public void checkInternal(int i) throws SelfTesterException {
        if (i < 0) {
            d7g0.n(TAG("SelfTester Error:wrong index " + i + " for check()!"));
            return;
        }
        for (int i2 = 0; i2 < this.testsAmount; i2++) {
            if (((1 << i2) & i) != 0) {
                checkOne(i2);
            }
        }
    }
}
