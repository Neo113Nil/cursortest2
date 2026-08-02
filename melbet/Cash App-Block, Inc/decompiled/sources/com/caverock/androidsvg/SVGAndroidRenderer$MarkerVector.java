package com.caverock.androidsvg;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class SVGAndroidRenderer$MarkerVector {
    public float dx;
    public float dy;
    public boolean isAmbiguous = false;
    public final float x;
    public final float y;

    public SVGAndroidRenderer$MarkerVector(float f, float f2, float f3, float f4) {
        this.dx = RecyclerView.DECELERATION_RATE;
        this.dy = RecyclerView.DECELERATION_RATE;
        this.x = f;
        this.y = f2;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            this.dx = (float) (f3 / sqrt);
            this.dy = (float) (f4 / sqrt);
        }
    }

    public final void add(float f, float f2) {
        float f3 = f - this.x;
        float f4 = f2 - this.y;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            f3 = (float) (f3 / sqrt);
            f4 = (float) (f4 / sqrt);
        }
        float f5 = this.dx;
        if (f3 != (-f5) || f4 != (-this.dy)) {
            this.dx = f5 + f3;
            this.dy += f4;
        } else {
            this.isAmbiguous = true;
            this.dx = -f4;
            this.dy = f3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.x);
        sb.append(",");
        sb.append(this.y);
        sb.append(" ");
        sb.append(this.dx);
        sb.append(",");
        return Recorder$$ExternalSyntheticOutline1.m(this.dy, ")", sb);
    }

    public final void add(SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector) {
        float f = sVGAndroidRenderer$MarkerVector.dx;
        float f2 = this.dx;
        if (f == (-f2)) {
            float f3 = sVGAndroidRenderer$MarkerVector.dy;
            if (f3 == (-this.dy)) {
                this.isAmbiguous = true;
                this.dx = -f3;
                this.dy = sVGAndroidRenderer$MarkerVector.dx;
                return;
            }
        }
        this.dx = f2 + f;
        this.dy += sVGAndroidRenderer$MarkerVector.dy;
    }
}
