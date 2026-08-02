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
    public static final String f9055a = "rawresource";

    /* renamed from: b, reason: collision with root package name */
    private final Resources f9056b;

    /* renamed from: c, reason: collision with root package name */
    private final aa<? super y> f9057c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f9058d;

    /* renamed from: e, reason: collision with root package name */
    private AssetFileDescriptor f9059e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f9060f;

    /* renamed from: g, reason: collision with root package name */
    private long f9061g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9062h;

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
        this.f9058d = null;
        try {
            try {
                InputStream inputStream = this.f9060f;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9060f = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f9059e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new a(e9);
                    }
                } finally {
                    this.f9059e = null;
                    if (this.f9062h) {
                        this.f9062h = false;
                        aa<? super y> aaVar = this.f9057c;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } catch (Throwable th) {
            this.f9060f = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f9059e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f9059e = null;
                    if (this.f9062h) {
                        this.f9062h = false;
                        aa<? super y> aaVar2 = this.f9057c;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new a(e11);
                }
            } finally {
                this.f9059e = null;
                if (this.f9062h) {
                    this.f9062h = false;
                    aa<? super y> aaVar3 = this.f9057c;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }

    public y(Context context, aa<? super y> aaVar) {
        this.f9056b = context.getResources();
        this.f9057c = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.f8923c;
            this.f9058d = uri;
            if (!TextUtils.equals(f9055a, uri.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                this.f9059e = this.f9056b.openRawResourceFd(Integer.parseInt(this.f9058d.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.f9059e.getFileDescriptor());
                this.f9060f = fileInputStream;
                fileInputStream.skip(this.f9059e.getStartOffset());
                if (this.f9060f.skip(kVar.f8926f) < kVar.f8926f) {
                    throw new EOFException();
                }
                long j6 = kVar.f8927g;
                long j9 = -1;
                if (j6 != -1) {
                    this.f9061g = j6;
                } else {
                    long length = this.f9059e.getLength();
                    if (length != -1) {
                        j9 = length - kVar.f8926f;
                    }
                    this.f9061g = j9;
                }
                this.f9062h = true;
                aa<? super y> aaVar = this.f9057c;
                if (aaVar != null) {
                    aaVar.b();
                }
                return this.f9061g;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j6 = this.f9061g;
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
        int read = this.f9060f.read(bArr, i, i4);
        if (read == -1) {
            if (this.f9061g == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j9 = this.f9061g;
        if (j9 != -1) {
            this.f9061g = j9 - read;
        }
        aa<? super y> aaVar = this.f9057c;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f9058d;
    }
}
