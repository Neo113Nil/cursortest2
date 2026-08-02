package ru.yandex.yandexmaps.multiplatform.pin.war;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.r1c0;
import defpackage.s1c0;
import defpackage.seu;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.PinWarGo$onCameraPositionChanged$job$1", f = "PinWarGo.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinWarGo$onCameraPositionChanged$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ s1c0 $mode;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.PinWarGo$onCameraPositionChanged$job$1$1", f = "PinWarGo.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 1)
    /* renamed from: ru.yandex.yandexmaps.multiplatform.pin.war.PinWarGo$onCameraPositionChanged$job$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0;
                PinInvalidationReason pinInvalidationReason = PinInvalidationReason.REDRAW;
                this.label = 1;
                if (cVar.r(true, pinInvalidationReason, this) == coroutineSingletons) {
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
    public PinWarGo$onCameraPositionChanged$job$1(s1c0 s1c0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$mode = s1c0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PinWarGo$onCameraPositionChanged$job$1 pinWarGo$onCameraPositionChanged$job$1 = new PinWarGo$onCameraPositionChanged$job$1(this.$mode, this.this$0, continuation);
        pinWarGo$onCameraPositionChanged$job$1.L$0 = obj;
        return pinWarGo$onCameraPositionChanged$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinWarGo$onCameraPositionChanged$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l8x] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l8x] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ?? r0 = (l8x) tseVar.getCoroutineContext().get(seu.C);
                long j = ((r1c0) this.$mode).a;
                this.L$0 = null;
                this.L$1 = r0;
                this.label = 1;
                tseVar = r0;
                if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r02 = (l8x) this.L$1;
                kotlin.b.b(obj);
                tseVar = r02;
            }
            c cVar = this.this$0;
            pzt0 pzt0Var = cVar.y;
            zy11 zy11Var = zy11.a;
            if (pzt0Var == tseVar) {
                cVar.i(new AnonymousClass1(cVar, null));
            } else if (pzt0Var == tseVar) {
                cVar.y = null;
                return zy11Var;
            }
            return zy11Var;
        } finally {
            c cVar2 = this.this$0;
            if (cVar2.y == tseVar) {
                cVar2.y = null;
            }
        }
    }
}
