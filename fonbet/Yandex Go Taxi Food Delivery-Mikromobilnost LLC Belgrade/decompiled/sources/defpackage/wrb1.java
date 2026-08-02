package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class wrb1 {
    public static au2 b;
    public final /* synthetic */ int a = 2;

    public static final void a(ibp0 ibp0Var, int i, int i2, fid fidVar, int i3) {
        int i4;
        int i5;
        int i6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1819087233);
        int i7 = i3 & 48;
        c530 c530Var = c530.a;
        if (i7 == 0) {
            i4 = (btsVar.k(c530Var) ? 32 : 16) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar.c(i) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.c(i2) ? 2048 : 1024;
        }
        if (btsVar.V(i4 & 1, (i4 & 1169) != 1168)) {
            i5 = i;
            i6 = i2;
            ysb1.a(an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), i5, i6, 0.0f, 0.0f, null, null, null, null, btsVar, (i4 >> 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
        } else {
            i5 = i;
            i6 = i2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx11(ibp0Var, i5, i6, i3);
        }
    }

    public abstract Address b();

    public boolean equals(Object obj) {
        switch (this.a) {
            case 2:
                if (this != obj) {
                    if (obj instanceof oe50) {
                        Address b2 = b();
                        Address address = ((oe50) obj).c;
                        if (!jl40.l(b2, address) || b().B().a != address.B().a || b().B().b != address.B().b) {
                        }
                    }
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 2:
                return Double.hashCode(b().B().b) + unr0.a(b().hashCode() * 31, 31, b().B().a);
            default:
                return super.hashCode();
        }
    }
}
