package com.anythink.basead.handler;

import D.y;
import android.hardware.SensorEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DuplicateShakeSensorChangeHandler extends BaseShakeSensorChangeHandlerImp {

    /* renamed from: d, reason: collision with root package name */
    List<Double> f9047d;

    /* renamed from: e, reason: collision with root package name */
    long f9048e;

    /* renamed from: m, reason: collision with root package name */
    ATShackSensorListener f9055m;

    /* renamed from: n, reason: collision with root package name */
    float f9056n;

    /* renamed from: o, reason: collision with root package name */
    float f9057o;

    /* renamed from: p, reason: collision with root package name */
    float f9058p;
    public long lastCallBackTimeMs = 0;

    /* renamed from: s, reason: collision with root package name */
    private long f9061s = 0;

    /* renamed from: q, reason: collision with root package name */
    String f9059q = "";

    /* renamed from: j, reason: collision with root package name */
    List<Double> f9052j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    List<Double> f9053k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<Double> f9054l = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    long f9049f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f9050g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f9051h = 0;
    int i = 0;

    /* renamed from: r, reason: collision with root package name */
    boolean f9060r = false;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long a(float f3, float f9, float f10) {
        long j6;
        double a9 = a(0);
        if (this.f9050g == 0 && Math.abs(f3) >= a9) {
            a(0, f3);
            this.f9050g = 1;
            if (this.f9049f == 0) {
                j6 = System.currentTimeMillis();
                if (this.f9051h == 0 && Math.abs(f9) >= a9) {
                    a(1, f9);
                    this.f9051h = 1;
                    if (this.f9049f == 0) {
                        j6 = System.currentTimeMillis();
                    }
                }
                if (this.i == 0 && Math.abs(f10) >= a9) {
                    a(2, f10);
                    this.i = 1;
                    if (this.f9049f == 0) {
                        return System.currentTimeMillis();
                    }
                }
                return j6;
            }
        }
        j6 = 0;
        if (this.f9051h == 0) {
            a(1, f9);
            this.f9051h = 1;
            if (this.f9049f == 0) {
            }
        }
        if (this.i == 0) {
            a(2, f10);
            this.i = 1;
            if (this.f9049f == 0) {
            }
        }
        return j6;
    }

    private void c() {
        this.f9049f = 0L;
        this.f9050g = 0;
        this.f9052j.clear();
        this.f9051h = 0;
        this.f9053k.clear();
        this.i = 0;
        this.f9054l.clear();
    }

    private boolean d() {
        if (this.f9055m == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastCallBackTimeMs <= this.f9061s) {
            return false;
        }
        b();
        if (!this.f9055m.onShakeTrigger()) {
            return false;
        }
        this.lastCallBackTimeMs = currentTimeMillis;
        a();
        return true;
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public boolean handleSensorData(SensorEvent sensorEvent) {
        float[] fArr;
        if (this.f9055m != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            try {
                float f3 = this.f9056n;
                if (f3 == 0.0f) {
                    this.f9056n = -fArr[0];
                    this.f9057o = -fArr[1];
                    this.f9058p = -fArr[2];
                    return false;
                }
                float f9 = (-fArr[0]) - f3;
                float f10 = (-fArr[1]) - this.f9057o;
                float f11 = (-fArr[2]) - this.f9058p;
                a(sensorEvent);
                if (this.f9049f == 0) {
                    this.f9049f = a(f9, f10, f11);
                } else if (System.currentTimeMillis() - this.f9049f > this.f9048e) {
                    c();
                } else {
                    if (this.f9050g > 0 && this.f9052j.size() > 0) {
                        if (this.f9050g >= this.f9052j.size()) {
                            c();
                            return d();
                        }
                        double doubleValue = this.f9052j.get(this.f9050g).doubleValue();
                        if (f9 * doubleValue > 0.0d && Math.abs(f9) > Math.abs(doubleValue)) {
                            this.f9050g++;
                        }
                    }
                    if (this.f9051h > 0 && this.f9053k.size() > 0) {
                        if (this.f9051h >= this.f9053k.size()) {
                            c();
                            return d();
                        }
                        double doubleValue2 = this.f9053k.get(this.f9051h).doubleValue();
                        if (f10 * doubleValue2 > 0.0d && Math.abs(f10) > Math.abs(doubleValue2)) {
                            this.f9051h++;
                        }
                    }
                    if (this.i > 0 && this.f9054l.size() > 0) {
                        if (this.i >= this.f9054l.size()) {
                            c();
                            return d();
                        }
                        double doubleValue3 = this.f9054l.get(this.i).doubleValue();
                        if (f11 * doubleValue3 > 0.0d && Math.abs(f11) > Math.abs(doubleValue3)) {
                            this.i++;
                        }
                    }
                    a(f9, f10, f11);
                }
            } catch (Throwable th) {
                if (!this.f9060r) {
                    y.w("ShakeHandler", "Throwable:" + th.getMessage() + ",params:" + this.f9059q);
                    this.f9060r = true;
                }
            }
        }
        return false;
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void initSetting(ShakeSensorSetting shakeSensorSetting) {
        if (shakeSensorSetting != null) {
            this.f9061s = shakeSensorSetting.getShakeTimeMs();
            this.f9047d = shakeSensorSetting.getShakeStrengthList();
            this.f9048e = shakeSensorSetting.getShakeDetectDurationTime();
            this.f9059q = shakeSensorSetting.toString();
        }
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void setListener(ATShackSensorListener aTShackSensorListener) {
        this.f9055m = aTShackSensorListener;
    }

    private void a(int i, float f3) {
        List<Double> list;
        if (i == 1) {
            list = this.f9053k;
        } else if (i != 2) {
            list = this.f9052j;
        } else {
            list = this.f9054l;
        }
        list.clear();
        for (int i6 = 0; i6 < this.f9047d.size() - 1; i6++) {
            double a9 = a(i6);
            if (f3 < 0.0f) {
                list.add(Double.valueOf((-1.0d) * a9));
                list.add(Double.valueOf(a9 * 1.0d));
            } else {
                list.add(Double.valueOf(1.0d * a9));
                list.add(Double.valueOf(a9 * (-1.0d)));
            }
        }
        double a10 = a(this.f9047d.size() - 1);
        if (f3 < 0.0f) {
            list.add(Double.valueOf(a10 * (-1.0d)));
        } else {
            list.add(Double.valueOf(a10 * 1.0d));
        }
    }

    private double a(int i) {
        List<Double> list = this.f9047d;
        if (list == null || list.size() <= i) {
            return Double.MAX_VALUE;
        }
        return this.f9047d.get(i).doubleValue();
    }

    @Override // com.anythink.basead.handler.BaseShakeSensorChangeHandlerImp
    public final void a() {
        super.a();
        c();
    }
}
