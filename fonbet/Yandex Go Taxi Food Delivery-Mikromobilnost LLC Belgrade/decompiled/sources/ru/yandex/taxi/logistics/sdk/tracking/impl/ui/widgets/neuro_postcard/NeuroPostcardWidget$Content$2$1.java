package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.j360;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class NeuroPostcardWidget$Content$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        j360 j360Var = (j360) this.receiver;
        if (str != null) {
            j360Var.j.x(str.concat(".Shown"), null);
        } else {
            j360Var.getClass();
        }
        return zy11.a;
    }
}
