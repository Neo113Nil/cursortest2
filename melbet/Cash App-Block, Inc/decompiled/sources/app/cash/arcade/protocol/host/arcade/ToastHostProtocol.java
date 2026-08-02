package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.LegacyDialogAction;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import coil3.RealImageLoader;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.CardUpsellBinding;
import com.squareup.cash.arcade.treehouse.LegacyDialogBinding;
import com.squareup.cash.arcade.treehouse.ToastBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class ToastHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final BooleanSerializer serializer_0;
    public final StringSerializer serializer_1;
    public final KSerializer serializer_2;
    public final KSerializer serializer_3;

    public ToastHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                this.serializer_1 = stringSerializer;
                this.serializer_2 = BuiltinSerializersKt.getNullable(stringSerializer);
                this.serializer_0 = BooleanSerializer.INSTANCE;
                this.serializer_3 = BuiltinSerializersKt.getNullable(ImageResource.Token.Companion.serializer());
                break;
            case 2:
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanSerializer.INSTANCE;
                this.serializer_1 = StringSerializer.INSTANCE;
                LegacyDialogAction.Companion companion = LegacyDialogAction.Companion;
                this.serializer_2 = companion.serializer();
                this.serializer_3 = BuiltinSerializersKt.getNullable(companion.serializer());
                break;
            default:
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanSerializer.INSTANCE;
                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                this.serializer_1 = stringSerializer2;
                this.serializer_2 = BuiltinSerializersKt.getNullable(ImageResource.Companion.serializer());
                this.serializer_3 = BuiltinSerializersKt.getNullable(stringSerializer2);
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
                return new TextProtocolNode(i, new ToastBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 6);
            case 1:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                return new IconProtocolNode(i, new CardUpsellBinding((Context) anchoredDraggableState.positionalThreshold, (RealImageLoader) anchoredDraggableState.draggableState), this, 7);
            default:
                return new IconProtocolNode(i, new LegacyDialogBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 16);
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
        KSerializer kSerializer = this.serializer_2;
        KSerializer kSerializer2 = this.serializer_3;
        n.b bVar = this.mismatchHandler;
        BooleanSerializer booleanSerializer = this.serializer_0;
        StringSerializer stringSerializer = this.serializer_1;
        switch (i2) {
            case 0:
                switch (i) {
                    case 1:
                    case 7:
                        return booleanSerializer;
                    case 2:
                        return stringSerializer;
                    case 3:
                        return kSerializer;
                    case 4:
                        return kSerializer2;
                    case 5:
                        return kSerializer2;
                    case 6:
                        return kSerializer2;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(82, i);
                        return null;
                }
            case 1:
                if (i != 1) {
                    if (i == 2) {
                        return kSerializer;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            return booleanSerializer;
                        }
                        if (i == 5) {
                            return kSerializer2;
                        }
                        bVar.m1946onUnknownPropertyLKUuuww(79, i);
                        return null;
                    }
                }
                return stringSerializer;
            default:
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                    case 9:
                        return booleanSerializer;
                    case 4:
                    case 5:
                        return stringSerializer;
                    case 6:
                        return kSerializer;
                    case 8:
                        return kSerializer2;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(67, i);
                        return null;
                }
        }
    }
}
