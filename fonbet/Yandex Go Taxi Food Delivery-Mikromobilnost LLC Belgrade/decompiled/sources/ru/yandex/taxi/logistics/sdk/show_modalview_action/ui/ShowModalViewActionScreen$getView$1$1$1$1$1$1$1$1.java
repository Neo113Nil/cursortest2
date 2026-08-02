package ru.yandex.taxi.logistics.sdk.show_modalview_action.ui;

import defpackage.ds31;
import defpackage.hhg;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class ShowModalViewActionScreen$getView$1$1$1$1$1$1$1$1 extends FunctionReferenceImpl implements wls {
    public final void i(hhg hhgVar, String str) {
        c cVar = (c) this.receiver;
        cVar.x.b(null, str);
        tje.N(ds31.a(cVar), null, null, new ShowModalViewActionViewModel$onButtonClick$1(cVar, hhgVar, null), 3);
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        i((hhg) obj, (String) obj2);
        return zy11.a;
    }
}
