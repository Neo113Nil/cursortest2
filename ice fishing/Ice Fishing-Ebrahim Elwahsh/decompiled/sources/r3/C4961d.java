package r3;

import P.k;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;

/* renamed from: r3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4961d extends W.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f40285q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4961d(Chip chip, Chip chip2) {
        super(chip2);
        this.f40285q = chip;
    }

    @Override // W.b
    public final void l(ArrayList arrayList) {
        C4963f c4963f;
        arrayList.add(0);
        Rect rect = Chip.f36075P;
        Chip chip = this.f40285q;
        if (!chip.c() || (c4963f = chip.f36092x) == null || !c4963f.f40336q0 || chip.f36078A == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // W.b
    public final void o(int i, k kVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2675a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f36075P);
            return;
        }
        Chip chip = this.f40285q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(C5284R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        kVar.b(P.f.f2662g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
