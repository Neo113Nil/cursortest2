package com.anythink.basead.exoplayer.k;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9298a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9299b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9300c = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private w() {
    }

    private static int a(int i, int i4) {
        for (int i6 = 1; i6 <= 2; i6++) {
            int i9 = (i + i6) % 3;
            if (i9 == 0) {
                return i9;
            }
            if (i9 == 1) {
                if ((i4 & 1) != 0) {
                    return i9;
                }
            } else if (i9 == 2 && (i4 & 2) != 0) {
                return i9;
            }
        }
        return i;
    }

    private static boolean b(int i, int i4) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i4 & 2) != 0 : (i4 & 1) != 0;
        }
        return true;
    }
}
