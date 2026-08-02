package ru.yandex.taxi.surge.dialog;

import defpackage.bmb0;
import defpackage.dtw0;
import defpackage.gtw0;
import defpackage.lzu0;
import defpackage.m950;
import defpackage.nky0;
import defpackage.smq0;
import defpackage.tlq0;
import defpackage.tls;
import defpackage.ud11;
import defpackage.xsw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class SurgeInfoModalView$createAdapter$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        nky0 nky0Var = (nky0) obj;
        xsw0 xsw0Var = (xsw0) this.receiver;
        ru.yandex.taxi.surge.router.b bVar = xsw0Var.z;
        lzu0 lzu0Var = new lzu0(12, xsw0Var, nky0Var);
        gtw0 gtw0Var = bVar.a;
        m950 m950Var = (m950) gtw0Var.J.get();
        ud11 ud11Var = new ud11();
        zy11 zy11Var = zy11.a;
        ud11 a = ud11Var.a(zy11Var);
        for (smq0 smq0Var : nky0Var.g) {
            a.a(new bmb0(smq0Var.b, smq0Var.a));
        }
        smq0 smq0Var2 = nky0Var.h;
        gtw0Var.A(m950Var, new tlq0(nky0Var.d, nky0Var.e, nky0Var.f, ud11Var.b(), new bmb0(smq0Var2.b, smq0Var2.a), nky0Var.b), new dtw0(lzu0Var));
        return zy11Var;
    }
}
