package com.anythink.basead.handler;

import android.hardware.SensorEvent;
import com.anythink.basead.exoplayer.f;

/* loaded from: classes.dex */
public class SimpleShakeSensorChangeHandler extends BaseShakeSensorChangeHandlerImp {

    /* renamed from: d, reason: collision with root package name */
    ATShackSensorListener f9067d;
    public float lastX = 0.0f;
    public float lastY = 0.0f;
    public float lastZ = 0.0f;
    public long lastCallBackTimeMs = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f9068e = 10;

    /* renamed from: f, reason: collision with root package name */
    private long f9069f = f.f7187a;

    @Override // com.anythink.basead.handler.BaseShakeSensorChangeHandlerImp
    public final void a() {
        super.a();
        this.lastX = 0.0f;
        this.lastY = 0.0f;
        this.lastZ = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (java.lang.Math.abs(r0 - r12) > r11.f9068e) goto L20;
     */
    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleSensorData(SensorEvent sensorEvent) {
        float[] fArr;
        if (this.f9067d != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            float f3 = -fArr[0];
            float f9 = -fArr[1];
            float f10 = -fArr[2];
            a(sensorEvent);
            String.format("handleSensorData lastx:%d,lasty:%d,lastz:%d", Integer.valueOf((int) f3), Integer.valueOf((int) f9), Integer.valueOf((int) f10));
            float f11 = this.lastX;
            if (f11 == 0.0f || Math.abs(f3 - f11) <= this.f9068e) {
                float f12 = this.lastY;
                if (f12 == 0.0f || Math.abs(f9 - f12) <= this.f9068e) {
                    float f13 = this.lastZ;
                    if (f13 != 0.0f) {
                    }
                    this.lastX = f3;
                    this.lastY = f9;
                    this.lastZ = f10;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastCallBackTimeMs > this.f9069f) {
                b();
                if (this.f9067d.onShakeTrigger()) {
                    this.lastCallBackTimeMs = currentTimeMillis;
                    a();
                    return true;
                }
            }
            this.lastX = f3;
            this.lastY = f9;
            this.lastZ = f10;
        }
        return false;
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void initSetting(ShakeSensorSetting shakeSensorSetting) {
        if (shakeSensorSetting != null) {
            this.f9068e = shakeSensorSetting.getShakeStrength();
            this.f9069f = shakeSensorSetting.getShakeTimeMs();
        }
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void setListener(ATShackSensorListener aTShackSensorListener) {
        this.f9067d = aTShackSensorListener;
    }
}
