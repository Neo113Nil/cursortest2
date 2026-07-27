package com.anythink.basead.exoplayer.j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f8273a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super e> f8274b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8275c;

    /* renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f8276d;

    /* renamed from: e, reason: collision with root package name */
    private FileInputStream f8277e;

    /* renamed from: f, reason: collision with root package name */
    private long f8278f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8279g;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    private e(Context context) {
        this(context, null);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.f8294c;
            this.f8275c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f8273a.openAssetFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv);
            this.f8276d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f8275c);
            }
            this.f8277e = new FileInputStream(this.f8276d.getFileDescriptor());
            long startOffset = this.f8276d.getStartOffset();
            long skip = this.f8277e.skip(kVar.f8297f + startOffset) - startOffset;
            if (skip != kVar.f8297f) {
                throw new EOFException();
            }
            long j9 = kVar.f8298g;
            long j10 = -1;
            if (j9 != -1) {
                this.f8278f = j9;
            } else {
                long length = this.f8276d.getLength();
                if (length == -1) {
                    FileChannel channel = this.f8277e.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        j10 = size - channel.position();
                    }
                    this.f8278f = j10;
                } else {
                    this.f8278f = length - skip;
                }
            }
            this.f8279g = true;
            aa<? super e> aaVar = this.f8274b;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f8278f;
        } catch (IOException e6) {
            throw new a(e6);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8275c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f8277e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f8277e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8276d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e6) {
                        throw new a(e6);
                    }
                } finally {
                    this.f8276d = null;
                    if (this.f8279g) {
                        this.f8279g = false;
                        aa<? super e> aaVar = this.f8274b;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e9) {
                throw new a(e9);
            }
        } catch (Throwable th) {
            this.f8277e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8276d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8276d = null;
                    if (this.f8279g) {
                        this.f8279g = false;
                        aa<? super e> aaVar2 = this.f8274b;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e10) {
                    throw new a(e10);
                }
            } finally {
                this.f8276d = null;
                if (this.f8279g) {
                    this.f8279g = false;
                    aa<? super e> aaVar3 = this.f8274b;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }

    public e(Context context, aa<? super e> aaVar) {
        this.f8273a = context.getContentResolver();
        this.f8274b = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j9 = this.f8278f;
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
        int read = this.f8277e.read(bArr, i, i4);
        if (read == -1) {
            if (this.f8278f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j10 = this.f8278f;
        if (j10 != -1) {
            this.f8278f = j10 - read;
        }
        aa<? super e> aaVar = this.f8274b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8275c;
    }
}
