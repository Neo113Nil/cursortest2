package com.anythink.expressad.video.dynview.g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: classes.dex */
public final class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f21182a;

    /* renamed from: b, reason: collision with root package name */
    private float f21183b;

    /* renamed from: c, reason: collision with root package name */
    private float f21184c;

    /* renamed from: d, reason: collision with root package name */
    private int f21185d;

    /* renamed from: e, reason: collision with root package name */
    private int f21186e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f21187f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f21188g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21189h;
    private Paint i;

    /* renamed from: com.anythink.expressad.video.dynview.g.a$a, reason: collision with other inner class name */
    public static class C0136a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f21190a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f21191b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f21192c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f21193d;

        /* renamed from: e, reason: collision with root package name */
        private int f21194e;

        /* renamed from: f, reason: collision with root package name */
        private int f21195f;

        /* renamed from: g, reason: collision with root package name */
        private int f21196g;

        /* renamed from: h, reason: collision with root package name */
        private float f21197h;
        private float i;

        public /* synthetic */ C0136a(byte b9) {
            this();
        }

        private C0136a() {
            this.f21195f = 100;
            this.f21196g = 10;
            this.f21190a = new RectShape();
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f21191b = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f21192c = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b c(int i) {
            this.f21196g = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a() {
            this.f21193d = true;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(float f3) {
            this.i = f3;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(int i) {
            this.f21194e = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(int i) {
            this.f21195f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(float f3) {
            this.f21197h = f3;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final a b() {
            return new a(this, (byte) 0);
        }
    }

    public interface b {
        b a();

        b a(float f3);

        b a(int i);

        b a(Bitmap bitmap);

        b b(float f3);

        b b(int i);

        b b(Bitmap bitmap);

        a b();

        b c(int i);
    }

    public /* synthetic */ a(C0136a c0136a, byte b9) {
        this(c0136a);
    }

    private void a(Canvas canvas) {
        float f3 = this.f21184c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f21185d + f3) - this.f21186e);
        path.lineTo(this.f21183b, (f3 - this.f21185d) - this.f21186e);
        path.lineTo(this.f21183b, 0.0f);
        if (this.f21189h) {
            try {
                a(canvas, path);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f21187f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f21187f);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f21185d + f3 + this.f21186e);
        path2.lineTo(0.0f, this.f21184c);
        path2.lineTo(this.f21183b, this.f21184c);
        path2.lineTo(this.f21183b, (f3 - this.f21185d) + this.f21186e);
        if (this.f21189h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f21188g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f21188g);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f3 = this.f21183b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f21184c);
        path.lineTo((f3 - this.f21185d) - this.f21186e, this.f21184c);
        path.lineTo((this.f21185d + f3) - this.f21186e, 0.0f);
        if (this.f21189h) {
            try {
                a(canvas, path);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f21187f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f21187f);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f21185d + f3 + this.f21186e, 0.0f);
        path2.lineTo(this.f21183b, 0.0f);
        path2.lineTo(this.f21183b, this.f21184c);
        path2.lineTo((f3 - this.f21185d) + this.f21186e, this.f21184c);
        if (this.f21189h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f21188g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f21188g);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f21182a == 1) {
            float f3 = this.f21184c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f21185d + f3) - this.f21186e);
            path.lineTo(this.f21183b, (f3 - this.f21185d) - this.f21186e);
            path.lineTo(this.f21183b, 0.0f);
            if (this.f21189h) {
                try {
                    a(canvas, path);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f21187f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f21187f);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f21185d + f3 + this.f21186e);
            path2.lineTo(0.0f, this.f21184c);
            path2.lineTo(this.f21183b, this.f21184c);
            path2.lineTo(this.f21183b, (f3 - this.f21185d) + this.f21186e);
            if (this.f21189h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f21188g;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            try {
                a(canvas, path2, this.f21188g);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        float f9 = this.f21183b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f21184c);
        path3.lineTo((f9 - this.f21185d) - this.f21186e, this.f21184c);
        path3.lineTo((this.f21185d + f9) - this.f21186e, 0.0f);
        if (this.f21189h) {
            try {
                a(canvas, path3);
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f21187f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f21187f);
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f21185d + f9 + this.f21186e, 0.0f);
        path4.lineTo(this.f21183b, 0.0f);
        path4.lineTo(this.f21183b, this.f21184c);
        path4.lineTo((f9 - this.f21185d) + this.f21186e, this.f21184c);
        if (this.f21189h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e15) {
                e15.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f21188g;
        if (bitmap4 == null || bitmap4.isRecycled()) {
            return;
        }
        try {
            a(canvas, path4, this.f21188g);
        } catch (Exception e16) {
            e16.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0136a c0136a) {
        super(c0136a.f21190a);
        this.f21189h = false;
        this.f21187f = c0136a.f21191b;
        this.f21188g = c0136a.f21192c;
        this.f21189h = c0136a.f21193d;
        this.f21182a = c0136a.f21194e;
        this.f21185d = c0136a.f21195f;
        this.f21186e = c0136a.f21196g;
        this.f21183b = c0136a.f21197h;
        this.f21184c = c0136a.i;
        Paint paint = new Paint();
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.i.setAntiAlias(true);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.i.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawPath(path, this.i);
    }

    private void a(Canvas canvas, Path path) {
        this.i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.i);
    }

    public static C0136a a() {
        return new C0136a((byte) 0);
    }
}
