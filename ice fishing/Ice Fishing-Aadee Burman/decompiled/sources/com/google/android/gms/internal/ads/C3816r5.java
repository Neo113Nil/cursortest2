package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import m1.C4727b;

/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3816r5 extends ByteArrayOutputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33521n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Object f33522u;

    public C3816r5(C3493l5 c3493l5, int i) {
        this.f33522u = c3493l5;
        ((ByteArrayOutputStream) this).buf = c3493l5.h(Math.max(i, 256));
    }

    public void a(int i) {
        int i6 = ((ByteArrayOutputStream) this).count;
        if (i6 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i9 = (i6 + i) * 2;
        C4727b c4727b = (C4727b) this.f33522u;
        byte[] a9 = c4727b.a(i9);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a9, 0, ((ByteArrayOutputStream) this).count);
        c4727b.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a9;
    }

    public void b(int i) {
        int i6 = ((ByteArrayOutputStream) this).count;
        if (i6 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i9 = i6 + i;
        C3493l5 c3493l5 = (C3493l5) this.f33522u;
        byte[] h9 = c3493l5.h(i9 + i9);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, h9, 0, ((ByteArrayOutputStream) this).count);
        c3493l5.n(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = h9;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f33521n) {
            case 0:
                ((C3493l5) this.f33522u).n(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            case 1:
                ((C4727b) this.f33522u).b(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() {
        switch (this.f33521n) {
            case 0:
                ((C3493l5) this.f33522u).n(((ByteArrayOutputStream) this).buf);
                break;
            case 1:
                ((C4727b) this.f33522u).b(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.f33521n) {
            case 2:
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                    i--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i, ((q1.d) this.f33522u).f40002u.name());
                } catch (UnsupportedEncodingException e9) {
                    throw new AssertionError(e9);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i6) {
        switch (this.f33521n) {
            case 0:
                synchronized (this) {
                    b(i6);
                    super.write(bArr, i, i6);
                }
                return;
            case 1:
                synchronized (this) {
                    a(i6);
                    super.write(bArr, i, i6);
                }
                return;
            default:
                super.write(bArr, i, i6);
                return;
        }
    }

    public C3816r5(C4727b c4727b, int i) {
        this.f33522u = c4727b;
        ((ByteArrayOutputStream) this).buf = c4727b.a(Math.max(i, 256));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3816r5(q1.d dVar, int i) {
        super(i);
        this.f33522u = dVar;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        switch (this.f33521n) {
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
