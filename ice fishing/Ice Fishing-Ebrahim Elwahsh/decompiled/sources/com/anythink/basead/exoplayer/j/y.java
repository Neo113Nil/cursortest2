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
    public static final String f8426a = "rawresource";

    /* renamed from: b, reason: collision with root package name */
    private final Resources f8427b;

    /* renamed from: c, reason: collision with root package name */
    private final aa<? super y> f8428c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f8429d;

    /* renamed from: e, reason: collision with root package name */
    private AssetFileDescriptor f8430e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f8431f;

    /* renamed from: g, reason: collision with root package name */
    private long f8432g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8433h;

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
        this.f8429d = null;
        try {
            try {
                InputStream inputStream = this.f8431f;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f8431f = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8430e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e6) {
                        throw new a(e6);
                    }
                } finally {
                    this.f8430e = null;
                    if (this.f8433h) {
                        this.f8433h = false;
                        aa<? super y> aaVar = this.f8428c;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e9) {
                throw new a(e9);
            }
        } catch (Throwable th) {
            this.f8431f = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8430e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8430e = null;
                    if (this.f8433h) {
                        this.f8433h = false;
                        aa<? super y> aaVar2 = this.f8428c;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e10) {
                    throw new a(e10);
                }
            } finally {
                this.f8430e = null;
                if (this.f8433h) {
                    this.f8433h = false;
                    aa<? super y> aaVar3 = this.f8428c;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }

    public y(Context context, aa<? super y> aaVar) {
        this.f8427b = context.getResources();
        this.f8428c = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.f8294c;
            this.f8429d = uri;
            if (!TextUtils.equals(f8426a, uri.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                this.f8430e = this.f8427b.openRawResourceFd(Integer.parseInt(this.f8429d.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.f8430e.getFileDescriptor());
                this.f8431f = fileInputStream;
                fileInputStream.skip(this.f8430e.getStartOffset());
                if (this.f8431f.skip(kVar.f8297f) < kVar.f8297f) {
                    throw new EOFException();
                }
                long j9 = kVar.f8298g;
                long j10 = -1;
                if (j9 != -1) {
                    this.f8432g = j9;
                } else {
                    long length = this.f8430e.getLength();
                    if (length != -1) {
                        j10 = length - kVar.f8297f;
                    }
                    this.f8432g = j10;
                }
                this.f8433h = true;
                aa<? super y> aaVar = this.f8428c;
                if (aaVar != null) {
                    aaVar.b();
                }
                return this.f8432g;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e6) {
            throw new a(e6);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j9 = this.f8432g;
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
        int read = this.f8431f.read(bArr, i, i4);
        if (read == -1) {
            if (this.f8432g == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j10 = this.f8432g;
        if (j10 != -1) {
            this.f8432g = j10 - read;
        }
        aa<? super y> aaVar = this.f8428c;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8429d;
    }
}
