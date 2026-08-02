package com.squareup.cash.androidsvg;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class SVG$Box implements Cloneable {
    public final float height;
    public final float minX;
    public final float minY;
    public final float width;

    public SVG$Box(float f, float f2, float f3, float f4) {
        this.minX = f;
        this.minY = f2;
        this.width = f3;
        this.height = f4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.minX);
        sb.append(" ");
        sb.append(this.minY);
        sb.append(" ");
        sb.append(this.width);
        sb.append(" ");
        return Recorder$$ExternalSyntheticOutline1.m(this.height, "]", sb);
    }
}
