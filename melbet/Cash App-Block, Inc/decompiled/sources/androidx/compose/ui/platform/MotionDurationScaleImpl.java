package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.MotionDurationScale;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;
import kotlinx.coroutines.internal.ContextScope;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class MotionDurationScaleImpl implements MotionDurationScale {
    public final ParcelableSnapshotMutableFloatState _scaleFactor$delegate = new ParcelableSnapshotMutableFloatState(1.0f);
    public final Context applicationContext;
    public ContextScope coroutineScope;
    public StandaloneCoroutine job;

    public MotionDurationScaleImpl(Context context) {
        this.applicationContext = context;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    @Override // androidx.compose.ui.MotionDurationScale
    public final float getScaleFactor() {
        StateFlow stateFlow;
        if (this.job == null) {
            Context context = this.applicationContext;
            MutableScatterMap mutableScatterMap = WindowRecomposer_androidKt.animationScale;
            synchronized (mutableScatterMap) {
                try {
                    Object obj = mutableScatterMap.get(context);
                    if (obj == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        final BufferedChannel Channel$default = PapaEvent.Channel$default(-1, null, null, 6);
                        final Handler createAsync = Handler.createAsync(Looper.getMainLooper());
                        obj = FlowKt.stateIn(new SafeFlow(new CombineKt$zipImpl$1$1(contentResolver, uriFor, new ContentObserver(createAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                            @Override // android.database.ContentObserver
                            public final void onChange(boolean z, Uri uri) {
                                BufferedChannel.this.mo1159trySendJP2dKIU(Unit.INSTANCE);
                            }
                        }, Channel$default, context, null)), JobKt.MainScope(), new StartedWhileSubscribed(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        mutableScatterMap.set(context, obj);
                    }
                    stateFlow = (StateFlow) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this._scaleFactor$delegate.setFloatValue(((Number) stateFlow.getValue()).floatValue());
            ContextScope contextScope = this.coroutineScope;
            if (contextScope == null) {
                a$$ExternalSyntheticBUOutline0.m$1("MotionDurationScale scale factor requested before recomposer loop start");
                return RecyclerView.DECELERATION_RATE;
            }
            this.job = JobKt.launch$default(contextScope, null, null, new GatedFrameClock.AnonymousClass1(stateFlow, this, null, 9), 3);
        }
        return this._scaleFactor$delegate.getFloatValue();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
