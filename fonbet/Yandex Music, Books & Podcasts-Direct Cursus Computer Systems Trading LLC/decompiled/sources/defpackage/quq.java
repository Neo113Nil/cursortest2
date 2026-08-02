package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class quq extends View {
    public static final /* synthetic */ int I = 0;
    public final hjp A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public float F;
    public Integer G;
    public int H;
    public final c9n a;
    public final ckj b;
    public ValueAnimator c;
    public float d;
    public ValueAnimator e;
    public Float f;
    public final q2e g;
    public final q2e h;
    public final ArrayList i;
    public long j;
    public final AccelerateDecelerateInterpolator k;
    public boolean l;
    public float m;
    public float n;
    public Drawable o;
    public Drawable p;
    public Drawable q;
    public Drawable r;
    public float s;
    public Drawable t;
    public jas u;
    public Float v;
    public final qtq w;
    public Drawable x;
    public jas y;
    public int z;

    public quq(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new c9n(12, (byte) 0);
        this.b = new ckj();
        this.g = new q2e(new puq(this, 0));
        this.h = new q2e(new puq(this, 1));
        this.i = new ArrayList();
        this.j = 300L;
        this.k = new AccelerateDecelerateInterpolator();
        this.l = true;
        this.n = 100.0f;
        this.s = this.m;
        this.w = new qtq(this);
        this.z = -1;
        this.A = new hjp(2, this);
        this.H = 1;
        this.B = true;
        this.C = 45.0f;
        this.D = (float) Math.tan(45.0f);
    }

    private final int getMaxTickmarkOrThumbWidth() {
        if (this.z == -1) {
            this.z = Math.max(Math.max(hdg.V(this.o), hdg.V(this.p)), Math.max(hdg.V(this.t), hdg.V(this.x)));
        }
        return this.z;
    }

    public static void n(ouq ouqVar, quq quqVar, Canvas canvas, Drawable drawable, int i, int i2, int i3) {
        if ((i3 & 16) != 0) {
            i = ouqVar.g;
        }
        if ((i3 & 32) != 0) {
            i2 = ouqVar.h;
        }
        c9n c9nVar = quqVar.a;
        if (drawable == null) {
            c9nVar.getClass();
            return;
        }
        drawable.setBounds(i, (c9nVar.c / 2) - (drawable.getIntrinsicHeight() / 2), i2, (drawable.getIntrinsicHeight() / 2) + (c9nVar.c / 2));
        drawable.draw(canvas);
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.j);
        valueAnimator.setInterpolator(this.k);
    }

    public final int b(int i) {
        if (!j()) {
            return 1;
        }
        int abs = Math.abs(i - r(getWidth(), this.s));
        Float f = this.v;
        f.getClass();
        return abs < Math.abs(i - r(getWidth(), f.floatValue())) ? 1 : 2;
    }

    public final float c(int i) {
        return (this.p == null && this.o == null) ? s(i) : eeh.b(s(i));
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.w.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.w.n(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final float f(float f) {
        return Math.min(Math.max(f, this.m), this.n);
    }

    public final Drawable getActiveTickMarkDrawable() {
        return this.o;
    }

    public final Drawable getActiveTrackDrawable() {
        return this.q;
    }

    public final long getAnimationDuration() {
        return this.j;
    }

    public final boolean getAnimationEnabled() {
        return this.l;
    }

    public final Drawable getInactiveTickMarkDrawable() {
        return this.p;
    }

    public final Drawable getInactiveTrackDrawable() {
        return this.r;
    }

    public final boolean getInteractive() {
        return this.B;
    }

    public final float getInterceptionAngle() {
        return this.C;
    }

    public final float getMaxValue() {
        return this.n;
    }

    public final float getMinValue() {
        return this.m;
    }

    @NotNull
    public final List<ouq> getRanges() {
        return this.i;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Integer num;
        int max = Math.max(hdg.U(this.q), hdg.U(this.r));
        Iterator it = this.i.iterator();
        if (it.hasNext()) {
            ouq ouqVar = (ouq) it.next();
            Integer valueOf = Integer.valueOf(Math.max(hdg.U(ouqVar.e), hdg.U(ouqVar.f)));
            while (it.hasNext()) {
                ouq ouqVar2 = (ouq) it.next();
                Integer valueOf2 = Integer.valueOf(Math.max(hdg.U(ouqVar2.e), hdg.U(ouqVar2.f)));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        return Math.max(Math.max(hdg.U(this.t), hdg.U(this.x)), Math.max(max, num != null ? num.intValue() : 0));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int max = Math.max(Math.max(hdg.V(this.t), hdg.V(this.x)), Math.max(hdg.V(this.q), hdg.V(this.r)) * ((int) ((this.n - this.m) + 1)));
        jas jasVar = this.u;
        int intrinsicWidth = jasVar != null ? jasVar.getIntrinsicWidth() : 0;
        jas jasVar2 = this.y;
        return Math.max(max, Math.max(intrinsicWidth, jasVar2 != null ? jasVar2.getIntrinsicWidth() : 0));
    }

    public final Drawable getThumbDrawable() {
        return this.t;
    }

    public final jas getThumbSecondTextDrawable() {
        return this.y;
    }

    public final Drawable getThumbSecondaryDrawable() {
        return this.x;
    }

    public final Float getThumbSecondaryValue() {
        return this.v;
    }

    public final jas getThumbTextDrawable() {
        return this.u;
    }

    public final float getThumbValue() {
        return this.s;
    }

    public final boolean j() {
        return this.v != null;
    }

    public final void o() {
        u(f(this.s), false, true);
        if (j()) {
            Float f = this.v;
            t(f != null ? Float.valueOf(f(f.floatValue())) : null, false, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cf A[LOOP:2: B:85:0x01b6->B:91:0x01cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d2 A[EDGE_INSN: B:92:0x01d2->B:77:0x01d2 BREAK  A[LOOP:2: B:85:0x01b6->B:91:0x01cf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float min;
        quq quqVar;
        float f2;
        float max;
        Drawable drawable;
        Iterator it;
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft() + (getMaxTickmarkOrThumbWidth() / 2), getPaddingTop());
        int save = canvas.save();
        ArrayList arrayList = this.i;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ouq ouqVar = (ouq) it2.next();
            canvas.clipRect(ouqVar.g - ouqVar.c, 0.0f, ouqVar.h + ouqVar.d, getHeight(), Region.Op.DIFFERENCE);
        }
        Drawable drawable2 = this.r;
        c9n c9nVar = this.a;
        if (drawable2 == null) {
            c9nVar.getClass();
        } else {
            drawable2.setBounds(0, (c9nVar.c / 2) - (drawable2.getIntrinsicHeight() / 2), c9nVar.b, (drawable2.getIntrinsicHeight() / 2) + (c9nVar.c / 2));
            drawable2.draw(canvas);
        }
        hjp hjpVar = this.A;
        quq quqVar2 = (quq) hjpVar.b;
        if (quqVar2.j()) {
            float thumbValue = quqVar2.getThumbValue();
            Float thumbSecondaryValue = quqVar2.getThumbSecondaryValue();
            if (thumbSecondaryValue == null) {
                f = thumbValue;
                quqVar = (quq) hjpVar.b;
                if (quqVar.j()) {
                    max = quqVar.getThumbValue();
                } else {
                    float thumbValue2 = quqVar.getThumbValue();
                    Float thumbSecondaryValue2 = quqVar.getThumbSecondaryValue();
                    if (thumbSecondaryValue2 == null) {
                        f2 = thumbValue2;
                        int r = r(getWidth(), f);
                        int r2 = r(getWidth(), f2);
                        drawable = this.q;
                        int i4 = r > r2 ? r2 : r;
                        int i5 = r2 < r ? r : r2;
                        if (drawable == null) {
                            c9nVar.getClass();
                        } else {
                            drawable.setBounds(i4, (c9nVar.c / 2) - (drawable.getIntrinsicHeight() / 2), i5, (drawable.getIntrinsicHeight() / 2) + (c9nVar.c / 2));
                            drawable.draw(canvas);
                        }
                        canvas.restoreToCount(save);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            ouq ouqVar2 = (ouq) it.next();
                            int i6 = ouqVar2.h;
                            if (i6 < r || (i3 = ouqVar2.g) > r2) {
                                n(ouqVar2, this, canvas, ouqVar2.f, 0, 0, 48);
                            } else if (i3 >= r && i6 <= r2) {
                                n(ouqVar2, this, canvas, ouqVar2.e, 0, 0, 48);
                            } else if (i3 < r && i6 <= r2) {
                                int i7 = r - 1;
                                n(ouqVar2, this, canvas, ouqVar2.f, 0, i7 < i3 ? i3 : i7, 16);
                                n(ouqVar2, this, canvas, ouqVar2.e, r, 0, 32);
                            } else if (i3 < r || i6 <= r2) {
                                n(ouqVar2, this, canvas, ouqVar2.f, 0, 0, 48);
                                Drawable drawable3 = ouqVar2.e;
                                if (drawable3 != null) {
                                    drawable3.setBounds(r, (c9nVar.c / 2) - (drawable3.getIntrinsicHeight() / 2), r2, (drawable3.getIntrinsicHeight() / 2) + (c9nVar.c / 2));
                                    drawable3.draw(canvas);
                                }
                            } else {
                                n(ouqVar2, this, canvas, ouqVar2.e, 0, r2, 16);
                                Drawable drawable4 = ouqVar2.f;
                                int i8 = r2 + 1;
                                int i9 = ouqVar2.h;
                                n(ouqVar2, this, canvas, drawable4, i8 > i9 ? i9 : i8, 0, 32);
                            }
                        }
                        if ((this.o == null || this.p != null) && (i = (int) this.m) <= (i2 = (int) this.n)) {
                            while (true) {
                                c9nVar.a(canvas, (i <= ((int) f2) || ((int) f) > i) ? this.p : this.o, r(getWidth(), i));
                                if (i == i2) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        this.a.b(canvas, r(getWidth(), this.s), this.t, (int) this.s, this.u);
                        if (j()) {
                            Float f3 = this.v;
                            f3.getClass();
                            int r3 = r(getWidth(), f3.floatValue());
                            Drawable drawable5 = this.x;
                            Float f4 = this.v;
                            f4.getClass();
                            this.a.b(canvas, r3, drawable5, (int) f4.floatValue(), this.y);
                        }
                        canvas.restore();
                    }
                    max = Math.max(thumbValue2, thumbSecondaryValue2.floatValue());
                }
                f2 = max;
                int r4 = r(getWidth(), f);
                int r22 = r(getWidth(), f2);
                drawable = this.q;
                if (r4 > r22) {
                }
                if (r22 < r4) {
                }
                if (drawable == null) {
                }
                canvas.restoreToCount(save);
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                if (this.o == null) {
                }
                while (true) {
                    c9nVar.a(canvas, (i <= ((int) f2) || ((int) f) > i) ? this.p : this.o, r(getWidth(), i));
                    if (i == i2) {
                    }
                    i++;
                }
                this.a.b(canvas, r(getWidth(), this.s), this.t, (int) this.s, this.u);
                if (j()) {
                }
                canvas.restore();
            }
            min = Math.min(thumbValue, thumbSecondaryValue.floatValue());
        } else {
            min = quqVar2.getMinValue();
        }
        f = min;
        quqVar = (quq) hjpVar.b;
        if (quqVar.j()) {
        }
        f2 = max;
        int r42 = r(getWidth(), f);
        int r222 = r(getWidth(), f2);
        drawable = this.q;
        if (r42 > r222) {
        }
        if (r222 < r42) {
        }
        if (drawable == null) {
        }
        canvas.restoreToCount(save);
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        if (this.o == null) {
        }
        while (true) {
            c9nVar.a(canvas, (i <= ((int) f2) || ((int) f) > i) ? this.p : this.o, r(getWidth(), i));
            if (i == i2) {
            }
            i++;
        }
        this.a.b(canvas, r(getWidth(), this.s), this.t, (int) this.s, this.u);
        if (j()) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.w.t(z, i, rect);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        } else if (mode == 1073741824) {
            paddingRight = size;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        } else if (mode2 == 1073741824) {
            paddingBottom = size2;
        }
        setMeasuredDimension(paddingRight, paddingBottom);
        int paddingLeft = ((paddingRight - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
        int paddingTop = (paddingBottom - getPaddingTop()) - getPaddingBottom();
        c9n c9nVar = this.a;
        c9nVar.b = paddingLeft;
        c9nVar.c = paddingTop;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ouq ouqVar = (ouq) it.next();
            ouqVar.g = r(paddingRight, Math.max(ouqVar.a, this.m)) + ouqVar.c;
            ouqVar.h = r(paddingRight, Math.min(ouqVar.b, this.n)) - ouqVar.d;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int scaledTouchSlop;
        if (this.B) {
            int x = (((int) motionEvent.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
            int action = motionEvent.getAction();
            if (action == 0) {
                int b = b(x);
                this.H = b;
                q(b, c(x), this.l, false);
                this.E = motionEvent.getX();
                this.F = motionEvent.getY();
                return true;
            }
            if (action == 1) {
                q(this.H, c(x), this.l, false);
                return true;
            }
            if (action == 2) {
                q(this.H, c(x), false, true);
                Integer num = this.G;
                if (num != null) {
                    scaledTouchSlop = num.intValue();
                } else {
                    scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    this.G = Integer.valueOf(scaledTouchSlop);
                }
                float abs = Math.abs(motionEvent.getY() - this.F);
                if (abs < scaledTouchSlop) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(abs / Math.abs(motionEvent.getX() - this.E) <= this.D);
                }
                this.E = motionEvent.getX();
                this.F = motionEvent.getY();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        u(eeh.b(this.s), false, true);
        if (this.v != null) {
            t(Float.valueOf(eeh.b(r0.floatValue())), false, true);
        }
    }

    public final void q(int i, float f, boolean z, boolean z2) {
        int D = ouj.D(i);
        if (D == 0) {
            u(f, z, z2);
        } else if (D == 1) {
            t(Float.valueOf(f), z, z2);
        } else {
            b6e.s();
        }
    }

    public final int r(int i, float f) {
        return eeh.b(((((i - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth()) / (this.n - this.m)) * (wyf.N(this) ? this.n - f : f - this.m));
    }

    public final float s(int i) {
        float f = this.m;
        float width = ((this.n - f) * i) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth());
        if (wyf.N(this)) {
            width = (this.n - width) - 1;
        }
        return f + width;
    }

    public final void setActiveTickMarkDrawable(Drawable drawable) {
        this.o = drawable;
        this.z = -1;
        p();
        invalidate();
    }

    public final void setActiveTrackDrawable(Drawable drawable) {
        this.q = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j) {
        if (this.j == j || j < 0) {
            return;
        }
        this.j = j;
    }

    public final void setAnimationEnabled(boolean z) {
        this.l = z;
    }

    public final void setInactiveTickMarkDrawable(Drawable drawable) {
        this.p = drawable;
        this.z = -1;
        p();
        invalidate();
    }

    public final void setInactiveTrackDrawable(Drawable drawable) {
        this.r = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z) {
        this.B = z;
    }

    public final void setInterceptionAngle(float f) {
        float max = Math.max(45.0f, Math.abs(f) % 90);
        this.C = max;
        this.D = (float) Math.tan(max);
    }

    public final void setMaxValue(float f) {
        if (this.n == f) {
            return;
        }
        setMinValue(Math.min(this.m, f - 1.0f));
        this.n = f;
        o();
        invalidate();
    }

    public final void setMinValue(float f) {
        if (this.m == f) {
            return;
        }
        setMaxValue(Math.max(this.n, 1.0f + f));
        this.m = f;
        o();
        invalidate();
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.t = drawable;
        this.z = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(jas jasVar) {
        this.y = jasVar;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(Drawable drawable) {
        this.x = drawable;
        this.z = -1;
        invalidate();
    }

    public final void setThumbTextDrawable(jas jasVar) {
        this.u = jasVar;
        invalidate();
    }

    public final void t(Float f, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        Float f2;
        Float valueOf = f != null ? Float.valueOf(f(f.floatValue())) : null;
        if (Intrinsics.c(this.v, valueOf)) {
            return;
        }
        if (!z || !this.l || (f2 = this.v) == null || valueOf == null) {
            if (z2 && (valueAnimator = this.e) != null) {
                valueAnimator.cancel();
            }
            if (z2 || this.e == null) {
                Float f3 = this.v;
                this.f = f3;
                this.v = valueOf;
                if (!Intrinsics.c(f3, valueOf)) {
                    ckj ckjVar = this.b;
                    ckjVar.getClass();
                    akj akjVar = new akj(ckjVar);
                    while (akjVar.hasNext()) {
                        ((nuq) akjVar.next()).a(valueOf);
                    }
                }
            }
        } else {
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null) {
                this.f = f2;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            Float f4 = this.v;
            f4.getClass();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f4.floatValue(), valueOf.floatValue());
            ofFloat.addUpdateListener(new muq(this, 1));
            ofFloat.addListener(this.h);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.e = ofFloat;
        }
        invalidate();
    }

    public final void u(float f, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        float f2 = f(f);
        float f3 = this.s;
        if (f3 == f2) {
            return;
        }
        if (z && this.l) {
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 == null) {
                this.d = f3;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f2);
            ofFloat.addUpdateListener(new muq(this, 0));
            ofFloat.addListener(this.g);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.c = ofFloat;
        } else {
            if (z2 && (valueAnimator = this.c) != null) {
                valueAnimator.cancel();
            }
            if (z2 || this.c == null) {
                float f4 = this.s;
                this.d = f4;
                this.s = f2;
                float f5 = this.s;
                if (f4 != f5) {
                    ckj ckjVar = this.b;
                    ckjVar.getClass();
                    akj akjVar = new akj(ckjVar);
                    while (akjVar.hasNext()) {
                        ((nuq) akjVar.next()).b(f5);
                    }
                }
            }
        }
        invalidate();
    }

    public quq(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ quq(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public quq(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
