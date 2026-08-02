package com.datadog.android.core.internal.persistence.file.advanced;

import com.android.volley.toolbox.HurlStack;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.datadog.android.privacy.TrackingConsent;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import radiography.Radiography$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public abstract class ConsentAwareFileOrchestrator implements FileOrchestrator {
    public static final HurlStack NO_OP_ORCHESTRATOR = new HurlStack(25);
    public final SVG dataMigrator;
    public volatile FileOrchestrator delegateOrchestrator;
    public final BackPressureExecutorService executorService;
    public final BatchFileOrchestrator grantedOrchestrator;
    public final InternalLogger internalLogger;
    public final BatchFileOrchestrator pendingOrchestrator;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConsentAwareFileOrchestrator(ConsentProvider consentProvider, BatchFileOrchestrator batchFileOrchestrator, BatchFileOrchestrator batchFileOrchestrator2, SVG svg, BackPressureExecutorService backPressureExecutorService, InternalLogger internalLogger) {
        consentProvider.getClass();
        internalLogger.getClass();
        this.pendingOrchestrator = batchFileOrchestrator;
        this.grantedOrchestrator = batchFileOrchestrator2;
        this.dataMigrator = svg;
        this.executorService = backPressureExecutorService;
        this.internalLogger = internalLogger;
        TrackingConsent consent = consentProvider.getConsent();
        zzho.executeSafe(backPressureExecutorService, "Data migration", internalLogger, new Radiography$$ExternalSyntheticLambda0(this, null, resolveDelegateOrchestrator(null), consent, resolveDelegateOrchestrator(consent), 3));
        consentProvider.registerCallback(this);
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final File getMetadataFile(File file) {
        FileOrchestrator fileOrchestrator = this.delegateOrchestrator;
        if (fileOrchestrator != null) {
            return fileOrchestrator.getMetadataFile(file);
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOrchestrator");
        throw null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final File getRootDir() {
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final File getWritableFile() {
        FileOrchestrator fileOrchestrator = this.delegateOrchestrator;
        if (fileOrchestrator != null) {
            return fileOrchestrator.getWritableFile();
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOrchestrator");
        throw null;
    }

    public final FileOrchestrator resolveDelegateOrchestrator(TrackingConsent trackingConsent) {
        int i = trackingConsent == null ? -1 : WhenMappings.$EnumSwitchMapping$0[trackingConsent.ordinal()];
        if (i == -1 || i == 1) {
            return this.pendingOrchestrator;
        }
        if (i == 2) {
            return this.grantedOrchestrator;
        }
        if (i == 3) {
            return NO_OP_ORCHESTRATOR;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
