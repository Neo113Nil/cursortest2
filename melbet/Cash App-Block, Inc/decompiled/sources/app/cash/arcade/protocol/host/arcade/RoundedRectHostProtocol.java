package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.BorderStyle;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.PasscodeInputStatus;
import app.cash.arcade.values.timeline.ArcadeTimeline2CollapseRange;
import app.cash.arcade.values.timeline.ArcadeTimeline2Item;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Margin;
import coil3.RealImageLoader;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.ArcadeTimeline2Binding;
import com.squareup.cash.arcade.treehouse.LegacyPasscodeInputBinding;
import com.squareup.cash.arcade.treehouse.QrCodeScannerBinding;
import com.squareup.cash.arcade.treehouse.RoundedRectBinding;
import com.squareup.cash.treehouse.qr.QrScanResult;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class RoundedRectHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final KSerializer serializer_1;
    public final Object serializer_2;
    public final Object serializer_3;
    public final BooleanSerializer serializer_4;
    public final Object serializer_5;

    public RoundedRectHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.serializer_2 = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_3 = new HashSetSerializer(ArcadeTimeline2Item.Companion.serializer(), 1);
                this.serializer_4 = BooleanSerializer.INSTANCE;
                this.serializer_5 = IntSerializer.INSTANCE;
                this.serializer_1 = new HashSetSerializer(ArcadeTimeline2CollapseRange.Companion.serializer(), 1);
                this.serializer_0 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                break;
            case 2:
                this.serializer_3 = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_5 = IntSerializer.INSTANCE;
                this.serializer_0 = Color.Companion.serializer();
                this.serializer_4 = BooleanSerializer.INSTANCE;
                this.serializer_1 = StringSerializer.INSTANCE;
                this.serializer_2 = BuiltinSerializersKt.getNullable(PasscodeInputStatus.Companion.serializer());
                break;
            case 3:
                this.serializer_5 = jsonImpl;
                this.mismatchHandler = bVar;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                this.serializer_1 = stringSerializer;
                this.serializer_0 = BuiltinSerializersKt.getNullable(stringSerializer);
                this.serializer_4 = BooleanSerializer.INSTANCE;
                this.serializer_2 = QrScanResult.Companion.serializer();
                this.serializer_3 = Margin.Companion.serializer();
                break;
            default:
                this.mismatchHandler = bVar;
                Color.Companion companion = Color.Companion;
                this.serializer_0 = BuiltinSerializersKt.getNullable(companion.serializer());
                this.serializer_1 = FloatSerializer.INSTANCE;
                this.serializer_2 = BorderStyle.Companion.serializer();
                this.serializer_3 = companion.serializer();
                this.serializer_4 = BooleanSerializer.INSTANCE;
                this.serializer_5 = BuiltinSerializersKt.getNullable(ImageResource.Companion.serializer());
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
                return new IconProtocolNode(i, new RoundedRectBinding((Context) anchoredDraggableState.positionalThreshold, (RealImageLoader) anchoredDraggableState.draggableState), this, 23);
            case 1:
                return new IconProtocolNode(i, new ArcadeTimeline2Binding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 2);
            case 2:
                return new IconProtocolNode(i, new LegacyPasscodeInputBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 17);
            default:
                AnchoredDraggableState anchoredDraggableState2 = (AnchoredDraggableState) svg.rootElement;
                return new IconProtocolNode(i, new QrCodeScannerBinding((Context) anchoredDraggableState2.positionalThreshold, (RealCashVibrator) anchoredDraggableState2.animationSpec), this, 20);
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
        Object obj = this.serializer_5;
        Object obj2 = this.serializer_2;
        Object obj3 = this.serializer_3;
        KSerializer kSerializer = this.serializer_1;
        KSerializer kSerializer2 = this.serializer_0;
        n.b bVar = this.mismatchHandler;
        BooleanSerializer booleanSerializer = this.serializer_4;
        switch (i2) {
            case 0:
                FloatSerializer floatSerializer = (FloatSerializer) kSerializer;
                switch (i) {
                    case 1:
                        return kSerializer2;
                    case 2:
                    case 5:
                        return floatSerializer;
                    case 3:
                        return (KSerializer) obj2;
                    case 4:
                        return (KSerializer) obj3;
                    case 6:
                        return booleanSerializer;
                    case 7:
                        return (KSerializer) obj;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(62, i);
                        return null;
                }
            case 1:
                if (i == 1) {
                    return (HashSetSerializer) obj3;
                }
                if (i == 2) {
                    return booleanSerializer;
                }
                if (i == 3) {
                    return (HashSetSerializer) kSerializer;
                }
                if (i == 4) {
                    return kSerializer2;
                }
                bVar.m1946onUnknownPropertyLKUuuww(81, i);
                return null;
            case 2:
                if (i == 1) {
                    return (IntSerializer) obj;
                }
                if (i == 2) {
                    return kSerializer2;
                }
                if (i == 3) {
                    return booleanSerializer;
                }
                if (i == 4) {
                    return (KSerializer) obj2;
                }
                bVar.m1946onUnknownPropertyLKUuuww(34, i);
                return null;
            default:
                StringSerializer stringSerializer = (StringSerializer) kSerializer;
                switch (i) {
                    case 1:
                    case 5:
                        return stringSerializer;
                    case 2:
                        return kSerializer2;
                    case 3:
                    case 4:
                        return booleanSerializer;
                    case 6:
                        return (KSerializer) obj3;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(72, i);
                        return null;
                }
        }
    }
}
