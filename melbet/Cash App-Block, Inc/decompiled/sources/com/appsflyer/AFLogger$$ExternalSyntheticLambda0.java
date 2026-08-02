package com.appsflyer;

import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.activity.FullyDrawnReporter;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.contentcapture.ContentCaptureEvent;
import androidx.compose.ui.contentcapture.ContentCaptureEventType;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ProcessLifecycleOwner;
import coil3.Extras;
import coil3.memory.MemoryCacheService;
import com.airbnb.lottie.LottieDrawable;
import com.bugsnag.android.AnrPlugin;
import com.bugsnag.android.LaunchCrashTracker;
import com.bugsnag.android.ndk.NativeBridge;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;
import papa.internal.LaunchTracker;
import papa.internal.PerfsActivityLifecycleCallbacks;

/* loaded from: classes.dex */
public final /* synthetic */ class AFLogger$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AFLogger$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0238, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x023c, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        View findFocus;
        int i2 = this.$r8$classId;
        int i3 = 0;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                AFLogger.getMonetizationNetwork((Function1) obj);
                return;
            case 1:
                ComponentActivity.ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl = (ComponentActivity.ReportFullyDrawnExecutorImpl) obj;
                Runnable runnable = reportFullyDrawnExecutorImpl.currentRunnable;
                if (runnable != null) {
                    runnable.run();
                    reportFullyDrawnExecutorImpl.currentRunnable = null;
                    return;
                }
                return;
            case 2:
                FullyDrawnReporter fullyDrawnReporter = (FullyDrawnReporter) obj;
                synchronized (fullyDrawnReporter.lock) {
                    fullyDrawnReporter.reportPosted = false;
                    if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                        fullyDrawnReporter.reportFullyDrawn.invoke();
                        fullyDrawnReporter.fullyDrawnReported();
                    }
                }
                return;
            case 3:
                AndroidContentCaptureManager androidContentCaptureManager = (AndroidContentCaptureManager) obj;
                boolean isEnabled$ui = androidContentCaptureManager.isEnabled$ui();
                AndroidComposeView androidComposeView = androidContentCaptureManager.view;
                if (isEnabled$ui) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView.measureAndLayout(true);
                        MutableIntObjectMap mutableIntObjectMap = androidContentCaptureManager.previousSemanticsNodes;
                        int[] iArr = mutableIntObjectMap.keys;
                        long[] jArr = mutableIntObjectMap.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = i3;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (!androidContentCaptureManager.getCurrentSemanticsNodes$ui().containsKey(i7)) {
                                                i = length;
                                                androidContentCaptureManager.bufferedEvents.add(new ContentCaptureEvent(i7, androidContentCaptureManager.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
                                                androidContentCaptureManager.boundsUpdateChannel.mo1159trySendJP2dKIU(Unit.INSTANCE);
                                                j >>= 8;
                                                i6++;
                                                length = i;
                                            }
                                        }
                                        i = length;
                                        j >>= 8;
                                        i6++;
                                        length = i;
                                    }
                                    int i8 = length;
                                    if (i5 == 8) {
                                        length = i8;
                                    }
                                }
                                if (i4 != length) {
                                    i4++;
                                    i3 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        androidContentCaptureManager.sendContentCaptureAppearEvents(androidComposeView.semanticsOwner.getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
                        Trace.endSection();
                        androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui());
                        androidContentCaptureManager.updateSemanticsCopy();
                        androidContentCaptureManager.checkingForSemanticsChanges = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 4:
                ((AbstractComposeView) obj).attachedToWindow();
                return;
            case 5:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    androidComposeViewAccessibilityDelegateCompat.view.measureAndLayout(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                        Trace.endSection();
                        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 6:
                TextInputServiceAndroid textInputServiceAndroid = (TextInputServiceAndroid) obj;
                GrpcMethod grpcMethod = textInputServiceAndroid.inputMethodManager;
                textInputServiceAndroid.frameCallback = null;
                MutableVector mutableVector = textInputServiceAndroid.textInputCommandQueue;
                AndroidComposeView androidComposeView2 = textInputServiceAndroid.view;
                if (!androidComposeView2.isFocused() && (findFocus = androidComposeView2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    mutableVector.clear();
                    return;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                Object[] objArr = mutableVector.content;
                int i9 = mutableVector.size;
                for (int i10 = 0; i10 < i9; i10++) {
                    TextInputServiceAndroid.TextInputCommand textInputCommand = (TextInputServiceAndroid.TextInputCommand) objArr[i10];
                    int ordinal = textInputCommand.ordinal();
                    if (ordinal == 0) {
                        Boolean bool = Boolean.TRUE;
                        ref$ObjectRef.element = bool;
                        ref$ObjectRef2.element = bool;
                    } else if (ordinal == 1) {
                        Boolean bool2 = Boolean.FALSE;
                        ref$ObjectRef.element = bool2;
                        ref$ObjectRef2.element = bool2;
                    } else if (ordinal != 2 && ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    } else if (!Intrinsics.areEqual(ref$ObjectRef.element, Boolean.FALSE)) {
                        ref$ObjectRef2.element = Boolean.valueOf(textInputCommand == TextInputServiceAndroid.TextInputCommand.ShowKeyboard);
                    }
                }
                mutableVector.clear();
                if (Intrinsics.areEqual(ref$ObjectRef.element, Boolean.TRUE)) {
                    ((InputMethodManager) ((Lazy) grpcMethod.requestAdapter).getValue()).restartInput((AndroidComposeView) grpcMethod.path);
                }
                Boolean bool3 = (Boolean) ref$ObjectRef2.element;
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        ((Extras.Key) ((MemoryCacheService) grpcMethod.responseAdapter).imageLoader).show();
                    } else {
                        ((Extras.Key) ((MemoryCacheService) grpcMethod.responseAdapter).imageLoader).hide();
                    }
                }
                if (Intrinsics.areEqual(ref$ObjectRef.element, Boolean.FALSE)) {
                    ((InputMethodManager) ((Lazy) grpcMethod.requestAdapter).getValue()).restartInput((AndroidComposeView) grpcMethod.path);
                    return;
                }
                return;
            case 7:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 8:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) obj;
                LifecycleRegistry lifecycleRegistry = processLifecycleOwner.registry;
                if (processLifecycleOwner.resumedCounter == 0) {
                    processLifecycleOwner.pauseSent = true;
                    lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                }
                if (processLifecycleOwner.startedCounter == 0 && processLifecycleOwner.pauseSent) {
                    lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                    processLifecycleOwner.stopSent = true;
                    return;
                }
                return;
            case 9:
                Job job = (Job) obj;
                if (job != null) {
                    job.cancel(null);
                    return;
                }
                return;
            case 10:
                ((LottieDrawable) obj).lambda$new$2();
                return;
            case 11:
                ((AnrPlugin) obj).initNativePlugin();
                return;
            case 12:
                ((LaunchCrashTracker) obj).markLaunchCompleted();
                return;
            case 13:
                ((NativeBridge) obj).refreshSymbolTable();
                return;
            case 14:
                ((InteractionRuleClient$$ExternalSyntheticLambda0) obj).invoke();
                return;
            case 15:
                ((LaunchTracker.LaunchInProgress) obj).lastLifecycleChangeDoneUptimeMillis = Long.valueOf(SystemClock.uptimeMillis());
                return;
            default:
                ArrayList arrayList = ((PerfsActivityLifecycleCallbacks) obj).joinedPosts;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                arrayList.clear();
                return;
        }
    }
}
