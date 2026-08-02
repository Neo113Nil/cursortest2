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
    private final ContentResolver f8902a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super e> f8903b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8904c;

    /* renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f8905d;

    /* renamed from: e, reason: collision with root package name */
    private FileInputStream f8906e;

    /* renamed from: f, reason: collision with root package name */
    private long f8907f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8908g;

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
            Uri uri = kVar.f8923c;
            this.f8904c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f8902a.openAssetFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv);
            this.f8905d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f8904c);
            }
            this.f8906e = new FileInputStream(this.f8905d.getFileDescriptor());
            long startOffset = this.f8905d.getStartOffset();
            long skip = this.f8906e.skip(kVar.f8926f + startOffset) - startOffset;
            if (skip != kVar.f8926f) {
                throw new EOFException();
            }
            long j6 = kVar.f8927g;
            long j9 = -1;
            if (j6 != -1) {
                this.f8907f = j6;
            } else {
                long length = this.f8905d.getLength();
                if (length == -1) {
                    FileChannel channel = this.f8906e.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        j9 = size - channel.position();
                    }
                    this.f8907f = j9;
                } else {
                    this.f8907f = length - skip;
                }
            }
            this.f8908g = true;
            aa<? super e> aaVar = this.f8903b;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f8907f;
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8904c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f8906e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f8906e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8905d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new a(e9);
                    }
                } finally {
                    this.f8905d = null;
                    if (this.f8908g) {
                        this.f8908g = false;
                        aa<? super e> aaVar = this.f8903b;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } catch (Throwable th) {
            this.f8906e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8905d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8905d = null;
                    if (this.f8908g) {
                        this.f8908g = false;
                        aa<? super e> aaVar2 = this.f8903b;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new a(e11);
                }
            } finally {
                this.f8905d = null;
                if (this.f8908g) {
                    this.f8908g = false;
                    aa<? super e> aaVar3 = this.f8903b;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }

    public e(Context context, aa<? super e> aaVar) {
        this.f8902a = context.getContentResolver();
        this.f8903b = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j6 = this.f8907f;
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
        int read = this.f8906e.read(bArr, i, i4);
        if (read == -1) {
            if (this.f8907f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j9 = this.f8907f;
        if (j9 != -1) {
            this.f8907f = j9 - read;
        }
        aa<? super e> aaVar = this.f8903b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8904c;
    }
}
