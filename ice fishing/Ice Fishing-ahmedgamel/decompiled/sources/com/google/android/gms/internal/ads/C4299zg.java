package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.zg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4299zg extends AbstractC3507kx {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f36144a;

    /* renamed from: c, reason: collision with root package name */
    public final Display f36146c;

    /* renamed from: f, reason: collision with root package name */
    public float[] f36149f;

    /* renamed from: g, reason: collision with root package name */
    public c3.e f36150g;

    /* renamed from: h, reason: collision with root package name */
    public C2489Ag f36151h;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f36147d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f36148e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f36145b = new Object();

    public C4299zg(Context context) {
        this.f36144a = (SensorManager) context.getSystemService("sensor");
        this.f36146c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3507kx
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f36145b) {
            try {
                if (this.f36149f == null) {
                    this.f36149f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.f36147d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f36146c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, com.anythink.expressad.video.module.a.a.f22517T, this.f36148e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, com.anythink.expressad.video.module.a.a.f22517T, com.anythink.expressad.video.module.a.a.f22518U, this.f36148e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f36148e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, com.anythink.expressad.video.module.a.a.f22518U, 1, this.f36148e);
        }
        float[] fArr3 = this.f36148e;
        float f2 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f2;
        float f9 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f9;
        float f10 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f10;
        synchronized (this.f36145b) {
            System.arraycopy(fArr3, 0, this.f36149f, 0, 9);
        }
        C2489Ag c2489Ag = this.f36151h;
        if (c2489Ag != null) {
            Object obj = c2489Ag.f24483N;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        if (this.f36150g == null) {
            return;
        }
        this.f36144a.unregisterListener(this);
        this.f36150g.post(new Y6(3));
        this.f36150g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f36145b) {
            try {
                float[] fArr2 = this.f36149f;
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
