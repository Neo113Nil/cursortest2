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
    private static final String f8356a = "AtomicFile";

    /* renamed from: b, reason: collision with root package name */
    private final File f8357b;

    /* renamed from: c, reason: collision with root package name */
    private final File f8358c;

    public static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f8363a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8364b = false;

        public a(File file) {
            this.f8363a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f8364b) {
                return;
            }
            this.f8364b = true;
            flush();
            try {
                this.f8363a.getFD().sync();
            } catch (IOException e9) {
                Log.w(b.f8356a, "Failed to sync file descriptor:", e9);
            }
            this.f8363a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f8363a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.f8363a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f8363a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i6) {
            this.f8363a.write(bArr, i, i6);
        }
    }

    public b(File file) {
        this.f8357b = file;
        this.f8358c = new File(file.getPath() + ".bak");
    }

    private void d() {
        if (this.f8358c.exists()) {
            this.f8357b.delete();
            this.f8358c.renameTo(this.f8357b);
        }
    }

    public final void a() {
        this.f8357b.delete();
        this.f8358c.delete();
    }

    public final OutputStream b() {
        if (this.f8357b.exists()) {
            if (this.f8358c.exists()) {
                this.f8357b.delete();
            } else if (!this.f8357b.renameTo(this.f8358c)) {
                Log.w(f8356a, "Couldn't rename file " + this.f8357b + " to backup file " + this.f8358c);
            }
        }
        try {
            return new a(this.f8357b);
        } catch (FileNotFoundException e9) {
            if (!this.f8357b.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f8357b, e9);
            }
            try {
                return new a(this.f8357b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Couldn't create " + this.f8357b, e10);
            }
        }
    }

    public final InputStream c() {
        if (this.f8358c.exists()) {
            this.f8357b.delete();
            this.f8358c.renameTo(this.f8357b);
        }
        return new FileInputStream(this.f8357b);
    }

    public final void a(OutputStream outputStream) {
        outputStream.close();
        this.f8358c.delete();
    }
}
