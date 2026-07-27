package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import kotlin.text.CatchingFishAsyncTaskMVP;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishIntentRedux;
import kotlin.text.CatchingFishRobolectricRoom;
import kotlin.text.CatchingFishSnackbarPicasso;

/* loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int CatchingFishRoomDatabase = 0;
    public int CatchingFishAnimationMockk;
    public final int CatchingFishCloudMessaging;
    public boolean CatchingFishDaggerWebsocket;
    public float CatchingFishEspressoTesting;
    public final RectF CatchingFishFragmentHandler;
    public final Paint CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public final ValueAnimator CatchingFishReduxKtor;
    public int CatchingFishStateLiveData;
    public double CatchingFishUnitTesting;
    public final float CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final ArrayList CatchingFishWorkManager;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.CatchingFishReduxKtor = valueAnimator;
        this.CatchingFishWorkManager = new ArrayList();
        Paint paint = new Paint();
        this.CatchingFishLayout = paint;
        this.CatchingFishFragmentHandler = new RectF();
        this.CatchingFishStateLiveData = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishDaggerWebsocket, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationLong2, 200);
        CatchingFishHiltMVPToast.CatchingFishCustomView(context, R.attr.motionEasingEmphasizedInterpolator, CatchingFishRobolectricRoom.CatchingFishSnackbar);
        this.CatchingFishAnimationMockk = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.CatchingFishViewModelScope = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.CatchingFishCloudMessaging = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.CatchingFishViewModelFAB = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        CatchingFishSnackbar(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.CatchingFishMutableLiveData
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.CatchingFishRoomDatabase;
                ClockHandView.this.CatchingFishCoroutine(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new CatchingFishAsyncTaskMVP());
    }

    public final void CatchingFishCoroutine(float f) {
        float f2 = f % 360.0f;
        this.CatchingFishEspressoTesting = f2;
        this.CatchingFishUnitTesting = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float CatchingFishParcelableFAB = CatchingFishParcelableFAB(this.CatchingFishStateLiveData);
        float cos = (((float) Math.cos(this.CatchingFishUnitTesting)) * CatchingFishParcelableFAB) + width;
        float sin = (CatchingFishParcelableFAB * ((float) Math.sin(this.CatchingFishUnitTesting))) + height;
        float f3 = this.CatchingFishViewModelScope;
        this.CatchingFishFragmentHandler.set(cos - f3, sin - f3, cos + f3, sin + f3);
        ArrayList arrayList = this.CatchingFishWorkManager;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((CatchingFishIntentRedux) obj);
            if (Math.abs(clockFaceView.CatchingFishEspressoMockk - f2) > 0.001f) {
                clockFaceView.CatchingFishEspressoMockk = f2;
                clockFaceView.CatchingFishUnitTesting();
            }
        }
        invalidate();
    }

    public final int CatchingFishParcelableFAB(int i) {
        return i == 2 ? Math.round(this.CatchingFishAnimationMockk * 0.66f) : this.CatchingFishAnimationMockk;
    }

    public final void CatchingFishSnackbar(float f) {
        this.CatchingFishReduxKtor.cancel();
        CatchingFishCoroutine(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float CatchingFishParcelableFAB = CatchingFishParcelableFAB(this.CatchingFishStateLiveData);
        float cos = (((float) Math.cos(this.CatchingFishUnitTesting)) * CatchingFishParcelableFAB) + f;
        float f2 = height;
        float sin = (CatchingFishParcelableFAB * ((float) Math.sin(this.CatchingFishUnitTesting))) + f2;
        Paint paint = this.CatchingFishLayout;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.CatchingFishViewModelScope, paint);
        double sin2 = Math.sin(this.CatchingFishUnitTesting);
        paint.setStrokeWidth(this.CatchingFishCloudMessaging);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.CatchingFishUnitTesting) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f, f2, this.CatchingFishViewModelFAB, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.CatchingFishReduxKtor.isRunning()) {
            return;
        }
        CatchingFishSnackbar(this.CatchingFishEspressoTesting);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.CatchingFishOkHttp = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.CatchingFishOkHttp;
            if (this.CatchingFishDaggerWebsocket) {
                this.CatchingFishStateLiveData = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) CatchingFishParcelableFAB(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.CatchingFishOkHttp;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.CatchingFishEspressoTesting != f;
        if (!z || !z5) {
            if (z5 || z2) {
                CatchingFishSnackbar(f);
            }
            this.CatchingFishOkHttp = z4 | z3;
            return true;
        }
        z3 = true;
        this.CatchingFishOkHttp = z4 | z3;
        return true;
    }
}
