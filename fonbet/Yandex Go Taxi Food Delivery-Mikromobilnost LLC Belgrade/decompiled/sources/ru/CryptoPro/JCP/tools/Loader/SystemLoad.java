package ru.CryptoPro.JCP.tools.Loader;

import defpackage.f3f;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.unr0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.Random;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class SystemLoad {
    public static File a(String str) {
        if (str == null) {
            str = System.getProperty("java.io.tmpdir");
        }
        File file = new File(new File(str), oyr.i(System.getProperty("user.name").hashCode(), "jni-"));
        file.mkdirs();
        if (!file.exists()) {
            throw new IOException("JNI temporary directory " + file + " does not exist.");
        }
        if (file.canWrite()) {
            return file;
        }
        throw new IOException("JNI temporary directory " + file + " is not writable.");
    }

    public static String convertPackageToPath(Class cls) {
        String canonicalName = cls.getCanonicalName();
        return "/" + canonicalName.substring(0, canonicalName.lastIndexOf(46)).replace('.', '/');
    }

    public static boolean deleteLibrary(File file) {
        JCPLogger.fine("Deleting library " + file.getAbsolutePath());
        if (file.delete()) {
            return true;
        }
        try {
            new File(file.getParentFile(), file.getName() + ".x").createNewFile();
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    public static File extractFromResourcePath(String str, String str2, String str3, ClassLoader classLoader, Class cls, String str4) throws IOException {
        File file;
        File file2;
        FileOutputStream fileOutputStream;
        JCPLogger.subEnter();
        File a = a(str4);
        JCPLogger.fine("Cleaning temporary directory " + a.getAbsolutePath());
        File[] listFiles = a.listFiles(new f3f(1));
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            File file3 = listFiles[i];
            File file4 = new File(file3.getParentFile(), oyr.g(2, 0, file3.getName()));
            if (!file4.exists() || file4.delete()) {
                file3.delete();
            }
        }
        JCPLogger.subExit();
        if (classLoader == null && (classLoader = Thread.currentThread().getContextClassLoader()) == null) {
            classLoader = cls.getClassLoader();
        }
        String p = g8e.p(str2, Extension.DOT_CHAR, str3);
        String p2 = g8e.p(str, "/", p);
        if (p2.startsWith("/")) {
            p2 = p2.substring(1);
        }
        JCPLogger.fine("Loading resource by path ".concat(p2));
        URL resource = classLoader.getResource(p2);
        if (resource == null && p2.startsWith(str)) {
            JCPLogger.fine("Loading resource url by name ".concat(p));
            resource = classLoader.getResource(p);
        }
        FileOutputStream fileOutputStream2 = null;
        if (resource == null) {
            String property = System.getProperty("java.class.path");
            if (classLoader instanceof URLClassLoader) {
                property = Arrays.asList(((URLClassLoader) classLoader).getURLs()).toString();
            }
            ny61.v(unr0.p("Library from ", p2, " not found in the path(s) ", property, Extension.DOT_CHAR));
            return null;
        }
        if (resource.getProtocol().toLowerCase().equals("file")) {
            try {
                file = new File(new URI(resource.toString()));
            } catch (URISyntaxException unused) {
                file = new File(resource.getPath());
            }
            JCPLogger.fine("Created temporary library " + file.getAbsolutePath());
            return file;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(p2);
        if (resourceAsStream == null) {
            ny61.v("Can't read input stream from ".concat(p2));
            return null;
        }
        try {
            try {
                int nextInt = new Random().nextInt();
                File a2 = a(str4);
                String str5 = Platform.isWindows() ? ".dll" : null;
                StringBuilder sb = new StringBuilder();
                sb.append("jni");
                sb.append(nextInt);
                if (str5 == null) {
                    str5 = ".tmp";
                }
                sb.append(str5);
                file2 = new File(a2, sb.toString());
                file2.deleteOnExit();
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[16777216];
            while (true) {
                int read = resourceAsStream.read(bArr, 0, 16777216);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (Exception unused2) {
                    }
                }
            }
            resourceAsStream.close();
            try {
                fileOutputStream.close();
            } catch (Exception unused3) {
            }
            return file2;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            JCPLogger.fatal("Error occurred during library reading.", (Throwable) e);
            throw new IOException("Failed to create temporary file " + str2 + Extension.COLON_SPACE + e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                resourceAsStream.close();
            } catch (Exception unused4) {
            }
            if (fileOutputStream2 == null) {
                throw th;
            }
            try {
                fileOutputStream2.close();
                throw th;
            } catch (Exception unused5) {
                throw th;
            }
        }
    }
}
