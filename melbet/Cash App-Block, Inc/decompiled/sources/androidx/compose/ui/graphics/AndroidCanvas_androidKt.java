package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class AndroidCanvas_androidKt {
    public static final android.graphics.Canvas EmptyCanvas = new android.graphics.Canvas();

    public static final android.graphics.Canvas getNativeCanvas(Canvas canvas) {
        canvas.getClass();
        return ((AndroidCanvas) canvas).internalCanvas;
    }
}
