package kotlin.text;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishBiometricRealm extends CatchingFishAndroidX {
    public final WeakHashMap CatchingFishDaggerWebsocket = new WeakHashMap();
    public final CatchingFishFluxEspresso CatchingFishReduxKtor;

    public CatchingFishBiometricRealm(CatchingFishFluxEspresso catchingFishFluxEspresso) {
        this.CatchingFishReduxKtor = catchingFishFluxEspresso;
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishCoroutine(View view, AccessibilityEvent accessibilityEvent) {
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(view);
        if (catchingFishAndroidX != null) {
            catchingFishAndroidX.CatchingFishCoroutine(view, accessibilityEvent);
        } else {
            super.CatchingFishCoroutine(view, accessibilityEvent);
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishDaggerWebsocket(View view, AccessibilityEvent accessibilityEvent) {
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(view);
        if (catchingFishAndroidX != null) {
            catchingFishAndroidX.CatchingFishDaggerWebsocket(view, accessibilityEvent);
        } else {
            super.CatchingFishDaggerWebsocket(view, accessibilityEvent);
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishLayout(View view, AccessibilityEvent accessibilityEvent) {
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(view);
        if (catchingFishAndroidX != null) {
            catchingFishAndroidX.CatchingFishLayout(view, accessibilityEvent);
        } else {
            super.CatchingFishLayout(view, accessibilityEvent);
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final boolean CatchingFishParcelableFAB(View view, AccessibilityEvent accessibilityEvent) {
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(view);
        return catchingFishAndroidX != null ? catchingFishAndroidX.CatchingFishParcelableFAB(view, accessibilityEvent) : this.CatchingFishParcelableFAB.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        CatchingFishFluxEspresso catchingFishFluxEspresso = this.CatchingFishReduxKtor;
        RecyclerView recyclerView = catchingFishFluxEspresso.CatchingFishReduxKtor;
        RecyclerView recyclerView2 = catchingFishFluxEspresso.CatchingFishReduxKtor;
        boolean CatchingFishDagger = recyclerView.CatchingFishDagger();
        View.AccessibilityDelegate accessibilityDelegate = this.CatchingFishParcelableFAB;
        if (CatchingFishDagger || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().CatchingFishStateFlow(view, catchingFishViewJUnitJUnit);
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(view);
        if (catchingFishAndroidX != null) {
            catchingFishAndroidX.CatchingFishReduxKtor(view, catchingFishViewJUnitJUnit);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final CatchingFishServiceHilt CatchingFishSnackbar(View view) {
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(view);
        return catchingFishAndroidX != null ? catchingFishAndroidX.CatchingFishSnackbar(view) : super.CatchingFishSnackbar(view);
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishViewModelFAB(View view, int i) {
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(view);
        if (catchingFishAndroidX != null) {
            catchingFishAndroidX.CatchingFishViewModelFAB(view, i);
        } else {
            super.CatchingFishViewModelFAB(view, i);
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final boolean CatchingFishViewModelScope(View view, int i, Bundle bundle) {
        CatchingFishFluxEspresso catchingFishFluxEspresso = this.CatchingFishReduxKtor;
        RecyclerView recyclerView = catchingFishFluxEspresso.CatchingFishReduxKtor;
        RecyclerView recyclerView2 = catchingFishFluxEspresso.CatchingFishReduxKtor;
        if (recyclerView.CatchingFishDagger() || recyclerView2.getLayoutManager() == null) {
            return super.CatchingFishViewModelScope(view, i, bundle);
        }
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(view);
        if (catchingFishAndroidX != null) {
            if (catchingFishAndroidX.CatchingFishViewModelScope(view, i, bundle)) {
                return true;
            }
        } else if (super.CatchingFishViewModelScope(view, i, bundle)) {
            return true;
        }
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = recyclerView2.getLayoutManager().CatchingFishSnackbar.CatchingFishDaggerWebsocket;
        return false;
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final boolean CatchingFishWorkManager(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        CatchingFishAndroidX catchingFishAndroidX = (CatchingFishAndroidX) this.CatchingFishDaggerWebsocket.get(viewGroup);
        return catchingFishAndroidX != null ? catchingFishAndroidX.CatchingFishWorkManager(viewGroup, view, accessibilityEvent) : this.CatchingFishParcelableFAB.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
