package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    private final aa<? super r> f8374a;

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f8375b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8376c;

    /* renamed from: d, reason: collision with root package name */
    private long f8377d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8378e;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public r() {
        this(null);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        try {
            this.f8376c = kVar.f8294c;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f8294c.getPath(), com.anythink.expressad.foundation.d.d.bv);
            this.f8375b = randomAccessFile;
            randomAccessFile.seek(kVar.f8297f);
            long j9 = kVar.f8298g;
            if (j9 == -1) {
                j9 = this.f8375b.length() - kVar.f8297f;
            }
            this.f8377d = j9;
            if (j9 < 0) {
                throw new EOFException();
            }
            this.f8378e = true;
            aa<? super r> aaVar = this.f8374a;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f8377d;
        } catch (IOException e6) {
            throw new a(e6);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8376c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f8375b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e6) {
                throw new a(e6);
            }
        } finally {
            this.f8375b = null;
            if (this.f8378e) {
                this.f8378e = false;
                aa<? super r> aaVar = this.f8374a;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        }
    }

    public r(aa<? super r> aaVar) {
        this.f8374a = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j9 = this.f8377d;
        if (j9 == 0) {
            return -1;
        }
        try {
            int read = this.f8375b.read(bArr, i, (int) Math.min(j9, i4));
            if (read > 0) {
                this.f8377d -= read;
                aa<? super r> aaVar = this.f8374a;
                if (aaVar != null) {
                    aaVar.a(read);
                }
            }
            return read;
        } catch (IOException e6) {
            throw new a(e6);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8376c;
    }
}
