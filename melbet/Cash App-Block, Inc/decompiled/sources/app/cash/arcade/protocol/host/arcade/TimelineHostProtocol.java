package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.benefitsTable.BenefitsComparisonTableRow;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import coil3.RealImageLoader;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.ArcadeTimelineBinding;
import com.squareup.cash.arcade.treehouse.BenefitsComparisonTableBinding;
import com.squareup.cash.arcade.treehouse.TimelineBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class TimelineHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;

    public TimelineHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                this.serializer_0 = IntSerializer.INSTANCE;
                break;
            case 2:
                this.mismatchHandler = bVar;
                this.serializer_0 = new HashSetSerializer(BenefitsComparisonTableRow.Companion.serializer(), 1);
                break;
            default:
                this.mismatchHandler = bVar;
                this.serializer_0 = IntSerializer.INSTANCE;
                break;
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: createNode-z3jyS0k */
    public final ProtocolNode mo1197createNodez3jyS0k(int i, SVG svg) {
        int i2 = this.$r8$classId;
        svg.getClass();
        switch (i2) {
            case 0:
                return new CarouselProtocolNode(i, new TimelineBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
            case 1:
                return new CarouselProtocolNode(i, new ArcadeTimelineBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
            default:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                return new IconProtocolNode(i, new BenefitsComparisonTableBinding((Context) anchoredDraggableState.positionalThreshold, (RealImageLoader) anchoredDraggableState.draggableState), this, 4);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
        }
        return new int[]{1};
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        n.b bVar = this.mismatchHandler;
        KSerializer kSerializer = this.serializer_0;
        switch (i2) {
            case 0:
                if (i != 1) {
                    bVar.m1946onUnknownPropertyLKUuuww(48, i);
                    break;
                } else {
                    break;
                }
            case 1:
                if (i != 1) {
                    bVar.m1946onUnknownPropertyLKUuuww(73, i);
                    break;
                } else {
                    break;
                }
            default:
                if (i != 1) {
                    bVar.m1946onUnknownPropertyLKUuuww(84, i);
                    break;
                } else {
                    break;
                }
        }
        return null;
    }
}
