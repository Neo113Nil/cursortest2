package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes2.dex */
public final class stv extends yr31 {
    public final etb b;
    public final r0 c;

    public stv(jln jlnVar, etb etbVar) {
        this.b = etbVar;
        ebd0 ebd0Var = (ebd0) jlnVar.b;
        String valueOf = String.valueOf(ebd0Var.a);
        String valueOf2 = String.valueOf(ebd0Var.b);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!cvu0.x(str2, str, false)) {
            StringBuilder sb = new StringBuilder();
            if (str.length() > 0) {
                str = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
            }
            sb.append(str);
            sb.append(HexString.CHAR_SPACE);
            sb.append(str2);
            str2 = sb.toString();
        } else if (str2.length() > 0) {
            str2 = ((Object) String.valueOf(str2.charAt(0)).toUpperCase(Locale.ROOT)) + str2.substring(1);
        }
        String str3 = str2;
        String str4 = Build.VERSION.RELEASE;
        this.c = bvf0.c(new qtv(new evg(valueOf, valueOf2, str3, ebd0Var.c, ebd0Var.d, ebd0Var.e, ebd0Var.f)));
    }
}
