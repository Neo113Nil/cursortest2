package com.anythink.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class PictureVerifyView extends RoundImageView {

    /* renamed from: c, reason: collision with root package name */
    private static final int f11209c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11210d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f11211e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f11212f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f11213g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f11214h = 6;
    private static final int i = 20;

    /* renamed from: A, reason: collision with root package name */
    private float f11215A;

    /* renamed from: B, reason: collision with root package name */
    private float f11216B;

    /* renamed from: C, reason: collision with root package name */
    private float f11217C;

    /* renamed from: j, reason: collision with root package name */
    private int f11218j;

    /* renamed from: k, reason: collision with root package name */
    private c f11219k;

    /* renamed from: l, reason: collision with root package name */
    private c f11220l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f11221m;

    /* renamed from: n, reason: collision with root package name */
    private Path f11222n;

    /* renamed from: o, reason: collision with root package name */
    private Paint f11223o;

    /* renamed from: p, reason: collision with root package name */
    private Paint f11224p;

    /* renamed from: q, reason: collision with root package name */
    private Paint f11225q;

    /* renamed from: r, reason: collision with root package name */
    private long f11226r;

    /* renamed from: s, reason: collision with root package name */
    private long f11227s;

    /* renamed from: t, reason: collision with root package name */
    private int f11228t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11229u;

    /* renamed from: v, reason: collision with root package name */
    private a f11230v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.ui.guidetoclickv2.picverify.a f11231w;

    /* renamed from: x, reason: collision with root package name */
    private int f11232x;

    /* renamed from: y, reason: collision with root package name */
    private int f11233y;

    /* renamed from: z, reason: collision with root package name */
    private float f11234z;

    public interface a {
        void a();

        void b();
    }

    public PictureVerifyView(Context context) {
        this(context, null);
    }

    private void a() {
        if (getDrawable() == null || getWidth() <= 0 || getHeight() < 0) {
            return;
        }
        if (this.f11219k == null) {
            this.f11219k = this.f11231w.a(getWidth(), getHeight(), this.f11228t);
        }
        if (this.f11220l == null) {
            this.f11220l = this.f11231w.b(getWidth(), getHeight(), this.f11228t);
        }
        if (this.f11222n == null) {
            Path a9 = this.f11231w.a(this.f11228t);
            this.f11222n = a9;
            c cVar = this.f11219k;
            a9.offset(cVar.f11242a, cVar.f11243b);
        }
        if (this.f11221m == null) {
            Bitmap bitmap = null;
            if (getDrawable() != null) {
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                getDrawable().setBounds(0, 0, getWidth(), getHeight());
                canvas.clipPath(this.f11222n);
                getDrawable().draw(canvas);
                this.f11231w.a(getContext(), canvas, this.f11222n);
                c cVar2 = this.f11219k;
                if (cVar2 != null) {
                    int i4 = cVar2.f11242a;
                    int i9 = cVar2.f11243b;
                    int i10 = this.f11228t;
                    bitmap = Bitmap.createBitmap(createBitmap, i4, i9, i10, i10);
                    createBitmap.recycle();
                }
            }
            this.f11221m = bitmap;
        }
    }

    private void b(float f6, float f9) {
        c cVar = this.f11220l;
        if (cVar != null) {
            this.f11218j = 2;
            cVar.f11242a = (int) (cVar.f11242a + f6);
            cVar.f11243b = (int) (cVar.f11243b + f9);
            postInvalidate();
        }
    }

    private void c() {
        this.f11218j = 6;
        postInvalidate();
    }

    private void d() {
        this.f11218j = 5;
        postInvalidate();
    }

    private Bitmap e() {
        if (getDrawable() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        canvas.clipPath(this.f11222n);
        getDrawable().draw(canvas);
        this.f11231w.a(getContext(), canvas, this.f11222n);
        c cVar = this.f11219k;
        if (cVar == null) {
            return null;
        }
        int i4 = cVar.f11242a;
        int i9 = cVar.f11243b;
        int i10 = this.f11228t;
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i4, i9, i10, i10);
        createBitmap.recycle();
        return createBitmap2;
    }

    private void f() {
        c cVar;
        c cVar2 = this.f11220l;
        if (cVar2 == null || (cVar = this.f11219k) == null || Math.abs(cVar2.f11242a - cVar.f11242a) >= 20 || Math.abs(this.f11220l.f11243b - this.f11219k.f11243b) >= 20) {
            this.f11218j = 6;
            postInvalidate();
            return;
        }
        this.f11218j = 5;
        postInvalidate();
        a aVar = this.f11230v;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void callback(a aVar) {
        this.f11230v = aVar;
    }

    public void down(int i4) {
        if (this.f11220l != null) {
            this.f11226r = System.currentTimeMillis();
            this.f11218j = 1;
            c cVar = this.f11220l;
            int width = getWidth() - this.f11228t;
            cVar.f11242a = (int) (((i4 / 100.0f) * (width - (r2 * 2))) + this.f11220l.f11244c);
            postInvalidate();
        }
    }

    public void loose() {
        c cVar;
        this.f11218j = 3;
        this.f11227s = System.currentTimeMillis();
        c cVar2 = this.f11220l;
        if (cVar2 == null || (cVar = this.f11219k) == null || Math.abs(cVar2.f11242a - cVar.f11242a) >= 20 || Math.abs(this.f11220l.f11243b - this.f11219k.f11243b) >= 20) {
            this.f11218j = 6;
            postInvalidate();
        } else {
            this.f11218j = 5;
            postInvalidate();
            a aVar = this.f11230v;
            if (aVar != null) {
                aVar.a();
            }
        }
        postInvalidate();
    }

    public void move(int i4) {
        c cVar;
        if (this.f11233y == i4 || (cVar = this.f11220l) == null) {
            return;
        }
        this.f11233y = i4;
        this.f11218j = 2;
        int width = getWidth() - this.f11228t;
        cVar.f11242a = (int) (((i4 / 100.0f) * (width - (r2 * 2))) + this.f11220l.f11244c);
        postInvalidate();
    }

    @Override // com.anythink.core.common.ui.component.RoundImageView, com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        c cVar;
        if (getDrawable() != null && getWidth() > 0 && getHeight() >= 0) {
            if (this.f11219k == null) {
                this.f11219k = this.f11231w.a(getWidth(), getHeight(), this.f11228t);
            }
            if (this.f11220l == null) {
                this.f11220l = this.f11231w.b(getWidth(), getHeight(), this.f11228t);
            }
            if (this.f11222n == null) {
                Path a9 = this.f11231w.a(this.f11228t);
                this.f11222n = a9;
                c cVar2 = this.f11219k;
                a9.offset(cVar2.f11242a, cVar2.f11243b);
            }
            if (this.f11221m == null) {
                Bitmap bitmap = null;
                if (getDrawable() != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    getDrawable().setBounds(0, 0, getWidth(), getHeight());
                    canvas3.clipPath(this.f11222n);
                    getDrawable().draw(canvas3);
                    this.f11231w.a(getContext(), canvas3, this.f11222n);
                    c cVar3 = this.f11219k;
                    if (cVar3 != null) {
                        int i4 = cVar3.f11242a;
                        int i9 = cVar3.f11243b;
                        int i10 = this.f11228t;
                        bitmap = Bitmap.createBitmap(createBitmap, i4, i9, i10, i10);
                        createBitmap.recycle();
                    }
                }
                this.f11221m = bitmap;
            }
        }
        if (getDrawable() == null) {
            return;
        }
        if (this.f11218j == 5 || this.f11219k == null) {
            canvas2 = canvas;
        } else {
            canvas.drawPath(this.f11222n, this.f11224p);
            c cVar4 = this.f11219k;
            int i11 = cVar4.f11242a;
            int i12 = cVar4.f11243b;
            int i13 = this.f11228t;
            canvas2 = canvas;
            canvas2.drawRect(i11, i12, i11 + i13, i12 + i13, this.f11225q);
        }
        int i14 = this.f11218j;
        if ((i14 == 2 || i14 == 4 || i14 == 1 || i14 == 6) && (cVar = this.f11220l) != null) {
            canvas2.drawBitmap(this.f11221m, cVar.f11242a, cVar.f11243b, this.f11223o);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f11222n = null;
        this.f11220l = null;
        this.f11219k = null;
        this.f11221m.recycle();
        this.f11221m = null;
        setImageBitmap(bitmap);
    }

    public void setBlockSize(int i4) {
        this.f11228t = i4;
        this.f11222n = null;
        this.f11220l = null;
        this.f11219k = null;
        this.f11221m = null;
        postInvalidate();
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f11218j = 4;
        this.f11228t = 50;
        this.f11229u = true;
        this.f11233y = -1;
        b bVar = new b(context);
        this.f11231w = bVar;
        this.f11224p = bVar.a();
        Paint paint = new Paint();
        this.f11225q = paint;
        paint.setColor(Color.parseColor("#B5B5B5"));
        this.f11225q.setStrokeWidth(q.a(getContext(), 1.0f));
        this.f11225q.setStyle(Paint.Style.STROKE);
        this.f11223o = this.f11231w.b();
    }

    private void b() {
        this.f11218j = 4;
        this.f11221m = null;
        this.f11219k = null;
        this.f11222n = null;
        postInvalidate();
    }

    private void a(float f6, float f9) {
        c cVar = this.f11220l;
        if (cVar != null) {
            this.f11218j = 1;
            int i4 = this.f11228t;
            cVar.f11242a = (int) (f6 - (i4 / 2.0f));
            cVar.f11243b = (int) (f9 - (i4 / 2.0f));
            this.f11226r = System.currentTimeMillis();
            postInvalidate();
        }
    }

    private void a(com.anythink.basead.ui.guidetoclickv2.picverify.a aVar) {
        this.f11231w = aVar;
    }

    private void a(boolean z8) {
        this.f11229u = z8;
    }

    private Bitmap a(Bitmap bitmap) {
        c cVar = this.f11219k;
        if (cVar == null) {
            return null;
        }
        int i4 = cVar.f11242a;
        int i9 = cVar.f11243b;
        int i10 = this.f11228t;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i4, i9, i10, i10);
        bitmap.recycle();
        return createBitmap;
    }
}
