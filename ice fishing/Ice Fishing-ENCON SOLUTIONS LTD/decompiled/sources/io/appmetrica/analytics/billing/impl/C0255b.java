package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255b implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final i f3542a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0255b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(C0254a c0254a) {
        d dVar = new d();
        List list = c0254a.f3540a;
        ArrayList arrayList = new ArrayList(i1.k.E(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f3542a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f3553a = (c[]) array;
        dVar.f3554b = c0254a.f3541b;
        return dVar;
    }

    public C0255b(i iVar) {
        this.f3542a = iVar;
    }

    public /* synthetic */ C0255b(i iVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0254a toModel(d dVar) {
        c[] cVarArr = dVar.f3553a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f3542a.toModel(cVar));
        }
        return new C0254a(arrayList, dVar.f3554b);
    }
}
