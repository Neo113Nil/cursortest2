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
    private int f21969a;

    /* renamed from: b, reason: collision with root package name */
    private float f21970b;

    /* renamed from: c, reason: collision with root package name */
    private float f21971c;

    /* renamed from: d, reason: collision with root package name */
    private int f21972d;

    /* renamed from: e, reason: collision with root package name */
    private int f21973e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f21974f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f21975g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21976h;
    private Paint i;

    /* renamed from: com.anythink.expressad.video.dynview.g.a$a, reason: collision with other inner class name */
    public static class C0136a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f21977a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f21978b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f21979c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f21980d;

        /* renamed from: e, reason: collision with root package name */
        private int f21981e;

        /* renamed from: f, reason: collision with root package name */
        private int f21982f;

        /* renamed from: g, reason: collision with root package name */
        private int f21983g;

        /* renamed from: h, reason: collision with root package name */
        private float f21984h;
        private float i;

        public /* synthetic */ C0136a(byte b9) {
            this();
        }

        private C0136a() {
            this.f21982f = 100;
            this.f21983g = 10;
            this.f21977a = new RectShape();
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f21978b = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f21979c = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b c(int i) {
            this.f21983g = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a() {
            this.f21980d = true;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(float f2) {
            this.i = f2;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(int i) {
            this.f21981e = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(int i) {
            this.f21982f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(float f2) {
            this.f21984h = f2;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final a b() {
            return new a(this, (byte) 0);
        }
    }

    public interface b {
        b a();

        b a(float f2);

        b a(int i);

        b a(Bitmap bitmap);

        b b(float f2);

        b b(int i);

        b b(Bitmap bitmap);

        a b();

        b c(int i);
    }

    public /* synthetic */ a(C0136a c0136a, byte b9) {
        this(c0136a);
    }

    private void a(Canvas canvas) {
        float f2 = this.f21971c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f21972d + f2) - this.f21973e);
        path.lineTo(this.f21970b, (f2 - this.f21972d) - this.f21973e);
        path.lineTo(this.f21970b, 0.0f);
        if (this.f21976h) {
            try {
                a(canvas, path);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f21974f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f21974f);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f21972d + f2 + this.f21973e);
        path2.lineTo(0.0f, this.f21971c);
        path2.lineTo(this.f21970b, this.f21971c);
        path2.lineTo(this.f21970b, (f2 - this.f21972d) + this.f21973e);
        if (this.f21976h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f21975g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f21975g);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f2 = this.f21970b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f21971c);
        path.lineTo((f2 - this.f21972d) - this.f21973e, this.f21971c);
        path.lineTo((this.f21972d + f2) - this.f21973e, 0.0f);
        if (this.f21976h) {
            try {
                a(canvas, path);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f21974f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f21974f);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f21972d + f2 + this.f21973e, 0.0f);
        path2.lineTo(this.f21970b, 0.0f);
        path2.lineTo(this.f21970b, this.f21971c);
        path2.lineTo((f2 - this.f21972d) + this.f21973e, this.f21971c);
        if (this.f21976h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f21975g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f21975g);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f21969a == 1) {
            float f2 = this.f21971c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f21972d + f2) - this.f21973e);
            path.lineTo(this.f21970b, (f2 - this.f21972d) - this.f21973e);
            path.lineTo(this.f21970b, 0.0f);
            if (this.f21976h) {
                try {
                    a(canvas, path);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f21974f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f21974f);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f21972d + f2 + this.f21973e);
            path2.lineTo(0.0f, this.f21971c);
            path2.lineTo(this.f21970b, this.f21971c);
            path2.lineTo(this.f21970b, (f2 - this.f21972d) + this.f21973e);
            if (this.f21976h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f21975g;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            try {
                a(canvas, path2, this.f21975g);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        float f9 = this.f21970b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f21971c);
        path3.lineTo((f9 - this.f21972d) - this.f21973e, this.f21971c);
        path3.lineTo((this.f21972d + f9) - this.f21973e, 0.0f);
        if (this.f21976h) {
            try {
                a(canvas, path3);
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f21974f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f21974f);
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f21972d + f9 + this.f21973e, 0.0f);
        path4.lineTo(this.f21970b, 0.0f);
        path4.lineTo(this.f21970b, this.f21971c);
        path4.lineTo((f9 - this.f21972d) + this.f21973e, this.f21971c);
        if (this.f21976h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e15) {
                e15.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f21975g;
        if (bitmap4 == null || bitmap4.isRecycled()) {
            return;
        }
        try {
            a(canvas, path4, this.f21975g);
        } catch (Exception e16) {
            e16.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0136a c0136a) {
        super(c0136a.f21977a);
        this.f21976h = false;
        this.f21974f = c0136a.f21978b;
        this.f21975g = c0136a.f21979c;
        this.f21976h = c0136a.f21980d;
        this.f21969a = c0136a.f21981e;
        this.f21972d = c0136a.f21982f;
        this.f21973e = c0136a.f21983g;
        this.f21970b = c0136a.f21984h;
        this.f21971c = c0136a.i;
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
