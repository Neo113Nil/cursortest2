package yads;

import android.os.Handler;
import android.os.Message;
import defpackage.rf71;
import defpackage.ss81;
import defpackage.yl81;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public final class uj1 implements Handler.Callback {
    public final Handler b;
    public final /* synthetic */ yl81 c;

    public uj1(yl81 yl81Var, ss81 ss81Var) {
        this.c = yl81Var;
        Handler i = rf71.i(this);
        this.b = i;
        ss81Var.i(this, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = rf71.a;
        long j = ((i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & i2);
        yl81 yl81Var = this.c;
        if (this != yl81Var.X4) {
            return true;
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            yl81Var.N0 = true;
            return true;
        }
        try {
            yl81Var.C(j);
            yl81Var.V();
            yl81Var.P0.e++;
            yl81Var.B2 = true;
            if (!yl81Var.x2) {
                yl81Var.x2 = true;
                yl81Var.x1.a(yl81Var.V1);
                yl81Var.p2 = true;
            }
            yl81Var.t(j);
            return true;
        } catch (zm0 e) {
            this.c.O0 = e;
            return true;
        }
    }
}
