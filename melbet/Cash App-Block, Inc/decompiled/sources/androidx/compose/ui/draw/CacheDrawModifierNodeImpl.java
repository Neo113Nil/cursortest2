package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.Extras;
import com.datadog.android.Datadog$getInstance$1$1;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class CacheDrawModifierNodeImpl extends Modifier.Node implements ObserverModifierNode, BuildDrawCacheParams, DrawModifierNode {
    public Function1 block;
    public final CacheDrawScope cacheDrawScope;
    public boolean isCacheValid;

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, Function1 function1) {
        this.cacheDrawScope = cacheDrawScope;
        this.block = function1;
        cacheDrawScope.cacheParams = this;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        boolean z = this.isCacheValid;
        CacheDrawScope cacheDrawScope = this.cacheDrawScope;
        if (!z) {
            cacheDrawScope.drawResult = null;
            DepthSortedSetKt.observeReads(this, new Datadog$getInstance$1$1(1, this, cacheDrawScope));
            if (cacheDrawScope.drawResult == null) {
                throw Boxes$$ExternalSyntheticOutline1.m1150m("DrawResult not defined, did you forget to call onDraw?");
            }
            this.isCacheValid = true;
        }
        Extras.Key key = cacheDrawScope.drawResult;
        key.getClass();
        ((Function1) key.f61default).invoke(layoutNodeDrawScope);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return DepthSortedSetKt.requireLayoutNode(this).density;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return DepthSortedSetKt.requireLayoutNode(this).layoutDirection;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public final long mo587getSizeNHjbRc() {
        return Countries.m3991toSizeozmzZPI(DepthSortedSetKt.m864requireCoordinator64DMado(this, 4).measuredSize);
    }

    public final void invalidateDrawCache() {
        this.isCacheValid = false;
        this.cacheDrawScope.drawResult = null;
        DepthSortedSetKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onLayoutDirectionChange() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        invalidateDrawCache();
    }
}
