package com.yandex.passport.common.core;

import com.yandex.passport.common.ebs.l;
import com.yandex.passport.common.ebs.m;
import com.yandex.passport.common.ebs.n;
import com.yandex.passport.common.ebs.o;
import com.yandex.passport.common.ebs.p;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.common.network.d0;
import com.yandex.passport.common.network.g0;
import com.yandex.passport.common.network.h;
import com.yandex.passport.common.network.i;
import com.yandex.passport.common.network.j;
import com.yandex.passport.common.network.u;
import com.yandex.passport.data.models.k;
import com.yandex.passport.data.models.v;
import com.yandex.passport.data.models.w;
import com.yandex.passport.data.network.b0;
import com.yandex.passport.data.network.c9;
import com.yandex.passport.data.network.core.q;
import com.yandex.passport.data.network.d3;
import com.yandex.passport.data.network.d4;
import com.yandex.passport.data.network.d7;
import com.yandex.passport.data.network.d8;
import com.yandex.passport.data.network.db;
import com.yandex.passport.data.network.e0;
import com.yandex.passport.data.network.e9;
import com.yandex.passport.data.network.eb;
import com.yandex.passport.data.network.ec;
import com.yandex.passport.data.network.f1;
import com.yandex.passport.data.network.f9;
import com.yandex.passport.data.network.fa;
import com.yandex.passport.data.network.h4;
import com.yandex.passport.data.network.h8;
import com.yandex.passport.data.network.i0;
import com.yandex.passport.data.network.i8;
import com.yandex.passport.data.network.i9;
import com.yandex.passport.data.network.ib;
import com.yandex.passport.data.network.j8;
import com.yandex.passport.data.network.k8;
import com.yandex.passport.data.network.l8;
import com.yandex.passport.data.network.lc;
import com.yandex.passport.data.network.m9;
import com.yandex.passport.data.network.o8;
import com.yandex.passport.data.network.qb;
import com.yandex.passport.data.network.r2;
import com.yandex.passport.data.network.r6;
import com.yandex.passport.data.network.ra;
import com.yandex.passport.data.network.rb;
import com.yandex.passport.data.network.s6;
import com.yandex.passport.data.network.s8;
import com.yandex.passport.data.network.va;
import com.yandex.passport.data.network.w6;
import com.yandex.passport.data.network.wb;
import com.yandex.passport.data.network.x;
import com.yandex.passport.data.network.x8;
import com.yandex.passport.data.network.xa;
import com.yandex.passport.data.network.y5;
import com.yandex.passport.data.network.y7;
import com.yandex.passport.data.network.z6;
import defpackage.b6e;
import defpackage.i5f;
import defpackage.l3o;
import defpackage.vit;
import defpackage.wd7;
import defpackage.x7j;
import defpackage.xq0;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements com.yandex.passport.data.network.core.f, com.yandex.passport.data.network.core.e {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static b b(int i) {
        Object obj;
        Iterator it = b.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((b) obj).a == i) {
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar != null) {
            return bVar;
        }
        xq0.k(i, "No environment for integer ");
        return null;
    }

    @Override // com.yandex.passport.data.network.core.f
    public Object a(Object obj, i iVar) {
        i8 i8Var = null;
        r5 = null;
        r5 = null;
        String str = null;
        i8Var = null;
        switch (this.a) {
            case 2:
                ((x) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    return new o(((b0) ((h) iVar).a).a);
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                List list = ((g0) ((com.yandex.passport.common.network.f) iVar).a).a;
                if (list.contains("biometrics_ebs.verified_age_restriction")) {
                    return p.a;
                }
                if (list.contains("biometrics_ebs.consent_needed")) {
                    return m.a;
                }
                if (list.contains("biometrics_ebs.bio_incorrect")) {
                    return l.a;
                }
                if (list.contains("biometrics_ebs.ebs_registration_pending")) {
                    return n.a;
                }
                com.yandex.passport.data.exceptions.g.a(list);
                throw null;
            case 3:
                ((e0) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    i0 i0Var = (i0) ((h) iVar).a;
                    return new com.yandex.passport.common.ebs.f(i0Var.a, i0Var.b);
                }
                if (iVar instanceof com.yandex.passport.common.network.f) {
                    com.yandex.passport.data.exceptions.g.a(((g0) ((com.yandex.passport.common.network.f) iVar).a).a);
                    throw null;
                }
                b6e.s();
                return null;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 19:
            case 24:
            default:
                ((com.yandex.passport.data.network.token.a) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    String str2 = ((com.yandex.passport.data.network.token.e) ((h) iVar).a).a;
                    if (str2 != null && str2.length() > 0 && !str2.equals("-")) {
                        str = str2;
                    }
                    return new com.yandex.passport.common.account.a(str);
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                d0 d0Var = (d0) ((com.yandex.passport.common.network.f) iVar).a;
                BackendError backendError = d0Var.a;
                if (backendError != BackendError.BAD_VERIFICATION_CODE) {
                    com.yandex.plus.core.locale.b.v(backendError);
                    throw null;
                }
                String d0Var2 = d0Var.toString();
                String str3 = d0Var.b;
                if (str3 == null) {
                    str3 = "";
                }
                throw new com.yandex.passport.data.exceptions.m(d0Var2, str3);
            case 7:
                ((d4) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    return (h4) ((h) iVar).a;
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                d0 d0Var3 = (d0) ((com.yandex.passport.common.network.f) iVar).a;
                if (Intrinsics.d(d0Var3.b, "forbidden account type")) {
                    throw new com.yandex.passport.data.exceptions.h("forbidden account type");
                }
                com.yandex.plus.core.locale.b.v(d0Var3.a);
                throw null;
            case 10:
                ((s6) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    return (w6) ((h) iVar).a;
                }
                if (iVar instanceof com.yandex.passport.common.network.f) {
                    com.yandex.plus.core.locale.b.v(((r6) ((com.yandex.passport.common.network.f) iVar).a).a);
                    throw null;
                }
                b6e.s();
                return null;
            case 12:
                ((z6) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    return (d7) ((h) iVar).a;
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                d0 d0Var4 = (d0) ((com.yandex.passport.common.network.f) iVar).a;
                String str4 = d0Var4.b;
                BackendError backendError2 = d0Var4.a;
                if (Intrinsics.d(str4, "forbidden account type")) {
                    throw new com.yandex.passport.data.exceptions.h("forbidden account type");
                }
                if (backendError2 == BackendError.INVALID_GRANT) {
                    String str5 = d0Var4.b;
                    if (Intrinsics.d(str5, "Current_muid missing")) {
                        throw new com.yandex.passport.data.exceptions.d();
                    }
                    if (Intrinsics.d(str5, "SMS not secure enough")) {
                        throw new com.yandex.passport.data.exceptions.c();
                    }
                }
                com.yandex.plus.core.locale.b.v(backendError2);
                throw null;
            case 14:
                d8 d8Var = (d8) obj;
                d8Var.getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    String str6 = d8Var.b;
                    h8 h8Var = (h8) ((h) iVar).a;
                    String str7 = h8Var.c;
                    i8Var = new i8(str6, Intrinsics.d(str7, "otp_auth_not_ready") ? j8.a : Intrinsics.d(str7, "otp_auth_finished") ? k8.a : new l8(h8Var.c));
                } else if (iVar instanceof com.yandex.passport.common.network.f) {
                    List list2 = ((u) ((com.yandex.passport.common.network.f) iVar).a).a;
                    Iterator it = list2.iterator();
                    if (it.hasNext()) {
                        BackendError backendError3 = (BackendError) it.next();
                        com.yandex.passport.common.network.a aVar = BackendError.Companion;
                        com.yandex.plus.core.locale.b.v(backendError3);
                        throw null;
                    }
                    b6e.l(list2, "Internal error: Can't throw exception for error list ");
                } else {
                    b6e.s();
                }
                return i8Var;
            case 16:
                ((o8) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    return (s8) ((h) iVar).a;
                }
                if (iVar instanceof com.yandex.passport.common.network.f) {
                    com.yandex.plus.core.locale.b.v(((d0) ((com.yandex.passport.common.network.f) iVar).a).a);
                    throw null;
                }
                b6e.s();
                return null;
            case 17:
                ((x8) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    e9 e9Var = (e9) ((h) iVar).a;
                    v vVar = w.Companion;
                    String str8 = e9Var.a;
                    c9 c9Var = e9Var.d;
                    String str9 = e9Var.b;
                    long j = e9Var.c;
                    vVar.getClass();
                    w a = v.a(j, str8, str9);
                    String str10 = c9Var.a;
                    return new f9(a, str10 != null ? new f1(str10, c9Var.b, c9Var.c, c9Var.d, c9Var.e, c9Var.f) : null, c9Var.g, c9Var.h, c9Var.i);
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                List list3 = ((u) ((com.yandex.passport.common.network.f) iVar).a).a;
                Iterator it2 = list3.iterator();
                if (!it2.hasNext()) {
                    b6e.l(list3, "Internal error: Can't throw exception for error list ");
                    return null;
                }
                BackendError backendError4 = (BackendError) it2.next();
                com.yandex.passport.common.network.a aVar2 = BackendError.Companion;
                com.yandex.plus.core.locale.b.v(backendError4);
                throw null;
            case 18:
                ((i9) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    return new d(((m9) ((h) iVar).a).a);
                }
                if (iVar instanceof com.yandex.passport.common.network.f) {
                    com.yandex.passport.data.exceptions.g.a(((g0) ((com.yandex.passport.common.network.f) iVar).a).a);
                    throw null;
                }
                b6e.s();
                return null;
            case 20:
                ((fa) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    return Unit.a;
                }
                if (iVar instanceof com.yandex.passport.common.network.f) {
                    com.yandex.plus.core.locale.b.v(((d0) ((com.yandex.passport.common.network.f) iVar).a).a);
                    throw null;
                }
                b6e.s();
                return null;
            case 21:
                ((ra) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    va vaVar = (va) ((h) iVar).a;
                    return new k(vaVar.c, vaVar.d, TimeUnit.SECONDS.toMillis(vaVar.b));
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                u uVar = (u) ((com.yandex.passport.common.network.f) iVar).a;
                if (BackendError.PHONE_NUMBER_ALREADY_CONFIRMED_ERROR == ((BackendError) CollectionsKt.Q(uVar.a))) {
                    return new com.yandex.passport.data.models.l();
                }
                List list4 = uVar.a;
                Iterator it3 = list4.iterator();
                if (it3.hasNext()) {
                    com.yandex.plus.core.locale.b.v((BackendError) it3.next());
                    throw null;
                }
                b6e.l(list4, "Internal error: Can't throw exception for error list ");
                return null;
            case 22:
                ((xa) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    return Unit.a;
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                List list5 = ((u) ((com.yandex.passport.common.network.f) iVar).a).a;
                Iterator it4 = list5.iterator();
                if (!it4.hasNext()) {
                    b6e.l(list5, "Internal error: Can't throw exception for error list ");
                    return null;
                }
                BackendError backendError5 = (BackendError) it4.next();
                com.yandex.passport.common.network.a aVar3 = BackendError.Companion;
                com.yandex.plus.core.locale.b.v(backendError5);
                throw null;
            case 23:
                ((eb) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    ib ibVar = (ib) ((h) iVar).a;
                    return new db(ibVar.a, ibVar.b, ibVar.c, ibVar.d, ibVar.e);
                }
                if (iVar instanceof com.yandex.passport.common.network.f) {
                    com.yandex.passport.data.exceptions.g.a(((g0) ((com.yandex.passport.common.network.f) iVar).a).a);
                    throw null;
                }
                b6e.s();
                return null;
            case 25:
                ((rb) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    wb wbVar = (wb) ((h) iVar).a;
                    return new qb(Intrinsics.d(wbVar.a, "available"), String.valueOf(wbVar.b));
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                d0 d0Var5 = (d0) ((com.yandex.passport.common.network.f) iVar).a;
                BackendError backendError6 = d0Var5.a;
                if (backendError6 == BackendError.DEVICE_MAX_COUNT) {
                    return new qb(false, String.valueOf(d0Var5.c));
                }
                com.yandex.plus.core.locale.b.v(backendError6);
                throw null;
            case 26:
                ((ec) obj).getClass();
                iVar.getClass();
                if (iVar instanceof h) {
                    lc lcVar = (lc) ((h) iVar).a;
                    return new com.yandex.passport.data.models.n(lcVar.b.a, lcVar.c, lcVar.d);
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                List list6 = ((u) ((com.yandex.passport.common.network.f) iVar).a).a;
                Iterator it5 = list6.iterator();
                if (!it5.hasNext()) {
                    b6e.l(list6, "Internal error: Can't throw exception for error list ");
                    return null;
                }
                BackendError backendError7 = (BackendError) it5.next();
                com.yandex.passport.common.network.a aVar4 = BackendError.Companion;
                com.yandex.plus.core.locale.b.v(backendError7);
                throw null;
            case 27:
                iVar.getClass();
                if (iVar instanceof h) {
                    return ((h) iVar).a;
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                List list7 = ((u) ((com.yandex.passport.common.network.f) iVar).a).a;
                Iterator it6 = list7.iterator();
                if (!it6.hasNext()) {
                    b6e.l(list7, "Internal error: Can't throw exception for error list ");
                    return null;
                }
                BackendError backendError8 = (BackendError) it6.next();
                com.yandex.passport.common.network.a aVar5 = BackendError.Companion;
                com.yandex.plus.core.locale.b.v(backendError8);
                throw null;
        }
    }

    @Override // com.yandex.passport.data.network.core.e
    public i g(l3o l3oVar) {
        i fVar;
        int i = this.a;
        l3oVar.getClass();
        switch (i) {
            case 4:
                try {
                    String a = l3oVar.f.a("Date");
                    Date a2 = a != null ? wd7.a(a) : null;
                    String valueOf = a2 != null ? String.valueOf(a2.getTime() / 1000) : null;
                    String q = com.yandex.plus.pay.ui.core.b.q(l3oVar);
                    i5f i5fVar = q.a;
                    i5fVar.getClass();
                    i iVar = (i) i5fVar.b(i.Companion.serializer(r2.Companion.serializer(), u.Companion.serializer()), q);
                    iVar.getClass();
                    if (iVar instanceof h) {
                        r2 r2Var = (r2) ((h) iVar).a;
                        r2Var.getClass();
                        fVar = new h(new com.yandex.passport.data.models.h(r2Var, valueOf));
                    } else {
                        if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                            throw new x7j();
                        }
                        fVar = new com.yandex.passport.common.network.f(((com.yandex.passport.common.network.f) iVar).a);
                    }
                    l3oVar.close();
                    return fVar;
                } finally {
                }
            case 5:
                try {
                    String q2 = com.yandex.plus.pay.ui.core.b.q(l3oVar);
                    i5f i5fVar2 = q.a;
                    i5fVar2.getClass();
                    h hVar = new h(new com.yandex.passport.data.models.d((d3) i5fVar2.b(d3.Companion.serializer(), q2), q2));
                    l3oVar.close();
                    return hVar;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 6:
                return (i) q.a.b(new j(h4.Companion.serializer(), d0.Companion.serializer(), 1), com.yandex.plus.pay.ui.core.b.q(l3oVar));
            case 8:
                try {
                    String q3 = com.yandex.plus.pay.ui.core.b.q(l3oVar);
                    i5f i5fVar3 = q.a;
                    i5fVar3.getClass();
                    h hVar2 = new h((y5) i5fVar3.b(y5.Companion.serializer(), q3));
                    l3oVar.close();
                    return hVar2;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 9:
                return (i) q.a.b(new j(w6.Companion.serializer(), r6.Companion.serializer(), 1), com.yandex.plus.pay.ui.core.b.q(l3oVar));
            case 11:
                return (i) q.a.b(new j(d7.Companion.serializer(), d0.Companion.serializer(), 1), com.yandex.plus.pay.ui.core.b.q(l3oVar));
            case 13:
                try {
                    String q4 = com.yandex.plus.pay.ui.core.b.q(l3oVar);
                    i5f i5fVar4 = q.a;
                    i5fVar4.getClass();
                    h hVar3 = new h((y7) i5fVar4.b(y7.Companion.serializer(), q4));
                    l3oVar.close();
                    return hVar3;
                } finally {
                }
            case 15:
                return (i) q.a.b(new j(s8.Companion.serializer(), d0.Companion.serializer(), 1), com.yandex.plus.pay.ui.core.b.q(l3oVar));
            case 19:
                return (i) q.a.b(new j(vit.b, d0.Companion.serializer(), 1), com.yandex.plus.pay.ui.core.b.q(l3oVar));
            case 24:
                return (i) q.a.b(new j(wb.Companion.serializer(), d0.Companion.serializer(), 2), com.yandex.plus.pay.ui.core.b.q(l3oVar));
            default:
                return (i) q.a.b(new j(com.yandex.passport.data.network.token.e.Companion.serializer(), d0.Companion.serializer(), 1), com.yandex.plus.pay.ui.core.b.q(l3oVar));
        }
    }
}
