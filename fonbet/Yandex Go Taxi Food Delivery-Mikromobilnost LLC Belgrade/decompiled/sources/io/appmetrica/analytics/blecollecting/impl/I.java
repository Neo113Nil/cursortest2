package io.appmetrica.analytics.blecollecting.impl;

import defpackage.tcc;
import io.appmetrica.analytics.blewrapper.internal.config.ScanFilterConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class I implements Converter {
    public final L a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ I(L l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l);
        if ((i & 1) != 0) {
            l = new L(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y fromModel(G g) {
        y yVar = new y();
        Set set = g.a;
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.fromModel((ScanFilterConfig) it.next()));
        }
        yVar.a = (C[]) arrayList.toArray(new C[0]);
        yVar.b = g.b;
        yVar.c = g.c;
        String str = g.d;
        if (str != null) {
            yVar.d = str;
        }
        yVar.e = g.e;
        return yVar;
    }

    public I(L l) {
        this.a = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G toModel(y yVar) {
        C[] cArr = yVar.a;
        ArrayList arrayList = new ArrayList(cArr.length);
        for (C c : cArr) {
            arrayList.add(this.a.toModel(c));
        }
        return new G(kotlin.collections.a.N0(arrayList), yVar.b, yVar.c, yVar.d, yVar.e);
    }
}
