package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class wcx implements Comparable {
    public static int d(byte b) {
        return (b >> 5) & 7;
    }

    public static wcx e(byte... bArr) {
        bArr.getClass();
        edx edxVar = new edx(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return a0g.Q(edxVar);
        } finally {
            try {
                edxVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final wcx c(Class cls) {
        if (cls.isInstance(this)) {
            return (wcx) cls.cast(this);
        }
        throw new tcx(hrg.r("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
