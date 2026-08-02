package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.text_input_screen.ui;

import defpackage.npy0;
import defpackage.sls;
import defpackage.tpy0;
import defpackage.upy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class TextInputScreenRoot$getView$1$1$1$1$1$2$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        upy0 upy0Var = (upy0) this.receiver;
        String str = upy0Var.b.a.l;
        if (str != null) {
            upy0Var.y.x(str.concat(".Tapped"), null);
        }
        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.a aVar = upy0Var.c;
        npy0 npy0Var = upy0Var.w;
        aVar.a((String) npy0Var.a.getOrDefault(((tpy0) upy0Var.A.a.getValue()).a, ""));
        return zy11.a;
    }
}
