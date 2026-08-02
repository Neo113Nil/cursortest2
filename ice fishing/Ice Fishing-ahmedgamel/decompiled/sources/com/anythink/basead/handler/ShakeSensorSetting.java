package com.anythink.basead.handler;

import com.anythink.core.common.h.y;
import java.util.List;

/* loaded from: classes.dex */
public class ShakeSensorSetting {

    /* renamed from: a, reason: collision with root package name */
    List<Double> f9848a;

    /* renamed from: b, reason: collision with root package name */
    long f9849b;

    /* renamed from: c, reason: collision with root package name */
    private int f9850c;

    /* renamed from: d, reason: collision with root package name */
    private int f9851d;

    /* renamed from: e, reason: collision with root package name */
    private long f9852e;

    public ShakeSensorSetting(y yVar) {
        this.f9851d = 0;
        this.f9852e = 0L;
        this.f9850c = yVar.aK();
        this.f9851d = yVar.aN();
        this.f9848a = yVar.aM();
        this.f9849b = yVar.aL();
        this.f9852e = yVar.Y();
    }

    public long getShakeDetectDurationTime() {
        return this.f9849b;
    }

    public int getShakeStrength() {
        return this.f9851d;
    }

    public List<Double> getShakeStrengthList() {
        return this.f9848a;
    }

    public long getShakeTimeMs() {
        return this.f9852e;
    }

    public int getShakeWay() {
        return this.f9850c;
    }

    public String toString() {
        return "ShakeSensorSetting{shakeWay=" + this.f9850c + ", shakeStrength=" + this.f9851d + ", shakeStrengthList=" + this.f9848a + ", shakeDetectDurationTime=" + this.f9849b + ", shakeTimeMs=" + this.f9852e + '}';
    }
}
