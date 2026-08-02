package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class YM implements InterfaceC4055v5 {

    /* renamed from: A, reason: collision with root package name */
    public static final C2944aN f29446A = C2944aN.l(YM.class);

    /* renamed from: n, reason: collision with root package name */
    public final String f29447n;

    /* renamed from: w, reason: collision with root package name */
    public ByteBuffer f29450w;

    /* renamed from: x, reason: collision with root package name */
    public long f29451x;

    /* renamed from: z, reason: collision with root package name */
    public C2676Lg f29453z;

    /* renamed from: y, reason: collision with root package name */
    public long f29452y = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29449v = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f29448u = true;

    public YM(String str) {
        this.f29447n = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055v5
    public final void a(C2676Lg c2676Lg, ByteBuffer byteBuffer, long j6, AbstractC3893s5 abstractC3893s5) {
        this.f29451x = c2676Lg.b();
        byteBuffer.remaining();
        this.f29452y = j6;
        this.f29453z = c2676Lg;
        c2676Lg.f26923n.position((int) (c2676Lg.b() + j6));
        this.f29449v = false;
        this.f29448u = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f29449v) {
                return;
            }
            try {
                C2944aN c2944aN = f29446A;
                String str = this.f29447n;
                c2944aN.f(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                C2676Lg c2676Lg = this.f29453z;
                long j6 = this.f29451x;
                long j9 = this.f29452y;
                ByteBuffer byteBuffer = c2676Lg.f26923n;
                int position = byteBuffer.position();
                byteBuffer.position((int) j6);
                ByteBuffer slice = byteBuffer.slice();
                slice.limit((int) j9);
                byteBuffer.position(position);
                this.f29450w = slice;
                this.f29449v = true;
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
            C2944aN c2944aN = f29446A;
            String str = this.f29447n;
            c2944aN.f(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f29450w;
            if (byteBuffer != null) {
                this.f29448u = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f29450w = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
