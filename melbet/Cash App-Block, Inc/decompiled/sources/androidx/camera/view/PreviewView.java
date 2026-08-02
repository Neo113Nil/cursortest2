package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Region;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature;
import androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.video.AutoValue_FileOutputOptions_FileOutputOptionsInternal;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.camera.view.ScreenFlashView;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.Animations;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.animation.core.FloatSpringSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.AnimationResult;
import androidx.compose.foundation.gestures.snapping.ApproachAnimation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.DefaultIntrinsicMeasurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntRect;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.MenuProvider;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.MutableLiveData;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.transition.Transition;
import app.cash.trifle.Certificate;
import app.cash.trifle.SignedData;
import app.cash.trifle.TrifleAlgorithmIdentifier;
import app.cash.trifle.TrifleErrors;
import app.cash.trifle.providers.jca.JCAContentVerifierProvider;
import app.cash.trifle.signers.Buffer;
import app.cash.trifle.validators.CertChainValidator$X509CertChainValidator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper$$ExternalSyntheticLambda1;
import com.miteksystems.misnap.controller.MiSnapController;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.operator.ContentVerifier;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class PreviewView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final AtomicReference mActiveStreamStateObserver;
    public CameraInfoInternal mCameraInfoInternal;
    public final DisplayRotationListener mDisplayRotationListener;
    public PreviewViewImplementation mImplementation;
    public ImplementationMode mImplementationMode;
    public Executor mOnFrameUpdateListenerExecutor;
    public final PreviewView$$ExternalSyntheticLambda0 mOnLayoutChangeListener;
    public final MutableLiveData mPreviewStreamStateLiveData;
    public final PreviewTransformation mPreviewTransform;
    public final PreviewViewMeteringPointFactory mPreviewViewMeteringPointFactory;
    public final ScreenFlashView mScreenFlashView;
    public final AnonymousClass1 mSurfaceProvider;
    public boolean mUseDisplayRotation;

    public final class DisplayRotationListener implements DisplayManager.DisplayListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ DisplayRotationListener(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void onDisplayAdded$androidx$camera$view$PreviewView$DisplayRotationListener(int i) {
        }

        private final void onDisplayAdded$com$miteksystems$misnap$camera$frameproducers$CameraWrapper$c(int i) {
        }

        private final void onDisplayAdded$com$miteksystems$misnap$controller$MiSnapController$displayListener$1(int i) {
        }

        private final void onDisplayRemoved$androidx$camera$view$PreviewView$DisplayRotationListener(int i) {
        }

        private final void onDisplayRemoved$com$miteksystems$misnap$camera$frameproducers$CameraWrapper$c(int i) {
        }

        private final void onDisplayRemoved$com$miteksystems$misnap$controller$MiSnapController$displayListener$1(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return;
                case 1:
                    DisplayInfoManager displayInfoManager = (DisplayInfoManager) this.this$0;
                    synchronized (displayInfoManager.lock) {
                        displayInfoManager.displays = null;
                        displayInfoManager.previewSize = null;
                    }
                    return;
                case 2:
                default:
                    return;
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            switch (this.$r8$classId) {
                case 0:
                    PreviewView previewView = (PreviewView) this.this$0;
                    Display defaultDisplay = previewView.getDefaultDisplay();
                    if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                        return;
                    }
                    previewView.redrawPreview();
                    return;
                case 1:
                    DisplayInfoManager displayInfoManager = (DisplayInfoManager) this.this$0;
                    synchronized (displayInfoManager.lock) {
                        displayInfoManager.displays = null;
                        displayInfoManager.previewSize = null;
                    }
                    return;
                case 2:
                    CameraWrapper cameraWrapper = (CameraWrapper) this.this$0;
                    Handler handler = cameraWrapper.t;
                    if (((Context) cameraWrapper.e.get()) != null) {
                        CameraWrapper$$ExternalSyntheticLambda1 cameraWrapper$$ExternalSyntheticLambda1 = cameraWrapper.u;
                        handler.removeCallbacksAndMessages(cameraWrapper$$ExternalSyntheticLambda1);
                        handler.postDelayed(cameraWrapper$$ExternalSyntheticLambda1, 100L);
                        return;
                    }
                    return;
                default:
                    MiSnapController miSnapController = (MiSnapController) this.this$0;
                    Context context = (Context) miSnapController.x.get();
                    if (context != null) {
                        miSnapController.h = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context);
                        return;
                    }
                    return;
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return;
                case 1:
                    DisplayInfoManager displayInfoManager = (DisplayInfoManager) this.this$0;
                    synchronized (displayInfoManager.lock) {
                        displayInfoManager.displays = null;
                        displayInfoManager.previewSize = null;
                    }
                    return;
                case 2:
                default:
                    return;
            }
        }
    }

    public enum ImplementationMode {
        PERFORMANCE(0),
        /* JADX INFO: Fake field, exist only in values array */
        COMPATIBLE(1);

        public final int mId;

        ImplementationMode(int i) {
            this.mId = i;
        }
    }

    public interface OnFrameUpdateListener {
    }

    public enum ScaleType {
        /* JADX INFO: Fake field, exist only in values array */
        FILL_START(0),
        FILL_CENTER(1),
        /* JADX INFO: Fake field, exist only in values array */
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        public final int mId;

        ScaleType(int i) {
            this.mId = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class StreamState {
        public static final /* synthetic */ StreamState[] $VALUES;
        public static final StreamState IDLE;
        public static final StreamState STREAMING;

        static {
            StreamState streamState = new StreamState("IDLE", 0);
            IDLE = streamState;
            StreamState streamState2 = new StreamState("STREAMING", 1);
            STREAMING = streamState2;
            $VALUES = new StreamState[]{streamState, streamState2};
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mImplementationMode = ImplementationMode.PERFORMANCE;
        PreviewTransformation previewTransformation = new PreviewTransformation();
        previewTransformation.mScaleType = ScaleType.FILL_CENTER;
        this.mPreviewTransform = previewTransformation;
        this.mUseDisplayRotation = true;
        this.mPreviewStreamStateLiveData = new MutableLiveData(StreamState.IDLE);
        this.mActiveStreamStateObserver = new AtomicReference();
        this.mPreviewViewMeteringPointFactory = new PreviewViewMeteringPointFactory(previewTransformation);
        this.mDisplayRotationListener = new DisplayRotationListener(this, 0 == true ? 1 : 0);
        this.mOnLayoutChangeListener = new PreviewView$$ExternalSyntheticLambda0(this, 0 == true ? 1 : 0);
        this.mSurfaceProvider = new AnonymousClass1(this, 0 == true ? 1 : 0);
        Threads.checkMainThread();
        Resources.Theme theme = context.getTheme();
        int[] iArr = R$styleable.PreviewView;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
        try {
            int integer = obtainStyledAttributes.getInteger(1, previewTransformation.mScaleType.mId);
            for (ScaleType scaleType : ScaleType.values()) {
                if (scaleType.mId == integer) {
                    setScaleType(scaleType);
                    int integer2 = obtainStyledAttributes.getInteger(0, 0);
                    for (ImplementationMode implementationMode : ImplementationMode.values()) {
                        if (implementationMode.mId == integer2) {
                            setImplementationMode(implementationMode);
                            obtainStyledAttributes.recycle();
                            new HurlStack(context, new ZslControlImpl$$ExternalSyntheticLambda1(28));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            ScreenFlashView screenFlashView = new ScreenFlashView(context);
                            this.mScreenFlashView = screenFlashView;
                            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean shouldUseTextureView(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean equals = surfaceRequest.mCamera.getCameraInfoInternal().getImplementationType().equals("androidx.camera.camera2.legacy");
        boolean z = (DeviceQuirks.sQuirks.get(SurfaceViewStretchedQuirk.class) == null && DeviceQuirks.sQuirks.get(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!equals && !z) {
            int ordinal = implementationMode.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) implementationMode, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    public final void attachToControllerIfReady() {
        Threads.checkMainThread();
        Threads.checkMainThread();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return;
        }
        defaultDisplay.getRotation();
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        new Rational(getWidth(), getHeight());
        Threads.checkMainThread();
        PreviewTransformation previewTransformation = this.mPreviewTransform;
        int ordinal = previewTransformation.mScaleType.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            getLayoutDirection();
        } else {
            Threads.checkMainThread();
            a$$ExternalSyntheticBUOutline0.m$2(previewTransformation.mScaleType, "Unexpected scale type: ");
        }
    }

    public final Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Context context = getContext();
        Display display = (context != null ? (DisplayManager) context.getSystemService("display") : null).getDisplay(0);
        return display != null ? display : getDisplay();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        DisplayManager displayManager = context == null ? null : (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.mDisplayRotationListener, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onAttachedToWindow();
        }
        attachToControllerIfReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onDetachedFromWindow();
        }
        Context context = getContext();
        DisplayManager displayManager = context == null ? null : (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.mDisplayRotationListener);
    }

    public final void redrawPreview() {
        Rect rect;
        Display defaultDisplay;
        CameraInfoInternal cameraInfoInternal;
        Threads.checkMainThread();
        if (this.mImplementation != null) {
            if (this.mUseDisplayRotation && (defaultDisplay = getDefaultDisplay()) != null && (cameraInfoInternal = this.mCameraInfoInternal) != null) {
                PreviewTransformation previewTransformation = this.mPreviewTransform;
                int sensorRotationDegrees = cameraInfoInternal.getSensorRotationDegrees(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (previewTransformation.mHasCameraTransform) {
                    previewTransformation.mPreviewRotationDegrees = sensorRotationDegrees;
                    previewTransformation.mTargetRotation = rotation;
                }
            }
            this.mImplementation.redrawPreview();
        }
        PreviewViewMeteringPointFactory previewViewMeteringPointFactory = this.mPreviewViewMeteringPointFactory;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        previewViewMeteringPointFactory.getClass();
        Threads.checkMainThread();
        synchronized (previewViewMeteringPointFactory) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = previewViewMeteringPointFactory.mSensorRect) != null) {
                    previewViewMeteringPointFactory.mPreviewTransformation.getPreviewViewToNormalizedSensorMatrix(size, layoutDirection, rect);
                }
            } finally {
            }
        }
    }

    public void setController(CameraController cameraController) {
        Threads.checkMainThread();
        attachToControllerIfReady();
        ScreenFlashView.AnonymousClass1 anonymousClass1 = this.mScreenFlashView.mScreenFlash;
        StringUtilsKt.d("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public void setFrameUpdateListener(Executor executor, OnFrameUpdateListener onFrameUpdateListener) {
        if (this.mImplementationMode == ImplementationMode.PERFORMANCE) {
            a$$ExternalSyntheticBUOutline0.m$3("PERFORMANCE mode doesn't support frame update listener");
            return;
        }
        this.mOnFrameUpdateListenerExecutor = executor;
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.setFrameUpdateListener(executor);
        }
    }

    public void setImplementationMode(ImplementationMode implementationMode) {
        Threads.checkMainThread();
        this.mImplementationMode = implementationMode;
    }

    public void setScaleType(ScaleType scaleType) {
        Threads.checkMainThread();
        this.mPreviewTransform.mScaleType = scaleType;
        redrawPreview();
        attachToControllerIfReady();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.mScreenFlashView.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        Threads.checkMainThread();
        this.mScreenFlashView.setScreenFlashWindow(window);
        StringUtilsKt.d("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    /* renamed from: androidx.camera.view.PreviewView$1, reason: invalid class name */
    public final class AnonymousClass1 implements Toolbar.OnMenuItemClickListener, MenuBuilder.Callback, FutureCallback, CallbackToFutureAdapter$Resolver, Preview.SurfaceProvider, Animations, ApproachAnimation, OnApplyWindowInsetsListener {
        public Object this$0;

        public AnonymousClass1(int i) {
            switch (i) {
                case 5:
                    this.this$0 = new MutexImpl();
                    break;
                case 9:
                    this.this$0 = (LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.sQuirks.get(LargeJpegImageQuirk.class);
                    break;
                case 17:
                    this.this$0 = Updater.mutableStateOf$default(null);
                    break;
                case 18:
                    this.this$0 = new Region();
                    break;
                case 24:
                    this.this$0 = new CopyOnWriteArrayList();
                    break;
                default:
                    Quirks quirks = androidx.camera.camera2.compat.quirk.DeviceQuirks.all;
                    this.this$0 = (CloseCameraDeviceOnCameraGraphCloseQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.getAll().get(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                    break;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
        
            if (r2 == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
        
            if (r3 == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
        
            if (r5 == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
        
            if (r2 == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
        
            if (r5 == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
        
            if (r4 == false) goto L81;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static FeatureGroupResolutionResult.UseCaseMissing getMissingUseCase(GroupableFeature groupableFeature, List list) {
            boolean z;
            boolean z2;
            boolean z3;
            String str;
            List<UseCase> list2 = list;
            boolean z4 = list2 instanceof Collection;
            boolean z5 = false;
            if (!z4 || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((UseCase) it.next()) instanceof ImageCapture) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z4 || !list2.isEmpty()) {
                for (UseCase useCase : list2) {
                    if ((useCase instanceof Preview) || UseCaseUtil.isVideoCapture(useCase)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z4 || !list2.isEmpty()) {
                for (UseCase useCase2 : list2) {
                    if ((useCase2 instanceof Preview) || (useCase2 instanceof ImageAnalysis) || UseCaseUtil.isVideoCapture(useCase2)) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            if (!z4 || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (UseCaseUtil.isVideoCapture((UseCase) it2.next())) {
                        z5 = true;
                        break;
                    }
                }
            }
            int ordinal = groupableFeature.getFeatureTypeInternal().ordinal();
            if (ordinal == 0) {
                str = UseCaseType.PREVIEW + " or " + UseCaseType.VIDEO_CAPTURE;
            } else if (ordinal == 1) {
                str = UseCaseType.PREVIEW + " or " + UseCaseType.VIDEO_CAPTURE + " or " + UseCaseType.IMAGE_ANALYSIS;
            } else if (ordinal == 2) {
                int ordinal2 = ((VideoStabilizationFeature) groupableFeature).videoStabilization.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 == 3) {
                        str = UseCaseType.PREVIEW + " or " + UseCaseType.VIDEO_CAPTURE + " or " + UseCaseType.IMAGE_ANALYSIS;
                    }
                    str = null;
                    if (str != null) {
                        return new FeatureGroupResolutionResult.UseCaseMissing(str, groupableFeature);
                    }
                    return null;
                }
                str = UseCaseType.VIDEO_CAPTURE.toString();
            } else if (ordinal == 3) {
                str = UseCaseType.IMAGE_CAPTURE.toString();
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = UseCaseType.VIDEO_CAPTURE.toString();
            }
        }

        public static LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch$default(AnonymousClass1 anonymousClass1, int i) {
            LazyListState lazyListState = (LazyListState) anonymousClass1.this$0;
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                LazyListMeasureResult lazyListMeasureResult = (LazyListMeasureResult) lazyListState.layoutInfoState.getValue();
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                return lazyListState.prefetchState.m325schedulePrecompositionAndPremeasure_EkL_Y$foundation(i, lazyListMeasureResult.childConstraints, lazyListState.executeRequestsInHighPriorityMode, new BasicTextKt$$ExternalSyntheticLambda14(i, lazyListMeasureResult));
            } catch (Throwable th) {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }

        @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
        public Object approachAnimation(ScrollScope scrollScope, Float f, Float f2, Function1 function1, SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1) {
            Object access$animateDecay = zzacp.access$animateDecay(scrollScope, f.floatValue(), AnimatableKt.AnimationState$default(RecyclerView.DECELERATION_RATE, f2.floatValue(), 28), (DecayAnimationSpecImpl) this.this$0, function1, snapFlingBehavior$tryApproach$1);
            return access$animateDecay == CoroutineSingletons.COROUTINE_SUSPENDED ? access$animateDecay : (AnimationResult) access$animateDecay;
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
        public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
            FutureChain futureChain = (FutureChain) this.this$0;
            TransactorKt.checkState("The result can only set once!", futureChain.mCompleter == null);
            futureChain.mCompleter = callbackToFutureAdapter$Completer;
            return "FutureChain[" + futureChain + "]";
        }

        public FileOutputOptions build() {
            Recorder.AnonymousClass3 anonymousClass3 = (Recorder.AnonymousClass3) this.this$0;
            String str = ((Long) anonymousClass3.val$completer) == null ? " fileSizeLimit" : "";
            if (((Long) anonymousClass3.val$recordingToStart) == null) {
                str = str.concat(" durationLimitMillis");
            }
            if (((File) anonymousClass3.this$0) == null) {
                str = str.concat(" file");
            }
            if (str.isEmpty()) {
                return new FileOutputOptions(new AutoValue_FileOutputOptions_FileOutputOptionsInternal(((Long) anonymousClass3.val$completer).longValue(), ((Long) anonymousClass3.val$recordingToStart).longValue(), (File) anonymousClass3.this$0));
            }
            a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(str));
            return null;
        }

        public SignedData createSignedData(byte[] bArr, ArrayList arrayList) {
            AndroidSvg androidSvg = (AndroidSvg) this.this$0;
            bArr.getClass();
            if (arrayList.isEmpty()) {
                a$$ExternalSyntheticBUOutline0.m$1("Certificates should not be empty.");
                return null;
            }
            TrifleAlgorithmIdentifier.ECDSASha256AlgorithmIdentifier algorithmIdentifier = androidSvg.getAlgorithmIdentifier();
            SignedData.EnvelopedData envelopedData = new SignedData.EnvelopedData(algorithmIdentifier, bArr);
            Buffer buffer = (Buffer) androidSvg.renderOptions;
            try {
                buffer.write(envelopedData.serialize());
                byte[] signature = androidSvg.getSignature();
                buffer.close();
                SignedData signedData = new SignedData(envelopedData, signature, arrayList);
                Certificate certificate = (Certificate) CollectionsKt.last((List) arrayList);
                certificate.getClass();
                if (certificate.version != 0) {
                    a$$ExternalSyntheticBUOutline0.m("Unsupported version of Trifle Certificate");
                    return null;
                }
                Object m1427validateIoAF18A = new CertChainValidator$X509CertChainValidator(certificate).m1427validateIoAF18A(arrayList);
                Result.Companion companion = Result.Companion;
                if (!(m1427validateIoAF18A instanceof Result.Failure)) {
                    try {
                        ContentVerifier contentVerifier = new JCAContentVerifierProvider((Certificate) CollectionsKt.first((List) arrayList)).get(algorithmIdentifier);
                        OutputStream outputStream = contentVerifier.getOutputStream();
                        try {
                            outputStream.write(envelopedData.serialize());
                            outputStream.close();
                            if (!contentVerifier.verify(signature)) {
                                throw TrifleErrors.InvalidSignature.INSTANCE;
                            }
                            m1427validateIoAF18A = Unit.INSTANCE;
                        } finally {
                        }
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m1427validateIoAF18A = new Result.Failure(th);
                    }
                }
                SafeTrace.throwOnFailure(m1427validateIoAF18A);
                return signedData;
            } finally {
            }
        }

        @Override // androidx.compose.animation.core.Animations
        public FloatAnimationSpec get(int i) {
            return ((FloatSpringSpec[]) this.this$0)[i];
        }

        public long getAvailableBytes() {
            FileOutputOptions fileOutputOptions = (FileOutputOptions) this.this$0;
            try {
                if (!(fileOutputOptions instanceof FileOutputOptions)) {
                    throw new AssertionError("Unknown OutputOptions: " + fileOutputOptions);
                }
                File parentFile = fileOutputOptions.mFileOutputOptionsInternal.file.getParentFile();
                parentFile.getClass();
                String path = parentFile.getPath();
                path.getClass();
                return new StatFs(path).getAvailableBytes();
            } catch (RuntimeException e) {
                StringUtilsKt.w("OutputStorageImpl", "Fail to access the available bytes.", e);
                return Long.MAX_VALUE;
            }
        }

        public FeatureGroupResolutionResult getFeatureListResolvedByPriority(LegacySessionConfig legacySessionConfig, ArrayList arrayList, int i, List list) {
            if (i < arrayList.size()) {
                int i2 = i + 1;
                FeatureGroupResolutionResult featureListResolvedByPriority = getFeatureListResolvedByPriority(legacySessionConfig, arrayList, i2, CollectionsKt.plus((Collection) list, arrayList.get(i)));
                return featureListResolvedByPriority instanceof FeatureGroupResolutionResult.Supported ? featureListResolvedByPriority : getFeatureListResolvedByPriority(legacySessionConfig, arrayList, i2, list);
            }
            LinkedHashSet plus = SetsKt___SetsKt.plus((Set) legacySessionConfig.requiredFeatureGroup, (Iterable) list);
            StringUtilsKt.d("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + plus + ", useCases = " + ((List) legacySessionConfig.useCases));
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
            Iterator it = plus.iterator();
            while (it.hasNext()) {
                arrayList2.add(((GroupableFeature) it.next()).getFeatureTypeInternal());
            }
            Iterator it2 = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList2)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    FeatureTypeInternal featureTypeInternal = (FeatureTypeInternal) it2.next();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : plus) {
                        if (((GroupableFeature) obj).getFeatureTypeInternal() == featureTypeInternal) {
                            arrayList3.add(obj);
                        }
                    }
                    if (arrayList3.size() > 1) {
                        break;
                    }
                } else {
                    CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) this.this$0;
                    ResolvedFeatureGroup resolvedFeatureGroup = new ResolvedFeatureGroup(plus);
                    Iterator it3 = plus.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            GroupableFeature groupableFeature = (GroupableFeature) it3.next();
                            if (!groupableFeature.isSupportedIndividually(legacySessionConfig, cameraInfoInternal)) {
                                StringUtilsKt.d("CameraInfoInternal", groupableFeature + " is not supported.");
                                break;
                            }
                        } else {
                            try {
                                UseCaseAdditionSimulator.simulateAddUseCases(cameraInfoInternal, legacySessionConfig, resolvedFeatureGroup);
                                return new FeatureGroupResolutionResult.Supported(new ResolvedFeatureGroup(plus));
                            } catch (CameraUseCaseAdapter.CameraException | IllegalArgumentException e) {
                                if (StringUtilsKt.isLogLevelEnabled(3, "CameraInfoInternal")) {
                                    Log.d("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
                                }
                            }
                        }
                    }
                }
            }
            return FeatureGroupResolutionResult.Unsupported.INSTANCE;
        }

        public int getValidDataLength(byte[] bArr) {
            int i;
            byte b;
            if (((LargeJpegImageQuirk) this.this$0) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.SAMSUNG_DEVICE_MODELS.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.isVivoProblematicDevice() || bArr.length > 10000000)) {
                return bArr.length;
            }
            int i2 = 2;
            while (true) {
                if (i2 + 4 > bArr.length || (b = bArr[i2]) != -1) {
                    break;
                }
                int i3 = i2 + 2;
                int i4 = ((bArr[i3] & 255) << 8) | (bArr[i2 + 3] & 255);
                if (b == -1 && bArr[i2 + 1] == -38) {
                    while (true) {
                        i = i3 + 2;
                        if (i <= bArr.length) {
                            if (bArr[i3] == -1 && bArr[i3 + 1] == -39) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                } else {
                    i2 += i4 + 2;
                }
            }
            i = -1;
            return i != -1 ? i : bArr.length;
        }

        /* JADX WARN: Removed duplicated region for block: B:211:0x03d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x017e  */
        /* renamed from: map-ZmokQxo, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public KeyCommand m123mapZmokQxo(KeyEvent keyEvent) {
            KeyCommand keyCommand;
            KeyCommand keyCommand2;
            int i = KeyMappingKt.CtrlShift;
            int m355getModifiersZmokQxo = KeyMappingKt.m355getModifiersZmokQxo(keyEvent);
            long Key = KeyEventType.Key(keyEvent.getKeyCode());
            if (Key.m771equalsimpl0(Key, Key.Backspace)) {
                if (m355getModifiersZmokQxo != 0 && m355getModifiersZmokQxo != 8) {
                    int i2 = KeyMappingKt.ShiftMeta;
                    if (m355getModifiersZmokQxo != 12) {
                        if (m355getModifiersZmokQxo == 2 || m355getModifiersZmokQxo == 10) {
                            keyCommand = KeyCommand.DELETE_PREV_WORD;
                        }
                        keyCommand = null;
                    }
                }
                keyCommand = KeyCommand.DELETE_PREV_CHAR;
            } else {
                if ((Key.m771equalsimpl0(Key, Key.Enter) || Key.m771equalsimpl0(Key, Key.NumPadEnter)) && (m355getModifiersZmokQxo == 0 || m355getModifiersZmokQxo == 8 || m355getModifiersZmokQxo == 2 || m355getModifiersZmokQxo == 10)) {
                    keyCommand = KeyCommand.NEW_LINE;
                }
                keyCommand = null;
            }
            if (keyCommand != null) {
                return keyCommand;
            }
            int m355getModifiersZmokQxo2 = KeyMappingKt.m355getModifiersZmokQxo(keyEvent);
            if (m355getModifiersZmokQxo2 == 10) {
                long Key2 = KeyEventType.Key(keyEvent.getKeyCode());
                if (Key.m771equalsimpl0(Key2, Key.DirectionLeft) || Key.m771equalsimpl0(Key2, Key.NumPadDirectionLeft)) {
                    keyCommand2 = KeyCommand.SELECT_LEFT_WORD;
                } else if (Key.m771equalsimpl0(Key2, Key.DirectionRight) || Key.m771equalsimpl0(Key2, Key.NumPadDirectionRight)) {
                    keyCommand2 = KeyCommand.SELECT_RIGHT_WORD;
                } else if (Key.m771equalsimpl0(Key2, Key.DirectionUp) || Key.m771equalsimpl0(Key2, Key.NumPadDirectionUp)) {
                    keyCommand2 = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else {
                    if (Key.m771equalsimpl0(Key2, Key.DirectionDown) || Key.m771equalsimpl0(Key2, Key.NumPadDirectionDown)) {
                        keyCommand2 = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                    keyCommand2 = null;
                }
                if (keyCommand2 != null) {
                    return keyCommand2;
                }
                int m355getModifiersZmokQxo3 = KeyMappingKt.m355getModifiersZmokQxo(keyEvent);
                if (m355getModifiersZmokQxo3 == 10) {
                    if (Key.m771equalsimpl0(KeyEventType.Key(keyEvent.getKeyCode()), Key.Z)) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (m355getModifiersZmokQxo3 == 2) {
                    long Key3 = KeyEventType.Key(keyEvent.getKeyCode());
                    if (Key.m771equalsimpl0(Key3, Key.C) || Key.m771equalsimpl0(Key3, Key.Insert) || Key.m771equalsimpl0(Key3, Key.NumPadInsert)) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m771equalsimpl0(Key3, Key.V)) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m771equalsimpl0(Key3, Key.X)) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m771equalsimpl0(Key3, Key.A)) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m771equalsimpl0(Key3, Key.Y)) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m771equalsimpl0(Key3, Key.Z)) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (m355getModifiersZmokQxo3 == 8) {
                    long Key4 = KeyEventType.Key(keyEvent.getKeyCode());
                    if (Key.m771equalsimpl0(Key4, Key.DirectionLeft) || Key.m771equalsimpl0(Key4, Key.NumPadDirectionLeft)) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m771equalsimpl0(Key4, Key.DirectionRight) || Key.m771equalsimpl0(Key4, Key.NumPadDirectionRight)) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m771equalsimpl0(Key4, Key.DirectionUp) || Key.m771equalsimpl0(Key4, Key.NumPadDirectionUp)) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m771equalsimpl0(Key4, Key.DirectionDown) || Key.m771equalsimpl0(Key4, Key.NumPadDirectionDown)) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m771equalsimpl0(Key4, Key.PageUp) || Key.m771equalsimpl0(Key4, Key.NumPadPageUp)) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m771equalsimpl0(Key4, Key.PageDown) || Key.m771equalsimpl0(Key4, Key.NumPadPageDown)) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m771equalsimpl0(Key4, Key.MoveHome) || Key.m771equalsimpl0(Key4, Key.NumPadMoveHome)) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m771equalsimpl0(Key4, Key.MoveEnd) || Key.m771equalsimpl0(Key4, Key.NumPadMoveEnd)) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m771equalsimpl0(Key4, Key.Insert) || Key.m771equalsimpl0(Key4, Key.NumPadInsert)) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                if (m355getModifiersZmokQxo3 != 0) {
                    return null;
                }
                long Key5 = KeyEventType.Key(keyEvent.getKeyCode());
                if (Key.m771equalsimpl0(Key5, Key.DirectionLeft) || Key.m771equalsimpl0(Key5, Key.NumPadDirectionLeft)) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m771equalsimpl0(Key5, Key.DirectionRight) || Key.m771equalsimpl0(Key5, Key.NumPadDirectionRight)) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m771equalsimpl0(Key5, Key.DirectionUp) || Key.m771equalsimpl0(Key5, Key.NumPadDirectionUp)) {
                    return KeyCommand.UP;
                }
                if (Key.m771equalsimpl0(Key5, Key.DirectionDown) || Key.m771equalsimpl0(Key5, Key.NumPadDirectionDown)) {
                    return KeyCommand.DOWN;
                }
                if (Key.m771equalsimpl0(Key5, Key.DirectionCenter)) {
                    return KeyCommand.CENTER;
                }
                if (Key.m771equalsimpl0(Key5, Key.PageUp) || Key.m771equalsimpl0(Key5, Key.NumPadPageUp)) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m771equalsimpl0(Key5, Key.PageDown) || Key.m771equalsimpl0(Key5, Key.NumPadPageDown)) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m771equalsimpl0(Key5, Key.MoveHome) || Key.m771equalsimpl0(Key5, Key.NumPadMoveHome)) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m771equalsimpl0(Key5, Key.MoveEnd) || Key.m771equalsimpl0(Key5, Key.NumPadMoveEnd)) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m771equalsimpl0(Key5, Key.Enter) || Key.m771equalsimpl0(Key5, Key.NumPadEnter)) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m771equalsimpl0(Key5, Key.Backspace)) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m771equalsimpl0(Key5, Key.Delete)) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m771equalsimpl0(Key5, Key.Paste)) {
                    return KeyCommand.PASTE;
                }
                if (Key.m771equalsimpl0(Key5, Key.Cut)) {
                    return KeyCommand.CUT;
                }
                if (Key.m771equalsimpl0(Key5, Key.Copy)) {
                    return KeyCommand.COPY;
                }
                if (Key.m771equalsimpl0(Key5, Key.Tab)) {
                    return KeyCommand.TAB;
                }
                return null;
            }
            if (m355getModifiersZmokQxo2 == 2) {
                long Key6 = KeyEventType.Key(keyEvent.getKeyCode());
                if (Key.m771equalsimpl0(Key6, Key.DirectionLeft) || Key.m771equalsimpl0(Key6, Key.NumPadDirectionLeft)) {
                    keyCommand2 = KeyCommand.LEFT_WORD;
                } else if (Key.m771equalsimpl0(Key6, Key.DirectionRight) || Key.m771equalsimpl0(Key6, Key.NumPadDirectionRight)) {
                    keyCommand2 = KeyCommand.RIGHT_WORD;
                } else if (Key.m771equalsimpl0(Key6, Key.DirectionUp) || Key.m771equalsimpl0(Key6, Key.NumPadDirectionUp)) {
                    keyCommand2 = KeyCommand.PREV_PARAGRAPH;
                } else if (Key.m771equalsimpl0(Key6, Key.DirectionDown) || Key.m771equalsimpl0(Key6, Key.NumPadDirectionDown)) {
                    keyCommand2 = KeyCommand.NEXT_PARAGRAPH;
                } else if (Key.m771equalsimpl0(Key6, Key.H)) {
                    keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
                } else if (Key.m771equalsimpl0(Key6, Key.Delete)) {
                    keyCommand2 = KeyCommand.DELETE_NEXT_WORD;
                } else {
                    if (Key.m771equalsimpl0(Key6, Key.Backslash)) {
                        keyCommand2 = KeyCommand.DESELECT;
                    }
                    keyCommand2 = null;
                }
                if (keyCommand2 != null) {
                }
            } else if (m355getModifiersZmokQxo2 == 8) {
                long Key7 = KeyEventType.Key(keyEvent.getKeyCode());
                if (Key.m771equalsimpl0(Key7, Key.MoveHome) || Key.m771equalsimpl0(Key7, Key.NumPadMoveHome)) {
                    keyCommand2 = KeyCommand.SELECT_LINE_START;
                } else {
                    if (Key.m771equalsimpl0(Key7, Key.MoveEnd) || Key.m771equalsimpl0(Key7, Key.NumPadMoveEnd)) {
                        keyCommand2 = KeyCommand.SELECT_LINE_END;
                    }
                    keyCommand2 = null;
                }
                if (keyCommand2 != null) {
                }
            } else {
                if (m355getModifiersZmokQxo2 == 1 && Key.m771equalsimpl0(KeyEventType.Key(keyEvent.getKeyCode()), Key.Delete)) {
                    keyCommand2 = KeyCommand.DELETE_TO_LINE_END;
                    if (keyCommand2 != null) {
                    }
                }
                keyCommand2 = null;
                if (keyCommand2 != null) {
                }
            }
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult m124measure3p2s80s(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, DefaultIntrinsicMeasurable defaultIntrinsicMeasurable, long j) {
            return ((SharedBoundsNode) ((ApproachLayoutModifierNode) this.this$0)).m149approachMeasure3p2s80s(approachIntrinsicsMeasureScope, defaultIntrinsicMeasurable, j);
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.this$0;
            if (!Objects.equals(coordinatorLayout.mLastInsets, windowInsetsCompat)) {
                coordinatorLayout.mLastInsets = windowInsetsCompat;
                boolean z = windowInsetsCompat.getSystemWindowInsetTop() > 0;
                coordinatorLayout.mDrawStatusBarBackground = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!impl.isConsumed()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                        if (childAt.getFitsSystemWindows() && ((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).mBehavior != null && impl.isConsumed()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return windowInsetsCompat;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            ((ImageProxy) this.this$0).close();
        }

        @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((ToolbarActionBar) this.this$0).mWindowCallback.onMenuItemSelected(0, menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            boolean onMenuItemClick;
            ActionMenuView.OnMenuItemClickListener onMenuItemClickListener = ((ActionMenuView) this.this$0).mOnMenuItemClickListener;
            if (onMenuItemClickListener != null) {
                Toolbar toolbar = (Toolbar) ((Toolbar.AnonymousClass1) onMenuItemClickListener).this$0;
                Iterator it = toolbar.mMenuHostHelper.mMenuProviders.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Toolbar.OnMenuItemClickListener onMenuItemClickListener2 = toolbar.mOnMenuItemClickListener;
                        onMenuItemClick = onMenuItemClickListener2 != null ? onMenuItemClickListener2.onMenuItemClick(menuItem) : false;
                    } else if (((MenuProvider) it.next()).onMenuItemSelected(menuItem)) {
                        onMenuItemClick = true;
                        break;
                    }
                }
                if (onMenuItemClick) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ((ActionMenuView) this.this$0).mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.camera.core.Preview.SurfaceProvider
        public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
            SurfaceViewImplementation surfaceViewImplementation;
            if (!Threads.isMainThread()) {
                ((PreviewView) this.this$0).getContext().getMainExecutor().execute(new Recorder$$ExternalSyntheticLambda15(24, this, surfaceRequest));
                return;
            }
            StringUtilsKt.d("PreviewView", "Surface requested by Preview.");
            CameraInternal cameraInternal = surfaceRequest.mCamera;
            ((PreviewView) this.this$0).mCameraInfoInternal = cameraInternal.getCameraInfoInternal();
            PreviewViewMeteringPointFactory previewViewMeteringPointFactory = ((PreviewView) this.this$0).mPreviewViewMeteringPointFactory;
            Rect sensorRect = cameraInternal.getCameraInfoInternal().getSensorRect();
            previewViewMeteringPointFactory.getClass();
            previewViewMeteringPointFactory.data = new Rational(sensorRect.width(), sensorRect.height());
            synchronized (previewViewMeteringPointFactory) {
                previewViewMeteringPointFactory.mSensorRect = sensorRect;
            }
            surfaceRequest.setTransformationInfoListener(((PreviewView) this.this$0).getContext().getMainExecutor(), new PreviewView$1$$ExternalSyntheticLambda2(this, cameraInternal, surfaceRequest));
            PreviewView previewView = (PreviewView) this.this$0;
            PreviewViewImplementation previewViewImplementation = previewView.mImplementation;
            ImplementationMode implementationMode = previewView.mImplementationMode;
            int i = 0;
            if (!(previewViewImplementation instanceof SurfaceViewImplementation) || PreviewView.shouldUseTextureView(surfaceRequest, implementationMode)) {
                PreviewView previewView2 = (PreviewView) this.this$0;
                boolean shouldUseTextureView = PreviewView.shouldUseTextureView(surfaceRequest, previewView2.mImplementationMode);
                PreviewView previewView3 = (PreviewView) this.this$0;
                PreviewTransformation previewTransformation = previewView3.mPreviewTransform;
                if (shouldUseTextureView) {
                    TextureViewImplementation textureViewImplementation = new TextureViewImplementation(previewView3, previewTransformation);
                    textureViewImplementation.mIsSurfaceTextureDetachedFromView = false;
                    textureViewImplementation.mNextFrameCompleter = new AtomicReference();
                    surfaceViewImplementation = textureViewImplementation;
                } else {
                    surfaceViewImplementation = new SurfaceViewImplementation(previewView3, previewTransformation);
                }
                previewView2.mImplementation = surfaceViewImplementation;
            }
            CameraInfoInternal cameraInfoInternal = cameraInternal.getCameraInfoInternal();
            PreviewView previewView4 = (PreviewView) this.this$0;
            PreviewStreamStateObserver previewStreamStateObserver = new PreviewStreamStateObserver(cameraInfoInternal, previewView4.mPreviewStreamStateLiveData, previewView4.mImplementation);
            ((PreviewView) this.this$0).mActiveStreamStateObserver.set(previewStreamStateObserver);
            cameraInternal.getCameraState().addObserver(((PreviewView) this.this$0).getContext().getMainExecutor(), previewStreamStateObserver);
            ((PreviewView) this.this$0).mImplementation.onSurfaceRequested(surfaceRequest, new PreviewView$1$$ExternalSyntheticLambda2(i, this, previewStreamStateObserver, cameraInternal));
            PreviewView previewView5 = (PreviewView) this.this$0;
            if (previewView5.indexOfChild(previewView5.mScreenFlashView) == -1) {
                PreviewView previewView6 = (PreviewView) this.this$0;
                previewView6.addView(previewView6.mScreenFlashView);
            }
        }

        public void set(IntRect intRect) {
            ((Region) this.this$0).set(intRect.left, intRect.top, intRect.right, intRect.bottom);
        }

        /* renamed from: visit-ou3jOuA, reason: not valid java name */
        public void m125visitou3jOuA(int i) {
            ((MutableIntObjectMap) ((DeviceProfileWriter) this.this$0).mDesiredVersion).remove(i);
        }

        public /* synthetic */ AnonymousClass1(Object obj, boolean z) {
            this.this$0 = obj;
        }

        public AnonymousClass1(final NestedScrollView nestedScrollView) {
            if (Build.VERSION.SDK_INT >= 35) {
                this.this$0 = new ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl(nestedScrollView) { // from class: androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderApi35Impl
                    public final ScrollFeedbackProvider mProvider;

                    {
                        this.mProvider = ScrollFeedbackProvider.createProvider(nestedScrollView);
                    }

                    @Override // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
                    public final void onScrollLimit(int i, int i2, boolean z, int i3) {
                        this.mProvider.onScrollLimit(i, i2, i3, z);
                    }

                    @Override // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
                    public final void onScrollProgress(int i, int i2, int i3, int i4) {
                        this.mProvider.onScrollProgress(i, i2, i3, i4);
                    }
                };
            } else {
                this.this$0 = new Transition.AnonymousClass1();
            }
        }

        public AnonymousClass1(File file) {
            Recorder.AnonymousClass3 anonymousClass3 = new Recorder.AnonymousClass3(9, false);
            anonymousClass3.val$completer = 0L;
            anonymousClass3.val$recordingToStart = 0L;
            this.this$0 = anonymousClass3;
            anonymousClass3.this$0 = file;
        }

        public AnonymousClass1(float f, float f2, AnimationVector animationVector) {
            int size$animation_core = animationVector.getSize$animation_core();
            FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[size$animation_core];
            for (int i = 0; i < size$animation_core; i++) {
                floatSpringSpecArr[i] = new FloatSpringSpec(f, f2, animationVector.get$animation_core(i));
            }
            this.this$0 = floatSpringSpecArr;
        }
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(Context context) {
        this(context, null);
    }
}
