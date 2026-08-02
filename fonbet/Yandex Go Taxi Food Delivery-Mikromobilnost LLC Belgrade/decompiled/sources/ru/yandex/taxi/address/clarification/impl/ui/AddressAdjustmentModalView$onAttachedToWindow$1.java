package ru.yandex.taxi.address.clarification.impl.ui;

import defpackage.gfq0;
import defpackage.gtd0;
import defpackage.tls;
import defpackage.wb1;
import defpackage.xtd0;
import defpackage.zp0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.address.clarification.UpdateReason;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class AddressAdjustmentModalView$onAttachedToWindow$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zp0 zp0Var = (zp0) this.receiver;
        ru.yandex.taxi.address.clarification.impl.repo.a aVar = zp0Var.E;
        xtd0 xtd0Var = ((gfq0) obj).a;
        List list = xtd0Var.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof gtd0) {
                arrayList.add(obj2);
            }
        }
        gtd0 gtd0Var = (gtd0) kotlin.collections.a.R(arrayList);
        aVar.e = gtd0Var != null ? gtd0Var.a : null;
        wb1 wb1Var = zp0Var.D;
        wb1Var.a(xtd0Var);
        wb1Var.g(xtd0Var, UpdateReason.UPDATE_PICKUP_POINT_BY_CLICK_IN_LIST);
        zp0Var.C.c(xtd0Var.e, zp0Var.x, zp0Var.L, aVar.e);
        return zy11.a;
    }
}
