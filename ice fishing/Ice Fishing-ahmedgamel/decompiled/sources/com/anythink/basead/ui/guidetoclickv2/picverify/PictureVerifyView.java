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
    private static final int f11838c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11839d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f11840e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f11841f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f11842g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f11843h = 6;
    private static final int i = 20;

    /* renamed from: A, reason: collision with root package name */
    private float f11844A;

    /* renamed from: B, reason: collision with root package name */
    private float f11845B;

    /* renamed from: C, reason: collision with root package name */
    private float f11846C;

    /* renamed from: j, reason: collision with root package name */
    private int f11847j;

    /* renamed from: k, reason: collision with root package name */
    private c f11848k;

    /* renamed from: l, reason: collision with root package name */
    private c f11849l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f11850m;

    /* renamed from: n, reason: collision with root package name */
    private Path f11851n;

    /* renamed from: o, reason: collision with root package name */
    private Paint f11852o;

    /* renamed from: p, reason: collision with root package name */
    private Paint f11853p;

    /* renamed from: q, reason: collision with root package name */
    private Paint f11854q;

    /* renamed from: r, reason: collision with root package name */
    private long f11855r;

    /* renamed from: s, reason: collision with root package name */
    private long f11856s;

    /* renamed from: t, reason: collision with root package name */
    private int f11857t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11858u;

    /* renamed from: v, reason: collision with root package name */
    private a f11859v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.ui.guidetoclickv2.picverify.a f11860w;

    /* renamed from: x, reason: collision with root package name */
    private int f11861x;

    /* renamed from: y, reason: collision with root package name */
    private int f11862y;

    /* renamed from: z, reason: collision with root package name */
    private float f11863z;

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
        if (this.f11848k == null) {
            this.f11848k = this.f11860w.a(getWidth(), getHeight(), this.f11857t);
        }
        if (this.f11849l == null) {
            this.f11849l = this.f11860w.b(getWidth(), getHeight(), this.f11857t);
        }
        if (this.f11851n == null) {
            Path a9 = this.f11860w.a(this.f11857t);
            this.f11851n = a9;
            c cVar = this.f11848k;
            a9.offset(cVar.f11871a, cVar.f11872b);
        }
        if (this.f11850m == null) {
            Bitmap bitmap = null;
            if (getDrawable() != null) {
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                getDrawable().setBounds(0, 0, getWidth(), getHeight());
                canvas.clipPath(this.f11851n);
                getDrawable().draw(canvas);
                this.f11860w.a(getContext(), canvas, this.f11851n);
                c cVar2 = this.f11848k;
                if (cVar2 != null) {
                    int i4 = cVar2.f11871a;
                    int i6 = cVar2.f11872b;
                    int i9 = this.f11857t;
                    bitmap = Bitmap.createBitmap(createBitmap, i4, i6, i9, i9);
                    createBitmap.recycle();
                }
            }
            this.f11850m = bitmap;
        }
    }

    private void b(float f2, float f9) {
        c cVar = this.f11849l;
        if (cVar != null) {
            this.f11847j = 2;
            cVar.f11871a = (int) (cVar.f11871a + f2);
            cVar.f11872b = (int) (cVar.f11872b + f9);
            postInvalidate();
        }
    }

    private void c() {
        this.f11847j = 6;
        postInvalidate();
    }

    private void d() {
        this.f11847j = 5;
        postInvalidate();
    }

    private Bitmap e() {
        if (getDrawable() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        canvas.clipPath(this.f11851n);
        getDrawable().draw(canvas);
        this.f11860w.a(getContext(), canvas, this.f11851n);
        c cVar = this.f11848k;
        if (cVar == null) {
            return null;
        }
        int i4 = cVar.f11871a;
        int i6 = cVar.f11872b;
        int i9 = this.f11857t;
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i4, i6, i9, i9);
        createBitmap.recycle();
        return createBitmap2;
    }

    private void f() {
        c cVar;
        c cVar2 = this.f11849l;
        if (cVar2 == null || (cVar = this.f11848k) == null || Math.abs(cVar2.f11871a - cVar.f11871a) >= 20 || Math.abs(this.f11849l.f11872b - this.f11848k.f11872b) >= 20) {
            this.f11847j = 6;
            postInvalidate();
            return;
        }
        this.f11847j = 5;
        postInvalidate();
        a aVar = this.f11859v;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void callback(a aVar) {
        this.f11859v = aVar;
    }

    public void down(int i4) {
        if (this.f11849l != null) {
            this.f11855r = System.currentTimeMillis();
            this.f11847j = 1;
            c cVar = this.f11849l;
            int width = getWidth() - this.f11857t;
            cVar.f11871a = (int) (((i4 / 100.0f) * (width - (r2 * 2))) + this.f11849l.f11873c);
            postInvalidate();
        }
    }

    public void loose() {
        c cVar;
        this.f11847j = 3;
        this.f11856s = System.currentTimeMillis();
        c cVar2 = this.f11849l;
        if (cVar2 == null || (cVar = this.f11848k) == null || Math.abs(cVar2.f11871a - cVar.f11871a) >= 20 || Math.abs(this.f11849l.f11872b - this.f11848k.f11872b) >= 20) {
            this.f11847j = 6;
            postInvalidate();
        } else {
            this.f11847j = 5;
            postInvalidate();
            a aVar = this.f11859v;
            if (aVar != null) {
                aVar.a();
            }
        }
        postInvalidate();
    }

    public void move(int i4) {
        c cVar;
        if (this.f11862y == i4 || (cVar = this.f11849l) == null) {
            return;
        }
        this.f11862y = i4;
        this.f11847j = 2;
        int width = getWidth() - this.f11857t;
        cVar.f11871a = (int) (((i4 / 100.0f) * (width - (r2 * 2))) + this.f11849l.f11873c);
        postInvalidate();
    }

    @Override // com.anythink.core.common.ui.component.RoundImageView, com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        c cVar;
        if (getDrawable() != null && getWidth() > 0 && getHeight() >= 0) {
            if (this.f11848k == null) {
                this.f11848k = this.f11860w.a(getWidth(), getHeight(), this.f11857t);
            }
            if (this.f11849l == null) {
                this.f11849l = this.f11860w.b(getWidth(), getHeight(), this.f11857t);
            }
            if (this.f11851n == null) {
                Path a9 = this.f11860w.a(this.f11857t);
                this.f11851n = a9;
                c cVar2 = this.f11848k;
                a9.offset(cVar2.f11871a, cVar2.f11872b);
            }
            if (this.f11850m == null) {
                Bitmap bitmap = null;
                if (getDrawable() != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    getDrawable().setBounds(0, 0, getWidth(), getHeight());
                    canvas3.clipPath(this.f11851n);
                    getDrawable().draw(canvas3);
                    this.f11860w.a(getContext(), canvas3, this.f11851n);
                    c cVar3 = this.f11848k;
                    if (cVar3 != null) {
                        int i4 = cVar3.f11871a;
                        int i6 = cVar3.f11872b;
                        int i9 = this.f11857t;
                        bitmap = Bitmap.createBitmap(createBitmap, i4, i6, i9, i9);
                        createBitmap.recycle();
                    }
                }
                this.f11850m = bitmap;
            }
        }
        if (getDrawable() == null) {
            return;
        }
        if (this.f11847j == 5 || this.f11848k == null) {
            canvas2 = canvas;
        } else {
            canvas.drawPath(this.f11851n, this.f11853p);
            c cVar4 = this.f11848k;
            int i10 = cVar4.f11871a;
            int i11 = cVar4.f11872b;
            int i12 = this.f11857t;
            canvas2 = canvas;
            canvas2.drawRect(i10, i11, i10 + i12, i11 + i12, this.f11854q);
        }
        int i13 = this.f11847j;
        if ((i13 == 2 || i13 == 4 || i13 == 1 || i13 == 6) && (cVar = this.f11849l) != null) {
            canvas2.drawBitmap(this.f11850m, cVar.f11871a, cVar.f11872b, this.f11852o);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f11851n = null;
        this.f11849l = null;
        this.f11848k = null;
        this.f11850m.recycle();
        this.f11850m = null;
        setImageBitmap(bitmap);
    }

    public void setBlockSize(int i4) {
        this.f11857t = i4;
        this.f11851n = null;
        this.f11849l = null;
        this.f11848k = null;
        this.f11850m = null;
        postInvalidate();
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f11847j = 4;
        this.f11857t = 50;
        this.f11858u = true;
        this.f11862y = -1;
        b bVar = new b(context);
        this.f11860w = bVar;
        this.f11853p = bVar.a();
        Paint paint = new Paint();
        this.f11854q = paint;
        paint.setColor(Color.parseColor("#B5B5B5"));
        this.f11854q.setStrokeWidth(q.a(getContext(), 1.0f));
        this.f11854q.setStyle(Paint.Style.STROKE);
        this.f11852o = this.f11860w.b();
    }

    private void b() {
        this.f11847j = 4;
        this.f11850m = null;
        this.f11848k = null;
        this.f11851n = null;
        postInvalidate();
    }

    private void a(float f2, float f9) {
        c cVar = this.f11849l;
        if (cVar != null) {
            this.f11847j = 1;
            int i4 = this.f11857t;
            cVar.f11871a = (int) (f2 - (i4 / 2.0f));
            cVar.f11872b = (int) (f9 - (i4 / 2.0f));
            this.f11855r = System.currentTimeMillis();
            postInvalidate();
        }
    }

    private void a(com.anythink.basead.ui.guidetoclickv2.picverify.a aVar) {
        this.f11860w = aVar;
    }

    private void a(boolean z6) {
        this.f11858u = z6;
    }

    private Bitmap a(Bitmap bitmap) {
        c cVar = this.f11848k;
        if (cVar == null) {
            return null;
        }
        int i4 = cVar.f11871a;
        int i6 = cVar.f11872b;
        int i9 = this.f11857t;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i4, i6, i9, i9);
        bitmap.recycle();
        return createBitmap;
    }
}
