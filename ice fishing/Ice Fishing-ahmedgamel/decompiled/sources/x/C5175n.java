package x;

import java.io.File;
import u1.InterfaceC5066e;
import v7.AbstractC5118i;
import y1.InterfaceC5200a;

/* renamed from: x.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5175n implements InterfaceC5200a {
    public static y8.h c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            bArr[i] = (byte) (z8.b.a(str.charAt(i4 + 1)) + (z8.b.a(str.charAt(i4)) << 4));
        }
        return new y8.h(bArr);
    }

    public static y8.h d(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        byte[] bytes = str.getBytes(Q7.a.f2701a);
        kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
        y8.h hVar = new y8.h(bytes);
        hVar.f41928v = str;
        return hVar;
    }

    public static y8.h e(byte[] bArr, int i, int i4) {
        if (i4 == -1234567890) {
            i4 = bArr.length;
        }
        y8.b.d(bArr.length, i, i4);
        return new y8.h(AbstractC5118i.w(bArr, i, i4 + i));
    }

    @Override // y1.InterfaceC5200a
    public File a(InterfaceC5066e interfaceC5066e) {
        return null;
    }

    @Override // y1.InterfaceC5200a
    public void b(InterfaceC5066e interfaceC5066e, l4.g gVar) {
    }
}
