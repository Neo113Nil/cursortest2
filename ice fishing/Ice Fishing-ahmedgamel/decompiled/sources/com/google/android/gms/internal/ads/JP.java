package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class JP extends C4019uN {
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f26436j;

    /* renamed from: k, reason: collision with root package name */
    public int f26437k;

    @Override // com.google.android.gms.internal.ads.C4019uN
    public final void i() {
        super.i();
        this.f26436j = 0;
    }

    public final int n() {
        return this.f26436j;
    }

    public final boolean o() {
        return this.f26436j > 0;
    }

    public final boolean p(C4019uN c4019uN) {
        ByteBuffer byteBuffer;
        AbstractC2792Sd.i(!c4019uN.h(1073741824));
        AbstractC2792Sd.i(!c4019uN.h(268435456));
        AbstractC2792Sd.i(!c4019uN.h(4));
        if (o()) {
            if (this.f26436j >= this.f26437k) {
                return false;
            }
            ByteBuffer byteBuffer2 = c4019uN.f35302e;
            if (byteBuffer2 != null && (byteBuffer = this.f35302e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f26436j;
        this.f26436j = i + 1;
        if (i == 0) {
            this.f35303f = c4019uN.f35303f;
            if (c4019uN.h(1)) {
                this.f31925b = 1;
            }
        }
        ByteBuffer byteBuffer3 = c4019uN.f35302e;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f35302e.put(byteBuffer3);
        }
        this.i = c4019uN.f35303f;
        return true;
    }
}
