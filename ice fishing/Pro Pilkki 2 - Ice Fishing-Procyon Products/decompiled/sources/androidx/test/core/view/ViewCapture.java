package androidx.test.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;
import androidx.test.core.internal.os.HandlerExecutor;
import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.os.ControlledLooper;
import androidx.test.internal.platform.reflect.ReflectionException;
import androidx.test.internal.platform.reflect.ReflectiveField;
import androidx.test.internal.platform.reflect.ReflectiveMethod;
import androidx.test.internal.util.Checks;
import androidx.test.platform.graphics.HardwareRendererCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.function.Consumer;
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
import kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: ViewCapture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a!\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a)\u0010\u0010\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0083@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0010\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0083@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0083@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\u0006*\u00020\u0004H\u0002\u001a\f\u0010\u0019\u001a\u00020\u0006*\u00020\u0004H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0013*\u00020\u0004H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"getControlledLooper", "Landroidx/test/internal/platform/os/ControlledLooper;", "captureToBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/View;", "rect", "Landroid/graphics/Rect;", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "captureToBitmapAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "forceRedraw", "", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateBitmap", "generateBitmapFromDraw", "destBitmap", "generateBitmapFromPixelCopy", "(Landroid/view/View;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "surface", "Landroid/view/Surface;", "(Landroid/view/View;Landroid/view/Surface;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateBitmapFromSurfaceViewPixelCopy", "Landroid/view/SurfaceView;", "(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoundsInSurface", "getBoundsInWindow", "getSurface", "reflectivelyGetLocationInSurface", "locationInSurface", "", "core_java_androidx_test_core-core_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewCapture {

    /* JADX INFO: renamed from: androidx.test.core.view.ViewCapture$captureToBitmap$1, reason: invalid class name */
    /* JADX INFO: compiled from: ViewCapture.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.test.core.view.ViewCapture", f = "ViewCapture.kt", i = {0, 0, 0, 1}, l = {93, 94}, m = "captureToBitmap", n = {"$this$captureToBitmap", "rect", "hardwareDrawingEnabled", "hardwareDrawingEnabled"}, s = {"L$0", "L$1", "Z$0", "Z$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ViewCapture.captureToBitmap(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.test.core.view.ViewCapture$forceRedraw$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ViewCapture.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.test.core.view.ViewCapture", f = "ViewCapture.kt", i = {0, 0}, l = {322}, m = "forceRedraw", n = {"$this$forceRedraw", "drawListener"}, s = {"L$0", "L$1"})
    static final class C00301 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00301(Continuation<? super C00301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ViewCapture.forceRedraw(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    public static final Object captureToBitmap(View view, Rect rect, Continuation<? super Bitmap> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        boolean zIsDrawingEnabled;
        View view2;
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
        try {
            if (i != 0) {
                if (i == 1) {
                    boolean z = anonymousClass1.Z$0;
                    rect = (Rect) anonymousClass1.L$1;
                    View view3 = (View) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj);
                    zIsDrawingEnabled = z;
                    view2 = view3;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = anonymousClass1.Z$0;
                    ResultKt.throwOnFailure(obj);
                    view = z2;
                }
                Bitmap bitmap = (Bitmap) obj;
                HardwareRendererCompat.setDrawingEnabled(view);
                Intrinsics.checkNotNull(bitmap);
                return bitmap;
            }
            ResultKt.throwOnFailure(obj);
            Checks.checkState(view.isAttachedToWindow(), "View must be attached to a window", new Object[0]);
            Checks.checkState(view.getHandler().getLooper().isCurrentThread(), "Must be called from view's handler thread. Current: " + Thread.currentThread().getName() + ", view handler: " + view.getHandler().getLooper().getThread().getName(), new Object[0]);
            zIsDrawingEnabled = HardwareRendererCompat.isDrawingEnabled();
            HardwareRendererCompat.setDrawingEnabled(true);
            try {
                anonymousClass1.L$0 = view;
                anonymousClass1.L$1 = rect;
                anonymousClass1.Z$0 = zIsDrawingEnabled;
                anonymousClass1.label = 1;
                Object objForceRedraw = forceRedraw(view, anonymousClass1);
                view2 = view;
                if (objForceRedraw == coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                th = th;
                view = zIsDrawingEnabled;
                HardwareRendererCompat.setDrawingEnabled(view);
                throw th;
            }
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.Z$0 = zIsDrawingEnabled;
            anonymousClass1.label = 2;
            Object objGenerateBitmap = generateBitmap(view2, rect, anonymousClass1);
            if (objGenerateBitmap != coroutine_suspended) {
                boolean z3 = zIsDrawingEnabled;
                obj = objGenerateBitmap;
                view = z3;
                Bitmap bitmap2 = (Bitmap) obj;
                HardwareRendererCompat.setDrawingEnabled(view);
                Intrinsics.checkNotNull(bitmap2);
                return bitmap2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ Object captureToBitmap$default(View view, Rect rect, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return captureToBitmap(view, rect, continuation);
    }

    private static final ControlledLooper getControlledLooper() {
        Object objLoadSingleService = ServiceLoaderWrapper.loadSingleService(ControlledLooper.class, new ServiceLoaderWrapper.Factory() { // from class: androidx.test.core.view.ViewCapture.getControlledLooper.1
            @Override // androidx.test.internal.platform.ServiceLoaderWrapper.Factory
            public final ControlledLooper create() {
                return ControlledLooper.NO_OP_CONTROLLED_LOOPER;
            }
        });
        Intrinsics.checkNotNullExpressionValue(objLoadSingleService, "loadSingleService(Contro…_OP_CONTROLLED_LOOPER\n  }");
        return (ControlledLooper) objLoadSingleService;
    }

    /* JADX INFO: renamed from: androidx.test.core.view.ViewCapture$captureToBitmapAsync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ViewCapture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.test.core.view.ViewCapture$captureToBitmapAsync$1", f = "ViewCapture.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    static final class C00291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Rect $rect;
        final /* synthetic */ View $this_captureToBitmapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00291(View view, Rect rect, Continuation<? super C00291> continuation) {
            super(2, continuation);
            this.$this_captureToBitmapAsync = view;
            this.$rect = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C00291(this.$this_captureToBitmapAsync, this.$rect, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C00291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.label = 1;
            Object objCaptureToBitmap = ViewCapture.captureToBitmap(this.$this_captureToBitmapAsync, this.$rect, this);
            return objCaptureToBitmap == coroutine_suspended ? coroutine_suspended : objCaptureToBitmap;
        }
    }

    public static /* synthetic */ ListenableFuture captureToBitmapAsync$default(View view, Rect rect, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return captureToBitmapAsync(view, rect);
    }

    public static final ListenableFuture<Bitmap> captureToBitmapAsync(View view, Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return SuspendToFutureAdapter.launchFuture$default(SuspendToFutureAdapter.INSTANCE, Dispatchers.getMain(), false, new C00291(view, rect, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.test.core.view.ViewCapture$forceRedraw$2$2] */
    public static final Object forceRedraw(View view, Continuation<? super Unit> continuation) throws Throwable {
        C00301 c00301;
        final View view2;
        final Ref.ObjectRef objectRef;
        Throwable th;
        if (continuation instanceof C00301) {
            c00301 = (C00301) continuation;
            if ((c00301.label & Integer.MIN_VALUE) != 0) {
                c00301.label -= Integer.MIN_VALUE;
            } else {
                c00301 = new C00301(continuation);
            }
        } else {
            c00301 = new C00301(continuation);
        }
        Object obj = c00301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00301.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Checks.checkState(view.getHandler().getLooper().isCurrentThread(), "Must be called from view's handler thread", new Object[0]);
            if (!getControlledLooper().areDrawCallbacksSupported()) {
                Log.i("ViewCapture", "Skipping forceRedraw as it is not supported");
                return Unit.INSTANCE;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                c00301.L$0 = view;
                c00301.L$1 = objectRef2;
                c00301.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c00301), 1);
                cancellableContinuationImpl.initCancellability();
                final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                if (Build.VERSION.SDK_INT >= 29 && view.isHardwareAccelerated()) {
                    view.getViewTreeObserver().registerFrameCommitCallback(new Runnable() { // from class: androidx.test.core.view.ViewCapture$forceRedraw$2$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Log.i("forceRedraw", "FrameCommitCallback complete");
                            CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m199constructorimpl(Unit.INSTANCE));
                        }
                    });
                } else {
                    objectRef2.element = new ViewTreeObserver.OnDrawListener() { // from class: androidx.test.core.view.ViewCapture$forceRedraw$2$2
                        private boolean handled;

                        public final boolean getHandled() {
                            return this.handled;
                        }

                        public final void setHandled(boolean z) {
                            this.handled = z;
                        }

                        @Override // android.view.ViewTreeObserver.OnDrawListener
                        public void onDraw() {
                            if (this.handled) {
                                return;
                            }
                            this.handled = true;
                            CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m199constructorimpl(Unit.INSTANCE));
                        }
                    };
                    view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener) objectRef2.element);
                }
                view.invalidate();
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c00301);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
                view2 = view;
                objectRef = objectRef2;
            } catch (Throwable th2) {
                view2 = view;
                objectRef = objectRef2;
                th = th2;
                if (objectRef.element != 0) {
                    view2.getHandler().post(new Runnable() { // from class: androidx.test.core.view.ViewCapture.forceRedraw.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            view2.getViewTreeObserver().removeOnDrawListener(objectRef.element);
                        }
                    });
                }
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c00301.L$1;
            view2 = (View) c00301.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                if (objectRef.element != 0) {
                    view2.getHandler().post(new Runnable() { // from class: androidx.test.core.view.ViewCapture.forceRedraw.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            view2.getViewTreeObserver().removeOnDrawListener(objectRef.element);
                        }
                    });
                }
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        if (objectRef.element != 0) {
            view2.getHandler().post(new Runnable() { // from class: androidx.test.core.view.ViewCapture.forceRedraw.3
                @Override // java.lang.Runnable
                public final void run() {
                    view2.getViewTreeObserver().removeOnDrawListener(objectRef.element);
                }
            });
        }
        return unit;
    }

    static /* synthetic */ Object generateBitmap$default(View view, Rect rect, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return generateBitmap(view, rect, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object generateBitmap(View view, Rect rect, Continuation<? super Bitmap> continuation) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect != null ? rect.width() : view.getWidth(), rect != null ? rect.height() : view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(rectWidth, … Bitmap.Config.ARGB_8888)");
        if (Build.VERSION.SDK_INT < 26) {
            return generateBitmapFromDraw(view, bitmapCreateBitmap, rect);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return generateBitmapFromPixelCopy(view, bitmapCreateBitmap, rect, continuation);
        }
        return view instanceof SurfaceView ? generateBitmapFromSurfaceViewPixelCopy((SurfaceView) view, bitmapCreateBitmap, rect, continuation) : generateBitmapFromPixelCopy(view, getSurface(view), bitmapCreateBitmap, rect, continuation);
    }

    public static final Bitmap generateBitmapFromDraw(View view, Bitmap destBitmap, Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(destBitmap, "destBitmap");
        destBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
        view.computeScroll();
        Canvas canvas = new Canvas(destBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        if (rect != null) {
            canvas.translate(-rect.left, -rect.top);
        }
        view.draw(canvas);
        return destBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getBoundsInWindow(View view) {
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getBoundsInSurface(View view) throws ReflectionException {
        int[] iArr = {0, 0};
        if (Build.VERSION.SDK_INT < 29) {
            reflectivelyGetLocationInSurface(view, iArr);
        } else {
            view.getLocationInSurface(iArr);
        }
        int i = iArr[0];
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
        Log.d("ViewCapture", "getBoundsInSurface " + rect);
        return rect;
    }

    private static final Surface getSurface(View view) throws ReflectionException {
        Object obj = new ReflectiveField("android.view.ViewRootImpl", "mSurface").get(new ReflectiveMethod((Class<?>) View.class, "getViewRootImpl", (Class<?>[]) new Class[0]).invoke(view, new Object[0]));
        Intrinsics.checkNotNullExpressionValue(obj, "ReflectiveField<Surface>…rface\").get(viewRootImpl)");
        return (Surface) obj;
    }

    private static final void reflectivelyGetLocationInSurface(View view, int[] iArr) throws ReflectionException {
        view.getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 28) {
            Rect rect = (Rect) new ReflectiveField((Class<?>) WindowManager.LayoutParams.class, "surfaceInsets").get((WindowManager.LayoutParams) new ReflectiveField("android.view.ViewRootImpl", "mWindowAttributes").get(new ReflectiveMethod((Class<?>) View.class, "getViewRootImpl", (Class<?>[]) new Class[0]).invoke(view, new Object[0])));
            iArr[0] = iArr[0] + rect.left;
            iArr[1] = iArr[1] + rect.top;
            return;
        }
        Log.w("ViewCapture", "Could not calculate offset of view in surface on API 28, resulting image may have incorrect positioning");
    }

    static /* synthetic */ Object generateBitmapFromPixelCopy$default(View view, Bitmap bitmap, Rect rect, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            rect = null;
        }
        return generateBitmapFromPixelCopy(view, bitmap, rect, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object generateBitmapFromSurfaceViewPixelCopy(SurfaceView surfaceView, final Bitmap bitmap, Rect rect, Continuation<? super Bitmap> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        PixelCopy.request(surfaceView, rect, bitmap, PathTreeWalk$$ExternalSyntheticApiModelOutline0.m((Object) new PixelCopy$OnPixelCopyFinishedListener() { // from class: androidx.test.core.view.ViewCapture$generateBitmapFromSurfaceViewPixelCopy$2$onCopyFinished$1
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    CancellableContinuation<Bitmap> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m199constructorimpl(bitmap));
                    return;
                }
                CancellableContinuation<Bitmap> cancellableContinuation2 = cancellableContinuationImpl2;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("PixelCopy failed: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                RuntimeException runtimeException = new RuntimeException(str);
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m199constructorimpl(ResultKt.createFailure(runtimeException)));
            }
        }), surfaceView.getHandler());
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object generateBitmapFromPixelCopy(View view, Surface surface, final Bitmap bitmap, Rect rect, Continuation<? super Bitmap> continuation) throws ReflectionException {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Rect boundsInSurface = getBoundsInSurface(view);
        if (rect != null) {
            boundsInSurface = new Rect(boundsInSurface.left + rect.left, boundsInSurface.top + rect.top, boundsInSurface.left + rect.right, boundsInSurface.top + rect.bottom);
        }
        PixelCopy.request(surface, boundsInSurface, bitmap, PathTreeWalk$$ExternalSyntheticApiModelOutline0.m((Object) new PixelCopy$OnPixelCopyFinishedListener() { // from class: androidx.test.core.view.ViewCapture$generateBitmapFromPixelCopy$2$onCopyFinished$1
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    CancellableContinuation<Bitmap> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m199constructorimpl(bitmap));
                } else {
                    CancellableContinuation<Bitmap> cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m199constructorimpl(ResultKt.createFailure(new RuntimeException("PixelCopy failed: " + i))));
                }
            }
        }), new Handler(Looper.getMainLooper()));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object generateBitmapFromPixelCopy(View view, Bitmap bitmap, Rect rect, Continuation<? super Bitmap> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        PixelCopy.Request.Builder builderOfWindow = PixelCopy.Request.Builder.ofWindow(view);
        if (rect == null) {
            rect = getBoundsInWindow(view);
        }
        PixelCopy.Request requestBuild = builderOfWindow.setSourceRect(rect).setDestinationBitmap(bitmap).build();
        Intrinsics.checkNotNullExpressionValue(requestBuild, "ofWindow(this)\n        .…tBitmap)\n        .build()");
        Consumer consumerM112m = HalfKt$$ExternalSyntheticApiModelOutline0.m112m((Object) new Consumer() { // from class: androidx.test.core.view.ViewCapture$generateBitmapFromPixelCopy$4$onCopyFinished$1
            @Override // java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                accept(PathTreeWalk$$ExternalSyntheticApiModelOutline0.m1424m(obj));
            }

            public final void accept(PixelCopy.Result result) {
                if (result.getStatus() == 0) {
                    CancellableContinuation<Bitmap> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m199constructorimpl(result.getBitmap()));
                } else {
                    CancellableContinuation<Bitmap> cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m199constructorimpl(ResultKt.createFailure(new RuntimeException("PixelCopy failed: $(result.status)"))));
                }
            }
        });
        Handler handler = view.getHandler();
        Intrinsics.checkNotNullExpressionValue(handler, "handler");
        PixelCopy.request(requestBuild, new HandlerExecutor(handler), consumerM112m);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
