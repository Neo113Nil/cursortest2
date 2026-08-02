package com.squareup.cash.nearby.views;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class SearchCircle {
    public boolean initialized;
    public float phase0;
    public float phase1;
    public float phase2;
    public float phase3;
    public float vx;
    public float vy;
    public float x;
    public float y;

    /* renamed from: snapshotAt-Rc2DDho, reason: not valid java name */
    public final long m3668snapshotAtRc2DDho(float f, float f2, float f3, float f4) {
        boolean z = this.initialized;
        if (!z) {
            f = f3 / 2.0f;
        }
        if (!z) {
            f2 = f4 / 2.0f;
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax);
    }

    public final void update(float f, float f2, float f3, float f4, float f5) {
        if (!this.initialized) {
            this.x = f2;
            this.y = f3;
            this.initialized = true;
        }
        if (f > 0.066f) {
            f = 0.066f;
        }
        float f6 = (0.72f * f) + this.phase0;
        this.phase0 = f6;
        this.phase1 = (1.22f * f) + this.phase1;
        this.phase2 = (0.43f * f) + this.phase2;
        this.phase3 = (1.66f * f) + this.phase3;
        float cos = (((((float) Math.cos(this.phase3 * 0.9f)) * 0.1f) + (((float) Math.sin(this.phase2 * 0.7f)) * 0.2f) + (((float) Math.sin(this.phase1 * 1.3f)) * 0.3f) + (((float) Math.sin(f6)) * 0.4f)) * f4 * 0.42f) + f2;
        float sin = (((((float) Math.sin(this.phase3 * 0.6f)) * 0.1f) + (((float) Math.sin(this.phase2 * 1.1f)) * 0.2f) + (((float) Math.cos(this.phase1)) * 0.3f) + (((float) Math.cos(this.phase0 * 0.8f)) * 0.4f)) * f5 * 0.42f) + f3;
        float f7 = this.x;
        float f8 = this.vx;
        float f9 = this.y;
        float f10 = this.vy;
        float f11 = ((((cos - f7) * 6.0f) - (f8 * 0.82f)) * f) + f8;
        this.vx = f11;
        float f12 = ((((sin - f9) * 6.0f) - (0.82f * f10)) * f) + f10;
        this.vy = f12;
        this.x = (f11 * f) + f7;
        this.y = (f12 * f) + f9;
    }
}
