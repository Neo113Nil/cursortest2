package ru.yandex.taxi.preorder.source.domain;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointLocationOnStartInteractor", f = "SourcePointLocationOnStartInteractor.kt", l = {BuildConfig.API_LEVEL, HProv.PP_PASSWD_TERM, HProv.PP_SAME_MEDIA}, m = "awaitLocationRequirementsAndUpdateLocation", v = 2)
/* loaded from: classes6.dex */
final class SourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1(t tVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, this);
    }
}
