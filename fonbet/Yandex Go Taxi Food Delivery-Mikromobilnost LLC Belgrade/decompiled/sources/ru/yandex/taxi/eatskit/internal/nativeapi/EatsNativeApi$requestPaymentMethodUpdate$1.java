package ru.yandex.taxi.eatskit.internal.nativeapi;

import defpackage.h1p;
import defpackage.hst;
import defpackage.jst;
import defpackage.ken;
import defpackage.tls;
import defpackage.unr0;
import defpackage.vdn;
import defpackage.w6a0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.a;
import ru.yandex.taxi.eatskit.c;
import ru.yandex.taxi.superapp.k;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class EatsNativeApi$requestPaymentMethodUpdate$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        c cVar = ((a) ((ken) this.receiver)).c;
        k kVar = cVar.o.c;
        vdn vdnVar = new vdn(cVar, 1);
        kVar.getClass();
        hst hstVar = jst.e;
        h1p h1pVar = kVar.b;
        unr0.C(new Object[]{h1pVar.getValue()}, 1, "SuperApp: %s request payment methods update", hstVar);
        kVar.d.b(h1pVar, (w6a0) obj, vdnVar);
        return zy11.a;
    }
}
