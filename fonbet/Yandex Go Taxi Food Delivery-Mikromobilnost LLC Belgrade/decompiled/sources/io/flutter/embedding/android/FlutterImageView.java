package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import defpackage.ayi0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.Locale;

/* loaded from: classes4.dex */
public class FlutterImageView extends View implements ayi0 {
    private static final String TAG = "FlutterImageView";
    private Bitmap currentBitmap;
    private Image currentImage;
    private io.flutter.embedding.engine.renderer.f flutterRenderer;
    private ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private SurfaceKind kind;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SurfaceKind {
        private static final /* synthetic */ SurfaceKind[] $VALUES;
        public static final SurfaceKind background;
        public static final SurfaceKind overlay;

        static {
            SurfaceKind surfaceKind = new SurfaceKind(C0553n3.g, 0);
            background = surfaceKind;
            SurfaceKind surfaceKind2 = new SurfaceKind("overlay", 1);
            overlay = surfaceKind2;
            $VALUES = new SurfaceKind[]{surfaceKind, surfaceKind2};
        }

        public static SurfaceKind valueOf(String str) {
            return (SurfaceKind) Enum.valueOf(SurfaceKind.class, str);
        }

        public static SurfaceKind[] values() {
            return (SurfaceKind[]) $VALUES.clone();
        }
    }

    public FlutterImageView(Context context, ImageReader imageReader, SurfaceKind surfaceKind) {
        super(context, null);
        this.isAttachedToFlutterRenderer = false;
        this.imageReader = imageReader;
        this.kind = surfaceKind;
        init();
    }

    private void closeCurrentImage() {
        Image image = this.currentImage;
        if (image != null) {
            image.close();
            this.currentImage = null;
        }
    }

    private static ImageReader createImageReader(int i, int i2) {
        int i3;
        int i4;
        if (i <= 0) {
            logW("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i));
            i3 = 1;
        } else {
            i3 = i;
        }
        if (i2 <= 0) {
            logW("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i2));
            i4 = 1;
        } else {
            i4 = i2;
        }
        return ImageReader.newInstance(i3, i4, 1, 3, 768L);
    }

    private void init() {
        setAlpha(0.0f);
    }

    private static void logW(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    private void updateCurrentBitmap() {
        HardwareBuffer hardwareBuffer = this.currentImage.getHardwareBuffer();
        this.currentBitmap = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
        hardwareBuffer.close();
    }

    public boolean acquireLatestImage() {
        if (!this.isAttachedToFlutterRenderer) {
            return false;
        }
        Image acquireLatestImage = this.imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            closeCurrentImage();
            this.currentImage = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    @Override // defpackage.ayi0
    public void attachToRenderer(io.flutter.embedding.engine.renderer.f fVar) {
        if (c.a[this.kind.ordinal()] == 1) {
            Surface surface = this.imageReader.getSurface();
            fVar.c = surface;
            fVar.a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.flutterRenderer = fVar;
        this.isAttachedToFlutterRenderer = true;
    }

    public void closeImageReader() {
        this.imageReader.close();
    }

    @Override // defpackage.ayi0
    public void detachFromRenderer() {
        if (this.isAttachedToFlutterRenderer) {
            setAlpha(0.0f);
            acquireLatestImage();
            this.currentBitmap = null;
            closeCurrentImage();
            invalidate();
            this.isAttachedToFlutterRenderer = false;
        }
    }

    @Override // defpackage.ayi0
    public io.flutter.embedding.engine.renderer.f getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public ImageReader getImageReader() {
        return this.imageReader;
    }

    public Surface getSurface() {
        return this.imageReader.getSurface();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.currentImage != null) {
            updateCurrentBitmap();
        }
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.imageReader.getWidth() && i2 == this.imageReader.getHeight()) && this.kind == SurfaceKind.background && this.isAttachedToFlutterRenderer) {
            resizeIfNeeded(i, i2);
            io.flutter.embedding.engine.renderer.f fVar = this.flutterRenderer;
            Surface surface = this.imageReader.getSurface();
            fVar.c = surface;
            fVar.a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // defpackage.ayi0
    public void pause() {
    }

    public void resizeIfNeeded(int i, int i2) {
        if (this.flutterRenderer == null) {
            return;
        }
        if (i == this.imageReader.getWidth() && i2 == this.imageReader.getHeight()) {
            return;
        }
        closeCurrentImage();
        closeImageReader();
        this.imageReader = createImageReader(i, i2);
    }

    @Override // defpackage.ayi0
    public void resume() {
    }

    public FlutterImageView(Context context) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public FlutterImageView(Context context, AttributeSet attributeSet) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public FlutterImageView(Context context, int i, int i2, SurfaceKind surfaceKind) {
        this(context, createImageReader(i, i2), surfaceKind);
    }
}
