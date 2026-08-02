package defpackage;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.a;

/* loaded from: classes5.dex */
public final class xtw implements tzm {
    public final File a;
    public final String b;
    public final ClassLoader c;
    public final ConcurrentHashMap d;
    public final SortedSet e;

    public xtw(File file) {
        if (!file.exists()) {
            tiu.j(file, "File directory doesn't exist: ");
            throw null;
        }
        if (!file.isDirectory()) {
            tiu.j(file, "File doesn't refer to a directory: ");
            throw null;
        }
        this.a = file;
        this.b = null;
        this.c = null;
        ConcurrentHashMap d = d(e("ZoneInfoMap"));
        this.d = d;
        this.e = Collections.unmodifiableSortedSet(new TreeSet(d.keySet()));
    }

    public static ConcurrentHashMap d(InputStream inputStream) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i = 0; i < readUnsignedShort; i++) {
                strArr[i] = dataInputStream.readUTF().intern();
            }
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
                try {
                    concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    kac.f("Corrupt zone info map");
                }
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.a));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // defpackage.tzm
    public final DateTimeZone a(String str) {
        Object obj;
        if (str == null || (obj = this.d.get(str)) == null) {
            return null;
        }
        if (!(obj instanceof SoftReference)) {
            return str.equals(obj) ? c(str) : a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : c(str);
    }

    @Override // defpackage.tzm
    public final Set b() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0029: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:42), block:B:27:0x0029 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DateTimeZone c(String str) {
        InputStream inputStream;
        InputStream inputStream2;
        ConcurrentHashMap concurrentHashMap = this.d;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = e(str);
                try {
                    DateTimeZone a = inputStream instanceof DataInput ? a.a((DataInput) inputStream, str) : a.a(new DataInputStream(inputStream), str);
                    concurrentHashMap.put(str, new SoftReference(a));
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return a;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = 0;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream3 != null) {
            }
            throw th;
        }
    }

    public final InputStream e(String str) {
        File file = this.a;
        if (file != null) {
            return new FileInputStream(new File(file, str));
        }
        String concat = this.b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new wtw(this, concat));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(concat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader = this.c;
        sb.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb.toString());
    }

    public xtw() {
        String concat = "org/joda/time/tz/data".concat("/");
        this.a = null;
        this.b = concat;
        this.c = xtw.class.getClassLoader();
        ConcurrentHashMap d = d(e("ZoneInfoMap"));
        this.d = d;
        this.e = Collections.unmodifiableSortedSet(new TreeSet(d.keySet()));
    }
}
