package defpackage;

import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class s7a1 implements Comparable {
    public static int d(byte b) {
        return (b >> 5) & 7;
    }

    public static void e(String str) {
        new d7a1(str);
    }

    public static s7a1 f(byte... bArr) {
        bArr.getClass();
        zr10 zr10Var = new zr10(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return iwa1.d(zr10Var);
        } finally {
            try {
                zr10Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final s7a1 c(Class cls) {
        if (cls.isInstance(this)) {
            return (s7a1) cls.cast(this);
        }
        throw new zzho(b64.l("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
