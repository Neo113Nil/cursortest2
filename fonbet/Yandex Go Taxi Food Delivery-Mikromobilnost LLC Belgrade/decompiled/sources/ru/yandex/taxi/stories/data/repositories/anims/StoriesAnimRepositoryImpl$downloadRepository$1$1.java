package ru.yandex.taxi.stories.data.repositories.anims;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qlu0;
import defpackage.rlu0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnsz;", "<anonymous>", "(Ltse;)Lnsz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.repositories.anims.StoriesAnimRepositoryImpl$downloadRepository$1$1", f = "StoriesAnimRepositoryImpl.kt", l = {15}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoriesAnimRepositoryImpl$downloadRepository$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ qlu0 $download;
    int label;
    final /* synthetic */ rlu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesAnimRepositoryImpl$downloadRepository$1$1(rlu0 rlu0Var, qlu0 qlu0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rlu0Var;
        this.$download = qlu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoriesAnimRepositoryImpl$downloadRepository$1$1(this.this$0, this.$download, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesAnimRepositoryImpl$downloadRepository$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        d dVar = this.this$0.a;
        String str = this.$download.b;
        this.label = 1;
        Object a = dVar.a(str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
