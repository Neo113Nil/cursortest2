package ru.yandex.taxi.summary.personalaction.notification;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.aq80;
import defpackage.as21;
import defpackage.e3n;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.kp50;
import defpackage.m3b0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.p2y0;
import defpackage.p53;
import defpackage.pav;
import defpackage.pk60;
import defpackage.pnz;
import defpackage.pzt0;
import defpackage.r8h;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;
import defpackage.unr0;
import defpackage.v3b0;
import defpackage.ysg;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.summary.topnotification.a;

/* loaded from: classes6.dex */
public final class b extends ru.yandex.taxi.summary.topnotification.a {
    public static final p53 m = new p53(pnz.a, 0);
    public final tse a;
    public final tj60 b;
    public final a c;
    public final pav d;
    public final k7x0 e;
    public final ru.yandex.taxi.personalstate.data.remote.a f;
    public final as21 g;
    public final p2y0 h;
    public final r8h i;
    public final aq80 j;
    public final String k = PersonalActionNotificationComponent.NOTIFICATION_ID;
    public pzt0 l;

    public b(tse tseVar, tj60 tj60Var, a aVar, pav pavVar, k7x0 k7x0Var, ru.yandex.taxi.personalstate.data.remote.a aVar2, as21 as21Var, p2y0 p2y0Var, r8h r8hVar, aq80 aq80Var) {
        this.a = tseVar;
        this.b = tj60Var;
        this.c = aVar;
        this.d = pavVar;
        this.e = k7x0Var;
        this.f = aVar2;
        this.g = as21Var;
        this.h = p2y0Var;
        this.i = r8hVar;
        this.j = aq80Var;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final void a() {
        e();
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.l = null;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final a.AbstractC0120a b() {
        return this.c;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final String c() {
        return this.k;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a
    public final tj60 d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    @Override // ru.yandex.taxi.summary.topnotification.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(NotificationItemComponent notificationItemComponent, pk60 pk60Var) {
        int size;
        m3b0 m3b0Var = (m3b0) pk60Var;
        if (!jl40.l(m3b0Var, m3b0.m)) {
            String str = m3b0Var.a;
            int i = m3b0Var.l;
            if (str.length() != 0) {
                e0 e0Var = (e0) this.h;
                if (!e0Var.s()) {
                    String str2 = m3b0Var.f;
                    if (!((v3b0) this.j.a).a.contains(str2)) {
                        this.i.getClass();
                        long currentTimeMillis = System.currentTimeMillis() - m3b0Var.k;
                        p53 p53Var = m;
                        as21 as21Var = this.g;
                        List list = (List) as21Var.d(str2, p53Var);
                        LinkedList linkedList = list != null ? new LinkedList(list) : null;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                        }
                        if (!linkedList.isEmpty()) {
                            Iterator it = linkedList.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                if (((Number) it.next()).longValue() >= currentTimeMillis) {
                                    break;
                                }
                                i2++;
                            }
                            if (i2 != -1) {
                                size = linkedList.size() - i2;
                                if (jl40.l(((ysg) e0Var.a.get()).d().d, as21Var.c("PERSONAL_STATE_NOTIFICATION_LAST_ORDER_ID" + str2))) {
                                    size--;
                                }
                                unr0.C(new Object[]{str2, Integer.valueOf(size), Integer.valueOf(i)}, 3, "canShowNotification %s, shown=%d, limit=%d", jst.e);
                                if (size >= i && (notificationItemComponent instanceof PersonalActionNotificationComponent)) {
                                    return true;
                                }
                            }
                        }
                        size = 0;
                        if (jl40.l(((ysg) e0Var.a.get()).d().d, as21Var.c("PERSONAL_STATE_NOTIFICATION_LAST_ORDER_ID" + str2))) {
                        }
                        unr0.C(new Object[]{str2, Integer.valueOf(size), Integer.valueOf(i)}, 3, "canShowNotification %s, shown=%d, limit=%d", jst.e);
                        if (size >= i) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // ru.yandex.taxi.summary.topnotification.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PersonalActionNotificationComponent personalActionNotificationComponent, m3b0 m3b0Var, ContinuationImpl continuationImpl) {
        PersonalActionNotificationController$render$1 personalActionNotificationController$render$1;
        int i;
        PersonalActionNotificationComponent personalActionNotificationComponent2;
        String str;
        String str2;
        as21 as21Var;
        pzt0 pzt0Var;
        m3b0 m3b0Var2 = m3b0Var;
        if (continuationImpl instanceof PersonalActionNotificationController$render$1) {
            personalActionNotificationController$render$1 = (PersonalActionNotificationController$render$1) continuationImpl;
            int i2 = personalActionNotificationController$render$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalActionNotificationController$render$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalActionNotificationController$render$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalActionNotificationController$render$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = m3b0Var2.f;
                    String str4 = m3b0Var2.g;
                    String str5 = m3b0Var2.h;
                    boolean z = m3b0Var2.i;
                    personalActionNotificationController$render$1.L$0 = personalActionNotificationComponent;
                    personalActionNotificationController$render$1.L$1 = m3b0Var2;
                    personalActionNotificationController$render$1.label = 1;
                    ru.yandex.taxi.personalstate.data.remote.a aVar = this.f;
                    aVar.getClass();
                    if (str3 != null && str4 != null && str5 != null) {
                        aVar.a.a(str3, str4, str5, "NotificationShown");
                    }
                    if ((z ? aVar.c(personalActionNotificationController$render$1) : zy11Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    personalActionNotificationComponent2 = personalActionNotificationComponent;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m3b0Var2 = (m3b0) personalActionNotificationController$render$1.L$1;
                    personalActionNotificationComponent2 = (PersonalActionNotificationComponent) personalActionNotificationController$render$1.L$0;
                    kotlin.b.b(obj);
                }
                str = ((ysg) ((e0) this.h).a.get()).d().d;
                String str6 = m3b0Var2.f;
                str2 = "PERSONAL_STATE_NOTIFICATION_LAST_ORDER_ID" + str6;
                as21Var = this.g;
                if (jl40.l(str, as21Var.c(str2))) {
                    p53 p53Var = m;
                    List list = (List) as21Var.d("PERSONAL_STATE_NOTIFICATION_TIMESTAMPS" + str6, p53Var);
                    LinkedList linkedList = list != null ? new LinkedList(list) : new LinkedList();
                    this.i.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    o430 o430Var = e3n.b;
                    long e = currentTimeMillis - e3n.e(kp50.U(90, DurationUnit.DAYS));
                    while (!linkedList.isEmpty() && ((Number) kotlin.collections.a.P(linkedList)).longValue() < e) {
                        linkedList.removeFirst();
                    }
                    linkedList.add(Long.valueOf(System.currentTimeMillis()));
                    as21Var.h("PERSONAL_STATE_NOTIFICATION_TIMESTAMPS" + str6, p53Var, linkedList);
                    as21Var.g("PERSONAL_STATE_NOTIFICATION_LAST_ORDER_ID" + str6, str);
                    unr0.C(new Object[]{str6, Integer.valueOf(linkedList.size())}, 2, "added new display for notification %s, total displays=%d", jst.e);
                }
                personalActionNotificationComponent2.renderViewModel(m3b0Var2);
                pzt0Var = this.l;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.l = tje.N(this.a, null, null, new PersonalActionNotificationController$render$2(this, m3b0Var2, personalActionNotificationComponent2, null), 3);
                return zy11Var;
            }
        }
        personalActionNotificationController$render$1 = new PersonalActionNotificationController$render$1(this, continuationImpl);
        Object obj2 = personalActionNotificationController$render$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalActionNotificationController$render$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        str = ((ysg) ((e0) this.h).a.get()).d().d;
        String str62 = m3b0Var2.f;
        str2 = "PERSONAL_STATE_NOTIFICATION_LAST_ORDER_ID" + str62;
        as21Var = this.g;
        if (jl40.l(str, as21Var.c(str2))) {
        }
        personalActionNotificationComponent2.renderViewModel(m3b0Var2);
        pzt0Var = this.l;
        if (pzt0Var != null) {
        }
        this.l = tje.N(this.a, null, null, new PersonalActionNotificationController$render$2(this, m3b0Var2, personalActionNotificationComponent2, null), 3);
        return zy11Var2;
    }
}
