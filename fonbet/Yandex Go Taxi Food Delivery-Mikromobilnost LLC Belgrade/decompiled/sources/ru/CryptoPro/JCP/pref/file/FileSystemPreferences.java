package ru.CryptoPro.JCP.pref.file;

import defpackage.cu61;
import defpackage.g8e;
import defpackage.ny61;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.prefs.Preferences;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
class FileSystemPreferences extends java.util.prefs.AbstractPreferences {
    public static final int A;
    public static File i;
    public static boolean j;
    public static File k;
    public static Preferences l;
    public static Preferences m;
    public static File n;
    public static File o;
    public static cu61 p;
    public static cu61 q;
    public static File r;
    public static boolean s;
    public static long t;
    public static File u;
    public static boolean v;
    public static long w;
    public static final Timer x;
    public static final String[] y;
    public static final int z;
    public final File a;
    public final File b;
    public final File c;
    public TreeMap d;
    public long e;
    public final ArrayList f;
    public NodeCreate g;
    public final boolean h;

    /* renamed from: ru.CryptoPro.JCP.pref.file.FileSystemPreferences$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Void run() {
            File file = new File(System.getProperty("java.util.prefs.userRoot", System.getProperty("user.home")), ".java/.userPrefs");
            FileSystemPreferences.k = file;
            if (!file.exists()) {
                if (FileSystemPreferences.k.mkdirs()) {
                    try {
                        FileSystemPreferences.a(FileSystemPreferences.k.getCanonicalPath(), 448);
                    } catch (IOException e) {
                        JCPLogger.subThrown("Could not change permissions on userRoot directory.", e);
                    }
                    JCPLogger.fine("Created user preferences directory.");
                } else {
                    JCPLogger.warning("Couldn't create user preferences directory. User preferences are unusable.");
                }
            }
            FileSystemPreferences.k.canWrite();
            String property = System.getProperty("user.name");
            FileSystemPreferences.n = new File(FileSystemPreferences.k, g8e.o(".user.lock.", property));
            File file2 = new File(FileSystemPreferences.k, g8e.o(".userRootModFile.", property));
            FileSystemPreferences.r = file2;
            if (!file2.exists()) {
                try {
                    FileSystemPreferences.r.createNewFile();
                    int a = FileSystemPreferences.a(FileSystemPreferences.r.getCanonicalPath(), 384);
                    if (a != 0) {
                        JCPLogger.warning("Problem creating userRoot mod file. Chmod failed on " + FileSystemPreferences.r.getCanonicalPath() + " Unix error code " + a);
                    }
                } catch (IOException e2) {
                    JCPLogger.subThrown(e2);
                }
            }
            FileSystemPreferences.t = FileSystemPreferences.r.lastModified();
            return null;
        }
    }

    /* renamed from: ru.CryptoPro.JCP.pref.file.FileSystemPreferences$2, reason: invalid class name */
    class AnonymousClass2 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Void run() {
            File file = new File(System.getProperty("java.util.prefs.systemRoot", "/etc/.java"), ".systemPrefs");
            FileSystemPreferences.i = file;
            if (!file.exists()) {
                File file2 = new File(System.getProperty("java.home"), ".systemPrefs");
                FileSystemPreferences.i = file2;
                if (!file2.exists()) {
                    if (FileSystemPreferences.i.mkdirs()) {
                        JCPLogger.fine("Created system preferences directory in java.home.");
                        try {
                            FileSystemPreferences.a(FileSystemPreferences.i.getCanonicalPath(), 493);
                        } catch (IOException unused) {
                        }
                    } else {
                        JCPLogger.warning("Could not create system preferences directory. System preferences are unusable.");
                    }
                }
            }
            FileSystemPreferences.j = FileSystemPreferences.i.canWrite();
            FileSystemPreferences.o = new File(FileSystemPreferences.i, ".system.lock");
            File file3 = new File(FileSystemPreferences.i, ".systemRootModFile");
            FileSystemPreferences.u = file3;
            if (!file3.exists() && FileSystemPreferences.j) {
                try {
                    FileSystemPreferences.u.createNewFile();
                    int a = FileSystemPreferences.a(FileSystemPreferences.u.getCanonicalPath(), 420);
                    if (a != 0) {
                        JCPLogger.warning("Chmod failed on " + FileSystemPreferences.u.getCanonicalPath() + " Unix error code " + a);
                    }
                } catch (IOException e) {
                    JCPLogger.subThrown(e);
                }
            }
            FileSystemPreferences.w = FileSystemPreferences.u.lastModified();
            return null;
        }
    }

    /* renamed from: ru.CryptoPro.JCP.pref.file.FileSystemPreferences$4, reason: invalid class name */
    class AnonymousClass4 implements PrivilegedAction {

        /* renamed from: ru.CryptoPro.JCP.pref.file.FileSystemPreferences$4$1, reason: invalid class name */
        class AnonymousClass1 extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                FileSystemPreferences.x.cancel();
                FileSystemPreferences.e();
            }
        }

        @Override // java.security.PrivilegedAction
        public Void run() {
            Runtime.getRuntime().addShutdownHook(new AnonymousClass1());
            return null;
        }
    }

    /* renamed from: ru.CryptoPro.JCP.pref.file.FileSystemPreferences$6, reason: invalid class name */
    class AnonymousClass6 implements PrivilegedExceptionAction {
        public AnonymousClass6() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Void run() throws BackingStoreException {
            long j;
            FileInputStream fileInputStream;
            FileSystemPreferences fileSystemPreferences = FileSystemPreferences.this;
            File file = fileSystemPreferences.b;
            TreeMap treeMap = new TreeMap();
            try {
                j = file.lastModified();
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Exception e) {
                    e = e;
                    if (e instanceof InvalidPreferencesFormatException) {
                        JCPLogger.warning("Invalid preferences format in " + file.getPath());
                        if (Platform.isWindows()) {
                            try {
                                Files.move(Paths.get(file.toURI()), Paths.get(new File(file.getParentFile(), "IncorrectFormatPrefs.xml").toURI()), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                            } catch (IOException e2) {
                                JCPLogger.subThrown(e2);
                                throw new BackingStoreException(e2);
                            }
                        } else {
                            file.renameTo(new File(file.getParentFile(), "IncorrectFormatPrefs.xml"));
                        }
                        treeMap = new TreeMap();
                    } else {
                        if (!(e instanceof FileNotFoundException)) {
                            JCPLogger.warning("Exception while reading cache: " + e.getMessage());
                            throw new BackingStoreException(e);
                        }
                        JCPLogger.warning("Prefs file removed in background " + file.getPath());
                    }
                    fileSystemPreferences.d = treeMap;
                    fileSystemPreferences.e = j;
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                j = 0;
            }
            try {
                XmlSupport.b(fileInputStream, treeMap);
                fileInputStream.close();
                fileSystemPreferences.d = treeMap;
                fileSystemPreferences.e = j;
                return null;
            } finally {
            }
        }
    }

    public abstract class Change {
        public abstract void a();
    }

    public class NodeCreate extends Change {
        @Override // ru.CryptoPro.JCP.pref.file.FileSystemPreferences.Change
        public final void a() {
        }
    }

    public class Put extends Change {
        public final String a;
        public final String b;

        public Put(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // ru.CryptoPro.JCP.pref.file.FileSystemPreferences.Change
        public final void a() {
            FileSystemPreferences.this.d.put(this.a, this.b);
        }
    }

    public class Remove extends Change {
        public final String a;

        public Remove(String str) {
            this.a = str;
        }

        @Override // ru.CryptoPro.JCP.pref.file.FileSystemPreferences.Change
        public final void a() {
            FileSystemPreferences.this.d.remove(this.a);
        }
    }

    static {
        int max = Math.max(1, GetProperty.getIntegerProperty("java.util.prefs.syncInterval", 30));
        l = null;
        p = null;
        q = null;
        s = false;
        v = false;
        Timer timer = new Timer(true);
        x = timer;
        long j2 = max * 1000;
        timer.schedule(new TimerTask() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                FileSystemPreferences.e();
            }
        }, j2, j2);
        AccessController.doPrivileged(new AnonymousClass4());
        y = new String[0];
        z = 50;
        A = 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileSystemPreferences(FileSystemPreferences fileSystemPreferences, String str) {
        super(fileSystemPreferences, str);
        this.d = null;
        this.e = 0L;
        this.f = new ArrayList();
        this.g = null;
        this.h = fileSystemPreferences.h;
        File file = fileSystemPreferences.a;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127 || charAt == '/' || charAt == '.' || charAt == '_') {
                StringBuilder sb = new StringBuilder("_");
                int length2 = str.length();
                byte[] bArr = new byte[length2 * 2];
                int i3 = 0;
                for (int i4 = 0; i4 < length2; i4++) {
                    char charAt2 = str.charAt(i4);
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) (charAt2 >> '\b');
                    i3 += 2;
                    bArr[i5] = (byte) charAt2;
                }
                sb.append(Base64.b(bArr, true));
                str = sb.toString();
                File file2 = new File(file, str);
                this.a = file2;
                this.b = new File(file2, "prefs.xml");
                this.c = new File(file2, "prefs.tmp");
                AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.5
                    @Override // java.security.PrivilegedAction
                    public Void run() {
                        ((java.util.prefs.AbstractPreferences) FileSystemPreferences.this).newNode = !r1.a.exists();
                        return null;
                    }
                });
                if (((java.util.prefs.AbstractPreferences) this).newNode) {
                    return;
                }
                this.d = new TreeMap();
                NodeCreate nodeCreate = new NodeCreate();
                this.g = nodeCreate;
                this.f.add(nodeCreate);
                return;
            }
        }
        File file22 = new File(file, str);
        this.a = file22;
        this.b = new File(file22, "prefs.xml");
        this.c = new File(file22, "prefs.tmp");
        AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.5
            @Override // java.security.PrivilegedAction
            public Void run() {
                ((java.util.prefs.AbstractPreferences) FileSystemPreferences.this).newNode = !r1.a.exists();
                return null;
            }
        });
        if (((java.util.prefs.AbstractPreferences) this).newNode) {
        }
    }

    public static int a(String str, int i2) {
        if (Platform.isWindows()) {
            return 0;
        }
        int i3 = -1;
        try {
            i3 = Runtime.getRuntime().exec("chmod " + i2 + " " + str).waitFor();
            if (i3 == 0) {
                return i3;
            }
            JCPLogger.warning("Chmod shell script failed. Returned code: " + i3);
            return i3;
        } catch (Exception e) {
            JCPLogger.subThrown(e);
            return i3;
        }
    }

    public static void c(FileSystemPreferences fileSystemPreferences) {
        ArrayList arrayList = fileSystemPreferences.f;
        File file = fileSystemPreferences.b;
        if (fileSystemPreferences.isRemoved()) {
            ny61.r("Node has been removed");
            return;
        }
        if (fileSystemPreferences.d == null) {
            return;
        }
        int i2 = 0;
        if (!fileSystemPreferences.isUserNode() ? !v : !s) {
            long lastModified = file.lastModified();
            if (lastModified != fileSystemPreferences.e) {
                try {
                    AccessController.doPrivileged(fileSystemPreferences.new AnonymousClass6());
                    int size = arrayList.size();
                    while (i2 < size) {
                        ((Change) arrayList.get(i2)).a();
                        i2++;
                    }
                    fileSystemPreferences.e = lastModified;
                } catch (PrivilegedActionException e) {
                    throw ((BackingStoreException) e.getException());
                }
            }
        } else if (fileSystemPreferences.e != 0 && !fileSystemPreferences.a.exists()) {
            fileSystemPreferences.d = new TreeMap();
            int size2 = arrayList.size();
            while (i2 < size2) {
                ((Change) arrayList.get(i2)).a();
                i2++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.7
                @Override // java.security.PrivilegedExceptionAction
                public Void run() throws BackingStoreException {
                    FileSystemPreferences fileSystemPreferences2 = FileSystemPreferences.this;
                    File file2 = fileSystemPreferences2.a;
                    File file3 = fileSystemPreferences2.b;
                    File file4 = fileSystemPreferences2.c;
                    try {
                        if (!file2.exists() && !file2.mkdirs()) {
                            throw new BackingStoreException(file2 + " create failed.");
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                        try {
                            XmlSupport.c(fileOutputStream, fileSystemPreferences2.d);
                            fileOutputStream.close();
                            if (!Platform.isWindows()) {
                                if (file4.renameTo(file3)) {
                                    return null;
                                }
                                throw new BackingStoreException("Can't rename " + file4 + " to " + file3);
                            }
                            try {
                                Files.move(Paths.get(file4.toURI()), Paths.get(file3.toURI()), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                                return null;
                            } catch (IOException e2) {
                                JCPLogger.subThrown(e2);
                                throw new BackingStoreException("Can't rename " + file4 + " to " + file3);
                            }
                        } finally {
                        }
                    } catch (Exception e3) {
                        if (e3 instanceof BackingStoreException) {
                            throw ((BackingStoreException) e3);
                        }
                        throw new BackingStoreException(e3);
                    }
                }
            });
            long lastModified2 = file.lastModified();
            if (fileSystemPreferences.e <= lastModified2) {
                long j2 = lastModified2 + 1000;
                fileSystemPreferences.e = j2;
                file.setLastModified(j2);
            }
            arrayList.clear();
        } catch (PrivilegedActionException e2) {
            throw ((BackingStoreException) e2.getException());
        }
    }

    public static void e() {
        Preferences preferences;
        Preferences preferences2;
        synchronized (FileSystemPreferences.class) {
            preferences = l;
            preferences2 = m;
        }
        if (preferences != null) {
            try {
                preferences.flush();
            } catch (BackingStoreException e) {
                JCPLogger.subThrown("Couldn't flush user prefs", e);
            }
        }
        if (preferences2 != null) {
            try {
                preferences2.flush();
            } catch (BackingStoreException e2) {
                JCPLogger.subThrown("Couldn't flush system prefs", e2);
            }
        }
    }

    @Override // java.util.prefs.AbstractPreferences
    public java.util.prefs.AbstractPreferences childSpi(String str) {
        return new FileSystemPreferences(this, str);
    }

    @Override // java.util.prefs.AbstractPreferences
    public String[] childrenNamesSpi() {
        return (String[]) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.8
            @Override // java.security.PrivilegedAction
            public String[] run() {
                ArrayList arrayList = new ArrayList();
                File[] listFiles = FileSystemPreferences.this.a.listFiles();
                if (listFiles != null) {
                    for (int i2 = 0; i2 < listFiles.length; i2++) {
                        if (listFiles[i2].isDirectory()) {
                            String name = listFiles[i2].getName();
                            if (name.charAt(0) == '_') {
                                byte[] c = Base64.c(name.substring(1), true);
                                StringBuffer stringBuffer = new StringBuffer(c.length / 2);
                                int i3 = 0;
                                while (i3 < c.length) {
                                    int i4 = i3 + 1;
                                    int i5 = c[i3] & 255;
                                    i3 += 2;
                                    stringBuffer.append((char) ((c[i4] & 255) | (i5 << 8)));
                                }
                                name = stringBuffer.toString();
                            }
                            arrayList.add(name);
                        }
                    }
                }
                return (String[]) arrayList.toArray(FileSystemPreferences.y);
            }
        });
    }

    public final boolean d() {
        boolean isUserNode = isUserNode();
        File file = isUserNode ? n : o;
        long j2 = z;
        for (int i2 = 0; i2 < A; i2++) {
            try {
                try {
                    cu61 cu61Var = new cu61(file.getCanonicalPath());
                    cu61Var.lock();
                    if (isUserNode) {
                        p = cu61Var;
                        return true;
                    }
                    q = cu61Var;
                    return true;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (Exception unused2) {
                Thread.sleep(j2);
                j2 *= 2;
            }
        }
        return false;
    }

    public final void f() {
        if (this.d != null) {
            return;
        }
        try {
            try {
                AccessController.doPrivileged(new AnonymousClass6());
            } catch (PrivilegedActionException e) {
                throw ((BackingStoreException) e.getException());
            }
        } catch (Exception unused) {
            this.d = new TreeMap();
        }
    }

    @Override // java.util.prefs.AbstractPreferences, java.util.prefs.Preferences
    public void flush() throws BackingStoreException {
        if (isRemoved()) {
            return;
        }
        sync();
    }

    @Override // java.util.prefs.AbstractPreferences
    public void flushSpi() throws BackingStoreException {
    }

    public final void g() {
        boolean isUserNode = isUserNode();
        cu61 cu61Var = isUserNode ? p : q;
        if (cu61Var == null) {
            StringBuilder sb = new StringBuilder("Unlock: zero lockHandle for ");
            sb.append(isUserNode ? "user" : "system");
            sb.append(" preferences.)");
            JCPLogger.warning(sb.toString());
            return;
        }
        cu61Var.unlockFinally();
        if (isUserNode()) {
            p = null;
        } else {
            q = null;
        }
    }

    @Override // java.util.prefs.AbstractPreferences
    public String getSpi(String str) {
        f();
        return (String) this.d.get(str);
    }

    @Override // java.util.prefs.AbstractPreferences, java.util.prefs.Preferences
    public boolean isUserNode() {
        return this.h;
    }

    @Override // java.util.prefs.AbstractPreferences
    public String[] keysSpi() {
        f();
        return (String[]) this.d.keySet().toArray(new String[this.d.size()]);
    }

    @Override // java.util.prefs.AbstractPreferences
    public void putSpi(String str, String str2) {
        f();
        this.f.add(new Put(str, str2));
        this.d.put(str, str2);
    }

    @Override // java.util.prefs.AbstractPreferences, java.util.prefs.Preferences
    public void removeNode() throws BackingStoreException {
        synchronized ((isUserNode() ? n : o)) {
            try {
                if (!d()) {
                    throw new BackingStoreException("Couldn't get file lock.");
                }
                try {
                    super.removeNode();
                } finally {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.prefs.AbstractPreferences
    public void removeNodeSpi() throws BackingStoreException {
        try {
            AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.9
                @Override // java.security.PrivilegedExceptionAction
                public Void run() throws BackingStoreException {
                    FileSystemPreferences fileSystemPreferences = FileSystemPreferences.this;
                    File file = fileSystemPreferences.a;
                    ArrayList arrayList = fileSystemPreferences.f;
                    if (arrayList.contains(fileSystemPreferences.g)) {
                        arrayList.remove(fileSystemPreferences.g);
                        fileSystemPreferences.g = null;
                        return null;
                    }
                    if (file.exists()) {
                        fileSystemPreferences.b.delete();
                        fileSystemPreferences.c.delete();
                        File[] listFiles = file.listFiles();
                        if (listFiles.length != 0) {
                            JCPLogger.warning("Found extraneous files when removing node: " + Arrays.asList(listFiles));
                            for (File file2 : listFiles) {
                                file2.delete();
                            }
                        }
                        if (!file.delete()) {
                            throw new BackingStoreException("Couldn't delete dir: " + file);
                        }
                    }
                    return null;
                }
            });
        } catch (PrivilegedActionException e) {
            throw ((BackingStoreException) e.getException());
        }
    }

    @Override // java.util.prefs.AbstractPreferences
    public void removeSpi(String str) {
        f();
        this.f.add(new Remove(str));
        this.d.remove(str);
    }

    @Override // java.util.prefs.AbstractPreferences, java.util.prefs.Preferences
    public synchronized void sync() throws BackingStoreException {
        try {
            isUserNode();
            synchronized ((isUserNode() ? n : o)) {
                if (!d()) {
                    throw new BackingStoreException("Couldn't get file lock.");
                }
                final Long l2 = (Long) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.10
                    @Override // java.security.PrivilegedAction
                    public Long run() {
                        long lastModified;
                        if (FileSystemPreferences.this.isUserNode()) {
                            lastModified = FileSystemPreferences.r.lastModified();
                            FileSystemPreferences.s = FileSystemPreferences.t == lastModified;
                        } else {
                            lastModified = FileSystemPreferences.u.lastModified();
                            FileSystemPreferences.v = FileSystemPreferences.w == lastModified;
                        }
                        return new Long(lastModified);
                    }
                });
                try {
                    super.sync();
                    AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.11
                        @Override // java.security.PrivilegedAction
                        public Void run() {
                            File file;
                            long j2;
                            boolean isUserNode = FileSystemPreferences.this.isUserNode();
                            Long l3 = l2;
                            if (isUserNode) {
                                FileSystemPreferences.t = l3.longValue() + 1000;
                                file = FileSystemPreferences.r;
                                j2 = FileSystemPreferences.t;
                            } else {
                                FileSystemPreferences.w = l3.longValue() + 1000;
                                file = FileSystemPreferences.u;
                                j2 = FileSystemPreferences.w;
                            }
                            file.setLastModified(j2);
                            return null;
                        }
                    });
                } finally {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.prefs.AbstractPreferences
    public void syncSpi() throws BackingStoreException {
        try {
            AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCP.pref.file.FileSystemPreferences.12
                @Override // java.security.PrivilegedExceptionAction
                public Void run() throws BackingStoreException {
                    FileSystemPreferences.c(FileSystemPreferences.this);
                    return null;
                }
            });
        } catch (PrivilegedActionException e) {
            throw ((BackingStoreException) e.getException());
        }
    }

    public FileSystemPreferences(boolean z2) {
        super(null, "");
        this.d = null;
        this.e = 0L;
        this.f = new ArrayList();
        this.g = null;
        this.h = z2;
        File file = z2 ? k : i;
        this.a = file;
        this.b = new File(file, "prefs.xml");
        this.c = new File(file, "prefs.tmp");
    }
}
