package com.squareup.cash.invitations;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
import com.squareup.cash.cdf.contact.ContactAccessGrantPermission;
import com.squareup.cash.cdf.contact.ContactInviteViewInvitationShareSheet;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.protos.franklin.api.SharingContent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ InviteContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteContactsPresenter$models$1$1(InviteContactsPresenter inviteContactsPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = inviteContactsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        InviteContactsPresenter inviteContactsPresenter = this.this$0;
        switch (i) {
            case 0:
                return new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, 0);
            case 1:
                return new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, 1);
            case 2:
                return new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, 2);
            case 3:
                return new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, 3);
            case 4:
                return new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, 4);
            default:
                return new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 1:
                ((InviteContactsPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((InviteContactsPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r13 == r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ad, code lost:
    
        if (r13 == r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
    
        if (r13.emit(r2, r12) == r6) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        boolean z = false;
        Object[] objArr = 0;
        final InviteContactsPresenter inviteContactsPresenter = this.this$0;
        final int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = inviteContactsPresenter.shareResults;
                    InviteContactsPresenter$models$2$1 inviteContactsPresenter$models$2$1 = new InviteContactsPresenter$models$2$1(inviteContactsPresenter, continuation, i2);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, inviteContactsPresenter$models$2$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow stateFlow = inviteContactsPresenter.activityLifecycleState;
                    InviteContactsPresenter$models$2$1$1$1 inviteContactsPresenter$models$2$1$1$1 = new InviteContactsPresenter$models$2$1$1$1(inviteContactsPresenter);
                    this.label = 1;
                    if (stateFlow.collect(inviteContactsPresenter$models$2$1$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new InviteContactsPresenter$filterContacts$$inlined$map$1(FlowKt.distinctUntilChanged(inviteContactsPresenter.readContactsPermissions.granted()), 27), 1);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.invitations.InviteContactsPresenter$models$2$1$2$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation2) {
                            int i6 = objArr2;
                            InviteContactsPresenter inviteContactsPresenter2 = inviteContactsPresenter;
                            switch (i6) {
                                case 0:
                                    ((Boolean) obj2).getClass();
                                    Long l = (Long) CollectionsKt.firstOrNull(inviteContactsPresenter2.whenRequestHappened.getReplayCache());
                                    if (l != null) {
                                        if (inviteContactsPresenter2.clock.millis() - l.longValue() > 150) {
                                            Analytics analytics = inviteContactsPresenter2.analytics;
                                            ContactInviteEntryPoint contactInviteEntryPoint = inviteContactsPresenter2.entryPoint;
                                            ContactAccessGrantPermission.ContactsAccessLevel contactsAccessLevel = ContactAccessGrantPermission.ContactsAccessLevel.FULL;
                                            analytics.track(new ContactAccessGrantPermission(contactInviteEntryPoint, Boolean.TRUE), null);
                                        }
                                    }
                                    break;
                                default:
                                    Long l2 = (Long) CollectionsKt.firstOrNull(inviteContactsPresenter2.whenRequestHappened.getReplayCache());
                                    if (l2 != null) {
                                        if (inviteContactsPresenter2.clock.millis() - l2.longValue() > 150) {
                                            Analytics analytics2 = inviteContactsPresenter2.analytics;
                                            ContactInviteEntryPoint contactInviteEntryPoint2 = inviteContactsPresenter2.entryPoint;
                                            ContactAccessGrantPermission.ContactsAccessLevel contactsAccessLevel2 = ContactAccessGrantPermission.ContactsAccessLevel.FULL;
                                            analytics2.track(new ContactAccessGrantPermission(contactInviteEntryPoint2, Boolean.FALSE), null);
                                        }
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (take.collect(flowCollector, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow denied = inviteContactsPresenter.readContactsPermissions.denied();
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.invitations.InviteContactsPresenter$models$2$1$2$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation2) {
                            int i62 = i2;
                            InviteContactsPresenter inviteContactsPresenter2 = inviteContactsPresenter;
                            switch (i62) {
                                case 0:
                                    ((Boolean) obj2).getClass();
                                    Long l = (Long) CollectionsKt.firstOrNull(inviteContactsPresenter2.whenRequestHappened.getReplayCache());
                                    if (l != null) {
                                        if (inviteContactsPresenter2.clock.millis() - l.longValue() > 150) {
                                            Analytics analytics = inviteContactsPresenter2.analytics;
                                            ContactInviteEntryPoint contactInviteEntryPoint = inviteContactsPresenter2.entryPoint;
                                            ContactAccessGrantPermission.ContactsAccessLevel contactsAccessLevel = ContactAccessGrantPermission.ContactsAccessLevel.FULL;
                                            analytics.track(new ContactAccessGrantPermission(contactInviteEntryPoint, Boolean.TRUE), null);
                                        }
                                    }
                                    break;
                                default:
                                    Long l2 = (Long) CollectionsKt.firstOrNull(inviteContactsPresenter2.whenRequestHappened.getReplayCache());
                                    if (l2 != null) {
                                        if (inviteContactsPresenter2.clock.millis() - l2.longValue() > 150) {
                                            Analytics analytics2 = inviteContactsPresenter2.analytics;
                                            ContactInviteEntryPoint contactInviteEntryPoint2 = inviteContactsPresenter2.entryPoint;
                                            ContactAccessGrantPermission.ContactsAccessLevel contactsAccessLevel2 = ContactAccessGrantPermission.ContactsAccessLevel.FULL;
                                            analytics2.track(new ContactAccessGrantPermission(contactInviteEntryPoint2, Boolean.FALSE), null);
                                        }
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (denied.collect(flowCollector2, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                ModifiablePermissions modifiablePermissions = inviteContactsPresenter.readContactsPermissions;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = inviteContactsPresenter.whenRequestHappened;
                    Long l = new Long(inviteContactsPresenter.clock.millis());
                    this.label = 1;
                    break;
                } else if (i7 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i7 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        this.label = 3;
                        obj = modifiablePermissions.shouldShowOverridePrompt(this);
                        break;
                    } else {
                        modifiablePermissions.request();
                        if (z) {
                        }
                    }
                } else if (i7 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    z = ((Boolean) obj).booleanValue();
                    if (z) {
                        inviteContactsPresenter.launcher.launchSettings();
                    }
                    break;
                }
                this.label = 2;
                obj = modifiablePermissions.shouldShowRequestPermissionRationale(this);
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter invitationConfig = ((RealAppConfigManager) inviteContactsPresenter.appConfig).invitationConfig();
                    this.label = 1;
                    if (FlowKt.first(invitationConfig, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                IntentLauncher intentLauncher = inviteContactsPresenter.launcher;
                SharingContent sharingContent = inviteContactsPresenter.args.inviteFriendsScreen.sharing_content;
                String str = sharingContent != null ? sharingContent.default_text : null;
                str.getClass();
                if (intentLauncher.shareText(str, null, null)) {
                    RealObservabilityManager realObservabilityManager = inviteContactsPresenter.observabilityManager;
                    ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
                    ViewTracking startTrackingView$default = RealObservabilityManager.startTrackingView$default(realObservabilityManager, "invite_friends_share_sheet");
                    if (startTrackingView$default != null) {
                        ViewTracking.viewEnded$default(startTrackingView$default);
                    }
                    Analytics analytics = inviteContactsPresenter.analytics;
                    ContactInviteEntryPoint contactInviteEntryPoint = inviteContactsPresenter.entryPoint;
                    analytics.track(new ContactInviteViewInvitationShareSheet(contactInviteEntryPoint != null ? contactInviteEntryPoint.name() : null), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
