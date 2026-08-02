package ru.yandex.taxi.ui.form;

import defpackage.bcj0;
import defpackage.dcj0;
import defpackage.fmw0;
import defpackage.gbj0;
import defpackage.hcj0;
import defpackage.mcj0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class RequirementAddressFormModalView$onAttachedToWindow$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        gbj0 gbj0Var;
        hcj0 hcj0Var;
        mcj0 mcj0Var;
        dcj0 dcj0Var = (dcj0) this.receiver;
        fmw0 b = dcj0Var.C.b();
        String str = (b == null || (gbj0Var = b.o) == null || (hcj0Var = gbj0Var.a) == null || (mcj0Var = hcj0Var.a) == null) ? null : mcj0Var.c;
        ((bcj0) dcj0Var.Dg()).hideKeyboard();
        dcj0Var.D.c.a(str, "move_things_details_card");
        return zy11.a;
    }
}
