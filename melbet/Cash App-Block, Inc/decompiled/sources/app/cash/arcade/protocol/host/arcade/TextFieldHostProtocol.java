package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.IconSize;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.InputMode;
import app.cash.arcade.values.KeypadExtraKey;
import app.cash.arcade.values.TextFieldState;
import app.cash.arcade.values.keypad.KeypadTextState;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.BiometricsPromptBinding;
import com.squareup.cash.arcade.treehouse.ImageBinding;
import com.squareup.cash.arcade.treehouse.KeypadScaffoldBinding;
import com.squareup.cash.arcade.treehouse.TextFieldBinding;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.treehouse.biometrics.BiometricsReadResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class TextFieldHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final Object json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final StringSerializer serializer_1;
    public final KSerializer serializer_2;
    public final BooleanSerializer serializer_3;

    public TextFieldHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                this.serializer_1 = stringSerializer;
                this.serializer_0 = BuiltinSerializersKt.getNullable(stringSerializer);
                this.serializer_3 = BooleanSerializer.INSTANCE;
                this.serializer_2 = BiometricsReadResult.Companion.serializer();
                break;
            case 2:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = KeypadTextState.Companion.serializer();
                this.serializer_3 = BooleanSerializer.INSTANCE;
                this.serializer_1 = StringSerializer.INSTANCE;
                this.serializer_2 = KeypadExtraKey.Companion.serializer();
                break;
            case 3:
                this.mismatchHandler = bVar;
                this.serializer_0 = ImageResource.Companion.serializer();
                this.serializer_1 = StringSerializer.INSTANCE;
                this.serializer_3 = BooleanSerializer.INSTANCE;
                this.serializer_2 = BuiltinSerializersKt.getNullable(IconSize.Companion.serializer());
                this.json = BuiltinSerializersKt.getNullable(Color.Companion.serializer());
                break;
            default:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = TextFieldState.Companion.serializer();
                this.serializer_1 = StringSerializer.INSTANCE;
                this.serializer_2 = InputMode.Companion.serializer();
                this.serializer_3 = BooleanSerializer.INSTANCE;
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
                return new TextProtocolNode(i, new TextFieldBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 3);
            case 1:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                return new IconProtocolNode(i, new BiometricsPromptBinding((Context) anchoredDraggableState.positionalThreshold, (AndroidBiometricsStore) anchoredDraggableState.currentValue$delegate), this, 5);
            case 2:
                return new NavBarProtocolNode(i, new KeypadScaffoldBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
            default:
                return new IconProtocolNode(i, new ImageBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 11);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return new int[]{1, 2};
            default:
                return null;
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        KSerializer kSerializer = this.serializer_2;
        KSerializer kSerializer2 = this.serializer_0;
        StringSerializer stringSerializer = this.serializer_1;
        BooleanSerializer booleanSerializer = this.serializer_3;
        n.b bVar = this.mismatchHandler;
        switch (i2) {
            case 0:
                switch (i) {
                    case 1:
                        break;
                    case 2:
                    case 3:
                    case 5:
                        break;
                    case 4:
                        break;
                    case 6:
                        break;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(19, i);
                        break;
                }
            case 1:
                switch (i) {
                    case 1:
                    case 2:
                    case 5:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 6:
                        break;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(44, i);
                        break;
                }
            case 2:
                if (i == 3) {
                    break;
                } else if (i == 4) {
                    break;
                } else if (i != 5) {
                    if (i == 6) {
                        break;
                    } else {
                        bVar.m1946onUnknownPropertyLKUuuww(60, i);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    break;
                } else if (i != 2) {
                    if (i == 3) {
                        break;
                    } else if (i == 4) {
                        break;
                    } else if (i == 5) {
                        break;
                    } else {
                        bVar.m1946onUnknownPropertyLKUuuww(21, i);
                        break;
                    }
                }
                break;
        }
        return kSerializer2;
    }
}
