package com.squareup.cash.blockers.views;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.VideoCapture;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.core.view.WindowCompat$Api35Impl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.nimbusds.jose.jca.JCAContext;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.CameraErrorResult$Retry;
import com.squareup.cash.blockers.viewmodels.CameraPermissionResult$Negative;
import com.squareup.cash.blockers.viewmodels.FileBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.FileBlockerViewModel;
import com.squareup.cash.clientsync.UtilsKt;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.OverridesSystemBars;
import com.squareup.cash.ui.SecureScreen;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.scannerview.CameraOperator;
import com.squareup.scannerview.Facing;
import com.squareup.scannerview.ManualErrorReason;
import com.squareup.scannerview.OverlayType;
import com.squareup.scannerview.ScanType;
import com.squareup.scannerview.ScannerView;
import com.squareup.scannerview.Step;
import com.squareup.scannerview.StepResult;
import com.squareup.scannerview.StepResult$BitmapResult$Computed;
import com.squareup.scannerview.StepResult$BitmapResult$Lazy;
import com.squareup.util.android.coroutines.ViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class FileBlockerView extends FrameLayout implements OverridesSystemBars, ScannerView.Callback, SecureScreen, DialogResultListener, Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(FileBlockerView.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), new PropertyReference1Impl(FileBlockerView.class, "scannerView", "getScannerView()Lcom/squareup/scannerview/ScannerView;", 0), new PropertyReference1Impl(FileBlockerView.class, "takePhotoButtons", "getTakePhotoButtons()Lcom/squareup/cash/mooncake/components/SplitButtons;", 0), new PropertyReference1Impl(FileBlockerView.class, "reviewButtons", "getReviewButtons()Lcom/squareup/cash/mooncake/components/SplitButtons;", 0)};
    public final Flow activityEvents;
    public final Lazy captureView$delegate;
    public zzjy delayedSpinnerToggleAction;
    public int errorCount;
    public Ui.EventReceiver eventReceiver;
    public final StateFlowImpl grantedStateFlow;
    public final JCAContext helpView;
    public final PausedCompositionImpl loadingHelper;
    public final AndroidPermissionManager permissionManager;
    public final com.squareup.kotterknife.Lazy reviewButtons$delegate;
    public final com.squareup.kotterknife.Lazy scannerView$delegate;
    public Step step;
    public final com.squareup.kotterknife.Lazy takePhotoButtons$delegate;
    public final RealCashVibrator vibrator;

    /* renamed from: com.squareup.cash.blockers.views.FileBlockerView$6, reason: invalid class name */
    public final class AnonymousClass6 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public final /* synthetic */ FileBlockerView this$0;

        /* renamed from: com.squareup.cash.blockers.views.FileBlockerView$6$1, reason: invalid class name */
        public final class AnonymousClass1 extends SuspendLambda implements Function2 {
            public final /* synthetic */ int $r8$classId;
            public int label;
            public final /* synthetic */ FileBlockerView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass1(FileBlockerView fileBlockerView, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.this$0 = fileBlockerView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                int i = this.$r8$classId;
                FileBlockerView fileBlockerView = this.this$0;
                switch (i) {
                    case 0:
                        return new AnonymousClass1(fileBlockerView, continuation, 0);
                    default:
                        return new AnonymousClass1(fileBlockerView, continuation, 1);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                }
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.$r8$classId;
                FileBlockerView fileBlockerView = this.this$0;
                int i2 = 1;
                Continuation continuation = null;
                switch (i) {
                    case 0:
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.label;
                        if (i3 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = new RealTransferManager$addCash$$inlined$map$1(fileBlockerView.activityEvents, fileBlockerView, 4);
                            AnonymousClass6 anonymousClass6 = new AnonymousClass6(fileBlockerView, continuation, i2);
                            this.label = 1;
                            if (FlowKt.collectLatest(realTransferManager$addCash$$inlined$map$1, anonymousClass6, this) == coroutineSingletons) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        break;
                    default:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i4 = this.label;
                        if (i4 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            AndroidPermissionManager$create$1 create = fileBlockerView.permissionManager.create("android.permission.CAMERA");
                            int i5 = 0;
                            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(create.$readonly.granted(), fileBlockerView.grantedStateFlow, new FileBlockerView$6$2$1(3, null, 0), i5);
                            FileBlockerView$6$2$2 fileBlockerView$6$2$2 = new FileBlockerView$6$2$2(fileBlockerView, create, continuation, i5);
                            this.label = 1;
                            if (FlowKt.collectLatest(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, fileBlockerView$6$2$2, this) == coroutineSingletons2) {
                                break;
                            }
                        } else if (i4 != 1) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass6(FileBlockerView fileBlockerView, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = fileBlockerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            FileBlockerView fileBlockerView = this.this$0;
            switch (i) {
                case 0:
                    AnonymousClass6 anonymousClass6 = new AnonymousClass6(fileBlockerView, continuation, 0);
                    anonymousClass6.L$0 = obj;
                    return anonymousClass6;
                default:
                    AnonymousClass6 anonymousClass62 = new AnonymousClass6(fileBlockerView, continuation, 1);
                    anonymousClass62.L$0 = obj;
                    return anonymousClass62;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass6) create((ActivityEvent) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            FileBlockerView fileBlockerView = this.this$0;
            Continuation continuation = null;
            Object obj2 = this.L$0;
            switch (i) {
                case 0:
                    CoroutineScope coroutineScope = (CoroutineScope) obj2;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(fileBlockerView, continuation, 0), 3);
                    JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(fileBlockerView, continuation, 1), 3);
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = ((ActivityEvent) obj2).ordinal();
                    if (ordinal == 2) {
                        KProperty[] kPropertyArr = FileBlockerView.$$delegatedProperties;
                        ScannerView scannerView = fileBlockerView.getScannerView();
                        if (!scannerView.isStarted()) {
                            a$$ExternalSyntheticBUOutline0.m$1("Not started");
                            return null;
                        }
                        scannerView.cameraOperator.start();
                    } else if (ordinal == 3) {
                        KProperty[] kPropertyArr2 = FileBlockerView.$$delegatedProperties;
                        ScannerView scannerView2 = fileBlockerView.getScannerView();
                        if (!scannerView2.isStarted()) {
                            a$$ExternalSyntheticBUOutline0.m$1("Not started");
                            return null;
                        }
                        scannerView2.cameraOperator.stop();
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ManualErrorReason.values().length];
            try {
                ManualErrorReason manualErrorReason = ManualErrorReason.NO_FACE_DETECTED;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FileCategory.values().length];
            try {
                iArr2[FileCategory.DEBIT_CARD_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[FileCategory.DEBIT_CARD_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FileCategory.GOVERNMENT_ISSUED_ID_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FileCategory.GOVERNMENT_ISSUED_ID_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FileBlockerView(ContextThemeWrapper contextThemeWrapper, Flow flow, RealCashVibrator realCashVibrator, AndroidPermissionManager androidPermissionManager) {
        super(contextThemeWrapper, null);
        this.activityEvents = flow;
        this.vibrator = realCashVibrator;
        this.permissionManager = androidPermissionManager;
        com.squareup.kotterknife.Lazy bindView = KotterKnifeKt.bindView(this, R.id.toolbar);
        this.scannerView$delegate = KotterKnifeKt.bindView(this, R.id.scanner);
        this.takePhotoButtons$delegate = KotterKnifeKt.bindView(this, R.id.buttons);
        this.reviewButtons$delegate = KotterKnifeKt.bindView(this, R.id.review_buttons);
        final int i = 0;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new FileBlockerView$$ExternalSyntheticLambda0(this, 0));
        this.captureView$delegate = lazy;
        this.grantedStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        final int i2 = 1;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setBackgroundColor(-16777216);
        View.inflate(contextThemeWrapper, R.layout.blockers_file_blocker_view, this);
        this.loadingHelper = new PausedCompositionImpl(this, null, null, null, 62);
        KProperty[] kPropertyArr = $$delegatedProperties;
        ((Toolbar) bindView.getValue(this, kPropertyArr[0])).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.blockers.views.FileBlockerView$$ExternalSyntheticLambda1
            public final /* synthetic */ FileBlockerView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                FileBlockerView fileBlockerView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = fileBlockerView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FileBlockerViewEvent.NavigationAction.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        ScannerView scannerView = fileBlockerView.getScannerView();
                        boolean z = fileBlockerView.errorCount >= 2;
                        if (!scannerView.isStarted()) {
                            a$$ExternalSyntheticBUOutline0.m$1("Not started");
                            return;
                        }
                        if (scannerView.isCaptured.get()) {
                            return;
                        }
                        ScanType scanType = ((Step) scannerView.steps.get(scannerView.currentStep)).scanType;
                        Timber.Forest.i("Start capturing, current step is " + scanType, new Object[0]);
                        ScanType scanType2 = ScanType.MANUAL;
                        if (scanType != scanType2 && scanType != ScanType.MANUAL_FACE) {
                            Handlers$$ExternalSyntheticBUOutline0.m("Expected ", scanType2, ", got ", scanType);
                            return;
                        }
                        CameraOperator cameraOperator = scannerView.cameraOperator;
                        Step step = cameraOperator.step;
                        if ((step != null ? step.scanType : null) != scanType2) {
                            ScanType scanType3 = step != null ? step.scanType : null;
                            ScanType scanType4 = ScanType.MANUAL_FACE;
                            if (scanType3 != scanType4) {
                                throw new IllegalStateException(("Expected " + scanType2 + " or " + scanType4 + ", got " + (step != null ? step.scanType : null)).toString());
                            }
                        }
                        cameraOperator.manualCaptureState = z ? CameraOperator.ManualCaptureState.FORCE : CameraOperator.ManualCaptureState.YES;
                        return;
                }
            }
        });
        SplitButtons takePhotoButtons = getTakePhotoButtons();
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(contextThemeWrapper);
        appCompatImageButton.setImageResource(R.drawable.nav_help);
        appCompatImageButton.setColorFilter(ThemeHelpersKt.findThemeInfo(contextThemeWrapper).colorPalette.icon);
        appCompatImageButton.setBackground(RipplesKt.createBorderlessRippleDrawable(appCompatImageButton));
        appCompatImageButton.setContentDescription(contextThemeWrapper.getString(R.string.blockers_help));
        appCompatImageButton.setId(R.id.help_icon);
        Toolbar toolbar = (Toolbar) bindView.getValue(this, kPropertyArr[0]);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams();
        layoutParams.gravity = 8388629;
        toolbar.addView(appCompatImageButton, layoutParams);
        this.helpView = new JCAContext(takePhotoButtons, appCompatImageButton);
        appCompatImageButton.setOnClickListener(new Q0$$ExternalSyntheticLambda0(new FileBlockerView$$ExternalSyntheticLambda0(this, 1), 24));
        getTakePhotoButtons().updateVisibleButtons(SplitButtons.Showing.None);
        MooncakePillButton mooncakePillButton = getTakePhotoButtons().primary;
        mooncakePillButton.getClass();
        mooncakePillButton.setContentDescription(mooncakePillButton.getContext().getResources().getString(R.string.selfie_capture_description));
        mooncakePillButton.setText(R.string.selfie_take_photo);
        getTakePhotoButtons().secondary.setText(R.string.license_selfie_help);
        getReviewButtons().setVisibility(8);
        getReviewButtons().primary.setText(R.string.sv_preview_use_photo);
        getReviewButtons().secondary.setText(R.string.sv_preview_retake);
        ScannerView scannerView = getScannerView();
        SplitButtons reviewButtons = getReviewButtons();
        MooncakePillButton mooncakePillButton2 = getReviewButtons().secondary;
        MooncakePillButton mooncakePillButton3 = getReviewButtons().primary;
        scannerView.getClass();
        reviewButtons.getClass();
        mooncakePillButton2.getClass();
        mooncakePillButton3.getClass();
        scannerView.previewButtonsLayout = reviewButtons;
        scannerView.retakeButton = mooncakePillButton2;
        scannerView.usePhotoButton = mooncakePillButton3;
        getScannerView().setCallback(this);
        ((MooncakePillButton) lazy.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.blockers.views.FileBlockerView$$ExternalSyntheticLambda1
            public final /* synthetic */ FileBlockerView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                FileBlockerView fileBlockerView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = fileBlockerView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FileBlockerViewEvent.NavigationAction.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        ScannerView scannerView2 = fileBlockerView.getScannerView();
                        boolean z = fileBlockerView.errorCount >= 2;
                        if (!scannerView2.isStarted()) {
                            a$$ExternalSyntheticBUOutline0.m$1("Not started");
                            return;
                        }
                        if (scannerView2.isCaptured.get()) {
                            return;
                        }
                        ScanType scanType = ((Step) scannerView2.steps.get(scannerView2.currentStep)).scanType;
                        Timber.Forest.i("Start capturing, current step is " + scanType, new Object[0]);
                        ScanType scanType2 = ScanType.MANUAL;
                        if (scanType != scanType2 && scanType != ScanType.MANUAL_FACE) {
                            Handlers$$ExternalSyntheticBUOutline0.m("Expected ", scanType2, ", got ", scanType);
                            return;
                        }
                        CameraOperator cameraOperator = scannerView2.cameraOperator;
                        Step step = cameraOperator.step;
                        if ((step != null ? step.scanType : null) != scanType2) {
                            ScanType scanType3 = step != null ? step.scanType : null;
                            ScanType scanType4 = ScanType.MANUAL_FACE;
                            if (scanType3 != scanType4) {
                                throw new IllegalStateException(("Expected " + scanType2 + " or " + scanType4 + ", got " + (step != null ? step.scanType : null)).toString());
                            }
                        }
                        cameraOperator.manualCaptureState = z ? CameraOperator.ManualCaptureState.FORCE : CameraOperator.ManualCaptureState.YES;
                        return;
                }
            }
        });
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new AnonymousClass6(this, null, i));
    }

    public final SplitButtons getReviewButtons() {
        return (SplitButtons) this.reviewButtons$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final ScannerView getScannerView() {
        return (ScannerView) this.scannerView$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final SplitButtons getTakePhotoButtons() {
        return (SplitButtons) this.takePhotoButtons$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.squareup.cash.ui.OverridesSystemBars
    public final boolean isLightSystemBars() {
        return false;
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public final void onComplete(ArrayList arrayList) {
        Lazy lazy;
        arrayList.getClass();
        UtilsKt utilsKt = ((StepResult) CollectionsKt.first((List) arrayList)).bitmapResult;
        if (utilsKt instanceof StepResult$BitmapResult$Lazy) {
            lazy = ((StepResult$BitmapResult$Lazy) utilsKt).bitmap;
        } else {
            if (!(utilsKt instanceof StepResult$BitmapResult$Computed)) {
                if (utilsKt == null) {
                    a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Not expecting bitmapResult in ", " to be null!", CollectionsKt.first((List) arrayList)));
                    return;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            lazy = LazyKt.lazy(new ErrorView$$ExternalSyntheticLambda0(utilsKt, 26));
        }
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(new FileBlockerViewEvent.CaptureCompleted(lazy));
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getScannerView().isStarted()) {
            getScannerView().stop();
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
        boolean z = screen instanceof BlockersScreens.CameraError;
        FileBlockerViewEvent.NavigationAction.Exit exit = FileBlockerViewEvent.NavigationAction.Exit.INSTANCE;
        if (z || (screen instanceof BlockersScreens.CameraPermissionScreen)) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver != null) {
                eventReceiver.sendEvent(exit);
                return;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
        if (!(screen instanceof BlockersScreens.FileBlockerExplanation)) {
            if (screen instanceof FailureMessageBlockerScreen) {
                Ui.EventReceiver eventReceiver2 = this.eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(FileBlockerViewEvent.RestartCapture.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            }
            return;
        }
        BlockerDescriptor blockerDescriptor = (BlockerDescriptor) CollectionsKt.firstOrNull(((BlockersScreens.FileBlockerExplanation) screen).blockersData.getNextBlockers());
        boolean areEqual = Intrinsics.areEqual(blockerDescriptor != null ? blockerDescriptor.skippable : null, Boolean.TRUE);
        Ui.EventReceiver eventReceiver3 = this.eventReceiver;
        if (areEqual) {
            if (eventReceiver3 != null) {
                eventReceiver3.sendEvent(FileBlockerViewEvent.NavigationAction.FileBlockerExplanationCanceled.INSTANCE);
                return;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
        if (eventReceiver3 != null) {
            eventReceiver3.sendEvent(exit);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        if (obj instanceof HelpItem) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            HelpItem helpItem = (HelpItem) obj;
            BlockerAction blockerAction = helpItem.blocker_action;
            eventReceiver.sendEvent(blockerAction != null ? new FileBlockerViewEvent.BlockerActionClick(blockerAction) : new FileBlockerViewEvent.HelpItemClick(helpItem));
            return;
        }
        if (screen instanceof BlockersScreens.CameraError) {
            if (!Intrinsics.areEqual(obj, CameraErrorResult$Retry.INSTANCE)) {
                onDialogCanceled(screen);
                return;
            }
            ScannerView scannerView = getScannerView();
            Step step = this.step;
            if (step != null) {
                scannerView.start(step);
                return;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("step");
                throw null;
            }
        }
        if (screen instanceof BlockersScreens.Error) {
            Ui.EventReceiver eventReceiver2 = this.eventReceiver;
            if (eventReceiver2 != null) {
                eventReceiver2.sendEvent(new FileBlockerViewEvent.NavigationAction.BlockerError(screen));
                return;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
        if (screen instanceof BlockersScreens.FileBlockerExplanation) {
            if (obj != AlertDialogResult.POSITIVE) {
                onDialogCanceled(screen);
                return;
            }
            Boolean bool = Boolean.TRUE;
            StateFlowImpl stateFlowImpl = this.grantedStateFlow;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bool);
            return;
        }
        if (screen instanceof BlockersScreens.CameraPermissionScreen) {
            if (Intrinsics.areEqual(obj, CameraPermissionResult$Negative.INSTANCE)) {
                onDialogCanceled(screen);
            }
        } else if (screen instanceof FailureMessageBlockerScreen) {
            onDialogCanceled(screen);
        }
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public final void onError() {
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(FileBlockerViewEvent.NavigationAction.CameraError.INSTANCE);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public final void onManualError(ManualErrorReason manualErrorReason) {
        manualErrorReason.getClass();
        this.errorCount++;
        if (WhenMappings.$EnumSwitchMapping$0[manualErrorReason.ordinal()] != 1) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) manualErrorReason, "Unexpected reason: ");
        } else {
            this.vibrator.error();
            post(new KnotView$$ExternalSyntheticLambda1(this, 22));
        }
    }

    @Override // com.squareup.scannerview.ScannerView.Callback
    public final void onPreviewVisibilityChanged(boolean z, Step step) {
        step.getClass();
        boolean showingPrimary = getTakePhotoButtons().getShowingPrimary();
        ScanType scanType = step.scanType;
        if (scanType == ScanType.MANUAL || scanType == ScanType.MANUAL_FACE) {
            showingPrimary = !z;
        }
        getTakePhotoButtons().updateVisibleButtons(showingPrimary, getTakePhotoButtons().getShowingSecondary());
        SplitButtons splitButtons = (SplitButtons) this.helpView.provider;
        splitButtons.updateVisibleButtons(splitButtons.getShowingPrimary(), !z);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(FileBlockerViewModel fileBlockerViewModel) {
        Step step;
        fileBlockerViewModel.getClass();
        if (!getScannerView().isStarted() && fileBlockerViewModel.hasCameraPermission) {
            FileCategory fileCategory = fileBlockerViewModel.category;
            String str = fileBlockerViewModel.title;
            String str2 = fileBlockerViewModel.previewTitle;
            int i = WhenMappings.$EnumSwitchMapping$1[fileCategory.ordinal()];
            boolean z = true;
            if (i == 1) {
                step = new Step(str, str2, ScanType.MANUAL, OverlayType.CARD, str2 != null);
            } else if (i == 2) {
                step = new Step(str, str2, ScanType.MANUAL, OverlayType.CARD, str2 != null);
            } else if (i == 3) {
                step = new Step(str, str2, ScanType.MANUAL_FACE, OverlayType.SQUARE, str2 != null);
            } else {
                if (i != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Category ", fileCategory, " not supported");
                    return;
                }
                step = new Step(str, str2, ScanType.MANUAL, OverlayType.SQUARE, str2 != null);
            }
            this.step = step;
            getScannerView().setPreferredFacing(Facing.BACK);
            ScannerView scannerView = getScannerView();
            Step step2 = this.step;
            if (step2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("step");
                throw null;
            }
            scannerView.start(step2);
            boolean showingPrimary = getTakePhotoButtons().getShowingPrimary();
            Step step3 = this.step;
            if (step3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("step");
                throw null;
            }
            ScanType scanType = step3.scanType;
            if (scanType != ScanType.MANUAL_FACE && scanType != ScanType.MANUAL) {
                z = showingPrimary;
            }
            getTakePhotoButtons().updateVisibleButtons(z, getTakePhotoButtons().getShowingSecondary());
        }
        FileBlockerViewModel.LoadingState loadingState = fileBlockerViewModel.loadingState;
        boolean z2 = loadingState.isLoading;
        boolean z3 = loadingState.delayForSuccessAnimation;
        ((MooncakePillButton) this.captureView$delegate.getValue()).setEnabled(!z2);
        Runnable runnable = this.delayedSpinnerToggleAction;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        long j = (z2 && z3) ? 1500L : 0L;
        zzjy zzjyVar = new zzjy(this, z2, 4);
        postDelayed(zzjyVar, j);
        this.delayedSpinnerToggleAction = zzjyVar;
        if (fileBlockerViewModel.stopCameraPreview && getScannerView().isStarted()) {
            getScannerView().stop();
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final InstanceFactory activityEvents;
        public final Provider permissionManager;
        public final Provider vibrator;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, Provider provider, Object obj) {
            this.activityEvents = instanceFactory;
            this.vibrator = provider;
            this.permissionManager = (Provider) obj;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, InstanceFactory instanceFactory) {
            this.vibrator = provider;
            this.permissionManager = provider2;
            this.activityEvents = instanceFactory;
        }
    }
}
