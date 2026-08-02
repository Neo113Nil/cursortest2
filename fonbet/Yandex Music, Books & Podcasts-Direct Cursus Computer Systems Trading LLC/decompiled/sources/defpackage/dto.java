package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class dto implements abu, gt3 {
    public int i;
    public SurfaceTexture j;
    public byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final awm c = new awm();
    public final z0j d = new z0j(13);
    public final lis e = new lis(1);
    public final lis f = new lis(1);
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    public final SurfaceTexture a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            tt0.w();
            this.c.a();
            tt0.w();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            tt0.w();
            int i = iArr[0];
            tt0.v(36197, i);
            this.i = i;
        } catch (add e) {
            vq1.L("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new bto(1, this));
        return this.j;
    }

    @Override // defpackage.abu
    public final void b(long j, long j2, dsc dscVar, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayList;
        int h;
        this.e.a(j2, Long.valueOf(j));
        byte[] bArr = dscVar.z;
        int i2 = dscVar.A;
        byte[] bArr2 = this.m;
        int i3 = this.l;
        this.m = bArr;
        if (i2 == -1) {
            i2 = this.k;
        }
        this.l = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        zvm zvmVar = null;
        if (bArr3 != null) {
            int i4 = this.l;
            d7k d7kVar = new d7k(bArr3);
            try {
                d7kVar.I(4);
                h = d7kVar.h();
                d7kVar.H(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (h == 1886547818) {
                d7kVar.I(8);
                int i5 = d7kVar.b;
                int i6 = d7kVar.c;
                while (i5 < i6) {
                    int h2 = d7kVar.h() + i5;
                    if (h2 <= i5 || h2 > i6) {
                        break;
                    }
                    int h3 = d7kVar.h();
                    if (h3 != 2037673328 && h3 != 1836279920) {
                        d7kVar.H(h2);
                        i5 = h2;
                    }
                    d7kVar.G(h2);
                    arrayList = ocg.y(d7kVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = ocg.y(d7kVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    yvm yvmVar = (yvm) arrayList.get(0);
                    zvmVar = new zvm(yvmVar, yvmVar, i4);
                } else if (size == 2) {
                    zvmVar = new zvm((yvm) arrayList.get(0), (yvm) arrayList.get(1), i4);
                }
            }
        }
        if (zvmVar == null || !awm.c(zvmVar)) {
            int i7 = this.l;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 36; i8 < i11; i11 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i8 * f) - f3;
                int i12 = i8 + 1;
                float f5 = (i12 * f) - f3;
                int i13 = 0;
                while (i13 < 73) {
                    int i14 = i12;
                    float f6 = f5;
                    float f7 = radians;
                    int i15 = i9;
                    int i16 = i10;
                    int i17 = 0;
                    int i18 = 2;
                    while (i17 < i18) {
                        float f8 = i17 == 0 ? f4 : f6;
                        float f9 = radians2;
                        float f10 = i13 * f2;
                        float f11 = f4;
                        float f12 = f;
                        double d = 50.0f;
                        double d2 = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double d3 = f8;
                        fArr[i15] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        fArr[i15 + 1] = (float) (Math.sin(d3) * d);
                        int i19 = i15 + 3;
                        fArr[i15 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr2[i16] = f10 / f9;
                        int i20 = i16 + 2;
                        fArr2[i16 + 1] = ((i8 + i17) * f12) / f7;
                        if ((i13 != 0 || i17 != 0) && (i13 != 72 || i17 != 1)) {
                            i = 2;
                            i15 = i19;
                            i16 = i20;
                            i17++;
                            i18 = i;
                            radians2 = f9;
                            f4 = f11;
                            f = f12;
                        }
                        System.arraycopy(fArr, i15, fArr, i19, 3);
                        i15 += 6;
                        i = 2;
                        System.arraycopy(fArr2, i16, fArr2, i20, 2);
                        i16 += 4;
                        i17++;
                        i18 = i;
                        radians2 = f9;
                        f4 = f11;
                        f = f12;
                    }
                    i13++;
                    i9 = i15;
                    i10 = i16;
                    i12 = i14;
                    f5 = f6;
                    radians = f7;
                    radians2 = radians2;
                    f = f;
                }
                i8 = i12;
            }
            yvm yvmVar2 = new yvm(new ah3(0, 1, fArr, fArr2));
            zvmVar = new zvm(yvmVar2, yvmVar2, i7);
        }
        this.f.a(j2, zvmVar);
    }

    @Override // defpackage.gt3
    public final void c(long j, float[] fArr) {
        ((lis) this.d.e).a(j, fArr);
    }

    @Override // defpackage.gt3
    public final void d() {
        this.e.b();
        z0j z0jVar = this.d;
        ((lis) z0jVar.e).b();
        z0jVar.b = false;
        this.b.set(true);
    }
}
