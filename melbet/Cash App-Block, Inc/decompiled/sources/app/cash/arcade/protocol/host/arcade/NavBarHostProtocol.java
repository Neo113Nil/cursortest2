package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.squareup.cash.arcade.treehouse.NavBarBinding;
import com.squareup.cash.arcade.treehouse.TabToolbarBinding;
import com.squareup.cash.history.treehouse.views.MooncakeActivitySectionHeader;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class NavBarHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final StringSerializer serializer_0;

    public NavBarHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                this.serializer_0 = StringSerializer.INSTANCE;
                break;
            case 2:
                this.mismatchHandler = bVar;
                this.serializer_0 = StringSerializer.INSTANCE;
                break;
            default:
                this.mismatchHandler = bVar;
                this.serializer_0 = StringSerializer.INSTANCE;
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
                return new NavBarProtocolNode(i, new NavBarBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, null), this);
            case 1:
                return new IconProtocolNode(i, new MooncakeActivitySectionHeader((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 1);
            default:
                return new TextProtocolNode(i, new TabToolbarBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this, 2);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return new int[]{1, 2};
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        n.b bVar = this.mismatchHandler;
        StringSerializer stringSerializer = this.serializer_0;
        switch (i2) {
            case 0:
                if (i != 1) {
                    bVar.m1946onUnknownPropertyLKUuuww(5, i);
                    break;
                } else {
                    break;
                }
            case 1:
                if (i != 1) {
                    bVar.m1946onUnknownPropertyLKUuuww(47, i);
                    break;
                } else {
                    break;
                }
            default:
                if (i != 1) {
                    bVar.m1946onUnknownPropertyLKUuuww(53, i);
                    break;
                } else {
                    break;
                }
        }
        return null;
    }
}
