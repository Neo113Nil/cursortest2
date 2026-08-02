package defpackage;

import android.net.Uri;
import com.yandex.go.deeplinks.generated.masstransit_payment_ble.MasstransitPaymentBleExitBehavior;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class vob1 {
    public static final void a(float f, f530 f530Var, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1134096014);
        int i2 = i | (btsVar.b(f) ? 4 : 2) | 48 | (btsVar.e(slsVar) ? 256 : 128);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530Var2 = c530Var;
            vpa1.a(an91.o(c530Var, 0.0f, 8.0f, 8.0f, 8.0f, 1), false, ButtonSize.M, slsVar, wwg.S(-949369602, true, new xvc(f, i3), btsVar), btsVar, ((i2 << 3) & 7168) | 24960, 2);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yvc(f, f530Var2, slsVar, i, 1);
        }
    }

    public static final boolean b(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof SocketException)) {
            return true;
        }
        Throwable cause = th.getCause();
        if (cause != null && ((cause instanceof UnknownHostException) || (cause instanceof ConnectException) || (cause instanceof SocketException))) {
            return true;
        }
        Throwable cause2 = th.getCause();
        return cause2 != null && b(cause2);
    }

    public static final ks30 c(String str, fe01 fe01Var) {
        if (str != null) {
            String str2 = !evu0.J(str) ? str : null;
            if (str2 != null) {
                String authority = Uri.parse(str2).getAuthority();
                String lowerCase = authority != null ? authority.toLowerCase(Locale.ROOT) : null;
                if (jl40.l(lowerCase, "masstransit-schedule")) {
                    if (fe01Var != null) {
                        String str3 = fe01Var.b;
                        String str4 = fe01Var.a;
                        if (str4 != null || str3 != null) {
                            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
                            if (str4 != null) {
                                buildUpon.appendQueryParameter("starting_stop_id", str4);
                            }
                            if (str3 != null) {
                                buildUpon.appendQueryParameter("destination_stop_id", str3);
                            }
                            str2 = buildUpon.build().toString();
                        }
                    }
                } else if (jl40.l(lowerCase, "masstransit-payment-ble")) {
                    MasstransitPaymentBleExitBehavior masstransitPaymentBleExitBehavior = MasstransitPaymentBleExitBehavior.DISMISS;
                    Uri parse = Uri.parse(str2);
                    if (parse.getQueryParameter("exit_behavior") == null) {
                        str2 = parse.buildUpon().appendQueryParameter("exit_behavior", masstransitPaymentBleExitBehavior.getValue()).build().toString();
                    }
                }
                return new is30(str2);
            }
        }
        return new js30(str);
    }
}
