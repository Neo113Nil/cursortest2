package app.cash.arcade.protocol.host.arcade;

import android.content.Context;
import android.view.View;
import androidx.compose.material.AnchoredDraggableState;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.views.InlineAppMessageView;
import com.squareup.cash.appmessages.views.InlineAppMessageView$Factory$Impl;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.arcade.treehouse.CarouselBinding;
import com.squareup.cash.arcade.treehouse.ClickableCellBinding;
import com.squareup.cash.arcade.treehouse.ReceiptScaffoldBinding;
import com.squareup.util.android.coroutines.ViewKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes3.dex */
public final class ClickableCellHostProtocol implements WidgetHostProtocol {
    public final /* synthetic */ int $r8$classId;
    public final n.b mismatchHandler;
    public final BooleanSerializer serializer_0;

    public ClickableCellHostProtocol(JsonImpl jsonImpl, n.b bVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanSerializer.INSTANCE;
                break;
            case 2:
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanSerializer.INSTANCE;
                break;
            case 3:
                this.mismatchHandler = bVar;
                this.serializer_0 = BooleanSerializer.INSTANCE;
                break;
            default:
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
                return new CarouselProtocolNode(i, new ClickableCellBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
            case 1:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                InlineAppMessageView$Factory$Impl inlineAppMessageView$Factory$Impl = (InlineAppMessageView$Factory$Impl) anchoredDraggableState.closestValue$delegate;
                Context context = (Context) anchoredDraggableState.positionalThreshold;
                RealAppMessageImageLoader realAppMessageImageLoader = (RealAppMessageImageLoader) inlineAppMessageView$Factory$Impl.delegateFactory.staticImageLoader.invoke();
                realAppMessageImageLoader.getClass();
                InlineAppMessageView inlineAppMessageView = new InlineAppMessageView(context, realAppMessageImageLoader);
                ViewKt.whileEachAttached((View) inlineAppMessageView.getValue(), EmptyCoroutineContext.INSTANCE, new zzmh(MoleculePresenterKt.asPresenter$default(((InlineAppMessagePresenterHelper$Factory$Impl) anchoredDraggableState.anchors$delegate).create((Flow) anchoredDraggableState.targetValue$delegate, (Navigator) anchoredDraggableState.confirmValueChange)), anchoredDraggableState, inlineAppMessageView, (Continuation) null, 18));
                return new IconProtocolNode(i, inlineAppMessageView, this, 13);
            case 2:
                return new CarouselProtocolNode(i, new CarouselBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold, 3), this);
            default:
                return new FormProtocolNode(i, new ReceiptScaffoldBinding((Context) ((AnchoredDraggableState) svg.rootElement).positionalThreshold), this);
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    public final int[] getChildrenTags() {
        switch (this.$r8$classId) {
            case 0:
                return new int[]{1};
            case 1:
                return null;
            case 2:
                return new int[]{1};
            default:
                return new int[]{1, 2, 3};
        }
    }

    @Override // app.cash.redwood.protocol.host.WidgetHostProtocol
    /* renamed from: propertyDeserializer-FsYNNkA */
    public final KSerializer mo1198propertyDeserializerFsYNNkA(int i) {
        int i2 = this.$r8$classId;
        n.b bVar = this.mismatchHandler;
        BooleanSerializer booleanSerializer = this.serializer_0;
        switch (i2) {
            case 0:
                if (i == 1) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(64, i);
                return null;
            case 1:
                if (i == 1) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(56, i);
                return null;
            case 2:
                if (i == 1 || i == 2 || i == 3) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(51, i);
                return null;
            default:
                if (i == 1) {
                    return booleanSerializer;
                }
                bVar.m1946onUnknownPropertyLKUuuww(75, i);
                return null;
        }
    }
}
