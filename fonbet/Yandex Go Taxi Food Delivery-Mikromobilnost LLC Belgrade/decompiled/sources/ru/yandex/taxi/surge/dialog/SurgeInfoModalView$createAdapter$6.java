package ru.yandex.taxi.surge.dialog;

import defpackage.gtw0;
import defpackage.jky0;
import defpackage.kky0;
import defpackage.lzu0;
import defpackage.tls;
import defpackage.w511;
import defpackage.xsw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class SurgeInfoModalView$createAdapter$6 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kky0 kky0Var = (kky0) obj;
        xsw0 xsw0Var = (xsw0) this.receiver;
        if (!(kky0Var instanceof jky0)) {
            xsw0Var.getClass();
            w511.b();
            return null;
        }
        ru.yandex.taxi.surge.router.b bVar = xsw0Var.z;
        String str = ((jky0) kky0Var).a;
        gtw0 gtw0Var = bVar.a;
        gtw0Var.r(new lzu0(13, gtw0Var, str));
        return zy11.a;
    }
}
