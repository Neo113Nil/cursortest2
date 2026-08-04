package androidx.test.core.view;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import android.view.Window;
import androidx.test.platform.graphics.HardwareRendererCompat;
import com.google.common.util.concurrent.ListenableFuture;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: WindowCapture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a!\u0010\b\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a)\u0010\t\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"captureRegionToBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/Window;", "boundsInWindow", "Landroid/graphics/Rect;", "(Landroid/view/Window;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "captureRegionToBitmapAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "generateBitmap", "generateBitmapFromPixelCopy", "destBitmap", "(Landroid/view/Window;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_java_androidx_test_core-core_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WindowCapture {

    /* JADX INFO: renamed from: androidx.test.core.view.WindowCapture$captureRegionToBitmap$1, reason: invalid class name */
    /* JADX INFO: compiled from: WindowCapture.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.test.core.view.WindowCapture", f = "WindowCapture.kt", i = {0, 0, 0, 1}, l = {57, 58}, m = "captureRegionToBitmap", n = {"$this$captureRegionToBitmap", "boundsInWindow", "hardwareDrawingEnabled", "hardwareDrawingEnabled"}, s = {"L$0", "L$1", "Z$0", "Z$0"})
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
            return WindowCapture.captureRegionToBitmap(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.test.core.view.WindowCapture$generateBitmap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WindowCapture.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.test.core.view.WindowCapture", f = "WindowCapture.kt", i = {0}, l = {84}, m = "generateBitmap", n = {"destBitmap"}, s = {"L$0"})
    static final class C00331 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00331(Continuation<? super C00331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WindowCapture.generateBitmap(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    public static final Object captureRegionToBitmap(Window window, Rect rect, Continuation<? super Bitmap> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        boolean zIsDrawingEnabled;
        Window window2;
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
                    Window window3 = (Window) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj);
                    zIsDrawingEnabled = z;
                    window2 = window3;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = anonymousClass1.Z$0;
                    ResultKt.throwOnFailure(obj);
                    window = z2;
                }
                Bitmap bitmap = (Bitmap) obj;
                HardwareRendererCompat.setDrawingEnabled(window);
                Intrinsics.checkNotNull(bitmap);
                return bitmap;
            }
            ResultKt.throwOnFailure(obj);
            zIsDrawingEnabled = HardwareRendererCompat.isDrawingEnabled();
            HardwareRendererCompat.setDrawingEnabled(true);
            try {
                View decorView = window.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "decorView");
                anonymousClass1.L$0 = window;
                anonymousClass1.L$1 = rect;
                anonymousClass1.Z$0 = zIsDrawingEnabled;
                anonymousClass1.label = 1;
                window2 = window;
                if (ViewCapture.forceRedraw(decorView, anonymousClass1) == coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                th = th;
                window = zIsDrawingEnabled;
                HardwareRendererCompat.setDrawingEnabled(window);
                throw th;
            }
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.Z$0 = zIsDrawingEnabled;
            anonymousClass1.label = 2;
            Object objGenerateBitmap = generateBitmap(window2, rect, anonymousClass1);
            if (objGenerateBitmap != coroutine_suspended) {
                boolean z3 = zIsDrawingEnabled;
                obj = objGenerateBitmap;
                window = z3;
                Bitmap bitmap2 = (Bitmap) obj;
                HardwareRendererCompat.setDrawingEnabled(window);
                Intrinsics.checkNotNull(bitmap2);
                return bitmap2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ Object captureRegionToBitmap$default(Window window, Rect rect, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return captureRegionToBitmap(window, rect, continuation);
    }

    /* JADX INFO: renamed from: androidx.test.core.view.WindowCapture$captureRegionToBitmapAsync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WindowCapture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.test.core.view.WindowCapture$captureRegionToBitmapAsync$1", f = "WindowCapture.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class C00321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Rect $boundsInWindow;
        final /* synthetic */ Window $this_captureRegionToBitmapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00321(Window window, Rect rect, Continuation<? super C00321> continuation) {
            super(2, continuation);
            this.$this_captureRegionToBitmapAsync = window;
            this.$boundsInWindow = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C00321(this.$this_captureRegionToBitmapAsync, this.$boundsInWindow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C00321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Object objCaptureRegionToBitmap = WindowCapture.captureRegionToBitmap(this.$this_captureRegionToBitmapAsync, this.$boundsInWindow, this);
            return objCaptureRegionToBitmap == coroutine_suspended ? coroutine_suspended : objCaptureRegionToBitmap;
        }
    }

    public static /* synthetic */ ListenableFuture captureRegionToBitmapAsync$default(Window window, Rect rect, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return captureRegionToBitmapAsync(window, rect);
    }

    public static final ListenableFuture<Bitmap> captureRegionToBitmapAsync(Window window, Rect rect) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        return SuspendToFutureAdapter.launchFuture$default(SuspendToFutureAdapter.INSTANCE, Dispatchers.getMain(), false, new C00321(window, rect, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object generateBitmap(Window window, Rect rect, Continuation<? super Bitmap> continuation) throws Throwable {
        C00331 c00331;
        if (continuation instanceof C00331) {
            c00331 = (C00331) continuation;
            if ((c00331.label & Integer.MIN_VALUE) != 0) {
                c00331.label -= Integer.MIN_VALUE;
            } else {
                c00331 = new C00331(continuation);
            }
        } else {
            c00331 = new C00331(continuation);
        }
        Object obj = c00331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00331.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap = (Bitmap) c00331.L$0;
            ResultKt.throwOnFailure(obj);
            return bitmap;
        }
        ResultKt.throwOnFailure(obj);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect != null ? rect.width() : window.getDecorView().getWidth(), rect != null ? rect.height() : window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n      boun…p.Config.ARGB_8888,\n    )");
        if (Build.VERSION.SDK_INT < 26) {
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "decorView");
            ViewCapture.generateBitmapFromDraw(decorView, bitmapCreateBitmap, rect);
            return bitmapCreateBitmap;
        }
        c00331.L$0 = bitmapCreateBitmap;
        c00331.label = 1;
        return generateBitmapFromPixelCopy(window, rect, bitmapCreateBitmap, c00331) == coroutine_suspended ? coroutine_suspended : bitmapCreateBitmap;
    }

    public static /* synthetic */ Object generateBitmap$default(Window window, Rect rect, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return generateBitmap(window, rect, continuation);
    }

    public static /* synthetic */ Object generateBitmapFromPixelCopy$default(Window window, Rect rect, Bitmap bitmap, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return generateBitmapFromPixelCopy(window, rect, bitmap, continuation);
    }

    public static final Object generateBitmapFromPixelCopy(Window window, Rect rect, final Bitmap bitmap, Continuation<? super Bitmap> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        PixelCopy.request(window, rect, bitmap, PathTreeWalk$$ExternalSyntheticApiModelOutline0.m((Object) new PixelCopy$OnPixelCopyFinishedListener() { // from class: androidx.test.core.view.WindowCapture$generateBitmapFromPixelCopy$2$onCopyFinished$1
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    cancellableContinuationImpl2.resume(bitmap, new Function1<Throwable, Unit>() { // from class: androidx.test.core.view.WindowCapture$generateBitmapFromPixelCopy$2$onCopyFinished$1.1
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
                    return;
                }
                CancellableContinuation<Bitmap> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m199constructorimpl(ResultKt.createFailure(new RuntimeException("PixelCopy failed: " + i))));
            }
        }), new Handler(Looper.getMainLooper()));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
