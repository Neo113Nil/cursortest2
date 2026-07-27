package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import kotlin.text.CatchingFishBiometricFlux;
import kotlin.text.CatchingFishDaggerHiltMVP;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishJUnitCoroutine;
import kotlin.text.CatchingFishLiveDataContext;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean CatchingFishReduxKtor;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null);
        if (CatchingFishLiveDataContext.CatchingFishSensorManager(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.catchingfish.fishcatcherpro.R.id.cancel_button);
            setNextFocusRightId(com.catchingfish.fishcatcherpro.R.id.confirm_button);
        }
        this.CatchingFishReduxKtor = CatchingFishLiveDataContext.CatchingFishSensorManager(getContext(), com.catchingfish.fishcatcherpro.R.attr.nestedScrollable);
        CatchingFishFABCameraX.CatchingFishOkHttp(this, new CatchingFishBiometricFlux(2));
    }

    public final CatchingFishJUnitCoroutine CatchingFishParcelableFAB() {
        return (CatchingFishJUnitCoroutine) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (CatchingFishJUnitCoroutine) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((CatchingFishJUnitCoroutine) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        CatchingFishJUnitCoroutine catchingFishJUnitCoroutine = (CatchingFishJUnitCoroutine) super.getAdapter();
        catchingFishJUnitCoroutine.getClass();
        int max = Math.max(catchingFishJUnitCoroutine.CatchingFishParcelableFAB(), getFirstVisiblePosition());
        int min = Math.min(catchingFishJUnitCoroutine.CatchingFishCoroutine(), getLastVisiblePosition());
        catchingFishJUnitCoroutine.getItem(max);
        catchingFishJUnitCoroutine.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((CatchingFishJUnitCoroutine) super.getAdapter()).CatchingFishCoroutine());
        } else if (i == 130) {
            setSelection(((CatchingFishJUnitCoroutine) super.getAdapter()).CatchingFishParcelableFAB());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((CatchingFishJUnitCoroutine) super.getAdapter()).CatchingFishParcelableFAB() && selectedItemPosition <= ((CatchingFishJUnitCoroutine) super.getAdapter()).CatchingFishCoroutine())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((CatchingFishJUnitCoroutine) super.getAdapter()).CatchingFishParcelableFAB());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.CatchingFishReduxKtor) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((CatchingFishJUnitCoroutine) super.getAdapter()).CatchingFishParcelableFAB()) {
            super.setSelection(((CatchingFishJUnitCoroutine) super.getAdapter()).CatchingFishParcelableFAB());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (CatchingFishJUnitCoroutine) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof CatchingFishJUnitCoroutine)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), CatchingFishJUnitCoroutine.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
