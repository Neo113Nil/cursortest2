package androidx.compose.ui.graphics;

/* loaded from: classes3.dex */
public final class AndroidPathEffect implements PathEffect {
    public final android.graphics.PathEffect nativePathEffect;

    public AndroidPathEffect(android.graphics.PathEffect pathEffect) {
        this.nativePathEffect = pathEffect;
    }

    public final android.graphics.PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
