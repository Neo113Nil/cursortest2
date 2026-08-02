package ru.yandex.taxi.plus.sdk.badge.widget;

import defpackage.a60;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.jmd0;
import defpackage.jo11;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.p2c;
import defpackage.pep0;
import defpackage.q0d0;
import defpackage.q251;
import defpackage.q2c;
import defpackage.qn4;
import defpackage.qu;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.umt0;
import defpackage.v770;
import defpackage.y50;
import defpackage.zsa;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.cashback.router.real.typed.screen.TypedScreen;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.plus.repository.f;

/* loaded from: classes9.dex */
public final class a {
    public static final qu f = new qu(7);
    public final qn4 a;
    public final c0 b;
    public final f c;
    public final p2c d;
    public final tse e;

    public a(qn4 qn4Var, c0 c0Var, f fVar, q2c q2cVar, tse tseVar) {
        this.a = qn4Var;
        this.b = c0Var;
        this.c = fVar;
        this.d = q2cVar;
        this.e = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[LOOP:0: B:15:0x008b->B:17:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, List list, ContinuationImpl continuationImpl) {
        BadgeWidgetActionHandler$handleDeeplink$1 badgeWidgetActionHandler$handleDeeplink$1;
        int i;
        List list2;
        Iterator it;
        aVar.getClass();
        if (continuationImpl instanceof BadgeWidgetActionHandler$handleDeeplink$1) {
            badgeWidgetActionHandler$handleDeeplink$1 = (BadgeWidgetActionHandler$handleDeeplink$1) continuationImpl;
            int i2 = badgeWidgetActionHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                badgeWidgetActionHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = badgeWidgetActionHandler$handleDeeplink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = badgeWidgetActionHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (str == null || evu0.J(str)) {
                        return Boolean.FALSE;
                    }
                    c0 c0Var = aVar.b;
                    badgeWidgetActionHandler$handleDeeplink$1.L$0 = str;
                    badgeWidgetActionHandler$handleDeeplink$1.L$1 = list;
                    badgeWidgetActionHandler$handleDeeplink$1.label = 1;
                    obj = c0Var.c.b(badgeWidgetActionHandler$handleDeeplink$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) badgeWidgetActionHandler$handleDeeplink$1.L$1;
                    str = (String) badgeWidgetActionHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                }
                Map map = (Map) obj;
                list2 = list;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (!map.containsKey((String) it.next())) {
                            return Boolean.FALSE;
                        }
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    str = cvu0.v(str, (String) entry.getKey(), (String) entry.getValue(), false);
                }
                ((a60) ((y50) aVar.a.c.get())).c(str, v770.t);
                return Boolean.TRUE;
            }
        }
        badgeWidgetActionHandler$handleDeeplink$1 = new BadgeWidgetActionHandler$handleDeeplink$1(aVar, continuationImpl);
        Object obj3 = badgeWidgetActionHandler$handleDeeplink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = badgeWidgetActionHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj3;
        list2 = list;
        if (list2 instanceof Collection) {
        }
        it = list2.iterator();
        while (it.hasNext()) {
        }
        while (r6.hasNext()) {
        }
        ((a60) ((y50) aVar.a.c.get())).c(str, v770.t);
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, String str, List list, String str2, ContinuationImpl continuationImpl) {
        BadgeWidgetActionHandler$handleTypedScreen$1 badgeWidgetActionHandler$handleTypedScreen$1;
        int i;
        List list2;
        final qn4 qn4Var;
        String str3;
        aVar.getClass();
        if (continuationImpl instanceof BadgeWidgetActionHandler$handleTypedScreen$1) {
            badgeWidgetActionHandler$handleTypedScreen$1 = (BadgeWidgetActionHandler$handleTypedScreen$1) continuationImpl;
            int i2 = badgeWidgetActionHandler$handleTypedScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                badgeWidgetActionHandler$handleTypedScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = badgeWidgetActionHandler$handleTypedScreen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = badgeWidgetActionHandler$handleTypedScreen$1.label;
                boolean z = true;
                z = true;
                if (i != 0) {
                    b.b(obj);
                    if (str != null && !evu0.J(str) && (list2 = (List) aVar.c.a.getValue()) != null) {
                        List list3 = list2;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                if (((jmd0) it.next()).e.equals(str)) {
                                    qn4 qn4Var2 = aVar.a;
                                    badgeWidgetActionHandler$handleTypedScreen$1.L$0 = null;
                                    badgeWidgetActionHandler$handleTypedScreen$1.L$1 = null;
                                    badgeWidgetActionHandler$handleTypedScreen$1.L$2 = null;
                                    badgeWidgetActionHandler$handleTypedScreen$1.L$3 = null;
                                    badgeWidgetActionHandler$handleTypedScreen$1.L$4 = qn4Var2;
                                    badgeWidgetActionHandler$handleTypedScreen$1.L$5 = str;
                                    badgeWidgetActionHandler$handleTypedScreen$1.L$6 = "plus_shield";
                                    badgeWidgetActionHandler$handleTypedScreen$1.label = 1;
                                    Object c = aVar.c(str2, list, badgeWidgetActionHandler$handleTypedScreen$1);
                                    if (c == obj2) {
                                        return obj2;
                                    }
                                    qn4Var = qn4Var2;
                                    obj = c;
                                    str3 = "plus_shield";
                                }
                            }
                        }
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = (String) badgeWidgetActionHandler$handleTypedScreen$1.L$6;
                str = (String) badgeWidgetActionHandler$handleTypedScreen$1.L$5;
                qn4Var = (qn4) badgeWidgetActionHandler$handleTypedScreen$1.L$4;
                b.b(obj);
                String str4 = (String) obj;
                umt0 umt0Var = qn4Var.d;
                oep0 oep0Var = qn4Var.e;
                int i3 = 10;
                if (jl40.l(str, "plus_burns")) {
                    final int i4 = 0;
                    if (jl40.l(str, "catching_up_cashback")) {
                        ((pep0) oep0Var).f(new zsa(z ? 1 : 0, umt0Var, new tls() { // from class: on4
                            @Override // defpackage.tls
                            public final Object invoke(Object obj3) {
                                int i5 = i4;
                                zy11 zy11Var = zy11.a;
                                qn4 qn4Var3 = qn4Var;
                                qxx0 qxx0Var = (qxx0) obj3;
                                switch (i5) {
                                    case 0:
                                        qn4Var3.a.a(qxx0Var);
                                        break;
                                    default:
                                        qn4Var3.a.a(qxx0Var);
                                        break;
                                }
                                return zy11Var;
                            }
                        }, new q251(i3)), new jo11(TypedScreen.CATCHING_UP_CASHBACK, str3, str4), hxx.a);
                    } else {
                        z = false;
                    }
                } else {
                    final int i5 = z ? 1 : 0;
                    ((pep0) oep0Var).f(new zsa(z ? 1 : 0, umt0Var, new tls() { // from class: on4
                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            int i52 = i5;
                            zy11 zy11Var = zy11.a;
                            qn4 qn4Var3 = qn4Var;
                            qxx0 qxx0Var = (qxx0) obj3;
                            switch (i52) {
                                case 0:
                                    qn4Var3.a.a(qxx0Var);
                                    break;
                                default:
                                    qn4Var3.a.a(qxx0Var);
                                    break;
                            }
                            return zy11Var;
                        }
                    }, new q251(i3)), new jo11(TypedScreen.PLUS_BURNS, str3, null), hxx.a);
                }
                return Boolean.valueOf(z);
            }
        }
        badgeWidgetActionHandler$handleTypedScreen$1 = new BadgeWidgetActionHandler$handleTypedScreen$1(aVar, continuationImpl);
        Object obj3 = badgeWidgetActionHandler$handleTypedScreen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = badgeWidgetActionHandler$handleTypedScreen$1.label;
        boolean z2 = true;
        z2 = true;
        if (i != 0) {
        }
        String str42 = (String) obj3;
        umt0 umt0Var2 = qn4Var.d;
        oep0 oep0Var2 = qn4Var.e;
        int i32 = 10;
        if (jl40.l(str, "plus_burns")) {
        }
        return Boolean.valueOf(z2);
    }

    public static void d(a aVar, q0d0 q0d0Var) {
        tje.N(aVar.e, null, null, new BadgeWidgetActionHandler$openAction$1(q0d0Var, aVar, f, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[LOOP:0: B:15:0x0086->B:17:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        BadgeWidgetActionHandler$mapToScreenContext$1 badgeWidgetActionHandler$mapToScreenContext$1;
        int i;
        List list2;
        Iterator it;
        if (continuationImpl instanceof BadgeWidgetActionHandler$mapToScreenContext$1) {
            badgeWidgetActionHandler$mapToScreenContext$1 = (BadgeWidgetActionHandler$mapToScreenContext$1) continuationImpl;
            int i2 = badgeWidgetActionHandler$mapToScreenContext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                badgeWidgetActionHandler$mapToScreenContext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = badgeWidgetActionHandler$mapToScreenContext$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = badgeWidgetActionHandler$mapToScreenContext$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        badgeWidgetActionHandler$mapToScreenContext$1.L$0 = str;
                        badgeWidgetActionHandler$mapToScreenContext$1.L$1 = list;
                        badgeWidgetActionHandler$mapToScreenContext$1.label = 1;
                        obj = this.b.c.b(badgeWidgetActionHandler$mapToScreenContext$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) badgeWidgetActionHandler$mapToScreenContext$1.L$1;
                str = (String) badgeWidgetActionHandler$mapToScreenContext$1.L$0;
                b.b(obj);
                Map map = (Map) obj;
                list2 = list;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (!map.containsKey((String) it.next())) {
                            return null;
                        }
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    str = cvu0.v(str, (String) entry.getKey(), (String) entry.getValue(), false);
                }
                return str;
            }
        }
        badgeWidgetActionHandler$mapToScreenContext$1 = new BadgeWidgetActionHandler$mapToScreenContext$1(this, continuationImpl);
        Object obj3 = badgeWidgetActionHandler$mapToScreenContext$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = badgeWidgetActionHandler$mapToScreenContext$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj3;
        list2 = list;
        if (list2 instanceof Collection) {
        }
        it = list2.iterator();
        while (it.hasNext()) {
        }
        while (r5.hasNext()) {
        }
        return str;
    }
}
