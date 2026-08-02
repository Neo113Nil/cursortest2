package com.miteksystems.misnap.workflow.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.room.RoomDatabase$performClear$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.view.CameraView;
import com.miteksystems.misnap.controller.AnalysisSettings;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.controller.a.a;
import com.miteksystems.misnap.controller.a.a0;
import com.miteksystems.misnap.controller.a.g;
import com.miteksystems.misnap.controller.a.h;
import com.miteksystems.misnap.controller.a.l;
import com.miteksystems.misnap.controller.a.m;
import com.miteksystems.misnap.controller.a.p;
import com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper;
import com.miteksystems.misnap.core.DevicePerformanceUtil;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.LicenseStatus;
import com.miteksystems.misnap.core.LicenseUtil;
import com.miteksystems.misnap.core.LiveDataUtil;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.core.internal.ContextHelper;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import com.miteksystems.misnap.workflow.R$styleable;
import com.miteksystems.misnap.workflow.util.AutoTorchHandler;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.Pool;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import net.idrnd.face.iad.capture.internal.u3;
import net.idrnd.misnap.iad.CaptureCore;
import net.idrnd.misnap.iad.PayloadSize;
import net.oneformapp.helper.HelperFunctions;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes4.dex */
public final class MiSnapView extends ConstraintLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MutableLiveData A;
    public final MutableLiveData C;
    public final KnotView$$ExternalSyntheticLambda1 D;
    public final CompositeGeneratedAdaptersObserver E;
    public final MiSnapView$$ExternalSyntheticLambda0 F;
    public LifecycleOwner a;
    public final int b;
    public final CameraView c;
    public MiSnapController d;
    public volatile Frame e;
    public boolean f;
    public boolean g;
    public final AutoTorchHandler h;
    public MiSnapCameraInfo i;
    public MiSnapSettings j;
    public Boolean k;
    public MibiData.Session l;
    public final n m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final MiSnapView$$ExternalSyntheticLambda0 r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public final MutableLiveData w;
    public final MutableLiveData x;
    public final MutableLiveData y;
    public final MutableLiveData z;

    public abstract /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LicenseStatus.values().length];
            try {
                iArr[LicenseStatus.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LicenseStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr2[7] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[6] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public final class c implements Observer {
        public final /* synthetic */ MiSnapSettings b;

        public c(MiSnapSettings miSnapSettings) {
            this.b = miSnapSettings;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            FrameProducer.Event event = (FrameProducer.Event) obj;
            if (event != null) {
                boolean z = event instanceof FrameProducer.Event.CameraInitialized;
                MiSnapView miSnapView = MiSnapView.this;
                if (z) {
                    miSnapView.i = ((FrameProducer.Event.CameraInitialized) event).getCameraInfo();
                    return;
                }
                if (event instanceof FrameProducer.Event.CameraReady) {
                    miSnapView.c.p.removeObserver(this);
                    MiSnapCameraInfo miSnapCameraInfo = miSnapView.i;
                    if (miSnapCameraInfo != null) {
                        miSnapView.a(this.b, miSnapCameraInfo);
                    }
                }
            }
        }
    }

    public final class d implements Observer {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ MiSnapView a;
        public final /* synthetic */ MiSnapSettings b;

        public /* synthetic */ d(MiSnapView miSnapView, MiSnapSettings miSnapSettings, int i) {
            this.$r8$classId = i;
            this.a = miSnapView;
            this.b = miSnapSettings;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0204, code lost:
        
            r0.setValue(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0208, code lost:
        
            r0.postValue(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
        
            r10.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0231, code lost:
        
            if (androidx.camera.video.Recorder$$ExternalSyntheticOutline1.m(r0) != false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (r10 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        
            if (r0 != null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        
            r9.a.e = null;
            com.miteksystems.misnap.core.MibiData.releaseSession(com.miteksystems.misnap.workflow.view.MiSnapView.class.getName());
            r0 = r9.a.x;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        
            if (androidx.camera.video.Recorder$$ExternalSyntheticOutline1.m(r0) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        
            r0.setValue(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
        
            r9.a.o = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        
            r0.postValue(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        
            r0.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        
            if (r0 != null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            if (r10 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0202, code lost:
        
            if (androidx.camera.video.Recorder$$ExternalSyntheticOutline1.m(r0) != false) goto L105;
         */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0234 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01da  */
        @Override // androidx.lifecycle.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onChanged(Object obj) {
            MiSnapSettings.Camera.Profile profile;
            MiSnapView miSnapView;
            MiSnapView miSnapView2;
            Boolean bool;
            Frame frame;
            MiSnapView miSnapView3;
            MiSnapView miSnapView4;
            boolean isEmpty;
            Frame frame2;
            Frame frame3;
            switch (this.$r8$classId) {
                case 0:
                    MiSnapController.FeedbackResult feedbackResult = (MiSnapController.FeedbackResult) obj;
                    if (feedbackResult.d.contains(UserAction.Document.HOLD_STILL.INSTANCE)) {
                        int i = this.a.b;
                        if (i == 0) {
                            throw null;
                        }
                        if (SVG$Unit$EnumUnboxingLocalUtility.getA$1(i) > 1) {
                            MiSnapView miSnapView5 = this.a;
                            if (!miSnapView5.m.isRunning(miSnapView5.D)) {
                                MiSnapView miSnapView6 = this.a;
                                miSnapView6.m.start(miSnapView6.D, 4000L);
                            }
                            profile = this.b.camera.b;
                            if (profile != null && (frame = this.a.e) != null) {
                                Context context = this.a.getContext();
                                context.getClass();
                                int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context);
                                Size imageSize = frame.getImageSize();
                                int height = deviceCurrentBasicOrientation != 1 ? imageSize.getHeight() : imageSize.getWidth();
                                boolean z = profile != MiSnapSettings.Camera.Profile.FACE_FRONT_CAMERA;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                miSnapView3 = this.a;
                                if (miSnapView3.s) {
                                    int[][] iArr = feedbackResult.b;
                                    if (iArr.length != 0) {
                                        if (z) {
                                            iArr = MiSnapView.access$getMirroredCorners(miSnapView3, iArr, height);
                                        }
                                        if (iArr != null) {
                                        }
                                    }
                                }
                                miSnapView4 = this.a;
                                if (miSnapView4.t) {
                                    int[][] iArr2 = feedbackResult.c;
                                    if (iArr2.length != 0) {
                                        if (z) {
                                            iArr2 = MiSnapView.access$getMirroredCorners(miSnapView4, iArr2, height);
                                        }
                                        if (iArr2 != null) {
                                        }
                                    }
                                }
                                isEmpty = linkedHashMap.isEmpty();
                                MiSnapView miSnapView7 = this.a;
                                if (isEmpty) {
                                    CameraView cameraView = miSnapView7.c;
                                    cameraView.getClass();
                                    CameraView.a aVar = cameraView.c;
                                    aVar.getClass();
                                    aVar.setWillNotDraw(false);
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        Object key = entry.getKey();
                                        Paint paint = new Paint();
                                        paint.setColor(((Number) entry.getValue()).intValue());
                                        paint.setStyle(Paint.Style.STROKE);
                                        paint.setStrokeWidth(5.0f);
                                        linkedHashMap2.put(key, paint);
                                    }
                                    aVar.c = linkedHashMap2;
                                    aVar.postInvalidate();
                                } else if (miSnapView7.s || miSnapView7.t) {
                                    CameraView.a aVar2 = miSnapView7.c.c;
                                    aVar2.setWillNotDraw(true);
                                    aVar2.c = null;
                                    aVar2.postInvalidate();
                                }
                            }
                            miSnapView = this.a;
                            if (miSnapView.g) {
                                Frame frame4 = miSnapView.e;
                                if (frame4 != null) {
                                    frame4.close();
                                }
                                this.a.e = null;
                                MutableLiveData mutableLiveData = this.a.w;
                                if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                                    mutableLiveData.setValue(feedbackResult);
                                } else {
                                    mutableLiveData.postValue(feedbackResult);
                                }
                            }
                            miSnapView2 = this.a;
                            if (miSnapView2.f) {
                                return;
                            }
                            AutoTorchHandler autoTorchHandler = miSnapView2.h;
                            List list = feedbackResult.d;
                            MutableLiveData mutableLiveData2 = autoTorchHandler.c;
                            UserAction.Document.TOO_BRIGHT too_bright = UserAction.Document.TOO_BRIGHT.INSTANCE;
                            if (list.contains(too_bright)) {
                                if (!Intrinsics.areEqual(too_bright, autoTorchHandler.b)) {
                                    autoTorchHandler.a = 0;
                                    autoTorchHandler.b = too_bright;
                                }
                                int i2 = autoTorchHandler.a + 1;
                                autoTorchHandler.a = i2;
                                if (i2 >= 3) {
                                    bool = Boolean.FALSE;
                                    break;
                                } else {
                                    return;
                                }
                            } else {
                                UserAction.Document.TOO_DARK too_dark = UserAction.Document.TOO_DARK.INSTANCE;
                                if (list.contains(too_dark)) {
                                    if (!Intrinsics.areEqual(too_dark, autoTorchHandler.b)) {
                                        autoTorchHandler.a = 0;
                                        autoTorchHandler.b = too_dark;
                                    }
                                    int i3 = autoTorchHandler.a + 1;
                                    autoTorchHandler.a = i3;
                                    if (i3 >= 3) {
                                        bool = Boolean.TRUE;
                                        break;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            autoTorchHandler.a = 0;
                            autoTorchHandler.b = null;
                            return;
                        }
                    }
                    MiSnapView miSnapView8 = this.a;
                    miSnapView8.m.cancel(miSnapView8.D);
                    profile = this.b.camera.b;
                    if (profile != null) {
                        Context context2 = this.a.getContext();
                        context2.getClass();
                        int deviceCurrentBasicOrientation2 = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context2);
                        Size imageSize2 = frame.getImageSize();
                        if (deviceCurrentBasicOrientation2 != 1) {
                        }
                        if (profile != MiSnapSettings.Camera.Profile.FACE_FRONT_CAMERA) {
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        miSnapView3 = this.a;
                        if (miSnapView3.s) {
                        }
                        miSnapView4 = this.a;
                        if (miSnapView4.t) {
                        }
                        isEmpty = linkedHashMap3.isEmpty();
                        MiSnapView miSnapView72 = this.a;
                        if (isEmpty) {
                        }
                    }
                    miSnapView = this.a;
                    if (miSnapView.g) {
                    }
                    miSnapView2 = this.a;
                    if (miSnapView2.f) {
                    }
                    break;
                default:
                    MiSnapController.FrameResult frameResult = (MiSnapController.FrameResult) obj;
                    MiSnapView miSnapView9 = this.a;
                    miSnapView9.m.cancel(miSnapView9.D);
                    MiSnapView miSnapView10 = this.a;
                    if (miSnapView10.o) {
                        frame3 = miSnapView10.e;
                        break;
                    } else {
                        if (miSnapView10.b(this.b)) {
                            MiSnapSettings miSnapSettings = this.b;
                            if (AnalysisSettings.isAutoTrigger(miSnapSettings.analysis, miSnapSettings.a)) {
                                MiSnapView miSnapView11 = this.a;
                                if (miSnapView11.n) {
                                    frame2 = miSnapView11.e;
                                    break;
                                } else {
                                    miSnapView11.n = true;
                                    miSnapView11.c.startAutoFocus(null);
                                    this.a.l.addUxpEvent("MVFFF", new String[0]);
                                    frame3 = this.a.e;
                                    break;
                                }
                            }
                        }
                        frame2 = this.a.e;
                        break;
                    }
                    this.a.e = null;
                    return;
            }
        }
    }

    public final class e implements Observer {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ MiSnapView a;

        public /* synthetic */ e(MiSnapView miSnapView, int i) {
            this.$r8$classId = i;
            this.a = miSnapView;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            int i = this.$r8$classId;
            MiSnapView miSnapView = this.a;
            switch (i) {
                case 0:
                    MiSnapController.ErrorResult errorResult = (MiSnapController.ErrorResult) obj;
                    MutableLiveData mutableLiveData = miSnapView.y;
                    if (!Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                        mutableLiveData.postValue(errorResult);
                        break;
                    } else {
                        mutableLiveData.setValue(errorResult);
                        break;
                    }
                default:
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (miSnapView.f) {
                        CameraView.setTorchEnabled$default(miSnapView.c, booleanValue, null, 2, null);
                        break;
                    }
                    break;
            }
        }
    }

    public final class i extends Lambda implements Function0 {
        public static final i a = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.INSTANCE;
        }
    }

    public final class j extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Function0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ j(int i, Function0 function0) {
            super(0);
            this.$r8$classId = i;
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Function0 function0 = this.a;
            switch (i) {
                case 0:
                    function0.invoke();
                    return Unit.INSTANCE;
                default:
                    return function0.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.miteksystems.misnap.workflow.view.MiSnapView$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.miteksystems.misnap.workflow.view.MiSnapView$$ExternalSyntheticLambda0] */
    public MiSnapView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        context.getClass();
        Object obj = context;
        while (true) {
            if (obj == null || (obj instanceof LifecycleOwner)) {
                break;
            }
            ContextWrapper contextWrapper = obj instanceof ContextWrapper ? (ContextWrapper) obj : null;
            Context baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            obj = Intrinsics.areEqual(baseContext, obj) ? null : baseContext;
        }
        LifecycleOwner lifecycleOwner = obj instanceof LifecycleOwner ? (LifecycleOwner) obj : null;
        if (lifecycleOwner == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Unable to acquire LifeCycle Owner");
            throw null;
        }
        this.a = lifecycleOwner;
        int currentDevicePerformanceTier$default = DevicePerformanceUtil.getCurrentDevicePerformanceTier$default(context);
        this.b = currentDevicePerformanceTier$default;
        final int i4 = 1;
        this.g = true;
        this.h = new AutoTorchHandler();
        this.l = MibiData.bindSession();
        this.m = new n();
        boolean z = false;
        z = false;
        z = false;
        final int i5 = z ? 1 : 0;
        this.r = new Observer(this) { // from class: com.miteksystems.misnap.workflow.view.MiSnapView$$ExternalSyntheticLambda0
            public final /* synthetic */ MiSnapView f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                int i6 = i5;
                MiSnapView miSnapView = this.f$0;
                switch (i6) {
                    case 0:
                        FrameProducer.Event event = (FrameProducer.Event) obj2;
                        int i7 = MiSnapView.$r8$clinit;
                        MutableLiveData mutableLiveData = miSnapView.z;
                        if (!Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                            mutableLiveData.postValue(event);
                            break;
                        } else {
                            mutableLiveData.setValue(event);
                            break;
                        }
                    default:
                        Frame frame = (Frame) obj2;
                        int i8 = MiSnapView.$r8$clinit;
                        if (frame != null) {
                            miSnapView.e = frame;
                            try {
                                MiSnapController miSnapController = miSnapView.d;
                                if (miSnapController != null) {
                                    boolean z2 = miSnapView.q;
                                    StandaloneCoroutine standaloneCoroutine = miSnapController.w;
                                    Continuation continuation = null;
                                    if (standaloneCoroutine != null && standaloneCoroutine.isActive()) {
                                        standaloneCoroutine.cancel(null);
                                    }
                                    miSnapController.w = null;
                                    miSnapController.w = JobKt.launch$default(JobKt.MainScope(), null, null, new RoomDatabase$performClear$1(miSnapController, frame, z2, continuation, 5), 3);
                                    break;
                                }
                            } catch (Exception unused) {
                                frame.close();
                            }
                        }
                        break;
                }
            }
        };
        this.s = getResources().getBoolean(R.bool.misnapWorkflowMiSnapViewDefaultShowBoundingBox);
        this.t = getResources().getBoolean(R.bool.misnapWorkflowMiSnapViewDefaultShowGlareBox);
        this.w = new MutableLiveData();
        this.x = new MutableLiveData();
        this.y = new MutableLiveData();
        this.z = new MutableLiveData();
        View findViewById = LayoutInflater.from(context).inflate(R.layout.misnap_view_misnapview, this).findViewById(R.id.cameraView);
        findViewById.getClass();
        CameraView cameraView = (CameraView) findViewById;
        this.c = cameraView;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.MiSnapView, i2, i3);
        try {
            this.s = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getResources().getBoolean(R.bool.misnapWorkflowMiSnapViewDefaultShowBoundingBox));
            this.t = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getResources().getBoolean(R.bool.misnapWorkflowMiSnapViewDefaultShowGlareBox));
            this.u = obtainStyledAttributes.getColor(0, context.getColor(R.color.colorMiSnapViewBoundingBox));
            this.v = obtainStyledAttributes.getColor(1, context.getColor(R.color.colorMiSnapViewGlareBox));
            obtainStyledAttributes.recycle();
            this.l.addUxpEvent("MVDPF", String.valueOf(SVG$Unit$EnumUnboxingLocalUtility.getA$1(currentDevicePerformanceTier$default)));
            MibiData.Session session = this.l;
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
            session.addUxpEvent("MVSRE", String.valueOf(z));
            this.A = cameraView.o;
            this.C = cameraView.k;
            this.D = new KnotView$$ExternalSyntheticLambda1(this, 21);
            this.E = new CompositeGeneratedAdaptersObserver(this, i4);
            this.F = new Observer(this) { // from class: com.miteksystems.misnap.workflow.view.MiSnapView$$ExternalSyntheticLambda0
                public final /* synthetic */ MiSnapView f$0;

                {
                    this.f$0 = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    int i6 = i4;
                    MiSnapView miSnapView = this.f$0;
                    switch (i6) {
                        case 0:
                            FrameProducer.Event event = (FrameProducer.Event) obj2;
                            int i7 = MiSnapView.$r8$clinit;
                            MutableLiveData mutableLiveData = miSnapView.z;
                            if (!Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                                mutableLiveData.postValue(event);
                                break;
                            } else {
                                mutableLiveData.setValue(event);
                                break;
                            }
                        default:
                            Frame frame = (Frame) obj2;
                            int i8 = MiSnapView.$r8$clinit;
                            if (frame != null) {
                                miSnapView.e = frame;
                                try {
                                    MiSnapController miSnapController = miSnapView.d;
                                    if (miSnapController != null) {
                                        boolean z2 = miSnapView.q;
                                        StandaloneCoroutine standaloneCoroutine = miSnapController.w;
                                        Continuation continuation = null;
                                        if (standaloneCoroutine != null && standaloneCoroutine.isActive()) {
                                            standaloneCoroutine.cancel(null);
                                        }
                                        miSnapController.w = null;
                                        miSnapController.w = JobKt.launch$default(JobKt.MainScope(), null, null, new RoomDatabase$performClear$1(miSnapController, frame, z2, continuation, 5), 3);
                                        break;
                                    }
                                } catch (Exception unused) {
                                    frame.close();
                                }
                            }
                            break;
                    }
                }
            };
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static final int[][] access$getMirroredCorners(MiSnapView miSnapView, int[][] iArr, int i2) {
        try {
            Result.Companion companion = Result.Companion;
            for (int i3 = 0; i3 < 4; i3++) {
                int[] iArr2 = iArr[i3];
                iArr[i3] = new int[]{i2 - iArr2[0], iArr2[1]};
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            iArr = new Result.Failure(th);
        }
        Result.Companion companion3 = Result.Companion;
        boolean z = iArr instanceof Result.Failure;
        int[][] iArr3 = iArr;
        if (z) {
            iArr3 = null;
        }
        return iArr3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTorchEnabled$default(MiSnapView miSnapView, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        miSnapView.setTorchEnabled(z, function1);
    }

    public static /* synthetic */ void startMiSnapSession$default(MiSnapView miSnapView, MiSnapSettings miSnapSettings, LifecycleOwner lifecycleOwner, Function0 function0, int i2) {
        Boolean bool = Boolean.TRUE;
        if ((i2 & 4) != 0) {
            bool = null;
        }
        if ((i2 & 8) != 0) {
            function0 = i.a;
        }
        miSnapView.startMiSnapSession(miSnapSettings, lifecycleOwner, bool, function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00f7, code lost:
    
        if (com.miteksystems.misnap.controller.MiSnapController.Companion.a(r8) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0247, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0256, code lost:
    
        if (r4.barcode.d != com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger.MANUAL) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00da, code lost:
    
        if (((com.miteksystems.misnap.document.DocumentAnalysisSettings.requireDocType(r5.advanced).isCheck() || (r5 = r5.h) == null) ? false : r5.booleanValue()) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e5, code lost:
    
        if (r10 != r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e9, code lost:
    
        if (r10 != r12) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MiSnapSettings miSnapSettings, MiSnapCameraInfo miSnapCameraInfo) {
        MiSnapSettings miSnapSettings2;
        a0 lVar;
        Boolean bool;
        int i2;
        boolean z;
        CameraView cameraView;
        int i3;
        Object failure;
        boolean z2;
        MiSnapSettings.Analysis.Barcode.Orientation orientation;
        a$1$2();
        this.m.cancel(this.D);
        Context context = getContext();
        context.getClass();
        MiSnapSettings.UseCase useCase = miSnapSettings.a;
        MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
        MiSnapSettings.UseCase useCase2 = MiSnapSettings.UseCase.FACE;
        MiSnapSettings.UseCase useCase3 = MiSnapSettings.UseCase.BARCODE;
        if (useCase == useCase3 || useCase == useCase2 || !MiSnapController.Companion.l(miSnapSettings) || analysis.barcode.c != null) {
            miSnapSettings2 = miSnapSettings;
        } else {
            miSnapSettings2 = miSnapSettings.m2165clone();
            MiSnapSettings.Analysis.Document.Orientation orientation2 = analysis.document.d;
            if (orientation2 == null) {
                orientation2 = MiSnapSettings.Analysis.Document.Orientation.DEVICE;
            }
            MiSnapSettings.Analysis.Barcode barcode = miSnapSettings2.analysis.barcode;
            int i4 = MiSnapController.Companion.WhenMappings.$EnumSwitchMapping$0[orientation2.ordinal()];
            if (i4 == 1) {
                orientation = MiSnapSettings.Analysis.Barcode.Orientation.LANDSCAPE;
            } else if (i4 == 2) {
                orientation = MiSnapSettings.Analysis.Barcode.Orientation.PORTRAIT;
            } else {
                if (i4 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                orientation = MiSnapSettings.Analysis.Barcode.Orientation.DEVICE;
            }
            barcode.c = orientation;
        }
        String str = miSnapSettings2.b;
        MiSnapSettings.UseCase useCase4 = miSnapSettings2.a;
        MiSnapSettings.Analysis analysis2 = miSnapSettings2.analysis;
        if (useCase4 == useCase3) {
            lVar = new a(context, analysis2.barcode, str);
        } else if (useCase4 == useCase2) {
            lVar = new m(analysis2.face, str);
        } else {
            if (!MiSnapController.Companion.f(miSnapSettings2) || new MiSnapSettings(useCase4, str).analysis.document.advanced.m == analysis2.document.advanced.m) {
                boolean f = MiSnapController.Companion.f(miSnapSettings2);
                MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
                MiSnapSettings.UseCase useCase5 = MiSnapSettings.UseCase.ID_FRONT;
                MiSnapSettings.UseCase useCase6 = MiSnapSettings.UseCase.ID_BACK;
                if (f && !MiSnapController.Companion.l(miSnapSettings2)) {
                    if (DocumentAnalysisSettings.getDocumentExtractionRequirement(analysis2.document) != extractionRequirement && ((useCase4 == useCase5 || useCase4 == useCase6) && !MiSnapController.Companion.a(miSnapSettings2))) {
                        MiSnapSettings.Analysis.Document document = analysis2.document;
                        document.getClass();
                    }
                    if (!MiSnapController.Companion.m(miSnapSettings2)) {
                        if (useCase4 != useCase5) {
                        }
                        if (useCase4 != useCase5) {
                        }
                        if (DocumentAnalysisSettings.getDocumentExtractionRequirement(analysis2.document) != extractionRequirement) {
                        }
                    }
                }
                if (MiSnapController.Companion.l(miSnapSettings2)) {
                    lVar = new com.miteksystems.misnap.controller.a.e(context, miSnapSettings2, str);
                } else {
                    if (!MiSnapController.Companion.m(miSnapSettings2)) {
                        if (DocumentAnalysisSettings.getDocumentExtractionRequirement(analysis2.document) != extractionRequirement && ((useCase4 == useCase5 || useCase4 == useCase6) && !MiSnapController.Companion.a(miSnapSettings2))) {
                            MiSnapSettings.Analysis.Document document2 = analysis2.document;
                            document2.getClass();
                            if (!((DocumentAnalysisSettings.requireDocType(document2.advanced).isCheck() || (bool = document2.h) == null) ? false : bool.booleanValue())) {
                                lVar = new l(context, analysis2, str);
                            }
                        }
                        StringBuilder sb = new StringBuilder("Passed combination of use-case:");
                        sb.append(useCase4);
                        sb.append(", document extraction requirement:");
                        MiSnapSettings.Analysis.Document document3 = analysis2.document;
                        sb.append(document3.a);
                        sb.append(", and barcode extraction requirement:");
                        sb.append(document3.c);
                        sb.append(" and document classification:");
                        a$$ExternalSyntheticBUOutline0.m$3(Thread$State$EnumUnboxingLocalUtility.m(sb, document3.h, " is currently not supported."));
                        return;
                    }
                    lVar = new g(context, analysis2, str);
                }
            }
            lVar = new h(context, analysis2.document, str);
        }
        CompressionUtilNativeWrapper compressionUtilNativeWrapper = new CompressionUtilNativeWrapper();
        analysis2.getClass();
        PayloadSize[] payloadSizeArr = PayloadSize.a;
        byte[] bArr = {112, 77, 118, 116, 72, 114, 77, 65, 114, 84, 65, PnmConstants.PBM_RAW_CODE, 84, 117, 99, 111, 88, 113, 114, 100, 112, 103, 117, 73, 103, 100, 78, PnmConstants.PNM_PREFIX_BYTE, PnmConstants.PNM_PREFIX_BYTE, 111, 83, 76};
        byte[] bArr2 = {61, 4, 63, PnmConstants.PPM_RAW_CODE, 1, 24, 12, 15, 48, PnmConstants.PPM_TEXT_CODE, 42, 69, 60, 30, 10, 40, 97, 6, 66, 38, PnmConstants.PBM_TEXT_CODE, PnmConstants.PPM_RAW_CODE, 48, 15, 38, 37, 1, 19, 17, 62, 107, 13, 61, 4, 63, PnmConstants.PPM_RAW_CODE, 11, 21, 6, 2, PnmConstants.PPM_TEXT_CODE, 5, 4, 117, 96, 30, PnmConstants.PAM_RAW_CODE, 68, 43, 59, PnmConstants.PNM_SEPARATOR, 41, 10, 33, 66, 57, 82, 1, 24, 24, 37, 30, PnmConstants.PAM_RAW_CODE, 63, 22, 123, 68, 34, 45, 1, 37, 112, 22, 59, 14, 13, 0, 77, 9, 62, 27, 3, 3, PnmConstants.PAM_RAW_CODE, 61, 21, 57, 26, 29, PnmConstants.PPM_TEXT_CODE, 45, 62, 22, 62, PnmConstants.PNM_SEPARATOR, 7, 7, 29, 26, 62, 9, 89, 126, 4, PnmConstants.PGM_RAW_CODE, PnmConstants.PPM_RAW_CODE, 17, 66, 56, 33, 85, PnmConstants.PAM_RAW_CODE, 19, 31, 42, 6, 71, 86, 20, 38, 8, 40, 3, 3, 35, 1, 43, 4, 40, 122, 7, 46, 35, 33, 0, 18, 27, 108, 12, 100, 27, PnmConstants.PBM_RAW_CODE, 37, 46, 97, 5, 63, 33, PnmConstants.PPM_TEXT_CODE, 43, 58, 47, 22, 45, 40, 41, 7, 27, 106, 56, 4, 120, 38, 19, 63, 22, 39, 41, 70, 34, 42, PnmConstants.PNM_PREFIX_BYTE, 33, 76, 37, 30, PnmConstants.PGM_RAW_CODE, 60, 56, 46, 35, PnmConstants.PGM_TEXT_CODE, 2, 57, 61, 83, 25, 27, 8, 25, 98, 124, 59, PnmConstants.PGM_RAW_CODE, 48, 13, 59, 24, 120, 23, 57, PnmConstants.PPM_TEXT_CODE, 48, 77, 57, 76, 47, 63, 97, 28, 58, 13, 70, 0, 66, 33, 18, 84, 63, PnmConstants.PAM_RAW_CODE, 58, 7, 29, 38, 34, 31, 18, 30, 43, 66, 117, 47, 17, 109, 115, 102, 7, 35, PnmConstants.PAM_RAW_CODE, 7, 31, 21, 27, 83, 36, 42, 13, 16, 16, 48, PnmConstants.PBM_RAW_CODE, 31, 9, 58, 61, 123, 34, 61, 62, 0, 62, 8, 121, 112, 3, 36, 35, 120, 2, PnmConstants.PPM_RAW_CODE, 7, 62, 44, 58, 8, 44, 7, 20, 94, 11, 10, 11, 4, 26, 59, 56, 39, 38, PnmConstants.PPM_TEXT_CODE, 37, PnmConstants.PGM_TEXT_CODE, 95, 0, 31, PnmConstants.PNM_SEPARATOR, 12, 10, 38, 25, 109, 45, 69, 7, 41, 107, 30, 33, PnmConstants.PBM_TEXT_CODE, 64, 35, 76, 120, 87, 44, 118, 102, 96, 22, 98, 14, 0, 15, 3, 69, 125, 68, 58, 117, 61, 13, 2, 97, 100, PnmConstants.PAM_RAW_CODE, 44, 11, 43, 64, 66, 82, 8, 87, 13, 36, 48, 93, 62, 23, 97, 36, 120, 20, PnmConstants.PBM_TEXT_CODE, 3, 67, 28, 1, PnmConstants.PGM_RAW_CODE, 27, 112, 36, 0, 59, 124, 56, 56, 12, PnmConstants.PPM_RAW_CODE, 31, 41, 63, 41, 27, 2, 28, 40, 23, 16, 39, PnmConstants.PGM_RAW_CODE, 2, 61, 36, 41, 73, 28, 63, 48, 9, 35, 12, 3};
        byte[] bArr3 = new byte[392];
        a0 a0Var = lVar;
        int i5 = 0;
        for (int i6 = 392; i5 < i6; i6 = 392) {
            bArr3[i5] = (byte) (bArr2[i5] ^ bArr[i5 % 32]);
            i5++;
        }
        String str2 = new String(bArr3, Charsets.US_ASCII);
        int i7 = 0;
        byte[] decode = Base64.decode(str2, 0);
        decode.getClass();
        u3 u3Var = u3.a;
        MiSnapController miSnapController = new MiSnapController(context, miSnapSettings2, a0Var, compressionUtilNativeWrapper, new p(new CaptureCore(context, decode, new Pool(14))));
        miSnapController.n.observe(this.a, new d(this, miSnapSettings, i7));
        miSnapController.v.observe(this.a, new e(this, i7));
        int i8 = 1;
        miSnapController.u.observe(this.a, new d(this, miSnapSettings, i8));
        this.h.c.observe(this.a, new e(this, i8));
        int i9 = b.b[useCase.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                MiSnapSettings.Analysis.Document document4 = analysis.document;
                if (document4.e == MiSnapSettings.Analysis.Document.Trigger.MANUAL) {
                    if (DocumentAnalysisSettings.shouldEnableEnhancedManual(document4)) {
                        try {
                            Result.Companion companion = Result.Companion;
                            boolean z3 = LicenseUtil.a;
                            int i10 = b.a[HelperFunctions.checkLicenseStatus(miSnapSettings.b, "em").ordinal()];
                            i8 = 1;
                            if (i10 == 1 || i10 == 2) {
                                z2 = true;
                            } else {
                                try {
                                    this.l.addUxpEvent("EEMMV", new String[0]);
                                    z2 = false;
                                } catch (Throwable th) {
                                    th = th;
                                    Result.Companion companion2 = Result.Companion;
                                    failure = new Result.Failure(th);
                                    if (Result.m4120exceptionOrNullimpl(failure) != null) {
                                    }
                                }
                            }
                            failure = Boolean.valueOf(z2);
                        } catch (Throwable th2) {
                            th = th2;
                            i8 = 1;
                        }
                        if (Result.m4120exceptionOrNullimpl(failure) != null) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            this.l.addUxpEvent("EEMMV", new String[0]);
                            failure = Boolean.FALSE;
                        }
                    } else {
                        i3 = 0;
                    }
                    i2 = i3;
                } else {
                    i8 = 1;
                }
            } else {
                i3 = 0;
                i8 = 1;
            }
            z = miSnapCameraInfo.a;
            cameraView = this.c;
            if (z && i2 != 0) {
                cameraView.l.observe(this.a, this.F);
            }
            cameraView.m.observe(this.a, new LiveDataUtil.b(2, this, miSnapController));
            this.d = miSnapController;
        }
        i2 = i8;
        z = miSnapCameraInfo.a;
        cameraView = this.c;
        if (z) {
            cameraView.l.observe(this.a, this.F);
        }
        cameraView.m.observe(this.a, new LiveDataUtil.b(2, this, miSnapController));
        this.d = miSnapController;
    }

    public final void a$1$2() {
        MiSnapController miSnapController = this.d;
        if (miSnapController != null) {
            miSnapController.n.removeObservers(this.a);
            miSnapController.v.removeObservers(this.a);
            miSnapController.u.removeObservers(this.a);
            StandaloneCoroutine standaloneCoroutine = miSnapController.w;
            if (standaloneCoroutine != null && standaloneCoroutine.isActive()) {
                standaloneCoroutine.cancel(null);
            }
            miSnapController.w = null;
            synchronized (ContextHelper.a) {
                ContextHelper.b.clear();
            }
            miSnapController.a.a();
            Context context = (Context) miSnapController.x.get();
            Object systemService = context != null ? context.getSystemService("display") : null;
            systemService.getClass();
            ((DisplayManager) systemService).unregisterDisplayListener(miSnapController.y);
            miSnapController.c();
            miSnapController.p = false;
            com.miteksystems.misnap.controller.a.d dVar = miSnapController.d;
            Sensor sensor = dVar.c;
            if (sensor != null) {
                dVar.a.unregisterListener(dVar.l, sensor);
            }
            dVar.d();
            p pVar = miSnapController.c;
            pVar.a.close();
            pVar.b = false;
            miSnapController.s.removeCallbacksAndMessages(miSnapController.t);
            miSnapController.r = false;
            miSnapController.q = true;
            MibiData.releaseSession(MiSnapController.class.getName());
        }
        this.h.c.removeObservers(this.a);
        this.c.l.removeObservers(this.a);
        this.c.m.removeObservers(this.a);
    }

    public final boolean b(MiSnapSettings miSnapSettings) {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MiSnapSettings.UseCase[]{MiSnapSettings.UseCase.FACE, MiSnapSettings.UseCase.BARCODE, MiSnapSettings.UseCase.CHECK_FRONT, MiSnapSettings.UseCase.CHECK_BACK});
        if (SVG$Unit$EnumUnboxingLocalUtility._isLowerThan(this.b) || listOf.contains(miSnapSettings.a)) {
            return false;
        }
        return DocumentAnalysisSettings.shouldEnableFocusOnFinalFrame(miSnapSettings.analysis.document);
    }

    public final void setBoundingBoxColor(int i2) {
        this.u = i2;
    }

    public final void setGlareBoxColor(int i2) {
        this.v = i2;
    }

    public final void setShowBoundingBox(boolean z) {
        this.s = z;
    }

    public final void setShowGlareBox(boolean z) {
        this.t = z;
    }

    public final void setTorchEnabled(boolean z, Function1<? super Boolean, Unit> function1) {
        this.f = false;
        this.c.setTorchEnabled(z, function1);
    }

    public final void startMiSnapSession(MiSnapSettings miSnapSettings, LifecycleOwner lifecycleOwner, Boolean bool, Function0 function0) {
        MiSnapCameraInfo miSnapCameraInfo;
        Unit unit;
        Unit unit2;
        function0.getClass();
        MiSnapSettings.Camera camera = miSnapSettings.camera;
        MiSnapSettings.UseCase useCase = miSnapSettings.a;
        MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
        MiSnapSettings.Camera.Advanced advanced = camera.advanced;
        if (advanced.a == null) {
            advanced.a = Boolean.valueOf(AnalysisSettings.shouldEnableAiBasedRts(analysis, useCase));
        }
        CameraView cameraView = this.c;
        MutableLiveData mutableLiveData = cameraView.p;
        MiSnapView$$ExternalSyntheticLambda0 miSnapView$$ExternalSyntheticLambda0 = this.r;
        mutableLiveData.removeObserver(miSnapView$$ExternalSyntheticLambda0);
        Lifecycle lifecycle = this.a.getLifecycle();
        CompositeGeneratedAdaptersObserver compositeGeneratedAdaptersObserver = this.E;
        lifecycle.removeObserver(compositeGeneratedAdaptersObserver);
        if (lifecycleOwner != null) {
            this.a = lifecycleOwner;
        }
        cameraView.p.observe(this.a, miSnapView$$ExternalSyntheticLambda0);
        this.a.getLifecycle().addObserver(compositeGeneratedAdaptersObserver);
        MibiData.bindSession();
        MiSnapCameraInfo miSnapCameraInfo2 = MibiData.c;
        if (miSnapCameraInfo2 != null) {
            boolean z = miSnapCameraInfo2.a;
            boolean z2 = miSnapCameraInfo2.b;
            boolean z3 = miSnapCameraInfo2.c;
            Size size = miSnapCameraInfo2.d;
            Size size2 = miSnapCameraInfo2.e;
            Size size3 = miSnapCameraInfo2.f;
            String str = miSnapCameraInfo2.g;
            String str2 = miSnapCameraInfo2.h;
            Size size4 = miSnapCameraInfo2.i;
            Size size5 = miSnapCameraInfo2.j;
            size.getClass();
            size2.getClass();
            size3.getClass();
            str.getClass();
            str2.getClass();
            miSnapCameraInfo = new MiSnapCameraInfo(z, z2, z3, size, size2, size3, str, str2, size4, size5);
        } else {
            miSnapCameraInfo = null;
        }
        if (MibiData.startSession(miSnapSettings, MiSnapView.class.getName())) {
            this.l = MibiData.bindSession();
            boolean isAutoTrigger = AnalysisSettings.isAutoTrigger(analysis, useCase);
            MibiData.Session session = this.l;
            if (isAutoTrigger) {
                session.getMetaData().b++;
            } else {
                session.getMetaData().c++;
            }
        } else {
            this.l = MibiData.bindSession();
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : !AnalysisSettings.isAutoTrigger(analysis, useCase);
        MiSnapSettings miSnapSettings2 = this.j;
        if (miSnapSettings2 != null) {
            if (miSnapCameraInfo != null) {
                if (Intrinsics.areEqual(miSnapSettings2.camera, camera) && Intrinsics.areEqual(this.k, Boolean.valueOf(booleanValue))) {
                    if (this.l.isCurrentSession()) {
                        MibiData.c = miSnapCameraInfo;
                    }
                    new Handler(Looper.getMainLooper()).post(new r6$$ExternalSyntheticLambda0(9, this, miSnapCameraInfo));
                    a(miSnapSettings, miSnapCameraInfo);
                    function0.invoke();
                } else {
                    a(miSnapSettings, booleanValue, function0);
                }
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                a(miSnapSettings, booleanValue, function0);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            a(miSnapSettings, booleanValue, function0);
        }
        this.j = miSnapSettings.m2165clone();
        this.k = Boolean.valueOf(booleanValue);
        this.p = useCase == MiSnapSettings.UseCase.FACE && AnalysisSettings.shouldEnableAiBasedRts(analysis, useCase);
    }

    public final void stopRecording() {
        CameraView cameraView = this.c;
        FrameProducer frameProducer = cameraView.f;
        if (frameProducer != null) {
            frameProducer.getVideoRecordings().observe(cameraView.a, new LiveDataUtil.b(1, cameraView, frameProducer));
            frameProducer.stopVideoRecording();
        }
    }

    public final void takePicture() {
        FrameProducer frameProducer;
        if (this.p) {
            this.q = true;
            return;
        }
        MiSnapSettings miSnapSettings = this.j;
        CameraView cameraView = this.c;
        Unit unit = null;
        if (miSnapSettings != null) {
            if (b(miSnapSettings)) {
                cameraView.startAutoFocus(null);
                FrameProducer frameProducer2 = cameraView.f;
                if (frameProducer2 != null) {
                    frameProducer2.takePicture();
                }
                this.l.addUxpEvent("MVFFF", new String[0]);
            } else {
                FrameProducer frameProducer3 = cameraView.f;
                if (frameProducer3 != null) {
                    frameProducer3.takePicture();
                }
            }
            unit = Unit.INSTANCE;
        }
        if (unit != null || (frameProducer = cameraView.f) == null) {
            return;
        }
        frameProducer.takePicture();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiSnapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiSnapView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiSnapView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ MiSnapView(Context context, AttributeSet attributeSet, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    public final void a(MiSnapSettings miSnapSettings, boolean z, Function0 function0) {
        CameraView cameraView = this.c;
        cameraView.p.observe(this.a, new c(miSnapSettings));
        MiSnapSettings.Camera camera = miSnapSettings.camera;
        camera.getClass();
        MiSnapSettings.Camera.TorchMode torchMode = camera.a;
        if (torchMode == null) {
            torchMode = MiSnapSettings.Camera.TorchMode.OFF;
        }
        int i2 = 0;
        this.f = torchMode == MiSnapSettings.Camera.TorchMode.AUTO;
        cameraView.startCamera(camera, this.a, z, new j(i2, function0));
    }
}
