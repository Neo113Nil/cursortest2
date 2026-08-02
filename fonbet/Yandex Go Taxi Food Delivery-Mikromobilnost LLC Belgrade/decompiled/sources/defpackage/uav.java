package defpackage;

import coil.graphics.ExifOrientationPolicy;

/* loaded from: classes.dex */
public final class uav {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final ExifOrientationPolicy e;

    public uav(int i) {
        ExifOrientationPolicy exifOrientationPolicy = ExifOrientationPolicy.RESPECT_PERFORMANCE;
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = 4;
        this.e = exifOrientationPolicy;
    }

    public uav() {
        this(0);
    }
}
