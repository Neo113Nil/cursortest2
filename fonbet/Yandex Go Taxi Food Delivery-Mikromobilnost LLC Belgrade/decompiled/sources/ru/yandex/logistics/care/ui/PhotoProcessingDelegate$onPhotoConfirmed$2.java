package ru.yandex.logistics.care.ui;

import defpackage.fzd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.PhotoProcessingDelegate$onPhotoConfirmed$2", f = "PhotoProcessingDelegate.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class PhotoProcessingDelegate$onPhotoConfirmed$2 extends SuspendLambda implements wls {
    final /* synthetic */ File $photoFile;
    final /* synthetic */ fzd $step;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoProcessingDelegate$onPhotoConfirmed$2(n nVar, File file, fzd fzdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$photoFile = file;
        this.$step = fzdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotoProcessingDelegate$onPhotoConfirmed$2(this.this$0, this.$photoFile, this.$step, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotoProcessingDelegate$onPhotoConfirmed$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            File file = this.$photoFile;
            fzd fzdVar = this.$step;
            this.label = 1;
            if (n.b(nVar, file, fzdVar, this) == coroutineSingletons) {
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
