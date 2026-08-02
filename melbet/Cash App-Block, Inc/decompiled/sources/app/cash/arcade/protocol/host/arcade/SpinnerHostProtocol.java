package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.ArcadeTimelineItemState;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.IconSize;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.ArcadeTimelineItemBinding;
import com.squareup.cash.arcade.treehouse.SpinnerBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class SpinnerHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final KSerializer serializer_1;

    public SpinnerHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                this.serializer_0 = ArcadeTimelineItemState.Companion.serializer();
                this.serializer_1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                break;
            default:
                this.mismatchHandler = bVar;
                this.serializer_0 = Color.Companion.serializer();
                this.serializer_1 = IconSize.Companion.serializer();
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
                return new IconProtocolNode(i, new SpinnerBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 28);
            default:
                return new IconProtocolNode(i, new ArcadeTimelineItemBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 3);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
        }
        return null;
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        KSerializer kSerializer = this.serializer_0;
        n.b bVar = this.mismatchHandler;
        KSerializer kSerializer2 = this.serializer_1;
        switch (i2) {
            case 0:
                if (i == 1) {
                    break;
                } else if (i == 2) {
                    break;
                } else {
                    bVar.m1946onUnknownPropertyLKUuuww(22, i);
                    break;
                }
            default:
                if (i == 1) {
                    break;
                } else if (i != 2 && i != 3 && i != 4 && i != 5) {
                    bVar.m1946onUnknownPropertyLKUuuww(74, i);
                    break;
                }
                break;
        }
        return kSerializer;
    }
}
