package ru.yandex.taxi.surge.dialog.price_complain;

import defpackage.tje;
import defpackage.wls;
import defpackage.wuw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class SurgePriceComplainModalView$feedBackOptionsAdapter$1 extends FunctionReferenceImpl implements wls {
    public final void i(String str, boolean z) {
        wuw0 wuw0Var = (wuw0) this.receiver;
        tje.N(wuw0Var.Jg(), null, null, new SurgePriceComplainPresenter$changeSelectedIds$1(wuw0Var, str, z, null), 3);
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        i((String) obj, ((Boolean) obj2).booleanValue());
        return zy11.a;
    }
}
