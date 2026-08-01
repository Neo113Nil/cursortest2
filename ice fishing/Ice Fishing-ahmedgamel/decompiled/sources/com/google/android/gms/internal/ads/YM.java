package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class YM implements InterfaceC4032v5 {

    /* renamed from: A, reason: collision with root package name */
    public static final C2921aN f28669A = C2921aN.l(YM.class);

    /* renamed from: n, reason: collision with root package name */
    public final String f28670n;

    /* renamed from: w, reason: collision with root package name */
    public ByteBuffer f28673w;

    /* renamed from: x, reason: collision with root package name */
    public long f28674x;

    /* renamed from: z, reason: collision with root package name */
    public C2656Lg f28676z;

    /* renamed from: y, reason: collision with root package name */
    public long f28675y = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28672v = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28671u = true;

    public YM(String str) {
        this.f28670n = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4032v5
    public final void a(C2656Lg c2656Lg, ByteBuffer byteBuffer, long j6, AbstractC3870s5 abstractC3870s5) {
        this.f28674x = c2656Lg.b();
        byteBuffer.remaining();
        this.f28675y = j6;
        this.f28676z = c2656Lg;
        c2656Lg.f26126n.position((int) (c2656Lg.b() + j6));
        this.f28672v = false;
        this.f28671u = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f28672v) {
                return;
            }
            try {
                C2921aN c2921aN = f28669A;
                String str = this.f28670n;
                c2921aN.f(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                C2656Lg c2656Lg = this.f28676z;
                long j6 = this.f28674x;
                long j9 = this.f28675y;
                ByteBuffer byteBuffer = c2656Lg.f26126n;
                int position = byteBuffer.position();
                byteBuffer.position((int) j6);
                ByteBuffer slice = byteBuffer.slice();
                slice.limit((int) j9);
                byteBuffer.position(position);
                this.f28673w = slice;
                this.f28672v = true;
            } catch (IOException e9) {
                throw new RuntimeException(e9);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            C2921aN c2921aN = f28669A;
            String str = this.f28670n;
            c2921aN.f(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f28673w;
            if (byteBuffer != null) {
                this.f28671u = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f28673w = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
