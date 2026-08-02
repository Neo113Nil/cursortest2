package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.IconSize;
import app.cash.arcade.values.ImageResource;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.layout.view.ViewBox;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Margin;
import coil3.RealImageLoader;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.gms.time.zzc;
import com.squareup.cash.arcade.treehouse.IconBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class IconHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final KSerializer serializer_1;
    public final KSerializer serializer_2;

    public IconHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                this.serializer_0 = Constraint.Companion.serializer();
                this.serializer_1 = Margin.Companion.serializer();
                this.serializer_2 = CrossAxisAlignment.Companion.serializer();
                break;
            default:
                this.mismatchHandler = bVar;
                this.serializer_0 = ImageResource.Companion.serializer();
                this.serializer_1 = BuiltinSerializersKt.getNullable(Color.Companion.serializer());
                this.serializer_2 = BuiltinSerializersKt.getNullable(IconSize.Companion.serializer());
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
                return new IconProtocolNode(i, new IconBinding((Context) anchoredDraggableState.positionalThreshold, (RealImageLoader) anchoredDraggableState.draggableState), this, 0);
            default:
                return new CarouselProtocolNode(i, new ViewBox(((zzc) svg.cssRules).zza), this);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new int[]{1};
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        KSerializer kSerializer = this.serializer_1;
        n.b bVar = this.mismatchHandler;
        KSerializer kSerializer2 = this.serializer_2;
        KSerializer kSerializer3 = this.serializer_0;
        switch (i2) {
            case 0:
                if (i == 1) {
                    break;
                } else if (i == 2) {
                    break;
                } else if (i == 3) {
                    break;
                } else {
                    bVar.m1946onUnknownPropertyLKUuuww(16, i);
                    break;
                }
            default:
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        break;
                    } else if (i != 4 && i != 5) {
                        bVar.m1946onUnknownPropertyLKUuuww(1000004, i);
                        break;
                    }
                }
                break;
        }
        return kSerializer3;
    }
}
