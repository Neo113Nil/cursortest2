package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class rob1 {
    public static final void a(nl30 nl30Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1377090648);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(nl30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            wg6 a = b.a(false, 150.0f, null, false, null, null, null, null, btsVar2, 24960, 0, 8171);
            ll30 ll30Var = new ll30(nl30Var.j, nl30Var.h);
            c.a(null, a, qab1.c(a, new up2(zp2.c), null, btsVar2, 0, 4), false, false, null, null, wwg.S(-316495334, true, new nfj(tlsVar, 23, ll30Var), btsVar2), null, null, null, wwg.S(1834467400, true, new dhj0(8, nl30Var, tlsVar, ll30Var), btsVar2), btsVar2, 12582912, 48, 1913);
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rk30(nl30Var, tlsVar, i, 1);
        }
    }

    public static String b(char c, int i, String str) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length > 0) {
            if (length <= 8192) {
                return d(c, length).concat(str);
            }
            String valueOf = String.valueOf(c);
            if (TextUtils.isEmpty(valueOf)) {
                valueOf = " ";
            }
            int length2 = valueOf.length();
            int length3 = i - str.length();
            if (length3 > 0) {
                if (length2 == 1 && length3 <= 8192) {
                    return b(valueOf.charAt(0), i, str);
                }
                if (length3 == length2) {
                    return valueOf.concat(str);
                }
                if (length3 < length2) {
                    return valueOf.substring(0, length3).concat(str);
                }
                char[] cArr = new char[length3];
                char[] charArray = valueOf.toCharArray();
                for (int i2 = 0; i2 < length3; i2++) {
                    cArr[i2] = charArray[i2 % length2];
                }
                return new String(cArr).concat(str);
            }
        }
        return str;
    }

    public static String c(int i, long j) {
        return b(MoneyInputEditView.DEFAULT_VALUE, i, Long.toString(j));
    }

    public static String d(char c, int i) {
        if (i <= 0) {
            return " ";
        }
        char[] cArr = new char[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    public static final ArrayList e(Context context, List list) {
        List<ii60> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ii60 ii60Var : list2) {
            String str = ii60Var.a;
            arrayList.add(ii60.a(ii60Var, str != null ? context.getString(nyh0.notification_thread_message_prefix, str) : null, null, 8190));
        }
        return arrayList;
    }
}
