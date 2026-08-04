package com.gamericefishpro.space.aa;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.e4.h;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.k4.a {
    public final /* synthetic */ Chip J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.J = chip;
    }

    @Override // com.gamericefishpro.space.k4.a
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.P;
        Chip chip = this.J;
        if (!chip.c() || (fVar = chip.w) == null || !fVar.m0 || chip.A == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // com.gamericefishpro.space.k4.a
    public final void o(int i, h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.P);
            return;
        }
        Chip chip = this.J;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        hVar.b(com.gamericefishpro.space.e4.d.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        hVar.i(Button.class.getName());
    }

    @Override // com.gamericefishpro.space.k4.a
    public final void p(int i, boolean z) {
        Chip chip = this.J;
        if (i == 1) {
            chip.F = z;
        }
        f fVar = chip.w;
        boolean z2 = chip.F;
        boolean zR = false;
        if (fVar.n0 != null) {
            zR = fVar.R(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : f.h1);
        }
        if (zR) {
            chip.refreshDrawableState();
        }
    }
}
