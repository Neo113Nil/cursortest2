package ru.yandex.taxi.surge.widget;

import defpackage.hww0;
import defpackage.kgx;
import defpackage.lrv0;
import defpackage.qdx;
import defpackage.sls;
import defpackage.tse0;
import defpackage.xcv0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SummaryWidgetHolderImpl$showOnBoardingBubble$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        lrv0 lrv0Var = (lrv0) this.receiver;
        xcv0 xcv0Var = lrv0Var.C.b;
        xcv0Var.a.a("Summary.SurgePopup.Tapped", tse0.q(xcv0Var), 1, new HashMap());
        hww0 hww0Var = lrv0Var.y.c;
        qdx qdxVar = hww0Var.d;
        kgx[] kgxVarArr = hww0.f;
        hww0Var.d.setValue(hww0Var, kgxVarArr[1], Integer.valueOf(((Number) qdxVar.getValue(hww0Var, kgxVarArr[1])).intValue() + 1));
        r0 r0Var = hww0Var.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
