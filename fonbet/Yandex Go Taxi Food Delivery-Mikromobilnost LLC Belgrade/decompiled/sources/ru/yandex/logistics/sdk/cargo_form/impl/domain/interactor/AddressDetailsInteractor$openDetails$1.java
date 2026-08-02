package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.m2v;
import defpackage.su0;
import defpackage.tu0;
import defpackage.vu0;
import defpackage.xs0;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class AddressDetailsInteractor$openDetails$1 extends FunctionReferenceImpl implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        vu0 vu0Var = (vu0) obj2;
        Continuation continuation = (Continuation) obj3;
        a aVar = (a) this.receiver;
        if (vu0Var instanceof su0) {
            m2v.v(aVar.p, intValue, vu0Var, aVar.p.t(intValue), null, 20);
            return Boolean.TRUE;
        }
        boolean z = vu0Var instanceof tu0;
        c cVar = aVar.o;
        return z ? cVar.a(intValue, new xs0(aVar, vu0Var, intValue), continuation) : cVar.a(intValue, new xs0(aVar, intValue, vu0Var, 1), continuation);
    }
}
