package ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui;

import defpackage.nde;
import defpackage.rae;
import defpackage.s9e;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ContactPickerScreen$getView$1$1$1$1$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        s9e a;
        rae raeVar = ((d) this.receiver).b;
        nde ndeVar = raeVar.a;
        if (ndeVar.g == null && (a = raeVar.a(ndeVar.i, null)) != null) {
            ndeVar.h.invoke(a);
        }
        raeVar.b.dismiss();
        return zy11.a;
    }
}
