package p8;

import java.io.IOException;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class t {
    public static int a(int i, int i4, int i6) {
        if ((i4 & 8) != 0) {
            i--;
        }
        if (i6 <= i) {
            return i - i6;
        }
        throw new IOException(AbstractC5128c.c(i6, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
