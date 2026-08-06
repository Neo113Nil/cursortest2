package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final File f5424a;

    /* renamed from: b, reason: collision with root package name */
    public FileLock f5425b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f5426c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f5427d;

    /* renamed from: e, reason: collision with root package name */
    public int f5428e;

    public Y9(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f5424a, "rw");
            this.f5426c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f5427d = channel;
            if (this.f5428e == 0) {
                this.f5425b = channel.lock();
            }
            this.f5428e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f5424a.getAbsolutePath();
            int i2 = this.f5428e - 1;
            this.f5428e = i2;
            if (i2 == 0) {
                Ja.a(this.f5425b);
            }
            AbstractC0572lo.a((Closeable) this.f5426c);
            AbstractC0572lo.a((Closeable) this.f5427d);
            this.f5426c = null;
            this.f5425b = null;
            this.f5427d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Y9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public Y9(File file) {
        this.f5428e = 0;
        this.f5424a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
