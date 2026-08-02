package io.appmetrica.analytics.billing.impl;

import defpackage.tcc;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0145b implements ProtobufConverter {
    public final i a;

    public /* synthetic */ C0145b(i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(C0144a c0144a) {
        d dVar = new d();
        List list = c0144a.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.fromModel((BillingInfo) it.next()));
        }
        dVar.a = (c[]) arrayList.toArray(new c[0]);
        dVar.b = c0144a.b;
        return dVar;
    }

    public C0145b(i iVar) {
        this.a = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0145b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0144a toModel(d dVar) {
        c[] cVarArr = dVar.a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.a.toModel(cVar));
        }
        return new C0144a(arrayList, dVar.b);
    }
}
