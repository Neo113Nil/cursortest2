package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    private final aa<? super r> f8217a;

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f8218b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8219c;

    /* renamed from: d, reason: collision with root package name */
    private long f8220d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8221e;

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
            this.f8219c = kVar.f8137c;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f8137c.getPath(), com.anythink.expressad.foundation.d.d.bv);
            this.f8218b = randomAccessFile;
            randomAccessFile.seek(kVar.f8140f);
            long j6 = kVar.f8141g;
            if (j6 == -1) {
                j6 = this.f8218b.length() - kVar.f8140f;
            }
            this.f8220d = j6;
            if (j6 < 0) {
                throw new EOFException();
            }
            this.f8221e = true;
            aa<? super r> aaVar = this.f8217a;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f8220d;
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8219c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f8218b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e9) {
                throw new a(e9);
            }
        } finally {
            this.f8218b = null;
            if (this.f8221e) {
                this.f8221e = false;
                aa<? super r> aaVar = this.f8217a;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        }
    }

    public r(aa<? super r> aaVar) {
        this.f8217a = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j6 = this.f8220d;
        if (j6 == 0) {
            return -1;
        }
        try {
            int read = this.f8218b.read(bArr, i, (int) Math.min(j6, i6));
            if (read > 0) {
                this.f8220d -= read;
                aa<? super r> aaVar = this.f8217a;
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
        return this.f8219c;
    }
}
