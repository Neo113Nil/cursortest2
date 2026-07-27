package kotlin.text;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreGradle implements Runnable {
    public int CatchingFishDaggerWebsocket;
    public final /* synthetic */ RecyclerView CatchingFishFragmentHandler;
    public boolean CatchingFishLayout;
    public int CatchingFishReduxKtor;
    public boolean CatchingFishViewModelFAB;
    public Interpolator CatchingFishViewModelScope;
    public OverScroller CatchingFishWorkManager;

    public CatchingFishDataStoreGradle(RecyclerView recyclerView) {
        this.CatchingFishFragmentHandler = recyclerView;
        CatchingFishMVIEspresso catchingFishMVIEspresso = RecyclerView.CatchingFishDynamicFeature;
        this.CatchingFishViewModelScope = catchingFishMVIEspresso;
        this.CatchingFishViewModelFAB = false;
        this.CatchingFishLayout = false;
        this.CatchingFishWorkManager = new OverScroller(recyclerView.getContext(), catchingFishMVIEspresso);
    }

    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishViewModelFAB) {
            this.CatchingFishLayout = true;
            return;
        }
        RecyclerView recyclerView = this.CatchingFishFragmentHandler;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        recyclerView.postOnAnimation(this);
    }

    public final void CatchingFishSnackbar(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.CatchingFishFragmentHandler;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.CatchingFishDynamicFeature;
        }
        if (this.CatchingFishViewModelScope != interpolator) {
            this.CatchingFishViewModelScope = interpolator;
            this.CatchingFishWorkManager = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishReduxKtor = 0;
        recyclerView.setScrollState(2);
        this.CatchingFishWorkManager.startScroll(0, 0, i, i2, i4);
        CatchingFishParcelableFAB();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.CatchingFishFragmentHandler;
        int[] iArr = recyclerView.CatchingFishGlideWidgetKtor;
        if (recyclerView.CatchingFishAnimationMockk == null) {
            recyclerView.removeCallbacks(this);
            this.CatchingFishWorkManager.abortAnimation();
            return;
        }
        this.CatchingFishLayout = false;
        this.CatchingFishViewModelFAB = true;
        recyclerView.CatchingFishOkHttp();
        OverScroller overScroller = this.CatchingFishWorkManager;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.CatchingFishReduxKtor;
            int i6 = currY - this.CatchingFishDaggerWebsocket;
            this.CatchingFishReduxKtor = currX;
            this.CatchingFishDaggerWebsocket = currY;
            int[] iArr2 = recyclerView.CatchingFishGlideWidgetKtor;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.CatchingFishNavigation(i5, i6, 1, iArr2, null)) {
                i = i5 - iArr[0];
                i2 = i6 - iArr[1];
            } else {
                i = i5;
                i2 = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.CatchingFishEspressoTesting(i, i2);
            }
            if (recyclerView.CatchingFishUnitTesting != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.CatchingFishAnimation(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                CatchingFishFABRobolectric catchingFishFABRobolectric = recyclerView.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket;
                if (catchingFishFABRobolectric != null && !catchingFishFABRobolectric.CatchingFishReduxKtor && catchingFishFABRobolectric.CatchingFishDaggerWebsocket) {
                    int CatchingFishSnackbar = recyclerView.CatchingFishRedux.CatchingFishSnackbar();
                    if (CatchingFishSnackbar == 0) {
                        catchingFishFABRobolectric.CatchingFishLayout();
                    } else if (catchingFishFABRobolectric.CatchingFishParcelableFAB >= CatchingFishSnackbar) {
                        catchingFishFABRobolectric.CatchingFishParcelableFAB = CatchingFishSnackbar - 1;
                        catchingFishFABRobolectric.CatchingFishViewModelScope(i3, i4);
                    } else {
                        catchingFishFABRobolectric.CatchingFishViewModelScope(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.CatchingFishRoomDatabase.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.CatchingFishGlideWidgetKtor;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.CatchingFish(i3, i4, i, i2, null, 1, iArr3);
            int i7 = i - iArr[0];
            int i8 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.CatchingFishJetpackCompose(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            CatchingFishFABRobolectric catchingFishFABRobolectric2 = recyclerView.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket;
            if ((catchingFishFABRobolectric2 == null || !catchingFishFABRobolectric2.CatchingFishReduxKtor) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    if (i9 < 0) {
                        recyclerView.CatchingFishDaggerHiltFAB();
                        if (recyclerView.CatchingFishPayPalService.isFinished()) {
                            recyclerView.CatchingFishPayPalService.onAbsorb(-i9);
                        }
                    } else if (i9 > 0) {
                        recyclerView.CatchingFishSpannableWidget();
                        if (recyclerView.CatchingFishEspressoMockk.isFinished()) {
                            recyclerView.CatchingFishEspressoMockk.onAbsorb(i9);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.CatchingFishParcelableFlux();
                        if (recyclerView.CatchingFishSensorManager.isFinished()) {
                            recyclerView.CatchingFishSensorManager.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.CatchingFishCoroutineFlow();
                        if (recyclerView.CatchingFishDagger.isFinished()) {
                            recyclerView.CatchingFishDagger.onAbsorb(currVelocity);
                        }
                    }
                    if (i9 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                CatchingFishWidgetFAB catchingFishWidgetFAB = recyclerView.CatchingFishNavigationGson;
                int[] iArr4 = (int[]) catchingFishWidgetFAB.CatchingFishReduxKtor;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                catchingFishWidgetFAB.CatchingFishCoroutine = 0;
            } else {
                CatchingFishParcelableFAB();
                CatchingFishJUnitRoomRoom catchingFishJUnitRoomRoom = recyclerView.CatchingFishAndroidX;
                if (catchingFishJUnitRoomRoom != null) {
                    catchingFishJUnitRoomRoom.CatchingFishParcelableFAB(recyclerView, i3, i4);
                }
            }
        }
        CatchingFishFABRobolectric catchingFishFABRobolectric3 = recyclerView.CatchingFishAnimationMockk.CatchingFishDaggerWebsocket;
        if (catchingFishFABRobolectric3 != null && catchingFishFABRobolectric3.CatchingFishReduxKtor) {
            catchingFishFABRobolectric3.CatchingFishViewModelScope(0, 0);
        }
        this.CatchingFishViewModelFAB = false;
        if (!this.CatchingFishLayout) {
            recyclerView.setScrollState(0);
            recyclerView.CatchingFishNavigationGson(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            recyclerView.postOnAnimation(this);
        }
    }
}
