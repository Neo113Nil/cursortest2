package ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui;

import defpackage.gw00;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class ManualTipScreenKt$ManualTipScreen$1$5$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        bVar.getClass();
        bVar.W("SharedOrderCard.Tapped", gw00.e(new Pair("button_name", "cancel")));
        bVar.b.a.dismiss();
        return zy11.a;
    }
}
