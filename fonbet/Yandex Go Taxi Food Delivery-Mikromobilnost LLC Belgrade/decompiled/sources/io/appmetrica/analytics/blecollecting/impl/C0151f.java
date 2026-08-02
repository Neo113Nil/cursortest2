package io.appmetrica.analytics.blecollecting.impl;

import defpackage.tcc;
import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0151f implements Converter {
    public final P a;
    public final I b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0151f(P p, I i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new P() : p, (i2 & 2) != 0 ? new I(null, 1, 0 == true ? 1 : 0) : i);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x fromModel(C0148c c0148c) {
        x xVar = new x();
        xVar.a = this.a.fromModel(c0148c.a);
        Set set = c0148c.b;
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.fromModel((G) it.next()));
        }
        xVar.b = (y[]) arrayList.toArray(new y[0]);
        xVar.c = c0148c.c;
        xVar.d = c0148c.d;
        return xVar;
    }

    public C0151f(P p, I i) {
        this.a = p;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0151f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0148c toModel(x xVar) {
        ScanSettingsConfig model = this.a.toModel(xVar.a);
        y[] yVarArr = xVar.b;
        ArrayList arrayList = new ArrayList(yVarArr.length);
        for (y yVar : yVarArr) {
            arrayList.add(this.b.toModel(yVar));
        }
        return new C0148c(model, kotlin.collections.a.N0(arrayList), xVar.c, xVar.d);
    }
}
