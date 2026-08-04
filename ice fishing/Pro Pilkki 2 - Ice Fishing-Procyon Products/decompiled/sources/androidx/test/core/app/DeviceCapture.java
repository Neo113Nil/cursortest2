package androidx.test.core.app;

import android.app.UiAutomation;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.test.core.internal.os.HandlerExecutor;
import androidx.test.core.view.ViewCapture;
import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.platform.graphics.HardwareRendererCompat;
import androidx.test.platform.view.inspector.WindowInspectorCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: DeviceCapture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\b\u0010\u0007\u001a\u00020\u0006H\u0007\u001a!\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"canTakeScreenshot", "", "forceRedrawGlobalWindowViews", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "takeScreenshot", "Landroid/graphics/Bitmap;", "takeScreenshotNoSync", "takeScreenshotOnNextFrame", "uiAutomation", "Landroid/app/UiAutomation;", "hardwareDrawingEnabled", "(Landroid/app/UiAutomation;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_java_androidx_test_core-core_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DeviceCapture {

    /* JADX INFO: renamed from: androidx.test.core.app.DeviceCapture$forceRedrawGlobalWindowViews$1, reason: invalid class name */
    /* JADX INFO: compiled from: DeviceCapture.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.test.core.app.DeviceCapture", f = "DeviceCapture.kt", i = {}, l = {126}, m = "forceRedrawGlobalWindowViews", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceCapture.forceRedrawGlobalWindowViews(this);
        }
    }

    public static final boolean canTakeScreenshot() {
        return (InstrumentationRegistry.getInstrumentation().getUiAutomation() == null || Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) ? false : true;
    }

    public static final Bitmap takeScreenshot() throws RuntimeException {
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        return takeScreenshotNoSync();
    }

    public static final Bitmap takeScreenshotNoSync() throws RuntimeException {
        Checks.checkState(canTakeScreenshot());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        CoroutineDispatcher coroutineDispatcherFrom = ExecutorsKt.from(new HandlerExecutor(new Handler(Looper.getMainLooper())));
        UiAutomation uiAutomation = InstrumentationRegistry.getInstrumentation().getUiAutomation();
        if (uiAutomation == null) {
            throw new RuntimeException("uiautomation is null");
        }
        boolean zIsDrawingEnabled = HardwareRendererCompat.isDrawingEnabled();
        HardwareRendererCompat.setDrawingEnabled(true);
        return (Bitmap) BuildersKt.runBlocking(coroutineDispatcherFrom, new C00281(objectRef, uiAutomation, zIsDrawingEnabled, objectRef2, null));
    }

    /* JADX INFO: renamed from: androidx.test.core.app.DeviceCapture$takeScreenshotNoSync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DeviceCapture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.test.core.app.DeviceCapture$takeScreenshotNoSync$1", f = "DeviceCapture.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    static final class C00281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Ref.ObjectRef<Bitmap> $bitmap;
        final /* synthetic */ Ref.ObjectRef<Exception> $exception;
        final /* synthetic */ boolean $hardwareDrawingEnabled;
        final /* synthetic */ UiAutomation $uiAutomation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00281(Ref.ObjectRef<Bitmap> objectRef, UiAutomation uiAutomation, boolean z, Ref.ObjectRef<Exception> objectRef2, Continuation<? super C00281> continuation) {
            super(2, continuation);
            this.$bitmap = objectRef;
            this.$uiAutomation = uiAutomation;
            this.$hardwareDrawingEnabled = z;
            this.$exception = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C00281(this.$bitmap, this.$uiAutomation, this.$hardwareDrawingEnabled, this.$exception, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C00281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.test.core.app.DeviceCapture$takeScreenshotNoSync$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: DeviceCapture.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.test.core.app.DeviceCapture$takeScreenshotNoSync$1$1", f = "DeviceCapture.kt", i = {}, l = {114, 115}, m = "invokeSuspend", n = {}, s = {})
        static final class C00011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
            final /* synthetic */ Ref.ObjectRef<Bitmap> $bitmap;
            final /* synthetic */ Ref.ObjectRef<Exception> $exception;
            final /* synthetic */ boolean $hardwareDrawingEnabled;
            final /* synthetic */ UiAutomation $uiAutomation;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00011(Ref.ObjectRef<Bitmap> objectRef, UiAutomation uiAutomation, boolean z, Ref.ObjectRef<Exception> objectRef2, Continuation<? super C00011> continuation) {
                super(2, continuation);
                this.$bitmap = objectRef;
                this.$uiAutomation = uiAutomation;
                this.$hardwareDrawingEnabled = z;
                this.$exception = objectRef2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00011(this.$bitmap, this.$uiAutomation, this.$hardwareDrawingEnabled, this.$exception, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
                return ((C00011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0056  */
            /* JADX WARN: Code duplicated, block: B:21:0x005e  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Exception {
                Ref.ObjectRef<Bitmap> objectRef;
                T t;
                Exception exc;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef = (Ref.ObjectRef) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        t = obj;
                    }
                    objectRef.element = t;
                    exc = this.$exception.element;
                    if (exc == null) {
                        throw exc;
                    }
                    Bitmap bitmap = this.$bitmap.element;
                    Intrinsics.checkNotNull(bitmap);
                    return bitmap;
                }
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DeviceCapture.forceRedrawGlobalWindowViews(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
                Ref.ObjectRef<Bitmap> objectRef2 = this.$bitmap;
                UiAutomation uiAutomation = this.$uiAutomation;
                Intrinsics.checkNotNullExpressionValue(uiAutomation, "uiAutomation");
                this.L$0 = objectRef2;
                this.label = 2;
                Object objTakeScreenshotOnNextFrame = DeviceCapture.takeScreenshotOnNextFrame(uiAutomation, this.$hardwareDrawingEnabled, this);
                if (objTakeScreenshotOnNextFrame != coroutine_suspended) {
                    objectRef = objectRef2;
                    t = objTakeScreenshotOnNextFrame;
                    objectRef.element = t;
                    exc = this.$exception.element;
                    if (exc == null) {
                        throw exc;
                    }
                    Bitmap bitmap2 = this.$bitmap.element;
                    Intrinsics.checkNotNull(bitmap2);
                    return bitmap2;
                }
                return coroutine_suspended;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.INSTANCE;
            this.label = 1;
            Object objM1762withTimeoutKLykuaI = TimeoutKt.m1762withTimeoutKLykuaI(DurationKt.toDuration(5, DurationUnit.SECONDS), new C00011(this.$bitmap, this.$uiAutomation, this.$hardwareDrawingEnabled, this.$exception, null), this);
            return objM1762withTimeoutKLykuaI == coroutine_suspended ? coroutine_suspended : objM1762withTimeoutKLykuaI;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object forceRedrawGlobalWindowViews(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Iterator<View> it;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<View> globalWindowViews = WindowInspectorCompat.getGlobalWindowViews();
            Log.d("DeviceCapture", "Found " + globalWindowViews.size() + " global views to redraw");
            it = globalWindowViews.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            View view = it.next();
            Intrinsics.checkNotNullExpressionValue(view, "view");
            anonymousClass1.L$0 = it;
            anonymousClass1.label = 1;
            if (ViewCapture.forceRedraw(view, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object takeScreenshotOnNextFrame(final UiAutomation uiAutomation, final boolean z, Continuation<? super Bitmap> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.test.core.app.DeviceCapture$takeScreenshotOnNextFrame$2$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Bitmap bitmapTakeScreenshot = null;
                for (int i = 1; i < 4; i++) {
                    bitmapTakeScreenshot = uiAutomation.takeScreenshot();
                    if (bitmapTakeScreenshot != null) {
                        Log.i("DeviceCapture", "got bitmap, returning");
                        break;
                    }
                }
                HardwareRendererCompat.setDrawingEnabled(z);
                if (bitmapTakeScreenshot == null) {
                    Log.w("DeviceCapture", "failed to get bitmap, returning exception");
                    CancellableContinuation<Bitmap> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m199constructorimpl(ResultKt.createFailure(new RuntimeException("uiAutomation.takeScreenshot returned null"))));
                    return;
                }
                cancellableContinuationImpl2.resume(bitmapTakeScreenshot, new Function1<Throwable, Unit>() { // from class: androidx.test.core.app.DeviceCapture$takeScreenshotOnNextFrame$2$1.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                });
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
