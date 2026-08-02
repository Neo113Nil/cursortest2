package com.squareup.cash.profile.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.api.ApiResult;
import app.cash.broadway.ui.Ui;
import app.cash.local.presenters.LocalEditorialPresenter;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.BrowserCheckoutReceiveCashAppPayInfoToast;
import com.squareup.cash.cdf.browser.BrowserViewInputFields;
import com.squareup.cash.cdf.browser.BrowserViewOpenCart;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.cashappscore.AppletState;
import com.squareup.cash.cdf.cashappscore.CashAppScoreEntrypointView;
import com.squareup.cash.cdf.cashappscore.CashAppScoreHomeView;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewShoppingAutofillSettings;
import com.squareup.cash.cdf.securityhub.SecurityHubViewEducationalBooklet;
import com.squareup.cash.cdf.securityhub.SecurityHubViewHub;
import com.squareup.cash.cdf.securityhub.SecurityHubViewRecoveryPage;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.data.profile.RealCropResultManager;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.activity.CashActivityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.activity.CashActivityQueries$forToken$2;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.ExtendedProfileDetailsQueries$forCustomerToken$2;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.notifications.NotificationToggleState;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.viewmodels.ProfileCropViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileCropViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository;
import com.squareup.cash.savings.backend.api.GeneralSavingsError;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.presenters.SavingsScreenContentFactory;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.securityhub.presenters.SecurityHubPresenterKt$WhenMappings;
import com.squareup.cash.securityhub.screens.BookletScreen;
import com.squareup.cash.securityhub.screens.RecoveryGuideScreen;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.UserDismissMode;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.db.ImageType;
import com.squareup.cash.shopping.db.ShoppingRecentlyViewed;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.presenters.ShopWebJavascriptException;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastState;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.shopping.viewmodels.WebVitalsScore;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.shopping.views.ProductSearchViewState;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.chat.backend.api.ChatSurveyResponse;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cropview.CropView;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.ui.Color;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.json.JSONException;
import org.json.JSONObject;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class ProfileCropView extends LinearLayout implements OutsideTapCloses, Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(ProfileCropView.class, "cropView", "getCropView()Lcom/squareup/cropview/CropView;", 0), new PropertyReference1Impl(ProfileCropView.class, "cancelView", "getCancelView()Landroidx/appcompat/widget/AppCompatButton;", 0), new PropertyReference1Impl(ProfileCropView.class, "okView", "getOkView()Landroidx/appcompat/widget/AppCompatButton;", 0)};
    public final Lazy cancelView$delegate;
    public final RealCropResultManager cropResultManager;
    public final Lazy cropView$delegate;
    public Ui.EventReceiver eventReceiver;
    public final RealImageLoader imageLoader;
    public final Lazy okView$delegate;
    public final BufferedChannel okViewClickChannel;
    public String photoUri;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider cropResultManager;
        public final Provider imageLoader;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2) {
            this.imageLoader = provider;
            this.cropResultManager = provider2;
        }
    }

    public ProfileCropView(RealImageLoader realImageLoader, RealCropResultManager realCropResultManager, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null);
        this.imageLoader = realImageLoader;
        this.cropResultManager = realCropResultManager;
        this.cropView$delegate = KotterKnifeKt.bindView(this, R.id.crop);
        Lazy bindView = KotterKnifeKt.bindView(this, R.id.cancel);
        this.cancelView$delegate = bindView;
        this.okView$delegate = KotterKnifeKt.bindView(this, R.id.ok);
        final int i = 1;
        this.okViewClickChannel = PapaEvent.Channel$default(1, null, null, 6);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        View.inflate(contextThemeWrapper, R.layout.profile_crop_view, this);
        KProperty[] kPropertyArr = $$delegatedProperties;
        final int i2 = 0;
        ((AppCompatButton) bindView.getValue(this, kPropertyArr[1])).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.ProfileCropView$$ExternalSyntheticLambda0
            public final /* synthetic */ ProfileCropView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                ProfileCropView profileCropView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = profileCropView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ProfileCropViewEvent.CancelClicked.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        StateFlowKt.sendOrThrow$default(profileCropView.okViewClickChannel, Unit.INSTANCE);
                        return;
                }
            }
        });
        getOkView().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.ProfileCropView$$ExternalSyntheticLambda0
            public final /* synthetic */ ProfileCropView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                ProfileCropView profileCropView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = profileCropView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ProfileCropViewEvent.CancelClicked.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        StateFlowKt.sendOrThrow$default(profileCropView.okViewClickChannel, Unit.INSTANCE);
                        return;
                }
            }
        });
        ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(contextThemeWrapper);
        AppCompatButton appCompatButton = (AppCompatButton) bindView.getValue(this, kPropertyArr[1]);
        ColorPalette colorPalette = findThemeInfo.colorPalette;
        appCompatButton.setTextColor(colorPalette.tint);
        getOkView().setTextColor(colorPalette.tint);
        setBackgroundColor(colorPalette.background);
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new AnonymousClass3(this, null, i2));
    }

    public final AppCompatButton getOkView() {
        return (AppCompatButton) this.okView$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(ProfileCropViewModel profileCropViewModel) {
        profileCropViewModel.getClass();
        this.photoUri = profileCropViewModel.photoUri;
        Context context = getContext();
        context.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        String str = this.photoUri;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photoUri");
            throw null;
        }
        builder.data = str;
        builder.size(1080, 1080);
        ImageRequests_androidKt.allowHardware(builder, false);
        ImageRequests_androidKt.target(builder, (CropView) this.cropView$delegate.getValue(this, $$delegatedProperties[0]));
        builder.listener = new SizeMap(this, 26);
        this.imageLoader.enqueue(builder.build());
    }

    /* renamed from: com.squareup.cash.profile.views.ProfileCropView$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.this$0 = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3((ProfileCropView) obj2, continuation, 0);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                case 1:
                    return new AnonymousClass3((ProfilePrivacyPresenter) this.L$0, (MutableState) obj2, continuation, 1);
                case 2:
                    AnonymousClass3 anonymousClass32 = new AnonymousClass3((ProfilePrivacyPresenter) obj2, continuation, 2);
                    anonymousClass32.L$0 = obj;
                    return anonymousClass32;
                case 3:
                    AnonymousClass3 anonymousClass33 = new AnonymousClass3((TabToolbarPresenter) obj2, continuation, 3);
                    anonymousClass33.L$0 = obj;
                    return anonymousClass33;
                case 4:
                    return new AnonymousClass3((ProfileNotificationsPresenter) this.L$0, (MutableState) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass3((RealProfileRepo) this.L$0, (String) obj2, continuation, 5);
                case 6:
                    return new AnonymousClass3((SavingsAction) this.L$0, (RealSavingsAppletTileRepository) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass3((EglCore) this.L$0, (ApiResult.Success) obj2, continuation, 7);
                case 8:
                    return new AnonymousClass3((SavingsScreenContentFactory) this.L$0, (SavingsScreen.Element.CellDefault.Accessory) obj2, continuation, 8);
                case 9:
                    return new AnonymousClass3((SavingsScreenPresenter) this.L$0, (SavingsScreenViewEvent) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass3((SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader) this.L$0, (Function1) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass3((ScoreAppletTileViewModel) this.L$0, (ShareSheetPresenter) obj2, continuation, 11);
                case 12:
                    return new AnonymousClass3((CashCreditScoreHomeData) this.L$0, (LocalEditorialPresenter) obj2, continuation, 12);
                case 13:
                    return new AnonymousClass3((LocalEditorialPresenter) this.L$0, (MutableState) obj2, continuation, 13);
                case 14:
                    return new AnonymousClass3((LocalEditorialPresenter) this.L$0, (MutableState) obj2, continuation, 14);
                case 15:
                    return new AnonymousClass3((TaxReturnsPresenter) this.L$0, (MutableState) obj2, continuation, 15);
                case 16:
                    AnonymousClass3 anonymousClass34 = new AnonymousClass3((StuckPlayerDetector) obj2, continuation, 16);
                    anonymousClass34.L$0 = obj;
                    return anonymousClass34;
                case 17:
                    return new AnonymousClass3((HCaptcha) this.L$0, (String) obj2, continuation, 17);
                case 18:
                    AnonymousClass3 anonymousClass35 = new AnonymousClass3((HCaptcha) obj2, continuation, 18);
                    anonymousClass35.L$0 = obj;
                    return anonymousClass35;
                case 19:
                    return new AnonymousClass3((RealRecentSearchManager) this.L$0, (ShoppingRecentlyViewed) obj2, continuation, 19);
                case 20:
                    return new AnonymousClass3((RealShoppingJavascriptPresenter) this.L$0, (State) obj2, continuation, 20);
                case 21:
                    return new AnonymousClass3((ShoppingWebViewEvent.WebMonitoringJsonEvents) this.L$0, (RealShoppingJavascriptPresenter) obj2, continuation, 21);
                case 22:
                    return new AnonymousClass3((ShoppingWebPresenter) this.L$0, (MutableState) obj2, continuation, 22);
                case 23:
                    return new AnonymousClass3((Boolean) this.L$0, (ShoppingWebPresenter) obj2, continuation, 23);
                case 24:
                    AnonymousClass3 anonymousClass36 = new AnonymousClass3((ShoppingWebPresenter) obj2, continuation, 24);
                    anonymousClass36.L$0 = obj;
                    return anonymousClass36;
                case 25:
                    return new AnonymousClass3((InviteErrorPresenter) this.L$0, (MutableState) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass3((ProductSearchViewModel) this.L$0, (MutableState) obj2, continuation, 26);
                case 27:
                    return new AnonymousClass3((PaymentQueries) this.L$0, (String) obj2, continuation, 27);
                case 28:
                    return new AnonymousClass3((PoolsListPresenter) this.L$0, (ChatSurveyResponse) obj2, continuation, 28);
                default:
                    return new AnonymousClass3((RealSheetState) this.L$0, (ChatExitPromptSheetViewModel) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    throw null;
                case 2:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 3:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 4:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 5:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 6:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 7:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 8:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 9:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 10:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 11:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 12:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 13:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 14:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 15:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 16:
                    return ((AnonymousClass3) create((RealShareTargetsManager$TargetPreparationState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 17:
                    return ((AnonymousClass3) create((Uri) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 18:
                    return ((AnonymousClass3) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 19:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 20:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 21:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 22:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 23:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 24:
                    return ((AnonymousClass3) create((FillrCartInformationExtraction$FillrCartInformation) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 25:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 26:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 27:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 28:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            CashCreditScoreHomeData.Visualization visualization;
            CashCreditScoreHomeData.Visualization.ScoreLock scoreLock;
            SecurityHubViewEducationalBooklet.BookletType bookletType;
            SecurityHubViewRecoveryPage.RecoveryType recoveryType;
            SecurityHubViewHub.Source source;
            boolean z;
            int i = this.$r8$classId;
            boolean z2 = false;
            z2 = false;
            z2 = false;
            ProfileNotificationsViewModel.Loaded.NotificationMessage notificationMessage = 0;
            notificationMessage = 0;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope, null, null, new ShoppingWebBridge.AnonymousClass1((ProfileCropView) obj2, (Continuation) notificationMessage, 12), 3);
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    throw null;
                case 2:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) obj2;
                    JobKt.launch$default(coroutineScope2, profilePrivacyPresenter.ioDispatcher, null, new ShoppingWebBridge.AnonymousClass1(profilePrivacyPresenter, (Continuation) notificationMessage, 5), 2);
                    return Unit.INSTANCE;
                case 3:
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) obj2;
                    JobKt.launch$default(coroutineScope3, (CoroutineContext) tabToolbarPresenter.badger2, null, new ShoppingWebBridge.AnonymousClass1(tabToolbarPresenter, (Continuation) notificationMessage, 6), 2);
                    return Unit.INSTANCE;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ProfileNotificationsPresenter profileNotificationsPresenter = (ProfileNotificationsPresenter) this.L$0;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = profileNotificationsPresenter.viewModel$delegate;
                    ProfileNotificationsViewModel profileNotificationsViewModel = (ProfileNotificationsViewModel) parcelableSnapshotMutableState.getValue();
                    ProfileNotificationsViewModel.Loaded loaded = profileNotificationsViewModel instanceof ProfileNotificationsViewModel.Loaded ? (ProfileNotificationsViewModel.Loaded) profileNotificationsViewModel : null;
                    if (loaded == null) {
                        return Unit.INSTANCE;
                    }
                    NotificationToggleState notificationToggleState = (NotificationToggleState) ((MutableState) obj2).getValue();
                    if (notificationToggleState != null) {
                        AndroidStringManager androidStringManager = profileNotificationsPresenter.stringManager;
                        if (notificationToggleState == NotificationToggleState.Disabled) {
                            notificationMessage = new ProfileNotificationsViewModel.Loaded.NotificationMessage(androidStringManager.get(R.string.notification_message_disabled_state_title), androidStringManager.get(R.string.notification_message_disabled_state_subtitle), androidStringManager.get(R.string.notification_message_disabled_state_buttonText));
                        }
                    }
                    List list = loaded.sections;
                    list.getClass();
                    parcelableSnapshotMutableState.setValue(new ProfileNotificationsViewModel.Loaded(list, notificationMessage));
                    return Unit.INSTANCE;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    InstrumentQueries instrumentQueries = ((RealProfileRepo) this.L$0).extendedProfileDetailsQueries;
                    String str2 = (String) obj2;
                    instrumentQueries.getClass();
                    str2.getClass();
                    ExtendedProfileDetailsQueries$forCustomerToken$2 extendedProfileDetailsQueries$forCustomerToken$2 = ExtendedProfileDetailsQueries$forCustomerToken$2.INSTANCE;
                    return new OffersSheetQueries$ForSheetKeyQuery(instrumentQueries, str2, new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries, z2 ? (char) 1 : (char) 0)).executeAsOneOrNull();
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    SavingsAction savingsAction = (SavingsAction) this.L$0;
                    SavingsAction.ClientRoute clientRoute = savingsAction instanceof SavingsAction.ClientRoute ? (SavingsAction.ClientRoute) savingsAction : null;
                    if (clientRoute != null) {
                        return ((RealSavingsAppletTileRepository) obj2).clientRouteParser.parse(clientRoute.route);
                    }
                    return null;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    EglCore eglCore = (EglCore) this.L$0;
                    ((GpsConfigQueries) eglCore.eglConfig).transactionWithWrapper(new OpenSourceKt$$ExternalSyntheticLambda11(27, eglCore, (ApiResult.Success) obj2));
                    return Unit.INSTANCE;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((SavingsScreenContentFactory) this.L$0).errorReporter.report(new GeneralSavingsError("Accessory type not supported: " + ((SavingsScreen.Element.CellDefault.Accessory) obj2), null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    return Unit.INSTANCE;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    SavingsScreenViewEvent.GoalCelebrationSeen goalCelebrationSeen = (SavingsScreenViewEvent.GoalCelebrationSeen) ((SavingsScreenViewEvent) obj2);
                    ((GpsConfigQueries) ((SavingsScreenPresenter) this.L$0).goalLocalStatus).setGoalCelebrated(goalCelebrationSeen.goalToken, goalCelebrationSeen.completionToken);
                    return Unit.INSTANCE;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    SavingsScreenViewEvent savingsScreenViewEvent = ((SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader) this.L$0).onRenderedEvent;
                    if (savingsScreenViewEvent != null) {
                        ((Function1) obj2).invoke(savingsScreenViewEvent);
                    }
                    return Unit.INSTANCE;
                case 11:
                    ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj2;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ScoreAppletTileViewModel scoreAppletTileViewModel = (ScoreAppletTileViewModel) this.L$0;
                    if (!(scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Failure) && !(scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Loading)) {
                        boolean z3 = scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Installed;
                        if (!z3 && !(scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Uninstalled)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Analytics analytics = (Analytics) shareSheetPresenter.analytics;
                        AppletState cdfAppletState = ShareSheetPresenter.toCdfAppletState(scoreAppletTileViewModel);
                        ScoreAppletTileViewModel.Installed installed = z3 ? (ScoreAppletTileViewModel.Installed) scoreAppletTileViewModel : null;
                        analytics.track(new CashAppScoreEntrypointView(cdfAppletState, (installed == null || (str = installed.scoreText) == null) ? null : StringsKt.toIntOrNull(str)), null);
                    }
                    return Unit.INSTANCE;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    CashCreditScoreHomeData cashCreditScoreHomeData = (CashCreditScoreHomeData) this.L$0;
                    CashCreditScoreHomeData.ScoreSummary scoreSummary = cashCreditScoreHomeData.score_summary;
                    Analytics analytics2 = (Analytics) ((LocalEditorialPresenter) obj2).screen;
                    Integer num = scoreSummary != null ? scoreSummary.score : null;
                    Integer scoreChange = LocalEditorialPresenter.getScoreChange(cashCreditScoreHomeData);
                    if (scoreSummary != null && (visualization = scoreSummary.visualization) != null && (scoreLock = visualization.score_lock) != null) {
                        z2 = Intrinsics.areEqual(scoreLock.show_unlock_celebration, Boolean.TRUE);
                    }
                    analytics2.track(new CashAppScoreHomeView(Boolean.valueOf(z2), num, scoreChange, scoreSummary != null ? scoreSummary.score_token : null), null);
                    return Unit.INSTANCE;
                case 13:
                    LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.L$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState = (MutableState) obj2;
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    mutableState.setValue(Boolean.TRUE);
                    Analytics analytics3 = (Analytics) localEditorialPresenter.screen;
                    int ordinal = ((BookletScreen) localEditorialPresenter.launcher).bookletId.ordinal();
                    if (ordinal == 0) {
                        bookletType = SecurityHubViewEducationalBooklet.BookletType.BUILT_IN_PROTECTIONS;
                    } else if (ordinal == 1) {
                        bookletType = SecurityHubViewEducationalBooklet.BookletType.COMMON_SCAMS;
                    } else if (ordinal == 2) {
                        bookletType = SecurityHubViewEducationalBooklet.BookletType.SPOT_SCAMS;
                    } else if (ordinal == 3) {
                        bookletType = SecurityHubViewEducationalBooklet.BookletType.PREVENT_FRAUD;
                    } else {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        bookletType = SecurityHubViewEducationalBooklet.BookletType.SECURITY_FEATURES;
                    }
                    analytics3.track(new SecurityHubViewEducationalBooklet(bookletType), null);
                    return Unit.INSTANCE;
                case 14:
                    LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) this.L$0;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState2 = (MutableState) obj2;
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    mutableState2.setValue(Boolean.TRUE);
                    Analytics analytics4 = (Analytics) localEditorialPresenter2.responseContextHandler;
                    int ordinal2 = ((RecoveryGuideScreen) localEditorialPresenter2.launcher).recoveryGuideId.ordinal();
                    if (ordinal2 == 0) {
                        recoveryType = SecurityHubViewRecoveryPage.RecoveryType.SCAMMED;
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        recoveryType = SecurityHubViewRecoveryPage.RecoveryType.HACKED;
                    }
                    analytics4.track(new SecurityHubViewRecoveryPage(recoveryType), null);
                    return Unit.INSTANCE;
                case 15:
                    TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) this.L$0;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = (MutableState) obj2;
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    mutableState3.setValue(Boolean.TRUE);
                    Analytics analytics5 = (Analytics) taxReturnsPresenter.args;
                    SecurityHubScreen.Source source2 = ((SecurityHubScreen) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider).source;
                    if (source2 == null) {
                        source = null;
                    } else {
                        if (SecurityHubPresenterKt$WhenMappings.$EnumSwitchMapping$0[source2.ordinal()] != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        source = SecurityHubViewHub.Source.SETTINGS;
                    }
                    analytics5.track(new SecurityHubViewHub(source), null);
                    return Unit.INSTANCE;
                case 16:
                    RealShareTargetsManager$TargetPreparationState realShareTargetsManager$TargetPreparationState = (RealShareTargetsManager$TargetPreparationState) this.L$0;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (realShareTargetsManager$TargetPreparationState instanceof RealShareTargetsManager$TargetPreparationState.Ready) {
                        StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj2;
                        Activity activity = (Activity) stuckPlayerDetector.callback;
                        ShareTarget shareTarget = ((RealShareTargetsManager$TargetPreparationState.Ready) realShareTargetsManager$TargetPreparationState).target;
                        if (shareTarget instanceof ShareTarget.XApp) {
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", ((ShareTarget.XApp) shareTarget).content.cashtagUrl);
                            intent.setPackage("com.twitter.android");
                            activity.startActivity(intent);
                        } else if (shareTarget instanceof ShareTarget.Instagram) {
                            Uri uri = ((ShareTarget.Instagram) shareTarget).content.imageUri;
                            uri.getClass();
                            Intent intent2 = new Intent();
                            intent2.setAction("android.intent.action.SEND");
                            intent2.setType("image/png");
                            intent2.setPackage("com.instagram.android");
                            intent2.addFlags(1);
                            intent2.putExtra("android.intent.extra.STREAM", uri);
                            activity.startActivity(intent2);
                        } else if (shareTarget instanceof ShareTarget.Sms) {
                            Intent intent3 = new Intent();
                            intent3.setAction("android.intent.action.SEND");
                            intent3.setType("text/plain");
                            ShareTarget.Sms sms = (ShareTarget.Sms) shareTarget;
                            String str3 = sms.content.cashtagUrl;
                            intent3.putExtra("android.intent.extra.TEXT", str3);
                            intent3.setPackage(sms.smsPackage);
                            if (((AndroidPackageManager) stuckPlayerDetector.handler).context.getPackageManager().resolveActivity(intent3, 0) != null) {
                                activity.startActivity(intent3);
                            } else {
                                stuckPlayerDetector.startChooserActivity(str3);
                            }
                        } else if (shareTarget instanceof ShareTarget.CopyToClipboard) {
                            ((RealClipboardManager) stuckPlayerDetector.period).copy("cashtag", ((ShareTarget.CopyToClipboard) shareTarget).content.cashtagUrl);
                        } else if (shareTarget instanceof ShareTarget.SaveToPhotos) {
                            Uri uri2 = ((ShareTarget.SaveToPhotos) shareTarget).content.imageUrl;
                            uri2.getClass();
                            Intent intent4 = new Intent();
                            intent4.setAction("android.intent.action.SEND");
                            intent4.addFlags(1);
                            intent4.setType("image/png");
                            intent4.putExtra("android.intent.extra.STREAM", uri2);
                            activity.startActivity(Intent.createChooser(intent4, null));
                        } else if (shareTarget instanceof ShareTarget.More) {
                            stuckPlayerDetector.startChooserActivity(((ShareTarget.More) shareTarget).content.cashtagUrl);
                        }
                    }
                    return Unit.INSTANCE;
                case 17:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((LinkedHashMap) ((HCaptcha) this.L$0).internalConfig).remove((String) obj2);
                    return Unit.INSTANCE;
                case 18:
                    String str4 = (String) this.L$0;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) ((HCaptcha) obj2).captchaVerifier;
                    SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 50, null, 4);
                    Unit unit = Unit.INSTANCE;
                    StateFlowKt.emitOrThrow(MutableSharedFlow$default, unit);
                    linkedHashMap.put(str4, MutableSharedFlow$default);
                    return unit;
                case 19:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    GpsConfigQueries gpsConfigQueries = ((RealRecentSearchManager) this.L$0).recentlyViewedQueries;
                    ShoppingRecentlyViewed shoppingRecentlyViewed = (ShoppingRecentlyViewed) obj2;
                    gpsConfigQueries.getClass();
                    String str5 = shoppingRecentlyViewed.token;
                    String str6 = shoppingRecentlyViewed.title;
                    String str7 = shoppingRecentlyViewed.light_image_url;
                    String str8 = shoppingRecentlyViewed.dark_image_url;
                    String str9 = shoppingRecentlyViewed.action_url;
                    Color color = shoppingRecentlyViewed.accent_color;
                    long j = shoppingRecentlyViewed.updated_at;
                    String str10 = shoppingRecentlyViewed.subtitle;
                    Metadata.EntityType entityType = shoppingRecentlyViewed.f1205type;
                    ImageType imageType = shoppingRecentlyViewed.imageType;
                    str5.getClass();
                    entityType.getClass();
                    imageType.getClass();
                    gpsConfigQueries.notifyQueries(1642877455, new RealSheetState$$ExternalSyntheticLambda0(19));
                    return Unit.INSTANCE;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    List list2 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                    if (((PaykitInfoToastState) ((State) obj2).getValue()).showToast) {
                        RealShoppingJavascriptPresenter realShoppingJavascriptPresenter = (RealShoppingJavascriptPresenter) this.L$0;
                        Analytics analytics6 = realShoppingJavascriptPresenter.analytics;
                        RealBugReportSenderFactory realBugReportSenderFactory = realShoppingJavascriptPresenter.shoppingWebAnalytics;
                        analytics6.track(new BrowserCheckoutReceiveCashAppPayInfoToast((BrowserOrigin) realBugReportSenderFactory.sessionManager, (InfoContext) realBugReportSenderFactory.featureEligibilityDumper, (String) realBugReportSenderFactory.tempStorage, (String) realBugReportSenderFactory.cashDatabase, (String) realBugReportSenderFactory.recentMoneybotSession, (String) realBugReportSenderFactory.preferences), null);
                    }
                    return Unit.INSTANCE;
                case 21:
                    ShoppingWebViewEvent.WebMonitoringJsonEvents webMonitoringJsonEvents = (ShoppingWebViewEvent.WebMonitoringJsonEvents) this.L$0;
                    RealShoppingJavascriptPresenter realShoppingJavascriptPresenter2 = (RealShoppingJavascriptPresenter) obj2;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    try {
                        String str11 = webMonitoringJsonEvents.jsonString;
                        String str12 = webMonitoringJsonEvents.jsonString;
                        String string2 = new JSONObject(str11).getString("type");
                        if (Intrinsics.areEqual(string2, "CASH_IAB_PERFORMANCE_SCORE")) {
                            JSONObject jSONObject = new JSONObject(new JSONObject(str12).getString("payload"));
                            String string3 = jSONObject.getString("metricValue");
                            String string4 = jSONObject.getString("metricScore");
                            String string5 = jSONObject.getString("metricName");
                            if (string5 != null) {
                                switch (string5.hashCode()) {
                                    case 66826:
                                        if (!string5.equals("CLS")) {
                                            break;
                                        } else {
                                            List list3 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                            WebVitalsScore webVitalsScore = realShoppingJavascriptPresenter2.getWebVitalResult().CLS;
                                            string3.getClass();
                                            webVitalsScore.getClass();
                                            webVitalsScore.value = string3;
                                            WebVitalsScore webVitalsScore2 = realShoppingJavascriptPresenter2.getWebVitalResult().CLS;
                                            string4.getClass();
                                            webVitalsScore2.getClass();
                                            webVitalsScore2.score = string4;
                                            break;
                                        }
                                    case 69427:
                                        if (!string5.equals("FCP")) {
                                            break;
                                        } else {
                                            List list4 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                            WebVitalsScore webVitalsScore3 = realShoppingJavascriptPresenter2.getWebVitalResult().FCP;
                                            string3.getClass();
                                            webVitalsScore3.getClass();
                                            webVitalsScore3.value = string3;
                                            WebVitalsScore webVitalsScore4 = realShoppingJavascriptPresenter2.getWebVitalResult().FCP;
                                            string4.getClass();
                                            webVitalsScore4.getClass();
                                            webVitalsScore4.score = string4;
                                            break;
                                        }
                                    case 69601:
                                        if (!string5.equals("FID")) {
                                            break;
                                        } else {
                                            List list5 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                            WebVitalsScore webVitalsScore5 = realShoppingJavascriptPresenter2.getWebVitalResult().FID;
                                            string3.getClass();
                                            webVitalsScore5.getClass();
                                            webVitalsScore5.value = string3;
                                            WebVitalsScore webVitalsScore6 = realShoppingJavascriptPresenter2.getWebVitalResult().FID;
                                            string4.getClass();
                                            webVitalsScore6.getClass();
                                            webVitalsScore6.score = string4;
                                            break;
                                        }
                                    case 72651:
                                        if (!string5.equals("INP")) {
                                            break;
                                        } else {
                                            List list6 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                            WebVitalsScore webVitalsScore7 = realShoppingJavascriptPresenter2.getWebVitalResult().INP;
                                            string3.getClass();
                                            webVitalsScore7.getClass();
                                            webVitalsScore7.value = string3;
                                            WebVitalsScore webVitalsScore8 = realShoppingJavascriptPresenter2.getWebVitalResult().INP;
                                            string4.getClass();
                                            webVitalsScore8.getClass();
                                            webVitalsScore8.score = string4;
                                            break;
                                        }
                                    case 75193:
                                        if (!string5.equals("LCP")) {
                                            break;
                                        } else {
                                            List list7 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                            WebVitalsScore webVitalsScore9 = realShoppingJavascriptPresenter2.getWebVitalResult().LCP;
                                            string3.getClass();
                                            webVitalsScore9.getClass();
                                            webVitalsScore9.value = string3;
                                            WebVitalsScore webVitalsScore10 = realShoppingJavascriptPresenter2.getWebVitalResult().LCP;
                                            string4.getClass();
                                            webVitalsScore10.getClass();
                                            webVitalsScore10.score = string4;
                                            break;
                                        }
                                    case 82854:
                                        if (!string5.equals("TBT")) {
                                            break;
                                        } else {
                                            List list8 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                            WebVitalsScore webVitalsScore11 = realShoppingJavascriptPresenter2.getWebVitalResult().TBT;
                                            string3.getClass();
                                            webVitalsScore11.getClass();
                                            webVitalsScore11.value = string3;
                                            WebVitalsScore webVitalsScore12 = realShoppingJavascriptPresenter2.getWebVitalResult().TBT;
                                            string4.getClass();
                                            webVitalsScore12.getClass();
                                            webVitalsScore12.score = string4;
                                            break;
                                        }
                                    case 83401:
                                        if (!string5.equals("TTI")) {
                                            break;
                                        } else {
                                            List list9 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                            WebVitalsScore webVitalsScore13 = realShoppingJavascriptPresenter2.getWebVitalResult().TTI;
                                            string3.getClass();
                                            webVitalsScore13.getClass();
                                            webVitalsScore13.value = string3;
                                            WebVitalsScore webVitalsScore14 = realShoppingJavascriptPresenter2.getWebVitalResult().TTI;
                                            string4.getClass();
                                            webVitalsScore14.getClass();
                                            webVitalsScore14.score = string4;
                                            break;
                                        }
                                    case 2585404:
                                        if (!string5.equals("TTFB")) {
                                            break;
                                        } else {
                                            List list10 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                            WebVitalsScore webVitalsScore15 = realShoppingJavascriptPresenter2.getWebVitalResult().TTFB;
                                            string3.getClass();
                                            webVitalsScore15.getClass();
                                            webVitalsScore15.value = string3;
                                            WebVitalsScore webVitalsScore16 = realShoppingJavascriptPresenter2.getWebVitalResult().TTFB;
                                            string4.getClass();
                                            webVitalsScore16.getClass();
                                            webVitalsScore16.score = string4;
                                            break;
                                        }
                                }
                            }
                        } else if (Intrinsics.areEqual(string2, "CASH_IAB_PERFORMANCE_SCRIPT_ERROR")) {
                            JSONObject jSONObject2 = new JSONObject(new JSONObject(str12).getString("payload"));
                            Timber.Forest forest = Timber.Forest;
                            forest.e("Error Reporting Web Vitals", new Object[0]);
                            forest.e(new ShopWebJavascriptException(jSONObject2.getString(BreadcrumbHelper.Category.ERROR)));
                        }
                    } catch (JSONException e) {
                        Timber.Forest.e("Error parsing monitoring script message", new Object[0], e);
                    }
                    return Unit.INSTANCE;
                case 22:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = (MutableState) obj2;
                    Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    if (!((Set) mutableState4.getValue()).isEmpty()) {
                        ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.L$0;
                        Analytics analytics7 = shoppingWebPresenter.analytics;
                        RealBugReportSenderFactory realBugReportSenderFactory2 = shoppingWebPresenter.shoppingWebAnalytics;
                        Set set2 = (Set) mutableState4.getValue();
                        realBugReportSenderFactory2.getClass();
                        set2.getClass();
                        analytics7.track(new BrowserViewInputFields((BrowserOrigin) realBugReportSenderFactory2.sessionManager, (InfoContext) realBugReportSenderFactory2.featureEligibilityDumper, CollectionsKt.joinToString$default(set2, "|", null, null, 0, null, null, 62), (String) realBugReportSenderFactory2.tempStorage, (String) realBugReportSenderFactory2.preferences, (String) realBugReportSenderFactory2.cashDatabase), null);
                    }
                    return Unit.INSTANCE;
                case 23:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = (Boolean) this.L$0;
                    if (bool != null) {
                        ShoppingWebPresenter shoppingWebPresenter2 = (ShoppingWebPresenter) obj2;
                        ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter2.args;
                        if (!bool.booleanValue() && (shoppingWebScreen instanceof ShoppingWebScreen.IncentiveShoppingScreen)) {
                            shoppingWebPresenter2.infoSheet.set(true);
                            shoppingWebPresenter2.navigator.goTo(new ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen(((ShoppingWebScreen.IncentiveShoppingScreen) shoppingWebScreen).screenContext));
                        }
                    }
                    return Unit.INSTANCE;
                case 24:
                    FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = (FillrCartInformationExtraction$FillrCartInformation) this.L$0;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (fillrCartInformationExtraction$FillrCartInformation != null) {
                        ShoppingWebPresenter shoppingWebPresenter3 = (ShoppingWebPresenter) obj2;
                        Analytics analytics8 = shoppingWebPresenter3.analytics;
                        RealBugReportSenderFactory realBugReportSenderFactory3 = shoppingWebPresenter3.shoppingWebAnalytics;
                        realBugReportSenderFactory3.getClass();
                        Integer num2 = fillrCartInformationExtraction$FillrCartInformation.total;
                        String str13 = fillrCartInformationExtraction$FillrCartInformation.currency;
                        String str14 = fillrCartInformationExtraction$FillrCartInformation.pageUrl;
                        ArrayList arrayList = fillrCartInformationExtraction$FillrCartInformation.products;
                        analytics8.track(new BrowserViewOpenCart(num2, str13, str14, CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, new RealSheetState$$ExternalSyntheticLambda0(21), 30), CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, new RealSheetState$$ExternalSyntheticLambda0(22), 30), CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, new RealSheetState$$ExternalSyntheticLambda0(23), 30), CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, new RealSheetState$$ExternalSyntheticLambda0(24), 30), (String) realBugReportSenderFactory3.tempStorage, (String) realBugReportSenderFactory3.preferences, (String) realBugReportSenderFactory3.backStackDumper, (BrowserOrigin) realBugReportSenderFactory3.sessionManager, (InfoContext) realBugReportSenderFactory3.featureEligibilityDumper, (String) realBugReportSenderFactory3.cashDatabase), null);
                    }
                    return Unit.INSTANCE;
                case 25:
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics9 = (Analytics) ((InviteErrorPresenter) this.L$0).analytics;
                    Boolean bool2 = (Boolean) ((MutableState) obj2).getValue();
                    bool2.getClass();
                    analytics9.track(new PersonalProfileViewShoppingAutofillSettings(bool2), null);
                    return Unit.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState5 = (MutableState) obj2;
                    int i2 = ProductSearchView.$r8$clinit;
                    ProductSearchViewState productSearchViewState = (ProductSearchViewState) mutableState5.getValue();
                    ProductSearchViewModel productSearchViewModel = (ProductSearchViewModel) this.L$0;
                    boolean filtersApplied = productSearchViewModel.getFiltersApplied();
                    boolean shouldShowFilters = productSearchViewModel.getShouldShowFilters();
                    if (!(productSearchViewModel instanceof ProductSearchViewModel.Loading)) {
                        if (!(productSearchViewModel instanceof ProductSearchViewModel.Loaded)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (((ProductSearchViewModel.Loaded) productSearchViewModel).error == null) {
                            z = true;
                            mutableState5.setValue(ProductSearchViewState.copy$default(productSearchViewState, null, z, filtersApplied, shouldShowFilters, 3));
                            return Unit.INSTANCE;
                        }
                    }
                    z = false;
                    mutableState5.setValue(ProductSearchViewState.copy$default(productSearchViewState, null, z, filtersApplied, shouldShowFilters, 3));
                    return Unit.INSTANCE;
                case 27:
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PaymentQueries paymentQueries = (PaymentQueries) this.L$0;
                    String str15 = (String) obj2;
                    paymentQueries.getClass();
                    str15.getClass();
                    CashActivityQueries$forToken$2 cashActivityQueries$forToken$2 = CashActivityQueries$forToken$2.INSTANCE;
                    return new RewardQueries.ForIdsQuery(paymentQueries, str15, new CashActivityQueries$$ExternalSyntheticLambda1(paymentQueries, z2 ? 1 : 0)).executeAsOneOrNull();
                case 28:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    StateFlowKt.sendOrThrow$default(((RealChatSurveyService) ((PoolsListPresenter) this.L$0).repository).surveyResponses, (ChatSurveyResponse) obj2);
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    RealSheetState realSheetState = (RealSheetState) this.L$0;
                    UserDismissMode userDismissMode = ((ChatExitPromptSheetViewModel) obj2) instanceof ChatExitPromptSheetViewModel.Survey ? UserDismissMode.None : UserDismissMode.All;
                    realSheetState.getClass();
                    realSheetState.userDismissMode$delegate.setValue(userDismissMode);
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }
}
