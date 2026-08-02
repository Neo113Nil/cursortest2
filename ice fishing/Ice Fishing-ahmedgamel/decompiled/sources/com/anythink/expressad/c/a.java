package com.anythink.expressad.c;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f19086a;

    private a() {
    }

    private static a a() {
        if (f19086a == null) {
            synchronized (a.class) {
                try {
                    if (f19086a == null) {
                        f19086a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19086a;
    }

    private static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            new c();
            c.a(str, str2);
            return;
        }
        throw new IOException("zipFilePath or destDirectory is null");
    }

    private void a(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            for (File file2 : file.listFiles()) {
                a(new File(file2.getAbsolutePath()));
            }
            file.delete();
        }
    }
}
