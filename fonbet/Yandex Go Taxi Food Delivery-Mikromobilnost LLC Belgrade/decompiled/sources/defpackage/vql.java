package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.util.ArrayList;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes9.dex */
public final class vql {
    public final Runnable a;
    public final int b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public int j;
    public int k;
    public DividerPosition m;
    public boolean n;
    public final Paint h = new Paint();
    public final ArrayList i = new ArrayList();
    public DividerType l = DividerType.NONE;

    public vql(Context context, AttributeSet attributeSet, Runnable runnable) {
        this.a = runnable;
        this.c = tje.u(56, context);
        this.d = context.getResources().getDimensionPixelSize(mrg0.go_design_m_space);
        this.e = context.getResources().getDimensionPixelSize(mrg0.go_design_s_space);
        this.f = tje.u(12, context);
        this.g = xw31.n(context);
        DividerPosition dividerPosition = DividerPosition.NONE;
        this.m = dividerPosition;
        b(context);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.DividerAwareComponent, 0, 0);
        int i = obtainStyledAttributes.getInt(c4i0.DividerAwareComponent_component_divider_type, 0);
        int i2 = obtainStyledAttributes.getInt(c4i0.DividerAwareComponent_component_divider_position, 0);
        this.b = Math.max(obtainStyledAttributes.getDimensionPixelSize(c4i0.DividerAwareComponent_component_divider_min_divider_size, 0), tje.v(context, 0.5f));
        obtainStyledAttributes.recycle();
        DividerType.Companion.getClass();
        DividerType a = hrl.a(i);
        DividerPosition.Companion.getClass();
        if (i2 != 0) {
            if (i2 == 1) {
                dividerPosition = DividerPosition.TOP;
            } else if (i2 == 2) {
                dividerPosition = DividerPosition.BOTTOM;
            } else if (i2 == 3) {
                dividerPosition = DividerPosition.TOP_AND_BOTTOM;
            } else if (i2 == 4) {
                dividerPosition = DividerPosition.START;
            }
        }
        e(dividerPosition, a);
    }

    public final void a(Canvas canvas) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            canvas.drawRect((Rect) arrayList.get(i), this.h);
        }
    }

    public final void b(Context context) {
        if (this.n) {
            return;
        }
        int t = qje.t(xng0.line, context);
        Paint paint = this.h;
        if (t != paint.getColor()) {
            paint.setColor(t);
            this.a.run();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int i;
        DividerPosition dividerPosition;
        boolean z;
        boolean z2;
        ArrayList arrayList = this.i;
        arrayList.clear();
        DividerType dividerType = this.l;
        if (dividerType != DividerType.NONE && this.m != DividerPosition.NONE) {
            int[] iArr = uql.a;
            int i2 = iArr[dividerType.ordinal()];
            int i3 = this.d;
            int i4 = this.f;
            switch (i2) {
                case 1:
                case 2:
                    i = 0;
                    break;
                case 3:
                case 4:
                case 5:
                    i = this.c;
                    break;
                case 6:
                    i = i3;
                    break;
                case 7:
                    i = i4;
                    break;
                default:
                    w511.b();
                    return;
            }
            switch (iArr[this.l.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    i3 = 0;
                    boolean z3 = this.g;
                    int i5 = !z3 ? i3 : i;
                    int i6 = !z3 ? i : i3;
                    dividerPosition = this.m;
                    z = true;
                    z2 = dividerPosition != DividerPosition.TOP || dividerPosition == DividerPosition.TOP_AND_BOTTOM;
                    if (dividerPosition != DividerPosition.BOTTOM && dividerPosition != DividerPosition.TOP_AND_BOTTOM) {
                        z = false;
                    }
                    int i7 = this.b;
                    if (z2) {
                        arrayList.add(new Rect(i5, 0, this.j - i6, i7));
                    }
                    if (z) {
                        int i8 = this.k;
                        arrayList.add(new Rect(i5, i8 - i7, this.j - i6, i8));
                    }
                    if (this.m == DividerPosition.START) {
                        if (!z3) {
                            arrayList.add(new Rect(0, i, i7, this.k - i3));
                            break;
                        } else {
                            int i9 = this.j;
                            arrayList.add(new Rect(i9 - i7, i, i9, this.k - i3));
                            break;
                        }
                    }
                    break;
                case 4:
                case 6:
                    boolean z32 = this.g;
                    if (!z32) {
                    }
                    if (!z32) {
                    }
                    dividerPosition = this.m;
                    z = true;
                    if (dividerPosition != DividerPosition.TOP) {
                        break;
                    }
                    if (dividerPosition != DividerPosition.BOTTOM) {
                        z = false;
                        break;
                    }
                    int i72 = this.b;
                    if (z2) {
                    }
                    if (z) {
                    }
                    if (this.m == DividerPosition.START) {
                    }
                    break;
                case 5:
                    i3 = this.e;
                    boolean z322 = this.g;
                    if (!z322) {
                    }
                    if (!z322) {
                    }
                    dividerPosition = this.m;
                    z = true;
                    if (dividerPosition != DividerPosition.TOP) {
                    }
                    if (dividerPosition != DividerPosition.BOTTOM) {
                    }
                    int i722 = this.b;
                    if (z2) {
                    }
                    if (z) {
                    }
                    if (this.m == DividerPosition.START) {
                    }
                    break;
                case 7:
                    i3 = i4;
                    boolean z3222 = this.g;
                    if (!z3222) {
                    }
                    if (!z3222) {
                    }
                    dividerPosition = this.m;
                    z = true;
                    if (dividerPosition != DividerPosition.TOP) {
                    }
                    if (dividerPosition != DividerPosition.BOTTOM) {
                    }
                    int i7222 = this.b;
                    if (z2) {
                    }
                    if (z) {
                    }
                    if (this.m == DividerPosition.START) {
                    }
                    break;
                default:
                    w511.b();
                    break;
            }
            return;
        }
        this.a.run();
    }

    public final void d(int i, int i2) {
        if (i == this.j && i2 == this.k) {
            return;
        }
        this.j = i;
        this.k = i2;
        c();
    }

    public final void e(DividerPosition dividerPosition, DividerType dividerType) {
        if (dividerType == this.l && dividerPosition == this.m) {
            return;
        }
        this.l = dividerType;
        this.m = dividerPosition;
        c();
    }
}
