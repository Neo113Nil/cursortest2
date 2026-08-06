package P0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: P0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0077j extends View implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f1429a;

    /* renamed from: b, reason: collision with root package name */
    public Image f1430b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f1431c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1432d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1433e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1434f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1435g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077j(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader f2 = f(i2, i3);
        this.f1433e = false;
        this.f1435g = false;
        this.f1429a = f2;
        this.f1434f = i4;
        setAlpha(0.0f);
        this.f1433e = R1.d.v(getContext());
    }

    public static ImageReader f(int i2, int i3) {
        ImageReader newInstance;
        if (i2 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i2 + ", set width=1");
            i2 = 1;
        }
        if (i3 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i3 + ", set height=1");
            i3 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i2, i3, 1, 3);
        }
        newInstance = ImageReader.newInstance(i2, i3, 1, 3, 768L);
        return newInstance;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        if (H.j.b(this.f1434f) == 0) {
            Surface surface = this.f1429a.getSurface();
            hVar.f7768b = surface;
            hVar.f7767a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f1432d = hVar;
        this.f1435g = true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1435g) {
            setAlpha(0.0f);
            e();
            this.f1431c = null;
            Image image = this.f1430b;
            if (image != null) {
                image.close();
                this.f1430b = null;
            }
            invalidate();
            this.f1435g = false;
        }
    }

    public final boolean e() {
        if (!this.f1435g) {
            return false;
        }
        Image acquireLatestImage = this.f1429a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f1430b;
            if (image != null) {
                image.close();
                this.f1430b = null;
            }
            this.f1430b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f1432d == null) {
            return;
        }
        if (i2 == this.f1429a.getWidth() && i3 == this.f1429a.getHeight()) {
            return;
        }
        Image image = this.f1430b;
        if (image != null) {
            image.close();
            this.f1430b = null;
        }
        this.f1429a.close();
        this.f1429a = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1432d;
    }

    public ImageReader getImageReader() {
        return this.f1429a;
    }

    public Surface getSurface() {
        return this.f1429a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f1430b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f1431c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f1430b.getHeight();
                    Bitmap bitmap = this.f1431c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f1431c.getHeight() != height) {
                        this.f1431c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f1431c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f1431c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1433e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f1429a.getWidth() && i3 == this.f1429a.getHeight()) && this.f1434f == 1 && this.f1435g) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.h hVar = this.f1432d;
            Surface surface = this.f1429a.getSurface();
            hVar.f7768b = surface;
            hVar.f7767a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
    }
}
