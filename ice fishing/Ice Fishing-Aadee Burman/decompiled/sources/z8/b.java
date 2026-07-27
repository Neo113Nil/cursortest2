package z8;

import kotlin.jvm.internal.h;
import y8.u;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f42274a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' <= c9 && c9 < 'G') {
            return c9 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c9);
    }

    public static final int b(u uVar, int i) {
        int i6;
        h.e(uVar, "<this>");
        int i9 = i + 1;
        int length = uVar.f41994x.length;
        int[] iArr = uVar.f41995y;
        h.e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i6 = (i11 + i10) >>> 1;
                int i12 = iArr[i6];
                if (i12 >= i9) {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i6 - 1;
                } else {
                    i11 = i6 + 1;
                }
            } else {
                i6 = (-i11) - 1;
                break;
            }
        }
        return i6 >= 0 ? i6 : ~i6;
    }
}
