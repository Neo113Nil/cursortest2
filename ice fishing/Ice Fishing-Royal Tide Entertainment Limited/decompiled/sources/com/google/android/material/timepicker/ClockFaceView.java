package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.CatchingFishAnimationBundle;
import kotlin.text.CatchingFishContextRoom;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishDatabindingGson;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishIntentRedux;
import kotlin.text.CatchingFishMoshiPicasso;
import kotlin.text.CatchingFishSnackbarPicasso;

/* loaded from: classes.dex */
class ClockFaceView extends CatchingFishContextRoom implements CatchingFishIntentRedux {
    public final Rect CatchingFishCardViewRealm;
    public final CatchingFishUnitTestingGson CatchingFishCardViewView;
    public final float[] CatchingFishCustomView;
    public final ColorStateList CatchingFishDagger;
    public float CatchingFishEspressoMockk;
    public final int CatchingFishFragmentFactory;
    public final RectF CatchingFishGsonAppCompat;
    public final int CatchingFishJobScheduler;
    public final int[] CatchingFishMVPRobolectric;
    public final int CatchingFishMutableLiveData;
    public final Rect CatchingFishParcelableFlux;
    public final SparseArray CatchingFishPayPal;
    public final int CatchingFishPayPalService;
    public final String[] CatchingFishSensorManager;
    public final ClockHandView CatchingFishSpannableWidget;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.CatchingFishParcelableFlux = new Rect();
        this.CatchingFishGsonAppCompat = new RectF();
        this.CatchingFishCardViewRealm = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.CatchingFishPayPal = sparseArray;
        this.CatchingFishCustomView = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishReduxKtor, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList CatchingFishNavigation = CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 1);
        this.CatchingFishDagger = CatchingFishNavigation;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.CatchingFishSpannableWidget = clockHandView;
        this.CatchingFishFragmentFactory = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = CatchingFishNavigation.getColorForState(new int[]{android.R.attr.state_selected}, CatchingFishNavigation.getDefaultColor());
        this.CatchingFishMVPRobolectric = new int[]{colorForState, colorForState, CatchingFishNavigation.getDefaultColor()};
        clockHandView.CatchingFishWorkManager.add(this);
        int defaultColor = CatchingFishGsonCardView.CatchingFishSpannableWidget(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList CatchingFishNavigation2 = CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 0);
        setBackgroundColor(CatchingFishNavigation2 != null ? CatchingFishNavigation2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new CatchingFishViewPagerToast(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.CatchingFishCardViewView = new CatchingFishUnitTestingGson(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.CatchingFishSensorManager = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.CatchingFishSensorManager.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.CatchingFishSensorManager.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.CatchingFishSensorManager[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                CatchingFishFABCameraX.CatchingFishOkHttp(textView, this.CatchingFishCardViewView);
                textView.setTextColor(this.CatchingFishDagger);
            }
        }
        ClockHandView clockHandView2 = this.CatchingFishSpannableWidget;
        if (clockHandView2.CatchingFishDaggerWebsocket && !z) {
            clockHandView2.CatchingFishStateLiveData = 1;
        }
        clockHandView2.CatchingFishDaggerWebsocket = z;
        clockHandView2.invalidate();
        this.CatchingFishMutableLiveData = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.CatchingFishJobScheduler = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.CatchingFishPayPalService = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // kotlin.text.CatchingFishContextRoom
    public final void CatchingFishOkHttp() {
        CatchingFishAnimationBundle catchingFishAnimationBundle = new CatchingFishAnimationBundle();
        catchingFishAnimationBundle.CatchingFishSnackbar(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.CatchingFishCoroutineFlow * 0.66f) : this.CatchingFishCoroutineFlow;
            Iterator it = list.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer valueOf = Integer.valueOf(id);
                HashMap hashMap2 = catchingFishAnimationBundle.CatchingFishCoroutine;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id), new CatchingFishMoshiPicasso());
                }
                CatchingFishDatabindingGson catchingFishDatabindingGson = ((CatchingFishMoshiPicasso) hashMap2.get(Integer.valueOf(id))).CatchingFishReduxKtor;
                catchingFishDatabindingGson.CatchingFishCardViewRealm = R.id.circle_center;
                catchingFishDatabindingGson.CatchingFishPayPal = round;
                catchingFishDatabindingGson.CatchingFishCardViewView = f;
                f += 360.0f / list.size();
            }
        }
        catchingFishAnimationBundle.CatchingFishParcelableFAB(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.CatchingFishPayPal;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void CatchingFishUnitTesting() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.CatchingFishSpannableWidget.CatchingFishFragmentHandler;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.CatchingFishPayPal;
            int size = sparseArray.size();
            rect = this.CatchingFishParcelableFlux;
            rectF = this.CatchingFishGsonAppCompat;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.CatchingFishCardViewRealm);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.CatchingFishMVPRobolectric, this.CatchingFishCustomView, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.CatchingFishSensorManager.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        CatchingFishUnitTesting();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.CatchingFishPayPalService / Math.max(Math.max(this.CatchingFishMutableLiveData / displayMetrics.heightPixels, this.CatchingFishJobScheduler / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
