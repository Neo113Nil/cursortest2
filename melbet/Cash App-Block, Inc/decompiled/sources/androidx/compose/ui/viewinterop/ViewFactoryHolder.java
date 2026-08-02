package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.Owner;
import androidx.datastore.core.SimpleActor;
import app.cash.trifle.KeyHandle$keyPair$2;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ViewFactoryHolder extends AndroidViewHolder {
    public Function1 releaseBlock;
    public Function1 resetBlock;
    public GrpcMethod savableRegistryEntry;
    public final View typedView;
    public Function1 updateBlock;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i, Owner owner) {
        super(context, compositionContext, i, new SimpleActor(3), r5, owner);
        View view = (View) function1.invoke(context);
        this.typedView = view;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        Object consumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(valueOf) : null;
        SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (saveableStateRegistry != null) {
            GrpcMethod registerProvider = saveableStateRegistry.registerProvider(valueOf, new AndroidViewHolder$runUpdate$1(this, 2));
            GrpcMethod grpcMethod = this.savableRegistryEntry;
            if (grpcMethod != null) {
                grpcMethod.unregister();
            }
            this.savableRegistryEntry = registerProvider;
        }
        AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;
        this.updateBlock = androidView_androidKt$NoOpUpdate$1;
        this.resetBlock = androidView_androidKt$NoOpUpdate$1;
        this.releaseBlock = androidView_androidKt$NoOpUpdate$1;
    }

    public final void setReleaseBlock(Function1<View, Unit> function1) {
        this.releaseBlock = function1;
        this.release = new AndroidViewHolder$runUpdate$1(this, 3);
    }

    public final void setResetBlock(Function1<View, Unit> function1) {
        this.resetBlock = function1;
        this.reset = new KeyHandle$keyPair$2(this, 4);
    }

    public final void setUpdateBlock(Function1<View, Unit> function1) {
        this.updateBlock = function1;
        this.update = new AndroidViewHolder$runUpdate$1(this, 4);
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }
}
