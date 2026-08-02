package androidx.compose.ui.draw;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {
    public static final EmptyBuildDrawCacheParams INSTANCE = new EmptyBuildDrawCacheParams();
    public static final LayoutDirection layoutDirection = LayoutDirection.Ltr;
    public static final DensityImpl density = new DensityImpl(1.0f, 1.0f);

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return density;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public final long mo587getSizeNHjbRc() {
        return 9205357640488583168L;
    }
}
