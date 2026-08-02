package ru.yandex.taxi.scooters.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersDamagePhotosInteractor", f = "ScootersDamagePhotosInteractor.kt", l = {64, HProv.ALG_SID_SHA3_256}, m = "realUploadPhotos", v = 2)
/* loaded from: classes6.dex */
final class ScootersDamagePhotosInteractor$realUploadPhotos$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDamagePhotosInteractor$realUploadPhotos$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.i(this.this$0, null, null, this);
    }
}
