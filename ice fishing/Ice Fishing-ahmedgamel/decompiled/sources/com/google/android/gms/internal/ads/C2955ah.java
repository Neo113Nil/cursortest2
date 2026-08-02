package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2955ah {

    /* renamed from: a, reason: collision with root package name */
    public final C3523lC f29845a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29846b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f29847c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f29848d;

    public C2955ah(C3523lC c3523lC) {
        this.f29845a = c3523lC;
        C3653nh c3653nh = C3653nh.f33535e;
        this.f29848d = false;
    }

    public final C3653nh a(C3653nh c3653nh) {
        if (c3653nh.equals(C3653nh.f33535e)) {
            throw new C2863Wh("Unhandled input format:", c3653nh);
        }
        int i = 0;
        while (true) {
            C3523lC c3523lC = this.f29845a;
            if (i >= c3523lC.f32527w) {
                return c3653nh;
            }
            InterfaceC3170ei interfaceC3170ei = (InterfaceC3170ei) c3523lC.get(i);
            C3653nh c9 = interfaceC3170ei.c(c3653nh);
            if (interfaceC3170ei.i()) {
                AbstractC2792Sd.H(!c9.equals(r0));
                c3653nh = c9;
            }
            i++;
        }
    }

    public final boolean b() {
        return !this.f29846b.isEmpty();
    }

    public final boolean c() {
        return this.f29848d && ((InterfaceC3170ei) this.f29846b.get(e())).h() && !this.f29847c[e()].hasRemaining();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z6;
        do {
            int i = 0;
            z6 = false;
            while (i <= e()) {
                if (!this.f29847c[i].hasRemaining()) {
                    ArrayList arrayList = this.f29846b;
                    InterfaceC3170ei interfaceC3170ei = (InterfaceC3170ei) arrayList.get(i);
                    if (!interfaceC3170ei.h()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f29847c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC3170ei.f30756a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC3170ei.a(byteBuffer2);
                        this.f29847c[i] = interfaceC3170ei.e();
                        boolean z9 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.f29847c[i].hasRemaining()) {
                            z9 = false;
                        }
                        z6 |= z9;
                    } else if (!this.f29847c[i].hasRemaining() && i < e()) {
                        ((InterfaceC3170ei) arrayList.get(i + 1)).d();
                    }
                }
                i++;
            }
        } while (z6);
    }

    public final int e() {
        return this.f29847c.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2955ah) {
            C3523lC c3523lC = this.f29845a;
            int i = c3523lC.f32527w;
            C3523lC c3523lC2 = ((C2955ah) obj).f29845a;
            if (i == c3523lC2.f32527w) {
                for (int i4 = 0; i4 < c3523lC.f32527w; i4++) {
                    if (c3523lC.get(i4) == c3523lC2.get(i4)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29845a.hashCode();
    }
}
