package com.yandex.plus.pay.internal.benchmark.tarifficator;

import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.home.common.utils.f;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.reporter.api.d;
import com.yandex.plus.pay.reporter.api.e;
import defpackage.aur;
import defpackage.c5b;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends aur implements Function2 {
    public String j;
    public LinkedHashMap k;
    public int l;
    public final /* synthetic */ l m;
    public final /* synthetic */ b n;
    public final /* synthetic */ PlusPayCompositeOffers.Offer o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, b bVar, PlusPayCompositeOffers.Offer offer, Continuation continuation) {
        super(2, continuation);
        this.m = lVar;
        this.n = bVar;
        this.o = offer;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        String str;
        LinkedHashMap linkedHashMap;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer;
        Set set;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        b bVar = this.n;
        if (i == 0) {
            qgg.h0(obj);
            StringBuilder sb = new StringBuilder("Perf.");
            sb.append(this.m.a);
            String sb2 = sb.toString();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("duration", new Double(r1.b() / ((Number) b.g.getValue()).longValue()));
            linkedHashMap2.put("sdk_version", "110.0.0");
            linkedHashMap2.put("service", bVar.a);
            linkedHashMap2.put("brand", bVar.b.name());
            com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) bVar.c.invoke();
            String str2 = aVar != null ? aVar.a : null;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap2.put("testIds", str2);
            String str3 = aVar != null ? aVar.b : null;
            linkedHashMap2.put("triggeredTestIds", str3 != null ? str3 : "");
            List w0 = (aVar == null || (set = aVar.d) == null) ? null : CollectionsKt.w0(set);
            if (w0 == null) {
                w0 = c5b.a;
            }
            linkedHashMap2.put("flags", w0);
            PlusPayCompositeOffers.Offer offer = this.o;
            if (offer != null && (tariffOffer = offer.getTariffOffer()) != null) {
                linkedHashMap2.put("vendor", tariffOffer.getVendor().toString());
            }
            f fVar = bVar.e;
            this.j = sb2;
            this.k = linkedHashMap2;
            this.l = 1;
            Object H = fVar.H(this);
            if (H == nm6Var) {
                return nm6Var;
            }
            str = sb2;
            obj = H;
            linkedHashMap = linkedHashMap2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = this.k;
            str = this.j;
            qgg.h0(obj);
        }
        String str4 = (String) obj;
        if (str4 != null) {
            linkedHashMap.put("store_region", str4);
        }
        bVar.d.b(new e(d.e, str, linkedHashMap, (Throwable) null));
        return Unit.a;
    }
}
