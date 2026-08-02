package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.animation.BoundsAnimation$animate$2;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.glance.EmittableWithChildren;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.session.Session$receiveEvents$1;
import androidx.glance.state.GlanceState;
import androidx.glance.state.PreferencesGlanceStateDefinition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AppWidgetSession {
    public final AtomicBoolean _isOpen;
    public final GlanceState configManager;
    public final BufferedChannel eventChannel;
    public final ParcelableSnapshotMutableState glanceState$delegate;
    public final AppWidgetId id;
    public final String key;
    public Map lambdas;
    public final StateFlowImpl lastRemoteViews;
    public final ParcelableSnapshotMutableState options$delegate;
    public final JobImpl parentJob;
    public final boolean shouldPublish;
    public final SizeMode.Single sizeMode;
    public final CashQrWidget widget;

    public final class RunLambda {
        public final String key;

        public RunLambda(String str) {
            this.key = str;
        }
    }

    public final class UpdateAppWidgetOptions {
        public final Bundle newOptions;

        public UpdateAppWidgetOptions(Bundle bundle) {
            this.newOptions = bundle;
        }
    }

    public final class UpdateGlanceState {
        public static final UpdateGlanceState INSTANCE = new UpdateGlanceState();
    }

    public final class WaitForReady {
        public final JobImpl job;

        public WaitForReady(JobImpl jobImpl) {
            this.job = jobImpl;
        }
    }

    public AppWidgetSession(CashQrWidget cashQrWidget, AppWidgetId appWidgetId, Bundle bundle, int i) {
        bundle = (i & 4) != 0 ? null : bundle;
        GlanceState glanceState = GlanceState.INSTANCE;
        SizeMode.Single single = cashQrWidget.sizeMode;
        this.key = AppWidgetUtilsKt.createUniqueRemoteUiName(appWidgetId.appWidgetId);
        this._isOpen = new AtomicBoolean(true);
        this.eventChannel = PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
        this.widget = cashQrWidget;
        this.id = appWidgetId;
        this.configManager = glanceState;
        this.sizeMode = single;
        this.shouldPublish = true;
        int i2 = appWidgetId.appWidgetId;
        if (Integer.MIN_VALUE <= i2 && i2 < -1) {
            a$$ExternalSyntheticBUOutline0.m$3("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE;
        this.glanceState$delegate = new ParcelableSnapshotMutableState(null, neverEqualPolicy);
        this.options$delegate = new ParcelableSnapshotMutableState(bundle, neverEqualPolicy);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.lambdas = emptyMap;
        this.parentJob = JobKt.Job$default();
        this.lastRemoteViews = FlowKt.MutableStateFlow(null);
    }

    public final void notifyWidgetOfError(Context context, Throwable th) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        if (!this.shouldPublish) {
            throw th;
        }
        int i = this.id.appWidgetId;
        this.widget.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|(1:(1:(4:19|20|21|22)(1:(2:13|14)(3:16|17|18)))(1:23))(2:62|(2:64|65)(3:66|(1:68)|42))|24|25|26|27|28|29|(9:31|32|33|34|35|36|(1:38)|39|40)(2:57|58)))|69|6|(0)(0)|24|25|26|27|28|29|(0)(0)|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        if (r3.save(r5) == r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0138, code lost:
    
        if (r3.save(r5) != r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
    
        if (r3.save(r5) != r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0125, code lost:
    
        if (r3.save(r5) != r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: all -> 0x00cd, CancellationException -> 0x012c, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x012c, all -> 0x00cd, blocks: (B:27:0x0094, B:29:0x0099, B:31:0x00a1, B:36:0x00c3, B:38:0x00c7, B:39:0x00cf, B:57:0x00ee, B:58:0x0105), top: B:26:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee A[Catch: all -> 0x00cd, CancellationException -> 0x012c, TRY_ENTER, TryCatch #4 {CancellationException -> 0x012c, all -> 0x00cd, blocks: (B:27:0x0094, B:29:0x0099, B:31:0x00a1, B:36:0x00c3, B:38:0x00c7, B:39:0x00cf, B:57:0x00ee, B:58:0x0105), top: B:26:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processEmittableTree(Context context, EmittableWithChildren emittableWithChildren, ContinuationImpl continuationImpl) {
        AppWidgetSession$processEmittableTree$1 appWidgetSession$processEmittableTree$1;
        int i;
        AppWidgetSession appWidgetSession;
        EmittableWithChildren emittableWithChildren2;
        AppWidgetProviderInfo appWidgetInfo;
        Context context2 = context;
        if (continuationImpl instanceof AppWidgetSession$processEmittableTree$1) {
            appWidgetSession$processEmittableTree$1 = (AppWidgetSession$processEmittableTree$1) continuationImpl;
            int i2 = appWidgetSession$processEmittableTree$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appWidgetSession$processEmittableTree$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = appWidgetSession$processEmittableTree$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appWidgetSession$processEmittableTree$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (IgnoreResultKt.shouldIgnoreResult(emittableWithChildren)) {
                        return Boolean.FALSE;
                    }
                    emittableWithChildren.getClass();
                    int i3 = this.id.appWidgetId;
                    appWidgetSession$processEmittableTree$1.L$0 = this;
                    appWidgetSession$processEmittableTree$1.L$1 = context2;
                    appWidgetSession$processEmittableTree$1.L$2 = emittableWithChildren;
                    appWidgetSession$processEmittableTree$1.label = 1;
                    obj = LayoutConfiguration.Companion.load$glance_appwidget_release(context2, i3, appWidgetSession$processEmittableTree$1);
                    if (obj != coroutineSingletons) {
                        appWidgetSession = this;
                        emittableWithChildren2 = emittableWithChildren;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2 || i == 3 || i == 4) {
                        SafeTrace.throwOnFailure(obj);
                        Tracing.endGlanceAppWidgetUpdate();
                        return Boolean.TRUE;
                    }
                    if (i != 5) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) appWidgetSession$processEmittableTree$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Tracing.endGlanceAppWidgetUpdate();
                    throw th;
                }
                emittableWithChildren2 = appWidgetSession$processEmittableTree$1.L$2;
                context2 = appWidgetSession$processEmittableTree$1.L$1;
                appWidgetSession = (AppWidgetSession) appWidgetSession$processEmittableTree$1.L$0;
                SafeTrace.throwOnFailure(obj);
                Context context3 = context2;
                LayoutConfiguration layoutConfiguration = (LayoutConfiguration) obj;
                Object systemService = context3.getSystemService("appwidget");
                systemService.getClass();
                AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                appWidgetSession.getClass();
                AppWidgetId appWidgetId = appWidgetSession.id;
                appWidgetInfo = appWidgetManager.getAppWidgetInfo(appWidgetId.appWidgetId);
                if (appWidgetInfo != null) {
                    throw new IllegalArgumentException(("No app widget info for " + appWidgetId.appWidgetId).toString());
                }
                ComponentName componentName = appWidgetInfo.provider;
                NormalizeCompositionTreeKt.normalizeCompositionTree((RemoteViewsRoot) emittableWithChildren2);
                appWidgetSession.lambdas = NormalizeCompositionTreeKt.updateLambdaActionKeys(emittableWithChildren2);
                try {
                    RemoteViews m1117translateCompositionKpG6l20 = RemoteViewsTranslatorKt.m1117translateCompositionKpG6l20(context3, appWidgetId.appWidgetId, (RemoteViewsRoot) emittableWithChildren2, layoutConfiguration, layoutConfiguration.addLayout(emittableWithChildren2), componentName);
                    if (appWidgetSession.shouldPublish) {
                        appWidgetManager.updateAppWidget(appWidgetId.appWidgetId, m1117translateCompositionKpG6l20);
                    }
                    appWidgetSession.lastRemoteViews.setValue(m1117translateCompositionKpG6l20);
                    appWidgetSession$processEmittableTree$1.L$0 = null;
                    appWidgetSession$processEmittableTree$1.L$1 = null;
                    appWidgetSession$processEmittableTree$1.L$2 = null;
                    appWidgetSession$processEmittableTree$1.label = 2;
                } catch (CancellationException unused) {
                    layoutConfiguration = layoutConfiguration;
                    appWidgetSession$processEmittableTree$1.L$0 = null;
                    appWidgetSession$processEmittableTree$1.L$1 = null;
                    appWidgetSession$processEmittableTree$1.L$2 = null;
                    appWidgetSession$processEmittableTree$1.label = 3;
                } catch (Throwable th) {
                    th = th;
                    layoutConfiguration = layoutConfiguration;
                    try {
                        appWidgetSession.notifyWidgetOfError(context3, th);
                        appWidgetSession$processEmittableTree$1.L$0 = null;
                        appWidgetSession$processEmittableTree$1.L$1 = null;
                        appWidgetSession$processEmittableTree$1.L$2 = null;
                        appWidgetSession$processEmittableTree$1.label = 4;
                    } catch (Throwable th2) {
                        th = th2;
                        appWidgetSession$processEmittableTree$1.L$0 = th;
                        appWidgetSession$processEmittableTree$1.L$1 = null;
                        appWidgetSession$processEmittableTree$1.L$2 = null;
                        appWidgetSession$processEmittableTree$1.label = 5;
                    }
                }
            }
        }
        appWidgetSession$processEmittableTree$1 = new AppWidgetSession$processEmittableTree$1(this, continuationImpl);
        Object obj2 = appWidgetSession$processEmittableTree$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appWidgetSession$processEmittableTree$1.label;
        if (i != 0) {
        }
        Context context32 = context2;
        LayoutConfiguration layoutConfiguration2 = (LayoutConfiguration) obj2;
        Object systemService2 = context32.getSystemService("appwidget");
        systemService2.getClass();
        AppWidgetManager appWidgetManager2 = (AppWidgetManager) systemService2;
        appWidgetSession.getClass();
        AppWidgetId appWidgetId2 = appWidgetSession.id;
        appWidgetInfo = appWidgetManager2.getAppWidgetInfo(appWidgetId2.appWidgetId);
        if (appWidgetInfo != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processEvent(Context context, Object obj, ContinuationImpl continuationImpl) {
        AppWidgetSession$processEvent$1 appWidgetSession$processEvent$1;
        int i;
        MutableSnapshot takeNestedMutableSnapshot;
        Snapshot makeCurrent;
        MutableSnapshot mutableSnapshot;
        if (continuationImpl instanceof AppWidgetSession$processEvent$1) {
            appWidgetSession$processEvent$1 = (AppWidgetSession$processEvent$1) continuationImpl;
            int i2 = appWidgetSession$processEvent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appWidgetSession$processEvent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = appWidgetSession$processEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appWidgetSession$processEvent$1.label;
                Unit unit = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    boolean z = obj instanceof UpdateGlanceState;
                    String str = this.key;
                    if (!z) {
                        if (obj instanceof UpdateAppWidgetOptions) {
                            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
                            MutableSnapshot mutableSnapshot2 = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
                            if (mutableSnapshot2 == null || (takeNestedMutableSnapshot = mutableSnapshot2.takeNestedMutableSnapshot(null, null)) == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Cannot create a mutable snapshot of an read-only snapshot");
                                return null;
                            }
                            try {
                                makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                                try {
                                    this.options$delegate.setValue(((UpdateAppWidgetOptions) obj).newOptions);
                                    Snapshot.restoreCurrent(makeCurrent);
                                    takeNestedMutableSnapshot.apply().check();
                                    takeNestedMutableSnapshot.dispose();
                                } finally {
                                }
                            } finally {
                            }
                        } else if (obj instanceof RunLambda) {
                            Snapshot currentSnapshot2 = SnapshotKt.currentSnapshot();
                            MutableSnapshot mutableSnapshot3 = currentSnapshot2 instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot2 : null;
                            if (mutableSnapshot3 == null || (takeNestedMutableSnapshot = mutableSnapshot3.takeNestedMutableSnapshot(null, null)) == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Cannot create a mutable snapshot of an read-only snapshot");
                                return null;
                            }
                            try {
                                makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                                try {
                                    List list = (List) this.lambdas.get(((RunLambda) obj).key);
                                    if (list != null) {
                                        Iterator it = list.iterator();
                                        if (it.hasNext()) {
                                            throw null;
                                        }
                                        unit = Unit.INSTANCE;
                                    }
                                    Snapshot.restoreCurrent(makeCurrent);
                                    takeNestedMutableSnapshot.apply().check();
                                    takeNestedMutableSnapshot.dispose();
                                    if (unit == null) {
                                        Okio.boxInt(Log.w("AppWidgetSession", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Triggering Action("), ((RunLambda) obj).key, ") for session(", str, ") failed")));
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } finally {
                            }
                        } else {
                            if (!(obj instanceof WaitForReady)) {
                                OptionalProvider$$ExternalSyntheticLambda0.m$1("Sent unrecognized event type ", obj.getClass(), " to AppWidgetSession");
                                return null;
                            }
                            JobImpl jobImpl = ((WaitForReady) obj).job;
                            if (jobImpl.isActive()) {
                                jobImpl.complete$1();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    PreferencesGlanceStateDefinition preferencesGlanceStateDefinition = this.widget.stateDefinition;
                    if (preferencesGlanceStateDefinition != null) {
                        appWidgetSession$processEvent$1.L$0 = this;
                        appWidgetSession$processEvent$1.label = 1;
                        obj2 = this.configManager.getValue(context, preferencesGlanceStateDefinition, str, appWidgetSession$processEvent$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        obj2 = null;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = appWidgetSession$processEvent$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                Snapshot currentSnapshot3 = SnapshotKt.currentSnapshot();
                mutableSnapshot = !(currentSnapshot3 instanceof MutableSnapshot) ? (MutableSnapshot) currentSnapshot3 : null;
                if (mutableSnapshot != null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(null, null)) == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot create a mutable snapshot of an read-only snapshot");
                    return null;
                }
                try {
                    makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                    try {
                        this.glanceState$delegate.setValue(obj2);
                        Snapshot.restoreCurrent(makeCurrent);
                        takeNestedMutableSnapshot.apply().check();
                        return Unit.INSTANCE;
                    } finally {
                    }
                } finally {
                }
            }
        }
        appWidgetSession$processEvent$1 = new AppWidgetSession$processEvent$1(this, continuationImpl);
        Object obj22 = appWidgetSession$processEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appWidgetSession$processEvent$1.label;
        Unit unit2 = null;
        if (i != 0) {
        }
        Snapshot currentSnapshot32 = SnapshotKt.currentSnapshot();
        if (!(currentSnapshot32 instanceof MutableSnapshot)) {
        }
        if (mutableSnapshot != null) {
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot create a mutable snapshot of an read-only snapshot");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(5:19|20|(1:22)|24|25))(2:27|28))(6:29|30|20|(0)|24|25))(4:31|32|14|(0)(0))))|34|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r2.processEvent(r8, r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: ClosedReceiveChannelException -> 0x008f, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x008f, blocks: (B:12:0x002e, B:14:0x0058, B:20:0x006f, B:22:0x0077, B:30:0x0047, B:32:0x004e), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008c -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object receiveEvents(Context context, BoundsAnimation$animate$2 boundsAnimation$animate$2, ContinuationImpl continuationImpl) {
        Session$receiveEvents$1 session$receiveEvents$1;
        int i;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        Context context2;
        BoundsAnimation$animate$2 boundsAnimation$animate$22;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2;
        AppWidgetSession appWidgetSession;
        if (continuationImpl instanceof Session$receiveEvents$1) {
            session$receiveEvents$1 = (Session$receiveEvents$1) continuationImpl;
            int i2 = session$receiveEvents$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                session$receiveEvents$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = session$receiveEvents$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = session$receiveEvents$1.label;
                if (i == 0) {
                    if (i == 1) {
                        bufferedChannelIterator2 = session$receiveEvents$1.L$3;
                        ?? r7 = session$receiveEvents$1.L$2;
                        context2 = session$receiveEvents$1.L$1;
                        appWidgetSession = session$receiveEvents$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        boundsAnimation$animate$22 = r7;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bufferedChannelIterator2 = session$receiveEvents$1.L$3;
                    ?? r72 = session$receiveEvents$1.L$2;
                    context2 = session$receiveEvents$1.L$1;
                    appWidgetSession = session$receiveEvents$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    BoundsAnimation$animate$2 boundsAnimation$animate$23 = r72;
                    AppWidgetSession appWidgetSession2 = appWidgetSession;
                    bufferedChannelIterator = bufferedChannelIterator2;
                    this = appWidgetSession2;
                    Context context3 = context2;
                    boundsAnimation$animate$2 = boundsAnimation$animate$23;
                    context = context3;
                    session$receiveEvents$1.L$0 = this;
                    session$receiveEvents$1.L$1 = context;
                    session$receiveEvents$1.L$2 = boundsAnimation$animate$2;
                    session$receiveEvents$1.L$3 = bufferedChannelIterator;
                    session$receiveEvents$1.label = 1;
                    obj = bufferedChannelIterator.hasNext(session$receiveEvents$1);
                    if (obj != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = bufferedChannelIterator;
                    appWidgetSession = this;
                    bufferedChannelIterator2 = bufferedChannelIterator3;
                    BoundsAnimation$animate$2 boundsAnimation$animate$24 = boundsAnimation$animate$2;
                    context2 = context;
                    boundsAnimation$animate$22 = boundsAnimation$animate$24;
                    if (((Boolean) obj).booleanValue()) {
                        Object next = bufferedChannelIterator2.next();
                        boundsAnimation$animate$22.invoke(next);
                        session$receiveEvents$1.L$0 = appWidgetSession;
                        session$receiveEvents$1.L$1 = context2;
                        session$receiveEvents$1.L$2 = boundsAnimation$animate$22;
                        session$receiveEvents$1.L$3 = bufferedChannelIterator2;
                        session$receiveEvents$1.label = 2;
                        boundsAnimation$animate$23 = boundsAnimation$animate$22;
                    }
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                BufferedChannel bufferedChannel = this.eventChannel;
                bufferedChannel.getClass();
                bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                session$receiveEvents$1.L$0 = this;
                session$receiveEvents$1.L$1 = context;
                session$receiveEvents$1.L$2 = boundsAnimation$animate$2;
                session$receiveEvents$1.L$3 = bufferedChannelIterator;
                session$receiveEvents$1.label = 1;
                obj = bufferedChannelIterator.hasNext(session$receiveEvents$1);
                if (obj != coroutineSingletons) {
                }
            }
        }
        session$receiveEvents$1 = new Session$receiveEvents$1(this, continuationImpl);
        Object obj2 = session$receiveEvents$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = session$receiveEvents$1.label;
        if (i == 0) {
        }
    }

    public final Object sendEvent(Object obj, ContinuationImpl continuationImpl) {
        Object send = this.eventChannel.send(obj, continuationImpl);
        return send == CoroutineSingletons.COROUTINE_SUSPENDED ? send : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForReady(ContinuationImpl continuationImpl) {
        AppWidgetSession$waitForReady$1 appWidgetSession$waitForReady$1;
        int i;
        WaitForReady waitForReady;
        if (continuationImpl instanceof AppWidgetSession$waitForReady$1) {
            appWidgetSession$waitForReady$1 = (AppWidgetSession$waitForReady$1) continuationImpl;
            int i2 = appWidgetSession$waitForReady$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appWidgetSession$waitForReady$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = appWidgetSession$waitForReady$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appWidgetSession$waitForReady$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    WaitForReady waitForReady2 = new WaitForReady(new JobImpl(this.parentJob));
                    appWidgetSession$waitForReady$1.L$0 = waitForReady2;
                    appWidgetSession$waitForReady$1.label = 1;
                    if (sendEvent(waitForReady2, appWidgetSession$waitForReady$1) == obj2) {
                        return obj2;
                    }
                    waitForReady = waitForReady2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    waitForReady = appWidgetSession$waitForReady$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return waitForReady.job;
            }
        }
        appWidgetSession$waitForReady$1 = new AppWidgetSession$waitForReady$1(this, continuationImpl);
        Object obj3 = appWidgetSession$waitForReady$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appWidgetSession$waitForReady$1.label;
        if (i != 0) {
        }
        return waitForReady.job;
    }
}
