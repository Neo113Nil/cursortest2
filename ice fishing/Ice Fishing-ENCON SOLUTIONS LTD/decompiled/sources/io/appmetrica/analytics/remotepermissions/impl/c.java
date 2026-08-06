package io.appmetrica.analytics.remotepermissions.impl;

import i1.AbstractC0252i;
import i1.k;
import i1.t;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f fromModel(a aVar) {
        f fVar = new f();
        Set set = aVar.f7563a;
        ArrayList arrayList = new ArrayList(k.E(set));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(z1.a.f8620a));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.f7571a = (byte[][]) array;
        return fVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a toModel(f fVar) {
        Set set;
        byte[][] bArr = fVar.f7571a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, z1.a.f8620a));
            }
            set = AbstractC0252i.V(arrayList);
        } else {
            set = t.f3418a;
        }
        return new a(set);
    }
}
