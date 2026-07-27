package com.anythink.basead.exoplayer.k;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8512a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8513b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8514c = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private w() {
    }

    private static int a(int i, int i6) {
        for (int i9 = 1; i9 <= 2; i9++) {
            int i10 = (i + i9) % 3;
            if (i10 == 0) {
                return i10;
            }
            if (i10 == 1) {
                if ((i6 & 1) != 0) {
                    return i10;
                }
            } else if (i10 == 2 && (i6 & 2) != 0) {
                return i10;
            }
        }
        return i;
    }

    private static boolean b(int i, int i6) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i6 & 2) != 0 : (i6 & 1) != 0;
        }
        return true;
    }
}
