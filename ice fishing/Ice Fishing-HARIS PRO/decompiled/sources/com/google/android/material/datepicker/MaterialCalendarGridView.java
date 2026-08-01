package com.google.android.material.datepicker;

import O.K;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2477a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        r.c(null);
        if (MaterialDatePicker.T(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.lumenpath.harispro.hrnavigator.R.id.cancel_button);
            setNextFocusRightId(com.lumenpath.harispro.hrnavigator.R.id.confirm_button);
        }
        this.f2477a = MaterialDatePicker.T(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.nestedScrollable);
        K.l(this, new R.e(3));
    }

    public final l a() {
        return (l) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (l) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((l) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        l lVar = (l) super.getAdapter();
        lVar.getClass();
        int max = Math.max(lVar.a(), getFirstVisiblePosition());
        int min = Math.min(lVar.c(), getLastVisiblePosition());
        lVar.getItem(max);
        lVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((l) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((l) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((l) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((l) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f2477a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((l) super.getAdapter()).a()) {
            super.setSelection(((l) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (l) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof l)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), l.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
