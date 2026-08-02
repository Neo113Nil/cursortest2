package ru.yandex.taxi.eatskit;

import defpackage.ck7;
import defpackage.emu0;
import defpackage.gcn;
import defpackage.s2p;
import defpackage.wew0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.superapp.r;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class EatsKitServiceController$configure$1$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        emu0 emu0Var = (emu0) obj;
        gcn gcnVar = (gcn) obj2;
        s2p s2pVar = ((r) this.receiver).c;
        if (s2pVar.m()) {
            gcnVar.a(new ck7(new IllegalStateException("Previous openStories call not finished yet")));
        } else {
            s2pVar.g(emu0Var, new wew0(gcnVar));
        }
        return zy11.a;
    }
}
