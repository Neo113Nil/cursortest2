package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;

/* loaded from: classes5.dex */
public final class wza extends g7h {
    public final Rect H;

    public wza(Context context) {
        super(context);
        this.H = new Rect();
        s(this.C);
    }

    @Override // defpackage.g7h
    public final void f(Integer num) {
        Drawable drawable = this.F;
        if (drawable instanceof LayerDrawable) {
            g7h.g(((LayerDrawable) drawable).getDrawable(1), num);
        } else {
            g7h.g(drawable, num);
        }
        g7h.g(this.E, num);
    }

    @Override // defpackage.g7h
    public final void i(Canvas canvas, int i, int i2) {
        canvas.save();
        Rect rect = this.y;
        canvas.translate(rect.left, rect.top);
        Drawable drawable = this.F;
        Rect rect2 = this.H;
        drawable.setBounds(-rect2.left, -rect2.top, i + rect2.right, i2 + rect2.bottom);
        this.F.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
    
        if (r14 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0075, code lost:
    
        if (r14 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    @Override // defpackage.g7h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Canvas canvas, int i, int i2) {
        float f;
        float f2;
        int i3;
        float f3;
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction = this.G;
        defaultBubbleDecorator$Direction.getClass();
        if (defaultBubbleDecorator$Direction == DefaultBubbleDecorator$Direction.NONE) {
            return;
        }
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction2 = this.G;
        int[] iArr = vza.a;
        int i4 = iArr[defaultBubbleDecorator$Direction2.ordinal()];
        if (i4 == 1) {
            f = 180.0f;
        } else {
            if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5) {
                w511.b();
                return;
            }
            f = 0.0f;
        }
        canvas.translate(-this.w, -this.x);
        int i5 = iArr[this.G.ordinal()];
        if (i5 == 1 || i5 == 2) {
            float f4 = this.w;
            float f5 = this.B;
            f2 = f4 + f5;
            float f6 = i;
            float f7 = (f6 - f4) - f5;
            int i6 = vza.b[this.C.ordinal()];
            if (i6 != 1) {
                boolean z = this.A;
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            w511.b();
                            return;
                        }
                    }
                }
            } else {
                f2 = (f6 / 2.0f) + this.B;
            }
            i3 = iArr[this.G.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    f3 = i2 - 3.0f;
                    canvas.translate(f2, f3);
                    if (this.C == DefaultBubbleDecorator$Position.CENTER) {
                        canvas.translate(0.0f, this.x + 3.0f);
                    }
                    canvas.rotate(f, this.w, this.x);
                    this.E.setBounds(0, 0, this.c, this.b);
                    this.E.draw(canvas);
                }
                if (i3 != 3 && i3 != 4 && i3 != 5) {
                    w511.b();
                    return;
                }
            }
            f3 = 0.0f;
            canvas.translate(f2, f3);
            if (this.C == DefaultBubbleDecorator$Position.CENTER) {
            }
            canvas.rotate(f, this.w, this.x);
            this.E.setBounds(0, 0, this.c, this.b);
            this.E.draw(canvas);
        }
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            w511.b();
            return;
        }
        f2 = 0.0f;
        i3 = iArr[this.G.ordinal()];
        if (i3 != 1) {
        }
        f3 = 0.0f;
        canvas.translate(f2, f3);
        if (this.C == DefaultBubbleDecorator$Position.CENTER) {
        }
        canvas.rotate(f, this.w, this.x);
        this.E.setBounds(0, 0, this.c, this.b);
        this.E.draw(canvas);
    }

    @Override // defpackage.g7h
    public final Drawable k() {
        return this.F;
    }

    @Override // defpackage.g7h
    public final void n(Drawable drawable) {
        super.n(drawable);
        this.F.getPadding(this.H);
    }

    @Override // defpackage.g7h
    public final void p(DefaultBubbleDecorator$Position defaultBubbleDecorator$Position, float f) {
        if (this.C == defaultBubbleDecorator$Position && this.B == f) {
            return;
        }
        s(defaultBubbleDecorator$Position);
        super.p(defaultBubbleDecorator$Position, f);
    }

    public final void s(DefaultBubbleDecorator$Position defaultBubbleDecorator$Position) {
        Drawable t;
        int i = vza.b[defaultBubbleDecorator$Position.ordinal()];
        Context context = this.a;
        if (i != 1) {
            boolean z = this.A;
            if (i == 2) {
                q(tje.r(mrg0.go_design_m_space, context), tje.r(mrg0.go_design_m_space, context));
                t = vng.t(z ? dzg0.bubble_hint_pointer_right_bottom : dzg0.bubble_hint_pointer_left_bottom, context);
            } else if (i == 3) {
                q(tje.r(mrg0.go_design_m_space, context), tje.r(mrg0.go_design_m_space, context));
                t = vng.t(z ? dzg0.bubble_hint_pointer_left_bottom : dzg0.bubble_hint_pointer_right_bottom, context);
            } else {
                if (i != 4) {
                    w511.b();
                    return;
                }
                t = null;
            }
        } else {
            q(tje.r(mrg0.go_design_l_space, context), tje.r(mrg0.go_design_l_space, context));
            t = vng.t(dzg0.bubble_hint_pointer_center_bottom, context);
        }
        if (t != null) {
            this.E = t.mutate();
            m();
        }
    }
}
