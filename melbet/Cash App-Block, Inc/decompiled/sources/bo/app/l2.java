package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l2 {
    public final id a;
    public final ta b;
    public final r7 c;
    public final m9 d;
    public final e2 e;
    public final ue f;
    public final x3 g;
    public final a7 h;
    public final dd i;
    public final HashMap j;
    public final d9 k;

    public l2(id idVar, ta taVar, r7 r7Var, m9 m9Var, e2 e2Var, ue ueVar, x3 x3Var, a7 a7Var, dd ddVar) {
        idVar.getClass();
        taVar.getClass();
        r7Var.getClass();
        m9Var.getClass();
        e2Var.getClass();
        ueVar.getClass();
        x3Var.getClass();
        a7Var.getClass();
        ddVar.getClass();
        this.a = idVar;
        this.b = taVar;
        this.c = r7Var;
        this.d = m9Var;
        this.e = e2Var;
        this.f = ueVar;
        this.g = x3Var;
        this.h = a7Var;
        this.i = ddVar;
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put("Content-Type", "application/json");
        this.j = hashMap;
        d9 d9Var = idVar.a;
        this.k = d9Var;
        d9Var.a(hashMap);
    }

    public static final Unit b(l2 l2Var, List list) {
        l2Var.c.b(new u8(list), u8.class);
        return Unit.INSTANCE;
    }

    public static final String d() {
        return "Api response was null, failing task.";
    }

    public final j a() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        ((i2) this.k).f = Long.valueOf(nowInMilliseconds);
        ((i2) this.k).e = Long.valueOf(nowInMilliseconds / 1000);
        kd e = ((i2) this.k).e();
        JSONObject a = this.k.a();
        if (a == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w8$$ExternalSyntheticLambda0(e, 1), 6, (Object) null);
            return new vg(this.k, new n9(-1, (Map) null, 6));
        }
        a7 a7Var = this.h;
        e.getClass();
        String b = a7.b(e.a);
        long a2 = a7Var.a.a(b);
        long nowInMilliseconds2 = DateTimeUtils.nowInMilliseconds();
        com.braze.storage.e eVar = a7Var.a;
        eVar.getClass();
        b.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new z6(eVar, b, nowInMilliseconds2, null));
        this.j.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(Math.min(nowInMilliseconds2 - a2, 7200000L)));
        HashMap hashMap = this.j;
        a7 a7Var2 = this.h;
        String a3 = a7.a(e.a);
        long a4 = a7Var2.a.a(a3, 1L);
        com.braze.storage.e eVar2 = a7Var2.a;
        eVar2.getClass();
        a3.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new x6(eVar2, a3, a4 + 1, null));
        hashMap.put("X-Braze-Req-Attempt", String.valueOf(a4));
        this.j.put("X-Braze-Req-Tokens-Remaining", String.valueOf(this.a.e));
        Integer num = this.a.f;
        if (num != null) {
            this.j.put("X-Braze-Ept-Req-Tokens-Remaining", String.valueOf(num.intValue()));
        }
        n9 a5 = this.b.a(e, this.j, a);
        if (a5.c != null) {
            return new nb(this.k, a5, this.e);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(3), 6, (Object) null);
        ((r7) this.d).b(new BrazeNetworkFailureEvent(this.k, a5), BrazeNetworkFailureEvent.class);
        return new vg(this.k, a5);
    }

    public final void c() {
        j a = a();
        if (!(a instanceof nb)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(4), 6, (Object) null);
            bb bbVar = new bb(this.k, a.a);
            this.k.a(this.c, this.d, bbVar);
            this.c.b(new r5(this.k), r5.class);
            a(bbVar);
            this.i.a(a);
            return;
        }
        nb nbVar = (nb) a;
        t9 t9Var = nbVar.d;
        if (t9Var == null) {
            a7 a7Var = this.h;
            kd e = ((i2) this.k).e();
            e.getClass();
            String a2 = a7.a(e.a);
            com.braze.storage.e eVar = a7Var.a;
            eVar.getClass();
            a2.getClass();
            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new x6(eVar, a2, 1L, null));
            this.k.a(this.c, this.d, nbVar);
            this.i.a(nbVar);
        } else {
            a(t9Var);
            this.k.a(this.c, this.d, nbVar.d);
            this.i.a((j) nbVar);
        }
        a(nbVar);
        boolean z = nbVar.d instanceof pd;
        r7 r7Var = this.c;
        d9 d9Var = this.k;
        if (z) {
            r7Var.b(new r5(d9Var), r5.class);
        } else {
            r7Var.b(new s5(d9Var), s5.class);
        }
    }

    public static final String b(t9 t9Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Received server error from request: ", t9Var.a());
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            k2.a(arrayList, new l2$$ExternalSyntheticLambda1(this, arrayList, 0));
        }
    }

    public static final String b() {
        return "Experienced network communication exception processing API response. Sending network error event.";
    }

    public final void c(ArrayList arrayList) {
        if (arrayList != null) {
            k2.a(arrayList, new l2$$ExternalSyntheticLambda1(this, arrayList, 2));
        }
    }

    public static final Unit c(l2 l2Var, List list) {
        l2Var.c.b(new ug(list), ug.class);
        return Unit.INSTANCE;
    }

    public static final String a(kd kdVar) {
        return "Could not parse request parameters for POST request to " + kdVar + ", cancelling request.";
    }

    public final void a(nb nbVar) {
        nbVar.getClass();
        String str = this.e.b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 19), 6, (Object) null);
        a(nbVar.f, str);
        a(nbVar.i);
        c(nbVar.h);
        b(nbVar.j);
        a(nbVar.k);
        a(nbVar.g, str);
        String str2 = nbVar.l;
        String str3 = nbVar.m;
        String str4 = nbVar.n;
        if (str2 != null && str3 != null && str4 != null) {
            this.c.b(new u5(str2, str3, str4), u5.class);
        }
        a(nbVar.p, nbVar.q, nbVar.r);
        a(nbVar.r);
        td tdVar = nbVar.s;
        if (tdVar != null) {
            this.c.b(new yd(tdVar), yd.class);
        }
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Processing server response payload for user with id: ", str);
    }

    public final void a(t9 t9Var) {
        t9Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ae$$ExternalSyntheticLambda1(t9Var, 2), 6, (Object) null);
        this.c.b(new ve(t9Var), ve.class);
        d9 d9Var = this.k;
        if (d9Var instanceof pf) {
            m9 m9Var = this.d;
            String a = ((pf) d9Var).m.a();
            a.getClass();
            ((r7) m9Var).b(new NoMatchingTriggerEvent(a), NoMatchingTriggerEvent.class);
        }
    }

    public final void a(u3 u3Var, String str) {
        if (u3Var != null) {
            k2.a(u3Var, new n$$ExternalSyntheticLambda1(22, this, u3Var, str));
        }
    }

    public static final Unit a(l2 l2Var, u3 u3Var, String str) {
        ContentCardsUpdatedEvent a = l2Var.g.a(u3Var, str);
        if (a != null) {
            ((r7) l2Var.d).b(a, ContentCardsUpdatedEvent.class);
        }
        return Unit.INSTANCE;
    }

    public final void a(re reVar) {
        if (reVar != null) {
            k2.a(reVar, new n$$ExternalSyntheticLambda0(19, this, reVar));
        }
    }

    public static final Unit a(l2 l2Var, re reVar) {
        l2Var.f.a(reVar);
        l2Var.c.b(new te(reVar), te.class);
        reVar.getClass();
        l2Var.c.b(new yd(new td(reVar.z, reVar.B, reVar.A, reVar.C, reVar.D, reVar.E)), yd.class);
        return Unit.INSTANCE;
    }

    public final void a(JSONArray jSONArray) {
        if (jSONArray != null) {
            k2.a(jSONArray, new n$$ExternalSyntheticLambda0(20, this, jSONArray));
        }
    }

    public static final Unit a(l2 l2Var, JSONArray jSONArray) {
        l2Var.c.b(new h8(jSONArray), h8.class);
        return Unit.INSTANCE;
    }

    public final void a(JSONObject jSONObject, Long l, ArrayList arrayList) {
        if (jSONObject != null) {
            k2.a(jSONObject, new l2$$ExternalSyntheticLambda7(this, jSONObject, l, arrayList, 0));
        }
    }

    public static final Unit a(l2 l2Var, JSONObject jSONObject, Long l, List list) {
        r7 r7Var = l2Var.c;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        r7Var.b(new e0(jSONObject, l, list), e0.class);
        return Unit.INSTANCE;
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            k2.a(arrayList, new l2$$ExternalSyntheticLambda1(this, arrayList, 1));
        }
    }

    public static final Unit a(l2 l2Var, List list) {
        l2Var.c.b(new e(list), e.class);
        return Unit.INSTANCE;
    }

    public final void a(InAppMessageBase inAppMessageBase, String str) {
        if (inAppMessageBase != null) {
            k2.a(inAppMessageBase, new n$$ExternalSyntheticLambda1(21, this, inAppMessageBase, str));
        }
    }

    public static final Unit a(l2 l2Var, IInAppMessage iInAppMessage, String str) {
        d9 d9Var = l2Var.k;
        if (d9Var instanceof pf) {
            iInAppMessage.setExpirationTimestamp(((pf) d9Var).q);
            r7 r7Var = l2Var.c;
            pf pfVar = (pf) l2Var.k;
            r7Var.b(new la(pfVar.m, pfVar.r, iInAppMessage, str), la.class);
        }
        return Unit.INSTANCE;
    }
}
