package androidx.camera.core.resolutionselector;

import android.util.Size;

/* loaded from: classes3.dex */
public final class ResolutionStrategy {
    public static final ResolutionStrategy HIGHEST_AVAILABLE_STRATEGY;
    public Size mBoundSize;
    public int mFallbackRule;

    static {
        ResolutionStrategy resolutionStrategy = new ResolutionStrategy();
        resolutionStrategy.mBoundSize = null;
        resolutionStrategy.mFallbackRule = 0;
        HIGHEST_AVAILABLE_STRATEGY = resolutionStrategy;
    }

    public ResolutionStrategy(int i, Size size) {
        this.mBoundSize = size;
        this.mFallbackRule = i;
    }
}
