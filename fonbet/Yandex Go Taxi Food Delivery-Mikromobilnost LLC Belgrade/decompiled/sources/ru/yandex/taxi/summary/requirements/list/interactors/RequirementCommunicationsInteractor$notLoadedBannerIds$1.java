package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.RequirementCommunicationsInteractor", f = "RequirementCommunicationsInteractor.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "notLoadedBannerIds", v = 2)
/* loaded from: classes6.dex */
final class RequirementCommunicationsInteractor$notLoadedBannerIds$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementCommunicationsInteractor$notLoadedBannerIds$1(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return v.a(this.this$0, null, this);
    }
}
