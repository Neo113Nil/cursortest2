package app.cash.trifle;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableScatterMap;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.retain.ManagedRetainedValuesStore;
import androidx.compose.runtime.retain.impl.PreconditionsKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.compose.ui.window.PopupLayout;
import androidx.datastore.core.DataStore;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import androidx.glance.session.InteractiveFrameClock;
import androidx.room.util.DBUtil;
import app.cash.trifle.providers.jca.JCAContentVerifierProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.persistence.FileEventBatchWriter;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileMover$delete$1;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.core.internal.thread.BackPressuredBlockingQueue;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.rum.internal.domain.scope.RumResourceScope;
import com.datadog.android.rum.internal.vitals.VitalReaderRunnable;
import com.datadog.android.rum.model.VitalAppLaunchEvent;
import com.datadog.android.rum.tracking.ActivityViewTrackingStrategy;
import com.datadog.android.telemetry.internal.TelemetryEventId;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.internal.TracingFeature;
import com.datadog.android.trace.internal.net.TracesRequestFactory;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.filament.Box;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.mlkit.common.sdkinternal.zzn;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.security.KeyPair;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import okhttp3.internal.connection.RealCall;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder;

/* loaded from: classes3.dex */
public final class KeyHandle$keyPair$2 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyHandle$keyPair$2(Box box, DatadogSpanContext datadogSpanContext) {
        super(0);
        this.$r8$classId = 28;
        this.this$0 = datadogSpanContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        CompositionImpl compositionImpl;
        DataStore dataStore;
        File[] listFilesSafe;
        int i = 9;
        int i2 = 8;
        int i3 = 7;
        boolean z = false;
        r5 = false;
        r5 = false;
        r5 = false;
        boolean z2 = false;
        z = false;
        String str = null;
        switch (this.$r8$classId) {
            case 0:
                String str2 = ((KeyHandle) this.this$0).tag;
                String format2 = String.format("Android KeyStore does not contain a keypair corresponding to the %s tag", Arrays.copyOf(new Object[]{str2}, 1));
                try {
                    KeyStore.Entry entry = KeyHandle.KEY_STORE.getEntry(str2, null);
                    entry.getClass();
                    if (entry instanceof KeyStore.PrivateKeyEntry) {
                        return new KeyPair(((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey(), ((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
                    }
                    a$$ExternalSyntheticBUOutline0.m$1(format2);
                    return null;
                } catch (Exception e) {
                    a$$ExternalSyntheticBUOutline0.m(format2, e);
                    return null;
                }
            case 1:
                LayoutNodeSubcompositionsState.NodeState nodeState = (LayoutNodeSubcompositionsState.NodeState) this.this$0;
                if (!((Boolean) nodeState.activeState.getValue()).booleanValue() && (compositionImpl = nodeState.composition) != null) {
                    compositionImpl.deactivate();
                }
                return Unit.INSTANCE;
            case 2:
                LayoutNodeSubcompositionsState state = ((SubcomposeLayoutState) this.this$0).getState();
                LayoutNode layoutNode = state.root;
                if (state.reusableCount != ((MutableVector.MutableVectorList) layoutNode.getFoldedChildren$ui()).vector.size) {
                    MutableScatterMap mutableScatterMap = state.nodeToNodeState;
                    Object[] objArr = mutableScatterMap.values;
                    long[] jArr = mutableScatterMap.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((255 & j) < 128) {
                                        ((LayoutNodeSubcompositionsState.NodeState) objArr[(i4 << 3) + i6]).forceRecompose = true;
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                }
                            }
                            if (i4 != length) {
                                i4++;
                            }
                        }
                    }
                    if (layoutNode.lookaheadRoot != null) {
                        if (!layoutNode.layoutDelegate.lookaheadMeasurePending) {
                            LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, false, 7);
                        }
                    } else if (!layoutNode.getMeasurePending$ui()) {
                        LayoutNode.requestRemeasure$ui$default(layoutNode, false, 7);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                ManagedRetainedValuesStore managedRetainedValuesStore = (ManagedRetainedValuesStore) ((LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry) this.this$0)._retainedValuesStore.f61default;
                if (!managedRetainedValuesStore.isDisposed) {
                    if (managedRetainedValuesStore.isContentComposed) {
                        PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    managedRetainedValuesStore.purgeUnusedExitedValues();
                    managedRetainedValuesStore.isContentComposed = true;
                }
                return Unit.INSTANCE;
            case 4:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this.this$0;
                viewFactoryHolder.resetBlock.invoke(viewFactoryHolder.typedView);
                return Unit.INSTANCE;
            case 5:
                PopupLayout popupLayout = (PopupLayout) this.this$0;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) popupLayout.parentLayoutCoordinates$delegate.getValue();
                if (layoutCoordinates != 0 && layoutCoordinates.isAttached()) {
                    str = layoutCoordinates;
                }
                if (str != null && ((IntSize) popupLayout.popupContentSize$delegate.getValue()) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ((AppWidgetSession) this.this$0).glanceState$delegate.getValue();
                return Unit.INSTANCE;
            case 7:
                GlanceAppWidgetManager glanceAppWidgetManager = (GlanceAppWidgetManager) this.this$0;
                synchronized (GlanceAppWidgetManager.Companion) {
                    dataStore = GlanceAppWidgetManager.dataStoreSingleton;
                    if (dataStore == null) {
                        dataStore = (DataStore) GlanceAppWidgetManager.appManagerDataStore$delegate.getValue(glanceAppWidgetManager.context, GlanceAppWidgetManager.Companion.$$delegatedProperties[0]);
                        GlanceAppWidgetManager.dataStoreSingleton = dataStore;
                    }
                }
                return dataStore;
            case 8:
                InteractiveFrameClock interactiveFrameClock = (InteractiveFrameClock) this.this$0;
                long nanoTime = System.nanoTime();
                Ref$LongRef ref$LongRef = new Ref$LongRef();
                Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                synchronized (interactiveFrameClock.lock) {
                    ref$LongRef.element = nanoTime - interactiveFrameClock.lastFrame;
                    ref$LongRef2.element = 1000000000 / interactiveFrameClock.currentHz;
                }
                JobKt.launch$default(interactiveFrameClock.scope, null, null, new RepeatOnIntervalTaskRunner$repeatOn$2(ref$LongRef, ref$LongRef2, interactiveFrameClock, nanoTime, (Continuation) null, 10), 3);
                return Unit.INSTANCE;
            case 9:
                return new JcaContentVerifierProviderBuilder().setProvider(new BouncyCastleProvider()).build(((JCAContentVerifierProvider) this.this$0).subjectPublicKeyInfo);
            case 10:
                return ((DatadogCore) this.this$0).getCoreFeature$dd_sdk_android_core_release().timeProvider;
            case 11:
                return String.format(Locale.US, "SDK core already has \"%s\" listener registered.", Arrays.copyOf(new Object[]{(VitalReaderRunnable) this.this$0}, 1));
            case 12:
                return "Unable to find host for site " + ((DatadogContext) this.this$0).site + "; we will retry later.";
            case 13:
                DataOkHttpUploader dataOkHttpUploader = (DataOkHttpUploader) this.this$0;
                String property = System.getProperty("http.agent");
                if (property != null) {
                    StringBuilder sb = new StringBuilder();
                    int length2 = property.length();
                    for (int i7 = 0; i7 < length2; i7++) {
                        char charAt = property.charAt(i7);
                        if (charAt == '\t' || (' ' <= charAt && charAt < 127)) {
                            sb.append(charAt);
                        }
                    }
                    str = sb.toString();
                }
                if (str == null) {
                    str = "";
                }
                if (!StringsKt.isBlank(str)) {
                    return str;
                }
                String str3 = dataOkHttpUploader.sdkVersion;
                AndroidInfoProvider androidInfoProvider = dataOkHttpUploader.androidInfoProvider;
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Datadog/", str3, " (Linux; U; Android ", androidInfoProvider.getOsVersion(), "; "), androidInfoProvider.getDeviceModel(), " Build/", androidInfoProvider.getDeviceBuildId(), ")");
            case 14:
                return ((FileEventBatchWriter) this.this$0).fileOrchestrator.getWritableFile();
            case 15:
                zzn zznVar = (zzn) this.this$0;
                FileMover fileMover = (FileMover) zznVar.zzc;
                File file = (File) zznVar.zza;
                File file2 = (File) zznVar.zzb;
                InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
                InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
                file.getClass();
                file2.getClass();
                InternalLogger internalLogger = fileMover.internalLogger;
                boolean existsSafe = zzhk.existsSafe(file, internalLogger);
                InternalLogger internalLogger2 = fileMover.internalLogger;
                if (existsSafe) {
                    boolean isDirectorySafe = zzhk.isDirectorySafe(file, internalLogger2);
                    InternalLogger internalLogger3 = fileMover.internalLogger;
                    if (!isDirectorySafe) {
                        DBUtil.log$default(internalLogger3, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, i2), null, 56);
                    } else if (zzhk.existsSafe(file2, internalLogger3)) {
                        if (!zzhk.isDirectorySafe(file2, internalLogger)) {
                            DBUtil.log$default(fileMover.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file2, 10), null, 56);
                        }
                        listFilesSafe = zzhk.listFilesSafe(file, internalLogger);
                        if (listFilesSafe == null) {
                        }
                        while (r3 < r2) {
                        }
                    } else {
                        if (!zzhk.mkdirsSafe(file2, internalLogger)) {
                            DBUtil.log$default(fileMover.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new FileMover$delete$1(file, i), null, 56);
                        }
                        listFilesSafe = zzhk.listFilesSafe(file, internalLogger);
                        if (listFilesSafe == null) {
                            listFilesSafe = new File[0];
                        }
                        for (File file3 : listFilesSafe) {
                            if (((Boolean) zzhk.safeCall(file3, Boolean.FALSE, internalLogger, new BoundsAnimation$animate$1(new File(file2, file3.getName()), 26))).booleanValue()) {
                            }
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                DBUtil.log$default(internalLogger2, 3, target2, new FileMover$delete$1(file, i3), null, false, 56);
                z2 = true;
                return Boolean.valueOf(z2);
            case 16:
                ProfileAdapter.AnonymousClass8 anonymousClass8 = (ProfileAdapter.AnonymousClass8) this.this$0;
                return Boolean.valueOf(((FileMover) anonymousClass8.val$txtValue).delete((File) anonymousClass8.val$element));
            case 17:
                Object systemService = ((Context) this.this$0).getSystemService("display");
                DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
                if (displayManager == null) {
                    return null;
                }
                Display[] displays = displayManager.getDisplays();
                displays.getClass();
                int i8 = 0;
                for (Display display : displays) {
                    if (!ArraysKt___ArraysKt.toSet(new Integer[]{1, 0}).contains(Integer.valueOf(display.getState()))) {
                        i8++;
                    }
                }
                return Integer.valueOf(i8);
            case 18:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((BackPressuredBlockingQueue) this.this$0).notifyThreshold, "BackPressuredBlockingQueue reached capacity:");
            case 19:
                return "Dropped scheduled item in LoggingScheduledThreadPoolExecutor queue: " + ((Runnable) this.this$0);
            case 20:
                return Recorder$$ExternalSyntheticOutline2.m("Unable to clear the NDK crash report file: ", ((File) ((HCaptcha) this.this$0).handler).getAbsolutePath());
            case 21:
                return "No SDK instance is available, skipping tracking timing information of request with url " + ((RealCall) this.this$0).originalRequest.url + ".";
            case 22:
                InternalSdkCore internalSdkCore = ((TracingInterceptor) this.this$0).sdkCoreReference.get();
                if (internalSdkCore instanceof InternalSdkCore) {
                    return internalSdkCore;
                }
                return null;
            case 23:
                return String.format(Locale.US, "RUM feature received an event with unknown value of \"type\" property=%s.", Arrays.copyOf(new Object[]{((Map) this.this$0).get("type")}, 1));
            case 24:
                return String.format(Locale.US, "The computed duration for your resource: %s was 0 or negative. In order to keep the resource event we forced it to 1ns.", Arrays.copyOf(new Object[]{((RumResourceScope) this.this$0).url}, 1));
            case 25:
                return (VitalAppLaunchEvent) this.this$0;
            case 26:
                return ((ActivityViewTrackingStrategy) this.this$0).getSdkCore().createScheduledExecutorService("rum-activity-tracking");
            case 27:
                return String.format(Locale.US, "Already seen telemetry event with identity=%s, rejecting.", Arrays.copyOf(new Object[]{(TelemetryEventId) this.this$0}, 1));
            case 28:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DatadogPropagationAdapter supports only DatadogSpanContextAdapter instances for injection but ", Reflection.factory.getOrCreateKotlinClass(((DatadogSpanContext) this.this$0).getClass()).getSimpleName(), " is given");
            default:
                return new TracesRequestFactory(((TracingFeature) this.this$0).sdkCore.getInternalLogger());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KeyHandle$keyPair$2(Object obj, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
