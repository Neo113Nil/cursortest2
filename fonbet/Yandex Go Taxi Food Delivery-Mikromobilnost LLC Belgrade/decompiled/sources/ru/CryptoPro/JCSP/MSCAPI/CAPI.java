package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.c87;
import defpackage.ny61;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.AccessController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCP.tools.Loader.SystemLoad;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.PropertyExpander;
import ru.CryptoPro.JCSP.CSPVersionUtility;
import ru.CryptoPro.JCSP.CStructReader.ProvVersionExStructure;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;

/* loaded from: classes4.dex */
public class CAPI {
    public static final int CSPBuild;
    public static final Date CSPBuildTimestamp;
    public static final int CSPVersion;
    public static final CSPProviderInfo CSP_PROVIDER_INFO;
    public static final int CSP_VERSION_40 = 1024;
    public static final int CSP_VERSION_50 = 1280;
    public static final long PARAM_STRENGTHENED_KEY_USAGE_CONTROL_ENABLED = 1;
    public static final long StrengthenedKeyUsageControlState;
    static final String a = "cspjni";
    static final String b = "libcspjni";
    public static final boolean isCSPLicenseExported;
    public static final String PARAM_TRACE_HANDLE = "trace_handle";
    public static final boolean TRACE_HANDLE = GetProperty.getBooleanProperty(PARAM_TRACE_HANDLE, false);
    public static final String PARAM_STRICT_DESTROY_CHECK = "strict_destroy_check";
    public static final boolean STRICT_DESTROY_CHECK = GetProperty.getBooleanProperty(PARAM_STRICT_DESTROY_CHECK, false);
    public static final SimpleDateFormat BUILD_TIMESTAMP_FORMAT = new SimpleDateFormat("MMM dd yyyy HH:mm:ss", Locale.ENGLISH);

    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    static {
        String str;
        int i;
        int i2 = 0;
        if (Platform.isAndroid) {
            a();
        } else {
            try {
                a(null, 1);
            } catch (ValidationException e) {
                e = e;
                str = "Error occurred during library loading.";
                JCSPLogger.warning(str, e);
                ny61.j(e);
                return;
            } catch (Exception e2) {
                JCSPLogger.thrown(e2);
                try {
                    a(PropertyExpander.expand((String) AccessController.doPrivileged(new c87())), 2);
                } catch (Exception e3) {
                    e = e3;
                    str = "Second error occurred during library loading.";
                    JCSPLogger.warning(str, e);
                    ny61.j(e);
                    return;
                }
            }
        }
        CSPProv2012_256 cSPProv2012_256 = new CSPProv2012_256();
        try {
            cSPProv2012_256.createWithoutContainer();
        } catch (Exception e4) {
            JCSPLogger.warning(e4);
            try {
                CSPVersion = 0;
                CSPBuild = 0;
                isCSPLicenseExported = false;
                CSPBuildTimestamp = null;
            } finally {
            }
        }
        try {
            CSPVersion = a(cSPProv2012_256);
            CSPBuild = b(cSPProv2012_256);
            CSPBuildTimestamp = c(cSPProv2012_256);
            isCSPLicenseExported = f(cSPProv2012_256);
            long b2 = b();
            StrengthenedKeyUsageControlState = b2;
            int i3 = CSPVersion;
            int i4 = CSPBuild;
            boolean z = isCSPLicenseExported;
            CSPProviderInfo cSPProviderInfo = new CSPProviderInfo(i3, i4, b2, z, CSPBuildTimestamp);
            CSP_PROVIDER_INFO = cSPProviderInfo;
            if (JCSPLogger.isFineEnabled()) {
                StringBuilder sb = new StringBuilder("Java CSP pane parameters: ");
                sb.append(cSPProviderInfo);
                sb.append("\nCSP StrengthenedKeyUsageControl: ");
                sb.append(b2);
                sb.append("\nCSP has ");
                sb.append(z ? "exported" : "regular");
                sb.append(" license.");
                JCSPLogger.fine(sb.toString());
            }
            if (JCSPLogger.isFineEnabled()) {
                cSPProv2012_256 = new CSPProv2012_256();
                try {
                    try {
                        cSPProv2012_256.createWithoutContainer(null);
                        i = a(cSPProv2012_256);
                    } catch (Exception e5) {
                        e = e5;
                        i = 0;
                    }
                    try {
                        i2 = b(cSPProv2012_256);
                    } catch (Exception e6) {
                        e = e6;
                        JCSPLogger.warning(e);
                        JCSPLogger.fine("Java CSP default CSP parameters: " + new CSPProviderInfo(i, i2));
                        if (TRACE_HANDLE) {
                        }
                    }
                    JCSPLogger.fine("Java CSP default CSP parameters: " + new CSPProviderInfo(i, i2));
                } finally {
                }
            }
            if (TRACE_HANDLE) {
                return;
            }
            CounterTraceThread counterTraceThread = new CounterTraceThread();
            counterTraceThread.setDaemon(true);
            counterTraceThread.start();
        } finally {
        }
    }

    private CAPI() {
    }

    private static void a(String str, int i) throws ValidationException {
        File parentFile;
        JCSPLogger.fine("Loading library (attempt #" + i + ")...");
        if (str != null) {
            JCSPLogger.fine("Use alternative path: ".concat(str));
        }
        File file = null;
        try {
            try {
                file = cl_5.a(b, CAPI.class.getClassLoader(), str);
                JCSPLogger.fine("System.load(" + file.getAbsolutePath() + ")...");
                System.load(file.getAbsolutePath());
                cl_5.a(file);
                SystemLoad.deleteLibrary(file);
            } catch (Error e) {
                throw new RuntimeException("Library loading error, attempt #" + i, e);
            } catch (ValidationException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new RuntimeException("Library loading exception, attempt #" + i, e3);
            }
        } catch (Throwable th) {
            if (file != null) {
                SystemLoad.deleteLibrary(file);
            }
            if (file != null && (parentFile = file.getParentFile()) != null && !parentFile.delete()) {
                JCSPLogger.warning("Temporary library directory has NOT been deleted.");
            }
            throw th;
        }
    }

    public static native int acceptSecurityContext(long[] jArr, long[] jArr2, boolean z, boolean z2, byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2);

    public static native int acquireCredentialsHandle(boolean z, int i, int[] iArr, int i2, ArrayList arrayList, long j, int i3, long[] jArr, boolean z2, ArrayList arrayList2);

    private static long b() {
        if (!CSPVersionUtility.isCSPVersion40OrHigher()) {
            return 0L;
        }
        JCSPLogger.fine("[" + Thread.currentThread().getName() + "] :: GetStrengthenedKeyUsageControl()");
        try {
            long strengthenedKeyUsageControl = getStrengthenedKeyUsageControl();
            if (strengthenedKeyUsageControl == 0 || strengthenedKeyUsageControl == 1) {
                return strengthenedKeyUsageControl;
            }
            return 0L;
        } catch (UnsatisfiedLinkError e) {
            JCSPLogger.warning(e);
            if (Platform.isAndroid) {
                return 0L;
            }
            throw e;
        }
    }

    public static Date c(HProv hProv) {
        try {
            byte[] provParam = hProv.getProvParam(HProv.PP_VERSION_TIMESTAMP, 0);
            if (provParam != null) {
                return BUILD_TIMESTAMP_FORMAT.parse(CPString.getString(provParam));
            }
            return null;
        } catch (Exception e) {
            JCSPLogger.thrown(e);
            return null;
        }
    }

    public static native int changePin(long j, int i, byte b2, byte[] bArr, int i2);

    public static native int cryptAcquireContext(long[] jArr, String str, String str2, int i, int i2);

    public static native int cryptContextAddRef(long j, int i);

    public static native int cryptCreateHash(long j, int i, long j2, int i2, long[] jArr);

    public static native int cryptDecrypt(long j, long j2, boolean z, int i, byte[] bArr, int[] iArr);

    public static native int cryptDeriveKey(long j, int i, long j2, int i2, long[] jArr);

    public static native int cryptDestroyHash(long j);

    public static native int cryptDestroyKey(long j);

    public static native int cryptDuplicateHash(long j, int[] iArr, int i, long[] jArr);

    public static native int cryptDuplicateKey(long j, int[] iArr, int i, long[] jArr);

    public static int cryptEncrypt(long j, long j2, boolean z, int i, byte[] bArr, int[] iArr, int i2) {
        return cryptEncrypt(j, j2, z, i, bArr, iArr, i2, 0);
    }

    public static native int cryptEncrypt(long j, long j2, boolean z, int i, byte[] bArr, int[] iArr, int i2, int i3);

    public static native int cryptEnumProviders(int i, int i2, int[] iArr, byte[] bArr, int[] iArr2);

    public static native int cryptExportKey(long j, long j2, int i, int i2, byte[] bArr, int[] iArr, int i3);

    public static native int cryptGenKey(long j, int i, int i2, long[] jArr);

    public static native int cryptGenRandom(long j, int i, byte[] bArr);

    public static native int cryptGetHashParam(long j, int i, byte[] bArr, int[] iArr, int i2);

    public static native int cryptGetKeyParam(long j, int i, byte[] bArr, int[] iArr, int i2);

    public static native int cryptGetProvParam(long j, int i, byte[] bArr, int[] iArr, int i2);

    public static native int cryptGetUserKey(long j, int i, long[] jArr);

    public static native int cryptHashData(long j, byte[] bArr, int i, int i2, int i3);

    public static native int cryptHashSessionKey(long j, long j2, int i);

    public static native int cryptImportKey(long j, byte[] bArr, int i, long j2, int i2, long[] jArr, int i3);

    public static native int cryptReleaseContext(long j, int i);

    public static native int cryptSetHashParam(long j, int i, byte[] bArr, int i2);

    public static native int cryptSetKeyParam(long j, int i, byte[] bArr, int i2);

    public static native int cryptSetProvParam(long j, int i, byte[] bArr, int i2);

    public static native int cryptSignHash(long j, int i, String str, int i2, byte[] bArr, int[] iArr);

    public static native int cryptVerifySignature(long j, byte[] bArr, int i, long j2, String str, int i2);

    private static String d(HProv hProv) {
        String str = null;
        if (CSPVersionUtility.isCSPVersion50OrHigher()) {
            try {
                byte[] provParam = hProv.getProvParam(HProv.PP_LICENSE, 4);
                if (provParam != null) {
                    str = provParam[provParam.length + (-1)] == 0 ? new String(provParam, 0, provParam.length - 1) : new String(provParam);
                    return str.trim();
                }
            } catch (Exception | UnsatisfiedLinkError e) {
                JCSPLogger.warning(e);
            }
        }
        return str;
    }

    public static native int decryptMessage(long[] jArr, byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2);

    public static native int deleteSecurityContext(long[] jArr);

    private static boolean e(HProv hProv) {
        return isCSPLicenseControlEnabled(d(hProv));
    }

    public static native int encryptMessage(long[] jArr, byte[] bArr, int[] iArr, int[] iArr2, byte[] bArr2, int[] iArr3);

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean f(HProv hProv) {
        boolean z;
        boolean z2;
        if (CSPVersionUtility.isCSPVersion50OrHigher()) {
            try {
                byte[] provParam = hProv.getProvParam(HProv.PP_EXPORT_CSP, 4);
                if (provParam != null) {
                    if (Array.getInt(provParam, 0) != 0) {
                        z = true;
                        z2 = false;
                    }
                }
                z = false;
                z2 = false;
            } catch (Exception e) {
                JCSPLogger.ignoredException(e);
                z2 = true;
                z = false;
                if (z) {
                }
            } catch (UnsatisfiedLinkError e2) {
                JCSPLogger.warning(e2);
                z2 = true;
                z = false;
                if (z) {
                }
            }
        } else {
            z = false;
            z2 = false;
        }
        if (z) {
            return true;
        }
        if (z2) {
            return e(hProv);
        }
        return false;
    }

    public static native int freeCredentialsHandle(long[] jArr);

    public static int getCSPVersion() {
        return CSPVersion;
    }

    public static native int getCipherInfo(long[] jArr, int[] iArr, int[] iArr2);

    public static native int getIssuers(long[] jArr, ArrayList arrayList);

    public static native int getRemoteCertificates(long[] jArr, ArrayList arrayList);

    public static native int getSessionInfo(long[] jArr, int[] iArr, byte[] bArr, int[] iArr2);

    private static native long getStrengthenedKeyUsageControl();

    public static native int initializeSecurityContext(long[] jArr, long[] jArr2, String str, boolean z, boolean z2, byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2);

    public static boolean isCSPLicenseControlEnabled(String str) {
        return (str == null || str.length() != 25 || (LicenseUtility.decode5Bit(str.toCharArray(), 11)[0] & 4) == 0) ? false : true;
    }

    public static native int setCertExtension(long j, String str, boolean z, byte[] bArr, int i, int i2);

    public static native int supportRegistryGetBool(String str, boolean[] zArr);

    public static native int supportRegistryGetLong(String str, long[] jArr);

    public static native int supportRegistryGetLongLong(String str, long[] jArr);

    public static native int supportRegistryGetString(String str, String[] strArr);

    public static native int supportRegistryPutBool(String str, boolean z);

    public static native int supportRegistryPutLong(String str, long j);

    public static native int supportRegistryPutLongLong(String str, long j);

    public static native int supportRegistryPutString(String str, String str2);

    public static class CounterTraceThread extends Thread {
        private static final int a = 1;
        private static final int b = 0;
        private static final List c = new ArrayList();

        private void a() {
            Iterator it = KeyStoreConfigBase.getProviders(80).iterator();
            while (it.hasNext()) {
                c.add(new ProviderContext((String) it.next(), 80));
            }
        }

        private void b() {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                ((ProviderContext) it.next()).a();
            }
        }

        private static void c() {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                ((ProviderContext) it.next()).b();
            }
        }

        private void d() {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                ((ProviderContext) it.next()).c();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a();
            b();
            while (!Thread.interrupted()) {
                try {
                    c();
                    Thread.sleep(500L);
                } catch (Exception e) {
                    JCSPLogger.warning(e);
                    super.interrupt();
                    return;
                } finally {
                    d();
                }
            }
        }

        public static class ProviderContext {
            private final String a;
            private final int b;
            private HProv c = null;
            private long d = 0;
            private boolean e = false;

            public ProviderContext(String str, int i) {
                this.a = str;
                this.b = i;
            }

            public void a() {
                try {
                    HProv provider = HProv.getProvider(this.b);
                    this.c = provider;
                    provider.createWithoutContainer(this.a);
                    this.d = a(this.c, 1);
                    this.e = true;
                } catch (Exception e) {
                    JCSPLogger.warning(e);
                }
            }

            public void b() {
                if (this.e) {
                    JCSPLogger.info("[TRACE HANDLE] provider: " + this.a + Extension.O_BRAKE_SPACE + this.b + "), max: " + this.d + ", used: " + a(this.c, 0));
                }
            }

            public void c() {
                if (this.e) {
                    this.e = false;
                    try {
                        this.c.releaseContext(7);
                    } catch (Exception e) {
                        JCSPLogger.warning(e);
                    }
                }
            }

            public static int a(HProv hProv, int i) {
                try {
                    return Array.getInt(hProv.getProvParam(HProv.PP_HANDLE_COUNT, i), 0);
                } catch (Exception e) {
                    JCSPLogger.warning(e);
                    return -1;
                }
            }
        }
    }

    public static int b(HProv hProv) {
        try {
            byte[] provParam = hProv.getProvParam(HProv.PP_VERSION_EX, 0);
            ProvVersionExStructure provVersionExStructure = new ProvVersionExStructure();
            provVersionExStructure.read(new ByteArrayInputStream(provParam));
            return provVersionExStructure.dwPKZIBuild.value;
        } catch (Exception e) {
            JCSPLogger.thrown(e);
            return 0;
        }
    }

    private static void a() {
        try {
            System.loadLibrary("cspjni");
        } catch (Exception e) {
            JCSPLogger.fatal(e);
            ny61.j(e);
        }
    }

    public static int a(HProv hProv) {
        try {
            return Array.getInt(hProv.getProvParam(5, 0), 0);
        } catch (Exception e) {
            JCSPLogger.thrown(e);
            return 0;
        }
    }
}
