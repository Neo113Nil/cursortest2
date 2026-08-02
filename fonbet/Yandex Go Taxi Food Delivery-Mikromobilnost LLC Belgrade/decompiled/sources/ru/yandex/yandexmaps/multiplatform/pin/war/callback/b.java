package ru.yandex.yandexmaps.multiplatform.pin.war.callback;

import defpackage.bvf0;
import defpackage.f0z0;
import defpackage.ffx;
import defpackage.g0z0;
import defpackage.jqr;
import defpackage.mth;
import defpackage.owb0;
import defpackage.qwb0;
import defpackage.uyj;
import defpackage.w511;
import defpackage.zy11;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes7.dex */
public final class b implements owb0 {
    public final long a;
    public final a b;
    public final n0 c;
    public final n0 w;

    public b(long j, a aVar) {
        this.a = j;
        this.b = aVar;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        n0 b = ffx.b(0, 1, bufferOverflow);
        this.c = b;
        this.w = ffx.b(0, 1, bufferOverflow);
        e.H(bvf0.M(bvf0.b(), uyj.a), new jqr(new mth(e.X(new n(b, new ThrottledRedrawsPinInvalidationCallback$1(2, null)), new ThrottledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1(null, this)), 6), new ThrottledRedrawsPinInvalidationCallback$3(null, this), 3)).w(new f0z0(0, this));
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        qwb0 qwb0Var = (qwb0) obj;
        switch (g0z0.a[qwb0Var.a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.c.g(qwb0Var);
                break;
            case 7:
                this.w.g(qwb0Var);
                break;
            default:
                w511.b();
                return null;
        }
        return zy11.a;
    }
}
