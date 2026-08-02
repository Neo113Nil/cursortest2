package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.AndroidComposeView;
import coil3.ImageLoader$Builder;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AndroidViewHolder$runUpdate$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ViewFactoryHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidViewHolder$runUpdate$1(ViewFactoryHolder viewFactoryHolder, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ViewFactoryHolder viewFactoryHolder = this.this$0;
        switch (i) {
            case 0:
                if (viewFactoryHolder.hasUpdateBlock && viewFactoryHolder.isAttachedToWindow() && viewFactoryHolder.view.getParent() == viewFactoryHolder) {
                    if (!viewFactoryHolder.isAttachedToWindow()) {
                        InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
                    }
                    ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) viewFactoryHolder.owner).snapshotObserver;
                    int i2 = AndroidViewHolder.$r8$clinit;
                    ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(viewFactoryHolder, AndroidView_androidKt$NoOpUpdate$1.INSTANCE$1, viewFactoryHolder.update);
                }
                break;
            case 1:
                viewFactoryHolder.layoutNode.invalidateLayer$ui();
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                viewFactoryHolder.typedView.saveHierarchyState(sparseArray);
                break;
            case 3:
                viewFactoryHolder.releaseBlock.invoke(viewFactoryHolder.typedView);
                GrpcMethod grpcMethod = viewFactoryHolder.savableRegistryEntry;
                if (grpcMethod != null) {
                    grpcMethod.unregister();
                }
                viewFactoryHolder.savableRegistryEntry = null;
                break;
            default:
                viewFactoryHolder.updateBlock.invoke(viewFactoryHolder.typedView);
                break;
        }
        return Unit.INSTANCE;
    }
}
