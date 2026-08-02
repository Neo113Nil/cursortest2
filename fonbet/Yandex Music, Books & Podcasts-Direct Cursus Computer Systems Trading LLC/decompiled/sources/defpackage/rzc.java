package defpackage;

import java.nio.ByteOrder;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public final class rzc extends zje {
    public boolean h;
    public CRC32 i;

    public static short i(byte[] bArr) {
        int i;
        byte b;
        if (ByteOrder.LITTLE_ENDIAN == ByteOrder.BIG_ENDIAN) {
            i = bArr[0] << 8;
            b = bArr[1];
        } else {
            i = bArr[1] << 8;
            b = bArr[0];
        }
        return (short) ((b & 255) | i);
    }

    @Override // defpackage.zje, defpackage.jcc, defpackage.u97
    public final void Q(aa7 aa7Var, om3 om3Var) {
        if (!this.h) {
            super.Q(aa7Var, om3Var);
        } else {
            t4n t4nVar = new t4n(aa7Var);
            t4nVar.a(10, new j2j(this, aa7Var, t4nVar));
        }
    }
}
