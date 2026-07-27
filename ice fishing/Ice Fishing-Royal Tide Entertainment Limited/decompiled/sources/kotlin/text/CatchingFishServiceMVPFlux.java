package kotlin.text;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class CatchingFishServiceMVPFlux {
    public static final CatchingFishKtorDatabinding CatchingFishWorkManager = new CatchingFishKtorDatabinding(2);
    public final Rect CatchingFishParcelableFAB = new Rect();
    public final Rect CatchingFishSnackbar = new Rect();
    public final Rect CatchingFishCoroutine = new Rect();
    public final CatchingFishIntentViewModel CatchingFishReduxKtor = new CatchingFishIntentViewModel(new CatchingFishLayoutLayout(27, this));
    public final ArrayList CatchingFishDaggerWebsocket = new ArrayList();

    public static void CatchingFishReduxKtor(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View CatchingFishCoroutine(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.CatchingFishSnackbar;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = (View) arrayList.get(i2);
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(view3, view) && !CatchingFishFirebaseDagger.CatchingFishOkHttp(view3, viewGroup)) {
                Rect rect3 = this.CatchingFishCoroutine;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                CatchingFishFluxExoPlayer CatchingFishCardViewView = CatchingFishKtorViewModel.CatchingFishCardViewView(rect3);
                CatchingFishFluxExoPlayer CatchingFishCardViewView2 = CatchingFishKtorViewModel.CatchingFishCardViewView(rect2);
                CatchingFishFluxExoPlayer CatchingFishCardViewView3 = CatchingFishKtorViewModel.CatchingFishCardViewView(rect);
                CatchingFishViewPagerFAB CatchingFishDataStoreIntent = CatchingFishRobolectricHilt.CatchingFishDataStoreIntent(i);
                if (CatchingFishOkHttpFAB.CatchingFishMVPRobolectric(CatchingFishCardViewView, CatchingFishCardViewView2, CatchingFishCardViewView3, CatchingFishDataStoreIntent != null ? CatchingFishDataStoreIntent.CatchingFishParcelableFAB : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    public final View CatchingFishParcelableFAB(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int indexOf;
        int lastIndexOf;
        int i2;
        Rect rect2 = this.CatchingFishParcelableFAB;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    CatchingFishReduxKtor(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                CatchingFishReduxKtor(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            CatchingFishReduxKtor(viewGroup, rect2);
        }
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return CatchingFishCoroutine(i, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Unknown direction: ", i));
        }
        CatchingFishIntentViewModel catchingFishIntentViewModel = this.CatchingFishReduxKtor;
        try {
            catchingFishIntentViewModel.CatchingFishParcelableFAB(arrayList, viewGroup);
            Collections.sort(arrayList, catchingFishIntentViewModel);
            catchingFishIntentViewModel.CatchingFishCoroutine.CatchingFishParcelableFAB();
            catchingFishIntentViewModel.CatchingFishSnackbar.CatchingFishSnackbar();
            catchingFishIntentViewModel.CatchingFishReduxKtor.CatchingFishParcelableFAB();
            catchingFishIntentViewModel.CatchingFishParcelableFAB.CatchingFishParcelableFAB();
            int size = arrayList.size();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 17 || i == 33 || i == 66 || i == 130) {
                        view2 = CatchingFishCoroutine(i, this.CatchingFishParcelableFAB, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i2 = lastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i2);
                }
            } else if (size >= 2) {
                view2 = (view == null || (indexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(indexOf - 1);
            }
            return view2 == null ? (View) arrayList.get(size - 1) : view2;
        } catch (Throwable th) {
            catchingFishIntentViewModel.CatchingFishCoroutine.CatchingFishParcelableFAB();
            catchingFishIntentViewModel.CatchingFishSnackbar.CatchingFishSnackbar();
            catchingFishIntentViewModel.CatchingFishReduxKtor.CatchingFishParcelableFAB();
            catchingFishIntentViewModel.CatchingFishParcelableFAB.CatchingFishParcelableFAB();
            throw th;
        }
    }

    public final View CatchingFishSnackbar(int i, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        viewGroup2 = viewGroup;
        View CatchingFishCoroutine = CatchingFishLayoutRoomFAB.CatchingFishCoroutine(view, viewGroup2, i);
        boolean z = true;
        View view3 = CatchingFishCoroutine;
        while (CatchingFishCoroutine != null) {
            if (CatchingFishCoroutine.isFocusable() && CatchingFishCoroutine.getVisibility() == 0 && (!CatchingFishCoroutine.isInTouchMode() || CatchingFishCoroutine.isFocusableInTouchMode())) {
                view2 = CatchingFishCoroutine;
                break;
            }
            CatchingFishCoroutine = CatchingFishLayoutRoomFAB.CatchingFishCoroutine(CatchingFishCoroutine, viewGroup2, i);
            boolean z2 = !z;
            if (!z) {
                view3 = view3 != null ? CatchingFishLayoutRoomFAB.CatchingFishCoroutine(view3, viewGroup2, i) : null;
                if (view3 == CatchingFishCoroutine) {
                    break;
                }
            }
            z = z2;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.CatchingFishDaggerWebsocket;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                CatchingFishLayoutRoomFAB.CatchingFishViewModelFAB(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = CatchingFishParcelableFAB(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
