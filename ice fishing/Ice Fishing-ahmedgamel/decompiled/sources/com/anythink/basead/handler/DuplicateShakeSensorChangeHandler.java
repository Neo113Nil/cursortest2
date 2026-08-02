package com.anythink.basead.handler;

import android.hardware.SensorEvent;
import com.IceFishing.LiveIceFishing.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DuplicateShakeSensorChangeHandler extends BaseShakeSensorChangeHandlerImp {

    /* renamed from: d, reason: collision with root package name */
    List<Double> f9833d;

    /* renamed from: e, reason: collision with root package name */
    long f9834e;

    /* renamed from: m, reason: collision with root package name */
    ATShackSensorListener f9841m;

    /* renamed from: n, reason: collision with root package name */
    float f9842n;

    /* renamed from: o, reason: collision with root package name */
    float f9843o;

    /* renamed from: p, reason: collision with root package name */
    float f9844p;
    public long lastCallBackTimeMs = 0;

    /* renamed from: s, reason: collision with root package name */
    private long f9847s = 0;

    /* renamed from: q, reason: collision with root package name */
    String f9845q = "";

    /* renamed from: j, reason: collision with root package name */
    List<Double> f9838j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    List<Double> f9839k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<Double> f9840l = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    long f9835f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f9836g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f9837h = 0;
    int i = 0;

    /* renamed from: r, reason: collision with root package name */
    boolean f9846r = false;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long a(float f2, float f9, float f10) {
        long j6;
        double a9 = a(0);
        if (this.f9836g == 0 && Math.abs(f2) >= a9) {
            a(0, f2);
            this.f9836g = 1;
            if (this.f9835f == 0) {
                j6 = System.currentTimeMillis();
                if (this.f9837h == 0 && Math.abs(f9) >= a9) {
                    a(1, f9);
                    this.f9837h = 1;
                    if (this.f9835f == 0) {
                        j6 = System.currentTimeMillis();
                    }
                }
                if (this.i == 0 && Math.abs(f10) >= a9) {
                    a(2, f10);
                    this.i = 1;
                    if (this.f9835f == 0) {
                        return System.currentTimeMillis();
                    }
                }
                return j6;
            }
        }
        j6 = 0;
        if (this.f9837h == 0) {
            a(1, f9);
            this.f9837h = 1;
            if (this.f9835f == 0) {
            }
        }
        if (this.i == 0) {
            a(2, f10);
            this.i = 1;
            if (this.f9835f == 0) {
            }
        }
        return j6;
    }

    private void c() {
        this.f9835f = 0L;
        this.f9836g = 0;
        this.f9838j.clear();
        this.f9837h = 0;
        this.f9839k.clear();
        this.i = 0;
        this.f9840l.clear();
    }

    private boolean d() {
        if (this.f9841m == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastCallBackTimeMs <= this.f9847s) {
            return false;
        }
        b();
        if (!this.f9841m.onShakeTrigger()) {
            return false;
        }
        this.lastCallBackTimeMs = currentTimeMillis;
        a();
        return true;
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public boolean handleSensorData(SensorEvent sensorEvent) {
        float[] fArr;
        if (this.f9841m != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            try {
                float f2 = this.f9842n;
                if (f2 == 0.0f) {
                    this.f9842n = -fArr[0];
                    this.f9843o = -fArr[1];
                    this.f9844p = -fArr[2];
                    return false;
                }
                float f9 = (-fArr[0]) - f2;
                float f10 = (-fArr[1]) - this.f9843o;
                float f11 = (-fArr[2]) - this.f9844p;
                a(sensorEvent);
                if (this.f9835f == 0) {
                    this.f9835f = a(f9, f10, f11);
                } else if (System.currentTimeMillis() - this.f9835f > this.f9834e) {
                    c();
                } else {
                    if (this.f9836g > 0 && this.f9838j.size() > 0) {
                        if (this.f9836g >= this.f9838j.size()) {
                            c();
                            return d();
                        }
                        double doubleValue = this.f9838j.get(this.f9836g).doubleValue();
                        if (f9 * doubleValue > 0.0d && Math.abs(f9) > Math.abs(doubleValue)) {
                            this.f9836g++;
                        }
                    }
                    if (this.f9837h > 0 && this.f9839k.size() > 0) {
                        if (this.f9837h >= this.f9839k.size()) {
                            c();
                            return d();
                        }
                        double doubleValue2 = this.f9839k.get(this.f9837h).doubleValue();
                        if (f10 * doubleValue2 > 0.0d && Math.abs(f10) > Math.abs(doubleValue2)) {
                            this.f9837h++;
                        }
                    }
                    if (this.i > 0 && this.f9840l.size() > 0) {
                        if (this.i >= this.f9840l.size()) {
                            c();
                            return d();
                        }
                        double doubleValue3 = this.f9840l.get(this.i).doubleValue();
                        if (f11 * doubleValue3 > 0.0d && Math.abs(f11) > Math.abs(doubleValue3)) {
                            this.i++;
                        }
                    }
                    a(f9, f10, f11);
                }
            } catch (Throwable th) {
                if (!this.f9846r) {
                    k.x("ShakeHandler", "Throwable:" + th.getMessage() + ",params:" + this.f9845q);
                    this.f9846r = true;
                }
            }
        }
        return false;
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void initSetting(ShakeSensorSetting shakeSensorSetting) {
        if (shakeSensorSetting != null) {
            this.f9847s = shakeSensorSetting.getShakeTimeMs();
            this.f9833d = shakeSensorSetting.getShakeStrengthList();
            this.f9834e = shakeSensorSetting.getShakeDetectDurationTime();
            this.f9845q = shakeSensorSetting.toString();
        }
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void setListener(ATShackSensorListener aTShackSensorListener) {
        this.f9841m = aTShackSensorListener;
    }

    private void a(int i, float f2) {
        List<Double> list;
        if (i == 1) {
            list = this.f9839k;
        } else if (i != 2) {
            list = this.f9838j;
        } else {
            list = this.f9840l;
        }
        list.clear();
        for (int i4 = 0; i4 < this.f9833d.size() - 1; i4++) {
            double a9 = a(i4);
            if (f2 < 0.0f) {
                list.add(Double.valueOf((-1.0d) * a9));
                list.add(Double.valueOf(a9 * 1.0d));
            } else {
                list.add(Double.valueOf(1.0d * a9));
                list.add(Double.valueOf(a9 * (-1.0d)));
            }
        }
        double a10 = a(this.f9833d.size() - 1);
        if (f2 < 0.0f) {
            list.add(Double.valueOf(a10 * (-1.0d)));
        } else {
            list.add(Double.valueOf(a10 * 1.0d));
        }
    }

    private double a(int i) {
        List<Double> list = this.f9833d;
        if (list == null || list.size() <= i) {
            return Double.MAX_VALUE;
        }
        return this.f9833d.get(i).doubleValue();
    }

    @Override // com.anythink.basead.handler.BaseShakeSensorChangeHandlerImp
    public final void a() {
        super.a();
        c();
    }
}
