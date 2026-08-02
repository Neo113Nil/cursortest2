package ru.yandex.taxi.preorder.tollroad.compose.interactor;

import com.yandex.go.taxi.tariffs.interactor.v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.teh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;
import ru.yandex.taxi.preorder.tollroad.data.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.compose.interactor.RoadsPaneLifecycleInteractor$launchOnAttachActions$2", f = "RoadsPaneLifecycleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RoadsPaneLifecycleInteractor$launchOnAttachActions$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.tollroad.compose.interactor.RoadsPaneLifecycleInteractor$launchOnAttachActions$2$1", f = "RoadsPaneLifecycleInteractor.kt", l = {22}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.tollroad.compose.interactor.RoadsPaneLifecycleInteractor$launchOnAttachActions$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                v vVar = this.this$0.c;
                this.label = 1;
                if (vVar.j(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadsPaneLifecycleInteractor$launchOnAttachActions$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoadsPaneLifecycleInteractor$launchOnAttachActions$2 roadsPaneLifecycleInteractor$launchOnAttachActions$2 = new RoadsPaneLifecycleInteractor$launchOnAttachActions$2(this.this$0, continuation);
        roadsPaneLifecycleInteractor$launchOnAttachActions$2.L$0 = obj;
        return roadsPaneLifecycleInteractor$launchOnAttachActions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoadsPaneLifecycleInteractor$launchOnAttachActions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r6.a().size() > 1) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        aVar.b.z(aVar.a.b.f());
        a aVar2 = this.this$0;
        teh tehVar = aVar2.b;
        e eVar = aVar2.a.b;
        boolean z = eVar.b() == RoadRestriction.NONE;
        tehVar.x(z);
        return tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
    }
}
