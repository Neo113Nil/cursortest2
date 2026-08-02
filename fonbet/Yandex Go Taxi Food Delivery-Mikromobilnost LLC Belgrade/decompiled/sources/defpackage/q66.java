package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.connection.RealConnection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class q66 implements ed7 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object w;
    public Object x;

    public q66() {
        vms vmsVar = new vms(10);
        no2 no2Var = new no2();
        this.b = new HashSet();
        this.c = vmsVar;
        this.w = no2Var;
    }

    public static IOException c(q66 q66Var, long j, boolean z, IOException iOException, int i) {
        boolean z2;
        boolean z3;
        q66 q66Var2;
        IOException iOException2;
        nci0 nci0Var = (nci0) q66Var.b;
        boolean z4 = false;
        boolean z5 = (i & 4) == 0;
        boolean z6 = (i & 8) == 0;
        bgo bgoVar = (bgo) q66Var.c;
        if (iOException != null) {
            q66Var.r(iOException);
        }
        if (z6) {
            if (iOException != null) {
                bgoVar.requestFailed(nci0Var, iOException);
            } else {
                bgoVar.requestBodyEnd(nci0Var, j);
            }
        }
        if (z5) {
            if (iOException != null) {
                bgoVar.responseFailed(nci0Var, iOException);
            } else {
                bgoVar.responseBodyEnd(nci0Var, j);
            }
        }
        if (!z6 || z) {
            z2 = false;
        } else {
            z2 = false;
            z4 = true;
        }
        boolean z7 = (!z5 || z) ? z2 : true;
        boolean z8 = (z6 && z) ? true : z2;
        if (z5 && z) {
            z3 = true;
            iOException2 = iOException;
            q66Var2 = q66Var;
        } else {
            z3 = z2;
            q66Var2 = q66Var;
            iOException2 = iOException;
        }
        return nci0Var.f(q66Var2, z4, z7, z3, z8, iOException2);
    }

    public static int g(dd7 dd7Var, int i) {
        int hashCode = dd7Var.b.hashCode() + (dd7Var.a * 31);
        if (i < 2) {
            long a = bhe.a(dd7Var.d());
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }
        return dd7Var.d().hashCode() + (hashCode * 31);
    }

    public static dd7 p(int i, DataInputStream dataInputStream) {
        f9h h;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            che cheVar = new che();
            che.b(cheVar, readLong);
            h = f9h.c.b(cheVar);
        } else {
            h = yuf0.h(dataInputStream);
        }
        return new dd7(readInt, readUTF, h);
    }

    public void a() {
        synchronized (((sa7) this.x)) {
            if (this.a) {
                return;
            }
            this.a = true;
            yf61.b((uis0) this.c);
            try {
                ((lxj) this.b).a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.ed7
    public void b(long j) {
    }

    @Override // defpackage.ed7
    public void d(HashMap hashMap) {
        sb3 sb3Var = (sb3) this.w;
        DataOutputStream dataOutputStream = null;
        try {
            qb3 b = sb3Var.b();
            k2k0 k2k0Var = (k2k0) this.x;
            if (k2k0Var == null) {
                this.x = new k2k0(b);
            } else {
                k2k0Var.c(b);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((k2k0) this.x);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(hashMap.size());
                int i = 0;
                for (dd7 dd7Var : hashMap.values()) {
                    dataOutputStream2.writeInt(dd7Var.a);
                    dataOutputStream2.writeUTF(dd7Var.b);
                    yuf0.i(dd7Var.d(), dataOutputStream2);
                    i += g(dd7Var, 2);
                }
                dataOutputStream2.writeInt(i);
                dataOutputStream2.close();
                sb3Var.c.delete();
                int i2 = tw21.a;
                this.a = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                tw21.g(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ed7
    public void delete() {
        sb3 sb3Var = (sb3) this.w;
        sb3Var.b.delete();
        sb3Var.c.delete();
    }

    public RealConnection e() {
        ojo j = ((pjo) this.x).j();
        RealConnection realConnection = j instanceof RealConnection ? (RealConnection) j : null;
        if (realConnection != null) {
            return realConnection;
        }
        ny61.r("no connection for CONNECT tunnels");
        return null;
    }

    public File f(Context context, String str) {
        ((vms) this.c).getClass();
        return new File(context.getDir("lib", 0), vms.i(str));
    }

    public void h(Context context, String str) {
        ern ernVar;
        h0w b;
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        if (context == null) {
            ny61.g("Given context is null");
            return;
        }
        if (str.length() == 0) {
            ny61.g("Given library is either null or empty");
            return;
        }
        m("Beginning load of %s...", str);
        vms vmsVar = (vms) this.c;
        HashSet hashSet = (HashSet) this.b;
        if (hashSet.contains(str)) {
            m("%s already loaded previously!", str);
            return;
        }
        h0w h0wVar = null;
        try {
            vmsVar.getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            m("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e) {
            m("Loading the library normally failed: %s", Log.getStackTraceString(e));
            m("%s (%s) was not loaded normally, re-linking...", str, null);
            File f = f(context, str);
            if (!f.exists()) {
                File dir = context.getDir("lib", 0);
                File f2 = f(context, str);
                vmsVar.getClass();
                File[] listFiles = dir.listFiles(new eai0(vms.i(str)));
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (!file.getAbsolutePath().equals(f2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                no2 no2Var = (no2) this.w;
                String[] strArr2 = Build.SUPPORTED_ABIS;
                if (strArr2.length <= 0) {
                    String str2 = Build.CPU_ABI2;
                    strArr2 = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                }
                String i = vms.i(str);
                no2Var.getClass();
                try {
                    b = no2.b(context, strArr2, i, this);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (b == null) {
                        try {
                            strArr = no2.c(context, i);
                        } catch (Exception e2) {
                            strArr = new String[]{e2.toString()};
                        }
                        StringBuilder x = unr0.x("Could not find '", i, "'. Looked for: ");
                        x.append(Arrays.toString(strArr2));
                        x.append(", but only found: ");
                        throw new MissingLibraryException(oyr.t(x, Arrays.toString(strArr), Extension.DOT_CHAR));
                    }
                    ZipFile zipFile = (ZipFile) b.b;
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (i2 < 5) {
                            m("Found %s! Extracting...", i);
                            try {
                                if (f.exists() || f.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream((ZipEntry) b.c);
                                    } catch (FileNotFoundException unused) {
                                        inputStream2 = null;
                                    } catch (IOException unused2) {
                                        inputStream2 = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream = null;
                                    }
                                    try {
                                        fileOutputStream = new FileOutputStream(f);
                                        try {
                                            byte[] bArr = new byte[4096];
                                            long j = 0;
                                            while (true) {
                                                int read = inputStream2.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, read);
                                                j += read;
                                                inputStream2 = inputStream2;
                                            }
                                            fileOutputStream.flush();
                                            try {
                                                fileOutputStream.getFD().sync();
                                                if (j == f.length()) {
                                                    no2.a(inputStream2);
                                                    no2.a(fileOutputStream);
                                                    f.setReadable(true, false);
                                                    f.setExecutable(true, false);
                                                    f.setWritable(true);
                                                    break;
                                                }
                                            } catch (FileNotFoundException | IOException unused3) {
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                no2.a(inputStream);
                                                no2.a(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused4) {
                                            inputStream2 = inputStream2;
                                        } catch (IOException unused5) {
                                            inputStream2 = inputStream2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                        }
                                    } catch (FileNotFoundException unused6) {
                                        fileOutputStream = null;
                                        no2.a(inputStream2);
                                        no2.a(fileOutputStream);
                                        i2 = i3;
                                    } catch (IOException unused7) {
                                        fileOutputStream = null;
                                        no2.a(inputStream2);
                                        no2.a(fileOutputStream);
                                        i2 = i3;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStream = inputStream2;
                                        fileOutputStream = null;
                                        no2.a(inputStream);
                                        no2.a(fileOutputStream);
                                        throw th;
                                    }
                                    no2.a(inputStream2);
                                    no2.a(fileOutputStream);
                                }
                            } catch (IOException unused8) {
                            }
                            i2 = i3;
                        } else if (((qir) this.x) != null) {
                            qir.h("FATAL! Couldn't extract the library from the APK!");
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (IOException unused9) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    h0wVar = b;
                    if (h0wVar != null) {
                        try {
                            ((ZipFile) h0wVar.b).close();
                        } catch (IOException unused10) {
                        }
                    }
                    throw th;
                }
            }
            try {
                if (this.a) {
                    try {
                        ernVar = new ern(f);
                        try {
                            List<String> a = ernVar.a();
                            ernVar.close();
                            for (String str3 : a) {
                                vmsVar.getClass();
                                h(context, str3.substring(3, str3.length() - 3));
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            if (ernVar != null) {
                                ernVar.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        ernVar = null;
                    }
                }
            } catch (IOException unused11) {
            }
            String absolutePath = f.getAbsolutePath();
            vmsVar.getClass();
            System.load(absolutePath);
            hashSet.add(str);
            m("%s (%s) was re-linked!", str, null);
        }
    }

    @Override // defpackage.ed7
    public void i(dd7 dd7Var) {
        this.a = true;
    }

    @Override // defpackage.ed7
    public boolean j() {
        sb3 sb3Var = (sb3) this.w;
        return sb3Var.b.exists() || sb3Var.c.exists();
    }

    @Override // defpackage.ed7
    public void k(HashMap hashMap) {
        if (this.a) {
            d(hashMap);
        }
    }

    @Override // defpackage.ed7
    public void l(dd7 dd7Var, boolean z) {
        this.a = true;
    }

    public void m(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((qir) this.x) != null) {
            qir.h(format);
        }
    }

    public fdi0 n(kvj0 kvj0Var) {
        q66 q66Var;
        pjo pjoVar = (pjo) this.x;
        try {
            String a = kvj0Var.y.a("Content-Type");
            if (a == null) {
                a = null;
            }
            long i = pjoVar.i(kvj0Var);
            q66Var = this;
            try {
                return new fdi0(a, i, new jci0(new njo(q66Var, pjoVar.e(kvj0Var), i, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                ((bgo) q66Var.c).responseFailed((nci0) q66Var.b, iOException);
                q66Var.r(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            q66Var = this;
        }
    }

    @Override // defpackage.ed7
    public void o(HashMap hashMap, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        int readInt;
        DataInputStream dataInputStream2;
        int i;
        int readInt2;
        boolean z;
        d6z.x(!this.a);
        Cipher cipher = (Cipher) this.b;
        sb3 sb3Var = (sb3) this.w;
        File file = sb3Var.b;
        File file2 = sb3Var.b;
        File file3 = sb3Var.c;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream3 = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                dataInputStream = new DataInputStream(bufferedInputStream);
                try {
                    readInt = dataInputStream.readInt();
                } catch (IOException unused) {
                    dataInputStream3 = dataInputStream;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream3 = dataInputStream;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            if (readInt >= 0 && readInt <= 2) {
                if ((dataInputStream.readInt() & 1) == 0) {
                    dataInputStream2 = dataInputStream;
                } else if (cipher != null) {
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                    try {
                        SecretKeySpec secretKeySpec = (SecretKeySpec) this.c;
                        int i2 = tw21.a;
                        cipher.init(2, secretKeySpec, ivParameterSpec);
                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                }
                try {
                    int readInt3 = dataInputStream2.readInt();
                    i = 0;
                    for (int i3 = 0; i3 < readInt3; i3++) {
                        dd7 p = p(readInt, dataInputStream2);
                        String str = p.b;
                        hashMap.put(str, p);
                        sparseArray.put(p.a, str);
                        i += g(p, readInt);
                    }
                    readInt2 = dataInputStream2.readInt();
                    z = dataInputStream2.read() == -1;
                } catch (IOException unused3) {
                    dataInputStream3 = dataInputStream2;
                    if (dataInputStream3 != null) {
                        tw21.g(dataInputStream3);
                    }
                    hashMap.clear();
                    sparseArray.clear();
                    file2.delete();
                    file3.delete();
                } catch (Throwable th3) {
                    dataInputStream3 = dataInputStream2;
                    th = th3;
                    if (dataInputStream3 != null) {
                        tw21.g(dataInputStream3);
                    }
                    throw th;
                }
                if (readInt2 == i && z) {
                    tw21.g(dataInputStream2);
                    return;
                }
                tw21.g(dataInputStream2);
                hashMap.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            }
            tw21.g(dataInputStream);
            hashMap.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    public cvj0 q(boolean z) {
        try {
            cvj0 h = ((pjo) this.x).h(z);
            if (h == null) {
                return h;
            }
            h.n = this;
            return h;
        } catch (IOException e) {
            ((bgo) this.c).responseFailed((nci0) this.b, e);
            r(e);
            throw e;
        }
    }

    public void r(IOException iOException) {
        this.a = true;
        ((pjo) this.x).j().e((nci0) this.b, iOException);
    }

    public jdj s() {
        nci0 nci0Var = (nci0) this.b;
        if (nci0Var.D) {
            ny61.r("Check failed.");
            return null;
        }
        nci0Var.D = true;
        nci0Var.y.j();
        synchronized (nci0Var) {
            if (nci0Var.L == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (nci0Var.H || nci0Var.I) {
                throw new IllegalStateException("Check failed.");
            }
            if (nci0Var.F) {
                throw new IllegalStateException("Check failed.");
            }
            if (!nci0Var.G) {
                throw new IllegalStateException("Check failed.");
            }
            nci0Var.G = false;
            nci0Var.H = true;
            nci0Var.I = true;
        }
        RealConnection realConnection = (RealConnection) ((pjo) this.x).j();
        realConnection.e.setSoTimeout(0);
        realConnection.b();
        return new jdj(this);
    }

    public q66(nci0 nci0Var, bgo bgoVar, qjo qjoVar, pjo pjoVar) {
        this.b = nci0Var;
        this.c = bgoVar;
        this.w = qjoVar;
        this.x = pjoVar;
    }

    public q66(Set set, f76 f76Var, h76 h76Var, g76 g76Var, boolean z) {
        this.b = set;
        this.c = f76Var;
        this.w = h76Var;
        this.x = g76Var;
        this.a = z;
    }

    public q66(sa7 sa7Var, lxj lxjVar) {
        this.x = sa7Var;
        this.b = lxjVar;
        uis0 h = lxjVar.h(1);
        this.c = h;
        this.w = new pa7(sa7Var, this, h);
    }

    public q66(File file) {
        this.b = null;
        this.c = null;
        this.w = new sb3(file);
    }
}
