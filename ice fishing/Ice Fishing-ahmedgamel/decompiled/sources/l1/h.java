package l1;

import a1.C0428a;
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
import com.google.android.gms.internal.ads.YP;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: B, reason: collision with root package name */
    public static final Matrix f38835B = new Matrix();

    /* renamed from: A, reason: collision with root package name */
    public C4666a f38836A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f38837a;

    /* renamed from: b, reason: collision with root package name */
    public I1.a f38838b;

    /* renamed from: c, reason: collision with root package name */
    public int f38839c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f38840d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f38841e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f38842f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f38843g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f38844h;
    public Rect i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f38845j;

    /* renamed from: k, reason: collision with root package name */
    public C0428a f38846k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f38847l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f38848m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f38849n;

    /* renamed from: o, reason: collision with root package name */
    public C0428a f38850o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f38851p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f38852q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f38853r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f38854s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f38855t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f38856u;

    /* renamed from: v, reason: collision with root package name */
    public C0428a f38857v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f38858w;

    /* renamed from: x, reason: collision with root package name */
    public float f38859x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f38860y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f38861z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, C4666a c4666a) {
        if (this.f38841e == null) {
            this.f38841e = new RectF();
        }
        if (this.f38843g == null) {
            this.f38843g = new RectF();
        }
        this.f38841e.set(rectF);
        this.f38841e.offsetTo(rectF.left + c4666a.f38809b, rectF.top + c4666a.f38810c);
        RectF rectF2 = this.f38841e;
        float f2 = c4666a.f38808a;
        rectF2.inset(-f2, -f2);
        this.f38843g.set(rectF);
        this.f38841e.union(this.f38843g);
        return this.f38841e;
    }

    public final void c() {
        float f2;
        C0428a c0428a;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.f38837a == null || this.f38838b == null || this.f38852q == null || this.f38840d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int d9 = AbstractC5050e.d(this.f38839c);
        if (d9 == 0) {
            this.f38837a.restore();
        } else if (d9 != 1) {
            if (d9 != 2) {
                if (d9 == 3) {
                    if (this.f38860y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f38837a.save();
                    Canvas canvas = this.f38837a;
                    float[] fArr = this.f38852q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f38860y.endRecording();
                    if (this.f38838b.d()) {
                        Canvas canvas2 = this.f38837a;
                        C4666a c4666a = (C4666a) this.f38838b.f1304v;
                        if (this.f38860y == null || this.f38861z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f38852q;
                        float f9 = fArr2 != null ? fArr2[0] : 1.0f;
                        f2 = fArr2 != null ? fArr2[4] : 1.0f;
                        C4666a c4666a2 = this.f38836A;
                        if (c4666a2 == null || c4666a.f38808a != c4666a2.f38808a || c4666a.f38809b != c4666a2.f38809b || c4666a.f38810c != c4666a2.f38810c || c4666a.f38811d != c4666a2.f38811d) {
                            createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c4666a.f38811d, PorterDuff.Mode.SRC_IN));
                            float f10 = c4666a.f38808a;
                            if (f10 > 0.0f) {
                                float f11 = ((f9 + f2) * f10) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                createColorFilterEffect = RenderEffect.createBlurEffect(f11, f11, createColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f38861z.setRenderEffect(createColorFilterEffect);
                            this.f38836A = c4666a;
                        }
                        RectF b9 = b(this.f38840d, c4666a);
                        RectF rectF = new RectF(b9.left * f9, b9.top * f2, b9.right * f9, b9.bottom * f2);
                        this.f38861z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        beginRecording = this.f38861z.beginRecording((int) rectF.width(), (int) rectF.height());
                        beginRecording.translate((c4666a.f38809b * f9) + (-rectF.left), (c4666a.f38810c * f2) + (-rectF.top));
                        beginRecording.drawRenderNode(this.f38860y);
                        this.f38861z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f38861z);
                        canvas2.restore();
                    }
                    this.f38837a.drawRenderNode(this.f38860y);
                    this.f38837a.restore();
                }
            } else {
                if (this.f38847l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f38838b.d()) {
                    Canvas canvas3 = this.f38837a;
                    C4666a c4666a3 = (C4666a) this.f38838b.f1304v;
                    RectF rectF2 = this.f38840d;
                    if (rectF2 == null || this.f38847l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF b10 = b(rectF2, c4666a3);
                    if (this.f38842f == null) {
                        this.f38842f = new Rect();
                    }
                    this.f38842f.set((int) Math.floor(b10.left), (int) Math.floor(b10.top), (int) Math.ceil(b10.right), (int) Math.ceil(b10.bottom));
                    float[] fArr3 = this.f38852q;
                    float f12 = fArr3 != null ? fArr3[0] : 1.0f;
                    f2 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f38844h == null) {
                        this.f38844h = new RectF();
                    }
                    this.f38844h.set(b10.left * f12, b10.top * f2, b10.right * f12, b10.bottom * f2);
                    if (this.i == null) {
                        this.i = new Rect();
                    }
                    this.i.set(0, 0, Math.round(this.f38844h.width()), Math.round(this.f38844h.height()));
                    if (d(this.f38853r, this.f38844h)) {
                        Bitmap bitmap = this.f38853r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f38854s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f38853r = a(this.f38844h, Bitmap.Config.ARGB_8888);
                        this.f38854s = a(this.f38844h, Bitmap.Config.ALPHA_8);
                        this.f38855t = new Canvas(this.f38853r);
                        this.f38856u = new Canvas(this.f38854s);
                    } else {
                        Canvas canvas4 = this.f38855t;
                        if (canvas4 == null || this.f38856u == null || (c0428a = this.f38850o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.i, c0428a);
                        this.f38856u.drawRect(this.i, this.f38850o);
                    }
                    if (this.f38854s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f38857v == null) {
                        this.f38857v = new C0428a(1, 0);
                    }
                    RectF rectF3 = this.f38840d;
                    this.f38856u.drawBitmap(this.f38847l, Math.round((rectF3.left - b10.left) * f12), Math.round((rectF3.top - b10.top) * f2), (Paint) null);
                    if (this.f38858w == null || this.f38859x != c4666a3.f38808a) {
                        float f13 = ((f12 + f2) * c4666a3.f38808a) / 2.0f;
                        if (f13 > 0.0f) {
                            this.f38858w = new BlurMaskFilter(f13, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f38858w = null;
                        }
                        this.f38859x = c4666a3.f38808a;
                    }
                    this.f38857v.setColor(c4666a3.f38811d);
                    if (c4666a3.f38808a > 0.0f) {
                        this.f38857v.setMaskFilter(this.f38858w);
                    } else {
                        this.f38857v.setMaskFilter(null);
                    }
                    this.f38857v.setFilterBitmap(true);
                    this.f38855t.drawBitmap(this.f38854s, Math.round(c4666a3.f38809b * f12), Math.round(c4666a3.f38810c * f2), this.f38857v);
                    canvas3.drawBitmap(this.f38853r, this.i, this.f38842f, this.f38846k);
                }
                if (this.f38849n == null) {
                    this.f38849n = new Rect();
                }
                this.f38849n.set(0, 0, (int) (this.f38840d.width() * this.f38852q[0]), (int) (this.f38840d.height() * this.f38852q[4]));
                this.f38837a.drawBitmap(this.f38847l, this.f38849n, this.f38840d, this.f38846k);
            }
        } else {
            this.f38837a.restore();
        }
        this.f38837a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, I1.a aVar) {
        RecordingCanvas beginRecording;
        if (this.f38837a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f38852q == null) {
            this.f38852q = new float[9];
        }
        if (this.f38851p == null) {
            this.f38851p = new Matrix();
        }
        canvas.getMatrix(this.f38851p);
        this.f38851p.getValues(this.f38852q);
        float[] fArr = this.f38852q;
        float f2 = fArr[0];
        int i = 4;
        float f9 = fArr[4];
        if (this.f38845j == null) {
            this.f38845j = new RectF();
        }
        this.f38845j.set(rectF.left * f2, rectF.top * f9, rectF.right * f2, rectF.bottom * f9);
        this.f38837a = canvas;
        this.f38838b = aVar;
        if (aVar.f1303u >= 255 && !aVar.d()) {
            i = 1;
        } else if (aVar.d()) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 29 || !canvas.isHardwareAccelerated() || i4 <= 31) {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.f38839c = i;
        if (this.f38840d == null) {
            this.f38840d = new RectF();
        }
        this.f38840d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f38846k == null) {
            this.f38846k = new C0428a();
        }
        this.f38846k.reset();
        int d9 = AbstractC5050e.d(this.f38839c);
        if (d9 == 0) {
            canvas.save();
            return canvas;
        }
        if (d9 == 1) {
            this.f38846k.setAlpha(aVar.f1303u);
            this.f38846k.setColorFilter(null);
            C0428a c0428a = this.f38846k;
            Matrix matrix = i.f38862a;
            canvas.saveLayer(rectF, c0428a);
            return canvas;
        }
        Matrix matrix2 = f38835B;
        if (d9 == 2) {
            if (this.f38850o == null) {
                C0428a c0428a2 = new C0428a();
                this.f38850o = c0428a2;
                c0428a2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f38847l, this.f38845j)) {
                Bitmap bitmap = this.f38847l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f38847l = a(this.f38845j, Bitmap.Config.ARGB_8888);
                this.f38848m = new Canvas(this.f38847l);
            } else {
                Canvas canvas2 = this.f38848m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix2);
                this.f38848m.drawRect(-1.0f, -1.0f, this.f38845j.width() + 1.0f, this.f38845j.height() + 1.0f, this.f38850o);
            }
            G.h.a(this.f38846k, null);
            this.f38846k.setColorFilter(null);
            this.f38846k.setAlpha(aVar.f1303u);
            Canvas canvas3 = this.f38848m;
            canvas3.scale(f2, f9);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (d9 != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f38860y == null) {
            this.f38860y = YP.c();
        }
        if (aVar.d() && this.f38861z == null) {
            this.f38861z = YP.r();
            this.f38836A = null;
        }
        this.f38860y.setAlpha(aVar.f1303u / 255.0f);
        if (aVar.d()) {
            RenderNode renderNode = this.f38861z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(aVar.f1303u / 255.0f);
        }
        this.f38860y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f38860y;
        RectF rectF2 = this.f38845j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        beginRecording = this.f38860y.beginRecording((int) this.f38845j.width(), (int) this.f38845j.height());
        beginRecording.setMatrix(matrix2);
        beginRecording.scale(f2, f9);
        beginRecording.translate(-rectF.left, -rectF.top);
        return beginRecording;
    }
}
