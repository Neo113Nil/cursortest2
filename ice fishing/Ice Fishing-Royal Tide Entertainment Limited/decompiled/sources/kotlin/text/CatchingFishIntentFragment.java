package kotlin.text;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class CatchingFishIntentFragment extends CatchingFishAndroidX {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishIntentFragment(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public void CatchingFishCoroutine(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                super.CatchingFishCoroutine(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.CatchingFishDaggerWebsocket).CatchingFishViewModelScope);
                break;
            default:
                super.CatchingFishCoroutine(view, accessibilityEvent);
                break;
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        int i;
        int i2 = this.CatchingFishReduxKtor;
        Object obj = this.CatchingFishDaggerWebsocket;
        View.AccessibilityDelegate accessibilityDelegate = this.CatchingFishParcelableFAB;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.CatchingFishViewModelFAB);
                accessibilityNodeInfo.setChecked(checkableImageButton.CatchingFishViewModelScope);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.CatchingFishJetpackCompose;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).CatchingFishNavigation));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).CatchingFishNavigation));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, catchingFishViewJUnitJUnit.CatchingFishParcelableFAB);
                CatchingFishRetrofitRealm catchingFishRetrofitRealm = (CatchingFishRetrofitRealm) obj;
                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishRetrofitRealm.CatchingFishReduxMoshi.getVisibility() == 0 ? catchingFishRetrofitRealm.CatchingFishCardViewView().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : catchingFishRetrofitRealm.CatchingFishCardViewView().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).CatchingFishPayPal);
                break;
        }
    }
}
