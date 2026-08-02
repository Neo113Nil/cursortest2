package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum l0 implements hse {
    COLOR_ENCODING_UNKNOWN(0),
    COLOR_ENCODING_RGB(1),
    COLOR_ENCODING_YUV444(2),
    COLOR_ENCODING_YUV422(3),
    COLOR_ENCODING_YUV420(4);

    public final int a;

    l0(int i) {
        this.a = i;
    }

    public static l0 b(int i) {
        if (i == 0) {
            return COLOR_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return COLOR_ENCODING_RGB;
        }
        if (i == 2) {
            return COLOR_ENCODING_YUV444;
        }
        if (i == 3) {
            return COLOR_ENCODING_YUV422;
        }
        if (i != 4) {
            return null;
        }
        return COLOR_ENCODING_YUV420;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
