package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.DisplayCurrency;
import app.cash.arcade.values.LegacyAmountPickerConfig;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.LegacyAmountPickerBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class LegacyAmountPickerHostProtocol implements WidgetHostProtocol {
    public final JsonImpl json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0 = BuiltinSerializersKt.getNullable(DisplayCurrency.Companion.serializer());
    public final KSerializer serializer_1;
    public final KSerializer serializer_2;
    public final StringSerializer serializer_3;
    public final BooleanSerializer serializer_4;
    public final LongSerializer serializer_6;
    public final KSerializer serializer_7;
    public final KSerializer serializer_8;

    public LegacyAmountPickerHostProtocol(JsonImpl jsonImpl, n.b bVar) {
        this.json = jsonImpl;
        this.mismatchHandler = bVar;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        this.serializer_1 = BuiltinSerializersKt.getNullable(longSerializer);
        this.serializer_2 = LegacyAmountPickerConfig.Companion.serializer();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        this.serializer_3 = stringSerializer;
        this.serializer_4 = BooleanSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        this.serializer_6 = longSerializer;
        this.serializer_7 = BuiltinSerializersKt.getNullable(stringSerializer);
        this.serializer_8 = BuiltinSerializersKt.getNullable(Color.Companion.serializer());
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: createNode-z3jyS0k */
    public final ProtocolNode mo1197createNodez3jyS0k(int i, SVG svg) {
        svg.getClass();
        return new IconProtocolNode(i, new LegacyAmountPickerBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 15);
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        return null;
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        KSerializer kSerializer = this.serializer_7;
        switch (i) {
            case 1:
                return this.serializer_2;
            case 2:
                return this.serializer_3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 11:
            case 14:
            case 15:
            case 18:
            case 19:
                return this.serializer_4;
            case 7:
                return kSerializer;
            case 9:
                return kSerializer;
            case 10:
                return kSerializer;
            case 12:
                return this.serializer_8;
            case 13:
                return kSerializer;
            case 16:
                return this.serializer_0;
            case 17:
                return this.serializer_1;
            default:
                this.mismatchHandler.m1946onUnknownPropertyLKUuuww(45, i);
                return null;
        }
    }
}
