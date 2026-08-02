package ru.yandex.taxi.linked_order.map.utils;

import defpackage.gh00;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class LinkedOrderFocusHolder$focus$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a aVar = (a) this.receiver;
        aVar.b = null;
        if (booleanValue) {
            ((gh00) aVar.a).e(aVar.d);
        } else {
            aVar.b();
        }
        return zy11.a;
    }
}
