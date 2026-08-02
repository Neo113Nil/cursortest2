package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ei4 extends mbv {
    public final /* synthetic */ int c;
    public final /* synthetic */ fi4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei4(fi4 fi4Var, int i) {
        super("counter");
        this.c = i;
        this.d = fi4Var;
        switch (i) {
            case 1:
                super("unreadCountersByChats");
                break;
            default:
                break;
        }
    }

    @Override // defpackage.mbv
    public final void a(hie hieVar) {
        f9h f9hVar;
        int i;
        f9h f9hVar2;
        JSONObject B;
        Object intOrNull;
        Object valueOf;
        JSONObject B2;
        Object intOrNull2;
        Object valueOf2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        int i2;
        int i3 = this.c;
        fi4 fi4Var = this.d;
        switch (i3) {
            case 0:
                nzh nzhVar = hieVar.b;
                if (nzhVar != null) {
                    qdc qdcVar = fi4Var.h;
                    String str = "wm_js_counter_error " + nzhVar.a;
                    qdcVar.getClass();
                    dwt.b(new zya(18, qdcVar, str));
                    fi4Var.l(null);
                    return;
                }
                JSONObject jSONObject = hieVar.c;
                JSONObject optJSONObject3 = jSONObject != null ? jSONObject.optJSONObject("data") : null;
                if (optJSONObject3 != null) {
                    int optInt = optJSONObject3.optInt(Constants.KEY_VALUE);
                    int optInt2 = optJSONObject3.optInt("chatCount");
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("details");
                    Class cls = Integer.TYPE;
                    Class cls2 = Long.TYPE;
                    if (optJSONObject4 == null || (B2 = vnj.B("ns", optJSONObject4)) == null) {
                        f9hVar = null;
                    } else {
                        f9h f9hVar3 = new f9h();
                        Iterator<String> keys = B2.keys();
                        keys.getClass();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            lm4 a = ern.a(Integer.class);
                            if (a.equals(ern.a(String.class))) {
                                intOrNull2 = next;
                            } else if (a.equals(ern.a(cls2))) {
                                next.getClass();
                                intOrNull2 = StringsKt.r0(10, next);
                            } else if (!a.equals(ern.a(cls))) {
                                xq0.q("Not implemented");
                                return;
                            } else {
                                next.getClass();
                                intOrNull2 = StringsKt.toIntOrNull(next);
                            }
                            if (intOrNull2 == null) {
                                jj4.j("null cannot be cast to non-null type kotlin.Int");
                                return;
                            }
                            Integer num = (Integer) intOrNull2;
                            lm4 a2 = ern.a(Integer.class);
                            if (a2.equals(ern.a(String.class))) {
                                valueOf2 = B2.optString(next);
                            } else if (a2.equals(ern.a(cls2))) {
                                valueOf2 = Long.valueOf(B2.optLong(next));
                            } else {
                                if (!a2.equals(ern.a(cls))) {
                                    xq0.q("Not implemented");
                                    return;
                                }
                                valueOf2 = Integer.valueOf(B2.optInt(next));
                            }
                            if (valueOf2 == null) {
                                jj4.j("null cannot be cast to non-null type kotlin.Int");
                                return;
                            }
                            f9hVar3.put(num, (Integer) valueOf2);
                        }
                        f9hVar = f9hVar3.b();
                    }
                    if (optJSONObject4 == null || (B = vnj.B("bots", optJSONObject4)) == null) {
                        i = optInt;
                        f9hVar2 = null;
                    } else {
                        f9h f9hVar4 = new f9h();
                        Iterator<String> keys2 = B.keys();
                        keys2.getClass();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            lm4 a3 = ern.a(String.class);
                            if (a3.equals(ern.a(String.class))) {
                                intOrNull = next2;
                            } else if (a3.equals(ern.a(cls2))) {
                                next2.getClass();
                                intOrNull = StringsKt.r0(10, next2);
                            } else if (!a3.equals(ern.a(cls))) {
                                xq0.q("Not implemented");
                                return;
                            } else {
                                next2.getClass();
                                intOrNull = StringsKt.toIntOrNull(next2);
                            }
                            if (intOrNull == null) {
                                jj4.j("null cannot be cast to non-null type kotlin.String");
                                return;
                            }
                            String str2 = (String) intOrNull;
                            lm4 a4 = ern.a(Integer.class);
                            int i4 = optInt;
                            if (a4.equals(ern.a(String.class))) {
                                valueOf = B.optString(next2);
                            } else if (a4.equals(ern.a(cls2))) {
                                valueOf = Long.valueOf(B.optLong(next2));
                            } else {
                                if (!a4.equals(ern.a(cls))) {
                                    xq0.q("Not implemented");
                                    return;
                                }
                                valueOf = Integer.valueOf(B.optInt(next2));
                            }
                            if (valueOf == null) {
                                jj4.j("null cannot be cast to non-null type kotlin.Int");
                                return;
                            } else {
                                f9hVar4.put(str2, (Integer) valueOf);
                                optInt = i4;
                            }
                        }
                        i = optInt;
                        f9hVar2 = f9hVar4.b();
                    }
                    ndv ndvVar = fi4Var.w;
                    if (ndvVar != null) {
                        for (ldv ldvVar : CollectionsKt.w0(ndvVar.b)) {
                            ldvVar.getClass();
                            cr crVar = ldvVar.a;
                            crVar.g = Integer.valueOf(i);
                            crVar.f = Integer.valueOf(optInt2);
                            crVar.h = f9hVar;
                            crVar.i = f9hVar2;
                            ((HashMap) crVar.c).forEach(new kdv(0, new f5r(22, crVar)));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                nzh nzhVar2 = hieVar.b;
                if (nzhVar2 != null) {
                    qdc qdcVar2 = fi4Var.h;
                    String str3 = "wm_js_counter_error " + nzhVar2.a;
                    qdcVar2.getClass();
                    dwt.b(new zya(18, qdcVar2, str3));
                    fi4Var.l(null);
                    return;
                }
                JSONObject jSONObject2 = hieVar.c;
                if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("data")) == null || (optJSONObject2 = optJSONObject.optJSONObject(Constants.KEY_VALUE)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys3 = optJSONObject2.keys();
                keys3.getClass();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    int optInt3 = optJSONObject2.optInt(next3, 0);
                    next3.getClass();
                    arrayList.add(new mdv(next3, optInt3));
                }
                ndv ndvVar2 = fi4Var.w;
                if (ndvVar2 != null) {
                    List<mdv> w0 = CollectionsKt.w0(arrayList);
                    w0.getClass();
                    for (ldv ldvVar2 : CollectionsKt.w0(ndvVar2.b)) {
                        ldvVar2.getClass();
                        cr crVar2 = ldvVar2.a;
                        String str4 = ldvVar2.b.a;
                        HashMap hashMap = (HashMap) crVar2.d;
                        if (Intrinsics.d(str4, "*")) {
                            Integer num2 = (Integer) crVar2.e;
                            Integer num3 = (Integer) hashMap.get("*");
                            if ((w0 instanceof Collection) && w0.isEmpty()) {
                                i2 = 0;
                            } else {
                                Iterator it = w0.iterator();
                                i2 = 0;
                                while (it.hasNext()) {
                                    if (((mdv) it.next()).b > 0 && (i2 = i2 + 1) < 0) {
                                        u75.m();
                                        throw null;
                                    }
                                }
                            }
                            crVar2.e = Integer.valueOf(i2);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int i5 = 0;
                            for (mdv mdvVar : w0) {
                                String str5 = mdvVar.a;
                                int i6 = mdvVar.b;
                                linkedHashSet.add(str5);
                                Pair F = hld.F(str5);
                                if (F != null) {
                                    linkedHashSet.add(F.a);
                                    linkedHashSet.add(F.b);
                                }
                                i5 += i6;
                            }
                            boolean z = (Intrinsics.d(num2, (Integer) crVar2.e) && num3 != null && num3.intValue() == i5) ? false : true;
                            crVar2.O(i5, "*", z);
                            for (mdv mdvVar2 : w0) {
                                crVar2.O(mdvVar2.b, mdvVar2.a, z);
                            }
                            linkedHashSet.add("*");
                            Set keySet = hashMap.keySet();
                            keySet.getClass();
                            for (String str6 : wop.h(wop.i(keySet, crVar2.u()), linkedHashSet)) {
                                str6.getClass();
                                crVar2.P(0, str6, z);
                            }
                        } else {
                            jyr jyrVar = dwt.a;
                            if (w0.iterator().hasNext()) {
                                for (mdv mdvVar3 : w0) {
                                    crVar2.O(mdvVar3.b, mdvVar3.a, false);
                                }
                            } else {
                                crVar2.O(0, str4, false);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
