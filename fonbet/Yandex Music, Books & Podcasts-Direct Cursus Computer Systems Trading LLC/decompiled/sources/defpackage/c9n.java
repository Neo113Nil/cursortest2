package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
public final class c9n implements mnj {
    public static final c9n d;
    public final /* synthetic */ int a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new c9n(i, i, 0);
    }

    public c9n(Context context, AttributeSet attributeSet) {
        this.a = 6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zdn.d);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
    }

    public void a(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i - intrinsicWidth, (this.c / 2) - (drawable.getIntrinsicHeight() / 2), i + intrinsicWidth, (drawable.getIntrinsicHeight() / 2) + (this.c / 2));
        drawable.draw(canvas);
    }

    public void b(Canvas canvas, int i, Drawable drawable, int i2, jas jasVar) {
        a(canvas, drawable, i);
        if (jasVar != null) {
            String valueOf = String.valueOf(i2);
            ias iasVar = jasVar.b;
            Rect rect = iasVar.b;
            iasVar.d = valueOf;
            Paint paint = iasVar.c;
            paint.getTextBounds(valueOf, 0, valueOf != null ? valueOf.length() : 0, rect);
            iasVar.e = paint.measureText(iasVar.d) / 2.0f;
            iasVar.f = rect.height() / 2.0f;
            jasVar.invalidateSelf();
            a(canvas, jasVar, i);
        }
    }

    @Override // defpackage.mnj
    public int c(int i) {
        if (i >= 0 && i <= this.c) {
            nt0.S(i, this.b, i);
        }
        return i;
    }

    @Override // defpackage.mnj
    public int d(int i) {
        if (i >= 0 && i <= this.b) {
            nt0.R(i, this.c, i);
        }
        return i;
    }

    public int e() {
        int i = this.c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            this.b = 0;
            this.c = size;
        } else if (mode == 0) {
            this.b = 0;
            this.c = SQLiteDatabase.OPEN_NOMUTEX;
        } else {
            if (mode != 1073741824) {
                return;
            }
            this.b = size;
            this.c = size;
        }
    }

    public void g(opn opnVar) {
        View view = opnVar.a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public void h(int i) {
        int i2 = this.b;
        if (i < 0) {
            e7o.o(dfi.c(i, "pos: ", " < lowerBound: 0"));
        } else if (i <= i2) {
            this.c = i;
        } else {
            e7o.o(f1d.e(i, i2, "pos: ", " > upperBound: "));
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(c9n.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return f1d.i(sb, this.c, "]");
            case 3:
                StringBuilder sb2 = new StringBuilder("Location(line = ");
                sb2.append(this.b);
                sb2.append(", column = ");
                return vz1.r(sb2, this.c, ')');
            case 10:
                return "[" + Integer.toString(0) + '>' + Integer.toString(this.c) + '>' + Integer.toString(this.b) + ']';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c9n(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ c9n(int i, byte b) {
        this.a = i;
    }

    public c9n(int i) {
        this.a = 10;
        if (i >= 0) {
            this.b = i;
            this.c = 0;
        } else {
            e7o.o("Lower bound cannot be greater then upper bound");
            throw null;
        }
    }

    public c9n() {
        this.a = 5;
        this.b = 0;
        this.c = SQLiteDatabase.OPEN_NOMUTEX;
    }
}
