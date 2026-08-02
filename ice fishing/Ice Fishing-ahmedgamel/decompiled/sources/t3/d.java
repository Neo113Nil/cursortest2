package t3;

import P.k;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.icefishingapp.icefishing.C5275R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d extends W.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f40864q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f40864q = chip;
    }

    @Override // W.b
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.f35912P;
        Chip chip = this.f40864q;
        if (!chip.c() || (fVar = chip.f35929x) == null || !fVar.f40915q0 || chip.f35915A == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // W.b
    public final void o(int i, k kVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2409a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f35912P);
            return;
        }
        Chip chip = this.f40864q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(C5275R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        kVar.b(P.f.f2396g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
