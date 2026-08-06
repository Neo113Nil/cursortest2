package defpackage;

/* loaded from: classes.dex */
public class qj1 extends defpackage.c80 {
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.c80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.graphics.Typeface SyNS6RMn(android.content.Context context, defpackage.gz[] gzVarArr) {
        java.io.File file;
        java.io.File kd6TUFXn;
        android.graphics.Typeface createFromFile;
        java.lang.String readlink;
        if (gzVarArr.length >= 1) {
            try {
                android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(defpackage.c80.EgCjBq0SZwJ(gzVarArr).IHQe1A4L2xu, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = android.system.Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (android.system.ErrnoException unused) {
                    }
                    try {
                        if (android.system.OsConstants.S_ISREG(android.system.Os.stat(readlink).st_mode)) {
                            file = new java.io.File(readlink);
                            if (file != null && file.canRead()) {
                                android.graphics.Typeface createFromFile2 = android.graphics.Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
                            kd6TUFXn = defpackage.l80.kd6TUFXn(context);
                            if (kd6TUFXn != null) {
                                try {
                                } catch (java.lang.RuntimeException unused2) {
                                } catch (java.lang.Throwable th) {
                                    kd6TUFXn.delete();
                                    throw th;
                                }
                                if (defpackage.l80.SH1y5HwkJhh(kd6TUFXn, fileInputStream)) {
                                    createFromFile = android.graphics.Typeface.createFromFile(kd6TUFXn.getPath());
                                    kd6TUFXn.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                kd6TUFXn.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        kd6TUFXn = defpackage.l80.kd6TUFXn(context);
                        if (kd6TUFXn != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        android.graphics.Typeface createFromFile22 = android.graphics.Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (java.io.IOException unused3) {
            }
        }
        return null;
    }
}
