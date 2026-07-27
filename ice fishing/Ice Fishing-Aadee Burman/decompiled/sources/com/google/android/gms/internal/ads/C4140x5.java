package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4140x5 extends YM {

    /* renamed from: B, reason: collision with root package name */
    public int f34950B;

    /* renamed from: C, reason: collision with root package name */
    public Date f34951C;

    /* renamed from: D, reason: collision with root package name */
    public Date f34952D;

    /* renamed from: E, reason: collision with root package name */
    public long f34953E;

    /* renamed from: F, reason: collision with root package name */
    public long f34954F;

    /* renamed from: G, reason: collision with root package name */
    public double f34955G;

    /* renamed from: H, reason: collision with root package name */
    public float f34956H;

    /* renamed from: I, reason: collision with root package name */
    public C3082dN f34957I;
    public long J;

    @Override // com.google.android.gms.internal.ads.YM
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.f34950B = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f28671u) {
            d();
        }
        if (this.f34950B == 1) {
            this.f34951C = UC.c(AbstractC2772Sd.v(byteBuffer));
            this.f34952D = UC.c(AbstractC2772Sd.v(byteBuffer));
            this.f34953E = AbstractC2772Sd.e(byteBuffer);
            this.f34954F = AbstractC2772Sd.v(byteBuffer);
        } else {
            this.f34951C = UC.c(AbstractC2772Sd.e(byteBuffer));
            this.f34952D = UC.c(AbstractC2772Sd.e(byteBuffer));
            this.f34953E = AbstractC2772Sd.e(byteBuffer);
            this.f34954F = AbstractC2772Sd.e(byteBuffer);
        }
        this.f34955G = AbstractC2772Sd.x(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f34956H = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        AbstractC2772Sd.e(byteBuffer);
        AbstractC2772Sd.e(byteBuffer);
        this.f34957I = new C3082dN(AbstractC2772Sd.x(byteBuffer), AbstractC2772Sd.x(byteBuffer), AbstractC2772Sd.x(byteBuffer), AbstractC2772Sd.x(byteBuffer), AbstractC2772Sd.B(byteBuffer), AbstractC2772Sd.B(byteBuffer), AbstractC2772Sd.B(byteBuffer), AbstractC2772Sd.x(byteBuffer), AbstractC2772Sd.x(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.J = AbstractC2772Sd.e(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f34951C + ";modificationTime=" + this.f34952D + ";timescale=" + this.f34953E + ";duration=" + this.f34954F + ";rate=" + this.f34955G + ";volume=" + this.f34956H + ";matrix=" + this.f34957I + ";nextTrackId=" + this.J + "]";
    }
}
