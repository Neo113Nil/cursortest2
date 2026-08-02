package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class Ry {

    /* renamed from: a, reason: collision with root package name */
    public long f28095a;

    /* renamed from: b, reason: collision with root package name */
    public long f28096b;

    /* renamed from: c, reason: collision with root package name */
    public long f28097c;

    /* renamed from: d, reason: collision with root package name */
    public long f28098d;

    /* renamed from: e, reason: collision with root package name */
    public double f28099e;

    /* renamed from: f, reason: collision with root package name */
    public double f28100f;

    /* renamed from: g, reason: collision with root package name */
    public double f28101g;

    /* renamed from: h, reason: collision with root package name */
    public float f28102h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f28103j;

    /* renamed from: k, reason: collision with root package name */
    public float f28104k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f28095a++;
            this.f28101g = 0.0d;
            this.f28099e = motionEvent.getRawX();
            this.f28100f = motionEvent.getRawY();
            this.f28102h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.f28103j = motionEvent.getRawX();
            this.f28104k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f28097c++;
            this.f28101g = Math.hypot(motionEvent.getRawX() - this.f28099e, motionEvent.getRawY() - this.f28100f) + this.f28101g;
            this.f28099e = motionEvent.getRawX();
            this.f28100f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f28098d++;
            return;
        }
        this.f28096b += motionEvent.getHistorySize() + 1;
        this.f28101g = Math.hypot(motionEvent.getRawX() - this.f28099e, motionEvent.getRawY() - this.f28100f) + this.f28101g;
        this.f28099e = motionEvent.getRawX();
        this.f28100f = motionEvent.getRawY();
    }
}
