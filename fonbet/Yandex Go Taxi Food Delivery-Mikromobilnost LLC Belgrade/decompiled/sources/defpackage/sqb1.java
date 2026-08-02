package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;

/* loaded from: classes11.dex */
public abstract class sqb1 {
    public static final void a(bt40 bt40Var, frv0 frv0Var, w49 w49Var, tls tlsVar, z0a0 z0a0Var, tls tlsVar2, lz6 lz6Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(829997399);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(bt40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(frv0Var) : btsVar2.e(frv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar2.k(w49Var) : btsVar2.e(w49Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= (32768 & i) == 0 ? btsVar2.k(z0a0Var) : btsVar2.e(z0a0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? btsVar2.k(lz6Var) : btsVar2.e(lz6Var) ? 1048576 : 524288;
        }
        if (btsVar2.V(i2 & 1, (599187 & i2) != 599186)) {
            btsVar = btsVar2;
            rzo.b(null, "default", wwg.S(-1854775365, true, new et0(frv0Var, w49Var, tlsVar2, bt40Var, z0a0Var, lz6Var, tlsVar, 8), btsVar2), btsVar, 3456, 3);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ft0(bt40Var, frv0Var, w49Var, tlsVar, z0a0Var, tlsVar2, lz6Var, i, 2);
        }
    }

    public static final Token b() {
        return new Token("");
    }

    public static final Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
