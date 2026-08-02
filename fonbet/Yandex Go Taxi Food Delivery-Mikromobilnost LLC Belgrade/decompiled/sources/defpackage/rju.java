package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position;

/* loaded from: classes5.dex */
public final class rju implements qm6 {
    public final boolean A;
    public kdc C;
    public Drawable D;
    public Drawable E;
    public final Context a;
    public int b;
    public int c;
    public float w;
    public float x;
    public BubbleComponent z;
    public Rect y = new Rect(0, 0, 0, 0);
    public HintBubbleDecorator$Position B = HintBubbleDecorator$Position.CENTER;
    public HintBubbleDecorator$Direction F = HintBubbleDecorator$Direction.DOWN;

    public rju(Context context) {
        this.a = context;
        this.A = xw31.n(context);
        this.D = vng.t(dzg0.bubble_hint_pointer_center_bottom, context);
        this.E = vng.t(dzg0.bubble_hint_frame, context);
        h(tje.r(mrg0.go_design_m_space, context), tje.r(mrg0.go_design_m_space, context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r13 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        if (r13 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        if (r13 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    @Override // defpackage.qm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        int i6;
        int i7;
        float f3;
        Rect rect = this.y;
        int i8 = ((i3 - i) - rect.left) - rect.right;
        int i9 = ((i4 - i2) - rect.top) - rect.bottom;
        canvas.save();
        canvas.translate(i, i2);
        canvas.save();
        Rect rect2 = this.y;
        canvas.translate(rect2.left, rect2.top);
        this.E.setBounds(0, 0, i8, i9);
        this.E.draw(canvas);
        canvas.restore();
        HintBubbleDecorator$Direction hintBubbleDecorator$Direction = this.F;
        hintBubbleDecorator$Direction.getClass();
        if (hintBubbleDecorator$Direction != HintBubbleDecorator$Direction.NONE) {
            HintBubbleDecorator$Direction hintBubbleDecorator$Direction2 = this.F;
            int[] iArr = qju.a;
            int i10 = iArr[hintBubbleDecorator$Direction2.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    f = 180.0f;
                    canvas.translate(-this.w, -this.x);
                    i5 = iArr[this.F.ordinal()];
                    if (i5 != 1 || i5 == 2) {
                        float f4 = this.w;
                        f2 = f4 + 0.0f;
                        float f5 = i8;
                        float f6 = (f5 - f4) - 0.0f;
                        i6 = qju.b[this.B.ordinal()];
                        if (i6 == 1) {
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
                            f2 = (f5 / 2.0f) + 0.0f;
                        }
                    } else {
                        if (i5 != 3) {
                            w511.b();
                            return;
                        }
                        f2 = 0.0f;
                    }
                    i7 = iArr[this.F.ordinal()];
                    if (i7 != 1) {
                        f3 = i9 - 3.0f;
                    } else {
                        if (i7 != 2 && i7 != 3) {
                            w511.b();
                            return;
                        }
                        f3 = 0.0f;
                    }
                    canvas.translate(f2, f3);
                    if (this.B == HintBubbleDecorator$Position.TOP_LEFT) {
                        canvas.translate(0.0f, -(i9 - 9.0f));
                    }
                    if (this.B == HintBubbleDecorator$Position.CENTER) {
                        canvas.translate(0.0f, this.x + 3.0f);
                    }
                    canvas.rotate(f, this.w, this.x);
                    this.D.setBounds(0, 0, this.c, this.b);
                    this.D.draw(canvas);
                } else if (i10 != 3) {
                    w511.b();
                    return;
                }
            }
            f = 0.0f;
            canvas.translate(-this.w, -this.x);
            i5 = iArr[this.F.ordinal()];
            if (i5 != 1) {
            }
            float f42 = this.w;
            f2 = f42 + 0.0f;
            float f52 = i8;
            float f62 = (f52 - f42) - 0.0f;
            i6 = qju.b[this.B.ordinal()];
            if (i6 == 1) {
            }
            i7 = iArr[this.F.ordinal()];
            if (i7 != 1) {
            }
            canvas.translate(f2, f3);
            if (this.B == HintBubbleDecorator$Position.TOP_LEFT) {
            }
            if (this.B == HintBubbleDecorator$Position.CENTER) {
            }
            canvas.rotate(f, this.w, this.x);
            this.D.setBounds(0, 0, this.c, this.b);
            this.D.draw(canvas);
        }
        canvas.restore();
    }

    @Override // defpackage.qm6
    public final void applyTheme() {
        f();
    }

    @Override // defpackage.qm6
    public final void b(kdc kdcVar) {
        this.C = kdcVar;
        f();
    }

    @Override // defpackage.qm6
    public final Rect c() {
        return this.y;
    }

    @Override // defpackage.qm6
    public final void d(BubbleComponent bubbleComponent) {
        this.z = bubbleComponent;
    }

    @Override // defpackage.qm6
    public final void detach() {
        this.z = null;
    }

    @Override // defpackage.qm6
    public final kdc e() {
        return this.C;
    }

    public final void f() {
        kdc kdcVar = this.C;
        Integer valueOf = kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, this.a)) : null;
        Drawable drawable = this.D;
        if (valueOf != null) {
            drawable.setTint(valueOf.intValue());
            this.E.setTint(valueOf.intValue());
        } else {
            drawable.setTintList(null);
            this.E.setTintList(null);
        }
        BubbleComponent bubbleComponent = this.z;
        if (bubbleComponent != null) {
            bubbleComponent.invalidate();
        }
    }

    public final void g(HintBubbleDecorator$Position hintBubbleDecorator$Position) {
        Drawable t;
        this.B = hintBubbleDecorator$Position;
        int i = qju.b[hintBubbleDecorator$Position.ordinal()];
        Context context = this.a;
        if (i != 1) {
            boolean z = this.A;
            if (i == 2) {
                h(tje.r(mrg0.go_design_m_space, context), context.getResources().getDimensionPixelSize(mrg0.go_design_m_space));
                t = z ? vng.t(dzg0.bubble_hint_pointer_right_bottom, context) : vng.t(dzg0.bubble_hint_pointer_left_bottom, context);
            } else if (i == 3) {
                h(tje.r(mrg0.go_design_m_space, context), context.getResources().getDimensionPixelSize(mrg0.go_design_m_space));
                t = z ? vng.t(dzg0.bubble_hint_pointer_left_bottom, context) : vng.t(dzg0.bubble_hint_pointer_right_bottom, context);
            } else if (i != 4) {
                w511.b();
                return;
            } else {
                h(tje.r(mrg0.go_design_m_space, context), context.getResources().getDimensionPixelSize(mrg0.go_design_m_space));
                t = z ? vng.t(dzg0.bubble_hint_pointer_right_top, context) : vng.t(dzg0.bubble_hint_pointer_left_top, context);
            }
        } else {
            h(tje.u(24, context), tje.u(24, context));
            t = vng.t(dzg0.bubble_hint_pointer_center_bottom, context);
        }
        this.D = t.mutate();
        f();
        f();
        f();
    }

    public final void h(int i, int i2) {
        this.c = i;
        this.b = i2;
        this.w = i / 2.0f;
        this.x = i2 / 2.0f;
        i();
    }

    public final void i() {
        int i;
        int i2;
        int i3 = qju.a[this.F.ordinal()];
        if (i3 == 1) {
            i = this.b;
            i2 = 0;
        } else if (i3 == 2) {
            i2 = this.b;
            i = 0;
        } else if (i3 != 3) {
            w511.b();
            return;
        } else {
            i2 = 0;
            i = 0;
        }
        this.y = new Rect(0, i2, 0, i);
        BubbleComponent bubbleComponent = this.z;
        if (bubbleComponent != null) {
            bubbleComponent.requestLayout();
        }
    }
}
