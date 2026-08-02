package com.miteksystems.misnap.camera.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.SurfaceOrientedMeteringPointFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.view.PreviewView;
import androidx.core.provider.FontsContractCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import com.google.common.base.Splitter;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.camera.R$styleable;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.FrameLoader;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.camera.util.CameraUtil$WhenMappings;
import com.miteksystems.misnap.camera.view.CameraView;
import com.miteksystems.misnap.camera.view.CameraView.d;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.internal.ContextHelper;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.Json;
import net.idrnd.face.iad.capture.internal.s;

/* loaded from: classes4.dex */
public final class CameraView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public LifecycleOwner a;
    public final PreviewView b;
    public final a c;
    public SurfaceView d;
    public final View e;
    public FrameProducer f;
    public SurfaceOrientedMeteringPointFactory g;
    public Point h;
    public CameraView$$ExternalSyntheticLambda0 i;
    public boolean j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final MutableLiveData p;

    public static final class a extends View {
        public Size a;
        public Size b;
        public LinkedHashMap c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            context.getClass();
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            Size size;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            canvas.getClass();
            super.onDraw(canvas);
            if (this.a == null || (size = this.b) == null) {
                return;
            }
            float width = size.getWidth() / r1.getWidth();
            float height = size.getHeight() / r1.getHeight();
            LinkedHashMap linkedHashMap = this.c;
            if (linkedHashMap != null) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    int[][] iArr = (int[][]) entry.getKey();
                    Paint paint = (Paint) entry.getValue();
                    try {
                        Result.Companion companion = Result.Companion;
                        int[] iArr2 = iArr[0];
                        f = iArr2[0] * width;
                        f2 = iArr2[1] * height;
                        int[] iArr3 = iArr[1];
                        f3 = iArr3[0] * width;
                        f4 = iArr3[1] * height;
                        int[] iArr4 = iArr[2];
                        f5 = iArr4[0] * width;
                        f6 = iArr4[1] * height;
                        int[] iArr5 = iArr[3];
                        f7 = iArr5[0] * width;
                        f8 = iArr5[1] * height;
                    } catch (Throwable unused) {
                    }
                    try {
                        canvas.drawLines(new float[]{f, f2, f3, f4, f3, f4, f5, f6, f5, f6, f7, f8, f7, f8, f, f2}, paint);
                    } catch (Throwable unused2) {
                        Result.Companion companion2 = Result.Companion;
                    }
                }
            }
        }
    }

    public abstract /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MiSnapSettings.Camera.TorchMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[Lifecycle.Event.values().length];
            try {
                iArr2[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public final class d implements Observer {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ MiSnapSettings.Camera.VideoRecord d;
        public final /* synthetic */ Function0 e;

        public d(boolean z, boolean z2, MiSnapSettings.Camera.VideoRecord videoRecord, Function0 function0) {
            this.b = z;
            this.c = z2;
            this.d = videoRecord;
            this.e = function0;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            FrameProducer frameProducer;
            MutableLiveData frameProducerEvents;
            FrameProducer.Event event = (FrameProducer.Event) obj;
            if (event != null) {
                boolean z = event instanceof FrameProducer.Event.CameraInitialized;
                CameraView cameraView = CameraView.this;
                if (!z) {
                    if (event.equals(FrameProducer.Event.CameraReady.INSTANCE)) {
                        FrameProducer frameProducer2 = cameraView.f;
                        if (frameProducer2 != null && (frameProducerEvents = frameProducer2.getFrameProducerEvents()) != null) {
                            frameProducerEvents.removeObserver(this);
                        }
                        FrameProducer frameProducer3 = cameraView.f;
                        if (frameProducer3 != null) {
                            FrameProducer.DefaultImpls.setTorchEnabled$default(frameProducer3, this.c, null, 2, null);
                        }
                        if (s.shouldRecordSession(this.d) && (frameProducer = cameraView.f) != null) {
                            frameProducer.startVideoRecording();
                        }
                        this.e.invoke();
                        return;
                    }
                    return;
                }
                FrameProducer frameProducer4 = cameraView.f;
                boolean z2 = frameProducer4 instanceof CameraWrapper;
                boolean z3 = this.b;
                if (z2) {
                    PreviewView previewView = cameraView.b;
                    previewView.getClass();
                    Threads.checkMainThread();
                    PreviewView.AnonymousClass1 anonymousClass1 = previewView.mSurfaceProvider;
                    anonymousClass1.getClass();
                    ((CameraWrapper) frameProducer4).startPreview(anonymousClass1, z3);
                } else if (frameProducer4 != null) {
                    SurfaceView surfaceView = cameraView.d;
                    if (surfaceView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
                        throw null;
                    }
                    SurfaceHolder holder = surfaceView.getHolder();
                    holder.getClass();
                    frameProducer4.startPreview(holder, z3);
                }
                cameraView.postDelayed(new r6$$ExternalSyntheticLambda0(7, cameraView, event), 150L);
            }
        }
    }

    public final class e extends Lambda implements Function0 {
        public static final e a = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.INSTANCE;
        }
    }

    public final class f implements Observer {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ CameraView a;

        public /* synthetic */ f(CameraView cameraView, int i) {
            this.$r8$classId = i;
            this.a = cameraView;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            int i = this.$r8$classId;
            CameraView cameraView = this.a;
            switch (i) {
                case 0:
                    Frame frame = (Frame) obj;
                    MutableLiveData mutableLiveData = cameraView.l;
                    if (!Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                        mutableLiveData.postValue(frame);
                        break;
                    } else {
                        mutableLiveData.setValue(frame);
                        break;
                    }
                case 1:
                    Frame frame2 = (Frame) obj;
                    MutableLiveData mutableLiveData2 = cameraView.m;
                    if (!Recorder$$ExternalSyntheticOutline1.m(mutableLiveData2)) {
                        mutableLiveData2.postValue(frame2);
                        break;
                    } else {
                        mutableLiveData2.setValue(frame2);
                        break;
                    }
                case 2:
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    MutableLiveData mutableLiveData3 = cameraView.n;
                    if (!Recorder$$ExternalSyntheticOutline1.m(mutableLiveData3)) {
                        mutableLiveData3.postValue(bool);
                        break;
                    } else {
                        mutableLiveData3.setValue(bool);
                        break;
                    }
                case 3:
                    Boolean bool2 = (Boolean) obj;
                    bool2.getClass();
                    MutableLiveData mutableLiveData4 = cameraView.o;
                    if (!Recorder$$ExternalSyntheticOutline1.m(mutableLiveData4)) {
                        mutableLiveData4.postValue(bool2);
                        break;
                    } else {
                        mutableLiveData4.setValue(bool2);
                        break;
                    }
                default:
                    FrameProducer.Event event = (FrameProducer.Event) obj;
                    MutableLiveData mutableLiveData5 = cameraView.p;
                    if (!Recorder$$ExternalSyntheticOutline1.m(mutableLiveData5)) {
                        mutableLiveData5.postValue(event);
                        break;
                    } else {
                        mutableLiveData5.setValue(event);
                        break;
                    }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        Object obj = context;
        while (obj != null && !(obj instanceof LifecycleOwner)) {
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
        View inflate = LayoutInflater.from(context).inflate(R.layout.camera_view_cameraview, this);
        inflate.getClass();
        this.e = inflate;
        this.k = new MutableLiveData();
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.p = new MutableLiveData();
        View findViewById = inflate.findViewById(R.id.previewView);
        findViewById.getClass();
        this.b = (PreviewView) findViewById;
        a aVar = new a(context);
        addView(aVar);
        this.c = aVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CameraView, i, i2);
        try {
            MiSnapSettings.Camera camera = new MiSnapSettings.Camera();
            int i3 = obtainStyledAttributes.getInt(0, -1);
            camera.b = (MiSnapSettings.Camera.Profile.values().length <= i3 || i3 < 0) ? null : MiSnapSettings.Camera.Profile.values()[i3];
            camera.a = obtainStyledAttributes.getBoolean(4, false) ? MiSnapSettings.Camera.TorchMode.ON : MiSnapSettings.Camera.TorchMode.OFF;
            MiSnapSettings.Camera.VideoRecord videoRecord = camera.videoRecord;
            videoRecord.a = Boolean.valueOf(obtainStyledAttributes.getBoolean(2, false));
            videoRecord.b = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, false));
            videoRecord.e = Integer.valueOf(obtainStyledAttributes.getInt(5, s.getVideoBitrate(videoRecord)));
            videoRecord.d = new Size(obtainStyledAttributes.getInt(8, s.getVideoResolution(videoRecord).getWidth()), obtainStyledAttributes.getInt(6, s.getVideoResolution(videoRecord).getHeight()));
            int i4 = obtainStyledAttributes.getInt(7, s.getVideoQuality(videoRecord).ordinal());
            videoRecord.c = (MiSnapSettings.Camera.VideoRecord.VideoQuality.values().length <= i4 || i4 < 0) ? null : MiSnapSettings.Camera.VideoRecord.VideoQuality.values()[i4];
            if (camera.b != null) {
                startCamera(camera, null, obtainStyledAttributes.getBoolean(3, true), e.a);
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTorchEnabled$default(CameraView cameraView, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        cameraView.setTorchEnabled(z, function1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.j = true;
        }
        if (motionEvent.getAction() == 1) {
            startAutoFocus(new Point((int) motionEvent.getX(), (int) motionEvent.getY()));
            if (this.j) {
                this.j = false;
                performClick();
            }
        }
        return true;
    }

    public final void setTorchEnabled(boolean z, Function1<? super Boolean, Unit> function1) {
        FrameProducer frameProducer = this.f;
        if (frameProducer != null) {
            frameProducer.setTorchEnabled(z, function1);
        }
    }

    public final void startAutoFocus(Point point) {
        SurfaceOrientedMeteringPointFactory surfaceOrientedMeteringPointFactory;
        FrameProducer frameProducer;
        if (point == null) {
            point = this.h;
        }
        if (point == null || (surfaceOrientedMeteringPointFactory = this.g) == null || (frameProducer = this.f) == null) {
            return;
        }
        PointF pointF = new PointF(point.x / surfaceOrientedMeteringPointFactory.mWidth, point.y / surfaceOrientedMeteringPointFactory.mHeight);
        float f2 = pointF.x;
        float f3 = pointF.y;
        Rational rational = (Rational) surfaceOrientedMeteringPointFactory.data;
        MeteringPoint meteringPoint = new MeteringPoint();
        meteringPoint.mNormalizedX = f2;
        meteringPoint.mNormalizedY = f3;
        meteringPoint.mSize = 0.5f;
        meteringPoint.mSurfaceAspectRatio = rational;
        frameProducer.requestAutoFocus(meteringPoint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LifecycleObserver, com.miteksystems.misnap.camera.view.CameraView$$ExternalSyntheticLambda0] */
    public final void startCamera(final MiSnapSettings.Camera camera, LifecycleOwner lifecycleOwner, final boolean z, final Function0 function0) {
        final boolean z2;
        FrameProducer cameraWrapper;
        camera.getClass();
        function0.getClass();
        if (lifecycleOwner != null) {
            this.a = lifecycleOwner;
        }
        FrameProducer frameProducer = this.f;
        if (frameProducer != null) {
            frameProducer.release();
        }
        int i = 3;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        if (this.f == null) {
            Context context = getContext();
            context.getClass();
            LifecycleOwner lifecycleOwner2 = this.a;
            MiSnapSettings.Camera.Advanced.FrameInjection frameInjection = camera.advanced.b;
            if (frameInjection != null) {
                Object obj = ContextHelper.a;
                ContextHelper.add(Boolean.TRUE, "9");
                cameraWrapper = new FrameLoader(context, frameInjection);
            } else {
                cameraWrapper = new CameraWrapper(context, lifecycleOwner2, camera);
            }
            cameraWrapper.getPreviewFrames().observe(this.a, new f(this, i3));
            cameraWrapper.getPictureFrames().observe(this.a, new f(this, i4));
            cameraWrapper.getFocusingEvents().observe(this.a, new f(this, i2));
            cameraWrapper.getTorchEvents().observe(this.a, new f(this, i));
            cameraWrapper.getFrameProducerEvents().observe(this.a, new f(this, 4));
            this.f = cameraWrapper;
            if (cameraWrapper instanceof FrameLoader) {
                SurfaceView surfaceView = new SurfaceView(getContext());
                this.d = surfaceView;
                addView(surfaceView);
            }
        }
        CameraView$$ExternalSyntheticLambda0 cameraView$$ExternalSyntheticLambda0 = this.i;
        if (cameraView$$ExternalSyntheticLambda0 != null) {
            this.a.getLifecycle().removeObserver(cameraView$$ExternalSyntheticLambda0);
        }
        MiSnapSettings.Camera.VideoRecord videoRecord = camera.videoRecord;
        videoRecord.getClass();
        Json.Default r4 = Json.Default;
        r4.getClass();
        MiSnapSettings.Camera.VideoRecord.Companion companion = MiSnapSettings.Camera.VideoRecord.Companion;
        final MiSnapSettings.Camera.VideoRecord videoRecord2 = (MiSnapSettings.Camera.VideoRecord) r4.decodeFromString(r4.encodeToString(companion.serializer(), videoRecord), companion.serializer());
        MiSnapSettings.Camera.TorchMode torchMode = camera.a;
        if (torchMode == null) {
            torchMode = MiSnapSettings.Camera.TorchMode.OFF;
        }
        int i5 = c.a[torchMode.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                z2 = true;
                ?? r42 = new LifecycleEventObserver() { // from class: com.miteksystems.misnap.camera.view.CameraView$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                        CameraSelectorFilter splitter;
                        MutableLiveData frameProducerEvents;
                        int i6 = CameraView.$r8$clinit;
                        MiSnapSettings.Camera.VideoRecord videoRecord3 = videoRecord2;
                        videoRecord3.getClass();
                        Function0 function02 = function0;
                        function02.getClass();
                        MiSnapSettings.Camera camera2 = camera;
                        camera2.getClass();
                        int i7 = CameraView.c.b[event.ordinal()];
                        CameraView cameraView = CameraView.this;
                        if (i7 != 1) {
                            if (i7 != 2) {
                                return;
                            }
                            CameraView.a aVar = cameraView.c;
                            aVar.a = null;
                            aVar.b = null;
                            aVar.c = null;
                            FrameProducer frameProducer2 = cameraView.f;
                            if (frameProducer2 != null) {
                                frameProducer2.release();
                                return;
                            }
                            return;
                        }
                        FrameProducer frameProducer3 = cameraView.f;
                        if (frameProducer3 != null && (frameProducerEvents = frameProducer3.getFrameProducerEvents()) != null) {
                            frameProducerEvents.observe(cameraView.a, cameraView.new d(z, z2, videoRecord3, function02));
                        }
                        FrameProducer frameProducer4 = cameraView.f;
                        if (frameProducer4 != null) {
                            int i8 = CameraUtil$WhenMappings.$EnumSwitchMapping$0[s.requireProfile(camera2).ordinal()];
                            if (i8 == 1) {
                                splitter = new Splitter(camera2);
                            } else if (i8 == 2) {
                                splitter = new DefaultTsPayloadReaderFactory();
                            } else {
                                if (i8 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                splitter = new FontsContractCompat.FontFamilyResult(2);
                            }
                            frameProducer4.openCameraInstance(splitter);
                        }
                    }
                };
                this.i = r42;
                this.a.getLifecycle().addObserver(r42);
            }
            if (i5 != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        z2 = false;
        ?? r422 = new LifecycleEventObserver() { // from class: com.miteksystems.misnap.camera.view.CameraView$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                CameraSelectorFilter splitter;
                MutableLiveData frameProducerEvents;
                int i6 = CameraView.$r8$clinit;
                MiSnapSettings.Camera.VideoRecord videoRecord3 = videoRecord2;
                videoRecord3.getClass();
                Function0 function02 = function0;
                function02.getClass();
                MiSnapSettings.Camera camera2 = camera;
                camera2.getClass();
                int i7 = CameraView.c.b[event.ordinal()];
                CameraView cameraView = CameraView.this;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return;
                    }
                    CameraView.a aVar = cameraView.c;
                    aVar.a = null;
                    aVar.b = null;
                    aVar.c = null;
                    FrameProducer frameProducer2 = cameraView.f;
                    if (frameProducer2 != null) {
                        frameProducer2.release();
                        return;
                    }
                    return;
                }
                FrameProducer frameProducer3 = cameraView.f;
                if (frameProducer3 != null && (frameProducerEvents = frameProducer3.getFrameProducerEvents()) != null) {
                    frameProducerEvents.observe(cameraView.a, cameraView.new d(z, z2, videoRecord3, function02));
                }
                FrameProducer frameProducer4 = cameraView.f;
                if (frameProducer4 != null) {
                    int i8 = CameraUtil$WhenMappings.$EnumSwitchMapping$0[s.requireProfile(camera2).ordinal()];
                    if (i8 == 1) {
                        splitter = new Splitter(camera2);
                    } else if (i8 == 2) {
                        splitter = new DefaultTsPayloadReaderFactory();
                    } else {
                        if (i8 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        splitter = new FontsContractCompat.FontFamilyResult(2);
                    }
                    frameProducer4.openCameraInstance(splitter);
                }
            }
        };
        this.i = r422;
        this.a.getLifecycle().addObserver(r422);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ CameraView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
