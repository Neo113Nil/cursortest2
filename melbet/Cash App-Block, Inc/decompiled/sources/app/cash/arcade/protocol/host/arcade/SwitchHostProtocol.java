package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.CircleSegment;
import app.cash.arcade.values.Color;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.ProgressBarBinding;
import com.squareup.cash.arcade.treehouse.SwitchBinding;
import com.squareup.cash.arcade.treehouse.ToggleBinding;
import com.squareup.cash.history.views.ActivityItemLayout;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class SwitchHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final Object json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;

    public SwitchHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanSerializer.INSTANCE;
                this.json = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                break;
            case 2:
                this.mismatchHandler = bVar;
                this.json = FloatSerializer.INSTANCE;
                this.serializer_0 = BuiltinSerializersKt.getNullable(Color.Companion.serializer());
                break;
            case 3:
                this.mismatchHandler = bVar;
                this.json = LongSerializer.INSTANCE;
                this.serializer_0 = new HashSetSerializer(CircleSegment.Companion.serializer(), 1);
                break;
            default:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanSerializer.INSTANCE;
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
                return new TextProtocolNode(i, new SwitchBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 0), this, 1);
            case 1:
                return new ActivityItemProtocolNode(i, new ActivityItemLayout((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
            case 2:
                return new IconProtocolNode(i, new ProgressBarBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 19);
            default:
                return new IconProtocolNode(i, new ToggleBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 2), this, 25);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return null;
            case 1:
                return new int[]{1, 2, 3, 4, 5};
            case 2:
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
        KSerializer kSerializer = this.serializer_0;
        n.b bVar = this.mismatchHandler;
        switch (i2) {
            case 0:
                BooleanSerializer booleanSerializer = (BooleanSerializer) kSerializer;
                if (i == 1 || i == 2 || i == 3) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(40, i);
                return null;
            case 1:
                if (i == 1) {
                    return (BooleanSerializer) kSerializer;
                }
                if (i == 2) {
                    return (KSerializer) obj;
                }
                bVar.m1946onUnknownPropertyLKUuuww(14, i);
                return null;
            case 2:
                if (i == 1) {
                    return (FloatSerializer) obj;
                }
                if (i == 2) {
                    return kSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(68, i);
                return null;
            default:
                if (i == 1) {
                    return (LongSerializer) obj;
                }
                if (i == 2) {
                    return (HashSetSerializer) kSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(83, i);
                return null;
        }
    }
}
