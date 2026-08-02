package ru.yandex.logistics.sdk.cargo_form.impl.due;

import defpackage.dxm;
import defpackage.gvm;
import defpackage.h3y;
import defpackage.hvm;
import defpackage.o9x0;
import defpackage.p6s;
import defpackage.r9x0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.c;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DueRoot$getView$1$1$1$1$1$1$5$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        gvm gvmVar;
        r9x0 r9x0Var;
        b bVar = (b) this.receiver;
        ((p6s) bVar.x.b).c(null, bVar.b.z);
        dxm dxmVar = bVar.c;
        o9x0 o9x0Var = dxmVar.a;
        o9x0Var.h.invoke();
        dxmVar.b.dismiss();
        hvm hvmVar = o9x0Var.j;
        if (hvmVar != null && (gvmVar = hvmVar.b) != null && (r9x0Var = gvmVar.c) != null) {
            ((c) ((h3y) dxmVar.c.x).get()).b(r9x0Var);
        }
        return zy11.a;
    }
}
