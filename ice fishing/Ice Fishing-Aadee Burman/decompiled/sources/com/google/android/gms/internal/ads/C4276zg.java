package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.zg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4276zg extends AbstractC3484kx {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f35371a;

    /* renamed from: c, reason: collision with root package name */
    public final Display f35373c;

    /* renamed from: f, reason: collision with root package name */
    public float[] f35376f;

    /* renamed from: g, reason: collision with root package name */
    public a3.e f35377g;

    /* renamed from: h, reason: collision with root package name */
    public C2469Ag f35378h;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f35374d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f35375e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f35372b = new Object();

    public C4276zg(Context context) {
        this.f35371a = (SensorManager) context.getSystemService("sensor");
        this.f35373c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3484kx
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f35372b) {
            try {
                if (this.f35376f == null) {
                    this.f35376f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.f35374d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f35373c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, com.anythink.expressad.video.module.a.a.f21730T, this.f35375e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, com.anythink.expressad.video.module.a.a.f21730T, com.anythink.expressad.video.module.a.a.f21731U, this.f35375e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f35375e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, com.anythink.expressad.video.module.a.a.f21731U, 1, this.f35375e);
        }
        float[] fArr3 = this.f35375e;
        float f3 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f3;
        float f9 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f9;
        float f10 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f10;
        synchronized (this.f35372b) {
            System.arraycopy(fArr3, 0, this.f35376f, 0, 9);
        }
        C2469Ag c2469Ag = this.f35378h;
        if (c2469Ag != null) {
            Object obj = c2469Ag.f23701N;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        if (this.f35377g == null) {
            return;
        }
        this.f35371a.unregisterListener(this);
        this.f35377g.post(new Y6(3));
        this.f35377g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f35372b) {
            try {
                float[] fArr2 = this.f35376f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
