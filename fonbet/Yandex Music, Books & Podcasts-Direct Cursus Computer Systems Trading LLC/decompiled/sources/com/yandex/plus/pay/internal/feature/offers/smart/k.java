package com.yandex.plus.pay.internal.feature.offers.smart;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends aur implements Function2 {
    public int j;
    public final /* synthetic */ l k;
    public final /* synthetic */ String l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Set o;
    public final /* synthetic */ Set p;
    public final /* synthetic */ Set q;
    public final /* synthetic */ Set r;
    public final /* synthetic */ Map s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str, boolean z, String str2, Set set, Set set2, Set set3, Set set4, Map map, Continuation continuation) {
        super(2, continuation);
        this.k = lVar;
        this.l = str;
        this.m = z;
        this.n = str2;
        this.o = set;
        this.p = set2;
        this.q = set3;
        this.r = set4;
        this.s = map;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Set set;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        Set set2 = this.q;
        if (set2 != null) {
            Set set3 = set2;
            ArrayList arrayList = new ArrayList(v75.o(set3, 10));
            Iterator it = set3.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((com.yandex.plus.pay.api.analytics.e) it.next()).a));
            }
            set = CollectionsKt.A0(arrayList);
        } else {
            set = null;
        }
        Set set4 = set;
        this.j = 1;
        Object a = l.a(this.k, this.l, this.m, this.n, this.o, this.p, set4, this.r, this.s, this);
        return a == nm6Var ? nm6Var : a;
    }
}
