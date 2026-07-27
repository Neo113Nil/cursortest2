package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class CatchingFishIntentViewModel implements Comparator {
    public final CatchingFishPayPalService CatchingFishCoroutine;
    public final CatchingFishPayPalService CatchingFishParcelableFAB;
    public final CatchingFishJUnitService CatchingFishReduxKtor;
    public final CatchingFishServiceBundle CatchingFishSnackbar;

    public CatchingFishIntentViewModel(CatchingFishLayoutLayout catchingFishLayoutLayout) {
        long[] jArr = CatchingFishViewPayPal.CatchingFishParcelableFAB;
        this.CatchingFishParcelableFAB = new CatchingFishPayPalService();
        int i = CatchingFishHiltCameraX.CatchingFishParcelableFAB;
        this.CatchingFishSnackbar = new CatchingFishServiceBundle();
        this.CatchingFishCoroutine = new CatchingFishPayPalService();
        CatchingFishJUnitService catchingFishJUnitService = CatchingFishGoogleMapsAdMob.CatchingFishParcelableFAB;
        this.CatchingFishReduxKtor = new CatchingFishJUnitService();
    }

    public final void CatchingFishParcelableFAB(ArrayList arrayList, ViewGroup viewGroup) {
        CatchingFishJUnitService catchingFishJUnitService;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            catchingFishJUnitService = this.CatchingFishReduxKtor;
            if (i >= size) {
                break;
            }
            catchingFishJUnitService.CatchingFishViewModelFAB(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        CatchingFishServiceBundle catchingFishServiceBundle = this.CatchingFishSnackbar;
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishParcelableFAB;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View CatchingFishCoroutine = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : CatchingFishLayoutRoomFAB.CatchingFishCoroutine(view, viewGroup, 2);
                if (CatchingFishCoroutine != null && catchingFishJUnitService.CatchingFishReduxKtor(CatchingFishCoroutine) >= 0) {
                    catchingFishPayPalService.CatchingFishOkHttp(view, CatchingFishCoroutine);
                    catchingFishServiceBundle.CatchingFishParcelableFAB(CatchingFishCoroutine);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i3 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) catchingFishPayPalService.CatchingFishViewModelScope(view2)) != null && !catchingFishServiceBundle.CatchingFishCoroutine(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    CatchingFishPayPalService catchingFishPayPalService2 = this.CatchingFishCoroutine;
                    View view4 = (View) catchingFishPayPalService2.CatchingFishViewModelScope(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    catchingFishPayPalService2.CatchingFishOkHttp(view2, view3);
                    view2 = (View) catchingFishPayPalService.CatchingFishViewModelScope(view2);
                }
            }
            if (i3 < 0) {
                return;
            } else {
                size3 = i3;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishCoroutine;
        View view3 = (View) catchingFishPayPalService.CatchingFishViewModelScope(view);
        View view4 = (View) catchingFishPayPalService.CatchingFishViewModelScope(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.CatchingFishParcelableFAB.CatchingFishViewModelScope(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        CatchingFishJUnitService catchingFishJUnitService = this.CatchingFishReduxKtor;
        return catchingFishJUnitService.CatchingFishDaggerWebsocket(view) < catchingFishJUnitService.CatchingFishDaggerWebsocket(view2) ? -1 : 1;
    }
}
