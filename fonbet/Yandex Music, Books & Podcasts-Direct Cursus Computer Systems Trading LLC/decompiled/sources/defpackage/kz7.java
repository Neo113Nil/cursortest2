package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class kz7 extends zpa {
    public static final jz7 y = new jz7(0);
    public final m6g n;
    public final z8r o;
    public final y8r p;
    public final gqa q;
    public float r;
    public boolean s;
    public final ValueAnimator t;
    public ValueAnimator u;
    public TimeInterpolator v;
    public TimeInterpolator w;
    public TimeInterpolator x;

    public kz7(Context context, h7g h7gVar, m6g m6gVar) {
        super(context, h7gVar);
        this.s = false;
        this.n = m6gVar;
        gqa gqaVar = new gqa();
        this.q = gqaVar;
        gqaVar.g = true;
        z8r z8rVar = new z8r();
        this.o = z8rVar;
        z8rVar.a(1.0f);
        z8rVar.b(50.0f);
        y8r y8rVar = new y8r(this, y);
        this.p = y8rVar;
        y8rVar.m = z8rVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.t = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new up0(1, this, h7gVar));
        if (h7gVar.c(true) && h7gVar.m != 0) {
            valueAnimator.start();
        }
        if (this.i != 1.0f) {
            this.i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.l)) {
            canvas.save();
            Rect bounds = getBounds();
            float b = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            this.n.c(canvas, bounds, b, z, objectAnimator2 != null && objectAnimator2.isRunning());
            float c = c();
            gqa gqaVar = this.q;
            gqaVar.f = c;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.j;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            h7g h7gVar = this.b;
            gqaVar.c = h7gVar.e[0];
            int i = h7gVar.i;
            m6g m6gVar = this.n;
            if (i > 0) {
                if (m6gVar == null) {
                    i = (int) ((hyf.x(gqaVar.b, 0.0f, 0.01f) * i) / 0.01f);
                }
                this.n.g(canvas, paint, gqaVar.b, 1.0f, h7gVar.f, this.k, i);
            } else {
                m6gVar.g(canvas, paint, 0.0f, 1.0f, h7gVar.f, this.k, 0);
            }
            int i2 = this.k;
            m6g m6gVar2 = this.n;
            m6gVar2.getClass();
            int E = qgg.E(gqaVar.c, i2);
            m6gVar2.m = gqaVar.g;
            float f = gqaVar.a;
            float f2 = gqaVar.b;
            int i3 = gqaVar.d;
            m6gVar2.e(canvas, paint, f, f2, E, i3, i3, gqaVar.e, gqaVar.f, true);
            int i4 = h7gVar.e[0];
            int i5 = this.k;
            m6g m6gVar3 = this.n;
            m6gVar3.getClass();
            int E2 = qgg.E(i4, i5);
            m6gVar3.m = false;
            h7g h7gVar2 = m6gVar3.a;
            if (h7gVar2.r > 0 && E2 != 0) {
                paint.setStyle(style);
                paint.setColor(E2);
                Integer num = h7gVar2.s;
                hqa hqaVar = new hqa(new float[]{(m6gVar3.f / 2.0f) - (num != null ? (h7gVar2.r / 2.0f) + num.floatValue() : m6gVar3.g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
                float f3 = h7gVar2.r;
                m6gVar3.f(canvas, paint, hqaVar, f3, f3, (m6gVar3.h * f3) / m6gVar3.g, null, 0.0f, 0.0f, 0.0f, false);
            }
            canvas.restore();
        }
    }

    @Override // defpackage.zpa
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        hn0 hn0Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        hn0Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.s = true;
            return e;
        }
        this.s = false;
        this.o.b(50.0f / f);
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.n.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.p.d();
        this.q.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        float f2 = (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
        boolean z = this.s;
        gqa gqaVar = this.q;
        y8r y8rVar = this.p;
        if (z) {
            y8rVar.d();
            gqaVar.b = f / 10000.0f;
            invalidateSelf();
            gqaVar.e = f2;
            invalidateSelf();
        } else {
            y8rVar.b = gqaVar.b * 10000.0f;
            y8rVar.c = true;
            y8rVar.a(f);
        }
        return true;
    }
}
