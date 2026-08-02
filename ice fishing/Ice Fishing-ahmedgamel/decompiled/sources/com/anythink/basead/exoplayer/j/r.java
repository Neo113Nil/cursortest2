package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    private final aa<? super r> f9003a;

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f9004b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f9005c;

    /* renamed from: d, reason: collision with root package name */
    private long f9006d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9007e;

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
            this.f9005c = kVar.f8923c;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f8923c.getPath(), com.anythink.expressad.foundation.d.d.bv);
            this.f9004b = randomAccessFile;
            randomAccessFile.seek(kVar.f8926f);
            long j6 = kVar.f8927g;
            if (j6 == -1) {
                j6 = this.f9004b.length() - kVar.f8926f;
            }
            this.f9006d = j6;
            if (j6 < 0) {
                throw new EOFException();
            }
            this.f9007e = true;
            aa<? super r> aaVar = this.f9003a;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f9006d;
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f9005c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9004b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e9) {
                throw new a(e9);
            }
        } finally {
            this.f9004b = null;
            if (this.f9007e) {
                this.f9007e = false;
                aa<? super r> aaVar = this.f9003a;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        }
    }

    public r(aa<? super r> aaVar) {
        this.f9003a = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j6 = this.f9006d;
        if (j6 == 0) {
            return -1;
        }
        try {
            int read = this.f9004b.read(bArr, i, (int) Math.min(j6, i4));
            if (read > 0) {
                this.f9006d -= read;
                aa<? super r> aaVar = this.f9003a;
                if (aaVar != null) {
                    aaVar.a(read);
                }
            }
            return read;
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f9005c;
    }
}
