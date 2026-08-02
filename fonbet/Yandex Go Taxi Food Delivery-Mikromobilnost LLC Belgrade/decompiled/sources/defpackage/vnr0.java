package defpackage;

import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class vnr0 implements aap {
    public final lx4 a;
    public final fga0 b;
    public final ma1 c;
    public final r5f d;
    public final t61 e;
    public final rx2 f;
    public final cug g;
    public final jc4 h;
    public final rx2 i;
    public final jc4 j;
    public final cug k;
    public final y9p l;
    public final rx2 m;
    public final rx2 n;
    public final jc4 o;
    public final cug p;
    public final rx2 q;
    public final LinkedHashMap r = b.l(new Pair("context", SharedPaymentContext.DETAILS.getValue()));
    public final LinkedHashMap s = b.l(new Pair("context", SharedPaymentContext.WIZARD.getValue()));
    public final LinkedHashMap t = new LinkedHashMap();
    public final LinkedHashMap u = new LinkedHashMap();
    public final LinkedHashMap v = new LinkedHashMap();
    public final LinkedHashMap w = new LinkedHashMap();
    public final String x = "";

    public vnr0(lx4 lx4Var, fga0 fga0Var, ma1 ma1Var, r5f r5fVar, t61 t61Var, rx2 rx2Var, cug cugVar, jc4 jc4Var, rx2 rx2Var2, jc4 jc4Var2, cug cugVar2, y9p y9pVar, rx2 rx2Var3, rx2 rx2Var4, jc4 jc4Var3, cug cugVar3, rx2 rx2Var5) {
        this.a = lx4Var;
        this.b = fga0Var;
        this.c = ma1Var;
        this.d = r5fVar;
        this.e = t61Var;
        this.f = rx2Var;
        this.g = cugVar;
        this.h = jc4Var;
        this.i = rx2Var2;
        this.j = jc4Var2;
        this.k = cugVar2;
        this.l = y9pVar;
        this.m = rx2Var3;
        this.n = rx2Var4;
        this.o = jc4Var3;
        this.p = cugVar3;
        this.q = rx2Var5;
    }

    public static ListBuilder h(boolean z) {
        ListBuilder a = rcc.a();
        a.add(SharedPaymentAnalytics$Button.BACK);
        a.add(SharedPaymentAnalytics$Button.CARD);
        a.add(SharedPaymentAnalytics$Button.MAIL);
        a.add(SharedPaymentAnalytics$Button.ADD_PARTICIPANTS);
        if (z) {
            a.add(SharedPaymentAnalytics$Button.BIG_COMPANY);
        }
        a.add(SharedPaymentAnalytics$Button.SETTINGS);
        a.add(SharedPaymentAnalytics$Button.ACTION_BUTTON);
        return a.j();
    }

    public static ListBuilder i(bmn bmnVar) {
        ListBuilder a = rcc.a();
        a.add(SharedPaymentAnalytics$Button.DONE);
        a.add(SharedPaymentAnalytics$Button.BACK);
        a.add(SharedPaymentAnalytics$Button.DELETE);
        a.add(SharedPaymentAnalytics$Button.NAME);
        a.add(SharedPaymentAnalytics$Button.PHONE);
        if (bmnVar.a()) {
            a.add(SharedPaymentAnalytics$Button.SET_LIMIT);
            a.add(SharedPaymentAnalytics$Button.LIMIT_VALUE);
        }
        return a.j();
    }

    public static ListBuilder j(boolean z, MemberListMode memberListMode, int i) {
        ListBuilder a = rcc.a();
        a.add(SharedPaymentAnalytics$Button.BACK);
        a.add(SharedPaymentAnalytics$Button.ADD_PARTICIPANT);
        if (i > 1) {
            if (z) {
                a.add(SharedPaymentAnalytics$Button.DONE);
                a.add(SharedPaymentAnalytics$Button.PARTICIPANT_DELETED);
            } else {
                a.add(SharedPaymentAnalytics$Button.EDIT);
                a.add(SharedPaymentAnalytics$Button.PARTICIPANT_SELECTED);
            }
        }
        if (!scc.g(MemberListMode.DETAILS, MemberListMode.LIMITS).contains(memberListMode)) {
            a.add(SharedPaymentAnalytics$Button.ACTION_BUTTON);
        }
        return a.j();
    }

    public final void a(String str, SharedPaymentContext sharedPaymentContext) {
        fga0 fga0Var = this.b;
        SharedAccount o = fga0Var.o(str);
        if (o == null) {
            unr0.D(new Object[]{str, "FamilyAccount.CardClosed"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
            return;
        }
        String b = o.getB();
        boolean e = o.e(fga0Var.w());
        String value = sharedPaymentContext.getValue();
        y9p y9pVar = this.l;
        y9pVar.getClass();
        y9p.c(y9pVar, "FamilyAccount.CardClosed", b, str, e, value, null, 32);
    }

    public final void b(String str, SharedPaymentContext sharedPaymentContext) {
        fga0 fga0Var = this.b;
        SharedAccount o = fga0Var.o(str);
        if (o == null) {
            unr0.D(new Object[]{str, "FamilyAccount.CardShown"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
            return;
        }
        String b = o.getB();
        boolean e = o.e(fga0Var.w());
        String value = sharedPaymentContext.getValue();
        y9p y9pVar = this.l;
        y9pVar.getClass();
        y9p.c(y9pVar, "FamilyAccount.CardShown", b, str, e, value, null, 32);
    }

    public final void c(String str, SharedPaymentContext sharedPaymentContext) {
        fga0 fga0Var = this.b;
        SharedAccount o = fga0Var.o(str);
        if (o == null) {
            unr0.D(new Object[]{str, "FamilyAccount.ChangeCreditCardButtonTapped"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
            return;
        }
        String b = o.getB();
        boolean e = o.e(fga0Var.w());
        String value = sharedPaymentContext.getValue();
        y9p y9pVar = this.l;
        y9pVar.getClass();
        y9p.c(y9pVar, "FamilyAccount.ChangeCreditCardButtonTapped", b, str, e, value, null, 32);
    }

    public final void d(SharedPaymentsOpenReason sharedPaymentsOpenReason, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        String str = this.x;
        if (str.length() <= 0) {
            str = null;
        }
        rx2 rx2Var = this.n;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("owner_business_account", valueOf);
        if (analyticsName != null) {
            hashMap.put("source", analyticsName);
        }
        if (str != null) {
            hashMap.put("title_utm", str);
        }
        rx2Var.a.a("B2BEntryPointItemShowed", hashMap, 1, new HashMap());
    }

    public final void e(SharedPaymentsOpenReason sharedPaymentsOpenReason, boolean z) {
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        String str = this.x;
        if (str.length() <= 0) {
            str = null;
        }
        Boolean valueOf = Boolean.valueOf(z);
        jc4 jc4Var = this.o;
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("owner_business_account", valueOf);
        if (analyticsName != null) {
            hashMap.put("source", analyticsName);
        }
        if (str != null) {
            hashMap.put("title_utm", str);
        }
        jc4Var.a.a("B2BEntryPointItemSelected", hashMap, 1, new HashMap());
    }

    public final void f(tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button) {
        List singletonList = Collections.singletonList(SharedPaymentAnalytics$Button.BACK.getAnalyticsName());
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
        String str = tmr0Var.a;
        r5f r5fVar = this.d;
        r5fVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", singletonList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("open_reason", analyticsName2);
        }
        if (str != null) {
            hashMap.put(ClidProvider.STATE, str);
        }
        r5fVar.a.a("CreateGroupAccount.Tapped", hashMap, 1, new HashMap());
    }

    public final void g(tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason) {
        String analyticsName = sharedPaymentAnalytics$CloseReason.getAnalyticsName();
        String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
        String str = tmr0Var.a;
        r5f r5fVar = this.d;
        r5fVar.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("close_reason", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("open_reason", analyticsName2);
        }
        if (str != null) {
            hashMap.put(ClidProvider.STATE, str);
        }
        r5fVar.a.a("CreateGroupAccount.Closed", hashMap, 1, new HashMap());
    }

    public final String k(String str) {
        SharedAccount o = this.b.o(str);
        if (o != null) {
            return o.getB();
        }
        return null;
    }

    public final void l(String str, SharedPaymentsOpenReason sharedPaymentsOpenReason, boolean z, SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button) {
        ListBuilder h = h(z);
        ArrayList arrayList = new ArrayList(tcc.n(h, 10));
        ListIterator listIterator = h.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
        String k = k(str);
        t61 t61Var = this.e;
        t61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        if (str != null) {
            hashMap.put("group_id", str);
        }
        if (analyticsName2 != null) {
            hashMap.put("open_reason", analyticsName2);
        }
        if (k != null) {
            hashMap.put(ClidProvider.STATE, k);
        }
        t61Var.a.a("GroupAccount.Tapped", hashMap, 1, new HashMap());
    }

    public final void m(String str, SharedPaymentsOpenReason sharedPaymentsOpenReason, bmn bmnVar, SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button) {
        ListBuilder i = i(bmnVar);
        ArrayList arrayList = new ArrayList(tcc.n(i, 10));
        ListIterator listIterator = i.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
        String k = k(str);
        cug cugVar = this.g;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("open_reason", analyticsName2);
        }
        if (k != null) {
            hashMap.put(ClidProvider.STATE, k);
        }
        cugVar.a.a("GroupAccountParticipantCard.Tapped", hashMap, 1, new HashMap());
    }

    public final void n(String str, SharedPaymentsOpenReason sharedPaymentsOpenReason, SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button) {
        List g = scc.g(SharedPaymentAnalytics$Button.BACK, SharedPaymentAnalytics$Button.NAME, SharedPaymentAnalytics$Button.PHONE, SharedPaymentAnalytics$Button.FROM_CONTACTS, SharedPaymentAnalytics$Button.DONE);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(((SharedPaymentAnalytics$Button) it.next()).getAnalyticsName());
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
        String k = k(str);
        jc4 jc4Var = this.h;
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        if (str != null) {
            hashMap.put("group_id", str);
        }
        if (analyticsName2 != null) {
            hashMap.put("open_reason", analyticsName2);
        }
        if (k != null) {
            hashMap.put(ClidProvider.STATE, k);
        }
        jc4Var.a.a("GroupAccountParticipants.Tapped", hashMap, 1, new HashMap());
    }

    public final void o(String str, SharedPaymentsOpenReason sharedPaymentsOpenReason, SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason, boolean z, MemberListMode memberListMode, int i) {
        ListBuilder j = j(z, memberListMode, i);
        ArrayList arrayList = new ArrayList(tcc.n(j, 10));
        ListIterator listIterator = j.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        String analyticsName = sharedPaymentAnalytics$CloseReason.getAnalyticsName();
        String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
        String k = k(str);
        rx2 rx2Var = this.f;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("close_reason", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("open_reason", analyticsName2);
        }
        if (k != null) {
            hashMap.put(ClidProvider.STATE, k);
        }
        rx2Var.a.a("GroupAccountParticipantsListCard.Closed", hashMap, 1, new HashMap());
    }

    public final void p(String str, SharedPaymentsOpenReason sharedPaymentsOpenReason, SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button, boolean z, MemberListMode memberListMode, int i) {
        ListBuilder j = j(z, memberListMode, i);
        ArrayList arrayList = new ArrayList(tcc.n(j, 10));
        ListIterator listIterator = j.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
        String k = k(str);
        rx2 rx2Var = this.f;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("open_reason", analyticsName2);
        }
        if (k != null) {
            hashMap.put(ClidProvider.STATE, k);
        }
        rx2Var.a.a("GroupAccountParticipantsListCard.Tapped", hashMap, 1, new HashMap());
    }

    public final void q(String str, SharedPaymentContext sharedPaymentContext) {
        fga0 fga0Var = this.b;
        SharedAccount o = fga0Var.o(str);
        if (o == null) {
            unr0.D(new Object[]{str, "FamilyAccount.ParticipantsButtonTapped"}, 2, "Cannot get account with id=%s from cache for event=%s", jst.e, new IllegalStateException());
            return;
        }
        String b = o.getB();
        boolean e = o.e(fga0Var.w());
        String value = sharedPaymentContext.getValue();
        y9p y9pVar = this.l;
        y9pVar.getClass();
        y9p.c(y9pVar, "FamilyAccount.ParticipantsButtonTapped", b, str, e, value, null, 32);
    }

    public final void r(SharedPaymentAnalytics$CloseReason sharedPaymentAnalytics$CloseReason) {
        List g = scc.g(SharedPaymentAnalytics$Button.YES, SharedPaymentAnalytics$Button.NO);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(((SharedPaymentAnalytics$Button) it.next()).getAnalyticsName());
        }
        String analyticsName = sharedPaymentAnalytics$CloseReason.getAnalyticsName();
        cug cugVar = this.k;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("close_reason", analyticsName);
        }
        cugVar.a.a("MonthLimitsAlert.Closed", hashMap, 1, new HashMap());
    }

    public final void s(SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button) {
        List g = scc.g(SharedPaymentAnalytics$Button.YES, SharedPaymentAnalytics$Button.NO);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(((SharedPaymentAnalytics$Button) it.next()).getAnalyticsName());
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        cug cugVar = this.k;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        cugVar.a.a("MonthLimitsAlert.Tapped", hashMap, 1, new HashMap());
    }

    public final void t(SharedPaymentsOpenReason sharedPaymentsOpenReason, SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button, int i) {
        ListBuilder a = rcc.a();
        a.add(SharedPaymentAnalytics$Button.BACK);
        a.add(SharedPaymentAnalytics$Button.DONE);
        if (i > 1) {
            a.add(SharedPaymentAnalytics$Button.USER_SELECTED);
        }
        ListBuilder j = a.j();
        ArrayList arrayList = new ArrayList(tcc.n(j, 10));
        ListIterator listIterator = j.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        String analyticsName2 = sharedPaymentsOpenReason.getAnalyticsName();
        jc4 jc4Var = this.j;
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("open_reason", analyticsName2);
        }
        jc4Var.a.a("MonthLimitsCard.Tapped", hashMap, 1, new HashMap());
    }

    public final void u(SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button) {
        List g = scc.g(SharedPaymentAnalytics$Button.BACK, SharedPaymentAnalytics$Button.DONE, SharedPaymentAnalytics$Button.CURRENCY_SELECTED);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(((SharedPaymentAnalytics$Button) it.next()).getAnalyticsName());
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        rx2 rx2Var = this.i;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        rx2Var.a.a("MonthLimitsCurrencyCard.Tapped", hashMap, 1, new HashMap());
    }

    public final void v(String str, LinkedHashMap linkedHashMap) {
        fga0 fga0Var = this.b;
        SharedAccount o = fga0Var.o(str);
        linkedHashMap.put("group_id", str);
        if (o != null) {
            linkedHashMap.put("type_group", o.getB());
            linkedHashMap.put("payment_method_flag", Boolean.valueOf(o.e(fga0Var.w())));
        }
    }

    public final void w(SharedPaymentContext sharedPaymentContext) {
        String value = sharedPaymentContext.getValue();
        y9p y9pVar = this.l;
        HashMap n = tse0.n(y9pVar);
        if (value != null) {
            n.put("context", value);
        }
        y9pVar.a.a("FamilyAccount.ForceZalogin.Card.Shown", n, 1, new HashMap());
    }

    public final void x(SharedPaymentContext sharedPaymentContext) {
        String value = sharedPaymentContext.getValue();
        y9p y9pVar = this.l;
        HashMap n = tse0.n(y9pVar);
        if (value != null) {
            n.put("context", value);
        }
        y9pVar.a.a("FamilyAccount.ForceZalogin.Request.Success", n, 1, new HashMap());
    }
}
