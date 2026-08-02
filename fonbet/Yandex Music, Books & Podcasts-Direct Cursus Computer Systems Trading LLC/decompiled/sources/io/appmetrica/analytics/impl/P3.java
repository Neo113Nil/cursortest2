package io.appmetrica.analytics.impl;

import defpackage.vz1;

/* loaded from: classes5.dex */
public class P3 implements Q3 {
    public final int a;

    public P3(int i) {
        this.a = i;
    }

    public static Q3 a(Q3... q3Arr) {
        return new P3(b(q3Arr));
    }

    public static int b(Q3... q3Arr) {
        int i = 0;
        for (Q3 q3 : q3Arr) {
            if (q3 != null) {
                i = q3.getBytesTruncated() + i;
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.impl.Q3
    public final int getBytesTruncated() {
        return this.a;
    }

    public String toString() {
        return vz1.r(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.a, '}');
    }
}
