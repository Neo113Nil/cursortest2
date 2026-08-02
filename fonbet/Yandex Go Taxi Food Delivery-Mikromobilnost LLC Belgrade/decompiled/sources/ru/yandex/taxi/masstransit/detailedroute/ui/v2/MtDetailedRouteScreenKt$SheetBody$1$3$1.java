package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.ah30;
import defpackage.gp5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteScreenKt$SheetBody$1$3$1", f = "MtDetailedRouteScreen.kt", l = {608}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteScreenKt$SheetBody$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ int $collapsedPeekTarget;
    final /* synthetic */ wg6 $sheetState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteScreenKt$SheetBody$1$3$1$1", f = "MtDetailedRouteScreen.kt", l = {599}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteScreenKt$SheetBody$1$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ wg6 $sheetState;
        final /* synthetic */ Ref$BooleanRef $wasUserInitiated;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wg6 wg6Var, Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
            super(2, continuation);
            this.$sheetState = wg6Var;
            this.$wasUserInitiated = ref$BooleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$sheetState, this.$wasUserInitiated, continuation);
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
                rol0 o = androidx.compose.runtime.f.o(new gp5(this.$sheetState, 11));
                pi00 pi00Var = new pi00(14, this.$wasUserInitiated);
                this.label = 1;
                if (o.collect(pi00Var, this) == coroutineSingletons) {
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
    public MtDetailedRouteScreenKt$SheetBody$1$3$1(int i, wg6 wg6Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$sheetState = wg6Var;
        this.$collapsedPeekTarget = i;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDetailedRouteScreenKt$SheetBody$1$3$1 mtDetailedRouteScreenKt$SheetBody$1$3$1 = new MtDetailedRouteScreenKt$SheetBody$1$3$1(this.$collapsedPeekTarget, this.$sheetState, this.$action, continuation);
        mtDetailedRouteScreenKt$SheetBody$1$3$1.L$0 = obj;
        return mtDetailedRouteScreenKt$SheetBody$1$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteScreenKt$SheetBody$1$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            tje.N(tseVar, null, null, new AnonymousClass1(this.$sheetState, ref$BooleanRef, null), 3);
            tpr t = kotlinx.coroutines.flow.e.t(androidx.compose.runtime.f.o(new gp5(this.$sheetState, 10)));
            ah30 ah30Var = new ah30(ref$BooleanRef2, this.$collapsedPeekTarget, this.$action, ref$BooleanRef);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (t.collect(ah30Var, this) == coroutineSingletons) {
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
