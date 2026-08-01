package p8;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class t {
    public static int a(int i, int i6, int i9) {
        if ((i6 & 8) != 0) {
            i--;
        }
        if (i9 <= i) {
            return i - i9;
        }
        throw new IOException(u1.h.c(i9, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
