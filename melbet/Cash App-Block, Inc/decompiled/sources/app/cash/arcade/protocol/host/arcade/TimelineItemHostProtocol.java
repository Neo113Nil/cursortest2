package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import android.view.View;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.TimelineItemIcon;
import app.cash.arcade.values.TitleBarAction;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import coil3.RealImageLoader;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cash.arcade.treehouse.TimelineItemBinding;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.util.android.coroutines.ViewKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class TimelineItemHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final KSerializer serializer_0;
    public final KSerializer serializer_1;
    public final BooleanSerializer serializer_2;

    public TimelineItemHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                this.serializer_0 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                this.serializer_1 = BuiltinSerializersKt.getNullable(TitleBarAction.Companion.serializer());
                this.serializer_2 = BooleanSerializer.INSTANCE;
                break;
            default:
                this.mismatchHandler = bVar;
                this.serializer_0 = TimelineItemIcon.Companion.serializer();
                this.serializer_1 = Color.Companion.serializer();
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
                return new CarouselProtocolNode(i, new TimelineItemBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
            default:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                TitleBarCoreBinding titleBarCoreBinding = new TitleBarCoreBinding((Context) anchoredDraggableState.positionalThreshold, (RealImageLoader) anchoredDraggableState.draggableState);
                ViewKt.whileEachAttached((View) titleBarCoreBinding.getValue(), EmptyCoroutineContext.INSTANCE, new zzmh(MoleculePresenterKt.asPresenter$default((MoleculePresenter) ((BadgeQueries$$ExternalSyntheticLambda5) anchoredDraggableState.offset$delegate).invoke((Navigator) anchoredDraggableState.confirmValueChange)), anchoredDraggableState, titleBarCoreBinding, (Continuation) null, 18));
                return new TextProtocolNode(i, titleBarCoreBinding, this, 4);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
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
        n.b bVar = this.mismatchHandler;
        BooleanSerializer booleanSerializer = this.serializer_2;
        KSerializer kSerializer2 = this.serializer_1;
        switch (i2) {
            case 0:
                if (i == 1) {
                    break;
                } else if (i == 2) {
                    break;
                } else if (i == 3) {
                    break;
                } else {
                    bVar.m1946onUnknownPropertyLKUuuww(49, i);
                    break;
                }
            default:
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                    case 5:
                    case 7:
                        break;
                    case 4:
                        break;
                    case 6:
                        break;
                    default:
                        bVar.m1946onUnknownPropertyLKUuuww(69, i);
                        break;
                }
        }
        return kSerializer;
    }
}
