package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.SegmentedToggleValue;
import app.cash.arcade.values.TextFieldState;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.SearchBarBinding;
import com.squareup.cash.arcade.treehouse.SearchFieldBinding;
import com.squareup.cash.arcade.treehouse.SwitchBinding;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class SearchBarHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final JsonImpl json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final StringSerializer serializer_1;
    public final BooleanSerializer serializer_2;

    public SearchBarHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = TextFieldState.Companion.serializer();
                this.serializer_1 = StringSerializer.INSTANCE;
                this.serializer_2 = BooleanSerializer.INSTANCE;
                break;
            case 2:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = SegmentedToggleValue.Companion.serializer();
                this.serializer_2 = BooleanSerializer.INSTANCE;
                this.serializer_1 = StringSerializer.INSTANCE;
                break;
            default:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = TextFieldState.Companion.serializer();
                this.serializer_1 = StringSerializer.INSTANCE;
                this.serializer_2 = BooleanSerializer.INSTANCE;
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
                return new IconProtocolNode(i, new SearchBarBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 24);
            case 1:
                return new CarouselProtocolNode(i, new SearchFieldBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
            default:
                return new IconProtocolNode(i, new SwitchBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 1), this, 26);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return null;
            case 1:
                return new int[]{1};
            default:
                return null;
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        KSerializer kSerializer = this.serializer_0;
        BooleanSerializer booleanSerializer = this.serializer_2;
        n.b bVar = this.mismatchHandler;
        StringSerializer stringSerializer = this.serializer_1;
        switch (i2) {
            case 0:
                if (i == 1) {
                    return kSerializer;
                }
                if (i == 2) {
                    return stringSerializer;
                }
                if (i == 3) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(71, i);
                return null;
            case 1:
                if (i == 1) {
                    return stringSerializer;
                }
                if (i == 2 || i == 3 || i == 4) {
                    return booleanSerializer;
                }
                if (i == 5) {
                    return kSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(55, i);
                return null;
            default:
                if (i == 1) {
                    return kSerializer;
                }
                if (i == 2) {
                    return booleanSerializer;
                }
                if (i == 3 || i == 4) {
                    return stringSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(41, i);
                return null;
        }
    }
}
