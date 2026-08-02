package app.cash.arcade.protocol.host.redwoodlayout;

import app.cash.arcade.protocol.host.arcade.CarouselProtocolNode;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.layout.api.MainAxisAlignment;
import app.cash.redwood.layout.api.Overflow;
import app.cash.redwood.layout.view.ViewFlexContainer;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.ui.Px;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.gms.time.zzc;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class RowHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final JsonImpl json;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final KSerializer serializer_1;
    public final KSerializer serializer_2;
    public final KSerializer serializer_3;
    public final KSerializer serializer_4;
    public final BooleanSerializer serializer_5;
    public final KSerializer serializer_6;

    public RowHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = Constraint.Companion.serializer();
                this.serializer_1 = Margin.Companion.serializer();
                this.serializer_2 = Overflow.Companion.serializer();
                this.serializer_3 = CrossAxisAlignment.Companion.serializer();
                this.serializer_4 = MainAxisAlignment.Companion.serializer();
                this.serializer_5 = BooleanSerializer.INSTANCE;
                this.serializer_6 = Px.Companion.serializer();
                break;
            default:
                this.json = jsonImpl;
                this.mismatchHandler = bVar;
                this.serializer_0 = Constraint.Companion.serializer();
                this.serializer_1 = Margin.Companion.serializer();
                this.serializer_2 = Overflow.Companion.serializer();
                this.serializer_3 = MainAxisAlignment.Companion.serializer();
                this.serializer_4 = CrossAxisAlignment.Companion.serializer();
                this.serializer_5 = BooleanSerializer.INSTANCE;
                this.serializer_6 = Px.Companion.serializer();
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
                return new CarouselProtocolNode(i, new ViewFlexContainer(((zzc) svg.cssRules).zza, 0), this);
            default:
                return new CarouselProtocolNode(i, new ViewFlexContainer(((zzc) svg.cssRules).zza, 2), this, (byte) 0);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
        }
        return new int[]{1};
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        KSerializer kSerializer = this.serializer_1;
        KSerializer kSerializer2 = this.serializer_2;
        KSerializer kSerializer3 = this.serializer_3;
        KSerializer kSerializer4 = this.serializer_4;
        BooleanSerializer booleanSerializer = this.serializer_5;
        n.b bVar = this.mismatchHandler;
        KSerializer kSerializer5 = this.serializer_0;
        switch (i2) {
            case 0:
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(1000001, i);
                        break;
                }
            default:
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(1000002, i);
                        break;
                }
        }
        return kSerializer5;
    }
}
