package defpackage;

import android.util.Base64;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.media.ynison.service.w0;
import java.util.BitSet;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* loaded from: classes3.dex */
public class fwd implements ho4 {
    public final Function1 a;

    public fwd(String str, Function1 function1) {
        this.a = function1;
    }

    public static void b(s2i s2iVar, String str, String str2) {
        rwd rwdVar = s2i.d;
        BitSet bitSet = o2i.d;
        s2iVar.g(new l2i(str, rwdVar), str2);
    }

    public static void c(s2i s2iVar, w0 w0Var) {
        String str;
        byte[] byteArray = w0Var.toByteArray();
        if (byteArray != null) {
            String encodeToString = Base64.encodeToString(byteArray, 1);
            encodeToString.getClass();
            str = c.r(encodeToString, StringUtil.LF, "", false);
        } else {
            str = null;
        }
        b(s2iVar, "Ynison-Device-Info", str);
    }

    @Override // defpackage.ho4
    public final vn4 a(k3i k3iVar, ks3 ks3Var, mc4 mc4Var) {
        k3iVar.getClass();
        ks3Var.getClass();
        mc4Var.getClass();
        s2i s2iVar = (s2i) this.a.invoke(this);
        if (s2iVar == null) {
            vn4 g = mc4Var.g(k3iVar, ks3Var);
            g.getClass();
            return g;
        }
        vn4 g2 = mc4Var.g(k3iVar, ks3Var);
        g2.getClass();
        return new dwd(s2iVar, g2);
    }
}
