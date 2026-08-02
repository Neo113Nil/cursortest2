package androidx.compose.ui.text;

import android.graphics.Path;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel$ChartLabel$DefaultLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class MultiParagraph$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda1(int i, int i2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        int i2 = this.f$2;
        int i3 = this.f$1;
        switch (i) {
            case 0:
                AndroidPath androidPath = (AndroidPath) obj2;
                ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
                AndroidParagraph androidParagraph = paragraphInfo.paragraph;
                int localIndex = paragraphInfo.toLocalIndex(i3);
                int localIndex2 = paragraphInfo.toLocalIndex(i2);
                CharSequence charSequence = androidParagraph.charSequence;
                if (localIndex < 0 || localIndex > localIndex2 || localIndex2 > charSequence.length()) {
                    StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(localIndex, localIndex2, "start(", ") or end(", ") is out of range [0..");
                    m107m.append(charSequence.length());
                    m107m.append("], or start > end!");
                    InlineClassHelperKt.throwIllegalArgumentException(m107m.toString());
                }
                Path path = new Path();
                TextLayout textLayout = androidParagraph.layout;
                textLayout.layout.getSelectionPath(localIndex, localIndex2, path);
                int i4 = textLayout.topPadding;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(RecyclerView.DECELERATION_RATE, i4);
                }
                AndroidPath androidPath2 = new AndroidPath(path);
                float f = paragraphInfo.top;
                androidPath2.m667translatek4lQ0M((Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax));
                AndroidPath.m664addPathUv8p0NA$default(androidPath, androidPath2);
                break;
            case 1:
                SegmentedBarChartViewModel.Category category = (SegmentedBarChartViewModel.Category) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                String str = category.accessibilityLabel;
                if (str == null) {
                    SegmentedBarChartViewModel$ChartLabel$DefaultLabel segmentedBarChartViewModel$ChartLabel$DefaultLabel = category.label;
                    str = segmentedBarChartViewModel$ChartLabel$DefaultLabel.text + " " + segmentedBarChartViewModel$ChartLabel$DefaultLabel.value;
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i3 - i2);
                break;
            default:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                int i5 = textLayoutResult.multiParagraph.lineCount;
                int min = Math.min(i3, i5) - 1;
                if (i5 >= min) {
                    parcelableSnapshotMutableIntState.setIntValue(min * i2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda1(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
