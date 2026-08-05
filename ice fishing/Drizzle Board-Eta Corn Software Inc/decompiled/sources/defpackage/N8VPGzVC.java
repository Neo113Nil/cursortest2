package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class N8VPGzVC extends AccessibilityNodeProvider {
    public final tg0 qoPGr6Ce;

    public N8VPGzVC(tg0 tg0Var) {
        this.qoPGr6Ce = tg0Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        nSmgoSB5 WYNAV5pd = this.qoPGr6Ce.WYNAV5pd(i);
        if (WYNAV5pd == null) {
            return null;
        }
        return WYNAV5pd.qoPGr6Ce;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        nSmgoSB5 DK9slbsy = this.qoPGr6Ce.DK9slbsy(i);
        if (DK9slbsy == null) {
            return null;
        }
        return DK9slbsy.qoPGr6Ce;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.qoPGr6Ce.ytu5o6f4(i, i2, bundle);
    }
}
