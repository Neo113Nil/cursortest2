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
    private static final int f11052c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11053d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f11054e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f11055f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f11056g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f11057h = 6;
    private static final int i = 20;

    /* renamed from: A, reason: collision with root package name */
    private float f11058A;

    /* renamed from: B, reason: collision with root package name */
    private float f11059B;

    /* renamed from: C, reason: collision with root package name */
    private float f11060C;

    /* renamed from: j, reason: collision with root package name */
    private int f11061j;

    /* renamed from: k, reason: collision with root package name */
    private c f11062k;

    /* renamed from: l, reason: collision with root package name */
    private c f11063l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f11064m;

    /* renamed from: n, reason: collision with root package name */
    private Path f11065n;

    /* renamed from: o, reason: collision with root package name */
    private Paint f11066o;

    /* renamed from: p, reason: collision with root package name */
    private Paint f11067p;

    /* renamed from: q, reason: collision with root package name */
    private Paint f11068q;

    /* renamed from: r, reason: collision with root package name */
    private long f11069r;

    /* renamed from: s, reason: collision with root package name */
    private long f11070s;

    /* renamed from: t, reason: collision with root package name */
    private int f11071t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11072u;

    /* renamed from: v, reason: collision with root package name */
    private a f11073v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.ui.guidetoclickv2.picverify.a f11074w;

    /* renamed from: x, reason: collision with root package name */
    private int f11075x;

    /* renamed from: y, reason: collision with root package name */
    private int f11076y;

    /* renamed from: z, reason: collision with root package name */
    private float f11077z;

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
        if (this.f11062k == null) {
            this.f11062k = this.f11074w.a(getWidth(), getHeight(), this.f11071t);
        }
        if (this.f11063l == null) {
            this.f11063l = this.f11074w.b(getWidth(), getHeight(), this.f11071t);
        }
        if (this.f11065n == null) {
            Path a9 = this.f11074w.a(this.f11071t);
            this.f11065n = a9;
            c cVar = this.f11062k;
            a9.offset(cVar.f11085a, cVar.f11086b);
        }
        if (this.f11064m == null) {
            Bitmap bitmap = null;
            if (getDrawable() != null) {
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                getDrawable().setBounds(0, 0, getWidth(), getHeight());
                canvas.clipPath(this.f11065n);
                getDrawable().draw(canvas);
                this.f11074w.a(getContext(), canvas, this.f11065n);
                c cVar2 = this.f11062k;
                if (cVar2 != null) {
                    int i6 = cVar2.f11085a;
                    int i9 = cVar2.f11086b;
                    int i10 = this.f11071t;
                    bitmap = Bitmap.createBitmap(createBitmap, i6, i9, i10, i10);
                    createBitmap.recycle();
                }
            }
            this.f11064m = bitmap;
        }
    }

    private void b(float f3, float f9) {
        c cVar = this.f11063l;
        if (cVar != null) {
            this.f11061j = 2;
            cVar.f11085a = (int) (cVar.f11085a + f3);
            cVar.f11086b = (int) (cVar.f11086b + f9);
            postInvalidate();
        }
    }

    private void c() {
        this.f11061j = 6;
        postInvalidate();
    }

    private void d() {
        this.f11061j = 5;
        postInvalidate();
    }

    private Bitmap e() {
        if (getDrawable() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        canvas.clipPath(this.f11065n);
        getDrawable().draw(canvas);
        this.f11074w.a(getContext(), canvas, this.f11065n);
        c cVar = this.f11062k;
        if (cVar == null) {
            return null;
        }
        int i6 = cVar.f11085a;
        int i9 = cVar.f11086b;
        int i10 = this.f11071t;
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i6, i9, i10, i10);
        createBitmap.recycle();
        return createBitmap2;
    }

    private void f() {
        c cVar;
        c cVar2 = this.f11063l;
        if (cVar2 == null || (cVar = this.f11062k) == null || Math.abs(cVar2.f11085a - cVar.f11085a) >= 20 || Math.abs(this.f11063l.f11086b - this.f11062k.f11086b) >= 20) {
            this.f11061j = 6;
            postInvalidate();
            return;
        }
        this.f11061j = 5;
        postInvalidate();
        a aVar = this.f11073v;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void callback(a aVar) {
        this.f11073v = aVar;
    }

    public void down(int i6) {
        if (this.f11063l != null) {
            this.f11069r = System.currentTimeMillis();
            this.f11061j = 1;
            c cVar = this.f11063l;
            int width = getWidth() - this.f11071t;
            cVar.f11085a = (int) (((i6 / 100.0f) * (width - (r2 * 2))) + this.f11063l.f11087c);
            postInvalidate();
        }
    }

    public void loose() {
        c cVar;
        this.f11061j = 3;
        this.f11070s = System.currentTimeMillis();
        c cVar2 = this.f11063l;
        if (cVar2 == null || (cVar = this.f11062k) == null || Math.abs(cVar2.f11085a - cVar.f11085a) >= 20 || Math.abs(this.f11063l.f11086b - this.f11062k.f11086b) >= 20) {
            this.f11061j = 6;
            postInvalidate();
        } else {
            this.f11061j = 5;
            postInvalidate();
            a aVar = this.f11073v;
            if (aVar != null) {
                aVar.a();
            }
        }
        postInvalidate();
    }

    public void move(int i6) {
        c cVar;
        if (this.f11076y == i6 || (cVar = this.f11063l) == null) {
            return;
        }
        this.f11076y = i6;
        this.f11061j = 2;
        int width = getWidth() - this.f11071t;
        cVar.f11085a = (int) (((i6 / 100.0f) * (width - (r2 * 2))) + this.f11063l.f11087c);
        postInvalidate();
    }

    @Override // com.anythink.core.common.ui.component.RoundImageView, com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        c cVar;
        if (getDrawable() != null && getWidth() > 0 && getHeight() >= 0) {
            if (this.f11062k == null) {
                this.f11062k = this.f11074w.a(getWidth(), getHeight(), this.f11071t);
            }
            if (this.f11063l == null) {
                this.f11063l = this.f11074w.b(getWidth(), getHeight(), this.f11071t);
            }
            if (this.f11065n == null) {
                Path a9 = this.f11074w.a(this.f11071t);
                this.f11065n = a9;
                c cVar2 = this.f11062k;
                a9.offset(cVar2.f11085a, cVar2.f11086b);
            }
            if (this.f11064m == null) {
                Bitmap bitmap = null;
                if (getDrawable() != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    getDrawable().setBounds(0, 0, getWidth(), getHeight());
                    canvas3.clipPath(this.f11065n);
                    getDrawable().draw(canvas3);
                    this.f11074w.a(getContext(), canvas3, this.f11065n);
                    c cVar3 = this.f11062k;
                    if (cVar3 != null) {
                        int i6 = cVar3.f11085a;
                        int i9 = cVar3.f11086b;
                        int i10 = this.f11071t;
                        bitmap = Bitmap.createBitmap(createBitmap, i6, i9, i10, i10);
                        createBitmap.recycle();
                    }
                }
                this.f11064m = bitmap;
            }
        }
        if (getDrawable() == null) {
            return;
        }
        if (this.f11061j == 5 || this.f11062k == null) {
            canvas2 = canvas;
        } else {
            canvas.drawPath(this.f11065n, this.f11067p);
            c cVar4 = this.f11062k;
            int i11 = cVar4.f11085a;
            int i12 = cVar4.f11086b;
            int i13 = this.f11071t;
            canvas2 = canvas;
            canvas2.drawRect(i11, i12, i11 + i13, i12 + i13, this.f11068q);
        }
        int i14 = this.f11061j;
        if ((i14 == 2 || i14 == 4 || i14 == 1 || i14 == 6) && (cVar = this.f11063l) != null) {
            canvas2.drawBitmap(this.f11064m, cVar.f11085a, cVar.f11086b, this.f11066o);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f11065n = null;
        this.f11063l = null;
        this.f11062k = null;
        this.f11064m.recycle();
        this.f11064m = null;
        setImageBitmap(bitmap);
    }

    public void setBlockSize(int i6) {
        this.f11071t = i6;
        this.f11065n = null;
        this.f11063l = null;
        this.f11062k = null;
        this.f11064m = null;
        postInvalidate();
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f11061j = 4;
        this.f11071t = 50;
        this.f11072u = true;
        this.f11076y = -1;
        b bVar = new b(context);
        this.f11074w = bVar;
        this.f11067p = bVar.a();
        Paint paint = new Paint();
        this.f11068q = paint;
        paint.setColor(Color.parseColor("#B5B5B5"));
        this.f11068q.setStrokeWidth(q.a(getContext(), 1.0f));
        this.f11068q.setStyle(Paint.Style.STROKE);
        this.f11066o = this.f11074w.b();
    }

    private void b() {
        this.f11061j = 4;
        this.f11064m = null;
        this.f11062k = null;
        this.f11065n = null;
        postInvalidate();
    }

    private void a(float f3, float f9) {
        c cVar = this.f11063l;
        if (cVar != null) {
            this.f11061j = 1;
            int i6 = this.f11071t;
            cVar.f11085a = (int) (f3 - (i6 / 2.0f));
            cVar.f11086b = (int) (f9 - (i6 / 2.0f));
            this.f11069r = System.currentTimeMillis();
            postInvalidate();
        }
    }

    private void a(com.anythink.basead.ui.guidetoclickv2.picverify.a aVar) {
        this.f11074w = aVar;
    }

    private void a(boolean z3) {
        this.f11072u = z3;
    }

    private Bitmap a(Bitmap bitmap) {
        c cVar = this.f11062k;
        if (cVar == null) {
            return null;
        }
        int i6 = cVar.f11085a;
        int i9 = cVar.f11086b;
        int i10 = this.f11071t;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i6, i9, i10, i10);
        bitmap.recycle();
        return createBitmap;
    }
}
