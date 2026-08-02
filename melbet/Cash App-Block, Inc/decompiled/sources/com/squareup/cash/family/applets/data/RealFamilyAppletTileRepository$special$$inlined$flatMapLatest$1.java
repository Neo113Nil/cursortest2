package com.squareup.cash.family.applets.data;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.presenters.settings.ShoppingSetting$isFeatureEligible$$inlined$map$1;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.activity.presenters.DependentActivitiesContextKt;
import com.squareup.cash.family.applets.backend.api.FamilyAppletConfig;
import com.squareup.cash.family.applets.data.FormattedTimestamp;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealFamilyAppletTileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(Continuation continuation, RealFamilyAppletTileRepository realFamilyAppletTileRepository, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realFamilyAppletTileRepository;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RealFamilyAppletTileRepository realFamilyAppletTileRepository = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1 realFamilyAppletTileRepository$special$$inlined$flatMapLatest$1 = new RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, realFamilyAppletTileRepository, 0);
                realFamilyAppletTileRepository$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
                realFamilyAppletTileRepository$special$$inlined$flatMapLatest$1.L$1 = obj2;
                return realFamilyAppletTileRepository$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1 realFamilyAppletTileRepository$special$$inlined$flatMapLatest$12 = new RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, realFamilyAppletTileRepository, 1);
                realFamilyAppletTileRepository$special$$inlined$flatMapLatest$12.L$0 = flowCollector;
                realFamilyAppletTileRepository$special$$inlined$flatMapLatest$12.L$1 = obj2;
                return realFamilyAppletTileRepository$special$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1 realFamilyAppletTileRepository$special$$inlined$flatMapLatest$13 = new RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, realFamilyAppletTileRepository, 2);
                realFamilyAppletTileRepository$special$$inlined$flatMapLatest$13.L$0 = flowCollector;
                realFamilyAppletTileRepository$special$$inlined$flatMapLatest$13.L$1 = obj2;
                return realFamilyAppletTileRepository$special$$inlined$flatMapLatest$13.invokeSuspend(Unit.INSTANCE);
            default:
                RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1 realFamilyAppletTileRepository$special$$inlined$flatMapLatest$14 = new RealFamilyAppletTileRepository$special$$inlined$flatMapLatest$1(continuation, realFamilyAppletTileRepository, 3);
                realFamilyAppletTileRepository$special$$inlined$flatMapLatest$14.L$0 = flowCollector;
                realFamilyAppletTileRepository$special$$inlined$flatMapLatest$14.L$1 = obj2;
                return realFamilyAppletTileRepository$special$$inlined$flatMapLatest$14.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow stateFlowKt$stateFlowOf$1;
        Flow appLockMonitor$special$$inlined$map$2;
        int i = this.$r8$classId;
        RealFamilyAppletTileRepository realFamilyAppletTileRepository = this.this$0;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FamilyAppletConfig familyAppletConfig = (FamilyAppletConfig) obj2;
                    String str = realFamilyAppletTileRepository.appletTitle;
                    if (familyAppletConfig instanceof FamilyAppletConfig.Sponsor) {
                        FamilyAppletConfig.Sponsor sponsor = (FamilyAppletConfig.Sponsor) familyAppletConfig;
                        ReadonlyStateFlow readonlyStateFlow = realFamilyAppletTileRepository.dependentAvatars;
                        String str2 = sponsor.pendingRequestsLabel;
                        stateFlowKt$stateFlowOf$1 = str2 != null ? StateFlowKt.mapState(readonlyStateFlow, new ProfileQueries$$ExternalSyntheticLambda13(realFamilyAppletTileRepository, sponsor, str2)) : StateFlowKt.combineState(realFamilyAppletTileRepository.formattedTimestamp, readonlyStateFlow, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(26, realFamilyAppletTileRepository, sponsor));
                    } else {
                        stateFlowKt$stateFlowOf$1 = ((familyAppletConfig instanceof FamilyAppletConfig.VerifiedNonSponsor) || (familyAppletConfig instanceof FamilyAppletConfig.Unverified)) ? new StateFlowKt$stateFlowOf$1(new FamilyAppletTileViewModel.Uninstalled(str, realFamilyAppletTileRepository.appletSubtitle, null)) : new StateFlowKt$stateFlowOf$1(new FamilyAppletTileViewModel.Loading(str));
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, stateFlowKt$stateFlowOf$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                RealFeatureEligibilityRepository realFeatureEligibilityRepository = realFamilyAppletTileRepository.featureEligibilityRepository;
                FlowCollector flowCollector2 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FamilyAppletConfig familyAppletConfig2 = (FamilyAppletConfig) obj3;
                    Flow shoppingSetting$isFeatureEligible$$inlined$map$1 = familyAppletConfig2 instanceof FamilyAppletConfig.Sponsor ? new ShoppingSetting$isFeatureEligible$$inlined$map$1(realFeatureEligibilityRepository.currentEligibleFeatures(), 1) : (Intrinsics.areEqual(familyAppletConfig2, FamilyAppletConfig.VerifiedNonSponsor.INSTANCE) || Intrinsics.areEqual(familyAppletConfig2, FamilyAppletConfig.Unverified.INSTANCE)) ? new ShoppingSetting$isFeatureEligible$$inlined$map$1(realFeatureEligibilityRepository.currentEligibleFeatures(), 1) : new AppLockMonitor$special$$inlined$map$2(AppletAvailabilityState.UNAVAILABLE, 19);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector2, shoppingSetting$isFeatureEligible$$inlined$map$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                FlowCollector flowCollector3 = this.L$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FamilyAppletConfig familyAppletConfig3 = (FamilyAppletConfig) obj4;
                    FamilyAppletConfig.Sponsor sponsor2 = familyAppletConfig3 instanceof FamilyAppletConfig.Sponsor ? (FamilyAppletConfig.Sponsor) familyAppletConfig3 : null;
                    List list = sponsor2 != null ? sponsor2.dependentCustomerTokens : null;
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(FormattedTimestamp.Loading.INSTANCE, 19);
                    } else {
                        LinkedHashMap linkedHashMap = RealFamilyAppletTileRepository.formattedTimestampCache;
                        List list3 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ActivitiesManager.ActivityContext dependentActivitiesContext$default = DependentActivitiesContextKt.dependentActivitiesContext$default((String) it.next(), (ActivityScope) null, 6);
                            ActivitiesManager create = realFamilyAppletTileRepository.activitiesManagerFactory.create(dependentActivitiesContext$default, realFamilyAppletTileRepository.activitiesCacheFactory.create(dependentActivitiesContext$default));
                            JobKt.launch$default(realFamilyAppletTileRepository.scope, null, null, new GooglePayPresenter$models$1$1(create, null, 17), 3);
                            arrayList.add(create.activities());
                        }
                        appLockMonitor$special$$inlined$map$2 = FlowKt.distinctUntilChanged(new RealActivityInvitePresenter(11, (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]), list, realFamilyAppletTileRepository));
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector3, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector4 = this.L$0;
                Object obj5 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FamilyAppletConfig familyAppletConfig4 = (FamilyAppletConfig) obj5;
                    FamilyAppletConfig.Sponsor sponsor3 = familyAppletConfig4 instanceof FamilyAppletConfig.Sponsor ? (FamilyAppletConfig.Sponsor) familyAppletConfig4 : null;
                    List list4 = sponsor3 != null ? sponsor3.dependentCustomerTokens : null;
                    List list5 = list4;
                    Flow appLockMonitor$special$$inlined$map$22 = (list5 == null || list5.isEmpty()) ? new AppLockMonitor$special$$inlined$map$2(EmptyList.INSTANCE, 19) : new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FormCashtag.AnonymousClass8.AnonymousClass2(list4, null, 4), new FormCashtag$8$invokeSuspend$$inlined$map$1(realFamilyAppletTileRepository.customerStore.getCustomersForIds(list4), 2));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector4, appLockMonitor$special$$inlined$map$22, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
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
