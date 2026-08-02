package com.yandex.passport.internal.network.mappers;

import com.yandex.passport.common.core.e;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.core.g;
import com.yandex.passport.data.models.w;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.m;
import defpackage.c5b;
import defpackage.e5b;
import defpackage.kac;
import defpackage.v75;
import defpackage.zhp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {
    public final com.yandex.passport.data.mapper.a a;

    public d(com.yandex.passport.data.mapper.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final com.yandex.passport.internal.b a(l lVar) {
        List list;
        String c;
        lVar.getClass();
        String str = lVar.a;
        String e = lVar.d.e();
        f fVar = lVar.b;
        fVar.getClass();
        StringBuilder sb = new StringBuilder();
        com.yandex.passport.common.core.b bVar = fVar.a;
        sb.append(bVar.a);
        sb.append(':');
        sb.append(fVar.b);
        String sb2 = sb.toString();
        g gVar = lVar.e;
        com.yandex.passport.data.mapper.a aVar = this.a;
        aVar.getClass();
        gVar.getClass();
        List list2 = gVar.C;
        if (Intrinsics.d(list2, e.b)) {
            list = c5b.a;
        } else {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(v75.o(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((e) it.next()).a);
            }
            list = arrayList;
        }
        String str2 = gVar.a;
        String str3 = gVar.b;
        long j = gVar.c;
        long j2 = gVar.d;
        String str4 = gVar.e;
        String str5 = gVar.f;
        String str6 = gVar.L;
        String str7 = gVar.g;
        int i = gVar.h;
        String str8 = gVar.i;
        String str9 = gVar.j;
        boolean z = gVar.k;
        String str10 = gVar.l;
        boolean z2 = gVar.m;
        String str11 = gVar.n;
        boolean z3 = gVar.o;
        boolean z4 = gVar.p;
        boolean z5 = gVar.q;
        String str12 = gVar.r;
        String str13 = gVar.s;
        String str14 = gVar.t;
        int i2 = gVar.u;
        String str15 = gVar.v;
        String str16 = gVar.w;
        boolean z6 = gVar.x;
        w wVar = new w(i, i2, j, j2, gVar.K, gVar.Y, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, gVar.y, list, gVar.X, z, z2, z3, z4, z5, z6, gVar.z, gVar.A, gVar.B, gVar.D, gVar.E, gVar.F, gVar.G, gVar.H, gVar.I, gVar.J, gVar.Z, false, false);
        if (str2 == null) {
            try {
                c = aVar.a.c(w.Companion.serializer(), wVar);
            } catch (Exception e2) {
                kac.k("Json serialization has failed", e2);
                return null;
            }
        } else {
            c = str2;
        }
        String c2 = com.yandex.passport.data.mapper.a.c(gVar.c, gVar.b);
        Map map = lVar.f.a;
        String jSONObject = map.isEmpty() ? null : new JSONObject(map).toString();
        String str17 = lVar.h;
        com.yandex.passport.api.impl.b P = com.yandex.plus.core.network.api.utils.a.P(bVar);
        return new com.yandex.passport.internal.b(str, e, sb2, c, c2, jSONObject, str17, (P.equals(com.yandex.passport.api.impl.b.e) || P.equals(com.yandex.passport.api.impl.b.f)) ? "TEST" : "PROD", lVar.d().d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0102, code lost:
    
        if (r4 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l b(com.yandex.passport.internal.b bVar) {
        f fVar;
        f fVar2;
        com.yandex.passport.internal.stash.a aVar;
        long parseLong;
        com.yandex.passport.common.core.b bVar2;
        com.yandex.passport.data.mapper.a aVar2 = this.a;
        bVar.getClass();
        String str = bVar.c;
        String str2 = bVar.d;
        com.yandex.passport.internal.g gVar = null;
        if (str == null || str2 == null) {
            com.yandex.passport.common.logger.b bVar3 = com.yandex.passport.common.logger.b.b;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(bVar3, null, "from: uidString or userInfoBody is null", 10);
            }
        } else {
            int R = StringsKt.R(str, ':', 0, false);
            if (R >= 1 && R != str.length() - 1) {
                String substring = str.substring(0, R);
                try {
                    parseLong = Long.parseLong(str.substring(R + 1));
                } catch (NumberFormatException unused) {
                }
                if (parseLong > 0) {
                    try {
                        com.yandex.passport.common.core.a aVar3 = com.yandex.passport.common.core.b.b;
                        int parseInt = Integer.parseInt(substring);
                        aVar3.getClass();
                        bVar2 = com.yandex.passport.common.core.a.b(parseInt);
                    } catch (Exception unused2) {
                        bVar2 = com.yandex.passport.common.core.b.c;
                    }
                    fVar = new f(bVar2, parseLong);
                    if (fVar != null) {
                        com.yandex.passport.common.logger.b bVar4 = com.yandex.passport.common.logger.b.b;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(bVar4, null, "from: unknown uid", 10);
                            return null;
                        }
                    } else {
                        String str3 = bVar.b;
                        if (str3 == null || str3.length() <= 0 || str3.equals("-")) {
                            str3 = null;
                        }
                        com.yandex.passport.common.account.a aVar4 = new com.yandex.passport.common.account.a(str3);
                        try {
                            String str4 = bVar.e;
                            aVar2.getClass();
                            Pair b = com.yandex.passport.data.mapper.a.b(str4);
                            String str5 = (String) b.a;
                            long j = ((com.yandex.passport.common.time.a) b.b).a;
                            aVar2.getClass();
                            str2.getClass();
                            g a = com.yandex.passport.data.mapper.a.a(w.a((w) aVar2.a.b(w.Companion.serializer(), str2), str2, str5, j));
                            Long l = a.Y;
                            if (l != null) {
                                long longValue = l.longValue();
                                com.yandex.passport.common.core.b bVar5 = fVar.a;
                                bVar5.getClass();
                                fVar2 = new f(bVar5, longValue);
                            } else {
                                fVar2 = null;
                            }
                            String str6 = bVar.f;
                            if (str6 != null) {
                                if (str6.length() == 0) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(str6);
                                        HashMap hashMap = new HashMap();
                                        Iterator<String> keys = jSONObject.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            if (!jSONObject.isNull(next)) {
                                                hashMap.put(next, jSONObject.getString(next));
                                            }
                                        }
                                        aVar = new com.yandex.passport.internal.stash.a(hashMap);
                                    } catch (JSONException unused3) {
                                        aVar = null;
                                    }
                                }
                            }
                            e5b e5bVar = e5b.a;
                            e5bVar.getClass();
                            aVar = new com.yandex.passport.internal.stash.a(e5bVar);
                            String str7 = bVar.i;
                            if (str7 != null) {
                                try {
                                    gVar = m.i(str7);
                                } catch (JSONException unused4) {
                                }
                                if (gVar != null) {
                                    String str8 = gVar.g;
                                    if (str8 != null) {
                                        aVar = aVar.b(com.yandex.passport.internal.stash.b.DISK_PIN_CODE, str8, false);
                                    }
                                    String str9 = gVar.h;
                                    if (str9 != null) {
                                        aVar = aVar.b(com.yandex.passport.internal.stash.b.MAIL_PIN_CODE, str9, false);
                                    }
                                }
                            }
                            return new l(bVar.a, fVar, fVar2, aVar4, a, aVar);
                        } catch (zhp e) {
                            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "from: invalid json", e);
                            }
                        }
                    }
                }
            }
            fVar = null;
            if (fVar != null) {
            }
        }
        return null;
    }
}
