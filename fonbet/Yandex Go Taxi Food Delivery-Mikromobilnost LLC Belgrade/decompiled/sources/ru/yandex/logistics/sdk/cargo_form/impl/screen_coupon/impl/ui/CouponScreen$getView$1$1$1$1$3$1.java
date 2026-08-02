package ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.ui;

import defpackage.ds31;
import defpackage.evu0;
import defpackage.sls;
import defpackage.tje;
import defpackage.w1f;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class CouponScreen$getView$1$1$1$1$3$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m725invoke() {
        b bVar = (b) this.receiver;
        String str = ((w1f) bVar.w.getValue()).b.b.a;
        if (evu0.J(str)) {
            bVar.b.a.dismiss();
        } else {
            tje.N(ds31.a(bVar), null, null, new CouponViewModel$onConfirmClicked$1(bVar, str, null), 3);
        }
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m725invoke();
        return zy11.a;
    }
}
