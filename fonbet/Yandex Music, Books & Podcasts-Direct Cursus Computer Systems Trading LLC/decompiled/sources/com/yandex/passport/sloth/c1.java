package com.yandex.passport.sloth;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.i5f;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.uah;
import defpackage.x0q;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c1 implements com.yandex.passport.sloth.ui.a1 {
    public final com.yandex.passport.sloth.data.o0 a;
    public final /* synthetic */ d1 b;

    public c1(d1 d1Var) {
        this.b = d1Var;
        this.a = d1Var.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x039e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(android.net.Uri.parse(r18).getPath(), "/am/finish") != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03d1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(android.net.Uri.parse(r18).getPath(), "/am/finish") != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03f8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(com.yandex.passport.common.url.b.i(r18), "/profile") != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0407, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(android.net.Uri.parse(r18).getPath(), "/am/finish") != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02e5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.toString(), r6) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e7, code lost:
    
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x044f, code lost:
    
        if (r10.equals("ok") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0480, code lost:
    
        r3 = r5.a(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x047d, code lost:
    
        if (r10.equals("success") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0366, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.toString(), r6) == false) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0410  */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v31, types: [c5b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.passport.sloth.url.y a(String str) {
        String a;
        boolean z;
        ?? arrayList;
        boolean z2;
        com.yandex.passport.sloth.url.z zVar;
        int ordinal;
        String str2;
        com.yandex.passport.sloth.url.g0 g0Var;
        com.yandex.passport.sloth.url.y a2;
        Long l;
        str.getClass();
        d1 d1Var = this.b;
        com.yandex.passport.sloth.url.b0 b0Var = d1Var.d;
        com.yandex.passport.sloth.data.m mVar = b0Var.a;
        com.yandex.passport.internal.sloth.j jVar = b0Var.b;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "process(url=" + ((Object) com.yandex.passport.common.url.b.m(str)) + ')', 8);
        }
        com.yandex.passport.common.core.b bVar = mVar.b;
        com.yandex.passport.sloth.data.o0 o0Var = mVar.a;
        String c = jVar.c(bVar, null);
        if (o0Var instanceof com.yandex.passport.sloth.data.y) {
            String str3 = ((com.yandex.passport.sloth.data.y) o0Var).b;
            bVar.getClass();
            str3.getClass();
            a = ((com.yandex.passport.internal.network.h) jVar.a).b(bVar, str3);
        } else {
            a = o0Var instanceof com.yandex.passport.sloth.data.t ? jVar.a(bVar, ((com.yandex.passport.sloth.data.t) o0Var).c) : o0Var instanceof com.yandex.passport.sloth.data.c0 ? jVar.e(bVar, ((com.yandex.passport.sloth.data.c0) o0Var).c) : o0Var instanceof com.yandex.passport.sloth.data.a0 ? jVar.g(bVar) : o0Var instanceof com.yandex.passport.sloth.data.h0 ? jVar.f(bVar, ((com.yandex.passport.sloth.data.h0) o0Var).d) : c;
        }
        com.yandex.passport.sloth.data.m0 m0Var = o0Var instanceof com.yandex.passport.sloth.data.m0 ? (com.yandex.passport.sloth.data.m0) o0Var : null;
        long longValue = (m0Var == null || (l = m0Var.e) == null) ? 0L : l.longValue();
        com.yandex.passport.sloth.url.a0 a0Var = b0Var.c;
        a0Var.getClass();
        a.getClass();
        c.getClass();
        o0Var.getClass();
        bVar.getClass();
        com.yandex.passport.internal.sloth.p pVar = a0Var.b;
        pVar.getClass();
        com.yandex.passport.internal.ui.common.web.a aVar = pVar.b;
        if (aVar.b(str)) {
            zVar = com.yandex.passport.sloth.url.z.d;
        } else {
            if (!aVar.c(str)) {
                z = true;
                if (o0Var instanceof com.yandex.passport.sloth.data.d0) {
                    zVar = com.yandex.passport.sloth.url.z.a;
                } else {
                    a0Var.a.getClass();
                    if (o0Var instanceof com.yandex.passport.sloth.data.y) {
                        String str4 = com.yandex.passport.common.url.b.k(str) + "://" + com.yandex.passport.common.url.b.h(str) + com.yandex.passport.common.url.b.i(str);
                        if (str4.equals("https://passport-test.yandex.ru/auth") || str4.equals("https://passport.yandex.ru/auth")) {
                            zVar = com.yandex.passport.sloth.url.z.b;
                        }
                    }
                    String k = com.yandex.passport.common.url.b.k(str);
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = k.toLowerCase(locale);
                    lowerCase.getClass();
                    if (lowerCase.equals("https")) {
                        if (!com.yandex.passport.common.url.b.h(str).equalsIgnoreCase(com.yandex.passport.common.url.b.h(a)) && !com.yandex.passport.common.url.b.h(str).equalsIgnoreCase(com.yandex.passport.common.url.b.h(c)) && !com.yandex.passport.common.url.b.h(str).equalsIgnoreCase("webauth-ext.yandex.net") && !com.yandex.passport.common.url.b.h(str).equalsIgnoreCase("passport.toloka.ai")) {
                            com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) aVar.c;
                            hVar.getClass();
                            String str5 = hVar.l(bVar, longValue).a;
                            if (!com.yandex.passport.common.url.b.h(str).equals(com.yandex.passport.common.url.b.h(str5)) || !Intrinsics.d(com.yandex.passport.common.url.b.i(str), com.yandex.passport.common.url.b.i(str5))) {
                                com.yandex.passport.internal.config.g gVar = pVar.a;
                                gVar.getClass();
                                SharedPreferences a3 = gVar.a.a(bVar);
                                if (a3 == null) {
                                    arrayList = c5b.a;
                                } else {
                                    Map<String, ?> all = a3.getAll();
                                    all.getClass();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                                        String key = entry.getKey();
                                        key.getClass();
                                        if (kotlin.text.c.v(key, "location_webam_host_", false) || kotlin.text.c.v(key, "location_webam_yandex_host_", false) || kotlin.text.c.v(key, "location_webam_id_yandex_host_", false)) {
                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    Iterator it = linkedHashMap.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Object value = ((Map.Entry) it.next()).getValue();
                                        String str6 = value instanceof String ? (String) value : null;
                                        if (str6 != null) {
                                            arrayList.add(str6);
                                        }
                                    }
                                }
                                if (!arrayList.contains(com.yandex.passport.common.url.b.h(str))) {
                                    String h = com.yandex.passport.common.url.b.h(str);
                                    Locale locale2 = Locale.US;
                                    locale2.getClass();
                                    String lowerCase2 = h.toLowerCase(locale2);
                                    lowerCase2.getClass();
                                    z2 = !aVar.a(lowerCase2);
                                }
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    zVar = z2 ? com.yandex.passport.sloth.url.z.c : com.yandex.passport.sloth.url.z.a;
                }
                ordinal = zVar.ordinal();
                if (ordinal == 0) {
                    boolean z3 = z;
                    if (ordinal == z3) {
                        a2 = new com.yandex.passport.sloth.url.f0(str);
                    } else if (ordinal == 2) {
                        a2 = com.yandex.passport.sloth.url.d0.b;
                    } else if (ordinal == 3) {
                        a2 = new com.yandex.passport.sloth.url.e0(str, false);
                    } else {
                        if (ordinal != 4) {
                            b6e.s();
                            return null;
                        }
                        a2 = new com.yandex.passport.sloth.url.e0(str, z3);
                    }
                } else {
                    boolean z4 = z;
                    boolean z5 = false;
                    boolean z6 = o0Var instanceof com.yandex.passport.sloth.data.y;
                    if (z6) {
                        Uri build = Uri.parse(a).buildUpon().appendPath("auth").appendPath("finish").build();
                        Uri build2 = Uri.parse(jVar.c(bVar, null)).buildUpon().appendPath("finish").build();
                        String str7 = com.yandex.passport.common.url.b.k(str) + "://" + com.yandex.passport.common.url.b.h(str) + com.yandex.passport.common.url.b.i(str);
                        if (!Intrinsics.d(build.toString(), str7)) {
                        }
                        if (z5) {
                            l lVar = b0Var.e;
                            j0 j0Var = b0Var.d;
                            try {
                                str2 = Uri.parse(str).getQueryParameter("status");
                            } catch (Exception unused) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                int hashCode = str2.hashCode();
                                if (hashCode != -1867169789) {
                                    if (hashCode != -1367724422) {
                                        if (hashCode != 3548) {
                                            if (hashCode == 96784904 && str2.equals("error")) {
                                                a2 = lVar.a(str);
                                            }
                                        }
                                    } else if (str2.equals("cancel")) {
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "WebAm cancel", 8);
                                        }
                                        b0Var.f.a(o0.d);
                                        a2 = com.yandex.passport.sloth.url.c0.c;
                                    }
                                }
                            }
                            if (z6) {
                                if (com.yandex.passport.common.url.b.f(str, "error") != null) {
                                    a2 = lVar.a(str);
                                } else if (com.yandex.passport.common.url.b.f(str, "access_token") != null) {
                                    a2 = j0Var.a(str);
                                } else {
                                    g0Var = new com.yandex.passport.sloth.url.g0("");
                                    a2 = g0Var;
                                }
                            } else if (Intrinsics.d(com.yandex.passport.common.url.b.i(str), "/profile")) {
                                a2 = j0Var.a(str);
                            } else {
                                g0Var = new com.yandex.passport.sloth.url.g0("");
                                a2 = g0Var;
                            }
                        } else {
                            a2 = com.yandex.passport.sloth.url.c0.b;
                        }
                    } else {
                        if (o0Var instanceof com.yandex.passport.sloth.data.t) {
                            Uri build3 = Uri.parse(jVar.c(bVar, null)).buildUpon().appendPath("finish").build();
                            Uri build4 = Uri.parse(com.yandex.passport.common.url.b.k(a) + "://" + com.yandex.passport.common.url.b.h(a)).buildUpon().appendPath("am").appendPath("finish").build();
                            String str8 = com.yandex.passport.common.url.b.k(str) + "://" + com.yandex.passport.common.url.b.h(str) + com.yandex.passport.common.url.b.i(str);
                            if (!Intrinsics.d(build3.toString(), str8)) {
                            }
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.e0) {
                            if (Intrinsics.d(Uri.parse(str).getHost(), Uri.parse(jVar.c(bVar, Long.valueOf(((com.yandex.passport.sloth.data.e0) o0Var).c))).getHost())) {
                            }
                            z5 = true;
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.h0) {
                            if (Intrinsics.d(Uri.parse(str).getHost(), Uri.parse(jVar.f(bVar, ((com.yandex.passport.sloth.data.h0) o0Var).d)).getHost())) {
                            }
                            z5 = true;
                        } else if (com.yandex.passport.common.url.b.k(str).equals(com.yandex.passport.common.url.b.k(a))) {
                            if (com.yandex.passport.common.url.b.h(str).equals(com.yandex.passport.common.url.b.h(a))) {
                            }
                        }
                        if (z5) {
                        }
                    }
                }
                d1Var.i.a(new n0(16, r0.CHECK_URL, uah.e(new Pair("url", x0.a(str)), new Pair(CameraService.RESULT, a2.toString()))));
                return a2;
            }
            zVar = com.yandex.passport.sloth.url.z.e;
        }
        z = true;
        ordinal = zVar.ordinal();
        if (ordinal == 0) {
        }
        d1Var.i.a(new n0(16, r0.CHECK_URL, uah.e(new Pair("url", x0.a(str)), new Pair(CameraService.RESULT, a2.toString()))));
        return a2;
    }

    public final x0q b() {
        return this.b.c.c;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public final String c(String str) {
        str.getClass();
        com.yandex.passport.sloth.url.a aVar = this.b.h;
        aVar.getClass();
        if (aVar.a.d.d) {
            return (String) com.yandex.passport.sloth.url.a.b.get(str);
        }
        return null;
    }

    public final boolean d() {
        com.yandex.passport.sloth.data.o0 o0Var = this.b.a.a;
        return o0Var instanceof com.yandex.passport.sloth.data.r ? ((com.yandex.passport.sloth.data.r) o0Var).d().c : o0Var instanceof com.yandex.passport.sloth.data.n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        Object m2bVar;
        Object obj;
        com.yandex.passport.sloth.command.j jVar;
        com.yandex.passport.common.web.a aVar;
        com.yandex.passport.sloth.command.g gVar = this.b.b;
        a1 a1Var = gVar.c;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, ouj.k(')', "executeJsCommand(commandPayload: ", str), 8);
        }
        com.yandex.passport.sloth.command.k kVar = gVar.a;
        kVar.getClass();
        str.getClass();
        try {
            i5f i5fVar = kVar.a;
            i5fVar.getClass();
            jVar = (com.yandex.passport.sloth.command.j) i5fVar.b(com.yandex.passport.sloth.command.j.Companion.serializer(), str);
            com.yandex.passport.common.web.a[] values = com.yandex.passport.common.web.a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i];
                if (aVar.a.equals(jVar.b)) {
                    break;
                }
                i++;
            }
        } catch (IllegalArgumentException e) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Command parse error", e);
            }
            m2bVar = new m2b(new com.yandex.passport.sloth.command.e("N/A", "", com.yandex.passport.sloth.command.d.b));
        }
        if (aVar == null) {
            obj = new m2b(new com.yandex.passport.sloth.command.e(jVar.b, jVar.c, com.yandex.passport.sloth.command.d.c));
            if (!(obj instanceof l2b)) {
                com.yandex.passport.sloth.command.c cVar = (com.yandex.passport.sloth.command.c) ((l2b) obj).a;
                String str2 = cVar.a.a;
                com.yandex.passport.common.web.a[] aVarArr = com.yandex.passport.common.web.a.b;
                if (!Intrinsics.d(str2, "getEbsAgeConfirmState")) {
                    a1Var.a(new n0(16, r0.MESSAGE_RECEIVED, dfi.n(Constants.KEY_MESSAGE, cVar.a.a)));
                }
                Object b = gVar.b(cVar, cg6Var);
                return b == nm6.a ? b : (String) b;
            }
            if (!(obj instanceof m2b)) {
                b6e.s();
                return null;
            }
            com.yandex.passport.sloth.command.e eVar = (com.yandex.passport.sloth.command.e) ((m2b) obj).a;
            a1Var.a(new n0("Failed to parse bridge message: " + eVar, 3));
            String str3 = eVar.a;
            String str4 = eVar.b;
            com.yandex.passport.sloth.command.d dVar2 = eVar.c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", dVar2.a);
            return gVar.a(str3, str4, jSONObject.toString());
        }
        m2bVar = new l2b(kVar.a(aVar, jVar));
        obj = m2bVar;
        if (!(obj instanceof l2b)) {
        }
    }

    public final Object f(com.yandex.passport.sloth.ui.y0 y0Var, cg6 cg6Var) {
        Object a;
        d1 d1Var = this.b;
        a1 a1Var = d1Var.i;
        y0Var.getClass();
        a1Var.a(new n0(16, r0.UI_EVENT, dfi.n("ui_event", y0Var.toString())));
        com.yandex.passport.sloth.ui.z0 z0Var = d1Var.g;
        com.yandex.passport.sloth.data.m mVar = z0Var.c;
        a1 a1Var2 = z0Var.a;
        v vVar = z0Var.b;
        if (y0Var.equals(com.yandex.passport.sloth.ui.u0.b)) {
            boolean z = mVar.d.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onCrash " + z, 8);
            }
            if (z) {
                a = vVar.b(new o(true, z), cg6Var);
                if (a != nm6.a) {
                    a = Unit.a;
                }
            } else {
                a1Var2.a(new n0("crash", 7));
                a = vVar.d(c.a, cg6Var);
                if (a != nm6.a) {
                    a = Unit.a;
                }
            }
            if (a != nm6.a) {
                a = Unit.a;
            }
        } else if (y0Var.equals(com.yandex.passport.sloth.ui.u0.a)) {
            a = vVar.c(x.a, cg6Var);
            nm6 nm6Var = nm6.a;
            if (a != nm6Var) {
                a = Unit.a;
            }
            if (a != nm6Var) {
                a = Unit.a;
            }
        } else if (y0Var instanceof com.yandex.passport.sloth.ui.w0) {
            a = z0Var.a(((com.yandex.passport.sloth.ui.w0) y0Var).a, cg6Var);
            if (a != nm6.a) {
                a = Unit.a;
            }
        } else if (y0Var instanceof com.yandex.passport.sloth.ui.x0) {
            boolean z2 = mVar.d.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onFailedCurrentAuth " + z2, 8);
            }
            if (!z2) {
                a1Var2.a(new n0("webam", 7));
            }
            a = vVar.b(new o(false, z2), cg6Var);
            nm6 nm6Var2 = nm6.a;
            if (a != nm6Var2) {
                a = Unit.a;
            }
            if (a != nm6Var2) {
                a = Unit.a;
            }
        } else {
            if (!(y0Var instanceof com.yandex.passport.sloth.ui.v0)) {
                b6e.s();
                return null;
            }
            StringBuilder sb = new StringBuilder("errorCode=");
            com.yandex.passport.sloth.ui.v0 v0Var = (com.yandex.passport.sloth.ui.v0) y0Var;
            sb.append(v0Var.a);
            sb.append(" url=");
            sb.append((Object) com.yandex.passport.common.url.b.m(v0Var.b));
            Throwable th = new Throwable(sb.toString());
            a1Var2.getClass();
            com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) a1Var2.a;
            oVar.getClass();
            if (oVar.a()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("error", Log.getStackTraceString(th));
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                linkedHashMap.put(Constants.KEY_MESSAGE, message);
                oVar.a.a("show_unknown_error", linkedHashMap);
            }
            a = z0Var.a(false, cg6Var);
            if (a != nm6.a) {
                a = Unit.a;
            }
        }
        return a == nm6.a ? a : Unit.a;
    }
}
