package kotlin.text;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class CatchingFishFABRobolectric {
    public int CatchingFishAnimationMockk;
    public final DisplayMetrics CatchingFishCloudMessaging;
    public CatchingFishKtorDataStore CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public PointF CatchingFishFragmentHandler;
    public final DecelerateInterpolator CatchingFishLayout;
    public float CatchingFishOkHttp;
    public int CatchingFishParcelableFAB = -1;
    public boolean CatchingFishReduxKtor;
    public RecyclerView CatchingFishSnackbar;
    public int CatchingFishUnitTesting;
    public final LinearInterpolator CatchingFishViewModelFAB;
    public final CatchingFishMVICardView CatchingFishViewModelScope;
    public View CatchingFishWorkManager;

    public CatchingFishFABRobolectric(Context context) {
        CatchingFishMVICardView catchingFishMVICardView = new CatchingFishMVICardView();
        catchingFishMVICardView.CatchingFishReduxKtor = -1;
        catchingFishMVICardView.CatchingFishWorkManager = false;
        catchingFishMVICardView.CatchingFishParcelableFAB = 0;
        catchingFishMVICardView.CatchingFishSnackbar = 0;
        catchingFishMVICardView.CatchingFishCoroutine = Integer.MIN_VALUE;
        catchingFishMVICardView.CatchingFishDaggerWebsocket = null;
        this.CatchingFishViewModelScope = catchingFishMVICardView;
        this.CatchingFishViewModelFAB = new LinearInterpolator();
        this.CatchingFishLayout = new DecelerateInterpolator();
        this.CatchingFishEspressoTesting = false;
        this.CatchingFishUnitTesting = 0;
        this.CatchingFishAnimationMockk = 0;
        this.CatchingFishCloudMessaging = context.getResources().getDisplayMetrics();
    }

    public static int CatchingFishParcelableFAB(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int CatchingFishCoroutine(View view, int i) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishCoroutine;
        if (catchingFishKtorDataStore == null || !catchingFishKtorDataStore.CatchingFishDaggerWebsocket()) {
            return 0;
        }
        CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
        return CatchingFishParcelableFAB((view.getTop() - ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar.top) - ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).topMargin, view.getBottom() + ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar.bottom + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).bottomMargin, catchingFishKtorDataStore.CatchingFishJobScheduler(), catchingFishKtorDataStore.CatchingFishAnimationMockk - catchingFishKtorDataStore.CatchingFishCustomView(), i);
    }

    public int CatchingFishDaggerWebsocket(int i) {
        float abs = Math.abs(i);
        if (!this.CatchingFishEspressoTesting) {
            this.CatchingFishOkHttp = CatchingFishReduxKtor(this.CatchingFishCloudMessaging);
            this.CatchingFishEspressoTesting = true;
        }
        return (int) Math.ceil(abs * this.CatchingFishOkHttp);
    }

    public final void CatchingFishLayout() {
        if (this.CatchingFishDaggerWebsocket) {
            this.CatchingFishDaggerWebsocket = false;
            this.CatchingFishAnimationMockk = 0;
            this.CatchingFishUnitTesting = 0;
            this.CatchingFishFragmentHandler = null;
            this.CatchingFishSnackbar.CatchingFishRedux.CatchingFishParcelableFAB = -1;
            this.CatchingFishWorkManager = null;
            this.CatchingFishParcelableFAB = -1;
            this.CatchingFishReduxKtor = false;
            CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishCoroutine;
            if (catchingFishKtorDataStore.CatchingFishDaggerWebsocket == this) {
                catchingFishKtorDataStore.CatchingFishDaggerWebsocket = null;
            }
            this.CatchingFishCoroutine = null;
            this.CatchingFishSnackbar = null;
        }
    }

    public float CatchingFishReduxKtor(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int CatchingFishSnackbar(View view, int i) {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishCoroutine;
        if (catchingFishKtorDataStore == null || !catchingFishKtorDataStore.CatchingFishReduxKtor()) {
            return 0;
        }
        CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
        return CatchingFishParcelableFAB((view.getLeft() - ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar.left) - ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).leftMargin, view.getRight() + ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar.right + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).rightMargin, catchingFishKtorDataStore.CatchingFishFragmentFactory(), catchingFishKtorDataStore.CatchingFishUnitTesting - catchingFishKtorDataStore.CatchingFishMutableLiveData(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void CatchingFishViewModelFAB(View view, CatchingFishMVICardView catchingFishMVICardView) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.CatchingFishFragmentHandler;
        int i2 = 0;
        if (pointF2 != null) {
            float f = pointF2.x;
            if (f != 0.0f) {
                i = f > 0.0f ? 1 : -1;
                int CatchingFishSnackbar = CatchingFishSnackbar(view, i);
                pointF = this.CatchingFishFragmentHandler;
                if (pointF != null) {
                    float f2 = pointF.y;
                    if (f2 != 0.0f) {
                        i2 = f2 > 0.0f ? 1 : -1;
                    }
                }
                int CatchingFishCoroutine = CatchingFishCoroutine(view, i2);
                ceil = (int) Math.ceil(CatchingFishDaggerWebsocket((int) Math.sqrt((CatchingFishCoroutine * CatchingFishCoroutine) + (CatchingFishSnackbar * CatchingFishSnackbar))) / 0.3356d);
                if (ceil <= 0) {
                    catchingFishMVICardView.CatchingFishParcelableFAB = -CatchingFishSnackbar;
                    catchingFishMVICardView.CatchingFishSnackbar = -CatchingFishCoroutine;
                    catchingFishMVICardView.CatchingFishCoroutine = ceil;
                    catchingFishMVICardView.CatchingFishDaggerWebsocket = this.CatchingFishLayout;
                    catchingFishMVICardView.CatchingFishWorkManager = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int CatchingFishSnackbar2 = CatchingFishSnackbar(view, i);
        pointF = this.CatchingFishFragmentHandler;
        if (pointF != null) {
        }
        int CatchingFishCoroutine2 = CatchingFishCoroutine(view, i2);
        ceil = (int) Math.ceil(CatchingFishDaggerWebsocket((int) Math.sqrt((CatchingFishCoroutine2 * CatchingFishCoroutine2) + (CatchingFishSnackbar2 * CatchingFishSnackbar2))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void CatchingFishViewModelScope(int i, int i2) {
        PointF CatchingFishWorkManager;
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (this.CatchingFishParcelableFAB == -1 || recyclerView == null) {
            CatchingFishLayout();
        }
        if (this.CatchingFishReduxKtor && this.CatchingFishWorkManager == null && this.CatchingFishCoroutine != null && (CatchingFishWorkManager = CatchingFishWorkManager(this.CatchingFishParcelableFAB)) != null) {
            float f = CatchingFishWorkManager.x;
            if (f != 0.0f || CatchingFishWorkManager.y != 0.0f) {
                recyclerView.CatchingFishAnimation((int) Math.signum(f), (int) Math.signum(CatchingFishWorkManager.y), null);
            }
        }
        this.CatchingFishReduxKtor = false;
        View view = this.CatchingFishWorkManager;
        CatchingFishMVICardView catchingFishMVICardView = this.CatchingFishViewModelScope;
        if (view != null) {
            this.CatchingFishSnackbar.getClass();
            CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
            if ((CatchingFishSensorManager != null ? CatchingFishSensorManager.CatchingFishSnackbar() : -1) == this.CatchingFishParcelableFAB) {
                View view2 = this.CatchingFishWorkManager;
                CatchingFishReduxGlide catchingFishReduxGlide = recyclerView.CatchingFishRedux;
                CatchingFishViewModelFAB(view2, catchingFishMVICardView);
                catchingFishMVICardView.CatchingFishParcelableFAB(recyclerView);
                CatchingFishLayout();
            } else {
                this.CatchingFishWorkManager = null;
            }
        }
        if (this.CatchingFishDaggerWebsocket) {
            CatchingFishReduxGlide catchingFishReduxGlide2 = recyclerView.CatchingFishRedux;
            if (this.CatchingFishSnackbar.CatchingFishAnimationMockk.CatchingFishDaggerHiltFAB() == 0) {
                CatchingFishLayout();
            } else {
                int i3 = this.CatchingFishUnitTesting;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.CatchingFishUnitTesting = i4;
                int i5 = this.CatchingFishAnimationMockk;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.CatchingFishAnimationMockk = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF CatchingFishWorkManager2 = CatchingFishWorkManager(this.CatchingFishParcelableFAB);
                    if (CatchingFishWorkManager2 != null) {
                        if (CatchingFishWorkManager2.x != 0.0f || CatchingFishWorkManager2.y != 0.0f) {
                            float f2 = CatchingFishWorkManager2.y;
                            float sqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = CatchingFishWorkManager2.x / sqrt;
                            CatchingFishWorkManager2.x = f3;
                            float f4 = CatchingFishWorkManager2.y / sqrt;
                            CatchingFishWorkManager2.y = f4;
                            this.CatchingFishFragmentHandler = CatchingFishWorkManager2;
                            this.CatchingFishUnitTesting = (int) (f3 * 10000.0f);
                            this.CatchingFishAnimationMockk = (int) (f4 * 10000.0f);
                            int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(10000);
                            catchingFishMVICardView.CatchingFishParcelableFAB = (int) (this.CatchingFishUnitTesting * 1.2f);
                            catchingFishMVICardView.CatchingFishSnackbar = (int) (this.CatchingFishAnimationMockk * 1.2f);
                            catchingFishMVICardView.CatchingFishCoroutine = (int) (CatchingFishDaggerWebsocket * 1.2f);
                            catchingFishMVICardView.CatchingFishDaggerWebsocket = this.CatchingFishViewModelFAB;
                            catchingFishMVICardView.CatchingFishWorkManager = true;
                        }
                    }
                    catchingFishMVICardView.CatchingFishReduxKtor = this.CatchingFishParcelableFAB;
                    CatchingFishLayout();
                }
            }
            boolean z = catchingFishMVICardView.CatchingFishReduxKtor >= 0;
            catchingFishMVICardView.CatchingFishParcelableFAB(recyclerView);
            if (z && this.CatchingFishDaggerWebsocket) {
                this.CatchingFishReduxKtor = true;
                recyclerView.CatchingFishMoshiDaggerHilt.CatchingFishParcelableFAB();
            }
        }
    }

    public PointF CatchingFishWorkManager(int i) {
        Object obj = this.CatchingFishCoroutine;
        if (obj instanceof CatchingFishWidgetMVIGradle) {
            return ((CatchingFishWidgetMVIGradle) obj).CatchingFishParcelableFAB(i);
        }
        return null;
    }
}
