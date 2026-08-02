package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.ButtonSize;
import app.cash.arcade.values.ButtonStyle;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.TextStyle;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.lazylayout.api.ScrollItemIndex;
import app.cash.redwood.lazylayout.view.ViewRefreshableLazyList;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Margin;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.play.core.appupdate.zzi;
import com.squareup.cash.arcade.treehouse.ButtonBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class ButtonHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final Object serializer_0;
    public final BooleanSerializer serializer_1;
    public final KSerializer serializer_2;
    public final KSerializer serializer_3;
    public final KSerializer serializer_4;
    public final KSerializer serializer_5;
    public final KSerializer serializer_6;
    public final KSerializer serializer_7;

    public ButtonHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.serializer_0 = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_1 = BooleanSerializer.INSTANCE;
                this.serializer_6 = IntSerializer.INSTANCE;
                this.serializer_2 = Constraint.Companion.serializer();
                this.serializer_3 = Margin.Companion.serializer();
                this.serializer_4 = CrossAxisAlignment.Companion.serializer();
                this.serializer_5 = ScrollItemIndex.Companion.serializer();
                this.serializer_7 = UIntSerializer.INSTANCE;
                break;
            default:
                this.mismatchHandler = bVar;
                this.serializer_0 = StringSerializer.INSTANCE;
                this.serializer_1 = BooleanSerializer.INSTANCE;
                this.serializer_2 = ButtonStyle.Companion.serializer();
                this.serializer_3 = ButtonSize.Companion.serializer();
                this.serializer_4 = BuiltinSerializersKt.getNullable(Color.Companion.serializer());
                this.serializer_5 = BuiltinSerializersKt.getNullable(ImageResource.Companion.serializer());
                this.serializer_6 = BuiltinSerializersKt.getNullable(TextStyle.Companion.serializer());
                this.serializer_7 = ButtonProminence.Companion.serializer();
                break;
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: createNode-z3jyS0k, reason: not valid java name */
    public final ProtocolNode mo1197createNodez3jyS0k(int i, SVG svg) {
        int i2 = this.$r8$classId;
        svg.getClass();
        switch (i2) {
            case 0:
                return new IconProtocolNode(i, new ButtonBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 6);
            default:
                return new NavBarProtocolNode(i, new ViewRefreshableLazyList(((zzi) svg.idToElementMap).zza), this);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                return new int[]{1, 2};
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA, reason: not valid java name */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        KSerializer kSerializer = this.serializer_3;
        KSerializer kSerializer2 = this.serializer_4;
        KSerializer kSerializer3 = this.serializer_5;
        KSerializer kSerializer4 = this.serializer_7;
        n.b bVar = this.mismatchHandler;
        BooleanSerializer booleanSerializer = this.serializer_1;
        KSerializer kSerializer5 = this.serializer_2;
        KSerializer kSerializer6 = this.serializer_6;
        switch (i2) {
            case 0:
                switch (i) {
                    case 1:
                        return (StringSerializer) this.serializer_0;
                    case 2:
                    case 4:
                        return booleanSerializer;
                    case 3:
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(11, i);
                        return null;
                    case 5:
                        return kSerializer5;
                    case 6:
                        return kSerializer;
                    case 7:
                        return kSerializer2;
                    case 8:
                        return kSerializer3;
                    case 9:
                        return kSerializer2;
                    case 10:
                        return kSerializer6;
                    case 11:
                        return kSerializer2;
                    case 12:
                        return kSerializer4;
                }
            default:
                IntSerializer intSerializer = (IntSerializer) kSerializer6;
                switch (i) {
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                        return booleanSerializer;
                    case 3:
                    case 4:
                        return intSerializer;
                    case 7:
                        return kSerializer5;
                    case 8:
                        return kSerializer5;
                    case 9:
                        return kSerializer;
                    case 10:
                        return kSerializer2;
                    case 11:
                        return kSerializer3;
                    case 12:
                        return (UIntSerializer) kSerializer4;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(2000002, i);
                        return null;
                }
        }
    }
}
