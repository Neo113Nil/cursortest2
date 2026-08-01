package com.iab.omid.library.toponad.devicevolume;

/* loaded from: classes2.dex */
public class a {
    public float a(int i, int i6) {
        if (i6 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f3 = i / i6;
        if (f3 > 1.0f) {
            return 1.0f;
        }
        return f3;
    }
}
