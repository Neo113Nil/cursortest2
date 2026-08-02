package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.cjw0;
import defpackage.ike;
import defpackage.j360;
import defpackage.rpy0;
import defpackage.t260;
import defpackage.tje;
import defpackage.u260;
import defpackage.v260;
import defpackage.w260;
import defpackage.w511;
import defpackage.wls;
import defpackage.x260;
import defpackage.y260;
import defpackage.zxs0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class NeuroPostcardWidget$Content$3$1 extends FunctionReferenceImpl implements wls {
    public final void i(y260 y260Var, String str) {
        j360 j360Var = (j360) this.receiver;
        if (str != null) {
            j360Var.j.x(str.concat(".Tapped"), null);
        }
        ike ikeVar = j360Var.k;
        cjw0 cjw0Var = j360Var.b;
        if (y260Var instanceof v260) {
            cjw0Var.y(new zxs0(new rpy0(((v260) y260Var).a), new a(j360Var, 1)));
            return;
        }
        if (y260Var.equals(w260.a)) {
            return;
        }
        if (y260Var.equals(u260.a)) {
            tje.N(ikeVar, null, null, new NeuroPostcardListenerImpl$handleConfirmImage$1(j360Var, null), 3);
            return;
        }
        if (y260Var instanceof t260) {
            cjw0Var.y(new zxs0(new rpy0(((t260) y260Var).a), new a(j360Var, 0)));
        } else if (y260Var.equals(x260.a)) {
            tje.N(ikeVar, null, null, new NeuroPostcardListenerImpl$handleSendPostcard$1(j360Var, null), 3);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        i((y260) obj, (String) obj2);
        return zy11.a;
    }
}
