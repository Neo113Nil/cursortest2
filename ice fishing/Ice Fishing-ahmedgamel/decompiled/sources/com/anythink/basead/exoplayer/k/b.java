package com.anythink.basead.exoplayer.k;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9142a = "AtomicFile";

    /* renamed from: b, reason: collision with root package name */
    private final File f9143b;

    /* renamed from: c, reason: collision with root package name */
    private final File f9144c;

    public static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f9149a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9150b = false;

        public a(File file) {
            this.f9149a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f9150b) {
                return;
            }
            this.f9150b = true;
            flush();
            try {
                this.f9149a.getFD().sync();
            } catch (IOException e9) {
                Log.w(b.f9142a, "Failed to sync file descriptor:", e9);
            }
            this.f9149a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f9149a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.f9149a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f9149a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i4) {
            this.f9149a.write(bArr, i, i4);
        }
    }

    public b(File file) {
        this.f9143b = file;
        this.f9144c = new File(file.getPath() + ".bak");
    }

    private void d() {
        if (this.f9144c.exists()) {
            this.f9143b.delete();
            this.f9144c.renameTo(this.f9143b);
        }
    }

    public final void a() {
        this.f9143b.delete();
        this.f9144c.delete();
    }

    public final OutputStream b() {
        if (this.f9143b.exists()) {
            if (this.f9144c.exists()) {
                this.f9143b.delete();
            } else if (!this.f9143b.renameTo(this.f9144c)) {
                Log.w(f9142a, "Couldn't rename file " + this.f9143b + " to backup file " + this.f9144c);
            }
        }
        try {
            return new a(this.f9143b);
        } catch (FileNotFoundException e9) {
            if (!this.f9143b.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f9143b, e9);
            }
            try {
                return new a(this.f9143b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Couldn't create " + this.f9143b, e10);
            }
        }
    }

    public final InputStream c() {
        if (this.f9144c.exists()) {
            this.f9143b.delete();
            this.f9144c.renameTo(this.f9143b);
        }
        return new FileInputStream(this.f9143b);
    }

    public final void a(OutputStream outputStream) {
        outputStream.close();
        this.f9144c.delete();
    }
}
