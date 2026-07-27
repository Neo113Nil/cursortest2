package j1;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: B, reason: collision with root package name */
    public static final Matrix f38323B = new Matrix();

    /* renamed from: A, reason: collision with root package name */
    public C4597a f38324A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f38325a;

    /* renamed from: b, reason: collision with root package name */
    public G1.a f38326b;

    /* renamed from: c, reason: collision with root package name */
    public int f38327c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f38328d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f38329e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f38330f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f38331g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f38332h;
    public Rect i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f38333j;

    /* renamed from: k, reason: collision with root package name */
    public Y0.a f38334k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f38335l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f38336m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f38337n;

    /* renamed from: o, reason: collision with root package name */
    public Y0.a f38338o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f38339p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f38340q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f38341r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f38342s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f38343t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f38344u;

    /* renamed from: v, reason: collision with root package name */
    public Y0.a f38345v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f38346w;

    /* renamed from: x, reason: collision with root package name */
    public float f38347x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f38348y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f38349z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, C4597a c4597a) {
        if (this.f38329e == null) {
            this.f38329e = new RectF();
        }
        if (this.f38331g == null) {
            this.f38331g = new RectF();
        }
        this.f38329e.set(rectF);
        this.f38329e.offsetTo(rectF.left + c4597a.f38297b, rectF.top + c4597a.f38298c);
        RectF rectF2 = this.f38329e;
        float f3 = c4597a.f38296a;
        rectF2.inset(-f3, -f3);
        this.f38331g.set(rectF);
        this.f38329e.union(this.f38331g);
        return this.f38329e;
    }

    public final void c() {
        float f3;
        Y0.a aVar;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.f38325a == null || this.f38326b == null || this.f38340q == null || this.f38328d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int d2 = AbstractC5049e.d(this.f38327c);
        if (d2 == 0) {
            this.f38325a.restore();
        } else if (d2 != 1) {
            if (d2 != 2) {
                if (d2 == 3) {
                    if (this.f38348y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f38325a.save();
                    Canvas canvas = this.f38325a;
                    float[] fArr = this.f38340q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f38348y.endRecording();
                    if (this.f38326b.f()) {
                        Canvas canvas2 = this.f38325a;
                        C4597a c4597a = (C4597a) this.f38326b.f1051v;
                        if (this.f38348y == null || this.f38349z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f38340q;
                        float f9 = fArr2 != null ? fArr2[0] : 1.0f;
                        f3 = fArr2 != null ? fArr2[4] : 1.0f;
                        C4597a c4597a2 = this.f38324A;
                        if (c4597a2 == null || c4597a.f38296a != c4597a2.f38296a || c4597a.f38297b != c4597a2.f38297b || c4597a.f38298c != c4597a2.f38298c || c4597a.f38299d != c4597a2.f38299d) {
                            createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c4597a.f38299d, PorterDuff.Mode.SRC_IN));
                            float f10 = c4597a.f38296a;
                            if (f10 > 0.0f) {
                                float f11 = ((f9 + f3) * f10) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                createColorFilterEffect = RenderEffect.createBlurEffect(f11, f11, createColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f38349z.setRenderEffect(createColorFilterEffect);
                            this.f38324A = c4597a;
                        }
                        RectF b9 = b(this.f38328d, c4597a);
                        RectF rectF = new RectF(b9.left * f9, b9.top * f3, b9.right * f9, b9.bottom * f3);
                        this.f38349z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        beginRecording = this.f38349z.beginRecording((int) rectF.width(), (int) rectF.height());
                        beginRecording.translate((c4597a.f38297b * f9) + (-rectF.left), (c4597a.f38298c * f3) + (-rectF.top));
                        beginRecording.drawRenderNode(this.f38348y);
                        this.f38349z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f38349z);
                        canvas2.restore();
                    }
                    this.f38325a.drawRenderNode(this.f38348y);
                    this.f38325a.restore();
                }
            } else {
                if (this.f38335l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f38326b.f()) {
                    Canvas canvas3 = this.f38325a;
                    C4597a c4597a3 = (C4597a) this.f38326b.f1051v;
                    RectF rectF2 = this.f38328d;
                    if (rectF2 == null || this.f38335l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF b10 = b(rectF2, c4597a3);
                    if (this.f38330f == null) {
                        this.f38330f = new Rect();
                    }
                    this.f38330f.set((int) Math.floor(b10.left), (int) Math.floor(b10.top), (int) Math.ceil(b10.right), (int) Math.ceil(b10.bottom));
                    float[] fArr3 = this.f38340q;
                    float f12 = fArr3 != null ? fArr3[0] : 1.0f;
                    f3 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f38332h == null) {
                        this.f38332h = new RectF();
                    }
                    this.f38332h.set(b10.left * f12, b10.top * f3, b10.right * f12, b10.bottom * f3);
                    if (this.i == null) {
                        this.i = new Rect();
                    }
                    this.i.set(0, 0, Math.round(this.f38332h.width()), Math.round(this.f38332h.height()));
                    if (d(this.f38341r, this.f38332h)) {
                        Bitmap bitmap = this.f38341r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f38342s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f38341r = a(this.f38332h, Bitmap.Config.ARGB_8888);
                        this.f38342s = a(this.f38332h, Bitmap.Config.ALPHA_8);
                        this.f38343t = new Canvas(this.f38341r);
                        this.f38344u = new Canvas(this.f38342s);
                    } else {
                        Canvas canvas4 = this.f38343t;
                        if (canvas4 == null || this.f38344u == null || (aVar = this.f38338o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.i, aVar);
                        this.f38344u.drawRect(this.i, this.f38338o);
                    }
                    if (this.f38342s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f38345v == null) {
                        this.f38345v = new Y0.a(1, 0);
                    }
                    RectF rectF3 = this.f38328d;
                    this.f38344u.drawBitmap(this.f38335l, Math.round((rectF3.left - b10.left) * f12), Math.round((rectF3.top - b10.top) * f3), (Paint) null);
                    if (this.f38346w == null || this.f38347x != c4597a3.f38296a) {
                        float f13 = ((f12 + f3) * c4597a3.f38296a) / 2.0f;
                        if (f13 > 0.0f) {
                            this.f38346w = new BlurMaskFilter(f13, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f38346w = null;
                        }
                        this.f38347x = c4597a3.f38296a;
                    }
                    this.f38345v.setColor(c4597a3.f38299d);
                    if (c4597a3.f38296a > 0.0f) {
                        this.f38345v.setMaskFilter(this.f38346w);
                    } else {
                        this.f38345v.setMaskFilter(null);
                    }
                    this.f38345v.setFilterBitmap(true);
                    this.f38343t.drawBitmap(this.f38342s, Math.round(c4597a3.f38297b * f12), Math.round(c4597a3.f38298c * f3), this.f38345v);
                    canvas3.drawBitmap(this.f38341r, this.i, this.f38330f, this.f38334k);
                }
                if (this.f38337n == null) {
                    this.f38337n = new Rect();
                }
                this.f38337n.set(0, 0, (int) (this.f38328d.width() * this.f38340q[0]), (int) (this.f38328d.height() * this.f38340q[4]));
                this.f38325a.drawBitmap(this.f38335l, this.f38337n, this.f38328d, this.f38334k);
            }
        } else {
            this.f38325a.restore();
        }
        this.f38325a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, G1.a aVar) {
        RecordingCanvas beginRecording;
        if (this.f38325a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f38340q == null) {
            this.f38340q = new float[9];
        }
        if (this.f38339p == null) {
            this.f38339p = new Matrix();
        }
        canvas.getMatrix(this.f38339p);
        this.f38339p.getValues(this.f38340q);
        float[] fArr = this.f38340q;
        float f3 = fArr[0];
        int i = 4;
        float f9 = fArr[4];
        if (this.f38333j == null) {
            this.f38333j = new RectF();
        }
        this.f38333j.set(rectF.left * f3, rectF.top * f9, rectF.right * f3, rectF.bottom * f9);
        this.f38325a = canvas;
        this.f38326b = aVar;
        if (aVar.f1050u >= 255 && !aVar.f()) {
            i = 1;
        } else if (aVar.f()) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 29 || !canvas.isHardwareAccelerated() || i6 <= 31) {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.f38327c = i;
        if (this.f38328d == null) {
            this.f38328d = new RectF();
        }
        this.f38328d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f38334k == null) {
            this.f38334k = new Y0.a();
        }
        this.f38334k.reset();
        int d2 = AbstractC5049e.d(this.f38327c);
        if (d2 == 0) {
            canvas.save();
            return canvas;
        }
        if (d2 == 1) {
            this.f38334k.setAlpha(aVar.f1050u);
            this.f38334k.setColorFilter(null);
            Y0.a aVar2 = this.f38334k;
            Matrix matrix = j.f38350a;
            canvas.saveLayer(rectF, aVar2);
            return canvas;
        }
        Matrix matrix2 = f38323B;
        if (d2 == 2) {
            if (this.f38338o == null) {
                Y0.a aVar3 = new Y0.a();
                this.f38338o = aVar3;
                aVar3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f38335l, this.f38333j)) {
                Bitmap bitmap = this.f38335l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f38335l = a(this.f38333j, Bitmap.Config.ARGB_8888);
                this.f38336m = new Canvas(this.f38335l);
            } else {
                Canvas canvas2 = this.f38336m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix2);
                this.f38336m.drawRect(-1.0f, -1.0f, this.f38333j.width() + 1.0f, this.f38333j.height() + 1.0f, this.f38338o);
            }
            G.h.a(this.f38334k, null);
            this.f38334k.setColorFilter(null);
            this.f38334k.setAlpha(aVar.f1050u);
            Canvas canvas3 = this.f38336m;
            canvas3.scale(f3, f9);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (d2 != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f38348y == null) {
            this.f38348y = h.c();
        }
        if (aVar.f() && this.f38349z == null) {
            this.f38349z = h.r();
            this.f38324A = null;
        }
        this.f38348y.setAlpha(aVar.f1050u / 255.0f);
        if (aVar.f()) {
            RenderNode renderNode = this.f38349z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(aVar.f1050u / 255.0f);
        }
        this.f38348y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f38348y;
        RectF rectF2 = this.f38333j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        beginRecording = this.f38348y.beginRecording((int) this.f38333j.width(), (int) this.f38333j.height());
        beginRecording.setMatrix(matrix2);
        beginRecording.scale(f3, f9);
        beginRecording.translate(-rectF.left, -rectF.top);
        return beginRecording;
    }
}
