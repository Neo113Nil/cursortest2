package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.broadway.navigation.Navigator;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.CarouselBinding;
import com.squareup.cash.arcade.treehouse.FormBinding;
import com.squareup.cash.arcade.treehouse.ScaffoldBinding;
import com.squareup.cash.db2.Instrument$Adapter;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class FormHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;

    public /* synthetic */ FormHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        this.mismatchHandler = bVar;
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: createNode-z3jyS0k */
    public final ProtocolNode mo1197createNodez3jyS0k(int i, SVG svg) {
        int i2 = this.$r8$classId;
        svg.getClass();
        switch (i2) {
            case 0:
                return new FormProtocolNode(i, new FormBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
            case 1:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                return new CarouselProtocolNode(i, new CarouselBinding((Instrument$Adapter) anchoredDraggableState.dragTarget$delegate, (Navigator) anchoredDraggableState.confirmValueChange, (Context) anchoredDraggableState.positionalThreshold), this);
            case 2:
                return new CarouselProtocolNode(i, new CarouselBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 0), this, (byte) 0);
            case 3:
                return new CarouselProtocolNode(i, new CarouselBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 2), this, (char) 0);
            case 4:
                return new CarouselProtocolNode(i, new CarouselBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 5), this, 0);
            default:
                return new FormProtocolNode(i, new ScaffoldBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return new int[]{1, 2, 3};
            case 1:
                return new int[]{1};
            case 2:
                return new int[]{1};
            case 3:
                return new int[]{1};
            case 4:
                return new int[]{1};
            default:
                return new int[]{1, 2, 3};
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        n.b bVar = this.mismatchHandler;
        switch (i2) {
            case 0:
                bVar.m1946onUnknownPropertyLKUuuww(20, i);
                break;
            case 1:
                bVar.m1946onUnknownPropertyLKUuuww(54, i);
                break;
            case 2:
                bVar.m1946onUnknownPropertyLKUuuww(25, i);
                break;
            case 3:
                bVar.m1946onUnknownPropertyLKUuuww(46, i);
                break;
            case 4:
                bVar.m1946onUnknownPropertyLKUuuww(52, i);
                break;
            default:
                bVar.m1946onUnknownPropertyLKUuuww(42, i);
                break;
        }
        return null;
    }
}
