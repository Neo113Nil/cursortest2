package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.okb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsUploadInteractor$launchImageUpload$job$1", f = "PhotocommentsUploadInteractor.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PhotocommentsUploadInteractor$launchImageUpload$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageId;
    final /* synthetic */ InputStream $imageInputStream;
    final /* synthetic */ okb0 $position;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotocommentsUploadInteractor$launchImageUpload$job$1(b bVar, String str, InputStream inputStream, okb0 okb0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$imageId = str;
        this.$imageInputStream = inputStream;
        this.$position = okb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotocommentsUploadInteractor$launchImageUpload$job$1(this.this$0, this.$imageId, this.$imageInputStream, this.$position, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotocommentsUploadInteractor$launchImageUpload$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            String str = this.$imageId;
            InputStream inputStream = this.$imageInputStream;
            okb0 okb0Var = this.$position;
            this.label = 1;
            if (b.a(bVar, str, inputStream, okb0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
