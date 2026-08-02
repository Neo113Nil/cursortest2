package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import o1.C4798b;

/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3839r5 extends ByteArrayOutputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34289n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Object f34290u;

    public C3839r5(C3516l5 c3516l5, int i) {
        this.f34290u = c3516l5;
        ((ByteArrayOutputStream) this).buf = c3516l5.h(Math.max(i, 256));
    }

    public void a(int i) {
        int i4 = ((ByteArrayOutputStream) this).count;
        if (i4 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i6 = (i4 + i) * 2;
        C4798b c4798b = (C4798b) this.f34290u;
        byte[] a9 = c4798b.a(i6);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a9, 0, ((ByteArrayOutputStream) this).count);
        c4798b.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a9;
    }

    public void b(int i) {
        int i4 = ((ByteArrayOutputStream) this).count;
        if (i4 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i6 = i4 + i;
        C3516l5 c3516l5 = (C3516l5) this.f34290u;
        byte[] h3 = c3516l5.h(i6 + i6);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, h3, 0, ((ByteArrayOutputStream) this).count);
        c3516l5.n(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = h3;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f34289n) {
            case 0:
                ((C3516l5) this.f34290u).n(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            case 1:
                ((C4798b) this.f34290u).b(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() {
        switch (this.f34289n) {
            case 0:
                ((C3516l5) this.f34290u).n(((ByteArrayOutputStream) this).buf);
                break;
            case 1:
                ((C4798b) this.f34290u).b(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.f34289n) {
            case 2:
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                    i--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i, ((s1.d) this.f34290u).f40304u.name());
                } catch (UnsupportedEncodingException e9) {
                    throw new AssertionError(e9);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i4) {
        switch (this.f34289n) {
            case 0:
                synchronized (this) {
                    b(i4);
                    super.write(bArr, i, i4);
                }
                return;
            case 1:
                synchronized (this) {
                    a(i4);
                    super.write(bArr, i, i4);
                }
                return;
            default:
                super.write(bArr, i, i4);
                return;
        }
    }

    public C3839r5(C4798b c4798b, int i) {
        this.f34290u = c4798b;
        ((ByteArrayOutputStream) this).buf = c4798b.a(Math.max(i, 256));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3839r5(s1.d dVar, int i) {
        super(i);
        this.f34290u = dVar;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        switch (this.f34289n) {
            case 0:
                synchronized (this) {
                    b(1);
                    super.write(i);
                }
                return;
            case 1:
                synchronized (this) {
                    a(1);
                    super.write(i);
                }
                return;
            default:
                super.write(i);
                return;
        }
    }
}
