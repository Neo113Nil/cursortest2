package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.g8e;
import defpackage.oyr;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.Loader.SystemLoad;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCSP.Digest.JCSPGostDigest;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
class cl_5 {
    private static final String c = "libcspjni";
    private static final String d = "Invalid library hash! Expect %s but actual is %s";
    private static final cl_0 e;
    private static final cl_0 f;
    private static final cl_0 h;
    private static final cl_0 i;
    private static final cl_0 j;
    private static final cl_0 k;
    private static final cl_0 l;
    private static final cl_0 m;
    public static final String a = "ru.CryptoPro.JCSP.MSCAPI.libcspjni.libcspjni";
    public static final ResourceBundle b = ResourceBundle.getBundle(a, Locale.getDefault());
    private static final cl_0 g = new cl_0("macos", 0 == true ? 1 : 0, "dylib");
    private static final cl_0 n = a();

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = "windows";
        String str2 = "x64";
        String str3 = "dll";
        e = new cl_0(str, str2, str3);
        f = new cl_0(str, "win32", str3);
        String str4 = "aix";
        String str5 = "so";
        h = new cl_0(str4, "ppc64", str5);
        i = new cl_0(str4, "ppc", str5);
        String str6 = "linux";
        j = new cl_0(str6, "e2k", str5);
        k = new cl_0(str6, "aarch64", str5);
        l = new cl_0(str6, str2, str5);
        m = new cl_0(str6, "x86", str5);
    }

    public static void a(File file) throws ValidationException {
        byte[] decodeHexBytesNoSpaces;
        FileInputStream fileInputStream;
        JCSPLogger.subEnter();
        JCSPLogger.fine("Validating library " + file.getAbsolutePath());
        FileInputStream fileInputStream2 = null;
        try {
            try {
                decodeHexBytesNoSpaces = HexString.decodeHexBytesNoSpaces(b.getString(n.b()));
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        } catch (IOException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
        try {
            JCSPGostDigest jCSPGostDigest = new JCSPGostDigest();
            jCSPGostDigest.setUseDefaultCSPProvider(true);
            byte[] bArr = new byte[16777216];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16777216);
                if (read <= 0) {
                    break;
                } else {
                    jCSPGostDigest.update(bArr, 0, read);
                }
            }
            byte[] digest = jCSPGostDigest.digest();
            if (Arrays.equals(decodeHexBytesNoSpaces, digest)) {
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                JCSPLogger.subExit();
                return;
            }
            throw new ValidationException("Invalid library hash! Expect " + HexString.toHexNoSpaces(decodeHexBytesNoSpaces) + " but actual is " + HexString.toHexNoSpaces(digest));
        } catch (FileNotFoundException e5) {
            e = e5;
            throw new ValidationException("Library file not found.", e);
        } catch (IOException e6) {
            e = e6;
            throw new ValidationException("Library file cannot be read.", e);
        } catch (Exception e7) {
            e = e7;
            if (!(e instanceof ValidationException)) {
                throw new ValidationException("Internal error.", e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static class cl_0 {
        private final String a;
        private final String b;
        private final String c;

        private cl_0(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public String a() {
            String convertPackageToPath = SystemLoad.convertPackageToPath(cl_5.class);
            String str = this.b;
            return (str == null || str.isEmpty()) ? g8e.p(convertPackageToPath, "/libcspjni/", this.a) : oyr.q(convertPackageToPath, "/libcspjni/", this.a, "/", this.b);
        }

        public String b() {
            String str = this.b;
            return ((str == null || str.isEmpty()) ? this.a : g8e.p(this.a, "/", this.b)).replace('/', '.');
        }
    }

    private static cl_0 a() {
        if (Platform.isWindows()) {
            return Platform.is64Bit() ? e : f;
        }
        if (Platform.isMacOS()) {
            return g;
        }
        if (Platform.isAIX()) {
            return Platform.is64Bit() ? h : i;
        }
        String platformArch = Platform.getPlatformArch();
        cl_0 cl_0Var = j;
        if (platformArch.equalsIgnoreCase(cl_0Var.b)) {
            return cl_0Var;
        }
        String platformArch2 = Platform.getPlatformArch();
        cl_0 cl_0Var2 = k;
        return platformArch2.equalsIgnoreCase(cl_0Var2.b) ? cl_0Var2 : Platform.is64Bit() ? l : m;
    }

    public static File a(String str, ClassLoader classLoader, String str2) throws IOException {
        cl_0 cl_0Var = n;
        return SystemLoad.extractFromResourcePath(cl_0Var.a(), str, cl_0Var.c, classLoader, cl_5.class, str2);
    }
}
