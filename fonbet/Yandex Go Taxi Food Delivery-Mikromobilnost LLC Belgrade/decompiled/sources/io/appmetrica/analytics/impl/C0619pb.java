package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.ny61;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0619pb {
    public final File a;
    public FileLock b;
    public RandomAccessFile c;
    public FileChannel d;
    public int e;

    public C0619pb(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.a, "rw");
            this.c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.d = channel;
            if (this.e == 0) {
                this.b = channel.lock();
            }
            this.e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.a.getAbsolutePath();
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                AbstractC0475kc.a(this.b);
            }
            Or.a((Closeable) this.c);
            Or.a((Closeable) this.d);
            this.c = null;
            this.b = null;
            this.d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0619pb(Context context, String str) {
        this(a(context, str));
    }

    public C0619pb(File file) {
        this.e = 0;
        this.a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        ny61.r("Cannot create lock file");
        return null;
    }
}
