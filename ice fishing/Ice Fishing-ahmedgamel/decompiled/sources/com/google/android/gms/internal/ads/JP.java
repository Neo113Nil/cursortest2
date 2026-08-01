package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class JP extends C3996uN {
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f25683j;

    /* renamed from: k, reason: collision with root package name */
    public int f25684k;

    @Override // com.google.android.gms.internal.ads.C3996uN
    public final void i() {
        super.i();
        this.f25683j = 0;
    }

    public final int n() {
        return this.f25683j;
    }

    public final boolean o() {
        return this.f25683j > 0;
    }

    public final boolean p(C3996uN c3996uN) {
        ByteBuffer byteBuffer;
        AbstractC2772Sd.i(!c3996uN.h(1073741824));
        AbstractC2772Sd.i(!c3996uN.h(268435456));
        AbstractC2772Sd.i(!c3996uN.h(4));
        if (o()) {
            if (this.f25683j >= this.f25684k) {
                return false;
            }
            ByteBuffer byteBuffer2 = c3996uN.f34528e;
            if (byteBuffer2 != null && (byteBuffer = this.f34528e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f25683j;
        this.f25683j = i + 1;
        if (i == 0) {
            this.f34529f = c3996uN.f34529f;
            if (c3996uN.h(1)) {
                this.f31138b = 1;
            }
        }
        ByteBuffer byteBuffer3 = c3996uN.f34528e;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f34528e.put(byteBuffer3);
        }
        this.i = c3996uN.f34529f;
        return true;
    }
}
