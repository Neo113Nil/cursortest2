package kotlin.io;

import defpackage.c2r;
import defpackage.e2r;
import defpackage.evu0;
import defpackage.f3r;
import defpackage.h3r;
import defpackage.jl40;
import defpackage.s0r;
import defpackage.txk;
import defpackage.wls;
import defpackage.xfo;
import defpackage.zy11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public class b extends h3r {
    public static boolean j(File file, File file2) {
        final txk txkVar = new txk(24);
        if (!file.exists()) {
            txkVar.invoke(file, new NoSuchFileException(file));
            throw null;
        }
        int i = 0;
        try {
            e2r i2 = h3r.i(file, FileWalkDirection.TOP_DOWN);
            c2r c2rVar = new c2r(new e2r(i, new wls() { // from class: kotlin.io.a
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    File file3 = (File) obj;
                    if (wls.this.invoke(file3, (IOException) obj2) != OnErrorAction.TERMINATE) {
                        return zy11.a;
                    }
                    throw new TerminateException(file3, null, null);
                }
            }, (File) i2.b, (FileWalkDirection) i2.c));
            while (c2rVar.hasNext()) {
                File file3 = (File) c2rVar.next();
                if (!file3.exists()) {
                    txkVar.invoke(file3, new NoSuchFileException(file3));
                    throw null;
                }
                File file4 = new File(file2, p(file3, file));
                if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                    txkVar.invoke(file4, new FileAlreadyExistsException(file3, file4, "The destination file already exists."));
                    throw null;
                }
                if (file3.isDirectory()) {
                    file4.mkdirs();
                } else {
                    k(file3, file4, false, 4);
                    if (file4.length() != file3.length()) {
                        txkVar.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs."));
                        throw null;
                    }
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    public static void k(File file, File file2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (!file.exists()) {
            throw new NoSuchFileException(file);
        }
        if (file2.exists()) {
            if (!z) {
                throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                for (int read = fileInputStream.read(bArr); read >= 0; read = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean l(File file) {
        c2r c2rVar = new c2r(h3r.i(file, FileWalkDirection.BOTTOM_UP));
        while (true) {
            boolean z = true;
            while (c2rVar.hasNext()) {
                File file2 = (File) c2rVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String m(File file) {
        return evu0.e0('.', file.getName(), "");
    }

    public static final s0r n(s0r s0rVar) {
        File a = s0rVar.a();
        List<File> b = s0rVar.b();
        ArrayList arrayList = new ArrayList(b.size());
        for (File file : b) {
            String name = file.getName();
            if (!jl40.l(name, Extension.DOT_CHAR)) {
                if (!jl40.l(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || jl40.l(((File) kotlin.collections.a.Z(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                }
            }
        }
        return new s0r(a, arrayList);
    }

    public static File o(File file, String str) {
        File file2 = new File(str);
        if (f3r.a(file2.getPath()) > 0) {
            return file2;
        }
        String file3 = file.toString();
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!evu0.B(file3, c)) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String p(File file, File file2) {
        String sb;
        s0r n = n(f3r.b(file));
        s0r n2 = n(f3r.b(file2));
        if (jl40.l(n.a(), n2.a())) {
            int c = n2.c();
            int c2 = n.c();
            int min = Math.min(c2, c);
            int i = 0;
            while (i < min && jl40.l(n.b().get(i), n2.b().get(i))) {
                i++;
            }
            StringBuilder sb2 = new StringBuilder();
            int i2 = c - 1;
            if (i <= i2) {
                while (!jl40.l(((File) n2.b().get(i2)).getName(), "..")) {
                    sb2.append("..");
                    if (i2 != i) {
                        sb2.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
            }
            if (i < c2) {
                if (i < c) {
                    sb2.append(File.separatorChar);
                }
                kotlin.collections.a.W(kotlin.collections.a.J(n.b(), i), sb2, File.separator, null, HProv.PP_SAME_MEDIA);
            }
            sb = sb2.toString();
            if (sb == null) {
                return sb;
            }
            xfo.e(46, file, " and ", file2, "this and base files have different roots: ");
            return null;
        }
        sb = null;
        if (sb == null) {
        }
    }
}
