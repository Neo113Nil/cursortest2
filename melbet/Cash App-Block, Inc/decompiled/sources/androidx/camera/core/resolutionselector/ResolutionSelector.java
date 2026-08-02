package androidx.camera.core.resolutionselector;

/* loaded from: classes3.dex */
public final class ResolutionSelector {
    public final AspectRatioStrategy mAspectRatioStrategy;
    public final ResolutionStrategy mResolutionStrategy;

    public ResolutionSelector(AspectRatioStrategy aspectRatioStrategy, ResolutionStrategy resolutionStrategy) {
        this.mAspectRatioStrategy = aspectRatioStrategy;
        this.mResolutionStrategy = resolutionStrategy;
    }
}
