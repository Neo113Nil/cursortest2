package com.datadog.android.trace;

import androidx.camera.video.Recorder;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.trace.api.tracer.DatadogTracerBuilder;
import com.datadog.android.trace.internal.DatadogTracerBuilderAdapter;
import com.datadog.android.trace.internal.TracingFeature;
import com.datadog.trace.api.Config;
import com.datadog.trace.common.writer.NoOpWriter;
import com.datadog.trace.common.writer.Writer;
import com.datadog.trace.core.CoreTracer;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateBitcoinWithdrawalScenarioPlan$Factory$Impl;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;

/* loaded from: classes4.dex */
public abstract class DatadogTracing {
    public static /* synthetic */ int getRequestCode$payments_core_release(StripeIntent stripeIntent) {
        stripeIntent.getClass();
        return stripeIntent instanceof PaymentIntent ? 50000 : 50001;
    }

    public static final DatadogTracerBuilder newTracerBuilder(InternalSdkCore internalSdkCore) {
        internalSdkCore.getClass();
        if (!(internalSdkCore instanceof InternalSdkCore)) {
            return new zzc(2);
        }
        InternalSdkCore internalSdkCore2 = internalSdkCore;
        InternalLogger internalLogger = internalSdkCore2.getInternalLogger();
        SdkFeature feature = internalSdkCore2.getFeature("tracing");
        Feature feature2 = feature != null ? feature.wrappedFeature : null;
        TracingFeature tracingFeature = feature2 instanceof TracingFeature ? (TracingFeature) feature2 : null;
        Recorder.AnonymousClass6 anonymousClass6 = tracingFeature != null ? new Recorder.AnonymousClass6(tracingFeature.coreTracerDataWriter, 1) : null;
        if (anonymousClass6 == null) {
            anonymousClass6 = null;
        }
        Writer writer = anonymousClass6 != null ? (Writer) anonymousClass6.this$0 : null;
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (feature2 == null) {
            DBUtil.log$default(internalLogger, 5, target, DatadogTracing$newTracerBuilder$1.INSTANCE, null, false, 56);
        } else if (tracingFeature == null) {
            DBUtil.log$default(internalLogger, 5, InternalLogger.Target.MAINTAINER, DatadogTracing$newTracerBuilder$1.INSTANCE$1, null, false, 56);
        } else if (writer == null) {
            DBUtil.log$default(internalLogger, 5, target, new DatadogTracing$newTracerBuilder$1(tracingFeature), null, false, 56);
        } else if (internalSdkCore.getService().length() == 0) {
            DBUtil.log$default(internalLogger, 5, target, DatadogTracing$newTracerBuilder$1.INSTANCE$2, null, false, 56);
        }
        String service = internalSdkCore.getService();
        InternalLogger internalLogger2 = internalSdkCore2.getInternalLogger();
        CoreTracer.CoreTracerBuilder coreTracerBuilder = new CoreTracer.CoreTracerBuilder();
        coreTracerBuilder.writer = new NoOpWriter();
        coreTracerBuilder.config(Config.INSTANCE);
        coreTracerBuilder.internalLogger = internalLogger2;
        if (writer == null) {
            writer = new NoOpWriter();
        }
        coreTracerBuilder.writer = writer;
        return new DatadogTracerBuilderAdapter(internalSdkCore2, service, coreTracerBuilder);
    }

    public static ScenarioPlan.Factory provideInitiateBitcoinWithdrawalScenarioPlanFactory(InitiateBitcoinWithdrawalScenarioPlan$Factory$Impl initiateBitcoinWithdrawalScenarioPlan$Factory$Impl, InitiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl initiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? initiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl : initiateBitcoinWithdrawalScenarioPlan$Factory$Impl;
    }
}
