package ru.yandex.videoplayer.multiplatform.fetcher;

import defpackage.ep4;
import defpackage.f050;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class FetcherProgressAccumulator$appendFetcher$1$1 extends FunctionReferenceImpl implements tls {
    public FetcherProgressAccumulator$appendFetcher$1$1(a aVar) {
        super(1, aVar, a.class, "handleProgress", "handleProgress(Lru/yandex/videoplayer/multiplatform/fetcher/BandwidthInfo;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ep4 ep4Var = (ep4) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        f050 f050Var = a.k;
        if (f050.b) {
            double d = ep4Var.b;
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                aVar.b += d;
            }
        } else {
            synchronized (f050Var.a) {
                double d2 = ep4Var.b;
                if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
                    aVar.b += d2;
                }
            }
        }
        return zy11.a;
    }
}
