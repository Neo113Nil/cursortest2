package com.anythink.basead.exoplayer.j;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8269a = "rawresource";

    /* renamed from: b, reason: collision with root package name */
    private final Resources f8270b;

    /* renamed from: c, reason: collision with root package name */
    private final aa<? super y> f8271c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f8272d;

    /* renamed from: e, reason: collision with root package name */
    private AssetFileDescriptor f8273e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f8274f;

    /* renamed from: g, reason: collision with root package name */
    private long f8275g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8276h;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(IOException iOException) {
            super(iOException);
        }
    }

    private y(Context context) {
        this(context, null);
    }

    private static Uri a(int i) {
        return Uri.parse("rawresource:///".concat(String.valueOf(i)));
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8272d = null;
        try {
            try {
                InputStream inputStream = this.f8274f;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f8274f = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8273e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new a(e9);
                    }
                } finally {
                    this.f8273e = null;
                    if (this.f8276h) {
                        this.f8276h = false;
                        aa<? super y> aaVar = this.f8271c;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } catch (Throwable th) {
            this.f8274f = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8273e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8273e = null;
                    if (this.f8276h) {
                        this.f8276h = false;
                        aa<? super y> aaVar2 = this.f8271c;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new a(e11);
                }
            } finally {
                this.f8273e = null;
                if (this.f8276h) {
                    this.f8276h = false;
                    aa<? super y> aaVar3 = this.f8271c;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }

    public y(Context context, aa<? super y> aaVar) {
        this.f8270b = context.getResources();
        this.f8271c = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.f8137c;
            this.f8272d = uri;
            if (!TextUtils.equals(f8269a, uri.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                this.f8273e = this.f8270b.openRawResourceFd(Integer.parseInt(this.f8272d.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.f8273e.getFileDescriptor());
                this.f8274f = fileInputStream;
                fileInputStream.skip(this.f8273e.getStartOffset());
                if (this.f8274f.skip(kVar.f8140f) < kVar.f8140f) {
                    throw new EOFException();
                }
                long j6 = kVar.f8141g;
                long j9 = -1;
                if (j6 != -1) {
                    this.f8275g = j6;
                } else {
                    long length = this.f8273e.getLength();
                    if (length != -1) {
                        j9 = length - kVar.f8140f;
                    }
                    this.f8275g = j9;
                }
                this.f8276h = true;
                aa<? super y> aaVar = this.f8271c;
                if (aaVar != null) {
                    aaVar.b();
                }
                return this.f8275g;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j6 = this.f8275g;
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
        int read = this.f8274f.read(bArr, i, i6);
        if (read == -1) {
            if (this.f8275g == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j9 = this.f8275g;
        if (j9 != -1) {
            this.f8275g = j9 - read;
        }
        aa<? super y> aaVar = this.f8271c;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8272d;
    }
}
