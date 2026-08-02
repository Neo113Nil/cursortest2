package coil3.compose;

import android.os.Trace;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import app.cash.zipline.CallResult;
import bo.app.yf$$ExternalSyntheticLambda10;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.RealImageLoader$execute$2;
import coil3.compose.internal.DeferredDispatchCoroutineContext;
import coil3.compose.internal.DeferredDispatchCoroutineDispatcher;
import coil3.compose.internal.UtilsKt;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.SizeResolver;
import coil3.transition.CrossfadeTransition;
import coil3.transition.Transition;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {
    public static final yf$$ExternalSyntheticLambda10 DefaultTransform = new yf$$ExternalSyntheticLambda10(23);
    public Input _input;
    public ColorFilter colorFilter;
    public final StateFlowImpl inputFlow;
    public boolean isRemembered;
    public Function1 onState;
    public AsyncImagePreviewHandler$Companion$Default$1 previewHandler;
    public Job rememberJob;
    public CoroutineScope scope;
    public final ReadonlyStateFlow state;
    public final StateFlowImpl stateFlow;
    public final ParcelableSnapshotMutableState painter$delegate = Updater.mutableStateOf$default(null);
    public float alpha = 1.0f;
    public long drawSize = 9205357640488583168L;
    public Function1 transform = DefaultTransform;
    public ContentScale contentScale = ContentScale.Companion.Fit;
    public int filterQuality = 1;

    public final class Input {
        public final RealImageLoader imageLoader;
        public final AsyncImageModelEqualityDelegate$Companion$Default$1 modelEqualityDelegate;
        public final ImageRequest request;

        public Input(RealImageLoader realImageLoader, ImageRequest imageRequest, AsyncImageModelEqualityDelegate$Companion$Default$1 asyncImageModelEqualityDelegate$Companion$Default$1) {
            this.imageLoader = realImageLoader;
            this.request = imageRequest;
            this.modelEqualityDelegate = asyncImageModelEqualityDelegate$Companion$Default$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            if (!Intrinsics.areEqual(this.imageLoader, input.imageLoader)) {
                return false;
            }
            AsyncImageModelEqualityDelegate$Companion$Default$1 asyncImageModelEqualityDelegate$Companion$Default$1 = input.modelEqualityDelegate;
            AsyncImageModelEqualityDelegate$Companion$Default$1 asyncImageModelEqualityDelegate$Companion$Default$12 = this.modelEqualityDelegate;
            return Intrinsics.areEqual(asyncImageModelEqualityDelegate$Companion$Default$12, asyncImageModelEqualityDelegate$Companion$Default$1) && asyncImageModelEqualityDelegate$Companion$Default$12.equals(this.request, input.request);
        }

        public final int hashCode() {
            int hashCode = this.imageLoader.hashCode() * 31;
            AsyncImageModelEqualityDelegate$Companion$Default$1 asyncImageModelEqualityDelegate$Companion$Default$1 = this.modelEqualityDelegate;
            return asyncImageModelEqualityDelegate$Companion$Default$1.hashCode(this.request) + ((asyncImageModelEqualityDelegate$Companion$Default$1.hashCode() + hashCode) * 31);
        }

        public final String toString() {
            return "Input(imageLoader=" + this.imageLoader + ", request=" + this.request + ", modelEqualityDelegate=" + this.modelEqualityDelegate + ")";
        }
    }

    public interface State {

        public final class Empty implements State {
            public static final Empty INSTANCE = new Empty();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            public final Painter getPainter() {
                return null;
            }

            public final int hashCode() {
                return -1625786264;
            }

            public final String toString() {
                return "Empty";
            }
        }

        public final class Error implements State {
            public final Painter painter;
            public final ErrorResult result;

            public Error(Painter painter, ErrorResult errorResult) {
                this.painter = painter;
                this.result = errorResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.areEqual(this.painter, error.painter) && this.result.equals(error.result);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            public final Painter getPainter() {
                return this.painter;
            }

            public final int hashCode() {
                Painter painter = this.painter;
                return this.result.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.painter + ", result=" + this.result + ")";
            }
        }

        public final class Loading implements State {
            public final Painter painter;

            public Loading(Painter painter) {
                this.painter = painter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.areEqual(this.painter, ((Loading) obj).painter);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            public final Painter getPainter() {
                return this.painter;
            }

            public final int hashCode() {
                Painter painter = this.painter;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.painter + ")";
            }
        }

        public final class Success implements State {
            public final Painter painter;
            public final SuccessResult result;

            public Success(Painter painter, SuccessResult successResult) {
                this.painter = painter;
                this.result = successResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return this.painter.equals(success.painter) && this.result.equals(success.result);
            }

            @Override // coil3.compose.AsyncImagePainter.State
            public final Painter getPainter() {
                return this.painter;
            }

            public final int hashCode() {
                return this.result.hashCode() + (this.painter.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.result + ")";
            }
        }

        Painter getPainter();
    }

    public AsyncImagePainter(Input input) {
        this._input = input;
        this.inputFlow = FlowKt.MutableStateFlow(input);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(State.Empty.INSTANCE);
        this.stateFlow = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final ImageRequest access$updateRequest(AsyncImagePainter asyncImagePainter, ImageRequest imageRequest, boolean z) {
        ImageRequest.Builder newBuilder$default = ImageRequest.newBuilder$default(imageRequest);
        newBuilder$default.target = new CallResult(imageRequest, asyncImagePainter);
        ImageRequest.Defined defined = imageRequest.defined;
        if (defined.sizeResolver == null) {
            newBuilder$default.sizeResolver = SizeResolver.ORIGINAL;
        }
        if (defined.scale == null) {
            ContentScale contentScale = asyncImagePainter.contentScale;
            int i = UtilsKt.$r8$clinit;
            newBuilder$default.scale = (Intrinsics.areEqual(contentScale, ContentScale.Companion.Fit) || Intrinsics.areEqual(contentScale, ContentScale.Companion.Inside)) ? Scale.FIT : Scale.FILL;
        }
        if (defined.precision == null) {
            newBuilder$default.precision = Precision.INEXACT;
        }
        if (z) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            newBuilder$default.interceptorCoroutineContext = emptyCoroutineContext;
            newBuilder$default.fetcherCoroutineContext = emptyCoroutineContext;
            newBuilder$default.decoderCoroutineContext = emptyCoroutineContext;
        }
        return newBuilder$default.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$updateState(AsyncImagePainter asyncImagePainter, State state) {
        ImageResult imageResult;
        Painter painter;
        Function1 function1;
        StateFlowImpl stateFlowImpl = asyncImagePainter.stateFlow;
        State state2 = (State) stateFlowImpl.getValue();
        State state3 = (State) asyncImagePainter.transform.invoke(state);
        stateFlowImpl.setValue(state3);
        ContentScale contentScale = asyncImagePainter.contentScale;
        if (!(state3 instanceof State.Success)) {
            if (state3 instanceof State.Error) {
                imageResult = ((State.Error) state3).result;
            }
            painter = null;
            if (painter == null) {
                painter = state3.getPainter();
            }
            asyncImagePainter.painter$delegate.setValue(painter);
            if (state2.getPainter() != state3.getPainter()) {
                Object painter2 = state2.getPainter();
                RememberObserver rememberObserver = painter2 instanceof RememberObserver ? (RememberObserver) painter2 : null;
                if (rememberObserver != null) {
                    rememberObserver.onForgotten();
                }
                Object painter3 = state3.getPainter();
                RememberObserver rememberObserver2 = painter3 instanceof RememberObserver ? (RememberObserver) painter3 : null;
                if (rememberObserver2 != null) {
                    rememberObserver2.onRemembered();
                }
            }
            function1 = asyncImagePainter.onState;
            if (function1 != null) {
                function1.invoke(state3);
                return;
            }
            return;
        }
        imageResult = ((State.Success) state3).result;
        Transition create = ((Transition.Factory) ExtrasKt.getExtra(imageResult.getRequest(), ImageRequests_androidKt.transitionFactoryKey)).create(AsyncImageKt.FakeTransitionTarget, imageResult);
        if (create instanceof CrossfadeTransition) {
            Painter painter4 = state2.getPainter();
            if (!(state2 instanceof State.Loading)) {
                painter4 = null;
            }
            Painter painter5 = state3.getPainter();
            Duration.Companion companion = Duration.Companion;
            painter = new CrossfadePainter(painter4, painter5, contentScale, DurationKt.toDuration(((CrossfadeTransition) create).durationMillis, DurationUnit.MILLISECONDS), ((imageResult instanceof SuccessResult) && ((SuccessResult) imageResult).isPlaceholderCached) ? false : true, ((Boolean) ExtrasKt.getExtra(imageResult.getRequest(), AsyncImageKt.preferEndFirstIntrinsicSizeKey)).booleanValue());
            if (painter == null) {
            }
            asyncImagePainter.painter$delegate.setValue(painter);
            if (state2.getPainter() != state3.getPainter()) {
            }
            function1 = asyncImagePainter.onState;
            if (function1 != null) {
            }
        }
        painter = null;
        if (painter == null) {
        }
        asyncImagePainter.painter$delegate.setValue(painter);
        if (state2.getPainter() != state3.getPainter()) {
        }
        function1 = asyncImagePainter.onState;
        if (function1 != null) {
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        Painter painter = getPainter();
        if (painter != null) {
            return painter.mo759getIntrinsicSizeNHjbRc();
        }
        return 9205357640488583168L;
    }

    public final Painter getPainter() {
        return (Painter) this.painter$delegate.getValue();
    }

    public final void launchJob() {
        Input input = this._input;
        if (input == null) {
            return;
        }
        CoroutineScope coroutineScope = this.scope;
        Continuation continuation = null;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scope");
            throw null;
        }
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this, input, continuation, 22);
        CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
        int i = UtilsKt.$r8$clinit;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.Key);
        StandaloneCoroutine launch = (coroutineDispatcher == null || coroutineDispatcher.equals(Dispatchers.Unconfined)) ? JobKt.launch(coroutineScope, Dispatchers.Unconfined, CoroutineStart.UNDISPATCHED, realImageLoader$execute$2) : JobKt.launch(JobKt.CoroutineScope(new DeferredDispatchCoroutineContext(coroutineScope.getCoroutineContext())), new DeferredDispatchCoroutineDispatcher(coroutineDispatcher), CoroutineStart.UNDISPATCHED, realImageLoader$execute$2);
        Job job = this.rememberJob;
        if (job != null) {
            job.cancel(null);
        }
        this.rememberJob = launch;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        Job job = this.rememberJob;
        if (job != null) {
            job.cancel(null);
        }
        this.rememberJob = null;
        Object painter = getPainter();
        RememberObserver rememberObserver = painter instanceof RememberObserver ? (RememberObserver) painter : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        long mo753getSizeNHjbRc = drawScope.mo753getSizeNHjbRc();
        if (!Size.m639equalsimpl0(this.drawSize, mo753getSizeNHjbRc)) {
            this.drawSize = mo753getSizeNHjbRc;
        }
        Painter painter = getPainter();
        if (painter != null) {
            painter.m762drawx_KDEd0(drawScope, drawScope.mo753getSizeNHjbRc(), this.alpha, this.colorFilter);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Job job = this.rememberJob;
        if (job != null) {
            job.cancel(null);
        }
        this.rememberJob = null;
        Object painter = getPainter();
        RememberObserver rememberObserver = painter instanceof RememberObserver ? (RememberObserver) painter : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
        this.isRemembered = false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object painter = getPainter();
            RememberObserver rememberObserver = painter instanceof RememberObserver ? (RememberObserver) painter : null;
            if (rememberObserver != null) {
                rememberObserver.onRemembered();
            }
            launchJob();
            this.isRemembered = true;
        } finally {
            Trace.endSection();
        }
    }

    public final void set_input$coil_compose_core(Input input) {
        if (Intrinsics.areEqual(this._input, input)) {
            return;
        }
        this._input = input;
        if (input == null) {
            Job job = this.rememberJob;
            if (job != null) {
                job.cancel(null);
            }
            this.rememberJob = null;
        } else if (this.isRemembered) {
            launchJob();
        }
        if (input != null) {
            StateFlowImpl stateFlowImpl = this.inputFlow;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, input);
        }
    }
}
