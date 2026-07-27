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
    private final AssetManager f8267a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super c> f8268b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8269c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f8270d;

    /* renamed from: e, reason: collision with root package name */
    private long f8271e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8272f;

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
            Uri uri = kVar.f8294c;
            this.f8269c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f8267a.open(path, 1);
            this.f8270d = open;
            if (open.skip(kVar.f8297f) < kVar.f8297f) {
                throw new EOFException();
            }
            long j9 = kVar.f8298g;
            if (j9 != -1) {
                this.f8271e = j9;
            } else {
                long available = this.f8270d.available();
                this.f8271e = available;
                if (available == 2147483647L) {
                    this.f8271e = -1L;
                }
            }
            this.f8272f = true;
            aa<? super c> aaVar = this.f8268b;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f8271e;
        } catch (IOException e6) {
            throw new a(e6);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8269c = null;
        try {
            try {
                InputStream inputStream = this.f8270d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e6) {
                throw new a(e6);
            }
        } finally {
            this.f8270d = null;
            if (this.f8272f) {
                this.f8272f = false;
                aa<? super c> aaVar = this.f8268b;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        }
    }

    public c(Context context, aa<? super c> aaVar) {
        this.f8267a = context.getAssets();
        this.f8268b = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j9 = this.f8271e;
        if (j9 == 0) {
            return -1;
        }
        if (j9 != -1) {
            try {
                i4 = (int) Math.min(j9, i4);
            } catch (IOException e6) {
                throw new a(e6);
            }
        }
        int read = this.f8270d.read(bArr, i, i4);
        if (read == -1) {
            if (this.f8271e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j10 = this.f8271e;
        if (j10 != -1) {
            this.f8271e = j10 - read;
        }
        aa<? super c> aaVar = this.f8268b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8269c;
    }
}
