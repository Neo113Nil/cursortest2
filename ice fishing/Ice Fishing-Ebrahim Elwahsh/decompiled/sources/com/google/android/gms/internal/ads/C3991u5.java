package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3991u5 extends AbstractC3578mN {

    /* renamed from: B, reason: collision with root package name */
    public int f34534B;

    /* renamed from: C, reason: collision with root package name */
    public Date f34535C;

    /* renamed from: D, reason: collision with root package name */
    public Date f34536D;

    /* renamed from: E, reason: collision with root package name */
    public long f34537E;

    /* renamed from: F, reason: collision with root package name */
    public long f34538F;

    /* renamed from: G, reason: collision with root package name */
    public double f34539G;

    /* renamed from: H, reason: collision with root package name */
    public float f34540H;

    /* renamed from: I, reason: collision with root package name */
    public C3847rN f34541I;
    public long J;

    @Override // com.google.android.gms.internal.ads.AbstractC3578mN
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.f34534B = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f32685u) {
            d();
        }
        if (this.f34534B == 1) {
            this.f34535C = AbstractC4161xD.b(PA.D(byteBuffer));
            this.f34536D = AbstractC4161xD.b(PA.D(byteBuffer));
            this.f34537E = PA.g(byteBuffer);
            this.f34538F = PA.D(byteBuffer);
        } else {
            this.f34535C = AbstractC4161xD.b(PA.g(byteBuffer));
            this.f34536D = AbstractC4161xD.b(PA.g(byteBuffer));
            this.f34537E = PA.g(byteBuffer);
            this.f34538F = PA.g(byteBuffer);
        }
        this.f34539G = PA.G(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f34540H = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        PA.g(byteBuffer);
        PA.g(byteBuffer);
        this.f34541I = new C3847rN(PA.G(byteBuffer), PA.G(byteBuffer), PA.G(byteBuffer), PA.G(byteBuffer), PA.K(byteBuffer), PA.K(byteBuffer), PA.K(byteBuffer), PA.G(byteBuffer), PA.G(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.J = PA.g(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f34535C + ";modificationTime=" + this.f34536D + ";timescale=" + this.f34537E + ";duration=" + this.f34538F + ";rate=" + this.f34539G + ";volume=" + this.f34540H + ";matrix=" + this.f34541I + ";nextTrackId=" + this.J + "]";
    }
}
