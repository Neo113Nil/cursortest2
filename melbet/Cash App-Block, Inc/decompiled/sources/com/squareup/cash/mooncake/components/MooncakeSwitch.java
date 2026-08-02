package com.squareup.cash.mooncake.components;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.chip.Chip$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.ColorsKt;
import kotlin.Deprecated;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class MooncakeSwitch extends SwitchCompat {
    public static final /* synthetic */ int $r8$clinit = 0;
    public CompoundButton.OnCheckedChangeListener internalCheckedChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        int i = colorPalette.green;
        Pair pair = new Pair(new int[]{R.attr.state_checked, R.attr.state_enabled}, Integer.valueOf(i));
        int[] iArr = {R.attr.state_checked, -16842910};
        int i2 = colorPalette.disabledIcon;
        setThumbTintList(ColorsKt.colorStateListOf(pair, new Pair(iArr, Integer.valueOf(ColorUtils.blendARGB(0.1f, i2, i))), new Pair(new int[]{-16842912, R.attr.state_enabled}, Integer.valueOf(colorPalette.switchThumbUnchecked)), new Pair(new int[]{-16842912, -16842910}, Integer.valueOf(ColorsKt.lighten(i2)))));
        Pair pair2 = new Pair(new int[]{R.attr.state_checked, R.attr.state_enabled}, Integer.valueOf(ColorUtils.setAlphaComponent(i, 120)));
        Pair pair3 = new Pair(new int[]{R.attr.state_checked, -16842910}, Integer.valueOf(ColorUtils.setAlphaComponent(i, 70)));
        int[] iArr2 = {-16842912, R.attr.state_enabled};
        int i3 = colorPalette.switchTrackUnchecked;
        setTrackTintList(ColorsKt.colorStateListOf(pair2, pair3, new Pair(iArr2, Integer.valueOf(i3)), new Pair(new int[]{-16842912, -16842910}, Integer.valueOf(ColorUtils.setAlphaComponent(i3, 70)))));
        super.setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(this, 3));
    }

    public static /* synthetic */ void setCheckedSilently$default(MooncakeSwitch mooncakeSwitch, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        mooncakeSwitch.setCheckedSilently(z, z2);
    }

    public final void setChecked(boolean z, boolean z2) {
        super.setChecked(z);
        if (z2) {
            return;
        }
        jumpDrawablesToCurrentState();
    }

    public final void setCheckedSilently(boolean z, boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.internalCheckedChangeListener;
        setOnCheckedChangeListener(null);
        setChecked(z, z2);
        setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.internalCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    @Deprecated
    public void setChecked(boolean z) {
        super.setChecked(z);
    }
}
