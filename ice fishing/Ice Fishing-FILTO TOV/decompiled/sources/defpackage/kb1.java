package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class kb1 extends q70 {
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.q70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface rQPn8YBR(Context context, ru[] ruVarArr) {
        File file;
        File arNh8D4Z5gB;
        Typeface createFromFile;
        String readlink;
        if (ruVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q70.uFEq9NpZ(ruVarArr).GWasM1elztuh, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            arNh8D4Z5gB = o50.arNh8D4Z5gB(context);
                            if (arNh8D4Z5gB != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    arNh8D4Z5gB.delete();
                                    throw th;
                                }
                                if (o50.JFJ3QoxA(arNh8D4Z5gB, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(arNh8D4Z5gB.getPath());
                                    arNh8D4Z5gB.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                arNh8D4Z5gB.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        arNh8D4Z5gB = o50.arNh8D4Z5gB(context);
                        if (arNh8D4Z5gB != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
