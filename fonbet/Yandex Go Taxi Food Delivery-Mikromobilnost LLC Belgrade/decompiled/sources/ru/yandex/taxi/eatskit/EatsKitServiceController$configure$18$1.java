package ru.yandex.taxi.eatskit;

import defpackage.cmr0;
import defpackage.gcn;
import defpackage.h2p;
import defpackage.q5z;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.superapp.SuperAppShareDelegate$handleActivityResult$$inlined$safeCollectIn$1;
import ru.yandex.taxi.superapp.m;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsKitServiceController$configure$18$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        cmr0 cmr0Var = (cmr0) obj;
        gcn gcnVar = (gcn) obj2;
        m mVar = (m) this.receiver;
        AtomicBoolean atomicBoolean = mVar.h;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            q5z.c0(cmr0Var.a, cmr0Var.b, mVar.a, 122);
            h2p h2pVar = new h2p(gcnVar, 1);
            h2p h2pVar2 = new h2p(gcnVar, 2);
            tje.N(mVar.g, null, null, new SuperAppShareDelegate$handleActivityResult$$inlined$safeCollectIn$1(e.T(mVar.e.a(122), 1), null, h2pVar, h2pVar2, mVar, h2pVar2), 3);
        }
        return zy11.a;
    }
}
