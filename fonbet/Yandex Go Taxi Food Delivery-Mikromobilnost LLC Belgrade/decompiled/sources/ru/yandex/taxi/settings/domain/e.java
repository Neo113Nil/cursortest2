package ru.yandex.taxi.settings.domain;

import android.app.NotificationChannel;
import defpackage.a1g0;
import defpackage.bdr0;
import defpackage.cbr0;
import defpackage.d6z;
import defpackage.g4g0;
import defpackage.il10;
import defpackage.j2g0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.kgx;
import defpackage.l4g0;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.nk10;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.ol10;
import defpackage.p3g0;
import defpackage.qbr0;
import defpackage.rl10;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sme0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u3g0;
import defpackage.ul10;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.x5r0;
import defpackage.y4g0;
import defpackage.y5r0;
import defpackage.z0g0;
import defpackage.z0q0;
import defpackage.z4g0;
import defpackage.z5r0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionItemActionType;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionStyle;

/* loaded from: classes6.dex */
public final class e {
    public final y4g0 a;
    public final cbr0 b;
    public final ru.yandex.taxi.settings.domain.factory.a c;
    public final j2g0 d;
    public final l4g0 e;
    public final o8g0 f;

    public e(y4g0 y4g0Var, cbr0 cbr0Var, ru.yandex.taxi.settings.domain.factory.a aVar, j2g0 j2g0Var, l4g0 l4g0Var, o8g0 o8g0Var) {
        this.a = y4g0Var;
        this.b = cbr0Var;
        this.c = aVar;
        this.d = j2g0Var;
        this.e = l4g0Var;
        this.f = o8g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PushSettingsModelInteractor$getStoredPushSettings$1 pushSettingsModelInteractor$getStoredPushSettings$1;
        int i;
        if (continuationImpl instanceof PushSettingsModelInteractor$getStoredPushSettings$1) {
            pushSettingsModelInteractor$getStoredPushSettings$1 = (PushSettingsModelInteractor$getStoredPushSettings$1) continuationImpl;
            int i2 = pushSettingsModelInteractor$getStoredPushSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushSettingsModelInteractor$getStoredPushSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushSettingsModelInteractor$getStoredPushSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSettingsModelInteractor$getStoredPushSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pushSettingsModelInteractor$getStoredPushSettings$1.L$0 = this;
                    pushSettingsModelInteractor$getStoredPushSettings$1.label = 1;
                    l4g0 l4g0Var = this.e;
                    l4g0Var.c.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new PushSettingsResponseInteractor$getStoredSettingsResponse$2(l4g0Var, null), pushSettingsModelInteractor$getStoredPushSettings$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (e) pushSettingsModelInteractor$getStoredPushSettings$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.b((bdr0) obj, false);
            }
        }
        pushSettingsModelInteractor$getStoredPushSettings$1 = new PushSettingsModelInteractor$getStoredPushSettings$1(this, continuationImpl);
        Object obj2 = pushSettingsModelInteractor$getStoredPushSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSettingsModelInteractor$getStoredPushSettings$1.label;
        if (i != 0) {
        }
        return this.b((bdr0) obj2, false);
    }

    public final u3g0 b(bdr0 bdr0Var, boolean z) {
        String str;
        String str2;
        String str3;
        if (bdr0Var != null) {
            nk10 nk10Var = bdr0Var.a;
            if (!nk10Var.a.isEmpty()) {
                cbr0 cbr0Var = this.b;
                cbr0Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = nk10Var.a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    z0q0 z0q0Var = (z0q0) next;
                    ArrayList arrayList3 = new ArrayList();
                    List list = z0q0Var.c;
                    SectionStyle sectionStyle = z0q0Var.b;
                    String str4 = z0q0Var.a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : list) {
                        ol10 ol10Var = (ol10) obj;
                        MenuItemElementType menuItemElementType = ol10Var.a.a;
                        MenuItemElementType menuItemElementType2 = MenuItemElementType.UNKNOWN;
                        if (menuItemElementType != menuItemElementType2 && ol10Var.b.a != menuItemElementType2) {
                            il10 il10Var = ol10Var.c;
                            if (il10Var.a != SectionItemActionType.NONE && il10Var.b.a.length() > 0 && (str3 = ol10Var.a.b.a) != null && str3.length() != 0) {
                                arrayList4.add(obj);
                            }
                        }
                    }
                    Iterator it2 = arrayList4.iterator();
                    int i3 = 0;
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        ol10 ol10Var2 = (ol10) next2;
                        il10 il10Var2 = ol10Var2.c;
                        rl10 rl10Var = ol10Var2.a;
                        String str5 = il10Var2.b.a;
                        Iterator it3 = it;
                        String str6 = rl10Var.b.a;
                        if (str6 == null) {
                            str6 = "";
                        }
                        z0g0 z0g0Var = new z0g0(str5, str6);
                        boolean z2 = sectionStyle == SectionStyle.UNKNOWN || str4 == null || str4.length() == 0 ? !(i3 == 0 && i == 0) : i3 != 0;
                        arrayList2.add(z0g0Var);
                        k7x0 k7x0Var = cbr0Var.b;
                        boolean z3 = !cbr0Var.a.a.a.a().contains(str5);
                        rl10 rl10Var2 = ol10Var2.b;
                        ul10 ul10Var = rl10Var.b;
                        ul10 ul10Var2 = rl10Var.c;
                        String str7 = rl10Var.d;
                        Iterator it4 = it2;
                        if (str7 != null) {
                            ((m7x0) k7x0Var).a(str7);
                            str = str7;
                        } else {
                            str = null;
                        }
                        MenuItemElementType menuItemElementType3 = rl10Var.a;
                        ul10 ul10Var3 = rl10Var2.b;
                        ul10 ul10Var4 = rl10Var2.c;
                        String str8 = rl10Var2.d;
                        if (str8 != null) {
                            ((m7x0) k7x0Var).a(str8);
                            str2 = str8;
                        } else {
                            str2 = null;
                        }
                        MenuItemElementType menuItemElementType4 = rl10Var2.a;
                        Boolean bool = ol10Var2.d;
                        if (bool != null) {
                            z3 = bool.booleanValue();
                        }
                        arrayList3.add(new y5r0(ul10Var, ul10Var2, str, menuItemElementType3, ul10Var3, ul10Var4, str2, menuItemElementType4, z3, z0g0Var, z2));
                        it = it3;
                        i3 = i4;
                        it2 = it4;
                    }
                    Iterator it5 = it;
                    if (!arrayList3.isEmpty()) {
                        if (sectionStyle != SectionStyle.UNKNOWN && str4 != null && str4.length() != 0) {
                            arrayList.add(new x5r0(str4));
                        }
                        arrayList.addAll(arrayList3);
                    }
                    it = it5;
                    i = i2;
                }
                return new u3g0(arrayList, arrayList2, z);
            }
        }
        ny61.g("Received empty settings response");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (r2 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r2 == r4) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb A[Catch: IllegalArgumentException -> 0x0115, TryCatch #0 {IllegalArgumentException -> 0x0115, blocks: (B:14:0x0041, B:15:0x00e9, B:16:0x00f5, B:18:0x00fb, B:21:0x0105, B:31:0x0058, B:32:0x00bf, B:37:0x00ac, B:41:0x00c2, B:46:0x00e3), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, Set set, long j, ContinuationImpl continuationImpl) {
        PushSettingsModelInteractor$performPushSettingsLoading$1 pushSettingsModelInteractor$performPushSettingsLoading$1;
        int i;
        l4g0 l4g0Var;
        long j2;
        bdr0 bdr0Var;
        boolean z2 = z;
        try {
            if (continuationImpl instanceof PushSettingsModelInteractor$performPushSettingsLoading$1) {
                pushSettingsModelInteractor$performPushSettingsLoading$1 = (PushSettingsModelInteractor$performPushSettingsLoading$1) continuationImpl;
                int i2 = pushSettingsModelInteractor$performPushSettingsLoading$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pushSettingsModelInteractor$performPushSettingsLoading$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pushSettingsModelInteractor$performPushSettingsLoading$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pushSettingsModelInteractor$performPushSettingsLoading$1.label;
                    l4g0Var = this.e;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pushSettingsModelInteractor$performPushSettingsLoading$1.L$0 = null;
                        pushSettingsModelInteractor$performPushSettingsLoading$1.Z$0 = z2;
                        j2 = j;
                        pushSettingsModelInteractor$performPushSettingsLoading$1.J$0 = j2;
                        pushSettingsModelInteractor$performPushSettingsLoading$1.label = 1;
                        obj = this.c.a(z2, set, pushSettingsModelInteractor$performPushSettingsLoading$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    kotlin.b.b(obj);
                                    return (u3g0) obj;
                                }
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                bdr0Var = (bdr0) pushSettingsModelInteractor$performPushSettingsLoading$1.L$2;
                                kotlin.b.b(obj);
                                u3g0 b = b(bdr0Var, true);
                                for (z5r0 z5r0Var : b.a) {
                                    if (z5r0Var instanceof y5r0) {
                                        this.a.a(((y5r0) z5r0Var).j, ((y5r0) z5r0Var).i);
                                    }
                                }
                                return b;
                            }
                            j2 = pushSettingsModelInteractor$performPushSettingsLoading$1.J$0;
                            z2 = pushSettingsModelInteractor$performPushSettingsLoading$1.Z$0;
                            kotlin.b.b(obj);
                            bdr0 bdr0Var2 = (bdr0) obj;
                            if (bdr0Var2 == null) {
                                pushSettingsModelInteractor$performPushSettingsLoading$1.L$0 = null;
                                pushSettingsModelInteractor$performPushSettingsLoading$1.L$1 = null;
                                pushSettingsModelInteractor$performPushSettingsLoading$1.L$2 = null;
                                pushSettingsModelInteractor$performPushSettingsLoading$1.Z$0 = z2;
                                pushSettingsModelInteractor$performPushSettingsLoading$1.J$0 = j2;
                                pushSettingsModelInteractor$performPushSettingsLoading$1.label = 3;
                                obj = a(pushSettingsModelInteractor$performPushSettingsLoading$1);
                                if (obj == obj2) {
                                }
                                return (u3g0) obj;
                            }
                            pushSettingsModelInteractor$performPushSettingsLoading$1.L$0 = null;
                            pushSettingsModelInteractor$performPushSettingsLoading$1.L$1 = null;
                            pushSettingsModelInteractor$performPushSettingsLoading$1.L$2 = bdr0Var2;
                            pushSettingsModelInteractor$performPushSettingsLoading$1.Z$0 = z2;
                            pushSettingsModelInteractor$performPushSettingsLoading$1.J$0 = j2;
                            pushSettingsModelInteractor$performPushSettingsLoading$1.label = 4;
                            l4g0Var.c.getClass();
                            sjh sjhVar = uyj.a;
                            Object k0 = tje.k0(mdh.b, new PushSettingsResponseInteractor$storeSettingsResponse$2(l4g0Var, bdr0Var2, null), pushSettingsModelInteractor$performPushSettingsLoading$1);
                            if (k0 != obj2) {
                                k0 = zy11.a;
                            }
                            if (k0 != obj2) {
                                bdr0Var = bdr0Var2;
                                u3g0 b2 = b(bdr0Var, true);
                                while (r2.hasNext()) {
                                }
                                return b2;
                            }
                            return obj2;
                        }
                        j2 = pushSettingsModelInteractor$performPushSettingsLoading$1.J$0;
                        z2 = pushSettingsModelInteractor$performPushSettingsLoading$1.Z$0;
                        kotlin.b.b(obj);
                    }
                    PushSettingsModelInteractor$performPushSettingsLoading$response$1 pushSettingsModelInteractor$performPushSettingsLoading$response$1 = new PushSettingsModelInteractor$performPushSettingsLoading$response$1(this, (qbr0) obj, null);
                    pushSettingsModelInteractor$performPushSettingsLoading$1.L$0 = null;
                    pushSettingsModelInteractor$performPushSettingsLoading$1.L$1 = null;
                    pushSettingsModelInteractor$performPushSettingsLoading$1.Z$0 = z2;
                    pushSettingsModelInteractor$performPushSettingsLoading$1.J$0 = j2;
                    pushSettingsModelInteractor$performPushSettingsLoading$1.label = 2;
                    obj = kotlinx.coroutines.a.w(j2, pushSettingsModelInteractor$performPushSettingsLoading$response$1, pushSettingsModelInteractor$performPushSettingsLoading$1);
                }
            }
            if (i != 0) {
            }
            PushSettingsModelInteractor$performPushSettingsLoading$response$1 pushSettingsModelInteractor$performPushSettingsLoading$response$12 = new PushSettingsModelInteractor$performPushSettingsLoading$response$1(this, (qbr0) obj, null);
            pushSettingsModelInteractor$performPushSettingsLoading$1.L$0 = null;
            pushSettingsModelInteractor$performPushSettingsLoading$1.L$1 = null;
            pushSettingsModelInteractor$performPushSettingsLoading$1.Z$0 = z2;
            pushSettingsModelInteractor$performPushSettingsLoading$1.J$0 = j2;
            pushSettingsModelInteractor$performPushSettingsLoading$1.label = 2;
            obj = kotlinx.coroutines.a.w(j2, pushSettingsModelInteractor$performPushSettingsLoading$response$12, pushSettingsModelInteractor$performPushSettingsLoading$1);
        } catch (IllegalArgumentException unused) {
            jst.e.getClass();
            p3g0 a = l4g0Var.d.a();
            p3g0.a aVar = a.d;
            if (!a.b || aVar == null) {
                EmptyList emptyList = EmptyList.a;
                return new u3g0(emptyList, emptyList, false);
            }
            String str = aVar.b;
            String Y = d6z.Y(a, aVar.a);
            return new u3g0(Collections.singletonList(new y5r0(new ul10(Y), new ul10(null), null, MenuItemElementType.DEFAULT, new ul10(null), new ul10(null), null, MenuItemElementType.SWITCH, false, new z0g0(str, Y), false)), Collections.singletonList(new z0g0(str, Y)), false);
        }
        pushSettingsModelInteractor$performPushSettingsLoading$1 = new PushSettingsModelInteractor$performPushSettingsLoading$1(this, continuationImpl);
        Object obj3 = pushSettingsModelInteractor$performPushSettingsLoading$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSettingsModelInteractor$performPushSettingsLoading$1.label;
        l4g0Var = this.e;
    }

    public final void d(u3g0 u3g0Var) {
        List list = u3g0Var.b;
        a1g0 a1g0Var = this.d.a;
        List<NotificationChannel> notificationChannels = a1g0Var.a.m.b.getNotificationChannels();
        ArrayList arrayList = new ArrayList(tcc.n(notificationChannels, 10));
        Iterator<T> it = notificationChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(((NotificationChannel) it.next()).getId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            z0g0 z0g0Var = (z0g0) obj;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (jl40.l((String) it2.next(), z0g0Var.a)) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            z0g0 z0g0Var2 = (z0g0) it3.next();
            a1g0Var.a.g(z0g0Var2.a, 3, z0g0Var2.b, null, true);
        }
        o8g0 o8g0Var = this.f;
        z4g0 z4g0Var = (z4g0) o8g0Var.b;
        List<z0g0> list2 = list;
        ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((z0g0) it4.next()).a);
        }
        g4g0 g4g0Var = z4g0Var.a;
        g4g0 g4g0Var2 = z4g0Var.a;
        LinkedHashSet h = v4r0.h(g4g0Var.b(), g4g0Var.a());
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : h) {
            if (!arrayList3.contains((String) obj2)) {
                arrayList4.add(obj2);
            }
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            String str = (String) it5.next();
            ((a1g0) o8g0Var.a).a.m.c(str);
            Set M0 = kotlin.collections.a.M0(g4g0Var2.a());
            if (M0.remove(str)) {
                g4g0Var2.b.setValue(g4g0Var2, g4g0.d[1], M0);
            } else {
                Set M02 = kotlin.collections.a.M0(g4g0Var2.b());
                M02.remove(str);
                g4g0Var2.a.setValue(g4g0Var2, g4g0.d[0], M02);
            }
        }
        y4g0 y4g0Var = this.a;
        z4g0 z4g0Var2 = y4g0Var.a;
        Set M03 = kotlin.collections.a.M0(y4g0Var.b());
        Set M04 = kotlin.collections.a.M0(y4g0Var.a.a.a());
        for (z0g0 z0g0Var3 : list2) {
            String str2 = z0g0Var3.a;
            a1g0 a1g0Var2 = y4g0Var.b.a;
            a1g0Var2.getClass();
            if (!a1g0Var2.a(z0g0Var3.a())) {
                M04.add(str2);
                M03.remove(str2);
            } else if (!M04.contains(str2)) {
                M03.add(str2);
                M04.remove(str2);
            }
        }
        g4g0 g4g0Var3 = z4g0Var2.a;
        sme0 sme0Var = g4g0Var3.a;
        kgx[] kgxVarArr = g4g0.d;
        sme0Var.setValue(g4g0Var3, kgxVarArr[0], M03);
        g4g0 g4g0Var4 = z4g0Var2.a;
        g4g0Var4.b.setValue(g4g0Var4, kgxVarArr[1], M04);
    }
}
