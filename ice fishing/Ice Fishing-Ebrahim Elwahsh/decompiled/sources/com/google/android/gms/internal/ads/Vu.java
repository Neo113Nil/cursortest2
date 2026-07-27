package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;
import q2.C4927z0;

/* loaded from: classes2.dex */
public interface Vu {
    static Vu e(Context context, int i, int i4, q2.d1 d1Var) {
        boolean matches;
        Vu f6 = f(context, i);
        if (f6 instanceof Wu) {
            f6.a();
            f6.l(i4);
            f6.s(K3.b.K(d1Var.f40013F));
            String str = d1Var.f40016I;
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.X9), str);
            }
            if (matches) {
                f6.C(str);
            }
        }
        return f6;
    }

    static Vu f(Context context, int i) {
        boolean booleanValue;
        if (Zu.a()) {
            int i4 = i - 2;
            if (i4 == 20 || i4 == 21) {
                booleanValue = ((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue();
            } else if (i4 != 110) {
                switch (i4) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) AbstractC2547Fa.f24967d.r()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) AbstractC2547Fa.f24965b.r()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.fa)).booleanValue();
            }
            if (booleanValue) {
                return new Wu(context, i);
            }
        }
        return new C3549lv();
    }

    Vu C(String str);

    Vu a();

    Vu b(boolean z8);

    Vu c(Throwable th);

    boolean d();

    Vu g(C4927z0 c4927z0);

    Vu h(String str);

    Vu i();

    Vu j(C2518Df c2518Df);

    boolean k();

    Vu l(int i);

    Xu m();

    Vu p0(String str);

    Vu s(int i);
}
