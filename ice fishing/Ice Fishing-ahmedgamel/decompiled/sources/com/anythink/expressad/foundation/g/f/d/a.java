package com.anythink.expressad.foundation.g.f.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.l;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class a extends j<Void> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20060c = "a";

    /* renamed from: d, reason: collision with root package name */
    private File f20061d;

    /* renamed from: e, reason: collision with root package name */
    private File f20062e;

    public a(File file, String str) {
        super(str);
        this.f20061d = file;
        this.f20062e = new File(file + ".tmp");
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final l<Void> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        return !f() ? (!this.f20062e.canRead() || this.f20062e.length() <= 0) ? l.a(new com.anythink.expressad.foundation.g.f.a.a(4, cVar)) : this.f20062e.renameTo(this.f20061d) ? l.a(null, cVar) : l.a(new com.anythink.expressad.foundation.g.f.a.a(4, cVar)) : l.a(new com.anythink.expressad.foundation.g.f.a.a(-2, cVar));
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final int j() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        r12.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.anythink.expressad.foundation.g.f.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar, com.anythink.expressad.foundation.g.f.c cVar) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        InputStream gZIPInputStream;
        String a9 = com.anythink.expressad.foundation.g.f.g.d.a(bVar.b(), "Content-Length");
        long j6 = 0;
        long longValue = !TextUtils.isEmpty(a9) ? Long.valueOf(a9).longValue() : 0L;
        InputStream inputStream = null;
        if (longValue > 0 && this.f20061d.length() == longValue) {
            this.f20061d.renameTo(this.f20062e);
            cVar.a(this, longValue, longValue);
            return null;
        }
        randomAccessFile = new RandomAccessFile(this.f20062e.getAbsolutePath(), "rw");
        randomAccessFile.setLength(0L);
        try {
            InputStream c9 = bVar.c();
            try {
                gZIPInputStream = (!com.anythink.expressad.foundation.g.f.g.d.b(bVar.b()) || (c9 instanceof GZIPInputStream)) ? c9 : new GZIPInputStream(c9);
            } catch (Throwable th2) {
                th = th2;
                inputStream = c9;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                }
                randomAccessFile.close();
                throw th;
            }
            try {
                byte[] bArr = new byte[6144];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read != -1) {
                        randomAccessFile.write(bArr, 0, read);
                        long j9 = read + j6;
                        cVar.a(this, longValue, j9);
                        if (f()) {
                            break;
                        }
                        j6 = j9;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = gZIPInputStream;
                th = th;
                if (inputStream != null) {
                }
                randomAccessFile.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        randomAccessFile.close();
        return null;
    }
}
