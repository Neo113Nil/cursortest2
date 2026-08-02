package ru.yandex.taxi.panorama;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.panorama.TaxiPanoramaInteractor", f = "TaxiPanoramaInteractor.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 177}, m = "loadExpandedIcon", v = 2)
/* loaded from: classes6.dex */
final class TaxiPanoramaInteractor$loadExpandedIcon$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPanoramaInteractor$loadExpandedIcon$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l.a(this.this$0, null, null, null, null, this);
    }
}
