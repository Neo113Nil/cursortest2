package com.iab.omid.library.toponad.devicevolume;

/* loaded from: classes2.dex */
public class a {
    public float a(int i, int i4) {
        if (i4 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f2 = i / i4;
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }
}
