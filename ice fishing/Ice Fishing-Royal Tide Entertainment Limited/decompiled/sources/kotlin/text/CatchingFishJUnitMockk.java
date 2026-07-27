package kotlin.text;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class CatchingFishJUnitMockk extends View.AccessibilityDelegate {
    public final /* synthetic */ CatchingFishPicassoEspresso CatchingFishParcelableFAB;

    public CatchingFishJUnitMockk(CatchingFishPicassoEspresso catchingFishPicassoEspresso) {
        this.CatchingFishParcelableFAB = catchingFishPicassoEspresso;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.CatchingFishParcelableFAB.CatchingFishViewModelFAB.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
