package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import com.yandex.go.address.models.Address;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.preorder.summary.solid.o;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SummarySourceDestinationViewHolder$handleNewbies$sourceButtonListener$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        o oVar = bVar.b;
        Address e = bVar.g.l.e();
        oVar.a(e != null ? e.J1() : null);
        return zy11.a;
    }
}
