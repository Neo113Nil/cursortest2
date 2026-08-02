package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.home.datasource.openapi.models.e8;
import com.yandex.plus.home.datasource.openapi.models.g7;
import com.yandex.plus.home.datasource.openapi.models.j5;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.tah;
import defpackage.v24;
import defpackage.v75;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xz0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ o l;
    public final /* synthetic */ a m;
    public final /* synthetic */ j5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, j5 j5Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.l = oVar;
        this.n = j5Var;
        this.m = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h(this.l, this.m, this.n, continuation, 0);
            case 1:
                return new h(this.l, this.m, this.n, continuation, 1);
            default:
                return new h(this.l, this.n, this.m, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.core.accounts.h hVar = this.l.b;
                    g7 g7Var = this.n.c;
                    this.k = 1;
                    Object V = x97.V((kotlinx.coroutines.a) hVar.c, new com.yandex.plus.home.plaque.plugin.internal.defaults.e(hVar, this.m, g7Var, null, 1), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                Object obj3 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.core.accounts.h hVar2 = this.l.b;
                    g7 g7Var2 = this.n.d;
                    this.k = 1;
                    Object V2 = x97.V((kotlinx.coroutines.a) hVar2.c, new com.yandex.plus.home.plaque.plugin.internal.defaults.e(hVar2, this.m, g7Var2, null, 0), this);
                    if (V2 != obj3) {
                        V2 = Unit.a;
                    }
                    if (V2 == obj3) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                Object obj4 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    j5 j5Var = this.n;
                    List list = j5Var.b;
                    g7[] g7VarArr = {j5Var.c, j5Var.d};
                    o oVar = this.l;
                    oVar.getClass();
                    List list2 = list;
                    int a = tah.a(v75.o(list2, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                    for (Object obj5 : list2) {
                        linkedHashMap.put(((e8) obj5).getId(), obj5);
                    }
                    HashSet hashSet = new HashSet();
                    Iterator it = xz0.w(g7VarArr).iterator();
                    while (it.hasNext()) {
                        o.h(hashSet, linkedHashMap, ((g7) it.next()).c);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : list2) {
                        if (hashSet.contains(((e8) obj6).getId())) {
                            arrayList.add(obj6);
                        }
                    }
                    com.yandex.passport.internal.core.accounts.h hVar3 = oVar.b;
                    this.k = 1;
                    Object V3 = x97.V((kotlinx.coroutines.a) hVar3.c, new v24(hVar3, this.m, arrayList, (Continuation) null, 23), this);
                    if (V3 != nm6.a) {
                        V3 = Unit.a;
                    }
                    if (V3 == obj4) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o oVar, a aVar, j5 j5Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = oVar;
        this.m = aVar;
        this.n = j5Var;
    }
}
