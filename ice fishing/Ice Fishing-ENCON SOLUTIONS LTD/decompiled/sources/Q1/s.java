package Q1;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class s {
    public static int a(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        throw new IOException(C1.a.h("PROTOCOL_ERROR padding ", i4, i2, " > remaining length "));
    }
}
