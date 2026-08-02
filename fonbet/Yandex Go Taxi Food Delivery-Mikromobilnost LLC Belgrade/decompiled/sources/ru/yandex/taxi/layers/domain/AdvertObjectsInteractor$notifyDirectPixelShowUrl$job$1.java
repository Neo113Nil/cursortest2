package ru.yandex.taxi.layers.domain;

import com.yandex.go.layers.api.model.Action;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uud0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.AdvertObjectsInteractor$notifyDirectPixelShowUrl$job$1", f = "AdvertObjectsInteractor.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AdvertObjectsInteractor$notifyDirectPixelShowUrl$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ lm00 $hostMapObject;
    final /* synthetic */ String $id;
    final /* synthetic */ List<uud0> $pointOptions;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertObjectsInteractor$notifyDirectPixelShowUrl$job$1(a aVar, String str, lm00 lm00Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$id = str;
        this.$hostMapObject = lm00Var;
        this.$pointOptions = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdvertObjectsInteractor$notifyDirectPixelShowUrl$job$1(this.this$0, this.$id, this.$hostMapObject, this.$pointOptions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertObjectsInteractor$notifyDirectPixelShowUrl$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.c.c(new nm00(this.$id, this.$hostMapObject.b, this.$pointOptions, Action.UNDEFINED));
        return zy11.a;
    }
}
