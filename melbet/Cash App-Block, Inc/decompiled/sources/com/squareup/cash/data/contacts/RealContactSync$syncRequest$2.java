package com.squareup.cash.data.contacts;

import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import androidx.camera.core.processing.TargetUtils;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.exifinterface.media.ExifInterfaceUtils;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.api.ApiResult;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.EstimatedCompletionDuration;
import app.cash.local.primitives.EstimatedCompletionDurationKt;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.text.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager$activities$2$1$2;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.bitcoin.presenters.BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$State;
import com.squareup.cash.bitcoin.presenters.ProcessAddressResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.BrowserCheckoutViewAutofillInfo;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.localclient.FulfillmentType;
import com.squareup.cash.cdf.localclient.LocalClientFulfillmentFlowClickSchedulingType;
import com.squareup.cash.cdf.localclient.SchedulingType;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter$completeClientScenario$1$1$result$1;
import com.squareup.cash.data.contacts.ContactSyncEvent;
import com.squareup.cash.data.contacts.ContactsSyncResponse;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.identityverification.backend.api.IdentityVerificationStatus;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.ContactBook$Contact$DetailedContact;
import com.squareup.cash.integration.contacts.ContactBook$ContactAccountDetails;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$bitcoin$1$bitcoinData$2;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.presenters.RealPaymentConfigurationRouter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.screens.CashtagRequiredScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SyncState$Progress;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$download$lambda$0$$inlined$map$1;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardNuxState$$ExternalSyntheticLambda0;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.CompleteScenarioResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealContactSync$syncRequest$2 extends SuspendLambda implements Function2 {
    public boolean $ignoreServerBackoff;
    public final /* synthetic */ Object $newContacts;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $softRateLimit;
    public Object $syncReason;
    public final /* synthetic */ Object $syncRoutines;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealContactSync$syncRequest$2(Object obj, Object obj2, Object obj3, boolean z, Object obj4, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$newContacts = obj2;
        this.this$0 = obj3;
        this.$ignoreServerBackoff = z;
        this.$syncRoutines = obj4;
        this.$softRateLimit = mutableState;
        this.$syncReason = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$newContacts;
        Object obj3 = this.$softRateLimit;
        Object obj4 = this.$syncRoutines;
        Object obj5 = this.this$0;
        switch (i) {
            case 0:
                RealContactSync$syncRequest$2 realContactSync$syncRequest$2 = new RealContactSync$syncRequest$2((ContactSyncEvent.NewContacts) obj2, (RealContactSync) obj5, (ContactSyncEvent.SyncRoutines) obj4, this.$ignoreServerBackoff, (Long) obj3, (ContactSync$SyncReason) this.$syncReason, continuation);
                realContactSync$syncRequest$2.L$0 = obj;
                return realContactSync$syncRequest$2;
            case 1:
                return new RealContactSync$syncRequest$2((String) this.L$0, (String) obj2, (RealCartBuilder) obj5, this.$ignoreServerBackoff, (LocalBrandProfilePresenter) obj4, (MutableState) obj3, (MutableState) this.$syncReason, continuation, 1);
            case 2:
                RealContactSync$syncRequest$2 realContactSync$syncRequest$22 = new RealContactSync$syncRequest$2(this.$newContacts, (Boolean) obj5, continuation, (ProfilePresenter) obj4, (MutableState) obj3);
                realContactSync$syncRequest$22.L$0 = obj;
                return realContactSync$syncRequest$22;
            case 3:
                RealContactSync$syncRequest$2 realContactSync$syncRequest$23 = new RealContactSync$syncRequest$2(this.$ignoreServerBackoff, (Animatable) obj2, (Motion) obj5, (Animatable) obj4, (Function0) obj3, (MutableState) this.$syncReason, continuation);
                realContactSync$syncRequest$23.L$0 = obj;
                return realContactSync$syncRequest$23;
            default:
                return new RealContactSync$syncRequest$2((CardScene) this.L$0, (CardNuxState) obj2, (FiniteAnimationSpec) obj5, this.$ignoreServerBackoff, (Animatable) obj4, (MutableState) obj3, (MutableFloatState) this.$syncReason, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealContactSync$syncRequest$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d0, code lost:
    
        if (r7.snapTo(r0, r29) == r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019a, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default((androidx.compose.animation.core.Animatable) r14, r1, r2, null, null, r29, 12) == r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0176, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default((androidx.compose.animation.core.Animatable) r14, r1, r2, null, null, r29, 12) == r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        if (r7.snapTo(r0, r29) == r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013d, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default((androidx.compose.animation.core.Animatable) r12, r1, r2, null, null, r29, 12) == r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010f, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default((androidx.compose.animation.core.Animatable) r14, r1, r7, null, null, r29, 12) == r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01be, code lost:
    
        if (r1.snapTo(r0, r29) == r10) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0307  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object awaitAll;
        String str;
        FulfillmentType fulfillmentType;
        FulfillmentType fulfillmentType2;
        Object m1288clearScheduledFulfillmentConfigurationNmdeRlM;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration;
        Object access$processCode;
        boolean z2;
        BitcoinQrCodeScannerPresenter$State.ProcessingCode processingCode;
        Animatable animatable;
        Animatable animatable2;
        MutableState mutableState;
        Object obj2;
        Motion motion;
        Animatable animatable3;
        int i = this.$r8$classId;
        int i2 = 4;
        Object obj3 = this.$softRateLimit;
        Object obj4 = this.this$0;
        Object obj5 = this.$syncRoutines;
        Object obj6 = this.$newContacts;
        switch (i) {
            case 0:
                ContactSyncEvent.SyncRoutines syncRoutines = (ContactSyncEvent.SyncRoutines) obj5;
                RealContactSync realContactSync = (RealContactSync) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ContactSyncEvent.NewContacts newContacts = (ContactSyncEvent.NewContacts) obj6;
                    List execute = newContacts.detailedContact.execute();
                    try {
                        List<ContactBook$ContactAccountDetails> execute2 = newContacts.contactAccount.execute();
                        List list = execute;
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                        for (Object obj7 : list) {
                            linkedHashMap.put(Long.valueOf(((ContactBook$Contact$DetailedContact) obj7).contactId), obj7);
                        }
                        for (ContactBook$ContactAccountDetails contactBook$ContactAccountDetails : execute2) {
                            ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact = (ContactBook$Contact$DetailedContact) linkedHashMap.get(Long.valueOf(contactBook$ContactAccountDetails.contactId));
                            if (contactBook$Contact$DetailedContact != null) {
                                contactBook$Contact$DetailedContact.accountName = contactBook$ContactAccountDetails.accountName;
                            }
                            if (contactBook$Contact$DetailedContact != null) {
                                contactBook$Contact$DetailedContact.accountType = contactBook$ContactAccountDetails.accountType;
                            }
                        }
                        execute = CollectionsKt.toList(linkedHashMap.values());
                    } catch (SQLiteException e) {
                        Timber.Forest.e(e);
                    }
                    List list2 = execute;
                    z = false;
                    List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{JobKt.async$default(coroutineScope, null, null, new AnonymousClass1(realContactSync, list2, syncRoutines, this.$ignoreServerBackoff, (Long) obj3, (ContactSync$SyncReason) this.$syncReason, (Continuation) null, 0), 3), JobKt.async$default(coroutineScope, null, null, new VerifyCheckDepositPresenter$models$3$1(realContactSync, syncRoutines, list2, (ContactSync$SyncReason) this.$syncReason, (Continuation) null, 16), 3)});
                    this.L$0 = null;
                    this.label = 1;
                    awaitAll = AwaitKt.awaitAll(listOf, this);
                    if (awaitAll == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    awaitAll = obj;
                    z = false;
                }
                Iterator it = ((Iterable) awaitAll).iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (true) {
                        Object obj8 = next;
                        while (it.hasNext()) {
                            next = (ContactsSyncResponse) it.next();
                            obj8 = (ContactsSyncResponse) obj8;
                            if (!(obj8 instanceof ContactsSyncResponse.Failure)) {
                                if (!(next instanceof ContactsSyncResponse.Failure)) {
                                    boolean z3 = obj8 instanceof ContactsSyncResponse.Success;
                                    if (z3 && (next instanceof ContactsSyncResponse.Success)) {
                                        ContactsSyncResponse.Success success = (ContactsSyncResponse.Success) next;
                                        obj8 = new ContactsSyncResponse.Success((success.rateLimited || ((ContactsSyncResponse.Success) obj8).rateLimited) ? true : z, (success.nothingChanged && ((ContactsSyncResponse.Success) obj8).nothingChanged) ? true : z);
                                    } else if (z3) {
                                        continue;
                                    } else if (!(next instanceof ContactsSyncResponse.Success) && obj8 != null) {
                                    }
                                }
                            }
                        }
                        break;
                    }
                } else {
                    a$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
                    break;
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = (String) this.L$0;
                    String str3 = (String) obj6;
                    String str4 = ((RealCartBuilder) obj4).checkoutFlowToken;
                    FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) ((MutableState) obj3).getValue();
                    boolean z4 = this.$ignoreServerBackoff;
                    LocalBrand localBrand = (LocalBrand) ((MutableState) this.$syncReason).getValue();
                    EstimatedCompletionDuration estimatedCompletionDuration = (localBrand == null || (localEstimatedCompletionDuration = localBrand.estimated_pickup_wait_time) == null) ? null : EstimatedCompletionDurationKt.toEstimatedCompletionDuration(localEstimatedCompletionDuration);
                    LocalBrandProfilePresenter localBrandProfilePresenter = (LocalBrandProfilePresenter) obj5;
                    LocalInstalledStore localInstalledStore = localBrandProfilePresenter.store;
                    SessionManager sessionManager = localBrandProfilePresenter.sessionManager;
                    Analytics analytics = localBrandProfilePresenter.analytics;
                    this.label = 1;
                    SchedulingType schedulingType = SchedulingType.ASAP;
                    String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager);
                    if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
                        fulfillmentType2 = FulfillmentType.DELIVERY;
                    } else if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Pickup) {
                        fulfillmentType2 = FulfillmentType.PICKUP;
                    } else if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) && !Intrinsics.areEqual(fulfillmentConfiguration, FulfillmentConfiguration.Unspecified.INSTANCE) && fulfillmentConfiguration != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        str = str4;
                        fulfillmentType = null;
                        analytics.track(new LocalClientFulfillmentFlowClickSchedulingType(str2, str3, activeAccountTokenOrNull, str, fulfillmentType, schedulingType), null);
                        if (z4) {
                            m1288clearScheduledFulfillmentConfigurationNmdeRlM = ((RealLocalInstalledStore) localInstalledStore).m1288clearScheduledFulfillmentConfigurationNmdeRlM(str2, this);
                            if (m1288clearScheduledFulfillmentConfigurationNmdeRlM != coroutineSingletons2) {
                                m1288clearScheduledFulfillmentConfigurationNmdeRlM = Unit.INSTANCE;
                            }
                        } else {
                            m1288clearScheduledFulfillmentConfigurationNmdeRlM = ((RealLocalInstalledStore) localInstalledStore).m1290updateFulfillmentConfigurationsNoPDS7c(str2, new FulfillmentConfigurations(new FulfillmentConfiguration.Pickup(str3, estimatedCompletionDuration, 10), 1), this);
                            if (m1288clearScheduledFulfillmentConfigurationNmdeRlM != coroutineSingletons2) {
                                m1288clearScheduledFulfillmentConfigurationNmdeRlM = Unit.INSTANCE;
                            }
                        }
                        if (m1288clearScheduledFulfillmentConfigurationNmdeRlM == coroutineSingletons2) {
                            break;
                        }
                    }
                    str = str4;
                    fulfillmentType = fulfillmentType2;
                    analytics.track(new LocalClientFulfillmentFlowClickSchedulingType(str2, str3, activeAccountTokenOrNull, str, fulfillmentType, schedulingType), null);
                    if (z4) {
                    }
                    if (m1288clearScheduledFulfillmentConfigurationNmdeRlM == coroutineSingletons2) {
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                MutableState mutableState2 = (MutableState) obj3;
                ProfilePresenter profilePresenter = (ProfilePresenter) obj5;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) obj4).booleanValue();
                    BitcoinQrCodeScannerPresenter$State.ProcessingCode processingCode2 = (BitcoinQrCodeScannerPresenter$State.ProcessingCode) obj6;
                    this.L$0 = null;
                    this.$syncReason = processingCode2;
                    this.$ignoreServerBackoff = booleanValue;
                    this.label = 1;
                    access$processCode = ProfilePresenter.access$processCode(profilePresenter, processingCode2, this);
                    if (access$processCode == coroutineSingletons3) {
                        break;
                    } else {
                        z2 = booleanValue;
                        processingCode = processingCode2;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    z2 = this.$ignoreServerBackoff;
                    processingCode = (BitcoinQrCodeScannerPresenter$State.ProcessingCode) this.$syncReason;
                    SafeTrace.throwOnFailure(obj);
                    access$processCode = obj;
                }
                int ordinal = ((ProcessAddressResult) access$processCode).ordinal();
                if (ordinal == 0) {
                    mutableState2.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), true, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ProfilePresenter.access$showInvalidCryptoAddressDialog(profilePresenter, processingCode.source, z2);
                }
                mutableState2.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), false, null, null, false, null, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE));
                break;
            case 3:
                Animatable animatable4 = (Animatable) obj5;
                Animatable animatable5 = (Animatable) obj6;
                boolean z5 = this.$ignoreServerBackoff;
                MutableState mutableState3 = (MutableState) this.$syncReason;
                Motion motion2 = (Motion) obj4;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        if (!z5 || ((Boolean) mutableState3.getValue()).booleanValue()) {
                            animatable = animatable4;
                            Float f = new Float(1.0f);
                            this.L$0 = null;
                            this.label = 6;
                            break;
                        } else {
                            Float f2 = new Float(0.8f);
                            SpringSpec soft$default = TargetUtils.soft$default((zzb) motion2.springs.text);
                            this.L$0 = coroutineScope2;
                            this.label = 1;
                            animatable2 = animatable5;
                            mutableState = mutableState3;
                            obj2 = obj3;
                            motion = motion2;
                            animatable3 = animatable4;
                            break;
                        }
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        animatable3 = animatable4;
                        animatable2 = animatable5;
                        mutableState = mutableState3;
                        obj2 = obj3;
                        motion = motion2;
                        JobKt.launch$default(coroutineScope2, null, null, new ShoppingWebBridge$loadUrl$1(animatable2, motion, null, 1), 3);
                        Integer num = new Integer(720);
                        SpringSpec soft$default2 = TargetUtils.soft$default((zzb) motion.springs.text);
                        this.L$0 = null;
                        this.label = 2;
                        break;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        animatable3 = animatable4;
                        mutableState = mutableState3;
                        obj2 = obj3;
                        motion = motion2;
                        Integer num2 = new Integer(0);
                        this.L$0 = null;
                        this.label = 3;
                        break;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        mutableState = mutableState3;
                        obj2 = obj3;
                        motion = motion2;
                        Float f3 = new Float(2.2f);
                        SpringSpec steady$default = TargetUtils.steady$default((zzb) motion.springs.text);
                        this.L$0 = null;
                        this.label = 4;
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        mutableState = mutableState3;
                        obj2 = obj3;
                        motion = motion2;
                        Float f4 = new Float(1.0f);
                        SpringSpec steady$default2 = TargetUtils.steady$default((zzb) motion.springs.text);
                        this.L$0 = null;
                        this.label = 5;
                        break;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        mutableState = mutableState3;
                        obj2 = obj3;
                        mutableState.setValue(Boolean.TRUE);
                        ((Function0) obj2).invoke();
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        animatable = animatable4;
                        Integer num3 = new Integer(0);
                        this.L$0 = null;
                        this.label = 7;
                        break;
                    case 7:
                        SafeTrace.throwOnFailure(obj);
                        if (!z5) {
                            mutableState3.setValue(Boolean.FALSE);
                        }
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
            default:
                Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShiftListViewKt$$ExternalSyntheticLambda10 shiftListViewKt$$ExternalSyntheticLambda10 = new ShiftListViewKt$$ExternalSyntheticLambda10(this.$ignoreServerBackoff, (Animatable) obj5, (MutableState) obj3, (MutableFloatState) this.$syncReason);
                    this.label = 1;
                    Object collectLatest = FlowKt.collectLatest(Updater.snapshotFlow(new CardNuxState$$ExternalSyntheticLambda0((CardNuxState) obj6, i2)), new WorkflowLayout$start$1(new Ref$ObjectRef(), shiftListViewKt$$ExternalSyntheticLambda10, (CardScene) this.L$0, (FiniteAnimationSpec) obj4, (Continuation) null, 17), this);
                    if (collectLatest != obj9) {
                        collectLatest = Unit.INSTANCE;
                    }
                    if (collectLatest == obj9) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.data.contacts.RealContactSync$syncRequest$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public Object $contactList;
        public boolean $ignoreServerBackoff;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $softRateLimit;
        public final /* synthetic */ Object $syncReason;
        public /* synthetic */ Object $syncRoutines;
        public int label;
        public Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, boolean z) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$ignoreServerBackoff = z;
            this.this$0 = obj;
            this.$contactList = obj2;
            this.$syncRoutines = obj3;
            this.$softRateLimit = obj4;
            this.$syncReason = obj5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$syncReason;
            Object obj3 = this.$softRateLimit;
            switch (i) {
                case 0:
                    return new AnonymousClass1((RealContactSync) this.this$0, (List) this.$contactList, (ContactSyncEvent.SyncRoutines) this.$syncRoutines, this.$ignoreServerBackoff, (Long) obj3, (ContactSync$SyncReason) obj2, continuation, 0);
                case 1:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((ProduceStateScope) obj3, (RealActivityEmbeddedPresenter) obj2, continuation);
                    anonymousClass1.$syncRoutines = obj;
                    return anonymousClass1;
                case 2:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((Flow) this.$contactList, continuation, (LocalHomePresenter) this.$syncRoutines, this.$ignoreServerBackoff, (MutableState) obj3, (MutableState) obj2);
                    anonymousClass12.this$0 = obj;
                    return anonymousClass12;
                case 3:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(this.$ignoreServerBackoff, (RealClientScenarioCompleter) this.$syncRoutines, (BlockersData) obj3, (ClientScenario) obj2, (List) this.$contactList, continuation);
                    anonymousClass13.this$0 = obj;
                    return anonymousClass13;
                case 4:
                    return new AnonymousClass1((RealContactSync) this.this$0, (ContactSyncEvent.NewContacts) this.$contactList, (ContactSyncEvent.SyncRoutines) this.$syncRoutines, this.$ignoreServerBackoff, (Long) obj3, (Ref$ObjectRef) obj2, continuation, 4);
                case 5:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1(this.$ignoreServerBackoff, (RealInvestingHistoricalData) this.$contactList, (InvestmentEntityToken) this.$syncRoutines, (HistoricalRange) obj3, (ProducerScope) obj2, continuation);
                    anonymousClass14.this$0 = obj;
                    return anonymousClass14;
                case 6:
                    return new AnonymousClass1(6, (String) this.this$0, (MutableState) this.$contactList, (PaymentConfigurationPresenter) this.$syncRoutines, (CoroutineScope) obj3, (RealPaymentConfigurationRouter) obj2, continuation, this.$ignoreServerBackoff);
                case 7:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((PublicProfile) this.$syncRoutines, (ProfilePrivacyViewEvent.ToggleCashMeUrlSetting) obj3, (ProfilePrivacyPresenter) obj2, continuation);
                    anonymousClass15.$contactList = obj;
                    return anonymousClass15;
                case 8:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1(this.$contactList, continuation, (Flow) this.$syncRoutines, (TaxReturnsPresenter) obj3, this.$ignoreServerBackoff, (IdentityVerificationStatus) obj2);
                    anonymousClass16.this$0 = obj;
                    return anonymousClass16;
                case 9:
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1((TimeToLiveSyncState) this.$syncRoutines, (JobImpl) obj3, this.$ignoreServerBackoff, (Flow) obj2, continuation);
                    anonymousClass17.$contactList = obj;
                    return anonymousClass17;
                case 10:
                    return new AnonymousClass1(10, (ShoppingWebPresenter) this.this$0, (MutableState) this.$contactList, (MutableState) this.$syncRoutines, (MutableState) obj3, (MutableState) obj2, continuation, this.$ignoreServerBackoff);
                default:
                    return new AnonymousClass1(11, (Animatable) this.this$0, (Function0) this.$contactList, (MutableState) this.$syncRoutines, (MutableFloatState) obj3, (CardScene) obj2, continuation, this.$ignoreServerBackoff);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:0x03aa, code lost:
        
            if (r2.emit(r0, r38) == r3) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x03e0, code lost:
        
            if (r2.emit(r1, r38) == r3) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x0381, code lost:
        
            if (r6 == r3) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x0336, code lost:
        
            if (r2.emit(r0, r38) == r3) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x034a, code lost:
        
            if (r2.emit(r6, r38) == r3) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:228:0x0647, code lost:
        
            if (r14.emit(r2, r38) == r15) goto L228;
         */
        /* JADX WARN: Code restructure failed: missing block: B:230:?, code lost:
        
            return r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:240:0x05f0, code lost:
        
            if (r0 == r15) goto L228;
         */
        /* JADX WARN: Code restructure failed: missing block: B:245:0x05c0, code lost:
        
            if (r14.emit(r2, r38) == r15) goto L228;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0229, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r0, r38) == r1) goto L84;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x027a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ProduceStateScope produceStateScope;
            boolean z;
            Object access$buildFeedEntries;
            LoadingState loadingState;
            RealClientScenarioCompleter realClientScenarioCompleter;
            Object trackBlockerSubmissionAnalytics$default;
            Object showError;
            Object coroutineScope;
            boolean z2;
            boolean z3;
            int i;
            Object result;
            SyncState$Progress syncState$Progress;
            Object value;
            ShippingAddress shippingAddress;
            Object obj2;
            boolean z4;
            MutableState mutableState;
            String str;
            int i2 = this.$r8$classId;
            int i3 = 4;
            Object obj3 = this.$syncReason;
            Object obj4 = this.$softRateLimit;
            int i4 = 1;
            switch (i2) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object access$syncContactsToDatabaseAndUploadAliases = RealContactSync.access$syncContactsToDatabaseAndUploadAliases((RealContactSync) this.this$0, (List) this.$contactList, (ContactSyncEvent.SyncRoutines) this.$syncRoutines, this.$ignoreServerBackoff, (Long) obj4, (ContactSync$SyncReason) obj3, this);
                        return access$syncContactsToDatabaseAndUploadAliases == coroutineSingletons ? coroutineSingletons : access$syncContactsToDatabaseAndUploadAliases;
                    }
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 1:
                    Activities activities = (Activities) this.$syncRoutines;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        produceStateScope = (ProduceStateScope) obj4;
                        LoadingState loadingState2 = activities.loadingState;
                        z = activities.hasMore;
                        this.$syncRoutines = null;
                        this.this$0 = produceStateScope;
                        this.$contactList = loadingState2;
                        this.$ignoreServerBackoff = z;
                        this.label = 1;
                        access$buildFeedEntries = RealActivityEmbeddedPresenter.access$buildFeedEntries((RealActivityEmbeddedPresenter) obj3, activities, this);
                        if (access$buildFeedEntries == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        loadingState = loadingState2;
                    } else {
                        if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.$ignoreServerBackoff;
                        loadingState = (LoadingState) this.$contactList;
                        produceStateScope = (ProduceStateScope) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        z = z5;
                        access$buildFeedEntries = obj;
                    }
                    produceStateScope.setValue(new RealActivityEmbeddedPresenter.IntermediateFeedState(loadingState, z, (List) access$buildFeedEntries));
                    return Unit.INSTANCE;
                case 2:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = (Flow) this.$contactList;
                        BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1 bitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1 = new BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (LocalHomePresenter) this.$syncRoutines, this.$ignoreServerBackoff, (MutableState) obj4, (MutableState) obj3);
                        this.this$0 = null;
                        this.label = 1;
                        if (flow.collect(bitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 3:
                    BlockersData blockersData = (BlockersData) obj4;
                    RealClientScenarioCompleter realClientScenarioCompleter2 = (RealClientScenarioCompleter) this.$syncRoutines;
                    AndroidStringManager androidStringManager = realClientScenarioCompleter2.stringManager;
                    boolean z6 = this.$ignoreServerBackoff;
                    FlowCollector flowCollector = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Object toggleSpinner = z6 ? new BlockersHelper.BlockersAction.ToggleSpinner(true) : BlockersHelper.BlockersAction.DisableControl.INSTANCE;
                        this.this$0 = flowCollector;
                        this.label = 1;
                        break;
                    } else if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i8 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        realClientScenarioCompleter = realClientScenarioCompleter2;
                        trackBlockerSubmissionAnalytics$default = obj;
                        ApiResult apiResult = (ApiResult) trackBlockerSubmissionAnalytics$default;
                        if (apiResult instanceof ApiResult.Success) {
                            CompleteScenarioResponse completeScenarioResponse = (CompleteScenarioResponse) ((ApiResult.Success) apiResult).response;
                            if (completeScenarioResponse.status != CompleteScenarioResponse.Status.SUCCESS) {
                                showError = new BlockersHelper.BlockersAction.ShowError(blockersData, androidStringManager.get(R.string.generic_network_error));
                            } else if (z6) {
                                BlockersDataNavigator blockersDataNavigator = realClientScenarioCompleter.blockersNavigator;
                                ResponseContext responseContext = completeScenarioResponse.response_context;
                                responseContext.getClass();
                                Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                                showError = new BlockersHelper.BlockersAction.ShowScreen(blockersDataNavigator.getNext(null, blockersData.updateFromResponseContext(responseContext, false)));
                            } else {
                                showError = BlockersHelper.BlockersAction.EnableControl.INSTANCE;
                            }
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            showError = new BlockersHelper.BlockersAction.ShowError(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message);
                        }
                        this.this$0 = null;
                        this.label = 3;
                        break;
                    } else {
                        if (i8 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Analytics analytics = realClientScenarioCompleter2.analytics;
                    AndroidStringManager androidStringManager2 = realClientScenarioCompleter2.stringManager;
                    DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(realClientScenarioCompleter2, (ClientScenario) obj3, blockersData, (List) this.$contactList, null, 10);
                    realClientScenarioCompleter = realClientScenarioCompleter2;
                    this.this$0 = flowCollector;
                    this.label = 2;
                    trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager2, this, RealClientScenarioCompleter$completeClientScenario$1$1$result$1.INSTANCE, dataStoreImpl$readDataOrHandleCorruption$3);
                    break;
                case 4:
                    RealContactSync realContactSync = (RealContactSync) this.this$0;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ContactSyncEvent.NewContacts newContacts = (ContactSyncEvent.NewContacts) this.$contactList;
                        ContactSyncEvent.SyncRoutines syncRoutines = (ContactSyncEvent.SyncRoutines) this.$syncRoutines;
                        boolean z7 = this.$ignoreServerBackoff;
                        Long l = (Long) obj4;
                        Object obj5 = ((Ref$ObjectRef) obj3).element;
                        if (obj5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("syncReason");
                            throw null;
                        }
                        ContactSync$SyncReason contactSync$SyncReason = (ContactSync$SyncReason) obj5;
                        this.label = 1;
                        int i10 = RealContactSync.$r8$clinit;
                        coroutineScope = JobKt.coroutineScope(new RealContactSync$syncRequest$2(newContacts, realContactSync, syncRoutines, z7, l, contactSync$SyncReason, (Continuation) null), this);
                        if (coroutineScope == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        coroutineScope = obj;
                    }
                    realContactSync.eventsAndRoutines.mo1159trySendJP2dKIU(new ContactSyncEvent.ContactSyncCompleted(JobKt.CompletableDeferred((ContactsSyncResponse) coroutineScope)));
                    return coroutineScope;
                case 5:
                    HistoricalRange historicalRange = (HistoricalRange) obj4;
                    InvestmentEntityToken investmentEntityToken = (InvestmentEntityToken) this.$syncRoutines;
                    RealInvestingHistoricalData realInvestingHistoricalData = (RealInvestingHistoricalData) this.$contactList;
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Continuation continuation = null;
                        if (this.$ignoreServerBackoff) {
                            JobKt.launch$default(coroutineScope3, null, null, new CheckStatusPresenter.AnonymousClass1(realInvestingHistoricalData, investmentEntityToken, continuation, 10), 3);
                        }
                        ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(new FormCashtag$8$invokeSuspend$$inlined$map$1(new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealShareableAssetsManager$download$lambda$0$$inlined$map$1(realInvestingHistoricalData.tickerFlow, realInvestingHistoricalData, investmentEntityToken, historicalRange, 3), new RealInvestingHistoricalData$bitcoin$1$bitcoinData$2(realInvestingHistoricalData, continuation, i4), 3), 6), 13), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, realInvestingHistoricalData, investmentEntityToken, 15));
                        PersistentHistoricalDataCache persistentHistoricalDataCache = realInvestingHistoricalData.cache;
                        investmentEntityToken.getClass();
                        historicalRange.getClass();
                        Flow runUntil = StateFlowKt.runUntil(FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.distinctUntilChanged(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new GLThread$start$2(persistentHistoricalDataCache, investmentEntityToken, historicalRange, continuation, 14), new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(transformLatest, new DotGridKt$DotGrid$3$1(persistentHistoricalDataCache, investmentEntityToken, historicalRange, continuation, 11), 3))), FaceDetection.m2065timerForAgeWn2Vu4Y(realInvestingHistoricalData.entityNetworkStatus, realInvestingHistoricalData.clock, realInvestingHistoricalData.computationDispatcher, RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD), new CardModelView$getActiveHeat$2$2(realInvestingHistoricalData, continuation, 12), r7)), realInvestingHistoricalData.signOut);
                        RealActivitiesManager$activities$2$1$2 realActivitiesManager$activities$2$1$2 = new RealActivitiesManager$activities$2$1$2((ProducerScope) obj3, 2);
                        this.this$0 = null;
                        this.label = 1;
                        if (runUntil.collect(realActivitiesManager$activities$2$1$2, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 6:
                    MutableState mutableState2 = (MutableState) this.$contactList;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!this.$ignoreServerBackoff || ((String) this.this$0) == null || ((PaymentRouterData) mutableState2.getValue()).loadingStatus != null) {
                            return Unit.INSTANCE;
                        }
                        String str2 = (String) this.this$0;
                        this.label = 1;
                        if (PaymentConfigurationPresenter.access$models$loadStablecoinQrScanOptions((PaymentConfigurationPresenter) this.$syncRoutines, mutableState2, (CoroutineScope) obj4, (RealPaymentConfigurationRouter) obj3, str2, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) obj3;
                    BetterNavigator.ScreenNavigator screenNavigator = profilePrivacyPresenter.navigator;
                    FlowCollector flowCollector2 = (FlowCollector) this.$contactList;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    Continuation continuation2 = null;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PublicProfile publicProfile = (PublicProfile) this.$syncRoutines;
                        if (publicProfile == null) {
                            return Unit.INSTANCE;
                        }
                        z2 = ((ProfilePrivacyViewEvent.ToggleCashMeUrlSetting) obj4).enabled;
                        FullCashtag fullCashtag = publicProfile.fullCashtag;
                        if ((fullCashtag != null ? fullCashtag.cashtag_display_name : null) != null) {
                            ProfilePrivacyPresenter.CashMeSettingActiveState cashMeSettingActiveState = new ProfilePrivacyPresenter.CashMeSettingActiveState(z2, true);
                            this.$contactList = flowCollector2;
                            this.$ignoreServerBackoff = z2;
                            this.label = 2;
                            break;
                        } else {
                            screenNavigator.goTo(CashtagRequiredScreen.INSTANCE);
                            ProfilePrivacyPresenter.CashMeSettingActiveState cashMeSettingActiveState2 = new ProfilePrivacyPresenter.CashMeSettingActiveState(false, true);
                            this.$contactList = null;
                            this.$ignoreServerBackoff = z2;
                            this.label = 1;
                            break;
                        }
                        return coroutineSingletons8;
                    }
                    if (i13 != 1) {
                        if (i13 == 2) {
                            z2 = this.$ignoreServerBackoff;
                            SafeTrace.throwOnFailure(obj);
                            this.$contactList = flowCollector2;
                            this.this$0 = profilePrivacyPresenter;
                            this.$ignoreServerBackoff = z2;
                            this.label = 3;
                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                            cancellableContinuationImpl.initCancellability();
                            DeferredCoroutine deferredCoroutine = profilePrivacyPresenter.setCashtagUrlEnabledJob;
                            if (deferredCoroutine != null) {
                                deferredCoroutine.cancel(null);
                            }
                            z3 = z2;
                            i = 5;
                            profilePrivacyPresenter.setCashtagUrlEnabledJob = JobKt.async$default(profilePrivacyPresenter.activityScope, null, null, new RoomDatabase$performClear$1(profilePrivacyPresenter, z3, cancellableContinuationImpl, continuation2, 16), 3);
                            result = cancellableContinuationImpl.getResult();
                            break;
                        } else if (i13 == 3) {
                            boolean z8 = this.$ignoreServerBackoff;
                            SafeTrace.throwOnFailure(obj);
                            z3 = z8;
                            i = 5;
                            result = obj;
                            ApiResult apiResult2 = (ApiResult) result;
                            if (apiResult2 instanceof ApiResult.Success) {
                                Timber.Forest.d("Successfully updated cashtag url enabled: %s", Boolean.valueOf(z3));
                                ProfilePrivacyPresenter.CashMeSettingActiveState cashMeSettingActiveState3 = new ProfilePrivacyPresenter.CashMeSettingActiveState(z3, false);
                                this.$contactList = null;
                                this.this$0 = null;
                                this.$ignoreServerBackoff = z3;
                                this.label = 4;
                                break;
                            } else {
                                if (!(apiResult2 instanceof ApiResult.Failure)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(profilePrivacyPresenter.stringManager, (ApiResult.Failure) apiResult2, new Integer(R.string.profile_error_message_update)).message, null, 14));
                                ProfilePrivacyPresenter.CashMeSettingActiveState cashMeSettingActiveState4 = new ProfilePrivacyPresenter.CashMeSettingActiveState(!z3, false);
                                this.$contactList = null;
                                this.this$0 = null;
                                this.$ignoreServerBackoff = z3;
                                this.label = i;
                                break;
                            }
                        } else {
                            if (i13 != 4 && i13 != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow2 = (Flow) this.$syncRoutines;
                        TabToolbarPresenter$models$$inlined$CollectEffect$1$1 tabToolbarPresenter$models$$inlined$CollectEffect$1$1 = new TabToolbarPresenter$models$$inlined$CollectEffect$1$1((TaxReturnsPresenter) obj4, this.$ignoreServerBackoff, (IdentityVerificationStatus) obj3);
                        this.this$0 = null;
                        this.label = 1;
                        if (flow2.collect(tabToolbarPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    } else {
                        if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 9:
                    JobImpl jobImpl = (JobImpl) obj4;
                    TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) this.$syncRoutines;
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.$contactList;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SyncState$Progress syncState$Progress2 = (SyncState$Progress) timeToLiveSyncState.progress.getValue();
                        r7 = TimeUnit.MINUTES.toMillis(timeToLiveSyncState.expirationTime) + timeToLiveSyncState.lastAttemptedRefresh < timeToLiveSyncState.clock.millis() ? 1 : 0;
                        Continuation continuation3 = null;
                        if (syncState$Progress2 == SyncState$Progress.IN_FLIGHT) {
                            FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new RealRecipientRepository$suggestions$$inlined$map$1(timeToLiveSyncState.progress, 8), 1);
                            this.$contactList = null;
                            this.label = 1;
                            break;
                        } else if (syncState$Progress2 == SyncState$Progress.FAILURE || ((PlatformKt.getCurrentSessionState(timeToLiveSyncState.sessionManager) instanceof SessionState.Initiated) && (this.$ignoreServerBackoff || r7 != 0))) {
                            SyncState$Progress syncState$Progress3 = (SyncState$Progress) timeToLiveSyncState.progress.getValue();
                            JobKt.launch$default(coroutineScope4, null, null, new BasicShieetKt$BasicShieet$4$1((Flow) obj3, timeToLiveSyncState, jobImpl, continuation3, 12), 3);
                            this.$contactList = null;
                            this.this$0 = syncState$Progress3;
                            this.label = 2;
                            if (jobImpl.join(this) != coroutineSingletons10) {
                                syncState$Progress = syncState$Progress3;
                                if (timeToLiveSyncState.progress.getValue() == SyncState$Progress.IN_FLIGHT) {
                                }
                            }
                        } else {
                            jobImpl.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
                        }
                        return coroutineSingletons10;
                    }
                    if (i15 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        jobImpl.makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
                    } else {
                        if (i15 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        syncState$Progress = (SyncState$Progress) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        if (timeToLiveSyncState.progress.getValue() == SyncState$Progress.IN_FLIGHT) {
                            StateFlowImpl stateFlowImpl = timeToLiveSyncState.progress;
                            do {
                                value = stateFlowImpl.getValue();
                            } while (!stateFlowImpl.compareAndSet(value, syncState$Progress));
                        }
                    }
                    return Unit.INSTANCE;
                case 10:
                    MutableState mutableState3 = (MutableState) obj4;
                    MutableState mutableState4 = (MutableState) obj3;
                    MutableState mutableState5 = (MutableState) this.$syncRoutines;
                    MutableState mutableState6 = (MutableState) this.$contactList;
                    ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.this$0;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!this.$ignoreServerBackoff) {
                            Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                            mutableState4.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState4.getValue(), ((Boolean) mutableState3.getValue()).booleanValue(), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870910));
                            return Unit.INSTANCE;
                        }
                        Set set2 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                        RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) mutableState6.getValue();
                        if (retrieveDefaultShippingAddressResponse != null && (shippingAddress = retrieveDefaultShippingAddressResponse.shipping_address) != null && ShoppingWebPresenter.access$isComplete(shoppingWebPresenter, shippingAddress) && ((Boolean) mutableState5.getValue()).booleanValue()) {
                            KeyValue keyValue = shoppingWebPresenter.seenOfferAutofillSheet;
                            this.label = 1;
                            obj2 = keyValue.get(this);
                            if (obj2 == coroutineSingletons11) {
                                return coroutineSingletons11;
                            }
                        }
                        z4 = false;
                        if (z4) {
                            Set set3 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                            RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse2 = (RetrieveDefaultShippingAddressResponse) mutableState6.getValue();
                            retrieveDefaultShippingAddressResponse2.getClass();
                            ShippingAddress shippingAddress2 = retrieveDefaultShippingAddressResponse2.shipping_address;
                            if (shippingAddress2 != null && (str = shippingAddress2.id) != null) {
                                Analytics analytics2 = shoppingWebPresenter.analytics;
                                RealBugReportSenderFactory realBugReportSenderFactory = shoppingWebPresenter.shoppingWebAnalytics;
                                analytics2.track(new BrowserCheckoutViewAutofillInfo((BrowserOrigin) realBugReportSenderFactory.sessionManager, (InfoContext) realBugReportSenderFactory.featureEligibilityDumper, (String) realBugReportSenderFactory.tempStorage, (String) realBugReportSenderFactory.recentMoneybotSession, (String) realBugReportSenderFactory.bugsnagClient), null);
                                WebViewUseCase useCase = ExifInterfaceUtils.toUseCase(shoppingWebPresenter.args);
                                mutableState = mutableState4;
                                shoppingWebPresenter.navigator.askQuestion(new AutofillQuestion(useCase == WebViewUseCase.INCENTIVES ? AutofillQuestion.AutofillType.OFFER_WITH_CARD : AutofillQuestion.AutofillType.OFFER), new SliderKt$$ExternalSyntheticLambda3((Object) shoppingWebPresenter, (Object) useCase, (Object) str, mutableState3, (Object) mutableState4, (Object) mutableState6, 11));
                                Set set4 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                                mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), (!((Boolean) mutableState5.getValue()).booleanValue() || ((Boolean) mutableState3.getValue()).booleanValue()) && !z4, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870910));
                                return Unit.INSTANCE;
                            }
                        }
                        mutableState = mutableState4;
                        Set set42 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                        mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), (!((Boolean) mutableState5.getValue()).booleanValue() || ((Boolean) mutableState3.getValue()).booleanValue()) && !z4, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870910));
                        return Unit.INSTANCE;
                    }
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                    if (!((Boolean) obj2).booleanValue()) {
                        z4 = true;
                        if (z4) {
                        }
                        mutableState = mutableState4;
                        Set set422 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                        mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), (!((Boolean) mutableState5.getValue()).booleanValue() || ((Boolean) mutableState3.getValue()).booleanValue()) && !z4, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870910));
                        return Unit.INSTANCE;
                    }
                    z4 = false;
                    if (z4) {
                    }
                    mutableState = mutableState4;
                    Set set4222 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), (!((Boolean) mutableState5.getValue()).booleanValue() || ((Boolean) mutableState3.getValue()).booleanValue()) && !z4, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870910));
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new ModalBottomSheetKt$$ExternalSyntheticLambda1(this.$ignoreServerBackoff, (Animatable) this.this$0, (Function0) this.$contactList, (MutableState) this.$syncRoutines, (MutableFloatState) obj4));
                        ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1((CardScene) obj3, i3);
                        this.label = 1;
                        if (snapshotFlow.collect(anonymousClass1, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProduceStateScope produceStateScope, RealActivityEmbeddedPresenter realActivityEmbeddedPresenter, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 1;
            this.$softRateLimit = produceStateScope;
            this.$syncReason = realActivityEmbeddedPresenter;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(RealContactSync realContactSync, Object obj, ContactSyncEvent.SyncRoutines syncRoutines, boolean z, Long l, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = realContactSync;
            this.$contactList = obj;
            this.$syncRoutines = syncRoutines;
            this.$ignoreServerBackoff = z;
            this.$softRateLimit = l;
            this.$syncReason = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PublicProfile publicProfile, ProfilePrivacyViewEvent.ToggleCashMeUrlSetting toggleCashMeUrlSetting, ProfilePrivacyPresenter profilePrivacyPresenter, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 7;
            this.$syncRoutines = publicProfile;
            this.$softRateLimit = toggleCashMeUrlSetting;
            this.$syncReason = profilePrivacyPresenter;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TimeToLiveSyncState timeToLiveSyncState, JobImpl jobImpl, boolean z, Flow flow, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 9;
            this.$syncRoutines = timeToLiveSyncState;
            this.$softRateLimit = jobImpl;
            this.$ignoreServerBackoff = z;
            this.$syncReason = flow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation, Flow flow, TaxReturnsPresenter taxReturnsPresenter, boolean z, IdentityVerificationStatus identityVerificationStatus) {
            super(2, continuation);
            this.$r8$classId = 8;
            this.$contactList = obj;
            this.$syncRoutines = flow;
            this.$softRateLimit = taxReturnsPresenter;
            this.$ignoreServerBackoff = z;
            this.$syncReason = identityVerificationStatus;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow flow, Continuation continuation, LocalHomePresenter localHomePresenter, boolean z, MutableState mutableState, MutableState mutableState2) {
            super(2, continuation);
            this.$r8$classId = 2;
            this.$contactList = flow;
            this.$syncRoutines = localHomePresenter;
            this.$ignoreServerBackoff = z;
            this.$softRateLimit = mutableState;
            this.$syncReason = mutableState2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, RealClientScenarioCompleter realClientScenarioCompleter, BlockersData blockersData, ClientScenario clientScenario, List list, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 3;
            this.$ignoreServerBackoff = z;
            this.$syncRoutines = realClientScenarioCompleter;
            this.$softRateLimit = blockersData;
            this.$syncReason = clientScenario;
            this.$contactList = list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, RealInvestingHistoricalData realInvestingHistoricalData, InvestmentEntityToken investmentEntityToken, HistoricalRange historicalRange, ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 5;
            this.$ignoreServerBackoff = z;
            this.$contactList = realInvestingHistoricalData;
            this.$syncRoutines = investmentEntityToken;
            this.$softRateLimit = historicalRange;
            this.$syncReason = producerScope;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSync$syncRequest$2(Object obj, Boolean bool, Continuation continuation, ProfilePresenter profilePresenter, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$newContacts = obj;
        this.this$0 = bool;
        this.$syncRoutines = profilePresenter;
        this.$softRateLimit = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSync$syncRequest$2(ContactSyncEvent.NewContacts newContacts, RealContactSync realContactSync, ContactSyncEvent.SyncRoutines syncRoutines, boolean z, Long l, ContactSync$SyncReason contactSync$SyncReason, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$newContacts = newContacts;
        this.this$0 = realContactSync;
        this.$syncRoutines = syncRoutines;
        this.$ignoreServerBackoff = z;
        this.$softRateLimit = l;
        this.$syncReason = contactSync$SyncReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSync$syncRequest$2(boolean z, Animatable animatable, Motion motion, Animatable animatable2, Function0 function0, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.$ignoreServerBackoff = z;
        this.$newContacts = animatable;
        this.this$0 = motion;
        this.$syncRoutines = animatable2;
        this.$softRateLimit = function0;
        this.$syncReason = mutableState;
    }
}
