package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;
import s2.C4969z0;

/* loaded from: classes2.dex */
public interface Su {
    static Su e(Context context, int i) {
        boolean booleanValue;
        if (Wu.a()) {
            int i4 = i - 2;
            if (i4 == 20 || i4 == 21) {
                booleanValue = ((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue();
            } else if (i4 != 110) {
                switch (i4) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) AbstractC2653Ka.f26707d.r()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) AbstractC2653Ka.f26705b.r()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.fa)).booleanValue();
            }
            if (booleanValue) {
                return new Tu(context, i);
            }
        }
        return new C3397iv();
    }

    static Su j(Context context, int i, int i4, s2.c1 c1Var) {
        boolean matches;
        Su e9 = e(context, i);
        if (e9 instanceof Tu) {
            e9.c();
            e9.k(i4);
            e9.v(t8.g.w(c1Var.f40401F));
            String str = c1Var.f40404I;
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.X9), str);
            }
            if (matches) {
                e9.b(str);
            }
        }
        return e9;
    }

    Su S(String str);

    Su a(boolean z6);

    Su b(String str);

    Su c();

    Su d(Throwable th);

    boolean f();

    Su g(C2590Gf c2590Gf);

    Su h(C4969z0 c4969z0);

    Su i();

    Su k(int i);

    boolean l();

    Su m(String str);

    Uu q();

    Su v(int i);
}
