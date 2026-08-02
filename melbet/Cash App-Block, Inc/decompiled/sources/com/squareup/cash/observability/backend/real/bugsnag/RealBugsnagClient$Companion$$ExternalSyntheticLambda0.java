package com.squareup.cash.observability.backend.real.bugsnag;

import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.draw.ScaleKt;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.bugsnag.android.Error;
import com.bugsnag.android.Event;
import com.bugsnag.android.EventInternal;
import com.bugsnag.android.OnErrorCallback;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.real.WeakThrowableScribe;
import com.squareup.cash.observability.types.FeatureError;
import com.squareup.cash.observability.types.MetadataSection$AdditionalInfoSection;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.ThrowableScribe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes.dex */
public final /* synthetic */ class RealBugsnagClient$Companion$$ExternalSyntheticLambda0 implements OnErrorCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RealBugsnagClient$Companion$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.bugsnag.android.OnErrorCallback
    public final boolean onError(Event event) {
        String groupingDescriptor;
        Throwable th;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                BugsnagTree bugsnagTree = (BugsnagTree) obj;
                synchronized (bugsnagTree.buffer) {
                    Iterator it = bugsnagTree.buffer.iterator();
                    it.getClass();
                    int i2 = 1;
                    while (it.hasNext()) {
                        int i3 = i2 + 1;
                        event.addMetadata("Log", String.format(Locale.US, "%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)), (String) it.next());
                        i2 = i3;
                    }
                }
                Throwable th2 = event.impl.originalError;
                ReportedError reportedError = th2 instanceof ReportedError ? (ReportedError) th2 : null;
                if (reportedError != null && (groupingDescriptor = reportedError.getGroupingDescriptor()) != null) {
                    ByteString.Companion companion = ByteString.Companion;
                    event.impl.groupingHash = ByteString.Companion.encodeUtf8(groupingDescriptor).digest$okio("SHA-256").hex();
                }
                return true;
            case 1:
                RealBugsnagClient realBugsnagClient = (RealBugsnagClient) obj;
                EventInternal eventInternal = event.impl;
                Object obj2 = eventInternal.originalError;
                if (obj2 != null) {
                    ThrowableScribe throwableScribe = realBugsnagClient.throwableScribe;
                    if (throwableScribe == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("throwableScribe");
                        throw null;
                    }
                    DimensionKt.access$addMetadata(event, (Map) ((WeakThrowableScribe) throwableScribe).annotations.remove(obj2));
                }
                if (eventInternal.severityReason.unhandled) {
                    if (obj2 instanceof ReportedError) {
                        ReportedError reportedError2 = (ReportedError) obj2;
                        MetadataSection$AdditionalInfoSection metadataSection$AdditionalInfoSection = MetadataSection$AdditionalInfoSection.INSTANCE;
                        DimensionKt.access$addMetadata(event, SizeKt.addFeaturesFromError(reportedError2.getMetadata(), (FeatureError) obj2, ReportedError.ErrorReportingTarget.BUGSNAG));
                        String title = reportedError2.getTitle();
                        if (title != null) {
                            ArrayList arrayList = eventInternal.errors;
                            arrayList.getClass();
                            ((Error) CollectionsKt.first((List) arrayList)).setErrorClass(title);
                        }
                        String context = reportedError2.getContext();
                        if (context != null) {
                            eventInternal.context = context;
                        }
                    } else if (obj2 instanceof FeatureError) {
                        MetadataSection$AdditionalInfoSection metadataSection$AdditionalInfoSection2 = MetadataSection$AdditionalInfoSection.INSTANCE;
                        MetadataSection$AdditionalInfoSection.FeatureKey featureKey = MetadataSection$AdditionalInfoSection.FeatureKey.INSTANCE;
                        event.addMetadata("Additional Info", "Features", ScaleKt.getFeatureNames((FeatureError) obj2));
                    }
                }
                return true;
            default:
                RealBugsnagClient realBugsnagClient2 = (RealBugsnagClient) obj;
                EventInternal eventInternal2 = event.impl;
                if (eventInternal2.severityReason.unhandled && (th = eventInternal2.originalError) != null) {
                    Analytics analytics = realBugsnagClient2.analytics;
                    if (analytics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(BreadcrumbHelper.Category.ANALYTICS);
                        throw null;
                    }
                    event.addMetadata("Crash", "crash_uuid", BlurKt.reportAppCrash(th, analytics));
                }
                return true;
        }
    }
}
