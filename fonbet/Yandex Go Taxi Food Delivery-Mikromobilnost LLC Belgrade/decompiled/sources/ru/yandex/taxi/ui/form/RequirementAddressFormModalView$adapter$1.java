package ru.yandex.taxi.ui.form;

import defpackage.cgq0;
import defpackage.d800;
import defpackage.dcj0;
import defpackage.gcj0;
import defpackage.odf0;
import defpackage.sls;
import defpackage.tfb0;
import defpackage.tui;
import defpackage.v5c0;
import defpackage.wmj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class RequirementAddressFormModalView$adapter$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        dcj0 dcj0Var = (dcj0) this.receiver;
        gcj0 gcj0Var = dcj0Var.D;
        odf0 odf0Var = new odf0(19, dcj0Var);
        d800 d800Var = gcj0Var.a;
        wmj0 b = gcj0Var.b.b();
        String str = (String) b.c.get(b.e.a);
        if (str == null) {
            str = "";
        }
        d800Var.a(new tfb0(str, EmptyList.a, null, null, false, null, null, 261116), new v5c0(27, odf0Var), new tui(1), cgq0.a);
        return zy11.a;
    }
}
