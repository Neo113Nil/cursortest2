package com.anythink.basead.handler;

import com.anythink.core.common.h.y;
import java.util.List;

/* loaded from: classes.dex */
public class ShakeSensorSetting {

    /* renamed from: a, reason: collision with root package name */
    List<Double> f9062a;

    /* renamed from: b, reason: collision with root package name */
    long f9063b;

    /* renamed from: c, reason: collision with root package name */
    private int f9064c;

    /* renamed from: d, reason: collision with root package name */
    private int f9065d;

    /* renamed from: e, reason: collision with root package name */
    private long f9066e;

    public ShakeSensorSetting(y yVar) {
        this.f9065d = 0;
        this.f9066e = 0L;
        this.f9064c = yVar.aK();
        this.f9065d = yVar.aN();
        this.f9062a = yVar.aM();
        this.f9063b = yVar.aL();
        this.f9066e = yVar.Y();
    }

    public long getShakeDetectDurationTime() {
        return this.f9063b;
    }

    public int getShakeStrength() {
        return this.f9065d;
    }

    public List<Double> getShakeStrengthList() {
        return this.f9062a;
    }

    public long getShakeTimeMs() {
        return this.f9066e;
    }

    public int getShakeWay() {
        return this.f9064c;
    }

    public String toString() {
        return "ShakeSensorSetting{shakeWay=" + this.f9064c + ", shakeStrength=" + this.f9065d + ", shakeStrengthList=" + this.f9062a + ", shakeDetectDurationTime=" + this.f9063b + ", shakeTimeMs=" + this.f9066e + '}';
    }
}
