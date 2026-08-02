package ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1", f = "VerticalTimelineScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $lastActiveIndex;
    final /* synthetic */ yx40 $lazyColumnHeight$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1$1", f = "VerticalTimelineScreen.kt", l = {166}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ int $lastActiveIndex;
        final /* synthetic */ yx40 $lazyColumnHeight$delegate;
        final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, androidx.compose.foundation.lazy.b bVar, yx40 yx40Var, Continuation continuation) {
            super(2, continuation);
            this.$lastActiveIndex = i;
            this.$lazyListState = bVar;
            this.$lazyColumnHeight$delegate = yx40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$lastActiveIndex, this.$lazyListState, this.$lazyColumnHeight$delegate, continuation);
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
                int i2 = this.$lastActiveIndex;
                if (i2 != -1) {
                    androidx.compose.foundation.lazy.b bVar = this.$lazyListState;
                    yx40 yx40Var = this.$lazyColumnHeight$delegate;
                    int i3 = b.b;
                    int i4 = -((int) ((yx40Var.getIntValue() / 2) - 56.0f));
                    this.label = 1;
                    if (bVar.f(i2, i4, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1(int i, androidx.compose.foundation.lazy.b bVar, yx40 yx40Var, Continuation continuation) {
        super(2, continuation);
        this.$lastActiveIndex = i;
        this.$lazyListState = bVar;
        this.$lazyColumnHeight$delegate = yx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1 verticalTimelineScreenKt$VerticalTimelineScreen$4$3$1 = new VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1(this.$lastActiveIndex, this.$lazyListState, this.$lazyColumnHeight$delegate, continuation);
        verticalTimelineScreenKt$VerticalTimelineScreen$4$3$1.L$0 = obj;
        return verticalTimelineScreenKt$VerticalTimelineScreen$4$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1 verticalTimelineScreenKt$VerticalTimelineScreen$4$3$1 = (VerticalTimelineScreenKt$VerticalTimelineScreen$4$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        verticalTimelineScreenKt$VerticalTimelineScreen$4$3$1.invokeSuspend(zy11Var);
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
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.$lastActiveIndex, this.$lazyListState, this.$lazyColumnHeight$delegate, null), 3);
        return zy11.a;
    }
}
