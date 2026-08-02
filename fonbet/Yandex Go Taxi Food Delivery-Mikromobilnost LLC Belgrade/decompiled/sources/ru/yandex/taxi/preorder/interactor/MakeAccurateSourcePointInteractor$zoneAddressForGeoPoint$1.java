package ru.yandex.taxi.preorder.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.interactor.MakeAccurateSourcePointInteractor", f = "MakeAccurateSourcePointInteractor.kt", l = {122, HProv.PP_PASSWD_TERM, HProv.PP_DELETE_KEYSET, HProv.PP_VERSION_TIMESTAMP}, m = "zoneAddressForGeoPoint", v = 2)
/* loaded from: classes6.dex */
final class MakeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
