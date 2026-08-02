package com.yandex.music.shared.player.informer.data.storage;

import com.google.gson.Gson;
import defpackage.ael;
import defpackage.aur;
import defpackage.b6e;
import defpackage.bel;
import defpackage.c5b;
import defpackage.cel;
import defpackage.del;
import defpackage.eel;
import defpackage.fel;
import defpackage.hmm;
import defpackage.kel;
import defpackage.lpi;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ kel k;
    public final /* synthetic */ eel l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kel kelVar, eel eelVar, Continuation continuation) {
        super(2, continuation);
        this.k = kelVar;
        this.l = eelVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.k, this.l, continuation);
        bVar.j = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((hmm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        List list;
        PlayerInformerImpressionsParser$PlayerInformerImpressionJson playerInformerImpressionsParser$PlayerInformerImpressionJson;
        fel felVar;
        hmm hmmVar = (hmm) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpi b = hmmVar.b();
        hmm.a aVar = kel.d;
        String str = (String) b.a(aVar);
        kel kelVar = this.k;
        if (str == null || (list = ((a) kelVar.c.getValue()).a(str)) == null) {
            list = c5b.a;
        }
        kelVar.getClass();
        ArrayList arrayList = new ArrayList(kel.d(list));
        arrayList.add(this.l);
        a aVar2 = (a) kelVar.c.getValue();
        aVar2.getClass();
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eel eelVar = (eel) it.next();
            if (eelVar instanceof ael) {
                ael aelVar = (ael) eelVar;
                String b2 = aelVar.b();
                String u = aelVar.u();
                long a = aelVar.a();
                if (aelVar instanceof cel) {
                    felVar = fel.a;
                } else {
                    if (!(aelVar instanceof del)) {
                        b6e.s();
                        return null;
                    }
                    felVar = fel.b;
                }
                playerInformerImpressionsParser$PlayerInformerImpressionJson = new PlayerInformerImpressionsParser$PlayerInformerImpressionJson(felVar, b2, u, Long.valueOf(a));
            } else {
                if (!(eelVar instanceof bel)) {
                    b6e.s();
                    return null;
                }
                bel belVar = (bel) eelVar;
                playerInformerImpressionsParser$PlayerInformerImpressionJson = new PlayerInformerImpressionsParser$PlayerInformerImpressionJson(fel.c, null, belVar.a, Long.valueOf(belVar.b));
            }
            arrayList2.add(playerInformerImpressionsParser$PlayerInformerImpressionJson);
        }
        String j = ((Gson) aVar2.a.getValue()).j(arrayList2);
        if (j == null) {
            j = "[]";
        }
        b.h(aVar, j);
        return b;
    }
}
