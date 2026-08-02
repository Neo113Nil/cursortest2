package app.cash.arcade.protocol.host.redwoodlazylayout;

import app.cash.arcade.protocol.host.arcade.NavBarProtocolNode;
import app.cash.redwood.layout.api.Constraint;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.lazylayout.api.ScrollItemIndex;
import app.cash.redwood.lazylayout.view.ViewLazyList;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.ui.Margin;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.play.core.appupdate.zzi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class LazyListHostProtocol implements WidgetHostProtocol {
    public final JsonImpl json;
    public final n.b mismatchHandler;
    public final BooleanSerializer serializer_0 = BooleanSerializer.INSTANCE;
    public final IntSerializer serializer_1 = IntSerializer.INSTANCE;
    public final KSerializer serializer_2 = Constraint.Companion.serializer();
    public final KSerializer serializer_3 = Margin.Companion.serializer();
    public final KSerializer serializer_4 = CrossAxisAlignment.Companion.serializer();
    public final KSerializer serializer_5 = ScrollItemIndex.Companion.serializer();

    public LazyListHostProtocol(JsonImpl jsonImpl, n.b bVar) {
        this.json = jsonImpl;
        this.mismatchHandler = bVar;
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: createNode-z3jyS0k */
    public final ProtocolNode mo1197createNodez3jyS0k(int i, SVG svg) {
        svg.getClass();
        return new NavBarProtocolNode(i, new ViewLazyList(((zzi) svg.idToElementMap).zza), this);
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        return new int[]{1, 2};
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        KSerializer kSerializer = this.serializer_2;
        switch (i) {
            case 1:
            case 2:
                return this.serializer_0;
            case 3:
            case 4:
                return this.serializer_1;
            case 5:
                return kSerializer;
            case 6:
                return kSerializer;
            case 7:
                return this.serializer_3;
            case 8:
                return this.serializer_4;
            case 9:
                return this.serializer_5;
            default:
                this.mismatchHandler.m1946onUnknownPropertyLKUuuww(2000001, i);
                return null;
        }
    }
}
