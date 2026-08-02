package v3;

import P.f;
import P.k;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c extends W.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f41149q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f41149q = chip;
    }

    @Override // W.b
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.f36680P;
        Chip chip = this.f41149q;
        if (!chip.c() || (eVar = chip.f36697x) == null || !eVar.f41195l0 || chip.f36683A == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // W.b
    public final void o(int i, k kVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2340a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f36680P);
            return;
        }
        Chip chip = this.f41149q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(C5248R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        kVar.b(f.f2327g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
