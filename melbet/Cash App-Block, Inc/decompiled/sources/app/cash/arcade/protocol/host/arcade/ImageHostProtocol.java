package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.DividerStyle;
import app.cash.arcade.values.ImageResource;
import app.cash.redwood.layout.view.ViewSpacer;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Dp;
import coil3.RealImageLoader;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.gms.time.zzc;
import com.squareup.cash.arcade.treehouse.CarouselBinding;
import com.squareup.cash.arcade.treehouse.DividerBinding;
import com.squareup.cash.arcade.treehouse.ImageBinding;
import com.squareup.cash.arcade.treehouse.ShimmerBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class ImageHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;

    public ImageHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                this.serializer_0 = ImageResource.Companion.serializer();
                break;
            case 2:
                this.mismatchHandler = bVar;
                this.serializer_0 = DividerStyle.Companion.serializer();
                break;
            case 3:
                this.mismatchHandler = bVar;
                this.serializer_0 = Dp.Companion.serializer();
                break;
            case 4:
                this.mismatchHandler = bVar;
                this.serializer_0 = Dp.Companion.serializer();
                break;
            default:
                this.mismatchHandler = bVar;
                this.serializer_0 = ImageResource.Companion.serializer();
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
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                return new IconProtocolNode(i, new ImageBinding((Context) anchoredDraggableState.positionalThreshold, (RealImageLoader) anchoredDraggableState.draggableState), this, 12);
            case 1:
                return new IconProtocolNode(i, new CarouselBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 1), this, 9);
            case 2:
                return new IconProtocolNode(i, new DividerBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 10);
            case 3:
                return new IconProtocolNode(i, new ShimmerBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 27);
            default:
                return new TextProtocolNode(i, new ViewSpacer(((zzc) svg.cssRules).zza), this, 8);
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
        n.b bVar = this.mismatchHandler;
        KSerializer kSerializer = this.serializer_0;
        switch (i2) {
            case 0:
                if (i == 1) {
                    return kSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(57, i);
                return null;
            case 1:
                if (i == 1) {
                    return kSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(18, i);
                return null;
            case 2:
                if (i == 1) {
                    return kSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(43, i);
                return null;
            case 3:
                if (i == 1) {
                    return kSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(66, i);
                return null;
            default:
                if (i != 1 && i != 2) {
                    bVar.m1946onUnknownPropertyLKUuuww(1000003, i);
                    return null;
                }
                return kSerializer;
        }
    }
}
