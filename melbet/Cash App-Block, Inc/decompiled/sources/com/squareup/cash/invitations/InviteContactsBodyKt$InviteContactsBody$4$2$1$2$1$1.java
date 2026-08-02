package com.squareup.cash.invitations;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CollapsingToolbarScaffoldState $toolbarState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1(CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$toolbarState = collapsingToolbarScaffoldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1(this.$toolbarState, continuation, 0);
            default:
                return new InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1(this.$toolbarState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = this.$toolbarState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CollapsingToolbarState collapsingToolbarState = collapsingToolbarScaffoldState.toolbarState;
                    this.label = 1;
                    if (CollapsingToolbarState.collapse$default(collapsingToolbarState, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CollapsingToolbarState collapsingToolbarState2 = collapsingToolbarScaffoldState.toolbarState;
                    this.label = 1;
                    if (collapsingToolbarState2.expand(200, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
