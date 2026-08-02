package ru.yandex.taxi.masstransit.stop.ui.modal;

import androidx.compose.runtime.f;
import defpackage.gp5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t140;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.ui.modal.MtStopModalKt$MtStopModal$3$1", f = "MtStopModal.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopModalKt$MtStopModal$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $anchoredSheetTarget;
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ tls $onAction;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.stop.ui.modal.MtStopModalKt$MtStopModal$3$1$1", f = "MtStopModal.kt", l = {102}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.stop.ui.modal.MtStopModalKt$MtStopModal$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ int $anchoredSheetTarget;
        final /* synthetic */ wg6 $bottomSheetState;
        final /* synthetic */ tls $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, wg6 wg6Var, tls tlsVar, Continuation continuation) {
            super(2, continuation);
            this.$bottomSheetState = wg6Var;
            this.$onAction = tlsVar;
            this.$anchoredSheetTarget = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$anchoredSheetTarget, this.$bottomSheetState, this.$onAction, continuation);
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
                b.b(obj);
                tpr t = e.t(f.o(new gp5(this.$bottomSheetState, 12)));
                t140 t140Var = new t140(this.$anchoredSheetTarget, this.$onAction);
                this.label = 1;
                if (t.collect(t140Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopModalKt$MtStopModal$3$1(int i, wg6 wg6Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetState = wg6Var;
        this.$onAction = tlsVar;
        this.$anchoredSheetTarget = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtStopModalKt$MtStopModal$3$1 mtStopModalKt$MtStopModal$3$1 = new MtStopModalKt$MtStopModal$3$1(this.$anchoredSheetTarget, this.$bottomSheetState, this.$onAction, continuation);
        mtStopModalKt$MtStopModal$3$1.L$0 = obj;
        return mtStopModalKt$MtStopModal$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtStopModalKt$MtStopModal$3$1 mtStopModalKt$MtStopModal$3$1 = (MtStopModalKt$MtStopModal$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtStopModalKt$MtStopModal$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.$anchoredSheetTarget, this.$bottomSheetState, this.$onAction, null), 3);
        return zy11.a;
    }
}
