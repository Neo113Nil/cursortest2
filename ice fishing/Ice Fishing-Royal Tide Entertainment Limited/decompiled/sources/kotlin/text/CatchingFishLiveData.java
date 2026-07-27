package kotlin.text;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class CatchingFishLiveData extends AccessibilityNodeProvider {
    public final CatchingFishServiceHilt CatchingFishParcelableFAB;

    public CatchingFishLiveData(CatchingFishServiceHilt catchingFishServiceHilt) {
        this.CatchingFishParcelableFAB = catchingFishServiceHilt;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        CatchingFishViewJUnitJUnit CatchingFish = this.CatchingFishParcelableFAB.CatchingFish(i);
        if (CatchingFish == null) {
            return null;
        }
        return CatchingFish.CatchingFishParcelableFAB;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.CatchingFishParcelableFAB.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        CatchingFishViewJUnitJUnit CatchingFishJetpackCompose = this.CatchingFishParcelableFAB.CatchingFishJetpackCompose(i);
        if (CatchingFishJetpackCompose == null) {
            return null;
        }
        return CatchingFishJetpackCompose.CatchingFishParcelableFAB;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.CatchingFishParcelableFAB.CatchingFishParcelableFlux(i, i2, bundle);
    }
}
