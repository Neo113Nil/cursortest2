package com.yandex.plus.webview.internal.contract.impl.loading;

import defpackage.b85;
import defpackage.lbq;
import defpackage.pjc;
import defpackage.v75;
import defpackage.vdr;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class i extends a {
    @Override // com.yandex.plus.webview.internal.contract.impl.loading.a
    public final vdr k(com.yandex.passport.legacy.lx.f fVar) {
        ArrayList C = b85.C(fVar.a, com.yandex.plus.webview.api.contract.j.class);
        ArrayList arrayList = new ArrayList(v75.o(C, 10));
        Iterator it = C.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.plus.webview.api.contract.j) it.next()).q());
        }
        return zsd.F0(new com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b(6, (pjc[]) CollectionsKt.w0(arrayList).toArray(new pjc[0])), this.e, lbq.b, Boolean.FALSE);
    }
}
