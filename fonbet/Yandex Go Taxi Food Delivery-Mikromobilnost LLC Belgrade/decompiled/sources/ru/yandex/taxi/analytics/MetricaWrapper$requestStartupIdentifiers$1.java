package ru.yandex.taxi.analytics;

import defpackage.kx4;
import defpackage.tls;
import defpackage.yb20;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class MetricaWrapper$requestStartupIdentifiers$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        yb20 yb20Var = (yb20) obj;
        Iterator it = ((q) this.receiver).n.iterator();
        while (it.hasNext()) {
            ((kx4) it.next()).a(yb20Var);
        }
        return zy11.a;
    }
}
