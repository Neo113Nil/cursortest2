package app.cash.local.store.real;

import androidx.compose.ui.text.android.CanvasCompatO;
import app.cash.local.db.Local_market_screen;
import app.cash.local.db.Local_tab_content;
import app.cash.local.db.SelectActivity;
import app.cash.local.db.SelectContent;
import app.cash.local.db.SelectHowItWorks;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$lambda$5$$inlined$map$1$2$1;
import com.squareup.cash.account.presenters.accountswitcher.AddAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1;
import com.squareup.cash.account.presenters.settings.FavoritesSetting$getRow$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.account.presenters.settings.ShoppingSetting$isFeatureEligible$$inlined$map$1$2$1;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.activity.backend.contacts.RealDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$lambda$21$$inlined$map$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$lambda$22$$inlined$map$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.activity.viewmodels.AppMessageEvent;
import com.squareup.cash.activity.viewmodels.ContactHeaderEvent;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewEvent;
import com.squareup.cash.activity.viewmodels.PulledToRefresh;
import com.squareup.cash.activity.viewmodels.SuspensionsBannerClicked;
import com.squareup.cash.activity.viewmodels.TabToolbarEvent;
import com.squareup.cash.activity.viewmodels.UpdateSearchQuery;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.favorites.viewmodels.FavoriteAvatar;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.storage.UtilsKt;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.util.android.ActivityResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import okio.Path;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RealLocalInstalledStore$showGeoTab$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: app.cash.local.store.real.RealLocalInstalledStore$showGeoTab$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return RealLocalInstalledStore$showGeoTab$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        Boolean bool;
        RealLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1;
        int i2;
        Object obj2;
        RealLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1;
        int i3;
        RealLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1;
        int i4;
        RealLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1;
        int i5;
        RealLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1;
        int i6;
        GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse;
        Long l;
        RealLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1;
        int i7;
        Long l2;
        RealLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1;
        int i8;
        EditProfilePresenter$models$lambda$5$$inlined$map$1$2$1 editProfilePresenter$models$lambda$5$$inlined$map$1$2$1;
        int i9;
        AddAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1 addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1;
        int i10;
        AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1 accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1;
        int i11;
        AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1 accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1;
        int i12;
        AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1 accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1;
        int i13;
        AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1 accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1;
        int i14;
        FavoritesSetting$getRow$lambda$0$$inlined$map$1$2$1 favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1;
        int i15;
        ShoppingSetting$isFeatureEligible$$inlined$map$1$2$1 shoppingSetting$isFeatureEligible$$inlined$map$1$2$1;
        int i16;
        RealProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1 realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1;
        int i17;
        RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1 realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1;
        int i18;
        RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1 realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1;
        int i19;
        RealDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1 realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1;
        int i20;
        ActivityTabPresenter$models$$inlined$filterIsInstance$1$2$1 activityTabPresenter$models$$inlined$filterIsInstance$1$2$1;
        int i21;
        ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i22;
        ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1 activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1;
        int i23;
        ActivityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i24;
        ActivityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1 activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1;
        int i25;
        ActivityTabPresenter$models$lambda$21$$inlined$map$1$2$1 activityTabPresenter$models$lambda$21$$inlined$map$1$2$1;
        int i26;
        ActivityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1 activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1;
        int i27;
        ActivityTabPresenter$models$lambda$22$$inlined$map$1$2$1 activityTabPresenter$models$lambda$22$$inlined$map$1$2$1;
        int i28;
        ActivityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1 activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1;
        int i29;
        int i30 = this.$r8$classId;
        long j = 0;
        boolean z = false;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i30) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i31 = anonymousClass1.label;
                    if ((i31 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i31 - PKIFailureInfo.systemUnavail;
                        Object obj3 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            LocalAccount localAccount = (LocalAccount) obj;
                            if (localAccount != null && (bool = localAccount.show_geo_tab) != null) {
                                z = bool.booleanValue();
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(valueOf, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj32 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof RealLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1) {
                    realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1) continuation;
                    int i32 = realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj4 = realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            SelectActivity selectActivity = (SelectActivity) obj;
                            obj2 = selectActivity != null ? selectActivity.activity : null;
                            if (obj2 != null) {
                                realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj42 = realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realLocalInstalledStore$selectLocalCashActivity$$inlined$mapNotNull$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof RealLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1) {
                    realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1) continuation;
                    int i33 = realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj5 = realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            SelectHowItWorks selectHowItWorks = (SelectHowItWorks) obj;
                            obj2 = selectHowItWorks != null ? selectHowItWorks.how_it_works : null;
                            if (obj2 != null) {
                                realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj52 = realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realLocalInstalledStore$selectLocalCashHowItWorks$$inlined$mapNotNull$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof RealLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1) {
                    realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1) continuation;
                    int i34 = realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj6 = realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            SelectContent selectContent = (SelectContent) obj;
                            obj2 = selectContent != null ? selectContent.content : null;
                            if (obj2 != null) {
                                realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1) == coroutineSingletons5) {
                                    break;
                                }
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj62 = realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realLocalInstalledStore$selectLocalCashInformationalContent$$inlined$mapNotNull$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof RealLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1) {
                    realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1) continuation;
                    int i35 = realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj7 = realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            Local_tab_content local_tab_content = (Local_tab_content) obj;
                            obj2 = local_tab_content != null ? local_tab_content.response : null;
                            if (obj2 != null) {
                                realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj72 = realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realLocalInstalledStore$selectLocalTabContent$$inlined$mapNotNull$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof RealLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1) {
                    realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1) continuation;
                    int i36 = realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            Local_tab_content local_tab_content2 = (Local_tab_content) obj;
                            if (local_tab_content2 != null && (getNeighborhoodsTabContentResponse = local_tab_content2.response) != null && (l = getNeighborhoodsTabContentResponse.expires_at) != null) {
                                j = l.longValue();
                            }
                            Long l3 = new Long(j);
                            realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1.label = 1;
                            if (flowCollector.emit(l3, realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1) == coroutineSingletons7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj82 = realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realLocalInstalledStore$selectLocalTabContentExpiresAt$$inlined$mapNotNull$1$2$1.label;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof RealLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1) {
                    realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1) continuation;
                    int i37 = realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            Local_market_screen local_market_screen = (Local_market_screen) obj;
                            if (local_market_screen != null && (l2 = local_market_screen.expires_at) != null) {
                                j = l2.longValue();
                            }
                            Long l4 = new Long(j);
                            realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1.label = 1;
                            if (flowCollector.emit(l4, realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1) == coroutineSingletons8) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj92 = realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realLocalInstalledStore$selectMarketScreenExpiresAt$$inlined$mapNotNull$1$2$1.label;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof RealLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1) {
                    realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1) continuation;
                    int i38 = realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj10 = realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            Local_market_screen local_market_screen2 = (Local_market_screen) obj;
                            obj2 = local_market_screen2 != null ? local_market_screen2.tiles : null;
                            if (obj2 != null) {
                                realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1) == coroutineSingletons9) {
                                    break;
                                }
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj102 = realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = realLocalInstalledStore$selectMarketTilesScreen$$inlined$mapNotNull$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof EditProfilePresenter$models$lambda$5$$inlined$map$1$2$1) {
                    editProfilePresenter$models$lambda$5$$inlined$map$1$2$1 = (EditProfilePresenter$models$lambda$5$$inlined$map$1$2$1) continuation;
                    int i39 = editProfilePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        editProfilePresenter$models$lambda$5$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj11 = editProfilePresenter$models$lambda$5$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = editProfilePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            Boolean valueOf2 = Boolean.valueOf(CanvasCompatO.isRatePlanBusiness((P2pSettingsManager$P2pSettings) obj));
                            editProfilePresenter$models$lambda$5$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, editProfilePresenter$models$lambda$5$$inlined$map$1$2$1) == coroutineSingletons10) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                editProfilePresenter$models$lambda$5$$inlined$map$1$2$1 = new EditProfilePresenter$models$lambda$5$$inlined$map$1$2$1(this, continuation);
                Object obj112 = editProfilePresenter$models$lambda$5$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = editProfilePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof AddAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                    addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1 = (AddAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i40 = addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj12 = addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            if (!((Map) obj).isEmpty()) {
                                addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons11) {
                                    break;
                                }
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1 = new AddAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj122 = addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = addAccountOptionsPresenter$models$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1) {
                    accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1 = (AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1) continuation;
                    int i41 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj13 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            Boolean valueOf3 = Boolean.valueOf(!((List) obj).isEmpty());
                            accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf3, accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1) == coroutineSingletons12) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1 = new AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1(this, continuation);
                Object obj132 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1) {
                    accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1 = (AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1) continuation;
                    int i42 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj14 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj15 : (List) obj) {
                                Calendar calendar = AccountDocumentsPresenter.cal;
                                Calendar calendar2 = AccountDocumentsPresenter.cal;
                                calendar2.setTimeInMillis(((ProfileDocumentModel) obj15).documentDate);
                                Integer num = new Integer(calendar2.get(1));
                                Object obj16 = linkedHashMap.get(num);
                                if (obj16 == null) {
                                    obj16 = new ArrayList();
                                    linkedHashMap.put(num, obj16);
                                }
                                ((List) obj16).add(obj15);
                            }
                            accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(linkedHashMap, accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1) == coroutineSingletons13) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1 = new AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1(this, continuation);
                Object obj142 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1) {
                    accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1 = (AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1) continuation;
                    int i43 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj17 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            List<ProfileDocumentModel> list = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (ProfileDocumentModel profileDocumentModel : list) {
                                Calendar calendar3 = AccountDocumentsPresenter.cal;
                                Calendar calendar4 = AccountDocumentsPresenter.cal;
                                calendar4.setTimeInMillis(profileDocumentModel.documentDate);
                                arrayList.add(new Integer(calendar4.get(1)));
                            }
                            Set set = CollectionsKt.toSet(arrayList);
                            accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(set, accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1) == coroutineSingletons14) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj17);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1 = new AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1(this, continuation);
                Object obj172 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                Object emit = flowCollector.emit((AccountDocumentsViewModel) obj, continuation);
                if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                if (continuation instanceof AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1) {
                    accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1 = (AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1) continuation;
                    int i44 = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj18 = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj19 : (List) obj) {
                                Calendar calendar5 = AccountDocumentsPresenter.cal;
                                Calendar calendar6 = AccountDocumentsPresenter.cal;
                                calendar6.setTimeInMillis(((ProfileDocumentModel) obj19).documentDate);
                                Integer num2 = new Integer(calendar6.get(1));
                                Object obj20 = linkedHashMap2.get(num2);
                                if (obj20 == null) {
                                    obj20 = new ArrayList();
                                    linkedHashMap2.put(num2, obj20);
                                }
                                ((List) obj20).add(obj19);
                            }
                            accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(linkedHashMap2, accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1) == coroutineSingletons15) {
                                break;
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1 = new AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1(this, continuation);
                Object obj182 = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
            case 15:
                if (continuation instanceof FavoritesSetting$getRow$lambda$0$$inlined$map$1$2$1) {
                    favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1 = (FavoritesSetting$getRow$lambda$0$$inlined$map$1$2$1) continuation;
                    int i45 = favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj21 = favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            List<Recipient> list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            for (Recipient recipient : list2) {
                                String str = recipient.displayName;
                                arrayList2.add(new FavoriteAvatar(recipient, str == null ? "" : str, str != null ? new Character(Character.toUpperCase(str.charAt(0))) : null, recipient.photo, recipient.getAccentColor()));
                            }
                            favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList2, favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons16) {
                                break;
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj21);
                        }
                        break;
                    }
                }
                favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1 = new FavoritesSetting$getRow$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj212 = favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = favoritesSetting$getRow$lambda$0$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 16:
                if (continuation instanceof ShoppingSetting$isFeatureEligible$$inlined$map$1$2$1) {
                    shoppingSetting$isFeatureEligible$$inlined$map$1$2$1 = (ShoppingSetting$isFeatureEligible$$inlined$map$1$2$1) continuation;
                    int i46 = shoppingSetting$isFeatureEligible$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        shoppingSetting$isFeatureEligible$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj22 = shoppingSetting$isFeatureEligible$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = shoppingSetting$isFeatureEligible$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj22);
                            Boolean valueOf4 = Boolean.valueOf(((Set) obj).contains(EligibleFeature.CASH_OFFERS_TAB));
                            shoppingSetting$isFeatureEligible$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf4, shoppingSetting$isFeatureEligible$$inlined$map$1$2$1) == coroutineSingletons17) {
                                break;
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj22);
                        }
                        break;
                    }
                }
                shoppingSetting$isFeatureEligible$$inlined$map$1$2$1 = new ShoppingSetting$isFeatureEligible$$inlined$map$1$2$1(this, continuation);
                Object obj222 = shoppingSetting$isFeatureEligible$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = shoppingSetting$isFeatureEligible$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
            case 17:
                if (continuation instanceof RealProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1) {
                    realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1 = (RealProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1) continuation;
                    int i47 = realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj23 = realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            if (((ActivityResult) obj).resultCode == -1) {
                                realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1) == coroutineSingletons18) {
                                    break;
                                }
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj23);
                        }
                        break;
                    }
                }
                realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1 = new RealProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1(this, continuation);
                Object obj232 = realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = realProfilePhotoManager$newPhotoResults$$inlined$filter$1$2$1.label;
                if (i17 != 0) {
                }
            case 18:
                if (continuation instanceof RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1) {
                    realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1 = (RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i48 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            if (((Boolean) obj).booleanValue()) {
                                realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons19) {
                                    break;
                                }
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1 = new RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj242 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i18 != 0) {
                }
            case 19:
                if (continuation instanceof RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1) {
                    realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1 = (RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i49 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj25 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            ((Boolean) obj).getClass();
                            String str2 = Path.DIRECTORY_SEPARATOR;
                            Path path = Path.Companion.get(UtilsKt.tempFileName("CASH"), false);
                            realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(path, realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons20) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj25);
                        }
                        break;
                    }
                }
                realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1 = new RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj252 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = realProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i19 != 0) {
                }
            case 20:
                if (continuation instanceof RealDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1) {
                    realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1 = (RealDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1) continuation;
                    int i50 = realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj26 = realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            List list3 = (List) obj;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj27 : list3) {
                                if (((com.squareup.cash.db.contacts.Recipient) obj27).sms != null) {
                                    arrayList3.add(obj27);
                                }
                            }
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                linkedHashMap3.put(((com.squareup.cash.db.contacts.Recipient) next).sms, next);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj28 : list3) {
                                if (((com.squareup.cash.db.contacts.Recipient) obj28).email != null) {
                                    arrayList4.add(obj28);
                                }
                            }
                            int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                            if (mapCapacity2 < 16) {
                                mapCapacity2 = 16;
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(mapCapacity2);
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                linkedHashMap4.put(((com.squareup.cash.db.contacts.Recipient) next2).email, next2);
                            }
                            LinkedHashMap plus = MapsKt__MapsKt.plus(linkedHashMap3, linkedHashMap4);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj29 : list3) {
                                if (((com.squareup.cash.db.contacts.Recipient) obj29).customerId != null) {
                                    arrayList5.add(obj29);
                                }
                            }
                            int mapCapacity3 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap(mapCapacity3 >= 16 ? mapCapacity3 : 16);
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                Object next3 = it3.next();
                                linkedHashMap5.put(((com.squareup.cash.db.contacts.Recipient) next3).customerId, next3);
                            }
                            LinkedHashMap plus2 = MapsKt__MapsKt.plus(plus, linkedHashMap5);
                            realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(plus2, realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1) == coroutineSingletons21) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1 = new RealDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1(this, continuation);
                Object obj262 = realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = realDeviceContactItemTransformer$transformActivityItem$$inlined$map$1$2$1.label;
                if (i20 != 0) {
                }
            case 21:
                if (continuation instanceof ActivityTabPresenter$models$$inlined$filterIsInstance$1$2$1) {
                    activityTabPresenter$models$$inlined$filterIsInstance$1$2$1 = (ActivityTabPresenter$models$$inlined$filterIsInstance$1$2$1) continuation;
                    int i51 = activityTabPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$$inlined$filterIsInstance$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj30 = activityTabPresenter$models$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = activityTabPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            if (obj instanceof SuspensionsBannerClicked) {
                                activityTabPresenter$models$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, activityTabPresenter$models$$inlined$filterIsInstance$1$2$1) == coroutineSingletons22) {
                                    break;
                                }
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$$inlined$filterIsInstance$1$2$1 = new ActivityTabPresenter$models$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj302 = activityTabPresenter$models$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = activityTabPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                if (i21 != 0) {
                }
            case 22:
                if (continuation instanceof ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i52 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj31 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            if (obj instanceof PulledToRefresh) {
                                activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons23) {
                                    break;
                                }
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj312 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i22 != 0) {
                }
            case 23:
                if (continuation instanceof ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1) {
                    activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1 = (ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1) continuation;
                    int i53 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj33 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1.result;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            if (obj instanceof PulledToRefresh) {
                                activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1.label = 1;
                                if (flowCollector.emit(obj, activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1) == coroutineSingletons24) {
                                    break;
                                }
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1 = new ActivityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1(this, continuation);
                Object obj332 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1.result;
                CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = activityTabPresenter$models$11$1$invokeSuspend$$inlined$filterIsInstance$2$2$1.label;
                if (i23 != 0) {
                }
            case 24:
                if (continuation instanceof ActivityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (ActivityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i54 = activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj34 = activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj34);
                            if (obj instanceof UpdateSearchQuery) {
                                activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons25) {
                                    break;
                                }
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj34);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new ActivityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj342 = activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = activityTabPresenter$models$13$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i24 != 0) {
                }
            case 25:
                if (continuation instanceof ActivityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1) {
                    activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1 = (ActivityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1) continuation;
                    int i55 = activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj35 = activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj35);
                            if (obj instanceof TabToolbarEvent) {
                                activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1) == coroutineSingletons26) {
                                    break;
                                }
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj35);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1 = new ActivityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj352 = activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = activityTabPresenter$models$lambda$21$$inlined$filterIsInstance$1$2$1.label;
                if (i25 != 0) {
                }
            case 26:
                if (continuation instanceof ActivityTabPresenter$models$lambda$21$$inlined$map$1$2$1) {
                    activityTabPresenter$models$lambda$21$$inlined$map$1$2$1 = (ActivityTabPresenter$models$lambda$21$$inlined$map$1$2$1) continuation;
                    int i56 = activityTabPresenter$models$lambda$21$$inlined$map$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$lambda$21$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj36 = activityTabPresenter$models$lambda$21$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = activityTabPresenter$models$lambda$21$$inlined$map$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj36);
                            TabToolbarInternalViewEvent tabToolbarInternalViewEvent = ((TabToolbarEvent) obj).tabToolbarEvent;
                            activityTabPresenter$models$lambda$21$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(tabToolbarInternalViewEvent, activityTabPresenter$models$lambda$21$$inlined$map$1$2$1) == coroutineSingletons27) {
                                break;
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj36);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$lambda$21$$inlined$map$1$2$1 = new ActivityTabPresenter$models$lambda$21$$inlined$map$1$2$1(this, continuation);
                Object obj362 = activityTabPresenter$models$lambda$21$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = activityTabPresenter$models$lambda$21$$inlined$map$1$2$1.label;
                if (i26 != 0) {
                }
            case 27:
                if (continuation instanceof ActivityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1) {
                    activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1 = (ActivityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1) continuation;
                    int i57 = activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj37 = activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj37);
                            if (obj instanceof ContactHeaderEvent) {
                                activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1) == coroutineSingletons28) {
                                    break;
                                }
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj37);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1 = new ActivityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj372 = activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = activityTabPresenter$models$lambda$22$$inlined$filterIsInstance$1$2$1.label;
                if (i27 != 0) {
                }
            case 28:
                if (continuation instanceof ActivityTabPresenter$models$lambda$22$$inlined$map$1$2$1) {
                    activityTabPresenter$models$lambda$22$$inlined$map$1$2$1 = (ActivityTabPresenter$models$lambda$22$$inlined$map$1$2$1) continuation;
                    int i58 = activityTabPresenter$models$lambda$22$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$lambda$22$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj38 = activityTabPresenter$models$lambda$22$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = activityTabPresenter$models$lambda$22$$inlined$map$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj38);
                            ContactHeaderViewEvent.ContactClickById contactClickById = ((ContactHeaderEvent) obj).contactHeaderEvent;
                            activityTabPresenter$models$lambda$22$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(contactClickById, activityTabPresenter$models$lambda$22$$inlined$map$1$2$1) == coroutineSingletons29) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj38);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$lambda$22$$inlined$map$1$2$1 = new ActivityTabPresenter$models$lambda$22$$inlined$map$1$2$1(this, continuation);
                Object obj382 = activityTabPresenter$models$lambda$22$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = activityTabPresenter$models$lambda$22$$inlined$map$1$2$1.label;
                if (i28 != 0) {
                }
            default:
                if (continuation instanceof ActivityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1) {
                    activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1 = (ActivityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1) continuation;
                    int i59 = activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj39 = activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj39);
                            if (obj instanceof AppMessageEvent) {
                                activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1) == coroutineSingletons30) {
                                    break;
                                }
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj39);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1 = new ActivityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj392 = activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = activityTabPresenter$models$lambda$32$$inlined$filterIsInstance$1$2$1.label;
                if (i29 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
