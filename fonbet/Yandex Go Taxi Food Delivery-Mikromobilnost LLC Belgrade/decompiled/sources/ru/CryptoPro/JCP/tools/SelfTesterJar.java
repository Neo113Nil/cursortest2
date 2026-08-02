package ru.CryptoPro.JCP.tools;

import java.net.URL;
import java.security.PrivilegedAction;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.logger.InternalLoggerInterface;

/* loaded from: classes4.dex */
public abstract class SelfTesterJar implements SelfTesterStrings {
    public static final int STANDARD_PERIOD = 600000;
    public static final String STRING_SEPARATOR = ";";
    protected final InternalLoggerInterface baseLogger;
    protected long[] periods;
    protected int testsAmount;
    protected long[] times;
    protected final Vector tests = new Vector();
    protected final Vector jars = new Vector(1);
    private final Map a = new ConcurrentHashMap();

    /* renamed from: ru.CryptoPro.JCP.tools.SelfTesterJar$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            new LinkedList();
            throw null;
        }
    }

    public SelfTesterJar(InternalLoggerInterface internalLoggerInterface, String str, String str2) {
        this.baseLogger = internalLoggerInterface;
        internalLoggerInterface.fine(TAG(SelfTesterStrings.SELF_TESTER_CTOR));
        try {
            initJarList(str, str2);
            int i = 0;
            while (true) {
                int size = this.jars.size();
                Vector vector = this.tests;
                if (i >= size) {
                    int size2 = vector.size();
                    this.testsAmount = size2;
                    this.times = new long[size2];
                    this.periods = new long[size2];
                    init();
                    this.baseLogger.fine(TAG(SelfTesterStrings.SELF_TESTER_CTOR_OK));
                    return;
                }
                vector.add(new TestVerifyClassJar((URL) this.jars.elementAt(i)));
                i++;
            }
        } catch (Exception e) {
            SelfTesterException selfTesterException = new SelfTesterException(TAG("SelfTester Error: tester initialization is incorrect"));
            selfTesterException.initCause(e);
            this.baseLogger.warning(selfTesterException);
            throw selfTesterException;
        }
    }

    public static void a(SelfTesterJar selfTesterJar, String str, List list) {
        selfTesterJar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        selfTesterJar.baseLogger.fine(selfTesterJar.TAG("initiating of jar list..."));
        selfTesterJar.baseLogger.fine(selfTesterJar.TAG("jar classes: ".concat(str)));
        String[] split = str.split(";");
        String[] avoidRepeats = Array.avoidRepeats(split);
        if (split.length != avoidRepeats.length) {
            selfTesterJar.baseLogger.warning(selfTesterJar.TAG(SelfTesterStrings.JAR_LIST_CONTAINS_REPEATS));
        }
        for (String str2 : avoidRepeats) {
            if (!list.contains(str2)) {
                selfTesterJar.baseLogger.fine(selfTesterJar.TAG("getting class url for class name: " + str2));
                try {
                    URL classURL = JarTools.getClassURL(Class.forName(str2, false, selfTesterJar.getClass().getClassLoader()));
                    selfTesterJar.jars.add(classURL);
                    selfTesterJar.baseLogger.fine(selfTesterJar.TAG("jar " + classURL + " has been added to self-tester."));
                    list.add(str2);
                } catch (ClassNotFoundException e) {
                    selfTesterJar.baseLogger.ignoredException(e);
                }
                selfTesterJar.baseLogger.fine(selfTesterJar.TAG("initiating of jar list completed."));
            }
        }
    }

    public static String readString(Class cls, String str) {
        return new JCPPref(cls).get(str, null);
    }

    public String TAG(String str) {
        return "[" + Thread.currentThread().getName() + "] :: [" + getPrefHolder().getCanonicalName() + "] :: " + str;
    }

    public void checkClassInternal(Class cls) throws SelfTesterException {
        String str = Platform.CP_IBM866;
    }

    public void checkOne(int i) throws SelfTesterException {
        synchronized (((SelfTested) this.tests.elementAt(i))) {
            runTest(i);
        }
    }

    public int getJarTestId(int i) {
        return i;
    }

    public abstract Class getPrefHolder();

    public abstract Object getSync();

    public long init() {
        int i;
        this.baseLogger.fine(TAG("initiating..."));
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (getSync()) {
            i = 0;
            for (int i2 = 0; i2 < this.testsAmount; i2++) {
                try {
                    this.periods[i2] = ((SelfTested) this.tests.elementAt(i2)).getPeriod();
                    long j = this.periods[i2];
                    if (j == 600000) {
                        i++;
                    }
                    this.times[i2] = currentTimeMillis - j;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.baseLogger.fine(TAG("initiating completed."));
        if (i == 0) {
            return 600000L;
        }
        return 600000 / i;
    }

    public void initJarList(String str, String str2) {
        String str3 = Platform.CP_IBM866;
    }

    public void runTest(int i) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        SelfTested selfTested = (SelfTested) this.tests.elementAt(i);
        synchronized (getSync()) {
            z = (currentTimeMillis - this.times[i]) - this.periods[i] >= 0;
        }
        if (z) {
            try {
                selfTested.run();
            } catch (SelfTesterException e) {
                try {
                    selfTested.run();
                } catch (SelfTesterException unused) {
                    throw e;
                }
            }
        }
        synchronized (getSync()) {
            this.times[i] = System.currentTimeMillis();
        }
    }

    public SelfTesterJar(InternalLoggerInterface internalLoggerInterface) {
        this.baseLogger = internalLoggerInterface;
        internalLoggerInterface.fine(TAG(SelfTesterStrings.SELF_TESTER_CTOR));
    }
}
