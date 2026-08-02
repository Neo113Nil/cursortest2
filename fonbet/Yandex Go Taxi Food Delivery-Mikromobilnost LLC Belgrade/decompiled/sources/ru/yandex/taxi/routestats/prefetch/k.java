package ru.yandex.taxi.routestats.prefetch;

import defpackage.boe0;
import defpackage.coe0;
import defpackage.rpo;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class k implements vpr {
    public final /* synthetic */ tse a;
    public final /* synthetic */ l b;
    public final /* synthetic */ boe0 c;

    public k(tse tseVar, l lVar, boe0 boe0Var) {
        this.a = tseVar;
        this.b = lVar;
        this.c = boe0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            List<rpo> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (rpo rpoVar : list2) {
                arrayList.add(new coe0(new zzs(rpoVar.a, rpoVar.b, rpoVar.c, null, null, 24), rpoVar.d));
            }
            tje.N(this.a, null, null, new RouteStatsPrefetchListener$onFirstContentfulPaint$1$1$1(this.b, arrayList, this.c, null), 3);
        }
        return zy11.a;
    }
}
