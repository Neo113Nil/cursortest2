package com.datadog.android.rum;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutParentData;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.State;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.room.util.DBUtil;
import app.cash.trifle.KeyHandle$keyPair$2;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.net.Request;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.DatadogCore$safeWithLock$1;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$request$1;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl;
import com.datadog.android.rum.model.ViewEvent;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.squareup.workflow1.ui.AttachedScope;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes4.dex */
public final class Rum$createMonitor$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $rumAppStartupTelemetryReporter;
    public final /* synthetic */ Object $rumVitalAppLaunchEventHelper;
    public final /* synthetic */ Object $sdkCore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Rum$createMonitor$1(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.$r8$classId = i;
        this.$rumVitalAppLaunchEventHelper = obj;
        this.$sdkCore = obj2;
        this.$rumAppStartupTelemetryReporter = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.$rumAppStartupTelemetryReporter;
        Object obj2 = this.$sdkCore;
        Object obj3 = this.$rumVitalAppLaunchEventHelper;
        switch (i) {
            case 0:
                return new RumSessionScopeStartupManagerImpl((MemorySizeCalculator$Builder) obj3, (InternalSdkCore) obj2, (MediaLoadData) obj);
            case 1:
                List list = (List) obj3;
                ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) obj2;
                ConstraintLayoutScope constraintLayoutScope = constraintSetForInlineDsl.scope;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object parentData = ((Measurable) list.get(i2)).getParentData();
                    ConstraintLayoutParentData constraintLayoutParentData = parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null;
                    if (constraintLayoutParentData != null) {
                        ConstrainedLayoutReference constrainedLayoutReference = constraintLayoutParentData.ref;
                        constraintLayoutParentData.constrain.invoke(new ConstrainScope(constrainedLayoutReference.id, constraintLayoutScope.asCLContainer$constraintlayout_compose_release(constrainedLayoutReference)));
                    }
                    constraintSetForInlineDsl.previousDatas.add(constraintLayoutParentData);
                }
                constraintLayoutScope.applyTo((State) obj);
                return Unit.INSTANCE;
            case 2:
                return String.format(Locale.US, "You are using a url \"%s\" instead of a host to setup %s tracking. You should use instead a valid host name: \"%s\"", Arrays.copyOf(new Object[]{(String) obj3, (String) obj2, ((URL) obj).getHost()}, 3));
            case 3:
                DatadogCore datadogCore = (DatadogCore) obj3;
                String str = (String) obj2;
                SdkFeature sdkFeature = (SdkFeature) datadogCore.features.get(str);
                if (sdkFeature != null) {
                    Lock writeLock = sdkFeature.featureContextLock.writeLock();
                    writeLock.getClass();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    AndroidPopup_androidKt$Popup$3$1 androidPopup_androidKt$Popup$3$1 = new AndroidPopup_androidKt$Popup$3$1(sdkFeature, (Function1) obj, datadogCore, str, 4);
                    InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
                    InternalLogger.Target target2 = InternalLogger.Target.USER;
                    try {
                        boolean tryLock = writeLock.tryLock(1L, timeUnit);
                        if (tryLock) {
                            try {
                                androidPopup_androidKt$Popup$3$1.invoke();
                            } finally {
                                if (tryLock) {
                                    writeLock.unlock();
                                }
                            }
                        } else {
                            DBUtil.log$default(datadogCore.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new DatadogCore$safeWithLock$1(writeLock, 1), null, 56);
                        }
                    } catch (InterruptedException e) {
                        DBUtil.log$default(datadogCore.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new DatadogCore$safeWithLock$1(writeLock, 2), e, 48);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                InternalLogger.Target target3 = InternalLogger.Target.USER;
                DataOkHttpUploader dataOkHttpUploader = (DataOkHttpUploader) obj3;
                try {
                    return DataOkHttpUploader.access$executeUploadRequest(dataOkHttpUploader, (Request) obj2);
                } catch (UnknownHostException e2) {
                    DBUtil.log$default(dataOkHttpUploader.internalLogger, 5, target3, new KeyHandle$keyPair$2((DatadogContext) obj, 12), e2, false, 48);
                    return new UploadStatus.DNSError(0, 2, e2, true);
                } catch (IOException e3) {
                    DBUtil.log$default(dataOkHttpUploader.internalLogger, 5, target3, DataOkHttpUploader$upload$request$1.INSTANCE$2, e3, false, 48);
                    return new UploadStatus.NetworkError(0, 2, e3, true);
                } catch (Throwable th) {
                    DBUtil.log$default(dataOkHttpUploader.internalLogger, 5, target3, DataOkHttpUploader$upload$request$1.INSTANCE$3, th, false, 48);
                    return new UploadStatus.UnknownException(0, 2, th, true);
                }
            case 5:
                String str2 = (String) obj2;
                ((SessionEndedMetricDispatcher) obj3).getClass();
                String str3 = ((ViewEvent) obj).view.url;
                return CameraSelector$$ExternalSyntheticOutline0.m("Failed to track ", Intrinsics.areEqual(str3, "com/datadog/application-launch/view") ? "AppLaunch" : Intrinsics.areEqual(str3, "com/datadog/background/view") ? "Background" : "Custom", " view in session with different UUID ", str2);
            case 6:
                if (((AtomicInteger) obj3).incrementAndGet() == ((String[]) obj2).length) {
                    ((ViewRegistryKt$buildView$1$2$1$1) obj).invoke();
                }
                return Unit.INSTANCE;
            case 7:
                BarcodeAnalysisFragment barcodeAnalysisFragment = (BarcodeAnalysisFragment) obj3;
                BarcodeAnalysisFragment.Companion companion = BarcodeAnalysisFragment.Companion;
                barcodeAnalysisFragment.a(barcodeAnalysisFragment.b(), (MiSnapSettings) obj2, barcodeAnalysisFragment.a$1(), (MiSnapFinalResult) obj);
                return Unit.INSTANCE;
            case 8:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) obj3;
                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                documentAnalysisFragment.a$1(documentAnalysisFragment.b$1(), (MiSnapSettings) obj2, documentAnalysisFragment.a$2(), (MiSnapFinalResult) obj);
                return Unit.INSTANCE;
            case 9:
                FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) obj3;
                FaceAnalysisFragment.Companion companion3 = FaceAnalysisFragment.Companion;
                faceAnalysisFragment.a$2(faceAnalysisFragment.c$1(), (MiSnapSettings) obj2, faceAnalysisFragment.b$1(), (MiSnapFinalResult) obj);
                return Unit.INSTANCE;
            default:
                JobKt.launch(((AttachedScope) obj3).coroutineScope, (CoroutineContext) obj2, CoroutineStart.UNDISPATCHED, (WorkerWorkflow$render$1) obj);
                return Unit.INSTANCE;
        }
    }
}
