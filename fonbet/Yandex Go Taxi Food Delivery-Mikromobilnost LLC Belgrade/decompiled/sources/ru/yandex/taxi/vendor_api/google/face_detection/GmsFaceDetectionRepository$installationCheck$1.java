package ru.yandex.taxi.vendor_api.google.face_detection;

import com.google.android.gms.common.moduleinstall.internal.c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7p;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.google.face_detection.GmsFaceDetectionRepository$installationCheck$1", f = "GmsFaceDetectionRepository.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GmsFaceDetectionRepository$installationCheck$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsFaceDetectionRepository$installationCheck$1(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GmsFaceDetectionRepository$installationCheck$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((GmsFaceDetectionRepository$installationCheck$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = (c) this.this$0.c.getValue();
            o7p o7pVar = (o7p) this.this$0.b.getValue();
            this.label = 1;
            if (ru.yandex.taxi.vendor_api.google.a.a(cVar, o7pVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
