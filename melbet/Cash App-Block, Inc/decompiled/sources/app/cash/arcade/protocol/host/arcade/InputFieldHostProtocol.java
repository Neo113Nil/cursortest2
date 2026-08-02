package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.ImeAction;
import app.cash.arcade.values.InputFieldHelperText;
import app.cash.arcade.values.KeyboardCapitalization;
import app.cash.arcade.values.KeyboardType;
import app.cash.arcade.values.TextFieldLineLimits;
import app.cash.arcade.values.TextFieldState;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.InputFieldBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class InputFieldHostProtocol implements WidgetHostProtocol {
    public final JsonImpl json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0 = TextFieldState.Companion.serializer();
    public final BooleanSerializer serializer_1;
    public final KSerializer serializer_2;
    public final KSerializer serializer_3;
    public final KSerializer serializer_4;
    public final KSerializer serializer_5;
    public final KSerializer serializer_6;
    public final KSerializer serializer_7;
    public final KSerializer serializer_8;
    public final KSerializer serializer_9;

    public InputFieldHostProtocol(JsonImpl jsonImpl, n.b bVar) {
        this.json = jsonImpl;
        this.mismatchHandler = bVar;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        this.serializer_1 = booleanSerializer;
        this.serializer_2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        this.serializer_3 = BuiltinSerializersKt.getNullable(ImageResource.Companion.serializer());
        this.serializer_4 = BuiltinSerializersKt.getNullable(InputFieldHelperText.Companion.serializer());
        this.serializer_5 = BuiltinSerializersKt.getNullable(KeyboardCapitalization.Companion.serializer());
        this.serializer_6 = BuiltinSerializersKt.getNullable(booleanSerializer);
        this.serializer_7 = BuiltinSerializersKt.getNullable(KeyboardType.Companion.serializer());
        this.serializer_8 = BuiltinSerializersKt.getNullable(ImeAction.Companion.serializer());
        this.serializer_9 = BuiltinSerializersKt.getNullable(TextFieldLineLimits.Companion.serializer());
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: createNode-z3jyS0k */
    public final ProtocolNode mo1197createNodez3jyS0k(int i, SVG svg) {
        svg.getClass();
        return new IconProtocolNode(i, new InputFieldBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 14);
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        return null;
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        KSerializer kSerializer = this.serializer_3;
        KSerializer kSerializer2 = this.serializer_6;
        KSerializer kSerializer3 = this.serializer_2;
        switch (i) {
            case 1:
                return this.serializer_0;
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 12:
            case 21:
            case 22:
            case 23:
                return this.serializer_1;
            case 6:
                return kSerializer3;
            case 7:
                return kSerializer;
            case 8:
                return kSerializer3;
            case 10:
                return kSerializer;
            case 11:
                return kSerializer3;
            case 13:
                return this.serializer_4;
            case 14:
                return kSerializer3;
            case 15:
                return this.serializer_5;
            case 16:
                return kSerializer2;
            case 17:
                return this.serializer_7;
            case 18:
                return this.serializer_8;
            case 19:
                return kSerializer2;
            case 20:
                return this.serializer_9;
            default:
                this.mismatchHandler.m1946onUnknownPropertyLKUuuww(80, i);
                return null;
        }
    }
}
