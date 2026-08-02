package defpackage;

import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdApplicationForm;
import java.util.Date;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class ya21 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SimplifiedIdApplicationForm a(ja21 ja21Var) {
        String str;
        String str2 = ja21Var.a;
        String str3 = !evu0.J(str2) ? str2 : null;
        String str4 = ja21Var.b;
        String str5 = !evu0.J(str4) ? str4 : null;
        String str6 = ja21Var.c;
        String str7 = !evu0.J(str6) ? str6 : null;
        Date b = vqg.b(ja21Var.e, YbDateFormat.SHORT_USER_DATE_ONLY);
        if (b != null) {
            String a = vqg.a(b, YbDateFormat.SHORT_SERVER_DATE_ONLY);
            if (!evu0.J(a)) {
                str = a;
                String str8 = ja21Var.d;
                Regex regex = gtu0.a;
                String j = regex.j(str8, "");
                String str9 = evu0.J(j) ? j : null;
                String j2 = regex.j(ja21Var.f, "");
                return new SimplifiedIdApplicationForm(str3, str5, str7, str9, str, evu0.J(j2) ? j2 : null);
            }
        }
        str = null;
        String str82 = ja21Var.d;
        Regex regex2 = gtu0.a;
        String j3 = regex2.j(str82, "");
        if (evu0.J(j3)) {
        }
        String j22 = regex2.j(ja21Var.f, "");
        return new SimplifiedIdApplicationForm(str3, str5, str7, str9, str, evu0.J(j22) ? j22 : null);
    }
}
