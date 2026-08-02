package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.AttributedString;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.TextAlign;
import app.cash.arcade.values.TextStyle;
import app.cash.arcade.values.TruncateAt;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.TextBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class TextHostProtocol implements WidgetHostProtocol {
    public final JsonImpl json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0 = AttributedString.Companion.serializer();
    public final KSerializer serializer_1 = TextStyle.Companion.serializer();
    public final KSerializer serializer_2 = Color.Companion.serializer();
    public final KSerializer serializer_3 = TextAlign.Companion.serializer();
    public final KSerializer serializer_4 = BuiltinSerializersKt.getNullable(ImageResource.Companion.serializer());
    public final KSerializer serializer_5 = BuiltinSerializersKt.getNullable(TruncateAt.Companion.serializer());
    public final IntSerializer serializer_6 = IntSerializer.INSTANCE;
    public final BooleanSerializer serializer_7 = BooleanSerializer.INSTANCE;
    public final StringSerializer serializer_8 = StringSerializer.INSTANCE;

    public TextHostProtocol(JsonImpl jsonImpl, n.b bVar) {
        this.json = jsonImpl;
        this.mismatchHandler = bVar;
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: createNode-z3jyS0k */
    public final ProtocolNode mo1197createNodez3jyS0k(int i, SVG svg) {
        svg.getClass();
        return new TextProtocolNode(i, new TextBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 0);
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        return null;
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        KSerializer kSerializer = this.serializer_4;
        switch (i) {
            case 1:
                return this.serializer_0;
            case 2:
                return this.serializer_1;
            case 3:
                return kSerializer;
            case 4:
                return kSerializer;
            case 5:
                return this.serializer_5;
            case 6:
                return this.serializer_6;
            case 7:
                return this.serializer_2;
            case 8:
                return this.serializer_3;
            case 9:
                return this.serializer_7;
            default:
                this.mismatchHandler.m1946onUnknownPropertyLKUuuww(13, i);
                return null;
        }
    }
}
