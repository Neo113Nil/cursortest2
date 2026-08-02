package com.google.android.material.button;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderConfigurer;
import com.google.android.material.textfield.IconHelper;
import com.google.android.material.textfield.StartCompoundLayout;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.common.base.CharMatcher$Is;
import com.google.common.base.Splitter;
import com.google.firebase.messaging.ByteStreams;
import com.google.firebase.messaging.WithinAppServiceConnection;
import com.knotapi.knot.interfaces.CookieBuilder;
import com.knotapi.knot.models.MerchantWebViewData;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.utilities.ScreenshotHelper;
import com.knotapi.knot.utilities.WebViewDataProcessor;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;
import com.knotapi.knot.webview.merchants.GoogleMassSwitcherClient;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.internal.CameraFrame;
import com.miteksystems.misnap.core.internal.ContextHelper;
import com.plaid.internal.P7;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.advertising.views.FullscreenAdView;
import com.squareup.cash.family.familyhub.presenters.DependentDetailPresenter$models$1$1;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.GLThread$launch$1;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.tax.primitives.Id;
import com.squareup.cash.tax.primitives.MenuItemStyle;
import com.squareup.cash.tax.primitives.TaxMenuItem;
import com.squareup.cash.tax.viewmodels.TaxBridgeCommand;
import com.squareup.cash.tax.viewmodels.TaxWebAppBridgeEvent;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewEvent;
import com.squareup.cash.tax.views.TaxWebAppView;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.TimerWorker$run$1;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeViewModel;
import com.stripe.android.challenge.confirmation.WebViewError;
import com.stripe.android.challenge.confirmation.analytics.IntentConfirmationChallengeAnalyticsEvent;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient$OnHtmlSubmitListener;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdSubmittingRunner;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidSubmittingScreenBinding;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;

/* loaded from: classes4.dex */
public final /* synthetic */ class MaterialButton$$ExternalSyntheticLambda3 implements SynchronizationGuard$CriticalSection, CheckableImageButton.OnFocusableChangedListener, StaticLayoutBuilderConfigurer, ClockFaceView.OnEnterKeyPressedListener, Splitter.Strategy, OnCompleteListener, WebViewDataProcessor.DataProcessingCallback, CookieBuilder, ImageAnalysis.Analyzer, OnApplyWindowInsetsListener, DataSource.Factory, SwipeRefreshLayout.OnRefreshListener, TimelineView.OnItemClickListener, GLLauncher, ActivityItemEventDecorator, SimpleLottieValueCallback, Toolbar.OnMenuItemClickListener, ThreeDS2WebViewClient$OnHtmlSubmitListener, OnSuccessListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MaterialButton$$ExternalSyntheticLambda3(GovernmentIdSubmittingRunner governmentIdSubmittingRunner, Pi2GovernmentidSubmittingScreenBinding pi2GovernmentidSubmittingScreenBinding) {
        this.$r8$classId = 29;
        this.f$0 = pi2GovernmentidSubmittingScreenBinding;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(SettableImageProxy settableImageProxy) {
        CameraWrapper cameraWrapper = (CameraWrapper) this.f$0;
        if (settableImageProxy.mImage.getImage() == null) {
            settableImageProxy.close();
            return;
        }
        if (cameraWrapper.m || Intrinsics.areEqual(cameraWrapper.N.getValue(), Boolean.TRUE)) {
            settableImageProxy.close();
            return;
        }
        if (!cameraWrapper.p) {
            cameraWrapper.a(FrameProducer.Event.InitializationError.InvalidImageFormat.INSTANCE);
            settableImageProxy.close();
            return;
        }
        CameraFrame a = cameraWrapper.c.a(settableImageProxy);
        LinkedHashMap linkedHashMap = cameraWrapper.j;
        a.getClass();
        int i = cameraWrapper.k;
        if (i >= 3) {
            try {
                Result.Companion companion = Result.Companion;
                byte[] bArr = new byte[256];
                byte[] imageBytes = a.getImageBytes();
                int i2 = cameraWrapper.l;
                ArraysKt___ArraysJvmKt.copyInto$default(ArraysKt___ArraysJvmKt.copyOfRange(imageBytes, i2, i2 + 256), bArr, 0, 0, 0, 14);
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
                digest.getClass();
                String joinToString$default = ArraysKt___ArraysKt.joinToString$default(digest, "", CameraWrapper.f.a, 30);
                Integer num = (Integer) linkedHashMap.get(joinToString$default);
                if (num == null || ((Integer) linkedHashMap.put(joinToString$default, Integer.valueOf(num.intValue() + 1))) == null) {
                }
                if (!linkedHashMap.isEmpty()) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Number) ((Map.Entry) it.next()).getValue()).intValue() >= 3) {
                            Object obj = ContextHelper.a;
                            ContextHelper.add(Boolean.TRUE, "1");
                            break;
                        }
                    }
                }
                Result.Companion companion2 = Result.Companion;
            } catch (Throwable unused) {
                Result.Companion companion3 = Result.Companion;
            }
        } else {
            cameraWrapper.k = i + 1;
        }
        MutableLiveData mutableLiveData = cameraWrapper.L;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(a);
        } else {
            mutableLiveData.postValue(a);
        }
    }

    @Override // com.knotapi.knot.interfaces.CookieBuilder
    public Cookie buildCookie(String str, String str2) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 10:
                return ((KnotViewClient) obj).buildCookie(str, str2);
            default:
                return ((GoogleMassSwitcherClient) obj).buildCookie(str, str2);
        }
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public DataSource createDataSource() {
        return new DefaultDataSource(((FullscreenAdView) this.f$0).getContext(), new DefaultHttpDataSource("cash-app-fullscreen-ad", 8000, 8000, new Recorder.AnonymousClass4(28)));
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) this.f$0;
        activityItemEventHandler.getClass();
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem), new DependentDetailPresenter$models$1$1(savingsScreenPresenter, null, 1), 3);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        n nVar = (n) this.f$0;
        Iterator it = ((Iterable) ((SQLiteEventStore) nVar.b).inTransaction(new TransportImpl$$ExternalSyntheticLambda0(17))).iterator();
        while (it.hasNext()) {
            ((SVG) nVar.c).schedule((AutoValue_TransportContext) it.next(), 1, false);
        }
        return null;
    }

    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
    public Object getValue(LottieFrameInfo lottieFrameInfo) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 21:
                int i2 = MooncakeProgress.$r8$clinit;
                Context context = ((MooncakeProgress) obj).getContext();
                context.getClass();
                return new PorterDuffColorFilter(ColorKt.m694toArgb8_81llA(ThemeHelpersKt.findThemeInfo(context).arcadeColors.semantic.icon.prominent), PorterDuff.Mode.SRC_IN);
            default:
                Context context2 = ((Pi2GovernmentidSubmittingScreenBinding) obj).rootView.getContext();
                context2.getClass();
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                return Integer.valueOf(typedValue.data);
        }
    }

    public void invoke(WebViewError webViewError) {
        IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = (IntentConfirmationChallengeActivity) this.f$0;
        int i = IntentConfirmationChallengeActivity.$r8$clinit;
        IntentConfirmationChallengeViewModel viewModel = intentConfirmationChallengeActivity.getViewModel();
        TextSetter textSetter = viewModel.analyticsEventReporter;
        textSetter.fireEvent(new IntentConfirmationChallengeAnalyticsEvent.Error(TextSetter.m3979durationInMsBwNAW2A(((DefaultDurationProvider) ((DurationProvider) textSetter.scannerText)).m4011endLV8wdWc(DurationProvider.Key.IntentConfirmationChallenge)), webViewError.webViewErrorType, String.valueOf(webViewError.errorCode), viewModel.args.captchaVendorName, false));
        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new TimerWorker$run$1(viewModel, webViewError, null, 25), 3);
    }

    @Override // com.google.common.base.Splitter.Strategy
    public Iterator iterator(Splitter splitter, CharSequence charSequence) {
        return new Splitter.AnonymousClass1(splitter, charSequence, (CharMatcher$Is) this.f$0, 0);
    }

    @Override // com.squareup.cash.graphics.swampgl.GLLauncher
    public Job launch(Function1 function1) {
        return JobKt.launch$default((CoroutineScope) this.f$0, null, null, new GLThread$launch$1(function1, null, 5), 3);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 13:
                return P7.a((P7) obj, view, windowInsetsCompat);
            default:
                int i2 = PaymentAuthWebViewActivity.$r8$clinit;
                view.getClass();
                Insets insets = windowInsetsCompat.mImpl.getInsets(519);
                insets.getClass();
                AppBarLayout appBarLayout = ((PaymentAuthWebViewActivity) obj).getViewBinding().appBar;
                appBarLayout.setPaddingRelative(appBarLayout.getPaddingStart(), insets.top, appBarLayout.getPaddingEnd(), appBarLayout.getPaddingBottom());
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), insets.bottom);
                return WindowInsetsCompat.CONSUMED;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 6:
                ByteStreams.completeWakefulIntent((Intent) obj);
                break;
            case 7:
                ((WithinAppServiceConnection.BindRequest) obj).taskCompletionSource.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // com.knotapi.knot.utilities.WebViewDataProcessor.DataProcessingCallback
    public void onDataProcessed(MerchantWebViewData merchantWebViewData) {
        ScreenshotHelper.lambda$startScreenshotFlow$0((KnotView) this.f$0, merchantWebViewData);
    }

    @Override // com.google.android.material.internal.CheckableImageButton.OnFocusableChangedListener
    public void onFocusableChanged() {
        CheckableImageButton checkableImageButton = ((StartCompoundLayout) this.f$0).startIconView;
        IconHelper.updateIconTooltip(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        TaxWebAppView taxWebAppView = (TaxWebAppView) this.f$0;
        TaxWebAppBridge taxWebAppBridge = taxWebAppView.taxWebAppBridge;
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.tax_view_menu_item_overflow) {
            if (valueOf != null && valueOf.intValue() == R.id.tax_view_menu_item_help) {
                taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.HelpButtonTapCommand.INSTANCE);
                return true;
            }
            if (valueOf == null || valueOf.intValue() != R.id.tax_view_menu_item_close) {
                return false;
            }
            taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.CloseButtonTapCommand.INSTANCE);
            return true;
        }
        if (taxWebAppBridge.isWebBridgeLoaded) {
            taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.MenuButtonTapCommand.INSTANCE);
            return true;
        }
        String string2 = taxWebAppView.getResources().getString(R.string.tax_view_exit_cat);
        string2.getClass();
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new TaxMenuItem(Id.ExitCashAppTaxes.INSTANCE, string2, MenuItemStyle.Destructive));
        String string3 = taxWebAppView.getResources().getString(R.string.tax_view_close);
        string3.getClass();
        taxWebAppView.sendEvent(new TaxWebAppViewEvent.WebAppBridgeEvent(new TaxWebAppBridgeEvent.OpenTaxMenuSheet(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(new TaxMenuItem(Id.Close.INSTANCE, string3, MenuItemStyle.Close)), (Collection) listOf))));
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        ((PageFetcher$generateNewPagingSource$3) this.f$0).invoke();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((HCaptcha$$ExternalSyntheticLambda2) this.f$0).invoke(obj);
    }

    public /* synthetic */ MaterialButton$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
