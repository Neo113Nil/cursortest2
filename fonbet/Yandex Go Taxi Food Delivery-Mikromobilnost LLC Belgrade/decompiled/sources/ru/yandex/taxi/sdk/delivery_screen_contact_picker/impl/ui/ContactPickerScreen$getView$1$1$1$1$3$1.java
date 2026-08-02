package ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui;

import defpackage.ibe;
import defpackage.sls;
import defpackage.ti91;
import defpackage.ueb0;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ContactPickerScreen$getView$1$1$1$1$3$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        d dVar = (d) this.receiver;
        ibe ibeVar = (ibe) dVar.z.getValue();
        if (ibeVar != null) {
            ti91 ti91Var = ibeVar.a;
            String str2 = ibeVar.c.a;
            boolean z = ti91Var instanceof ueb0;
            if (z) {
                str = ((ueb0) ti91Var).a;
            } else {
                if (z) {
                    w511.b();
                    return null;
                }
                str = "";
            }
            dVar.W(str, str2);
        }
        return zy11.a;
    }
}
