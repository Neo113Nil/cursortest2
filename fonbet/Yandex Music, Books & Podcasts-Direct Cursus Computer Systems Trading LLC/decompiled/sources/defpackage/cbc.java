package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public class cbc extends abc {
    public static boolean h(File file, File file2) {
        boolean exists = file.exists();
        bbc bbcVar = bbc.a;
        if (exists) {
            try {
                wac wacVar = new wac(file, FileWalkDirection.a, null, null, null, 0, 32, null);
                ab8 ab8Var = new ab8(new wac(wacVar.a, wacVar.b, wacVar.c, wacVar.d, new im0(bbcVar, 8), wacVar.f));
                while (ab8Var.hasNext()) {
                    File file3 = (File) ab8Var.next();
                    if (file3.exists()) {
                        File file4 = new File(file2, m(file3, file));
                        if (!file4.exists() || (file3.isDirectory() && file4.isDirectory())) {
                            if (file3.isDirectory()) {
                                file4.mkdirs();
                            } else {
                                i(file3, file4, false, 4);
                                if (file4.length() != file3.length() && bbcVar.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs.")) == xpj.a) {
                                }
                            }
                        } else if (bbcVar.invoke(file4, new k9c(file3, file4, "The destination file already exists.")) == xpj.a) {
                        }
                    } else if (bbcVar.invoke(file3, new v7j(file3, null, "The source file doesn't exist.", 2, null)) == xpj.a) {
                    }
                }
                return true;
            } catch (a9s unused) {
            }
        } else if (bbcVar.invoke(file, new v7j(file, null, "The source file doesn't exist.", 2, null)) != xpj.a) {
            return true;
        }
        return false;
    }

    public static void i(File file, File file2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (!file.exists()) {
            throw new v7j(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new k9c(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new k9c(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new nac(file, file2, "Failed to create target directory.");
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
                vnj.u(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean j(File file) {
        file.getClass();
        ab8 ab8Var = new ab8(new wac(file, FileWalkDirection.b, null, null, null, 0, 32, null));
        while (true) {
            boolean z = true;
            while (ab8Var.hasNext()) {
                File file2 = (File) ab8Var.next();
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

    public static final fac k(fac facVar) {
        File file = facVar.a;
        List<File> list = facVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!Intrinsics.d(name, ".")) {
                if (!Intrinsics.d(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || Intrinsics.d(((File) CollectionsKt.Y(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        return new fac(file, arrayList);
    }

    public static File l(File file, String str) {
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        if (yac.a(path) > 0) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!StringsKt.O(file3, c)) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static final String m(File file, File file2) {
        fac k = k(yac.b(file));
        List list = k.b;
        fac k2 = k(yac.b(file2));
        List list2 = k2.b;
        boolean equals = k.a.equals(k2.a);
        String str = null;
        if (equals) {
            int size = list2.size();
            int size2 = list.size();
            int min = Math.min(size2, size);
            int i = 0;
            while (i < min && Intrinsics.d(list.get(i), list2.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (!Intrinsics.d(((File) list2.get(i2)).getName(), "..")) {
                    sb.append("..");
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
            }
            if (i < size2) {
                if (i < size) {
                    sb.append(File.separatorChar);
                }
                List L = CollectionsKt.L(list, i);
                String str2 = File.separator;
                str2.getClass();
                CollectionsKt.V(L, sb, str2, null, 124);
            }
            str = sb.toString();
        }
        if (str != null) {
            return str;
        }
        xq0.r("this and base files have different roots: ", file, " and ", file2, 46);
        return null;
    }
}
