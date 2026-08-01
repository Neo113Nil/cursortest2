package x;

import v7.AbstractC5128i;
import y2.InterfaceC5231c;

/* renamed from: x.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5176n implements InterfaceC5231c {
    public static y8.h a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i6 = i * 2;
            bArr[i] = (byte) (z8.b.a(str.charAt(i6 + 1)) + (z8.b.a(str.charAt(i6)) << 4));
        }
        return new y8.h(bArr);
    }

    public static y8.h b(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        byte[] bytes = str.getBytes(Q7.a.f2664a);
        kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
        y8.h hVar = new y8.h(bytes);
        hVar.f41957v = str;
        return hVar;
    }

    public static y8.h c(byte[] bArr, int i, int i6) {
        if (i6 == -1234567890) {
            i6 = bArr.length;
        }
        y8.b.d(bArr.length, i, i6);
        return new y8.h(AbstractC5128i.t(bArr, i, i6 + i));
    }
}
