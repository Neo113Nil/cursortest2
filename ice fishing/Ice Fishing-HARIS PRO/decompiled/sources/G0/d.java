package G0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends U.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f282q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f282q = chip;
    }

    @Override // U.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f2448w;
        Chip chip = this.f282q;
        if (chip.c()) {
            f fVar = chip.e;
            if (fVar != null && fVar.f299K) {
                z2 = true;
            }
            if (!z2 || chip.f2453h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // U.b
    public final void o(int i, P.f fVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
        if (i != 1) {
            fVar.i("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2448w);
            return;
        }
        Chip chip = this.f282q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            fVar.i(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            fVar.i(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        fVar.b(P.d.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
