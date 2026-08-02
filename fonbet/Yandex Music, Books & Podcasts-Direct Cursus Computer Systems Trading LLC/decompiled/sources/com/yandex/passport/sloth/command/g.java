package com.yandex.passport.sloth.command;

import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.command.performers.j0;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.r0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.n2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g {
    public final k a;
    public final p b;
    public final a1 c;

    public g(k kVar, p pVar, a1 a1Var) {
        kVar.getClass();
        pVar.getClass();
        a1Var.getClass();
        this.a = kVar;
        this.b = pVar;
        this.c = a1Var;
    }

    public final String a(String str, String str2, String str3) {
        if (str3 == null) {
            return null;
        }
        com.yandex.passport.common.web.a[] aVarArr = com.yandex.passport.common.web.a.b;
        if (!Intrinsics.d(str, "getEbsAgeConfirmState")) {
            str.getClass();
            this.c.a(new n0(16, r0.MESSAGE_SENT, dfi.n(Constants.KEY_MESSAGE, str)));
        }
        String quote = JSONObject.quote(str3);
        return "window.nativeAMResponse.receive(" + JSONObject.quote(String.valueOf(str2)) + ", " + quote + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(c cVar, cg6 cg6Var) {
        f fVar;
        int i;
        r rVar;
        t tVar;
        n2b n2bVar;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fVar.k;
                nm6 nm6Var = nm6.a;
                i = fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fVar.j = cVar;
                    fVar.m = 1;
                    p pVar = this.b;
                    pVar.getClass();
                    com.yandex.passport.common.web.a aVar = cVar.a;
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        rVar = pVar.c;
                    } else if (ordinal == 1) {
                        rVar = pVar.e;
                    } else if (ordinal == 6) {
                        rVar = pVar.h;
                    } else if (ordinal == 7) {
                        rVar = pVar.j;
                    } else if (ordinal == 17) {
                        rVar = pVar.d;
                    } else if (ordinal == 18) {
                        rVar = pVar.i;
                    } else if (ordinal == 23) {
                        rVar = pVar.m;
                    } else if (ordinal == 30) {
                        rVar = pVar.p;
                    } else if (ordinal == 25) {
                        rVar = pVar.n;
                    } else if (ordinal != 26) {
                        switch (ordinal) {
                            case 11:
                                rVar = pVar.f;
                                break;
                            case 12:
                                rVar = pVar.g;
                                break;
                            case 13:
                                rVar = pVar.k;
                                break;
                            case 14:
                                rVar = pVar.l;
                                break;
                            default:
                                switch (ordinal) {
                                    case 32:
                                        rVar = pVar.q;
                                        break;
                                    case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                                        rVar = pVar.r;
                                        break;
                                    case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                                        rVar = pVar.s;
                                        break;
                                    case 35:
                                        rVar = pVar.u;
                                        break;
                                    default:
                                        com.yandex.passport.sloth.dependencies.g gVar = pVar.b;
                                        gVar.getClass();
                                        Iterator it = gVar.a.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                tVar = ((com.yandex.passport.sloth.dependencies.f) it.next()).a(aVar);
                                                if (tVar != null) {
                                                }
                                            } else {
                                                tVar = null;
                                            }
                                        }
                                        rVar = tVar != null ? new com.yandex.passport.common.network.n(pVar.a, tVar) : null;
                                        if (rVar == null) {
                                            j0 j0Var = n.a[aVar.ordinal()] == 19 ? pVar.t : null;
                                            if (j0Var == null) {
                                                rVar = new o();
                                                break;
                                            } else {
                                                rVar = j0Var;
                                                break;
                                            }
                                        }
                                        break;
                                }
                        }
                    } else {
                        rVar = pVar.o;
                    }
                    rVar.getClass();
                    obj = rVar.n(cVar.c, fVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = fVar.j;
                    qgg.h0(obj);
                }
                n2bVar = (n2b) obj;
                if (!(n2bVar instanceof l2b)) {
                    return a(cVar.a.a, cVar.b, ((s) ((l2b) n2bVar).a).a());
                }
                if (!(n2bVar instanceof m2b)) {
                    b6e.s();
                    return null;
                }
                d dVar = (d) ((m2b) n2bVar).a;
                String str = cVar.a.a;
                String str2 = cVar.b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", dVar.a);
                return a(str, str2, jSONObject.toString());
            }
        }
        fVar = new f(this, cg6Var);
        Object obj2 = fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar.m;
        if (i != 0) {
        }
        n2bVar = (n2b) obj2;
        if (!(n2bVar instanceof l2b)) {
        }
    }
}
