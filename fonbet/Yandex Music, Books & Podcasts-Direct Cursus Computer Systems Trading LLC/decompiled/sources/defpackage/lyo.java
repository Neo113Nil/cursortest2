package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class lyo extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public e8h a;
    public final LinearLayoutCompat b;
    public es0 c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        new DecelerateInterpolator();
    }

    public lyo(@NonNull Context context) {
        super(context);
        new y2c(2, this);
        setHorizontalScrollBarEnabled(false);
        qe a = qe.a(context);
        setContentHeight(a.c());
        this.f = a.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new d7g(-2, -1));
        this.b = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        es0 es0Var = this.c;
        if (es0Var == null || es0Var.getParent() != this) {
            return;
        }
        removeView(this.c);
        addView(this.b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.c.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e8h e8hVar = this.a;
        if (e8hVar != null) {
            post(e8hVar);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qe a = qe.a(getContext());
        setContentHeight(a.c());
        this.f = a.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e8h e8hVar = this.a;
        if (e8hVar != null) {
            removeCallbacks(e8hVar);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((kyo) view).getClass();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        LinearLayoutCompat linearLayoutCompat = this.b;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.e = -1;
        } else {
            if (childCount > 2) {
                this.e = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.e = View.MeasureSpec.getSize(i) / 2;
            }
            this.e = Math.min(this.e, this.f);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        if (z || !this.d) {
            a();
        } else {
            linearLayoutCompat.measure(0, makeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                es0 es0Var = this.c;
                if (es0Var == null || es0Var.getParent() != this) {
                    if (this.c == null) {
                        es0 es0Var2 = new es0(getContext(), null, R.attr.actionDropDownStyle);
                        es0Var2.setLayoutParams(new d7g(-2, -1));
                        es0Var2.setOnItemSelectedListener(this);
                        this.c = es0Var2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.c, new ViewGroup.LayoutParams(-2, -1));
                    if (this.c.getAdapter() == null) {
                        this.c.setAdapter((SpinnerAdapter) new jyo(this));
                    }
                    Runnable runnable = this.a;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.a = null;
                    }
                    this.c.setSelection(this.h);
                }
            } else {
                a();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.h);
    }

    public void setAllowCollapse(boolean z) {
        this.d = z;
    }

    public void setContentHeight(int i) {
        this.g = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.h = i;
        LinearLayoutCompat linearLayoutCompat = this.b;
        int childCount = linearLayoutCompat.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = linearLayoutCompat.getChildAt(i);
                Runnable runnable = this.a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                e8h e8hVar = new e8h(15, this, childAt2);
                this.a = e8hVar;
                post(e8hVar);
            }
            i2++;
        }
        es0 es0Var = this.c;
        if (es0Var == null || i < 0) {
            return;
        }
        es0Var.setSelection(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
