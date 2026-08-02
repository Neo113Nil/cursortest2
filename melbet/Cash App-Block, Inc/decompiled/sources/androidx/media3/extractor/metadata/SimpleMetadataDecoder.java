package androidx.media3.extractor.metadata;

import androidx.media3.common.Metadata;
import androidx.tracing.Trace;
import com.squareup.cash.cdf.disputeshistory.DisputesHistoryViewLoad;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda4;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class SimpleMetadataDecoder {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayAppletPurchases.deepLinkSpecs;
    }

    public static final void logViewDisputesList(Analytics analytics, SupportScreens.FlowScreens.SupportDisputeTrackerScreen supportDisputeTrackerScreen, boolean z, Boolean bool, ArrayList arrayList) {
        supportDisputeTrackerScreen.getClass();
        analytics.track(new DisputesHistoryViewLoad(z ? DisputesHistoryViewLoad.Status.SUCCESS : DisputesHistoryViewLoad.Status.FAILURE, arrayList != null ? CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(7), 30) : null, supportDisputeTrackerScreen.data.flowToken, bool), null);
    }

    public Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        byteBuffer.getClass();
        Trace.checkArgument(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return decode(metadataInputBuffer, byteBuffer);
    }

    public abstract Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);
}
