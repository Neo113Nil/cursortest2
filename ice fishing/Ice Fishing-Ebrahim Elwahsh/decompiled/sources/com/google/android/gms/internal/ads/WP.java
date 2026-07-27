package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class WP extends IN {
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f28392j;

    /* renamed from: k, reason: collision with root package name */
    public int f28393k;

    @Override // com.google.android.gms.internal.ads.IN
    public final void i() {
        super.i();
        this.f28392j = 0;
    }

    public final int n() {
        return this.f28392j;
    }

    public final boolean o() {
        return this.f28392j > 0;
    }

    public final boolean p(IN in) {
        ByteBuffer byteBuffer;
        PA.n(!in.h(1073741824));
        PA.n(!in.h(268435456));
        PA.n(!in.h(4));
        if (o()) {
            if (this.f28392j >= this.f28393k) {
                return false;
            }
            ByteBuffer byteBuffer2 = in.f25552e;
            if (byteBuffer2 != null && (byteBuffer = this.f25552e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f28392j;
        this.f28392j = i + 1;
        if (i == 0) {
            this.f25553f = in.f25553f;
            if (in.h(1)) {
                this.f32624b = 1;
            }
        }
        ByteBuffer byteBuffer3 = in.f25552e;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f25552e.put(byteBuffer3);
        }
        this.i = in.f25553f;
        return true;
    }
}
