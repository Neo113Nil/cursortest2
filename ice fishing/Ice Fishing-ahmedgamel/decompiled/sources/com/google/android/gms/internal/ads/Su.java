package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;
import q2.C4920z0;

/* loaded from: classes2.dex */
public interface Su {
    static Su e(Context context, int i, int i6, q2.c1 c1Var) {
        boolean matches;
        Su g4 = g(context, i);
        if (g4 instanceof Tu) {
            g4.c();
            g4.k(i6);
            g4.v(com.bumptech.glide.d.o(c1Var.f40102F));
            String str = c1Var.f40105I;
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.X9), str);
            }
            if (matches) {
                g4.b(str);
            }
        }
        return g4;
    }

    static Su g(Context context, int i) {
        boolean booleanValue;
        if (Wu.a()) {
            int i6 = i - 2;
            if (i6 == 20 || i6 == 21) {
                booleanValue = ((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue();
            } else if (i6 != 110) {
                switch (i6) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) AbstractC2633Ka.f25929d.r()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) AbstractC2633Ka.f25927b.r()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.fa)).booleanValue();
            }
            if (booleanValue) {
                return new Tu(context, i);
            }
        }
        return new C3374iv();
    }

    Su S(String str);

    Su a(boolean z3);

    Su b(String str);

    Su c();

    Su d(Throwable th);

    boolean f();

    Su h(C4920z0 c4920z0);

    Su i();

    Su j(C2570Gf c2570Gf);

    Su k(int i);

    boolean l();

    Su m(String str);

    Uu q();

    Su v(int i);
}
