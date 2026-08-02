package ru.yandex.music.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.is5;
import defpackage.js5;
import defpackage.klx;
import defpackage.qo6;
import defpackage.sht;
import defpackage.weo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public class CompoundImageView extends View {
    public static final ColorFilter l = (ColorFilter) sht.a.getValue();
    public final ArrayList a;
    public final LinkedList b;
    public final LinkedList c;
    public final Paint d;
    public boolean e;
    public boolean f;
    public float g;
    public int h;
    public ColorFilter i;
    public klx j;
    public qo6 k;

    static {
    }

    public CompoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new LinkedList();
        this.c = new LinkedList();
        Paint paint = new Paint();
        this.d = paint;
        this.f = false;
        this.g = 1.0f;
        this.h = 0;
        this.j = new klx(17);
        this.k = qo6.k;
        paint.setColor(weo.M(context, R.attr.bgPlaceholder));
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
    }

    private Rect getBounds() {
        return new Rect(1, 1, getWidth(), getWidth());
    }

    public ColorFilter getCustomColorFilter() {
        return this.i;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LinkedList linkedList = this.c;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        setCoverPaths(linkedList);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ColorFilter colorFilter = this.i;
        canvas.save();
        canvas.translate(0.0f, -this.h);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            is5 is5Var = (is5) it.next();
            is5Var.d = (this.f && colorFilter == null) ? l : colorFilter;
            is5Var.a.setBounds(is5Var.b);
            is5Var.a.setColorFilter(is5Var.d);
            is5Var.a.draw(canvas);
        }
        canvas.restore();
        canvas.drawRect(getBounds(), this.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = (int) (size * this.g);
        setMeasuredDimension(size, i3);
        this.h = (size - i3) / 2;
        if (!this.e) {
            LinkedList linkedList = this.c;
            boolean isEmpty = linkedList.isEmpty();
            ArrayList arrayList = this.a;
            if (!isEmpty || !arrayList.isEmpty()) {
                LinkedList linkedList2 = this.b;
                linkedList2.clear();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    linkedList2.add(((CoverPath) it.next()).getPathForSize(this.j.X(size)));
                }
                if (arrayList.isEmpty()) {
                    if (linkedList2.isEmpty()) {
                        arrayList.add(new is5(this, null));
                    } else {
                        this.j.U(linkedList2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.j.Y(size);
                }
            }
        }
        this.e = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        boolean z = this.f;
        boolean z2 = false;
        if (isClickable()) {
            if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                z2 = true;
            } else if (motionEvent.getActionMasked() != 3 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 10) {
                z2 = this.f;
            }
            this.f = z2;
        } else {
            this.f = false;
        }
        if (z != this.f) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    public void setAspectRatio(float f) {
        this.g = f;
        requestLayout();
    }

    public void setCoverPaths(List<CoverPath> list) {
        LinkedList linkedList;
        this.a.clear();
        ArrayList arrayList = new ArrayList(new LinkedHashSet(list));
        if (arrayList.isEmpty()) {
            linkedList = new LinkedList();
        } else {
            Collection collection = (Collection) Preconditions.nonNull(arrayList);
            LinkedList linkedList2 = new LinkedList();
            for (Object obj : collection) {
                if (obj != null) {
                    linkedList2.add(obj);
                }
            }
            linkedList = linkedList2;
        }
        LinkedList linkedList3 = this.c;
        if (linkedList3 != linkedList) {
            linkedList3.clear();
            linkedList3.addAll(linkedList);
        }
        if (linkedList3.size() >= 4) {
            this.j = new js5(this, 0);
        } else {
            this.j = new js5(this, 1);
        }
        this.e = false;
        requestLayout();
        invalidate();
    }

    public void setCustomColorFilter(ColorFilter colorFilter) {
        this.i = colorFilter;
    }

    public void setDefaultCoverType(qo6 qo6Var) {
        this.k = qo6Var;
    }

    public CompoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setCoverPaths(CoverPath... coverPathArr) {
        setCoverPaths(Arrays.asList(coverPathArr));
    }
}
