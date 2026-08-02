package androidx.compose.ui.graphics;

import android.content.Context;
import android.view.View;
import androidx.camera.video.Recorder;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.ViewKt;
import coil3.util.AndroidSystemCallbacks;
import com.squareup.cash.R;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes.dex */
public final class AndroidGraphicsContext implements GraphicsContext {
    public final AndroidSystemCallbacks.ComponentCallbacks componentCallback;
    public boolean componentCallbackRegistered;
    public final Object lock = new Object();
    public final AndroidComposeView ownerView;
    public Recorder.AnonymousClass4 shadowCache;

    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$2, reason: invalid class name */
    public final class AnonymousClass2 implements View.OnAttachStateChangeListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void onViewAttachedToWindow$androidx$compose$ui$platform$ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1(View view) {
        }

        private final void onViewAttachedToWindow$androidx$compose$ui$platform$WindowRecomposerPolicy$createAndInstallWindowRecomposer$1(View view) {
        }

        private final void onViewDetachedFromWindow$com$squareup$cash$core$navigationcontainer$UiContainerKt$ScreenContent$lambda$3$3$1$14$0$$inlined$doOnAttach$1(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    AndroidGraphicsContext androidGraphicsContext = (AndroidGraphicsContext) obj;
                    Context context = view.getContext();
                    if (!androidGraphicsContext.componentCallbackRegistered) {
                        context.getApplicationContext().registerComponentCallbacks(androidGraphicsContext.componentCallback);
                        androidGraphicsContext.componentCallbackRegistered = true;
                        break;
                    }
                    break;
                case 1:
                case 2:
                    break;
                default:
                    ((View) obj).removeOnAttachStateChangeListener(this);
                    view.requestApplyInsets();
                    break;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    AndroidGraphicsContext androidGraphicsContext = (AndroidGraphicsContext) obj;
                    Context context = view.getContext();
                    if (androidGraphicsContext.componentCallbackRegistered) {
                        context.getApplicationContext().unregisterComponentCallbacks(androidGraphicsContext.componentCallback);
                        androidGraphicsContext.componentCallbackRegistered = false;
                    }
                    Recorder.AnonymousClass4 anonymousClass4 = androidGraphicsContext.shadowCache;
                    if (anonymousClass4 != null) {
                        anonymousClass4.clearCache();
                    }
                    androidGraphicsContext.shadowCache = null;
                    break;
                case 1:
                    AbstractComposeView abstractComposeView = (AbstractComposeView) obj;
                    for (Object obj2 : ViewKt.getAncestors(abstractComposeView)) {
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                break;
                            }
                        }
                    }
                    abstractComposeView.disposeComposition();
                    break;
                case 2:
                    view.removeOnAttachStateChangeListener(this);
                    ((StandaloneCoroutine) obj).cancel(null);
                    break;
            }
        }
    }

    public AndroidGraphicsContext(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        AndroidSystemCallbacks.ComponentCallbacks componentCallbacks = new AndroidSystemCallbacks.ComponentCallbacks(this, 1);
        this.componentCallback = componentCallbacks;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.componentCallbackRegistered) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks);
                this.componentCallbackRegistered = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new AnonymousClass2(this, 0));
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final GraphicsLayer createGraphicsLayer() {
        GraphicsLayer graphicsLayer;
        synchronized (this.lock) {
            this.ownerView.getUniqueDrawingId();
            graphicsLayer = new GraphicsLayer(new GraphicsLayerV29());
        }
        return graphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final void releaseGraphicsLayer(GraphicsLayer graphicsLayer) {
        synchronized (this.lock) {
            if (!graphicsLayer.isReleased) {
                graphicsLayer.isReleased = true;
                graphicsLayer.discardContentIfReleasedAndHaveNoParentLayerUsages();
            }
        }
    }
}
