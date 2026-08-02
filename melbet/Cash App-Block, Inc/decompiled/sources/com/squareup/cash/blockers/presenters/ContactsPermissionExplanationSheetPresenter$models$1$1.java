package com.squareup.cash.blockers.presenters;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.SupportConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ContactsPermissionExplanationSheetPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ LocalPosCheckInPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactsPermissionExplanationSheetPresenter$models$1$1(LocalPosCheckInPresenter localPosCheckInPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = localPosCheckInPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LocalPosCheckInPresenter localPosCheckInPresenter = this.this$0;
        switch (i) {
            case 0:
                return new ContactsPermissionExplanationSheetPresenter$models$1$1(localPosCheckInPresenter, continuation, 0);
            default:
                return new ContactsPermissionExplanationSheetPresenter$models$1$1(localPosCheckInPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ContactsPermissionExplanationSheetPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        LocalPosCheckInPresenter localPosCheckInPresenter = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) localPosCheckInPresenter.launcher;
                    ContactsPermissionExplanationSheetPresenter$models$1$1 contactsPermissionExplanationSheetPresenter$models$1$1 = new ContactsPermissionExplanationSheetPresenter$models$1$1(localPosCheckInPresenter, continuation, i2);
                    this.label = 1;
                    obj = JobKt.withContext(coroutineContext, contactsPermissionExplanationSheetPresenter$models$1$1, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((RealRouter) localPosCheckInPresenter.cameraPermissions).route(new RoutingParams((BlockersScreens.ContactsPermissionExplanationSheet) localPosCheckInPresenter.store, null, null, null, null, null, 510), ((SupportConfig) obj).privacy_notice_url);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                FinishSetupTileBadgeCounter supportConfig = ((RealAppConfigManager) ((AppConfigManager) localPosCheckInPresenter.stringManager)).supportConfig();
                this.label = 1;
                Object first = FlowKt.first(supportConfig, this);
                return first == coroutineSingletons2 ? coroutineSingletons2 : first;
        }
    }
}
