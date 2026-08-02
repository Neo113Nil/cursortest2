package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.IntRectKt;
import androidx.core.graphics.TypefaceCompat$$ExternalSyntheticApiModelOutline0;
import androidx.datastore.core.SimpleActor;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagy;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class ScrollCapture {
    public final ParcelableSnapshotMutableState scrollCaptureInProgress$delegate = Updater.mutableStateOf$default(Boolean.FALSE);

    public final void onScrollCaptureSearch(AndroidComposeView androidComposeView, SimpleActor simpleActor, CoroutineContext coroutineContext, Consumer consumer) {
        MutableVector mutableVector = new MutableVector(0, new ScrollCaptureCandidate[16]);
        zzagy.visitScrollCaptureCandidates(simpleActor.getUnmergedRootSemanticsNode(), 0, new ScrollCapture$onScrollCaptureSearch$1(mutableVector));
        Arrays.sort(mutableVector.content, 0, mutableVector.size, ComparisonsKt__ComparisonsKt.compareBy(ScrollCapture$onScrollCaptureSearch$2.INSTANCE, ScrollCapture$onScrollCaptureSearch$2.INSTANCE$2));
        int i = mutableVector.size;
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (i == 0 ? null : mutableVector.content[i - 1]);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), JobKt.CoroutineScope(coroutineContext), this, androidComposeView);
        LayoutCoordinates coordinates = scrollCaptureCandidate.getCoordinates();
        Rect localBoundingBoxOf = ValueInsets.findRootCoordinates(coordinates).localBoundingBoxOf(coordinates, true);
        long m1052getTopLeftnOccac = scrollCaptureCandidate.getViewportBoundsInWindow().m1052getTopLeftnOccac();
        ScrollCaptureTarget m = TypefaceCompat$$ExternalSyntheticApiModelOutline0.m(androidComposeView, ColorKt.toAndroidRect(IntRectKt.roundToIntRect(localBoundingBoxOf)), new Point((int) (m1052getTopLeftnOccac >> 32), (int) (m1052getTopLeftnOccac & BodyPartID.bodyIdMax)), composeScrollCaptureCallback);
        m.setScrollBounds(ColorKt.toAndroidRect(scrollCaptureCandidate.getViewportBoundsInWindow()));
        consumer.accept(m);
    }
}
