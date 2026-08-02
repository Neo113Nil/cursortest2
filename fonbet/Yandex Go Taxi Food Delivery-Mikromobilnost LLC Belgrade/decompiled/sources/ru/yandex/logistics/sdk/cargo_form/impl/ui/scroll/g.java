package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.a2y;
import defpackage.bvf0;
import defpackage.goe;
import defpackage.mth;
import defpackage.n4u0;
import defpackage.qjp0;
import defpackage.sip0;
import defpackage.tpr;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class g implements qjp0 {
    public final goe a;
    public final a2y b;

    public g(goe goeVar, a2y a2yVar) {
        this.a = goeVar;
        this.b = a2yVar;
    }

    @Override // defpackage.qjp0
    public final tpr a(String str) {
        LinkedHashMap linkedHashMap = this.a.a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = bvf0.c(null);
            linkedHashMap.put(str, obj);
        }
        return kotlinx.coroutines.flow.e.t(new m0(new sip0((n4u0) obj, 1), new mth(this.b.e, 6), new ScrollVisibilityRepositoryImpl$visibleFlow$2(3, null)));
    }
}
