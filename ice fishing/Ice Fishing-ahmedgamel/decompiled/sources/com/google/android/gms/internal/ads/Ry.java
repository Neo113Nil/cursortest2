package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class Ry {

    /* renamed from: a, reason: collision with root package name */
    public long f27381a;

    /* renamed from: b, reason: collision with root package name */
    public long f27382b;

    /* renamed from: c, reason: collision with root package name */
    public long f27383c;

    /* renamed from: d, reason: collision with root package name */
    public long f27384d;

    /* renamed from: e, reason: collision with root package name */
    public double f27385e;

    /* renamed from: f, reason: collision with root package name */
    public double f27386f;

    /* renamed from: g, reason: collision with root package name */
    public double f27387g;

    /* renamed from: h, reason: collision with root package name */
    public float f27388h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f27389j;

    /* renamed from: k, reason: collision with root package name */
    public float f27390k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f27381a++;
            this.f27387g = 0.0d;
            this.f27385e = motionEvent.getRawX();
            this.f27386f = motionEvent.getRawY();
            this.f27388h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.f27389j = motionEvent.getRawX();
            this.f27390k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f27383c++;
            this.f27387g = Math.hypot(motionEvent.getRawX() - this.f27385e, motionEvent.getRawY() - this.f27386f) + this.f27387g;
            this.f27385e = motionEvent.getRawX();
            this.f27386f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f27384d++;
            return;
        }
        this.f27382b += motionEvent.getHistorySize() + 1;
        this.f27387g = Math.hypot(motionEvent.getRawX() - this.f27385e, motionEvent.getRawY() - this.f27386f) + this.f27387g;
        this.f27385e = motionEvent.getRawX();
        this.f27386f = motionEvent.getRawY();
    }
}
