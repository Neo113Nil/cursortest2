package defpackage;

import androidx.compose.runtime.internal.a;
import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class v9b1 {
    public static final void a(ebp0 ebp0Var, a aVar, a aVar2, f530 f530Var, float f, to5 to5Var, to5 to5Var2, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        float f2;
        to5 to5Var3;
        to5 to5Var4;
        to5 to5Var5;
        to5 to5Var6;
        int i3;
        f530 f530Var3;
        float f3;
        to5 to5Var7 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2126943569);
        if ((i & 48) == 0) {
            i2 = (btsVar.e(aVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar2) ? 256 : 128;
        }
        int i4 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 = i2 | 11264;
        }
        int i5 = 1769472 | i4;
        if (btsVar.V(i5 & 1, (599185 & i5) != 599184)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                to5Var5 = to5Var7;
                to5Var6 = to5Var5;
                i3 = i5 & (-57345);
                f530Var3 = c530.a;
                f3 = 8.0f;
            } else {
                btsVar.Y();
                i3 = i5 & (-57345);
                f530Var3 = f530Var;
                f3 = f;
                to5Var5 = to5Var;
                to5Var6 = to5Var2;
            }
            btsVar.u();
            int i6 = i3 >> 3;
            vub1.b(wwg.S(-95317587, true, new k2z0(aVar, 10), btsVar), wwg.S(-1791340946, true, new k2z0(aVar2, 11), btsVar), f530Var3, f3, to5Var5, to5Var6, btsVar, (i6 & 896) | 54 | (57344 & i6) | (i6 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
            f530Var2 = f530Var3;
            f2 = f3;
            to5Var3 = to5Var5;
            to5Var4 = to5Var6;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            f2 = f;
            to5Var3 = to5Var;
            to5Var4 = to5Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new f86(ebp0Var, aVar, aVar2, f530Var2, f2, to5Var3, to5Var4, i, 1);
        }
    }

    public static final boolean b(yp6 yp6Var) {
        try {
            jci0 peek = yp6Var.peek();
            for (long j = 0; j < 16; j++) {
                if (peek.I1()) {
                    return true;
                }
                peek.B1(1L);
                yp6 yp6Var2 = peek.b;
                byte e = yp6Var2.e(0L);
                if ((e & 224) == 192) {
                    peek.B1(2L);
                } else if ((e & 240) == 224) {
                    peek.B1(3L);
                } else if ((e & 248) == 240) {
                    peek.B1(4L);
                }
                int U = yp6Var2.U();
                if (Character.isISOControl(U) && !Character.isWhitespace(U)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
