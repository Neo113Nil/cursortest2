package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4163x5 extends YM {

    /* renamed from: B, reason: collision with root package name */
    public int f35731B;

    /* renamed from: C, reason: collision with root package name */
    public Date f35732C;

    /* renamed from: D, reason: collision with root package name */
    public Date f35733D;

    /* renamed from: E, reason: collision with root package name */
    public long f35734E;

    /* renamed from: F, reason: collision with root package name */
    public long f35735F;

    /* renamed from: G, reason: collision with root package name */
    public double f35736G;

    /* renamed from: H, reason: collision with root package name */
    public float f35737H;

    /* renamed from: I, reason: collision with root package name */
    public C3105dN f35738I;
    public long J;

    @Override // com.google.android.gms.internal.ads.YM
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.f35731B = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f29448u) {
            d();
        }
        if (this.f35731B == 1) {
            this.f35732C = UC.c(AbstractC2792Sd.v(byteBuffer));
            this.f35733D = UC.c(AbstractC2792Sd.v(byteBuffer));
            this.f35734E = AbstractC2792Sd.e(byteBuffer);
            this.f35735F = AbstractC2792Sd.v(byteBuffer);
        } else {
            this.f35732C = UC.c(AbstractC2792Sd.e(byteBuffer));
            this.f35733D = UC.c(AbstractC2792Sd.e(byteBuffer));
            this.f35734E = AbstractC2792Sd.e(byteBuffer);
            this.f35735F = AbstractC2792Sd.e(byteBuffer);
        }
        this.f35736G = AbstractC2792Sd.x(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f35737H = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        AbstractC2792Sd.e(byteBuffer);
        AbstractC2792Sd.e(byteBuffer);
        this.f35738I = new C3105dN(AbstractC2792Sd.x(byteBuffer), AbstractC2792Sd.x(byteBuffer), AbstractC2792Sd.x(byteBuffer), AbstractC2792Sd.x(byteBuffer), AbstractC2792Sd.B(byteBuffer), AbstractC2792Sd.B(byteBuffer), AbstractC2792Sd.B(byteBuffer), AbstractC2792Sd.x(byteBuffer), AbstractC2792Sd.x(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.J = AbstractC2792Sd.e(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f35732C + ";modificationTime=" + this.f35733D + ";timescale=" + this.f35734E + ";duration=" + this.f35735F + ";rate=" + this.f35736G + ";volume=" + this.f35737H + ";matrix=" + this.f35738I + ";nextTrackId=" + this.J + "]";
    }
}
