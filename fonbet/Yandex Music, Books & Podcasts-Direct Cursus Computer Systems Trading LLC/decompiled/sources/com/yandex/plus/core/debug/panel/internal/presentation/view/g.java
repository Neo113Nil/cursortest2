package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.text.Editable;
import defpackage.nrn;
import defpackage.s9f;
import defpackage.u75;
import defpackage.v75;
import defpackage.xdr;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ g(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                s9f[] s9fVarArr = o.I;
                list.getClass();
                com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar = oVar.r;
                cVar.getClass();
                xdr xdrVar = cVar.o;
                do {
                    value = xdrVar.getValue();
                    List list2 = (List) value;
                    arrayList = new ArrayList(v75.o(list2, 10));
                    int i2 = 0;
                    for (Object obj2 : list2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            u75.n();
                            throw null;
                        }
                        arrayList.add(com.yandex.plus.core.debug.panel.internal.model.log.e.a((com.yandex.plus.core.debug.panel.internal.model.log.e) obj2, ((Boolean) list.get(i2)).booleanValue()));
                        i2 = i3;
                    }
                } while (!xdrVar.k(value, arrayList));
                cVar.p.l(null);
                cVar.a();
                return Unit.a;
            case 1:
                com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar2 = oVar.r;
                String valueOf = String.valueOf((Editable) obj);
                cVar2.getClass();
                if (StringsKt.U(valueOf)) {
                    cVar2.c();
                } else {
                    String obj3 = StringsKt.t0(valueOf).toString();
                    ArrayList arrayList3 = new ArrayList();
                    Regex.b.getClass();
                    obj3.getClass();
                    String quote = Pattern.quote(obj3);
                    quote.getClass();
                    Regex regex = new Regex(quote, nrn.IGNORE_CASE);
                    int i4 = 0;
                    for (Object obj4 : (Iterable) cVar2.i.getValue()) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            u75.n();
                            throw null;
                        }
                        for (MatchResult matchResult : Regex.c(regex, ((com.yandex.plus.core.debug.panel.internal.model.ui.d) obj4).b)) {
                            matchResult.getClass();
                            arrayList3.add(new com.yandex.plus.core.debug.panel.internal.model.log.g(i4, matchResult.b().a, matchResult.b().b + 1));
                        }
                        i4 = i5;
                    }
                    xdr xdrVar2 = cVar2.j;
                    xdrVar2.getClass();
                    xdrVar2.m(null, arrayList3);
                    cVar2.b();
                    cVar2.d(0);
                }
                return Unit.a;
            case 2:
                return o.j(oVar, ((Integer) obj).intValue());
            default:
                List list3 = (List) obj;
                s9f[] s9fVarArr2 = o.I;
                list3.getClass();
                com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                List w0 = CollectionsKt.w0(list3);
                cVar3.getClass();
                w0.getClass();
                xdr xdrVar3 = cVar3.n;
                do {
                    value2 = xdrVar3.getValue();
                    List list4 = (List) value2;
                    arrayList2 = new ArrayList(v75.o(list4, 10));
                    int i6 = 0;
                    for (Object obj5 : list4) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            u75.n();
                            throw null;
                        }
                        arrayList2.add(com.yandex.plus.core.debug.panel.internal.model.log.e.a((com.yandex.plus.core.debug.panel.internal.model.log.e) obj5, ((Boolean) w0.get(i6)).booleanValue()));
                        i6 = i7;
                    }
                } while (!xdrVar3.k(value2, arrayList2));
                cVar3.p.l(null);
                cVar3.a();
                return Unit.a;
        }
    }
}
