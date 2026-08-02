package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.BooleanState;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.BottomSheetBinding;
import com.squareup.cash.arcade.treehouse.ToggleBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class ToggleHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final JsonImpl json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final BooleanSerializer serializer_1;

    public ToggleHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanState.Companion.serializer();
                this.serializer_1 = BooleanSerializer.INSTANCE;
                break;
            case 2:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_1 = BooleanSerializer.INSTANCE;
                this.serializer_0 = IntSerializer.INSTANCE;
                break;
            default:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanState.Companion.serializer();
                this.serializer_1 = BooleanSerializer.INSTANCE;
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
                return new TextProtocolNode(i, new ToggleBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 0), this, 7);
            case 1:
                return new IconProtocolNode(i, new ToggleBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 1), this, 8);
            default:
                return new CarouselProtocolNode(i, new BottomSheetBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return new int[]{1};
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        KSerializer kSerializer = this.serializer_0;
        n.b bVar = this.mismatchHandler;
        BooleanSerializer booleanSerializer = this.serializer_1;
        switch (i2) {
            case 0:
                if (i == 1) {
                    return kSerializer;
                }
                if (i == 2 || i == 3) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(78, i);
                return null;
            case 1:
                if (i == 1) {
                    return kSerializer;
                }
                if (i == 2 || i == 3) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(76, i);
                return null;
            default:
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return booleanSerializer;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(39, i);
                        return null;
                }
        }
    }
}
