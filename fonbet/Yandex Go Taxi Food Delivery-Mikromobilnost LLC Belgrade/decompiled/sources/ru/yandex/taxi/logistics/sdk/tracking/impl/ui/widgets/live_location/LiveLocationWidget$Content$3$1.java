package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location;

import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class LiveLocationWidget$Content$3$1 extends FunctionReferenceImpl implements tls {
    public final void i(boolean z) {
        d dVar = (d) this.receiver;
        tje.N(dVar.j, null, null, new LiveLocationStateHolder$onToggleCheckedChange$1(z, dVar, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
