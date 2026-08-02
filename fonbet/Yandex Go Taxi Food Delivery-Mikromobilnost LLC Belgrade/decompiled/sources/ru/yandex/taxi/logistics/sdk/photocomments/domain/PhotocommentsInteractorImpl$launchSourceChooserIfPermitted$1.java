package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsInteractorImpl", f = "PhotocommentsInteractorImpl.kt", l = {104, HProv.PP_SET_PIN, 109}, m = "launchSourceChooserIfPermitted", v = 2)
/* loaded from: classes5.dex */
final class PhotocommentsInteractorImpl$launchSourceChooserIfPermitted$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotocommentsInteractorImpl$launchSourceChooserIfPermitted$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(this.this$0, null, 0, 0, this);
    }
}
