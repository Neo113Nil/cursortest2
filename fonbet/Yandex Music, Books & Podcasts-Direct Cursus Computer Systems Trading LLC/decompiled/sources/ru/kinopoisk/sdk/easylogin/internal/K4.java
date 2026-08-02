package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ai3;
import defpackage.enj;
import defpackage.gl5;
import defpackage.nmq;
import defpackage.swf;
import defpackage.u75;
import defpackage.uz0;
import defpackage.y9w;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class K4 {

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return gl5.b((Float) ((Pair) t).a, (Float) ((Pair) t2).a);
        }
    }

    @NotNull
    public static ai3 a(long j, @NotNull C1009d6 c1009d6) {
        Pair pair;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        c1009d6.getClass();
        if (nmq.a(j, 9205357640488583168L) || nmq.a(j, 0L)) {
            pair = new Pair(new enj(0L), new enj(9187343241974906880L));
        } else {
            long j2 = c1009d6.c;
            long j3 = c1009d6.d;
            float d = nmq.d(j);
            float b = nmq.b(j);
            List h = u75.h(Float.valueOf(enj.e(j2)), Float.valueOf(enj.f(j2)), Float.valueOf(enj.e(j3)), Float.valueOf(enj.f(j3)));
            float atan2 = ((float) (((((float) Math.atan2((((Number) h.get(3)).floatValue() - ((Number) h.get(1)).floatValue()) * b, (((Number) h.get(2)).floatValue() - ((Number) h.get(0)).floatValue()) * d)) * 180) / 3.141592653589793d) + 90)) % 360;
            float abs = (float) Math.abs(Math.tan(Math.toRadians(atan2)));
            float f6 = 0.0f;
            if (atan2 == 90.0f || atan2 == 270.0f) {
                f = d;
                f2 = 0.0f;
            } else if (atan2 == 0.0f || atan2 == 180.0f) {
                f2 = b;
                f = 0.0f;
            } else if (abs < 1.0f) {
                f = ((b - (d * abs)) * abs) + d;
                f2 = abs * f;
            } else if (abs > 1.0f) {
                float f7 = ((d - (b / abs)) / abs) + b;
                f = f7 / abs;
                f2 = f7;
            } else {
                f = Math.max(d, b);
                f2 = f;
            }
            if (atan2 < 90.0f) {
                f5 = b + 0.0f;
                f3 = f + 0.0f;
                f4 = f5 - f2;
            } else if (atan2 < 180.0f) {
                f3 = f + 0.0f;
                f4 = 0.0f + f2;
                f5 = 0.0f;
            } else {
                float f8 = d + 0.0f;
                if (atan2 < 270.0f) {
                    f3 = f8 - f;
                    f4 = 0.0f + f2;
                } else {
                    f6 = 0.0f + b;
                    f3 = f8 - f;
                    f4 = f6 - f2;
                }
                f5 = f6;
                f6 = f8;
            }
            pair = new Pair(new enj(swf.i(f6, f5)), new enj(swf.i(f3, f4)));
        }
        long j4 = ((enj) pair.a).a;
        long j5 = ((enj) pair.b).a;
        Object[] objArr = c1009d6.e;
        a aVar = new a();
        objArr.getClass();
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            uz0.p(objArr, aVar);
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        Pair[] pairArr = (Pair[]) asList.toArray(new Pair[0]);
        return y9w.L((Pair[]) Arrays.copyOf(pairArr, pairArr.length), j4, j5);
    }
}
