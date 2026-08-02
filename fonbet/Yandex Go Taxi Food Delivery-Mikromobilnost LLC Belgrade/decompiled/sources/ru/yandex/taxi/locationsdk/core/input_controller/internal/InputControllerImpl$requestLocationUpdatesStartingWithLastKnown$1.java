package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.k7z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6z;
import defpackage.uez0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lk7z;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.input_controller.internal.InputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1", f = "InputControllerImpl.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<q6z> $lastKnownSources;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1(b bVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$lastKnownSources = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1 inputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1 = new InputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1(this.this$0, this.$lastKnownSources, continuation);
        inputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1.L$0 = obj;
        return inputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InputControllerImpl$requestLocationUpdatesStartingWithLastKnown$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            it = kotlin.collections.a.x0(this.this$0.b(this.$lastKnownSources).values(), new uez0(this.this$0.c)).iterator();
            i = 0;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = (Iterator) this.L$2;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            k7z k7zVar = (k7z) it.next();
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = it;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = i;
            this.I$1 = 0;
            this.label = 1;
            if (vprVar.emit(k7zVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
