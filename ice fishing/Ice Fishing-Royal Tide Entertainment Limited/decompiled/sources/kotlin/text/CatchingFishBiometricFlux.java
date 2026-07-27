package kotlin.text;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishBiometricFlux extends CatchingFishAndroidX {
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishBiometricFlux(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public void CatchingFishCoroutine(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.CatchingFishReduxKtor) {
            case 3:
                super.CatchingFishCoroutine(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.CatchingFishCoroutine(view, accessibilityEvent);
                break;
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        int scrollRange;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, catchingFishViewJUnitJUnit.CatchingFishParcelableFAB);
                catchingFishViewJUnitJUnit.CatchingFishFragmentHandler(null);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
                this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setScrollable(false);
                break;
            case 2:
                this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, catchingFishViewJUnitJUnit.CatchingFishParcelableFAB);
                catchingFishViewJUnitJUnit.CatchingFishFragmentHandler(null);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
                this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                catchingFishViewJUnitJUnit.CatchingFishLayout(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo2.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        catchingFishViewJUnitJUnit.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishLayout);
                        catchingFishViewJUnitJUnit.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishOkHttp);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        catchingFishViewJUnitJUnit.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishViewModelFAB);
                        catchingFishViewJUnitJUnit.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishUnitTesting);
                        break;
                    }
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
                this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setVisibleToUser(false);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != 16908346) goto L32;
     */
    @Override // kotlin.text.CatchingFishAndroidX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean CatchingFishViewModelScope(View view, int i, Bundle bundle) {
        switch (this.CatchingFishReduxKtor) {
            case 3:
                if (super.CatchingFishViewModelScope(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i != 4096) {
                        if (i != 8192 && i != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.CatchingFishCoroutineFlow(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.CatchingFishCoroutineFlow(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.CatchingFishViewModelScope(view, i, bundle);
        }
    }
}
