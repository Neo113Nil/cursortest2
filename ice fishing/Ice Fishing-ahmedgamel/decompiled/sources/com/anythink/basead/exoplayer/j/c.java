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
    private final AssetManager f8110a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super c> f8111b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8112c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f8113d;

    /* renamed from: e, reason: collision with root package name */
    private long f8114e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8115f;

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
            Uri uri = kVar.f8137c;
            this.f8112c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f8110a.open(path, 1);
            this.f8113d = open;
            if (open.skip(kVar.f8140f) < kVar.f8140f) {
                throw new EOFException();
            }
            long j6 = kVar.f8141g;
            if (j6 != -1) {
                this.f8114e = j6;
            } else {
                long available = this.f8113d.available();
                this.f8114e = available;
                if (available == 2147483647L) {
                    this.f8114e = -1L;
                }
            }
            this.f8115f = true;
            aa<? super c> aaVar = this.f8111b;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f8114e;
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8112c = null;
        try {
            try {
                InputStream inputStream = this.f8113d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e9) {
                throw new a(e9);
            }
        } finally {
            this.f8113d = null;
            if (this.f8115f) {
                this.f8115f = false;
                aa<? super c> aaVar = this.f8111b;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        }
    }

    public c(Context context, aa<? super c> aaVar) {
        this.f8110a = context.getAssets();
        this.f8111b = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j6 = this.f8114e;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i6 = (int) Math.min(j6, i6);
            } catch (IOException e9) {
                throw new a(e9);
            }
        }
        int read = this.f8113d.read(bArr, i, i6);
        if (read == -1) {
            if (this.f8114e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j9 = this.f8114e;
        if (j9 != -1) {
            this.f8114e = j9 - read;
        }
        aa<? super c> aaVar = this.f8111b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8112c;
    }
}
