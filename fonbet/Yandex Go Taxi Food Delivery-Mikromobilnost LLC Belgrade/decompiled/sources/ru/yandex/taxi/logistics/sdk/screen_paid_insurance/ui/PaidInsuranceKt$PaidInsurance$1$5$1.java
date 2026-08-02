package ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui;

import defpackage.jwh;
import defpackage.q990;
import defpackage.sls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class PaidInsuranceKt$PaidInsurance$1$5$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        q990 q990Var = (q990) this.receiver;
        jwh jwhVar = q990Var.a.c.a;
        jwhVar.a.o("PaidInsuranceInfo.Tapped.Done", null, new LinkedHashMap());
        q990Var.b.dismiss();
        return zy11.a;
    }
}
