package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2932ah {

    /* renamed from: a, reason: collision with root package name */
    public final C3500lC f29070a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29071b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f29072c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f29073d;

    public C2932ah(C3500lC c3500lC) {
        this.f29070a = c3500lC;
        C3630nh c3630nh = C3630nh.f32748e;
        this.f29073d = false;
    }

    public final C3630nh a(C3630nh c3630nh) {
        if (c3630nh.equals(C3630nh.f32748e)) {
            throw new C2840Wh("Unhandled input format:", c3630nh);
        }
        int i = 0;
        while (true) {
            C3500lC c3500lC = this.f29070a;
            if (i >= c3500lC.f31747w) {
                return c3630nh;
            }
            InterfaceC3147ei interfaceC3147ei = (InterfaceC3147ei) c3500lC.get(i);
            C3630nh c9 = interfaceC3147ei.c(c3630nh);
            if (interfaceC3147ei.i()) {
                AbstractC2772Sd.H(!c9.equals(r0));
                c3630nh = c9;
            }
            i++;
        }
    }

    public final boolean b() {
        return !this.f29071b.isEmpty();
    }

    public final boolean c() {
        return this.f29073d && ((InterfaceC3147ei) this.f29071b.get(e())).h() && !this.f29072c[e()].hasRemaining();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z3;
        do {
            int i = 0;
            z3 = false;
            while (i <= e()) {
                if (!this.f29072c[i].hasRemaining()) {
                    ArrayList arrayList = this.f29071b;
                    InterfaceC3147ei interfaceC3147ei = (InterfaceC3147ei) arrayList.get(i);
                    if (!interfaceC3147ei.h()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f29072c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC3147ei.f29965a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC3147ei.a(byteBuffer2);
                        this.f29072c[i] = interfaceC3147ei.e();
                        boolean z6 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.f29072c[i].hasRemaining()) {
                            z6 = false;
                        }
                        z3 |= z6;
                    } else if (!this.f29072c[i].hasRemaining() && i < e()) {
                        ((InterfaceC3147ei) arrayList.get(i + 1)).d();
                    }
                }
                i++;
            }
        } while (z3);
    }

    public final int e() {
        return this.f29072c.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2932ah) {
            C3500lC c3500lC = this.f29070a;
            int i = c3500lC.f31747w;
            C3500lC c3500lC2 = ((C2932ah) obj).f29070a;
            if (i == c3500lC2.f31747w) {
                for (int i6 = 0; i6 < c3500lC.f31747w; i6++) {
                    if (c3500lC.get(i6) == c3500lC2.get(i6)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29070a.hashCode();
    }
}
