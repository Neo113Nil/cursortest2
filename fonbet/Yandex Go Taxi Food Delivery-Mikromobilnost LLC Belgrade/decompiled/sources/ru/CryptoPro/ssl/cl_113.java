package ru.CryptoPro.ssl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PrivilegedExceptionAction;

/* loaded from: classes4.dex */
class cl_113 implements PrivilegedExceptionAction {
    public final /* synthetic */ File a;

    public cl_113(File file) {
        this.a = file;
    }

    @Override // java.security.PrivilegedExceptionAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FileInputStream run() throws Exception {
        File file = this.a;
        try {
            if (file.exists()) {
                return new FileInputStream(file);
            }
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
