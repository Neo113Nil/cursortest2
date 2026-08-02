package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.MessengerParams;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m7e implements ps3 {
    public final /* synthetic */ n7e a;
    public final /* synthetic */ boolean b;

    public m7e(n7e n7eVar, boolean z) {
        this.a = n7eVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    @Override // defpackage.ps3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(es3 es3Var, l3o l3oVar) {
        JSONObject jSONObject;
        JSONObject B;
        JSONObject B2;
        Class<Integer> cls;
        String str;
        Class<Integer> cls2;
        String str2;
        f9h f9hVar;
        f9h f9hVar2;
        f9h f9hVar3;
        f9h f9hVar4;
        boolean z;
        int i;
        Integer A;
        Object obj;
        ChatRequest chatRequest;
        Integer num;
        Integer num2;
        int intValue;
        Integer A2;
        long longValue;
        long j;
        long millis;
        Long C;
        Integer A3;
        Integer A4;
        Integer A5;
        JSONObject B3;
        Object intOrNull;
        Object valueOf;
        JSONObject B4;
        Object intOrNull2;
        Object valueOf2;
        es3Var.getClass();
        l3oVar.getClass();
        boolean b = l3oVar.b();
        n7e n7eVar = this.a;
        if (!b) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(hrg.p("messenger's backend error, code = ", l3oVar.d, ", body = ", l3oVar.o().D()));
            qdc qdcVar = n7eVar.f;
            Pair pair = new Pair("reason", "backend error");
            String message = illegalArgumentException.getMessage();
            if (message == null) {
                message = "";
            }
            qdcVar.sendEvent("wm_unread_count_error", uah.e(pair, new Pair("error", message)));
            n7eVar.b(illegalArgumentException);
            return;
        }
        o3o o3oVar = l3oVar.g;
        if (o3oVar != null) {
            String m = c.m(o3oVar.a());
            if (StringsKt.U(m)) {
                m = null;
            }
            if (m != null) {
                jSONObject = new JSONObject(m);
                B = jSONObject == null ? vnj.B("data", jSONObject) : null;
                if (B != null) {
                    String F = vnj.F("code", B);
                    String F2 = vnj.F("text", B);
                    if ((Intrinsics.d(F, "unauthorized") && (Intrinsics.d(F2, "invalid auth token") || Intrinsics.d(F2, "expired_token"))) || Intrinsics.d(F, "invalid_auth_scope")) {
                        n7eVar.h.getClass();
                        F.getClass();
                    }
                }
                B2 = jSONObject == null ? vnj.B("Details", jSONObject) : null;
                String str3 = "null cannot be cast to non-null type kotlin.Int";
                cls = Integer.class;
                String str4 = "Not implemented";
                Class cls3 = Integer.TYPE;
                Class cls4 = Long.TYPE;
                if (B2 != null || (B4 = vnj.B("Ns", B2)) == null) {
                    str = "null cannot be cast to non-null type kotlin.Int";
                    cls2 = cls;
                    str2 = "Not implemented";
                    f9hVar = null;
                    f9hVar2 = null;
                } else {
                    f9hVar = null;
                    f9h f9hVar5 = new f9h();
                    Iterator<String> keys = B4.keys();
                    keys.getClass();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String str5 = str3;
                        lm4 a = ern.a(cls);
                        Class<Integer> cls5 = cls;
                        if (a.equals(ern.a(String.class))) {
                            intOrNull2 = next;
                        } else if (a.equals(ern.a(cls4))) {
                            next.getClass();
                            intOrNull2 = StringsKt.r0(10, next);
                        } else if (!a.equals(ern.a(cls3))) {
                            xq0.q(str4);
                            return;
                        } else {
                            next.getClass();
                            intOrNull2 = StringsKt.toIntOrNull(next);
                        }
                        if (intOrNull2 == null) {
                            jj4.j(str5);
                            return;
                        }
                        Integer num3 = (Integer) intOrNull2;
                        lm4 a2 = ern.a(cls5);
                        String str6 = str4;
                        if (a2.equals(ern.a(String.class))) {
                            valueOf2 = B4.optString(next);
                        } else if (a2.equals(ern.a(cls4))) {
                            valueOf2 = Long.valueOf(B4.optLong(next));
                        } else {
                            if (!a2.equals(ern.a(cls3))) {
                                xq0.q(str6);
                                return;
                            }
                            valueOf2 = Integer.valueOf(B4.optInt(next));
                        }
                        if (valueOf2 == null) {
                            jj4.j(str5);
                            return;
                        }
                        f9hVar5.put(num3, (Integer) valueOf2);
                        str3 = str5;
                        cls = cls5;
                        str4 = str6;
                    }
                    str = str3;
                    cls2 = cls;
                    str2 = str4;
                    f9hVar2 = f9hVar5.b();
                }
                if (B2 != null || (B3 = vnj.B("Bots", B2)) == null) {
                    f9hVar3 = f9hVar2;
                    f9hVar4 = f9hVar;
                } else {
                    f9h f9hVar6 = new f9h();
                    Iterator<String> keys2 = B3.keys();
                    keys2.getClass();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        lm4 a3 = ern.a(String.class);
                        if (a3.equals(ern.a(String.class))) {
                            intOrNull = next2;
                        } else if (a3.equals(ern.a(cls4))) {
                            next2.getClass();
                            intOrNull = StringsKt.r0(10, next2);
                        } else if (!a3.equals(ern.a(cls3))) {
                            xq0.q(str2);
                            return;
                        } else {
                            next2.getClass();
                            intOrNull = StringsKt.toIntOrNull(next2);
                        }
                        if (intOrNull == null) {
                            jj4.j("null cannot be cast to non-null type kotlin.String");
                            return;
                        }
                        String str7 = (String) intOrNull;
                        lm4 a4 = ern.a(cls2);
                        f9h f9hVar7 = f9hVar2;
                        if (a4.equals(ern.a(String.class))) {
                            valueOf = B3.optString(next2);
                        } else if (a4.equals(ern.a(cls4))) {
                            valueOf = Long.valueOf(B3.optLong(next2));
                        } else {
                            if (!a4.equals(ern.a(cls3))) {
                                xq0.q(str2);
                                return;
                            }
                            valueOf = Integer.valueOf(B3.optInt(next2));
                        }
                        if (valueOf == null) {
                            jj4.j(str);
                            return;
                        } else {
                            f9hVar6.put(str7, (Integer) valueOf);
                            f9hVar2 = f9hVar7;
                        }
                    }
                    f9hVar3 = f9hVar2;
                    f9hVar4 = f9hVar6.b();
                }
                ChatRequest chatRequest2 = n7eVar.a;
                MessengerParams messengerParams = n7eVar.e;
                z = chatRequest2 instanceof rh4;
                boolean z2 = this.b;
                i = 0;
                if (z) {
                    if (!(chatRequest2 instanceof oh4) && !(chatRequest2 instanceof ph4) && chatRequest2 != null) {
                        b6e.s();
                        return;
                    }
                    obj = Integer.valueOf((jSONObject == null || (A = vnj.A("UnreadCount", jSONObject)) == null) ? 0 : A.intValue());
                } else if (z2) {
                    obj = f9hVar;
                } else {
                    obj = Integer.valueOf((jSONObject == null || (A5 = vnj.A("UnreadCount", jSONObject)) == null) ? 0 : A5.intValue());
                }
                chatRequest = n7eVar.a;
                if (!(chatRequest instanceof oh4)) {
                    num = Integer.valueOf((jSONObject == null || (A4 = vnj.A("ChatUnreadCount", jSONObject)) == null) ? 0 : A4.intValue());
                } else if (chatRequest instanceof rh4) {
                    if (z2) {
                        if (jSONObject != null && (A2 = vnj.A("UnreadCount", jSONObject)) != null) {
                            intValue = A2.intValue();
                            num = Integer.valueOf(intValue);
                        }
                        intValue = 0;
                        num = Integer.valueOf(intValue);
                    } else {
                        if (f9hVar4 != null && (num2 = (Integer) f9hVar4.get(((rh4) chatRequest).a)) != null) {
                            intValue = num2.intValue();
                            num = Integer.valueOf(intValue);
                        }
                        intValue = 0;
                        num = Integer.valueOf(intValue);
                    }
                } else {
                    if (!(chatRequest instanceof ph4) && chatRequest != null) {
                        b6e.s();
                        return;
                    }
                    num = f9hVar;
                }
                if (jSONObject != null && (A3 = vnj.A("ChatCount", jSONObject)) != null) {
                    i = A3.intValue();
                }
                longValue = (jSONObject != null || (C = vnj.C("Ttl", jSONObject)) == null) ? 0L : C.longValue();
                messengerParams.getClass();
                if (longValue <= 0) {
                    Integer valueOf3 = Integer.valueOf(i);
                    if (f9hVar3 != null) {
                        messengerParams.getClass();
                    }
                    if (f9hVar4 != null) {
                        messengerParams.getClass();
                    }
                    j = longValue;
                    nlt nltVar = new nlt(obj, num, valueOf3, f9hVar, f9hVar);
                    ilt iltVar = n7eVar.d;
                    if (iltVar != null) {
                        iltVar.invoke(nltVar);
                    }
                } else {
                    j = longValue;
                }
                millis = TimeUnit.SECONDS.toMillis(j);
                if (millis <= 0) {
                    n7eVar.k.postDelayed(new l7e(n7eVar, 2), millis);
                    return;
                } else {
                    n7eVar.b(new IllegalArgumentException("wrong ttl"));
                    n7eVar.f.sendEvent("wm_unread_count_error", uah.e(new Pair("reason", "wrong ttl"), new Pair("error", dfi.d(millis, "unread_count polling stopped because of wrong ttl "))));
                    return;
                }
            }
        }
        jSONObject = null;
        if (jSONObject == null) {
        }
        if (B != null) {
        }
        if (jSONObject == null) {
        }
        String str32 = "null cannot be cast to non-null type kotlin.Int";
        cls = Integer.class;
        String str42 = "Not implemented";
        Class cls32 = Integer.TYPE;
        Class cls42 = Long.TYPE;
        if (B2 != null) {
        }
        str = "null cannot be cast to non-null type kotlin.Int";
        cls2 = cls;
        str2 = "Not implemented";
        f9hVar = null;
        f9hVar2 = null;
        if (B2 != null) {
        }
        f9hVar3 = f9hVar2;
        f9hVar4 = f9hVar;
        ChatRequest chatRequest22 = n7eVar.a;
        MessengerParams messengerParams2 = n7eVar.e;
        z = chatRequest22 instanceof rh4;
        boolean z22 = this.b;
        i = 0;
        if (z) {
        }
        chatRequest = n7eVar.a;
        if (!(chatRequest instanceof oh4)) {
        }
        if (jSONObject != null) {
            i = A3.intValue();
        }
        if (jSONObject != null) {
        }
        messengerParams2.getClass();
        if (longValue <= 0) {
        }
        millis = TimeUnit.SECONDS.toMillis(j);
        if (millis <= 0) {
        }
    }

    @Override // defpackage.ps3
    public final void d(es3 es3Var, IOException iOException) {
        es3Var.getClass();
        n7e n7eVar = this.a;
        qdc qdcVar = n7eVar.f;
        Pair pair = new Pair("reason", "network error");
        String message = iOException.getMessage();
        if (message == null) {
            message = "";
        }
        qdcVar.sendEvent("wm_unread_count_error", uah.e(pair, new Pair("error", message)));
        n7eVar.b(iOException);
    }
}
