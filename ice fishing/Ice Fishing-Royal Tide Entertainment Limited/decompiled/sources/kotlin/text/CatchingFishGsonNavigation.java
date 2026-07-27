package kotlin.text;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishGsonNavigation extends CatchingFishViewHiltWidget {
    public final RecyclerView CatchingFish;
    public int CatchingFishAnimationMockk;
    public final ValueAnimator CatchingFishCardViewRealm;
    public final CatchingFishGsonRealm CatchingFishCardViewView;
    public int CatchingFishCloudMessaging;
    public final StateListDrawable CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public final int CatchingFishFragmentHandler;
    public final int CatchingFishLayout;
    public float CatchingFishOkHttp;
    public final int CatchingFishParcelableFAB;
    public int CatchingFishPayPal;
    public final Drawable CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;
    public float CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public final Drawable CatchingFishViewModelFAB;
    public final StateListDrawable CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;
    public static final int[] CatchingFishMVPRobolectric = {R.attr.state_pressed};
    public static final int[] CatchingFishCustomView = new int[0];
    public int CatchingFishRoomDatabase = 0;
    public int CatchingFishNavigation = 0;
    public boolean CatchingFishJetpackCompose = false;
    public boolean CatchingFishCoroutineFlow = false;
    public int CatchingFishDaggerHiltFAB = 0;
    public int CatchingFishSpannableWidget = 0;
    public final int[] CatchingFishParcelableFlux = new int[2];
    public final int[] CatchingFishGsonAppCompat = new int[2];

    public CatchingFishGsonNavigation(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.CatchingFishCardViewRealm = ofFloat;
        this.CatchingFishPayPal = 0;
        CatchingFishGsonRealm catchingFishGsonRealm = new CatchingFishGsonRealm(8, this);
        this.CatchingFishCardViewView = catchingFishGsonRealm;
        CatchingFishHiltAnimation catchingFishHiltAnimation = new CatchingFishHiltAnimation(this);
        this.CatchingFishCoroutine = stateListDrawable;
        this.CatchingFishReduxKtor = drawable;
        this.CatchingFishViewModelScope = stateListDrawable2;
        this.CatchingFishViewModelFAB = drawable2;
        this.CatchingFishDaggerWebsocket = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.CatchingFishWorkManager = Math.max(i, drawable.getIntrinsicWidth());
        this.CatchingFishLayout = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.CatchingFishFragmentHandler = Math.max(i, drawable2.getIntrinsicWidth());
        this.CatchingFishParcelableFAB = i2;
        this.CatchingFishSnackbar = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new CatchingFishStripeAPIGradle(this));
        ofFloat.addUpdateListener(new CatchingFishSharedFlowToast(1, this));
        RecyclerView recyclerView2 = this.CatchingFish;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.CatchingFishRoomDatabase;
            CatchingFishKtorDataStore catchingFishKtorDataStore = recyclerView2.CatchingFishAnimationMockk;
            if (catchingFishKtorDataStore != null) {
                catchingFishKtorDataStore.CatchingFishCoroutine("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.CatchingFishPayPalLiveData();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.CatchingFish;
            recyclerView3.CatchingFishNavigation.remove(this);
            if (recyclerView3.CatchingFish == this) {
                recyclerView3.CatchingFish = null;
            }
            ArrayList arrayList2 = this.CatchingFish.CatchingFishDaggerMVVM;
            if (arrayList2 != null) {
                arrayList2.remove(catchingFishHiltAnimation);
            }
            this.CatchingFish.removeCallbacks(catchingFishGsonRealm);
        }
        this.CatchingFish = recyclerView;
        recyclerView.CatchingFishViewModelScope(this);
        this.CatchingFish.CatchingFishNavigation.add(this);
        this.CatchingFish.CatchingFishViewModelFAB(catchingFishHiltAnimation);
    }

    public static int CatchingFishDaggerWebsocket(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    public final boolean CatchingFishCoroutine(float f, float f2) {
        if (f2 < this.CatchingFishNavigation - this.CatchingFishLayout) {
            return false;
        }
        int i = this.CatchingFishAnimationMockk;
        int i2 = this.CatchingFishUnitTesting;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean CatchingFishReduxKtor(float f, float f2) {
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        int layoutDirection = this.CatchingFish.getLayoutDirection();
        int i = this.CatchingFishDaggerWebsocket;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.CatchingFishRoomDatabase - i) {
            return false;
        }
        int i2 = this.CatchingFishEspressoTesting;
        int i3 = this.CatchingFishCloudMessaging / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    @Override // kotlin.text.CatchingFishViewHiltWidget
    public final void CatchingFishSnackbar(Canvas canvas, RecyclerView recyclerView) {
        int i = this.CatchingFishRoomDatabase;
        RecyclerView recyclerView2 = this.CatchingFish;
        if (i != recyclerView2.getWidth() || this.CatchingFishNavigation != recyclerView2.getHeight()) {
            this.CatchingFishRoomDatabase = recyclerView2.getWidth();
            this.CatchingFishNavigation = recyclerView2.getHeight();
            CatchingFishWorkManager(0);
            return;
        }
        if (this.CatchingFishPayPal != 0) {
            if (this.CatchingFishJetpackCompose) {
                int i2 = this.CatchingFishRoomDatabase;
                int i3 = this.CatchingFishDaggerWebsocket;
                int i4 = i2 - i3;
                int i5 = this.CatchingFishEspressoTesting;
                int i6 = this.CatchingFishCloudMessaging;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.CatchingFishCoroutine;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.CatchingFishWorkManager;
                int i9 = this.CatchingFishNavigation;
                Drawable drawable = this.CatchingFishReduxKtor;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.CatchingFishCoroutineFlow) {
                int i10 = this.CatchingFishNavigation;
                int i11 = this.CatchingFishLayout;
                int i12 = i10 - i11;
                int i13 = this.CatchingFishAnimationMockk;
                int i14 = this.CatchingFishUnitTesting;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.CatchingFishViewModelScope;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.CatchingFishRoomDatabase;
                int i17 = this.CatchingFishFragmentHandler;
                Drawable drawable2 = this.CatchingFishViewModelFAB;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final void CatchingFishViewModelScope() {
        int i = this.CatchingFishPayPal;
        ValueAnimator valueAnimator = this.CatchingFishCardViewRealm;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.CatchingFishPayPal = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    public final void CatchingFishWorkManager(int i) {
        CatchingFishGsonRealm catchingFishGsonRealm = this.CatchingFishCardViewView;
        StateListDrawable stateListDrawable = this.CatchingFishCoroutine;
        if (i == 2 && this.CatchingFishDaggerHiltFAB != 2) {
            stateListDrawable.setState(CatchingFishMVPRobolectric);
            this.CatchingFish.removeCallbacks(catchingFishGsonRealm);
        }
        if (i == 0) {
            this.CatchingFish.invalidate();
        } else {
            CatchingFishViewModelScope();
        }
        if (this.CatchingFishDaggerHiltFAB == 2 && i != 2) {
            stateListDrawable.setState(CatchingFishCustomView);
            this.CatchingFish.removeCallbacks(catchingFishGsonRealm);
            this.CatchingFish.postDelayed(catchingFishGsonRealm, 1200);
        } else if (i == 1) {
            this.CatchingFish.removeCallbacks(catchingFishGsonRealm);
            this.CatchingFish.postDelayed(catchingFishGsonRealm, 1500);
        }
        this.CatchingFishDaggerHiltFAB = i;
    }
}
