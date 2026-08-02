package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.AvatarSize;
import app.cash.arcade.values.BooleanState;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.NavigationIconType;
import app.cash.arcade.values.TextFieldState;
import app.cash.arcade.values.TitleBarAction;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel;
import app.cash.arcade.viewmodels.AvatarViewModel;
import app.cash.arcade.viewmodels.RadioSelectionOption;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import coil3.RealImageLoader;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.ArcadeAvatarBinding;
import com.squareup.cash.arcade.treehouse.PasscodeInputBinding;
import com.squareup.cash.arcade.treehouse.RadioBinding;
import com.squareup.cash.arcade.treehouse.RadioSelectionGroupBinding;
import com.squareup.cash.arcade.treehouse.TitleBarSubBinding;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.reactions.treehouse.ReactionDialogAnchorBinding;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class RadioHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final Object json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final BooleanSerializer serializer_1;
    public final KSerializer serializer_2;

    public RadioHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = TextFieldState.Companion.serializer();
                this.serializer_2 = IntSerializer.INSTANCE;
                this.serializer_1 = BooleanSerializer.INSTANCE;
                break;
            case 2:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = IntSerializer.INSTANCE;
                this.serializer_2 = new HashSetSerializer(RadioSelectionOption.Companion.serializer(), 1);
                this.serializer_1 = BooleanSerializer.INSTANCE;
                break;
            case 3:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_1 = BooleanSerializer.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                this.serializer_0 = new HashSetSerializer(stringSerializer, 1);
                this.serializer_2 = stringSerializer;
                break;
            case 4:
                this.mismatchHandler = bVar;
                this.json = new HashSetSerializer(AvatarViewModel.Companion.serializer(), 1);
                this.serializer_0 = AvatarSize.Companion.serializer();
                this.serializer_2 = BuiltinSerializersKt.getNullable(AvatarBadgeViewModel.Companion.serializer());
                this.serializer_1 = BooleanSerializer.INSTANCE;
                break;
            case 5:
                this.mismatchHandler = bVar;
                this.serializer_0 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                this.serializer_2 = BuiltinSerializersKt.getNullable(NavigationIconType.Companion.serializer());
                this.serializer_1 = BooleanSerializer.INSTANCE;
                this.json = BuiltinSerializersKt.getNullable(TitleBarAction.Companion.serializer());
                break;
            default:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanState.Companion.serializer();
                this.serializer_1 = BooleanSerializer.INSTANCE;
                this.serializer_2 = BuiltinSerializersKt.getNullable(Color.Companion.serializer());
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
                return new IconProtocolNode(i, new RadioBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 21);
            case 1:
                return new IconProtocolNode(i, new PasscodeInputBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 18);
            case 2:
                return new IconProtocolNode(i, new RadioSelectionGroupBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 22);
            case 3:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                return new CarouselProtocolNode(i, new ReactionDialogAnchorBinding((Context) anchoredDraggableState.positionalThreshold, (RealCashVibrator) anchoredDraggableState.animationSpec, (RealSharedReactionState) anchoredDraggableState.dragMutex), this);
            case 4:
                AnchoredDraggableState anchoredDraggableState2 = (AnchoredDraggableState) svg.rootElement;
                return new IconProtocolNode(i, new ArcadeAvatarBinding((Context) anchoredDraggableState2.positionalThreshold, (RealImageLoader) anchoredDraggableState2.draggableState), this, 29);
            default:
                return new TextProtocolNode(i, new TitleBarSubBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 5);
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
                return null;
            case 3:
                return new int[]{1};
            case 4:
                return null;
            default:
                return null;
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.json;
        KSerializer kSerializer = this.serializer_2;
        KSerializer kSerializer2 = this.serializer_0;
        n.b bVar = this.mismatchHandler;
        BooleanSerializer booleanSerializer = this.serializer_1;
        switch (i2) {
            case 0:
                if (i == 1) {
                    return kSerializer2;
                }
                if (i == 2 || i == 3) {
                    return booleanSerializer;
                }
                if (i == 4) {
                    return kSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(77, i);
                return null;
            case 1:
                if (i == 1) {
                    return kSerializer2;
                }
                if (i == 2) {
                    return (IntSerializer) kSerializer;
                }
                if (i == 3 || i == 4 || i == 5) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(85, i);
                return null;
            case 2:
                if (i == 1) {
                    return (IntSerializer) kSerializer2;
                }
                if (i == 2) {
                    return (HashSetSerializer) kSerializer;
                }
                if (i == 3) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(36, i);
                return null;
            case 3:
                if (i != 1) {
                    if (i == 2) {
                        return (HashSetSerializer) kSerializer2;
                    }
                    if (i != 3 && i != 4 && i != 5) {
                        bVar.m1946onUnknownPropertyLKUuuww(35, i);
                        return null;
                    }
                }
                return booleanSerializer;
            case 4:
                if (i == 1) {
                    return (HashSetSerializer) obj;
                }
                if (i == 2) {
                    return kSerializer;
                }
                if (i != 3) {
                    if (i == 4) {
                        return kSerializer2;
                    }
                    if (i != 5) {
                        bVar.m1946onUnknownPropertyLKUuuww(15, i);
                        return null;
                    }
                }
                return booleanSerializer;
            default:
                KSerializer kSerializer3 = (KSerializer) obj;
                switch (i) {
                    case 1:
                        return kSerializer2;
                    case 2:
                        return kSerializer;
                    case 3:
                        return kSerializer3;
                    case 4:
                    case 6:
                    case 7:
                        return booleanSerializer;
                    case 5:
                        return kSerializer3;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(70, i);
                        return null;
                }
        }
    }
}
