package z8;

import kotlin.jvm.internal.h;
import y8.u;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f42246a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

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
        int i4;
        h.e(uVar, "<this>");
        int i6 = i + 1;
        int length = uVar.f41968x.length;
        int[] iArr = uVar.f41969y;
        h.e(iArr, "<this>");
        int i9 = length - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= i9) {
                i4 = (i10 + i9) >>> 1;
                int i11 = iArr[i4];
                if (i11 >= i6) {
                    if (i11 <= i6) {
                        break;
                    }
                    i9 = i4 - 1;
                } else {
                    i10 = i4 + 1;
                }
            } else {
                i4 = (-i10) - 1;
                break;
            }
        }
        return i4 >= 0 ? i4 : ~i4;
    }
}
