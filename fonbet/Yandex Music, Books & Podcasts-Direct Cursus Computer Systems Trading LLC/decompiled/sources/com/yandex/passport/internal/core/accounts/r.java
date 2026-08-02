package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.ui.bouncer.model.l2;
import com.yandex.passport.internal.ui.bouncer.model.m2;
import com.yandex.passport.internal.ui.bouncer.model.n2;
import defpackage.gl5;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class r implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i) {
        this.a = i;
    }

    public static int a(l2 l2Var, l2 l2Var2) {
        String str;
        String str2;
        String str3;
        l2Var.getClass();
        l2Var2.getClass();
        List list = l2Var2.b;
        com.yandex.passport.internal.l lVar = l2Var2.a;
        Integer valueOf = Integer.valueOf(list.size());
        List list2 = l2Var.b;
        com.yandex.passport.internal.l lVar2 = l2Var.a;
        int b = gl5.b(valueOf, Integer.valueOf(list2.size()));
        if (b != 0) {
            return b;
        }
        com.yandex.passport.common.core.g gVar = lVar.e;
        com.yandex.passport.common.core.g gVar2 = lVar.e;
        Boolean valueOf2 = Boolean.valueOf(gVar.p);
        com.yandex.passport.common.core.g gVar3 = lVar2.e;
        com.yandex.passport.common.core.g gVar4 = lVar2.e;
        int b2 = gl5.b(valueOf2, Boolean.valueOf(gVar3.p));
        if (b2 != 0) {
            return b2;
        }
        int b3 = gl5.b(Boolean.valueOf(gVar2.h == 1), Boolean.valueOf(gVar4.h == 1));
        if (b3 != 0) {
            return b3;
        }
        int b4 = gl5.b(Boolean.valueOf(lVar2.o()), Boolean.valueOf(lVar.o()));
        if (b4 != 0) {
            return b4;
        }
        String i = lVar2.i();
        Locale locale = Locale.ROOT;
        String lowerCase = i.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = lVar.i().toLowerCase(locale);
        lowerCase2.getClass();
        int b5 = gl5.b(lowerCase, lowerCase2);
        if (b5 != 0) {
            return b5;
        }
        String j = lVar2.j();
        String str4 = null;
        if (j != null) {
            str = j.toLowerCase(locale);
            str.getClass();
        } else {
            str = null;
        }
        String j2 = lVar.j();
        if (j2 != null) {
            str2 = j2.toLowerCase(locale);
            str2.getClass();
        } else {
            str2 = null;
        }
        int b6 = gl5.b(str, str2);
        if (b6 != 0) {
            return b6;
        }
        String str5 = gVar4.v;
        if (str5 != null) {
            str3 = str5.toLowerCase(locale);
            str3.getClass();
        } else {
            str3 = null;
        }
        String str6 = gVar2.v;
        if (str6 != null) {
            str4 = str6.toLowerCase(locale);
            str4.getClass();
        }
        return gl5.b(str3, str4);
    }

    public static int b(m2 m2Var, m2 m2Var2) {
        String str;
        String str2;
        String str3;
        m2Var.getClass();
        m2Var2.getClass();
        int b = gl5.b(Integer.valueOf(m2Var2.i.size()), Integer.valueOf(m2Var.i.size()));
        if (b != 0) {
            return b;
        }
        com.yandex.passport.internal.entities.a aVar = m2Var2.g;
        com.yandex.passport.internal.entities.a aVar2 = com.yandex.passport.internal.entities.a.a;
        int b2 = gl5.b(Boolean.valueOf(aVar == aVar2), Boolean.valueOf(m2Var.g == aVar2));
        if (b2 != 0) {
            return b2;
        }
        String str4 = m2Var.d;
        String str5 = null;
        if (str4 != null) {
            str = str4.toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = null;
        }
        String str6 = m2Var2.d;
        if (str6 != null) {
            str2 = str6.toLowerCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = null;
        }
        int b3 = gl5.b(str, str2);
        if (b3 != 0) {
            return b3;
        }
        String str7 = m2Var.c;
        if (str7 != null) {
            str3 = str7.toLowerCase(Locale.ROOT);
            str3.getClass();
        } else {
            str3 = null;
        }
        String str8 = m2Var2.c;
        if (str8 != null) {
            str5 = str8.toLowerCase(Locale.ROOT);
            str5.getClass();
        }
        return gl5.b(str3, str5);
    }

    public static int c(l2 l2Var, m2 m2Var) {
        String str;
        String str2;
        String str3;
        Integer valueOf = Integer.valueOf(m2Var.i.size());
        List list = l2Var.b;
        com.yandex.passport.internal.l lVar = l2Var.a;
        int b = gl5.b(valueOf, Integer.valueOf(list.size()));
        if (b != 0) {
            return b;
        }
        Boolean valueOf2 = Boolean.valueOf(m2Var.g == com.yandex.passport.internal.entities.a.a);
        com.yandex.passport.common.core.g gVar = lVar.e;
        com.yandex.passport.common.core.g gVar2 = lVar.e;
        int b2 = gl5.b(valueOf2, Boolean.valueOf(gVar.h == 1));
        if (b2 != 0) {
            return b2;
        }
        String str4 = gVar2.f;
        String str5 = null;
        if (str4 != null) {
            str = str4.toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = null;
        }
        String str6 = m2Var.d;
        if (str6 != null) {
            str2 = str6.toLowerCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = null;
        }
        int b3 = gl5.b(str, str2);
        if (b3 != 0) {
            return b3;
        }
        String str7 = gVar2.v;
        if (str7 != null) {
            str3 = str7.toLowerCase(Locale.ROOT);
            str3.getClass();
        } else {
            str3 = null;
        }
        String str8 = m2Var.c;
        if (str8 != null) {
            str5 = str8.toLowerCase(Locale.ROOT);
            str5.getClass();
        }
        return gl5.b(str3, str5);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return gl5.b(new com.yandex.passport.common.time.a(((com.yandex.passport.internal.l) obj).e.c), new com.yandex.passport.common.time.a(((com.yandex.passport.internal.l) obj2).e.c));
            case 1:
                return gl5.b(Integer.valueOf(((com.yandex.passport.internal.sso.d) obj2).e), Integer.valueOf(((com.yandex.passport.internal.sso.d) obj).e));
            case 2:
                n2 n2Var = (n2) obj;
                n2 n2Var2 = (n2) obj2;
                n2Var.getClass();
                n2Var2.getClass();
                boolean z = n2Var instanceof l2;
                if (z && (n2Var2 instanceof l2)) {
                    return a((l2) n2Var, (l2) n2Var2);
                }
                boolean z2 = n2Var instanceof m2;
                return (z2 && (n2Var2 instanceof m2)) ? b((m2) n2Var, (m2) n2Var2) : (z && (n2Var2 instanceof m2)) ? c((l2) n2Var, (m2) n2Var2) : (z2 && (n2Var2 instanceof l2)) ? c((l2) n2Var2, (m2) n2Var) * (-1) : gl5.b(Boolean.valueOf(n2Var2 instanceof l2), Boolean.valueOf(z));
            case 3:
                return a((l2) obj, (l2) obj2);
            case 4:
                return b((m2) obj, (m2) obj2);
            case 5:
                return gl5.b(Integer.valueOf(((com.yandex.plus.acquisition.sdk.pay.common.api.k) obj).a), Integer.valueOf(((com.yandex.plus.acquisition.sdk.pay.common.api.k) obj2).a));
            default:
                return gl5.b(Integer.valueOf(((Number) ((Pair) obj).b).intValue()), Integer.valueOf(((Number) ((Pair) obj2).b).intValue()));
        }
    }
}
