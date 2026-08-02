package io.appmetrica.analytics.impl;

import defpackage.oyr;

/* loaded from: classes4.dex */
public class S3 implements T3 {
    public final int a;

    public S3(int i) {
        this.a = i;
    }

    public static T3 a(T3... t3Arr) {
        return new S3(b(t3Arr));
    }

    public static int b(T3... t3Arr) {
        int i = 0;
        for (T3 t3 : t3Arr) {
            if (t3 != null) {
                i = t3.getBytesTruncated() + i;
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.impl.T3
    public final int getBytesTruncated() {
        return this.a;
    }

    public String toString() {
        return oyr.s(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.a, '}');
    }
}
