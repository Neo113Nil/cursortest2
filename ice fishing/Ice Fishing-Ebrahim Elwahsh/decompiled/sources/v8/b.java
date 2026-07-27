package v8;

import kotlin.jvm.internal.h;
import u8.u;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f41377a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public static final int b(u uVar, int i) {
        int i4;
        h.e(uVar, "<this>");
        int i9 = i + 1;
        int length = uVar.f41321x.length;
        int[] iArr = uVar.f41322y;
        h.e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i4 = (i11 + i10) >>> 1;
                int i12 = iArr[i4];
                if (i12 >= i9) {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i4 - 1;
                } else {
                    i11 = i4 + 1;
                }
            } else {
                i4 = (-i11) - 1;
                break;
            }
        }
        return i4 >= 0 ? i4 : ~i4;
    }
}
