package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.e;
import java.io.File;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import yads.c63;
import yads.y43;

/* loaded from: classes11.dex */
public abstract class rma1 {
    public static final void a(final String str, final String str2, final sls slsVar, final sls slsVar2, final sls slsVar3, final long j, fid fidVar, final int i) {
        uo5 uo5Var;
        uo5 uo5Var2 = x4c.w;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1958028936);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.e(slsVar) ? 2048 : 1024) | (btsVar.e(slsVar2) ? 16384 : 8192) | 524288 | (btsVar.d(j) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar.V(i2 & 1, (4793491 & i2) != 4793490)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            int i3 = i2 & (-3670017);
            btsVar.u();
            View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                uo5Var = uo5Var2;
                Q = f.j(new z5w((iArr[1] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (iArr[0] << 32)));
                btsVar.o0(Q);
            } else {
                uo5Var = uo5Var2;
            }
            oz40 oz40Var = (oz40) Q;
            boolean e = btsVar.e(view) | btsVar.e(iArr);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new f89(10, view, iArr, oz40Var);
                btsVar.o0(Q2);
            }
            zpn.a(view, (tls) Q2, btsVar);
            boolean d = ((i3 & 29360128) == 8388608) | btsVar.d(((z5w) oz40Var.getValue()).a) | btsVar.d(0L);
            Object Q3 = btsVar.Q();
            if (d || Q3 == o430Var) {
                oif oifVar = new oif(j, new int[]{(int) (((z5w) oz40Var.getValue()).a >> 32), (int) (((z5w) oz40Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)}, uo5Var, 0L);
                btsVar.o0(oifVar);
                Q3 = oifVar;
            }
            e.a((oif) Q3, slsVar3, new eae0(true, false, 14), wwg.S(47399830, true, new ej0(str, str2, slsVar, slsVar2, slsVar3), btsVar), btsVar, 3504, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(str, str2, slsVar, slsVar2, slsVar3, j, i) { // from class: fj0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ sls c;
                public final /* synthetic */ sls w;
                public final /* synthetic */ sls x;
                public final /* synthetic */ long y;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(196993);
                    rma1.a(this.a, this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(String str, String str2, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-768724849);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(slsVar3) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            byk0 d = ((YandexShapes) btsVar.m(qm51.a)).d();
            yib1.c(ibb1.c(ljs0.q(an91.k(c530.a, 16.0f), 250.0f), 4.0f, d, 0L, 0L, 28), d, ((el51) btsVar.m(gl51.a)).d(), 0L, wwg.S(-1827753781, true, new ej0(slsVar, slsVar3, slsVar2, str, str2), btsVar), btsVar, 1572864);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(str, str2, slsVar, slsVar2, slsVar3, i, 2);
        }
    }

    public static gl61 c(y43 y43Var) {
        String message;
        String message2;
        Throwable cause = y43Var.getCause();
        if (cause == null || (message = cause.getMessage()) == null) {
            message = y43Var.getMessage();
        }
        if (cause instanceof SocketTimeoutException) {
            c63 c63Var = c63.d;
            if (message == null) {
                message = "Read timeout";
            }
            return new gl61(c63Var, "socket_timeout", message, null);
        }
        if ((cause instanceof ConnectException) && (message2 = cause.getMessage()) != null && evu0.y(message2, "timeout", true)) {
            c63 c63Var2 = c63.d;
            if (message == null) {
                message = "Connection timeout";
            }
            return new gl61(c63Var2, "connect_timeout", message, null);
        }
        c63 c63Var3 = c63.d;
        if (message == null) {
            message = "Request timeout";
        }
        return new gl61(c63Var3, "timeout", message, null);
    }

    public static File[] d(Context context) {
        return context.getExternalMediaDirs();
    }
}
