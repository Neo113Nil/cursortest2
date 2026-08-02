package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.text_input_screen.ui;

import defpackage.aqy0;
import defpackage.gci0;
import defpackage.npy0;
import defpackage.tls;
import defpackage.tpy0;
import defpackage.u460;
import defpackage.upy0;
import defpackage.w460;
import defpackage.zhu0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class TextInputScreenRoot$getView$1$1$1$1$1$3$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        w460 w460Var;
        CharSequence charSequence;
        String str;
        Object obj2;
        String str2 = (String) obj;
        upy0 upy0Var = (upy0) this.receiver;
        u460 u460Var = upy0Var.b.a;
        npy0 npy0Var = upy0Var.w;
        gci0 gci0Var = upy0Var.A;
        npy0Var.a.put(((tpy0) gci0Var.a.getValue()).a, str2);
        Integer num = u460Var.f;
        aqy0 aqy0Var = upy0Var.x;
        List list = u460Var.g;
        aqy0Var.getClass();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                zhu0 zhu0Var = aqy0Var.a;
                List list2 = ((w460) obj2).a;
                zhu0Var.getClass();
                if (zhu0.a(str2, list2)) {
                    break;
                }
            }
            w460Var = (w460) obj2;
        } else {
            w460Var = null;
        }
        if (w460Var != null) {
            charSequence = w460Var.b;
            str = w460Var.c;
        } else if (num == null || str2.length() <= num.intValue()) {
            charSequence = null;
            str = null;
        } else {
            CharSequence charSequence2 = u460Var.e;
            str = u460Var.m;
            charSequence = charSequence2;
        }
        r0 r0Var = upy0Var.z;
        tpy0 tpy0Var = (tpy0) gci0Var.a.getValue();
        tpy0 tpy0Var2 = new tpy0(tpy0Var.a, str2, tpy0Var.c, tpy0Var.d, tpy0Var.e, charSequence, tpy0Var.g, tpy0Var.h, tpy0Var.i, tpy0Var.j, tpy0Var.k, str);
        r0Var.getClass();
        r0Var.m(null, tpy0Var2);
        return zy11.a;
    }
}
