package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.i8;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.ve;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class i0 extends androidx.core.app.n0 implements h0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.yandex.passport.internal.report.g gVar) {
        super(gVar);
        gVar.getClass();
    }

    public final void u(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, ArrayList arrayList) {
        fVar.getClass();
        n(i8.d, new com.yandex.passport.internal.report.f("all_apps", 29, false), new ff(fVar), new ue(fVar2), new ve(arrayList, 4));
    }

    public final void v(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, ArrayList arrayList) {
        fVar.getClass();
        n(i8.d, new com.yandex.passport.internal.report.f("this_app", 29, false), new ff(fVar), new ue(fVar2), new ve(arrayList, 4));
    }
}
