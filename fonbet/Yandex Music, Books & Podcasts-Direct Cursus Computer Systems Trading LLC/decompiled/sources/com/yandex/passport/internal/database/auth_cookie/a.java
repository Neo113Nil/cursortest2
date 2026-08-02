package com.yandex.passport.internal.database.auth_cookie;

import com.yandex.passport.common.core.f;
import defpackage.aur;
import defpackage.c5b;
import defpackage.cko;
import defpackage.gut;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qy0;
import defpackage.s7g;
import defpackage.t7o;
import defpackage.tkr;
import defpackage.up6;
import defpackage.v75;
import defpackage.w3f;
import defpackage.x3f;
import defpackage.xjo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ b k;
    public final /* synthetic */ f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = bVar;
        this.l = fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.k, this.l, continuation, 0);
            default:
                return new a(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((a) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        final f fVar = this.l;
        b bVar = this.k;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                final d dVar = bVar.a;
                return new Integer(((Integer) up6.F(dVar.a, false, true, new Function1(dVar, fVar, i3) { // from class: com.yandex.passport.internal.database.auth_cookie.c
                    public final /* synthetic */ int a;
                    public final /* synthetic */ f b;

                    {
                        this.a = i3;
                        this.b = fVar;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        cko D0;
                        switch (this.a) {
                            case 0:
                                f fVar2 = this.b;
                                D0 = ((xjo) obj2).D0("SELECT * from modern_auth_cookie WHERE uid = ?");
                                try {
                                    D0.E(1, x3f.d.c(com.yandex.passport.internal.serialization.a.a, fVar2));
                                    int v = s7g.v(D0, "uid");
                                    int v2 = s7g.v(D0, "cookies");
                                    int v3 = s7g.v(D0, "domain");
                                    ArrayList arrayList = new ArrayList();
                                    while (D0.q()) {
                                        String str = null;
                                        String x0 = D0.isNull(v) ? null : D0.x0(v);
                                        x0.getClass();
                                        w3f w3fVar = x3f.d;
                                        f fVar3 = (f) w3fVar.b(com.yandex.passport.internal.serialization.a.a, x0);
                                        String x02 = D0.isNull(v2) ? null : D0.x0(v2);
                                        x02.getClass();
                                        List list = (List) w3fVar.b(new qy0(tkr.a, 0), x02);
                                        if (!D0.isNull(v3)) {
                                            str = D0.x0(v3);
                                        }
                                        arrayList.add(new e(fVar3, list, str));
                                    }
                                    return arrayList;
                                } finally {
                                }
                            default:
                                f fVar4 = this.b;
                                xjo xjoVar = (xjo) obj2;
                                D0 = xjoVar.D0("DELETE FROM modern_auth_cookie WHERE uid = ?");
                                try {
                                    D0.E(1, x3f.d.c(com.yandex.passport.internal.serialization.a.a, fVar4));
                                    D0.q();
                                    return Integer.valueOf(gut.L(xjoVar));
                                } finally {
                                }
                        }
                    }
                })).intValue());
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                final d dVar2 = bVar.a;
                List<e> list = (List) up6.F(dVar2.a, true, false, new Function1(dVar2, fVar, i2) { // from class: com.yandex.passport.internal.database.auth_cookie.c
                    public final /* synthetic */ int a;
                    public final /* synthetic */ f b;

                    {
                        this.a = i2;
                        this.b = fVar;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        cko D0;
                        switch (this.a) {
                            case 0:
                                f fVar2 = this.b;
                                D0 = ((xjo) obj2).D0("SELECT * from modern_auth_cookie WHERE uid = ?");
                                try {
                                    D0.E(1, x3f.d.c(com.yandex.passport.internal.serialization.a.a, fVar2));
                                    int v = s7g.v(D0, "uid");
                                    int v2 = s7g.v(D0, "cookies");
                                    int v3 = s7g.v(D0, "domain");
                                    ArrayList arrayList = new ArrayList();
                                    while (D0.q()) {
                                        String str = null;
                                        String x0 = D0.isNull(v) ? null : D0.x0(v);
                                        x0.getClass();
                                        w3f w3fVar = x3f.d;
                                        f fVar3 = (f) w3fVar.b(com.yandex.passport.internal.serialization.a.a, x0);
                                        String x02 = D0.isNull(v2) ? null : D0.x0(v2);
                                        x02.getClass();
                                        List list2 = (List) w3fVar.b(new qy0(tkr.a, 0), x02);
                                        if (!D0.isNull(v3)) {
                                            str = D0.x0(v3);
                                        }
                                        arrayList.add(new e(fVar3, list2, str));
                                    }
                                    return arrayList;
                                } finally {
                                }
                            default:
                                f fVar4 = this.b;
                                xjo xjoVar = (xjo) obj2;
                                D0 = xjoVar.D0("DELETE FROM modern_auth_cookie WHERE uid = ?");
                                try {
                                    D0.E(1, x3f.d.c(com.yandex.passport.internal.serialization.a.a, fVar4));
                                    D0.q();
                                    return Integer.valueOf(gut.L(xjoVar));
                                } finally {
                                }
                        }
                    }
                });
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (e eVar : list) {
                    List list2 = eVar.b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        Serializable c = bVar.c.c((String) it.next(), "cookie");
                        if (c instanceof t7o) {
                            c = null;
                        }
                        arrayList2.add((String) c);
                    }
                    arrayList.add(e.a(eVar, com.yandex.plus.pay.ui.core.b.o(arrayList2, c5b.a)));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!((e) next).b.isEmpty()) {
                        arrayList3.add(next);
                    }
                }
                return arrayList3;
        }
    }
}
