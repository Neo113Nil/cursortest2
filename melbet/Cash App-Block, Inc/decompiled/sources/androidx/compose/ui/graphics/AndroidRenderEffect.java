package androidx.compose.ui.graphics;

/* loaded from: classes3.dex */
public final class AndroidRenderEffect extends RenderEffect {
    public final android.graphics.RenderEffect androidRenderEffect;

    public AndroidRenderEffect(android.graphics.RenderEffect renderEffect) {
        this.androidRenderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    public final android.graphics.RenderEffect createRenderEffect() {
        return this.androidRenderEffect;
    }
}
