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
    private final ContentResolver f8116a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super e> f8117b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f8118c;

    /* renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f8119d;

    /* renamed from: e, reason: collision with root package name */
    private FileInputStream f8120e;

    /* renamed from: f, reason: collision with root package name */
    private long f8121f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8122g;

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
            Uri uri = kVar.f8137c;
            this.f8118c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f8116a.openAssetFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv);
            this.f8119d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f8118c);
            }
            this.f8120e = new FileInputStream(this.f8119d.getFileDescriptor());
            long startOffset = this.f8119d.getStartOffset();
            long skip = this.f8120e.skip(kVar.f8140f + startOffset) - startOffset;
            if (skip != kVar.f8140f) {
                throw new EOFException();
            }
            long j6 = kVar.f8141g;
            long j9 = -1;
            if (j6 != -1) {
                this.f8121f = j6;
            } else {
                long length = this.f8119d.getLength();
                if (length == -1) {
                    FileChannel channel = this.f8120e.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        j9 = size - channel.position();
                    }
                    this.f8121f = j9;
                } else {
                    this.f8121f = length - skip;
                }
            }
            this.f8122g = true;
            aa<? super e> aaVar = this.f8117b;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f8121f;
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8118c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f8120e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f8120e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8119d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new a(e9);
                    }
                } finally {
                    this.f8119d = null;
                    if (this.f8122g) {
                        this.f8122g = false;
                        aa<? super e> aaVar = this.f8117b;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } catch (Throwable th) {
            this.f8120e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8119d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8119d = null;
                    if (this.f8122g) {
                        this.f8122g = false;
                        aa<? super e> aaVar2 = this.f8117b;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new a(e11);
                }
            } finally {
                this.f8119d = null;
                if (this.f8122g) {
                    this.f8122g = false;
                    aa<? super e> aaVar3 = this.f8117b;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }

    public e(Context context, aa<? super e> aaVar) {
        this.f8116a = context.getContentResolver();
        this.f8117b = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j6 = this.f8121f;
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
        int read = this.f8120e.read(bArr, i, i6);
        if (read == -1) {
            if (this.f8121f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j9 = this.f8121f;
        if (j9 != -1) {
            this.f8121f = j9 - read;
        }
        aa<? super e> aaVar = this.f8117b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8118c;
    }
}
