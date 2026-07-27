package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.Ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1146Ox extends Drawable {
    public static String[] A00 = {"Bq6maawZ0clc1FQAmj5JQZ", "VAIBWau0AGjNNTEN3MsesX9vol", "j9uAnr9SO1508v2Fml3gke", "ZCgsP4jhFD2e5OZklqeZfYu5I7s7wZNA", "gWy56vmTKK0E", "vsILSp0QdnJQHstvTHvz6zn3fr5EWYkf", "Ft8tZM9UwubEJUOv9H1JFeEwlzUnh", "KM7boO2xaC3ZbV22lXcue9aE71LlUQ5e"};
    public static final double A01 = Math.cos(Math.toRadians(45.0d));

    public static float A00(float f6, float f9, boolean z8) {
        if (z8) {
            return (float) (f6 + ((1.0d - A01) * f9));
        }
        return f6;
    }

    public static float A01(float f6, float f9, boolean z8) {
        if (z8) {
            return (float) ((1.5f * f6) + ((1.0d - A01) * f9));
        }
        float f10 = 1.5f * f6;
        if (A00[6].length() == 2) {
            throw new RuntimeException();
        }
        A00[3] = "QZbxm3QXOF2yqMmVze25YX6oNvKBlq6Q";
        return f10;
    }
}
