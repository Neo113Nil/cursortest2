package com.anythink.basead.exoplayer.j;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f8896a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super c> f8897b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8898c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f8899d;

    /* renamed from: e, reason: collision with root package name */
    private long f8900e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8901f;

    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    private c(Context context) {
        this(context, null);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.f8923c;
            this.f8898c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f8896a.open(path, 1);
            this.f8899d = open;
            if (open.skip(kVar.f8926f) < kVar.f8926f) {
                throw new EOFException();
            }
            long j6 = kVar.f8927g;
            if (j6 != -1) {
                this.f8900e = j6;
            } else {
                long available = this.f8899d.available();
                this.f8900e = available;
                if (available == 2147483647L) {
                    this.f8900e = -1L;
                }
            }
            this.f8901f = true;
            aa<? super c> aaVar = this.f8897b;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f8900e;
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8898c = null;
        try {
            try {
                InputStream inputStream = this.f8899d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e9) {
                throw new a(e9);
            }
        } finally {
            this.f8899d = null;
            if (this.f8901f) {
                this.f8901f = false;
                aa<? super c> aaVar = this.f8897b;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        }
    }

    public c(Context context, aa<? super c> aaVar) {
        this.f8896a = context.getAssets();
        this.f8897b = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j6 = this.f8900e;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i4 = (int) Math.min(j6, i4);
            } catch (IOException e9) {
                throw new a(e9);
            }
        }
        int read = this.f8899d.read(bArr, i, i4);
        if (read == -1) {
            if (this.f8900e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j9 = this.f8900e;
        if (j9 != -1) {
            this.f8900e = j9 - read;
        }
        aa<? super c> aaVar = this.f8897b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8898c;
    }
}
