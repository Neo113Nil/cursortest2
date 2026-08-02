package androidx.glance.session;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.glance.EmittableWithChildren;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.RemoteViewsRoot;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.BrandCollectionData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.cdf.asset.AssetPoolAddPoolMember;
import com.squareup.cash.cdf.asset.AssetPoolRemovePoolMember;
import com.squareup.cash.cdf.globalsearch.GlobalSearchSearchComplete;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.family.familyhub.views.WalletMetrics;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$submitPayment$2;
import com.squareup.cash.pools.backend.api.AddPoolParticipantFailureReason;
import com.squareup.cash.pools.backend.api.RemovePoolParticipantFailureReason;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.pools.presenters.PoolInvitePeopleListPresenter$WhenMappings;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.viewmodels.InviteMemberSnackBarViewModel;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.protos.cash.pools.AddCustomersToPoolResponse;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SessionWorkerKt$runSession$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $$this$launch;
    public final /* synthetic */ Object $context;
    public Object $lastRecomposeCount;
    public final /* synthetic */ int $r8$classId;
    public Object $recomposer;
    public final /* synthetic */ Object $root;
    public Object $session;
    public final /* synthetic */ Object $this_runSession;
    public final /* synthetic */ Object $timeouts;
    public /* synthetic */ Object $uiReady;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorkerKt$runSession$4$1(MainPaymentPresenter mainPaymentPresenter, Profile profile, Object obj, Object obj2, Object obj3, Object obj4, State state, MutableState mutableState, State state2, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = mainPaymentPresenter;
        this.$session = profile;
        this.$recomposer = obj;
        this.$lastRecomposeCount = obj2;
        this.$uiReady = obj3;
        this.$context = obj4;
        this.$root = state;
        this.$this_runSession = mutableState;
        this.$timeouts = state2;
        this.$$this$launch = mutableState2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01a2, code lost:
    
        if (r0 == r13) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03a3, code lost:
    
        if (r0 == r13) goto L130;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$pools$presenters$PoolInvitePeopleListPresenter$models$4$1(Object obj) {
        Object obj2;
        MutableState mutableState;
        Object obj3;
        Recipient recipient;
        MutableState mutableState2;
        PoolsListPresenter poolsListPresenter;
        Object addPoolParticipants;
        Object removePoolParticipants;
        Object obj4;
        Object obj5;
        Image image;
        Object obj6;
        MutableState mutableState3 = (MutableState) this.$lastRecomposeCount;
        MutableState mutableState4 = (MutableState) this.$$this$launch;
        MutableState mutableState5 = (MutableState) this.$timeouts;
        MutableState mutableState6 = (MutableState) this.$root;
        MutableState mutableState7 = (MutableState) this.$this_runSession;
        MutableState mutableState8 = (MutableState) this.$context;
        MutableState mutableState9 = (MutableState) this.$uiReady;
        PoolsListPresenter poolsListPresenter2 = (PoolsListPresenter) this.$recomposer;
        RealPoolsRepository realPoolsRepository = (RealPoolsRepository) poolsListPresenter2.repository;
        PoolInvitePeopleListScreen poolInvitePeopleListScreen = (PoolInvitePeopleListScreen) poolsListPresenter2.flowToken;
        AndroidStringManager androidStringManager = (AndroidStringManager) poolsListPresenter2.stringManager;
        PoolInvitePeopleListViewEvent poolInvitePeopleListViewEvent = (PoolInvitePeopleListViewEvent) this.$session;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = R.string.pools_toast_error_unspecified_body;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            List list = (List) mutableState3.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((Section) it.next()).recipients, arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                Iterator it3 = it2;
                if (Intrinsics.areEqual(((Recipient) obj2).customerId, ((PoolInvitePeopleListViewEvent.AddCustomerToPool) poolInvitePeopleListViewEvent).token)) {
                    break;
                }
                it2 = it3;
            }
            Recipient recipient2 = (Recipient) obj2;
            Recipient.Analytics analytics = recipient2 != null ? recipient2.analytics : null;
            PoolInvitePeopleListViewEvent.AddCustomerToPool addCustomerToPool = (PoolInvitePeopleListViewEvent.AddCustomerToPool) poolInvitePeopleListViewEvent;
            mutableState = mutableState6;
            mutableState9.setValue(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(addCustomerToPool.token), (Collection) mutableState9.getValue()));
            List list2 = (List) mutableState3.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Iterator it4 = list2.iterator(); it4.hasNext(); it4 = it4) {
                CollectionsKt__MutableCollectionsKt.addAll(((Section) it4.next()).recipients, arrayList2);
            }
            Iterator it5 = arrayList2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj3 = null;
                    break;
                }
                Object next = it5.next();
                Iterator it6 = it5;
                obj3 = next;
                if (Intrinsics.areEqual(((Recipient) next).customerId, addCustomerToPool.token)) {
                    break;
                }
                it5 = it6;
            }
            obj3.getClass();
            recipient = (Recipient) obj3;
            mutableState2 = mutableState4;
            boolean contains = ((List) mutableState8.getValue()).contains(addCustomerToPool.token);
            Analytics analytics2 = (Analytics) poolsListPresenter2.analytics;
            if (contains) {
                String str = poolInvitePeopleListScreen.flowToken;
                String str2 = poolInvitePeopleListScreen.token;
                String str3 = analytics != null ? analytics.section : null;
                Integer num = analytics != null ? analytics.sectionIndex : null;
                Integer num2 = analytics != null ? analytics.searchTextLength : null;
                String str4 = analytics != null ? analytics.entityToken : null;
                str.getClass();
                str2.getClass();
                analytics2.track(new AssetPoolRemovePoolMember(num2, num, str, str2, str3, str4), null);
                String str5 = poolInvitePeopleListScreen.token;
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(addCustomerToPool.token);
                this.L$0 = recipient;
                this.label = 1;
                removePoolParticipants = realPoolsRepository.removePoolParticipants(str5, listOf, this);
            } else {
                poolsListPresenter = poolsListPresenter2;
                mutableState4 = mutableState2;
                String str6 = poolInvitePeopleListScreen.flowToken;
                String str7 = poolInvitePeopleListScreen.token;
                str6.getClass();
                str7.getClass();
                analytics2.track(new AssetPoolAddPoolMember(analytics != null ? analytics.searchTextLength : null, analytics != null ? analytics.sectionIndex : null, str6, str7, analytics != null ? analytics.section : null, analytics != null ? analytics.entityToken : null), null);
                String str8 = poolInvitePeopleListScreen.token;
                List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(addCustomerToPool.token);
                this.L$0 = recipient;
                this.label = 2;
                addPoolParticipants = realPoolsRepository.addPoolParticipants(str8, listOf2, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            Recipient recipient3 = (Recipient) this.L$0;
            SafeTrace.throwOnFailure(obj);
            mutableState2 = mutableState4;
            mutableState = mutableState6;
            recipient = recipient3;
            removePoolParticipants = obj;
            RemovePoolParticipantFailureReason removePoolParticipantFailureReason = (RemovePoolParticipantFailureReason) removePoolParticipants;
            PoolInvitePeopleListViewEvent.AddCustomerToPool addCustomerToPool2 = (PoolInvitePeopleListViewEvent.AddCustomerToPool) poolInvitePeopleListViewEvent;
            mutableState9.setValue(CollectionsKt.minus((List) mutableState9.getValue(), addCustomerToPool2.token));
            if (removePoolParticipantFailureReason != null) {
                AbstractPersistentList abstractPersistentList = (AbstractPersistentList) mutableState.getValue();
                ArrayList arrayList3 = new ArrayList();
                ListIterator listIterator = abstractPersistentList.listIterator(0);
                while (listIterator.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((PoolListSection) listIterator.next()).people, arrayList3);
                }
                Iterator it7 = arrayList3.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it7.next();
                    if (Intrinsics.areEqual(((PoolListSection.PoolListPerson) obj4).customerId, addCustomerToPool2.token)) {
                        break;
                    }
                }
                PoolListSection.PoolListPerson poolListPerson = (PoolListSection.PoolListPerson) obj4;
                String str9 = poolListPerson != null ? poolListPerson.displayName : null;
                if (str9 == null) {
                    str9 = "";
                }
                if (!(removePoolParticipantFailureReason instanceof RemovePoolParticipantFailureReason.HttpFailure) && !removePoolParticipantFailureReason.equals(RemovePoolParticipantFailureReason.NetworkFailure.INSTANCE)) {
                    if (!(removePoolParticipantFailureReason instanceof RemovePoolParticipantFailureReason.SuccessfulRequestFailureReason)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RemoveCustomersFromPoolResponse.FailureReason failureReason = (RemoveCustomersFromPoolResponse.FailureReason) CollectionsKt.firstOrNull((List) ((RemovePoolParticipantFailureReason.SuccessfulRequestFailureReason) removePoolParticipantFailureReason).errors);
                    int i3 = failureReason != null ? PoolInvitePeopleListPresenter$WhenMappings.$EnumSwitchMapping$1[failureReason.ordinal()] : -1;
                    if (i3 == 1) {
                        i2 = R.string.pools_member_list_unable_to_remove_subtitle_already_contributed;
                    } else if (i3 == 2) {
                        i2 = R.string.pools_member_list_unable_to_remove_subtitle_pool_closed;
                    }
                }
                String str10 = androidStringManager.get(i2);
                ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "name", str9);
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.pools_remove_error_title)).format(m);
                format2.getClass();
                mutableState7.setValue(new InviteMemberSnackBarViewModel(format2, str10, Icons.Failed24, 8));
            } else {
                mutableState8.setValue(CollectionsKt.minus((List) mutableState8.getValue(), addCustomerToPool2.token));
                String str11 = recipient.displayName;
                ArrayMap m2 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str11, "name", str11);
                Resources resources2 = androidStringManager.resources;
                resources2.getClass();
                String format3 = new MessageFormat(resources2.getString(R.string.pools_member_list_successful_removal_title)).format(m2);
                format3.getClass();
                mutableState7.setValue(new InviteMemberSnackBarViewModel(format3, androidStringManager.get(R.string.pools_member_list_successful_removal_subtitle), Icons.Check24, 8));
                if (poolInvitePeopleListScreen.alreadyAddedCustomerTokens.contains(addCustomerToPool2.token) || ((List) mutableState5.getValue()).contains(addCustomerToPool2.token)) {
                    mutableState5.setValue(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(addCustomerToPool2.token), (Collection) mutableState5.getValue()));
                }
                List list3 = (List) mutableState2.getValue();
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(((PoolParticipant) it8.next()).customer_identifier);
                }
                if (arrayList4.contains(addCustomerToPool2.token)) {
                    List list4 = (List) mutableState2.getValue();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj7 : list4) {
                        if (!Intrinsics.areEqual(((PoolParticipant) obj7).customer_identifier, addCustomerToPool2.token)) {
                            arrayList5.add(obj7);
                        }
                    }
                    mutableState2.setValue(arrayList5);
                }
            }
            poolsListPresenter = poolsListPresenter2;
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Recipient recipient4 = (Recipient) this.L$0;
            SafeTrace.throwOnFailure(obj);
            mutableState = mutableState6;
            poolsListPresenter = poolsListPresenter2;
            recipient = recipient4;
            addPoolParticipants = obj;
            AddPoolParticipantFailureReason addPoolParticipantFailureReason = (AddPoolParticipantFailureReason) addPoolParticipants;
            PoolInvitePeopleListViewEvent.AddCustomerToPool addCustomerToPool3 = (PoolInvitePeopleListViewEvent.AddCustomerToPool) poolInvitePeopleListViewEvent;
            mutableState9.setValue(CollectionsKt.minus((List) mutableState9.getValue(), addCustomerToPool3.token));
            if (addPoolParticipantFailureReason != null) {
                AbstractPersistentList abstractPersistentList2 = (AbstractPersistentList) mutableState.getValue();
                ArrayList arrayList6 = new ArrayList();
                ListIterator listIterator2 = abstractPersistentList2.listIterator(0);
                while (listIterator2.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((PoolListSection) listIterator2.next()).people, arrayList6);
                }
                Iterator it9 = arrayList6.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it9.next();
                    if (Intrinsics.areEqual(((PoolListSection.PoolListPerson) obj6).customerId, addCustomerToPool3.token)) {
                        break;
                    }
                }
                PoolListSection.PoolListPerson poolListPerson2 = (PoolListSection.PoolListPerson) obj6;
                String str12 = poolListPerson2 != null ? poolListPerson2.displayName : null;
                if (str12 == null) {
                    str12 = "";
                }
                if (!(addPoolParticipantFailureReason instanceof AddPoolParticipantFailureReason.HttpFailure) && !(addPoolParticipantFailureReason instanceof AddPoolParticipantFailureReason.NetworkFailure)) {
                    if (!(addPoolParticipantFailureReason instanceof AddPoolParticipantFailureReason.SuccessfulRequestFailureReason)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AddCustomersToPoolResponse.FailureReason failureReason2 = (AddCustomersToPoolResponse.FailureReason) CollectionsKt.firstOrNull((List) ((AddPoolParticipantFailureReason.SuccessfulRequestFailureReason) addPoolParticipantFailureReason).errors);
                    switch (failureReason2 != null ? PoolInvitePeopleListPresenter$WhenMappings.$EnumSwitchMapping$0[failureReason2.ordinal()] : -1) {
                        case -1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            break;
                        case 0:
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        case 1:
                            i2 = R.string.pools_add_error_max_capacity_body;
                            break;
                        case 2:
                            i2 = R.string.pools_add_error_ineligible_body;
                            break;
                    }
                    return null;
                }
                String str13 = androidStringManager.get(i2);
                ArrayMap m3 = zzel$EnumUnboxingLocalUtility.m(1, "name", str12);
                Resources resources3 = androidStringManager.resources;
                resources3.getClass();
                String format4 = new MessageFormat(resources3.getString(R.string.pools_add_error_title)).format(m3);
                format4.getClass();
                mutableState7.setValue(new InviteMemberSnackBarViewModel(format4, str13, Icons.Failed24, 8));
            } else {
                mutableState8.setValue(CollectionsKt.plus((Collection) mutableState8.getValue(), (Object) addCustomerToPool3.token));
                String str14 = recipient.displayName;
                ArrayMap m4 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str14, "name", str14);
                Resources resources4 = androidStringManager.resources;
                resources4.getClass();
                String format5 = new MessageFormat(resources4.getString(R.string.pools_member_list_successful_add_title)).format(m4);
                format5.getClass();
                mutableState7.setValue(new InviteMemberSnackBarViewModel(format5, androidStringManager.get(R.string.pools_member_list_successful_add_subtitle), Icons.Check24, 8));
                List list5 = (List) mutableState4.getValue();
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                Iterator it10 = list5.iterator();
                while (it10.hasNext()) {
                    arrayList7.add(((PoolParticipant) it10.next()).customer_identifier);
                }
                if (!arrayList7.contains(addCustomerToPool3.token)) {
                    AbstractPersistentList abstractPersistentList3 = (AbstractPersistentList) mutableState.getValue();
                    ArrayList arrayList8 = new ArrayList();
                    ListIterator listIterator3 = abstractPersistentList3.listIterator(0);
                    while (listIterator3.hasNext()) {
                        CollectionsKt__MutableCollectionsKt.addAll(((PoolListSection) listIterator3.next()).people, arrayList8);
                    }
                    Iterator it11 = arrayList8.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            obj5 = null;
                            break;
                        }
                        obj5 = it11.next();
                        if (Intrinsics.areEqual(((PoolListSection.PoolListPerson) obj5).customerId, addCustomerToPool3.token)) {
                            break;
                        }
                    }
                    PoolListSection.PoolListPerson poolListPerson3 = (PoolListSection.PoolListPerson) obj5;
                    mutableState4.setValue(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(new PoolParticipant(poolListPerson3 != null ? poolListPerson3.customerId : null, null, poolListPerson3 != null ? poolListPerson3.displayName : null, (poolListPerson3 == null || (image = poolListPerson3.photoImage) == null) ? null : image.light_url, PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER, poolListPerson3 != null ? poolListPerson3.cashtag : null, null, ByteString.EMPTY)), (Collection) mutableState4.getValue()));
                } else if (((List) mutableState5.getValue()).contains(addCustomerToPool3.token)) {
                    mutableState5.setValue(CollectionsKt.minus((List) mutableState5.getValue(), addCustomerToPool3.token));
                }
            }
        }
        mutableState.setValue(PoolsListPresenter.access$buildDisplayableSections(poolsListPresenter, (List) mutableState3.getValue(), (List) mutableState9.getValue(), (List) mutableState8.getValue()));
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$$this$launch;
        Object obj3 = this.$timeouts;
        Object obj4 = this.$this_runSession;
        Object obj5 = this.$root;
        Object obj6 = this.$context;
        switch (i) {
            case 0:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$1 = new SessionWorkerKt$runSession$4$1((AppWidgetSession) this.$session, (Recomposer) this.$recomposer, (Ref$LongRef) this.$lastRecomposeCount, (StateFlowImpl) this.$uiReady, (Context) obj6, (RemoteViewsRoot) obj5, (TimerScopeKt$withTimer$2$1$blockScope$1) obj4, (TimeoutOptions) obj3, (CoroutineScope) obj2, continuation, 0);
                sessionWorkerKt$runSession$4$1.L$0 = obj;
                return sessionWorkerKt$runSession$4$1;
            case 1:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$12 = new SessionWorkerKt$runSession$4$1((Flow) this.$session, continuation, (LocalHomePresenter) this.$recomposer, (JWECryptoParts) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, 1);
                sessionWorkerKt$runSession$4$12.L$0 = obj;
                return sessionWorkerKt$runSession$4$12;
            case 2:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$13 = new SessionWorkerKt$runSession$4$1((Flow) this.$session, continuation, (LocalHomePresenter) this.$recomposer, (MutableSharedFlow) this.$lastRecomposeCount, (List) this.$uiReady, (BrandCollectionData.Location) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, 2);
                sessionWorkerKt$runSession$4$13.L$0 = obj;
                return sessionWorkerKt$runSession$4$13;
            case 3:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$14 = new SessionWorkerKt$runSession$4$1((Flow) this.$session, continuation, (LocalHomePresenter) this.$recomposer, (SnapshotStateMap) this.$lastRecomposeCount, (Ref$ObjectRef) this.$uiReady, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, 3);
                sessionWorkerKt$runSession$4$14.L$0 = obj;
                return sessionWorkerKt$runSession$4$14;
            case 4:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$15 = new SessionWorkerKt$runSession$4$1((Flow) this.$session, continuation, (FilesetUploadPresenter) this.$recomposer, (MutableState) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (ParcelableSnapshotMutableIntState) obj3, (MutableState) obj2, 4);
                sessionWorkerKt$runSession$4$15.L$0 = obj;
                return sessionWorkerKt$runSession$4$15;
            case 5:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$16 = new SessionWorkerKt$runSession$4$1((Function0) this.$session, (Animatable) this.$recomposer, (Animatable) this.$lastRecomposeCount, (Animatable) this.$uiReady, (WalletMetrics) obj6, (Animatable) obj5, (Animatable) obj4, (Animatable) obj3, (Function0) obj2, continuation, 5);
                sessionWorkerKt$runSession$4$16.L$0 = obj;
                return sessionWorkerKt$runSession$4$16;
            case 6:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$17 = new SessionWorkerKt$runSession$4$1((CharSequence) obj6, (StuckPlayerDetector) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation);
                sessionWorkerKt$runSession$4$17.$uiReady = obj;
                return sessionWorkerKt$runSession$4$17;
            case 7:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$18 = new SessionWorkerKt$runSession$4$1((Flow) this.$session, continuation, (InvestingStockDetailsPresenter) this.$recomposer, (ColorModel.Accented) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj6, (Investing_settings) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, 7);
                sessionWorkerKt$runSession$4$18.L$0 = obj;
                return sessionWorkerKt$runSession$4$18;
            case 8:
                return new SessionWorkerKt$runSession$4$1((MainPaymentPresenter) this.L$0, (Profile) this.$session, (List) this.$recomposer, (InstrumentLinkingConfig) this.$lastRecomposeCount, (State) this.$uiReady, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (State) obj3, (MutableState) obj2, continuation, 8);
            case 9:
                return new SessionWorkerKt$runSession$4$1((MainPaymentPresenter) this.L$0, (Profile) this.$session, (InstrumentSelection) this.$recomposer, (BalanceSnapshot) this.$lastRecomposeCount, (List) this.$uiReady, (InstrumentLinkingConfig) obj6, (State) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation, 9);
            case 10:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$19 = new SessionWorkerKt$runSession$4$1((Flow) this.$session, continuation, (PoolsListPresenter) this.$recomposer, (MutableState) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, 10);
                sessionWorkerKt$runSession$4$19.L$0 = obj;
                return sessionWorkerKt$runSession$4$19;
            case 11:
                return new SessionWorkerKt$runSession$4$1((PoolInvitePeopleListViewEvent) this.$session, (PoolsListPresenter) this.$recomposer, (MutableState) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation, 11);
            case 12:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$110 = new SessionWorkerKt$runSession$4$1((Flow) this.$session, continuation, (LocalEditorialPresenter) this.$recomposer, (CoroutineScope) obj2, (MutableState) this.$lastRecomposeCount, (State) this.$uiReady, (Function1) obj6, (Function0) obj5, (State) obj4, (MutableState) obj3);
                sessionWorkerKt$runSession$4$110.L$0 = obj;
                return sessionWorkerKt$runSession$4$110;
            default:
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$111 = new SessionWorkerKt$runSession$4$1((Flow) this.$session, continuation, (ArticlePresenter) this.$recomposer, (MutableState) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj6, (State) obj5, (MutableState) obj4, (ParcelableSnapshotMutableIntState) obj3, (MutableState) obj2, 13);
                sessionWorkerKt$runSession$4$111.L$0 = obj;
                return sessionWorkerKt$runSession$4$111;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((SessionWorkerKt$runSession$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0399, code lost:
    
        if (r6 == r7) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0551, code lost:
    
        if (r9.snapTo(r0, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x053e, code lost:
    
        if (r13.snapTo(r1, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0529, code lost:
    
        if (r14.snapTo(r0, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0516, code lost:
    
        if (r1.snapTo(r2, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0501, code lost:
    
        if (r2.snapTo(r0, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x067a, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(120, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0656, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(80, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0630, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(300, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x060c, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(180, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05fd, code lost:
    
        if (r9.snapTo(r6, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05eb, code lost:
    
        if (r13.snapTo(r8, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x05d7, code lost:
    
        if (r14.snapTo(r6, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x05c5, code lost:
    
        if (r1.snapTo(r8, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05b1, code lost:
    
        if (r2.snapTo(r6, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x059f, code lost:
    
        if (r0.snapTo(r6, r37) == r4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x088b, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0869, code lost:
    
        if (r4 == r3) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0498, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r0).collect(r19, r37) == r7) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0419 A[Catch: all -> 0x04a6, TryCatch #2 {all -> 0x04a6, blocks: (B:109:0x0453, B:121:0x0437, B:128:0x03f5, B:134:0x0410, B:135:0x041b, B:139:0x0413, B:140:0x0416, B:141:0x0419), top: B:127:0x03f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03dc  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object processEmittableTree;
        ?? r1;
        MutableState mutableState;
        CharSequence charSequence;
        MutableState mutableState2;
        Object obj2;
        Analytics analytics;
        SearchOrigin searchOrigin;
        Object sharedPreference;
        Object sharedPreference2;
        String str;
        Analytics analytics2;
        Object sharedPreference3;
        String str2;
        String obj3;
        Object sharedPreference4;
        RealGlobalSearchRepository realGlobalSearchRepository;
        SearchRequest.Origin origin;
        String str3;
        Object sharedPreference5;
        RealGlobalSearchRepository realGlobalSearchRepository2;
        ProduceStateScope produceStateScope;
        Object search;
        boolean booleanValue;
        int i = this.$r8$classId;
        Object obj4 = this.$timeouts;
        Object obj5 = this.$$this$launch;
        Object obj6 = this.$this_runSession;
        Object obj7 = this.$root;
        Object obj8 = this.$context;
        switch (i) {
            case 0:
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.$lastRecomposeCount;
                Recomposer recomposer = (Recomposer) this.$recomposer;
                StateFlowImpl stateFlowImpl = (StateFlowImpl) this.$uiReady;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = ((Recomposer.State) this.L$0).ordinal();
                    if (ordinal == 0) {
                        JobKt.cancel((CoroutineScope) obj5, (CancellationException) null);
                    } else if (ordinal == 4) {
                        if (recomposer.changeCount > ref$LongRef.element || !((Boolean) stateFlowImpl.getValue()).booleanValue()) {
                            EmittableWithChildren emittableWithChildren = (EmittableWithChildren) ((RemoteViewsRoot) obj7).copy();
                            this.label = 1;
                            processEmittableTree = ((AppWidgetSession) this.$session).processEmittableTree((Context) obj8, emittableWithChildren, this);
                            break;
                        }
                        ref$LongRef.element = recomposer.changeCount;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ((TimerScopeKt$withTimer$2$1$blockScope$1) obj6).m1129startTimerLRDsOJo(((TimeoutOptions) obj4).initialTimeout);
                    ref$LongRef.element = recomposer.changeCount;
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                processEmittableTree = obj;
                boolean booleanValue2 = ((Boolean) processEmittableTree).booleanValue();
                if (!((Boolean) stateFlowImpl.getValue()).booleanValue() && booleanValue2) {
                    Boolean bool = Boolean.TRUE;
                    this.label = 2;
                    stateFlowImpl.updateState(null, bool);
                    break;
                }
                ref$LongRef.element = recomposer.changeCount;
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$session;
                    ArticlePresenter$models$$inlined$CollectEffect$1$1 articlePresenter$models$$inlined$CollectEffect$1$1 = new ArticlePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (LocalHomePresenter) this.$recomposer, (JWECryptoParts) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj4, (MutableState) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(articlePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$session;
                    PoolDetailsPresenter$models$$inlined$CollectEffect$1$1 poolDetailsPresenter$models$$inlined$CollectEffect$1$1 = new PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (LocalHomePresenter) this.$recomposer, (MutableSharedFlow) this.$lastRecomposeCount, (List) this.$uiReady, (BrandCollectionData.Location) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj4, (MutableState) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(poolDetailsPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$session;
                    ArticlePresenter$models$$inlined$CollectEffect$1$1 articlePresenter$models$$inlined$CollectEffect$1$12 = new ArticlePresenter$models$$inlined$CollectEffect$1$1(coroutineScope3, (LocalHomePresenter) this.$recomposer, (SnapshotStateMap) this.$lastRecomposeCount, (Ref$ObjectRef) this.$uiReady, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj4, (MutableState) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(articlePresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$session;
                    ArticlePresenter$models$$inlined$CollectEffect$1$1 articlePresenter$models$$inlined$CollectEffect$1$13 = new ArticlePresenter$models$$inlined$CollectEffect$1$1(coroutineScope4, (FilesetUploadPresenter) this.$recomposer, (MutableState) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (ParcelableSnapshotMutableIntState) obj4, (MutableState) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(articlePresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                Animatable animatable = (Animatable) this.$recomposer;
                Animatable animatable2 = (Animatable) obj4;
                Animatable animatable3 = (Animatable) obj6;
                Animatable animatable4 = (Animatable) obj7;
                Animatable animatable5 = (Animatable) this.$uiReady;
                Animatable animatable6 = (Animatable) this.$lastRecomposeCount;
                WalletMetrics walletMetrics = (WalletMetrics) obj8;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                Continuation continuation = null;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        ((Function0) this.$session).invoke();
                        Float f = new Float(0.64f);
                        this.L$0 = coroutineScope5;
                        this.label = 1;
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                        this.L$0 = coroutineScope5;
                        this.label = 2;
                        break;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        Float f3 = new Float(walletMetrics.cardRevealTopPx);
                        this.L$0 = coroutineScope5;
                        this.label = 3;
                        break;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        Float f4 = new Float(RecyclerView.DECELERATION_RATE);
                        this.L$0 = coroutineScope5;
                        this.label = 4;
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        Float f5 = new Float(walletMetrics.dollarStartTopPx);
                        this.L$0 = coroutineScope5;
                        this.label = 5;
                        break;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        Float f6 = new Float(RecyclerView.DECELERATION_RATE);
                        this.L$0 = coroutineScope5;
                        this.label = 6;
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = coroutineScope5;
                        this.label = 7;
                        break;
                    case 7:
                        SafeTrace.throwOnFailure(obj);
                        JobKt.launch$default(coroutineScope5, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable6, continuation, 26), 3);
                        JobKt.launch$default(coroutineScope5, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable, continuation, 27), 3);
                        this.L$0 = coroutineScope5;
                        this.label = 8;
                        break;
                    case 8:
                        SafeTrace.throwOnFailure(obj);
                        AnimationsKt$takeUntil$1$1.AnonymousClass1 anonymousClass1 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(animatable4, animatable5, walletMetrics, continuation, 1);
                        r1 = 0;
                        JobKt.launch$default(coroutineScope5, null, null, anonymousClass1, 3);
                        this.L$0 = coroutineScope5;
                        this.label = 9;
                        break;
                    case 9:
                        SafeTrace.throwOnFailure(obj);
                        r1 = 0;
                        JobKt.launch$default(coroutineScope5, r1, r1, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable2, r1, 28), 3);
                        JobKt.launch$default(coroutineScope5, r1, r1, new FormCashtag.AnonymousClass8.AnonymousClass2(animatable3, walletMetrics, r1, 11), 3);
                        this.L$0 = r1;
                        this.label = 10;
                        break;
                    case 10:
                        SafeTrace.throwOnFailure(obj);
                        ((Function0) obj5).invoke();
                        return Unit.INSTANCE;
                    case 11:
                        SafeTrace.throwOnFailure(obj);
                        Float f7 = new Float(1.0f);
                        this.L$0 = null;
                        this.label = 12;
                        break;
                    case 12:
                        SafeTrace.throwOnFailure(obj);
                        Float f8 = new Float(walletMetrics.cardRestTopPx);
                        this.L$0 = null;
                        this.label = 13;
                        break;
                    case 13:
                        SafeTrace.throwOnFailure(obj);
                        Float f9 = new Float(1.0f);
                        this.L$0 = null;
                        this.label = 14;
                        break;
                    case 14:
                        SafeTrace.throwOnFailure(obj);
                        Float f10 = new Float(walletMetrics.dollarRestTopPx);
                        this.L$0 = null;
                        this.label = 15;
                        break;
                    case 15:
                        SafeTrace.throwOnFailure(obj);
                        Float f11 = new Float(1.0f);
                        this.L$0 = null;
                        this.label = 16;
                        break;
                    case 16:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 6:
                MutableState mutableState3 = (MutableState) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                CharSequence charSequence2 = (CharSequence) obj8;
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj7;
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.$uiReady;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                try {
                    switch (this.label) {
                        case 0:
                            charSequence = charSequence2;
                            SafeTrace.throwOnFailure(obj);
                            if (StringsKt.isBlank(charSequence)) {
                                RealGlobalSearchRepository realGlobalSearchRepository3 = (RealGlobalSearchRepository) stuckPlayerDetector.callback;
                                realGlobalSearchRepository3.cacheKey = null;
                                StateFlowKt.emitOrThrow(realGlobalSearchRepository3.cachedData, null);
                                return Unit.INSTANCE;
                            }
                            ((MutableState) obj6).setValue(Boolean.TRUE);
                            if (!((Boolean) mutableState4.getValue()).booleanValue()) {
                                analytics = (Analytics) stuckPlayerDetector.stuckPlayingDetector;
                                searchOrigin = ((GlobalSearchScreen) stuckPlayerDetector.playerListener).searchOrigin;
                                RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                                this.$uiReady = produceStateScope2;
                                this.L$0 = searchOrigin;
                                this.$session = analytics;
                                this.label = 1;
                                sharedPreference = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", this);
                                break;
                            } else {
                                mutableState2 = mutableState3;
                                obj2 = obj5;
                                try {
                                    RealGlobalSearchRepository realGlobalSearchRepository4 = (RealGlobalSearchRepository) stuckPlayerDetector.callback;
                                    obj3 = charSequence.toString();
                                    int ordinal2 = ((GlobalSearchScreen) stuckPlayerDetector.playerListener).searchOrigin.ordinal();
                                    SearchRequest.Origin origin2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? SearchRequest.Origin.UNSPECIFIED : SearchRequest.Origin.ACTIVITY : SearchRequest.Origin.PAYMENT_PAD : SearchRequest.Origin.MONEY;
                                    RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper2 = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                                    this.$uiReady = produceStateScope2;
                                    this.L$0 = realGlobalSearchRepository4;
                                    this.$session = obj3;
                                    this.$recomposer = origin2;
                                    this.$lastRecomposeCount = null;
                                    this.label = 4;
                                    sharedPreference4 = realGlobalSearchAnalyticsHelper2.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", this);
                                    if (sharedPreference4 == coroutineSingletons7) {
                                        return coroutineSingletons7;
                                    }
                                    realGlobalSearchRepository = realGlobalSearchRepository4;
                                    origin = origin2;
                                    str3 = (String) sharedPreference4;
                                    RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper3 = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                                    this.$uiReady = produceStateScope2;
                                    this.L$0 = realGlobalSearchRepository;
                                    this.$session = obj3;
                                    this.$recomposer = origin;
                                    this.$lastRecomposeCount = str3;
                                    this.label = 5;
                                    sharedPreference5 = realGlobalSearchAnalyticsHelper3.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", this);
                                    if (sharedPreference5 != coroutineSingletons7) {
                                        return coroutineSingletons7;
                                    }
                                    realGlobalSearchRepository2 = realGlobalSearchRepository;
                                    String str4 = (String) sharedPreference5;
                                    this.$uiReady = produceStateScope2;
                                    this.L$0 = null;
                                    this.$session = null;
                                    this.$recomposer = null;
                                    this.$lastRecomposeCount = null;
                                    this.label = 6;
                                    produceStateScope = produceStateScope2;
                                    mutableState = mutableState2;
                                    try {
                                        search = realGlobalSearchRepository2.search(obj3, origin, str4, str3, this);
                                        if (search == coroutineSingletons7) {
                                            return coroutineSingletons7;
                                        }
                                        LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(produceStateScope, (StuckPlayerDetector) obj7, (CharSequence) obj8, (MutableState) obj2, (MutableState) obj6, 23);
                                        this.$uiReady = null;
                                        this.label = 7;
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        mutableState.setValue(Boolean.TRUE);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    mutableState = mutableState2;
                                    mutableState.setValue(Boolean.TRUE);
                                    throw th;
                                }
                            }
                        case 1:
                            charSequence = charSequence2;
                            analytics = (Analytics) this.$session;
                            searchOrigin = (SearchOrigin) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            sharedPreference = obj;
                            String str5 = (String) sharedPreference;
                            RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper4 = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                            this.$uiReady = produceStateScope2;
                            this.L$0 = searchOrigin;
                            this.$session = str5;
                            this.$recomposer = analytics;
                            Analytics analytics3 = analytics;
                            this.label = 2;
                            sharedPreference2 = realGlobalSearchAnalyticsHelper4.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", this);
                            if (sharedPreference2 != coroutineSingletons7) {
                                str = str5;
                                analytics2 = analytics3;
                                String str6 = (String) sharedPreference2;
                                mutableState2 = mutableState3;
                                RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper5 = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                                this.$uiReady = produceStateScope2;
                                this.L$0 = searchOrigin;
                                this.$session = str;
                                this.$recomposer = str6;
                                this.$lastRecomposeCount = analytics2;
                                this.label = 3;
                                sharedPreference3 = realGlobalSearchAnalyticsHelper5.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", this);
                                if (sharedPreference3 != coroutineSingletons7) {
                                    str2 = str6;
                                    obj2 = obj5;
                                    analytics2.track(new GlobalSearchSearchComplete(str, str2, searchOrigin, (String) sharedPreference3), null);
                                    mutableState4.setValue(Boolean.TRUE);
                                    RealGlobalSearchRepository realGlobalSearchRepository42 = (RealGlobalSearchRepository) stuckPlayerDetector.callback;
                                    obj3 = charSequence.toString();
                                    int ordinal22 = ((GlobalSearchScreen) stuckPlayerDetector.playerListener).searchOrigin.ordinal();
                                    if (ordinal22 != 1) {
                                    }
                                    RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper22 = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                                    this.$uiReady = produceStateScope2;
                                    this.L$0 = realGlobalSearchRepository42;
                                    this.$session = obj3;
                                    this.$recomposer = origin2;
                                    this.$lastRecomposeCount = null;
                                    this.label = 4;
                                    sharedPreference4 = realGlobalSearchAnalyticsHelper22.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", this);
                                    if (sharedPreference4 == coroutineSingletons7) {
                                    }
                                }
                            }
                            return coroutineSingletons7;
                        case 2:
                            charSequence = charSequence2;
                            Analytics analytics4 = (Analytics) this.$recomposer;
                            String str7 = (String) this.$session;
                            SearchOrigin searchOrigin2 = (SearchOrigin) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            str = str7;
                            searchOrigin = searchOrigin2;
                            analytics2 = analytics4;
                            sharedPreference2 = obj;
                            String str62 = (String) sharedPreference2;
                            mutableState2 = mutableState3;
                            RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper52 = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                            this.$uiReady = produceStateScope2;
                            this.L$0 = searchOrigin;
                            this.$session = str;
                            this.$recomposer = str62;
                            this.$lastRecomposeCount = analytics2;
                            this.label = 3;
                            sharedPreference3 = realGlobalSearchAnalyticsHelper52.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", this);
                            if (sharedPreference3 != coroutineSingletons7) {
                            }
                            return coroutineSingletons7;
                        case 3:
                            Analytics analytics5 = (Analytics) this.$lastRecomposeCount;
                            String str8 = (String) this.$recomposer;
                            String str9 = (String) this.$session;
                            charSequence = charSequence2;
                            SearchOrigin searchOrigin3 = (SearchOrigin) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            mutableState2 = mutableState3;
                            str2 = str8;
                            str = str9;
                            analytics2 = analytics5;
                            searchOrigin = searchOrigin3;
                            sharedPreference3 = obj;
                            obj2 = obj5;
                            analytics2.track(new GlobalSearchSearchComplete(str, str2, searchOrigin, (String) sharedPreference3), null);
                            mutableState4.setValue(Boolean.TRUE);
                            RealGlobalSearchRepository realGlobalSearchRepository422 = (RealGlobalSearchRepository) stuckPlayerDetector.callback;
                            obj3 = charSequence.toString();
                            int ordinal222 = ((GlobalSearchScreen) stuckPlayerDetector.playerListener).searchOrigin.ordinal();
                            if (ordinal222 != 1) {
                            }
                            RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper222 = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                            this.$uiReady = produceStateScope2;
                            this.L$0 = realGlobalSearchRepository422;
                            this.$session = obj3;
                            this.$recomposer = origin2;
                            this.$lastRecomposeCount = null;
                            this.label = 4;
                            sharedPreference4 = realGlobalSearchAnalyticsHelper222.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", this);
                            if (sharedPreference4 == coroutineSingletons7) {
                            }
                            break;
                        case 4:
                            origin = (SearchRequest.Origin) this.$recomposer;
                            obj3 = (String) this.$session;
                            realGlobalSearchRepository = (RealGlobalSearchRepository) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            sharedPreference4 = obj;
                            mutableState2 = mutableState3;
                            obj2 = obj5;
                            str3 = (String) sharedPreference4;
                            RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper32 = (RealGlobalSearchAnalyticsHelper) stuckPlayerDetector.stuckBufferingDetector;
                            this.$uiReady = produceStateScope2;
                            this.L$0 = realGlobalSearchRepository;
                            this.$session = obj3;
                            this.$recomposer = origin;
                            this.$lastRecomposeCount = str3;
                            this.label = 5;
                            sharedPreference5 = realGlobalSearchAnalyticsHelper32.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", this);
                            if (sharedPreference5 != coroutineSingletons7) {
                            }
                            break;
                        case 5:
                            String str10 = (String) this.$lastRecomposeCount;
                            SearchRequest.Origin origin3 = (SearchRequest.Origin) this.$recomposer;
                            obj3 = (String) this.$session;
                            realGlobalSearchRepository2 = (RealGlobalSearchRepository) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            mutableState2 = mutableState3;
                            obj2 = obj5;
                            str3 = str10;
                            origin = origin3;
                            sharedPreference5 = obj;
                            String str42 = (String) sharedPreference5;
                            this.$uiReady = produceStateScope2;
                            this.L$0 = null;
                            this.$session = null;
                            this.$recomposer = null;
                            this.$lastRecomposeCount = null;
                            this.label = 6;
                            produceStateScope = produceStateScope2;
                            mutableState = mutableState2;
                            search = realGlobalSearchRepository2.search(obj3, origin, str42, str3, this);
                            if (search == coroutineSingletons7) {
                            }
                            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$12 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(produceStateScope, (StuckPlayerDetector) obj7, (CharSequence) obj8, (MutableState) obj2, (MutableState) obj6, 23);
                            this.$uiReady = null;
                            this.label = 7;
                            break;
                        case 6:
                            SafeTrace.throwOnFailure(obj);
                            search = obj;
                            produceStateScope = produceStateScope2;
                            obj2 = obj5;
                            mutableState = mutableState3;
                            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$122 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(produceStateScope, (StuckPlayerDetector) obj7, (CharSequence) obj8, (MutableState) obj2, (MutableState) obj6, 23);
                            this.$uiReady = null;
                            this.label = 7;
                            break;
                        case 7:
                            SafeTrace.throwOnFailure(obj);
                            mutableState = mutableState3;
                            mutableState.setValue(Boolean.TRUE);
                            return Unit.INSTANCE;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    mutableState = mutableState3;
                }
            case 7:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$session;
                    ArticlePresenter$models$$inlined$CollectEffect$1$1 articlePresenter$models$$inlined$CollectEffect$1$14 = new ArticlePresenter$models$$inlined$CollectEffect$1$1(coroutineScope6, (InvestingStockDetailsPresenter) this.$recomposer, (ColorModel.Accented) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj8, (Investing_settings) obj7, (MutableState) obj6, (MutableState) obj4, (MutableState) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(articlePresenter$models$$inlined$CollectEffect$1$14, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) this.L$0;
                    List list = CollectionsKt.toList(((Map) ((MutableState) obj8).getValue()).values());
                    String str11 = (String) ((MutableState) obj7).getValue();
                    Profile profile = (Profile) this.$session;
                    InstrumentSelection instrumentSelection = (InstrumentSelection) ((MutableState) obj6).getValue();
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) ((State) obj4).getValue();
                    List list2 = (List) this.$recomposer;
                    InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) this.$lastRecomposeCount;
                    Boolean bool2 = (Boolean) ((State) this.$uiReady).getValue();
                    booleanValue = bool2 != null ? bool2.booleanValue() : false;
                    List list3 = (List) ((MutableState) obj5).getValue();
                    this.label = 1;
                    Object coroutineScope7 = JobKt.coroutineScope(new MainPaymentPresenter$submitPayment$2(mainPaymentPresenter, list, profile, balanceSnapshot, list2, instrumentLinkingConfig, booleanValue, instrumentSelection, str11, false, list3, null), this);
                    if (coroutineScope7 != obj9) {
                        coroutineScope7 = Unit.INSTANCE;
                    }
                    if (coroutineScope7 == obj9) {
                        return obj9;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MainPaymentPresenter mainPaymentPresenter2 = (MainPaymentPresenter) this.L$0;
                    List list4 = CollectionsKt.toList(((Map) ((MutableState) obj6).getValue()).values());
                    String str12 = (String) ((MutableState) obj4).getValue();
                    Profile profile2 = (Profile) this.$session;
                    InstrumentSelection instrumentSelection2 = (InstrumentSelection) this.$recomposer;
                    BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) this.$lastRecomposeCount;
                    List list5 = (List) this.$uiReady;
                    InstrumentLinkingConfig instrumentLinkingConfig2 = (InstrumentLinkingConfig) obj8;
                    Boolean bool3 = (Boolean) ((State) obj7).getValue();
                    booleanValue = bool3 != null ? bool3.booleanValue() : false;
                    List list6 = (List) ((MutableState) obj5).getValue();
                    this.label = 1;
                    Object coroutineScope8 = JobKt.coroutineScope(new MainPaymentPresenter$submitPayment$2(mainPaymentPresenter2, list4, profile2, balanceSnapshot2, list5, instrumentLinkingConfig2, booleanValue, instrumentSelection2, str12, true, list6, null), this);
                    if (coroutineScope8 != obj10) {
                        coroutineScope8 = Unit.INSTANCE;
                    }
                    if (coroutineScope8 == obj10) {
                        return obj10;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$session;
                    ArticlePresenter$models$$inlined$CollectEffect$1$1 articlePresenter$models$$inlined$CollectEffect$1$15 = new ArticlePresenter$models$$inlined$CollectEffect$1$1(coroutineScope9, (PoolsListPresenter) this.$recomposer, (MutableState) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj4, (MutableState) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(articlePresenter$models$$inlined$CollectEffect$1$15, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                return invokeSuspend$com$squareup$cash$pools$presenters$PoolInvitePeopleListPresenter$models$4$1(obj);
            case 12:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$session;
                    PoolDetailsPresenter$models$$inlined$CollectEffect$1$1 poolDetailsPresenter$models$$inlined$CollectEffect$1$12 = new PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(coroutineScope10, (LocalEditorialPresenter) this.$recomposer, (CoroutineScope) obj5, (MutableState) this.$lastRecomposeCount, (State) this.$uiReady, (Function1) obj8, (Function0) obj7, (State) obj6, (MutableState) obj4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(poolDetailsPresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$session;
                    ArticlePresenter$models$$inlined$CollectEffect$1$1 articlePresenter$models$$inlined$CollectEffect$1$16 = new ArticlePresenter$models$$inlined$CollectEffect$1$1(coroutineScope11, (ArticlePresenter) this.$recomposer, (MutableState) this.$lastRecomposeCount, (MutableState) this.$uiReady, (MutableState) obj8, (State) obj7, (MutableState) obj6, (ParcelableSnapshotMutableIntState) obj4, (MutableState) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(articlePresenter$models$$inlined$CollectEffect$1$16, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorkerKt$runSession$4$1(CharSequence charSequence, StuckPlayerDetector stuckPlayerDetector, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.$context = charSequence;
        this.$root = stuckPlayerDetector;
        this.$this_runSession = mutableState;
        this.$timeouts = mutableState2;
        this.$$this$launch = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorkerKt$runSession$4$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$session = obj;
        this.$recomposer = obj2;
        this.$lastRecomposeCount = obj3;
        this.$uiReady = obj4;
        this.$context = obj5;
        this.$root = obj6;
        this.$this_runSession = obj7;
        this.$timeouts = obj8;
        this.$$this$launch = obj9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorkerKt$runSession$4$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, Object obj, Object obj2, Object obj3, Object obj4, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$session = flow;
        this.$recomposer = moleculePresenter;
        this.$lastRecomposeCount = obj;
        this.$uiReady = obj2;
        this.$context = obj3;
        this.$root = obj4;
        this.$this_runSession = mutableState;
        this.$timeouts = mutableState2;
        this.$$this$launch = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorkerKt$runSession$4$1(Flow flow, Continuation continuation, LocalEditorialPresenter localEditorialPresenter, CoroutineScope coroutineScope, MutableState mutableState, State state, Function1 function1, Function0 function0, State state2, MutableState mutableState2) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.$session = flow;
        this.$recomposer = localEditorialPresenter;
        this.$$this$launch = coroutineScope;
        this.$lastRecomposeCount = mutableState;
        this.$uiReady = state;
        this.$context = function1;
        this.$root = function0;
        this.$this_runSession = state2;
        this.$timeouts = mutableState2;
    }
}
